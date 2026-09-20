// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on WASI — no C library access")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on WASI — no C library access")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on WASI — no C library access")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on WASI — no C library access")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove not available on WASI — no C library access")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename not available on WASI — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on WASI — no C library access")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on WASI — no C library access")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on WASI — no C library access")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on WASI — no C library access")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on WASI — no C library access")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on WASI — no C library access")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts not available on WASI — no C library access")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on WASI — no C library access")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on WASI — no C library access")

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on WASI — no C library access")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on WASI — no C library access")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on WASI — no C library access")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on WASI — no C library access")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi not available on WASI — no C library access")

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system not available on WASI — no C library access")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw not available on WASI — no C library access")

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed not available on WASI — no C library access")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed not available on WASI — no C library access")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on WASI — no C library access")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on WASI — no C library access")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on WASI — no C library access")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp not available on WASI — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush not available on WASI — no C library access")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose not available on WASI — no C library access")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat not available on WASI — no C library access")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat not available on WASI — no C library access")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat not available on WASI — no C library access")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on WASI — no C library access")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on WASI — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on WASI — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on WASI — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on WASI — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on WASI — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on WASI — no C library access")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked not available on WASI — no C library access")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked not available on WASI — no C library access")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on WASI — no C library access")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on WASI — no C library access")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat not available on WASI — no C library access")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown not available on WASI — no C library access")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access not available on WASI — no C library access")

public actual fun fchdir(dirfd: CInt): CInt =
    throw UnsupportedOperationException("fchdir not available on WASI — no C library access")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown not available on WASI — no C library access")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups not available on WASI — no C library access")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt not available on WASI — no C library access")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause not available on WASI — no C library access")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid not available on WASI — no C library access")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid not available on WASI — no C library access")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock not available on WASI — no C library access")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall not available on WASI — no C library access")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock not available on WASI — no C library access")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall not available on WASI — no C library access")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on WASI — no C library access")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual not available on WASI — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset not available on WASI — no C library access")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction not available on WASI — no C library access")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes not available on WASI — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose not available on WASI — no C library access")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr not available on WASI — no C library access")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname not available on WASI — no C library access")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep not available on WASI — no C library access")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv not available on WASI — no C library access")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask not available on WASI — no C library access")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending not available on WASI — no C library access")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo not available on WASI — no C library access")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko not available on WASI — no C library access")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp not available on WASI — no C library access")

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask not available on WASI — no C library access")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr not available on WASI — no C library access")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr not available on WASI — no C library access")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak not available on WASI — no C library access")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch not available on WASI — no C library access")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat not available on WASI — no C library access")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat not available on WASI — no C library access")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime not available on WASI — no C library access")

public actual fun chdir(attr: String?): CInt =
    throw UnsupportedOperationException("chdir not available on WASI — no C library access")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on WASI — no C library access")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on WASI — no C library access")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on WASI — no C library access")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit not available on WASI — no C library access")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on WASI — no C library access")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock not available on WASI — no C library access")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on WASI — no C library access")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on WASI — no C library access")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on WASI — no C library access")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetname not available on WASI — no C library access")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on WASI — no C library access")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on WASI — no C library access")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit not available on WASI — no C library access")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on WASI — no C library access")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on WASI — no C library access")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on WASI — no C library access")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on WASI — no C library access")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on WASI — no C library access")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach not available on WASI — no C library access")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on WASI — no C library access")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat not available on WASI — no C library access")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate not available on WASI — no C library access")

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR not available on WASI — no C library access")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on WASI — no C library access")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll not available on WASI — no C library access")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit not available on WASI — no C library access")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit not available on WASI — no C library access")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy not available on WASI — no C library access")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal not available on WASI — no C library access")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on WASI — no C library access")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait not available on WASI — no C library access")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on WASI — no C library access")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on WASI — no C library access")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: CUInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders not available on WASI — no C library access")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit not available on WASI — no C library access")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on WASI — no C library access")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on WASI — no C library access")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on WASI — no C library access")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock not available on WASI — no C library access")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on WASI — no C library access")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on WASI — no C library access")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock not available on WASI — no C library access")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on WASI — no C library access")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete not available on WASI — no C library access")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific not available on WASI — no C library access")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on WASI — no C library access")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetname not available on WASI — no C library access")

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin not available on WASI — no C library access")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep not available on WASI — no C library access")

