@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGetspnamR(name: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMrand48(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLcong48(p: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFtok(pathname: Long, projId: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSemget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMsgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMsgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxReadahead(fd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLgetxattr(path: Long, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFgetxattr(filedes: Int, name: Long, value: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLsetxattr(path: Long, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFsetxattr(filedes: Int, name: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxListxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLlistxattr(path: Long, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFlistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxRemovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxLremovexattr(path: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFremovexattr(filedes: Int, name: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSignalfd(fd: Int, mask: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxTimerfdCreate(clockid: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxTimerfdGettime(fd: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxTimerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxQuotactl(cmd: Int, special: Long, id: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEpollPwait(epfd: Int, events: Long, maxevents: Int, timeout: Int, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxDup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxAccept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxReboot(howTo: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSetfsgid(gid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSetfsuid(uid: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSyncFileRange(fd: Int, offset: Long, nbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxRemapFilePages(addr: Long, size: Long, prot: Int, pgoff: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxVhangup(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSync()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSyncfs(fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSyscall(num: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEpollCreate(size: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEpollCreate1(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEpollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEpollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUnshare(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUmount(target: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxTee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSplice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEventfd(initval: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEventfdRead(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxEventfdWrite(fd: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSetns(fd: Int, nstype: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSwapoff(path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxVmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPersonality(persona: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxClone(cb: Long, childStack: Long, flags: Int, arg: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxUmount2(target: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSwapon(path: Long, swapflags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGetgrouplist(user: Long, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFreadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxInotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxInotifyInit(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxInotifyInit1(flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxInotifyAddWatch(fd: Int, path: Long, mask: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFanotifyInit(flags: Int, eventFFlags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGethostid(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxKlogctl(syslogType: Int, bufp: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxFopen64(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxPosixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxSendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxTmpfile64(): Long
}

public actual fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxGetspnamR(name.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqClose(mqd.toLong())

public actual fun mqUnlink(name: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqUnlink(name.rawAddress)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun mrand48(): CLong =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMrand48()

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSeed48(xseed.rawAddress))

public actual fun lcong48(p: MutPtr) {
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLcong48(p.rawAddress)
}

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLutimes(file.rawAddress, times.rawAddress)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxShmUnlink(name.rawAddress)

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFtok(pathname.rawAddress, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMsgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxReadahead(fd, offset, count.toLong())

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLgetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong())

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong())

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLsetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxListxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLlistxattr(path.rawAddress, list.rawAddress, size.toLong())

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFlistxattr(filedes, list.rawAddress, size.toLong())

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxRemovexattr(path.rawAddress, name.rawAddress)

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxLremovexattr(path.rawAddress, name.rawAddress)

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFremovexattr(filedes, name.rawAddress)

public actual fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSignalfd(fd, mask.rawAddress, flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxTimerfdGettime(fd, currValue.rawAddress)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxTimerfdSettime(fd, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun quotactl(cmd: CInt, special: ConstPtr, id: CInt, data: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxQuotactl(cmd, special.rawAddress, id, data.rawAddress)

public actual fun epollPwait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt, sigmask: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEpollPwait(epfd, events.rawAddress, maxevents, timeout, sigmask.rawAddress)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxDup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxAccept4(fd, addr.rawAddress, len.rawAddress, flg)

public actual fun reboot(howTo: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxReboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSetfsgid(gid.toShort())

public actual fun setfsuid(uid: UidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSetfsuid(uid.toShort())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSyncFileRange(fd, offset, nbytes, flags.toInt())

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun remapFilePages(addr: MutPtr, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxRemapFilePages(addr.rawAddress, size.toLong(), prot, pgoff.toLong(), flags)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxMkstemps(template.rawAddress, suffixlen)

public actual fun vhangup(): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxVhangup()

public actual fun sync() {
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSyncfs(fd)

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedSetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun epollCreate(size: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEpollWait(epfd, events.rawAddress, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEpollCtl(epfd, op, fd, event.rawAddress)

public actual fun unshare(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxUnshare(flags)

public actual fun umount(target: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxUmount(target.rawAddress)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxTee(fdIn, fdOut, len.toLong(), flags.toInt())

public actual fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSplice(fdIn, offIn.rawAddress, fdOut, offOut.rawAddress, len.toLong(), flags.toInt())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEventfd(initval.toInt(), flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEventfdRead(fd, value.rawAddress)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxEventfdWrite(fd, value.toLong())

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedRrGetInterval(pid, tp.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedSetparam(pid, param.rawAddress)

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSetns(fd, nstype)

public actual fun swapoff(path: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSwapoff(path.rawAddress)

public actual fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxVmsplice(fd, iov.rawAddress, nrSegs.toLong(), flags.toInt())

public actual fun personality(persona: CUlong): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPersonality(persona.toLong())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedGetparam(pid, param.rawAddress)

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxClone(0L, childStack.rawAddress, flags, arg.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun umount2(target: ConstPtr, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxUmount2(target.rawAddress, flags)

public actual fun swapon(path: ConstPtr, swapflags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSwapon(path.rawAddress, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSendfile(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxGetdtablesize()

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxGetgrouplist(user.rawAddress, group.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFreadUnlocked(buf.rawAddress, size.toLong(), nobj.toLong(), stream.rawAddress).toULong()

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxInotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxInotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxInotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxInotifyAddWatch(fd, path.rawAddress, mask.toInt())

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFanotifyInit(flags.toInt(), eventFFlags.toInt())

public actual fun gethostid(): CLong =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxGethostid()

public actual fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxKlogctl(syslogType, bufp.rawAddress, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFgetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxFopen64(filename.rawAddress, mode.rawAddress))

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxPosixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxSendfile64(outFd, inFd, offset.rawAddress, count.toLong())

public actual fun tmpfile64(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxJniBridge.libcUnixLinuxlikeLinuxTmpfile64())
