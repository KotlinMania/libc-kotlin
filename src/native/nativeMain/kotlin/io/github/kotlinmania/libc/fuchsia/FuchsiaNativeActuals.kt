@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_abort
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_abs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_accept
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_accept4
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_access
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_acct
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_alarm
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_atexit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_atof
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_atoi
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_atol
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_atoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_bind
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_brk
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_calloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfgetispeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfgetospeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfmakeraw
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfsetispeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfsetospeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_cfsetspeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_chdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_chmod
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_chown
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clearenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clockGetres
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clockGettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clockNanosleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clockSettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_clone
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_close
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_closedir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_closelog
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_connect
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_creat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_daemon
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dirfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dlIteratePhdr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dladdr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dlclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dlerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dlopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dlsym
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dup
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dup2
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_dup3
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_duplocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_endgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_endpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_errnoLocation
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_eventfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execle
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execlp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execve
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execvp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_execvpe
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_exit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_faccessat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fallocate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fchmod
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fchmodat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fchown
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fchownat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fcntl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fdatasync
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fdopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fdopendir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_feof
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ferror
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fexecve
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fflush
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fgetc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fgetpos
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fgets
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fileno
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_flock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fork
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fpathconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fputc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fputs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fread
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_free
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_freeaddrinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_freeifaddrs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_freelocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_freopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fscanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fseek
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fseeko
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fsetpos
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fstat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fstatat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fstatfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fstatvfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fsync
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ftell
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ftello
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ftok
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ftruncate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_futimens
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_futimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_fwrite
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_gaiStrerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getaddrinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getchar
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getcharUnlocked
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getcwd
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getdomainname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getdtablesize
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getegid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_geteuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrgidR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrnamR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgrouplist
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_gethostname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getifaddrs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getlogin
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getnameinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpeername
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getppid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getprotobyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getprotobynumber
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpwnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpwnamR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpwuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getpwuidR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getresgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getresuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getservbyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getsockname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getsockopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_gettimeofday
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_getuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_glob
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_globfree
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_gmtime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_gmtimeR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_grantpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ifFreenameindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ifIndextoname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ifNameindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ifNametoindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_initgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ioctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isalnum
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isalpha
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isatty
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isblank
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_iscntrl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isdigit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isgraph
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_islower
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isprint
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ispunct
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isspace
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isupper
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_isxdigit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_kill
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_labs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_lchown
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_link
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_linkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_listen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_localeconv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_localtime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_localtimeR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_lseek
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_lstat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_lutimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_madvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_malloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memalign
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memcmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memcpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memmove
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memrchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_memset
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkdirat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkdtemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkfifo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkfifoat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mknod
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mknodat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkostemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkostemps
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkstemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mkstemps
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mktime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mlockall
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mmap
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mount
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_mprotect
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_msgctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_msgget
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_msgrcv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_msgsnd
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_msync
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_munlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_munlockall
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_munmap
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_nanosleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_newlocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_nlLanginfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_nlLanginfoL
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_open
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_openat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_opendir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_openlog
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_openpty
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pathconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pause
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_perror
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_personality
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pipe
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pipe2
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_poll
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_popen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_posixFadvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_posixFallocate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_posixMadvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_posixMemalign
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_posixOpenpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ppoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pread
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_preadv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_printf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pselect
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAtfork
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrGetguardsize
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrGetstack
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrGetstacksize
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrSetdetachstate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrSetguardsize
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadAttrSetstacksize
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCancel
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondBroadcast
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondSignal
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondTimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondWait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondattrGetclock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCondattrSetclock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadDetach
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadExit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadGetattrNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadGetnameNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadGetspecific
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadJoin
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadKeyCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadKeyDelete
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadKill
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexLock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexTimedlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexTrylock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexUnlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadMutexattrSettype
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockRdlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockTryrdlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockTrywrlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockUnlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockWrlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadRwlockattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadSelf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadSetnameNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadSetspecific
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pthreadSigmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ptsname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ptsnameR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_putchar
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_putcharUnlocked
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_putenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_puts
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pwrite
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_pwritev
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_quotactl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_raise
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_rand
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_read
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readahead
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readdirR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_readv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_realloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_realpath
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_reboot
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_recv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_recvfrom
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_recvmmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_recvmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_remove
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_rename
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_renameat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_resInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_rewind
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_rewinddir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_rmdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_scanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedGetPriorityMax
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedGetPriorityMin
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedGetaffinity
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedGetparam
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedGetscheduler
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedRrGetInterval
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedSetaffinity
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedSetparam
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedSetscheduler
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_schedYield
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_seekdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_select
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semClose
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semGetvalue
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semOpen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semPost
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semTimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semTrywait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semUnlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semWait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semget
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_semop
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_send
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sendmmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sendmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sendto
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setbuf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setdomainname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setegid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_seteuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setfsgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setfsuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sethostname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setlocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setlogmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setpgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setregid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setresgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setresuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setreuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setsockopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_settimeofday
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_setvbuf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmOpen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmUnlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmdt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shmget
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_shutdown
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigaction
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigaddset
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigaltstack
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigdelset
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigemptyset
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigfillset
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigismember
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_signal
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_signalfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigpending
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigprocmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigsuspend
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigtimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sigwaitinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_snprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_socket
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_socketpair
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_splice
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_srand
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sscanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_stat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_statfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_statvfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strcat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strcmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strcoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strcpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strcspn
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strdup
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strerrorR
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strlen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strncat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strncmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strncpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strnlen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strpbrk
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strrchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strspn
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strstr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtod
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtof
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtok
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtol
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtoul
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strtoull
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_strxfrm
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_swapoff
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_swapon
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_symlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_symlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sync
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_syncFileRange
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_syscall
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_sysconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_syslog
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_system
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcdrain
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcflow
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcflush
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcgetattr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcgetpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcgetsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcsendbreak
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcsetattr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tcsetpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tee
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_telldir
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_time
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_timegm
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_timerfdCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_timerfdGettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_timerfdSettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_times
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tmpfile
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tmpnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_tolower
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_toupper
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ttyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_umask
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_umount
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_umount2
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_uname
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_ungetc
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_unlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_unlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_unlockpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_unsetenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_uselocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_usleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_utime
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_utimensat
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_utimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_vhangup
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_vmsplice
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_wait
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_waitid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_waitpid
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_wcslen
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_wcstombs
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_wmemchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_write
import io.github.kotlinmania.libc.fuchsia.cinterop.libc_fuchsia_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    libc_fuchsia_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_fuchsia_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_fuchsia_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_fuchsia_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_fuchsia_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_fuchsia_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_fuchsia_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_fuchsia_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_fuchsia_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_fuchsia_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_fuchsia_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libc_fuchsia_isblank(c)

