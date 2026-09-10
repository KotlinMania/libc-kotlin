// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")
}

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun ftell(stream: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(stream: FILE?) {
    throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")
}

public actual fun perror(s: String?) {
    throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")
}

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on Android host — use androidNative target for FFI")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on Android host — use androidNative target for FFI")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun wcslen(buf: WcharT?): ULong =
    throw UnsupportedOperationException("wcslen not available on Android host — use androidNative target for FFI")

public actual fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on Android host — use androidNative target for FFI")

public actual fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? =
    throw UnsupportedOperationException("wmemchr not available on Android host — use androidNative target for FFI")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times not available on Android host — use androidNative target for FFI")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname not available on Android host — use androidNative target for FFI")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname not available on Android host — use androidNative target for FFI")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir not available on Android host — use androidNative target for FFI")
}

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on Android host — use androidNative target for FFI")

public actual fun gmtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on Android host — use androidNative target for FFI")

public actual fun localtimeR(timeP: TimeT?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on Android host — use androidNative target for FFI")

public actual fun mktime(tm: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on Android host — use androidNative target for FFI")

public actual fun time(time: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun gmtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on Android host — use androidNative target for FFI")

public actual fun localtime(timeP: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on Android host — use androidNative target for FFI")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm not available on Android host — use androidNative target for FFI")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on Android host — use androidNative target for FFI")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello not available on Android host — use androidNative target for FFI")

public actual fun closelog() {
    throw UnsupportedOperationException("closelog not available on Android host — use androidNative target for FFI")
}

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline not available on Android host — use androidNative target for FFI")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on Android host — use androidNative target for FFI")

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on Android host — use androidNative target for FFI")

public actual fun freeaddrinfo(res: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo not available on Android host — use androidNative target for FFI")
}

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun getppid(): PidT =
    throw UnsupportedOperationException("getppid not available on Android host — use androidNative target for FFI")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    throw UnsupportedOperationException("setpgid not available on Android host — use androidNative target for FFI")

public actual fun readlink(path: String?, buf: String?, bufsize: ULong): SsizeT =
    throw UnsupportedOperationException("readlink not available on Android host — use androidNative target for FFI")

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on Android host — use androidNative target for FFI")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on Android host — use androidNative target for FFI")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on Android host — use androidNative target for FFI")


public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun confstr(name: CInt, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr not available on Android host — use androidNative target for FFI")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on Android host — use androidNative target for FFI")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI for FILE type")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf not available on Android host — use androidNative target for FFI")

public actual fun getprotobynumber(proto: CInt): Protoent? =
    throw UnsupportedOperationException("getprotobynumber not available on Android host — use androidNative target for FFI for Protoent type")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI for OffT type")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on Android host — use androidNative target for FFI")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on Android host — use androidNative target for FFI for MqdT type")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    throw UnsupportedOperationException("openlog not available on Android host — use androidNative target for FFI")
}

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(pThread: PthreadT?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI for COpaquePointer param")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI for Iovec type")

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv not available on Android host — use androidNative target for FFI for COpaquePointer param")

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt, from: Sockaddr?, pFromLen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun recvmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on Android host — use androidNative target for FFI for Msghdr type")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send not available on Android host — use androidNative target for FFI for COpaquePointer param")

public actual fun sendmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on Android host — use androidNative target for FFI for Msghdr type")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto not available on Android host — use androidNative target for FFI")



public actual fun sysconf(attr: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on Android host — use androidNative target for FFI")

public actual fun syslog(priority: CInt, message: String?, vararg args: Any?) {
    throw UnsupportedOperationException("syslog not available on Android host — use androidNative target for FFI")
}

public actual fun wait(status: CInt?): PidT =
    throw UnsupportedOperationException("wait not available on Android host — use androidNative target for FFI for PidT type")

public actual fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT =
    throw UnsupportedOperationException("waitpid not available on Android host — use androidNative target for FFI for PidT type")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI for COpaquePointer param")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI for Iovec type")
