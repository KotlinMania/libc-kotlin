// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires N-API addon")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT, inheritsched: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched requires N-API addon")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires N-API addon")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires N-API addon")

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy requires N-API addon")

public actual fun pthreadAttrGetscope(attr: PthreadAttrT, contentionscope: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetscope requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires N-API addon")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires N-API addon")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires N-API addon")

public actual fun pthreadAttrSetscope(attr: PthreadAttrT, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetscope requires N-API addon")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires N-API addon")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadCleanupPop(execute: CInt): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPop requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadGetconcurrency(): CInt =
    throw UnsupportedOperationException("pthreadGetconcurrency requires N-API addon")

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun pthreadGetschedparam(thread: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun pthreadMutexattrGetprioceiling(attr: PthreadMutexattrT, prioceiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprioceiling requires N-API addon")

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robust: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires N-API addon")

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT, type: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGettype requires N-API addon")

public actual fun pthreadMutexattrSetprioceiling(attr: PthreadMutexattrT, prioceiling: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprioceiling requires N-API addon")

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robust: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires N-API addon")

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexGetprioceiling requires N-API addon")

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexSetprioceiling requires N-API addon")

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedrdlock requires N-API addon")

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadRwlockTimedwrlock requires N-API addon")

public actual fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadSetcancelstate requires N-API addon")

public actual fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt =
    throw UnsupportedOperationException("pthreadSetcanceltype requires N-API addon")

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetconcurrency requires N-API addon")

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires N-API addon")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadTestcancel(): COpaquePointer? =
    throw UnsupportedOperationException("pthreadTestcancel requires N-API addon")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun creat64(path: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat64 requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun endmntent(streamp: FILE?): CInt =
    throw UnsupportedOperationException("endmntent requires N-API addon")

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun endutent() {
    throw UnsupportedOperationException("endutent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun fattach(fildes: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fattach requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("ffsl requires N-API addon")

public actual fun ffsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("ffsll requires N-API addon")

public actual fun fgetgrent(file: FILE?): Group? =
    throw UnsupportedOperationException("fgetgrent requires N-API addon")

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fgetpos64 requires N-API addon")

public actual fun fgetpwent(file: FILE?): Passwd? =
    throw UnsupportedOperationException("fgetpwent requires N-API addon")


public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}


public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko64 requires N-API addon")

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fsetpos64 requires N-API addon")


public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("fstatfs64 requires N-API addon")

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("fstatvfs64 requires N-API addon")

public actual fun ftello64(stream: FILE?): Off64T =
    throw UnsupportedOperationException("ftello64 requires N-API addon")

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    throw UnsupportedOperationException("ftruncate64 requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun getcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("getcontext requires N-API addon")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun getgrset(user: String?): String? =
    throw UnsupportedOperationException("getgrset requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun getmntent(stream: FILE?): Mntent? =
    throw UnsupportedOperationException("getmntent requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid requires N-API addon")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
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

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires N-API addon")
}

public actual fun hasmntopt(mnt: Mntent?, opt: String?): String? =
    throw UnsupportedOperationException("hasmntopt requires N-API addon")

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate requires N-API addon")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy requires N-API addon")
}

public actual fun hsearch(entry: Entry, action: ACTION): Entry? =
    throw UnsupportedOperationException("hsearch requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires N-API addon")
}

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires N-API addon")
}

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("loadquery requires N-API addon")

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("lparGetInfo requires N-API addon")

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lparSetResources requires N-API addon")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    throw UnsupportedOperationException("lseek64 requires N-API addon")


public actual fun madvise(addr: CaddrT, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun mincore(addr: CaddrT, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires N-API addon")


public actual fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt =
    throw UnsupportedOperationException("pollsetCtl requires N-API addon")

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    throw UnsupportedOperationException("pollsetDestroy requires N-API addon")

public actual fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("pollsetPoll requires N-API addon")

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt =
    throw UnsupportedOperationException("pollsetQuery requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise64 requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pread64 requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun ptrace64(request: CInt, id: CLongLong, addr: CLongLong, data: CInt, buff: CInt?): CInt =
    throw UnsupportedOperationException("ptrace64 requires N-API addon")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: ULong, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwrite64 requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun quotactl(cmd: String?, special: CInt, id: CInt, data: CaddrT): CInt =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires N-API addon")
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: ULong?): CInt =
    throw UnsupportedOperationException("sctpOptInfo requires N-API addon")

public actual fun sctpPeeloff(s: CInt, id: CUInt?): CInt =
    throw UnsupportedOperationException("sctpPeeloff requires N-API addon")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("sendFile requires N-API addon")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun setcontext(ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("setcontext requires N-API addon")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun sethostid(hostid: CInt): CInt =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    throw UnsupportedOperationException("setmntent requires N-API addon")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent requires N-API addon")
}

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("splice requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 requires N-API addon")
}


public actual fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt =
    throw UnsupportedOperationException("stat64at requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    throw UnsupportedOperationException("statfs64 requires N-API addon")

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    throw UnsupportedOperationException("statvfs64 requires N-API addon")

public actual fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt =
    throw UnsupportedOperationException("statx requires N-API addon")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL requires N-API addon")

public actual fun strptime(s: String?, format: String?, tm: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    throw UnsupportedOperationException("swapcontext requires N-API addon")

public actual fun swapoff(path: String?): CInt =
    throw UnsupportedOperationException("swapoff requires N-API addon")

public actual fun swapon(path: String?): CInt =
    throw UnsupportedOperationException("swapon requires N-API addon")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun truncate64(path: String?, length: Off64T): CInt =
    throw UnsupportedOperationException("truncate64 requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun updwtmp(file: String?, u: Utmp?) {
    throw UnsupportedOperationException("updwtmp requires N-API addon")
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires N-API addon")


public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun pthreadCleanupPush(routine: ((COpaquePointer?) -> Unit)?, arg: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("pthreadCleanupPush requires N-API addon")

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadOnce requires N-API addon")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 requires N-API addon")

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    throw UnsupportedOperationException("freopen64 requires N-API addon")

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    throw UnsupportedOperationException("fstat64 requires N-API addon")

public actual fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt =
    throw UnsupportedOperationException("glob requires N-API addon")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind requires N-API addon")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch requires N-API addon")

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("lstat64 requires N-API addon")

public actual fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: CInt, vararg args: Any?) {
    throw UnsupportedOperationException("makecontext requires N-API addon")
}

public actual fun open64(path: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open64 requires N-API addon")

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    throw UnsupportedOperationException("stat64 requires N-API addon")
