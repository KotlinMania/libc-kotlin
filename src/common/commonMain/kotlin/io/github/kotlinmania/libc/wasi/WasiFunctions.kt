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

public fun interface AtexitACallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val set1 = set!!
    val n = set1.nfds
    return ((set1.fds).slice(0 until n)).any({ p -> p == fd })
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val set1 = set!!
    val n = set1.nfds
    if (!((set1.fds).slice(0 until n)).any({ p -> p == fd })) {
        set1.nfds = n + 1
        set1.fds[n] = fd
    }
}

public fun fdZero(set: FdSet?) {
    set!!.nfds = 0
    return
}

public expect fun exit(code: CInt): Nothing

public expect fun abort(): Nothing

public expect fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer?

public expect fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer?

public expect fun free(ptr: COpaquePointer?)

public expect fun getenv(s: String?): COpaquePointer?

public expect fun malloc(amt: SizeT): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun rand(): CInt

public expect fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT

public expect fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer?

public expect fun setenv(k: String?, v: String?, a: CInt): CInt

public expect fun unsetenv(k: String?): CInt

public expect fun clearenv(): CInt

public expect fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT

public expect var ENVIRON: COpaquePointer?

public expect fun fopen(a: String?, b: String?): FILE?

public expect fun freopen(a: String?, b: String?, f: FILE?): FILE?

public expect fun fclose(f: FILE?): CInt

public expect fun remove(a: String?): CInt

public expect fun rename(a: String?, b: String?): CInt

public expect fun feof(f: FILE?): CInt

public expect fun ferror(f: FILE?): CInt

public expect fun fflush(f: FILE?): CInt

public expect fun clearerr(f: FILE?)

public expect fun fseek(f: FILE?, b: CLong, c: CInt): CInt

public expect fun ftell(f: FILE?): CLong

public expect fun rewind(f: FILE?)

public expect fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt

public expect fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt

public expect fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT

public expect fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT

public expect fun fgetc(f: FILE?): CInt

public expect fun getc(f: FILE?): CInt

public expect fun getchar(): CInt

public expect fun ungetc(a: CInt, f: FILE?): CInt

public expect fun fputc(a: CInt, f: FILE?): CInt

public expect fun putc(a: CInt, f: FILE?): CInt

public expect fun putchar(a: CInt): CInt

public expect fun fputs(a: String?, f: FILE?): CInt

public expect fun puts(a: String?): CInt

public expect fun perror(a: String?)

public expect fun srand(a: CUint)

public expect fun atexit(a: AtexitACallback): CInt

public expect fun atQuickExit(a: AtexitACallback): CInt

public expect fun quickExit(a: CInt): Nothing

public expect fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt

public expect fun randR(a: COpaquePointer?): CInt

public expect fun random(): CLong

public expect fun srandom(a: CUint)

public expect fun putenv(a: COpaquePointer?): CInt

public expect fun clock(): ClockT

public expect fun time(a: COpaquePointer?): TimeT

public expect fun difftime(a: TimeT, b: TimeT): CDouble

public expect fun mktime(a: COpaquePointer?): TimeT

public expect fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT

public expect fun gmtime(a: COpaquePointer?): COpaquePointer?

public expect fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer?

public expect fun localtime(a: COpaquePointer?): COpaquePointer?

public expect fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer?

public expect fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer?

public expect val CLOCK_MONOTONIC1: UByte

public expect val CLOCK_REALTIME1: UByte

public expect fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt

public expect fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt

public expect fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt

public expect fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt

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

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer?

public expect fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: SizeT): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strrchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strspn(cs: String?, ct: String?): SizeT

public expect fun strcspn(cs: String?, ct: String?): SizeT

public expect fun strdup(cs: String?): COpaquePointer?

public expect fun strndup(cs: String?, n: SizeT): COpaquePointer?

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, maxlen: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun shutdown(socket: CInt, how: CInt): CInt

public expect fun fstat(fildes: CInt, buf: COpaquePointer?): CInt

public expect fun mkdir(path: String?, mode: ModeT): CInt

public expect fun stat(path: String?, buf: COpaquePointer?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun opendir(dirname: String?): DIR?

public expect fun fdopendir(fd: CInt): DIR?

public expect fun readdir(dirp: DIR?): COpaquePointer?

public expect fun closedir(dirp: DIR?): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun dirfd(dirp: DIR?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT

public expect fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun close(fd: CInt): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun isatty(fd: CInt): CInt

public expect fun link(src: String?, dst: String?): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun rmdir(path: String?): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun unlink(c: String?): CInt

public expect fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT

public expect fun lstat(path: String?, buf: COpaquePointer?): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun getrusage(resource: CInt, usage: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun times(buf: COpaquePointer?): ClockT

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun usleep(secs: CUint): CInt

public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): COpaquePointer?

public expect fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT

public expect fun timegm(tm: COpaquePointer?): TimeT

public expect fun sysconf(name: CInt): CLong

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun strcasestr(cs: String?, ct: String?): COpaquePointer?

public expect fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun schedYield(): CInt

public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun chdir(dir: String?): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer?

public expect fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt

public expect fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt

public expect fun wasilibcUnlinkat(fd: CInt, path: String?): CInt

public expect fun wasilibcRmdirat(fd: CInt, path: String?): CInt

public expect fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt

public expect fun wasilibcTell(fd: CInt): OffT

public expect fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long

public expect fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt

public expect fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt

public expect fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt

public expect fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR?

public expect fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt

public expect fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt

public expect fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt

public expect fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt

public expect fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(a: COpaquePointer?, b: SizeT)

public expect fun arc4randomUniform(a: UInt): UInt

public expect fun errnoLocation(): COpaquePointer?

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(fd: CInt, mode: ModeT): CInt

public expect fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer?

public expect fun pthreadSelf(): PthreadT

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

public expect fun pthreadAttrInit(attr: COpaquePointer?): CInt

public expect fun pthreadAttrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt

public expect fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadMutexDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadMutexLock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadMutexattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt

public expect fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt

public expect fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadCondSignal(cond: COpaquePointer?): CInt

public expect fun pthreadCondBroadcast(cond: COpaquePointer?): CInt

public expect fun pthreadCondDestroy(cond: COpaquePointer?): CInt

public expect fun pthreadCondattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt

public expect fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt
