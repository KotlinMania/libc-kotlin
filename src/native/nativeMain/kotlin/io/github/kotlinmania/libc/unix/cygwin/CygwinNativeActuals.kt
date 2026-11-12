@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixCygwinSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixCygwinSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcUnixCygwinPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    libcUnixCygwinSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    libcUnixCygwinSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixCygwinPthreadKill(thread.rawAddress.toCPointer<ByteVar>(), sig)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixCygwinSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    libcUnixCygwinStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixCygwinAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixCygwinCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    MutPtr(libcUnixCygwinStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    libcUnixCygwinClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixCygwinClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixCygwinClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    libcUnixCygwinTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixCygwinTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixCygwinTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    libcUnixCygwinTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixCygwinTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixCygwinClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    libcUnixCygwinClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    libcUnixCygwinFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixCygwinLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixCygwinSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    libcUnixCygwinGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixCygwinSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixCygwinGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt =
    libcUnixCygwinFutimesat(fd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    libcUnixCygwinGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr): CInt =
    libcUnixCygwinSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixCygwinGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixCygwinSetpriority(which, who, prio)

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixCygwinGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixCygwinGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixCygwinGetpwent()?.toLong() ?: 0L)

public actual fun setpwent() {
    libcUnixCygwinSetpwent()
}

public actual fun endpwent() {
    libcUnixCygwinEndpwent()
}

public actual fun ifNameindex(): MutPtr =
    MutPtr(libcUnixCygwinIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr) {
    libcUnixCygwinIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixCygwinReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcUnixCygwinWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixCygwinMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixCygwinMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcUnixCygwinUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixCygwinFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun dlfork(value: CInt) {
    libcUnixCygwinDlfork(value)
}

public actual fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    libcUnixCygwinAccept4(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    libcUnixCygwinBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixCygwinRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    libcUnixCygwinRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    libcUnixCygwinSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, sevlen: SocklenT, flags: CInt): CInt =
    libcUnixCygwinGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), sevlen, flags)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixCygwinPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixCygwinFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixCygwinUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcUnixCygwinSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: MutPtr): CInt =
    libcUnixCygwinSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixCygwinSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semClose(sem: MutPtr): CInt =
    libcUnixCygwinSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr): CInt =
    libcUnixCygwinSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    libcUnixCygwinSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    libcUnixCygwinSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    libcUnixCygwinClearenv()

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixCygwinPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getpt(): CInt =
    libcUnixCygwinGetpt()

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixCygwinMemalign(align, size)?.toLong() ?: 0L)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixCygwinGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun abs(i: CInt): CInt =
    libcUnixCygwinAbs(i)

public actual fun arc4random(): UInt =
    libcUnixCygwinArc4random()

public actual fun arc4randomUniform(l: UInt): UInt =
    libcUnixCygwinArc4randomUniform(l)

