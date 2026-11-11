@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_abort
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_accept
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_access
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_alarm
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_alignedAlloc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_atexit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_atof
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_atoi
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_atol
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_atoll
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_bind
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_calloc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_cfgetospeed
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_cfmakeraw
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_cfsetispeed
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_cfsetospeed
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_chdir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_chmod
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_chown
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_clockGetres
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_clockGettime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_clockNanosleep
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_clockSettime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_close
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_closedir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_closelog
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_confstr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_connect
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_creat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_difftime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dladdr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dlclose
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dlerror
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dlopen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dlsym
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dup
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_dup2
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_errnoGet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_errnoSet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_exit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fchdir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fchmod
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fchmodat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fchown
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fchownat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fclose
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fcntl
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fdopen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_feof
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ferror
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fflush
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fgetc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fgetpos
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fgets
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fileno
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fnmatch
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fopen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fpathconf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fputc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fputs
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fread
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_free
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_freeaddrinfo
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_freopen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fscanf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fseek
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fseeko
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fsetpos
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fstat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fsync
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ftell
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ftello
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ftruncate
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_futimens
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_fwrite
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_gaiStrerror
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getaddrinfo
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getchar
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getcharUnlocked
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getcwd
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getegid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getenv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_geteuid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getgid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getgroups
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_gethostname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getline
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getlogin
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getopt
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getpeername
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getpid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getppid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getprotobyname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getprotobynumber
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getservbyname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getsockname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getsockopt
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_gettimeofday
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_getuid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_gmtime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_gmtimeR
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ioctl
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isalnum
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isalpha
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isatty
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isblank
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_iscntrl
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isdigit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isgraph
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_islower
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isprint
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ispunct
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isspace
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isupper
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_isxdigit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_kill
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_link
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_linkat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_listen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_localeconv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_localtime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_localtimeR
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_lseek
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_lstat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_malloc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memalign
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memccpy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memchr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memcmp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memcpy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memmove
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_memset
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mkdir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mkdtemp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mkfifo
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mkstemp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mktime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mlockall
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mmap
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mprotect
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqClose
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqGetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqOpen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqReceive
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqSend
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqSetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqTimedreceive
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqTimedsend
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_mqUnlink
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_msync
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_munlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_munlockall
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_munmap
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_nanosleep
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_open
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_opendir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_openlog
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pathIsAbsolute
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pathconf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pause
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pclose
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_perror
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pipe
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_poll
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_printf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAtfork
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrGetname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrGetstacksize
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrSetdetachstate
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrSetinheritsched
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrSetname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrSetschedpolicy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadAttrSetstacksize
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondBroadcast
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondSignal
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondTimedwait
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondWait
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondattrGetclock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCondattrSetclock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadCreate
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadDetach
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadEqual
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadExit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadGetschedparam
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadGetspecific
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadJoin
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadKeyCreate
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadKeyDelete
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexLock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexTimedlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexTrylock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexUnlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadMutexattrSettype
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockRdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockTimedrdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockTimedwrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockTryrdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockTrywrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockUnlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockWrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadRwlockattrSetmaxreaders
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadSelf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadSetschedparam
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadSetspecific
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_pthreadSigmask
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_putchar
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_putcharUnlocked
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_putenv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_puts
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_raise
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_randABytes
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_randBytes
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_randSecure
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_randUBytes
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_read
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_readdir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_readdirR
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_readlink
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_readv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_realloc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_realpath
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_recv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_recvfrom
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_recvmsg
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_remove
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rename
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rewind
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rewinddir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rmdir
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rtpInfoGet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_rtpSpawn
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_scanf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedGetPriorityMax
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedGetPriorityMin
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedGetparam
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedGetscheduler
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedRrGetInterval
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedSetparam
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedSetscheduler
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_schedYield
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_send
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sendmsg
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sendto
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setbuf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setegid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setenv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_seteuid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setgid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setlocale
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setlogmask
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setpgid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setsockopt
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setuid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_setvbuf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_shmOpen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_shmUnlink
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_shutdown
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigaction
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigaddset
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigdelset
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigemptyset
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigfillset
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigismember
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_signal
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigpending
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sigprocmask
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sleep
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_snprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_socket
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sscanf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_stat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcasecmp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strchr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcmp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcoll
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcpy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strcspn
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strdup
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strerror
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strerrorR
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strlen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strncasecmp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strncat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strncmp
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strncpy
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strnlen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strpbrk
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strrchr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strspn
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strstr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtod
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtof
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtok
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtol
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtoll
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtoul
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strtoull
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_strxfrm
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_symlink
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_symlinkat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_sysconf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_syslog
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_system
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_taskDelay
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_taskIdSelf
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_taskKill
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_taskNameGet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_taskNameSet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tcflush
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tcgetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tcsendbreak
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tcsetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_time
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_timegm
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_times
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tmpfile
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tmpnam
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_tolower
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_toupper
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_truncate
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ttyname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_umask
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_uname
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_ungetc
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_unlink
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_unlinkat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_unsetenv
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_usleep
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_utime
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_utimensat
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_utimes
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_vxCpuConfiguredGet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_vxCpuEnabledGet
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_wait
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_waitpid
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_wcslen
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_wcstombs
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_wmemchr
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_write
import io.github.kotlinmania.libc.vxworks.cinterop.libc_vxworks_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    libc_vxworks_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_vxworks_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_vxworks_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_vxworks_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_vxworks_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_vxworks_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_vxworks_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_vxworks_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_vxworks_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_vxworks_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_vxworks_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libc_vxworks_isblank(c)

