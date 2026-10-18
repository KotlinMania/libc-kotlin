package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on JVM — no C library access")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on JVM — no C library access")

public actual fun fflush(file: FILE?): Int =
    throw UnsupportedOperationException("fflush not available on JVM — no C library access")

public actual fun fclose(file: FILE?): Int =
    throw UnsupportedOperationException("fclose not available on JVM — no C library access")

public actual fun remove(filename: String?): Int =
    throw UnsupportedOperationException("remove not available on JVM — no C library access")

public actual fun rename(oldname: String?, newname: String?): Int =
    throw UnsupportedOperationException("rename not available on JVM — no C library access")

public actual fun setvbuf(stream: FILE?, buffer: String?, mode: Int, size: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on JVM — no C library access")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on JVM — no C library access")

public actual fun putchar(c: Int): Int =
    throw UnsupportedOperationException("putchar not available on JVM — no C library access")

public actual fun fgetc(stream: FILE?): Int =
    throw UnsupportedOperationException("fgetc not available on JVM — no C library access")

public actual fun fputc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("fputc not available on JVM — no C library access")

public actual fun fputs(s: String?, stream: FILE?): Int =
    throw UnsupportedOperationException("fputs not available on JVM — no C library access")

public actual fun puts(s: String?): Int =
    throw UnsupportedOperationException("puts not available on JVM — no C library access")

