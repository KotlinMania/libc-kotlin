@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinAbs
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinAccept4
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinArc4random
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinArc4randomBuf
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinArc4randomUniform
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinAsctimeR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinBasename
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinBind
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClearenv
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClockGetcpuclockid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClockGetres
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClockGettime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClockNanosleep
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinClockSettime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinCtimeR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinCygwinUmount
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDaemon
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDirfd
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDlfork
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDup3
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinDuplocale
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinEaccess
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinEndpwent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinEndutxent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinErand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinErrno
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinEuidaccess
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinExecvpe
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinExplicitBzero
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFaccessat
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFallocate
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFdatasync
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFexecve
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFfs
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFfsl
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFfsll
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFls
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFlsl
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFlsll
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinForkpty
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFreelocale
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFstatfs
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFutimens
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFutimes
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinFutimesat
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetdomainname
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetdtablesize
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetentropy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetgrgid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetgrgidR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetgrnam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetgrnamR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetgrouplist
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGethostid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetitimer
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetloadavg
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetnameinfo
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpagesize
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpeereid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpriority
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpt
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpwent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpwnamR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetpwuidR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetrandom
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetrlimit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGettimeofday
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetutxent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetutxid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinGetutxline
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinIfFreenameindex
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinIfNameindex
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinInitgroups
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinIoctl
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinJrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinLabs
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinLcong48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinLrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinLutimes
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMadvise
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMemalign
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMemmem
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMemrchr
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMkfifoat
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMknodat
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMkostemp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMkostemps
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMkstemps
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMount
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMprotect
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinMsync
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinNewlocale
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinNrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinOpenpty
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPipe2
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixFadvise
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixFallocate
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixMadvise
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawn
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddchdir
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddfchdir
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPosixSpawnp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPpoll
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadAtfork
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierWait
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCancel
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadCreate
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadGetaffinityNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadGetattrNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadGetnameNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadGetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadKill
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadMutexattrGetprotocol
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSetaffinityNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSetnameNp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSetschedparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSetschedprio
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSigmask
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSpinInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSpinLock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPtsnameR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinPututxline
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinQsortR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinRand
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinReadv
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinReallocarray
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinReallocf
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinRecvfrom
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinRecvmsg
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSbrk
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetaffinity
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetcpu
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedGetscheduler
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedRrGetInterval
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedSetaffinity
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedSetparam
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSchedSetscheduler
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSeed48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSeekdir
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemClose
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemDestroy
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemGetvalue
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemInit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemOpen
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemTimedwait
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSemUnlink
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSendmsg
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetgroups
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSethostname
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetitimer
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetpriority
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetpwent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetrlimit
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSettimeofday
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSetutxent
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinShmOpen
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinShmUnlink
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSigaltstack
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSigsuspend
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSigtimedwait
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSigwait
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSigwaitinfo
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSrand
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSrand48
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStatfs
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrcasecmpL
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrerrorR
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrftime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrncasecmpL
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrptime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinStrsep
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinSync
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTelldir
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimerCreate
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimerDelete
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimerGetoverrun
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimerGettime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimerSettime
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimingsafeBcmp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinTimingsafeMemcmp
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUmount
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUname
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUpdwtmpx
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUselocale
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUtimensat
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinUtmpxname
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinVhangup
import io.github.kotlinmania.libc.unix.cygwin.cinterop.libcUnixCygwinWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixCygwinSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixCygwinSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixCygwinPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixCygwinSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixCygwinSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixCygwinPthreadKill(thread.rawAddress.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixCygwinSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    libcUnixCygwinStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixCygwinAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixCygwinCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcUnixCygwinStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixCygwinClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixCygwinClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixCygwinClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixCygwinTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixCygwinTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixCygwinTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixCygwinTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixCygwinTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixCygwinClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixCygwinClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    libcUnixCygwinFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixCygwinLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcUnixCygwinSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    libcUnixCygwinGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    libcUnixCygwinSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixCygwinGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixCygwinFutimesat(fd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixCygwinGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixCygwinSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixCygwinGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixCygwinSetpriority(which, who, prio)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixCygwinGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixCygwinGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcUnixCygwinGetpwent()?.toLong() ?: 0L)

public actual fun setpwent() {
    libcUnixCygwinSetpwent()
}

public actual fun endpwent() {
    libcUnixCygwinEndpwent()
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixCygwinIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixCygwinIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixCygwinReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixCygwinWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixCygwinMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixCygwinMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixCygwinUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixCygwinFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun dlfork(value: CInt) {
    libcUnixCygwinDlfork(value)
}

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    libcUnixCygwinAccept4(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcUnixCygwinBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcUnixCygwinRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixCygwinRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixCygwinSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, sevlen: SocklenT, flags: CInt): CInt =
    libcUnixCygwinGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), sevlen, flags)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixCygwinPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixCygwinFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixCygwinSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixCygwinSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixCygwinSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixCygwinSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixCygwinSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixCygwinSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixCygwinSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    libcUnixCygwinClearenv()

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixCygwinPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getpt(): CInt =
    libcUnixCygwinGetpt()

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinMemalign(align, size)?.toLong() ?: 0L)

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    libcUnixCygwinGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun abs(i: CInt): CInt =
    libcUnixCygwinAbs(i)

public actual fun arc4random(): UInt =
    libcUnixCygwinArc4random()

