// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires N-API addon")
}

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind requires N-API addon")
}

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror requires N-API addon")
}

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires N-API addon")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires N-API addon")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires N-API addon")
}

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires N-API addon")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun closelog() {
    throw UnsupportedOperationException("closelog requires N-API addon")
}

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires N-API addon")
}

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid requires N-API addon")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid requires N-API addon")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    throw UnsupportedOperationException("setpgid requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsize: ULong): SsizeT =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")


public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr requires N-API addon")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires N-API addon")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon for FILE type")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires N-API addon for Protoent type")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires N-API addon for OffT type")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon for MqdT type")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog requires N-API addon")
}

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun pthreadCreate(pThread: PthreadT?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read requires N-API addon for COpaquePointer param")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon for Iovec type")

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires N-API addon for COpaquePointer param")

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt, from: Sockaddr?, pFromLen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon for Msghdr type")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires N-API addon for COpaquePointer param")

public actual fun sendmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon for Msghdr type")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires N-API addon")



public actual fun sysconf(attr: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog requires N-API addon")
}

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait requires N-API addon for PidT type")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid requires N-API addon for PidT type")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write requires N-API addon for COpaquePointer param")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon for Iovec type")
