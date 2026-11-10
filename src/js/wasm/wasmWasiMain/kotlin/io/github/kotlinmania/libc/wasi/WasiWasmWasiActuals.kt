@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong

private var _ffi_static_ENVIRON: COpaquePointer? = null
public actual var ENVIRON: COpaquePointer?
    get() = _ffi_static_ENVIRON
    set(value) {
        _ffi_static_ENVIRON = value
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = 0u

public actual val CLOCK_REALTIME1: UByte
    get() = 0u

public actual fun exit(code: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(ptr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getenv(s: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun malloc(amt: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unsetenv(k: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fopen(a: String?, b: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fclose(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun remove(a: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rename(a: String?, b: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun feof(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ferror(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fflush(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearerr(f: FILE?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftell(f: FILE?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewind(f: FILE?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetc(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getc(f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putc(a: CInt, f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putchar(a: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputs(a: String?, f: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun puts(a: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perror(a: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(a: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atexit(a: AtexitACallback): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atQuickExit(a: AtexitACallback): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun quickExit(a: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun randR(a: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun random(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srandom(a: CUint): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putenv(a: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun time(a: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mktime(a: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atof(s: String?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atol(s: String?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoll(s: String?): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strdup(cs: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlen(cs: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerror(n: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun opendir(dirname: String?): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopendir(fd: CInt): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closedir(dirp: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewinddir(dirp: DIR?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seekdir(dirp: DIR?, loc: CLong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isatty(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathconf(path: String?, name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sleep(secs: CUint): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlink(c: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun times(buf: COpaquePointer?): ClockT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun usleep(secs: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localeconv(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sysconf(name: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freelocale(loc: LocaleT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chdir(dir: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcTell(fd: CInt): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4random(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4randomUniform(a: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun errnoLocation(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