public actual fun ungetc(c: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on JVM — no C library access")

public actual fun fseek(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseek not available on JVM — no C library access")

public actual fun fgetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos not available on JVM — no C library access")

public actual fun fsetpos(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos not available on JVM — no C library access")

public actual fun feof(stream: FILE?): Int =
    throw UnsupportedOperationException("feof not available on JVM — no C library access")

public actual fun ferror(stream: FILE?): Int =
    throw UnsupportedOperationException("ferror not available on JVM — no C library access")

public actual fun atoi(s: String?): Int =
    throw UnsupportedOperationException("atoi not available on JVM — no C library access")

public actual fun system(s: String?): Int =
    throw UnsupportedOperationException("system not available on JVM — no C library access")

public actual fun cfmakeraw(termios: Termios?): Int =
    throw UnsupportedOperationException("cfmakeraw not available on JVM — no C library access")

public actual fun cfsetispeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetispeed not available on JVM — no C library access")

public actual fun cfsetospeed(termios: Termios?, speed: UInt): Int =
    throw UnsupportedOperationException("cfsetospeed not available on JVM — no C library access")

public actual fun strcmp(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcmp not available on JVM — no C library access")

public actual fun strncmp(cs: String?, ct: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on JVM — no C library access")

public actual fun strcoll(cs: String?, ct: String?): Int =
    throw UnsupportedOperationException("strcoll not available on JVM — no C library access")

public actual fun strcasecmp(s1: String?, s2: String?): Int =
    throw UnsupportedOperationException("strcasecmp not available on JVM — no C library access")

public actual fun strncasecmp(s1: String?, s2: String?, n: ULong): Int =
    throw UnsupportedOperationException("strncasecmp not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun tcflush(fd: Int, action: Int): Int =
    throw UnsupportedOperationException("tcflush not available on JVM — no C library access")

public actual fun pclose(stream: FILE?): Int =
    throw UnsupportedOperationException("pclose not available on JVM — no C library access")

public actual fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int =
    throw UnsupportedOperationException("linkat not available on JVM — no C library access")

public actual fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int =
    throw UnsupportedOperationException("unlinkat not available on JVM — no C library access")

public actual fun fchownat(dirfd: Int, pathname: String?, owner: UShort, group: UShort, flags: Int): Int =
    throw UnsupportedOperationException("fchownat not available on JVM — no C library access")

public actual fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on JVM — no C library access")

public actual fun printf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on JVM — no C library access")

public actual fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on JVM — no C library access")

public actual fun sprintf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on JVM — no C library access")

public actual fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf not available on JVM — no C library access")

public actual fun scanf(format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on JVM — no C library access")

public actual fun sscanf(s: String?, format: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf not available on JVM — no C library access")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked not available on JVM — no C library access")

public actual fun putcharUnlocked(c: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked not available on JVM — no C library access")

public actual fun stat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("stat not available on JVM — no C library access")

public actual fun fileno(stream: FILE?): Int =
    throw UnsupportedOperationException("fileno not available on JVM — no C library access")

public actual fun creat(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("creat not available on JVM — no C library access")

public actual fun fchown(fd: Int, owner: UShort, group: UShort): Int =
    throw UnsupportedOperationException("fchown not available on JVM — no C library access")

public actual fun access(path: String?, amode: Int): Int =
    throw UnsupportedOperationException("access not available on JVM — no C library access")

public actual fun fchdir(dirfd: Int): Int =
    throw UnsupportedOperationException("fchdir not available on JVM — no C library access")

public actual fun chown(path: String?, uid: UShort, gid: UShort): Int =
    throw UnsupportedOperationException("chown not available on JVM — no C library access")

public actual fun getgroups(ngroupsMax: Int, groups: UShort?): Int =
    throw UnsupportedOperationException("getgroups not available on JVM — no C library access")

public actual fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int =
    throw UnsupportedOperationException("getopt not available on JVM — no C library access")

public actual fun pause(): Int =
    throw UnsupportedOperationException("pause not available on JVM — no C library access")

public actual fun seteuid(uid: UShort): Int =
    throw UnsupportedOperationException("seteuid not available on JVM — no C library access")

public actual fun setegid(gid: UShort): Int =
    throw UnsupportedOperationException("setegid not available on JVM — no C library access")

public actual fun mlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("mlock not available on JVM — no C library access")

public actual fun mlockall(flags: Int): Int =
    throw UnsupportedOperationException("mlockall not available on JVM — no C library access")

public actual fun munlock(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munlock not available on JVM — no C library access")

public actual fun munlockall(): Int =
    throw UnsupportedOperationException("munlockall not available on JVM — no C library access")

public actual fun munmap(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("munmap not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun truncate(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, mode: Int): Int =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetdetachstate not available on JVM — no C library access")

public actual fun pthreadEqual(t1: ULong, t2: ULong): Int =
    throw UnsupportedOperationException("pthreadEqual not available on JVM — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun sigaddset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigaddset not available on JVM — no C library access")

public actual fun sigaction(signum: Int, act: Sigaction?, oldact: Sigaction?): Int =
    throw UnsupportedOperationException("sigaction not available on JVM — no C library access")

public actual fun utimes(filename: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("utimes not available on JVM — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun dlclose(handle: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlclose not available on JVM — no C library access")

public actual fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int =
    throw UnsupportedOperationException("dladdr not available on JVM — no C library access")

public actual fun gethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("gethostname not available on JVM — no C library access")

public actual fun usleep(secs: ULong): Int =
    throw UnsupportedOperationException("usleep not available on JVM — no C library access")

public actual fun putenv(string: String?): Int =
    throw UnsupportedOperationException("putenv not available on JVM — no C library access")

public actual fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("sigprocmask not available on JVM — no C library access")

public actual fun sigpending(set: ULong?): Int =
    throw UnsupportedOperationException("sigpending not available on JVM — no C library access")

public actual fun mkfifo(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("mkfifo not available on JVM — no C library access")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko not available on JVM — no C library access")

public actual fun mkstemp(template: String?): Int =
    throw UnsupportedOperationException("mkstemp not available on JVM — no C library access")

public actual fun setlogmask(maskpri: Int): Int =
    throw UnsupportedOperationException("setlogmask not available on JVM — no C library access")

public actual fun tcsetattr(fd: Int, optionalActions: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcsetattr not available on JVM — no C library access")

public actual fun tcgetattr(fd: Int, termios: Termios?): Int =
    throw UnsupportedOperationException("tcgetattr not available on JVM — no C library access")

public actual fun tcsendbreak(fd: Int, duration: Int): Int =
    throw UnsupportedOperationException("tcsendbreak not available on JVM — no C library access")

public actual fun fnmatch(pattern: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fnmatch not available on JVM — no C library access")

public actual fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int =
    throw UnsupportedOperationException("symlinkat not available on JVM — no C library access")

public actual fun fchmodat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("fchmodat not available on JVM — no C library access")

public actual fun utime(file: String?, buf: Utimbuf?): Int =
    throw UnsupportedOperationException("utime not available on JVM — no C library access")

public actual fun chdir(attr: String?): Int =
    throw UnsupportedOperationException("chdir not available on JVM — no C library access")

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrInit not available on JVM — no C library access")

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexattrDestroy not available on JVM — no C library access")

public actual fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSettype not available on JVM — no C library access")

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): Int =
    throw UnsupportedOperationException("pthreadMutexInit not available on JVM — no C library access")

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexDestroy not available on JVM — no C library access")

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexLock not available on JVM — no C library access")

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexTrylock not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexUnlock not available on JVM — no C library access")

public actual fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): Int =
    throw UnsupportedOperationException("pthreadAttrSetname not available on JVM — no C library access")

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstacksize not available on JVM — no C library access")

public actual fun pthreadAttrInit(attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrInit not available on JVM — no C library access")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on JVM — no C library access")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on JVM — no C library access")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on JVM — no C library access")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on JVM — no C library access")

public actual fun pthreadAttrDestroy(thread: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrDestroy not available on JVM — no C library access")

public actual fun pthreadDetach(thread: ULong): Int =
    throw UnsupportedOperationException("pthreadDetach not available on JVM — no C library access")

public actual fun fstat(fildes: Int, buf: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on JVM — no C library access")

public actual fun lstat(path: String?, buf: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on JVM — no C library access")

public actual fun ftruncate(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate not available on JVM — no C library access")

public actual fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("readdirR not available on JVM — no C library access")

public actual fun open(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on JVM — no C library access")

public actual fun poll(fds: Pollfd?, nfds: UInt, timeout: Int): Int =
    throw UnsupportedOperationException("poll not available on JVM — no C library access")

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrInit not available on JVM — no C library access")

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondattrDestroy not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int =
    throw UnsupportedOperationException("pthreadCondInit not available on JVM — no C library access")

public actual fun pthreadCondDestroy(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondDestroy not available on JVM — no C library access")

public actual fun pthreadCondSignal(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondSignal not available on JVM — no C library access")

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): Int =
    throw UnsupportedOperationException("pthreadCondBroadcast not available on JVM — no C library access")

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadCondWait not available on JVM — no C library access")

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrInit not available on JVM — no C library access")

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: UInt): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetmaxreaders not available on JVM — no C library access")

public actual fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): Int =
    throw UnsupportedOperationException("pthreadRwlockInit not available on JVM — no C library access")

public actual fun pthreadRwlockDestroy(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockDestroy not available on JVM — no C library access")

public actual fun pthreadRwlockRdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockRdlock not available on JVM — no C library access")

public actual fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTryrdlock not available on JVM — no C library access")

public actual fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock not available on JVM — no C library access")

public actual fun pthreadRwlockWrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockWrlock not available on JVM — no C library access")

public actual fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockTrywrlock not available on JVM — no C library access")

public actual fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock not available on JVM — no C library access")

public actual fun pthreadRwlockUnlock(attr: PthreadRwlockT?): Int =
    throw UnsupportedOperationException("pthreadRwlockUnlock not available on JVM — no C library access")

public actual fun pthreadKeyDelete(key: ULong): Int =
    throw UnsupportedOperationException("pthreadKeyDelete not available on JVM — no C library access")

public actual fun pthreadSetspecific(key: ULong, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetspecific not available on JVM — no C library access")

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwait not available on JVM — no C library access")

public actual fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetname not available on JVM — no C library access")

public actual fun pthreadJoin(thread: ULong, status: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJoin not available on JVM — no C library access")

public actual fun clockGettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockSettime(clockId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun clockGetres(clockId: Int, res: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockNanosleep(clockId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on JVM — no C library access")

public actual fun accept(s: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept not available on JVM — no C library access")

public actual fun bind(fd: Int, addr: Sockaddr?, len: UInt): Int =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun connect(s: Int, name: Sockaddr?, namelen: UInt): Int =
    throw UnsupportedOperationException("connect not available on JVM — no C library access")

public actual fun getpeername(s: Int, name: Sockaddr?, namelen: UInt?): Int =
    throw UnsupportedOperationException("getpeername not available on JVM — no C library access")

public actual fun getsockname(socket: Int, address: Sockaddr?, addressLen: UInt?): Int =
    throw UnsupportedOperationException("getsockname not available on JVM — no C library access")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt not available on JVM — no C library access")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen not available on JVM — no C library access")

public actual fun setsockopt(socket: Int, level: Int, name: Int, value: COpaquePointer?, optionLen: UInt): Int =
    throw UnsupportedOperationException("setsockopt not available on JVM — no C library access")

public actual fun shutdown(s: Int, how: Int): Int =
    throw UnsupportedOperationException("shutdown not available on JVM — no C library access")

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket not available on JVM — no C library access")

public actual fun ioctl(fd: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl not available on JVM — no C library access")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on JVM — no C library access")

public actual fun dup(src: Int): Int =
    throw UnsupportedOperationException("dup not available on JVM — no C library access")

public actual fun dup2(src: Int, dst: Int): Int =
    throw UnsupportedOperationException("dup2 not available on JVM — no C library access")

public actual fun pipe(fds: Int?): Int =
    throw UnsupportedOperationException("pipe not available on JVM — no C library access")

public actual fun unlink(pathname: String?): Int =
    throw UnsupportedOperationException("unlink not available on JVM — no C library access")

public actual fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo not available on JVM — no C library access")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: Int): Int =
    throw UnsupportedOperationException("setenv not available on JVM — no C library access")

public actual fun unsetenv(envVarName: String?): Int =
    throw UnsupportedOperationException("unsetenv not available on JVM — no C library access")

public actual fun link(src: String?, dst: String?): Int =
    throw UnsupportedOperationException("link not available on JVM — no C library access")

public actual fun symlink(path1: String?, path2: String?): Int =
    throw UnsupportedOperationException("symlink not available on JVM — no C library access")

public actual fun rmdir(path: String?): Int =
    throw UnsupportedOperationException("rmdir not available on JVM — no C library access")

public actual fun mkdir(dirName: String?, mode: Int): Int =
    throw UnsupportedOperationException("mkdir not available on JVM — no C library access")

public actual fun chmod(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("chmod not available on JVM — no C library access")

public actual fun fchmod(attr1: Int, attr2: Int): Int =
    throw UnsupportedOperationException("fchmod not available on JVM — no C library access")

public actual fun fsync(fd: Int): Int =
    throw UnsupportedOperationException("fsync not available on JVM — no C library access")

public actual fun closedir(ptr: DIR?): Int =
    throw UnsupportedOperationException("closedir not available on JVM — no C library access")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on JVM — no C library access")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on JVM — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on JVM — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on JVM — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on JVM — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on JVM — no C library access")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on JVM — no C library access")

public actual fun schedYield(): Int =
    throw UnsupportedOperationException("schedYield not available on JVM — no C library access")

public actual fun errnoSet(err: Int): Int =
    throw UnsupportedOperationException("errnoSet not available on JVM — no C library access")

public actual fun errnoGet(): Int =
    throw UnsupportedOperationException("errnoGet not available on JVM — no C library access")

public actual fun setgid(gid: UShort): Int =
    throw UnsupportedOperationException("setgid not available on JVM — no C library access")

public actual fun setuid(uid: UShort): Int =
    throw UnsupportedOperationException("setuid not available on JVM — no C library access")

public actual fun sigemptyset(set: ULong?): Int =
    throw UnsupportedOperationException("sigemptyset not available on JVM — no C library access")

public actual fun sigfillset(set: ULong?): Int =
    throw UnsupportedOperationException("sigfillset not available on JVM — no C library access")

public actual fun sigdelset(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigdelset not available on JVM — no C library access")

public actual fun sigismember(set: ULong?, signum: Int): Int =
    throw UnsupportedOperationException("sigismember not available on JVM — no C library access")

public actual fun pthreadSigmask(how: Int, set: ULong?, oset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun kill(pid: Int, signo: Int): Int =
    throw UnsupportedOperationException("kill not available on JVM — no C library access")

public actual fun taskKill(taskId: Int, signo: Int): Int =
    throw UnsupportedOperationException("taskKill not available on JVM — no C library access")

public actual fun raise(signo: Int): Int =
    throw UnsupportedOperationException("raise not available on JVM — no C library access")

public actual fun taskDelay(ticks: UInt): Int =
    throw UnsupportedOperationException("taskDelay not available on JVM — no C library access")

public actual fun taskNameSet(taskId: Int, taskName: String?): Int =
    throw UnsupportedOperationException("taskNameSet not available on JVM — no C library access")

public actual fun taskNameGet(taskId: Int, bufName: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("taskNameGet not available on JVM — no C library access")

public actual fun rtpInfoGet(rtpId: Int, rtpStruct: RTPDESC?): Int =
    throw UnsupportedOperationException("rtpInfoGet not available on JVM — no C library access")

public actual fun randBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randBytes not available on JVM — no C library access")

public actual fun randABytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randABytes not available on JVM — no C library access")

public actual fun randUBytes(buf: COpaquePointer?, length: Int): Int =
    throw UnsupportedOperationException("randUBytes not available on JVM — no C library access")

public actual fun randSecure(): Int =
    throw UnsupportedOperationException("randSecure not available on JVM — no C library access")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose not available on JVM — no C library access")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on JVM — no C library access")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on JVM — no C library access")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on JVM — no C library access")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on JVM — no C library access")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on JVM — no C library access")
