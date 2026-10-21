@file:OptIn(
    kotlin.wasm.ExperimentalWasmInterop::class,
    kotlin.wasm.unsafe.UnsafeWasmMemoryApi::class,
)

package io.github.kotlinmania.libc.internal
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Utsname
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
            lastErrno = 28
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
            lastErrno = 28
            return -1
        }
        ensureInitialized()
        envMap.remove(name)
        return 0
    }

    fun putenv(str: String?): Int {
        if (str == null) {
            lastErrno = 28
            return -1
        }
        ensureInitialized()
        val eq = str.indexOf('=')
        if (eq < 0) {
            envMap.remove(str)
            return 0
        }
        if (eq == 0) {
            lastErrno = 28
            return -1
        }
        envMap[str.substring(0, eq)] = str.substring(eq + 1)
        return 0
    }

    fun putenvS(name: String?, value: String?): Int {
        if (name == null || value == null || name.isEmpty() || '=' in name) {
            lastErrno = 28
            return 28
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

    fun getpid(): Int =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun getppid(): Int =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun getuid(): UInt =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun geteuid(): UInt =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun getgid(): UInt =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun getegid(): UInt =
        throw UnsupportedOperationException("WASI preview1 does not expose POSIX process or account identifiers")

    fun strerror(errnum: Int): String =
        when (errnum) {
            0 -> "Success"
            1 -> "Argument list too long"
            2 -> "Permission denied"
            6 -> "Resource temporarily unavailable"
            8 -> "Bad file descriptor"
            10 -> "Device or resource busy"
            12 -> "No child processes"
            18 -> "Numerical argument out of domain"
            20 -> "File exists"
            21 -> "Bad address"
            22 -> "File too large"
            27 -> "Interrupted system call"
            28 -> "Invalid argument"
            29 -> "Input/output error"
            31 -> "Is a directory"
            33 -> "Too many open files"
            34 -> "Too many links"
            41 -> "Too many open files in system"
            43 -> "No such device"
            44 -> "No such file or directory"
            45 -> "Exec format error"
            48 -> "Cannot allocate memory"
            51 -> "No space left on device"
            52 -> "Function not implemented"
            54 -> "Not a directory"
            55 -> "Directory not empty"
            58 -> "Not supported"
            59 -> "Inappropriate ioctl for device"
            60 -> "No such device or address"
            61 -> "Value too large"
            63 -> "Operation not permitted"
            64 -> "Broken pipe"
            68 -> "Numerical result out of range"
            69 -> "Read-only file system"
            70 -> "Illegal seek"
            71 -> "No such process"
            74 -> "Text file busy"
            75 -> "Invalid cross-device link"
            76 -> "Capabilities insufficient"
            else -> "Unknown error $errnum"
        }

    fun uname(buf: Utsname?): Int =
        throw UnsupportedOperationException("WASI preview1 has no uname facility")

    fun uname(buf: io.github.kotlinmania.libc.unix.bsd.Utsname?): Int =
        throw UnsupportedOperationException("WASI preview1 has no uname facility")

    fun getpwuid(uid: UInt): Passwd? =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun getpwnam(name: String?): Passwd? =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun getpwuidR(uid: UInt, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun getpwnamR(name: String?, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun getpwuidR(uid: UInt, pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?, buflen: ULong, result: COpaquePointer?): Int =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun getpwnamR(name: String?, pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?, buflen: ULong, result: COpaquePointer?): Int =
        throw UnsupportedOperationException("WASI preview1 has no host password database")

    fun realpath(pathname: String?): String? =
        throw UnsupportedOperationException("WASI preview1 has no canonical host-path query")

    fun access(path: String?, mode: Int): Int = WasiFiles.access(path, mode)
    fun fopen(filename: String?, mode: String?): FILE? = WasiFiles.open(filename, mode)
    fun fflush(file: FILE?): Int = WasiFiles.flush(file)
    fun fclose(file: FILE?): Int = WasiFiles.close(file)
    fun fgetc(stream: FILE?): Int = WasiFiles.getc(stream)
    fun fputc(c: Int, stream: FILE?): Int = WasiFiles.putc(c, stream)
    fun fgets(n: Int, stream: FILE?): String? = WasiFiles.gets(n, stream)
    fun fputs(str: String?, stream: FILE?): Int = WasiFiles.puts(str, stream)
    fun feof(stream: FILE?): Int = WasiFiles.eof(stream)
    fun ferror(stream: FILE?): Int = WasiFiles.error(stream)
    fun clearerr(stream: FILE?) = WasiFiles.clearError(stream)
    fun remove(filename: String?): Int = WasiFiles.unlink(filename)
    fun unlink(path: String?): Int = WasiFiles.unlink(path)
    fun rename(oldname: String?, newname: String?): Int = WasiFiles.rename(oldname, newname)

    fun popen(command: String?, mode: String?): FILE? =
        throw UnsupportedOperationException("WASI preview1 cannot spawn shell processes")

    fun pclose(stream: FILE?): Int =
        throw UnsupportedOperationException("WASI preview1 cannot spawn shell processes")

    fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
        throw UnsupportedOperationException("WASI preview1 has no host DNS resolver")

    fun freeaddrinfo(res: Addrinfo?) {
        if (res != null) throw UnsupportedOperationException("WASI preview1 has no host DNS resolver allocations")
    }

    fun getnameinfo(sa: Sockaddr?, salen: UInt, host: ByteArray?, hostlen: UInt, serv: ByteArray?, servlen: UInt, flags: Int): Int =
        throw UnsupportedOperationException("WASI preview1 has no host DNS resolver")

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

    fun resInit(): Int =
        throw UnsupportedOperationException("WASI preview1 has no host DNS resolver")
}
