package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AtexitACallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    val n = set1.nfds
    return ((set1.fds).slice(0 until n)).any({ p -> p == fd })
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    val n = set1.nfds
    if (!((set1.fds).slice(0 until n)).any { p -> p == fd }) {
        set1.nfds = n + 1
        set1.fds[n] = fd
        (FdSet.typeLayout()).writeNative((set).rawAddress, set1)
    }
}

public fun fdZero(set: MutPtr<FdSet>) {
    val set1 = (FdSet.typeLayout()).readNative((set).rawAddress)
    set1.nfds = 0
    (FdSet.typeLayout()).writeNative((set).rawAddress, set1)
    return
}

public expect fun exit(code: CInt): Nothing

public expect fun abort(): Nothing

public expect fun alignedAlloc(a: SizeT, b: SizeT): MutPtr<CVoid>

public expect fun calloc(amt: SizeT, amt2: SizeT): MutPtr<CVoid>

public expect fun free(ptr: MutPtr<CVoid>)

public expect fun getenv(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun malloc(amt: SizeT): MutPtr<CVoid>

public expect fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT

public expect fun sbrk(increment: IntptrT): MutPtr<CVoid>

public expect fun rand(): CInt

public expect fun read(fd: CInt, ptr: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun realloc(ptr: MutPtr<CVoid>, amt: SizeT): MutPtr<CVoid>

public expect fun setenv(k: ConstPtr<CChar>, v: ConstPtr<CChar>, a: CInt): CInt

public expect fun unsetenv(k: ConstPtr<CChar>): CInt

public expect fun clearenv(): CInt

public expect fun write(fd: CInt, ptr: ConstPtr<CVoid>, size: SizeT): SsizeT

public expect var ENVIRON: MutPtr<MutPtr<CChar>>

public expect fun fopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>, f: MutPtr<FILE>): MutPtr<FILE>

public expect fun fclose(f: MutPtr<FILE>): CInt

public expect fun remove(a: ConstPtr<CChar>): CInt

public expect fun rename(a: ConstPtr<CChar>, b: ConstPtr<CChar>): CInt

public expect fun feof(f: MutPtr<FILE>): CInt

public expect fun ferror(f: MutPtr<FILE>): CInt

public expect fun fflush(f: MutPtr<FILE>): CInt

public expect fun clearerr(f: MutPtr<FILE>)

public expect fun fseek(f: MutPtr<FILE>, b: CLong, c: CInt): CInt

public expect fun ftell(f: MutPtr<FILE>): CLong

public expect fun rewind(f: MutPtr<FILE>)

public expect fun fgetpos(f: MutPtr<FILE>, pos: MutPtr<FposT>): CInt

public expect fun fsetpos(f: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt

public expect fun fread(buf: MutPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT

public expect fun fwrite(buf: ConstPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT

public expect fun fgetc(f: MutPtr<FILE>): CInt

public expect fun getc(f: MutPtr<FILE>): CInt

public expect fun getchar(): CInt

public expect fun ungetc(a: CInt, f: MutPtr<FILE>): CInt

public expect fun fputc(a: CInt, f: MutPtr<FILE>): CInt

public expect fun putc(a: CInt, f: MutPtr<FILE>): CInt

public expect fun putchar(a: CInt): CInt

public expect fun fputs(a: ConstPtr<CChar>, f: MutPtr<FILE>): CInt

public expect fun puts(a: ConstPtr<CChar>): CInt

public expect fun perror(a: ConstPtr<CChar>)

public expect fun srand(a: CUint)

public expect fun atexit(a: AtexitACallback): CInt

public expect fun atQuickExit(a: AtexitACallback): CInt

public expect fun quickExit(a: CInt): Nothing

public expect fun posixMemalign(a: MutPtr<MutPtr<CVoid>>, b: SizeT, c: SizeT): CInt

public expect fun randR(a: MutPtr<CUint>): CInt

public expect fun random(): CLong

public expect fun srandom(a: CUint)

public expect fun putenv(a: MutPtr<CChar>): CInt

public expect fun clock(): ClockT

public expect fun time(a: MutPtr<TimeT>): TimeT

public expect fun difftime(a: TimeT, b: TimeT): CDouble

public expect fun mktime(a: MutPtr<Tm>): TimeT

public expect fun strftime(a: MutPtr<CChar>, b: SizeT, c: ConstPtr<CChar>, d: ConstPtr<Tm>): SizeT

public expect fun gmtime(a: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun gmtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm>

public expect fun localtime(a: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun localtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm>

public expect fun asctimeR(a: ConstPtr<Tm>, b: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctimeR(a: ConstPtr<TimeT>, b: MutPtr<CChar>): MutPtr<CChar>

public expect val CLOCK_MONOTONIC1: UByte

public expect val CLOCK_REALTIME1: UByte

public expect fun nanosleep(a: ConstPtr<Timespec>, b: MutPtr<Timespec>): CInt

public expect fun clockGetres(a: ClockidT, b: MutPtr<Timespec>): CInt

public expect fun clockGettime(a: ClockidT, b: MutPtr<Timespec>): CInt

public expect fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr<Timespec>, c: MutPtr<Timespec>): CInt

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

public expect fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>)

public expect fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun atof(s: ConstPtr<CChar>): CDouble

public expect fun atoi(s: ConstPtr<CChar>): CInt

public expect fun atol(s: ConstPtr<CChar>): CLong

public expect fun atoll(s: ConstPtr<CChar>): CLonglong

public expect fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble

public expect fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat

public expect fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong

public expect fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong

public expect fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong

public expect fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong

public expect fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt

public expect fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT

public expect fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar>

public expect fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt

public expect fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun fileno(stream: MutPtr<FILE>): CInt

public expect fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR>

public expect fun fdopendir(fd: CInt): MutPtr<DIR>

public expect fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent>

public expect fun closedir(dirp: MutPtr<DIR>): CInt

public expect fun rewinddir(dirp: MutPtr<DIR>)

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt

public expect fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt

public expect fun access(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun close(fd: CInt): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong

public expect fun rmdir(path: ConstPtr<CChar>): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun unlink(c: ConstPtr<CChar>): CInt

public expect fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT

public expect fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt

public expect fun truncate(path: ConstPtr<CChar>, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun times(buf: MutPtr<Tms>): ClockT

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar>

public expect fun localeconv(): MutPtr<Lconv>

public expect fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT

public expect fun timegm(tm: MutPtr<Tm>): TimeT

public expect fun sysconf(name: CInt): CLong

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr<FILE>): OffT

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun schedYield(): CInt

public expect fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar>

public expect fun chdir(dir: ConstPtr<CChar>): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar>

public expect fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): CInt

public expect fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt

public expect fun wasilibcUnlinkat(fd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcRmdirat(fd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcFindRelpath(path: ConstPtr<CChar>, absPrefix: MutPtr<ConstPtr<CChar>>, relativePath: MutPtr<MutPtr<CChar>>, relativePathLen: ULong): CInt

public expect fun wasilibcTell(fd: CInt): OffT

public expect fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun wasilibcNocwdSymlinkat(target: ConstPtr<CChar>, dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: ULong): Long

public expect fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt

public expect fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr<CChar>, flags: CInt): CInt

public expect fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt

public expect fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt

public expect fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr<CChar>): MutPtr<DIR>

public expect fun wasilibcAccess(pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun wasilibcStat(pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt

public expect fun wasilibcUtimens(pathname: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt

public expect fun wasilibcLink(oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun wasilibcLinkNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>): CInt

public expect fun wasilibcRenameNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(a: MutPtr<CVoid>, b: SizeT)

public expect fun arc4randomUniform(a: UInt): UInt

public expect fun errnoLocation(): MutPtr<CInt>

public expect fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar>

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid>

public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt

public expect fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt

public expect fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt

public expect fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt

public expect fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt

public expect fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt

public expect fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt

public expect fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt

public expect fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt
