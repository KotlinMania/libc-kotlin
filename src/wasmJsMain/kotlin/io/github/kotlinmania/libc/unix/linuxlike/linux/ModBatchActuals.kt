// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public actual fun sCTPPRINDEX(policy: CInt): CInt =
    throw UnsupportedOperationException("sCTPPRINDEX requires N-API addon")

public actual fun sCTPPRPOLICY(policy: CInt): CInt =
    throw UnsupportedOperationException("sCTPPRPOLICY requires N-API addon")

public actual fun sCTPPRSETPOLICY(flags: CInt?, policy: CInt) {
    throw UnsupportedOperationException("sCTPPRSETPOLICY requires N-API addon")
}

public actual fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER requires N-API addon")

public actual fun tPACKETALIGN(x: ULong): ULong =
    throw UnsupportedOperationException("tPACKETALIGN requires N-API addon")

public actual fun sUNLEN(s: SockaddrUn): ULong =
    throw UnsupportedOperationException("sUNLEN requires N-API addon")

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspnamR requires N-API addon")

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

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires N-API addon")
}

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink requires N-API addon")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv requires N-API addon")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT =
    throw UnsupportedOperationException("readahead requires N-API addon")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr requires N-API addon")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("lsetxattr requires N-API addon")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr requires N-API addon")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr requires N-API addon")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    throw UnsupportedOperationException("signalfd requires N-API addon")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait requires N-API addon")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setfsgid requires N-API addon")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setfsuid requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt =
    throw UnsupportedOperationException("syncFileRange requires N-API addon")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise requires N-API addon")

public actual fun remapFilePages(addr: COpaquePointer?, size: ULong, prot: CInt, pgoff: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("remapFilePages requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("vhangup requires N-API addon")

public actual fun sync() {
    throw UnsupportedOperationException("sync requires N-API addon")
}

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs requires N-API addon")

public actual fun syscall(num: CLong, vararg args: Any?): CLong =
    throw UnsupportedOperationException("syscall requires N-API addon")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate requires N-API addon")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 requires N-API addon")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait requires N-API addon")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl requires N-API addon")

public actual fun unshare(flags: CInt): CInt =
    throw UnsupportedOperationException("unshare requires N-API addon")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount requires N-API addon")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("tee requires N-API addon")

public actual fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("splice requires N-API addon")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead requires N-API addon")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite requires N-API addon")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    throw UnsupportedOperationException("setns requires N-API addon")

public actual fun swapoff(path: String?): CInt =
    throw UnsupportedOperationException("swapoff requires N-API addon")

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("vmsplice requires N-API addon")

public actual fun personality(persona: CULong): CInt =
    throw UnsupportedOperationException("personality requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount2 requires N-API addon")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("swapon requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize requires N-API addon")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
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

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked requires N-API addon")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    throw UnsupportedOperationException("inotifyRmWatch requires N-API addon")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("inotifyInit requires N-API addon")

public actual fun inotifyInit1(flags: CInt): CInt =
    throw UnsupportedOperationException("inotifyInit1 requires N-API addon")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("inotifyAddWatch requires N-API addon")

public actual fun fanotifyInit(flags: CUInt, eventFFlags: CUInt): CInt =
    throw UnsupportedOperationException("fanotifyInit requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun klogctl(syslogType: CInt, bufp: String?, len: CInt): CInt =
    throw UnsupportedOperationException("klogctl requires N-API addon")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("fallocate64 requires N-API addon")

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fgetpos64 requires N-API addon")


public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 requires N-API addon")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile64 requires N-API addon")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("tmpfile64 requires N-API addon")

