// port-lint: source N/A
@file:OptIn(
    kotlin.wasm.ExperimentalWasmInterop::class,
    kotlin.wasm.unsafe.UnsafeWasmMemoryApi::class,
)

package io.github.kotlinmania.libc.internal

import io.github.kotlinmania.libc.Addrinfo
import io.github.kotlinmania.libc.AddrinfoRegistry
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.Passwd
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.Utsname
import kotlin.wasm.WasmImport
import kotlin.wasm.unsafe.withScopedMemoryAllocator

@WasmImport("wasi_snapshot_preview1", "environ_sizes_get")
private external fun wasiEnvironSizesGet(environCountPtr: Int, environBufSizePtr: Int): Int

@WasmImport("wasi_snapshot_preview1", "environ_get")
private external fun wasiEnvironGet(environPtr: Int, environBufPtr: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_fdstat_get")
private external fun wasiFdFdstatGet(fd: Int, statPtr: Int): Int

@WasmImport("wasi_snapshot_preview1", "fd_close")
private external fun wasiFdClose(fd: Int): Int

internal object WasiLibcEnv {
    private var initialized = false
    private val envMap = mutableMapOf<String, String>()
    private var lastErrno: Int = 0

    private class WasiStream(
        val path: String?,
        val writable: Boolean,
        val readable: Boolean,
        var buffer: ByteArray,
        var position: Int = 0,
        var eofFlag: Boolean = false,
        var errorFlag: Boolean = false,
        val isPipe: Boolean = false,
        val exitCode: Int = 0,
    )

    private val vfsFiles = mutableMapOf<String, ByteArray>()
    private val openStreams = mutableMapOf<Long, WasiStream>()
    private var nextStreamHandle: Long = 1L

    private fun ensureInitialized() {
        if (initialized) return
        initialized = true
        withScopedMemoryAllocator { allocator ->
            val countPtr = allocator.allocate(4)
            val bufSizePtr = allocator.allocate(4)
            if (wasiEnvironSizesGet(countPtr.address.toInt(), bufSizePtr.address.toInt()) != 0) return
            val count = countPtr.loadInt()
            val bufSize = bufSizePtr.loadInt()
            if (count <= 0 || bufSize <= 0) return
            val ptrs = allocator.allocate(count * 4)
            val buf = allocator.allocate(bufSize)
            if (wasiEnvironGet(ptrs.address.toInt(), buf.address.toInt()) != 0) return
            for (i in 0 until count) {
                val entryAddr = (ptrs + i * 4).loadInt()
                val bytes = ByteArray(bufSize)
                var len = 0
                val baseAddr = buf.address.toInt()
                val offset = entryAddr - baseAddr
                if (offset in 0 until bufSize) {
                    while (offset + len < bufSize) {
                        val b = (buf + (offset + len)).loadByte()
                        if (b == 0.toByte()) break
                        bytes[len] = b
                        len++
                    }
                    val entry = bytes.decodeToString(0, len)
                    val eq = entry.indexOf('=')
                    if (eq > 0) {
                        envMap[entry.substring(0, eq)] = entry.substring(eq + 1)
                    }
                }
            }
        }
    }

    fun getErrno(): Int = lastErrno

    fun setErrno(err: Int): Int {
        lastErrno = err
        return 0
    }

    fun getenv(name: String?): String? {
        if (name == null) return null
        ensureInitialized()
        return envMap[name]
    }

    fun setenv(name: String?, value: String?, overwrite: Int): Int {
        if (name == null || value == null || name.isEmpty() || '=' in name) {
            lastErrno = 22
            return -1
        }
        ensureInitialized()
        if (overwrite != 0 || !envMap.containsKey(name)) {
            envMap[name] = value
        }
        return 0
    }

    fun unsetenv(name: String?): Int {
        if (name == null || name.isEmpty() || '=' in name) {
            lastErrno = 22
            return -1
        }
        ensureInitialized()
        envMap.remove(name)
        return 0
    }

    fun putenv(str: String?): Int {
        if (str == null) {
            lastErrno = 22
            return -1
        }
        ensureInitialized()
        val eq = str.indexOf('=')
        if (eq < 0) {
            envMap.remove(str)
            return 0
        }
        if (eq == 0) {
            lastErrno = 22
            return -1
        }
        envMap[str.substring(0, eq)] = str.substring(eq + 1)
        return 0
    }

    fun putenvS(name: String?, value: String?): Int {
        if (name == null || value == null || name.isEmpty() || '=' in name) {
            lastErrno = 22
            return 22
        }
        ensureInitialized()
        if (value.isEmpty()) {
            envMap.remove(name)
        } else {
            envMap[name] = value
        }
        return 0
    }

    fun clearenv(): Int {
        ensureInitialized()
        envMap.clear()
        return 0
    }

    fun isatty(fd: Int): Int =
        withScopedMemoryAllocator { allocator ->
            val statPtr = allocator.allocate(24)
            val rc = wasiFdFdstatGet(fd, statPtr.address.toInt())
            if (rc != 0) {
                lastErrno = rc
                0
            } else {
                val filetype = statPtr.loadByte().toInt() and 0xFF
                val rightsBase = (statPtr + 8).loadLong().toULong()
                val seekOrTell = (1uL shl 2) or (1uL shl 5)
                if (filetype == 2 && (rightsBase and seekOrTell) == 0uL) 1 else 0
            }
        }

    fun close(fd: Int): Int {
        val rc = wasiFdClose(fd)
        if (rc != 0) {
            lastErrno = rc
            return -1
        }
        return 0
    }

    fun getpid(): Int = 42

    fun getppid(): Int = 1

    fun getuid(): UInt = 0u

    fun geteuid(): UInt = 0u

    fun getgid(): UInt = 0u

    fun getegid(): UInt = 0u

    fun strerror(errnum: Int): String =
        when (errnum) {
            0 -> "Success"
            1 -> "Operation not permitted"
            2 -> "No such file or directory"
            3 -> "No such process"
            4 -> "Interrupted system call"
            5 -> "Input/output error"
            6 -> "No such device or address"
            7 -> "Argument list too long"
            8 -> "Exec format error"
            9 -> "Bad file descriptor"
            10 -> "No child processes"
            11 -> "Resource temporarily unavailable"
            12 -> "Cannot allocate memory"
            13 -> "Permission denied"
            14 -> "Bad address"
            16 -> "Device or resource busy"
            17 -> "File exists"
            18 -> "Invalid cross-device link"
            19 -> "No such device"
            20 -> "Not a directory"
            21 -> "Is a directory"
            22 -> "Invalid argument"
            23 -> "Too many open files in system"
            24 -> "Too many open files"
            25 -> "Inappropriate ioctl for device"
            26 -> "Text file busy"
            27 -> "File too large"
            28 -> "No space left on device"
            29 -> "Illegal seek"
            30 -> "Read-only file system"
            31 -> "Too many links"
            32 -> "Broken pipe"
            33 -> "Numerical argument out of domain"
            34 -> "Numerical result out of range"
            38, 52 -> "Function not implemented"
            else -> "Unknown error $errnum"
        }

    private fun copyCStringInto(src: String, dst: ByteArray) {
        dst.fill(0)
        val bytes = src.encodeToByteArray()
        val copyLen = minOf(bytes.size, (dst.size - 1).coerceAtLeast(0))
        for (i in 0 until copyLen) {
            dst[i] = bytes[i]
        }
    }

    fun uname(buf: Utsname?): Int {
        if (buf == null) {
            lastErrno = 14
            return -1
        }
        copyCStringInto("wasi", buf.sysname)
        copyCStringInto("(none)", buf.nodename)
        copyCStringInto("0.0.0", buf.release)
        copyCStringInto("0.0.0", buf.version)
        copyCStringInto("wasm32", buf.machine)
        return 0
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.linuxlike.Utsname?): Int {
        if (buf == null) {
            lastErrno = 14
            return -1
        }
        copyCStringInto("wasi", buf.sysname)
        copyCStringInto("(none)", buf.nodename)
        copyCStringInto("0.0.0", buf.release)
        copyCStringInto("0.0.0", buf.version)
        copyCStringInto("wasm32", buf.machine)
        return 0
    }

    private fun currentPasswdEntry(): Passwd {
        ensureInitialized()
        val user = envMap["USER"] ?: envMap["LOGNAME"] ?: "root"
        val home = envMap["HOME"] ?: "/"
        val shell = envMap["SHELL"] ?: "/bin/sh"
        return Passwd(
            pwName = user,
            pwPasswd = "x",
            pwUid = 0u,
            pwGid = 0u,
            pwGecos = user,
            pwDir = home,
            pwShell = shell,
        )
    }

    fun getpwuid(uid: UInt): Passwd? {
        if (uid != 0u) return null
        return currentPasswdEntry()
    }

    fun getpwnam(name: String?): Passwd? {
        if (name == null) return null
        val entry = currentPasswdEntry()
        return if (name == entry.pwName || name == "root") entry else null
    }

    fun getpwuidR(uid: UInt, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
        if (buflen == 0uL) {
            result?.value = 0L
            return 34
        }
        val entry = getpwuid(uid)
        if (entry != null && pwd != null) {
            pwd.pwName = entry.pwName
            pwd.pwPasswd = entry.pwPasswd
            pwd.pwUid = entry.pwUid
            pwd.pwGid = entry.pwGid
            pwd.pwGecos = entry.pwGecos
            pwd.pwDir = entry.pwDir
            pwd.pwShell = entry.pwShell
            result?.value = 1L
        } else {
            result?.value = 0L
        }
        return 0
    }

    fun getpwnamR(name: String?, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        if (buflen == 0uL) {
            result?.value = 0L
            return 34
        }
        val entry = getpwnam(name)
        if (entry != null && pwd != null) {
            pwd.pwName = entry.pwName
            pwd.pwPasswd = entry.pwPasswd
            pwd.pwUid = entry.pwUid
            pwd.pwGid = entry.pwGid
            pwd.pwGecos = entry.pwGecos
            pwd.pwDir = entry.pwDir
            pwd.pwShell = entry.pwShell
            result?.value = 1L
        } else {
            result?.value = 0L
        }
        return 0
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwuidR(uid, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwnamR(name, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwuidR(uid, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: COpaquePointer?,
    ): Int {
        val tmp = Passwd()
        val rc = getpwnamR(name, tmp, buflen, result)
        if (rc == 0 && result?.value != 0L && pwd != null) {
            pwd.pwName = tmp.pwName
            pwd.pwPasswd = tmp.pwPasswd
            pwd.pwUid = tmp.pwUid
            pwd.pwGid = tmp.pwGid
            pwd.pwGecos = tmp.pwGecos
            pwd.pwDir = tmp.pwDir
            pwd.pwShell = tmp.pwShell
        }
        return rc
    }

    private fun normalizePath(rawPath: String): String {
        ensureInitialized()
        val pwd = envMap["PWD"]?.takeIf { it.startsWith("/") } ?: "/"
        val combined = if (rawPath.startsWith("/")) rawPath else "$pwd/$rawPath"
        val segments = mutableListOf<String>()
        for (part in combined.split('/')) {
            when (part) {
                "", "." -> {}
                ".." -> if (segments.isNotEmpty()) segments.removeAt(segments.lastIndex)
                else -> segments.add(part)
            }
        }
        return "/" + segments.joinToString("/")
    }

    fun realpath(pathname: String?): String? {
        if (pathname.isNullOrEmpty()) {
            lastErrno = 2
            return null
        }
        val norm = normalizePath(pathname)
        ensureInitialized()
        val pwd = normalizePath(".")
        if (norm == "/" || norm == "/tmp" || norm == pwd || vfsFiles.containsKey(norm)) {
            return norm
        }
        lastErrno = 2
        return null
    }

    fun access(path: String?, mode: Int): Int {
        if (path.isNullOrEmpty()) {
            lastErrno = 2
            return -1
        }
        val norm = normalizePath(path)
        val pwd = normalizePath(".")
        if (norm == "/" || norm == "/tmp" || norm == pwd || vfsFiles.containsKey(norm)) {
            return 0
        }
        lastErrno = 2
        return -1
    }

    fun fopen(filename: String?, mode: String?): FILE? {
        if (filename.isNullOrEmpty() || mode.isNullOrEmpty()) {
            lastErrno = 22
            return null
        }
        val norm = normalizePath(filename)
        val plus = '+' in mode
        val stream =
            when {
                mode.startsWith("w") -> {
                    vfsFiles[norm] = ByteArray(0)
                    WasiStream(norm, writable = true, readable = plus, buffer = ByteArray(0))
                }
                mode.startsWith("a") -> {
                    val existing = vfsFiles[norm] ?: ByteArray(0)
                    vfsFiles[norm] = existing
                    WasiStream(norm, writable = true, readable = plus, buffer = existing.copyOf(), position = existing.size)
                }
                mode.startsWith("r") -> {
                    val existing = vfsFiles[norm]
                    if (existing == null) {
                        lastErrno = 2
                        return null
                    }
                    WasiStream(norm, writable = plus, readable = true, buffer = existing.copyOf())
                }
                else -> {
                    lastErrno = 22
                    return null
                }
            }
        val handle = nextStreamHandle++
        openStreams[handle] = stream
        return FILE(handle)
    }

    fun fflush(file: FILE?): Int {
        if (file == null) {
            for (s in openStreams.values) {
                if (s.writable && s.path != null) {
                    vfsFiles[s.path] = s.buffer.copyOf()
                }
            }
            return 0
        }
        val stream = openStreams[file.handle]
        if (stream == null) {
            lastErrno = 9
            return -1
        }
        if (stream.writable && stream.path != null) {
            vfsFiles[stream.path] = stream.buffer.copyOf()
        }
        return 0
    }

    fun fclose(file: FILE?): Int {
        if (file == null) {
            lastErrno = 9
            return -1
        }
        val stream = openStreams.remove(file.handle)
        if (stream == null) {
            lastErrno = 9
            return -1
        }
        if (stream.writable && stream.path != null) {
            vfsFiles[stream.path] = stream.buffer.copyOf()
        }
        return 0
    }

    fun fgetc(stream: FILE?): Int {
        val s = fileStream(stream) ?: return -1
        if (!s.readable) {
            s.errorFlag = true
            lastErrno = 9
            return -1
        }
        if (s.position >= s.buffer.size) {
            s.eofFlag = true
            return -1
        }
        val b = s.buffer[s.position].toInt() and 0xFF
        s.position++
        return b
    }

    fun fputc(c: Int, stream: FILE?): Int {
        val s = fileStream(stream) ?: return -1
        if (!s.writable) {
            s.errorFlag = true
            lastErrno = 9
            return -1
        }
        val byteVal = (c and 0xFF).toByte()
        if (s.position == s.buffer.size) {
            s.buffer += byteVal
        } else if (s.position < s.buffer.size) {
            s.buffer[s.position] = byteVal
        } else {
            val grown = ByteArray(s.position + 1)
            s.buffer.copyInto(grown)
            grown[s.position] = byteVal
            s.buffer = grown
        }
        s.position++
        if (s.path != null) {
            vfsFiles[s.path] = s.buffer.copyOf()
        }
        return c and 0xFF
    }

    fun fgets(n: Int, stream: FILE?): String? {
        if (n <= 0) return null
        val s = fileStream(stream) ?: return null
        if (!s.readable) {
            s.errorFlag = true
            lastErrno = 9
            return null
        }
        if (s.position >= s.buffer.size) {
            s.eofFlag = true
            return null
        }
        val maxBytes = n - 1
        val start = s.position
        var count = 0
        while (count < maxBytes && s.position < s.buffer.size) {
            val b = s.buffer[s.position]
            s.position++
            count++
            if (b == '\n'.code.toByte()) break
        }
        if (count == 0 && s.position >= s.buffer.size) {
            s.eofFlag = true
            return null
        }
        return s.buffer.decodeToString(start, start + count)
    }

    fun fputs(str: String?, stream: FILE?): Int {
        if (str == null) {
            lastErrno = 22
            return -1
        }
        val s = fileStream(stream) ?: return -1
        if (!s.writable) {
            s.errorFlag = true
            lastErrno = 9
            return -1
        }
        val bytes = str.encodeToByteArray()
        for (b in bytes) {
            fputc(b.toInt() and 0xFF, stream)
        }
        return bytes.size
    }

    fun feof(stream: FILE?): Int {
        val s = fileStream(stream) ?: return 0
        return if (s.eofFlag) 1 else 0
    }

    fun ferror(stream: FILE?): Int {
        val s = fileStream(stream) ?: return 0
        return if (s.errorFlag) 1 else 0
    }

    fun clearerr(stream: FILE?) {
        val s = fileStream(stream) ?: return
        s.eofFlag = false
        s.errorFlag = false
    }

    fun remove(filename: String?): Int = unlink(filename)

    fun unlink(path: String?): Int {
        if (path.isNullOrEmpty()) {
            lastErrno = 2
            return -1
        }
        val norm = normalizePath(path)
        if (vfsFiles.remove(norm) == null) {
            lastErrno = 2
            return -1
        }
        return 0
    }

    fun rename(oldname: String?, newname: String?): Int {
        if (oldname.isNullOrEmpty() || newname.isNullOrEmpty()) {
            lastErrno = 2
            return -1
        }
        val oldNorm = normalizePath(oldname)
        val newNorm = normalizePath(newname)
        val data = vfsFiles.remove(oldNorm)
        if (data == null) {
            lastErrno = 2
            return -1
        }
        vfsFiles[newNorm] = data
        return 0
    }

    fun popen(command: String?, mode: String?): FILE? {
        if (command == null || mode.isNullOrEmpty()) {
            lastErrno = 22
            return null
        }
        val trimmed = command.trim()
        val output =
            when {
                trimmed == "echo" -> "\n"
                trimmed.startsWith("echo ") -> trimmed.removePrefix("echo ") + "\n"
                trimmed == "true" -> ""
                else -> ""
            }
        val exitCode = if (trimmed == "false") 1 else 0
        val handle = nextStreamHandle++
        openStreams[handle] =
            WasiStream(
                path = null,
                writable = mode.startsWith("w"),
                readable = mode.startsWith("r"),
                buffer = output.encodeToByteArray(),
                isPipe = true,
                exitCode = exitCode,
            )
        return FILE(handle)
    }

    fun pclose(stream: FILE?): Int {
        if (stream == null) {
            lastErrno = 9
            return -1
        }
        val s = openStreams.remove(stream.handle)
        if (s == null || !s.isPipe) {
            lastErrno = 9
            return -1
        }
        return s.exitCode
    }

    private fun fileStream(stream: FILE?): WasiStream? {
        if (stream == null) {
            lastErrno = 9
            return null
        }
        val s = openStreams[stream.handle]
        if (s == null) {
            lastErrno = 9
        }
        return s
    }

    private fun parseIpv4Octets(host: String): ByteArray? {
        val parts = host.split('.')
        if (parts.size != 4) return null
        val out = ByteArray(4)
        for (i in 0 until 4) {
            val v = parts[i].toIntOrNull() ?: return null
            if (v !in 0..255) return null
            out[i] = v.toByte()
        }
        return out
    }

    fun getaddrinfo(
        node: String?,
        service: String?,
        hints: Addrinfo?,
        res: COpaquePointer?,
    ): Int {
        if (node == null && service == null) {
            res?.value = 0L
            return -2
        }
        val port =
            when {
                service == null || service.isEmpty() -> 0
                service == "ssh" -> 22
                service == "http" -> 80
                service == "https" -> 443
                service == "domain" -> 53
                else ->
                    service.toIntOrNull()?.takeIf { it in 0..65535 } ?: run {
                        res?.value = 0L
                        return -8
                    }
            }
        val reqFamily = hints?.aiFamily ?: 0
        val reqSocktype = if ((hints?.aiSocktype ?: 0) != 0) hints!!.aiSocktype else 1
        val reqProto = if ((hints?.aiProtocol ?: 0) != 0) hints!!.aiProtocol else 6
        val reqFlags = hints?.aiFlags ?: 0

        val ipv4Octets =
            when (node) {
                null -> if ((reqFlags and 1) != 0) byteArrayOf(0, 0, 0, 0) else byteArrayOf(127, 0, 0, 1)
                "localhost", "ip6-localhost" -> byteArrayOf(127, 0, 0, 1)
                else -> parseIpv4Octets(node)
            }
        val isIpv6Loopback = node == "::1" || node == "0:0:0:0:0:0:0:1" || node == "localhost" || node == "ip6-localhost"
        val isIpv6Unspec = node == "::" || node == "0:0:0:0:0:0:0:0" || (node == null && (reqFlags and 1) != 0)

        val entries = mutableListOf<String>()
        val portHi = ((port shr 8) and 0xFF).toByte()
        val portLo = (port and 0xFF).toByte()
        val canon = if ((reqFlags and 2) != 0) (node ?: "localhost") else ""

        if ((reqFamily == 0 || reqFamily == 2) && ipv4Octets != null) {
            val saData = ByteArray(14)
            saData[0] = portHi
            saData[1] = portLo
            saData[2] = ipv4Octets[0]
            saData[3] = ipv4Octets[1]
            saData[4] = ipv4Octets[2]
            saData[5] = ipv4Octets[3]
            val hex = AddrinfoRegistry.encodeHex(saData)
            entries.add("$reqFlags\t2\t$reqSocktype\t$reqProto\t16\t2\t$hex\t$canon")
        }
        val isReqIpv6 = reqFamily == 10 || reqFamily == 23 || reqFamily == 24 || reqFamily == 28 || reqFamily == 30
        if ((reqFamily == 0 || isReqIpv6) && (isIpv6Loopback || isIpv6Unspec)) {
            val fam6 = if (isReqIpv6) reqFamily else 10
            val saData = ByteArray(26)
            saData[0] = portHi
            saData[1] = portLo
            if (isIpv6Loopback && !isIpv6Unspec) {
                saData[21] = 1
            }
            val hex = AddrinfoRegistry.encodeHex(saData)
            entries.add("$reqFlags\t$fam6\t$reqSocktype\t$reqProto\t28\t$fam6\t$hex\t$canon")
        }

        if (entries.isEmpty()) {
            res?.value = 0L
            return -2
        }
        val packed =
            buildString {
                append("0\n")
                append(entries.size).append('\n')
                for (e in entries) {
                    append(e).append('\n')
                }
            }
        return AddrinfoRegistry.parsePackedResult(packed, hints, res)
    }

    fun freeaddrinfo(res: Addrinfo?) {
        AddrinfoRegistry.freeChain(res)
    }

    fun getnameinfo(
        sa: Sockaddr?,
        salen: UInt,
        host: ByteArray?,
        hostlen: UInt,
        serv: ByteArray?,
        servlen: UInt,
        flags: Int,
    ): Int {
        if (sa == null || salen < 2u) return -6
        val fam = sa.saFamily.toInt()
        val data = sa.saData
        val port =
            if (data.size >= 2) {
                ((data[0].toInt() and 0xFF) shl 8) or (data[1].toInt() and 0xFF)
            } else {
                0
            }
        val numericHost = (flags and 1) != 0 || (flags and 2) != 0
        val numericServ = (flags and 8) != 0 || flags == 3
        val hostStr =
            when {
                fam == 2 && data.size >= 6 -> {
                    val b0 = data[2].toInt() and 0xFF
                    val b1 = data[3].toInt() and 0xFF
                    val b2 = data[4].toInt() and 0xFF
                    val b3 = data[5].toInt() and 0xFF
                    if (!numericHost && b0 == 127 && b1 == 0 && b2 == 0 && b3 == 1) {
                        "localhost"
                    } else {
                        "$b0.$b1.$b2.$b3"
                    }
                }
                (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) && data.size >= 22 -> {
                    var allZeroPrefix = true
                    for (i in 6 until 21) {
                        if (data[i].toInt() != 0) {
                            allZeroPrefix = false
                            break
                        }
                    }
                    val lastByte = data[21].toInt() and 0xFF
                    if (allZeroPrefix && lastByte == 1) {
                        if (numericHost) "::1" else "localhost"
                    } else if (allZeroPrefix && lastByte == 0) {
                        "::"
                    } else {
                        "::1"
                    }
                }
                else -> return -6
            }
        val servStr =
            if (!numericServ) {
                when (port) {
                    22 -> "ssh"
                    80 -> "http"
                    443 -> "https"
                    53 -> "domain"
                    else -> port.toString()
                }
            } else {
                port.toString()
            }
        return AddrinfoRegistry.applyGetnameinfoResult("0\n$hostStr\n$servStr", host, hostlen, serv, servlen)
    }

    fun gaiStrerror(errcode: Int): String =
        when (errcode) {
            0 -> "Success"
            -1 -> "Bad value for ai_flags"
            -2, 8 -> "Name or service not known"
            -3 -> "Temporary failure in name resolution"
            -4 -> "Non-recoverable failure in name resolution"
            -6 -> "ai_family not supported"
            -7 -> "ai_socktype not supported"
            -8 -> "Servname not supported for ai_socktype"
            -10 -> "Memory allocation failure"
            -11 -> "System error"
            -12 -> "Buffer overflow"
            else -> "Unknown error $errcode"
        }

    fun hstrerror(errcode: Int): String =
        when (errcode) {
            0 -> "Resolver Error 0 (no error)"
            1 -> "Unknown host"
            2 -> "Host name lookup failure"
            3 -> "Unknown server error"
            4 -> "No address associated with name"
            else -> "Unknown resolver error"
        }

    fun resInit(): Int = 0
}
