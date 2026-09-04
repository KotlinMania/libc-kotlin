// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

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

public actual fun sIGRTMAX(): CInt =
    throw UnsupportedOperationException("sIGRTMAX requires N-API addon")

public actual fun sIGRTMIN(): CInt =
    throw UnsupportedOperationException("sIGRTMIN requires N-API addon")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand requires N-API addon")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs requires N-API addon")
}

public actual fun stackGetbounds(sp: StackT?): CInt =
    throw UnsupportedOperationException("stackGetbounds requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent requires N-API addon")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent requires N-API addon")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires N-API addon")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(name: String?) {
    throw UnsupportedOperationException("setprogname requires N-API addon")
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex requires N-API addon")
}

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadGetnameNp(tid: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree requires N-API addon")
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT, fildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: PosixSpawnFileActionsT, lowfiledes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires N-API addon")

public actual fun posixSpawnFileActionsAddchdir(fileActions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, pgroup: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, pgroup: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, policy: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigignoreNp requires N-API addon")

public actual fun posixSpawnattrGetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigignoreNp requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir requires N-API addon")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimesat requires N-API addon")

public actual fun futimens(dirfd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

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

public actual fun accept4(fd: CInt, address: Sockaddr?, addressLen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun portCreate(): CInt =
    throw UnsupportedOperationException("portCreate requires N-API addon")

public actual fun portAssociate(port: CInt, source: CInt, `object`: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portAssociate requires N-API addon")

public actual fun portDissociate(port: CInt, source: CInt, `object`: UintptrT): CInt =
    throw UnsupportedOperationException("portDissociate requires N-API addon")

public actual fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("portGet requires N-API addon")

public actual fun portGetn(port: CInt, peList: PortEvent?, max: CUInt, nget: CUInt?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("portGetn requires N-API addon")

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portSend requires N-API addon")

public actual fun portSendn(portList: CInt?, errorList: CInt?, nent: CUInt, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portSendn requires N-API addon")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

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

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent requires N-API addon")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("makeutx requires N-API addon")

public actual fun modutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("modutx requires N-API addon")

public actual fun updwtmpx(file: String?, ut: Utmpx?) {
    throw UnsupportedOperationException("updwtmpx requires N-API addon")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun endutent() {
    throw UnsupportedOperationException("endutent requires N-API addon")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires N-API addon")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid requires N-API addon")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline requires N-API addon")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline requires N-API addon")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent requires N-API addon")
}

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    throw UnsupportedOperationException("getutmp requires N-API addon")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    throw UnsupportedOperationException("getutmpx requires N-API addon")
}

public actual fun updwtmp(file: String?, u: Utmp?) {
    throw UnsupportedOperationException("updwtmp requires N-API addon")
}

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun ucredGet(pid: PidT): UcredT =
    throw UnsupportedOperationException("ucredGet requires N-API addon")

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpeerucred requires N-API addon")

public actual fun ucredFree(ucred: UcredT) {
    throw UnsupportedOperationException("ucredFree requires N-API addon")
}

public actual fun ucredGetgroups(ucred: UcredT, groups: COpaquePointer?): CInt =
    throw UnsupportedOperationException("ucredGetgroups requires N-API addon")

public actual fun ucredGetpid(ucred: UcredT): PidT =
    throw UnsupportedOperationException("ucredGetpid requires N-API addon")

public actual fun ucredSize(): ULong =
    throw UnsupportedOperationException("ucredSize requires N-API addon")

public actual fun psetCreate(newpset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetCreate requires N-API addon")

public actual fun psetDestroy(pset: PsetidT): CInt =
    throw UnsupportedOperationException("psetDestroy requires N-API addon")

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetAssign requires N-API addon")

public actual fun psetInfo(pset: PsetidT, tpe: CInt?, numcpus: CUInt?, cpulist: ProcessoridT?): CInt =
    throw UnsupportedOperationException("psetInfo requires N-API addon")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetBind requires N-API addon")

public actual fun psetList(pset: PsetidT?, numpsets: CUInt?): CInt =
    throw UnsupportedOperationException("psetList requires N-API addon")

public actual fun psetSetattr(pset: PsetidT, attr: CUInt): CInt =
    throw UnsupportedOperationException("psetSetattr requires N-API addon")

public actual fun psetGetattr(pset: PsetidT, attr: CUInt?): CInt =
    throw UnsupportedOperationException("psetGetattr requires N-API addon")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: ProcessoridT?): CInt =
    throw UnsupportedOperationException("processorBind requires N-API addon")

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    throw UnsupportedOperationException("pOnline requires N-API addon")

public actual fun processorInfo(processorid: ProcessoridT, infop: ProcessorInfoT?): CInt =
    throw UnsupportedOperationException("processorInfo requires N-API addon")

public actual fun getexecname(): String? =
    throw UnsupportedOperationException("getexecname requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun setpflags(flags: CUInt, value: CUInt): CInt =
    throw UnsupportedOperationException("setpflags requires N-API addon")

public actual fun sysinfo(command: CInt, buf: String?, count: CLong): CInt =
    throw UnsupportedOperationException("sysinfo requires N-API addon")

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes requires N-API addon")

public actual fun mmapobj(fd: CInt, flags: CUInt, storage: MmapobjResultT?, elements: CUInt?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mmapobj requires N-API addon")

public actual fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUInt?, infoCount: CInt, outdata: ULong?, validity: CUInt?): CInt =
    throw UnsupportedOperationException("meminfo requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires N-API addon")
}

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUInt, nwait: CUInt?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioWaitn requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires N-API addon")
}

public actual fun secureGetenv(name: String?): String? =
    throw UnsupportedOperationException("secureGetenv requires N-API addon")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL requires N-API addon")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: OffT?, len: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: ULong?): SsizeT =
    throw UnsupportedOperationException("sendfilev requires N-API addon")

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    throw UnsupportedOperationException("lgrpFini requires N-API addon")

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    throw UnsupportedOperationException("lgrpAffinitySet requires N-API addon")

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: ProcessoridT?, count: CUInt, content: LgrpContentT): CInt =
    throw UnsupportedOperationException("lgrpCpus requires N-API addon")

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    throw UnsupportedOperationException("lgrpNlgrps requires N-API addon")

public actual fun lgrpVersion(version: CInt): CInt =
    throw UnsupportedOperationException("lgrpVersion requires N-API addon")

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: LgrpIdT?, count: CUInt, tpe: LgrpRsrcT): CInt =
    throw UnsupportedOperationException("lgrpResources requires N-API addon")

