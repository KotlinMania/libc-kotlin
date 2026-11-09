@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT

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

public actual fun fopen(filename: String?, mode: String?): FILE? =
    null

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    null

public actual fun fflush(file: FILE?): CInt =
    0

public actual fun fclose(file: FILE?): CInt =
    0

public actual fun remove(filename: String?): CInt =
    0

public actual fun rename(oldname: String?, newname: String?): CInt =
    0

public actual fun tmpfile(): FILE? =
    null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
}

public actual fun getchar(): CInt =
    0

public actual fun putchar(c: CInt): CInt =
    0

public actual fun fgetc(stream: FILE?): CInt =
    0

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    null

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fputs(s: String?, stream: FILE?): CInt =
    0

public actual fun puts(s: String?): CInt =
    0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    0uL

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    0

public actual fun ftell(stream: FILE?): CLong =
    0L

public actual fun rewind(stream: FILE?) {
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    0

public actual fun feof(stream: FILE?): CInt =
    0

public actual fun ferror(stream: FILE?): CInt =
    0

public actual fun perror(s: String?) {
}

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

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun free(p: COpaquePointer?) {
}

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun exit(status: CInt): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    0

public actual fun system(s: String?): CInt =
    0

public actual fun getenv(s: String?): COpaquePointer? =
    null

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    0u

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    0

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    0

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    0

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

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    0uL

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    0uL

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun times(buf: COpaquePointer?): ClockT =
    0L

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    0

public actual fun pclose(stream: FILE?): CInt =
    0

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    null

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    0

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun getprotobyname(name: String?): COpaquePointer? =
    null

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    null

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    null

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    0

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

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    null

public actual fun fileno(stream: FILE?): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    0

public actual fun rewinddir(dirp: DIR?) {
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    0

public actual fun access(path: String?, amode: CInt): CInt =
    0

public actual fun alarm(seconds: CUint): CUint =
    0u

public actual fun fchdir(dirfd: CInt): CInt =
    0

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    0

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    0L

public actual fun getegid(): GidT =
    0u

public actual fun geteuid(): UidT =
    0u

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    0

public actual fun getlogin(): COpaquePointer? =
    null

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    0

public actual fun pathconf(path: String?, name: CInt): CLong =
    0L

public actual fun pause(): CInt =
    0

public actual fun seteuid(uid: UidT): CInt =
    0

public actual fun setegid(gid: GidT): CInt =
    0

public actual fun sleep(secs: CUint): CUint =
    0u

public actual fun ttyname(fd: CInt): COpaquePointer? =
    null

public actual fun wait(status: COpaquePointer?): PidT =
    0

public actual fun umask(mask: ModeT): ModeT =
    0

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun mlockall(flags: CInt): CInt =
    0

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun munlockall(): CInt =
    0

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun truncate(path: String?, length: OffT): CInt =
    0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun pthreadExit(value: COpaquePointer?): Nothing =
    error("Unreachable noreturn C function pthreadExit")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    0

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    0

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    null

public actual fun dlerror(): COpaquePointer? =
    null

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    null

public actual fun dlclose(handle: COpaquePointer?): CInt =
    0

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun mktime(tm: COpaquePointer?): TimeT =
    0L

public actual fun time(time: COpaquePointer?): TimeT =
    0L

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    null

public actual fun timegm(tm: COpaquePointer?): TimeT =
    0L

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    0.0

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun usleep(secs: UsecondsT): CInt =
    0

public actual fun putenv(string: COpaquePointer?): CInt =
    0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    null

public actual fun localeconv(): COpaquePointer? =
    null

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun sigpending(set: COpaquePointer?): CInt =
    0

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    0

public actual fun ftello(stream: FILE?): OffT =
    0L

public actual fun mkstemp(template: COpaquePointer?): CInt =
    0

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    null

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
}

public actual fun closelog() {
}

public actual fun setlogmask(maskpri: CInt): CInt =
    0

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
}

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    0L

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    0

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    0

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    0

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    0uL

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    0

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    0

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    0

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    0

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    null

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun chdir(attr: String?): CInt =
    0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt =
    0

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    0

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    0

public actual fun pthreadAttrDestroy(thread: COpaquePointer?): CInt =
    0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    0

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    0

public actual fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    0

public actual fun readdir(pDir: DIR?): COpaquePointer? =
    null

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    0

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt =
    0

public actual fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    0

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    null

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt =
    0

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    0

public actual fun pthreadSelf(): PthreadT =
    0uL

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    0

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    0

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    0

public actual fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt =
    0

public actual fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt =
    0

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    0

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    0

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    0

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    0L

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT =
    0L

public actual fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    0L

public actual fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    0L

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    0

public actual fun shutdown(s: CInt, how: CInt): CInt =
    0

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    null

public actual fun close(fd: CInt): CInt =
    0

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun isatty(fd: CInt): CInt =
    0

public actual fun dup(src: CInt): CInt =
    0

public actual fun dup2(src: CInt, dst: CInt): CInt =
    0

public actual fun pipe(fds: COpaquePointer?): CInt =
    0

public actual fun unlink(pathname: String?): CInt =
    0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    0L

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    0

public actual fun freeaddrinfo(res: COpaquePointer?) {
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    0uL

public actual fun getpid(): PidT =
    0

public actual fun getppid(): PidT =
    0

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    0

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    0

public actual fun sysconf(attr: CInt): CLong =
    0L

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    0

public actual fun unsetenv(envVarName: String?): CInt =
    0

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    null

public actual fun link(src: String?, dst: String?): CInt =
    0

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    0L

public actual fun symlink(path1: String?, path2: String?): CInt =
    0

public actual fun opendir(name: String?): DIR? =
    null

public actual fun rmdir(path: String?): CInt =
    0

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    0

public actual fun chmod(path: String?, mode: ModeT): CInt =
    0

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    0

public actual fun fsync(fd: CInt): CInt =
    0

public actual fun closedir(ptr: DIR?): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    0

public actual fun schedYield(): CInt =
    0

public actual fun errnoSet(err: CInt): CInt =
    0

public actual fun errnoGet(): CInt =
    0

public actual fun setgid(gid: GidT): CInt =
    0

public actual fun getgid(): GidT =
    0u

public actual fun setuid(uid: UidT): CInt =
    0

public actual fun getuid(): UidT =
    0u

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    0

public actual fun sigfillset(set: COpaquePointer?): CInt =
    0

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    0

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    0

public actual fun kill(pid: PidT, signo: CInt): CInt =
    0

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    0

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    0

public actual fun raise(signo: CInt): CInt =
    0

public actual fun taskIdSelf(): TaskId =
    0

public actual fun taskDelay(ticks: VxTicksT): CInt =
    0

public actual fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt =
    0

public actual fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    0

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt =
    0

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    0

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    0

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    0

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    0

public actual fun randSecure(): CInt =
    0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    0

public actual fun mqUnlink(name: String?): CInt =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    0L

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    0

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    0

public actual fun vxCpuEnabledGet(): CpusetT =
    0u

public actual fun vxCpuConfiguredGet(): CpusetT =
    0u
