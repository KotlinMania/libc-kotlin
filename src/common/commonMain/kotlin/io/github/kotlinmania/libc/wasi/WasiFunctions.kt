package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AtexitACallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr)
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    val n = set1.nfds
    return ((set1.fds).slice(0 until n)).any({ p -> p == fd })
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    val n = set1.nfds
    if (!((set1.fds).slice(0 until n)).any { p -> p == fd }) {
        set1.nfds = n + 1
        set1.fds[n] = fd
        (FdSet.typeLayout()).writeNative((set).rawAddress, set1)
    }
}

public fun fdZero(set: MutPtr) {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    set1.nfds = 0
    (FdSet.typeLayout()).writeNative((set).rawAddress, set1)
    return
}

public expect fun exit(code: CInt): Nothing

public expect fun abort(): Nothing

public expect fun alignedAlloc(a: SizeT, b: SizeT): MutPtr

public expect fun calloc(amt: SizeT, amt2: SizeT): MutPtr

public expect fun free(ptr: MutPtr)

public expect fun getenv(s: ConstPtr): MutPtr

public expect fun malloc(amt: SizeT): MutPtr

public expect fun mallocUsableSize(ptr: MutPtr): SizeT

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun rand(): CInt

public expect fun read(fd: CInt, ptr: MutPtr, size: SizeT): SsizeT

public expect fun realloc(ptr: MutPtr, amt: SizeT): MutPtr

public expect fun setenv(k: ConstPtr, v: ConstPtr, a: CInt): CInt

public expect fun unsetenv(k: ConstPtr): CInt

public expect fun clearenv(): CInt

public expect fun write(fd: CInt, ptr: ConstPtr, size: SizeT): SsizeT

public expect var ENVIRON: MutPtr

public expect fun fopen(a: ConstPtr, b: ConstPtr): MutPtr

public expect fun freopen(a: ConstPtr, b: ConstPtr, f: MutPtr): MutPtr

public expect fun fclose(f: MutPtr): CInt

public expect fun remove(a: ConstPtr): CInt

public expect fun rename(a: ConstPtr, b: ConstPtr): CInt

public expect fun feof(f: MutPtr): CInt

public expect fun ferror(f: MutPtr): CInt

public expect fun fflush(f: MutPtr): CInt

public expect fun clearerr(f: MutPtr)

public expect fun fseek(f: MutPtr, b: CLong, c: CInt): CInt

public expect fun ftell(f: MutPtr): CLong

public expect fun rewind(f: MutPtr)

public expect fun fgetpos(f: MutPtr, pos: MutPtr): CInt

public expect fun fsetpos(f: MutPtr, pos: ConstPtr): CInt

public expect fun fread(buf: MutPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT

public expect fun fwrite(buf: ConstPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT

public expect fun fgetc(f: MutPtr): CInt

public expect fun getc(f: MutPtr): CInt

public expect fun getchar(): CInt

public expect fun ungetc(a: CInt, f: MutPtr): CInt

public expect fun fputc(a: CInt, f: MutPtr): CInt

public expect fun putc(a: CInt, f: MutPtr): CInt

public expect fun putchar(a: CInt): CInt

public expect fun fputs(a: ConstPtr, f: MutPtr): CInt

public expect fun puts(a: ConstPtr): CInt

public expect fun perror(a: ConstPtr)

public expect fun srand(a: CUint)

public expect fun atexit(a: AtexitACallback): CInt

public expect fun atQuickExit(a: AtexitACallback): CInt

public expect fun quickExit(a: CInt): Nothing

public expect fun posixMemalign(a: MutPtr, b: SizeT, c: SizeT): CInt

public expect fun randR(a: MutPtr): CInt

public expect fun random(): CLong

public expect fun srandom(a: CUint)

public expect fun putenv(a: MutPtr): CInt

public expect fun clock(): ClockT

public expect fun time(a: MutPtr): TimeT

public expect fun difftime(a: TimeT, b: TimeT): CDouble

public expect fun mktime(a: MutPtr): TimeT

public expect fun strftime(a: MutPtr, b: SizeT, c: ConstPtr, d: ConstPtr): SizeT

public expect fun gmtime(a: ConstPtr): MutPtr

public expect fun gmtimeR(a: ConstPtr, b: MutPtr): MutPtr

public expect fun localtime(a: ConstPtr): MutPtr

public expect fun localtimeR(a: ConstPtr, b: MutPtr): MutPtr

public expect fun asctimeR(a: ConstPtr, b: MutPtr): MutPtr

public expect fun ctimeR(a: ConstPtr, b: MutPtr): MutPtr

public expect val CLOCK_MONOTONIC1: UByte

public expect val CLOCK_REALTIME1: UByte

public expect fun nanosleep(a: ConstPtr, b: MutPtr): CInt

public expect fun clockGetres(a: ClockidT, b: MutPtr): CInt

public expect fun clockGettime(a: ClockidT, b: MutPtr): CInt

public expect fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr, c: MutPtr): CInt

public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

public expect fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr, buf: MutPtr)

