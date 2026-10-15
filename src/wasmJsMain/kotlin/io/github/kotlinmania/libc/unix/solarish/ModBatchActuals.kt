// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun fDCLR(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR requires N-API addon")

public actual fun fDISSET(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET requires N-API addon")

public actual fun fDSET(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET requires N-API addon")

public actual fun fDZERO(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO requires N-API addon")

public actual fun sIGRTMAX(): Int =
    throw UnsupportedOperationException("sIGRTMAX requires N-API addon")

public actual fun sIGRTMIN(): Int =
    throw UnsupportedOperationException("sIGRTMIN requires N-API addon")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs requires N-API addon")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs requires N-API addon")

public actual fun stackGetbounds(sp: StackT?): Int =
    throw UnsupportedOperationException("stackGetbounds requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno requires N-API addon")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent requires N-API addon")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent requires N-API addon")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname requires N-API addon")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg requires N-API addon")

public actual fun getpriority(which: Int, who: Int): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: Int, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex requires N-API addon")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadGetnameNp(tid: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(tid: UInt, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun waitid(idtype: UInt, id: Int, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnFileActionsInit(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, newfildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, lowfiledes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires N-API addon")

public actual fun posixSpawnFileActionsAddchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir requires N-API addon")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigignoreNp requires N-API addon")

public actual fun posixSpawnattrGetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigignoreNp requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun futimesat(fd: Int, path: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("futimesat requires N-API addon")

public actual fun futimens(dirfd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg requires N-API addon")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg requires N-API addon")

public actual fun accept4(fd: Int, address: Sockaddr?, addressLen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqClose(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqSend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun portCreate(): Int =
    throw UnsupportedOperationException("portCreate requires N-API addon")

public actual fun portAssociate(port: Int, source: Int, `object`: ULong, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portAssociate requires N-API addon")

public actual fun portDissociate(port: Int, source: Int, `object`: ULong): Int =
    throw UnsupportedOperationException("portDissociate requires N-API addon")

public actual fun portGet(port: Int, pe: PortEvent?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGet requires N-API addon")

public actual fun portGetn(port: Int, peList: PortEvent?, max: UInt, nget: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGetn requires N-API addon")

public actual fun portSend(port: Int, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSend requires N-API addon")

public actual fun portSendn(portList: Int?, errorList: Int?, nent: UInt, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSendn requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun pthreadKill(thread: UInt, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR requires N-API addon")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR requires N-API addon")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen requires N-API addon")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("makeutx requires N-API addon")

public actual fun modutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("modutx requires N-API addon")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Unit = throw UnsupportedOperationException("updwtmpx requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun endutent(): Unit = throw UnsupportedOperationException("endutent requires N-API addon")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires N-API addon")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid requires N-API addon")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline requires N-API addon")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline requires N-API addon")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent requires N-API addon")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun getutmp(ux: Utmpx?, u: Utmp?): Unit = throw UnsupportedOperationException("getutmp requires N-API addon")

public actual fun getutmpx(u: Utmp?, ux: Utmpx?): Unit = throw UnsupportedOperationException("getutmpx requires N-API addon")

public actual fun updwtmp(file: String?, u: Utmp?): Unit = throw UnsupportedOperationException("updwtmp requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: Int?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: Int): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: Int): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: Int, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: Int, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun ucredGet(pid: Int): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("ucredGet requires N-API addon")

public actual fun getpeerucred(fd: Int, ucred: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpeerucred requires N-API addon")

public actual fun ucredFree(ucred: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("ucredFree requires N-API addon")

public actual fun ucredGetgroups(ucred: io.github.kotlinmania.libc.COpaquePointer?, groups: COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetgroups requires N-API addon")

public actual fun ucredGetpid(ucred: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetpid requires N-API addon")

public actual fun ucredSize(): ULong =
    throw UnsupportedOperationException("ucredSize requires N-API addon")

public actual fun psetCreate(newpset: Int?): Int =
    throw UnsupportedOperationException("psetCreate requires N-API addon")

public actual fun psetDestroy(pset: Int): Int =
    throw UnsupportedOperationException("psetDestroy requires N-API addon")

public actual fun psetAssign(pset: Int, cpu: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetAssign requires N-API addon")

public actual fun psetInfo(pset: Int, tpe: Int?, numcpus: UInt?, cpulist: Int?): Int =
    throw UnsupportedOperationException("psetInfo requires N-API addon")

public actual fun psetBind(pset: Int, idtype: UInt, id: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetBind requires N-API addon")

public actual fun psetList(pset: Int?, numpsets: UInt?): Int =
    throw UnsupportedOperationException("psetList requires N-API addon")

public actual fun psetSetattr(pset: Int, attr: UInt): Int =
    throw UnsupportedOperationException("psetSetattr requires N-API addon")

public actual fun psetGetattr(pset: Int, attr: UInt?): Int =
    throw UnsupportedOperationException("psetGetattr requires N-API addon")

public actual fun processorBind(idtype: UInt, id: Int, newBinding: Int, oldBinding: Int?): Int =
    throw UnsupportedOperationException("processorBind requires N-API addon")

public actual fun pOnline(processorid: Int, flag: Int): Int =
    throw UnsupportedOperationException("pOnline requires N-API addon")

public actual fun processorInfo(processorid: Int, infop: ProcessorInfoT?): Int =
    throw UnsupportedOperationException("processorInfo requires N-API addon")

public actual fun getexecname(): String? =
    throw UnsupportedOperationException("getexecname requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun setpflags(flags: UInt, value: UInt): Int =
    throw UnsupportedOperationException("setpflags requires N-API addon")

public actual fun sysinfo(command: Int, buf: String?, count: Long): Int =
    throw UnsupportedOperationException("sysinfo requires N-API addon")

public actual fun faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes requires N-API addon")

public actual fun mmapobj(fd: Int, flags: UInt, storage: MmapobjResultT?, elements: UInt?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("mmapobj requires N-API addon")

public actual fun meminfo(inaddr: ULong?, addrCount: Int, infoReq: UInt?, infoCount: Int, outdata: ULong?, validity: UInt?): Int =
    throw UnsupportedOperationException("meminfo requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun backtrace(buffer: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: UInt, nwait: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitn requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun secureGetenv(name: String?): String? =
    throw UnsupportedOperationException("secureGetenv requires N-API addon")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL requires N-API addon")

public actual fun sendfile(outFd: Int, inFd: Int, off: Long?, len: ULong): Long =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun sendfilev(fildes: Int, vec: SendfilevecT?, sfvcnt: Int, xferred: ULong?): Long =
    throw UnsupportedOperationException("sendfilev requires N-API addon")

public actual fun lgrpFini(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpFini requires N-API addon")

public actual fun lgrpAffinitySet(idtype: UInt, id: Int, lgrp: Int, aff: Int): Int =
    throw UnsupportedOperationException("lgrpAffinitySet requires N-API addon")

public actual fun lgrpCpus(cookie: ULong, lgrp: Int, cpuids: Int?, count: UInt, content: UInt): Int =
    throw UnsupportedOperationException("lgrpCpus requires N-API addon")

public actual fun lgrpNlgrps(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpNlgrps requires N-API addon")

public actual fun lgrpVersion(version: Int): Int =
    throw UnsupportedOperationException("lgrpVersion requires N-API addon")

public actual fun lgrpResources(cookie: ULong, lgrp: Int, lgrps: Int?, count: UInt, tpe: Int): Int =
    throw UnsupportedOperationException("lgrpResources requires N-API addon")

public actual fun pthreadCreate(native: UInt?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob requires N-API addon")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")
