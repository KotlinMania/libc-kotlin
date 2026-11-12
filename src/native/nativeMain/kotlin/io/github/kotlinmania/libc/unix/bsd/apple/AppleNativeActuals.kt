@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioCancel
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioError
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioFsync
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioRead
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioReturn
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioSuspend
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAioWrite
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAsctime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleAsctimeR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktrace
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktraceAsync
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktraceFromFp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktraceImageOffsets
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktraceSymbols
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBasename
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleBrk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCCRandomGenerateBytes
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleChflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleClockGetres
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleClockGettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleClockSettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleClonefile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleClonefileat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleConnectx
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCopyfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCopyfileStateAlloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCopyfileStateFree
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCopyfileStateGet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCopyfileStateSet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCtime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleCtimeR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDaemon
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDirfd
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDirname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDisconnectx
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDuplocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDyldGetImageHeader
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDyldGetImageName
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDyldGetImageVmaddrSlide
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleDyldImageCount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleEndutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleError
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleExecvP
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFchflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFclonefileat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFcopyfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFgetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFgetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFlistxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFmount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleForkpty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFreadlink
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFreelocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFremovexattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFsetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFsetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFstatfs
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFtok
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleFutimens
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetMACHTASKSELF
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetVMPAGESIZE
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetattrlistat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetattrlistbulk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetdate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetdomainname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetentropy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetfsstat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetgrouplist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGethostid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGethostuuid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetmntinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetnameinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetpriority
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGettimeofday
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetutxid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetutxline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleGetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleHostProcessorInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleHostStatistics
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleHostStatistics64
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleIconv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleIconvClose
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleIconvOpen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleInitgroups
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleKevent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleKevent64
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleLioListio
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleListxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleLocaleconvL
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleLoginTty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleLutimes
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachAbsoluteTime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachErrorString
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachHostSelf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachThreadSelf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachTimebaseInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMachVmMap
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocDefaultZone
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocGoodSize
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocPrintf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocSize
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneCalloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneCheck
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneFree
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneFromPtr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneLog
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneMalloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZonePrint
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZonePrintPtrInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneRealloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneStatistics
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMallocZoneValloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMemmem
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMemsetPattern16
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMemsetPattern4
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMemsetPattern8
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMemsetS
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMincore
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMkfifoat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMknodat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleMprotect
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNewlocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNsgetArgc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNsgetArgv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNsgetEnviron
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNsgetExecutablePath
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNsgetProgname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNtpAdjtime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleNtpGettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOpenpty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsLogCreate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsLogTypeEnabled
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSignpostEnabled
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSignpostIdGenerate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSignpostIdMakeWithPointer
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSyncWaitOnAddress
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSyncWakeByAddressAll
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsSyncWakeByAddressAny
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsUnfairLockAssertNotOwner
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsUnfairLockAssertOwner
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsUnfairLockLock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsUnfairLockTrylock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleOsUnfairLockUnlock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawn
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetarchprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetbinprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetarchprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetbinprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePosixSpawnp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePreadv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcKmsgbuf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcLibversion
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcListallpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcListchildpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcListpgrppids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcListpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcName
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcPidRusage
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcPidfdinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcPidfileportinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcPidinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcPidpath
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcRegionfilename
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcSetCsm
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcSetNoSmt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcSetthreadCsm
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleProcSetthreadNoSmt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadAttrGetdetachstate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadAttrGetscope
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadAttrGetstackaddr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadAttrSetscope
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadAttrSetstackaddr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadCondTimedwaitRelativeNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadCpuNumberNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadFromMachThreadNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadGetStackaddrNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadGetStacksizeNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadGetnameNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadJitWriteProtectNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadJitWriteProtectSupportedNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadJitWriteWithCallbackNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadMachThreadNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadMainNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadSetnameNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePthreadThreadidNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePtrace
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePututxline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdApplePwritev
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleQsortR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleQuerylocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleQuotactl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleRemovexattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleRenameatxNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleRenamexNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSbrk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSemDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSemInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSemctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSemget
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSemop
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSendfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetMACHTASKSELF
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetattrlistat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetdomainname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetgrent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSethostid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSethostname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetpriority
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSettimeofday
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleShmOpen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleShmat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleShmctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleShmdt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleShmget
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleStatfs
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleStrptime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleStrtonum
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSysctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSysctlbyname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSysctlnametomib
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleSysdirGetNextSearchPathEnumeration
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskCreate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskForPid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskSetInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskTerminate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleTaskThreads
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleThreadInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleThreadPolicyGet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleThreadPolicySet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleUname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleUselocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleUtimensat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleUtmpxname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleVmAllocate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleVmDeallocate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libcUnixBsdAppleWaitid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var MACH_TASK_SELF: MachPortT
    get() = libcUnixBsdAppleGetMACHTASKSELF()
    set(value) {
        libcUnixBsdAppleSetMACHTASKSELF(value)
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = libcUnixBsdAppleGetVMPAGESIZE()

public actual fun setgrent() {
    libcUnixBsdAppleSetgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixBsdAppleDaemon(nochdir, noclose)

public actual fun semDestroy(sem: MutPtr): CInt =
    libcUnixBsdAppleSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcUnixBsdAppleSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    libcUnixBsdAppleAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    libcUnixBsdAppleAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdAppleAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr): CInt =
    libcUnixBsdAppleAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    libcUnixBsdAppleAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    libcUnixBsdAppleAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdAppleAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    libcUnixBsdAppleChflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    libcUnixBsdAppleFchflags(fd, flags)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixBsdAppleClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    libcUnixBsdAppleClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    libcUnixBsdAppleLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixBsdAppleDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixBsdAppleLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixBsdAppleGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixBsdAppleGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdApplePututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixBsdAppleSetutxent()
}

