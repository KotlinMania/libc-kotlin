// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")
}

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on JVM — no C library access")
}

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on JVM — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill not available on JVM — no C library access")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT, inheritsched: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched not available on JVM — no C library access")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on JVM — no C library access")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on JVM — no C library access")

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy not available on JVM — no C library access")

public actual fun pthreadAttrGetscope(attr: PthreadAttrT, contentionscope: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetscope not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched not available on JVM — no C library access")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on JVM — no C library access")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy not available on JVM — no C library access")

public actual fun pthreadAttrSetscope(attr: PthreadAttrT, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetscope not available on JVM — no C library access")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack not available on JVM — no C library access")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on JVM — no C library access")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on JVM — no C library access")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on JVM — no C library access")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on JVM — no C library access")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on JVM — no C library access")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on JVM — no C library access")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit not available on JVM — no C library access")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait not available on JVM — no C library access")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel not available on JVM — no C library access")

public actual fun pthreadCleanupPop(execute: CInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPop not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on JVM — no C library access")

public actual fun pthreadGetconcurrency(): CInt =
    throw UnsupportedOperationException("pthreadGetconcurrency not available on JVM — no C library access")

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on JVM — no C library access")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on JVM — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun pthreadMutexattrGetprioceiling(attr: PthreadMutexattrT, prioceiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprioceiling not available on JVM — no C library access")

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol not available on JVM — no C library access")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on JVM — no C library access")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robust: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on JVM — no C library access")

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT, type: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGettype not available on JVM — no C library access")

public actual fun pthreadMutexattrSetprioceiling(attr: PthreadMutexattrT, prioceiling: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprioceiling not available on JVM — no C library access")

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol not available on JVM — no C library access")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on JVM — no C library access")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robust: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on JVM — no C library access")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on JVM — no C library access")

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexGetprioceiling not available on JVM — no C library access")

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexSetprioceiling not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on JVM — no C library access")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on JVM — no C library access")

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock not available on JVM — no C library access")

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock not available on JVM — no C library access")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadSetcancelstate not available on JVM — no C library access")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt =
    throw UnsupportedOperationException("pthreadSetcanceltype not available on JVM — no C library access")

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetconcurrency not available on JVM — no C library access")

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on JVM — no C library access")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio not available on JVM — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun pthreadTestcancel(): COpaquePointer? =
    throw UnsupportedOperationException("pthreadTestcancel not available on JVM — no C library access")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on JVM — no C library access")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose not available on JVM — no C library access")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct not available on JVM — no C library access")

public actual fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on JVM — no C library access")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv not available on JVM — no C library access")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid not available on JVM — no C library access")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat64 not available on JVM — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on JVM — no C library access")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on JVM — no C library access")
}

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent not available on JVM — no C library access")

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on JVM — no C library access")
}

public actual fun endutent() {
    throw UnsupportedOperationException("endutent not available on JVM — no C library access")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on JVM — no C library access")
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach not available on JVM — no C library access")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on JVM — no C library access")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on JVM — no C library access")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("ffs not available on JVM — no C library access")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("ffsl not available on JVM — no C library access")

public actual fun ffsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("ffsll not available on JVM — no C library access")

public actual fun fgetgrent(file: FILE?): Group? =
    throw UnsupportedOperationException("fgetgrent not available on JVM — no C library access")

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fgetpos64 not available on JVM — no C library access")

public actual fun fgetpwent(file: FILE?): Passwd? =
    throw UnsupportedOperationException("fgetpwent not available on JVM — no C library access")


public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}


public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 not available on JVM — no C library access")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 not available on JVM — no C library access")


public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("fstatfs64 not available on JVM — no C library access")

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("fstatvfs64 not available on JVM — no C library access")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 not available on JVM — no C library access")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("ftruncate64 not available on JVM — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext not available on JVM — no C library access")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname not available on JVM — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on JVM — no C library access")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun getgrset(user: String?): String? =
    throw UnsupportedOperationException("getgrset not available on JVM — no C library access")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on JVM — no C library access")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize not available on JVM — no C library access")

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid not available on JVM — no C library access")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on JVM — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer not available on JVM — no C library access")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on JVM — no C library access")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid not available on JVM — no C library access")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline not available on JVM — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on JVM — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on JVM — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on JVM — no C library access")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on JVM — no C library access")
}

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt not available on JVM — no C library access")

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate not available on JVM — no C library access")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy not available on JVM — no C library access")
}

public actual fun hsearch(entry: Entry, action: ACTION): Entry? =
    throw UnsupportedOperationException("hsearch not available on JVM — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex not available on JVM — no C library access")
}

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on JVM — no C library access")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 not available on JVM — no C library access")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 not available on JVM — no C library access")
}

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("loadquery not available on JVM — no C library access")

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("lparGetInfo not available on JVM — no C library access")

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lparSetResources not available on JVM — no C library access")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 not available on JVM — no C library access")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("lseek64 not available on JVM — no C library access")


