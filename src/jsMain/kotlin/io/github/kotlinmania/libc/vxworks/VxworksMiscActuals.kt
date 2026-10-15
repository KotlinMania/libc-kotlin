// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (filename != null && mode != null) {
        val h = LibcNative.fopen(filename, mode)
        if (h != 0) FILE(h.toLong()) else null
    } else {
        null
    }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")

public actual fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fread(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    LibcNative.fwrite(ptr?.value, size.toInt(), nobj.toInt(), stream?.handle?.toInt() ?: -1).toULong()

public actual fun ftell(stream: FILE?): Long =
    LibcNative.ftell(stream?.handle?.toInt() ?: -1).toLong()

public actual fun rewind(stream: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun perror(s: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    strlenNapi(cs)

public actual fun strnlen(cs: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun wcslen(buf: UInt?): ULong =
    throw UnsupportedOperationException("wcslen requires N-API addon")

public actual fun wcstombs(dest: String?, src: UInt?, n: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt? =
    throw UnsupportedOperationException("wmemchr requires N-API addon")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun getprotobyname(name: String?): Protoent? =
    throw UnsupportedOperationException("getprotobyname requires N-API addon")

public actual fun getservbyname(name: String?, proto: String?): Servent? =
    throw UnsupportedOperationException("getservbyname requires N-API addon")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires N-API addon")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlsym requires N-API addon")

public actual fun gmtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtimeR(timeP: Long?, result: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun mktime(tm: Tm?): Long =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun time(time: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun gmtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun localtime(timeP: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun closelog(): Unit = throw UnsupportedOperationException("closelog requires N-API addon")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun readdir(pDir: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun pthreadGetspecific(key: ULong): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun freeaddrinfo(res: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires N-API addon")

public actual fun getpid(): Int =
    getpidNapi()

public actual fun getppid(): Int =
    getppidNapi()

public actual fun setpgid(pid: Int, pgid: Int): Int =
    throw UnsupportedOperationException("setpgid requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun opendir(name: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    strtolNapi(s, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun confstr(name: Int, buf: String?, len: ULong): ULong =
    throw UnsupportedOperationException("confstr requires N-API addon")

public actual fun dlopen(filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlopen requires N-API addon")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon for FILE type")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getprotobynumber(proto: Int): Protoent? =
    throw UnsupportedOperationException("getprotobynumber requires N-API addon for Protoent type")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek requires N-API addon for OffT type")

public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: Int, flags: Int, fd: Int, offset: Long): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires N-API addon")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires N-API addon for MqdT type")

public actual fun openlog(ident: String?, logopt: Int, facility: Int): Unit = throw UnsupportedOperationException("openlog requires N-API addon")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun pthreadCreate(pThread: ULong?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun read(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("read requires N-API addon for COpaquePointer param")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon for Iovec type")

public actual fun recv(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires N-API addon for COpaquePointer param")

public actual fun recvfrom(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int, from: Sockaddr?, pFromLen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon for Msghdr type")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires N-API addon for COpaquePointer param")

public actual fun sendmsg(socket: Int, mp: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon for Msghdr type")

public actual fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires N-API addon")

public actual fun sysconf(attr: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun syslog(priority: Int, message: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("syslog requires N-API addon")

public actual fun wait(status: Int?): Int =
    throw UnsupportedOperationException("wait requires N-API addon for PidT type")

public actual fun waitpid(pid: Int, status: Int?, options: Int): Int =
    throw UnsupportedOperationException("waitpid requires N-API addon for PidT type")

public actual fun write(fd: Int, buf: COpaquePointer?, count: ULong): Long =
    throw UnsupportedOperationException("write requires N-API addon for COpaquePointer param")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon for Iovec type")
