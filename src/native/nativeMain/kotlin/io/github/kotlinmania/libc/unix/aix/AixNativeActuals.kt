@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAcct
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioCancel
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioError
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioFsync
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioRead
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioReturn
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioSuspend
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixAioWrite
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixBasename
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixBind
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixBrk
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClearenv
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClockGetcpuclockid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClockGetres
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClockGettime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClockNanosleep
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixClockSettime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixCreat64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixCtermid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixDirfd
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixDirname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixDrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixDuplocale
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixEndgrent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixEndmntent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixEndpwent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixEndutent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixEndutxent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixErand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixErrno
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFaccessat
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFattach
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFdatasync
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFexecve
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFfs
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFfsl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFfsll
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFgetgrent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFgetpos64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFgetpwent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFopen64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFreelocale
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFreopen64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFseeko64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFsetpos64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFstat64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFstatfs
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFstatfs64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFstatvfs64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFtello64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFtok
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFtruncate64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixFutimens
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetcontext
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetdomainname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetdtablesize
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrgid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrgidR
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrnam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrnamR
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetgrset
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGethostid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetitimer
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetmntent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetnameinfo
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpagesize
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpeereid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpriority
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpwent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpwnamR
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetpwuidR
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetrlimit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetrlimit64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGettimeofday
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutline
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutxent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutxid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGetutxline
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGlob
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixGlobfree
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixHasmntopt
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixHcreate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixHdestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIconv
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIconvClose
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIconvOpen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIfFreenameindex
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIfNameindex
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixInitgroups
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixIoctl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixJrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLcong48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLfind
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLioListio
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLoadquery
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLparGetInfo
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLparSetResources
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLsearch
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLseek64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixLstat64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMadvise
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMakecontext
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMallopt
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMemmem
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMemsetS
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMincore
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMkfifoat
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMknodat
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMount
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMprotect
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqClose
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqGetattr
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqNotify
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqOpen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqReceive
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqSend
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqSetattr
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqTimedreceive
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqTimedsend
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMqUnlink
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMsgctl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMsgget
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMsgrcv
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMsgsnd
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixMsync
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixNewlocale
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixNlLanginfo
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixNlLanginfoL
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixNrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixOpen64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPollsetCreate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPollsetCtl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPollsetDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPollsetPoll
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPollsetQuery
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPopen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixFadvise
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixFadvise64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixFallocate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixFallocate64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixMadvise
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawn
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPosixSpawnp
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPread64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPreadv
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAtfork
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetdetachstate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetinheritsched
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetschedpolicy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetscope
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrGetstackaddr
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetinheritsched
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetschedpolicy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetscope
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetstack
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadAttrSetstackaddr
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierWait
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCancel
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadCreate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadGetconcurrency
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadGetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadKill
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexConsistent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexGetprioceiling
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexSetprioceiling
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrGetprioceiling
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrGetprotocol
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrGetrobust
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrGettype
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrSetprioceiling
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadMutexattrSetrobust
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadOnce
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadRwlockTimedrdlock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadRwlockTimedwrlock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSetcancelstate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSetcanceltype
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSetconcurrency
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSetschedparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSetschedprio
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSigmask
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSpinInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSpinLock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPtrace64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPututline
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPututxline
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPwrite64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixPwritev
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixQuotactl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRand
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixReadv
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRecvfrom
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRecvmmsg
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRecvmsg
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRegcomp
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRegerror
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRegexec
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixRegfree
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSbrk
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedGetparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedGetscheduler
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedRrGetInterval
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedSetparam
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSchedSetscheduler
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSctpOptInfo
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSctpPeeloff
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSeed48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSeekdir
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemClose
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemDestroy
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemGetvalue
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemInit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemOpen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemTimedwait
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemUnlink
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemctl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemget
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSemop
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSendFile
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSendmmsg
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSendmsg
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetcontext
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetdomainname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetgrent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetgroups
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSethostid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSethostname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetitimer
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetmntent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetpriority
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetpwent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetrlimit
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetrlimit64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSettimeofday
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetutent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSetutxent
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmOpen
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmUnlink
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmat
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmctl
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmdt
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixShmget
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSigaltstack
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSigsuspend
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSigtimedwait
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSigwait
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSigwaitinfo
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSplice
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSrand
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSrand48
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStat64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStat64at
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStatfs
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStatfs64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStatvfs64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStatx
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrcasecmpL
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrerrorR
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrftime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrncasecmpL
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrptime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixStrsep
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSwapcontext
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSwapoff
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSwapon
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixSync
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTelldir
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixThrKill
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixThrSelf
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTimerCreate
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTimerDelete
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTimerGetoverrun
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTimerGettime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTimerSettime
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixTruncate64
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixUname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixUpdwtmp
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixUselocale
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixUtimensat
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixUtmpname
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixWait4
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixWaitid
import io.github.kotlinmania.libc.unix.aix.cinterop.libcUnixAixWritev
import io.github.kotlinmania.libc.unix.aix.powerpc64.Aiocb
import io.github.kotlinmania.libc.unix.aix.powerpc64.MsqidDs
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadBarrierT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadMutexT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadOnceT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SiginfoT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Stat
import io.github.kotlinmania.libc.unix.aix.powerpc64.Statfs
import io.github.kotlinmania.libc.unix.aix.powerpc64.UcontextT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    libcUnixAixThrKill(id.toLong().toCPointer<ByteVar>(), sig)

