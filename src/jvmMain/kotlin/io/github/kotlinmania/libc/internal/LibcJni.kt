package io.github.kotlinmania.libc.internal
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.AddrinfoRegistry
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Utsname
import java.io.File

internal object LibcJni {
    init {
        try {
            System.loadLibrary("libc_jni")
        } catch (error: UnsatisfiedLinkError) {
            val os = System.getProperty("os.name", "").lowercase()
            val architecture =
                when (System.getProperty("os.arch", "").lowercase()) {
                    "aarch64", "arm64" -> "aarch64"
                    "amd64", "x86_64" -> "x86_64"
                    else -> throw UnsatisfiedLinkError("Unsupported libc JNI architecture: ${System.getProperty("os.arch")}")
                }
            val platform =
                when {
                    os.contains("mac") || os.contains("darwin") -> "macos"
                    os.contains("windows") -> "windows"
                    os.contains("linux") -> "linux"
                    else -> throw UnsatisfiedLinkError("Unsupported libc JNI host: $os")
                }
            val name = System.mapLibraryName("libc_jni")
            val resource = "/io/github/kotlinmania/libc/native/$platform-$architecture/$name"
            val input =
                LibcJni::class.java.getResourceAsStream(resource)
                    ?: throw UnsatisfiedLinkError("Missing packaged libc JNI library $resource; Android applications must package the matching JNI ABI").apply { initCause(error) }
            val file = File.createTempFile("kotlinmania-libc-", name.substringAfterLast('.').let { ".$it" })
            file.deleteOnExit()
            input.use { source -> file.outputStream().use { source.copyTo(it) } }
            System.load(file.absolutePath)
        }
    }

    // --- Sockets ---

    @JvmStatic
    external fun socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun bind(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun connect(fd: Int, addr: ByteArray, addrlen: Int): Int

    @JvmStatic
    external fun listen(fd: Int, backlog: Int): Int

    @JvmStatic
    external fun accept(fd: Int, addr: ByteArray?, addrlen: IntArray?): Int

    @JvmStatic
    external fun getsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: IntArray): Int

    @JvmStatic
    external fun setsockopt(fd: Int, level: Int, optname: Int, optval: ByteArray, optlen: Int): Int

