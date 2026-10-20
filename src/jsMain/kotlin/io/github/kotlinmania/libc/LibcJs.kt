package io.github.kotlinmania.libc
import io.github.kotlinmania.libc.internal.RawLibc
import io.github.kotlinmania.libc.internal.toRawSize
import io.github.kotlinmania.libc.unix.AddrinfoRegistry
import io.github.kotlinmania.libc.unix.linuxlike.Addrinfo
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Utsname

/**
 * JS/WASM implementations of core libc functions via N-API.
 *
 * These functions call through the [LibcNative] N-API addon to reach the
 * real system C library. They are declared in the root package
 * `io.github.kotlinmania.libc` so consumers can import them directly.
 *
 * Functions that don't make sense on JS/WASM (mmap, fork, etc.) are not
 * overridden here and retain their commonMain stub implementations.
 */

// ─── stdlib ───────────────────────────────────────────────────────

public fun mallocNapi(size: ULong): COpaquePointer? =
    RawLibc.allocate(size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public fun callocNapi(nobj: ULong, size: ULong): COpaquePointer? =
    RawLibc.allocateZeroed(nobj.toRawSize(), size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public fun reallocNapi(p: COpaquePointer?, size: ULong): COpaquePointer? =
    RawLibc.resize(p?.value ?: 0L, size.toRawSize()).takeIf { it != 0L }?.let { COpaquePointer(it) }

public fun freeNapi(p: COpaquePointer?) {
    RawLibc.release(p?.value ?: 0L)
}

public fun atoiNapi(s: String?): Int = if (s != null) LibcNative.atoi(s) else 0

public fun strtolNapi(s: String?, base: Int): Long =
    if (s != null) LibcNative.strtol(s, base).toLong() else 0L

public fun strtodNapi(s: String?): Double =
    if (s != null) LibcNative.strtod(s) else 0.0

public fun getenvNapi(name: String?): String? =
    if (name != null) LibcNative.getenv(name) else null

public fun setenvNapi(name: String?, value: String?, overwrite: Int): Int =
    if (name != null && value != null) LibcNative.setenv(name, value, overwrite) else -1

public fun unsetenvNapi(name: String?): Int =
    if (name != null) LibcNative.unsetenv(name) else -1

public fun putenvNapi(str: String?): Int =
    if (str != null) LibcNative.putenv(str) else -1

public fun putenvSNapi(name: String?, value: String?): Int =
    if (name != null && value != null) LibcNative.putenv_s(name, value) else 22

public fun clearenvNapi(): Int =
    LibcNative.clearenv()

public fun systemNapi(cmd: String?): Int =
    if (cmd != null) LibcNative.system(cmd) else -1

// ─── string ───────────────────────────────────────────────────────

public fun strlenNapi(cs: String?): ULong =
    if (cs != null) LibcNative.strlen(cs).toULong() else 0uL

public fun strcmpNapi(a: String?, b: String?): Int {
    if (a == null || b == null) return -1
    return LibcNative.strcmp(a, b)
}

public fun strncmpNapi(a: String?, b: String?, n: ULong): Int {
    if (a == null || b == null) return -1
    return LibcNative.strncmp(a, b, n.toInt())
}

// ─── unistd ───────────────────────────────────────────────────────

public fun closeNapi(fd: Int): Int = LibcNative.close(fd)

public fun getpidNapi(): Int = LibcNative.getpid()

public fun getppidNapi(): Int = LibcNative.getppid()

public fun gethostnameNapi(): String = LibcNative.gethostname()

public fun accessNapi(path: String?, mode: Int): Int =
    if (path != null) LibcNative.access(path, mode) else -1

public fun unlinkNapi(path: String?): Int =
    if (path != null) LibcNative.unlink(path) else -1

public fun sleepNapi(secs: UInt): UInt = LibcNative.sleep(secs.toInt()).toUInt()

public fun isattyNapi(fd: Int): Int = LibcNative.isatty(fd)

// ─── math ─────────────────────────────────────────────────────────

public fun ceilNapi(x: Double): Double = LibcNative.ceil(x)

public fun floorNapi(x: Double): Double = LibcNative.floor(x)

public fun roundNapi(x: Double): Double = LibcNative.round(x)

public fun sqrtNapi(x: Double): Double = LibcNative.sqrt(x)

public fun powNapi(base: Double, exp: Double): Double = LibcNative.pow(base, exp)

public fun fabsNapi(x: Double): Double = LibcNative.fabs(x)

public fun sinNapi(x: Double): Double = LibcNative.sin(x)

public fun cosNapi(x: Double): Double = LibcNative.cos(x)

public fun tanNapi(x: Double): Double = LibcNative.tan(x)

public fun ceilfNapi(x: Float): Float = LibcNative.ceilf(x)

public fun floorfNapi(x: Float): Float = LibcNative.floorf(x)

public fun roundfNapi(x: Float): Float = LibcNative.roundf(x)

// ─── errno & helpers ──────────────────────────────────────────────

public val errnoNapi: Int get() = LibcNative.get_errno()

public fun getErrnoNapi(): Int = LibcNative.get_errno()

public fun strerrorNapi(errnum: Int): String? = LibcNative.strerror(errnum)

public fun realpathNapi(pathname: String?): String? =
    if (pathname != null) LibcNative.realpath(pathname) else null

public fun removeNapi(filename: String?): Int =
    if (filename != null) LibcNative.remove(filename) else -1

public fun renameNapi(oldname: String?, newname: String?): Int =
    if (oldname != null && newname != null) LibcNative.rename(oldname, newname) else -1

public fun fgetcNapi(stream: FILE?): Int =
    if (stream != null && stream.handle > 0L) LibcNative.fgetc(stream.handle.toInt()) else -1

public fun fputcNapi(c: Int, stream: FILE?): Int =
    if (stream != null && stream.handle > 0L) LibcNative.fputc(c, stream.handle.toInt()) else -1

public fun fgetsNapi(n: Int, stream: FILE?): String? =
    if (stream != null && stream.handle > 0L && n > 0) LibcNative.fgets(n, stream.handle.toInt()) else null

public fun fputsNapi(s: String?, stream: FILE?): Int =
    if (s != null && stream != null && stream.handle > 0L) LibcNative.fputs(s, stream.handle.toInt()) else -1

public fun feofNapi(stream: FILE?): Int =
    if (stream != null && stream.handle > 0L) LibcNative.feof(stream.handle.toInt()) else 0

public fun ferrorNapi(stream: FILE?): Int =
    if (stream != null && stream.handle > 0L) LibcNative.ferror(stream.handle.toInt()) else 0

public fun clearerrNapi(stream: FILE?) {
    if (stream != null && stream.handle > 0L) {
        LibcNative.clearerr(stream.handle.toInt())
    }
}

public fun popenNapi(command: String?, mode: String?): FILE? {
    if (command == null || mode == null) return null
    val h = LibcNative.popen(command, mode)
    return if (h > 0) FILE(h.toLong()) else null
}

public fun pcloseNapi(stream: FILE?): Int =
    if (stream != null && stream.handle > 0L) LibcNative.pclose(stream.handle.toInt()) else -1

private fun copyCStringIntoJs(src: String, dst: ByteArray) {
    dst.fill(0)
    val bytes = src.encodeToByteArray()
    val copyLen = minOf(bytes.size, (dst.size - 1).coerceAtLeast(0))
    for (i in 0 until copyLen) {
        dst[i] = bytes[i]
    }
}

public fun unameNapi(buf: Utsname?): Int {
    if (buf == null) return -1
    val raw = LibcNative.uname_fields() ?: return -1
    val parts = raw.split('\n')
    if (parts.size < 5) return -1
    copyCStringIntoJs(parts[0], buf.sysname)
    copyCStringIntoJs(parts[1], buf.nodename)
    copyCStringIntoJs(parts[2], buf.release)
    copyCStringIntoJs(parts[3], buf.version)
    copyCStringIntoJs(parts[4], buf.machine)
    return 0
}

public fun unameNapi(buf: io.github.kotlinmania.libc.unix.bsd.Utsname?): Int {
    if (buf == null) return -1
    val raw = LibcNative.uname_fields() ?: return -1
    val parts = raw.split('\n')
    if (parts.size < 5) return -1
    copyCStringIntoJs(parts[0], buf.sysname)
    copyCStringIntoJs(parts[1], buf.nodename)
    copyCStringIntoJs(parts[2], buf.release)
    copyCStringIntoJs(parts[3], buf.version)
    copyCStringIntoJs(parts[4], buf.machine)
    return 0
}

private fun applyPasswdRResultJs(raw: String, pwd: Passwd?, result: COpaquePointer?): Int {
    val lines = raw.split('\n')
    val rc = lines.getOrNull(0)?.toIntOrNull() ?: -1
    val found = lines.getOrNull(1)?.toIntOrNull() ?: 0
    if (rc == 0 && found != 0 && pwd != null && lines.size >= 9) {
        pwd.pwName = lines[2]
        pwd.pwPasswd = lines[3]
        pwd.pwUid = lines[4].toUIntOrNull() ?: 0u
        pwd.pwGid = lines[5].toUIntOrNull() ?: 0u
        pwd.pwGecos = lines[6]
        pwd.pwDir = lines[7]
        pwd.pwShell = lines[8]
        result?.value = 1L
    } else {
        result?.value = 0L
    }
    return rc
}

public fun getpwuidRNapi(uid: UInt, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
    val len = buflen.toLong().coerceIn(1L, 1048576L).toInt()
    return applyPasswdRResultJs(LibcNative.getpwuid_r_str(uid.toInt(), len), pwd, result)
}

public fun getpwnamRNapi(name: String?, pwd: Passwd?, buflen: ULong, result: COpaquePointer?): Int {
    if (name == null) {
        result?.value = 0L
        return 22
    }
    val len = buflen.toLong().coerceIn(1L, 1048576L).toInt()
    return applyPasswdRResultJs(LibcNative.getpwnam_r_str(name, len), pwd, result)
}

public fun getpwuidRNapi(
    uid: UInt,
    pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
    buflen: ULong,
    result: COpaquePointer?,
): Int {
    val tmp = Passwd()
    val rc = getpwuidRNapi(uid, tmp, buflen, result)
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

public fun getpwnamRNapi(
    name: String?,
    pwd: io.github.kotlinmania.libc.unix.bsd.Passwd?,
    buflen: ULong,
    result: COpaquePointer?,
): Int {
    val tmp = Passwd()
    val rc = getpwnamRNapi(name, tmp, buflen, result)
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

public fun getpwuidNapi(uid: UInt): Passwd? {
    val pwd = Passwd()
    val res = COpaquePointer(0L)
    val rc = getpwuidRNapi(uid, pwd, 4096uL, res)
    return if (rc == 0 && res.value != 0L) pwd else null
}

public fun getpwnamNapi(name: String?): Passwd? {
    if (name == null) return null
    val pwd = Passwd()
    val res = COpaquePointer(0L)
    val rc = getpwnamRNapi(name, pwd, 4096uL, res)
    return if (rc == 0 && res.value != 0L) pwd else null
}

public fun getaddrinfoNapi(
    node: String?,
    service: String?,
    hints: Addrinfo?,
    res: COpaquePointer?,
): Int {
    val raw =
        LibcNative.getaddrinfo_str(
            if (node != null) 1 else 0,
            node.orEmpty(),
            if (service != null) 1 else 0,
            service.orEmpty(),
            if (hints != null) 1 else 0,
            hints?.aiFlags ?: 0,
            hints?.aiFamily ?: 0,
            hints?.aiSocktype ?: 0,
            hints?.aiProtocol ?: 0,
        )
    return AddrinfoRegistry.parsePackedResult(raw, hints, res)
}

public fun freeaddrinfoNapi(res: Addrinfo?) {
    AddrinfoRegistry.freeChain(res)
}

public fun getnameinfoNapi(
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
        LibcNative.getnameinfo_str(
            sa.saFamily.toInt(),
            hex,
            salen.toInt(),
            if (host != null) hostlen.toInt() else 0,
            if (serv != null) servlen.toInt() else 0,
            flags,
        )
    return AddrinfoRegistry.applyGetnameinfoResult(raw, host, hostlen, serv, servlen)
}

public fun gaiStrerrorNapi(errcode: Int): String? = LibcNative.gai_strerror(errcode)

public fun hstrerrorNapi(errcode: Int): String? = LibcNative.hstrerror(errcode)

public fun resInitNapi(): Int = LibcNative.res_init()