public actual fun arc4randomUniform(l: UInt): UInt =
    libcUnixCygwinArc4randomUniform(l)

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT) {
    libcUnixCygwinArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun labs(i: CLong): CLong =
    libcUnixCygwinLabs(i)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcUnixCygwinMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcUnixCygwinMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcUnixCygwinMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun rand(): CInt =
    libcUnixCygwinRand()

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinReallocf(ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun srand(seed: CUint) {
    libcUnixCygwinSrand(seed)
}

public actual fun drand48(): CDouble =
    libcUnixCygwinDrand48()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    libcUnixCygwinErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixCygwinJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lcong48(p: MutPtr<CUshort>) {
    libcUnixCygwinLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    libcUnixCygwinLrand48()

public actual fun mrand48(): CLong =
    libcUnixCygwinMrand48()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixCygwinNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(libcUnixCygwinSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    libcUnixCygwinSrand48(seed)
}

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    libcUnixCygwinQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixCygwinMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixCygwinMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixCygwinPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixCygwinMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixCygwinShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixCygwinShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    libcUnixCygwinExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun ffs(value: CInt): CInt =
    libcUnixCygwinFfs(value)

public actual fun ffsl(value: CLong): CInt =
    libcUnixCygwinFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    libcUnixCygwinFfsll(value)

public actual fun fls(value: CInt): CInt =
    libcUnixCygwinFls(value)

public actual fun flsl(value: CLong): CInt =
    libcUnixCygwinFlsl(value)

public actual fun flsll(value: CLonglong): CInt =
    libcUnixCygwinFlsll(value)

public actual fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt =
    libcUnixCygwinStrcasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), loc.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt =
    libcUnixCygwinStrncasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n, loc.rawAddress.toCPointer<ByteVar>())

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixCygwinTimingsafeBcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixCygwinTimingsafeMemcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixCygwinStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixCygwinStrsep(string.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixCygwinBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixCygwinDaemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixCygwinDup3(src, dst, flags)

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixCygwinEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixCygwinEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixCygwinExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcUnixCygwinFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fexecve(fd: CInt, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixCygwinFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixCygwinFdatasync(fd)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixCygwinGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixCygwinGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun gethostid(): CLong =
    libcUnixCygwinGethostid()

public actual fun getpagesize(): CInt =
    libcUnixCygwinGetpagesize()

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    libcUnixCygwinGetpeereid(socket, euid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixCygwinPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcUnixCygwinPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(libcUnixCygwinSbrk(increment)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    libcUnixCygwinSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixCygwinSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun vhangup(): CInt =
    libcUnixCygwinVhangup()

public actual fun getdtablesize(): CInt =
    libcUnixCygwinGetdtablesize()

public actual fun sync() {
    libcUnixCygwinSync()
}

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixCygwinErrno()?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixCygwinSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixCygwinSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixCygwinSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixCygwinSchedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixCygwinSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixCygwinSchedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    libcUnixCygwinSchedRrGetInterval(pid, t.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixCygwinSchedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    libcUnixCygwinSchedGetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcUnixCygwinSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixCygwinPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixCygwinPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixCygwinPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixCygwinPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixCygwinPthreadCancel(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcUnixCygwinPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixCygwinPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixCygwinPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    libcUnixCygwinPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixCygwinPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    libcUnixCygwinPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    libcUnixCygwinPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixCygwinPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    libcUnixCygwinPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixCygwinPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixCygwinPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixCygwinPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixCygwinPthreadGetcpuclockid(thread.rawAddress.toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcUnixCygwinPthreadGetschedparam(native.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixCygwinPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    libcUnixCygwinPthreadMutexattrGetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixCygwinPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    libcUnixCygwinPthreadMutexattrSetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    libcUnixCygwinPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixCygwinPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixCygwinPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixCygwinPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixCygwinPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixCygwinPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    libcUnixCygwinPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    libcUnixCygwinPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixCygwinPthreadSetschedparam(native.rawAddress.toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libcUnixCygwinPthreadSetschedprio(native.rawAddress.toCPointer<ByteVar>(), priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcUnixCygwinPthreadGetaffinityNp(thread.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixCygwinPthreadGetattrNp(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixCygwinPthreadGetnameNp(thread.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcUnixCygwinPthreadSetaffinityNp(thread.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    libcUnixCygwinPthreadSetnameNp(thread.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixCygwinIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixCygwinGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixCygwinMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun umount(target: ConstPtr<CChar>): CInt =
    libcUnixCygwinUmount(target.rawAddress.toCPointer<ByteVar>())

public actual fun cygwinUmount(target: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixCygwinCygwinUmount(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixCygwinDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixCygwinSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixCygwinTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixCygwinUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixCygwinPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixCygwinPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixCygwinPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixCygwinPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixCygwinPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixCygwinPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixCygwinPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixCygwinPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixCygwinPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixCygwinPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    libcUnixCygwinPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    libcUnixCygwinPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    libcUnixCygwinPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    libcUnixCygwinPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixCygwinPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixCygwinPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixCygwinPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixCygwinPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddchdir(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdir(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddfchdir(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    libcUnixCygwinForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    libcUnixCygwinOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixCygwinGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixCygwinGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixCygwinGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixCygwinGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixCygwinGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    libcUnixCygwinInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixCygwinStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixCygwinFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixCygwinPosixFadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixCygwinPosixFallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libcUnixCygwinFallocate(fd, mode, offset, len)

public actual fun endutxent() {
    libcUnixCygwinEndutxent()
}

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(libcUnixCygwinGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(id: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixCygwinGetutxid(id.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(line: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixCygwinGetutxline(line.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(utmpx: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixCygwinPututxline(utmpx.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixCygwinSetutxent()
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    libcUnixCygwinUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun updwtmpx(file: ConstPtr<CChar>, utmpx: ConstPtr<Utmpx>) {
    libcUnixCygwinUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), utmpx.rawAddress.toCPointer<ByteVar>())
}