    @JvmStatic
    external fun getsockname(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun getpeername(fd: Int, addr: ByteArray, addrlen: IntArray): Int

    @JvmStatic
    external fun send(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun recv(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int): Long

    @JvmStatic
    external fun sendto(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: Int): Long

    @JvmStatic
    external fun recvfrom(fd: Int, buf: ByteArray, offset: Int, len: Int, flags: Int, addr: ByteArray?, addrlen: IntArray?): Long

    @JvmStatic
    external fun shutdown(fd: Int, how: Int): Int

    @JvmStatic
    external fun socketpair(domain: Int, type: Int, protocol: Int, sv: IntArray): Int

    // --- Polling & Select ---

    @JvmStatic
    external fun poll(fds: IntArray, events: ShortArray, revents: ShortArray, nfds: Int, timeout: Int): Int

    @JvmStatic
    external fun select(nfds: Int, readfds: IntArray?, writefds: IntArray?, exceptfds: IntArray?, timeoutSec: Long, timeoutUsec: Long): Int

    // --- Terminal Control & Window Sizing ---

    @JvmStatic
    external fun ioctl(fd: Int, request: Long, argp: ByteArray?): Int

    @JvmStatic
    external fun ioctlTiocgwinsz(fd: Int, winsize: ShortArray): Int

    @JvmStatic
    external fun tcgetattr(fd: Int, termios: ByteArray): Int

    @JvmStatic
    external fun tcsetattr(fd: Int, optionalActions: Int, termios: ByteArray): Int

    @JvmStatic
    external fun cfmakeraw(termios: ByteArray)

    // --- UDS, Memory Locking & Process Syscalls ---

    @JvmStatic
    external fun getpeereid(sockfd: Int, creds: IntArray): Int

    @JvmStatic
    external fun mlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun munlock(addr: Long, len: Long): Int

    @JvmStatic
    external fun sysconf(name: Int): Long

    @JvmStatic
    external fun getpid(): Int

    @JvmStatic
    external fun getppid(): Int

    @JvmStatic
    external fun geteuid(): Int

    @JvmStatic
    external fun getegid(): Int

    @JvmStatic
    external fun getuid(): Int

    @JvmStatic
    external fun getgid(): Int

    @JvmStatic
    external fun kill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun sendmsg(fd: Int, name: ByteArray?, iov: ByteArray?, control: ByteArray?, flags: Int): Long

    @JvmStatic
    external fun recvmsg(fd: Int, name: ByteArray?, nameLenOut: IntArray?, iov: ByteArray?, control: ByteArray?, controlLenOut: IntArray?, flagsOut: IntArray?, flags: Int): Long

    @JvmStatic
    external fun syscall(num: Long, a1: Long, a2: Long, a3: Long, a4: Long, a5: Long, a6: Long): Long

    @JvmStatic
    external fun pidfdOpen(pid: Int, flags: Int): Int

    // --- Environment & Terminal ---

    @JvmStatic
    external fun getenv(name: String): String?

    @JvmStatic
    external fun setenv(name: String, value: String, overwrite: Int): Int

    @JvmStatic
    external fun unsetenv(name: String): Int

    @JvmStatic
    external fun putenv(string: String): Int

    @JvmStatic
    external fun putenvS(name: String, value: String): Int

    @JvmStatic
    external fun clearenv(): Int

    @JvmStatic
    external fun isatty(fd: Int): Int

    // --- Errno, Paths, Uname, Passwd & Stdio ---

    @JvmStatic
    external fun getErrno(): Int

    @JvmStatic
    external fun strerror(errnum: Int): String?

    @JvmStatic
    external fun realpath(pathname: String): String?

    @JvmStatic
    external fun access(path: String, mode: Int): Int

    @JvmStatic
    external fun unameFields(): String?

    @JvmStatic
    external fun getpwuidRStr(uid: Int, buflen: Long): String

    @JvmStatic
    external fun getpwnamRStr(name: String, buflen: Long): String

    @JvmStatic
    external fun fopen(path: String, mode: String): Long

    @JvmStatic
    external fun fclose(fp: Long): Int

    @JvmStatic
    external fun fflush(fp: Long): Int

    @JvmStatic
    external fun fgetc(fp: Long): Int

    @JvmStatic
    external fun fputc(c: Int, fp: Long): Int

    @JvmStatic
    external fun fgets(n: Int, fp: Long): String?

    @JvmStatic
    external fun fputs(s: String, fp: Long): Int

    @JvmStatic
    external fun feof(fp: Long): Int

    @JvmStatic
    external fun ferror(fp: Long): Int

    @JvmStatic
    external fun clearerr(fp: Long)

    @JvmStatic
    external fun popen(command: String, mode: String): Long

    @JvmStatic
    external fun pclose(fp: Long): Int

    @JvmStatic
    external fun remove(filename: String): Int

    @JvmStatic
    external fun rename(oldname: String, newname: String): Int

    @JvmStatic
    external fun unlink(path: String): Int

    private fun copyCStringInto(src: String, dst: ByteArray) {
        dst.fill(0)
        val bytes = src.encodeToByteArray()
        val copyLen = minOf(bytes.size, (dst.size - 1).coerceAtLeast(0))
        for (i in 0 until copyLen) {
            dst[i] = bytes[i]
        }
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.linuxlike.Utsname?): Int {
        if (buf == null) return -1
        val raw = unameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    fun uname(buf: io.github.kotlinmania.libc.unix.bsd.Utsname?): Int {
        if (buf == null) return -1
        val raw = unameFields() ?: return -1
        val parts = raw.split('\n')
        if (parts.size < 5) return -1
        copyCStringInto(parts[0], buf.sysname)
        copyCStringInto(parts[1], buf.nodename)
        copyCStringInto(parts[2], buf.release)
        copyCStringInto(parts[3], buf.version)
        copyCStringInto(parts[4], buf.machine)
        return 0
    }

    fun getpwuid(uid: UInt): io.github.kotlinmania.libc.unix.linuxlike.Passwd? {
        val pwd =
            io.github.kotlinmania.libc.unix.linuxlike
                .Passwd()
        val res =
            io.github.kotlinmania.libc
                .COpaquePointer(0L)
        val rc = getpwuidR(uid, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getpwnam(name: String?): io.github.kotlinmania.libc.unix.linuxlike.Passwd? {
        if (name == null) return null
        val pwd =
            io.github.kotlinmania.libc.unix.linuxlike
                .Passwd()
        val res =
            io.github.kotlinmania.libc
                .COpaquePointer(0L)
        val rc = getpwnamR(name, pwd, 4096uL, res)
        return if (rc == 0 && res.value != 0L) pwd else null
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        val raw = getpwuidRStr(uid.toInt(), buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.linuxlike.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        val raw = getpwnamRStr(name, buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwuidR(
        uid: UInt,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        val raw = getpwuidRStr(uid.toInt(), buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    fun getpwnamR(
        name: String?,
        pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
        buflen: ULong,
        result: io.github.kotlinmania.libc.COpaquePointer?,
    ): Int {
        if (name == null) {
            result?.value = 0L
            return 22
        }
        val raw = getpwnamRStr(name, buflen.toLong().coerceAtLeast(0L))
        val lines = raw.split('\n')
        val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
        val found = lines.getOrNull(1) == "1"
        if (rc == 0 && found && lines.size >= 9) {
            if (pwd != null) {
                pwd.pwName = lines[2]
                pwd.pwPasswd = lines[3]
                pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
                pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
                pwd.pwGecos = lines[6]
                pwd.pwDir = lines[7]
                pwd.pwShell = lines[8]
            }
            if (result != null) {
                val orig = result.value
                result.value = if (orig >= 4096L) orig else 1L
            }
        } else {
            result?.value = 0L
        }
        return rc
    }

    @JvmStatic
    external fun getaddrinfoStr(
        node: String?,
        service: String?,
        hasHints: Int,
        aiFlags: Int,
        aiFamily: Int,
        aiSocktype: Int,
        aiProtocol: Int,
    ): String

    @JvmStatic
    external fun getnameinfoStr(
        saFamily: Int,
        saDataHex: String,
        salen: Int,
        hostlen: Int,
        servlen: Int,
        flags: Int,
    ): String

    @JvmStatic
    external fun gaiStrerror(errcode: Int): String?

    @JvmStatic
    external fun hstrerror(errcode: Int): String?

    @JvmStatic
    external fun resInit(): Int

    fun getaddrinfo(
        node: String?,
        service: String?,
        hints: Addrinfo?,
        res: COpaquePointer?,
    ): Int {
        val raw =
            getaddrinfoStr(
                node,
                service,
                if (hints != null) 1 else 0,
                hints?.aiFlags ?: 0,
                hints?.aiFamily ?: 0,
                hints?.aiSocktype ?: 0,
                hints?.aiProtocol ?: 0,
            )
        return AddrinfoRegistry.parsePackedResult(raw, hints, res)
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
        if (sa == null) return -1
        val hex = AddrinfoRegistry.encodeHex(sa.saData)
        val raw =
            getnameinfoStr(
                sa.saFamily.toInt(),
                hex,
                salen.toInt(),
                if (host != null) hostlen.toInt() else 0,
                if (serv != null) servlen.toInt() else 0,
                flags,
            )
        return AddrinfoRegistry.applyGetnameinfoResult(raw, host, hostlen, serv, servlen)
    }
}
