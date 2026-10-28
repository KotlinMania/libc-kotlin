@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_ftello
import libc.cinterop.libc_getpid
import libc.cinterop.libc_getppid
import libc.cinterop.libc_lseek
import libc.cinterop.libc_memalign
import libc.cinterop.libc_pthread_getspecific
import libc.cinterop.libc_readlink
import libc.cinterop.libc_setpgid
import libc.cinterop.libc_strcspn
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strspn

public actual fun atol(s: String?): Long =
    libc.cinterop.libc_atol(s)

public actual fun atoll(s: String?): Long {
    if (s == null) return 0
    return libc.cinterop.libc_atoll(s)
}

public actual fun strspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strcspn(cs, ct)

public actual fun strlen(cs: String?): ULong {
    if (cs == null) return 0uL
    return libc.cinterop.libc_strlen(cs)
}

public actual fun strnlen(cs: String?, n: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, n)

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires FFI bridge")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires WcharT pointer bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires mutable buffer (COpaquePointer), not immutable String")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun ftello(stream: FILE?): Long =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog requires manual FFI bridge — not yet implemented")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(blockSize, sizeArg)?.let { COpaquePointer(it.toLong()) }

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: ULong): COpaquePointer? =
    libc_pthread_getspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun freeaddrinfo(res: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun getpid(): Int =
    libc.cinterop.libc_getpid()

public actual fun getppid(): Int =
    libc.cinterop.libc_getppid()

public actual fun setpgid(pid: Int, pgid: Int): Int =
    libc.cinterop.libc_setpgid(pid, pgid)

public actual fun readlink(path: String?, buf: String?, bufsize: ULong): Long =
    memScoped {
        libc.cinterop.libc_readlink(path, buf?.cstr?.getPointer(this), bufsize)
    }

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires FFI bridge")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge for pointer endp param")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge for pointer endp param")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge for pointer endp param")

public actual fun confstr(name: Int, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr requires FFI bridge")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf requires FFI bridge")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge for Protoent type")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    libc.cinterop.libc_lseek(fd, offset, whence)

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge for MqdT type")

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog requires manual FFI bridge")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires FFI bridge")

public actual fun pthreadCreate(pThread: ULong?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("read requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun recv(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires manual FFI bridge for COpaquePointer param")

public actual fun recvfrom(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int, from: Sockaddr?, pFromLen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge")

public actual fun recvmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge for Msghdr type")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires manual FFI bridge for COpaquePointer param")

public actual fun sendmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge for Msghdr type")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires manual FFI bridge")

public actual fun sysconf(attr: Int): Long =
    throw UnsupportedOperationException("sysconf requires FFI bridge")

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog requires manual FFI bridge")

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires manual FFI bridge for PidT type")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge for PidT type")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")
