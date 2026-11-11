@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioCancel
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioError
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioFsync
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioRead
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioReturn
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioSuspend
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_aioWrite
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_asctime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_asctimeR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtrace
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceAsync
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceFromFp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceImageOffsets
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceSymbols
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_backtraceSymbolsFd
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_basename
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_brk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_cCRandomGenerateBytes
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_chflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockGetres
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockGettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clockSettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clonefile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_clonefileat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_connectx
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateAlloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateFree
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateGet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_copyfileStateSet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ctime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ctimeR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_daemon
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dirfd
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dirname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_disconnectx
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_duplocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageHeader
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageName
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldGetImageVmaddrSlide
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_dyldImageCount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_endutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_error
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_execvP
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fchflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fclonefileat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fcopyfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fgetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fgetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_flistxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fmount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_forkpty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_freadlink
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_freelocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fremovexattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fsetattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fsetxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_fstatfs
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ftok
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_futimens
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_get_MACH_TASK_SELF
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_get_VM_PAGE_SIZE
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlistat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getattrlistbulk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getdate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getdomainname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getentropy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getfsstat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getgrouplist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gethostid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gethostuuid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getmntinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getnameinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getpriority
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_gettimeofday
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getutxline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_getxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostProcessorInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostStatistics
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_hostStatistics64
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconvClose
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_iconvOpen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_initgroups
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_kevent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_kevent64
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_lioListio
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_listxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_localeconvL
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_loginTty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_lutimes
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machAbsoluteTime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machErrorString
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machHostSelf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machThreadSelf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machTimebaseInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_machVmMap
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocDefaultZone
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocGoodSize
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocPrintf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocSize
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneCalloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneCheck
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneFree
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneFromPtr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneLog
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneMalloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZonePrint
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZonePrintPtrInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneRealloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneStatistics
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mallocZoneValloc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memmem
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern16
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern4
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetPattern8
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_memsetS
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mincore
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mkfifoat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mknodat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mount
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_mprotect
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_newlocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetArgc
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetArgv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetEnviron
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetExecutablePath
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_nsgetProgname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ntpAdjtime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ntpGettime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_openpty
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osLogCreate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osLogTypeEnabled
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostEnabled
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostIdGenerate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSignpostIdMakeWithPointer
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddress
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWakeByAddressAll
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osSyncWakeByAddressAny
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockAssertNotOwner
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockAssertOwner
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockLock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockTrylock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_osUnfairLockUnlock
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawn
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetarchprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetbinprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetarchprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetbinprefNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_posixSpawnp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_preadv
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procKmsgbuf
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procLibversion
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListallpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListchildpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListpgrppids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procListpids
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procName
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidRusage
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidfdinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidfileportinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidinfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procPidpath
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procRegionfilename
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetCsm
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetNoSmt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetthreadCsm
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_procSetthreadNoSmt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetdetachstate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetscope
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrGetstackaddr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrSetscope
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadAttrSetstackaddr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadCpuNumberNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadFromMachThreadNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetStackaddrNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetStacksizeNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadGetnameNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteProtectNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadMachThreadNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadMainNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadSetnameNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pthreadThreadidNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_ptrace
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pututxline
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_pwritev
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_qsortR
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_querylocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_quotactl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_removexattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_renameatxNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_renamexNp
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sbrk
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semDestroy
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semInit
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semget
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_semop
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sendfile
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_set_MACH_TASK_SELF
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setattrlist
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setattrlistat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setdomainname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setgrent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sethostid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sethostname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setpriority
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_settimeofday
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setutxent
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_setxattr
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmOpen
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmdt
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_shmget
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_statfs
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_strptime
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_strtonum
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctl
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctlbyname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysctlnametomib
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskCreate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskForPid
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskSetInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskTerminate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_taskThreads
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadInfo
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadPolicyGet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_threadPolicySet
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_uname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_uselocale
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_utimensat
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_utmpxname
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_vmAllocate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_vmDeallocate
import io.github.kotlinmania.libc.unix.bsd.apple.cinterop.libc_unix_bsd_apple_waitid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var MACH_TASK_SELF: MachPortT
    get() = libc_unix_bsd_apple_get_MACH_TASK_SELF()
    set(value) {
        libc_unix_bsd_apple_set_MACH_TASK_SELF(value)
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = libc_unix_bsd_apple_get_VM_PAGE_SIZE()

public actual fun setgrent() {
    libc_unix_bsd_apple_setgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_unix_bsd_apple_daemon(nochdir, noclose)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_unix_bsd_apple_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_unix_bsd_apple_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    libc_unix_bsd_apple_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun chflags(path: String?, flags: CUint): CInt =
    libc_unix_bsd_apple_chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    libc_unix_bsd_apple_fchflags(fd, flags)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    libc_unix_bsd_apple_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    libc_unix_bsd_apple_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_bsd_apple_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getutxent(): COpaquePointer? =
    libc_unix_bsd_apple_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    libc_unix_bsd_apple_setutxent()
}

public actual fun endutxent() {
    libc_unix_bsd_apple_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    libc_unix_bsd_apple_utmpxname(file)

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_asctime(tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_ctime(clock?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getdate(datestr: String?): COpaquePointer? =
    libc_unix_bsd_apple_getdate(datestr)?.let { COpaquePointer(it.toLong()) }

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_strptime(buf, format, timeptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_asctimeR(tm?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_ctimeR(clock?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_bsd_apple_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    libc_unix_bsd_apple_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    libc_unix_bsd_apple_sysctlnametomib(name, mibp?.value?.toCPointer<ByteVar>(), sizep?.value?.toCPointer<ByteVar>())

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_bsd_apple_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    libc_unix_bsd_apple_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_bsd_apple_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    libc_unix_bsd_apple_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_bsd_apple_shmOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    libc_unix_bsd_apple_ftok(pathname, projId)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    libc_unix_bsd_apple_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc_unix_bsd_apple_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libc_unix_bsd_apple_shmget(key, size, shmflg)

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    libc_unix_bsd_apple_sysctl(name?.value?.toCPointer<ByteVar>(), namelen, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    libc_unix_bsd_apple_sysctlbyname(name, oldp?.value?.toCPointer<ByteVar>(), oldlenp?.value?.toCPointer<ByteVar>(), newp?.value?.toCPointer<ByteVar>(), newlen)

public actual fun machAbsoluteTime(): ULong =
    libc_unix_bsd_apple_machAbsoluteTime()

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    libc_unix_bsd_apple_machTimebaseInfo(info?.value?.toCPointer<ByteVar>())

public actual fun machHostSelf(): MachPortT =
    libc_unix_bsd_apple_machHostSelf()

public actual fun machThreadSelf(): MachPortT =
    libc_unix_bsd_apple_machThreadSelf()

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadAttrGetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadAttrGetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadAttrGetdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    libc_unix_bsd_apple_pthreadAttrSetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadAttrSetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(name: String?): CInt =
    libc_unix_bsd_apple_pthreadSetnameNp(name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    libc_unix_bsd_apple_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    libc_unix_bsd_apple_pthreadMachThreadNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    (libc_unix_bsd_apple_pthreadFromMachThreadNp(port)?.toLong() ?: 0L).toULong()

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    libc_unix_bsd_apple_pthreadGetStackaddrNp(thread.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    libc_unix_bsd_apple_pthreadGetStacksizeNp(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadMainNp(): CInt =
    libc_unix_bsd_apple_pthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadThreadidNp(thread.toLong().toCPointer<ByteVar>(), threadId?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(0L.toCPointer<ByteVar>(), ctx?.value?.toCPointer<ByteVar>())

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    libc_unix_bsd_apple_pthreadCpuNumberNp(cpuNumberOut?.value?.toCPointer<ByteVar>())

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    libc_unix_bsd_apple_osSyncWaitOnAddress(addr?.value?.toCPointer<ByteVar>(), value, size, flags)

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, deadline)

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout(addr?.value?.toCPointer<ByteVar>(), value, size, flags, clockid, timeoutNs)

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    libc_unix_bsd_apple_osSyncWakeByAddressAny(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    libc_unix_bsd_apple_osSyncWakeByAddressAll(addr?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    libc_unix_bsd_apple_osUnfairLockLock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    libc_unix_bsd_apple_osUnfairLockTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    libc_unix_bsd_apple_osUnfairLockUnlock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    libc_unix_bsd_apple_osUnfairLockAssertOwner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    libc_unix_bsd_apple_osUnfairLockAssertNotOwner(lock?.value?.toCPointer<ByteVar>())
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    libc_unix_bsd_apple_osLogCreate(subsystem, category)?.let { COpaquePointer(it.toLong()) }

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    libc_unix_bsd_apple_osLogTypeEnabled(oslog?.value?.toCPointer<ByteVar>(), tpe)

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    libc_unix_bsd_apple_osSignpostIdMakeWithPointer(log?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    libc_unix_bsd_apple_osSignpostIdGenerate(log?.value?.toCPointer<ByteVar>())

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    libc_unix_bsd_apple_osSignpostEnabled(log?.value?.toCPointer<ByteVar>())

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    libc_unix_bsd_apple_threadPolicySet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo?.value?.toCPointer<ByteVar>(), count)

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_threadPolicyGet(thread.toLong().toCPointer<ByteVar>(), flavor, policyInfo?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>(), getDefault?.value?.toCPointer<ByteVar>())

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_threadInfo(targetAct, flavor, threadInfoOut?.value?.toCPointer<ByteVar>(), threadInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun error(): COpaquePointer? =
    libc_unix_bsd_apple_error()?.let { COpaquePointer(it.toLong()) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    libc_unix_bsd_apple_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    libc_unix_bsd_apple_backtraceSymbols(addrs?.value?.toCPointer<ByteVar>(), sz)?.let { COpaquePointer(it.toLong()) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    libc_unix_bsd_apple_backtraceSymbolsFd(addrs?.value?.toCPointer<ByteVar>(), sz, fd)
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    libc_unix_bsd_apple_backtraceFromFp(startfp?.value?.toCPointer<ByteVar>(), array?.value?.toCPointer<ByteVar>(), size)

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
    libc_unix_bsd_apple_backtraceImageOffsets(array?.value?.toCPointer<ByteVar>(), imageOffsets?.value?.toCPointer<ByteVar>(), size)
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    libc_unix_bsd_apple_backtraceAsync(array?.value?.toCPointer<ByteVar>(), length, taskId?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_apple_kevent(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, timeout?.value?.toCPointer<ByteVar>())

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_apple_kevent64(kq, changelist?.value?.toCPointer<ByteVar>(), nchanges, eventlist?.value?.toCPointer<ByteVar>(), nevents, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    libc_unix_bsd_apple_mount(src, target, flags, data?.value?.toCPointer<ByteVar>())

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    libc_unix_bsd_apple_fmount(src, fd, flags, data?.value?.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    libc_unix_bsd_apple_ptrace(request, pid, addr?.value?.toCPointer<ByteVar>(), data)

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    libc_unix_bsd_apple_quotactl(special, cmd, id, data?.value?.toCPointer<ByteVar>())

public actual fun sethostname(name: String?, len: CInt): CInt =
    libc_unix_bsd_apple_sethostname(name, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_apple_sendfile(fd, s, offset, len?.value?.toCPointer<ByteVar>(), hdtr?.value?.toCPointer<ByteVar>(), flags)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_bsd_apple_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_unix_bsd_apple_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    libc_unix_bsd_apple_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun loginTty(fd: CInt): CInt =
    libc_unix_bsd_apple_loginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    libc_unix_bsd_apple_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT): CInt =
    libc_unix_bsd_apple_freelocale(loc?.value?.toCPointer<ByteVar>())

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    libc_unix_bsd_apple_localeconvL(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc_unix_bsd_apple_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    libc_unix_bsd_apple_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    libc_unix_bsd_apple_querylocale(mask, loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getpriority(which: CInt, who: IdT): CInt =
    libc_unix_bsd_apple_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    libc_unix_bsd_apple_setpriority(which, who, prio)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    libc_unix_bsd_apple_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    libc_unix_bsd_apple_setdomainname(name, len)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_bsd_apple_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_unix_bsd_apple_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    libc_unix_bsd_apple_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    libc_unix_bsd_apple_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    libc_unix_bsd_apple_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    libc_unix_bsd_apple_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, position, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    libc_unix_bsd_apple_listxattr(path, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    libc_unix_bsd_apple_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    libc_unix_bsd_apple_removexattr(path, name, flags)

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    libc_unix_bsd_apple_renamexNp(from, to, flags)

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    libc_unix_bsd_apple_renameatxNp(fromfd, from, tofd, to, flags)

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    libc_unix_bsd_apple_fremovexattr(filedes, name, flags)

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_unix_bsd_apple_getgrouplist(name, basegid, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    libc_unix_bsd_apple_initgroups(user, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_bsd_apple_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_brk(addr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    libc_unix_bsd_apple_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_bsd_apple_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun dyldImageCount(): UInt =
    libc_unix_bsd_apple_dyldImageCount()

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    libc_unix_bsd_apple_dyldGetImageHeader(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex)

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    libc_unix_bsd_apple_dyldGetImageName(imageIndex)?.let { COpaquePointer(it.toLong()) }

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetarchprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetarchprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), subpref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrGetbinprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnattrSetbinprefNp(attr?.value?.toCPointer<ByteVar>(), count, pref?.value?.toCPointer<ByteVar>(), ocount?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    libc_unix_bsd_apple_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_bsd_apple_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_bsd_apple_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    libc_unix_bsd_apple_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    libc_unix_bsd_apple_connectx(socket, endpoints?.value?.toCPointer<ByteVar>(), associd, flags, iov?.value?.toCPointer<ByteVar>(), iovcnt, len?.value?.toCPointer<ByteVar>(), connid?.value?.toCPointer<ByteVar>())

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    libc_unix_bsd_apple_disconnectx(socket, associd, connid)

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    libc_unix_bsd_apple_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    libc_unix_bsd_apple_getmntinfo(mntbufp?.value?.toCPointer<ByteVar>(), flags)

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    libc_unix_bsd_apple_getfsstat(mntbufp?.value?.toCPointer<ByteVar>(), bufsize, flags)

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    libc_unix_bsd_apple_clonefile(src, dst, flags)

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    libc_unix_bsd_apple_clonefileat(srcDirfd, src, dstDirfd, dst, flags)

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    libc_unix_bsd_apple_fclonefileat(srcfd, dstDirfd, dst, flags)

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    libc_unix_bsd_apple_copyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    libc_unix_bsd_apple_fcopyfile(from, to, state?.value?.toCPointer<ByteVar>(), flags)

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    libc_unix_bsd_apple_copyfileStateFree(s?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateAlloc(): CopyfileStateT =
    libc_unix_bsd_apple_copyfileStateAlloc()?.let { COpaquePointer(it.toLong()) }

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    libc_unix_bsd_apple_copyfileStateGet(s?.value?.toCPointer<ByteVar>(), flags, dst?.value?.toCPointer<ByteVar>())

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    libc_unix_bsd_apple_copyfileStateSet(s?.value?.toCPointer<ByteVar>(), flags, src?.value?.toCPointer<ByteVar>())

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    libc_unix_bsd_apple_machErrorString(errorValue)?.let { COpaquePointer(it.toLong()) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    libc_unix_bsd_apple_memsetS(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    libc_unix_bsd_apple_memsetPattern4(b?.value?.toCPointer<ByteVar>(), pattern4?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    libc_unix_bsd_apple_memsetPattern8(b?.value?.toCPointer<ByteVar>(), pattern8?.value?.toCPointer<ByteVar>(), len)
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    libc_unix_bsd_apple_memsetPattern16(b?.value?.toCPointer<ByteVar>(), pattern16?.value?.toCPointer<ByteVar>(), len)
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    libc_unix_bsd_apple_strtonum(numstr, minval, maxval, errstrp?.value?.toCPointer<ByteVar>())

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: String?, vararg variadicArgs: Long) {
    libc_unix_bsd_apple_mallocPrintf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    libc_unix_bsd_apple_mallocZoneCheck(zone?.value?.toCPointer<ByteVar>())

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
    libc_unix_bsd_apple_mallocZonePrint(zone?.value?.toCPointer<ByteVar>(), verbose)
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
    libc_unix_bsd_apple_mallocZoneStatistics(zone?.value?.toCPointer<ByteVar>(), stats?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
    libc_unix_bsd_apple_mallocZoneLog(zone?.value?.toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>())
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    libc_unix_bsd_apple_mallocZonePrintPtrInfo(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    libc_unix_bsd_apple_mallocDefaultZone()?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_mallocZoneFromPtr(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_unix_bsd_apple_mallocZoneMalloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_unix_bsd_apple_mallocZoneValloc(zone?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_bsd_apple_mallocZoneCalloc(zone?.value?.toCPointer<ByteVar>(), numItems, size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_unix_bsd_apple_mallocZoneRealloc(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
    libc_unix_bsd_apple_mallocZoneFree(zone?.value?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procListpids(t, typeinfo, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procListallpids(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procListpgrppids(pgrpid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procListchildpids(ppid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procPidinfo(pid, flavor, arg, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procPidfdinfo(pid, fd, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    libc_unix_bsd_apple_procPidfileportinfo(pid, fileport, flavor, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    libc_unix_bsd_apple_procPidpath(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    libc_unix_bsd_apple_procName(pid, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    libc_unix_bsd_apple_procRegionfilename(pid, address, buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    libc_unix_bsd_apple_procKmsgbuf(buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    libc_unix_bsd_apple_procLibversion(major?.value?.toCPointer<ByteVar>(), minor?.value?.toCPointer<ByteVar>())

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    libc_unix_bsd_apple_procPidRusage(pid, flavor, buffer?.value?.toCPointer<ByteVar>())

public actual fun procSetNoSmt(): CInt =
    libc_unix_bsd_apple_procSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    libc_unix_bsd_apple_procSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    libc_unix_bsd_apple_procSetCsm(flags)

public actual fun procSetthreadCsm(flags: UInt): CInt =
    libc_unix_bsd_apple_procSetthreadCsm(flags)

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_bsd_apple_gethostuuid(id?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    libc_unix_bsd_apple_gethostid()

public actual fun sethostid(hostid: CLong) {
    libc_unix_bsd_apple_sethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    libc_unix_bsd_apple_cCRandomGenerateBytes(bytes?.value?.toCPointer<ByteVar>(), size)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_bsd_apple_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    libc_unix_bsd_apple_nsgetExecutablePath(buf?.value?.toCPointer<ByteVar>(), bufsize?.value?.toCPointer<ByteVar>())

public actual fun nsgetArgv(): COpaquePointer? =
    libc_unix_bsd_apple_nsgetArgv()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetArgc(): COpaquePointer? =
    libc_unix_bsd_apple_nsgetArgc()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetEnviron(): COpaquePointer? =
    libc_unix_bsd_apple_nsgetEnviron()?.let { COpaquePointer(it.toLong()) }

public actual fun nsgetProgname(): COpaquePointer? =
    libc_unix_bsd_apple_nsgetProgname()?.let { COpaquePointer(it.toLong()) }

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    libc_unix_bsd_apple_machVmMap(targetTask.toLong().toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size, mask, flags, obj, offset, copy, curProtection, maxProtection, inheritance)

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    libc_unix_bsd_apple_vmAllocate(targetTask.toLong().toCPointer<ByteVar>(), address?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    libc_unix_bsd_apple_vmDeallocate(targetTask.toLong().toCPointer<ByteVar>(), address, size)

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_hostStatistics64(hostPriv, flavor, hostInfo64Out?.value?.toCPointer<ByteVar>(), hostInfo64OutCnt?.value?.toCPointer<ByteVar>())

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_hostProcessorInfo(host, flavor, outProcessorCount?.value?.toCPointer<ByteVar>(), outProcessorInfo?.value?.toCPointer<ByteVar>(), outProcessorInfoCnt?.value?.toCPointer<ByteVar>())

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_taskForPid(host, pid, task?.value?.toCPointer<ByteVar>())

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_taskInfo(host, flavor, taskInfoOut?.value?.toCPointer<ByteVar>(), taskInfoCount?.value?.toCPointer<ByteVar>())

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_taskCreate(targetTask, ledgers?.value?.toCPointer<ByteVar>(), ledgersCnt, inheritMemory, childTask?.value?.toCPointer<ByteVar>())

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    libc_unix_bsd_apple_taskTerminate(targetTask)

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_taskThreads(targetTask, actList?.value?.toCPointer<ByteVar>(), actListCnt?.value?.toCPointer<ByteVar>())

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    libc_unix_bsd_apple_hostStatistics(hostPriv, flavor, hostInfoOut?.value?.toCPointer<ByteVar>(), hostInfoOutCnt?.value?.toCPointer<ByteVar>())

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state, path?.value?.toCPointer<ByteVar>())

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    libc_unix_bsd_apple_getattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    libc_unix_bsd_apple_fgetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    libc_unix_bsd_apple_getattrlistat(fd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    libc_unix_bsd_apple_setattrlist(path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    libc_unix_bsd_apple_fsetattrlist(fd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    libc_unix_bsd_apple_setattrlistat(dirFd, path, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    libc_unix_bsd_apple_getattrlistbulk(dirfd, attrList?.value?.toCPointer<ByteVar>(), attrBuf?.value?.toCPointer<ByteVar>(), attrBufSize, options)

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    libc_unix_bsd_apple_mallocSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun mallocGoodSize(size: SizeT): SizeT =
    libc_unix_bsd_apple_mallocGoodSize(size)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_bsd_apple_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_unix_bsd_apple_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_unix_bsd_apple_mknodat(dirfd, pathname, mode, dev)

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    libc_unix_bsd_apple_freadlink(fd, buf?.value?.toCPointer<ByteVar>(), size)

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    libc_unix_bsd_apple_execvP(file, searchPath, argv?.value?.toCPointer<ByteVar>())

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    libc_unix_bsd_apple_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, arg?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_bsd_apple_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    libc_unix_bsd_apple_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    libc_unix_bsd_apple_taskSetInfo(targetTask, flavor, taskInfoIn?.value?.toCPointer<ByteVar>(), taskInfoInCnt)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    libc_unix_bsd_apple_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    libc_unix_bsd_apple_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libc_unix_bsd_apple_iconvClose(cd?.value?.toCPointer<ByteVar>())
