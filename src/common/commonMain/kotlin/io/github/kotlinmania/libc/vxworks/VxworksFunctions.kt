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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr)
}

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next <= max) {
        MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    } else {
        MutPtr(0L)
    }
}

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() > 0) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr(0L)
    }

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

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

public expect fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr

public expect fun fflush(file: MutPtr): CInt

public expect fun fclose(file: MutPtr): CInt

public expect fun remove(filename: ConstPtr): CInt

public expect fun rename(oldname: ConstPtr, newname: ConstPtr): CInt

public expect fun tmpfile(): MutPtr

public expect fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr, buf: MutPtr)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr): CInt

public expect fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr

public expect fun fputc(c: CInt, stream: MutPtr): CInt

public expect fun fputs(s: ConstPtr, stream: MutPtr): CInt

public expect fun puts(s: ConstPtr): CInt

public expect fun ungetc(c: CInt, stream: MutPtr): CInt

public expect fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr): CLong

public expect fun rewind(stream: MutPtr)

public expect fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt

public expect fun feof(stream: MutPtr): CInt

public expect fun ferror(stream: MutPtr): CInt

public expect fun perror(s: ConstPtr)

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

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr

public expect fun malloc(size: SizeT): MutPtr

public expect fun realloc(p: MutPtr, size: SizeT): MutPtr

public expect fun free(p: MutPtr)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: ConstPtr): CInt

public expect fun getenv(s: ConstPtr): MutPtr

public expect fun cfgetospeed(termios: ConstPtr): SpeedT

public expect fun cfmakeraw(termios: MutPtr): CInt

public expect fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt

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

public expect fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr

public expect fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt

public expect fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr): SizeT

public expect fun strnlen(cs: ConstPtr, n: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr

public expect fun strtok(s: MutPtr, t: ConstPtr): MutPtr

public expect fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr): SizeT

public expect fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr

public expect fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr

public expect fun uname(buf: MutPtr): CInt

public expect fun times(buf: MutPtr): ClockT

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun pclose(stream: MutPtr): CInt

public expect fun mkdtemp(template: MutPtr): MutPtr

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt

// netdb.h
public expect fun getprotobyname(name: ConstPtr): MutPtr

public expect fun getprotobynumber(proto: CInt): MutPtr

public expect fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun stat(path: ConstPtr, buf: MutPtr): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr): MutPtr

public expect fun fileno(stream: MutPtr): CInt

public expect fun creat(path: ConstPtr, mode: ModeT): CInt

public expect fun rewinddir(dirp: MutPtr)

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun access(path: ConstPtr, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt

public expect fun getlogin(): MutPtr

public expect fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt

public expect fun pathconf(path: ConstPtr, name: CInt): CLong

public expect fun pause(): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun ttyname(fd: CInt): MutPtr

public expect fun wait(status: MutPtr): PidT

public expect fun umask(mask: ModeT): ModeT

public expect fun mlock(addr: ConstPtr, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlock(addr: ConstPtr, len: SizeT): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr

public expect fun munmap(addr: MutPtr, len: SizeT): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun truncate(path: ConstPtr, length: OffT): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun pthreadExit(value: MutPtr): Nothing

public expect fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun sigaddset(set: MutPtr, signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt

public expect fun utimes(filename: ConstPtr, times: ConstPtr): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun dlopen(filename: ConstPtr, flag: CInt): MutPtr

public expect fun dlerror(): MutPtr

public expect fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr

public expect fun dlclose(handle: MutPtr): CInt

public expect fun dladdr(addr: MutPtr, info: MutPtr): CInt

// time.h
public expect fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr

public expect fun mktime(tm: MutPtr): TimeT

public expect fun time(time: MutPtr): TimeT

public expect fun gmtime(timeP: ConstPtr): MutPtr

public expect fun localtime(timeP: ConstPtr): MutPtr

public expect fun timegm(tm: MutPtr): TimeT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun gethostname(name: MutPtr, len: SizeT): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun putenv(string: MutPtr): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr): MutPtr

public expect fun localeconv(): MutPtr

public expect fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun sigpending(set: MutPtr): CInt

public expect fun mkfifo(path: ConstPtr, mode: ModeT): CInt

public expect fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr): OffT

public expect fun mkstemp(template: MutPtr): CInt

public expect fun tmpnam(ptr: MutPtr): MutPtr

public expect fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long)

public expect fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt

public expect fun tcgetattr(fd: CInt, termios: MutPtr): CInt

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT

public expect fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt

public expect fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt

// sys/stat.h
public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt

// utime.h
public expect fun utime(file: ConstPtr, buf: ConstPtr): CInt

