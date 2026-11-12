@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixHurdLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    libcUnixHurdFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcUnixHurdFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcUnixHurdUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun mkfifoat(fd: CInt, path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixHurdMkfifoat(fd, path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixHurdMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun libcCurrentSigrtmin(): CInt =
    libcUnixHurdLibcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    libcUnixHurdLibcCurrentSigrtmax()

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    libcUnixHurdWait4(pid, status.rawAddress.toCPointer<ByteVar>(), options, rusage.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixHurdWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcUnixHurdSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcUnixHurdSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixHurdSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixHurdSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcUnixHurdSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libcUnixHurdIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcUnixHurdPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libcUnixHurdDup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixHurdPread64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    libcUnixHurdPwrite64(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun readv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT =
    libcUnixHurdReadv(fd, iovec.rawAddress.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT =
    libcUnixHurdWritev(fd, iovec.rawAddress.toCPointer<ByteVar>(), count)

public actual fun preadv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    libcUnixHurdPreadv(fd, iovec.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT =
    libcUnixHurdPwritev(fd, iovec.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixHurdPreadv64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    libcUnixHurdPwritev64(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcUnixHurdFreadUnlocked(buf.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixHurdAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixHurdAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixHurdAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixHurdAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixHurdAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixHurdAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixHurdAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixHurdLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixHurdMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixHurdMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixHurdMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcUnixHurdMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcUnixHurdMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixHurdMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcUnixHurdMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    libcUnixHurdMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    libcUnixHurdMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    libcUnixHurdLseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcUnixHurdLseek(fd, offset, whence)

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    libcUnixHurdFgetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    libcUnixHurdFseeko64(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    libcUnixHurdFsetpos64(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    libcUnixHurdFtello64(stream.rawAddress.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    libcUnixHurdBind(fd, addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    libcUnixHurdAccept4(fd, addr.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), flg)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixHurdPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, message: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixHurdRecvmsg(fd, message.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, message: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcUnixHurdSendmsg(fd, message.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcUnixHurdRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT =
    libcUnixHurdSendfile(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT =
    libcUnixHurdSendfile64(outFd, inFd, offset.rawAddress.toCPointer<ByteVar>(), count)

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    libcUnixHurdShutdown(fd, how)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixHurdSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixHurdGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcUnixHurdSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcUnixHurdIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcUnixHurdIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixHurdGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    libcUnixHurdGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    libcUnixHurdFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun uname(buf: MutPtr<Utsname>): CInt =
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

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcUnixHurdGetpwent()?.toLong() ?: 0L)

public actual fun setgrent() {
    libcUnixHurdSetgrent()
}

public actual fun endgrent() {
    libcUnixHurdEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcUnixHurdGetgrent()?.toLong() ?: 0L)

public actual fun setspent() {
    libcUnixHurdSetspent()
}

public actual fun endspent() {
    libcUnixHurdEndspent()
}

public actual fun getspent(): MutPtr<Spwd> =
    MutPtr(libcUnixHurdGetspent()?.toLong() ?: 0L)

public actual fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd> =
    MutPtr(libcUnixHurdGetspnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixHurdGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixHurdGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixHurdFgetpwentR(stream.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixHurdFgetgrentR(stream.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    libcUnixHurdPutpwent(p.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    libcUnixHurdPutgrent(grp.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixHurdGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixHurdGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixHurdFgetspentR(fp.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixHurdSgetspentR(s.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixHurdGetspentR(spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixHurdGetspnamR(name.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    MutPtr(libcUnixHurdGetmntentR(stream.rawAddress.toCPointer<ByteVar>(), mntbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    libcUnixHurdUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    libcUnixHurdUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(libcUnixHurdGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixHurdGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixHurdGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixHurdPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixHurdSetutxent()
}

public actual fun endutxent() {
    libcUnixHurdEndutxent()
}

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    libcUnixHurdGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    libcUnixHurdGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcUnixHurdSetresuid(ruid, euid, suid)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcUnixHurdSetresgid(rgid, egid, sgid)

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    libcUnixHurdInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcUnixHurdGetgrgid(gid)?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixHurdGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcUnixHurdGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixHurdGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcUnixHurdGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    libcUnixHurdSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    libcUnixHurdAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixHurdSetmntent(filename.rawAddress.toCPointer<ByteVar>(), ty.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    MutPtr(libcUnixHurdGetmntent(stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt =
    libcUnixHurdAddmntent(stream.rawAddress.toCPointer<ByteVar>(), mnt.rawAddress.toCPointer<ByteVar>())

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    libcUnixHurdEndmntent(streamp.rawAddress.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdHasmntopt(mnt.rawAddress.toCPointer<ByteVar>(), opt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcUnixHurdPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    libcUnixHurdPthreadKill(threadid.toCPointer<ByteVar>(), signo)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcUnixHurdPthreadCancel(thread.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcUnixHurdPthreadEqual(t1.toCPointer<ByteVar>(), t2.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixHurdPthreadGetattrNp(thr.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixHurdPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcUnixHurdPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixHurdPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixHurdPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    libcUnixHurdPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixHurdPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    libcUnixHurdPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    libcUnixHurdPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcUnixHurdPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcUnixHurdPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    libcUnixHurdPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    libcUnixHurdPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadOnceRoutineCallback): CInt =
    libcUnixHurdPthreadOnce(control.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixHurdPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    libcUnixHurdPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    libcUnixHurdPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    libcUnixHurdPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    libcUnixHurdPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixHurdPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    libcUnixHurdPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixHurdPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixHurdPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixHurdPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixHurdPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixHurdPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    libcUnixHurdPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, newmask: ConstPtr<SigsetT>, oldmask: MutPtr<SigsetT>): CInt =
    libcUnixHurdPthreadSigmask(how, newmask.rawAddress.toCPointer<ByteVar>(), oldmask.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixHurdSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixHurdSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixHurdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixHurdSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcUnixHurdPthreadGetschedparam(native.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixHurdPthreadSetschedparam(native.toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixHurdPthreadGetcpuclockid(thread.toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcUnixHurdSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcUnixHurdSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixHurdSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcUnixHurdSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    libcUnixHurdClockGetres(clockId, res.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcUnixHurdClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcUnixHurdClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    libcUnixHurdClockGetcpuclockid(pid, clkId.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixHurdClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    libcUnixHurdGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcUnixHurdSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    libcUnixHurdStrftime(s.rawAddress.toCPointer<ByteVar>(), max, format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(libcUnixHurdStrptime(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), tm.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixHurdTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixHurdTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixHurdTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixHurdTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixHurdTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, buf: MutPtr<Stat>): CInt =
    libcUnixHurdFstat(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstat64(fd: CInt, buf: MutPtr<Stat64>): CInt =
    libcUnixHurdFstat64(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatat(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat>, flag: CInt): CInt =
    libcUnixHurdFstatat(fd, file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun fstatat64(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat64>, flag: CInt): CInt =
    libcUnixHurdFstatat64(fd, file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt =
    libcUnixHurdStatx(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, mask, statxbuf.rawAddress.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcUnixHurdFtruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    libcUnixHurdFtruncate64(fd, length)

public actual fun truncate64(file: ConstPtr<CChar>, length: Off64T): CInt =
    libcUnixHurdTruncate64(file.rawAddress.toCPointer<ByteVar>(), length)

public actual fun lstat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcUnixHurdLstat(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun lstat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixHurdLstat64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixHurdStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statfs64(file: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    libcUnixHurdStatfs64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixHurdFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs64(fildes: CInt, buf: MutPtr<Statfs64>): CInt =
    libcUnixHurdFstatfs64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs(file: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    libcUnixHurdStatvfs(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs64(file: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    libcUnixHurdStatvfs64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs(fildes: CInt, buf: MutPtr<Statvfs>): CInt =
    libcUnixHurdFstatvfs(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs64(fildes: CInt, buf: MutPtr<Statvfs64>): CInt =
    libcUnixHurdFstatvfs64(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun open(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpen(file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun open64(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpen64(file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpenat(fd, file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixHurdOpenat64(fd, file.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixHurdFopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcUnixHurdFreopen64(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixHurdCreat64(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcUnixHurdMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcUnixHurdMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcUnixHurdMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun tmpfile64(): MutPtr<FILE> =
    MutPtr(libcUnixHurdTmpfile64()?.toLong() ?: 0L)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixHurdPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    libcUnixHurdGetdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    libcUnixHurdCloseRange(first, last, flags)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    libcUnixHurdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    libcUnixHurdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun getpt(): CInt =
    libcUnixHurdGetpt()

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixHurdPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun loginTty(fd: CInt): CInt =
    libcUnixHurdLoginTty(fd)

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clearenv(): CInt =
    libcUnixHurdClearenv()

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    libcUnixHurdExecveat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixHurdExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixHurdFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcUnixHurdDaemon(nochdir, noclose)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixHurdPosixSpawn(pid.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    libcUnixHurdPosixSpawnp(pid.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>(), fileActions.rawAddress.toCPointer<ByteVar>(), attrp.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixHurdPosixSpawnattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    libcUnixHurdPosixSpawnattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixHurdPosixSpawnattrGetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixHurdPosixSpawnattrSetsigdefault(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    libcUnixHurdPosixSpawnattrGetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    libcUnixHurdPosixSpawnattrSetsigmask(attr.rawAddress.toCPointer<ByteVar>(), default.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    libcUnixHurdPosixSpawnattrGetflags(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    libcUnixHurdPosixSpawnattrSetflags(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    libcUnixHurdPosixSpawnattrGetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    libcUnixHurdPosixSpawnattrSetpgroup(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    libcUnixHurdPosixSpawnattrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    libcUnixHurdPosixSpawnattrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    libcUnixHurdPosixSpawnattrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    libcUnixHurdPosixSpawnattrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixHurdPosixSpawnFileActionsInit(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    libcUnixHurdPosixSpawnFileActionsDestroy(actions.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixHurdPosixSpawnFileActionsAddopen(actions.rawAddress.toCPointer<ByteVar>(), fd, path.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddclose(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAdddup2(actions.rawAddress.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixHurdPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    libcUnixHurdPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toCPointer<ByteVar>(), tcfd)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcUnixHurdShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixHurdShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixHurdEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixHurdEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcUnixHurdFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun stat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcUnixHurdStat(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun stat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    libcUnixHurdStat64(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcUnixHurdReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64> =
    MutPtr(libcUnixHurdReaddir64(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    libcUnixHurdReaddirR(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt =
    libcUnixHurdReaddir64R(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcUnixHurdSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcUnixHurdTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcUnixHurdDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixHurdStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(libcUnixHurdErrnoLocation()?.toLong() ?: 0L)

public actual fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid> =
    MutPtr(libcUnixHurdMmap64(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid> =
    MutPtr(libcUnixHurdMremap(addr.rawAddress.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixHurdMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
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

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixHurdMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcUnixHurdPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    libcUnixHurdGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    libcUnixHurdGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixHurdSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    libcUnixHurdSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    libcUnixHurdGetpriority(which, who)

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    libcUnixHurdSetpriority(which, who, prio)

public actual fun getrandom(buffer: MutPtr<CVoid>, length: SizeT, flags: CUint): SsizeT =
    libcUnixHurdGetrandom(buffer.rawAddress.toCPointer<ByteVar>(), length, flags)

public actual fun getentropy(buffer: MutPtr<CVoid>, length: SizeT): CInt =
    libcUnixHurdGetentropy(buffer.rawAddress.toCPointer<ByteVar>(), length)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixHurdMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixHurdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
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

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    libcUnixHurdErand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libcUnixHurdLrand48()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixHurdNrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libcUnixHurdMrand48()

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    libcUnixHurdJrand48(xseed.rawAddress.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libcUnixHurdSrand48(seed)
}

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(libcUnixHurdSeed48(xseed.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lcong48(p: MutPtr<CUshort>) {
    libcUnixHurdLcong48(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    libcUnixHurdQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    libcUnixHurdBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(libcUnixHurdSbrk(increment)?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixHurdMemalign(align, size)?.toLong() ?: 0L)

public actual fun mallopt(param: CInt, value: CInt): CInt =
    libcUnixHurdMallopt(param, value)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    libcUnixHurdMallocInfo(options, stream.rawAddress.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    libcUnixHurdMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun mallocTrim(pad: SizeT): CInt =
    libcUnixHurdMallocTrim(pad)

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(libcUnixHurdIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    libcUnixHurdIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixHurdIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt =
    libcUnixHurdGetoptLong(argc, argv.rawAddress.toCPointer<ByteVar>(), optstring.rawAddress.toCPointer<ByteVar>(), longopts.rawAddress.toCPointer<ByteVar>(), longindex.rawAddress.toCPointer<ByteVar>())

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    libcUnixHurdBacktrace(buf.rawAddress.toCPointer<ByteVar>(), sz)

public actual fun reboot(howTo: CInt): CInt =
    libcUnixHurdReboot(howTo)

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    libcUnixHurdGetloadavg(loadavg.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    libcUnixHurdRegexec(preg.rawAddress.toCPointer<ByteVar>(), input.rawAddress.toCPointer<ByteVar>(), nmatch, pmatch.rawAddress.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    libcUnixHurdRegerror(errcode, preg.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: MutPtr<RegexT>) {
    libcUnixHurdRegfree(preg.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    libcUnixHurdGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr<GlobT>) {
    libcUnixHurdGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    libcUnixHurdGlob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    libcUnixHurdGlobfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixHurdGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixHurdLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixHurdFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixHurdSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixHurdLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixHurdFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixHurdListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixHurdLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixHurdFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixHurdRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixHurdLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt =
    libcUnixHurdFremovexattr(filedes, name.rawAddress.toCPointer<ByteVar>())

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdPosixBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixHurdGnuBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixHurdDlmopen(lmid, filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    libcUnixHurdDlinfo(handle.rawAddress.toCPointer<ByteVar>(), request, info.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    libcUnixHurdDladdr1(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), extraInfo.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixHurdDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixHurdFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixHurdNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcUnixHurdUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcUnixHurdNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(libcUnixHurdNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixHurdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    ConstPtr(libcUnixHurdGnuGetLibcRelease()?.toLong() ?: 0L)

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    ConstPtr(libcUnixHurdGnuGetLibcVersion()?.toLong() ?: 0L)
