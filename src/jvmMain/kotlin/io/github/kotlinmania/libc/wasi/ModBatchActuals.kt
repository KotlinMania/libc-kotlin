// port-lint: source Mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on JVM — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")
}

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on JVM — no C library access")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on JVM — no C library access")

public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on JVM — no C library access")
}

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv not available on JVM — no C library access")

public actual fun malloc(amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on JVM — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on JVM — no C library access")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("read not available on JVM — no C library access")

public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on JVM — no C library access")

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on JVM — no C library access")

public actual fun unsetenv(k: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on JVM — no C library access")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv not available on JVM — no C library access")

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("write not available on JVM — no C library access")

public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on JVM — no C library access")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on JVM — no C library access")

public actual fun fclose(f: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on JVM — no C library access")

public actual fun remove(a: String?): CInt =
    throw UnsupportedOperationException("remove not available on JVM — no C library access")

public actual fun rename(a: String?, b: String?): CInt =
    throw UnsupportedOperationException("rename not available on JVM — no C library access")

public actual fun feof(f: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on JVM — no C library access")

public actual fun ferror(f: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on JVM — no C library access")

public actual fun fflush(f: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on JVM — no C library access")

public actual fun clearerr(f: FILE?) {
    throw UnsupportedOperationException("clearerr not available on JVM — no C library access")
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on JVM — no C library access")

public actual fun ftell(f: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on JVM — no C library access")

public actual fun rewind(f: FILE?) {
    throw UnsupportedOperationException("rewind not available on JVM — no C library access")
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on JVM — no C library access")

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on JVM — no C library access")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on JVM — no C library access")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on JVM — no C library access")

public actual fun fgetc(f: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on JVM — no C library access")

public actual fun getc(f: FILE?): CInt =
    throw UnsupportedOperationException("getc not available on JVM — no C library access")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on JVM — no C library access")

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on JVM — no C library access")

public actual fun fputc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on JVM — no C library access")

public actual fun putc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("putc not available on JVM — no C library access")

public actual fun putchar(a: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on JVM — no C library access")

public actual fun fputs(a: String?, f: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on JVM — no C library access")

public actual fun puts(a: String?): CInt =
    throw UnsupportedOperationException("puts not available on JVM — no C library access")

public actual fun perror(a: String?) {
    throw UnsupportedOperationException("perror not available on JVM — no C library access")
}

public actual fun srand(a: CUInt) {
    throw UnsupportedOperationException("srand not available on JVM — no C library access")
}

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign not available on JVM — no C library access")

public actual fun randR(a: CUInt?): CInt =
    throw UnsupportedOperationException("randR not available on JVM — no C library access")

public actual fun random(): CLong =
    throw UnsupportedOperationException("random not available on JVM — no C library access")

public actual fun srandom(a: CUInt) {
    throw UnsupportedOperationException("srandom not available on JVM — no C library access")
}

public actual fun putenv(a: String?): CInt =
    throw UnsupportedOperationException("putenv not available on JVM — no C library access")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock not available on JVM — no C library access")

public actual fun time(a: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on JVM — no C library access")

public actual fun mktime(a: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on JVM — no C library access")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on JVM — no C library access")

public actual fun gmtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on JVM — no C library access")

public actual fun gmtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on JVM — no C library access")

public actual fun localtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on JVM — no C library access")

public actual fun localtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on JVM — no C library access")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on JVM — no C library access")

public actual fun ctimeR(a: TimeT?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on JVM — no C library access")

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep not available on JVM — no C library access")

public actual fun clockGetres(a: ClockidT, b: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(a: ClockidT, b: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on JVM — no C library access")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on JVM — no C library access")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on JVM — no C library access")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on JVM — no C library access")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on JVM — no C library access")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on JVM — no C library access")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on JVM — no C library access")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on JVM — no C library access")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on JVM — no C library access")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on JVM — no C library access")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on JVM — no C library access")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on JVM — no C library access")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on JVM — no C library access")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on JVM — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on JVM — no C library access")

public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf not available on JVM — no C library access")
}

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on JVM — no C library access")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on JVM — no C library access")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("atol not available on JVM — no C library access")

public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on JVM — no C library access")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on JVM — no C library access")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on JVM — no C library access")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on JVM — no C library access")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on JVM — no C library access")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on JVM — no C library access")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on JVM — no C library access")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on JVM — no C library access")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on JVM — no C library access")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr not available on JVM — no C library access")

public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on JVM — no C library access")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on JVM — no C library access")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on JVM — no C library access")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on JVM — no C library access")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup not available on JVM — no C library access")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on JVM — no C library access")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on JVM — no C library access")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp not available on JVM — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp not available on JVM — no C library access")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on JVM — no C library access")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on JVM — no C library access")

