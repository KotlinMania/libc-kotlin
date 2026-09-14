// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: CInt): CInt =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires N-API addon")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw requires N-API addon")

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed requires N-API addon")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    throw UnsupportedOperationException("tcflush requires N-API addon")

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown requires N-API addon")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun fchdir(dirfd: CInt): CInt =
    throw UnsupportedOperationException("fchdir requires N-API addon")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown requires N-API addon")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups requires N-API addon")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun pause(): CInt =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid requires N-API addon")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid requires N-API addon")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires N-API addon")

public actual fun mlockall(flags: CInt): CInt =
    throw UnsupportedOperationException("mlockall requires N-API addon")

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires N-API addon")

public actual fun munlockall(): CInt =
    throw UnsupportedOperationException("munlockall requires N-API addon")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires N-API addon")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose requires N-API addon")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr requires N-API addon")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname requires N-API addon")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp requires N-API addon")

public actual fun setlogmask(maskpri: CInt): CInt =
    throw UnsupportedOperationException("setlogmask requires N-API addon")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr requires N-API addon")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr requires N-API addon")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    throw UnsupportedOperationException("tcsendbreak requires N-API addon")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat requires N-API addon")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun chdir(attr: String?): CInt =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetname requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires N-API addon")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires N-API addon")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: CUInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders requires N-API addon")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetname requires N-API addon")

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun accept(s: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun connect(s: CInt, name: Sockaddr?, namelen: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun getpeername(s: CInt, name: Sockaddr?, namelen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun dup(src: CInt): CInt =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun unlink(pathname: String?): CInt =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(envVarName: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun fsync(fd: CInt): CInt =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun closedir(ptr: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun errnoSet(err: CInt): CInt =
    throw UnsupportedOperationException("errnoSet requires N-API addon")

public actual fun errnoGet(): CInt =
    throw UnsupportedOperationException("errnoGet requires N-API addon")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid requires N-API addon")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid requires N-API addon")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    throw UnsupportedOperationException("kill requires N-API addon")




public actual fun taskKill(taskId: TASKID, signo: CInt): CInt =
    throw UnsupportedOperationException("taskKill requires N-API addon")

public actual fun raise(signo: CInt): CInt =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    throw UnsupportedOperationException("taskDelay requires N-API addon")

public actual fun taskNameSet(taskId: TASKID, taskName: String?): CInt =
    throw UnsupportedOperationException("taskNameSet requires N-API addon")

public actual fun taskNameGet(taskId: TASKID, bufName: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("taskNameGet requires N-API addon")

public actual fun rtpInfoGet(rtpId: RTPID, rtpStruct: RTPDESC?): CInt =
    throw UnsupportedOperationException("rtpInfoGet requires N-API addon")

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randBytes requires N-API addon")

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randABytes requires N-API addon")

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randUBytes requires N-API addon")

public actual fun randSecure(): CInt =
    throw UnsupportedOperationException("randSecure requires N-API addon")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")