public actual fun thrSelf(): ThreadT =
    (libcUnixAixThrSelf()?.toLong() ?: 0L).toUInt()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixAixPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    libcUnixAixPthreadAttrGetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), detachstate.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixAixPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    libcUnixAixPthreadAttrGetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixAixPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixAixPthreadAttrGetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    libcUnixAixPthreadAttrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    libcUnixAixPthreadAttrGetscope(attr.rawAddress.toCPointer<ByteVar>(), contentionscope.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixAixPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcUnixAixPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    libcUnixAixPthreadAttrSetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixAixPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    libcUnixAixPthreadAttrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    libcUnixAixPthreadAttrSetscope(attr.rawAddress.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    libcUnixAixPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    libcUnixAixPthreadAttrSetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixAixPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixAixPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixAixPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    libcUnixAixPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixAixPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    libcUnixAixPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixAixPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixAixPthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadCleanupPop(execute: CInt) {}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>) {}

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcUnixAixPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixAixPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixAixPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    libcUnixAixPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    libcUnixAixPthreadCreate(thread.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetconcurrency(): CInt =
    libcUnixAixPthreadGetconcurrency()

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt =
    libcUnixAixPthreadGetcpuclockid(threadId.toLong().toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcUnixAixPthreadGetschedparam(thread.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixAixPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexattrGetprioceiling(attr.rawAddress.toCPointer<ByteVar>(), prioceiling.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexattrGetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexattrGetrobust(attr.rawAddress.toCPointer<ByteVar>(), robust.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexattrGettype(attr.rawAddress.toCPointer<ByteVar>(), type.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt =
    libcUnixAixPthreadMutexattrSetprioceiling(attr.rawAddress.toCPointer<ByteVar>(), prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    libcUnixAixPthreadMutexattrSetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    libcUnixAixPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    libcUnixAixPthreadMutexattrSetrobust(attr.rawAddress.toCPointer<ByteVar>(), robust)

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    libcUnixAixPthreadMutexConsistent(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexGetprioceiling(mutex.rawAddress.toCPointer<ByteVar>(), prioceiling.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt =
    libcUnixAixPthreadMutexSetprioceiling(mutex.rawAddress.toCPointer<ByteVar>(), prioceiling, oldCeiling.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixAixPthreadMutexTimedlock(mutex.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    libcUnixAixPthreadOnce(onceControl.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixAixPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt =
    libcUnixAixPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixAixPthreadRwlockTimedrdlock(rwlock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixAixPthreadRwlockTimedwrlock(rwlock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt =
    libcUnixAixPthreadSetcancelstate(state, oldstate.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt =
    libcUnixAixPthreadSetcanceltype(type, oldtype.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    libcUnixAixPthreadSetconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixAixPthreadSetschedparam(thread.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    libcUnixAixPthreadSetschedprio(thread.toLong().toCPointer<ByteVar>(), prio)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    libcUnixAixPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixAixPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixAixPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixAixPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixAixPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixAixPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTestcancel() {}

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    libcUnixAixIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixAixIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(libcUnixAixIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun acct(filename: MutPtr<CChar>): CInt =
    libcUnixAixAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixAixAioCancel(fildes, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixAixAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixAixAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixAixAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixAixAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixAixAioSuspend(list.rawAddress.toCPointer<ByteVar>(), nent, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixAixAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcUnixAixBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    libcUnixAixBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    libcUnixAixClearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixAixClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixAixClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixAixClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixAixClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixAixClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixAixCreat64(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixAixDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun drand48(): CDouble =
    libcUnixAixDrand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    MutPtr(libcUnixAixDuplocale(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun endgrent() {
    libcUnixAixEndgrent()
}

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    libcUnixAixEndmntent(streamp.rawAddress.toCPointer<ByteVar>())

public actual fun endpwent() {
    libcUnixAixEndpwent()
}

public actual fun endutent() {
    libcUnixAixEndutent()
}

public actual fun endutxent() {
    libcUnixAixEndutxent()
}

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    libcUnixAixErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcUnixAixFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    libcUnixAixFattach(fildes, path.rawAddress.toCPointer<ByteVar>())

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixAixFdatasync(fd)

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixAixFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun ffs(value: CInt): CInt =
    libcUnixAixFfs(value)

public actual fun ffsl(value: CLong): CInt =
    libcUnixAixFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    libcUnixAixFfsll(value)

public actual fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group> =
    MutPtr(libcUnixAixFgetgrent(file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    libcUnixAixFgetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd> =
    MutPtr(libcUnixAixFgetpwent(file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixAixFopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixAixFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcUnixAixFreopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    libcUnixAixFseeko64(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    libcUnixAixFsetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    libcUnixAixFstat64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixAixFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    libcUnixAixFstatfs64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    libcUnixAixFstatvfs64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    libcUnixAixFtello64(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    libcUnixAixFtok(path.rawAddress.toCPointer<ByteVar>(), id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    libcUnixAixFtruncate64(fd, length)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixAixFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    libcUnixAixGetcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    libcUnixAixGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getdtablesize(): CInt =
    libcUnixAixGetdtablesize()

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcUnixAixGetgrent()?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixAixGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixAixGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixAixGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixAixGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixGetgrset(user.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gethostid(): CLong =
    libcUnixAixGethostid()

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    MutPtr(libcUnixAixGetmntent(stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    libcUnixAixGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpagesize(): CInt =
    libcUnixAixGetpagesize()

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    libcUnixAixGetpeereid(socket, euid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixAixGetpriority(which, who)

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcUnixAixGetpwent()?.toLong() ?: 0L)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixAixGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixAixGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixAixGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    libcUnixAixGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixAixGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    libcUnixAixGetitimer(which, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun getutent(): MutPtr<Utmp> =
    MutPtr(libcUnixAixGetutent()?.toLong() ?: 0L)

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixAixGetutid(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixAixGetutline(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(libcUnixAixGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixAixGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixAixGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    libcUnixAixGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr<GlobT>) {
    libcUnixAixGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixHasmntopt(mnt.rawAddress.toCPointer<ByteVar>(), opt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcreate(nelt: SizeT): CInt =
    libcUnixAixHcreate(nelt)

public actual fun hdestroy() {
    libcUnixAixHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    MutPtr(0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixAixIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixAixIfNameindex()?.toLong() ?: 0L)

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    libcUnixAixInitgroups(name.rawAddress.toCPointer<ByteVar>(), basegid)

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixAixIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixAixJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lcong48(p: MutPtr<CUshort>) {
    libcUnixAixLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    MutPtr(libcUnixAixLfind(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixAixLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nent, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt =
    libcUnixAixLoadquery(flags, buf.rawAddress.toCPointer<ByteVar>(), buflen, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt =
    libcUnixAixLparGetInfo(command, buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt =
    libcUnixAixLparSetResources(id, resource.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixAixLrand48()

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    MutPtr(libcUnixAixLsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), nelp.rawAddress.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    libcUnixAixLseek64(fd, offset, whence)

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixAixLstat64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    libcUnixAixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
    libcUnixAixMakecontext(ucp.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    libcUnixAixMallopt(param, value)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixAixMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    libcUnixAixMemsetS(s.rawAddress.toCPointer<ByteVar>(), smax, c, n)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    libcUnixAixMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixAixMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixAixMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixAixMount(device.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixAixMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixAixMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    libcUnixAixMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    libcUnixAixMqNotify(mqd.toLong().toCPointer<ByteVar>(), notification.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixAixMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcUnixAixMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixAixMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    libcUnixAixMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcUnixAixMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcUnixAixMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixAixMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixAixMrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    libcUnixAixMsgctl(msqid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libcUnixAixMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcUnixAixMsgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    libcUnixAixMsgsnd(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixAixMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixAixNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcUnixAixNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    MutPtr(libcUnixAixNlLanginfoL(item, loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixAixNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixAixOpen64(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    libcUnixAixPollsetCreate(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt =
    libcUnixAixPollsetCtl(ps, pollctlArray.rawAddress.toCPointer<ByteVar>(), arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    libcUnixAixPollsetDestroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt =
    libcUnixAixPollsetPoll(ps, polldataArray.rawAddress.toCPointer<ByteVar>(), arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt =
    libcUnixAixPollsetQuery(ps, pollfdQuery.rawAddress.toCPointer<ByteVar>())

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixAixPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixAixPosixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    libcUnixAixPosixFadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixAixPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixAixPosixFallocate64(fd, offset, len)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixAixPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixAixPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixAixPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    libcUnixAixPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixAixPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixAixPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixAixPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixAixPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixAixPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    libcUnixAixPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixAixPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    libcUnixAixPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixAixPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixAixPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixAixPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixAixPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    libcUnixAixPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixAixPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    libcUnixAixPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixAixPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixAixPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixAixPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixAixPread64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    libcUnixAixPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt =
    libcUnixAixPtrace64(request, id, addr, data, buff.rawAddress.toCPointer<ByteVar>())

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixAixPututline(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixAixPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixAixPwrite64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    libcUnixAixPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt =
    libcUnixAixQuotactl(cmd.rawAddress.toCPointer<ByteVar>(), special, id, data.rawAddress.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    libcUnixAixRand()

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixAixReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcUnixAixRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    libcUnixAixRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixAixRecvmsg(sockfd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    libcUnixAixRegcomp(preg.rawAddress.toCPointer<ByteVar>(), pattern.rawAddress.toCPointer<ByteVar>(), cflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    libcUnixAixRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    libcUnixAixRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regfree(preg: MutPtr<RegexT>) {
    libcUnixAixRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(libcUnixAixSbrk(increment)?.toLong() ?: 0L)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixAixSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixAixSchedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixAixSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixAixSchedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    libcUnixAixSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixAixSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixAixSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt =
    libcUnixAixSctpOptInfo(sd, id, opt, argSize.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt =
    libcUnixAixSctpPeeloff(s, id.rawAddress.toCPointer<ByteVar>())

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(libcUnixAixSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixAixSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixAixSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixAixSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixAixSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixAixSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixAixSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixAixSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixAixSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixAixSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    libcUnixAixSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    libcUnixAixSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT =
    libcUnixAixSendFile(socket.rawAddress.toCPointer<ByteVar>(), iobuf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    libcUnixAixSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixAixSendmsg(sockfd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    libcUnixAixSetcontext(ucp.rawAddress.toCPointer<ByteVar>())

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    libcUnixAixSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    libcUnixAixSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun setgrent() {
    libcUnixAixSetgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    libcUnixAixSethostid(hostid)

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    libcUnixAixSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixAixSetmntent(filename.rawAddress.toCPointer<ByteVar>(), ty.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    libcUnixAixSetpriority(which, who, priority)

public actual fun setpwent() {
    libcUnixAixSetpwent()
}

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixAixSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    libcUnixAixSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcUnixAixSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    libcUnixAixSetitimer(which, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun setutent() {
    libcUnixAixSetutent()
}

public actual fun setutxent() {
    libcUnixAixSetutxent()
}

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixAixSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixAixSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixAixSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixAixSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixAixSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixAixShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcUnixAixShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcUnixAixShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixAixShmget(key, size, shmflg)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixAixShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixAixShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    libcUnixAixSplice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    libcUnixAixSrand(seed)
}

public actual fun srand48(seed: CLong) {
    libcUnixAixSrand48(seed)
}

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixAixStat64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    libcUnixAixStat64at(dirfd, path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixAixStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    libcUnixAixStatfs64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    libcUnixAixStatvfs64(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt =
    libcUnixAixStatx(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), length, command)

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    libcUnixAixStrcasecmpL(string1.rawAddress.toCPointer<ByteVar>(), string2.rawAddress.toCPointer<ByteVar>(), locale.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixAixStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    libcUnixAixStrftime(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    libcUnixAixStrncasecmpL(string1.rawAddress.toCPointer<ByteVar>(), string2.rawAddress.toCPointer<ByteVar>(), length, locale.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcUnixAixStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixAixStrsep(string.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    libcUnixAixSwapcontext(uocp.rawAddress.toCPointer<ByteVar>(), ucp.rawAddress.toCPointer<ByteVar>())

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    libcUnixAixSwapoff(path.rawAddress.toCPointer<ByteVar>())

public actual fun swapon(path: ConstPtr<CChar>): CInt =
    libcUnixAixSwapon(path.rawAddress.toCPointer<ByteVar>())

public actual fun sync() {
    libcUnixAixSync()
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixAixTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixAixTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixAixTimerDelete(timerid.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixAixTimerGetoverrun(timerid.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    libcUnixAixTimerGettime(timerid.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixAixTimerSettime(timerid.toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    libcUnixAixTruncate64(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixAixUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>) {
    libcUnixAixUpdwtmp(file.rawAddress.toCPointer<ByteVar>(), u.rawAddress.toCPointer<ByteVar>())
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixAixUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    libcUnixAixUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixAixUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    libcUnixAixWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixAixWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixAixWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixAixErrno()?.toLong() ?: 0L)