public expect fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr

public expect fun atof(s: ConstPtr): CDouble

public expect fun atoi(s: ConstPtr): CInt

public expect fun atol(s: ConstPtr): CLong

public expect fun atoll(s: ConstPtr): CLonglong

public expect fun strtod(s: ConstPtr, endp: MutPtr): CDouble

public expect fun strtof(s: ConstPtr, endp: MutPtr): CFloat

public expect fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong

public expect fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong

public expect fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun strcat(s: MutPtr, ct: ConstPtr): MutPtr

public expect fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr

public expect fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt

public expect fun strchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strrchr(cs: ConstPtr, c: CInt): MutPtr

public expect fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT

public expect fun strdup(cs: ConstPtr): MutPtr

public expect fun strndup(cs: ConstPtr, n: SizeT): MutPtr

public expect fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr

public expect fun strtok(s: MutPtr, t: ConstPtr): MutPtr

public expect fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

public expect fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr): CInt

public expect fun mkdir(path: ConstPtr, mode: ModeT): CInt

public expect fun stat(path: ConstPtr, buf: MutPtr): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr): MutPtr

public expect fun fileno(stream: MutPtr): CInt

public expect fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: ConstPtr): MutPtr

public expect fun fdopendir(fd: CInt): MutPtr

public expect fun readdir(dirp: MutPtr): MutPtr

public expect fun closedir(dirp: MutPtr): CInt

public expect fun rewinddir(dirp: MutPtr)

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt

public expect fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt

public expect fun access(path: ConstPtr, amode: CInt): CInt

public expect fun close(fd: CInt): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: ConstPtr, dst: ConstPtr): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: ConstPtr, name: CInt): CLong

public expect fun rmdir(path: ConstPtr): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun unlink(c: ConstPtr): CInt

public expect fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT

public expect fun lstat(path: ConstPtr, buf: MutPtr): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun symlink(path1: ConstPtr, path2: ConstPtr): CInt

public expect fun truncate(path: ConstPtr, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun getrusage(resource: CInt, usage: MutPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun times(buf: MutPtr): ClockT

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT

public expect fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun localeconv(): MutPtr

public expect fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): SsizeT

public expect fun timegm(tm: MutPtr): TimeT

public expect fun sysconf(name: CInt): CLong

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr): OffT

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun schedYield(): CInt

public expect fun getcwd(buf: MutPtr, size: SizeT): MutPtr

public expect fun chdir(dir: ConstPtr): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr

public expect fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: ConstPtr): CInt

public expect fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr): CInt

public expect fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt

public expect fun wasilibcUnlinkat(fd: CInt, path: ConstPtr): CInt

public expect fun wasilibcRmdirat(fd: CInt, path: ConstPtr): CInt

public expect fun wasilibcFindRelpath(path: ConstPtr, absPrefix: MutPtr, relativePath: MutPtr, relativePathLen: ULong): CInt

public expect fun wasilibcTell(fd: CInt): OffT

public expect fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr): CInt

public expect fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr): CInt

public expect fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun wasilibcNocwdSymlinkat(target: ConstPtr, dirfd: CInt, path: ConstPtr): CInt

public expect fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr, buf: MutPtr, bufsize: ULong): Long

public expect fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt

public expect fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr, flags: CInt): CInt

public expect fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr): CInt

public expect fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flags: CInt): CInt

public expect fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr): MutPtr

public expect fun wasilibcAccess(pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun wasilibcStat(pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun wasilibcUtimens(pathname: ConstPtr, times: ConstPtr, flags: CInt): CInt

public expect fun wasilibcLink(oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt

public expect fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt

public expect fun wasilibcLinkNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr): CInt

public expect fun wasilibcRenameNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(a: MutPtr, b: SizeT)

public expect fun arc4randomUniform(a: UInt): UInt

public expect fun errnoLocation(): MutPtr

public expect fun chmod(path: ConstPtr, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: MutPtr): CInt

public expect fun pthreadAttrInit(attr: MutPtr): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt

public expect fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr): CInt

public expect fun pthreadMutexLock(lock: MutPtr): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt

public expect fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadCondSignal(cond: MutPtr): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr): CInt

public expect fun pthreadCondDestroy(cond: MutPtr): CInt

public expect fun pthreadCondattrInit(attr: MutPtr): CInt

public expect fun pthreadCondattrDestroy(attr: MutPtr): CInt

public expect fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt

public expect fun pthreadRwlockDestroy(lock: MutPtr): CInt

public expect fun pthreadRwlockRdlock(lock: MutPtr): CInt

public expect fun pthreadRwlockTryrdlock(lock: MutPtr): CInt

public expect fun pthreadRwlockWrlock(lock: MutPtr): CInt

public expect fun pthreadRwlockTrywrlock(lock: MutPtr): CInt

public expect fun pthreadRwlockUnlock(lock: MutPtr): CInt

public expect fun pthreadRwlockattrInit(attr: MutPtr): CInt

public expect fun pthreadRwlockattrDestroy(attr: MutPtr): CInt
