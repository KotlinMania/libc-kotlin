package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on WASI — no C library access")

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on WASI — no C library access")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on WASI — no C library access")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on WASI — no C library access")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on WASI — no C library access")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on WASI — no C library access")

public actual fun sigRtMax(): Int =
    throw UnsupportedOperationException("sIGRTMAX not available on WASI — no C library access")

public actual fun sigRtMin(): Int =
    throw UnsupportedOperationException("sIGRTMIN not available on WASI — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy not available on WASI — no C library access")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on WASI — no C library access")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun acct(filename: String?): Int =
    throw UnsupportedOperationException("acct not available on WASI — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on WASI — no C library access")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on WASI — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun getrandom(bbuf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("settimeofday not available on WASI — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on WASI — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on WASI — no C library access")

public actual fun stackGetbounds(sp: StackT?): Int =
    throw UnsupportedOperationException("stackGetbounds not available on WASI — no C library access")

public actual fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on WASI — no C library access")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on WASI — no C library access")

public actual fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno not available on WASI — no C library access")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on WASI — no C library access")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WASI — no C library access")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on WASI — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on WASI — no C library access")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on WASI — no C library access")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on WASI — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on WASI — no C library access")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on WASI — no C library access")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on WASI — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on WASI — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on WASI — no C library access")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on WASI — no C library access")

public actual fun setprogname(name: String?): Unit = throw UnsupportedOperationException("setprogname not available on WASI — no C library access")

public actual fun getloadavg(loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("getloadavg not available on WASI — no C library access")

public actual fun getpriority(which: Int, who: Int): Int =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: Int, who: Int, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat not available on WASI — no C library access")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on WASI — no C library access")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname not available on WASI — no C library access")

public actual fun ifNameindex(): IfNameindex? =
    throw UnsupportedOperationException("ifNameindex not available on WASI — no C library access")

public actual fun ifFreenameindex(ptr: IfNameindex?): Unit = throw UnsupportedOperationException("ifFreenameindex not available on WASI — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on WASI — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on WASI — no C library access")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on WASI — no C library access")

