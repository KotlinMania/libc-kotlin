@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_abs
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioCancel
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioError
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioFsync
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioRead
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioReturn
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioSuspend
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_aioWrite
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_bind
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clearenv
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clockGetcpuclockid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clockGetres
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clockGettime
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clockNanosleep
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_clockSettime
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ctermid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_daemon
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_dircntl
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_dirfd
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_dlIteratePhdr
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_endgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_endpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_endspent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_execvpe
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_faccessat
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_fdatasync
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_forkpty
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_freeifaddrs
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ftok
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_futimens
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getErrnoPtr
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_get_SYSPAGE_PTR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getdomainname
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getdtablesize
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrgid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrgidR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrnam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrnamR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getgrouplist
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getifaddrs
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getitimer
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getnameinfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpeereid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpriority
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpwentR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpwnamR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getpwuidR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_getrlimit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_gettid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_gettimeofday
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_glob
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_globfree
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ifFreenameindex
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ifNameindex
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_initgroups
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_inotifyAddWatch
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_inotifyInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_inotifyRmWatch
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ioctl
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_labs
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_lioListio
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_loginTty
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mallopt
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_memalign
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_memsetS
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mkfifoat
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mknodat
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mkostemp
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mkostemps
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mkstemps
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mount
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mprotect
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqClose
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqGetattr
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqNotify
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqReceive
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqSend
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqSetattr
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqTimedreceive
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqTimedsend
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_mqUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_msync
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_myThreadExit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_nlLanginfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_openpty
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_popen
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixFadvise
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixFallocate
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixMadvise
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawn
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_posixSpawnp
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadAtfork
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadAttrGetstack
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierWait
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCancel
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadGetnameNp
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadGetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadKill
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexConsistent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexattrGetrobust
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadMutexattrSetrobust
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSetnameNp
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSetschedprio
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSpinDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSpinInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSpinLock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSpinTrylock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_pthreadSpinUnlock
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_ptsnameR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_rand
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_readv
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_recvfrom
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_recvmmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_recvmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_regcomp
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_regerror
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_regexec
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_regfree
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedGetPriorityMax
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedGetPriorityMin
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedGetparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedGetscheduler
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedRrGetInterval
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedSetparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_schedSetscheduler
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_seekdir
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semClose
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semGetvalue
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semTimedwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_semUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sendmmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sendmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_set_SYSPAGE_PTR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setdomainname
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setgroups
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sethostname
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setitimer
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setpriority
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setrlimit
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_setspent
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_settimeofday
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_shmOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_shmUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sigsuspend
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sigtimedwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sigwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sigwaitinfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_srand
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_strerrorR
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sync
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_sysctl
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_telldir
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_umount
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_uname
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_utimensat
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_wait4
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_waitid
import io.github.kotlinmania.libc.unix.nto.cinterop.libc_unix_nto_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var SYSPAGE_PTR: COpaquePointer?
    get() = libc_unix_nto_get_SYSPAGE_PTR()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        libc_unix_nto_set_SYSPAGE_PTR(value?.value?.toCPointer<ByteVar>())
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    libc_unix_nto_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    libc_unix_nto_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_unix_nto_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_unix_nto_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    libc_unix_nto_fdatasync(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_nto_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc_unix_nto_setpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_nto_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_unix_nto_mknodat(fd, pathname, mode, dev)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_nto_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_nto_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_nto_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    libc_unix_nto_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_unix_nto_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_nto_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    libc_unix_nto_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libc_unix_nto_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_nto_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_nto_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_unix_nto_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_unix_nto_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_nto_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_nto_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_nto_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    libc_unix_nto_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    libc_unix_nto_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    libc_unix_nto_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun clearenv(): CInt =
    libc_unix_nto_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_nto_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    libc_unix_nto_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_nto_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc_unix_nto_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    libc_unix_nto_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    libc_unix_nto_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_nto_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_nto_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_nto_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_nto_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    libc_unix_nto_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    libc_unix_nto_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libc_unix_nto_loginTty(fd)

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_nto_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    libc_unix_nto_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_nto_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libc_unix_nto_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_nto_labs(i)

public actual fun rand(): CInt =
    libc_unix_nto_rand()

public actual fun srand(seed: CUint) {
    libc_unix_nto_srand(seed)
}

public actual fun setpwent() {
    libc_unix_nto_setpwent()
}

public actual fun endpwent() {
    libc_unix_nto_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    libc_unix_nto_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_unix_nto_setgrent()
}

public actual fun endgrent() {
    libc_unix_nto_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_unix_nto_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    libc_unix_nto_setspent()
}

public actual fun endspent() {
    libc_unix_nto_endspent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_nto_shmOpen(name, oflag, mode)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    libc_unix_nto_ftok(pathname, projId)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_nto_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_nto_posixFallocate(fd, offset, len)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    libc_unix_nto_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    libc_unix_nto_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_nto_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_unix_nto_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libc_unix_nto_pthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun ifNameindex(): COpaquePointer? =
    libc_unix_nto_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    libc_unix_nto_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_nto_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_nto_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_nto_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_nto_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_nto_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_nto_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_nto_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_nto_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_unix_nto_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    libc_unix_nto_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    libc_unix_nto_setdomainname(name, len)

public actual fun sync() {
    libc_unix_nto_sync()
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_nto_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun umount(target: String?, flags: CInt): CInt =
    libc_unix_nto_umount(target, flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_unix_nto_schedGetPriorityMax(policy)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_nto_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    libc_unix_nto_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_nto_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_unix_nto_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_nto_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    libc_unix_nto_mount(specialDevice, mountDirectory, flags, mountType, mountData?.value?.toCPointer<ByteVar>(), mountDatalen)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_nto_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    libc_unix_nto_pthreadMutexConsistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_nto_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_nto_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    libc_unix_nto_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_nto_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_unix_nto_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_nto_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    libc_unix_nto_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    libc_unix_nto_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    libc_unix_nto_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc_unix_nto_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_unix_nto_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    libc_unix_nto_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    libc_unix_nto_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_unix_nto_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_unix_nto_schedGetPriorityMin(policy)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_unix_nto_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_nto_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_unix_nto_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_nto_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_unix_nto_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc_unix_nto_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_nto_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc_unix_nto_initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_unix_nto_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_nto_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_nto_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc_unix_nto_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc_unix_nto_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    libc_unix_nto_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_unix_nto_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_nto_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_nto_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_unix_nto_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc_unix_nto_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_nto_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_unix_nto_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_unix_nto_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    libc_unix_nto_pthreadMutexattrGetrobust(attr?.value?.toCPointer<ByteVar>(), robustness?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    libc_unix_nto_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_nto_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    libc_unix_nto_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    libc_unix_nto_setitimer(which, value?.value?.toCPointer<ByteVar>(), ovalue?.value?.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_nto_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    libc_unix_nto_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    libc_unix_nto_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    libc_unix_nto_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_nto_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_nto_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    libc_unix_nto_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_unix_nto_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_unix_nto_faccessat(dirfd, pathname, mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    libc_unix_nto_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    libc_unix_nto_inotifyInit()

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    libc_unix_nto_inotifyAddWatch(fd, path, mask)

public actual fun gettid(): PidT =
    libc_unix_nto_gettid()

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    libc_unix_nto_pthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_nto_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    libc_unix_nto_mallopt(param, value)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_nto_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    libc_unix_nto_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_nto_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    libc_unix_nto_getpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), bufsize, result?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt =
    libc_unix_nto_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    libc_unix_nto_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)

public actual fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    libc_unix_nto_sysctl(arg0?.value?.toCPointer<ByteVar>(), arg1, arg2?.value?.toCPointer<ByteVar>(), arg3?.value?.toCPointer<ByteVar>(), arg4?.value?.toCPointer<ByteVar>(), arg5)

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    libc_unix_nto_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt =
    libc_unix_nto_setrlimit(resource, rlp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt =
    libc_unix_nto_lioListio(mode, list?.value?.toCPointer<ByteVar>(), nent, sig?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    libc_unix_nto_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    libc_unix_nto_memsetS(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    libc_unix_nto_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    libc_unix_nto_regexec(preg?.value?.toCPointer<ByteVar>(), str, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc_unix_nto_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    libc_unix_nto_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: DIR?): CInt =
    libc_unix_nto_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_nto_dircntl(dir?.handle?.toCPointer<ByteVar>(), cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_nto_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    libc_unix_nto_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_nto_aioFsync(operation, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    libc_unix_nto_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocpb: COpaquePointer?): SsizeT =
    libc_unix_nto_aioReturn(aiocpb?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_nto_aioSuspend(list?.value?.toCPointer<ByteVar>(), nent, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocpb: COpaquePointer?): CInt =
    libc_unix_nto_aioWrite(aiocpb?.value?.toCPointer<ByteVar>())

public actual fun mqClose(mqdes: MqdT): CInt =
    libc_unix_nto_mqClose(mqdes.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt =
    libc_unix_nto_mqGetattr(mqdes.toLong().toCPointer<ByteVar>(), mqstat?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt =
    libc_unix_nto_mqNotify(mqdes.toLong().toCPointer<ByteVar>(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libc_unix_nto_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    libc_unix_nto_mqReceive(mqdes.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    libc_unix_nto_mqSend(mqdes.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt =
    libc_unix_nto_mqSetattr(mqdes.toLong().toCPointer<ByteVar>(), mqstat?.value?.toCPointer<ByteVar>(), omqstat?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    libc_unix_nto_mqTimedreceive(mqdes.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    libc_unix_nto_mqTimedsend(mqdes.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    libc_unix_nto_mqUnlink(name)

public actual fun getErrnoPtr(): COpaquePointer? =
    libc_unix_nto_getErrnoPtr()?.let { COpaquePointer(it.toLong()) }

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    libc_unix_nto_myThreadExit(valuePtr?.value?.toCPointer<ByteVar>())
}
