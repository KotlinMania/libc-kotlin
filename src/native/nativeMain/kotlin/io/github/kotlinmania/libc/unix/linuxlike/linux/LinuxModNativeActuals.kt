@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_getspnam_r(name, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_close(mqd)

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_unlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_receive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_timedreceive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_send(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_timedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_getattr(mqd, attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mq_setattr(mqd, newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mrand48()

public actual fun seed48(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: CUshort?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_shm_unlink(name)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_fallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_readahead(fd, offset, count)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_timerfd_create(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_timerfd_gettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_timerfd_settime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_quotactl(cmd, special, id, data?.value?.toCPointer<ByteVar>())

public actual fun epollPwait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt, sigmask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_epoll_pwait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout, sigmask?.value?.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_dup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: UInt?, flg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun reboot(howTo: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mkfifoat(dirfd, pathname, mode)

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sync_file_range(fd, offset, nbytes, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_remap_file_pages(addr?.value?.toCPointer<ByteVar>(), size, prot, pgoff, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun vhangup(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_vhangup()

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_syncfs(fd)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_setaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_epoll_create(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_epoll_create1(flags)

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_epoll_wait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_epoll_ctl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_unshare(flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_umount(target)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_tee(fdIn, fdOut, len, flags)

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_eventfd_read(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_eventfd_write(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_setns(fd, nstype)

public actual fun swapoff(path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_swapoff(path)

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun personality(persona: CUlong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_personality(persona)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_getscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun umount2(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: OffT?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_getdtablesize()

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fread_unlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_inotify_rm_watch(fd, wd)

public actual fun inotifyInit(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_inotify_init()

public actual fun inotifyInit1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_inotify_init1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_inotify_add_watch(fd, path, mask)

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fanotify_init(flags, eventFFlags)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_gethostid()

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_klogctl(syslogType, bufp?.value?.toCPointer<ByteVar>(), len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_posix_fallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Long?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun tmpfile64(): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_linux_mod_tmpfile64()?.let { FILE(it.toLong()) }
