package io.github.kotlinmania.libc.vxworks

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
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
public fun cmsgAlign(len: Int): Int = len + 8 - 1 and (8 - 1).inv()

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val next = ((cmsg).hashCode().toLong()).toInt() + cmsgAlign((cmsg!!.cmsgLen).toInt()) + cmsgAlign(8)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next <= max) {
        null
    } else {
        null
    }
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? =
    if ((mhdr!!.msgControllen).toInt() > 0) {
        null
    } else {
        null
    }

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? = COpaquePointer(((COpaquePointer((cmsg).hashCode().toLong()))).rawValue + (cmsgAlign(8)).toLong())

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(8)).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(8).toUInt() + length

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

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

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

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

public expect fun cfgetospeed(termios: COpaquePointer?): SpeedT

public expect fun cfmakeraw(termios: COpaquePointer?): CInt

public expect fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt

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

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, n: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun wcslen(buf: COpaquePointer?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer?

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun times(buf: COpaquePointer?): ClockT

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun mkdtemp(template: COpaquePointer?): COpaquePointer?

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

// netdb.h
public expect fun getprotobyname(name: String?): COpaquePointer?

public expect fun getprotobynumber(proto: CInt): COpaquePointer?

public expect fun getservbyname(name: String?, proto: String?): COpaquePointer?

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun stat(path: String?, buf: COpaquePointer?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt

public expect fun getlogin(): COpaquePointer?

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun pause(): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun wait(status: COpaquePointer?): PidT

public expect fun umask(mask: ModeT): ModeT

public expect fun mlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun sigaddset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt

public expect fun utimes(filename: String?, times: COpaquePointer?): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt

// time.h
public expect fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun mktime(tm: COpaquePointer?): TimeT

public expect fun time(time: COpaquePointer?): TimeT

public expect fun gmtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun localtime(timeP: COpaquePointer?): COpaquePointer?

public expect fun timegm(tm: COpaquePointer?): TimeT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): COpaquePointer?

public expect fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun sigpending(set: COpaquePointer?): CInt

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun mkstemp(template: COpaquePointer?): CInt

public expect fun tmpnam(ptr: COpaquePointer?): COpaquePointer?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long)

public expect fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt

public expect fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT

public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

// sys/stat.h
public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

// utime.h
public expect fun utime(file: String?, buf: COpaquePointer?): CInt

// stdlib.h
public expect fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer?

// ioLib.h
public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

// ioLib.h
public expect fun chdir(attr: String?): CInt

