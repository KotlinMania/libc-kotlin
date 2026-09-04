// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR requires N-API addon")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET requires N-API addon")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO requires N-API addon")
}

public actual fun dEXTRAFIRST(d: Dirent?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRAFIRST requires N-API addon")

public actual fun dEXTRAVALID(x: DirentExtra?, d: Dirent?): Boolean =
    throw UnsupportedOperationException("dEXTRAVALID requires N-API addon")

public actual fun dEXTRANEXT(x: DirentExtra?): DirentExtra? =
    throw UnsupportedOperationException("dEXTRANEXT requires N-API addon")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires N-API addon")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): String? =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires N-API addon")
}

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    throw UnsupportedOperationException("getpeereid requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent requires N-API addon")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent requires N-API addon")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires N-API addon")
}

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires N-API addon")
}

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun getdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires N-API addon")
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun umount(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun initgroups(user: String?, group: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires N-API addon")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer requires N-API addon")

public actual fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    throw UnsupportedOperationException("inotifyRmWatch requires N-API addon")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("inotifyInit requires N-API addon")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("inotifyAddWatch requires N-API addon")

public actual fun gettid(): PidT =
    throw UnsupportedOperationException("gettid requires N-API addon")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun mallopt(param: CInt, value: Long): CInt =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, bufsize: CInt, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regexec(preg: RegexT?, str: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree requires N-API addon")
}

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("dircntl requires N-API addon")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(operation: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocpb: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocpb: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun mqClose(mqdes: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqGetattr(mqdes: MqdT, mqstat: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqNotify(mqdes: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqReceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqSetattr(mqdes: MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun getErrnoPtr(): CInt? =
    throw UnsupportedOperationException("getErrnoPtr requires N-API addon")

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    throw UnsupportedOperationException("myThreadExit requires N-API addon")
}

