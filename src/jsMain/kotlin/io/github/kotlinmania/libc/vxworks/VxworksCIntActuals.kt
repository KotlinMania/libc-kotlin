// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun fflush(file: FILE?): Int =
    LibcNative.fflush(file?.handle?.toInt() ?: -1)

public actual fun fclose(file: FILE?): Int =
    LibcNative.fclose(file?.handle?.toInt() ?: -1)

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rename(oldname: String?, newname: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    LibcNative.fseek(stream?.handle?.toInt() ?: -1, offset.toInt(), whence)

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun atoi(s: String?): Int =
    atoiNapi(s)

public actual fun system(s: String?): Int =
    systemNapi(s)

public actual fun cfmakeraw(termios: Termios?): Int =
    throw UnsupportedOperationException("cfmakeraw requires N-API addon")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed requires N-API addon")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed requires N-API addon")

public actual fun strcmp(cs: String?, ct: String?): Int =
    strcmpNapi(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    strncmpNapi(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush requires N-API addon")

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose requires N-API addon")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat requires N-API addon")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat requires N-API addon")

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UShort, group: UShort, flags: Int): Int =
    throw UnsupportedOperationException("fchownat requires N-API addon")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun printf(format: String?, vararg args: Any?): Int =
    if (format != null) LibcNative.printf(format) else -1

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun creat(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fchown(fd: Int, owner: UShort, group: UShort): Int =
    throw UnsupportedOperationException("fchown requires N-API addon")

public actual fun access(path: String?, amode: Int): Int =
    accessNapi(path, amode)

public actual fun fchdir(dirfd: Int): Int =
    throw UnsupportedOperationException("fchdir requires N-API addon")

public actual fun chown(path: String?, uid: UShort, gid: UShort): Int =
    throw UnsupportedOperationException("chown requires N-API addon")

public actual fun getgroups(ngroupsMax: Int, groups: UShort?): Int =
    throw UnsupportedOperationException("getgroups requires N-API addon")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause requires N-API addon")

public actual fun seteuid(uid: UShort): Int =
    throw UnsupportedOperationException("seteuid requires N-API addon")

public actual fun setegid(gid: UShort): Int =
    throw UnsupportedOperationException("setegid requires N-API addon")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock requires N-API addon")

public actual fun mlockall(flags: Int): Int =
    throw UnsupportedOperationException("mlockall requires N-API addon")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock requires N-API addon")

public actual fun munlockall(): Int =
    throw UnsupportedOperationException("munlockall requires N-API addon")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: Int): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate requires N-API addon")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset requires N-API addon")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction requires N-API addon")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun dlclose(handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlclose requires N-API addon")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr requires N-API addon")

public actual fun gethostname(name: String?, len: ULong): Int =
    run {
        LibcNative.gethostname()
        0
    }

public actual fun usleep(secs: ULong): Int =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun putenv(string: String?): Int =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask requires N-API addon")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending requires N-API addon")

public actual fun mkfifo(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("mkfifo requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun mkstemp(template: String?): Int =
    throw UnsupportedOperationException("mkstemp requires N-API addon")

public actual fun setlogmask(maskpri: Int): Int =
    throw UnsupportedOperationException("setlogmask requires N-API addon")

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr requires N-API addon")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr requires N-API addon")

public actual fun tcsendbreak(fd: Int, duration: Int): Int =
    throw UnsupportedOperationException("tcsendbreak requires N-API addon")

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fnmatch requires N-API addon")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat requires N-API addon")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat requires N-API addon")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun chdir(attr: String?): Int =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit requires N-API addon")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy requires N-API addon")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype requires N-API addon")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit requires N-API addon")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy requires N-API addon")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock requires N-API addon")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock requires N-API addon")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock requires N-API addon")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): Int =
    throw UnsupportedOperationException("pthreadAttrSetname requires N-API addon")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize requires N-API addon")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize requires N-API addon")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit requires N-API addon")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires N-API addon")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires N-API addon")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy requires N-API addon")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach requires N-API addon")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate requires N-API addon")

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR requires N-API addon")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int =
    throw UnsupportedOperationException("poll requires N-API addon")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit requires N-API addon")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy requires N-API addon")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit requires N-API addon")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy requires N-API addon")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal requires N-API addon")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast requires N-API addon")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait requires N-API addon")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit requires N-API addon")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy requires N-API addon")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: UInt): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders requires N-API addon")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit requires N-API addon")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy requires N-API addon")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock requires N-API addon")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock requires N-API addon")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires N-API addon")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock requires N-API addon")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock requires N-API addon")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires N-API addon")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock requires N-API addon")

public actual fun pthreadKeyDelete(key: ULong): Int =
    throw UnsupportedOperationException("pthreadKeyDelete requires N-API addon")

public actual fun pthreadSetspecific(key: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific requires N-API addon")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait requires N-API addon")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetname requires N-API addon")

public actual fun pthreadJoin(thread: ULong, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin requires N-API addon")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetres(clockId: Int, res: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockNanosleep(clockId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep requires N-API addon")

public actual fun accept(s: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun connect(s: Int, name: Sockaddr?, namelen: UInt): Int =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun getpeername(s: Int, name: Sockaddr?, namelen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun shutdown(s: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown requires N-API addon")

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun close(fd: Int): Int =
    closeNapi(fd)

public actual fun dup(src: Int): Int =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe requires N-API addon")

public actual fun unlink(pathname: String?): Int =
    unlinkNapi(pathname)

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: Int): Int =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(envVarName: String?): Int =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link requires N-API addon")

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink requires N-API addon")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun mkdir(dirName: String?, mode: Int): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun chmod(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun fchmod(attr1: Int, attr2: Int): Int =
    throw UnsupportedOperationException("fchmod requires N-API addon")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync requires N-API addon")

public actual fun closedir(ptr: DIR?): Int =
    throw UnsupportedOperationException("closedir requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield requires N-API addon")

public actual fun errnoSet(err: Int): Int =
    throw UnsupportedOperationException("errnoSet requires N-API addon")

public actual fun errnoGet(): Int =
    throw UnsupportedOperationException("errnoGet requires N-API addon")

public actual fun setgid(gid: UShort): Int =
    throw UnsupportedOperationException("setgid requires N-API addon")

public actual fun setuid(uid: UShort): Int =
    throw UnsupportedOperationException("setuid requires N-API addon")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset requires N-API addon")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset requires N-API addon")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset requires N-API addon")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: ULong?, oset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun kill(pid: Int, signo: Int): Int =
    throw UnsupportedOperationException("kill requires N-API addon")

public actual fun taskKill(taskId: Int, signo: Int): Int =
    throw UnsupportedOperationException("taskKill requires N-API addon")

public actual fun raise(signo: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun taskDelay(ticks: UInt): Int =
    throw UnsupportedOperationException("taskDelay requires N-API addon")

public actual fun taskNameSet(taskId: Int, taskName: String?): Int =
    throw UnsupportedOperationException("taskNameSet requires N-API addon")

public actual fun taskNameGet(taskId: Int, bufName: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("taskNameGet requires N-API addon")

public actual fun rtpInfoGet(rtpId: Int, rtpStruct: RTPDESC?): Int =
    throw UnsupportedOperationException("rtpInfoGet requires N-API addon")

public actual fun randBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randBytes requires N-API addon")

public actual fun randABytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randABytes requires N-API addon")

public actual fun randUBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randUBytes requires N-API addon")

public actual fun randSecure(): Int =
    throw UnsupportedOperationException("randSecure requires N-API addon")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")
