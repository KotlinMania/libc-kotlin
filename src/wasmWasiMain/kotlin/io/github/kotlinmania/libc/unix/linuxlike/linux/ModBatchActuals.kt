// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public actual fun sCTPPRINDEX(policy: CInt): CInt =
    throw UnsupportedOperationException("sCTPPRINDEX not available on WASI — no C library access")

public actual fun sCTPPRPOLICY(policy: CInt): CInt =
    throw UnsupportedOperationException("sCTPPRPOLICY not available on WASI — no C library access")

public actual fun sCTPPRSETPOLICY(flags: CInt?, policy: CInt) {
    throw UnsupportedOperationException("sCTPPRSETPOLICY not available on WASI — no C library access")
}

public actual fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER not available on WASI — no C library access")

public actual fun tPACKETALIGN(x: ULong): ULong =
    throw UnsupportedOperationException("tPACKETALIGN not available on WASI — no C library access")

public actual fun sUNLEN(s: SockaddrUn): ULong =
    throw UnsupportedOperationException("sUNLEN not available on WASI — no C library access")

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspnamR not available on WASI — no C library access")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on WASI — no C library access")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on WASI — no C library access")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on WASI — no C library access")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on WASI — no C library access")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on WASI — no C library access")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on WASI — no C library access")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on WASI — no C library access")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on WASI — no C library access")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on WASI — no C library access")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 not available on WASI — no C library access")

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 not available on WASI — no C library access")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 not available on WASI — no C library access")
}

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on WASI — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on WASI — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on WASI — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    throw UnsupportedOperationException("semget not available on WASI — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on WASI — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on WASI — no C library access")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl not available on WASI — no C library access")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget not available on WASI — no C library access")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv not available on WASI — no C library access")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd not available on WASI — no C library access")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("fallocate not available on WASI — no C library access")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on WASI — no C library access")

public actual fun readahead(fd: CInt, offset: Off64T, count: ULong): SsizeT =
    throw UnsupportedOperationException("readahead not available on WASI — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr not available on WASI — no C library access")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr not available on WASI — no C library access")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr not available on WASI — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr not available on WASI — no C library access")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("lsetxattr not available on WASI — no C library access")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr not available on WASI — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr not available on WASI — no C library access")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr not available on WASI — no C library access")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr not available on WASI — no C library access")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr not available on WASI — no C library access")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr not available on WASI — no C library access")

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr not available on WASI — no C library access")

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    throw UnsupportedOperationException("signalfd not available on WASI — no C library access")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate not available on WASI — no C library access")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime not available on WASI — no C library access")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime not available on WASI — no C library access")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl not available on WASI — no C library access")

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait not available on WASI — no C library access")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on WASI — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on WASI — no C library access")

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on WASI — no C library access")

public actual fun reboot(howTo: CInt): CInt =
    throw UnsupportedOperationException("reboot not available on WASI — no C library access")

public actual fun setfsgid(gid: GidT): CInt =
    throw UnsupportedOperationException("setfsgid not available on WASI — no C library access")

public actual fun setfsuid(uid: UidT): CInt =
    throw UnsupportedOperationException("setfsuid not available on WASI — no C library access")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on WASI — no C library access")

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUInt): CInt =
    throw UnsupportedOperationException("syncFileRange not available on WASI — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on WASI — no C library access")

public actual fun remapFilePages(addr: COpaquePointer?, size: ULong, prot: CInt, pgoff: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("remapFilePages not available on WASI — no C library access")

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun vhangup(): CInt =
    throw UnsupportedOperationException("vhangup not available on WASI — no C library access")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on WASI — no C library access")
}

public actual fun syncfs(fd: CInt): CInt =
    throw UnsupportedOperationException("syncfs not available on WASI — no C library access")

public actual fun syscall(num: CLong, vararg args: Any?): CLong =
    throw UnsupportedOperationException("syscall not available on WASI — no C library access")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity not available on WASI — no C library access")

public actual fun epollCreate(size: CInt): CInt =
    throw UnsupportedOperationException("epollCreate not available on WASI — no C library access")

public actual fun epollCreate1(flags: CInt): CInt =
    throw UnsupportedOperationException("epollCreate1 not available on WASI — no C library access")

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    throw UnsupportedOperationException("epollWait not available on WASI — no C library access")

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    throw UnsupportedOperationException("epollCtl not available on WASI — no C library access")

public actual fun unshare(flags: CInt): CInt =
    throw UnsupportedOperationException("unshare not available on WASI — no C library access")

public actual fun umount(target: String?): CInt =
    throw UnsupportedOperationException("umount not available on WASI — no C library access")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("tee not available on WASI — no C library access")

public actual fun splice(fdIn: CInt, offIn: LoffT?, fdOut: CInt, offOut: LoffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("splice not available on WASI — no C library access")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on WASI — no C library access")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead not available on WASI — no C library access")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite not available on WASI — no C library access")

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on WASI — no C library access")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    throw UnsupportedOperationException("setns not available on WASI — no C library access")

public actual fun swapoff(path: String?): CInt =
    throw UnsupportedOperationException("swapoff not available on WASI — no C library access")

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("vmsplice not available on WASI — no C library access")

public actual fun personality(persona: CULong): CInt =
    throw UnsupportedOperationException("personality not available on WASI — no C library access")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun umount2(target: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("umount2 not available on WASI — no C library access")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    throw UnsupportedOperationException("swapon not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile not available on WASI — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on WASI — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on WASI — no C library access")

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on WASI — no C library access")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on WASI — no C library access")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on WASI — no C library access")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on WASI — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on WASI — no C library access")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on WASI — no C library access")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on WASI — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on WASI — no C library access")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on WASI — no C library access")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on WASI — no C library access")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on WASI — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on WASI — no C library access")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked not available on WASI — no C library access")

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    throw UnsupportedOperationException("inotifyRmWatch not available on WASI — no C library access")

public actual fun inotifyInit(): CInt =
    throw UnsupportedOperationException("inotifyInit not available on WASI — no C library access")

public actual fun inotifyInit1(flags: CInt): CInt =
    throw UnsupportedOperationException("inotifyInit1 not available on WASI — no C library access")

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    throw UnsupportedOperationException("inotifyAddWatch not available on WASI — no C library access")

public actual fun fanotifyInit(flags: CUInt, eventFFlags: CUInt): CInt =
    throw UnsupportedOperationException("fanotifyInit not available on WASI — no C library access")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on WASI — no C library access")

public actual fun klogctl(syslogType: CInt, bufp: String?, len: CInt): CInt =
    throw UnsupportedOperationException("klogctl not available on WASI — no C library access")

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("fallocate64 not available on WASI — no C library access")

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    throw UnsupportedOperationException("fgetpos64 not available on WASI — no C library access")


public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    throw UnsupportedOperationException("posixFallocate64 not available on WASI — no C library access")

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: ULong): SsizeT =
    throw UnsupportedOperationException("sendfile64 not available on WASI — no C library access")

public actual fun tmpfile64(): FILE? =
    throw UnsupportedOperationException("tmpfile64 not available on WASI — no C library access")


public actual fun clone(cb: ((COpaquePointer?) -> CInt)?, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("clone not available on WASI — no C library access")

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("fopen64 not available on WASI — no C library access")
