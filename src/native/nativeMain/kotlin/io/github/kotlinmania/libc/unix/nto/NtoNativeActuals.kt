@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAbs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioCancel
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioError
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioFsync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioRead
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioReturn
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioSuspend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoAioWrite
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoBind
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClearenv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClockGetcpuclockid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClockGetres
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClockGettime
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClockNanosleep
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoClockSettime
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoCtermid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoDaemon
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoDircntl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoDirfd
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoDlIteratePhdr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoEndgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoEndpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoEndspent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoExecvpe
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoFaccessat
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoFdatasync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoForkpty
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoFreeifaddrs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoFtok
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoFutimens
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetErrnoPtr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetSYSPAGEPTR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetdomainname
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetdtablesize
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrgid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrgidR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrnam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrnamR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetgrouplist
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetifaddrs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetitimer
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetnameinfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpeereid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpriority
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpwentR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpwnamR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetpwuidR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGetrlimit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGettid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGettimeofday
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGlob
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoGlobfree
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoIfFreenameindex
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoIfNameindex
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoInitgroups
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoInotifyAddWatch
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoInotifyInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoInotifyRmWatch
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoIoctl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoLabs
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoLioListio
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoLoginTty
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMallopt
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMemalign
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMemsetS
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMkfifoat
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMknodat
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMkostemp
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMkostemps
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMkstemps
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMount
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMprotect
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqClose
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqGetattr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqNotify
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqReceive
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqSend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqSetattr
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqTimedreceive
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqTimedsend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMqUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMsync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoMyThreadExit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoNlLanginfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoOpenpty
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPopen
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixFadvise
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixFallocate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixMadvise
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawn
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPosixSpawnp
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadAtfork
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierWait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCancel
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadCreate
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadGetnameNp
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadGetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadKill
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexConsistent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexattrGetrobust
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadMutexattrSetrobust
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSetnameNp
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSetschedparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSetschedprio
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSigmask
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSpinInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSpinLock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoPtsnameR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRand
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoReadv
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRecvfrom
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRecvmmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRecvmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRegcomp
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRegerror
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRegexec
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoRegfree
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedGetparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedGetscheduler
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedRrGetInterval
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedSetparam
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSchedSetscheduler
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSeekdir
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemClose
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemDestroy
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemGetvalue
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemInit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemTimedwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSemUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSendmmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSendmsg
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetSYSPAGEPTR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetdomainname
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetgrent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetgroups
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSethostname
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetitimer
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetpriority
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetpwent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetrlimit
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSetspent
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSettimeofday
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoShmOpen
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoShmUnlink
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSigsuspend
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSigtimedwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSigwait
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSigwaitinfo
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSrand
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoStrerrorR
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSync
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoSysctl
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoTelldir
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoUmount
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoUname
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoUtimensat
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoWait4
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoWaitid
import io.github.kotlinmania.libc.unix.nto.cinterop.libcUnixNtoWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var SYSPAGE_PTR: MutPtr<SyspageEntry>
    get() = MutPtr(libcUnixNtoGetSYSPAGEPTR()?.toLong() ?: 0L)
    set(value) {
        libcUnixNtoSetSYSPAGEPTR(value.rawAddress.toCPointer<ByteVar>())
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint): CInt =
    libcUnixNtoSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint, timeout: MutPtr<Timespec>): CInt =
    libcUnixNtoRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixNtoSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixNtoSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixNtoFdatasync(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixNtoGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixNtoSetpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixNtoMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(fd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixNtoMknodat(fd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixNtoClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixNtoClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixNtoClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixNtoClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixNtoPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixNtoMemalign(align, size)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    libcUnixNtoSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixNtoPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixNtoFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcUnixNtoNlLanginfo(item)?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixNtoUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcUnixNtoPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixNtoPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    libcUnixNtoPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    libcUnixNtoPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    libcUnixNtoPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    libcUnixNtoPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixNtoPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun clearenv(): CInt =
    libcUnixNtoClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixNtoWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    libcUnixNtoWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixNtoExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    libcUnixNtoGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    libcUnixNtoFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcUnixNtoBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixNtoWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixNtoReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixNtoSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixNtoRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    libcUnixNtoOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    libcUnixNtoForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixNtoLoginTty(fd)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixNtoUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    libcUnixNtoGetpeereid(socket, euid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixNtoStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun abs(i: CInt): CInt =
    libcUnixNtoAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixNtoLabs(i)

public actual fun rand(): CInt =
    libcUnixNtoRand()

public actual fun srand(seed: CUint) {
    libcUnixNtoSrand(seed)
}

public actual fun setpwent() {
    libcUnixNtoSetpwent()
}

public actual fun endpwent() {
    libcUnixNtoEndpwent()
}

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcUnixNtoGetpwent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixNtoSetgrent()
}

public actual fun endgrent() {
    libcUnixNtoEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcUnixNtoGetgrent()?.toLong() ?: 0L)

public actual fun setspent() {
    libcUnixNtoSetspent()
}

public actual fun endspent() {
    libcUnixNtoEndspent()
}

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixNtoShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    libcUnixNtoFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixNtoMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixNtoPosixFallocate(fd, offset, len)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcUnixNtoMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcUnixNtoMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixNtoSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixNtoSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libcUnixNtoPthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixNtoIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixNtoIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    libcUnixNtoGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr<GlobT>) {
    libcUnixNtoGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixNtoPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixNtoShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixNtoSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixNtoTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixNtoMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcUnixNtoRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcUnixNtoMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixNtoGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixNtoSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun sync() {
    libcUnixNtoSync()
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcUnixNtoPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun umount(target: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixNtoUmount(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixNtoSchedGetPriorityMax(policy)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    libcUnixNtoSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    libcUnixNtoSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixNtoSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixNtoSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun mount(specialDevice: ConstPtr<CChar>, mountDirectory: ConstPtr<CChar>, flags: CInt, mountType: ConstPtr<CChar>, mountData: ConstPtr<CVoid>, mountDatalen: CInt): CInt =
    libcUnixNtoMount(specialDevice.rawAddress.toCPointer<ByteVar>(), mountDirectory.rawAddress.toCPointer<ByteVar>(), flags, mountType.rawAddress.toCPointer<ByteVar>(), mountData.rawAddress.toCPointer<ByteVar>(), mountDatalen)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixNtoSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    libcUnixNtoPthreadMutexConsistent(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixNtoPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixNtoPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixNtoPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixNtoPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixNtoPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixNtoPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixNtoPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixNtoPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixNtoPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    libcUnixNtoPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    libcUnixNtoPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixNtoPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixNtoPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixNtoSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixNtoClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixNtoPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcUnixNtoPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixNtoSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixNtoSchedGetPriorityMin(policy)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixNtoPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixNtoSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixNtoGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixNtoSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixNtoGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixNtoGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    libcUnixNtoInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixNtoPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixNtoSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixNtoGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixNtoPthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixNtoPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixNtoSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixNtoDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixNtoGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixNtoGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixNtoSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixNtoPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixNtoGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixNtoGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixNtoPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt =
    libcUnixNtoPthreadMutexattrGetrobust(attr.rawAddress.toCPointer<ByteVar>(), robustness.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt =
    libcUnixNtoPthreadMutexattrSetrobust(attr.rawAddress.toCPointer<ByteVar>(), robustness)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixNtoPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    libcUnixNtoGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, value: ConstPtr<Itimerval>, ovalue: MutPtr<Itimerval>): CInt =
    libcUnixNtoSetitimer(which, value.rawAddress.toCPointer<ByteVar>(), ovalue.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixNtoPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixNtoPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixNtoPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixNtoPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixNtoPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixNtoPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixNtoPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixNtoPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixNtoPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixNtoPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    libcUnixNtoPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    libcUnixNtoPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    libcUnixNtoPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    libcUnixNtoPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixNtoPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixNtoPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixNtoPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixNtoPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixNtoPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixNtoPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    libcUnixNtoPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixNtoPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcUnixNtoFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    libcUnixNtoInotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    libcUnixNtoInotifyInit()

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt =
    libcUnixNtoInotifyAddWatch(fd, path.rawAddress.toCPointer<ByteVar>(), mask)

public actual fun gettid(): PidT =
    libcUnixNtoGettid()

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixNtoPthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixNtoGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    libcUnixNtoMallopt(param, value)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixNtoGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixNtoCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixNtoIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, bufsize: CInt, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixNtoGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize, result.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: CInt): CInt =
    libcUnixNtoPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    libcUnixNtoPthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun sysctl(arg0: ConstPtr<CInt>, arg1: CUint, arg2: MutPtr<CVoid>, arg3: MutPtr<SizeT>, arg4: ConstPtr<CVoid>, arg5: SizeT): CInt =
    libcUnixNtoSysctl(arg0.rawAddress.toCPointer<ByteVar>(), arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>(), arg4.rawAddress.toCPointer<ByteVar>(), arg5)

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixNtoGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlp: ConstPtr<Rlimit>): CInt =
    libcUnixNtoSetrlimit(resource, rlp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, list: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sig: MutPtr<Sigevent>): CInt =
    libcUnixNtoLioListio(mode, list.rawAddress.toCPointer<ByteVar>(), nent, sig.rawAddress.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixNtoDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    libcUnixNtoMemsetS(s.rawAddress.toCPointer<ByteVar>(), smax, c, n)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    libcUnixNtoRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regexec(preg: ConstPtr<RegexT>, str: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    libcUnixNtoRegexec(preg.rawAddress.toCPointer<ByteVar>(), str.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    libcUnixNtoRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr<RegexT>) {
    libcUnixNtoRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixNtoDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun dircntl(dir: MutPtr<DIR>, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixNtoDircntl(dir.rawAddress.toCPointer<ByteVar>(), cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixNtoAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixNtoAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(operation: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixNtoAioFsync(operation, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixNtoAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocpb: MutPtr<Aiocb>): SsizeT =
    libcUnixNtoAioReturn(aiocpb.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixNtoAioSuspend(list.rawAddress.toCPointer<ByteVar>(), nent, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocpb: MutPtr<Aiocb>): CInt =
    libcUnixNtoAioWrite(aiocpb.rawAddress.toCPointer<ByteVar>())

public actual fun mqClose(mqdes: MqdT): CInt =
    libcUnixNtoMqClose(mqdes.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqdes: MqdT, mqstat: MutPtr<MqAttr>): CInt =
    libcUnixNtoMqGetattr(mqdes.toLong().toCPointer<ByteVar>(), mqstat.rawAddress.toCPointer<ByteVar>())

public actual fun mqNotify(mqdes: MqdT, notification: ConstPtr<Sigevent>): CInt =
    libcUnixNtoMqNotify(mqdes.toLong().toCPointer<ByteVar>(), notification.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixNtoMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqReceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcUnixNtoMqReceive(mqdes.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixNtoMqSend(mqdes.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqSetattr(mqdes: MqdT, mqstat: ConstPtr<MqAttr>, omqstat: MutPtr<MqAttr>): CInt =
    libcUnixNtoMqSetattr(mqdes.toLong().toCPointer<ByteVar>(), mqstat.rawAddress.toCPointer<ByteVar>(), omqstat.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcUnixNtoMqTimedreceive(mqdes.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcUnixNtoMqTimedsend(mqdes.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixNtoMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun getErrnoPtr(): MutPtr<CInt> =
    MutPtr(libcUnixNtoGetErrnoPtr()?.toLong() ?: 0L)

public actual fun myThreadExit(valuePtr: MutPtr<ConstPtr<CVoid>>) {
    libcUnixNtoMyThreadExit(valuePtr.rawAddress.toCPointer<ByteVar>())
}
