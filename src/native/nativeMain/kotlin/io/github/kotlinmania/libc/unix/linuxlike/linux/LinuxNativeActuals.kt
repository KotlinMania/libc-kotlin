@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getspnamR(name, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mrand48()

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_shmUnlink(name)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt): CInt =
    0

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_readahead(fd, offset, count)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_quotactl(cmd, special, id, data?.value?.toCPointer<ByteVar>())

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollPwait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout, sigmask?.value?.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_dup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun reboot(howTo: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mkfifoat(dirfd, pathname, mode)

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_syncFileRange(fd, offset, nbytes, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_remapFilePages(addr?.value?.toCPointer<ByteVar>(), size, prot, pgoff, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun vhangup(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_vhangup()

public actual fun sync() {
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_syncfs(fd)

public actual fun syscall(num: CLong): CLong =
    0L

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollWait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCtl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_unshare(flags)

public actual fun umount(target: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_umount(target)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_tee(fdIn, fdOut, len, flags)

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfdRead(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setns(fd, nstype)

public actual fun swapoff(path: String?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_swapoff(path)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun personality(persona: CUlong): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_personality(persona)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun umount2(target: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getdtablesize()

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_freadUnlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyAddWatch(fd, path, mask)

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fanotifyInit(flags, eventFFlags)

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_gethostid()

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_klogctl(syslogType, bufp?.value?.toCPointer<ByteVar>(), len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun tmpfile64(): FILE? =
    io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_tmpfile64()?.let { FILE(it.toLong()) }