public actual fun endutxent() {
    libcUnixBsdAppleEndutxent()
}

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixBsdAppleUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun asctime(tm: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleAsctime(tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctime(clock: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleCtime(clock.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getdate(datestr: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleGetdate(datestr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strptime(buf: ConstPtr, format: ConstPtr, timeptr: MutPtr): MutPtr =
    MutPtr(libcUnixBsdAppleStrptime(buf.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), timeptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctimeR(tm: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcUnixBsdAppleAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(clock: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcUnixBsdAppleCtimeR(clock.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixBsdAppleGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    libcUnixBsdAppleMincore(addr.rawAddress.toCPointer<ByteVar>(), len, vec.rawAddress.toCPointer<ByteVar>())

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    libcUnixBsdAppleSysctlnametomib(name.rawAddress.toCPointer<ByteVar>(), mibp.rawAddress.toCPointer<ByteVar>(), sizep.rawAddress.toCPointer<ByteVar>())

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixBsdAppleMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    libcUnixBsdAppleSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdAppleSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    libcUnixBsdAppleSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdAppleShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    libcUnixBsdAppleFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(libcUnixBsdAppleShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    libcUnixBsdAppleShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    libcUnixBsdAppleShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixBsdAppleShmget(key, size, shmflg)

public actual fun sysctl(name: MutPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    libcUnixBsdAppleSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    libcUnixBsdAppleSysctlbyname(name.rawAddress.toCPointer<ByteVar>(), oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun machAbsoluteTime(): ULong =
    libcUnixBsdAppleMachAbsoluteTime()

public actual fun machTimebaseInfo(info: MutPtr): CInt =
    libcUnixBsdAppleMachTimebaseInfo(info.rawAddress.toCPointer<ByteVar>())

public actual fun machHostSelf(): MachPortT =
    libcUnixBsdAppleMachHostSelf()

public actual fun machThreadSelf(): MachPortT =
    libcUnixBsdAppleMachThreadSelf()

public actual fun pthreadCondTimedwaitRelativeNp(cond: MutPtr, lock: MutPtr, timeout: ConstPtr): CInt =
    libcUnixBsdApplePthreadCondTimedwaitRelativeNp(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt =
    libcUnixBsdApplePthreadAttrGetscope(attr.rawAddress.toCPointer<ByteVar>(), contentionscope.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    libcUnixBsdApplePthreadAttrGetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt =
    libcUnixBsdApplePthreadAttrGetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), detachstate.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt =
    libcUnixBsdApplePthreadAttrSetscope(attr.rawAddress.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    libcUnixBsdApplePthreadAttrSetstackaddr(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(name: ConstPtr): CInt =
    libcUnixBsdApplePthreadSetnameNp(name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    libcUnixBsdApplePthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    libcUnixBsdApplePthreadMachThreadNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    (libcUnixBsdApplePthreadFromMachThreadNp(port)?.toLong() ?: 0L).toULong()

public actual fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr =
    MutPtr(libcUnixBsdApplePthreadGetStackaddrNp(thread.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    libcUnixBsdApplePthreadGetStacksizeNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    libcUnixBsdApplePthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr): CInt =
    libcUnixBsdApplePthreadThreadidNp(thread.toLong().toCPointer<ByteVar>(), threadId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    libcUnixBsdApplePthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    libcUnixBsdApplePthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr): CInt =
    libcUnixBsdApplePthreadJitWriteWithCallbackNp(0L.toCPointer<ByteVar>(), ctx.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: MutPtr): CInt =
    libcUnixBsdApplePthreadCpuNumberNp(cpuNumberOut.rawAddress.toCPointer<ByteVar>())

public actual fun osSyncWaitOnAddress(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    libcUnixBsdAppleOsSyncWaitOnAddress(addr.rawAddress.toCPointer<ByteVar>(), value, size, flags)

public actual fun osSyncWaitOnAddressWithDeadline(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(addr.rawAddress.toCPointer<ByteVar>(), value, size, flags, clockid, deadline)

public actual fun osSyncWaitOnAddressWithTimeout(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(addr.rawAddress.toCPointer<ByteVar>(), value, size, flags, clockid, timeoutNs)

public actual fun osSyncWakeByAddressAny(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    libcUnixBsdAppleOsSyncWakeByAddressAny(addr.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun osSyncWakeByAddressAll(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    libcUnixBsdAppleOsSyncWakeByAddressAll(addr.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    libcUnixBsdAppleOsUnfairLockLock(lock.rawAddress.toCPointer<ByteVar>())
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    libcUnixBsdAppleOsUnfairLockTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    libcUnixBsdAppleOsUnfairLockUnlock(lock.rawAddress.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    libcUnixBsdAppleOsUnfairLockAssertOwner(lock.rawAddress.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    libcUnixBsdAppleOsUnfairLockAssertNotOwner(lock.rawAddress.toCPointer<ByteVar>())
}

public actual fun osLogCreate(subsystem: ConstPtr, category: ConstPtr): OsLogT =
    MutPtr(libcUnixBsdAppleOsLogCreate(subsystem.rawAddress.toCPointer<ByteVar>(), category.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    libcUnixBsdAppleOsLogTypeEnabled(oslog.rawAddress.toCPointer<ByteVar>(), tpe)

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr): OsSignpostIdT =
    libcUnixBsdAppleOsSignpostIdMakeWithPointer(log.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    libcUnixBsdAppleOsSignpostIdGenerate(log.rawAddress.toCPointer<ByteVar>())

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    libcUnixBsdAppleOsSignpostEnabled(log.rawAddress.toCPointer<ByteVar>())

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    libcUnixBsdAppleThreadPolicySet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo.rawAddress.toCPointer<ByteVar>(), count)

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr, getDefault: MutPtr): KernReturnT =
    libcUnixBsdAppleThreadPolicyGet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>(), getDefault.rawAddress.toCPointer<ByteVar>())

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr): KernReturnT =
    libcUnixBsdAppleThreadInfo(targetAct, flavor, threadInfoOut.rawAddress.toCPointer<ByteVar>(), threadInfoOutCnt.rawAddress.toCPointer<ByteVar>())

public actual fun error(): MutPtr =
    MutPtr(libcUnixBsdAppleError()?.toLong() ?: 0L)

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    libcUnixBsdAppleBacktrace(buf.rawAddress.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(addrs: ConstPtr, sz: CInt): MutPtr =
    MutPtr(libcUnixBsdAppleBacktraceSymbols(addrs.rawAddress.toCPointer<ByteVar>(), sz)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(addrs: ConstPtr, sz: CInt, fd: CInt) {
    libcUnixBsdAppleBacktraceSymbolsFd(addrs.rawAddress.toCPointer<ByteVar>(), sz, fd)
}

public actual fun backtraceFromFp(startfp: MutPtr, array: MutPtr, size: CInt): CInt =
    libcUnixBsdAppleBacktraceFromFp(startfp.rawAddress.toCPointer<ByteVar>(), array.rawAddress.toCPointer<ByteVar>(), size)

public actual fun backtraceImageOffsets(array: ConstPtr, imageOffsets: MutPtr, size: CInt) {
    libcUnixBsdAppleBacktraceImageOffsets(array.rawAddress.toCPointer<ByteVar>(), imageOffsets.rawAddress.toCPointer<ByteVar>(), size)
}

public actual fun backtraceAsync(array: MutPtr, length: SizeT, taskId: MutPtr): SizeT =
    libcUnixBsdAppleBacktraceAsync(array.rawAddress.toCPointer<ByteVar>(), length, taskId.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixBsdAppleStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    libcUnixBsdAppleFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    libcUnixBsdAppleKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun kevent64(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, flags: CUint, timeout: ConstPtr): CInt =
    libcUnixBsdAppleKevent64(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr): CInt =
    libcUnixBsdAppleMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun fmount(src: ConstPtr, fd: CInt, flags: CInt, data: MutPtr): CInt =
    libcUnixBsdAppleFmount(src.rawAddress.toCPointer<ByteVar>(), fd, flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    libcUnixBsdApplePtrace(request, pid, addr.rawAddress.toCPointer<ByteVar>(), data)

public actual fun quotactl(special: ConstPtr, cmd: CInt, id: CInt, data: MutPtr): CInt =
    libcUnixBsdAppleQuotactl(special.rawAddress.toCPointer<ByteVar>(), cmd, id, data.rawAddress.toCPointer<ByteVar>())

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    libcUnixBsdAppleSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr, hdtr: MutPtr, flags: CInt): CInt =
    libcUnixBsdAppleSendfile(fd, s, offset, len.rawAddress.toCPointer<ByteVar>(), hdtr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixBsdAppleFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcUnixBsdAppleUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    libcUnixBsdAppleOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    libcUnixBsdAppleForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libcUnixBsdAppleLoginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdAppleDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT): CInt =
    libcUnixBsdAppleFreelocale(loc.rawAddress.toCPointer<ByteVar>())

public actual fun localeconvL(loc: LocaleT): MutPtr =
    MutPtr(libcUnixBsdAppleLocaleconvL(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdAppleNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixBsdAppleUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    ConstPtr(libcUnixBsdAppleQuerylocale(mask, loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libcUnixBsdAppleGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libcUnixBsdAppleSetpriority(which, who, prio)

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    libcUnixBsdAppleGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    libcUnixBsdAppleSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdApplePreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcUnixBsdApplePwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    libcUnixBsdAppleGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, position, flags)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    libcUnixBsdAppleFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, position, flags)

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    libcUnixBsdAppleSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, position, flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    libcUnixBsdAppleFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, position, flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    libcUnixBsdAppleListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    libcUnixBsdAppleFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun removexattr(path: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    libcUnixBsdAppleRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun renamexNp(from: ConstPtr, to: ConstPtr, flags: CUint): CInt =
    libcUnixBsdAppleRenamexNp(from.rawAddress.toCPointer<ByteVar>(), to.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun renameatxNp(fromfd: CInt, from: ConstPtr, tofd: CInt, to: ConstPtr, flags: CUint): CInt =
    libcUnixBsdAppleRenameatxNp(fromfd, from.rawAddress.toCPointer<ByteVar>(), tofd, to.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fremovexattr(filedes: CInt, name: ConstPtr, flags: CInt): CInt =
    libcUnixBsdAppleFremovexattr(filedes, name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getgrouplist(name: ConstPtr, basegid: CInt, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixBsdAppleGetgrouplist(name.rawAddress.toCPointer<ByteVar>(), basegid, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr, basegroup: CInt): CInt =
    libcUnixBsdAppleInitgroups(user.rawAddress.toCPointer<ByteVar>(), basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    libcUnixBsdAppleWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun brk(addr: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleBrk(addr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sbrk(increment: CInt): MutPtr =
    MutPtr(libcUnixBsdAppleSbrk(increment)?.toLong() ?: 0L)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixBsdAppleSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun dyldImageCount(): UInt =
    libcUnixBsdAppleDyldImageCount()

public actual fun dyldGetImageHeader(imageIndex: UInt): ConstPtr =
    ConstPtr(libcUnixBsdAppleDyldGetImageHeader(imageIndex)?.toLong() ?: 0L)

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    libcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex)

public actual fun dyldGetImageName(imageIndex: UInt): ConstPtr =
    ConstPtr(libcUnixBsdAppleDyldGetImageName(imageIndex)?.toLong() ?: 0L)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdApplePosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixBsdApplePosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixBsdApplePosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixBsdApplePosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixBsdApplePosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    libcUnixBsdApplePosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetarchprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrSetarchprefNp(attr.rawAddress.toCPointer<ByteVar>(), count, pref.rawAddress.toCPointer<ByteVar>(), subpref.rawAddress.toCPointer<ByteVar>(), ocount.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetarchprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetarchprefNp(attr.rawAddress.toCPointer<ByteVar>(), count, pref.rawAddress.toCPointer<ByteVar>(), subpref.rawAddress.toCPointer<ByteVar>(), ocount.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetbinprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrGetbinprefNp(attr.rawAddress.toCPointer<ByteVar>(), count, pref.rawAddress.toCPointer<ByteVar>(), ocount.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetbinprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnattrSetbinprefNp(attr.rawAddress.toCPointer<ByteVar>(), count, pref.rawAddress.toCPointer<ByteVar>(), ocount.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    libcUnixBsdApplePosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixBsdApplePosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    libcUnixBsdApplePosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    libcUnixBsdApplePosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun uname(buf: MutPtr): CInt =
    libcUnixBsdAppleUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun connectx(socket: CInt, endpoints: ConstPtr, associd: SaeAssocidT, flags: CUint, iov: ConstPtr, iovcnt: CUint, len: MutPtr, connid: MutPtr): CInt =
    libcUnixBsdAppleConnectx(socket, endpoints.rawAddress.toCPointer<ByteVar>(), associd, flags, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, len.rawAddress.toCPointer<ByteVar>(), connid.rawAddress.toCPointer<ByteVar>())

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    libcUnixBsdAppleDisconnectx(socket, associd, connid)

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    libcUnixBsdAppleNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: MutPtr): CInt =
    libcUnixBsdAppleNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    libcUnixBsdAppleGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(mntbufp: MutPtr, bufsize: CInt, flags: CInt): CInt =
    libcUnixBsdAppleGetfsstat(mntbufp.rawAddress.toCPointer<ByteVar>(), bufsize, flags)

public actual fun clonefile(src: ConstPtr, dst: ConstPtr, flags: UInt): CInt =
    libcUnixBsdAppleClonefile(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun clonefileat(srcDirfd: CInt, src: ConstPtr, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    libcUnixBsdAppleClonefileat(srcDirfd, src.rawAddress.toCPointer<ByteVar>(), dstDirfd, dst.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    libcUnixBsdAppleFclonefileat(srcfd, dstDirfd, dst.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun copyfile(from: ConstPtr, to: ConstPtr, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    libcUnixBsdAppleCopyfile(from.rawAddress.toCPointer<ByteVar>(), to.rawAddress.toCPointer<ByteVar>(), state.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    libcUnixBsdAppleFcopyfile(from, to, state.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    libcUnixBsdAppleCopyfileStateFree(s.rawAddress.toCPointer<ByteVar>())

public actual fun copyfileStateAlloc(): CopyfileStateT =
    MutPtr(libcUnixBsdAppleCopyfileStateAlloc()?.toLong() ?: 0L)

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr): CInt =
    libcUnixBsdAppleCopyfileStateGet(s.rawAddress.toCPointer<ByteVar>(), flags, dst.rawAddress.toCPointer<ByteVar>())

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr): CInt =
    libcUnixBsdAppleCopyfileStateSet(s.rawAddress.toCPointer<ByteVar>(), flags, src.rawAddress.toCPointer<ByteVar>())

public actual fun machErrorString(errorValue: MachErrorT): MutPtr =
    MutPtr(libcUnixBsdAppleMachErrorString(errorValue)?.toLong() ?: 0L)

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    libcUnixBsdAppleMemsetS(s.rawAddress.toCPointer<ByteVar>(), smax, c, n)

public actual fun memsetPattern4(b: MutPtr, pattern4: ConstPtr, len: SizeT) {
    libcUnixBsdAppleMemsetPattern4(b.rawAddress.toCPointer<ByteVar>(), pattern4.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern8(b: MutPtr, pattern8: ConstPtr, len: SizeT) {
    libcUnixBsdAppleMemsetPattern8(b.rawAddress.toCPointer<ByteVar>(), pattern8.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern16(b: MutPtr, pattern16: ConstPtr, len: SizeT) {
    libcUnixBsdAppleMemsetPattern16(b.rawAddress.toCPointer<ByteVar>(), pattern16.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun strtonum(numstr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr): CLonglong =
    libcUnixBsdAppleStrtonum(numstr.rawAddress.toCPointer<ByteVar>(), minval, maxval, errstrp.rawAddress.toCPointer<ByteVar>())

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: ConstPtr, vararg variadicArgs: Long) {
    libcUnixBsdAppleMallocPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallocZoneCheck(zone: MutPtr): BooleanT =
    libcUnixBsdAppleMallocZoneCheck(zone.rawAddress.toCPointer<ByteVar>())

public actual fun mallocZonePrint(zone: MutPtr, verbose: BooleanT) {
    libcUnixBsdAppleMallocZonePrint(zone.rawAddress.toCPointer<ByteVar>(), verbose)
}

public actual fun mallocZoneStatistics(zone: MutPtr, stats: MutPtr) {
    libcUnixBsdAppleMallocZoneStatistics(zone.rawAddress.toCPointer<ByteVar>(), stats.rawAddress.toCPointer<ByteVar>())
}

public actual fun mallocZoneLog(zone: MutPtr, address: MutPtr) {
    libcUnixBsdAppleMallocZoneLog(zone.rawAddress.toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>())
}

public actual fun mallocZonePrintPtrInfo(ptr: MutPtr) {
    libcUnixBsdAppleMallocZonePrintPtrInfo(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun mallocDefaultZone(): MutPtr =
    MutPtr(libcUnixBsdAppleMallocDefaultZone()?.toLong() ?: 0L)

public actual fun mallocZoneFromPtr(ptr: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdAppleMallocZoneFromPtr(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mallocZoneMalloc(zone: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixBsdAppleMallocZoneMalloc(zone.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun mallocZoneValloc(zone: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixBsdAppleMallocZoneValloc(zone.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun mallocZoneCalloc(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixBsdAppleMallocZoneCalloc(zone.rawAddress.toCPointer<ByteVar>(), numItems, size)?.toLong() ?: 0L)

public actual fun mallocZoneRealloc(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixBsdAppleMallocZoneRealloc(zone.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun mallocZoneFree(zone: MutPtr, ptr: MutPtr) {
    libcUnixBsdAppleMallocZoneFree(zone.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcListpids(t, typeinfo, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procListallpids(buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcListallpids(buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcListpgrppids(pgrpid, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcListchildpids(ppid, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcPidinfo(pid, flavor, arg, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcPidfdinfo(pid, fd, flavor, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    libcUnixBsdAppleProcPidfileportinfo(pid, fileport, flavor, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procPidpath(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    libcUnixBsdAppleProcPidpath(pid, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procName(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    libcUnixBsdAppleProcName(pid, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr, buffersize: UInt): CInt =
    libcUnixBsdAppleProcRegionfilename(pid, address, buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procKmsgbuf(buffer: MutPtr, buffersize: UInt): CInt =
    libcUnixBsdAppleProcKmsgbuf(buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun procLibversion(major: MutPtr, minor: MutPtr): CInt =
    libcUnixBsdAppleProcLibversion(major.rawAddress.toCPointer<ByteVar>(), minor.rawAddress.toCPointer<ByteVar>())

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr): CInt =
    libcUnixBsdAppleProcPidRusage(pid, flavor, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun procSetNoSmt(): CInt =
    libcUnixBsdAppleProcSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    libcUnixBsdAppleProcSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    libcUnixBsdAppleProcSetCsm(flags)

public actual fun procSetthreadCsm(flags: UInt): CInt =
    libcUnixBsdAppleProcSetthreadCsm(flags)

public actual fun gethostuuid(id: MutPtr, timeout: ConstPtr): CInt =
    libcUnixBsdAppleGethostuuid(id.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    libcUnixBsdAppleGethostid()

public actual fun sethostid(hostid: CLong) {
    libcUnixBsdAppleSethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: MutPtr, size: SizeT): CCRNGStatus =
    libcUnixBsdAppleCCRandomGenerateBytes(bytes.rawAddress.toCPointer<ByteVar>(), size)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixBsdAppleGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun nsgetExecutablePath(buf: MutPtr, bufsize: MutPtr): CInt =
    libcUnixBsdAppleNsgetExecutablePath(buf.rawAddress.toCPointer<ByteVar>(), bufsize.rawAddress.toCPointer<ByteVar>())

public actual fun nsgetArgv(): MutPtr =
    MutPtr(libcUnixBsdAppleNsgetArgv()?.toLong() ?: 0L)

public actual fun nsgetArgc(): MutPtr =
    MutPtr(libcUnixBsdAppleNsgetArgc()?.toLong() ?: 0L)

public actual fun nsgetEnviron(): MutPtr =
    MutPtr(libcUnixBsdAppleNsgetEnviron()?.toLong() ?: 0L)

public actual fun nsgetProgname(): MutPtr =
    MutPtr(libcUnixBsdAppleNsgetProgname()?.toLong() ?: 0L)

public actual fun machVmMap(targetTask: VmMapT, address: MutPtr, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    libcUnixBsdAppleMachVmMap(targetTask.toLong().toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>(), size, mask, flags, obj, offset, copy, curProtection, maxProtection, inheritance)

public actual fun vmAllocate(targetTask: VmMapT, address: MutPtr, size: VmSizeT, flags: CInt): KernReturnT =
    libcUnixBsdAppleVmAllocate(targetTask.toLong().toCPointer<ByteVar>(), address.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    libcUnixBsdAppleVmDeallocate(targetTask.toLong().toCPointer<ByteVar>(), address, size)

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr): KernReturnT =
    libcUnixBsdAppleHostStatistics64(hostPriv, flavor, hostInfo64Out.rawAddress.toCPointer<ByteVar>(), hostInfo64OutCnt.rawAddress.toCPointer<ByteVar>())

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr, outProcessorInfo: MutPtr, outProcessorInfoCnt: MutPtr): KernReturnT =
    libcUnixBsdAppleHostProcessorInfo(host, flavor, outProcessorCount.rawAddress.toCPointer<ByteVar>(), outProcessorInfo.rawAddress.toCPointer<ByteVar>(), outProcessorInfoCnt.rawAddress.toCPointer<ByteVar>())

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr): KernReturnT =
    libcUnixBsdAppleTaskForPid(host, pid, task.rawAddress.toCPointer<ByteVar>())

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr): KernReturnT =
    libcUnixBsdAppleTaskInfo(host, flavor, taskInfoOut.rawAddress.toCPointer<ByteVar>(), taskInfoCount.rawAddress.toCPointer<ByteVar>())

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr): KernReturnT =
    libcUnixBsdAppleTaskCreate(targetTask, ledgers.rawAddress.toCPointer<ByteVar>(), ledgersCnt, inheritMemory, childTask.rawAddress.toCPointer<ByteVar>())

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    libcUnixBsdAppleTaskTerminate(targetTask)

public actual fun taskThreads(targetTask: TaskInspectT, actList: MutPtr, actListCnt: MutPtr): KernReturnT =
    libcUnixBsdAppleTaskThreads(targetTask, actList.rawAddress.toCPointer<ByteVar>(), actListCnt.rawAddress.toCPointer<ByteVar>())

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr): KernReturnT =
    libcUnixBsdAppleHostStatistics(hostPriv, flavor, hostInfoOut.rawAddress.toCPointer<ByteVar>(), hostInfoOutCnt.rawAddress.toCPointer<ByteVar>())

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr): SysdirSearchPathEnumerationState =
    libcUnixBsdAppleSysdirGetNextSearchPathEnumeration(state, path.rawAddress.toCPointer<ByteVar>())

public actual fun getattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    libcUnixBsdAppleGetattrlist(path.rawAddress.toCPointer<ByteVar>(), attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fgetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    libcUnixBsdAppleFgetattrlist(fd, attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistat(fd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: CUlong): CInt =
    libcUnixBsdAppleGetattrlistat(fd, path.rawAddress.toCPointer<ByteVar>(), attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    libcUnixBsdAppleSetattrlist(path.rawAddress.toCPointer<ByteVar>(), attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fsetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    libcUnixBsdAppleFsetattrlist(fd, attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlistat(dirFd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    libcUnixBsdAppleSetattrlistat(dirFd, path.rawAddress.toCPointer<ByteVar>(), attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistbulk(dirfd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: ULong): CInt =
    libcUnixBsdAppleGetattrlistbulk(dirfd, attrList.rawAddress.toCPointer<ByteVar>(), attrBuf.rawAddress.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun mallocSize(ptr: ConstPtr): SizeT =
    libcUnixBsdAppleMallocSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun mallocGoodSize(size: SizeT): SizeT =
    libcUnixBsdAppleMallocGoodSize(size)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdAppleDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(libcUnixBsdAppleBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixBsdAppleMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixBsdAppleMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun freadlink(fd: CInt, buf: MutPtr, size: SizeT): CInt =
    libcUnixBsdAppleFreadlink(fd, buf.rawAddress.toCPointer<ByteVar>(), size)

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    libcUnixBsdAppleExecvP(file.rawAddress.toCPointer<ByteVar>(), searchPath.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    libcUnixBsdAppleQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, arg.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    libcUnixBsdAppleClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixBsdAppleMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    libcUnixBsdAppleTaskSetInfo(targetTask, flavor, taskInfoIn.rawAddress.toCPointer<ByteVar>(), taskInfoInCnt)

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(libcUnixBsdAppleIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    libcUnixBsdAppleIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixBsdAppleIconvClose(cd.rawAddress.toCPointer<ByteVar>())
