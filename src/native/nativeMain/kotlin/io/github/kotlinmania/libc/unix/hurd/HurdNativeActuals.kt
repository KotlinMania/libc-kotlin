@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAbs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAccept4
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAcct
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAddmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioCancel
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioError
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioFsync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioRead
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioReturn
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioSuspend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAioWrite
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdAsctimeR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdBacktrace
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdBind
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdBrk
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClearenv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClockGetcpuclockid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClockGetres
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClockGettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClockNanosleep
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdClockSettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdCloseRange
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdCreat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdCtermid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdCtimeR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDaemon
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDirfd
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDirname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDlIteratePhdr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDladdr1
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDlinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDlmopen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDup3
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdDuplocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEaccess
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEndgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEndmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEndpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEndspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEndutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdErand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdErrnoLocation
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdEuidaccess
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdExecveat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdExecvpe
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFaccessat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFallocate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFdatasync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFexecve
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFgetgrentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFgetpos64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFgetpwentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFgetspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFgetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFlistxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFopen64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdForkpty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFreadUnlocked
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFreeifaddrs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFreelocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFremovexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFreopen64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFseeko64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFsetpos64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFsetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatvfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFstatvfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFtello64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFtruncate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFtruncate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFutimens
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdFutimes
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetdomainname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetdtablesize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetentropy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrgidR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrnam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetgrouplist
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGethostid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetifaddrs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetloadavg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetmntentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetnameinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetoptLong
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpriority
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpwentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpwnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetpwuidR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetrandom
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetresgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetresuid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetrlimit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetrlimit64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetspnam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetspnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGettimeofday
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetutxid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetutxline
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGlob
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGlob64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGlobfree
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGlobfree64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGnuBasename
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGnuGetLibcRelease
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdGnuGetLibcVersion
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdHasmntopt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIconv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIconvClose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIconvOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIfFreenameindex
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIfNameindex
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdInitgroups
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdIoctl
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdJrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLabs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLcong48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLgetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLibcCurrentSigrtmax
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLibcCurrentSigrtmin
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLioListio
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdListxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLlistxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLoginTty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLremovexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLseek
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLseek64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLsetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLstat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLstat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdLutimes
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMadvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMallocInfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMallocTrim
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMallocUsableSize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMallopt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMemalign
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMemmem
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMemrchr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMkfifoat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMknodat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMkostemp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMkostemps
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMkstemps
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMmap64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMprotect
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqClose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqGetattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqReceive
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqSend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqSetattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqTimedreceive
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqTimedsend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMqUnlink
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMremap
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdMsync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdNewlocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdNlLanginfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdNlLanginfoL
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdNrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdOpen64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdOpenat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdOpenat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdOpenpty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPipe2
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPopen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixBasename
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixFadvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixFadvise64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixFallocate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixFallocate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixMadvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawn
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddclosefromNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPosixSpawnp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPpoll
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPread64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPreadv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPreadv64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadAtfork
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierWait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCancel
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadCreate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadEqual
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadGetattrNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadGetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadKill
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadOnce
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSpinInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSpinLock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPtsnameR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPutgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPutpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPututxline
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPwrite64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPwritev
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdPwritev64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdQsortR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRand
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReaddir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReaddir64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReaddir64R
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReaddirR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReadv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdReboot
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRecvfrom
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRecvmsg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRegerror
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRegexec
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRegfree
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdRemovexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSbrk
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSchedGetparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSchedGetscheduler
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSchedSetparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSchedSetscheduler
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSeed48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSeekdir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSemDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSemGetvalue
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSemInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSemTimedwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSendfile
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSendfile64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSendmsg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetdomainname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetgroups
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSethostid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSethostname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetpriority
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetresgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetresuid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetrlimit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetrlimit64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSettimeofday
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSgetspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdShmOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdShmUnlink
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdShutdown
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSigaltstack
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSigsuspend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSigtimedwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSigwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSigwaitinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSrand
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStatfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStatfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStatvfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStatvfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStatx
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStrchrnul
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStrerrorR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStrftime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdStrptime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdSyncfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTelldir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTimerCreate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTimerDelete
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTimerGetoverrun
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTimerGettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTimerSettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTmpfile64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdTruncate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdUname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdUselocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdUtimensat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdUtmpname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdUtmpxname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdWait4
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdWaitid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libcUnixHurdWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixHurdLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: ConstPtr): CInt =
    libcUnixHurdFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcUnixHurdFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcUnixHurdUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun mkfifoat(fd: CInt, path: ConstPtr, mode: ModeT): CInt =
    libcUnixHurdMkfifoat(fd, path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixHurdMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun libcCurrentSigrtmin(): CInt =
    libcUnixHurdLibcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    libcUnixHurdLibcCurrentSigrtmax()

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    libcUnixHurdWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    libcUnixHurdWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    libcUnixHurdSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr): CInt =
    libcUnixHurdSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixHurdSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixHurdSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt =
    libcUnixHurdSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixHurdIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    libcUnixHurdPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libcUnixHurdDup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT =
    libcUnixHurdPread64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT =
    libcUnixHurdPwrite64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun readv(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    libcUnixHurdReadv(fd, iovec.rawAddress.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT =
    libcUnixHurdWritev(fd, iovec.rawAddress.toCPointer<ByteVar>(), count)

public actual fun preadv(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    libcUnixHurdPreadv(fd, iovec.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT =
    libcUnixHurdPwritev(fd, iovec.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixHurdPreadv64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixHurdPwritev64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcUnixHurdFreadUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr): CInt =
    libcUnixHurdAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    libcUnixHurdAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    libcUnixHurdAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr): CInt =
    libcUnixHurdAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    libcUnixHurdAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    libcUnixHurdAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    libcUnixHurdAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    libcUnixHurdLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixHurdMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixHurdMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr): CInt =
    libcUnixHurdMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    libcUnixHurdMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    libcUnixHurdMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixHurdMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    libcUnixHurdMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    libcUnixHurdMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    libcUnixHurdMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    libcUnixHurdLseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcUnixHurdLseek(fd, offset, whence)

public actual fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt =
    libcUnixHurdFgetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt =
    libcUnixHurdFseeko64(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt =
    libcUnixHurdFsetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun ftello64(stream: MutPtr): Off64T =
    libcUnixHurdFtello64(stream.rawAddress.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    libcUnixHurdBind(fd, addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt =
    libcUnixHurdAccept4(fd, addr.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), flg)

public actual fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixHurdPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, message: MutPtr, flags: CInt): SsizeT =
    libcUnixHurdRecvmsg(fd, message.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, message: ConstPtr, flags: CInt): SsizeT =
    libcUnixHurdSendmsg(fd, message.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    libcUnixHurdRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    libcUnixHurdSendfile(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT =
    libcUnixHurdSendfile64(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    libcUnixHurdShutdown(fd, how)

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    libcUnixHurdSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    libcUnixHurdGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    libcUnixHurdSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNameindex(): MutPtr =
    MutPtr(libcUnixHurdIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr) {
    libcUnixHurdIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixHurdGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getifaddrs(ifap: MutPtr): CInt =
    libcUnixHurdGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr) {
    libcUnixHurdFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun uname(buf: MutPtr): CInt =
    libcUnixHurdUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    libcUnixHurdGethostid()

public actual fun sethostid(hostid: CLong): CInt =
    libcUnixHurdSethostid(hostid)

public actual fun setpwent() {
    libcUnixHurdSetpwent()
}

public actual fun endpwent() {
    libcUnixHurdEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(libcUnixHurdGetpwent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixHurdSetgrent()
}

public actual fun endgrent() {
    libcUnixHurdEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(libcUnixHurdGetgrent()?.toLong() ?: 0L)

public actual fun setspent() {
    libcUnixHurdSetspent()
}

public actual fun endspent() {
    libcUnixHurdEndspent()
}

public actual fun getspent(): MutPtr =
    MutPtr(libcUnixHurdGetspent()?.toLong() ?: 0L)

public actual fun getspnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdGetspnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdFgetpwentR(stream.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdFgetgrentR(stream.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    libcUnixHurdPutpwent(p.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    libcUnixHurdPutgrent(grp.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixHurdFgetspentR(fp.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixHurdSgetspentR(s.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixHurdGetspentR(spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixHurdGetspnamR(name.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    MutPtr(libcUnixHurdGetmntentR(stream.rawAddress.toCPointer<ByteVar>(), mntbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun utmpname(file: ConstPtr): CInt =
    libcUnixHurdUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixHurdUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixHurdGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixHurdSetutxent()
}

public actual fun endutxent() {
    libcUnixHurdEndutxent()
}

public actual fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt =
    libcUnixHurdGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt =
    libcUnixHurdGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixHurdSetresuid(ruid, euid, suid)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixHurdSetresgid(rgid, egid, sgid)

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    libcUnixHurdInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(libcUnixHurdGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixHurdGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    libcUnixHurdGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt =
    libcUnixHurdSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun acct(filename: ConstPtr): CInt =
    libcUnixHurdAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdSetmntent(filename.rawAddress.toCPointer<ByteVar>(), ty.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getmntent(stream: MutPtr): MutPtr =
    MutPtr(libcUnixHurdGetmntent(stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt =
    libcUnixHurdAddmntent(stream.rawAddress.toCPointer<ByteVar>(), mnt.rawAddress.toCPointer<ByteVar>())

public actual fun endmntent(streamp: MutPtr): CInt =
    libcUnixHurdEndmntent(streamp.rawAddress.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdHasmntopt(mnt.rawAddress.toCPointer<ByteVar>(), opt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixHurdPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    libcUnixHurdPthreadKill(threadid.toCPointer<ByteVar>(), signo)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixHurdPthreadCancel(thread.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcUnixHurdPthreadEqual(t1.toCPointer<ByteVar>(), t2.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr): CInt =
    libcUnixHurdPthreadGetattrNp(thr.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcUnixHurdPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    libcUnixHurdPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcUnixHurdPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixHurdPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixHurdPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    libcUnixHurdPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    libcUnixHurdPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    libcUnixHurdPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixHurdPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixHurdPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcUnixHurdPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcUnixHurdPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadOnce(control: MutPtr, routine: PthreadOnceRoutineCallback): CInt =
    libcUnixHurdPthreadOnce(control.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    libcUnixHurdPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    libcUnixHurdPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    libcUnixHurdPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    libcUnixHurdPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    libcUnixHurdPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    libcUnixHurdPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    libcUnixHurdPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    libcUnixHurdPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    libcUnixHurdPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    libcUnixHurdPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    libcUnixHurdPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    libcUnixHurdPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    libcUnixHurdPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, newmask: ConstPtr, oldmask: MutPtr): CInt =
    libcUnixHurdPthreadSigmask(how, newmask.rawAddress.toCPointer<ByteVar>(), oldmask.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcUnixHurdSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcUnixHurdSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixHurdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcUnixHurdSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcUnixHurdPthreadGetschedparam(native.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcUnixHurdPthreadSetschedparam(native.toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    libcUnixHurdPthreadGetcpuclockid(thread.toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    libcUnixHurdSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: MutPtr): CInt =
    libcUnixHurdSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    libcUnixHurdSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    libcUnixHurdSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    libcUnixHurdClockGetres(clockId, res.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    libcUnixHurdClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    libcUnixHurdClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    libcUnixHurdClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixHurdClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixHurdGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixHurdSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixHurdAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixHurdCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT =
    libcUnixHurdStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr =
    MutPtr(libcUnixHurdStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    libcUnixHurdTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixHurdTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixHurdTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    libcUnixHurdTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixHurdTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstat(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstat64(fd: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstat64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatat(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    libcUnixHurdFstatat(fd, file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun fstatat64(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt =
    libcUnixHurdFstatat64(fd, file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt =
    libcUnixHurdStatx(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, mask, statxbuf.rawAddress.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcUnixHurdFtruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    libcUnixHurdFtruncate64(fd, length)

public actual fun truncate64(file: ConstPtr, length: Off64T): CInt =
    libcUnixHurdTruncate64(file.rawAddress.toCPointer<ByteVar>(), length)

public actual fun lstat(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdLstat(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun lstat64(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdLstat64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs64(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStatfs64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs64(fildes: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstatfs64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStatvfs(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs64(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStatvfs64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs(fildes: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstatvfs(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs64(fildes: CInt, buf: MutPtr): CInt =
    libcUnixHurdFstatvfs64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun open(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpen(file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun open64(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpen64(file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpenat(fd, file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpenat64(fd, file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdFopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(libcUnixHurdFreopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun creat64(path: ConstPtr, mode: ModeT): CInt =
    libcUnixHurdCreat64(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    libcUnixHurdMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    libcUnixHurdMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    libcUnixHurdMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun tmpfile64(): MutPtr =
    MutPtr(libcUnixHurdTmpfile64()?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    libcUnixHurdGetdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    libcUnixHurdCloseRange(first, last, flags)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt =
    libcUnixHurdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT =
    libcUnixHurdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getpt(): CInt =
    libcUnixHurdGetpt()

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixHurdPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun loginTty(fd: CInt): CInt =
    libcUnixHurdLoginTty(fd)

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(libcUnixHurdCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clearenv(): CInt =
    libcUnixHurdClearenv()

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    libcUnixHurdExecveat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHurdExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHurdFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixHurdDaemon(nochdir, noclose)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHurdPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixHurdPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixHurdPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    libcUnixHurdPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    libcUnixHurdPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    libcUnixHurdPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    libcUnixHurdPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixHurdPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixHurdPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    libcUnixHurdPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    libcUnixHurdPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixHurdPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    libcUnixHurdPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toCPointer<ByteVar>(), tcfd)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcUnixHurdShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcUnixHurdShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixHurdEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixHurdEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcUnixHurdFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun stat(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStat(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun stat64(file: ConstPtr, buf: MutPtr): CInt =
    libcUnixHurdStat64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(libcUnixHurdReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir64(dirp: MutPtr): MutPtr =
    MutPtr(libcUnixHurdReaddir64(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    libcUnixHurdReaddirR(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    libcUnixHurdReaddir64R(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcUnixHurdSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcUnixHurdTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr): CInt =
    libcUnixHurdDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixHurdStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcUnixHurdErrnoLocation()?.toLong() ?: 0L)

public actual fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr =
    MutPtr(libcUnixHurdMmap64(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(libcUnixHurdMremap(addr.rawAddress.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixHurdMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcUnixHurdMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sync() {
    libcUnixHurdSync()
}

public actual fun syncfs(fd: CInt): CInt =
    libcUnixHurdSyncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixHurdFdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixHurdFallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcUnixHurdPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libcUnixHurdPosixFallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcUnixHurdPosixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    libcUnixHurdPosixFadvise64(fd, offset, len, advise)

public actual fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixHurdMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    libcUnixHurdPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixHurdGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixHurdGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixHurdSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixHurdSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    libcUnixHurdGetpriority(which, who)

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    libcUnixHurdSetpriority(which, who, prio)

public actual fun getrandom(buffer: MutPtr, length: SizeT, flags: CUint): SsizeT =
    libcUnixHurdGetrandom(buffer.rawAddress.toCPointer<ByteVar>(), length, flags)

public actual fun getentropy(buffer: MutPtr, length: SizeT): CInt =
    libcUnixHurdGetentropy(buffer.rawAddress.toCPointer<ByteVar>(), length)

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixHurdMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixHurdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun strchrnul(s: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcUnixHurdStrchrnul(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun abs(i: CInt): CInt =
    libcUnixHurdAbs(i)

public actual fun labs(i: CLong): CLong =
    libcUnixHurdLabs(i)

public actual fun rand(): CInt =
    libcUnixHurdRand()

public actual fun srand(seed: CUint) {
    libcUnixHurdSrand(seed)
}

public actual fun drand48(): CDouble =
    libcUnixHurdDrand48()

public actual fun erand48(xseed: MutPtr): CDouble =
    libcUnixHurdErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixHurdLrand48()

public actual fun nrand48(xseed: MutPtr): CLong =
    libcUnixHurdNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixHurdMrand48()

public actual fun jrand48(xseed: MutPtr): CLong =
    libcUnixHurdJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libcUnixHurdSrand48(seed)
}

public actual fun seed48(xseed: MutPtr): MutPtr =
    MutPtr(libcUnixHurdSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48(p: MutPtr) {
    libcUnixHurdLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    libcUnixHurdQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun brk(addr: MutPtr): CInt =
    libcUnixHurdBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr =
    MutPtr(libcUnixHurdSbrk(increment)?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixHurdMemalign(align, size)?.toLong() ?: 0L)

public actual fun mallopt(param: CInt, value: CInt): CInt =
    libcUnixHurdMallopt(param, value)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    libcUnixHurdMallocInfo(options, stream.rawAddress.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    libcUnixHurdMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun mallocTrim(pad: SizeT): CInt =
    libcUnixHurdMallocTrim(pad)

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(libcUnixHurdIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    libcUnixHurdIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixHurdIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt =
    libcUnixHurdGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    libcUnixHurdBacktrace(buf.rawAddress.toCPointer<ByteVar>(), sz)

public actual fun reboot(howTo: CInt): CInt =
    libcUnixHurdReboot(howTo)

public actual fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt =
    libcUnixHurdGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    libcUnixHurdRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    libcUnixHurdRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr) {
    libcUnixHurdRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixHurdGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr) {
    libcUnixHurdGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixHurdGlob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr) {
    libcUnixHurdGlobfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixHurdSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixHurdLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixHurdFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    libcUnixHurdFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixHurdRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixHurdLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(filedes: CInt, name: ConstPtr): CInt =
    libcUnixHurdFremovexattr(filedes, name.rawAddress.toCPointer<ByteVar>())

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixHurdDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixBasename(path: MutPtr): MutPtr =
    MutPtr(libcUnixHurdPosixBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    MutPtr(libcUnixHurdGnuBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(libcUnixHurdDlmopen(lmid, filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    libcUnixHurdDlinfo(handle.rawAddress.toCPointer<ByteVar>(), request, info.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    libcUnixHurdDladdr1(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), extraInfo.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixHurdDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixHurdFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcUnixHurdNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixHurdUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcUnixHurdNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(libcUnixHurdNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    libcUnixHurdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun gnuGetLibcRelease(): ConstPtr =
    ConstPtr(libcUnixHurdGnuGetLibcRelease()?.toLong() ?: 0L)

public actual fun gnuGetLibcVersion(): ConstPtr =
    ConstPtr(libcUnixHurdGnuGetLibcVersion()?.toLong() ?: 0L)
