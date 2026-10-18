package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires N-API addon")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun thrKill(id: UInt, sig: Int): Int =
    throw UnsupportedOperationException("thrKill requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched requires N-API addon")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires N-API addon")

public actual fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires N-API addon")

public actual fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy requires N-API addon")

public actual fun pthreadAttrGetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetscope requires N-API addon")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires N-API addon")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires N-API addon")

public actual fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires N-API addon")

public actual fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetscope requires N-API addon")

public actual fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun pthreadAttrSetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun pthreadCancel(thread: UInt): Int =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadCleanupPop(execute: Int): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPop requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Long?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Long): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadGetconcurrency(): Int =
    throw UnsupportedOperationException("pthreadGetconcurrency requires N-API addon")

public actual fun pthreadGetcpuclockid(threadId: UInt, clockId: Long?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun pthreadGetschedparam(thread: UInt, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadKill(thread: UInt, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun pthreadMutexattrGetprioceiling(attr: io.github.kotlinmania.libc.COpaquePointer?, prioceiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprioceiling requires N-API addon")

public actual fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires N-API addon")

public actual fun pthreadMutexattrGettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGettype requires N-API addon")

public actual fun pthreadMutexattrSetprioceiling(attr: io.github.kotlinmania.libc.COpaquePointer?, prioceiling: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprioceiling requires N-API addon")

public actual fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent requires N-API addon")

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexGetprioceiling requires N-API addon")

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: Int, oldCeiling: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexSetprioceiling requires N-API addon")

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires N-API addon")

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires N-API addon")

public actual fun pthreadSetcancelstate(state: Int, oldstate: Int?): Int =
    throw UnsupportedOperationException("pthreadSetcancelstate requires N-API addon")

public actual fun pthreadSetcanceltype(type: Int, oldtype: Int?): Int =
    throw UnsupportedOperationException("pthreadSetcanceltype requires N-API addon")

public actual fun pthreadSetconcurrency(newLevel: Int): Int =
    throw UnsupportedOperationException("pthreadSetconcurrency requires N-API addon")

public actual fun pthreadSetschedparam(thread: UInt, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadSetschedprio(thread: UInt, prio: Int): Int =
    throw UnsupportedOperationException("pthreadSetschedprio requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadTestcancel(): COpaquePointer? =
    throw UnsupportedOperationException("pthreadTestcancel requires N-API addon")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun aioCancel(fildes: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(list: COpaquePointer?, nent: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun clockGetcpuclockid(pid: Int, clkId: Long?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun clockGetres(clkId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(clkId: Long, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockSettime(clockId: Long, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun creat64(path: String?, mode: UInt): Int =
    throw UnsupportedOperationException("creat64 requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun duplocale(arg1: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun endmntent(streamp: FILE?): Int =
    throw UnsupportedOperationException("endmntent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun endutent(): Unit = throw UnsupportedOperationException("endutent requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun fattach(fildes: Int, path: String?): Int =
    throw UnsupportedOperationException("fattach requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun ffs(value: Int): Int =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun ffsl(value: Long): Int =
    throw UnsupportedOperationException("ffsl requires N-API addon")

public actual fun ffsll(value: Long): Int =
    throw UnsupportedOperationException("ffsll requires N-API addon")

public actual fun fgetgrent(file: FILE?): Group? =
    throw UnsupportedOperationException("fgetgrent requires N-API addon")

public actual fun fgetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fgetpos64 requires N-API addon")

public actual fun fgetpwent(file: FILE?): Passwd? =
    throw UnsupportedOperationException("fgetpwent requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko64 requires N-API addon")

public actual fun fsetpos64(stream: FILE?, ptr: Long?): Int =
    throw UnsupportedOperationException("fsetpos64 requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun fstatfs64(fd: Int, buf: Statfs64?): Int =
    throw UnsupportedOperationException("fstatfs64 requires N-API addon")

public actual fun fstatvfs64(fd: Int, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("fstatvfs64 requires N-API addon")

public actual fun ftello64(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello64 requires N-API addon")

public actual fun ftruncate64(fd: Int, length: Long): Int =
    throw UnsupportedOperationException("ftruncate64 requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun getcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("getcontext requires N-API addon")

public actual fun getdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun getgrset(user: String?): String? =
    throw UnsupportedOperationException("getgrset requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpeereid(socket: Int, euid: UInt?, egid: UInt?): Int =
    throw UnsupportedOperationException("getpeereid requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer requires N-API addon")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires N-API addon")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid requires N-API addon")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires N-API addon")

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires N-API addon")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate requires N-API addon")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy requires N-API addon")

public actual fun hsearch(entry: Entry, action: ACTION): Entry? =
    throw UnsupportedOperationException("hsearch requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nent: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun loadquery(flags: Int, buf: COpaquePointer?, buflen: UInt, vararg args: Any?): Int =
    throw UnsupportedOperationException("loadquery requires N-API addon")

public actual fun lparGetInfo(command: Int, buf: COpaquePointer?, bufsize: ULong): Int =
    throw UnsupportedOperationException("lparGetInfo requires N-API addon")

public actual fun lparSetResources(id: Int, resource: COpaquePointer?): Int =
    throw UnsupportedOperationException("lparSetResources requires N-API addon")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun lseek64(fd: Int, offset: Long, whence: Int): Long =
    throw UnsupportedOperationException("lseek64 requires N-API addon")

public actual fun madvise(addr: String?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun mincore(addr: String?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mount(device: String?, path: String?, flags: Int): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun pollsetCtl(ps: Int, pollctlArray: PollCtl?, arrayLength: Int): Int =
    throw UnsupportedOperationException("pollsetCtl requires N-API addon")

public actual fun pollsetDestroy(ps: Int): Int =
    throw UnsupportedOperationException("pollsetDestroy requires N-API addon")

public actual fun pollsetPoll(ps: Int, polldataArray: Pollfd?, arrayLength: Int, timeout: Int): Int =
    throw UnsupportedOperationException("pollsetPoll requires N-API addon")

public actual fun pollsetQuery(ps: Int, pollfdQuery: Pollfd?): Int =
    throw UnsupportedOperationException("pollsetQuery requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise64 requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: String?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: String?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: String?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: String?, fd: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: String?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun pread64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pread64 requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun ptrace64(request: Int, id: Long, addr: Long, data: Int, buff: Int?): Int =
    throw UnsupportedOperationException("ptrace64 requires N-API addon")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long =
    throw UnsupportedOperationException("pwrite64 requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun quotactl(cmd: String?, special: Int, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun recvmsg(sockfd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree requires N-API addon")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sctpOptInfo(sd: Int, id: UInt, opt: Int, argSize: COpaquePointer?, size: ULong?): Int =
    throw UnsupportedOperationException("sctpOptInfo requires N-API addon")

public actual fun sctpPeeloff(s: Int, id: UInt?): Int =
    throw UnsupportedOperationException("sctpPeeloff requires N-API addon")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun semClose(sem: Int?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semDestroy(sem: Int?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semGetvalue(sem: Int?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun semInit(sem: Int?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): Int? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semTimedwait(sem: Int?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semget(key: Int, nsems: Int, semflag: Int): Int =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun sendFile(socket: Int?, iobuf: SfParms?, flags: UInt): Long =
    throw UnsupportedOperationException("sendFile requires N-API addon")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun sendmsg(sockfd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun setcontext(ucp: UcontextT?): Int =
    throw UnsupportedOperationException("setcontext requires N-API addon")

public actual fun setdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun sethostid(hostid: Int): Int =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, priority: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun splice(socket1: Int, socket2: Int, flags: Int): Int =
    throw UnsupportedOperationException("splice requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 requires N-API addon")

public actual fun stat64at(dirfd: Int, path: String?, buf: Stat64?, flags: Int): Int =
    throw UnsupportedOperationException("stat64at requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun statfs64(path: String?, buf: Statfs64?): Int =
    throw UnsupportedOperationException("statfs64 requires N-API addon")

public actual fun statvfs64(path: String?, buf: Statvfs64?): Int =
    throw UnsupportedOperationException("statvfs64 requires N-API addon")

public actual fun statx(path: String?, buf: Stat?, length: Int, command: Int): Int =
    throw UnsupportedOperationException("statx requires N-API addon")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strcasecmpL requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strncasecmpL requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): Int =
    throw UnsupportedOperationException("swapcontext requires N-API addon")

public actual fun swapoff(path: String?): Int =
    throw UnsupportedOperationException("swapoff requires N-API addon")

public actual fun swapon(path: String?): Int =
    throw UnsupportedOperationException("swapon requires N-API addon")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun timerCreate(clockid: Long, sevp: Sigevent?, timerid: Long?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: Long): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: Long): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: Long, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: Long, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun truncate64(path: String?, length: Long): Int =
    throw UnsupportedOperationException("truncate64 requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun updwtmp(file: String?, u: Utmp?): Unit = throw UnsupportedOperationException("updwtmp requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPush requires N-API addon")

public actual fun pthreadCreate(thread: UInt?, attr: io.github.kotlinmania.libc.COpaquePointer?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadOnce requires N-API addon")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 requires N-API addon")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 requires N-API addon")

public actual fun fstat64(fildes: Int, buf: Stat64?): Int =
    throw UnsupportedOperationException("fstat64 requires N-API addon")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires N-API addon")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires N-API addon")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires N-API addon")

public actual fun lstat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("lstat64 requires N-API addon")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?): Unit = throw UnsupportedOperationException("makecontext requires N-API addon")

public actual fun open64(path: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open64 requires N-API addon")

public actual fun stat64(path: String?, buf: Stat64?): Int =
    throw UnsupportedOperationException("stat64 requires N-API addon")
