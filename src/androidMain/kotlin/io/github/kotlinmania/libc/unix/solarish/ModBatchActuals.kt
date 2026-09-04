// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on Android host — use androidNative target for FFI")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on Android host — use androidNative target for FFI")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on Android host — use androidNative target for FFI")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on Android host — use androidNative target for FFI")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on Android host — use androidNative target for FFI")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on Android host — use androidNative target for FFI")
}

public actual fun sIGRTMAX(): CInt =
    throw UnsupportedOperationException("sIGRTMAX not available on Android host — use androidNative target for FFI")

public actual fun sIGRTMIN(): CInt =
    throw UnsupportedOperationException("sIGRTMIN not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on Android host — use androidNative target for FFI")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on Android host — use androidNative target for FFI")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun acct(filename: String?): CInt =
    throw UnsupportedOperationException("acct not available on Android host — use androidNative target for FFI")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on Android host — use androidNative target for FFI")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("settimeofday not available on Android host — use androidNative target for FFI")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs not available on Android host — use androidNative target for FFI")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs not available on Android host — use androidNative target for FFI")
}

public actual fun stackGetbounds(sp: StackT?): CInt =
    throw UnsupportedOperationException("stackGetbounds not available on Android host — use androidNative target for FFI")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on Android host — use androidNative target for FFI")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on Android host — use androidNative target for FFI")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on Android host — use androidNative target for FFI")

public actual fun ioctl(fildes: CInt, request: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on Android host — use androidNative target for FFI")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on Android host — use androidNative target for FFI")

public actual fun errno(): CInt? =
    throw UnsupportedOperationException("errno not available on Android host — use androidNative target for FFI")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on Android host — use androidNative target for FFI")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on Android host — use androidNative target for FFI")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on Android host — use androidNative target for FFI")
}

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on Android host — use androidNative target for FFI")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on Android host — use androidNative target for FFI")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on Android host — use androidNative target for FFI")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on Android host — use androidNative target for FFI")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on Android host — use androidNative target for FFI")

public actual fun setprogname(name: String?) {
    throw UnsupportedOperationException("setprogname not available on Android host — use androidNative target for FFI")
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getloadavg not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname not available on Android host — use androidNative target for FFI")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on Android host — use androidNative target for FFI")

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    throw UnsupportedOperationException("ifFreenameindex not available on Android host — use androidNative target for FFI")
}

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetnameNp(tid: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on Android host — use androidNative target for FFI")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on Android host — use androidNative target for FFI")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on Android host — use androidNative target for FFI")
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on Android host — use androidNative target for FFI")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT, fildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: PosixSpawnFileActionsT, lowfiledes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddchdir(fileActions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, pgroup: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, pgroup: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, policy: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigignoreNp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigignoreNp(attr: PosixSpawnattrT, sigignore: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigignoreNp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on Android host — use androidNative target for FFI")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on Android host — use androidNative target for FFI")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on Android host — use androidNative target for FFI")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on Android host — use androidNative target for FFI")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on Android host — use androidNative target for FFI")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("futimesat not available on Android host — use androidNative target for FFI")

public actual fun futimens(dirfd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on Android host — use androidNative target for FFI")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on Android host — use androidNative target for FFI")

public actual fun accept4(fd: CInt, address: Sockaddr?, addressLen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on Android host — use androidNative target for FFI")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on Android host — use androidNative target for FFI")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on Android host — use androidNative target for FFI")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on Android host — use androidNative target for FFI")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on Android host — use androidNative target for FFI")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on Android host — use androidNative target for FFI")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on Android host — use androidNative target for FFI")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on Android host — use androidNative target for FFI")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on Android host — use androidNative target for FFI")

public actual fun portCreate(): CInt =
    throw UnsupportedOperationException("portCreate not available on Android host — use androidNative target for FFI")

