// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_getppid
import libc.cinterop.libc_strxfrm
import libc.cinterop.libc_strspn
import libc.cinterop.libc_atol
import libc.cinterop.libc_readlink
import libc.cinterop.libc_lseek
import libc.cinterop.libc_strtol
import libc.cinterop.libc_confstr
import libc.cinterop.libc_memalign
import libc.cinterop.libc_strlen
import libc.cinterop.libc_writev
import libc.cinterop.libc_getpid
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_atoll
import libc.cinterop.libc_sysconf
import libc.cinterop.libc_fpathconf
import libc.cinterop.libc_setpgid
import libc.cinterop.libc_pathconf
import libc.cinterop.libc_readv
import libc.cinterop.libc_ftello
import libc.cinterop.libc_strcspn










public actual fun atol(s: String?): CLong = libc.cinterop.libc_atol(s)

public actual fun atoll(s: String?): CLongLong = libc.cinterop.libc_atoll(s)

public actual fun strspn(cs: String?, ct: String?): ULong = libc.cinterop.libc_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): ULong = libc.cinterop.libc_strcspn(cs, ct)

public actual fun strlen(cs: String?): ULong = libc.cinterop.libc_strlen(cs)

public actual fun strnlen(cs: String?, n: ULong): ULong = libc.cinterop.libc_strnlen(cs, n)

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    libc.cinterop.libc_strxfrm(s, ct, n)
public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires WcharT pointer bridge — not yet implemented")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires mutable buffer (COpaquePointer), not immutable String")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires manual FFI bridge — not yet implemented")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires manual FFI bridge — not yet implemented")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires manual FFI bridge — not yet implemented")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")
}

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun ftello(stream: FILE?): OffT =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun closelog() {
    throw UnsupportedOperationException("closelog requires manual FFI bridge — not yet implemented")
}

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? {
    val result = libc_memalign(blockSize, sizeArg)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")
}

public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun getppid(): PidT =
    libc.cinterop.libc_getppid()
public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    libc.cinterop.libc_setpgid(pid, pgid)
public actual fun readlink(path: String?, buf: String?, bufsize: ULong): SsizeT =
    libc.cinterop.libc_readlink(path, buf, bufsize)
public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires mutable buffer (COpaquePointer), not immutable String")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc.cinterop.libc_strtol(s, endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)
public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge for pointer endp param")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge for pointer endp param")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge for pointer endp param")

public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    libc.cinterop.libc_confstr(name, buf, len)
public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires manual FFI bridge")


public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc.cinterop.libc_fpathconf(filedes, name)
public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires manual FFI bridge for Protoent type")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_lseek(fd, offset, whence)
public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires manual FFI bridge")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge for MqdT type")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog requires manual FFI bridge")
}

public actual fun pathconf(path: String?, name: CInt): CLong =
    libc.cinterop.libc_pathconf(path, name)
public actual fun pthreadCreate(pThread: PthreadT?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    libc.cinterop.libc_read(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count)
public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_readv(fd, iovPtr, iovcnt)
    return result
}

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires manual FFI bridge for COpaquePointer param")

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt, from: Sockaddr?, pFromLen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge")

public actual fun recvmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires manual FFI bridge for Msghdr type")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires manual FFI bridge for COpaquePointer param")

public actual fun sendmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires manual FFI bridge for Msghdr type")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires manual FFI bridge")



public actual fun sysconf(attr: CInt): CLong =
    libc.cinterop.libc_sysconf(attr)
public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog requires manual FFI bridge")
}

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait requires manual FFI bridge for PidT type")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid requires manual FFI bridge for PidT type")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_writev(fd, iovPtr, iovcnt)
    return result
}
