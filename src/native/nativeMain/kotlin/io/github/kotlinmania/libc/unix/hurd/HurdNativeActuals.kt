@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_abs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_accept4
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_acct
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_addmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioCancel
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioError
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioFsync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioRead
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioReturn
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioSuspend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_aioWrite
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_asctimeR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_backtrace
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_bind
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_brk
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clearenv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clockGetcpuclockid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clockGetres
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clockGettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clockNanosleep
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_clockSettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_closeRange
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_creat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ctermid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ctimeR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_daemon
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dirfd
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dirname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dlIteratePhdr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dladdr1
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dlinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dlmopen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_drand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_dup3
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_duplocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_eaccess
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_endgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_endmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_endpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_endspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_endutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_erand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_errnoLocation
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_euidaccess
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_execveat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_execvpe
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_faccessat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fallocate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fdatasync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fexecve
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fgetgrentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fgetpos64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fgetpwentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fgetspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fgetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_flistxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fopen64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_forkpty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_freadUnlocked
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_freeifaddrs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_freelocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fremovexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_freopen64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fseeko64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fsetpos64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fsetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatvfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_fstatvfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ftello64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ftruncate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ftruncate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_futimens
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_futimes
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getdomainname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getdtablesize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getentropy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrgidR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrnam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getgrouplist
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_gethostid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getifaddrs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getloadavg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getmntentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getnameinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getoptLong
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpriority
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpwentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpwnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getpwuidR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getrandom
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getresgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getresuid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getrlimit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getrlimit64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getspnam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getspnamR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_gettimeofday
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getutxid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getutxline
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_getxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_glob
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_glob64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_globfree
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_globfree64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_gnuBasename
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_gnuGetLibcRelease
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_gnuGetLibcVersion
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_hasmntopt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_iconv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_iconvClose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_iconvOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ifFreenameindex
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ifNameindex
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_initgroups
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ioctl
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_jrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_labs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lcong48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lgetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_libcCurrentSigrtmax
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_libcCurrentSigrtmin
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lioListio
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_listxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_llistxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_loginTty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lremovexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lseek
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lseek64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lsetxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lstat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lstat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_lutimes
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_madvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mallocInfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mallocTrim
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mallocUsableSize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mallopt
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_memalign
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_memmem
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_memrchr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mkfifoat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mknodat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mkostemp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mkostemps
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mkstemps
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mmap64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mprotect
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqClose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqGetattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqReceive
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqSend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqSetattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqTimedreceive
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqTimedsend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mqUnlink
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_mremap
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_msync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_newlocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_nlLanginfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_nlLanginfoL
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_nrand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_open
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_open64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_openat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_openat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_openpty
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pipe2
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_popen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixBasename
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixFadvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixFadvise64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixFallocate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixFallocate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixMadvise
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawn
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddclose
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddclosefromNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAdddup2
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddopen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnFileActionsInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetflags
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetpgroup
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetschedpolicy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetsigdefault
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrGetsigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetflags
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetpgroup
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetschedpolicy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetsigdefault
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnattrSetsigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_posixSpawnp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ppoll
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pread64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_preadv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_preadv64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadAtfork
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadAttrGetstack
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierWait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierattrDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierattrInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCancel
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCondattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCondattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadCreate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadEqual
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadGetattrNp
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadGetcpuclockid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadGetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadKill
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadMutexTimedlock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadMutexattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadMutexattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadOnce
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSetschedparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSigmask
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSpinDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSpinInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSpinLock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSpinTrylock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pthreadSpinUnlock
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_ptsnameR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_putgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_putpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pututxline
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pwrite64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pwritev
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_pwritev64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_qsortR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_rand
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_readdir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_readdir64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_readdir64R
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_readdirR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_readv
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_reboot
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_recvfrom
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_recvmsg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_regerror
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_regexec
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_regfree
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_removexattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sbrk
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_schedGetparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_schedGetscheduler
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_schedSetparam
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_schedSetscheduler
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_seed48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_seekdir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_semDestroy
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_semGetvalue
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_semInit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_semTimedwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sendfile
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sendfile64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sendmsg
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setdomainname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setgrent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setgroups
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sethostid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sethostname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setmntent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setpriority
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setpwent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setresgid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setresuid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setrlimit
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setrlimit64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setspent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_settimeofday
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setutxent
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_setxattr
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sgetspentR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_shmOpen
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_shmUnlink
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_shutdown
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sigaltstack
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sigsuspend
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sigtimedwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sigwait
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sigwaitinfo
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_srand
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_srand48
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_stat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_stat64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_statfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_statfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_statvfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_statvfs64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_statx
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_strchrnul
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_strerrorR
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_strftime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_strptime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_sync
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_syncfs
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_telldir
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_timerCreate
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_timerDelete
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_timerGetoverrun
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_timerGettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_timerSettime
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_tmpfile64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_truncate64
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_uname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_uselocale
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_utimensat
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_utmpname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_utmpxname
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_wait4
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_waitid
import io.github.kotlinmania.libc.unix.hurd.cinterop.libc_unix_hurd_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    libc_unix_hurd_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_hurd_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_hurd_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_unix_hurd_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    libc_unix_hurd_mkfifoat(fd, path, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_unix_hurd_mknodat(dirfd, pathname, mode, dev)

public actual fun libcCurrentSigrtmin(): CInt =
    libc_unix_hurd_libcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    libc_unix_hurd_libcCurrentSigrtmax()

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    libc_unix_hurd_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_unix_hurd_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_unix_hurd_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_unix_hurd_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_unix_hurd_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_unix_hurd_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    libc_unix_hurd_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    libc_unix_hurd_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    libc_unix_hurd_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libc_unix_hurd_dup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    libc_unix_hurd_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    libc_unix_hurd_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun readv(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    libc_unix_hurd_readv(fd, iovec?.value?.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    libc_unix_hurd_writev(fd, iovec?.value?.toCPointer<ByteVar>(), count)

public actual fun preadv(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    libc_unix_hurd_preadv(fd, iovec?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    libc_unix_hurd_pwritev(fd, iovec?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    libc_unix_hurd_preadv64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    libc_unix_hurd_pwritev64(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_unix_hurd_freadUnlocked(buf?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    libc_unix_hurd_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    libc_unix_hurd_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_hurd_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    libc_unix_hurd_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    libc_unix_hurd_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    libc_unix_hurd_aioSuspend(aiocbList?.value?.toCPointer<ByteVar>(), nitems, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    libc_unix_hurd_aioCancel(fd, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    libc_unix_hurd_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nitems, sevp?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libc_unix_hurd_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libc_unix_hurd_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    libc_unix_hurd_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    libc_unix_hurd_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    libc_unix_hurd_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    libc_unix_hurd_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    libc_unix_hurd_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    libc_unix_hurd_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    libc_unix_hurd_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    libc_unix_hurd_lseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc_unix_hurd_lseek(fd, offset, whence)

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_unix_hurd_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    libc_unix_hurd_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_unix_hurd_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    libc_unix_hurd_ftello64(stream?.handle?.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    libc_unix_hurd_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    libc_unix_hurd_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_unix_hurd_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_hurd_recvmsg(fd, message?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    libc_unix_hurd_sendmsg(fd, message?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_unix_hurd_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    libc_unix_hurd_sendfile(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    libc_unix_hurd_sendfile64(outFd, inFd, offset?.value?.toCPointer<ByteVar>(), count)

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    libc_unix_hurd_shutdown(fd, how)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_unix_hurd_sethostname(name, len)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    libc_unix_hurd_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    libc_unix_hurd_setdomainname(name, len)

public actual fun ifNameindex(): COpaquePointer? =
    libc_unix_hurd_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    libc_unix_hurd_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_unix_hurd_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc_unix_hurd_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    libc_unix_hurd_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_unix_hurd_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun gethostid(): CLong =
    libc_unix_hurd_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    libc_unix_hurd_sethostid(hostid)

public actual fun setpwent() {
    libc_unix_hurd_setpwent()
}

public actual fun endpwent() {
    libc_unix_hurd_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    libc_unix_hurd_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_unix_hurd_setgrent()
}

public actual fun endgrent() {
    libc_unix_hurd_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_unix_hurd_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun setspent() {
    libc_unix_hurd_setspent()
}

public actual fun endspent() {
    libc_unix_hurd_endspent()
}

public actual fun getspent(): COpaquePointer? =
    libc_unix_hurd_getspent()?.let { COpaquePointer(it.toLong()) }

public actual fun getspnam(name: String?): COpaquePointer? =
    libc_unix_hurd_getspnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getpwentR(pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getgrentR(grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_fgetpwentR(stream?.handle?.toCPointer<ByteVar>(), pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_fgetgrentR(stream?.handle?.toCPointer<ByteVar>(), grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    libc_unix_hurd_putpwent(p?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    libc_unix_hurd_putgrent(grp?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    libc_unix_hurd_fgetspentR(fp?.handle?.toCPointer<ByteVar>(), spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    libc_unix_hurd_sgetspentR(s, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    libc_unix_hurd_getspentR(spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    libc_unix_hurd_getspnamR(name, spbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, spbufp?.value?.toCPointer<ByteVar>())

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    libc_unix_hurd_getmntentR(stream?.handle?.toCPointer<ByteVar>(), mntbuf?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen)?.let { COpaquePointer(it.toLong()) }

public actual fun utmpname(file: String?): CInt =
    libc_unix_hurd_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    libc_unix_hurd_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    libc_unix_hurd_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setutxent() {
    libc_unix_hurd_setutxent()
}

public actual fun endutxent() {
    libc_unix_hurd_endutxent()
}

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    libc_unix_hurd_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    libc_unix_hurd_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libc_unix_hurd_setresuid(ruid, euid, suid)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libc_unix_hurd_setresgid(rgid, egid, sgid)

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc_unix_hurd_initgroups(user, group)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_unix_hurd_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_unix_hurd_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_unix_hurd_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_unix_hurd_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    libc_unix_hurd_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    libc_unix_hurd_acct(filename)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    libc_unix_hurd_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    libc_unix_hurd_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    libc_unix_hurd_addmntent(stream?.handle?.toCPointer<ByteVar>(), mnt?.value?.toCPointer<ByteVar>())

public actual fun endmntent(streamp: FILE?): CInt =
    libc_unix_hurd_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    libc_unix_hurd_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    libc_unix_hurd_pthreadKill(threadid.toCPointer<ByteVar>(), signo)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc_unix_hurd_pthreadCancel(thread.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libc_unix_hurd_pthreadEqual(t1.toCPointer<ByteVar>(), t2.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(thr: PthreadT, attr: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadGetattrNp(thr.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    libc_unix_hurd_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_hurd_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    libc_unix_hurd_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_hurd_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_hurd_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadOnceRoutineCallback): CInt =
    libc_unix_hurd_pthreadOnce(control?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    libc_unix_hurd_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    libc_unix_hurd_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_unix_hurd_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    libc_unix_hurd_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadSigmask(how: CInt, newmask: COpaquePointer?, oldmask: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSigmask(how, newmask?.value?.toCPointer<ByteVar>(), oldmask?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_hurd_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_unix_hurd_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc_unix_hurd_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_hurd_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadGetschedparam(native.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadSetschedparam(native.toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    libc_unix_hurd_pthreadGetcpuclockid(thread.toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_unix_hurd_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_unix_hurd_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_unix_hurd_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_unix_hurd_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    libc_unix_hurd_clockGetres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_hurd_clockGettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_unix_hurd_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    libc_unix_hurd_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_unix_hurd_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_hurd_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_unix_hurd_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_asctimeR(tm?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_ctimeR(timep?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    libc_unix_hurd_strftime(s?.value?.toCPointer<ByteVar>(), max, format, tm?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    libc_unix_hurd_timerCreate(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libc_unix_hurd_timerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libc_unix_hurd_timerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    libc_unix_hurd_timerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_unix_hurd_timerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstat(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstat64(fd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstat64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatat(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    libc_unix_hurd_fstatat(fd, file, buf?.value?.toCPointer<ByteVar>(), flag)

public actual fun fstatat64(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    libc_unix_hurd_fstatat64(fd, file, buf?.value?.toCPointer<ByteVar>(), flag)

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    libc_unix_hurd_statx(dirfd, pathname, flags, mask, statxbuf?.value?.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc_unix_hurd_ftruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    libc_unix_hurd_ftruncate64(fd, length)

public actual fun truncate64(file: String?, length: Off64T): CInt =
    libc_unix_hurd_truncate64(file, length)

public actual fun lstat(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_lstat(file, buf?.value?.toCPointer<ByteVar>())

public actual fun lstat64(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_lstat64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_statfs64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstatfs64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_statvfs(file, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_statvfs64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstatvfs(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_unix_hurd_fstatvfs64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun open(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_hurd_open(file, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun open64(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_hurd_open64(file, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_hurd_openat(fd, file, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun openat64(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_unix_hurd_openat64(fd, file, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    libc_unix_hurd_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    libc_unix_hurd_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun creat64(path: String?, mode: ModeT): CInt =
    libc_unix_hurd_creat64(path, mode)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    libc_unix_hurd_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    libc_unix_hurd_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_unix_hurd_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun tmpfile64(): FILE? =
    libc_unix_hurd_tmpfile64()?.let { FILE(it.toLong()) }

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_unix_hurd_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun getdtablesize(): CInt =
    libc_unix_hurd_getdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    libc_unix_hurd_closeRange(first, last, flags)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    libc_unix_hurd_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    libc_unix_hurd_forkpty(amaster?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun getpt(): CInt =
    libc_unix_hurd_getpt()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_hurd_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun loginTty(fd: CInt): CInt =
    libc_unix_hurd_loginTty(fd)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun clearenv(): CInt =
    libc_unix_hurd_clearenv()

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    libc_unix_hurd_execveat(dirfd, pathname, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_hurd_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_hurd_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_unix_hurd_daemon(nochdir, noclose)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    libc_unix_hurd_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    libc_unix_hurd_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    libc_unix_hurd_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    libc_unix_hurd_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    libc_unix_hurd_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddchdirNp(actions?.value?.toCPointer<ByteVar>(), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddfchdirNp(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddclosefromNp(actions?.value?.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp(actions?.value?.toCPointer<ByteVar>(), tcfd)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_unix_hurd_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    libc_unix_hurd_shmUnlink(name)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    libc_unix_hurd_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    libc_unix_hurd_eaccess(pathname, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_unix_hurd_faccessat(dirfd, pathname, mode, flags)

public actual fun stat(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_stat(file, buf?.value?.toCPointer<ByteVar>())

public actual fun stat64(file: String?, buf: COpaquePointer?): CInt =
    libc_unix_hurd_stat64(file, buf?.value?.toCPointer<ByteVar>())

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    libc_unix_hurd_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    libc_unix_hurd_readdir64(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    libc_unix_hurd_readdirR(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    libc_unix_hurd_readdir64R(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_unix_hurd_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_unix_hurd_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    libc_unix_hurd_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_hurd_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun errnoLocation(): COpaquePointer? =
    libc_unix_hurd_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    libc_unix_hurd_mmap64(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_unix_hurd_mremap(addr?.value?.toCPointer<ByteVar>(), len, newLen, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_unix_hurd_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_unix_hurd_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sync() {
    libc_unix_hurd_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    libc_unix_hurd_syncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libc_unix_hurd_fdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    libc_unix_hurd_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_unix_hurd_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    libc_unix_hurd_posixFallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libc_unix_hurd_posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    libc_unix_hurd_posixFadvise64(fd, offset, len, advise)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_hurd_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_unix_hurd_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    libc_unix_hurd_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    libc_unix_hurd_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    libc_unix_hurd_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    libc_unix_hurd_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    libc_unix_hurd_getpriority(which, who)

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    libc_unix_hurd_setpriority(which, who, prio)

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    libc_unix_hurd_getrandom(buffer?.value?.toCPointer<ByteVar>(), length, flags)

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    libc_unix_hurd_getentropy(buffer?.value?.toCPointer<ByteVar>(), length)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_unix_hurd_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    libc_unix_hurd_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    libc_unix_hurd_strchrnul(s, c)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    libc_unix_hurd_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_unix_hurd_labs(i)

public actual fun rand(): CInt =
    libc_unix_hurd_rand()

public actual fun srand(seed: CUint) {
    libc_unix_hurd_srand(seed)
}

public actual fun drand48(): CDouble =
    libc_unix_hurd_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    libc_unix_hurd_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    libc_unix_hurd_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    libc_unix_hurd_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun mrand48(): CLong =
    libc_unix_hurd_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    libc_unix_hurd_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun srand48(seed: CLong) {
    libc_unix_hurd_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lcong48(p: COpaquePointer?) {
    libc_unix_hurd_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    libc_unix_hurd_qsortR(base?.value?.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun brk(addr: COpaquePointer?): CInt =
    libc_unix_hurd_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    libc_unix_hurd_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_unix_hurd_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun mallopt(param: CInt, value: CInt): CInt =
    libc_unix_hurd_mallopt(param, value)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    libc_unix_hurd_mallocInfo(options, stream?.handle?.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    libc_unix_hurd_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun mallocTrim(pad: SizeT): CInt =
    libc_unix_hurd_mallocTrim(pad)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    libc_unix_hurd_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    libc_unix_hurd_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libc_unix_hurd_iconvClose(cd?.value?.toCPointer<ByteVar>())

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    libc_unix_hurd_getoptLong(argc, argv?.value?.toCPointer<ByteVar>(), optstring, longopts?.value?.toCPointer<ByteVar>(), longindex?.value?.toCPointer<ByteVar>())

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    libc_unix_hurd_backtrace(buf?.value?.toCPointer<ByteVar>(), sz)

public actual fun reboot(howTo: CInt): CInt =
    libc_unix_hurd_reboot(howTo)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    libc_unix_hurd_getloadavg(loadavg?.value?.toCPointer<ByteVar>(), nelem)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    libc_unix_hurd_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    libc_unix_hurd_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regfree(preg: COpaquePointer?) {
    libc_unix_hurd_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_hurd_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_unix_hurd_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_unix_hurd_glob64(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree64(pglob: COpaquePointer?) {
    libc_unix_hurd_globfree64(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_getxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_lgetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_fgetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_hurd_setxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_hurd_lsetxattr(path, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    libc_unix_hurd_fsetxattr(filedes, name, value?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_listxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_llistxattr(path, list?.value?.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    libc_unix_hurd_flistxattr(filedes, list?.value?.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: String?, name: String?): CInt =
    libc_unix_hurd_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    libc_unix_hurd_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    libc_unix_hurd_fremovexattr(filedes, name)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    libc_unix_hurd_posixBasename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    libc_unix_hurd_gnuBasename(path)?.let { COpaquePointer(it.toLong()) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    libc_unix_hurd_dlmopen(lmid, filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    libc_unix_hurd_dlinfo(handle?.value?.toCPointer<ByteVar>(), request, info?.value?.toCPointer<ByteVar>())

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    libc_unix_hurd_dladdr1(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), extraInfo?.value?.toCPointer<ByteVar>(), flags)

public actual fun duplocale(base: LocaleT): LocaleT =
    libc_unix_hurd_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    libc_unix_hurd_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc_unix_hurd_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    libc_unix_hurd_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_unix_hurd_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    libc_unix_hurd_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    libc_unix_hurd_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    libc_unix_hurd_gnuGetLibcRelease()?.let { COpaquePointer(it.toLong()) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    libc_unix_hurd_gnuGetLibcVersion()?.let { COpaquePointer(it.toLong()) }