public actual fun portAssociate(port: CInt, source: CInt, `object`: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portAssociate not available on Android host — use androidNative target for FFI")

public actual fun portDissociate(port: CInt, source: CInt, `object`: UintptrT): CInt =
    throw UnsupportedOperationException("portDissociate not available on Android host — use androidNative target for FFI")

public actual fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("portGet not available on Android host — use androidNative target for FFI")

public actual fun portGetn(port: CInt, peList: PortEvent?, max: CUInt, nget: CUInt?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("portGetn not available on Android host — use androidNative target for FFI")

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portSend not available on Android host — use androidNative target for FFI")

public actual fun portSendn(portList: CInt?, errorList: CInt?, nent: CUInt, events: CInt, user: COpaquePointer?): CInt =
    throw UnsupportedOperationException("portSendn not available on Android host — use androidNative target for FFI")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on Android host — use androidNative target for FFI")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on Android host — use androidNative target for FFI")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on Android host — use androidNative target for FFI")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on Android host — use androidNative target for FFI")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on Android host — use androidNative target for FFI")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on Android host — use androidNative target for FFI")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on Android host — use androidNative target for FFI")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on Android host — use androidNative target for FFI")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on Android host — use androidNative target for FFI")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMin not available on Android host — use androidNative target for FFI")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    throw UnsupportedOperationException("schedGetPriorityMax not available on Android host — use androidNative target for FFI")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on Android host — use androidNative target for FFI")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on Android host — use androidNative target for FFI")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on Android host — use androidNative target for FFI")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on Android host — use androidNative target for FFI")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on Android host — use androidNative target for FFI")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on Android host — use androidNative target for FFI")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on Android host — use androidNative target for FFI")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on Android host — use androidNative target for FFI")

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on Android host — use androidNative target for FFI")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on Android host — use androidNative target for FFI")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on Android host — use androidNative target for FFI")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on Android host — use androidNative target for FFI")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on Android host — use androidNative target for FFI")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on Android host — use androidNative target for FFI")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on Android host — use androidNative target for FFI")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on Android host — use androidNative target for FFI")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on Android host — use androidNative target for FFI")

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("makeutx not available on Android host — use androidNative target for FFI")

public actual fun modutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("modutx not available on Android host — use androidNative target for FFI")

public actual fun updwtmpx(file: String?, ut: Utmpx?) {
    throw UnsupportedOperationException("updwtmpx not available on Android host — use androidNative target for FFI")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on Android host — use androidNative target for FFI")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on Android host — use androidNative target for FFI")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on Android host — use androidNative target for FFI")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on Android host — use androidNative target for FFI")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on Android host — use androidNative target for FFI")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on Android host — use androidNative target for FFI")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on Android host — use androidNative target for FFI")
}

public actual fun endutent() {
    throw UnsupportedOperationException("endutent not available on Android host — use androidNative target for FFI")
}

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on Android host — use androidNative target for FFI")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid not available on Android host — use androidNative target for FFI")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline not available on Android host — use androidNative target for FFI")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline not available on Android host — use androidNative target for FFI")

public actual fun setutent() {
    throw UnsupportedOperationException("setutent not available on Android host — use androidNative target for FFI")
}

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname not available on Android host — use androidNative target for FFI")

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    throw UnsupportedOperationException("getutmp not available on Android host — use androidNative target for FFI")
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    throw UnsupportedOperationException("getutmpx not available on Android host — use androidNative target for FFI")
}

public actual fun updwtmp(file: String?, u: Utmp?) {
    throw UnsupportedOperationException("updwtmp not available on Android host — use androidNative target for FFI")
}

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime not available on Android host — use androidNative target for FFI")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime not available on Android host — use androidNative target for FFI")

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT?): CInt =
    throw UnsupportedOperationException("timerCreate not available on Android host — use androidNative target for FFI")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete not available on Android host — use androidNative target for FFI")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun not available on Android host — use androidNative target for FFI")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime not available on Android host — use androidNative target for FFI")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime not available on Android host — use androidNative target for FFI")

public actual fun ucredGet(pid: PidT): UcredT =
    throw UnsupportedOperationException("ucredGet not available on Android host — use androidNative target for FFI")

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpeerucred not available on Android host — use androidNative target for FFI")

public actual fun ucredFree(ucred: UcredT) {
    throw UnsupportedOperationException("ucredFree not available on Android host — use androidNative target for FFI")
}

public actual fun ucredGetgroups(ucred: UcredT, groups: COpaquePointer?): CInt =
    throw UnsupportedOperationException("ucredGetgroups not available on Android host — use androidNative target for FFI")

public actual fun ucredGetpid(ucred: UcredT): PidT =
    throw UnsupportedOperationException("ucredGetpid not available on Android host — use androidNative target for FFI")

public actual fun ucredSize(): ULong =
    throw UnsupportedOperationException("ucredSize not available on Android host — use androidNative target for FFI")