public actual fun tolower(c: CInt): CInt =
    libc_vxworks_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_vxworks_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    libc_vxworks_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    libc_vxworks_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    libc_vxworks_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    libc_vxworks_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    libc_vxworks_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    libc_vxworks_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    libc_vxworks_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    libc_vxworks_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    libc_vxworks_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libc_vxworks_getchar()

public actual fun putchar(c: CInt): CInt =
    libc_vxworks_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    libc_vxworks_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    libc_vxworks_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc_vxworks_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc_vxworks_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    libc_vxworks_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc_vxworks_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_vxworks_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_vxworks_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc_vxworks_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    libc_vxworks_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    libc_vxworks_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_vxworks_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_vxworks_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    libc_vxworks_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    libc_vxworks_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    libc_vxworks_perror(s)
}

public actual fun atof(s: String?): CDouble =
    libc_vxworks_atof(s)

public actual fun atoi(s: String?): CInt =
    libc_vxworks_atoi(s)

public actual fun atol(s: String?): CLong =
    libc_vxworks_atol(s)

public actual fun atoll(s: String?): CLonglong =
    libc_vxworks_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    libc_vxworks_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    libc_vxworks_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc_vxworks_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    libc_vxworks_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    libc_vxworks_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    libc_vxworks_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    libc_vxworks_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_vxworks_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_vxworks_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    libc_vxworks_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libc_vxworks_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libc_vxworks_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libc_vxworks_atexit(0L.toCPointer<ByteVar>())