public actual fun pthreadGetnameNp(tid: UInt, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on WASI — no C library access")

public actual fun pthreadSetnameNp(tid: UInt, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on WASI — no C library access")

public actual fun waitid(idtype: UInt, id: Int, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on WASI — no C library access")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on WASI — no C library access")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on WASI — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on WASI — no C library access")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on WASI — no C library access")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsInit(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on WASI — no C library access")

public actual fun posixSpawnFileActionsDestroy(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddopen(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclose(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAdddup2(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, newfildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, lowfiledes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdir not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddfchdir(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdir not available on WASI — no C library access")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on WASI — no C library access")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on WASI — no C library access")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on WASI — no C library access")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on WASI — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigignoreNp not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigignoreNp not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on WASI — no C library access")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on WASI — no C library access")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on WASI — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on WASI — no C library access")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on WASI — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on WASI — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on WASI — no C library access")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun futimesat(fd: Int, path: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("futimesat not available on WASI — no C library access")

public actual fun futimens(dirfd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on WASI — no C library access")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on WASI — no C library access")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on WASI — no C library access")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun accept4(fd: Int, address: Sockaddr?, addressLen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 not available on WASI — no C library access")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mqOpen not available on WASI — no C library access")

public actual fun mqClose(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqClose not available on WASI — no C library access")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on WASI — no C library access")

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on WASI — no C library access")

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on WASI — no C library access")

public actual fun mqSend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on WASI — no C library access")

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on WASI — no C library access")

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on WASI — no C library access")

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on WASI — no C library access")

public actual fun portCreate(): Int =
    throw UnsupportedOperationException("portCreate not available on WASI — no C library access")

public actual fun portAssociate(port: Int, source: Int, `object`: ULong, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portAssociate not available on WASI — no C library access")

public actual fun portDissociate(port: Int, source: Int, `object`: ULong): Int =
    throw UnsupportedOperationException("portDissociate not available on WASI — no C library access")

public actual fun portGet(port: Int, pe: PortEvent?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGet not available on WASI — no C library access")

public actual fun portGetn(port: Int, peList: PortEvent?, max: UInt, nget: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("portGetn not available on WASI — no C library access")

public actual fun portSend(port: Int, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSend not available on WASI — no C library access")

public actual fun portSendn(portList: Int?, errorList: Int?, nent: UInt, events: Int, user: COpaquePointer?): Int =
    throw UnsupportedOperationException("portSendn not available on WASI — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on WASI — no C library access")

public actual fun sigsuspend(mask: SigsetT?): Int =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose not available on WASI — no C library access")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on WASI — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun pthreadKill(thread: UInt, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on WASI — no C library access")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on WASI — no C library access")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on WASI — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on WASI — no C library access")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on WASI — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR not available on WASI — no C library access")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR not available on WASI — no C library access")

public actual fun sigwait(set: SigsetT?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on WASI — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on WASI — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on WASI — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on WASI — no C library access")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on WASI — no C library access")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on WASI — no C library access")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("makeutx not available on WASI — no C library access")

public actual fun modutx(ux: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("modutx not available on WASI — no C library access")

public actual fun updwtmpx(file: String?, ut: Utmpx?): Unit = throw UnsupportedOperationException("updwtmpx not available on WASI — no C library access")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname not available on WASI — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on WASI — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on WASI — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on WASI — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on WASI — no C library access")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on WASI — no C library access")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on WASI — no C library access")

public actual fun endutent(): Unit = throw UnsupportedOperationException("endutent not available on WASI — no C library access")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on WASI — no C library access")

public actual fun getutid(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutid not available on WASI — no C library access")

public actual fun getutline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("getutline not available on WASI — no C library access")

public actual fun pututline(u: Utmp?): Utmp? =
    throw UnsupportedOperationException("pututline not available on WASI — no C library access")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent not available on WASI — no C library access")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname not available on WASI — no C library access")

public actual fun getutmp(ux: Utmpx?, u: Utmp?): Unit = throw UnsupportedOperationException("getutmp not available on WASI — no C library access")

public actual fun getutmpx(u: Utmp?, ux: Utmpx?): Unit = throw UnsupportedOperationException("getutmpx not available on WASI — no C library access")

public actual fun updwtmp(file: String?, u: Utmp?): Unit = throw UnsupportedOperationException("updwtmp not available on WASI — no C library access")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime not available on WASI — no C library access")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime not available on WASI — no C library access")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: Int?): Int =
    throw UnsupportedOperationException("timerCreate not available on WASI — no C library access")

public actual fun timerDelete(timerid: Int): Int =
    throw UnsupportedOperationException("timerDelete not available on WASI — no C library access")

public actual fun timerGetoverrun(timerid: Int): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on WASI — no C library access")

public actual fun timerGettime(timerid: Int, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on WASI — no C library access")

public actual fun timerSettime(timerid: Int, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on WASI — no C library access")

public actual fun ucredGet(pid: Int): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("ucredGet not available on WASI — no C library access")

public actual fun getpeerucred(fd: Int, ucred: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpeerucred not available on WASI — no C library access")

public actual fun ucredFree(ucred: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("ucredFree not available on WASI — no C library access")

public actual fun ucredGetgroups(ucred: io.github.kotlinmania.libc.COpaquePointer?, groups: COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetgroups not available on WASI — no C library access")

public actual fun ucredGetpid(ucred: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("ucredGetpid not available on WASI — no C library access")

public actual fun ucredSize(): ULong =
    throw UnsupportedOperationException("ucredSize not available on WASI — no C library access")

public actual fun psetCreate(newpset: Int?): Int =
    throw UnsupportedOperationException("psetCreate not available on WASI — no C library access")

public actual fun psetDestroy(pset: Int): Int =
    throw UnsupportedOperationException("psetDestroy not available on WASI — no C library access")

public actual fun psetAssign(pset: Int, cpu: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetAssign not available on WASI — no C library access")

public actual fun psetInfo(pset: Int, tpe: Int?, numcpus: UInt?, cpulist: Int?): Int =
    throw UnsupportedOperationException("psetInfo not available on WASI — no C library access")

public actual fun psetBind(pset: Int, idtype: UInt, id: Int, opset: Int?): Int =
    throw UnsupportedOperationException("psetBind not available on WASI — no C library access")

public actual fun psetList(pset: Int?, numpsets: UInt?): Int =
    throw UnsupportedOperationException("psetList not available on WASI — no C library access")

public actual fun psetSetattr(pset: Int, attr: UInt): Int =
    throw UnsupportedOperationException("psetSetattr not available on WASI — no C library access")

public actual fun psetGetattr(pset: Int, attr: UInt?): Int =
    throw UnsupportedOperationException("psetGetattr not available on WASI — no C library access")

public actual fun processorBind(idtype: UInt, id: Int, newBinding: Int, oldBinding: Int?): Int =
    throw UnsupportedOperationException("processorBind not available on WASI — no C library access")

public actual fun pOnline(processorid: Int, flag: Int): Int =
    throw UnsupportedOperationException("pOnline not available on WASI — no C library access")

public actual fun processorInfo(processorid: Int, infop: ProcessorInfoT?): Int =
    throw UnsupportedOperationException("processorInfo not available on WASI — no C library access")

public actual fun getexecname(): String? =
    throw UnsupportedOperationException("getexecname not available on WASI — no C library access")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid not available on WASI — no C library access")

public actual fun setpflags(flags: UInt, value: UInt): Int =
    throw UnsupportedOperationException("setpflags not available on WASI — no C library access")

public actual fun sysinfo(command: Int, buf: String?, count: Long): Int =
    throw UnsupportedOperationException("sysinfo not available on WASI — no C library access")

public actual fun faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int =
    throw UnsupportedOperationException("faccessat not available on WASI — no C library access")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize not available on WASI — no C library access")

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes not available on WASI — no C library access")

public actual fun mmapobj(fd: Int, flags: UInt, storage: MmapobjResultT?, elements: UInt?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("mmapobj not available on WASI — no C library access")

public actual fun meminfo(inaddr: ULong?, addrCount: Int, infoReq: UInt?, infoCount: Int, outdata: ULong?, validity: UInt?): Int =
    throw UnsupportedOperationException("meminfo not available on WASI — no C library access")

public actual fun strsep(string: COpaquePointer?, delim: String?): String? =
    throw UnsupportedOperationException("strsep not available on WASI — no C library access")

public actual fun backtrace(buffer: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtrace not available on WASI — no C library access")

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on WASI — no C library access")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd not available on WASI — no C library access")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on WASI — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on WASI — no C library access")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on WASI — no C library access")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on WASI — no C library access")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on WASI — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on WASI — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on WASI — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on WASI — no C library access")

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: UInt, nwait: UInt?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioWaitn not available on WASI — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on WASI — no C library access")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on WASI — no C library access")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on WASI — no C library access")

public actual fun secureGetenv(name: String?): String? =
    throw UnsupportedOperationException("secureGetenv not available on WASI — no C library access")

public actual fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun strftimeL(s: String?, maxsize: ULong, format: String?, timeptr: Tm?, loc: io.github.kotlinmania.libc.COpaquePointer?): ULong =
    throw UnsupportedOperationException("strftimeL not available on WASI — no C library access")

public actual fun sendfile(outFd: Int, inFd: Int, off: Long?, len: ULong): Long =
    throw UnsupportedOperationException("sendfile not available on WASI — no C library access")

public actual fun sendfilev(fildes: Int, vec: SendfilevecT?, sfvcnt: Int, xferred: ULong?): Long =
    throw UnsupportedOperationException("sendfilev not available on WASI — no C library access")

public actual fun lgrpFini(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpFini not available on WASI — no C library access")

public actual fun lgrpAffinitySet(idtype: UInt, id: Int, lgrp: Int, aff: Int): Int =
    throw UnsupportedOperationException("lgrpAffinitySet not available on WASI — no C library access")

public actual fun lgrpCpus(cookie: ULong, lgrp: Int, cpuids: Int?, count: UInt, content: UInt): Int =
    throw UnsupportedOperationException("lgrpCpus not available on WASI — no C library access")

public actual fun lgrpNlgrps(cookie: ULong): Int =
    throw UnsupportedOperationException("lgrpNlgrps not available on WASI — no C library access")

public actual fun lgrpVersion(version: Int): Int =
    throw UnsupportedOperationException("lgrpVersion not available on WASI — no C library access")

public actual fun lgrpResources(cookie: ULong, lgrp: Int, lgrps: Int?, count: UInt, tpe: Int): Int =
    throw UnsupportedOperationException("lgrpResources not available on WASI — no C library access")

public actual fun pthreadCreate(native: UInt?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on WASI — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on WASI — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on WASI — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on WASI — no C library access")