// stdlib.h
public expect fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr

// ioLib.h
public expect fun getcwd(buf: MutPtr, size: SizeT): MutPtr

// ioLib.h
public expect fun chdir(attr: ConstPtr): CInt

// pthread.h
public expect fun pthreadMutexattrInit(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadMutexattrDestroy(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadMutexattrSettype(pAttr: MutPtr, pType: CInt): CInt

// pthread.h
public expect fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt

// pthread.h
public expect fun pthreadMutexDestroy(mutex: MutPtr): CInt

// pthread.h
public expect fun pthreadMutexLock(mutex: MutPtr): CInt

// pthread.h
public expect fun pthreadMutexTrylock(mutex: MutPtr): CInt

// pthread.h
public expect fun pthreadMutexTimedlock(attr: MutPtr, spec: ConstPtr): CInt

// pthread.h
public expect fun pthreadMutexUnlock(mutex: MutPtr): CInt

// pthread.h
public expect fun pthreadAttrSetname(pAttr: MutPtr, name: MutPtr): CInt

// pthread.h
public expect fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt

// pthread.h
public expect fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt

// pthread.h
public expect fun pthreadAttrInit(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadCreate(pThread: MutPtr, pAttr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr): CInt

// pthread.h
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

// pthread.h
public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

// pthread.h
public expect fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt

// pthread.h
public expect fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt

// pthread.h
public expect fun pthreadAttrDestroy(thread: MutPtr): CInt

// pthread.h
public expect fun pthreadDetach(thread: PthreadT): CInt

// int pthreadAtfork (void (*)(void), void (*)(void), void (*)(void));
public expect fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt

// stat.h
public expect fun fstat(fildes: CInt, buf: MutPtr): CInt

// stat.h
public expect fun lstat(path: ConstPtr, buf: MutPtr): CInt

// unistd.h
public expect fun ftruncate(fd: CInt, length: OffT): CInt

// dirent.h
public expect fun readdirR(pDir: MutPtr, entry: MutPtr, result: MutPtr): CInt

// dirent.h
public expect fun readdir(pDir: MutPtr): MutPtr

// fcntl.h or
// ioLib.h
public expect fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

// poll.h
public expect fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt

// pthread.h
public expect fun pthreadCondattrInit(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadCondattrDestroy(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadCondattrGetclock(pAttr: ConstPtr, pClockId: MutPtr): CInt

// pthread.h
public expect fun pthreadCondattrSetclock(pAttr: MutPtr, clockId: ClockidT): CInt

// pthread.h
public expect fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt

// pthread.h
public expect fun pthreadCondDestroy(cond: MutPtr): CInt

// pthread.h
public expect fun pthreadCondSignal(cond: MutPtr): CInt

// pthread.h
public expect fun pthreadCondBroadcast(cond: MutPtr): CInt

// pthread.h
public expect fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockattrInit(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockattrDestroy(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockattrSetmaxreaders(attr: MutPtr, attr2: CUint): CInt

// pthread.h
public expect fun pthreadRwlockInit(attr: MutPtr, host: ConstPtr): CInt

// pthread.h
public expect fun pthreadRwlockDestroy(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockRdlock(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockTryrdlock(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockTimedrdlock(attr: MutPtr, host: ConstPtr): CInt

// pthread.h
public expect fun pthreadRwlockWrlock(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockTrywrlock(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadRwlockTimedwrlock(attr: MutPtr, host: ConstPtr): CInt

// pthread.h
public expect fun pthreadRwlockUnlock(attr: MutPtr): CInt

// pthread.h
public expect fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt

// pthread.h
public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

// pthread.h
public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt

// pthread.h
public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr

// pthread.h
public expect fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt

// pthread.h
public expect fun pthreadAttrGetname(attr: MutPtr, name: MutPtr): CInt

// pthread.h
public expect fun pthreadJoin(thread: PthreadT, status: MutPtr): CInt

// pthread.h
public expect fun pthreadSelf(): PthreadT

// clockLib.h
public expect fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt

// clockLib.h
public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt

// clockLib.h
public expect fun clockGetres(clockId: ClockidT, res: MutPtr): CInt

// clockLib.h
public expect fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

// timerLib.h
public expect fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt

// socket.h
public expect fun accept(s: CInt, addr: MutPtr, addrlen: MutPtr): CInt

// socket.h
public expect fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt

// socket.h
public expect fun connect(s: CInt, name: ConstPtr, namelen: SocklenT): CInt

// socket.h
public expect fun getpeername(s: CInt, name: MutPtr, namelen: MutPtr): CInt

// socket.h
public expect fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt

// socket.h
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt

// socket.h
public expect fun listen(socket: CInt, backlog: CInt): CInt

// socket.h
public expect fun recv(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt): SsizeT

// socket.h
public expect fun recvfrom(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt, from: MutPtr, pFromLen: MutPtr): SsizeT

public expect fun recvmsg(socket: CInt, mp: MutPtr, flags: CInt): SsizeT

// socket.h
public expect fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, mp: ConstPtr, flags: CInt): SsizeT

// socket.h
public expect fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT

// socket.h
public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt

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
public expect fun gaiStrerror(errcode: CInt): MutPtr

// ioLib.h or
// unistd.h
public expect fun close(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT

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
public expect fun pipe(fds: MutPtr): CInt

// ioLib.h or
// unistd.h
public expect fun unlink(pathname: ConstPtr): CInt

// unistd.h and
// ioLib.h
public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

// netdb.h
public expect fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt

// netdb.h
public expect fun freeaddrinfo(res: MutPtr)

// signal.h
public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

// unistd.h
public expect fun getpid(): PidT

// unistd.h
public expect fun getppid(): PidT

// unistd.h
public expect fun setpgid(pid: PidT, pgid: PidT): PidT

// wait.h
public expect fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT

// unistd.h
public expect fun sysconf(attr: CInt): CLong

// stdlib.h
public expect fun setenv(envVarName: ConstPtr, envVarValue: ConstPtr, overwrite: CInt): CInt

// stdlib.h
public expect fun unsetenv(envVarName: ConstPtr): CInt

// stdlib.h
public expect fun realpath(fileName: ConstPtr, resolvedName: MutPtr): MutPtr

// unistd.h
public expect fun link(src: ConstPtr, dst: ConstPtr): CInt

// unistd.h
public expect fun readlink(path: ConstPtr, buf: MutPtr, bufsize: SizeT): SsizeT

// unistd.h
public expect fun symlink(path1: ConstPtr, path2: ConstPtr): CInt

// dirent.h
public expect fun opendir(name: ConstPtr): MutPtr

// unistd.h
public expect fun rmdir(path: ConstPtr): CInt

// stat.h
public expect fun mkdir(dirName: ConstPtr, mode: ModeT): CInt

// stat.h
public expect fun chmod(path: ConstPtr, mode: ModeT): CInt

// stat.h
public expect fun fchmod(attr1: CInt, attr2: ModeT): CInt

// unistd.h
public expect fun fsync(fd: CInt): CInt

// dirent.h
public expect fun closedir(ptr: MutPtr): CInt

// sched.h
public expect fun schedGetPriorityMax(policy: CInt): CInt

// sched.h
public expect fun schedGetPriorityMin(policy: CInt): CInt

// sched.h
public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

// sched.h
public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

// sched.h
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

// sched.h
public expect fun schedGetscheduler(pid: PidT): CInt

// sched.h
public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

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
public expect fun sigemptyset(set: MutPtr): CInt

public expect fun sigfillset(set: MutPtr): CInt

public expect fun sigdelset(set: MutPtr, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr, signum: CInt): CInt

// pthread.h for kernel
// signal.h for user
public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt

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
public expect fun taskNameSet(taskId: TaskId, taskName: MutPtr): CInt

public expect fun taskNameGet(taskId: TaskId, bufName: MutPtr, bufsize: SizeT): CInt

// rtpLibCommon.h
public expect fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr): CInt

public expect fun rtpSpawn(pubrtpFileName: ConstPtr, argv: MutPtr, envp: MutPtr, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId

// pathLib.h
public expect fun pathIsAbsolute(filepath: ConstPtr, pNameTail: MutPtr): Bool

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

// randomNumGen.h
public expect fun randBytes(buf: MutPtr, length: CInt): CInt

public expect fun randABytes(buf: MutPtr, length: CInt): CInt

public expect fun randUBytes(buf: MutPtr, length: CInt): CInt

public expect fun randSecure(): CInt

// mqueue.h
public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

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

public fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT = -1L

public fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT = -1L

public fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt {
    val memptr1 = memptr
    // check to see if align is a power of 2 and if align is a multiple
    // of sizeof(void *)
    if ((align and align - 1uL != 0uL) || (align.toInt() % sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.U64) != 0)) {
        return EINVAL
    }
    return run {
        // posixMemalign should not set errno
        val e = errnoGet()
        val temp = memalign(align, size)
        errnoSet(e)
        if (((temp).rawAddress == 0L)) {
            ENOMEM
        } else {
            (PrimitiveLayouts.mutPtrLayout(64L)).writeNative((memptr1).rawAddress, temp)
            0
        }
    }
}
