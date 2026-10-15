// port-lint: source Mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.LibcNapiWasm

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun free(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("free requires N-API addon")

public actual fun getenv(s: String?): String? =
    LibcNapiWasm.getenv(s)

public actual fun malloc(amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun read(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun setenv(k: String?, v: String?, a: Int): Int =
    LibcNapiWasm.setenv(k, v, a)

public actual fun unsetenv(k: String?): Int =
    LibcNapiWasm.unsetenv(k)

public actual fun clearenv(): Int =
    LibcNapiWasm.clearenv()

public actual fun write(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fclose(f: FILE?): Int =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun remove(a: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(a: String?, b: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun feof(f: FILE?): Int =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(f: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun fflush(f: FILE?): Int =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun clearerr(f: FILE?): Unit = throw UnsupportedOperationException("clearerr requires N-API addon")

public actual fun fseek(f: FILE?, b: Long, c: Int): Int =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun ftell(f: FILE?): Long =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun rewind(f: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun fgetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun fgetc(f: FILE?): Int =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun getc(f: FILE?): Int =
    throw UnsupportedOperationException("getc requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun ungetc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fputc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun putc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("putc requires N-API addon")

public actual fun putchar(a: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fputs(a: String?, f: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(a: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun perror(a: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun srand(a: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): Int =
    throw UnsupportedOperationException("posixMemalign requires N-API addon")

public actual fun randR(a: UInt?): Int =
    throw UnsupportedOperationException("randR requires N-API addon")

public actual fun random(): Long =
    throw UnsupportedOperationException("random requires N-API addon")

public actual fun srandom(a: UInt): Unit = throw UnsupportedOperationException("srandom requires N-API addon")

public actual fun putenv(a: String?): Int =
    LibcNapiWasm.putenv(a)

public actual fun clock(): Long =
    throw UnsupportedOperationException("clock requires N-API addon")

public actual fun time(a: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun mktime(a: Tm?): Long =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun gmtime(a: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun gmtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtime(a: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun localtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(a: Long?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun nanosleep(a: Timespec?, b: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun clockGetres(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(a: ClockidT, a2: Int, b: Timespec?, c: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strrchr(cs: String?, c: Int): String? =
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

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun shutdown(socket: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires N-API addon")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir requires N-API addon")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires N-API addon")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat requires N-API addon")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat requires N-API addon")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat requires N-API addon")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: String?, bufsiz: ULong): Long =
    throw UnsupportedOperationException("readlinkat requires N-API addon")

public actual fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("renameat requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun access(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf requires N-API addon")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun isatty(fd: Int): Int =
    LibcNapiWasm.isatty(fd)

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf requires N-API addon")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun unlink(c: String?): Int =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread requires N-API addon")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun getrusage(resource: Int, usage: Rusage?): Int =
    throw UnsupportedOperationException("getrusage requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun usleep(secs: UInt): Int =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send requires N-API addon")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): Long =
    throw UnsupportedOperationException("readlink requires N-API addon")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm requires N-API addon")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf requires N-API addon")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires N-API addon")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline requires N-API addon")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select requires N-API addon")

public actual fun wasilibcRegisterPreopenedFd(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd requires N-API addon")

public actual fun wasilibcFdRenumber(fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("wasilibcFdRenumber requires N-API addon")

public actual fun wasilibcUnlinkat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcUnlinkat requires N-API addon")

public actual fun wasilibcRmdirat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRmdirat requires N-API addon")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): Int =
    throw UnsupportedOperationException("wasilibcFindRelpath requires N-API addon")

public actual fun wasilibcTell(fd: Int): Long =
    throw UnsupportedOperationException("wasilibcTell requires N-API addon")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat requires N-API addon")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat requires N-API addon")

public actual fun wasilibcNocwdLinkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdLinkat requires N-API addon")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat requires N-API addon")

public actual fun wasilibcNocwdReadlinkat(dirfd: Int, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat requires N-API addon")

public actual fun wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat requires N-API addon")

public actual fun wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdRenameat requires N-API addon")

public actual fun wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode requires N-API addon")

public actual fun wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFstatat requires N-API addon")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode requires N-API addon")

public actual fun wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat requires N-API addon")

public actual fun wasilibcNocwdOpendirat(dirfd: Int, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat requires N-API addon")

public actual fun wasilibcAccess(pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcAccess requires N-API addon")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcStat requires N-API addon")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcUtimens requires N-API addon")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLink requires N-API addon")

public actual fun wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkOldat requires N-API addon")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkNewat requires N-API addon")

public actual fun wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameOldat requires N-API addon")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameNewat requires N-API addon")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation requires N-API addon")

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires N-API addon")

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.COpaquePointer?, t2: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.COpaquePointer?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires N-API addon")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun atexit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun atQuickExit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit requires N-API addon")

public actual fun pthreadCreate(native: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate requires N-API addon")
