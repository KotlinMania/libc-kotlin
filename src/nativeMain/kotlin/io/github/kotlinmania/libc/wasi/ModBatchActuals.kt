// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toCPointer

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires manual FFI bridge — not yet implemented")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires manual FFI bridge — not yet implemented")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires manual FFI bridge — not yet implemented")
}

public actual fun alignedAlloc(a: ULong, b: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires manual FFI bridge — not yet implemented")

public actual fun calloc(amt: ULong, amt2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — type mismatch")
public actual fun free(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun getenv(s: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — type mismatch")
public actual fun malloc(amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — type mismatch")
public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun read(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    libc.cinterop.libc_read(fd, ptr?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), size)
public actual fun realloc(ptr: COpaquePointer?, amt: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — type mismatch")
public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    libc.cinterop.libc_setenv(k, v, a)
public actual fun unsetenv(k: String?): CInt =
    libc.cinterop.libc_unsetenv(k)
public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires manual FFI bridge — not yet implemented")

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("write requires manual FFI bridge — type mismatch")
public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — type mismatch")
public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — type mismatch")
public actual fun fclose(f: FILE?): CInt =
    libc.cinterop.libc_fclose(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun remove(a: String?): CInt =
    libc.cinterop.libc_remove(a)
public actual fun rename(a: String?, b: String?): CInt =
    libc.cinterop.libc_rename(a, b)
public actual fun feof(f: FILE?): CInt =
    libc.cinterop.libc_feof(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun ferror(f: FILE?): CInt =
    libc.cinterop.libc_ferror(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fflush(f: FILE?): CInt =
    libc.cinterop.libc_fflush(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun clearerr(f: FILE?) {
    throw UnsupportedOperationException("clearerr requires manual FFI bridge — not yet implemented")
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    libc.cinterop.libc_fseek(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), b, c)
public actual fun ftell(f: FILE?): CLong =
    libc.cinterop.libc_ftell(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun rewind(f: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun fwrite(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong =
    libc.cinterop.libc_fwrite(buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), a, b, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgetc(f: FILE?): CInt =
    libc.cinterop.libc_fgetc(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getc(f: FILE?): CInt =
    libc.cinterop.libc_getc(f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getchar(): CInt = libc.cinterop.libc_getchar()
public actual fun ungetc(a: CInt, f: FILE?): CInt =
    libc.cinterop.libc_ungetc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fputc(a: CInt, f: FILE?): CInt =
    libc.cinterop.libc_fputc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun putc(a: CInt, f: FILE?): CInt =
    libc.cinterop.libc_putc(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun putchar(a: CInt): CInt = libc.cinterop.libc_putchar(a)
public actual fun fputs(a: String?, f: FILE?): CInt =
    libc.cinterop.libc_fputs(a, f?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun puts(a: String?): CInt =
    libc.cinterop.libc_puts(a)
public actual fun perror(a: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun srand(a: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun posixMemalign(a: COpaquePointer?, b: ULong, c: ULong): CInt =
    throw UnsupportedOperationException("posixMemalign requires manual FFI bridge — not yet implemented")

public actual fun randR(a: CUInt?): CInt =
    throw UnsupportedOperationException("randR requires manual FFI bridge — not yet implemented")

public actual fun random(): CLong =
    libc.cinterop.libc_random()
public actual fun srandom(a: CUInt) {
    throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")
}

public actual fun putenv(a: String?): CInt =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("clock requires manual FFI bridge — not yet implemented")

public actual fun time(a: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun mktime(a: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun strftime(a: String?, b: ULong, c: String?, d: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun gmtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtime(a: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(a: TimeT?, b: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(a: Tm?, b: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(a: TimeT?, b: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt {
    if (res == null) return -1
    val resPtr: CPointer<ByteVar>? = res.handle.toCPointer()
    val result = libc_clock_getres(clockId, resPtr)
    return result
}

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    val result = libc_clock_gettime(clockId, tpPtr)
    return result
}

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt {
    if (rqtp == null) return -1
    val rqtpPtr: CPointer<ByteVar>? = rqtp.handle.toCPointer()
    if (rmtp == null) return -1
    val rmtpPtr: CPointer<ByteVar>? = rmtp.handle.toCPointer()
    val result = libc_clock_nanosleep(clockId, flags, rqtpPtr, rmtpPtr)
    return result
}

public actual fun isalnum(c: CInt): CInt = libc.cinterop.libc_isalnum(c)
public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun iscntrl(c: CInt): CInt = libc.cinterop.libc_iscntrl(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun isgraph(c: CInt): CInt = libc.cinterop.libc_isgraph(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun ispunct(c: CInt): CInt = libc.cinterop.libc_ispunct(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun isupper(c: CInt): CInt = libc.cinterop.libc_isupper(c)
public actual fun isxdigit(c: CInt): CInt = libc.cinterop.libc_isxdigit(c)
public actual fun isblank(c: CInt): CInt = libc.cinterop.libc_isblank(c)
public actual fun tolower(c: CInt): CInt = libc.cinterop.libc_tolower(c)
public actual fun toupper(c: CInt): CInt = libc.cinterop.libc_toupper(c)
public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    libc.cinterop.libc_setvbuf(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), buffer, mode, size)
public actual fun setbuf(stream: FILE?, buf: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun fgets(buf: String?, n: CInt, stream: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun atoi(s: String?): CInt =
    libc.cinterop.libc_atoi(s)
public actual fun atol(s: String?): CLong =
    libc.cinterop.libc_atol(s)
public actual fun atoll(s: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — type mismatch")
public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc.cinterop.libc_strtol(s, endp?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), base)
public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun strcpy(dst: String?, src: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — type mismatch")
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — type mismatch")
public actual fun strcat(s: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — type mismatch")
public actual fun strncat(s: String?, ct: String?, n: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — type mismatch")
public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc.cinterop.libc_strcmp(cs, ct)
public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    libc.cinterop.libc_strncmp(cs, ct, n)
public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc.cinterop.libc_strcoll(cs, ct)
public actual fun strchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — type mismatch")
public actual fun strrchr(cs: String?, c: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — type mismatch")
public actual fun strspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strspn(cs, ct)
public actual fun strcspn(cs: String?, ct: String?): ULong =
    libc.cinterop.libc_strcspn(cs, ct)
public actual fun strdup(cs: String?): String? =
    throw UnsupportedOperationException("strdup requires manual FFI bridge — type mismatch")
public actual fun strndup(cs: String?, n: ULong): String? =
    throw UnsupportedOperationException("strndup requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — type mismatch")
public actual fun strstr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — type mismatch")
public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    libc.cinterop.libc_strcasecmp(s1, s2)
public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    libc.cinterop.libc_strncasecmp(s1, s2, n)
public actual fun strlen(cs: String?): ULong =
    libc.cinterop.libc_strlen(cs)
public actual fun strnlen(cs: String?, maxlen: ULong): ULong =
    libc.cinterop.libc_strnlen(cs, maxlen)
public actual fun strerror(n: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — type mismatch")
public actual fun strtok(s: String?, t: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(s: String?, ct: String?, n: ULong): ULong =
    libc.cinterop.libc_strxfrm(s, ct, n)
public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — type mismatch")
public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt =
    libc.cinterop.libc_memcmp(cx?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), ct?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), n)
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — type mismatch")
public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — type mismatch")
public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — type mismatch")
public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun shutdown(socket: CInt, how: CInt): CInt = libc.cinterop.libc_shutdown(socket, how)
public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc.cinterop.libc_mkdir(path, mode.toInt())
public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires manual FFI bridge — type mismatch")
public actual fun fileno(stream: FILE?): CInt =
    libc.cinterop.libc_fileno(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — type mismatch")
public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("opendir requires manual FFI bridge — not yet implemented")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("fdopendir requires manual FFI bridge — not yet implemented")

public actual fun readdir(dirp: DIR?): Dirent? =
    throw UnsupportedOperationException("readdir requires manual FFI bridge — not yet implemented")

public actual fun closedir(dirp: DIR?): CInt =
    libc.cinterop.libc_closedir(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun rewinddir(dirp: DIR?) {
    throw UnsupportedOperationException("rewinddir requires manual FFI bridge — not yet implemented")
}

public actual fun dirfd(dirp: DIR?): CInt =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")
}

public actual fun telldir(dirp: DIR?): CLong {
    if (dirp == null) return -1L
    val dirpPtr: CPointer<ByteVar>? = dirp.handle.toCPointer()
    val result = libc_telldir(dirpPtr)
    return result
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("openat requires manual FFI bridge — not yet implemented")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("fstatat requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc.cinterop.libc_linkat(olddirfd, oldpath, newdirfd, newpath, flags)
public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdirat requires manual FFI bridge — type mismatch")
public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: String?, bufsiz: ULong): SsizeT =
    libc.cinterop.libc_readlinkat(dirfd, pathname, buf, bufsiz)
public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc.cinterop.libc_renameat(olddirfd, oldpath, newdirfd, newpath)
public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    libc.cinterop.libc_symlinkat(target, newdirfd, linkpath)
public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    libc.cinterop.libc_unlinkat(dirfd, pathname, flags)
public actual fun access(path: String?, amode: CInt): CInt =
    libc.cinterop.libc_access(path, amode)
public actual fun close(fd: CInt): CInt = libc.cinterop.libc_close(fd)
public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc.cinterop.libc_fpathconf(filedes, name)
public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun isatty(fd: CInt): CInt = libc.cinterop.libc_isatty(fd)
public actual fun link(src: String?, dst: String?): CInt =
    libc.cinterop.libc_link(src, dst)
public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc.cinterop.libc_lseek(fd, offset, whence)
public actual fun pathconf(path: String?, name: CInt): CLong =
    libc.cinterop.libc_pathconf(path, name)
public actual fun rmdir(path: String?): CInt =
    libc.cinterop.libc_rmdir(path)
public actual fun unlink(c: String?): CInt =
    libc.cinterop.libc_unlink(c)
public actual fun pread(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    libc.cinterop.libc_pread(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)
public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: ULong, offset: OffT): SsizeT =
    libc.cinterop.libc_pwrite(fd, buf?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), count, offset)
public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: CInt): CInt = libc.cinterop.libc_fsync(fd)
public actual fun fdatasync(fd: CInt): CInt =
    libc.cinterop.libc_fdatasync(fd)
public actual fun symlink(path1: String?, path2: String?): CInt =
    libc.cinterop.libc_symlink(path1, path2)
public actual fun truncate(path: String?, length: OffT): CInt =
    libc.cinterop.libc_truncate(path, length)
public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc.cinterop.libc_ftruncate(fd, length)
public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    throw UnsupportedOperationException("getrusage requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun times(buf: Tms?): ClockT =
    throw UnsupportedOperationException("times requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt {
    val result = libc_strerror_r(errnum, buf, buflen)
    return result
}

public actual fun usleep(secs: CUInt): CInt = libc.cinterop.libc_usleep(secs)
public actual fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("send requires manual FFI bridge — not yet implemented")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recv requires manual FFI bridge — not yet implemented")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires manual FFI bridge — not yet implemented")

public actual fun setlocale(category: CInt, locale: String?): String? =
    throw UnsupportedOperationException("setlocale requires manual FFI bridge — type mismatch")
public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun readlink(path: String?, buf: String?, bufsz: ULong): SsizeT =
    libc.cinterop.libc_readlink(path, buf, bufsz)
public actual fun timegm(tm: Tm?): TimeT =
    throw UnsupportedOperationException("timegm requires manual FFI bridge — not yet implemented")

public actual fun sysconf(name: CInt): CLong =
    libc.cinterop.libc_sysconf(name)
public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)
public actual fun ftello(stream: FILE?): OffT =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt {
    val result = libc_posix_fallocate(fd, offset, len)
    return result
}

public actual fun strcasestr(cs: String?, ct: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("getline requires manual FFI bridge — not yet implemented")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_writev(fd, iovPtr, iovcnt)
    return result
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_readv(fd, iovPtr, iovcnt)
    return result
}

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_pwritev(fd, iovPtr, iovcnt, offset)
    return result
}

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    if (iov == null) return -1
    val iovPtr: CPointer<ByteVar>? = iov.handle.toCPointer()
    val result = libc_preadv(fd, iovPtr, iovcnt, offset)
    return result
}

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.value.toCPointer()
    val result = libc_getentropy(bufPtr, buflen)
    return result
}

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun abs(i: CInt): CInt =
    libc.cinterop.libc_abs(i)
public actual fun labs(i: CLong): CLong =
    libc.cinterop.libc_labs(i)
public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun getcwd(buf: String?, size: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun chdir(dir: String?): CInt =
    libc.cinterop.libc_chdir(dir)
public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    throw UnsupportedOperationException("select requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRegisterPreopenedFd requires manual FFI bridge — not yet implemented")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("wasilibcFdRenumber requires manual FFI bridge — not yet implemented")

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcUnlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcRmdirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    throw UnsupportedOperationException("wasilibcFindRelpath requires manual FFI bridge — not yet implemented")

public actual fun wasilibcTell(fd: CInt): OffT =
    throw UnsupportedOperationException("wasilibcTell requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcUnlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdWasilibcRmdirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdLinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdSymlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: String?, bufsize: ULong): Long =
    throw UnsupportedOperationException("wasilibcNocwdReadlinkat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFaccessat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdRenameat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdOpenatNomode requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdFstatat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("wasilibcNocwdMkdiratNomode requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcNocwdUtimensat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    throw UnsupportedOperationException("wasilibcNocwdOpendirat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcAccess requires manual FFI bridge — not yet implemented")

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcStat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcUtimens(pathname: String?, times: Timespec?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcUtimens requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLink requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkOldat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("wasilibcLinkNewat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameOldat requires manual FFI bridge — not yet implemented")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("wasilibcRenameNewat requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(a: COpaquePointer?, b: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")
}

public actual fun errnoLocation(): CInt? =
    throw UnsupportedOperationException("errnoLocation requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — type mismatch")
public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires manual FFI bridge — type mismatch")
public actual fun realpath(pathname: String?, resolved: String?): String? =
    throw UnsupportedOperationException("realpath requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun atexit(a: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun atQuickExit(a: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atQuickExit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadKeyCreate requires manual FFI bridge — not yet implemented")
