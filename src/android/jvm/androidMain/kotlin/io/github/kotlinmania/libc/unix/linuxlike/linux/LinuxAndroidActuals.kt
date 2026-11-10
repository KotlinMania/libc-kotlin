@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

private object UnixLinuxlikeLinuxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_linux_getspnamR(name: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqOpen(name: String?, oflag: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mrand48(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_linuxlike_linux_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_ftok(pathname: String?, projId: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_semget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_semctl(semid: Int, semnum: Int, cmd: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_msgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_msgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_readahead(fd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_getxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_lgetxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_listxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_llistxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_flistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_removexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_lremovexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fremovexattr(filedes: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_signalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_timerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_timerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_quotactl(cmd: Int, special: String?, id: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_epollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_dup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_accept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_reboot(howTo: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_setfsgid(gid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_setfsuid(uid: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_remapFilePages(addr: Long, size: Long, prot: Int, pgoff: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_vhangup(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sync()

    @JvmStatic
    external fun libc_unix_linuxlike_linux_syncfs(fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_syscall(num: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_epollCreate(size: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_epollCreate1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_unshare(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_umount(target: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_eventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_eventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_eventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_setns(fd: Int, nstype: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_swapoff(path: String?): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_personality(persona: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_clone(cb: Long, childStack: Long, flags: Int, arg: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_umount2(target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_swapon(path: String?, swapflags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_getgrouplist(user: String?, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_inotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_inotifyInit(): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_inotifyInit1(flags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_inotifyAddWatch(fd: Int, path: String?, mask: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fanotifyInit(flags: Int, eventFFlags: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_gethostid(): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_klogctl(syslogType: Int, bufp: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_fopen64(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_posixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_linuxlike_linux_sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_linuxlike_linux_tmpfile64(): Long
}

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_getspnamR(name, (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqClose(mqd.toLong())

public actual fun mqUnlink(name: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun mrand48(): CLong =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mrand48()

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lcong48(p: COpaquePointer?) {
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_lcong48((p?.value ?: 0L))
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_lutimes(file, (times?.value ?: 0L))

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_shmUnlink(name)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_msgctl(msqid, cmd, (buf?.value ?: 0L))

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_msgsnd(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_readahead(fd, offset, count.toLong())

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_getxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_lgetxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fgetxattr(filedes, name, (value?.value ?: 0L), size.toLong())

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_setxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_lsetxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fsetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_listxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_llistxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_flistxattr(filedes, (list?.value ?: 0L), size.toLong())

public actual fun removexattr(path: String?, name: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_signalfd(fd, (mask?.value ?: 0L), flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_timerfdGettime(fd, (currValue?.value ?: 0L))

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_timerfdSettime(fd, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_quotactl(cmd, special, id, (data?.value ?: 0L))

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_epollPwait(epfd, (events?.value ?: 0L), maxevents, timeout, (sigmask?.value ?: 0L))

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_dup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_accept4(fd, (addr?.value ?: 0L), (len?.value ?: 0L), flg)

public actual fun reboot(howTo: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_setfsgid(gid.toShort())

public actual fun setfsuid(uid: UidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_setfsuid(uid.toShort())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_syncFileRange(fd, offset, nbytes, flags.toInt())

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_remapFilePages((addr?.value ?: 0L), size.toLong(), prot, pgoff.toLong(), flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun vhangup(): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_vhangup()

public actual fun sync() {
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_syncfs(fd)

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_syscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedSetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun epollCreate(size: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_epollWait(epfd, (events?.value ?: 0L), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_epollCtl(epfd, op, fd, (event?.value ?: 0L))

public actual fun unshare(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_unshare(flags)

public actual fun umount(target: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_umount(target)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_tee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_splice(fdIn, (offIn?.value ?: 0L), fdOut, (offOut?.value ?: 0L), len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_eventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_eventfdRead(fd, (value?.value ?: 0L))

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_eventfdWrite(fd, value.toLong())

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedSetparam(pid, (param?.value ?: 0L))

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_setns(fd, nstype)

public actual fun swapoff(path: String?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_swapoff(path)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_vmsplice(fd, (iov?.value ?: 0L), nrSegs.toLong(), flags.toInt())

public actual fun personality(persona: CUlong): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_personality(persona.toLong())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedGetparam(pid, (param?.value ?: 0L))

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_clone(0L, (childStack?.value ?: 0L), flags, (arg?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun umount2(target: String?, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sendfile(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_getdtablesize()

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_getgrouplist(user, group.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_freadUnlocked((buf?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_inotifyAddWatch(fd, path, mask.toInt())

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fanotifyInit(flags.toInt(), eventFFlags.toInt())

public actual fun gethostid(): CLong =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_gethostid()

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_klogctl(syslogType, (bufp?.value ?: 0L), len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fgetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_fopen64(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_posixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_sendfile64(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun tmpfile64(): FILE? =
    UnixLinuxlikeLinuxJniBridge.libc_unix_linuxlike_linux_tmpfile64().let { if (it == 0L) null else FILE(it) }
