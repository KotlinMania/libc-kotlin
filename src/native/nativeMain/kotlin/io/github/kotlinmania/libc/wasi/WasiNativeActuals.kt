@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

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
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_abort
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_abs
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_access
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_alignedAlloc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4random
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4randomBuf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4randomUniform
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_asctimeR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atQuickExit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atexit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atof
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atoi
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atol
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atoll
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_calloc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_chdir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_chmod
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clearenv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clearerr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_close
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_closedir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_creat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ctimeR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_difftime
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_dirfd
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_duplocale
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_errnoLocation
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_exit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_faccessat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fchmod
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fclose
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fcntl
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdatasync
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdopen
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdopendir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_feof
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ferror
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fflush
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgetc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgetpos
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgets
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fileno
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fopen
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fpathconf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fprintf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fputc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fputs
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fread
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_free
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_freelocale
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_freopen
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fscanf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fseek
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fseeko
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fsetpos
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fstat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fstatat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fsync
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftell
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftello
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftruncate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_futimens
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fwrite
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_get_CLOCK_MONOTONIC1
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_get_CLOCK_REALTIME1
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_get_ENVIRON
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getchar
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getcharUnlocked
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getcwd
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getentropy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getenv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getline
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getopt
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getrusage
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gettimeofday
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gmtime
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gmtimeR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ioctl
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isalnum
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isalpha
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isatty
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isblank
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_iscntrl
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isdigit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isgraph
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_islower
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isprint
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ispunct
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isspace
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isupper
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isxdigit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_labs
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_link
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_linkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localeconv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localtime
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localtimeR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_lseek
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_lstat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_malloc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mallocUsableSize
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memchr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memcmp
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memcpy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memmove
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memrchr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memset
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mkdir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mkdirat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mktime
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nanosleep
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_newlocale
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nlLanginfo
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nlLanginfoL
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_open
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_openat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_opendir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pathconf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_perror
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_poll
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixFadvise
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixFallocate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixMemalign
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pread
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_preadv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_printf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrGetstacksize
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrSetdetachstate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrSetstacksize
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondBroadcast
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondSignal
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondTimedwait
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondWait
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCreate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadDetach
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadEqual
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadGetspecific
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadJoin
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadKeyCreate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadKeyDelete
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexLock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexTrylock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexUnlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrSettype
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockRdlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockTryrdlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockTrywrlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockUnlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockWrlock
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadSelf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadSetspecific
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putchar
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putcharUnlocked
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putenv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_puts
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pwrite
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pwritev
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_quickExit
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rand
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_randR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_random
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_read
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readdir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readlink
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_realloc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_realpath
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_recv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_remove
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rename
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_renameat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rewind
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rewinddir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rmdir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sbrk
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_scanf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_schedYield
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_seekdir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_select
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_send
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_set_ENVIRON
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setbuf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setenv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setlocale
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setvbuf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_shutdown
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sleep
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_snprintf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sprintf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_srand
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_srandom
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sscanf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_stat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcasecmp
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcasestr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strchr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcmp
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcoll
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcpy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcspn
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strdup
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strerror
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strerrorR
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strftime
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strlen
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncasecmp
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncmp
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncpy
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strndup
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strnlen
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strpbrk
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strrchr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strspn
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strstr
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtod
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtof
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtok
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtol
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoll
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoul
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoull
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strxfrm
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_symlink
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_symlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sysconf
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_telldir
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_time
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_timegm
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_times
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_tolower
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_toupper
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_truncate
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ungetc
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unlink
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unsetenv
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_uselocale
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_usleep
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_utimensat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcAccess
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcFdRenumber
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcFindRelpath
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLink
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLinkNewat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLinkOldat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdFaccessat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdFstatat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdLinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdMkdiratNomode
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdOpenatNomode
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdOpendirat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdReadlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdRenameat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdSymlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdUtimensat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdWasilibcRmdirat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdWasilibcUnlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRegisterPreopenedFd
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRenameNewat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRenameOldat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRmdirat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcStat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcTell
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcUnlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcUtimens
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_write
import io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var ENVIRON: COpaquePointer?
    get() = libc_wasi_get_ENVIRON()?.let { COpaquePointer(it.toLong()) }
    set(value) {
        libc_wasi_set_ENVIRON(value?.value?.toCPointer<ByteVar>())
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = libc_wasi_get_CLOCK_MONOTONIC1()

public actual val CLOCK_REALTIME1: UByte
    get() = libc_wasi_get_CLOCK_REALTIME1()

public actual fun exit(code: CInt): Nothing {
    libc_wasi_exit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    libc_wasi_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    libc_wasi_alignedAlloc(a, b)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    libc_wasi_calloc(amt, amt2)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    libc_wasi_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(s: String?): COpaquePointer? =
    libc_wasi_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    libc_wasi_malloc(amt)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    libc_wasi_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    libc_wasi_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun rand(): CInt =
    libc_wasi_rand()

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    libc_wasi_read(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    libc_wasi_realloc(ptr?.value?.toCPointer<ByteVar>(), amt)?.let { COpaquePointer(it.toLong()) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    libc_wasi_setenv(k, v, a)

public actual fun unsetenv(k: String?): CInt =
    libc_wasi_unsetenv(k)

public actual fun clearenv(): CInt =
    libc_wasi_clearenv()

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    libc_wasi_write(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun fopen(a: String?, b: String?): FILE? =
    libc_wasi_fopen(a, b)?.let { FILE(it.toLong()) }

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    libc_wasi_freopen(a, b, f?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fclose(f: FILE?): CInt =
    libc_wasi_fclose(f?.handle?.toCPointer<ByteVar>())

public actual fun remove(a: String?): CInt =
    libc_wasi_remove(a)

public actual fun rename(a: String?, b: String?): CInt =
    libc_wasi_rename(a, b)

public actual fun feof(f: FILE?): CInt =
    libc_wasi_feof(f?.handle?.toCPointer<ByteVar>())

public actual fun ferror(f: FILE?): CInt =
    libc_wasi_ferror(f?.handle?.toCPointer<ByteVar>())

public actual fun fflush(f: FILE?): CInt =
    libc_wasi_fflush(f?.handle?.toCPointer<ByteVar>())

public actual fun clearerr(f: FILE?) {
    libc_wasi_clearerr(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    libc_wasi_fseek(f?.handle?.toCPointer<ByteVar>(), b, c)

public actual fun ftell(f: FILE?): CLong =
    libc_wasi_ftell(f?.handle?.toCPointer<ByteVar>())

public actual fun rewind(f: FILE?) {
    libc_wasi_rewind(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    libc_wasi_fgetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    libc_wasi_fsetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    libc_wasi_fread(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    libc_wasi_fwrite(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(f: FILE?): CInt =
    libc_wasi_fgetc(f?.handle?.toCPointer<ByteVar>())

public actual fun getc(f: FILE?): CInt =
    libc_wasi_getc(f?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libc_wasi_getchar()

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    libc_wasi_ungetc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun fputc(a: CInt, f: FILE?): CInt =
    libc_wasi_fputc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putc(a: CInt, f: FILE?): CInt =
    libc_wasi_putc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putchar(a: CInt): CInt =
    libc_wasi_putchar(a)

public actual fun fputs(a: String?, f: FILE?): CInt =
    libc_wasi_fputs(a, f?.handle?.toCPointer<ByteVar>())

public actual fun puts(a: String?): CInt =
    libc_wasi_puts(a)

public actual fun perror(a: String?) {
    libc_wasi_perror(a)
}

public actual fun srand(a: CUint) {
    libc_wasi_srand(a)
}

public actual fun atexit(a: AtexitACallback): CInt =
    libc_wasi_atexit(0L.toCPointer<ByteVar>())

public actual fun atQuickExit(a: AtexitACallback): CInt =
    libc_wasi_atQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(a: CInt): Nothing {
    libc_wasi_quickExit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    libc_wasi_posixMemalign(a?.value?.toCPointer<ByteVar>(), b, c)

public actual fun randR(a: COpaquePointer?): CInt =
    libc_wasi_randR(a?.value?.toCPointer<ByteVar>())

public actual fun random(): CLong =
    libc_wasi_random()

public actual fun srandom(a: CUint) {
    libc_wasi_srandom(a)
}

public actual fun putenv(a: COpaquePointer?): CInt =
    libc_wasi_putenv(a?.value?.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libc_wasi_clock()

public actual fun time(a: COpaquePointer?): TimeT =
    libc_wasi_time(a?.value?.toCPointer<ByteVar>())

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    libc_wasi_difftime(a, b)

public actual fun mktime(a: COpaquePointer?): TimeT =
    libc_wasi_mktime(a?.value?.toCPointer<ByteVar>())

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    libc_wasi_strftime(a?.value?.toCPointer<ByteVar>(), b, c, d?.value?.toCPointer<ByteVar>())

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    libc_wasi_gmtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    libc_wasi_gmtimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    libc_wasi_localtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    libc_wasi_localtimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    libc_wasi_asctimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    libc_wasi_ctimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    libc_wasi_nanosleep(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    0

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    libc_wasi_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libc_wasi_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libc_wasi_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libc_wasi_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libc_wasi_isgraph(c)

public actual fun islower(c: CInt): CInt =
    libc_wasi_islower(c)

public actual fun isprint(c: CInt): CInt =
    libc_wasi_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    libc_wasi_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    libc_wasi_isspace(c)

public actual fun isupper(c: CInt): CInt =
    libc_wasi_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libc_wasi_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libc_wasi_isblank(c)

public actual fun tolower(c: CInt): CInt =
    libc_wasi_tolower(c)

public actual fun toupper(c: CInt): CInt =
    libc_wasi_toupper(c)

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    libc_wasi_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    libc_wasi_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    libc_wasi_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atof(s: String?): CDouble =
    libc_wasi_atof(s)

public actual fun atoi(s: String?): CInt =
    libc_wasi_atoi(s)

public actual fun atol(s: String?): CLong =
    libc_wasi_atol(s)

public actual fun atoll(s: String?): CLonglong =
    libc_wasi_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    libc_wasi_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    libc_wasi_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    libc_wasi_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    libc_wasi_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    libc_wasi_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    libc_wasi_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    libc_wasi_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    libc_wasi_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    libc_wasi_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    libc_wasi_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    libc_wasi_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    libc_wasi_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    libc_wasi_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    libc_wasi_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    libc_wasi_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    libc_wasi_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    libc_wasi_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    libc_wasi_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    libc_wasi_strndup(cs, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    libc_wasi_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    libc_wasi_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    libc_wasi_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    libc_wasi_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    libc_wasi_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    libc_wasi_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    libc_wasi_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    libc_wasi_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    libc_wasi_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_wasi_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    libc_wasi_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_wasi_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    libc_wasi_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_wasi_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_fprintf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_printf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_snprintf(s?.value?.toCPointer<ByteVar>(), n, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_sprintf(s?.value?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_fscanf(stream?.handle?.toCPointer<ByteVar>(), format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_scanf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    libc_wasi_sscanf(s, format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libc_wasi_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libc_wasi_putcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libc_wasi_shutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    libc_wasi_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    libc_wasi_mkdir(path, mode)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    libc_wasi_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    libc_wasi_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    libc_wasi_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    libc_wasi_open(path, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: String?, mode: ModeT): CInt =
    libc_wasi_creat(path, mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libc_wasi_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: String?): DIR? =
    libc_wasi_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun fdopendir(fd: CInt): DIR? =
    libc_wasi_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    libc_wasi_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    libc_wasi_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    libc_wasi_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: DIR?): CInt =
    libc_wasi_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    libc_wasi_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    libc_wasi_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    libc_wasi_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc_wasi_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    libc_wasi_mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    libc_wasi_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc_wasi_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    libc_wasi_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    libc_wasi_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    libc_wasi_access(path, amode)

public actual fun close(fd: CInt): CInt =
    libc_wasi_close(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libc_wasi_fpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    libc_wasi_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun isatty(fd: CInt): CInt =
    libc_wasi_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    libc_wasi_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libc_wasi_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    libc_wasi_pathconf(path, name)

public actual fun rmdir(path: String?): CInt =
    libc_wasi_rmdir(path)

public actual fun sleep(secs: CUint): CUint =
    libc_wasi_sleep(secs)

public actual fun unlink(c: String?): CInt =
    libc_wasi_unlink(c)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    libc_wasi_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    libc_wasi_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    libc_wasi_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libc_wasi_fsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libc_wasi_fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): CInt =
    libc_wasi_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    libc_wasi_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libc_wasi_ftruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    libc_wasi_getrusage(resource, usage?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    libc_wasi_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun times(buf: COpaquePointer?): ClockT =
    libc_wasi_times(buf?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_wasi_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun usleep(secs: CUint): CInt =
    libc_wasi_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    libc_wasi_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    libc_wasi_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    libc_wasi_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    libc_wasi_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): COpaquePointer? =
    libc_wasi_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    libc_wasi_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun timegm(tm: COpaquePointer?): TimeT =
    libc_wasi_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libc_wasi_sysconf(name)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libc_wasi_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc_wasi_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    libc_wasi_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libc_wasi_posixFallocate(fd, offset, len)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    libc_wasi_strcasestr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    libc_wasi_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_wasi_faccessat(dirfd, pathname, mode, flags)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_wasi_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_wasi_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_wasi_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    libc_wasi_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libc_wasi_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_wasi_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    libc_wasi_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_wasi_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    libc_wasi_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    libc_wasi_abs(i)

public actual fun labs(i: CLong): CLong =
    libc_wasi_labs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    libc_wasi_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    libc_wasi_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    libc_wasi_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    libc_wasi_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun schedYield(): CInt =
    libc_wasi_schedYield()

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    libc_wasi_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun chdir(dir: String?): CInt =
    libc_wasi_chdir(dir)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    libc_wasi_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    libc_wasi_nlLanginfoL(item, loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    libc_wasi_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    libc_wasi_wasilibcRegisterPreopenedFd(fd, path)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    libc_wasi_wasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    libc_wasi_wasilibcUnlinkat(fd, path)

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    libc_wasi_wasilibcRmdirat(fd, path)

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    libc_wasi_wasilibcFindRelpath(path, absPrefix?.value?.toCPointer<ByteVar>(), relativePath?.value?.toCPointer<ByteVar>(), relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    libc_wasi_wasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd, path)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd, path)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc_wasi_wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    libc_wasi_wasilibcNocwdSymlinkat(target, dirfd, path)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    libc_wasi_wasilibcNocwdReadlinkat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    libc_wasi_wasilibcNocwdFaccessat(dirfd, path, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc_wasi_wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    libc_wasi_wasilibcNocwdOpenatNomode(dirfd, path, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_wasilibcNocwdFstatat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    libc_wasi_wasilibcNocwdMkdiratNomode(dirfd, path)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_wasilibcNocwdUtimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    libc_wasi_wasilibcNocwdOpendirat(dirfd, path)?.let { DIR(it.toLong()) }

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    libc_wasi_wasilibcAccess(pathname, mode, flags)

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_wasilibcStat(pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_wasilibcUtimens(pathname, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    libc_wasi_wasilibcLink(oldpath, newpath, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    libc_wasi_wasilibcLinkOldat(olddirfd, oldpath, newpath, flags)

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    libc_wasi_wasilibcLinkNewat(oldpath, newdirfd, newpath, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    libc_wasi_wasilibcRenameOldat(olddirfd, oldpath, newpath)

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    libc_wasi_wasilibcRenameNewat(oldpath, newdirfd, newpath)

public actual fun arc4random(): UInt =
    libc_wasi_arc4random()

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    libc_wasi_arc4randomBuf(a?.value?.toCPointer<ByteVar>(), b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    libc_wasi_arc4randomUniform(a)

public actual fun errnoLocation(): COpaquePointer? =
    libc_wasi_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun chmod(path: String?, mode: ModeT): CInt =
    libc_wasi_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libc_wasi_fchmod(fd, mode)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    libc_wasi_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    libc_wasi_pthreadSelf()?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_wasi_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libc_wasi_pthreadEqual(t1?.value?.toCPointer<ByteVar>(), t2?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    libc_wasi_pthreadJoin(native?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_wasi_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    libc_wasi_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    libc_wasi_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libc_wasi_pthreadDetach(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libc_wasi_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libc_wasi_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    libc_wasi_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    libc_wasi_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    libc_wasi_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_wasi_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    libc_wasi_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_wasi_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    libc_wasi_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    libc_wasi_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    libc_wasi_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockRdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockTryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockWrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockTrywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    libc_wasi_pthreadRwlockattrDestroy(attr?.value?.toCPointer<ByteVar>())