public actual fun arc4randomBuf(buf: MutPtr, size: SizeT) {
    libcUnixCygwinArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun labs(i: CLong): CLong =
    libcUnixCygwinLabs(i)

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    libcUnixCygwinMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    libcUnixCygwinMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    libcUnixCygwinMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun rand(): CInt =
    libcUnixCygwinRand()

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixCygwinReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun reallocf(ptr: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixCygwinReallocf(ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun srand(seed: CUint) {
    libcUnixCygwinSrand(seed)
}

public actual fun drand48(): CDouble =
    libcUnixCygwinDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    libcUnixCygwinErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun jrand48(xseed: MutPtr): CLong =
    libcUnixCygwinJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lcong48(p: MutPtr) {
    libcUnixCygwinLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    libcUnixCygwinLrand48()

public actual fun mrand48(): CLong =
    libcUnixCygwinMrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    libcUnixCygwinNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(libcUnixCygwinSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    libcUnixCygwinSrand48(seed)
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    libcUnixCygwinQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixCygwinMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixCygwinMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixCygwinPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixCygwinMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixCygwinShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixCygwinShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
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

public actual fun strcasecmpL(s1: ConstPtr, s2: ConstPtr, loc: LocaleT): CInt =
    libcUnixCygwinStrcasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), loc.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmpL(s1: ConstPtr, s2: ConstPtr, n: SizeT, loc: LocaleT): CInt =
    libcUnixCygwinStrncasecmpL(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n, loc.rawAddress.toCPointer<ByteVar>())

public actual fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    libcUnixCygwinTimingsafeBcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    libcUnixCygwinTimingsafeMemcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixCygwinMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixCygwinMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixCygwinStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun strsep(string: MutPtr, delim: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinStrsep(string.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixCygwinDaemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixCygwinDup3(src, dst, flags)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixCygwinEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixCygwinEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixCygwinExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcUnixCygwinFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixCygwinFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixCygwinFdatasync(fd)

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    libcUnixCygwinGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixCygwinGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun gethostid(): CLong =
    libcUnixCygwinGethostid()

public actual fun getpagesize(): CInt =
    libcUnixCygwinGetpagesize()

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    libcUnixCygwinGetpeereid(socket, euid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixCygwinPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    libcUnixCygwinPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sbrk(increment: IntptrT): MutPtr =
    MutPtr(libcUnixCygwinSbrk(increment)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    libcUnixCygwinSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    libcUnixCygwinSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun vhangup(): CInt =
    libcUnixCygwinVhangup()

public actual fun getdtablesize(): CInt =
    libcUnixCygwinGetdtablesize()

public actual fun sync() {
    libcUnixCygwinSync()
}

public actual fun errno(): MutPtr =
    MutPtr(libcUnixCygwinErrno()?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcUnixCygwinSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcUnixCygwinSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcUnixCygwinSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixCygwinSchedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixCygwinSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixCygwinSchedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    libcUnixCygwinSchedRrGetInterval(pid, t.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixCygwinSchedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr): CInt =
    libcUnixCygwinSchedGetaffinity(pid, cpusetsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcUnixCygwinSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcUnixCygwinPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixCygwinPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixCygwinPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcUnixCygwinPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixCygwinPthreadCancel(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixCygwinPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixCygwinPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixCygwinPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixCygwinPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    libcUnixCygwinPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    libcUnixCygwinPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    libcUnixCygwinPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    libcUnixCygwinPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    libcUnixCygwinPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    libcUnixCygwinPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    libcUnixCygwinPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixCygwinPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    libcUnixCygwinPthreadGetcpuclockid(thread.rawAddress.toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcUnixCygwinPthreadGetschedparam(native.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    libcUnixCygwinPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    libcUnixCygwinPthreadMutexattrGetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixCygwinPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    libcUnixCygwinPthreadMutexattrSetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixCygwinPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    libcUnixCygwinPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    libcUnixCygwinPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    libcUnixCygwinPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    libcUnixCygwinPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    libcUnixCygwinPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    libcUnixCygwinPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    libcUnixCygwinPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcUnixCygwinPthreadSetschedparam(native.rawAddress.toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libcUnixCygwinPthreadSetschedprio(native.rawAddress.toCPointer<ByteVar>(), priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    libcUnixCygwinPthreadGetaffinityNp(thread.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    libcUnixCygwinPthreadGetattrNp(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    libcUnixCygwinPthreadGetnameNp(thread.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcUnixCygwinPthreadSetaffinityNp(thread.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    libcUnixCygwinPthreadSetnameNp(thread.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixCygwinIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixCygwinGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CUint): CInt =
    libcUnixCygwinMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun umount(target: ConstPtr): CInt =
    libcUnixCygwinUmount(target.rawAddress.toCPointer<ByteVar>())

public actual fun cygwinUmount(target: ConstPtr, flags: CUint): CInt =
    libcUnixCygwinCygwinUmount(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixCygwinDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixCygwinSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixCygwinTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun uname(buf: MutPtr): CInt =
    libcUnixCygwinUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixCygwinPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixCygwinPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    libcUnixCygwinPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    libcUnixCygwinPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixCygwinPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    libcUnixCygwinPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    libcUnixCygwinPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: MutPtr, path: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddchdir(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdir(actions: MutPtr, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddfchdir(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    libcUnixCygwinForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    libcUnixCygwinOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixCygwinGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixCygwinGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixCygwinGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixCygwinGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    libcUnixCygwinInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixCygwinStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
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

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixCygwinGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(id: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinGetutxid(id.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(line: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinGetutxline(line.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(utmpx: ConstPtr): MutPtr =
    MutPtr(libcUnixCygwinPututxline(utmpx.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixCygwinSetutxent()
}

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixCygwinUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun updwtmpx(file: ConstPtr, utmpx: ConstPtr) {
    libcUnixCygwinUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), utmpx.rawAddress.toCPointer<ByteVar>())
}
