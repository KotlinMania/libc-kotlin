@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_accept4
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_clockNanosleep
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_clone
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_dup3
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCreate1
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollCtl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollPwait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_epollWait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfdRead
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_eventfdWrite
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fallocate64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fanotifyInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fgetpos64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_flistxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fopen64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_freadUnlocked
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_fsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_ftok
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getdtablesize
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getgrouplist
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_gethostid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getspnamR
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_getxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyAddWatch
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyInit1
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_inotifyRmWatch
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_klogctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lcong48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lgetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_listxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_llistxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lremovexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lsetxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_lutimes
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mkfifoat
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mkstemps
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqClose
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqGetattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqOpen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqReceive
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqSend
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqSetattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqTimedreceive
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqTimedsend
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mqUnlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_mrand48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgget
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgrcv
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_msgsnd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_personality
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixFallocate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixFallocate64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixMadvise
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawn
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_posixSpawnp
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_quotactl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_readahead
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_reboot
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_remapFilePages
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_removexattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedGetparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedGetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedRrGetInterval
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetaffinity
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetparam
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_schedSetscheduler
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_seed48
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_semctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_semget
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_semop
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sendfile
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sendfile64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setfsgid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setfsuid
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setns
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_setxattr
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_shmOpen
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_shmUnlink
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigaltstack
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_signalfd
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigtimedwait
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sigwaitinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_splice
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_swapoff
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_swapon
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_sync
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_syncFileRange
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_syncfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_syscall
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_tee
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdGettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_timerfdSettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_tmpfile64
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_umount
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_umount2
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_unshare
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_vhangup
import io.github.kotlinmania.libc.unix.linuxlike.linux.cinterop.libc_unix_linuxlike_linux_vmsplice
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_getspnamR(name, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libc_unix_linuxlike_linux_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libc_unix_linuxlike_linux_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    libc_unix_linuxlike_linux_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    libc_unix_linuxlike_linux_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    libc_unix_linuxlike_linux_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    libc_unix_linuxlike_linux_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libc_unix_linuxlike_linux_mrand48()

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    libc_unix_linuxlike_linux_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    libc_unix_linuxlike_linux_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_linuxlike_linux_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_linuxlike_linux_shmUnlink(name)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    libc_unix_linuxlike_linux_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    libc_unix_linuxlike_linux_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    libc_unix_linuxlike_linux_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_linuxlike_linux_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libc_unix_linuxlike_linux_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libc_unix_linuxlike_linux_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    libc_unix_linuxlike_linux_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_linuxlike_linux_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_linuxlike_linux_posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    libc_unix_linuxlike_linux_readahead(fd, offset, count)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_linuxlike_linux_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    libc_unix_linuxlike_linux_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    libc_unix_linuxlike_linux_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    libc_unix_linuxlike_linux_fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    libc_unix_linuxlike_linux_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_quotactl(cmd, special, id, data?.value?.toCPointer<ByteVar>())

public actual fun epollPwait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt, sigmask: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_epollPwait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout, sigmask?.value?.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libc_unix_linuxlike_linux_dup3(oldfd, newfd, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    libc_unix_linuxlike_linux_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun reboot(howTo: CInt): CInt =
    libc_unix_linuxlike_linux_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    libc_unix_linuxlike_linux_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    libc_unix_linuxlike_linux_setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_linuxlike_linux_mkfifoat(dirfd, pathname, mode)

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    libc_unix_linuxlike_linux_syncFileRange(fd, offset, nbytes, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_linuxlike_linux_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun remapFilePages(addr: COpaquePointer?, size: SizeT, prot: CInt, pgoff: SizeT, flags: CInt): CInt =
    libc_unix_linuxlike_linux_remapFilePages(addr?.value?.toCPointer<ByteVar>(), size, prot, pgoff, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_unix_linuxlike_linux_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun vhangup(): CInt =
    libc_unix_linuxlike_linux_vhangup()

public actual fun sync() {
    libc_unix_linuxlike_linux_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    libc_unix_linuxlike_linux_syncfs(fd)

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    libc_unix_linuxlike_linux_syscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun epollCreate(size: CInt): CInt =
    libc_unix_linuxlike_linux_epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    libc_unix_linuxlike_linux_epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: CInt): CInt =
    libc_unix_linuxlike_linux_epollWait(epfd, events?.value?.toCPointer<ByteVar>(), maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_epollCtl(epfd, op, fd, event?.value?.toCPointer<ByteVar>())

public actual fun unshare(flags: CInt): CInt =
    libc_unix_linuxlike_linux_unshare(flags)

public actual fun umount(target: String?): CInt =
    libc_unix_linuxlike_linux_umount(target)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    libc_unix_linuxlike_linux_tee(fdIn, fdOut, len, flags)

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    libc_unix_linuxlike_linux_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libc_unix_linuxlike_linux_eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_eventfdRead(fd, value?.value?.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    libc_unix_linuxlike_linux_eventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    libc_unix_linuxlike_linux_setns(fd, nstype)

public actual fun swapoff(path: String?): CInt =
    libc_unix_linuxlike_linux_swapoff(path)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    libc_unix_linuxlike_linux_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun personality(persona: CUlong): CInt =
    libc_unix_linuxlike_linux_personality(persona)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    libc_unix_linuxlike_linux_clone(0L.toCPointer<ByteVar>(), childStack?.value?.toCPointer<ByteVar>(), flags, arg?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc_unix_linuxlike_linux_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun umount2(target: String?, flags: CInt): CInt =
    libc_unix_linuxlike_linux_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    libc_unix_linuxlike_linux_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    libc_unix_linuxlike_linux_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc_unix_linuxlike_linux_getdtablesize()

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_linuxlike_linux_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_linuxlike_linux_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    libc_unix_linuxlike_linux_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_unix_linuxlike_linux_freadUnlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    libc_unix_linuxlike_linux_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    libc_unix_linuxlike_linux_inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    libc_unix_linuxlike_linux_inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    libc_unix_linuxlike_linux_inotifyAddWatch(fd, path, mask)

public actual fun fanotifyInit(flags: CUint, eventFFlags: CUint): CInt =
    libc_unix_linuxlike_linux_fanotifyInit(flags, eventFFlags)

public actual fun gethostid(): CLong =
    libc_unix_linuxlike_linux_gethostid()

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    libc_unix_linuxlike_linux_klogctl(syslogType, bufp?.value?.toCPointer<ByteVar>(), len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    libc_unix_linuxlike_linux_fallocate64(fd, mode, offset, len)

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_unix_linuxlike_linux_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    libc_unix_linuxlike_linux_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libc_unix_linuxlike_linux_posixFallocate64(fd, offset, len)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    libc_unix_linuxlike_linux_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun tmpfile64(): FILE? =
    libc_unix_linuxlike_linux_tmpfile64()?.let { FILE(it.toLong()) }