public actual fun system(s: String?): CInt =
    libc_vxworks_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    libc_vxworks_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    libc_vxworks_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    libc_vxworks_cfmakeraw(termios?.value?.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    libc_vxworks_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    libc_vxworks_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    libc_vxworks_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_vxworks_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    libc_vxworks_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    libc_vxworks_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc_vxworks_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    libc_vxworks_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc_vxworks_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    libc_vxworks_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    libc_vxworks_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    libc_vxworks_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    libc_vxworks_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    libc_vxworks_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    libc_vxworks_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    libc_vxworks_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    libc_vxworks_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    libc_vxworks_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    libc_vxworks_strlen(cs)

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    libc_vxworks_strnlen(cs, n)

public actual fun strerror(n: CInt): COpaquePointer? =
    libc_vxworks_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    libc_vxworks_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    libc_vxworks_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    libc_vxworks_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    libc_vxworks_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_vxworks_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    libc_vxworks_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    libc_vxworks_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_vxworks_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_vxworks_memccpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_vxworks_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_vxworks_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    libc_vxworks_alignedAlloc(alignment, size)?.let { COpaquePointer(it.toLong()) }

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_vxworks_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun times(buf: COpaquePointer?): ClockT =
    libc_vxworks_times(buf?.value?.toCPointer<ByteVar>())

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libc_vxworks_tcflush(fd, action)

public actual fun pclose(stream: FILE?): CInt =
    libc_vxworks_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    libc_vxworks_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc_vxworks_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    libc_vxworks_unlinkat(dirfd, pathname, flags)

public actual fun getprotobyname(name: String?): COpaquePointer? =
    libc_vxworks_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    libc_vxworks_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    libc_vxworks_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    libc_vxworks_fchownat(dirfd, pathname, owner, group, flags)

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_fprintf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_printf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_snprintf(s?.value?.toCPointer<ByteVar>(), n, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_sprintf(s?.value?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_fscanf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_scanf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    libc_vxworks_sscanf(s, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libc_vxworks_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libc_vxworks_putcharUnlocked(c)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    libc_vxworks_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    libc_vxworks_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    libc_vxworks_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: ModeT): CInt =
    libc_vxworks_creat(path, mode)

public actual fun rewinddir(dirp: DIR?) {
    libc_vxworks_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libc_vxworks_fchown(fd, owner, group)

public actual fun access(path: String?, amode: CInt): CInt =
    libc_vxworks_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    libc_vxworks_alarm(seconds)

public actual fun fchdir(dirfd: CInt): CInt =
    libc_vxworks_fchdir(dirfd)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    libc_vxworks_chown(path, uid, gid)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc_vxworks_fpathconf(filedes, name)

public actual fun getegid(): GidT =
    libc_vxworks_getegid()

public actual fun geteuid(): UidT =
    libc_vxworks_geteuid()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    libc_vxworks_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    libc_vxworks_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    libc_vxworks_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun pathconf(path: String?, name: CInt): CLong =
    libc_vxworks_pathconf(path, name)

public actual fun pause(): CInt =
    libc_vxworks_pause()

public actual fun seteuid(uid: UidT): CInt =
    libc_vxworks_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libc_vxworks_setegid(gid)

public actual fun sleep(secs: CUint): CUint =
    libc_vxworks_sleep(secs)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    libc_vxworks_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun wait(status: COpaquePointer?): PidT =
    libc_vxworks_wait(status?.value?.toCPointer<ByteVar>())

public actual fun umask(mask: ModeT): ModeT =
    libc_vxworks_umask(mask)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    libc_vxworks_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libc_vxworks_mlockall(flags)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    libc_vxworks_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlockall(): CInt =
    libc_vxworks_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    libc_vxworks_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    libc_vxworks_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_vxworks_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_vxworks_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun truncate(path: String?, length: OffT): CInt =
    libc_vxworks_truncate(path, length)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_vxworks_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    libc_vxworks_shmUnlink(name)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_vxworks_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    libc_vxworks_pthreadExit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    libc_vxworks_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libc_vxworks_pthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_vxworks_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    libc_vxworks_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    libc_vxworks_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    libc_vxworks_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_vxworks_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_vxworks_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    libc_vxworks_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    libc_vxworks_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    libc_vxworks_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc_vxworks_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_vxworks_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_vxworks_gmtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_vxworks_localtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    libc_vxworks_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: COpaquePointer?): TimeT =
    libc_vxworks_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    libc_vxworks_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    libc_vxworks_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun timegm(tm: COpaquePointer?): TimeT =
    libc_vxworks_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libc_vxworks_difftime(time1, time0)

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    libc_vxworks_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun usleep(secs: UsecondsT): CInt =
    libc_vxworks_usleep(secs)

public actual fun putenv(string: COpaquePointer?): CInt =
    libc_vxworks_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    libc_vxworks_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): COpaquePointer? =
    libc_vxworks_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_vxworks_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: COpaquePointer?): CInt =
    libc_vxworks_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    libc_vxworks_mkfifo(path, mode)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc_vxworks_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    libc_vxworks_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun mkstemp(template: COpaquePointer?): CInt =
    libc_vxworks_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    libc_vxworks_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    libc_vxworks_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    libc_vxworks_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libc_vxworks_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    libc_vxworks_syslog(priority, message, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    libc_vxworks_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    libc_vxworks_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    libc_vxworks_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libc_vxworks_tcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    libc_vxworks_confstr(name, buf?.value?.toCPointer<ByteVar>(), len)

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    libc_vxworks_fnmatch(pattern, name, flags)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    libc_vxworks_symlinkat(target, newdirfd, linkpath)

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    libc_vxworks_fchmodat(dirfd, pathname, mode, flags)

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    libc_vxworks_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    libc_vxworks_memalign(blockSize, sizeArg)?.let { COpaquePointer(it.toLong()) }

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_vxworks_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun chdir(attr: String?): CInt =
    libc_vxworks_chdir(attr)

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt =
    libc_vxworks_pthreadMutexattrSettype(pAttr?.value?.toCPointer<ByteVar>(), pType)

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexInit(mutex?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexDestroy(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexLock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexTrylock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexTimedlock(attr?.value?.toCPointer<ByteVar>(), spec?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    libc_vxworks_pthreadMutexUnlock(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt =
    libc_vxworks_pthreadAttrSetname(pAttr?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    libc_vxworks_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    libc_vxworks_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    libc_vxworks_pthreadCreate(pThread?.value?.toCPointer<ByteVar>(), pAttr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_vxworks_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_vxworks_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    libc_vxworks_pthreadAttrSetinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    libc_vxworks_pthreadAttrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrDestroy(thread: COpaquePointer?): CInt =
    libc_vxworks_pthreadAttrDestroy(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libc_vxworks_pthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    libc_vxworks_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_vxworks_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    libc_vxworks_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc_vxworks_ftruncate(fd, length)

public actual fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    libc_vxworks_readdirR(pDir?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun readdir(pDir: DIR?): COpaquePointer? =
    libc_vxworks_readdir(pDir?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_vxworks_open(path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    libc_vxworks_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondattrGetclock(pAttr?.value?.toCPointer<ByteVar>(), pClockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_vxworks_pthreadCondattrSetclock(pAttr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt =
    libc_vxworks_pthreadRwlockattrSetmaxreaders(attr?.value?.toCPointer<ByteVar>(), attr2)

public actual fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockInit(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockRdlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockTryrdlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockTimedrdlock(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockWrlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockTrywrlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockTimedwrlock(attr?.value?.toCPointer<ByteVar>(), host?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt =
    libc_vxworks_pthreadRwlockUnlock(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libc_vxworks_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libc_vxworks_pthreadKeyDelete(key)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc_vxworks_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    libc_vxworks_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_vxworks_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt =
    libc_vxworks_pthreadAttrGetname(attr?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    libc_vxworks_pthreadJoin(thread.toLong().toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libc_vxworks_pthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_vxworks_clockGettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    libc_vxworks_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    libc_vxworks_clockGetres(clockId, res?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_vxworks_clockNanosleep(clockId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_vxworks_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    libc_vxworks_accept(s, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    libc_vxworks_bind(fd, addr?.value?.toCPointer<ByteVar>(), len)

public actual fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt =
    libc_vxworks_connect(s, name?.value?.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt =
    libc_vxworks_getpeername(s, name?.value?.toCPointer<ByteVar>(), namelen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    libc_vxworks_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    libc_vxworks_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libc_vxworks_listen(socket, backlog)

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    libc_vxworks_recv(s, buf?.value?.toCPointer<ByteVar>(), bufLen, flags)

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT =
    libc_vxworks_recvfrom(s, buf?.value?.toCPointer<ByteVar>(), bufLen, flags, from?.value?.toCPointer<ByteVar>(), pFromLen?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    libc_vxworks_recvmsg(socket, mp?.value?.toCPointer<ByteVar>(), flags)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    libc_vxworks_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    libc_vxworks_sendmsg(socket, mp?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    libc_vxworks_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    libc_vxworks_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun shutdown(s: CInt, how: CInt): CInt =
    libc_vxworks_shutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc_vxworks_socket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libc_vxworks_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_vxworks_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    libc_vxworks_gaiStrerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun close(fd: CInt): CInt =
    libc_vxworks_close(fd)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_vxworks_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_vxworks_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun isatty(fd: CInt): CInt =
    libc_vxworks_isatty(fd)

public actual fun dup(src: CInt): CInt =
    libc_vxworks_dup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libc_vxworks_dup2(src, dst)

public actual fun pipe(fds: COpaquePointer?): CInt =
    libc_vxworks_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun unlink(pathname: String?): CInt =
    libc_vxworks_unlink(pathname)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc_vxworks_lseek(fd, offset, whence)

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    libc_vxworks_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: COpaquePointer?) {
    libc_vxworks_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libc_vxworks_signal(signum, handler)

public actual fun getpid(): PidT =
    libc_vxworks_getpid()

public actual fun getppid(): PidT =
    libc_vxworks_getppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    libc_vxworks_setpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    libc_vxworks_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun sysconf(attr: CInt): CLong =
    libc_vxworks_sysconf(attr)

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    libc_vxworks_setenv(envVarName, envVarValue, overwrite)

public actual fun unsetenv(envVarName: String?): CInt =
    libc_vxworks_unsetenv(envVarName)

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    libc_vxworks_realpath(fileName, resolvedName?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun link(src: String?, dst: String?): CInt =
    libc_vxworks_link(src, dst)

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    libc_vxworks_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun symlink(path1: String?, path2: String?): CInt =
    libc_vxworks_symlink(path1, path2)

public actual fun opendir(name: String?): DIR? =
    libc_vxworks_opendir(name)?.let { DIR(it.toLong()) }

public actual fun rmdir(path: String?): CInt =
    libc_vxworks_rmdir(path)

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    libc_vxworks_mkdir(dirName, mode)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    libc_vxworks_chmod(path, mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    libc_vxworks_fchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    libc_vxworks_fsync(fd)

public actual fun closedir(ptr: DIR?): CInt =
    libc_vxworks_closedir(ptr?.handle?.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_vxworks_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_vxworks_schedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_vxworks_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_vxworks_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    libc_vxworks_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc_vxworks_schedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    libc_vxworks_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libc_vxworks_schedYield()

public actual fun errnoSet(err: CInt): CInt =
    libc_vxworks_errnoSet(err)

public actual fun errnoGet(): CInt =
    libc_vxworks_errnoGet()

public actual fun setgid(gid: GidT): CInt =
    libc_vxworks_setgid(gid)

public actual fun getgid(): GidT =
    libc_vxworks_getgid()

public actual fun setuid(uid: UidT): CInt =
    libc_vxworks_setuid(uid)

public actual fun getuid(): UidT =
    libc_vxworks_getuid()

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    libc_vxworks_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigfillset(set: COpaquePointer?): CInt =
    libc_vxworks_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    libc_vxworks_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    libc_vxworks_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    libc_vxworks_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oset?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, signo: CInt): CInt =
    libc_vxworks_kill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    0

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    libc_vxworks_taskKill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    libc_vxworks_raise(signo)

public actual fun taskIdSelf(): TaskId =
    libc_vxworks_taskIdSelf()

public actual fun taskDelay(ticks: VxTicksT): CInt =
    libc_vxworks_taskDelay(ticks)

public actual fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt =
    libc_vxworks_taskNameSet(taskId, taskName?.value?.toCPointer<ByteVar>())

public actual fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    libc_vxworks_taskNameGet(taskId, bufName?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt =
    libc_vxworks_rtpInfoGet(rtpId, rtpStruct?.value?.toCPointer<ByteVar>())

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    libc_vxworks_rtpSpawn(pubrtpFileName, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>(), priority, uStackSize, options, taskOptions)

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    libc_vxworks_pathIsAbsolute(filepath, pNameTail?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_vxworks_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_vxworks_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    libc_vxworks_randBytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    libc_vxworks_randABytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    libc_vxworks_randUBytes(buf?.value?.toCPointer<ByteVar>(), length)

public actual fun randSecure(): CInt =
    libc_vxworks_randSecure()

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libc_vxworks_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libc_vxworks_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    libc_vxworks_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    libc_vxworks_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    libc_vxworks_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    libc_vxworks_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    libc_vxworks_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    libc_vxworks_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    libc_vxworks_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun vxCpuEnabledGet(): CpusetT =
    libc_vxworks_vxCpuEnabledGet()

public actual fun vxCpuConfiguredGet(): CpusetT =
    libc_vxworks_vxCpuConfiguredGet()