public actual fun accept(s: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept not available on WASI — no C library access")

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun connect(s: CInt, name: Sockaddr?, namelen: SocklenT): CInt =
    throw UnsupportedOperationException("connect not available on WASI — no C library access")

public actual fun getpeername(s: CInt, name: Sockaddr?, namelen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername not available on WASI — no C library access")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname not available on WASI — no C library access")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt not available on WASI — no C library access")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen not available on WASI — no C library access")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt not available on WASI — no C library access")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown not available on WASI — no C library access")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket not available on WASI — no C library access")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl not available on WASI — no C library access")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close not available on WASI — no C library access")

public actual fun dup(src: CInt): CInt =
    throw UnsupportedOperationException("dup not available on WASI — no C library access")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 not available on WASI — no C library access")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe not available on WASI — no C library access")

public actual fun unlink(pathname: String?): CInt =
    throw UnsupportedOperationException("unlink not available on WASI — no C library access")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo not available on WASI — no C library access")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on WASI — no C library access")

public actual fun unsetenv(envVarName: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on WASI — no C library access")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link not available on WASI — no C library access")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink not available on WASI — no C library access")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on WASI — no C library access")

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on WASI — no C library access")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod not available on WASI — no C library access")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    throw UnsupportedOperationException("fchmod not available on WASI — no C library access")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync not available on WASI — no C library access")

public actual fun closedir(ptr: DIR?): CInt =
    throw UnsupportedOperationException("closedir not available on WASI — no C library access")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on WASI — no C library access")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on WASI — no C library access")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on WASI — no C library access")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield not available on WASI — no C library access")

public actual fun errnoSet(err: CInt): CInt =
    throw UnsupportedOperationException("errnoSet not available on WASI — no C library access")

public actual fun errnoGet(): CInt =
    throw UnsupportedOperationException("errnoGet not available on WASI — no C library access")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid not available on WASI — no C library access")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid not available on WASI — no C library access")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset not available on WASI — no C library access")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset not available on WASI — no C library access")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset not available on WASI — no C library access")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember not available on WASI — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    throw UnsupportedOperationException("kill not available on WASI — no C library access")




public actual fun taskKill(taskId: TASKID, signo: CInt): CInt =
    throw UnsupportedOperationException("taskKill not available on WASI — no C library access")

public actual fun raise(signo: CInt): CInt =
    throw UnsupportedOperationException("raise not available on WASI — no C library access")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    throw UnsupportedOperationException("taskDelay not available on WASI — no C library access")

public actual fun taskNameSet(taskId: TASKID, taskName: String?): CInt =
    throw UnsupportedOperationException("taskNameSet not available on WASI — no C library access")

public actual fun taskNameGet(taskId: TASKID, bufName: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("taskNameGet not available on WASI — no C library access")

public actual fun rtpInfoGet(rtpId: RTPID, rtpStruct: RTPDESC?): CInt =
    throw UnsupportedOperationException("rtpInfoGet not available on WASI — no C library access")

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randBytes not available on WASI — no C library access")

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randABytes not available on WASI — no C library access")

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randUBytes not available on WASI — no C library access")

public actual fun randSecure(): CInt =
    throw UnsupportedOperationException("randSecure not available on WASI — no C library access")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on WASI — no C library access")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on WASI — no C library access")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on WASI — no C library access")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on WASI — no C library access")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on WASI — no C library access")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on WASI — no C library access")



