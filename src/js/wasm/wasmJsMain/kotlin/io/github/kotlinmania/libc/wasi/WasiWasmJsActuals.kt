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
    error("Unreachable noreturn C function exit")

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    null

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    null

public actual fun free(ptr: COpaquePointer?) {
}

public actual fun getenv(s: String?): COpaquePointer? =
    null

public actual fun malloc(amt: SizeT): COpaquePointer? =
    null

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    null

public actual fun rand(): CInt =
    0

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    null

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    0

public actual fun unsetenv(k: String?): CInt =
    0

public actual fun clearenv(): CInt =
    0

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    0L

public actual fun fopen(a: String?, b: String?): FILE? =
    null

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    null

public actual fun fclose(f: FILE?): CInt =
    0

public actual fun remove(a: String?): CInt =
    0

public actual fun rename(a: String?, b: String?): CInt =
    0

public actual fun feof(f: FILE?): CInt =
    0

public actual fun ferror(f: FILE?): CInt =
    0

public actual fun fflush(f: FILE?): CInt =
    0

public actual fun clearerr(f: FILE?) {
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    0

public actual fun ftell(f: FILE?): CLong =
    0L

public actual fun rewind(f: FILE?) {
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    0

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    0

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    0uL

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    0uL

public actual fun fgetc(f: FILE?): CInt =
    0

public actual fun getc(f: FILE?): CInt =
    0

public actual fun getchar(): CInt =
    0

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    0

public actual fun fputc(a: CInt, f: FILE?): CInt =
    0

public actual fun putc(a: CInt, f: FILE?): CInt =
    0

public actual fun putchar(a: CInt): CInt =
    0

public actual fun fputs(a: String?, f: FILE?): CInt =
    0

public actual fun puts(a: String?): CInt =
    0

public actual fun perror(a: String?) {
}

public actual fun srand(a: CUint) {
}

public actual fun atexit(a: FnCallback): CInt =
    0

public actual fun atQuickExit(a: FnCallback): CInt =
    0

public actual fun quickExit(a: CInt): Nothing =
    error("Unreachable noreturn C function quickExit")

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    0

public actual fun randR(a: COpaquePointer?): CInt =
    0

public actual fun random(): CLong =
    0L

public actual fun srandom(a: CUint) {
}

public actual fun putenv(a: COpaquePointer?): CInt =
    0

public actual fun clock(): ClockT =
    0L

public actual fun time(a: COpaquePointer?): TimeT =
    0L

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    0.0

public actual fun mktime(a: COpaquePointer?): TimeT =
    0L

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    0uL

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    null

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    null

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    null

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    0

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    0

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    0

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun iscntrl(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun isgraph(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun ispunct(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun isupper(c: CInt): CInt =
    0

public actual fun isxdigit(c: CInt): CInt =
    0

public actual fun isblank(c: CInt): CInt =
    0

public actual fun tolower(c: CInt): CInt =
    0

public actual fun toupper(c: CInt): CInt =
    0

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun atof(s: String?): CDouble =
    0.0

public actual fun atoi(s: String?): CInt =
    0

public actual fun atol(s: String?): CLong =
    0L

public actual fun atoll(s: String?): CLonglong =
    0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    0uL

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    null

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    0

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    0

public actual fun strlen(cs: String?): SizeT =
    0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    0

public actual fun putcharUnlocked(c: CInt): CInt =
    0

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    null

public actual fun fileno(stream: FILE?): CInt =
    0

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    0

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    null

public actual fun fdopendir(fd: CInt): DIR? =
    null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    null

public actual fun closedir(dirp: DIR?): CInt =
    0

public actual fun rewinddir(dirp: DIR?) {
}

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    0

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    0L

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    0

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    0

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun access(path: String?, amode: CInt): CInt =
    0

public actual fun close(fd: CInt): CInt =
    0

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    0L

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    0

public actual fun isatty(fd: CInt): CInt =
    0

public actual fun link(src: String?, dst: String?): CInt =
    0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    0L

public actual fun pathconf(path: String?, name: CInt): CLong =
    0L

public actual fun rmdir(path: String?): CInt =
    0

public actual fun sleep(secs: CUint): CUint =
    0u

public actual fun unlink(c: String?): CInt =
    0

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    0L

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    0L

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fsync(fd: CInt): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun symlink(path1: String?, path2: String?): CInt =
    0

public actual fun truncate(path: String?, length: OffT): CInt =
    0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    0

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun times(buf: COpaquePointer?): ClockT =
    0L

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun usleep(secs: CUint): CInt =
    0

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    0L

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    0L

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    null

public actual fun localeconv(): COpaquePointer? =
    null

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    0L

public actual fun timegm(tm: COpaquePointer?): TimeT =
    0L

public actual fun sysconf(name: CInt): CLong =
    0L

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    0

public actual fun ftello(stream: FILE?): OffT =
    0L

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    null

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    0L

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun abs(i: CInt): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun schedYield(): CInt =
    0

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun chdir(dir: String?): CInt =
    0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    null

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    0

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    0

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    0

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    0

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    0

public actual fun wasilibcTell(fd: CInt): OffT =
    0L

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    0

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    0

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    0

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    0

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    0L

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    0

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    0

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    0

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    null

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    0

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    0

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    0

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    0

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    0

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    0

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
}

public actual fun arc4randomUniform(a: UInt): UInt =
    0u

public actual fun errnoLocation(): COpaquePointer? =
    null

public actual fun chmod(path: String?, mode: ModeT): CInt =
    0

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    0

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    null

public actual fun pthreadSelf(): PthreadT =
    null

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback1, value: COpaquePointer?): CInt =
    0

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    0

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: FnCallback2?): CInt =
    0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    0
