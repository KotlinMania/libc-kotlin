// port-lint: source vxworks/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun tolower(c: CInt): CInt = platform.posix.tolower(c)

public actual fun toupper(c: CInt): CInt = platform.posix.toupper(c)

public actual fun fflush(file: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires manual FFI bridge — not yet implemented")

public actual fun fclose(file: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires manual FFI bridge — not yet implemented")

public actual fun remove(filename: String?): CInt =
    throw UnsupportedOperationException("remove requires manual FFI bridge — not yet implemented")

public actual fun rename(oldname: String?, newname: String?): CInt =
    throw UnsupportedOperationException("rename requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires manual FFI bridge — not yet implemented")

public actual fun getchar(): CInt = platform.posix.getchar()

public actual fun putchar(c: CInt): CInt = platform.posix.putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires manual FFI bridge — not yet implemented")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires manual FFI bridge — not yet implemented")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires manual FFI bridge — not yet implemented")

public actual fun puts(s: String?): CInt =
    throw UnsupportedOperationException("puts requires manual FFI bridge — not yet implemented")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires manual FFI bridge — not yet implemented")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("fseek requires manual FFI bridge — not yet implemented")

public actual fun fgetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(stream: FILE?, ptr: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun feof(stream: FILE?): CInt =
    throw UnsupportedOperationException("feof requires manual FFI bridge — not yet implemented")

public actual fun ferror(stream: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires manual FFI bridge — not yet implemented")

public actual fun atoi(s: String?): CInt =
    throw UnsupportedOperationException("atoi requires manual FFI bridge — not yet implemented")

public actual fun system(s: String?): CInt =
    throw UnsupportedOperationException("system requires manual FFI bridge — not yet implemented")

public actual fun cfmakeraw(termios: Termios?): CInt =
    throw UnsupportedOperationException("cfmakeraw requires manual FFI bridge — not yet implemented")

public actual fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetispeed requires manual FFI bridge — not yet implemented")

public actual fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt =
    throw UnsupportedOperationException("cfsetospeed requires manual FFI bridge — not yet implemented")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcmp requires manual FFI bridge — not yet implemented")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires manual FFI bridge — not yet implemented")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    throw UnsupportedOperationException("strcoll requires manual FFI bridge — not yet implemented")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires manual FFI bridge — not yet implemented")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires manual FFI bridge — not yet implemented")

public actual fun tcflush(fd: CInt, action: CInt): CInt = platform.posix.tcflush(fd, action)

public actual fun pclose(stream: FILE?): CInt =
    throw UnsupportedOperationException("pclose requires manual FFI bridge — not yet implemented")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("linkat requires manual FFI bridge — not yet implemented")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("unlinkat requires manual FFI bridge — not yet implemented")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchownat requires manual FFI bridge — not yet implemented")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun printf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun scanf(format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(c: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun stat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun fileno(stream: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — not yet implemented")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    throw UnsupportedOperationException("fchown requires manual FFI bridge — not yet implemented")

public actual fun access(path: String?, amode: CInt): CInt =
    throw UnsupportedOperationException("access requires manual FFI bridge — not yet implemented")

public actual fun fchdir(dirfd: CInt): CInt = platform.posix.fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    throw UnsupportedOperationException("chown requires manual FFI bridge — not yet implemented")

public actual fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt =
    throw UnsupportedOperationException("getgroups requires manual FFI bridge — not yet implemented")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun pause(): CInt = platform.posix.pause()

public actual fun seteuid(uid: UidT): CInt =
    throw UnsupportedOperationException("seteuid requires manual FFI bridge — not yet implemented")

public actual fun setegid(gid: GidT): CInt =
    throw UnsupportedOperationException("setegid requires manual FFI bridge — not yet implemented")

public actual fun mlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("mlock requires manual FFI bridge — not yet implemented")

public actual fun mlockall(flags: CInt): CInt = platform.posix.mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munlock requires manual FFI bridge — not yet implemented")

public actual fun munlockall(): CInt = platform.posix.munlockall()

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("munmap requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires manual FFI bridge — not yet implemented")

public actual fun truncate(path: String?, length: OffT): CInt =
    throw UnsupportedOperationException("truncate requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires manual FFI bridge — not yet implemented")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadEqual requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigaddset requires manual FFI bridge — not yet implemented")

public actual fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt =
    throw UnsupportedOperationException("sigaction requires manual FFI bridge — not yet implemented")

public actual fun utimes(filename: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("utimes requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires manual FFI bridge — not yet implemented")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires manual FFI bridge — not yet implemented")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlclose requires manual FFI bridge — not yet implemented")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt =
    throw UnsupportedOperationException("dladdr requires manual FFI bridge — not yet implemented")

public actual fun gethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("gethostname requires manual FFI bridge — not yet implemented")