public actual fun madvise(addr: CaddrT, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on JVM — no C library access")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS not available on JVM — no C library access")

public actual fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on JVM — no C library access")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on JVM — no C library access")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify not available on JVM — no C library access")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on JVM — no C library access")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on JVM — no C library access")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on JVM — no C library access")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on JVM — no C library access")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on JVM — no C library access")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on JVM — no C library access")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on JVM — no C library access")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 not available on JVM — no C library access")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl not available on JVM — no C library access")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget not available on JVM — no C library access")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv not available on JVM — no C library access")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on JVM — no C library access")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 not available on JVM — no C library access")


public actual fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt =
    throw UnsupportedOperationException("pollsetCtl not available on JVM — no C library access")

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    throw UnsupportedOperationException("pollsetDestroy not available on JVM — no C library access")

public actual fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("pollsetPoll not available on JVM — no C library access")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt =
    throw UnsupportedOperationException("pollsetQuery not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on JVM — no C library access")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise64 not available on JVM — no C library access")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on JVM — no C library access")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 not available on JVM — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on JVM — no C library access")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on JVM — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on JVM — no C library access")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on JVM — no C library access")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on JVM — no C library access")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on JVM — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on JVM — no C library access")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on JVM — no C library access")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on JVM — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on JVM — no C library access")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on JVM — no C library access")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on JVM — no C library access")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pread64 not available on JVM — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun ptrace64(request: CInt, id: CLongLong, addr: CLongLong, data: CInt, buff: CInt?): CInt =
    throw UnsupportedOperationException("ptrace64 not available on JVM — no C library access")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline not available on JVM — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on JVM — no C library access")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwrite64 not available on JVM — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun quotactl(cmd: String?, special: CInt, id: CInt, data: CaddrT): CInt =
    throw UnsupportedOperationException("quotactl not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg not available on JVM — no C library access")

public actual fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp not available on JVM — no C library access")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on JVM — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec not available on JVM — no C library access")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree not available on JVM — no C library access")
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on JVM — no C library access")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on JVM — no C library access")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on JVM — no C library access")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on JVM — no C library access")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on JVM — no C library access")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on JVM — no C library access")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on JVM — no C library access")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: ULong?): CInt =
    throw UnsupportedOperationException("sctpOptInfo not available on JVM — no C library access")

public actual fun sctpPeeloff(s: CInt, id: CUInt?): CInt =
    throw UnsupportedOperationException("sctpPeeloff not available on JVM — no C library access")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on JVM — no C library access")
}

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("sendFile not available on JVM — no C library access")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg not available on JVM — no C library access")

public actual fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext not available on JVM — no C library access")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname not available on JVM — no C library access")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on JVM — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on JVM — no C library access")
}

public actual fun sethostid(hostid: CInt): CInt =
    throw UnsupportedOperationException("sethostid not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent not available on JVM — no C library access")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on JVM — no C library access")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on JVM — no C library access")
}

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer not available on JVM — no C library access")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent not available on JVM — no C library access")
}

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on JVM — no C library access")
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on JVM — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("splice not available on JVM — no C library access")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on JVM — no C library access")
}

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 not available on JVM — no C library access")
}


public actual fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt =
    throw UnsupportedOperationException("stat64at not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("statfs64 not available on JVM — no C library access")

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("statvfs64 not available on JVM — no C library access")

public actual fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt =
    throw UnsupportedOperationException("statx not available on JVM — no C library access")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on JVM — no C library access")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL not available on JVM — no C library access")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on JVM — no C library access")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep not available on JVM — no C library access")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext not available on JVM — no C library access")

public actual fun swapoff(path: String?): CInt =
    throw UnsupportedOperationException("swapoff not available on JVM — no C library access")

public actual fun swapon(path: String?): CInt =
    throw UnsupportedOperationException("swapon not available on JVM — no C library access")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on JVM — no C library access")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate not available on JVM — no C library access")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete not available on JVM — no C library access")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun not available on JVM — no C library access")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime not available on JVM — no C library access")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime not available on JVM — no C library access")

public actual fun truncate64(path: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("truncate64 not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun updwtmp(file: String?, u: Utmp?) {
    throw UnsupportedOperationException("updwtmp not available on JVM — no C library access")
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname not available on JVM — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno not available on JVM — no C library access")


public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork not available on JVM — no C library access")

public actual fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPush not available on JVM — no C library access")

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadOnce not available on JVM — no C library access")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 not available on JVM — no C library access")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 not available on JVM — no C library access")

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    throw UnsupportedOperationException("fstat64 not available on JVM — no C library access")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob not available on JVM — no C library access")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind not available on JVM — no C library access")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch not available on JVM — no C library access")

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("lstat64 not available on JVM — no C library access")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: CInt, vararg args: Any?) {
    throw UnsupportedOperationException("makecontext not available on JVM — no C library access")
}

public actual fun open64(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open64 not available on JVM — no C library access")

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("stat64 not available on JVM — no C library access")
