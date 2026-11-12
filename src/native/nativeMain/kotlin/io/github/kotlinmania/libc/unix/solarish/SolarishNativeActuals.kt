@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAbs
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAccept4
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAcct
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioCancel
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioError
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioFsync
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioRead
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioReturn
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioSuspend
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioWaitn
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishAioWrite
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishArc4random
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishArc4randomBuf
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishArc4randomUniform
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishBacktrace
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishBacktraceSymbols
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishBind
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishClockGetres
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishClockGettime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishClockNanosleep
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishClockSettime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishDaemon
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishDirfd
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishDlIteratePhdr
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishDup3
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishDuplocale
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishEndgrent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishEndpwent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishEndutent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishEndutxent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishErrno
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFaccessat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFdatasync
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFreeifaddrs
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFreelocale
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFutimens
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishFutimesat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetdtablesize
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetentropy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetexecname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrgid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrgidR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrnam
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrnamR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetgrouplist
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGethostid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetifaddrs
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetisax
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetloadavg
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetnameinfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetoptLong
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpagesize
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpagesizes
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpeerucred
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpflags
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpriority
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetprogname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpwent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpwnamR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetpwuidR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetrandom
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetrlimit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGettimeofday
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutline
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutmp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutmpx
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutxent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutxid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGetutxline
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGlob
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishGlobfree
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishIfFreenameindex
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishIfNameindex
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishInitgroups
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishIoctl
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLabs
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpAffinityGet
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpAffinitySet
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpCpus
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpFini
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpHome
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpInit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpMemSize
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpNlgrps
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpResources
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpRoot
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpVersion
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLgrpView
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishLioListio
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMadvise
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMajor
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMakedev
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMakeutx
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMemalign
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMeminfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMinor
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMkfifoat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMknodat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMkstemps
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMmapobj
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishModutx
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMprotect
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqClose
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqGetattr
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqOpen
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqReceive
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqSend
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqSetattr
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqTimedreceive
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqTimedsend
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMqUnlink
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishMsync
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNativeGetgrentR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNativeGetpwentR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNewlocale
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNlLanginfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNlLanginfoL
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNtpAdjtime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishNtpGettime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPOnline
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPipe2
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPopen
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortAssociate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortCreate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortDissociate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortGet
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortGetn
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortSend
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPortSendn
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixFallocate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixMadvise
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawn
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddchdir
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddclosefromNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddfchdir
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetsigignoreNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetsigignoreNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPosixSpawnp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishProcessorBind
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishProcessorInfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetAssign
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetBind
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetCreate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetDestroy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetGetattr
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetInfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetList
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPsetSetattr
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadAtfork
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadCreate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadGetnameNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadKill
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadSetnameNp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPthreadSigmask
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPututline
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishPututxline
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishRand
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishReadv
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishRecvfrom
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishRecvmsg
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedGetPriorityMax
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedGetPriorityMin
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedGetparam
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedGetscheduler
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedSetparam
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSchedSetscheduler
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSecureGetenv
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSeekdir
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemClose
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemDestroy
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemGetvalue
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemInit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemOpen
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemTimedwait
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSemUnlink
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSendfile
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSendfilev
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSendmsg
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetgrent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetgroups
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSethostname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetpflags
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetpriority
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetprogname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetpwent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetrlimit
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSettimeofday
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetutent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSetutxent
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmOpen
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmUnlink
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmctl
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmdt
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishShmget
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSigaltstack
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSigsuspend
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSigwait
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSrand
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishStackGetbounds
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishStrerrorR
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishStrftime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishStrftimeL
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishStrsep
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSync
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishSysinfo
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTelldir
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishThrSelf
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTimerCreate
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTimerDelete
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTimerGetoverrun
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTimerGettime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishTimerSettime
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredFree
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGet
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetegid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGeteuid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetgroups
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetpflags
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetpid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetprojid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetrgid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetruid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetsgid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetsuid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredGetzoneid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUcredSize
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUpdwtmp
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUpdwtmpx
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUselocale
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUtimensat
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUtmpname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishUtmpxname
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishWaitid
import io.github.kotlinmania.libc.unix.solarish.cinterop.libcUnixSolarishWritev
import io.github.kotlinmania.libc.unix.solarish.illumos.Aiocb
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.libc.unix.solarish.illumos.ShmidDs
import io.github.kotlinmania.libc.unix.solarish.illumos.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    libcUnixSolarishGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixSolarishSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixSolarishStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixSolarishSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixSolarishSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun abs(i: CInt): CInt =
    libcUnixSolarishAbs(i)

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    libcUnixSolarishAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixSolarishDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun labs(i: CLong): CLong =
    libcUnixSolarishLabs(i)