public actual fun psetCreate(newpset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetCreate not available on Android host — use androidNative target for FFI")

public actual fun psetDestroy(pset: PsetidT): CInt =
    throw UnsupportedOperationException("psetDestroy not available on Android host — use androidNative target for FFI")

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetAssign not available on Android host — use androidNative target for FFI")

public actual fun psetInfo(pset: PsetidT, tpe: CInt?, numcpus: CUInt?, cpulist: ProcessoridT?): CInt =
    throw UnsupportedOperationException("psetInfo not available on Android host — use androidNative target for FFI")

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: PsetidT?): CInt =
    throw UnsupportedOperationException("psetBind not available on Android host — use androidNative target for FFI")

public actual fun psetList(pset: PsetidT?, numpsets: CUInt?): CInt =
    throw UnsupportedOperationException("psetList not available on Android host — use androidNative target for FFI")

public actual fun psetSetattr(pset: PsetidT, attr: CUInt): CInt =
    throw UnsupportedOperationException("psetSetattr not available on Android host — use androidNative target for FFI")

public actual fun psetGetattr(pset: PsetidT, attr: CUInt?): CInt =
    throw UnsupportedOperationException("psetGetattr not available on Android host — use androidNative target for FFI")

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: ProcessoridT?): CInt =
    throw UnsupportedOperationException("processorBind not available on Android host — use androidNative target for FFI")

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    throw UnsupportedOperationException("pOnline not available on Android host — use androidNative target for FFI")

public actual fun processorInfo(processorid: ProcessoridT, infop: ProcessorInfoT?): CInt =
    throw UnsupportedOperationException("processorInfo not available on Android host — use androidNative target for FFI")

public actual fun getexecname(): String? =
    throw UnsupportedOperationException("getexecname not available on Android host — use androidNative target for FFI")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on Android host — use androidNative target for FFI")

public actual fun setpflags(flags: CUInt, value: CUInt): CInt =
    throw UnsupportedOperationException("setpflags not available on Android host — use androidNative target for FFI")

public actual fun sysinfo(command: CInt, buf: String?, count: CLong): CInt =
    throw UnsupportedOperationException("sysinfo not available on Android host — use androidNative target for FFI")

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on Android host — use androidNative target for FFI")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize not available on Android host — use androidNative target for FFI")

public actual fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes not available on Android host — use androidNative target for FFI")

public actual fun mmapobj(fd: CInt, flags: CUInt, storage: MmapobjResultT?, elements: CUInt?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mmapobj not available on Android host — use androidNative target for FFI")

public actual fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUInt?, infoCount: CInt, outdata: ULong?, validity: CUInt?): CInt =
    throw UnsupportedOperationException("meminfo not available on Android host — use androidNative target for FFI")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep not available on Android host — use androidNative target for FFI")

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    throw UnsupportedOperationException("backtrace not available on Android host — use androidNative target for FFI")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on Android host — use androidNative target for FFI")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd not available on Android host — use androidNative target for FFI")
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong not available on Android host — use androidNative target for FFI")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on Android host — use androidNative target for FFI")
}

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUInt, nwait: CUInt?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioWaitn not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong) {
    throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")
}

public actual fun secureGetenv(name: String?): String? =
    throw UnsupportedOperationException("secureGetenv not available on Android host — use androidNative target for FFI")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: LocaleT): ULong =
    throw UnsupportedOperationException("strftimeL not available on Android host — use androidNative target for FFI")

public actual fun sendfile(outFd: CInt, inFd: CInt, off: OffT?, len: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile not available on Android host — use androidNative target for FFI")

public actual fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: ULong?): SsizeT =
    throw UnsupportedOperationException("sendfilev not available on Android host — use androidNative target for FFI")

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    throw UnsupportedOperationException("lgrpFini not available on Android host — use androidNative target for FFI")

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    throw UnsupportedOperationException("lgrpAffinitySet not available on Android host — use androidNative target for FFI")

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: ProcessoridT?, count: CUInt, content: LgrpContentT): CInt =
    throw UnsupportedOperationException("lgrpCpus not available on Android host — use androidNative target for FFI")

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    throw UnsupportedOperationException("lgrpNlgrps not available on Android host — use androidNative target for FFI")

public actual fun lgrpVersion(version: CInt): CInt =
    throw UnsupportedOperationException("lgrpVersion not available on Android host — use androidNative target for FFI")

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: LgrpIdT?, count: CUInt, tpe: LgrpRsrcT): CInt =
    throw UnsupportedOperationException("lgrpResources not available on Android host — use androidNative target for FFI")

