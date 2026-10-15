// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on JVM — no C library access")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on JVM — no C library access")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on JVM — no C library access")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf not available on JVM — no C library access")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on JVM — no C library access")

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on JVM — no C library access")

public actual fun ftell(stream: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on JVM — no C library access")

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind not available on JVM — no C library access")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror not available on JVM — no C library access")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol not available on JVM — no C library access")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll not available on JVM — no C library access")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on JVM — no C library access")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on JVM — no C library access")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on JVM — no C library access")

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on JVM — no C library access")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen not available on JVM — no C library access")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on JVM — no C library access")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr not available on JVM — no C library access")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times not available on JVM — no C library access")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname not available on JVM — no C library access")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname not available on JVM — no C library access")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir not available on JVM — no C library access")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym not available on JVM — no C library access")

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on JVM — no C library access")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on JVM — no C library access")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime not available on JVM — no C library access")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time not available on JVM — no C library access")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime not available on JVM — no C library access")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime not available on JVM — no C library access")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm not available on JVM — no C library access")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on JVM — no C library access")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello not available on JVM — no C library access")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog not available on JVM — no C library access")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline not available on JVM — no C library access")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on JVM — no C library access")

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on JVM — no C library access")

public actual fun pthreadGetspecific(key: ULong): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on JVM — no C library access")

public actual fun freeaddrinfo(res: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo not available on JVM — no C library access")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid not available on JVM — no C library access")

public actual fun getppid(): Int =
    throw UnsupportedOperationException("getppid not available on JVM — no C library access")

public actual fun setpgid(pid: Int, pgid: Int): Int =
    throw UnsupportedOperationException("setpgid not available on JVM — no C library access")

public actual fun readlink(path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("readlink not available on JVM — no C library access")

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on JVM — no C library access")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on JVM — no C library access")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on JVM — no C library access")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on JVM — no C library access")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on JVM — no C library access")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll not available on JVM — no C library access")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on JVM — no C library access")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on JVM — no C library access")

public actual fun confstr(name: Int, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr not available on JVM — no C library access")

public actual fun dlopen(filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlopen not available on JVM — no C library access")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on JVM — no C library access for FILE type")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf not available on JVM — no C library access")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber not available on JVM — no C library access for Protoent type")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek not available on JVM — no C library access for OffT type")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on JVM — no C library access")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on JVM — no C library access for MqdT type")

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog not available on JVM — no C library access")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf not available on JVM — no C library access")

public actual fun pthreadCreate(pThread: ULong?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("read not available on JVM — no C library access for COpaquePointer param")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on JVM — no C library access for Iovec type")

public actual fun recv(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv not available on JVM — no C library access for COpaquePointer param")

public actual fun recvfrom(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int, from: Sockaddr?, pFromLen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun recvmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access for Msghdr type")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send not available on JVM — no C library access for COpaquePointer param")

public actual fun sendmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access for Msghdr type")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto not available on JVM — no C library access")

public actual fun sysconf(attr: Int): Long =
    throw UnsupportedOperationException("sysconf not available on JVM — no C library access")

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog not available on JVM — no C library access")

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait not available on JVM — no C library access for PidT type")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid not available on JVM — no C library access for PidT type")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("write not available on JVM — no C library access for COpaquePointer param")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on JVM — no C library access for Iovec type")