public actual fun rand(): CInt =
    libcUnixSolarishRand()

public actual fun srand(seed: CUint) {
    libcUnixSolarishSrand(seed)
}

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixSolarishGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(bbuf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixSolarishGetrandom(bbuf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixSolarishGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    libcUnixSolarishSettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    libcUnixSolarishGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    libcUnixSolarishFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun stackGetbounds(sp: MutPtr<StackT>): CInt =
    libcUnixSolarishStackGetbounds(sp.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixSolarishGetgrouplist(name.rawAddress.toCPointer<ByteVar>(), basegid, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    libcUnixSolarishInitgroups(name.rawAddress.toCPointer<ByteVar>(), basegid)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    libcUnixSolarishSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcUnixSolarishIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixSolarishMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixSolarishErrno()?.toLong() ?: 0L)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixSolarishClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixSolarishClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixSolarishClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixSolarishClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixSolarishGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun setpwent() {
    libcUnixSolarishSetpwent()
}

public actual fun endpwent() {
    libcUnixSolarishEndpwent()
}

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcUnixSolarishGetpwent()?.toLong() ?: 0L)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixSolarishFdatasync(fd)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(libcUnixSolarishNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixSolarishDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixSolarishFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixSolarishNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixSolarishUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(libcUnixSolarishGetprogname()?.toLong() ?: 0L)

public actual fun setprogname(name: ConstPtr<CChar>) {
    libcUnixSolarishSetprogname(name.rawAddress.toCPointer<ByteVar>())
}

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    libcUnixSolarishGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    libcUnixSolarishGetpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    libcUnixSolarishSetpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixSolarishMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixSolarishMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    libcUnixSolarishSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixSolarishIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixSolarishIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixSolarishPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixSolarishPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcUnixSolarishPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixSolarishPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixSolarishSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixSolarishSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixSolarishPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixSolarishPthreadGetnameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr<CChar>): CInt =
    libcUnixSolarishPthreadSetnameNp(tid.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixSolarishWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    libcUnixSolarishGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr<GlobT>) {
    libcUnixSolarishGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixSolarishPosixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixSolarishPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixSolarishPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixSolarishPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixSolarishPosixSpawnFileActionsInit(fileActions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixSolarishPosixSpawnFileActionsDestroy(fileActions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddopen(fileActions.rawAddress.toCPointer<ByteVar>(), fildes, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddclose(fileActions.rawAddress.toCPointer<ByteVar>(), fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt =
    libcUnixSolarishPosixSpawnFileActionsAdddup2(fileActions.rawAddress.toCPointer<ByteVar>(), fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr<PosixSpawnFileActionsT>, lowfiledes: CInt): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddclosefromNp(fileActions.rawAddress.toCPointer<ByteVar>(), lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddchdir(fileActions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddchdirNp(fileActions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixSolarishPosixSpawnFileActionsAddfchdir(fileActions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixSolarishPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixSolarishPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixSolarishPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixSolarishPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt =
    libcUnixSolarishPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), pgroup)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt =
    libcUnixSolarishPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), pgroup.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixSolarishPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixSolarishPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, policy: CInt): CInt =
    libcUnixSolarishPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, policy: MutPtr<CInt>): CInt =
    libcUnixSolarishPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), sigdefault.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), sigdefault.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigignoreNp(attr: MutPtr<PosixSpawnattrT>, sigignore: ConstPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrSetsigignoreNp(attr.rawAddress.toCPointer<ByteVar>(), sigignore.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigignoreNp(attr: ConstPtr<PosixSpawnattrT>, sigignore: MutPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrGetsigignoreNp(attr.rawAddress.toCPointer<ByteVar>(), sigignore.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt =
    libcUnixSolarishPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixSolarishShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcUnixSolarishShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcUnixSolarishShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixSolarishShmget(key, size, shmflg)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixSolarishShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixSolarishShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixSolarishSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixSolarishTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixSolarishMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcUnixSolarishMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixSolarishMemalign(align, size)?.toLong() ?: 0L)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcUnixSolarishRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcUnixSolarishMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixSolarishFutimesat(fd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(dirfd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixSolarishFutimens(dirfd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixSolarishUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcUnixSolarishNlLanginfo(item)?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcUnixSolarishBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixSolarishWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcUnixSolarishReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixSolarishSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixSolarishRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun accept4(fd: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>, flags: CInt): CInt =
    libcUnixSolarishAccept4(fd, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    MutPtr(libcUnixSolarishMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixSolarishMqClose(mqd.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixSolarishMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcUnixSolarishMqReceive(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcUnixSolarishMqTimedreceive(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixSolarishMqSend(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcUnixSolarishMqTimedsend(mqd.rawAddress.toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    libcUnixSolarishMqGetattr(mqd.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    libcUnixSolarishMqSetattr(mqd.rawAddress.toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun portCreate(): CInt =
    libcUnixSolarishPortCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr<CVoid>): CInt =
    libcUnixSolarishPortAssociate(port, source, obj, events, user.rawAddress.toCPointer<ByteVar>())

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    libcUnixSolarishPortDissociate(port, source, obj)

public actual fun portGet(port: CInt, pe: MutPtr<PortEvent>, timeout: MutPtr<Timespec>): CInt =
    libcUnixSolarishPortGet(port, pe.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun portGetn(port: CInt, peList: MutPtr<PortEvent>, max: CUint, nget: MutPtr<CUint>, timeout: MutPtr<Timespec>): CInt =
    libcUnixSolarishPortGetn(port, peList.rawAddress.toCPointer<ByteVar>(), max, nget.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun portSend(port: CInt, events: CInt, user: MutPtr<CVoid>): CInt =
    libcUnixSolarishPortSend(port, events, user.rawAddress.toCPointer<ByteVar>())

public actual fun portSendn(portList: MutPtr<CInt>, errorList: MutPtr<CInt>, nent: CUint, events: CInt, user: MutPtr<CVoid>): CInt =
    libcUnixSolarishPortSendn(portList.rawAddress.toCPointer<ByteVar>(), errorList.rawAddress.toCPointer<ByteVar>(), nent, events, user.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixSolarishGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixSolarishSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixSolarishSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcUnixSolarishSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcUnixSolarishGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixSolarishGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun thrSelf(): ThreadT =
    (libcUnixSolarishThrSelf()?.toLong() ?: 0L).toUInt()

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixSolarishPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcUnixSolarishSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixSolarishGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcUnixSolarishPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcUnixSolarishSchedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcUnixSolarishSchedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixSolarishSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixSolarishSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixSolarishSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixSolarishSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixSolarishSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixSolarishDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixSolarishGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixSolarishGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun nativeGetpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Passwd> =
    MutPtr(libcUnixSolarishNativeGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun nativeGetgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Group> =
    MutPtr(libcUnixSolarishNativeGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixSolarishSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcUnixSolarishPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixSolarishGetgrgid(gid)?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixSolarishSetgrent()
}

public actual fun endgrent() {
    libcUnixSolarishEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcUnixSolarishGetgrent()?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixSolarishPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixSolarishDup3(src, dst, flags)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcUnixSolarishUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcUnixSolarishPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun makeutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishMakeutx(ux.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun modutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishModutx(ux.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun updwtmpx(file: ConstPtr<CChar>, ut: MutPtr<Utmpx>) {
    libcUnixSolarishUpdwtmpx(file.rawAddress.toCPointer<ByteVar>(), ut.rawAddress.toCPointer<ByteVar>())
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    libcUnixSolarishUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixSolarishPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixSolarishSetutxent()
}

public actual fun endutxent() {
    libcUnixSolarishEndutxent()
}

public actual fun endutent() {
    libcUnixSolarishEndutent()
}

public actual fun getutent(): MutPtr<Utmp> =
    MutPtr(libcUnixSolarishGetutent()?.toLong() ?: 0L)

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixSolarishGetutid(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixSolarishGetutline(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(libcUnixSolarishPututline(u.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutent() {
    libcUnixSolarishSetutent()
}

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    libcUnixSolarishUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>) {
    libcUnixSolarishGetutmp(ux.rawAddress.toCPointer<ByteVar>(), u.rawAddress.toCPointer<ByteVar>())
}

public actual fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>) {
    libcUnixSolarishGetutmpx(u.rawAddress.toCPointer<ByteVar>(), ux.rawAddress.toCPointer<ByteVar>())
}

public actual fun updwtmp(file: ConstPtr<CChar>, u: MutPtr<Utmp>) {
    libcUnixSolarishUpdwtmp(file.rawAddress.toCPointer<ByteVar>(), u.rawAddress.toCPointer<ByteVar>())
}

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    libcUnixSolarishNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    libcUnixSolarishNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixSolarishTimerCreate(clockId, evp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixSolarishTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixSolarishTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    libcUnixSolarishTimerGettime(timerid.toLong().toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    libcUnixSolarishTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, value.rawAddress.toCPointer<ByteVar>(), ovalue.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGet(pid: PidT): MutPtr<UcredT> =
    MutPtr(libcUnixSolarishUcredGet(pid)?.toLong() ?: 0L)

public actual fun getpeerucred(fd: CInt, ucred: MutPtr<MutPtr<UcredT>>): CInt =
    libcUnixSolarishGetpeerucred(fd, ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredFree(ucred: MutPtr<UcredT>) {
    libcUnixSolarishUcredFree(ucred.rawAddress.toCPointer<ByteVar>())
}

public actual fun ucredGeteuid(ucred: ConstPtr<UcredT>): UidT =
    libcUnixSolarishUcredGeteuid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetruid(ucred: ConstPtr<UcredT>): UidT =
    libcUnixSolarishUcredGetruid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetsuid(ucred: ConstPtr<UcredT>): UidT =
    libcUnixSolarishUcredGetsuid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetegid(ucred: ConstPtr<UcredT>): GidT =
    libcUnixSolarishUcredGetegid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetrgid(ucred: ConstPtr<UcredT>): GidT =
    libcUnixSolarishUcredGetrgid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetsgid(ucred: ConstPtr<UcredT>): GidT =
    libcUnixSolarishUcredGetsgid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetgroups(ucred: ConstPtr<UcredT>, groups: MutPtr<ConstPtr<GidT>>): CInt =
    libcUnixSolarishUcredGetgroups(ucred.rawAddress.toCPointer<ByteVar>(), groups.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetpid(ucred: ConstPtr<UcredT>): PidT =
    libcUnixSolarishUcredGetpid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetprojid(ucred: ConstPtr<UcredT>): ProjidT =
    libcUnixSolarishUcredGetprojid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetzoneid(ucred: ConstPtr<UcredT>): ZoneidT =
    libcUnixSolarishUcredGetzoneid(ucred.rawAddress.toCPointer<ByteVar>())

public actual fun ucredGetpflags(ucred: ConstPtr<UcredT>, flags: CUint): CUint =
    libcUnixSolarishUcredGetpflags(ucred.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ucredSize(): SizeT =
    libcUnixSolarishUcredSize()

public actual fun psetCreate(newpset: MutPtr<PsetidT>): CInt =
    libcUnixSolarishPsetCreate(newpset.rawAddress.toCPointer<ByteVar>())

public actual fun psetDestroy(pset: PsetidT): CInt =
    libcUnixSolarishPsetDestroy(pset)

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr<PsetidT>): CInt =
    libcUnixSolarishPsetAssign(pset, cpu, opset.rawAddress.toCPointer<ByteVar>())

public actual fun psetInfo(pset: PsetidT, tpe: MutPtr<CInt>, numcpus: MutPtr<CUint>, cpulist: MutPtr<ProcessoridT>): CInt =
    libcUnixSolarishPsetInfo(pset, tpe.rawAddress.toCPointer<ByteVar>(), numcpus.rawAddress.toCPointer<ByteVar>(), cpulist.rawAddress.toCPointer<ByteVar>())

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr<PsetidT>): CInt =
    libcUnixSolarishPsetBind(pset, idtype, id, opset.rawAddress.toCPointer<ByteVar>())

public actual fun psetList(pset: MutPtr<PsetidT>, numpsets: MutPtr<CUint>): CInt =
    libcUnixSolarishPsetList(pset.rawAddress.toCPointer<ByteVar>(), numpsets.rawAddress.toCPointer<ByteVar>())

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    libcUnixSolarishPsetSetattr(pset, attr)

public actual fun psetGetattr(pset: PsetidT, attr: MutPtr<CUint>): CInt =
    libcUnixSolarishPsetGetattr(pset, attr.rawAddress.toCPointer<ByteVar>())

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr<ProcessoridT>): CInt =
    libcUnixSolarishProcessorBind(idtype, id, newBinding, oldBinding.rawAddress.toCPointer<ByteVar>())

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    libcUnixSolarishPOnline(processorid, flag)

public actual fun processorInfo(processorid: ProcessoridT, infop: MutPtr<ProcessorInfoT>): CInt =
    libcUnixSolarishProcessorInfo(processorid, infop.rawAddress.toCPointer<ByteVar>())

public actual fun getexecname(): ConstPtr<CChar> =
    ConstPtr(libcUnixSolarishGetexecname()?.toLong() ?: 0L)

public actual fun gethostid(): CLong =
    libcUnixSolarishGethostid()

public actual fun getpflags(flags: CUint): CUint =
    libcUnixSolarishGetpflags(flags)

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    libcUnixSolarishSetpflags(flags, value)

public actual fun sysinfo(command: CInt, buf: MutPtr<CChar>, count: CLong): CInt =
    libcUnixSolarishSysinfo(command, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun faccessat(fd: CInt, path: ConstPtr<CChar>, amode: CInt, flag: CInt): CInt =
    libcUnixSolarishFaccessat(fd, path.rawAddress.toCPointer<ByteVar>(), amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixSolarishDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    libcUnixSolarishGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    libcUnixSolarishGetpagesizes(pagesize.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr<MmapobjResultT>, elements: MutPtr<CUint>, arg: MutPtr<CVoid>): CInt =
    libcUnixSolarishMmapobj(fd, flags, storage.rawAddress.toCPointer<ByteVar>(), elements.rawAddress.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun meminfo(inaddr: ConstPtr<ULong>, addrCount: CInt, infoReq: ConstPtr<CUint>, infoCount: CInt, outdata: MutPtr<ULong>, validity: MutPtr<CUint>): CInt =
    libcUnixSolarishMeminfo(inaddr.rawAddress.toCPointer<ByteVar>(), addrCount, infoReq.rawAddress.toCPointer<ByteVar>(), infoCount, outdata.rawAddress.toCPointer<ByteVar>(), validity.rawAddress.toCPointer<ByteVar>())

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixSolarishStrsep(string.rawAddress.toCPointer<ByteVar>(), delim.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getisax(array: MutPtr<UInt>, n: CUint): CUint =
    libcUnixSolarishGetisax(array.rawAddress.toCPointer<ByteVar>(), n)

public actual fun backtrace(buffer: MutPtr<MutPtr<CVoid>>, size: CInt): CInt =
    libcUnixSolarishBacktrace(buffer.rawAddress.toCPointer<ByteVar>(), size)

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixSolarishBacktraceSymbols(buffer.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt, fd: CInt) {
    libcUnixSolarishBacktraceSymbolsFd(buffer.rawAddress.toCPointer<ByteVar>(), size, fd)
}

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    libcUnixSolarishGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun sync() {
    libcUnixSolarishSync()
}

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixSolarishAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixSolarishAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixSolarishAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixSolarishAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixSolarishAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixSolarishAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWaitn(aiocbList: MutPtr<MutPtr<Aiocb>>, nent: CUint, nwait: MutPtr<CUint>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixSolarishAioWaitn(aiocbList.rawAddress.toCPointer<ByteVar>(), nent, nwait.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixSolarishAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixSolarishLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun major(version: CInt, devnum: DevT): MajorT =
    libcUnixSolarishMajor(version, devnum)

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    libcUnixSolarishMinor(version, devnum)

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    libcUnixSolarishMakedev(version, majdev, mindev)

public actual fun arc4random(): UInt =
    libcUnixSolarishArc4random()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT) {
    libcUnixSolarishArc4randomBuf(buf.rawAddress.toCPointer<ByteVar>(), nbytes)
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    libcUnixSolarishArc4randomUniform(upperBound)

public actual fun secureGetenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixSolarishSecureGetenv(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT =
    libcUnixSolarishStrftime(s.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>())

public actual fun strftimeL(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, loc: LocaleT): SizeT =
    libcUnixSolarishStrftimeL(s.rawAddress.toCPointer<ByteVar>(), maxsize, format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>(), loc.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr<OffT>, len: SizeT): SsizeT =
    libcUnixSolarishSendfile(outFd, inFd, off.rawAddress.toCPointer<ByteVar>(), len)

public actual fun sendfilev(fildes: CInt, vec: ConstPtr<SendfilevecT>, sfvcnt: CInt, xferred: MutPtr<SizeT>): SsizeT =
    libcUnixSolarishSendfilev(fildes, vec.rawAddress.toCPointer<ByteVar>(), sfvcnt, xferred.rawAddress.toCPointer<ByteVar>())

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    libcUnixSolarishLgrpInit(view)

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    libcUnixSolarishLgrpFini(cookie)

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    libcUnixSolarishLgrpAffinityGet(idtype, id, lgrp)

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    libcUnixSolarishLgrpAffinitySet(idtype, id, lgrp, aff)

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr<ProcessoridT>, count: CUint, content: LgrpContentT): CInt =
    libcUnixSolarishLgrpCpus(cookie, lgrp, cpuids.rawAddress.toCPointer<ByteVar>(), count, content)

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    libcUnixSolarishLgrpMemSize(cookie, lgrp, tpe, content)

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    libcUnixSolarishLgrpNlgrps(cookie)

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    libcUnixSolarishLgrpView(cookie)

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    libcUnixSolarishLgrpHome(idtype, id)

public actual fun lgrpVersion(version: CInt): CInt =
    libcUnixSolarishLgrpVersion(version)

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr<LgrpIdT>, count: CUint, tpe: LgrpRsrcT): CInt =
    libcUnixSolarishLgrpResources(cookie, lgrp, lgrps.rawAddress.toCPointer<ByteVar>(), count, tpe)

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    libcUnixSolarishLgrpRoot(cookie)
