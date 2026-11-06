package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspnamR(name, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)") as CInt

public actual fun mqClose(mqd: MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun seed48(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun lcong48(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(p?.toLong() ?: 0L)")
}

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as KeyT

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflag)") as CInt

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgctl(msqid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgget(key, msgflg)") as CInt

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)") as SsizeT

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)") as CInt

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate(fd, mode, offset, len)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readahead(fd, offset, count)") as SsizeT

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').lgetxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fgetxattr(filedes, name, value?.value ?: 0L, size)") as SsizeT

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').lsetxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetxattr(filedes, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').listxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').llistxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').flistxattr(filedes, list?.value ?: 0L, size)") as SsizeT

public actual fun removexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').removexattr(path, name)") as CInt

public actual fun lremovexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lremovexattr(path, name)") as CInt

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fremovexattr(filedes, name)") as CInt

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalfd(fd, mask?.toLong() ?: 0L, flags)") as CInt

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clockid, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').quotactl(cmd, special, id, data?.value ?: 0L)") as CInt

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollPwait(epfd, events?.toLong() ?: 0L, maxevents, timeout, sigmask?.toLong() ?: 0L)") as CInt

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(oldfd, newfd, flags)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)") as CInt

public actual fun reboot(howTo: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(howTo)") as CInt

public actual fun setfsgid(gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsgid(gid)") as CInt

public actual fun setfsuid(uid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsuid(uid)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncFileRange(fd, offset, nbytes, flags)") as CInt

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').remapFilePages(addr?.value ?: 0L, size, prot, pgoff, flags)") as CInt

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun vhangup(): CInt =
    js("require('@kotlinmania/libc-native-bindings').vhangup()") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun syncfs(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncfs(fd)") as CInt

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun epollCreate(size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate(size)") as CInt

public actual fun epollCreate1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate1(flags)") as CInt

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)") as CInt

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCtl(epfd, op, fd, event?.toLong() ?: 0L)") as CInt

public actual fun unshare(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unshare(flags)") as CInt

public actual fun umount(target: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount(target)") as CInt

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').tee(fdIn, fdOut, len, flags)") as SsizeT

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)") as SsizeT

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdRead(fd, value?.toLong() ?: 0L)") as CInt

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdWrite(fd, value)") as CInt

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setns(fd, nstype)") as CInt

public actual fun swapoff(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapoff(path)") as CInt

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)") as SsizeT

public actual fun personality(persona: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').personality(persona)") as CInt

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun umount2(target: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount2(target, flags)") as CInt

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapon(path, swapflags)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)") as CInt

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyRmWatch(fd, wd)") as CInt

public actual fun inotifyInit(): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyInit()") as CInt

public actual fun inotifyInit1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyInit1(flags)") as CInt

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyAddWatch(fd, path, mask)") as CInt

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').fanotifyInit(flags, eventFFlags)") as CInt

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').klogctl(syslogType, bufp?.value ?: 0L, len)") as CInt

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate64(fd, mode, offset, len)") as CInt

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen64(filename, mode)") as FILE?

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate64(fd, offset, len)") as CInt

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Long?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun tmpfile64(): FILE? =
    js("require('@kotlinmania/libc-native-bindings').tmpfile64()") as FILE?
