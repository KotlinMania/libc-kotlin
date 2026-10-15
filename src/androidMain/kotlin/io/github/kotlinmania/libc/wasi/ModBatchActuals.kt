// port-lint: source Mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.internal.LibcJni

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on Android host — use androidNative target for FFI")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on Android host — use androidNative target for FFI")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on Android host — use androidNative target for FFI")

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on Android host — use androidNative target for FFI")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun free(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")

public actual fun getenv(s: String?): String? =
    if (s == null) null else LibcJni.getenv(s)

public actual fun malloc(amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on Android host — use androidNative target for FFI")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun read(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI")

public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun setenv(k: String?, v: String?, a: Int): Int =
    if (k == null || v == null) -1 else LibcJni.setenv(k, v, a)

public actual fun unsetenv(k: String?): Int =
    if (k == null) -1 else LibcJni.unsetenv(k)

public actual fun clearenv(): Int =
    LibcJni.clearenv()

public actual fun write(fd: Int, ptr: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI")

public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fclose(f: FILE?): Int =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun remove(a: String?): Int =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rename(a: String?, b: String?): Int =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun feof(f: FILE?): Int =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(f: FILE?): Int =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun fflush(f: FILE?): Int =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun clearerr(f: FILE?): Unit = throw UnsupportedOperationException("clearerr not available on Android host — use androidNative target for FFI")

public actual fun fseek(f: FILE?, b: Long, c: Int): Int =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(f: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun rewind(f: FILE?): Unit = throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")

public actual fun fgetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(f: FILE?, pos: FposT?): Int =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun fgetc(f: FILE?): Int =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun getc(f: FILE?): Int =
    throw UnsupportedOperationException("getc not available on Android host — use androidNative target for FFI")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun ungetc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun fputc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun putc(a: Int, f: FILE?): Int =
    throw UnsupportedOperationException("putc not available on Android host — use androidNative target for FFI")

public actual fun putchar(a: Int): Int =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun fputs(a: String?, f: FILE?): Int =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun puts(a: String?): Int =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun perror(a: String?): Unit = throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")

public actual fun srand(a: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): Int =
    throw UnsupportedOperationException("posixMemalign not available on Android host — use androidNative target for FFI")

public actual fun randR(a: UInt?): Int =
    throw UnsupportedOperationException("randR not available on Android host — use androidNative target for FFI")

public actual fun random(): Long =
    throw UnsupportedOperationException("random not available on Android host — use androidNative target for FFI")

public actual fun srandom(a: UInt): Unit = throw UnsupportedOperationException("srandom not available on Android host — use androidNative target for FFI")

public actual fun putenv(a: String?): Int =
    if (a == null) -1 else LibcJni.putenv(a)

public actual fun clock(): Long =
    throw UnsupportedOperationException("clock not available on Android host — use androidNative target for FFI")

public actual fun time(a: Long?): Long =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun mktime(a: Tm?): Long =
    throw UnsupportedOperationException("mktime not available on Android host — use androidNative target for FFI")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun gmtime(a: Long?): Tm? =
    throw UnsupportedOperationException("gmtime not available on Android host — use androidNative target for FFI")

public actual fun gmtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on Android host — use androidNative target for FFI")

public actual fun localtime(a: Long?): Tm? =
    throw UnsupportedOperationException("localtime not available on Android host — use androidNative target for FFI")

public actual fun localtimeR(a: Long?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on Android host — use androidNative target for FFI")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on Android host — use androidNative target for FFI")

public actual fun ctimeR(a: Long?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on Android host — use androidNative target for FFI")

public actual fun nanosleep(a: Timespec?, b: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on Android host — use androidNative target for FFI")

public actual fun clockGetres(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(a: ClockidT, b: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun clockNanosleep(a: ClockidT, a2: Int, b: Timespec?, c: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on Android host — use androidNative target for FFI")

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on Android host — use androidNative target for FFI")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(stream: FILE?, buf: String?): Unit = throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")

public actual fun fgets(buf: String?, n: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(s: String?): Long =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun atoll(s: String?): Long =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat not available on Android host — use androidNative target for FFI")

public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat not available on Android host — use androidNative target for FFI")

public actual fun strcmp(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strrchr(cs: String?, c: Int): String? =
    throw UnsupportedOperationException("strrchr not available on Android host — use androidNative target for FFI")

public actual fun strspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strspn not available on Android host — use androidNative target for FFI")

public actual fun strcspn(cs: String?, ct: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on Android host — use androidNative target for FFI")

public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup not available on Android host — use androidNative target for FFI")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on Android host — use androidNative target for FFI")

public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr not available on Android host — use androidNative target for FFI")

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp not available on Android host — use androidNative target for FFI")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp not available on Android host — use androidNative target for FFI")

public actual fun strlen(cs: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun strerror(n: Int): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun memchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(dest: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on Android host — use androidNative target for FFI")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on Android host — use androidNative target for FFI")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf not available on Android host — use androidNative target for FFI")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on Android host — use androidNative target for FFI")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf not available on Android host — use androidNative target for FFI")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun shutdown(socket: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown not available on Android host — use androidNative target for FFI")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

public actual fun mkdir(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdir not available on Android host — use androidNative target for FFI")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun fdopen(fd: Int, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno not available on Android host — use androidNative target for FFI")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun creat(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl not available on Android host — use androidNative target for FFI")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir not available on Android host — use androidNative target for FFI")

public actual fun fdopendir(fd: Int): DIR? =
    throw UnsupportedOperationException("fdopendir not available on Android host — use androidNative target for FFI")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir not available on Android host — use androidNative target for FFI")

public actual fun closedir(dirp: DIR?): Int =
    throw UnsupportedOperationException("closedir not available on Android host — use androidNative target for FFI")

public actual fun rewinddir(dirp: DIR?): Unit = throw UnsupportedOperationException("rewinddir not available on Android host — use androidNative target for FFI")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("openat not available on Android host — use androidNative target for FFI")

public actual fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("fstatat not available on Android host — use androidNative target for FFI")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat not available on Android host — use androidNative target for FFI")

public actual fun mkdirat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkdirat not available on Android host — use androidNative target for FFI")

public actual fun readlinkat(dirfd: Int, pathname: String?, buf: String?, bufsiz: ULong): Long =
    throw UnsupportedOperationException("readlinkat not available on Android host — use androidNative target for FFI")

public actual fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("renameat not available on Android host — use androidNative target for FFI")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat not available on Android host — use androidNative target for FFI")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat not available on Android host — use androidNative target for FFI")

public actual fun access(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("access not available on Android host — use androidNative target for FFI")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on Android host — use androidNative target for FFI")

public actual fun fpathconf(filedes: Int, name: Int): Long =
    throw UnsupportedOperationException("fpathconf not available on Android host — use androidNative target for FFI")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt not available on Android host — use androidNative target for FFI")

public actual fun isatty(fd: Int): Int =
    LibcJni.isatty(fd)

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link not available on Android host — use androidNative target for FFI")

public actual fun lseek(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI")

public actual fun pathconf(path: String?, name: Int): Long =
    throw UnsupportedOperationException("pathconf not available on Android host — use androidNative target for FFI")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir not available on Android host — use androidNative target for FFI")

public actual fun unlink(c: String?): Int =
    throw UnsupportedOperationException("unlink not available on Android host — use androidNative target for FFI")

public actual fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread not available on Android host — use androidNative target for FFI")

public actual fun pwrite(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite not available on Android host — use androidNative target for FFI")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on Android host — use androidNative target for FFI")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync not available on Android host — use androidNative target for FFI")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on Android host — use androidNative target for FFI")

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink not available on Android host — use androidNative target for FFI")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate not available on Android host — use androidNative target for FFI")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate not available on Android host — use androidNative target for FFI")

public actual fun getrusage(resource: Int, usage: Rusage?): Int =
    throw UnsupportedOperationException("getrusage not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun times(buf: Tms?): Long =
    throw UnsupportedOperationException("times not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun usleep(secs: UInt): Int =
    throw UnsupportedOperationException("usleep not available on Android host — use androidNative target for FFI")

public actual fun send(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("send not available on Android host — use androidNative target for FFI")

public actual fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("recv not available on Android host — use androidNative target for FFI")

public actual fun poll(fds: Pollfd?, nfds: ULong, timeout: Int): Int =
    throw UnsupportedOperationException("poll not available on Android host — use androidNative target for FFI")

public actual fun setlocale(category: Int, locale: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on Android host — use androidNative target for FFI")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): Long =
    throw UnsupportedOperationException("readlink not available on Android host — use androidNative target for FFI")

public actual fun timegm(tm: Tm?): Long =
    throw UnsupportedOperationException("timegm not available on Android host — use androidNative target for FFI")

public actual fun sysconf(name: Int): Long =
    throw UnsupportedOperationException("sysconf not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko not available on Android host — use androidNative target for FFI")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on Android host — use androidNative target for FFI")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long =
    throw UnsupportedOperationException("getline not available on Android host — use androidNative target for FFI")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on Android host — use androidNative target for FFI")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on Android host — use androidNative target for FFI")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on Android host — use androidNative target for FFI")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on Android host — use androidNative target for FFI")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on Android host — use androidNative target for FFI")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on Android host — use androidNative target for FFI")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on Android host — use androidNative target for FFI")

public actual fun chdir(dir: String?): Int =
    throw UnsupportedOperationException("chdir not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int =
    throw UnsupportedOperationException("select not available on Android host — use androidNative target for FFI")

public actual fun wasilibcRegisterPreopenedFd(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd not available on Android host — use androidNative target for FFI")

public actual fun wasilibcFdRenumber(fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("wasilibcFdRenumber not available on Android host — use androidNative target for FFI")

public actual fun wasilibcUnlinkat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcUnlinkat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcRmdirat(fd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcRmdirat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): Int =
    throw UnsupportedOperationException("wasilibcFindRelpath not available on Android host — use androidNative target for FFI")

public actual fun wasilibcTell(fd: Int): Long =
    throw UnsupportedOperationException("wasilibcTell not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdLinkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdLinkat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdReadlinkat(dirfd: Int, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdRenameat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdFstatat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcNocwdOpendirat(dirfd: Int, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcAccess(pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcAccess not available on Android host — use androidNative target for FFI")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcStat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcUtimens not available on Android host — use androidNative target for FFI")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLink not available on Android host — use androidNative target for FFI")

public actual fun wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkOldat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("wasilibcLinkNewat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameOldat not available on Android host — use androidNative target for FFI")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: Int, newpath: String?): Int =
    throw UnsupportedOperationException("wasilibcRenameNewat not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")

public actual fun errnoLocation(): Int? =
    throw UnsupportedOperationException("errnoLocation not available on Android host — use androidNative target for FFI")

public actual fun chmod(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("chmod not available on Android host — use androidNative target for FFI")

public actual fun fchmod(fd: Int, mode: UInt): Int =
    throw UnsupportedOperationException("fchmod not available on Android host — use androidNative target for FFI")

public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath not available on Android host — use androidNative target for FFI")

public actual fun pthreadEqual(t1: io.github.kotlinmania.libc.COpaquePointer?, t2: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadEqual not available on Android host — use androidNative target for FFI")

public actual fun pthreadJoin(native: io.github.kotlinmania.libc.COpaquePointer?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on Android host — use androidNative target for FFI")

public actual fun pthreadDetach(thread: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadDetach not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyDelete(key: UInt): Int =
    throw UnsupportedOperationException("pthreadKeyDelete not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetspecific(key: UInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetspecific(key: UInt, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun atexit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")

public actual fun atQuickExit(a: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")

public actual fun pthreadKeyCreate(key: UInt?, dtor: ((COpaquePointer?) -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadKeyCreate not available on Android host — use androidNative target for FFI")
