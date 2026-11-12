@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeAccept4
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeBacktrace
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeBacktraceSymbols
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeChflags
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeChflagsat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeClockGetcpuclockid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeClockGetres
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeClockGettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeClockNanosleep
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeClockSettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeDaemon
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeDirfd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeDlIteratePhdr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeDuplocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEaccess
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEndutxent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEui64Aton
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEui64Hostton
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEui64Ntoa
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeEui64Ntohost
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeExect
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeExecvP
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeExplicitBzero
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeFchflags
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeFexecve
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeForkpty
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeFparseln
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeFutimens
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetdomainname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetentropy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetgrentR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetgrouplist
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGethostid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetnameinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetpriority
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetpwentR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetrandom
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetresgid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetresuid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGettimeofday
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetutxent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetutxid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeGetutxline
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeIconv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeIconvClose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeIconvOpen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeInitgroups
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKenv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmClose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmGetloadavg
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmGetprocs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmOpen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmOpenfiles
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmRead
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeKvmWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeLchflags
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeLoginTty
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeLutimes
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMallocUsableSize
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMemrchr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMemsetS
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMincore
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMkfifoat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMknodat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMkostemp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMkostemps
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqClose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqGetattr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqNotify
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqOpen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqReceive
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqSend
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqSetattr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqTimedreceive
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqTimedsend
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeMqUnlink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeNewlocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeNlLanginfoL
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeNtpAdjtime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeNtpGettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeOpenpty
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePipe2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixFadvise
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixFallocate
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawn
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePosixSpawnp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePpoll
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePreadv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadAttrGetNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadAttrGetstack
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierWait
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadGetNameNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadGetnameNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadGetschedparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadMainNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadSetNameNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadSetnameNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePthreadSetschedparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePtrace
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePututxline
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikePwritev
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeQuerylocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeReboot
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeRtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSchedGetparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSchedGetscheduler
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSchedRrGetInterval
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSchedSetparam
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSchedSetscheduler
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSemDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSemGetvalue
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSemInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSemTimedwait
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSendfile
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSetdomainname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSethostid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSethostname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSetpriority
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSetresgid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSetresuid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSettimeofday
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSetutxent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeShmOpen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSigtimedwait
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSigwaitinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSysctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSysctlbyname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeSysctlnametomib
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeUselocale
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeUtimensat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.cinterop.libcUnixBsdFreebsdlikeUtrace
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun semDestroy(sem: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcUnixBsdFreebsdlikeSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixBsdFreebsdlikeDaemon(nochdir, noclose)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeAccept4(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    libcUnixBsdFreebsdlikeChflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun chflagsat(fd: CInt, path: ConstPtr, flags: CUlong, atflag: CInt): CInt =
    libcUnixBsdFreebsdlikeChflagsat(fd, path.rawAddress.toCPointer<ByteVar>(), flags, atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    libcUnixBsdFreebsdlikeClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdFreebsdlikeDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun endutxent() {
    libcUnixBsdFreebsdlikeEndutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    libcUnixBsdFreebsdlikeFchflags(fd, flags)

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    libcUnixBsdFreebsdlikeGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGetgrouplist(name.rawAddress.toCPointer<ByteVar>(), basegid, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    libcUnixBsdFreebsdlikeGetpriority(which, who)

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    libcUnixBsdFreebsdlikeGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun initgroups(name: ConstPtr, basegid: GidT): CInt =
    libcUnixBsdFreebsdlikeInitgroups(name.rawAddress.toCPointer<ByteVar>(), basegid)

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    libcUnixBsdFreebsdlikeLchflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixBsdFreebsdlikeMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixBsdFreebsdlikeMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun mallocUsableSize(ptr: ConstPtr): SizeT =
    libcUnixBsdFreebsdlikeMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    libcUnixBsdFreebsdlikeMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdFreebsdlikeNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikePipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixBsdFreebsdlikePosixFallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixBsdFreebsdlikePosixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdFreebsdlikePreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadAttrGetNp(tid.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    libcUnixBsdFreebsdlikePthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixBsdFreebsdlikePthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixBsdFreebsdlikePthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMainNp(): CInt =
    libcUnixBsdFreebsdlikePthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixBsdFreebsdlikePthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    libcUnixBsdFreebsdlikePthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT) {
    libcUnixBsdFreebsdlikePthreadGetNameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr) {
    libcUnixBsdFreebsdlikePthreadSetNameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt =
    libcUnixBsdFreebsdlikePthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcUnixBsdFreebsdlikePthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    libcUnixBsdFreebsdlikePtrace(request, pid, addr.rawAddress.toCPointer<ByteVar>(), data)

public actual fun utrace(addr: ConstPtr, len: SizeT): CInt =
    libcUnixBsdFreebsdlikeUtrace(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikePututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdFreebsdlikePwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    ConstPtr(libcUnixBsdFreebsdlikeQuerylocale(mask, loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtprio(function: CInt, pid: PidT, rtp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeRtprio(function, pid, rtp.rawAddress.toCPointer<ByteVar>())

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSchedRrGetInterval(pid, t.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixBsdFreebsdlikeSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr, sbytes: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeSendfile(fd, s, offset, nbytes, hdtr.rawAddress.toCPointer<ByteVar>(), sbytes.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    libcUnixBsdFreebsdlikeSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    libcUnixBsdFreebsdlikeSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    libcUnixBsdFreebsdlikeSetpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixBsdFreebsdlikeSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixBsdFreebsdlikeSetresuid(ruid, euid, suid)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun setutxent() {
    libcUnixBsdFreebsdlikeSetutxent()
}

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixBsdFreebsdlikeShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    libcUnixBsdFreebsdlikeSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    libcUnixBsdFreebsdlikeSysctlbyname(name.rawAddress.toCPointer<ByteVar>(), oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    libcUnixBsdFreebsdlikeSysctlnametomib(name.rawAddress.toCPointer<ByteVar>(), mibp.rawAddress.toCPointer<ByteVar>(), sizep.rawAddress.toCPointer<ByteVar>())

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixBsdFreebsdlikeUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcUnixBsdFreebsdlikeUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: MutPtr): CInt =
    libcUnixBsdFreebsdlikeNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    libcUnixBsdFreebsdlikeDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(libcUnixBsdFreebsdlikeIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    libcUnixBsdFreebsdlikeIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixBsdFreebsdlikeIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    libcUnixBsdFreebsdlikeExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    libcUnixBsdFreebsdlikeMemsetS(s.rawAddress.toCPointer<ByteVar>(), smax, c, n)

public actual fun gethostid(): CLong =
    libcUnixBsdFreebsdlikeGethostid()

public actual fun sethostid(hostid: CLong) {
    libcUnixBsdFreebsdlikeSethostid(hostid)
}

public actual fun eui64Aton(a: ConstPtr, e: MutPtr): CInt =
    libcUnixBsdFreebsdlikeEui64Aton(a.rawAddress.toCPointer<ByteVar>(), e.rawAddress.toCPointer<ByteVar>())

public actual fun eui64Ntoa(id: ConstPtr, a: MutPtr, len: SizeT): CInt =
    libcUnixBsdFreebsdlikeEui64Ntoa(id.rawAddress.toCPointer<ByteVar>(), a.rawAddress.toCPointer<ByteVar>(), len)

public actual fun eui64Ntohost(hostname: MutPtr, len: SizeT, id: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeEui64Ntohost(hostname.rawAddress.toCPointer<ByteVar>(), len, id.rawAddress.toCPointer<ByteVar>())

public actual fun eui64Hostton(hostname: ConstPtr, id: MutPtr): CInt =
    libcUnixBsdFreebsdlikeEui64Hostton(hostname.rawAddress.toCPointer<ByteVar>(), id.rawAddress.toCPointer<ByteVar>())

public actual fun eaccess(path: ConstPtr, mode: CInt): CInt =
    libcUnixBsdFreebsdlikeEaccess(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun kenv(action: CInt, name: ConstPtr, value: MutPtr, len: CInt): CInt =
    libcUnixBsdFreebsdlikeKenv(action, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), len)

public actual fun reboot(howto: CInt): CInt =
    libcUnixBsdFreebsdlikeReboot(howto)

public actual fun exect(path: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeExect(path.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeExecvP(file.rawAddress.toCPointer<ByteVar>(), searchPath.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    libcUnixBsdFreebsdlikePosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixBsdFreebsdlikePosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    libcUnixBsdFreebsdlikePosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    libcUnixBsdFreebsdlikePosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixBsdFreebsdlikeMqClose(mqd.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    libcUnixBsdFreebsdlikeMqGetattr(mqd.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeMqNotify(mqd.rawAddress.toCPointer<ByteVar>(), notification.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    MutPtr(libcUnixBsdFreebsdlikeMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    libcUnixBsdFreebsdlikeMqReceive(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixBsdFreebsdlikeMqSend(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    libcUnixBsdFreebsdlikeMqSetattr(mqd.rawAddress.toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    libcUnixBsdFreebsdlikeMqTimedreceive(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeMqTimedsend(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr): CInt =
    libcUnixBsdFreebsdlikeMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixBsdFreebsdlikeGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixBsdFreebsdlikeGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    libcUnixBsdFreebsdlikeOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    libcUnixBsdFreebsdlikeForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixBsdFreebsdlikeLoginTty(fd)

public actual fun fparseln(stream: MutPtr, len: MutPtr, lineno: MutPtr, delim: ConstPtr, flags: CInt): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeFparseln(stream.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), lineno.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    libcUnixBsdFreebsdlikeBacktrace(addrlist.rawAddress.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeBacktraceSymbols(addrlist.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    libcUnixBsdFreebsdlikeBacktraceSymbolsFd(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd)

public actual fun kvmOpen(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errstr: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeKvmOpen(execfile.rawAddress.toCPointer<ByteVar>(), corefile.rawAddress.toCPointer<ByteVar>(), swapfile.rawAddress.toCPointer<ByteVar>(), flags, errstr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmClose(kd: MutPtr): CInt =
    libcUnixBsdFreebsdlikeKvmClose(kd.rawAddress.toCPointer<ByteVar>())

public actual fun kvmGetprocs(kd: MutPtr, op: CInt, arg: CInt, cnt: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeKvmGetprocs(kd.rawAddress.toCPointer<ByteVar>(), op, arg, cnt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmGetloadavg(kd: MutPtr, loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixBsdFreebsdlikeKvmGetloadavg(kd.rawAddress.toCPointer<ByteVar>(), loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun kvmOpenfiles(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errbuf: MutPtr): MutPtr =
    MutPtr(libcUnixBsdFreebsdlikeKvmOpenfiles(execfile.rawAddress.toCPointer<ByteVar>(), corefile.rawAddress.toCPointer<ByteVar>(), swapfile.rawAddress.toCPointer<ByteVar>(), flags, errbuf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmRead(kd: MutPtr, addr: CUlong, buf: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeKvmRead(kd.rawAddress.toCPointer<ByteVar>(), addr, buf.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun kvmWrite(kd: MutPtr, addr: CUlong, buf: ConstPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeKvmWrite(kd.rawAddress.toCPointer<ByteVar>(), addr, buf.rawAddress.toCPointer<ByteVar>(), nbytes)