// pthread.h
public expect fun pthreadMutexattrInit(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt

// pthread.h
public expect fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexLock(mutex: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt

// pthread.h
public expect fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrInit(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt

// pthread.h
public expect fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt

// pthread.h
public expect fun pthreadAttrDestroy(thread: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadDetach(thread: PthreadT): CInt

// int pthreadAtfork (void (*)(void), void (*)(void), void (*)(void));
public expect fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt

// stat.h
public expect fun fstat(fildes: CInt, buf: COpaquePointer?): CInt

// stat.h
public expect fun lstat(path: String?, buf: COpaquePointer?): CInt

// unistd.h
public expect fun ftruncate(fd: CInt, length: OffT): CInt

// dirent.h
public expect fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt

// dirent.h
public expect fun readdir(pDir: DIR?): COpaquePointer?

// fcntl.h or
// ioLib.h
public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

// poll.h
public expect fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt

// pthread.h
public expect fun pthreadCondattrInit(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt

// pthread.h
public expect fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondDestroy(cond: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondSignal(cond: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondBroadcast(cond: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt

// pthread.h
public expect fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt

// pthread.h
public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

// pthread.h
public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

// pthread.h
public expect fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadSelf(): PthreadT

// clockLib.h
public expect fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt

// clockLib.h
public expect fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt

// clockLib.h
public expect fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt

// clockLib.h
public expect fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

// timerLib.h
public expect fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

// socket.h
public expect fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt

// socket.h
public expect fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt

// socket.h
public expect fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt

// socket.h
public expect fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt

// socket.h
public expect fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt

// socket.h
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt

// socket.h
public expect fun listen(socket: CInt, backlog: CInt): CInt

// socket.h
public expect fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT

// socket.h
public expect fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT

public expect fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT

// socket.h
public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT

// socket.h
public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT

// socket.h
public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

// socket.h
public expect fun shutdown(s: CInt, how: CInt): CInt

// socket.h
public expect fun socket(domain: CInt, type: CInt, protocol: CInt): CInt

// icotl.h
public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

// fcntl.h
public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

// ntpRfc2553.h for kernel
// netdb.h for user
public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

// ioLib.h or
// unistd.h
public expect fun close(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun isatty(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun dup(src: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun dup2(src: CInt, dst: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun pipe(fds: COpaquePointer?): CInt

// ioLib.h or
// unistd.h
public expect fun unlink(pathname: String?): CInt

// unistd.h and
// ioLib.h
public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

// netdb.h
public expect fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt

// netdb.h
public expect fun freeaddrinfo(res: COpaquePointer?)

// signal.h
public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

// unistd.h
public expect fun getpid(): PidT

// unistd.h
public expect fun getppid(): PidT

// unistd.h
public expect fun setpgid(pid: PidT, pgid: PidT): PidT

// wait.h
public expect fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT

// unistd.h
public expect fun sysconf(attr: CInt): CLong

// stdlib.h
public expect fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt

// stdlib.h
public expect fun unsetenv(envVarName: String?): CInt

// stdlib.h
public expect fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer?

// unistd.h
public expect fun link(src: String?, dst: String?): CInt

// unistd.h
public expect fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT

// unistd.h
public expect fun symlink(path1: String?, path2: String?): CInt

// dirent.h
public expect fun opendir(name: String?): DIR?

// unistd.h
public expect fun rmdir(path: String?): CInt

// stat.h
public expect fun mkdir(dirName: String?, mode: ModeT): CInt

// stat.h
public expect fun chmod(path: String?, mode: ModeT): CInt

// stat.h
public expect fun fchmod(attr1: CInt, attr2: ModeT): CInt

// unistd.h
public expect fun fsync(fd: CInt): CInt

// dirent.h
public expect fun closedir(ptr: DIR?): CInt

// sched.h
public expect fun schedGetPriorityMax(policy: CInt): CInt

// sched.h
public expect fun schedGetPriorityMin(policy: CInt): CInt

// sched.h
public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

// sched.h
public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

// sched.h
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

// sched.h
public expect fun schedGetscheduler(pid: PidT): CInt

// sched.h
public expect fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt

// sched.h
public expect fun schedYield(): CInt

// errnoLib.h
public expect fun errnoSet(err: CInt): CInt

// errnoLib.h
public expect fun errnoGet(): CInt

// unistd.h
public expect fun setgid(gid: GidT): CInt

// unistd.h
public expect fun getgid(): GidT

// unistd.h
public expect fun setuid(uid: UidT): CInt

// unistd.h
public expect fun getuid(): UidT

// signal.h
public expect fun sigemptyset(set: COpaquePointer?): CInt

public expect fun sigfillset(set: COpaquePointer?): CInt

public expect fun sigdelset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigismember(set: COpaquePointer?, signum: CInt): CInt

// pthread.h for kernel
// signal.h for user
public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt

// signal.h for user
public expect fun kill(pid: PidT, signo: CInt): CInt

// signal.h for user
public expect fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt

// signal.h
public expect fun taskKill(taskId: TaskId, signo: CInt): CInt

// signal.h
public expect fun raise(signo: CInt): CInt

// taskLibCommon.h
public expect fun taskIdSelf(): TaskId

public expect fun taskDelay(ticks: VxTicksT): CInt

// taskLib.h
public expect fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt

public expect fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt

// rtpLibCommon.h
public expect fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt

public expect fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId

// pathLib.h
public expect fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

// randomNumGen.h
public expect fun randBytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randABytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randUBytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randSecure(): CInt

// mqueue.h
public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

// vxCpuLib.h
public expect fun vxCpuEnabledGet(): CpusetT

// Get set of running CPU's in the system
public expect fun vxCpuConfiguredGet(): CpusetT

public fun wifexited(status: CInt): Boolean = (status and 0xFF00) == 0

public fun wifsignaled(status: CInt): Boolean = (status and 0xFF00) != 0

public fun wifstopped(status: CInt): Boolean = (status and 0xFF0000) != 0

public fun wexitstatus(status: CInt): CInt = status and 0xFF

public fun wifcontinued(status: CInt): CInt = (status shr 24) and 0xFF

public fun wtermsig(status: CInt): CInt = (status shr 8) and 0xFF

public fun wstopsig(status: CInt): CInt = (status shr 16) and 0xFF

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT = -1L

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT = -1L

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    var memptr1 = memptr
    // check to see if align is a power of 2 and if align is a multiple
    // of sizeof(void *)
    if ((align and align - 1uL != 0uL) || (align.toInt() % 8 != 0)) {
        return EINVAL
    }
    return run {
        // posixMemalign should not set errno
        val e = errnoGet()
        val temp = memalign(align, size)
        errnoSet(e)
        if ((temp == null)) {
            ENOMEM
        } else {
            memptr1 = temp
            0
        }
    }
}