public actual fun tolower(c: CInt): CInt =
    libc_fuchsia_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_fuchsia_toupper(c)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    libc_fuchsia_fopen(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    libc_fuchsia_freopen(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fflush(file: FILE?): CInt =
    libc_fuchsia_fflush(file?.handle?.toCPointer<ByteVar>())

public actual fun fclose(file: FILE?): CInt =
    libc_fuchsia_fclose(file?.handle?.toCPointer<ByteVar>())

public actual fun remove(filename: String?): CInt =
    libc_fuchsia_remove(filename)

public actual fun rename(oldname: String?, newname: String?): CInt =
    libc_fuchsia_rename(oldname, newname)

public actual fun tmpfile(): FILE? =
    libc_fuchsia_tmpfile()?.let { FILE(it.toLong()) }

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    libc_fuchsia_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    libc_fuchsia_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libc_fuchsia_getchar()

public actual fun putchar(c: CInt): CInt =
    libc_fuchsia_putchar(c)

public actual fun fgetc(stream: FILE?): CInt =
    libc_fuchsia_fgetc(stream?.handle?.toCPointer<ByteVar>())

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    libc_fuchsia_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    libc_fuchsia_fputc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fputs(s: String?, stream: FILE?): CInt =
    libc_fuchsia_fputs(s, stream?.handle?.toCPointer<ByteVar>())

public actual fun puts(s: String?): CInt =
    libc_fuchsia_puts(s)

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    libc_fuchsia_ungetc(c, stream?.handle?.toCPointer<ByteVar>())

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_fuchsia_fread(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    libc_fuchsia_fwrite(ptr?.value?.toCPointer<ByteVar>(), size, nobj, stream?.handle?.toCPointer<ByteVar>())

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    libc_fuchsia_fseek(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: FILE?): CLong =
    libc_fuchsia_ftell(stream?.handle?.toCPointer<ByteVar>())

public actual fun rewind(stream: FILE?) {
    libc_fuchsia_rewind(stream?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_fuchsia_fgetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    libc_fuchsia_fsetpos(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun feof(stream: FILE?): CInt =
    libc_fuchsia_feof(stream?.handle?.toCPointer<ByteVar>())

public actual fun ferror(stream: FILE?): CInt =
    libc_fuchsia_ferror(stream?.handle?.toCPointer<ByteVar>())

public actual fun perror(s: String?) {
    libc_fuchsia_perror(s)
}

public actual fun atof(s: String?): CDouble =
    libc_fuchsia_atof(s)

public actual fun atoi(s: String?): CInt =
    libc_fuchsia_atoi(s)

public actual fun atol(s: String?): CLong =
    libc_fuchsia_atol(s)

public actual fun atoll(s: String?): CLonglong =
    libc_fuchsia_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    libc_fuchsia_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    libc_fuchsia_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc_fuchsia_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    libc_fuchsia_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    libc_fuchsia_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    libc_fuchsia_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    libc_fuchsia_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_fuchsia_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_fuchsia_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    libc_fuchsia_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libc_fuchsia_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libc_fuchsia_exit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    libc_fuchsia_atexit(0L.toCPointer<ByteVar>())

public actual fun system(s: String?): CInt =
    libc_fuchsia_system(s)

public actual fun getenv(s: String?): COpaquePointer? =
    libc_fuchsia_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    libc_fuchsia_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_fuchsia_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    libc_fuchsia_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    libc_fuchsia_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc_fuchsia_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    libc_fuchsia_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc_fuchsia_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    libc_fuchsia_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    libc_fuchsia_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    libc_fuchsia_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    libc_fuchsia_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    libc_fuchsia_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    libc_fuchsia_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    libc_fuchsia_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strlen(cs: String?): SizeT =
    libc_fuchsia_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    libc_fuchsia_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    libc_fuchsia_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    libc_fuchsia_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    libc_fuchsia_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    libc_fuchsia_wcslen(buf?.value?.toCPointer<ByteVar>())

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    libc_fuchsia_wcstombs(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_fuchsia_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    libc_fuchsia_wmemchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    libc_fuchsia_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_fuchsia_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_fuchsia_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_fuchsia_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    libc_fuchsia_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_fuchsia_labs(i)

public actual fun rand(): CInt =
    libc_fuchsia_rand()

public actual fun srand(seed: CUint) {
    libc_fuchsia_srand(seed)
}

public actual fun getpwnam(name: String?): COpaquePointer? =
    libc_fuchsia_getpwnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    libc_fuchsia_getpwuid(uid)?.let { COpaquePointer(it.toLong()) }

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_fprintf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_printf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_snprintf(s?.value?.toCPointer<ByteVar>(), n, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_sprintf(s?.value?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_fscanf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_scanf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_sscanf(s, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libc_fuchsia_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libc_fuchsia_putcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    libc_fuchsia_socket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    libc_fuchsia_connect(socket, address?.value?.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libc_fuchsia_listen(socket, backlog)

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    libc_fuchsia_accept(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    libc_fuchsia_getpeername(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    libc_fuchsia_getsockname(socket, address?.value?.toCPointer<ByteVar>(), addressLen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    libc_fuchsia_setsockopt(socket, level, name, value?.value?.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    libc_fuchsia_socketpair(domain, type, protocol, socketVector?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    libc_fuchsia_sendto(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libc_fuchsia_shutdown(socket, how)

public actual fun chmod(path: String?, mode: ModeT): CInt =
    libc_fuchsia_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libc_fuchsia_fchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_fuchsia_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc_fuchsia_mkdir(path, mode)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    libc_fuchsia_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun pclose(stream: FILE?): CInt =
    libc_fuchsia_pclose(stream?.handle?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    libc_fuchsia_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    libc_fuchsia_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_fuchsia_open(path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    libc_fuchsia_creat(path, mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_fuchsia_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: String?): DIR? =
    libc_fuchsia_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    libc_fuchsia_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    libc_fuchsia_readdirR(dirp?.handle?.toCPointer<ByteVar>(), entry?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun closedir(dirp: DIR?): CInt =
    libc_fuchsia_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    libc_fuchsia_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    libc_fuchsia_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    libc_fuchsia_fchmodat(dirfd, pathname, mode, flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libc_fuchsia_fchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    libc_fuchsia_fchownat(dirfd, pathname, owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    libc_fuchsia_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc_fuchsia_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_fuchsia_mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    libc_fuchsia_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc_fuchsia_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    libc_fuchsia_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    libc_fuchsia_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    libc_fuchsia_access(path, amode)

public actual fun alarm(seconds: CUint): CUint =
    libc_fuchsia_alarm(seconds)

public actual fun chdir(dir: String?): CInt =
    libc_fuchsia_chdir(dir)

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    libc_fuchsia_chown(path, uid, gid)

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    libc_fuchsia_lchown(path, uid, gid)

public actual fun close(fd: CInt): CInt =
    libc_fuchsia_close(fd)

public actual fun dup(fd: CInt): CInt =
    libc_fuchsia_dup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libc_fuchsia_dup2(src, dst)

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_execl(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_execle(path, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_execlp(file, arg0, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    libc_fuchsia_execv(prog, argv?.value?.toCPointer<ByteVar>())

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_fuchsia_execve(prog, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    libc_fuchsia_execvp(c, argv?.value?.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    libc_fuchsia_fork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc_fuchsia_fpathconf(filedes, name)

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_fuchsia_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun getegid(): GidT =
    libc_fuchsia_getegid()

public actual fun geteuid(): UidT =
    libc_fuchsia_geteuid()

public actual fun getgid(): GidT =
    libc_fuchsia_getgid()

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    libc_fuchsia_getgroups(ngroupsMax, groups?.value?.toCPointer<ByteVar>())

public actual fun getlogin(): COpaquePointer? =
    libc_fuchsia_getlogin()?.let { COpaquePointer(it.toLong()) }

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    libc_fuchsia_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun getpgid(pid: PidT): PidT =
    libc_fuchsia_getpgid(pid)

public actual fun getpgrp(): PidT =
    libc_fuchsia_getpgrp()

public actual fun getpid(): PidT =
    libc_fuchsia_getpid()

public actual fun getppid(): PidT =
    libc_fuchsia_getppid()

public actual fun getuid(): UidT =
    libc_fuchsia_getuid()

public actual fun isatty(fd: CInt): CInt =
    libc_fuchsia_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    libc_fuchsia_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc_fuchsia_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    libc_fuchsia_pathconf(path, name)

public actual fun pause(): CInt =
    libc_fuchsia_pause()

public actual fun pipe(fds: COpaquePointer?): CInt =
    libc_fuchsia_pipe(fds?.value?.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    libc_fuchsia_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_fuchsia_read(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: String?): CInt =
    libc_fuchsia_rmdir(path)

public actual fun seteuid(uid: UidT): CInt =
    libc_fuchsia_seteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libc_fuchsia_setegid(gid)

public actual fun setgid(gid: GidT): CInt =
    libc_fuchsia_setgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    libc_fuchsia_setpgid(pid, pgid)

public actual fun setsid(): PidT =
    libc_fuchsia_setsid()

public actual fun setuid(uid: UidT): CInt =
    libc_fuchsia_setuid(uid)

public actual fun sleep(secs: CUint): CUint =
    libc_fuchsia_sleep(secs)

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_fuchsia_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    libc_fuchsia_tcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    libc_fuchsia_tcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): COpaquePointer? =
    libc_fuchsia_ttyname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlink(c: String?): CInt =
    libc_fuchsia_unlink(c)

public actual fun wait(status: COpaquePointer?): PidT =
    libc_fuchsia_wait(status?.value?.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    libc_fuchsia_waitpid(pid, status?.value?.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_fuchsia_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    libc_fuchsia_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    libc_fuchsia_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    libc_fuchsia_umask(mask)

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    libc_fuchsia_utime(file, buf?.value?.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libc_fuchsia_kill(pid, sig)

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_mlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_munlock(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libc_fuchsia_mlockall(flags)

public actual fun munlockall(): CInt =
    libc_fuchsia_munlockall()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    libc_fuchsia_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: String?): CUint =
    libc_fuchsia_ifNametoindex(ifname)

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_ifIndextoname(ifindex, ifname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    libc_fuchsia_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libc_fuchsia_fsync(fd)

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    libc_fuchsia_setenv(name, value, overwrite)

public actual fun unsetenv(name: String?): CInt =
    libc_fuchsia_unsetenv(name)

public actual fun symlink(path1: String?, path2: String?): CInt =
    libc_fuchsia_symlink(path1, path2)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc_fuchsia_ftruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libc_fuchsia_signal(signum, handler)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun flock(fd: CInt, operation: CInt): CInt =
    libc_fuchsia_flock(fd, operation)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_fuchsia_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun times(buf: COpaquePointer?): ClockT =
    libc_fuchsia_times(buf?.value?.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libc_fuchsia_pthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    libc_fuchsia_pthreadJoin(native.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    libc_fuchsia_pthreadExit(value?.value?.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_fuchsia_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    libc_fuchsia_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    libc_fuchsia_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libc_fuchsia_pthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libc_fuchsia_schedYield()

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libc_fuchsia_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libc_fuchsia_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    libc_fuchsia_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc_fuchsia_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    libc_fuchsia_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockRdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockTryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockWrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockTrywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadRwlockattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    libc_fuchsia_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_fuchsia_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    libc_fuchsia_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    libc_fuchsia_raise(signum)

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    libc_fuchsia_sigaction(signum, act?.value?.toCPointer<ByteVar>(), oldact?.value?.toCPointer<ByteVar>())

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    libc_fuchsia_utimes(filename, times?.value?.toCPointer<ByteVar>())

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    libc_fuchsia_dlopen(filename, flag)?.let { COpaquePointer(it.toLong()) }

public actual fun dlerror(): COpaquePointer? =
    libc_fuchsia_dlerror()?.let { COpaquePointer(it.toLong()) }

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    libc_fuchsia_dlsym(handle?.value?.toCPointer<ByteVar>(), symbol)?.let { COpaquePointer(it.toLong()) }

public actual fun dlclose(handle: COpaquePointer?): CInt =
    libc_fuchsia_dlclose(handle?.value?.toCPointer<ByteVar>())

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_fuchsia_dladdr(addr?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    libc_fuchsia_getaddrinfo(node, service, hints?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: COpaquePointer?) {
    libc_fuchsia_freeaddrinfo(res?.value?.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    libc_fuchsia_gaiStrerror(errcode)?.let { COpaquePointer(it.toLong()) }

public actual fun resInit(): CInt =
    libc_fuchsia_resInit()

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_gmtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_localtimeR(timeP?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mktime(tm: COpaquePointer?): TimeT =
    libc_fuchsia_mktime(tm?.value?.toCPointer<ByteVar>())

public actual fun time(time: COpaquePointer?): TimeT =
    libc_fuchsia_time(time?.value?.toCPointer<ByteVar>())

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_gmtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_localtime(timeP?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_fuchsia_mknod(pathname, mode, dev)

public actual fun uname(buf: COpaquePointer?): CInt =
    libc_fuchsia_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_gethostname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    libc_fuchsia_getservbyname(name, proto)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobyname(name: String?): COpaquePointer? =
    libc_fuchsia_getprotobyname(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    libc_fuchsia_getprotobynumber(proto)?.let { COpaquePointer(it.toLong()) }

public actual fun usleep(secs: CUint): CInt =
    libc_fuchsia_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    libc_fuchsia_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    libc_fuchsia_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: COpaquePointer?): CInt =
    libc_fuchsia_putenv(string?.value?.toCPointer<ByteVar>())

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    libc_fuchsia_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_fuchsia_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    libc_fuchsia_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): COpaquePointer? =
    libc_fuchsia_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    libc_fuchsia_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semWait(sem: COpaquePointer?): CInt =
    libc_fuchsia_semWait(sem?.value?.toCPointer<ByteVar>())

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    libc_fuchsia_semTrywait(sem?.value?.toCPointer<ByteVar>())

public actual fun semPost(sem: COpaquePointer?): CInt =
    libc_fuchsia_semPost(sem?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    libc_fuchsia_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    libc_fuchsia_statvfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    libc_fuchsia_fstatvfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    libc_fuchsia_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    libc_fuchsia_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    libc_fuchsia_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: COpaquePointer?): CInt =
    libc_fuchsia_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    libc_fuchsia_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    libc_fuchsia_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_fuchsia_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: COpaquePointer?): CInt =
    libc_fuchsia_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun timegm(tm: COpaquePointer?): TimeT =
    libc_fuchsia_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun getsid(pid: PidT): PidT =
    libc_fuchsia_getsid(pid)

public actual fun sysconf(name: CInt): CLong =
    libc_fuchsia_sysconf(name)

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    libc_fuchsia_mkfifo(path, mode)

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_fuchsia_pselect(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc_fuchsia_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    libc_fuchsia_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    libc_fuchsia_tcdrain(fd)

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    libc_fuchsia_cfgetispeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    libc_fuchsia_cfgetospeed(termios?.value?.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: COpaquePointer?) {
    libc_fuchsia_cfmakeraw(termios?.value?.toCPointer<ByteVar>())
}

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    libc_fuchsia_cfsetispeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    libc_fuchsia_cfsetospeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    libc_fuchsia_cfsetspeed(termios?.value?.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    libc_fuchsia_tcgetattr(fd, termios?.value?.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    libc_fuchsia_tcsetattr(fd, optionalActions, termios?.value?.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libc_fuchsia_tcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libc_fuchsia_tcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    libc_fuchsia_tcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libc_fuchsia_tcsendbreak(fd, duration)

public actual fun mkstemp(template: COpaquePointer?): CInt =
    libc_fuchsia_mkstemp(template?.value?.toCPointer<ByteVar>())

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_mkdtemp(template?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    libc_fuchsia_tmpnam(ptr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    libc_fuchsia_openlog(ident, logopt, facility)
}

public actual fun closelog() {
    libc_fuchsia_closelog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libc_fuchsia_setlogmask(maskpri)

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    libc_fuchsia_syslog(priority, message, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun grantpt(fd: CInt): CInt =
    libc_fuchsia_grantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    libc_fuchsia_posixOpenpt(flags)

public actual fun ptsname(fd: CInt): COpaquePointer? =
    libc_fuchsia_ptsname(fd)?.let { COpaquePointer(it.toLong()) }

public actual fun unlockpt(fd: CInt): CInt =
    libc_fuchsia_unlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libc_fuchsia_fdatasync(fd)

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_fuchsia_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_fuchsia_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    libc_fuchsia_clockSettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun dirfd(dirp: DIR?): CInt =
    libc_fuchsia_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    libc_fuchsia_pthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_fuchsia_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_fuchsia_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    libc_fuchsia_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    libc_fuchsia_pipe2(fds?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    libc_fuchsia_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    libc_fuchsia_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_fuchsia_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libc_fuchsia_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_fuchsia_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_fuchsia_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    libc_fuchsia_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    libc_fuchsia_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc_fuchsia_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    libc_fuchsia_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fdopendir(fd: CInt): DIR? =
    libc_fuchsia_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    libc_fuchsia_mknodat(dirfd, pathname, mode, dev)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_fuchsia_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    libc_fuchsia_accept4(fd, addr?.value?.toCPointer<ByteVar>(), len?.value?.toCPointer<ByteVar>(), flg)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_fuchsia_ptsnameR(fd, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    libc_fuchsia_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    libc_fuchsia_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    libc_fuchsia_setreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    libc_fuchsia_setregid(rgid, egid)

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    libc_fuchsia_getresuid(ruid?.value?.toCPointer<ByteVar>(), euid?.value?.toCPointer<ByteVar>(), suid?.value?.toCPointer<ByteVar>())

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    libc_fuchsia_getresgid(rgid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>(), sgid?.value?.toCPointer<ByteVar>())

public actual fun acct(filename: String?): CInt =
    libc_fuchsia_acct(filename)

public actual fun brk(addr: COpaquePointer?): CInt =
    libc_fuchsia_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libc_fuchsia_setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libc_fuchsia_setresuid(ruid, euid, suid)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    libc_fuchsia_openpty(amaster?.value?.toCPointer<ByteVar>(), aslave?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), termp?.value?.toCPointer<ByteVar>(), winp?.value?.toCPointer<ByteVar>())

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_fuchsia_execvpe(file, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    libc_fuchsia_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libc_fuchsia_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    libc_fuchsia_lutimes(file, times?.value?.toCPointer<ByteVar>())

public actual fun setpwent() {
    libc_fuchsia_setpwent()
}

public actual fun endpwent() {
    libc_fuchsia_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    libc_fuchsia_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    libc_fuchsia_shmOpen(name, oflag, mode)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libc_fuchsia_shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    libc_fuchsia_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    libc_fuchsia_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_fuchsia_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    libc_fuchsia_ftok(pathname, projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    libc_fuchsia_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    libc_fuchsia_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_fuchsia_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    libc_fuchsia_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libc_fuchsia_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libc_fuchsia_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    libc_fuchsia_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    libc_fuchsia_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): COpaquePointer? =
    libc_fuchsia_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libc_fuchsia_fallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_fuchsia_posixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    libc_fuchsia_readahead(fd, offset, count)

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    libc_fuchsia_signalfd(fd, mask?.value?.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    libc_fuchsia_timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    libc_fuchsia_timerfdGettime(fd, currValue?.value?.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    libc_fuchsia_timerfdSettime(fd, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_fuchsia_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_fuchsia_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    libc_fuchsia_quotactl(cmd, special, id, data?.value?.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libc_fuchsia_dup3(oldfd, newfd, flags)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    libc_fuchsia_mkostemp(template?.value?.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    libc_fuchsia_mkostemps(template?.value?.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_fuchsia_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    libc_fuchsia_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    libc_fuchsia_nlLanginfoL(item, locale?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    libc_fuchsia_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun reboot(howTo: CInt): CInt =
    libc_fuchsia_reboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    libc_fuchsia_setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    libc_fuchsia_setfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_fuchsia_mkfifoat(dirfd, pathname, mode)

public actual fun ifNameindex(): COpaquePointer? =
    libc_fuchsia_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    libc_fuchsia_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    libc_fuchsia_syncFileRange(fd, offset, nbytes, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    libc_fuchsia_getifaddrs(ifap?.value?.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    libc_fuchsia_freeifaddrs(ifa?.value?.toCPointer<ByteVar>())
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    libc_fuchsia_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    libc_fuchsia_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_fuchsia_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: String?): CInt =
    libc_fuchsia_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_fuchsia_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_fuchsia_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    libc_fuchsia_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    libc_fuchsia_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_fuchsia_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    libc_fuchsia_mkstemps(template?.value?.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    libc_fuchsia_futimes(fd, times?.value?.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_fuchsia_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    libc_fuchsia_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_fuchsia_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_fuchsia_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_fuchsia_sendmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    libc_fuchsia_recvmsg(fd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    libc_fuchsia_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    libc_fuchsia_setdomainname(name, len)

public actual fun vhangup(): CInt =
    libc_fuchsia_vhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    libc_fuchsia_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    libc_fuchsia_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sync() {
    libc_fuchsia_sync()
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    libc_fuchsia_syscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_fuchsia_schedGetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    libc_fuchsia_schedSetaffinity(pid, cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun umount(target: String?): CInt =
    libc_fuchsia_umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libc_fuchsia_schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    libc_fuchsia_tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_fuchsia_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    libc_fuchsia_splice(fdIn, offIn?.value?.toCPointer<ByteVar>(), fdOut, offOut?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libc_fuchsia_eventfd(initval, flags)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    libc_fuchsia_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_fuchsia_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    libc_fuchsia_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_fuchsia_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun swapoff(puath: String?): CInt =
    libc_fuchsia_swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    libc_fuchsia_vmsplice(fd, iov?.value?.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    libc_fuchsia_mount(src, target, fstype, flags, data?.value?.toCPointer<ByteVar>())

public actual fun personality(persona: CUlong): CInt =
    libc_fuchsia_personality(persona)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    libc_fuchsia_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    libc_fuchsia_ppoll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout?.value?.toCPointer<ByteVar>(), sigmask?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_fuchsia_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    libc_fuchsia_clone(0L.toCPointer<ByteVar>(), childStack?.value?.toCPointer<ByteVar>(), flags, arg?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    libc_fuchsia_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    libc_fuchsia_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    libc_fuchsia_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    libc_fuchsia_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    libc_fuchsia_sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libc_fuchsia_schedGetPriorityMin(policy)

public actual fun umount2(target: String?, flags: CInt): CInt =
    libc_fuchsia_umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    libc_fuchsia_swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    libc_fuchsia_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    libc_fuchsia_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_fuchsia_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    libc_fuchsia_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun semClose(sem: COpaquePointer?): CInt =
    libc_fuchsia_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libc_fuchsia_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_fuchsia_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun initgroups(user: String?, group: GidT): CInt =
    libc_fuchsia_initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_fuchsia_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    libc_fuchsia_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnam(name: String?): COpaquePointer? =
    libc_fuchsia_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc_fuchsia_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc_fuchsia_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: String?): CInt =
    libc_fuchsia_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libc_fuchsia_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_fuchsia_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    libc_fuchsia_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    libc_fuchsia_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    libc_fuchsia_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    libc_fuchsia_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun setgrent() {
    libc_fuchsia_setgrent()
}

public actual fun endgrent() {
    libc_fuchsia_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    libc_fuchsia_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    libc_fuchsia_getgrouplist(user, group, groups?.value?.toCPointer<ByteVar>(), ngroups?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    libc_fuchsia_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_fuchsia_faccessat(dirfd, pathname, mode, flags)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_fuchsia_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    libc_fuchsia_dlIteratePhdr(0L.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())
