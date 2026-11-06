package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.COpaquePointer

internal object LinuxModRawLibc {
    external fun getspnamR(name: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun mqClose(mqd: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun mrand48(): Long
    external fun seed48(xseed: Long): Long?
    external fun lcong48(p: Long)
    external fun lutimes(file: String?, times: Long): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun semget(key: Long, nsems: Int, semflag: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun msgctl(msqid: Int, cmd: Int, buf: Long): Int
    external fun msgget(key: Long, msgflg: Int): Int
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long
    external fun msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int
    external fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun readahead(fd: Int, offset: Long, count: Long): Long
    external fun getxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun lgetxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long
    external fun setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int
    external fun listxattr(path: String?, list: Long, size: Long): Long
    external fun llistxattr(path: String?, list: Long, size: Long): Long
    external fun flistxattr(filedes: Int, list: Long, size: Long): Long
    external fun removexattr(path: String?, name: String?): Int
    external fun lremovexattr(path: String?, name: String?): Int
    external fun fremovexattr(filedes: Int, name: String?): Int
    external fun signalfd(fd: Int, mask: Long, flags: Int): Int
    external fun timerfdCreate(clockid: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
    external fun quotactl(cmd: Int, special: String?, id: Int, data: Long): Int
    external fun epollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int
    external fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun accept4(fd: Int, addr: Long, len: Long, flg: Int): Int
    external fun reboot(howTo: Int): Int
    external fun setfsgid(gid: Int): Int
    external fun setfsuid(uid: Int): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun remapFilePages(addr: Long, size: Long, prot: Int, pgoff: Long, flags: Int): Int
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun vhangup(): Int
    external fun sync()
    external fun syncfs(fd: Int): Int
    external fun schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun epollCreate(size: Int): Int
    external fun epollCreate1(flags: Int): Int
    external fun epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int
    external fun epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int
    external fun unshare(flags: Int): Int
    external fun umount(target: String?): Int
    external fun tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long
    external fun splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long
    external fun eventfd(initval: Int, flags: Int): Int
    external fun eventfdRead(fd: Int, value: Long): Int
    external fun eventfdWrite(fd: Int, value: Long): Int
    external fun schedRrGetInterval(pid: Int, tp: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun setns(fd: Int, nstype: Int): Int
    external fun swapoff(path: String?): Int
    external fun vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long
    external fun personality(persona: Long): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun umount2(target: String?, flags: Int): Int
    external fun swapon(path: String?, swapflags: Int): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun getdtablesize(): Int
    external fun getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long
    external fun inotifyRmWatch(fd: Int, wd: Int): Int
    external fun inotifyInit(): Int
    external fun inotifyInit1(flags: Int): Int
    external fun inotifyAddWatch(fd: Int, path: String?, mask: Int): Int
    external fun fanotifyInit(flags: Int, eventFFlags: Int): Int
    external fun gethostid(): Long
    external fun klogctl(syslogType: Int, bufp: Long, len: Int): Int
    external fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun fgetpos64(stream: Long, ptr: Long): Int
    external fun fopen64(filename: String?, mode: String?): Long?
    external fun posixFallocate64(fd: Int, offset: Long, len: Long): Int
    external fun sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun tmpfile64(): Long?
}

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    LinuxModRawLibc.getspnamR(name, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun mqClose(mqd: MqdT): CInt =
    LinuxModRawLibc.mqClose(mqd)

public actual fun mqUnlink(name: String?): CInt =
    LinuxModRawLibc.mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    LinuxModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    LinuxModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    LinuxModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    LinuxModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    LinuxModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    LinuxModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun mrand48(): CLong =
    LinuxModRawLibc.mrand48()

public actual fun seed48(xseed: CUshort?): CUshort? =
    LinuxModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    LinuxModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    LinuxModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    LinuxModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    LinuxModRawLibc.shmUnlink(name)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    LinuxModRawLibc.ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    LinuxModRawLibc.semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    LinuxModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    LinuxModRawLibc.msgctl(msqid, cmd, buf?.toLong() ?: 0L)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    LinuxModRawLibc.msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    LinuxModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    LinuxModRawLibc.msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    LinuxModRawLibc.fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    LinuxModRawLibc.posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    LinuxModRawLibc.readahead(fd, offset, count)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.getxattr(path, name, value?.value ?: 0L, size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.lgetxattr(path, name, value?.value ?: 0L, size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.fgetxattr(filedes, name, value?.value ?: 0L, size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    LinuxModRawLibc.setxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    LinuxModRawLibc.lsetxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    LinuxModRawLibc.fsetxattr(filedes, name, value?.value ?: 0L, size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.listxattr(path, list?.value ?: 0L, size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.llistxattr(path, list?.value ?: 0L, size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    LinuxModRawLibc.flistxattr(filedes, list?.value ?: 0L, size)

public actual fun removexattr(path: String?, name: String?): CInt =
    LinuxModRawLibc.removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    LinuxModRawLibc.lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    LinuxModRawLibc.fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    LinuxModRawLibc.signalfd(fd, mask?.toLong() ?: 0L, flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    LinuxModRawLibc.timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    LinuxModRawLibc.timerfdGettime(fd, currValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    LinuxModRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    LinuxModRawLibc.quotactl(cmd, special, id, data?.value ?: 0L)

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    LinuxModRawLibc.epollPwait(epfd, events?.toLong() ?: 0L, maxevents, timeout, sigmask?.toLong() ?: 0L)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    LinuxModRawLibc.dup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    LinuxModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    LinuxModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt =
    LinuxModRawLibc.accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)

public actual fun reboot(howTo: CInt): CInt =
    LinuxModRawLibc.reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    LinuxModRawLibc.setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    LinuxModRawLibc.setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    LinuxModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    LinuxModRawLibc.syncFileRange(fd, offset, nbytes, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    LinuxModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    LinuxModRawLibc.remapFilePages(addr?.value ?: 0L, size, prot, pgoff, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    LinuxModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun vhangup(): CInt =
    LinuxModRawLibc.vhangup()

public actual fun sync() {
    LinuxModRawLibc.sync()
}

public actual fun syncfs(fd: CInt): CInt =
    LinuxModRawLibc.syncfs(fd)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    LinuxModRawLibc.schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun epollCreate(size: CInt): CInt =
    LinuxModRawLibc.epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    LinuxModRawLibc.epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    LinuxModRawLibc.epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    LinuxModRawLibc.epollCtl(epfd, op, fd, event?.toLong() ?: 0L)

public actual fun unshare(flags: CInt): CInt =
    LinuxModRawLibc.unshare(flags)

public actual fun umount(target: String?): CInt =
    LinuxModRawLibc.umount(target)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    LinuxModRawLibc.tee(fdIn, fdOut, len, flags)

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    LinuxModRawLibc.splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    LinuxModRawLibc.eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    LinuxModRawLibc.eventfdRead(fd, value?.toLong() ?: 0L)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    LinuxModRawLibc.eventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    LinuxModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    LinuxModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    LinuxModRawLibc.setns(fd, nstype)

public actual fun swapoff(path: String?): CInt =
    LinuxModRawLibc.swapoff(path)

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    LinuxModRawLibc.vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)

public actual fun personality(persona: CUlong): CInt =
    LinuxModRawLibc.personality(persona)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    LinuxModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    LinuxModRawLibc.schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    LinuxModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun umount2(target: String?, flags: CInt): CInt =
    LinuxModRawLibc.umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    LinuxModRawLibc.swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    LinuxModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: SizeT): SsizeT =
    LinuxModRawLibc.sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    LinuxModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    LinuxModRawLibc.getdtablesize()

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    LinuxModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    LinuxModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    LinuxModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    LinuxModRawLibc.posixSpawnattrInit(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    LinuxModRawLibc.posixSpawnattrDestroy(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    LinuxModRawLibc.posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    LinuxModRawLibc.posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    LinuxModRawLibc.posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    LinuxModRawLibc.posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    LinuxModRawLibc.posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    LinuxModRawLibc.posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    LinuxModRawLibc.posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    LinuxModRawLibc.posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    LinuxModRawLibc.posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    LinuxModRawLibc.posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    LinuxModRawLibc.posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    LinuxModRawLibc.posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    LinuxModRawLibc.posixSpawnFileActionsInit(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    LinuxModRawLibc.posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    LinuxModRawLibc.posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    LinuxModRawLibc.posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    LinuxModRawLibc.posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    LinuxModRawLibc.freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    LinuxModRawLibc.inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    LinuxModRawLibc.inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    LinuxModRawLibc.inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    LinuxModRawLibc.inotifyAddWatch(fd, path, mask)

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    LinuxModRawLibc.fanotifyInit(flags, eventFFlags)

public actual fun gethostid(): CLong =
    LinuxModRawLibc.gethostid()

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    LinuxModRawLibc.klogctl(syslogType, bufp?.value ?: 0L, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    LinuxModRawLibc.fallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    LinuxModRawLibc.fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    LinuxModRawLibc.fopen64(filename, mode)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    LinuxModRawLibc.posixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Long?, count: SizeT): SsizeT =
    LinuxModRawLibc.sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun tmpfile64(): FILE? =
    LinuxModRawLibc.tmpfile64()