public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror not available on JVM — no C library access")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on JVM — no C library access")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on JVM — no C library access")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on JVM — no C library access")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on JVM — no C library access")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on JVM — no C library access")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on JVM — no C library access")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on JVM — no C library access")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on JVM — no C library access")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on JVM — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on JVM — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on JVM — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on JVM — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on JVM — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on JVM — no C library access")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked not available on JVM — no C library access")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked not available on JVM — no C library access")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown not available on JVM — no C library access")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on JVM — no C library access")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on JVM — no C library access")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on JVM — no C library access")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on JVM — no C library access")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on JVM — no C library access")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on JVM — no C library access")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat not available on JVM — no C library access")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl not available on JVM — no C library access")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on JVM — no C library access")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir not available on JVM — no C library access")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on JVM — no C library access")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("closedir not available on JVM — no C library access")

public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir not available on JVM — no C library access")
}

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on JVM — no C library access")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat not available on JVM — no C library access")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat not available on JVM — no C library access")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat not available on JVM — no C library access")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat not available on JVM — no C library access")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT =
    throw UnsupportedOperationException("readlinkat not available on JVM — no C library access")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("renameat not available on JVM — no C library access")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat not available on JVM — no C library access")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat not available on JVM — no C library access")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access not available on JVM — no C library access")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on JVM — no C library access")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("fpathconf not available on JVM — no C library access")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt not available on JVM — no C library access")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("isatty not available on JVM — no C library access")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link not available on JVM — no C library access")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on JVM — no C library access")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("pathconf not available on JVM — no C library access")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on JVM — no C library access")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("unlink not available on JVM — no C library access")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pread not available on JVM — no C library access")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwrite not available on JVM — no C library access")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat not available on JVM — no C library access")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync not available on JVM — no C library access")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on JVM — no C library access")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink not available on JVM — no C library access")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate not available on JVM — no C library access")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate not available on JVM — no C library access")

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun usleep(secs: CUInt): CInt =
    throw UnsupportedOperationException("usleep not available on JVM — no C library access")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send not available on JVM — no C library access")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv not available on JVM — no C library access")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll not available on JVM — no C library access")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on JVM — no C library access")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on JVM — no C library access")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT =
    throw UnsupportedOperationException("readlink not available on JVM — no C library access")

public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm not available on JVM — no C library access")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("sysconf not available on JVM — no C library access")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko not available on JVM — no C library access")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello not available on JVM — no C library access")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on JVM — no C library access")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on JVM — no C library access")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline not available on JVM — no C library access")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on JVM — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on JVM — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on JVM — no C library access")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on JVM — no C library access")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("chdir not available on JVM — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on JVM — no C library access")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select not available on JVM — no C library access")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd not available on JVM — no C library access")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("wasilibcFdRenumber not available on JVM — no C library access")

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcUnlinkat not available on JVM — no C library access")

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRmdirat not available on JVM — no C library access")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    throw UnsupportedOperationException("wasilibcFindRelpath not available on JVM — no C library access")

public actual fun wasilibcTell(fd: CInt): OffT =
    throw UnsupportedOperationException("wasilibcTell not available on JVM — no C library access")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat not available on JVM — no C library access")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat not available on JVM — no C library access")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdLinkat not available on JVM — no C library access")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat not available on JVM — no C library access")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat not available on JVM — no C library access")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat not available on JVM — no C library access")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdRenameat not available on JVM — no C library access")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode not available on JVM — no C library access")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFstatat not available on JVM — no C library access")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode not available on JVM — no C library access")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat not available on JVM — no C library access")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat not available on JVM — no C library access")

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcAccess not available on JVM — no C library access")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcStat not available on JVM — no C library access")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcUtimens not available on JVM — no C library access")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLink not available on JVM — no C library access")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkOldat not available on JVM — no C library access")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkNewat not available on JVM — no C library access")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameOldat not available on JVM — no C library access")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameNewat not available on JVM — no C library access")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong) {
    throw UnsupportedOperationException("arc4randomBuf not available on JVM — no C library access")
}

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation not available on JVM — no C library access")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod not available on JVM — no C library access")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod not available on JVM — no C library access")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath not available on JVM — no C library access")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual not available on JVM — no C library access")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on JVM — no C library access")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on JVM — no C library access")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on JVM — no C library access")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on JVM — no C library access")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach not available on JVM — no C library access")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on JVM — no C library access")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on JVM — no C library access")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on JVM — no C library access")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on JVM — no C library access")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on JVM — no C library access")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on JVM — no C library access")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on JVM — no C library access")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on JVM — no C library access")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on JVM — no C library access")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on JVM — no C library access")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on JVM — no C library access")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on JVM — no C library access")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on JVM — no C library access")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on JVM — no C library access")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on JVM — no C library access")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on JVM — no C library access")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on JVM — no C library access")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit not available on JVM — no C library access")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit not available on JVM — no C library access")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on JVM — no C library access")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on JVM — no C library access")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on JVM — no C library access")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on JVM — no C library access")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on JVM — no C library access")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on JVM — no C library access")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on JVM — no C library access")

