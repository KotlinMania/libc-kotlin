package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
}

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next <= max) {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    } else {
        MutPtr<Cmsghdr>(0L)
    }
}

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() > 0) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr<Cmsghdr>(0L)
    }

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

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

public expect fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun fflush(file: MutPtr<FILE>): CInt

public expect fun fclose(file: MutPtr<FILE>): CInt

public expect fun remove(filename: ConstPtr<CChar>): CInt

public expect fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt

public expect fun tmpfile(): MutPtr<FILE>

public expect fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: MutPtr<FILE>): CInt

public expect fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar>

public expect fun fputc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt

public expect fun puts(s: ConstPtr<CChar>): CInt

public expect fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt

public expect fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: MutPtr<FILE>): CLong

public expect fun rewind(stream: MutPtr<FILE>)

public expect fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt

public expect fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt

public expect fun feof(stream: MutPtr<FILE>): CInt

public expect fun ferror(stream: MutPtr<FILE>): CInt

public expect fun perror(s: ConstPtr<CChar>)

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

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun malloc(size: SizeT): MutPtr<CVoid>

public expect fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun free(p: MutPtr<CVoid>)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: ConstPtr<CChar>): CInt

public expect fun getenv(s: ConstPtr<CChar>): MutPtr<CChar>

public expect fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT

public expect fun cfmakeraw(termios: MutPtr<Termios>): CInt

public expect fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt

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

public expect fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt

public expect fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun strerror(n: CInt): MutPtr<CChar>

public expect fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT

public expect fun wcslen(buf: ConstPtr<WcharT>): SizeT

public expect fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT

public expect fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT>

public expect fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt

public expect fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun times(buf: MutPtr<Tms>): ClockT

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun pclose(stream: MutPtr<FILE>): CInt

public expect fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar>

public expect fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt

public expect fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt

// netdb.h
public expect fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent>

public expect fun getprotobynumber(proto: CInt): MutPtr<Protoent>

public expect fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent>

public expect fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun fileno(stream: MutPtr<FILE>): CInt

public expect fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun rewinddir(dirp: MutPtr<DIR>)

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun access(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt

public expect fun getlogin(): MutPtr<CChar>

public expect fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt

public expect fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong

public expect fun pause(): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun ttyname(fd: CInt): MutPtr<CChar>

public expect fun wait(status: MutPtr<CInt>): PidT

public expect fun umask(mask: ModeT): ModeT

public expect fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid>

public expect fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun truncate(path: ConstPtr<CChar>, length: OffT): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun pthreadExit(value: MutPtr<CVoid>): Nothing

public expect fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt

public expect fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlerror(): MutPtr<CChar>

public expect fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun dlclose(handle: MutPtr<CVoid>): CInt

public expect fun dladdr(addr: MutPtr<CVoid>, info: MutPtr<DlInfo>): CInt

// time.h
public expect fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm>

public expect fun mktime(tm: MutPtr<Tm>): TimeT

public expect fun time(time: MutPtr<TimeT>): TimeT

public expect fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm>

public expect fun timegm(tm: MutPtr<Tm>): TimeT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun putenv(string: MutPtr<CChar>): CInt

public expect fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar>

public expect fun localeconv(): MutPtr<Lconv>

public expect fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun sigpending(set: MutPtr<SigsetT>): CInt

public expect fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: MutPtr<FILE>): OffT

public expect fun mkstemp(template: MutPtr<CChar>): CInt

public expect fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar>

public expect fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt

public expect fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT

public expect fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt

public expect fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt

// sys/stat.h
public expect fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt

// utime.h
public expect fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt

// stdlib.h
public expect fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr<CVoid>

// ioLib.h
public expect fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar>

// ioLib.h
public expect fun chdir(attr: ConstPtr<CChar>): CInt

// pthread.h
public expect fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt

// pthread.h
public expect fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt

// pthread.h
public expect fun pthreadMutexattrSettype(pAttr: MutPtr<PthreadMutexattrT>, pType: CInt): CInt

// pthread.h
public expect fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt

// pthread.h
public expect fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt

// pthread.h
public expect fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt

// pthread.h
public expect fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt

