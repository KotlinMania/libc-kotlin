// port-lint: source Mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free requires N-API addon")
}

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon")

public actual fun malloc(amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(k: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fclose(f: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun remove(a: String?): CInt =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(a: String?, b: String?): CInt =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun feof(f: FILE?): CInt =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(f: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun fflush(f: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun clearerr(f: FILE?) {
    throw UnsupportedOperationException("clearerr requires N-API addon")
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun ftell(f: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun rewind(f: FILE?) {
    throw UnsupportedOperationException("rewind requires N-API addon")
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun fgetc(f: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun getc(f: FILE?): CInt =
    throw UnsupportedOperationException("getc requires N-API addon")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fputc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun putc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("putc requires N-API addon")

public actual fun putchar(a: CInt): CInt =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fputs(a: String?, f: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(a: String?): CInt =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun perror(a: String?) {
    throw UnsupportedOperationException("perror requires N-API addon")
}

public actual fun srand(a: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun randR(a: CUInt?): CInt =
    throw UnsupportedOperationException("randR requires N-API addon")

public actual fun random(): CLong =
    throw UnsupportedOperationException("random requires N-API addon")

public actual fun srandom(a: CUInt) {
    throw UnsupportedOperationException("srandom requires N-API addon")
}

public actual fun putenv(a: String?): CInt =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun time(a: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun mktime(a: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun gmtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun gmtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun localtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(a: TimeT?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun clockGetres(a: ClockidT, b: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(a: ClockidT, b: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires N-API addon")
}

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup requires N-API addon")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires N-API addon")
}

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires N-API addon")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires N-API addon")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat requires N-API addon")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT =
    throw UnsupportedOperationException("readlinkat requires N-API addon")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty requires N-API addon")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread requires N-API addon")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun usleep(secs: CUInt): CInt =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires N-API addon")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires N-API addon")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select requires N-API addon")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd requires N-API addon")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("wasilibcFdRenumber requires N-API addon")

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcUnlinkat requires N-API addon")

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRmdirat requires N-API addon")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    throw UnsupportedOperationException("wasilibcFindRelpath requires N-API addon")

public actual fun wasilibcTell(fd: CInt): OffT =
    throw UnsupportedOperationException("wasilibcTell requires N-API addon")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat requires N-API addon")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat requires N-API addon")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdLinkat requires N-API addon")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat requires N-API addon")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat requires N-API addon")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat requires N-API addon")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdRenameat requires N-API addon")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode requires N-API addon")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFstatat requires N-API addon")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode requires N-API addon")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat requires N-API addon")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat requires N-API addon")

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcAccess requires N-API addon")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcStat requires N-API addon")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcUtimens requires N-API addon")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLink requires N-API addon")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkOldat requires N-API addon")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkNewat requires N-API addon")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameOldat requires N-API addon")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameNewat requires N-API addon")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires N-API addon")
}

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires N-API addon")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

