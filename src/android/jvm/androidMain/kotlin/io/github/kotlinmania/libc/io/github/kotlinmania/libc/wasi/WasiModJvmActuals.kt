package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer

internal object WasiModRawLibc {
    external fun exit(code: Int): Long
    external fun abort(): Long
    external fun alignedAlloc(a: Long, b: Long): Long?
    external fun calloc(amt: Long, amt2: Long): Long?
    external fun free(ptr: Long)
    external fun getenv(s: String?): Long?
    external fun malloc(amt: Long): Long?
    external fun mallocUsableSize(ptr: Long): Long
    external fun sbrk(increment: Long): Long?
    external fun rand(): Int
    external fun read(fd: Int, ptr: Long, size: Long): Long
    external fun realloc(ptr: Long, amt: Long): Long?
    external fun setenv(k: String?, v: String?, a: Int): Int
    external fun unsetenv(k: String?): Int
    external fun clearenv(): Int
    external fun write(fd: Int, ptr: Long, size: Long): Long
    external fun fopen(a: String?, b: String?): Long?
    external fun freopen(a: String?, b: String?, f: Long): Long?
    external fun fclose(f: Long): Int
    external fun remove(a: String?): Int
    external fun rename(a: String?, b: String?): Int
    external fun feof(f: Long): Int
    external fun ferror(f: Long): Int
    external fun fflush(f: Long): Int
    external fun clearerr(f: Long)
    external fun fseek(f: Long, b: Long, c: Int): Int
    external fun ftell(f: Long): Long
    external fun rewind(f: Long)
    external fun fgetpos(f: Long, pos: Long): Int
    external fun fsetpos(f: Long, pos: Long): Int
    external fun fread(buf: Long, a: Long, b: Long, f: Long): Long
    external fun fwrite(buf: Long, a: Long, b: Long, f: Long): Long
    external fun fgetc(f: Long): Int
    external fun getc(f: Long): Int
    external fun getchar(): Int
    external fun ungetc(a: Int, f: Long): Int
    external fun fputc(a: Int, f: Long): Int
    external fun putc(a: Int, f: Long): Int
    external fun putchar(a: Int): Int
    external fun fputs(a: String?, f: Long): Int
    external fun puts(a: String?): Int
    external fun perror(a: String?)
    external fun srand(a: Int)
    external fun atexit(a: Long): Int
    external fun atQuickExit(a: Long): Int
    external fun quickExit(a: Int): Long
    external fun posixMemalign(a: Long, b: Long, c: Long): Int
    external fun randR(a: Long): Int
    external fun random(): Long
    external fun srandom(a: Int)
    external fun putenv(a: Long): Int
    external fun clock(): Long
    external fun time(a: Long): Long
    external fun difftime(a: Long, b: Long): Double
    external fun mktime(a: Long): Long
    external fun strftime(a: Long, b: Long, c: String?, d: Long): Long
    external fun gmtime(a: Long): Long?
    external fun gmtimeR(a: Long, b: Long): Long?
    external fun localtime(a: Long): Long?
    external fun localtimeR(a: Long, b: Long): Long?
    external fun asctimeR(a: Long, b: Long): Long?
    external fun ctimeR(a: Long, b: Long): Long?
    external fun nanosleep(a: Long, b: Long): Int
    external fun clockGetres(a: Int, b: Long): Int
    external fun clockGettime(a: Int, b: Long): Int
    external fun clockNanosleep(a: Int, a2: Int, b: Long, c: Long): Int
    external fun isalnum(c: Int): Int
    external fun isalpha(c: Int): Int
    external fun iscntrl(c: Int): Int
    external fun isdigit(c: Int): Int
    external fun isgraph(c: Int): Int
    external fun islower(c: Int): Int
    external fun isprint(c: Int): Int
    external fun ispunct(c: Int): Int
    external fun isspace(c: Int): Int
    external fun isupper(c: Int): Int
    external fun isxdigit(c: Int): Int
    external fun isblank(c: Int): Int
    external fun tolower(c: Int): Int
    external fun toupper(c: Int): Int
    external fun setvbuf(stream: Long, buffer: Long, mode: Int, size: Long): Int
    external fun setbuf(stream: Long, buf: Long)
    external fun fgets(buf: Long, n: Int, stream: Long): Long?
    external fun atof(s: String?): Double
    external fun atoi(s: String?): Int
    external fun atol(s: String?): Long
    external fun atoll(s: String?): Long
    external fun strtod(s: String?, endp: Long): Double
    external fun strtof(s: String?, endp: Long): Float
    external fun strtol(s: String?, endp: Long, base: Int): Long
    external fun strtoll(s: String?, endp: Long, base: Int): Long
    external fun strtoul(s: String?, endp: Long, base: Int): Long
    external fun strtoull(s: String?, endp: Long, base: Int): Long
    external fun strcpy(dst: Long, src: String?): Long?
    external fun strncpy(dst: Long, src: String?, n: Long): Long?
    external fun strcat(s: Long, ct: String?): Long?
    external fun strncat(s: Long, ct: String?, n: Long): Long?
    external fun strcmp(cs: String?, ct: String?): Int
    external fun strncmp(cs: String?, ct: String?, n: Long): Int
    external fun strcoll(cs: String?, ct: String?): Int
    external fun strchr(cs: String?, c: Int): Long?
    external fun strrchr(cs: String?, c: Int): Long?
    external fun strspn(cs: String?, ct: String?): Long
    external fun strcspn(cs: String?, ct: String?): Long
    external fun strdup(cs: String?): Long?
    external fun strndup(cs: String?, n: Long): Long?
    external fun strpbrk(cs: String?, ct: String?): Long?
    external fun strstr(cs: String?, ct: String?): Long?
    external fun strcasecmp(s1: String?, s2: String?): Int
    external fun strncasecmp(s1: String?, s2: String?, n: Long): Int
    external fun strlen(cs: String?): Long
    external fun strnlen(cs: String?, maxlen: Long): Long
    external fun strerror(n: Int): Long?
    external fun strtok(s: Long, t: String?): Long?
    external fun strxfrm(s: Long, ct: String?, n: Long): Long
    external fun memchr(cx: Long, c: Int, n: Long): Long?
    external fun memcmp(cx: Long, ct: Long, n: Long): Int
    external fun memcpy(dest: Long, src: Long, n: Long): Long?
    external fun memmove(dest: Long, src: Long, n: Long): Long?
    external fun memset(dest: Long, c: Int, n: Long): Long?
    external fun getcharUnlocked(): Int
    external fun putcharUnlocked(c: Int): Int
    external fun shutdown(socket: Int, how: Int): Int
    external fun fstat(fildes: Int, buf: Long): Int
    external fun mkdir(path: String?, mode: Int): Int
    external fun stat(path: String?, buf: Long): Int
    external fun fdopen(fd: Int, mode: String?): Long?
    external fun fileno(stream: Long): Int
    external fun creat(path: String?, mode: Int): Int
    external fun opendir(dirname: String?): Long?
    external fun fdopendir(fd: Int): Long?
    external fun readdir(dirp: Long): Long?
    external fun closedir(dirp: Long): Int
    external fun rewinddir(dirp: Long)
    external fun dirfd(dirp: Long): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun fstatat(dirfd: Int, pathname: String?, buf: Long, flags: Int): Int
    external fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun mkdirat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun readlinkat(dirfd: Int, pathname: String?, buf: Long, bufsiz: Long): Long
    external fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
    external fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
    external fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
    external fun access(path: String?, amode: Int): Int
    external fun close(fd: Int): Int
    external fun fpathconf(filedes: Int, name: Int): Long
    external fun getopt(argc: Int, argv: Long, optstr: String?): Int
    external fun isatty(fd: Int): Int
    external fun link(src: String?, dst: String?): Int
    external fun lseek(fd: Int, offset: Long, whence: Int): Long
    external fun pathconf(path: String?, name: Int): Long
    external fun rmdir(path: String?): Int
    external fun sleep(secs: Int): Int
    external fun unlink(c: String?): Int
    external fun pread(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwrite(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun lstat(path: String?, buf: Long): Int
    external fun fsync(fd: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun symlink(path1: String?, path2: String?): Int
    external fun truncate(path: String?, length: Long): Int
    external fun ftruncate(fd: Int, length: Long): Int
    external fun getrusage(resource: Int, usage: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun times(buf: Long): Long
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun usleep(secs: Int): Int
    external fun send(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun recv(socket: Int, buf: Long, len: Long, flags: Int): Long
    external fun poll(fds: Long, nfds: Long, timeout: Int): Int
    external fun setlocale(category: Int, locale: String?): Long?
    external fun localeconv(): Long?
    external fun readlink(path: String?, buf: Long, bufsz: Long): Long
    external fun timegm(tm: Long): Long
    external fun sysconf(name: Int): Long
    external fun fseeko(stream: Long, offset: Long, whence: Int): Int
    external fun ftello(stream: Long): Long
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun strcasestr(cs: String?, ct: String?): Long?
    external fun getline(lineptr: Long, n: Long, stream: Long): Long
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun schedYield(): Int
    external fun getcwd(buf: Long, size: Long): Long?
    external fun chdir(dir: String?): Int
    external fun nlLanginfo(item: Long): Long?
    external fun nlLanginfoL(item: Long, loc: Long): Long?
    external fun select(nfds: Int, readfds: Long, writefds: Long, errorfds: Long, timeout: Long): Int
    external fun wasilibcRegisterPreopenedFd(fd: Int, path: String?): Int
    external fun wasilibcFdRenumber(fd: Int, newfd: Int): Int
    external fun wasilibcUnlinkat(fd: Int, path: String?): Int
    external fun wasilibcRmdirat(fd: Int, path: String?): Int
    external fun wasilibcFindRelpath(path: String?, absPrefix: Long, relativePath: Long, relativePathLen: Long): Int
    external fun wasilibcTell(fd: Int): Long
    external fun wasilibcNocwdWasilibcUnlinkat(dirfd: Int, path: String?): Int
    external fun wasilibcNocwdWasilibcRmdirat(dirfd: Int, path: String?): Int
    external fun wasilibcNocwdLinkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun wasilibcNocwdSymlinkat(target: String?, dirfd: Int, path: String?): Int
    external fun wasilibcNocwdReadlinkat(dirfd: Int, path: String?, buf: Long, bufsize: Long): Long
    external fun wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int
    external fun wasilibcNocwdRenameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
    external fun wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int
    external fun wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Long, flags: Int): Int
    external fun wasilibcNocwdMkdiratNomode(dirfd: Int, path: String?): Int
    external fun wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Long, flags: Int): Int
    external fun wasilibcNocwdOpendirat(dirfd: Int, path: String?): Long?
    external fun wasilibcAccess(pathname: String?, mode: Int, flags: Int): Int
    external fun wasilibcStat(pathname: String?, buf: Long, flags: Int): Int
    external fun wasilibcUtimens(pathname: String?, times: Long, flags: Int): Int
    external fun wasilibcLink(oldpath: String?, newpath: String?, flags: Int): Int
    external fun wasilibcLinkOldat(olddirfd: Int, oldpath: String?, newpath: String?, flags: Int): Int
    external fun wasilibcLinkNewat(oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
    external fun wasilibcRenameOldat(olddirfd: Int, oldpath: String?, newpath: String?): Int
    external fun wasilibcRenameNewat(oldpath: String?, newdirfd: Int, newpath: String?): Int
    external fun arc4random(): Int
    external fun arc4randomBuf(a: Long, b: Long)
    external fun arc4randomUniform(a: Int): Int
    external fun errnoLocation(): Long?
    external fun chmod(path: String?, mode: Int): Int
    external fun fchmod(fd: Int, mode: Int): Int
    external fun realpath(pathname: String?, resolved: Long): Long?
    external fun pthreadSelf(): Long
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadEqual(t1: Long, t2: Long): Int
    external fun pthreadJoin(native: Long, value: Long): Int
    external fun pthreadAttrInit(attr: Long): Int
    external fun pthreadAttrDestroy(attr: Long): Int
    external fun pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstacksize(attr: Long, stackSize: Long): Int
    external fun pthreadAttrSetdetachstate(attr: Long, state: Int): Int
    external fun pthreadDetach(thread: Long): Int
    external fun pthreadKeyCreate(key: Long, dtor: Long): Int
    external fun pthreadKeyDelete(key: Long): Int
    external fun pthreadGetspecific(key: Long): Long?
    external fun pthreadSetspecific(key: Long, value: Long): Int
    external fun pthreadMutexInit(lock: Long, attr: Long): Int
    external fun pthreadMutexDestroy(lock: Long): Int
    external fun pthreadMutexLock(lock: Long): Int
    external fun pthreadMutexTrylock(lock: Long): Int
    external fun pthreadMutexUnlock(lock: Long): Int
    external fun pthreadMutexattrInit(attr: Long): Int
    external fun pthreadMutexattrDestroy(attr: Long): Int
    external fun pthreadMutexattrSettype(attr: Long, type: Int): Int
    external fun pthreadCondInit(cond: Long, attr: Long): Int
    external fun pthreadCondWait(cond: Long, lock: Long): Int
    external fun pthreadCondTimedwait(cond: Long, lock: Long, abstime: Long): Int
    external fun pthreadCondSignal(cond: Long): Int
    external fun pthreadCondBroadcast(cond: Long): Int
    external fun pthreadCondDestroy(cond: Long): Int
    external fun pthreadCondattrInit(attr: Long): Int
    external fun pthreadCondattrDestroy(attr: Long): Int
    external fun pthreadRwlockInit(lock: Long, attr: Long): Int
    external fun pthreadRwlockDestroy(lock: Long): Int
    external fun pthreadRwlockRdlock(lock: Long): Int
    external fun pthreadRwlockTryrdlock(lock: Long): Int
    external fun pthreadRwlockWrlock(lock: Long): Int
    external fun pthreadRwlockTrywrlock(lock: Long): Int
    external fun pthreadRwlockUnlock(lock: Long): Int
    external fun pthreadRwlockattrInit(attr: Long): Int
    external fun pthreadRwlockattrDestroy(attr: Long): Int
}

public actual fun exit(code: CInt): Nothing =
    WasiModRawLibc.exit(code)

public actual fun abort(): Nothing =
    WasiModRawLibc.abort()

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    WasiModRawLibc.alignedAlloc(a, b).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    WasiModRawLibc.calloc(amt, amt2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(ptr: COpaquePointer?) {
    WasiModRawLibc.free(ptr?.value ?: 0L)
}

public actual fun getenv(s: String?): COpaquePointer? =
    WasiModRawLibc.getenv(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    WasiModRawLibc.malloc(amt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    WasiModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    WasiModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rand(): CInt =
    WasiModRawLibc.rand()

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    WasiModRawLibc.read(fd, ptr?.value ?: 0L, size)

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    WasiModRawLibc.realloc(ptr?.value ?: 0L, amt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    WasiModRawLibc.setenv(k, v, a)

public actual fun unsetenv(k: String?): CInt =
    WasiModRawLibc.unsetenv(k)

public actual fun clearenv(): CInt =
    WasiModRawLibc.clearenv()

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    WasiModRawLibc.write(fd, ptr?.value ?: 0L, size)

public actual fun fopen(a: String?, b: String?): FILE? =
    WasiModRawLibc.fopen(a, b)

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    WasiModRawLibc.freopen(a, b, f?.toLong() ?: 0L)

public actual fun fclose(f: FILE?): CInt =
    WasiModRawLibc.fclose(f?.toLong() ?: 0L)

public actual fun remove(a: String?): CInt =
    WasiModRawLibc.remove(a)

public actual fun rename(a: String?, b: String?): CInt =
    WasiModRawLibc.rename(a, b)

public actual fun feof(f: FILE?): CInt =
    WasiModRawLibc.feof(f?.toLong() ?: 0L)

public actual fun ferror(f: FILE?): CInt =
    WasiModRawLibc.ferror(f?.toLong() ?: 0L)

public actual fun fflush(f: FILE?): CInt =
    WasiModRawLibc.fflush(f?.toLong() ?: 0L)

public actual fun clearerr(f: FILE?) {
    WasiModRawLibc.clearerr(f?.toLong() ?: 0L)
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    WasiModRawLibc.fseek(f?.toLong() ?: 0L, b, c)

public actual fun ftell(f: FILE?): CLong =
    WasiModRawLibc.ftell(f?.toLong() ?: 0L)

public actual fun rewind(f: FILE?) {
    WasiModRawLibc.rewind(f?.toLong() ?: 0L)
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    WasiModRawLibc.fgetpos(f?.toLong() ?: 0L, pos?.toLong() ?: 0L)

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    WasiModRawLibc.fsetpos(f?.toLong() ?: 0L, pos?.toLong() ?: 0L)

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    WasiModRawLibc.fread(buf?.value ?: 0L, a, b, f?.toLong() ?: 0L)

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    WasiModRawLibc.fwrite(buf?.value ?: 0L, a, b, f?.toLong() ?: 0L)

public actual fun fgetc(f: FILE?): CInt =
    WasiModRawLibc.fgetc(f?.toLong() ?: 0L)

public actual fun getc(f: FILE?): CInt =
    WasiModRawLibc.getc(f?.toLong() ?: 0L)

public actual fun getchar(): CInt =
    WasiModRawLibc.getchar()

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    WasiModRawLibc.ungetc(a, f?.toLong() ?: 0L)

public actual fun fputc(a: CInt, f: FILE?): CInt =
    WasiModRawLibc.fputc(a, f?.toLong() ?: 0L)

public actual fun putc(a: CInt, f: FILE?): CInt =
    WasiModRawLibc.putc(a, f?.toLong() ?: 0L)

public actual fun putchar(a: CInt): CInt =
    WasiModRawLibc.putchar(a)

public actual fun fputs(a: String?, f: FILE?): CInt =
    WasiModRawLibc.fputs(a, f?.toLong() ?: 0L)

public actual fun puts(a: String?): CInt =
    WasiModRawLibc.puts(a)

public actual fun perror(a: String?) {
    WasiModRawLibc.perror(a)
}

public actual fun srand(a: CUint) {
    WasiModRawLibc.srand(a)
}

public actual fun atexit(a: AtexitACallback): CInt =
    WasiModRawLibc.atexit(a)

public actual fun atQuickExit(a: AtexitACallback): CInt =
    WasiModRawLibc.atQuickExit(a)

public actual fun quickExit(a: CInt): Nothing =
    WasiModRawLibc.quickExit(a)

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    WasiModRawLibc.posixMemalign(a?.value ?: 0L, b, c)

public actual fun randR(a: CUint?): CInt =
    WasiModRawLibc.randR(a?.toLong() ?: 0L)

public actual fun random(): CLong =
    WasiModRawLibc.random()

public actual fun srandom(a: CUint) {
    WasiModRawLibc.srandom(a)
}

public actual fun putenv(a: COpaquePointer?): CInt =
    WasiModRawLibc.putenv(a?.value ?: 0L)

public actual fun clock(): ClockT =
    WasiModRawLibc.clock()

public actual fun time(a: CLonglong?): TimeT =
    WasiModRawLibc.time(a?.toLong() ?: 0L)

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    WasiModRawLibc.difftime(a, b)

public actual fun mktime(a: Tm?): TimeT =
    WasiModRawLibc.mktime(a?.toLong() ?: 0L)

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: Tm?): SizeT =
    WasiModRawLibc.strftime(a?.value ?: 0L, b, c, d?.toLong() ?: 0L)

public actual fun gmtime(a: CLonglong?): Tm? =
    WasiModRawLibc.gmtime(a?.toLong() ?: 0L)

public actual fun gmtimeR(a: CLonglong?, b: Tm?): Tm? =
    WasiModRawLibc.gmtimeR(a?.toLong() ?: 0L, b?.toLong() ?: 0L)

public actual fun localtime(a: CLonglong?): Tm? =
    WasiModRawLibc.localtime(a?.toLong() ?: 0L)

public actual fun localtimeR(a: CLonglong?, b: Tm?): Tm? =
    WasiModRawLibc.localtimeR(a?.toLong() ?: 0L, b?.toLong() ?: 0L)

public actual fun asctimeR(a: Tm?, b: COpaquePointer?): COpaquePointer? =
    WasiModRawLibc.asctimeR(a?.toLong() ?: 0L, b?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(a: CLonglong?, b: COpaquePointer?): COpaquePointer? =
    WasiModRawLibc.ctimeR(a?.toLong() ?: 0L, b?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    WasiModRawLibc.nanosleep(a?.toLong() ?: 0L, b?.toLong() ?: 0L)

public actual fun clockGetres(a: ClockidT, b: Timespec?): CInt =
    WasiModRawLibc.clockGetres(a, b?.toLong() ?: 0L)

public actual fun clockGettime(a: ClockidT, b: Timespec?): CInt =
    WasiModRawLibc.clockGettime(a, b?.toLong() ?: 0L)

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt =
    WasiModRawLibc.clockNanosleep(a, a2, b?.toLong() ?: 0L, c?.toLong() ?: 0L)

public actual fun isalnum(c: CInt): CInt =
    WasiModRawLibc.isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    WasiModRawLibc.isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    WasiModRawLibc.iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    WasiModRawLibc.isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    WasiModRawLibc.isgraph(c)

public actual fun islower(c: CInt): CInt =
    WasiModRawLibc.islower(c)

public actual fun isprint(c: CInt): CInt =
    WasiModRawLibc.isprint(c)

public actual fun ispunct(c: CInt): CInt =
    WasiModRawLibc.ispunct(c)

public actual fun isspace(c: CInt): CInt =
    WasiModRawLibc.isspace(c)

public actual fun isupper(c: CInt): CInt =
    WasiModRawLibc.isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    WasiModRawLibc.isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    WasiModRawLibc.isblank(c)

public actual fun tolower(c: CInt): CInt =
    WasiModRawLibc.tolower(c)

public actual fun toupper(c: CInt): CInt =
    WasiModRawLibc.toupper(c)

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    WasiModRawLibc.setvbuf(stream?.toLong() ?: 0L, buffer?.value ?: 0L, mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    WasiModRawLibc.setbuf(stream?.toLong() ?: 0L, buf?.value ?: 0L)
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    WasiModRawLibc.fgets(buf?.value ?: 0L, n, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun atof(s: String?): CDouble =
    WasiModRawLibc.atof(s)

public actual fun atoi(s: String?): CInt =
    WasiModRawLibc.atoi(s)

public actual fun atol(s: String?): CLong =
    WasiModRawLibc.atol(s)

public actual fun atoll(s: String?): CLonglong =
    WasiModRawLibc.atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    WasiModRawLibc.strtod(s, endp?.value ?: 0L)

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    WasiModRawLibc.strtof(s, endp?.value ?: 0L)

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    WasiModRawLibc.strtol(s, endp?.value ?: 0L, base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    WasiModRawLibc.strtoll(s, endp?.value ?: 0L, base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    WasiModRawLibc.strtoul(s, endp?.value ?: 0L, base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    WasiModRawLibc.strtoull(s, endp?.value ?: 0L, base)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    WasiModRawLibc.strcpy(dst?.value ?: 0L, src).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    WasiModRawLibc.strncpy(dst?.value ?: 0L, src, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    WasiModRawLibc.strcat(s?.value ?: 0L, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    WasiModRawLibc.strncat(s?.value ?: 0L, ct, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    WasiModRawLibc.strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    WasiModRawLibc.strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    WasiModRawLibc.strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    WasiModRawLibc.strchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    WasiModRawLibc.strrchr(cs, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    WasiModRawLibc.strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    WasiModRawLibc.strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    WasiModRawLibc.strdup(cs).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    WasiModRawLibc.strndup(cs, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    WasiModRawLibc.strpbrk(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    WasiModRawLibc.strstr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    WasiModRawLibc.strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    WasiModRawLibc.strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    WasiModRawLibc.strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    WasiModRawLibc.strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    WasiModRawLibc.strerror(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    WasiModRawLibc.strtok(s?.value ?: 0L, t).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    WasiModRawLibc.strxfrm(s?.value ?: 0L, ct, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiModRawLibc.memchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    WasiModRawLibc.memcmp(cx?.value ?: 0L, ct?.value ?: 0L, n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WasiModRawLibc.memcpy(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    WasiModRawLibc.memmove(dest?.value ?: 0L, src?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiModRawLibc.memset(dest?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getcharUnlocked(): CInt =
    WasiModRawLibc.getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    WasiModRawLibc.putcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    WasiModRawLibc.shutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    WasiModRawLibc.fstat(fildes, buf?.toLong() ?: 0L)

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    WasiModRawLibc.mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    WasiModRawLibc.stat(path, buf?.toLong() ?: 0L)

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    WasiModRawLibc.fdopen(fd, mode)

public actual fun fileno(stream: FILE?): CInt =
    WasiModRawLibc.fileno(stream?.toLong() ?: 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    WasiModRawLibc.creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    WasiModRawLibc.opendir(dirname)

public actual fun fdopendir(fd: CInt): DIR? =
    WasiModRawLibc.fdopendir(fd)

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    WasiModRawLibc.readdir(dirp?.toLong() ?: 0L)

public actual fun closedir(dirp: DIR?): CInt =
    WasiModRawLibc.closedir(dirp?.toLong() ?: 0L)

public actual fun rewinddir(dirp: DIR?) {
    WasiModRawLibc.rewinddir(dirp?.toLong() ?: 0L)
}

public actual fun dirfd(dirp: DIR?): CInt =
    WasiModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    WasiModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    WasiModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    WasiModRawLibc.fstatat(dirfd, pathname, buf?.toLong() ?: 0L, flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiModRawLibc.linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    WasiModRawLibc.mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    WasiModRawLibc.readlinkat(dirfd, pathname, buf?.value ?: 0L, bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiModRawLibc.renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    WasiModRawLibc.symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    WasiModRawLibc.unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    WasiModRawLibc.access(path, amode)

public actual fun close(fd: CInt): CInt =
    WasiModRawLibc.close(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    WasiModRawLibc.fpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    WasiModRawLibc.getopt(argc, argv?.value ?: 0L, optstr)

public actual fun isatty(fd: CInt): CInt =
    WasiModRawLibc.isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    WasiModRawLibc.link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    WasiModRawLibc.lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    WasiModRawLibc.pathconf(path, name)

public actual fun rmdir(path: String?): CInt =
    WasiModRawLibc.rmdir(path)

public actual fun sleep(secs: CUint): CUint =
    WasiModRawLibc.sleep(secs)

public actual fun unlink(c: String?): CInt =
    WasiModRawLibc.unlink(c)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    WasiModRawLibc.pread(fd, buf?.value ?: 0L, count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    WasiModRawLibc.pwrite(fd, buf?.value ?: 0L, count, offset)

public actual fun lstat(path: String?, buf: Stat?): CInt =
    WasiModRawLibc.lstat(path, buf?.toLong() ?: 0L)

public actual fun fsync(fd: CInt): CInt =
    WasiModRawLibc.fsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    WasiModRawLibc.fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): CInt =
    WasiModRawLibc.symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    WasiModRawLibc.truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    WasiModRawLibc.ftruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    WasiModRawLibc.getrusage(resource, usage?.toLong() ?: 0L)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    WasiModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    WasiModRawLibc.times(buf?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    WasiModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun usleep(secs: CUint): CInt =
    WasiModRawLibc.usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    WasiModRawLibc.send(socket, buf?.value ?: 0L, len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    WasiModRawLibc.recv(socket, buf?.value ?: 0L, len, flags)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    WasiModRawLibc.poll(fds?.toLong() ?: 0L, nfds, timeout)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    WasiModRawLibc.setlocale(category, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun localeconv(): Lconv? =
    WasiModRawLibc.localeconv()

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    WasiModRawLibc.readlink(path, buf?.value ?: 0L, bufsz)

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    WasiModRawLibc.timegm(tm?.toLong() ?: 0L)

public actual fun sysconf(name: CInt): CLong =
    WasiModRawLibc.sysconf(name)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    WasiModRawLibc.fseeko(stream?.toLong() ?: 0L, offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    WasiModRawLibc.ftello(stream?.toLong() ?: 0L)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    WasiModRawLibc.posixFallocate(fd, offset, len)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    WasiModRawLibc.strcasestr(cs, ct).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    WasiModRawLibc.getline(lineptr?.value ?: 0L, n?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    WasiModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    WasiModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    WasiModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    WasiModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    WasiModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    WasiModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    WasiModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    WasiModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    WasiModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    WasiModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    WasiModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    WasiModRawLibc.labs(i)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    WasiModRawLibc.duplocale(base)

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    WasiModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    WasiModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    WasiModRawLibc.uselocale(loc)

public actual fun schedYield(): CInt =
    WasiModRawLibc.schedYield()

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    WasiModRawLibc.getcwd(buf?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun chdir(dir: String?): CInt =
    WasiModRawLibc.chdir(dir)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    WasiModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    WasiModRawLibc.nlLanginfoL(item, loc).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    WasiModRawLibc.select(nfds, readfds?.toLong() ?: 0L, writefds?.toLong() ?: 0L, errorfds?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcRegisterPreopenedFd(fd, path)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    WasiModRawLibc.wasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcUnlinkat(fd, path)

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcRmdirat(fd, path)

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    WasiModRawLibc.wasilibcFindRelpath(path, absPrefix?.value ?: 0L, relativePath?.value ?: 0L, relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    WasiModRawLibc.wasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcNocwdWasilibcUnlinkat(dirfd, path)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcNocwdWasilibcRmdirat(dirfd, path)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcNocwdSymlinkat(target, dirfd, path)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    WasiModRawLibc.wasilibcNocwdReadlinkat(dirfd, path, buf?.value ?: 0L, bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    WasiModRawLibc.wasilibcNocwdFaccessat(dirfd, path, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiModRawLibc.wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcNocwdOpenatNomode(dirfd, path, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcNocwdFstatat(dirfd, path, buf?.toLong() ?: 0L, flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    WasiModRawLibc.wasilibcNocwdMkdiratNomode(dirfd, path)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcNocwdUtimensat(dirfd, path, times?.toLong() ?: 0L, flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    WasiModRawLibc.wasilibcNocwdOpendirat(dirfd, path)

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    WasiModRawLibc.wasilibcAccess(pathname, mode, flags)

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcStat(pathname, buf?.toLong() ?: 0L, flags)

public actual fun wasilibcUtimens(pathname: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcUtimens(pathname, times?.toLong() ?: 0L, flags)

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcLink(oldpath, newpath, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcLinkOldat(olddirfd, oldpath, newpath, flags)

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    WasiModRawLibc.wasilibcLinkNewat(oldpath, newdirfd, newpath, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    WasiModRawLibc.wasilibcRenameOldat(olddirfd, oldpath, newpath)

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    WasiModRawLibc.wasilibcRenameNewat(oldpath, newdirfd, newpath)

public actual fun arc4random(): UInt =
    WasiModRawLibc.arc4random()

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    WasiModRawLibc.arc4randomBuf(a?.value ?: 0L, b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    WasiModRawLibc.arc4randomUniform(a)

public actual fun errnoLocation(): CInt? =
    WasiModRawLibc.errnoLocation()

public actual fun chmod(path: String?, mode: ModeT): CInt =
    WasiModRawLibc.chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    WasiModRawLibc.fchmod(fd, mode)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    WasiModRawLibc.realpath(pathname, resolved?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSelf(): PthreadT =
    WasiModRawLibc.pthreadSelf()

public actual fun pthreadCreate(native: COpaquePointer?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    WasiModRawLibc.pthreadCreate(native?.value ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    WasiModRawLibc.pthreadEqual(t1, t2)

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    WasiModRawLibc.pthreadJoin(native, value?.value ?: 0L)

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    WasiModRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    WasiModRawLibc.pthreadAttrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    WasiModRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    WasiModRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stackSize)

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    WasiModRawLibc.pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    WasiModRawLibc.pthreadDetach(thread)

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    WasiModRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, dtor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    WasiModRawLibc.pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    WasiModRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    WasiModRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    WasiModRawLibc.pthreadMutexInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    WasiModRawLibc.pthreadMutexDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    WasiModRawLibc.pthreadMutexLock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    WasiModRawLibc.pthreadMutexTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    WasiModRawLibc.pthreadMutexUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    WasiModRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    WasiModRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    WasiModRawLibc.pthreadMutexattrSettype(attr?.toLong() ?: 0L, type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    WasiModRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    WasiModRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    WasiModRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    WasiModRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    WasiModRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    WasiModRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    WasiModRawLibc.pthreadCondattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    WasiModRawLibc.pthreadCondattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    WasiModRawLibc.pthreadRwlockInit(lock?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockRdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockTryrdlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockWrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockTrywrlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    WasiModRawLibc.pthreadRwlockUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    WasiModRawLibc.pthreadRwlockattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    WasiModRawLibc.pthreadRwlockattrDestroy(attr?.toLong() ?: 0L)