// pthread.h
public expect fun pthreadMutexTimedlock(attr: MutPtr<PthreadMutexT>, spec: ConstPtr<Timespec>): CInt

// pthread.h
public expect fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt

// pthread.h
public expect fun pthreadAttrSetname(pAttr: MutPtr<PthreadAttrT>, name: MutPtr<CChar>): CInt

// pthread.h
public expect fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt

// pthread.h
public expect fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt

// pthread.h
public expect fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt

// pthread.h
public expect fun pthreadCreate(pThread: MutPtr<PthreadT>, pAttr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr<CVoid>): CInt

// pthread.h
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

// pthread.h
public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

// pthread.h
public expect fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt

// pthread.h
public expect fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt

// pthread.h
public expect fun pthreadAttrDestroy(thread: MutPtr<PthreadAttrT>): CInt

// pthread.h
public expect fun pthreadDetach(thread: PthreadT): CInt

// int pthreadAtfork (void (*)(void), void (*)(void), void (*)(void));
public expect fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt

// stat.h
public expect fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt

// stat.h
public expect fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

// unistd.h
public expect fun ftruncate(fd: CInt, length: OffT): CInt

// dirent.h
public expect fun readdirR(pDir: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt

// dirent.h
public expect fun readdir(pDir: MutPtr<DIR>): MutPtr<Dirent>

// fcntl.h or
// ioLib.h
public expect fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

// poll.h
public expect fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt

// pthread.h
public expect fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt

// pthread.h
public expect fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt

// pthread.h
public expect fun pthreadCondattrGetclock(pAttr: ConstPtr<PthreadCondattrT>, pClockId: MutPtr<ClockidT>): CInt

// pthread.h
public expect fun pthreadCondattrSetclock(pAttr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

// pthread.h
public expect fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt

// pthread.h
public expect fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt

// pthread.h
public expect fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt

// pthread.h
public expect fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt

// pthread.h
public expect fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt

// pthread.h
public expect fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt

// pthread.h
public expect fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt

// pthread.h
public expect fun pthreadRwlockattrSetmaxreaders(attr: MutPtr<PthreadRwlockattrT>, attr2: CUint): CInt

// pthread.h
public expect fun pthreadRwlockInit(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<PthreadRwlockattrT>): CInt

// pthread.h
public expect fun pthreadRwlockDestroy(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadRwlockRdlock(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadRwlockTryrdlock(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadRwlockTimedrdlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt

// pthread.h
public expect fun pthreadRwlockWrlock(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadRwlockTrywrlock(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadRwlockTimedwrlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt

// pthread.h
public expect fun pthreadRwlockUnlock(attr: MutPtr<PthreadRwlockT>): CInt

// pthread.h
public expect fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt

// pthread.h
public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

// pthread.h
public expect fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt

// pthread.h
public expect fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid>

// pthread.h
public expect fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

// pthread.h
public expect fun pthreadAttrGetname(attr: MutPtr<PthreadAttrT>, name: MutPtr<MutPtr<CChar>>): CInt

// pthread.h
public expect fun pthreadJoin(thread: PthreadT, status: MutPtr<MutPtr<CVoid>>): CInt

// pthread.h
public expect fun pthreadSelf(): PthreadT

// clockLib.h
public expect fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt

// clockLib.h
public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt

// clockLib.h
public expect fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt

// clockLib.h
public expect fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

// timerLib.h
public expect fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

// socket.h
public expect fun accept(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt

// socket.h
public expect fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt

// socket.h
public expect fun connect(s: CInt, name: ConstPtr<Sockaddr>, namelen: SocklenT): CInt

// socket.h
public expect fun getpeername(s: CInt, name: MutPtr<Sockaddr>, namelen: MutPtr<SocklenT>): CInt

// socket.h
public expect fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt

// socket.h
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt

// socket.h
public expect fun listen(socket: CInt, backlog: CInt): CInt

// socket.h
public expect fun recv(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt): SsizeT

// socket.h
public expect fun recvfrom(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt, from: MutPtr<Sockaddr>, pFromLen: MutPtr<SocklenT>): SsizeT

public expect fun recvmsg(socket: CInt, mp: MutPtr<Msghdr>, flags: CInt): SsizeT

// socket.h
public expect fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, mp: ConstPtr<Msghdr>, flags: CInt): SsizeT

// socket.h
public expect fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT

// socket.h
public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt

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
public expect fun gaiStrerror(errcode: CInt): MutPtr<CChar>

// ioLib.h or
// unistd.h
public expect fun close(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT

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
public expect fun pipe(fds: MutPtr<CInt>): CInt

// ioLib.h or
// unistd.h
public expect fun unlink(pathname: ConstPtr<CChar>): CInt

// unistd.h and
// ioLib.h
public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

// netdb.h
public expect fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt

// netdb.h
public expect fun freeaddrinfo(res: MutPtr<Addrinfo>)

// signal.h
public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

// unistd.h
public expect fun getpid(): PidT

// unistd.h
public expect fun getppid(): PidT

// unistd.h
public expect fun setpgid(pid: PidT, pgid: PidT): PidT

// wait.h
public expect fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT

// unistd.h
public expect fun sysconf(attr: CInt): CLong

// stdlib.h
public expect fun setenv(envVarName: ConstPtr<CChar>, envVarValue: ConstPtr<CChar>, overwrite: CInt): CInt

// stdlib.h
public expect fun unsetenv(envVarName: ConstPtr<CChar>): CInt

// stdlib.h
public expect fun realpath(fileName: ConstPtr<CChar>, resolvedName: MutPtr<CChar>): MutPtr<CChar>

// unistd.h
public expect fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt

// unistd.h
public expect fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: SizeT): SsizeT

// unistd.h
public expect fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt

// dirent.h
public expect fun opendir(name: ConstPtr<CChar>): MutPtr<DIR>

// unistd.h
public expect fun rmdir(path: ConstPtr<CChar>): CInt

// stat.h
public expect fun mkdir(dirName: ConstPtr<CChar>, mode: ModeT): CInt

// stat.h
public expect fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt

// stat.h
public expect fun fchmod(attr1: CInt, attr2: ModeT): CInt

// unistd.h
public expect fun fsync(fd: CInt): CInt

// dirent.h
public expect fun closedir(ptr: MutPtr<DIR>): CInt

// sched.h
public expect fun schedGetPriorityMax(policy: CInt): CInt

// sched.h
public expect fun schedGetPriorityMin(policy: CInt): CInt

// sched.h
public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

// sched.h
public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

// sched.h
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

// sched.h
public expect fun schedGetscheduler(pid: PidT): CInt

// sched.h
public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt

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
public expect fun sigemptyset(set: MutPtr<SigsetT>): CInt

public expect fun sigfillset(set: MutPtr<SigsetT>): CInt

public expect fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt

// pthread.h for kernel
// signal.h for user
public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt

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
public expect fun taskNameSet(taskId: TaskId, taskName: MutPtr<CChar>): CInt

public expect fun taskNameGet(taskId: TaskId, bufName: MutPtr<CChar>, bufsize: SizeT): CInt

// rtpLibCommon.h
public expect fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr<RtpDesc>): CInt

public expect fun rtpSpawn(pubrtpFileName: ConstPtr<CChar>, argv: MutPtr<ConstPtr<CChar>>, envp: MutPtr<ConstPtr<CChar>>, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId

// pathLib.h
public expect fun pathIsAbsolute(filepath: ConstPtr<CChar>, pNameTail: MutPtr<ConstPtr<CChar>>): Bool

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

// randomNumGen.h
public expect fun randBytes(buf: MutPtr<CUchar>, length: CInt): CInt

public expect fun randABytes(buf: MutPtr<CUchar>, length: CInt): CInt

public expect fun randUBytes(buf: MutPtr<CUchar>, length: CInt): CInt

public expect fun randSecure(): CInt

// mqueue.h
public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

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

public fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT = -1L

public fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT = -1L

public fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt {
    val memptr1 = memptr
    // check to see if align is a power of 2 and if align is a multiple
    // of sizeof(void *)
    if ((align and align - 1uL != 0uL) || (align.toInt() % sizeOf<SizeT>(typeLayoutT = PrimitiveLayouts.USIZE64) != 0)) {
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
            (PrimitiveLayouts.mutPtrLayout<CVoid>(64L)).writeNative((memptr1).rawAddress, temp)
            0
        }
    }
}
