@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxAccept4
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxClockNanosleep
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxClone
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxDup3
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEpollCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEpollCreate1
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEpollCtl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEpollPwait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEpollWait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEventfd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEventfdRead
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxEventfdWrite
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFallocate64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFanotifyInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFgetpos64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFlistxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFopen64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFreadUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxFtok
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxGetdtablesize
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxGetgrouplist
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxGethostid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxGetspnamR
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxGetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxInotifyAddWatch
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxInotifyInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxInotifyInit1
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxInotifyRmWatch
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxKlogctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLcong48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxListxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLlistxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxLutimes
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMkfifoat
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMkstemps
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqClose
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqGetattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqOpen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqReceive
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqSend
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqSetattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqTimedreceive
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqTimedsend
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMqUnlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMrand48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMsgctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMsgget
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMsgrcv
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxMsgsnd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPersonality
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixFallocate64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixMadvise
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawn
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxPosixSpawnp
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxQuotactl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxReadahead
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxReboot
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxRemapFilePages
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxRemovexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedGetparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedGetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedRrGetInterval
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedSetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedSetparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSchedSetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSeed48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSemctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSemget
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSemop
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSendfile
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSendfile64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSetfsgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSetfsuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSetns
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxShmOpen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxShmUnlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSigaltstack
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSignalfd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSigtimedwait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSigwaitinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSplice
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSwapoff
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSwapon
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSync
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSyncFileRange
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSyncfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxSyscall
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxTee
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxTimerfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxTimerfdGettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxTimerfdSettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxTmpfile64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxUmount
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxUmount2
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxUnshare
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxVhangup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libcUnixLinuxlikeLinuxVmsplice
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGetspnamR(name.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixLinuxlikeLinuxMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixLinuxlikeLinuxMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    libcUnixLinuxlikeLinuxMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    libcUnixLinuxlikeLinuxMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixLinuxlikeLinuxMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixLinuxlikeLinuxMrand48()

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48(p: MutPtr) {
    libcUnixLinuxlikeLinuxLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixLinuxlikeLinuxShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    libcUnixLinuxlikeLinuxFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    libcUnixLinuxlikeLinuxSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    libcUnixLinuxlikeLinuxSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeLinuxSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxMsgctl(msqid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libcUnixLinuxlikeLinuxMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixLinuxlikeLinuxMsgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt =
    libcUnixLinuxlikeLinuxMsgsnd(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libcUnixLinuxlikeLinuxFallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixLinuxlikeLinuxPosixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxReadahead(fd, offset, count)

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxFremovexattr(filedes, name.rawAddress.toCPointer<ByteVar>())

public actual fun signalfd(fd: CInt, mask: ConstPtr, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxSignalfd(fd, mask.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    libcUnixLinuxlikeLinuxTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixLinuxlikeLinuxTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun quotactl(cmd: CInt, special: ConstPtr, id: CInt, data: MutPtr): CInt =
    libcUnixLinuxlikeLinuxQuotactl(cmd, special.rawAddress.toCPointer<ByteVar>(), id, data.rawAddress.toCPointer<ByteVar>())

public actual fun epollPwait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt, sigmask: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxEpollPwait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout, sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxDup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixLinuxlikeLinuxSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    libcUnixLinuxlikeLinuxAccept4(fd, addr.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), flg)

public actual fun reboot(howTo: CInt): CInt =
    libcUnixLinuxlikeLinuxReboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    libcUnixLinuxlikeLinuxSetfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    libcUnixLinuxlikeLinuxSetfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixLinuxlikeLinuxMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxSyncFileRange(fd, offset, nbytes, flags)

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixLinuxlikeLinuxPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun remapFilePages(addr: MutPtr, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxRemapFilePages(addr.rawAddress.toCPointer<ByteVar>(), size, prot, pgoff, flags)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    libcUnixLinuxlikeLinuxMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun vhangup(): CInt =
    libcUnixLinuxlikeLinuxVhangup()

public actual fun sync() {
    libcUnixLinuxlikeLinuxSync()
}

public actual fun syncfs(fd: CInt): CInt =
    libcUnixLinuxlikeLinuxSyncfs(fd)

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeLinuxSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    libcUnixLinuxlikeLinuxEpollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libcUnixLinuxlikeLinuxEpollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: CInt): CInt =
    libcUnixLinuxlikeLinuxEpollWait(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr): CInt =
    libcUnixLinuxlikeLinuxEpollCtl(epfd, op, fd, event.rawAddress.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    libcUnixLinuxlikeLinuxUnshare(flags)

public actual fun umount(target: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxUmount(target.rawAddress.toCPointer<ByteVar>())

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxTee(fdIn, fdOut, len, flags)

public actual fun splice(fdIn: CInt, offIn: MutPtr, fdOut: CInt, offOut: MutPtr, len: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxSplice(fdIn, offIn.rawAddress.toCPointer<ByteVar>(), fdOut, offOut.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxEventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr): CInt =
    libcUnixLinuxlikeLinuxEventfdRead(fd, value.rawAddress.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    libcUnixLinuxlikeLinuxEventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    libcUnixLinuxlikeLinuxSetns(fd, nstype)

public actual fun swapoff(path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxSwapoff(path.rawAddress.toCPointer<ByteVar>())

public actual fun vmsplice(fd: CInt, iov: ConstPtr, nrSegs: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxVmsplice(fd, iov.rawAddress.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun personality(persona: CUlong): CInt =
    libcUnixLinuxlikeLinuxPersonality(persona)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcUnixLinuxlikeLinuxSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr, flags: CInt, arg: MutPtr, vararg variadicArgs: Long): CInt =
    libcUnixLinuxlikeLinuxClone(0L.toCPointer<ByteVar>(), childStack.rawAddress.toCPointer<ByteVar>(), flags, arg.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixLinuxlikeLinuxSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun umount2(target: ConstPtr, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxUmount2(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun swapon(path: ConstPtr, swapflags: CInt): CInt =
    libcUnixLinuxlikeLinuxSwapon(path.rawAddress.toCPointer<ByteVar>(), swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxSendfile(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    libcUnixLinuxlikeLinuxSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixLinuxlikeLinuxGetdtablesize()

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    libcUnixLinuxlikeLinuxPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcUnixLinuxlikeLinuxFreadUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    libcUnixLinuxlikeLinuxInotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    libcUnixLinuxlikeLinuxInotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    libcUnixLinuxlikeLinuxInotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt =
    libcUnixLinuxlikeLinuxInotifyAddWatch(fd, path.rawAddress.toCPointer<ByteVar>(), mask)

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    libcUnixLinuxlikeLinuxFanotifyInit(flags, eventFFlags)

public actual fun gethostid(): CLong =
    libcUnixLinuxlikeLinuxGethostid()

public actual fun klogctl(syslogType: CInt, bufp: MutPtr, len: CInt): CInt =
    libcUnixLinuxlikeLinuxKlogctl(syslogType, bufp.rawAddress.toCPointer<ByteVar>(), len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixLinuxlikeLinuxFallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt =
    libcUnixLinuxlikeLinuxFgetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxFopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixLinuxlikeLinuxPosixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    libcUnixLinuxlikeLinuxSendfile64(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun tmpfile64(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxTmpfile64()?.toLong() ?: 0L)