public actual fun usleep(secs: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep requires manual FFI bridge — not yet implemented")

public actual fun putenv(string: String?): CInt =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("sigprocmask requires manual FFI bridge — not yet implemented")

public actual fun sigpending(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigpending requires manual FFI bridge — not yet implemented")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifo requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires manual FFI bridge — not yet implemented")

public actual fun mkstemp(template: String?): CInt =
    throw UnsupportedOperationException("mkstemp requires manual FFI bridge — not yet implemented")

public actual fun setlogmask(maskpri: CInt): CInt = platform.posix.setlogmask(maskpri)

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcsetattr requires manual FFI bridge — not yet implemented")

public actual fun tcgetattr(fd: CInt, termios: Termios?): CInt =
    throw UnsupportedOperationException("tcgetattr requires manual FFI bridge — not yet implemented")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt = platform.posix.tcsendbreak(fd, duration)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fnmatch requires manual FFI bridge — not yet implemented")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    throw UnsupportedOperationException("symlinkat requires manual FFI bridge — not yet implemented")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    throw UnsupportedOperationException("fchmodat requires manual FFI bridge — not yet implemented")

public actual fun utime(file: String?, buf: Utimbuf?): CInt =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun chdir(attr: String?): CInt =
    throw UnsupportedOperationException("chdir requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    throw UnsupportedOperationException("pthreadMutexInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetname requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadDetach requires manual FFI bridge — not yet implemented")

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun lstat(path: String?, buf: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    throw UnsupportedOperationException("ftruncate requires manual FFI bridge — not yet implemented")

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("readdirR requires manual FFI bridge — not yet implemented")

public actual fun open(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("poll requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    throw UnsupportedOperationException("pthreadCondInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondSignal requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    throw UnsupportedOperationException("pthreadCondBroadcast requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadCondWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: CUInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): CInt =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    throw UnsupportedOperationException("pthreadKeyDelete requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetspecific requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwait requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetname requires manual FFI bridge — not yet implemented")

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJoin requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clockId: ClockidT, res: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires manual FFI bridge — not yet implemented")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("nanosleep requires manual FFI bridge — not yet implemented")

public actual fun accept(s: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun connect(s: CInt, name: Sockaddr?, namelen: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun getpeername(s: CInt, name: Sockaddr?, namelen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: CInt, backlog: CInt): CInt = platform.posix.listen(socket, backlog)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun shutdown(s: CInt, how: CInt): CInt = platform.posix.shutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt = platform.posix.socket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires manual FFI bridge — not yet implemented")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun close(fd: CInt): CInt = platform.posix.close(fd)

public actual fun dup(src: CInt): CInt = platform.posix.dup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt = platform.posix.dup2(src, dst)

public actual fun pipe(fds: CInt?): CInt =
    throw UnsupportedOperationException("pipe requires manual FFI bridge — not yet implemented")

public actual fun unlink(pathname: String?): CInt =
    throw UnsupportedOperationException("unlink requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    throw UnsupportedOperationException("setenv requires manual FFI bridge — not yet implemented")

public actual fun unsetenv(envVarName: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires manual FFI bridge — not yet implemented")

public actual fun link(src: String?, dst: String?): CInt =
    throw UnsupportedOperationException("link requires manual FFI bridge — not yet implemented")

public actual fun symlink(path1: String?, path2: String?): CInt =
    throw UnsupportedOperationException("symlink requires manual FFI bridge — not yet implemented")

public actual fun rmdir(path: String?): CInt =
    throw UnsupportedOperationException("rmdir requires manual FFI bridge — not yet implemented")

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — not yet implemented")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    throw UnsupportedOperationException("fchmod requires manual FFI bridge — not yet implemented")

public actual fun fsync(fd: CInt): CInt = platform.posix.fsync(fd)

public actual fun closedir(ptr: DIR?): CInt =
    throw UnsupportedOperationException("closedir requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedYield(): CInt =
    throw UnsupportedOperationException("schedYield requires manual FFI bridge — not yet implemented")

public actual fun errnoSet(err: CInt): CInt =
    throw UnsupportedOperationException("errnoSet requires manual FFI bridge — not yet implemented")

public actual fun errnoGet(): CInt =
    throw UnsupportedOperationException("errnoGet requires manual FFI bridge — not yet implemented")

public actual fun setgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setgid requires manual FFI bridge — not yet implemented")

public actual fun setuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setuid requires manual FFI bridge — not yet implemented")

public actual fun sigemptyset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigemptyset requires manual FFI bridge — not yet implemented")

public actual fun sigfillset(set: SigsetT?): CInt =
    throw UnsupportedOperationException("sigfillset requires manual FFI bridge — not yet implemented")

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigdelset requires manual FFI bridge — not yet implemented")

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    throw UnsupportedOperationException("sigismember requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires manual FFI bridge — not yet implemented")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    throw UnsupportedOperationException("kill requires manual FFI bridge — not yet implemented")




public actual fun taskKill(taskId: TASKID, signo: CInt): CInt =
    throw UnsupportedOperationException("taskKill requires manual FFI bridge — not yet implemented")

public actual fun raise(signo: CInt): CInt =
    throw UnsupportedOperationException("raise requires manual FFI bridge — not yet implemented")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    throw UnsupportedOperationException("taskDelay requires manual FFI bridge — not yet implemented")

public actual fun taskNameSet(taskId: TASKID, taskName: String?): CInt =
    throw UnsupportedOperationException("taskNameSet requires manual FFI bridge — not yet implemented")

public actual fun taskNameGet(taskId: TASKID, bufName: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("taskNameGet requires manual FFI bridge — not yet implemented")

public actual fun rtpInfoGet(rtpId: RTPID, rtpStruct: RTPDESC?): CInt =
    throw UnsupportedOperationException("rtpInfoGet requires manual FFI bridge — not yet implemented")

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randBytes requires manual FFI bridge — not yet implemented")

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randABytes requires manual FFI bridge — not yet implemented")

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    throw UnsupportedOperationException("randUBytes requires manual FFI bridge — not yet implemented")

public actual fun randSecure(): CInt =
    throw UnsupportedOperationException("randSecure requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")


