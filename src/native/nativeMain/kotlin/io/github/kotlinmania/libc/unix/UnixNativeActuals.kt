@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAbort
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAccept
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAccess
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAdjtime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAlarm
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAlignedAlloc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtexit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtof
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtoi
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtol
import io.github.kotlinmania.libc.unix.cinterop.libcUnixAtoll
import io.github.kotlinmania.libc.unix.cinterop.libcUnixBsearch
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCalloc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfgetispeed
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfgetospeed
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfmakeraw
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfsetispeed
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfsetospeed
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCfsetspeed
import io.github.kotlinmania.libc.unix.cinterop.libcUnixChdir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixChmod
import io.github.kotlinmania.libc.unix.cinterop.libcUnixChown
import io.github.kotlinmania.libc.unix.cinterop.libcUnixChroot
import io.github.kotlinmania.libc.unix.cinterop.libcUnixClearerr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixClose
import io.github.kotlinmania.libc.unix.cinterop.libcUnixClosedir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCloselog
import io.github.kotlinmania.libc.unix.cinterop.libcUnixConfstr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixConnect
import io.github.kotlinmania.libc.unix.cinterop.libcUnixCreat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDifftime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDladdr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDlclose
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDlerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDlopen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDlsym
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDup
import io.github.kotlinmania.libc.unix.cinterop.libcUnixDup2
import io.github.kotlinmania.libc.unix.cinterop.libcUnixEndservent
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExecl
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExecle
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExeclp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExecv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExecve
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExecvp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixExit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFchdir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFchmod
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFchmodat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFchown
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFchownat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFclose
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFcntl
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFdopen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFdopendir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFeof
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFflush
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFgetc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFgetpos
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFgets
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFileno
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFmemopen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFnmatch
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFopen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFork
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFpathconf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFprintf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFputc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFputs
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFread
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFree
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFreeaddrinfo
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFreopen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFscanf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFseek
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFseeko
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFsetpos
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFstat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFstatat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFstatvfs
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFsync
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFtell
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFtello
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFtruncate
import io.github.kotlinmania.libc.unix.cinterop.libcUnixFwrite
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGaiStrerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetaddrinfo
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetchar
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetcharUnlocked
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetcwd
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetegid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetenv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGeteuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetgid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetgroups
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGethostname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetline
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetlogin
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetopt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpeername
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpgid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpgrp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetppid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetprotobyname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetprotobynumber
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpwnam
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetpwuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetrusage
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetservbyname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetservbyport
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetservent
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetsid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetsockname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetsockopt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGetuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGmtime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGmtimeR
import io.github.kotlinmania.libc.unix.cinterop.libcUnixGrantpt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixHstrerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIfIndextoname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIfNametoindex
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsalnum
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsalpha
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsatty
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsblank
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIscntrl
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsdigit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsgraph
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIslower
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsprint
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIspunct
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsspace
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsupper
import io.github.kotlinmania.libc.unix.cinterop.libcUnixIsxdigit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixKill
import io.github.kotlinmania.libc.unix.cinterop.libcUnixKillpg
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLchown
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLink
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLinkat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixListen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLocaleconv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLocaltime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLocaltimeR
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLockf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLseek
import io.github.kotlinmania.libc.unix.cinterop.libcUnixLstat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMalloc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemccpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemchr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemcmp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemcpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemmove
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMemset
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMkdir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMkdirat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMkdtemp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMkfifo
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMknod
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMkstemp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMktime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMlockall
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMmap
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMunlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMunlockall
import io.github.kotlinmania.libc.unix.cinterop.libcUnixMunmap
import io.github.kotlinmania.libc.unix.cinterop.libcUnixNanosleep
import io.github.kotlinmania.libc.unix.cinterop.libcUnixNice
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpenMemstream
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpenWmemstream
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpenat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpendir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixOpenlog
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPathconf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPause
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPclose
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPipe
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPoll
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPosixMemalign
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPosixOpenpt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPread
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPrintf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPselect
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadAttrDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadAttrGetstacksize
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadAttrInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadAttrSetdetachstate
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadAttrSetstacksize
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondBroadcast
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondSignal
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondTimedwait
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondWait
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondattrDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadCondattrInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadDetach
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadEqual
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadExit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadGetspecific
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadJoin
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadKeyCreate
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadKeyDelete
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexLock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexTrylock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexUnlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexattrDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexattrInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadMutexattrSettype
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockRdlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockTryrdlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockTrywrlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockUnlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockWrlock
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockattrDestroy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadRwlockattrInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadSelf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPthreadSetspecific
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPtsname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPutchar
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPutcharUnlocked
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPutenv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPuts
import io.github.kotlinmania.libc.unix.cinterop.libcUnixPwrite
import io.github.kotlinmania.libc.unix.cinterop.libcUnixQsort
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRaise
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRead
import io.github.kotlinmania.libc.unix.cinterop.libcUnixReaddir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixReaddirR
import io.github.kotlinmania.libc.unix.cinterop.libcUnixReadlink
import io.github.kotlinmania.libc.unix.cinterop.libcUnixReadlinkat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRealloc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRealpath
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRecv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRemove
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRename
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRenameat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixResInit
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRewind
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRewinddir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixRmdir
import io.github.kotlinmania.libc.unix.cinterop.libcUnixScanf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSchedYield
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSelect
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSemPost
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSemTrywait
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSemWait
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSend
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSendto
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetbuf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetegid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetenv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSeteuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetgid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetlocale
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetlogmask
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetpgid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetregid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetreuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetservent
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetsid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetsockopt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetuid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSetvbuf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixShutdown
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigaction
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigaddset
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigdelset
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigemptyset
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigfillset
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigismember
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSignal
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigpending
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSigprocmask
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSleep
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSnprintf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSocket
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSocketpair
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSprintf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSscanf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStatvfs
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStpcpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStpncpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcasecmp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcasestr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrchr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcmp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcoll
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrcspn
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrdup
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrerror
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrlen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrncasecmp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrncat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrncmp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrncpy
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrndup
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrnlen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrpbrk
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrrchr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrsignal
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrspn
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrstr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtod
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtof
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtok
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtokR
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtol
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtoll
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtoul
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrtoull
import io.github.kotlinmania.libc.unix.cinterop.libcUnixStrxfrm
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSymlink
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSymlinkat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSysconf
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSyslog
import io.github.kotlinmania.libc.unix.cinterop.libcUnixSystem
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcdrain
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcflow
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcflush
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcgetattr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcgetpgrp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcgetsid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcsendbreak
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcsetattr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTcsetpgrp
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTimegm
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTimes
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTmpfile
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTmpnam
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTolower
import io.github.kotlinmania.libc.unix.cinterop.libcUnixToupper
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTruncate
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTtyname
import io.github.kotlinmania.libc.unix.cinterop.libcUnixTtynameR
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUmask
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUngetc
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUnlink
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUnlinkat
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUnlockpt
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUnsetenv
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUsleep
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUtime
import io.github.kotlinmania.libc.unix.cinterop.libcUnixUtimes
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWait
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWaitpid
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWcslen
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWcstombs
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWmemchr
import io.github.kotlinmania.libc.unix.cinterop.libcUnixWrite
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    libcUnixIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcUnixIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcUnixIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcUnixIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcUnixIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcUnixIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcUnixIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcUnixIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcUnixIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcUnixIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcUnixIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcUnixIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcUnixTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcUnixToupper(c)

public actual fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    libcUnixQsort(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())
}

public actual fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr =
    MutPtr(libcUnixBsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(libcUnixFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr): CInt =
    libcUnixFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr): CInt =
    libcUnixFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr): CInt =
    libcUnixRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    libcUnixRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr =
    MutPtr(libcUnixTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    libcUnixSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    libcUnixSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcUnixGetchar()

public actual fun putchar(c: CInt): CInt =
    libcUnixPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    libcUnixFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    MutPtr(libcUnixFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    libcUnixFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    libcUnixFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr): CInt =
    libcUnixPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    libcUnixUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcUnixFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcUnixFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    libcUnixFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr): CLong =
    libcUnixFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr) {
    libcUnixRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    libcUnixFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    libcUnixFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr): CInt =
    libcUnixFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr): CInt =
    libcUnixFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun clearerr(stream: MutPtr) {
    libcUnixClearerr(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun perror(s: ConstPtr) {
    libcUnixPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr): CDouble =
    libcUnixAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr): CInt =
    libcUnixAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr): CLong =
    libcUnixAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr): CLonglong =
    libcUnixAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    libcUnixStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    libcUnixStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    libcUnixStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    libcUnixStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    libcUnixStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    libcUnixStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr =
    MutPtr(libcUnixMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr) {
    libcUnixFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libcUnixAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libcUnixExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: ConstPtr): CInt =
    libcUnixSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr): MutPtr =
    MutPtr(libcUnixGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcUnixStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcUnixStpcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcUnixStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    libcUnixStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcUnixStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    libcUnixStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcUnixStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcUnixStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcUnixStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcUnixStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr): MutPtr =
    MutPtr(libcUnixStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixStrndup(cs.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcUnixStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcUnixStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcUnixStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcUnixStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr): SizeT =
    libcUnixStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    libcUnixStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr =
    MutPtr(libcUnixStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    MutPtr(libcUnixStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr =
    MutPtr(libcUnixStrtokR(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    libcUnixStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strsignal(sig: CInt): MutPtr =
    MutPtr(libcUnixStrsignal(sig)?.toLong() ?: 0L)

public actual fun wcslen(buf: ConstPtr): SizeT =
    libcUnixWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    libcUnixWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(libcUnixWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcUnixMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcUnixMemccpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun getpwnam(name: ConstPtr): MutPtr =
    MutPtr(libcUnixGetpwnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpwuid(uid: UidT): MutPtr =
    MutPtr(libcUnixGetpwuid(uid)?.toLong() ?: 0L)

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcUnixGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcUnixPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    libcUnixSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt =
    libcUnixConnect(socket, address.rawAddress.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcUnixListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    libcUnixAccept(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    libcUnixGetpeername(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    libcUnixGetsockname(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    libcUnixSetsockopt(socket, level, name, value.rawAddress.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt =
    libcUnixSocketpair(domain, type, protocol, socketVector.rawAddress.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    libcUnixSendto(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libcUnixShutdown(socket, how)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    libcUnixChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libcUnixFchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    libcUnixFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    libcUnixMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun pclose(stream: MutPtr): CInt =
    libcUnixPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr): CInt =
    libcUnixFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    libcUnixCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr): MutPtr =
    MutPtr(libcUnixOpendir(dirname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(libcUnixReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: MutPtr): CInt =
    libcUnixClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: MutPtr) {
    libcUnixRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    libcUnixFchmodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libcUnixFchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    libcUnixFchownat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    libcUnixFstatat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    libcUnixLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    libcUnixRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    libcUnixSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    libcUnixUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    libcUnixAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun alarm(seconds: CUint): CUint =
    libcUnixAlarm(seconds)

public actual fun chdir(dir: ConstPtr): CInt =
    libcUnixChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun fchdir(dirfd: CInt): CInt =
    libcUnixFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    libcUnixChown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    libcUnixLchown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun close(fd: CInt): CInt =
    libcUnixClose(fd)

public actual fun dup(fd: CInt): CInt =
    libcUnixDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcUnixDup2(src, dst)

public actual fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixExecl(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixExecle(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixExeclp(file.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr, argv: ConstPtr): CInt =
    libcUnixExecv(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    libcUnixExecve(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun execvp(c: ConstPtr, argv: ConstPtr): CInt =
    libcUnixExecvp(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    libcUnixFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcUnixFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcUnixGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun getegid(): GidT =
    libcUnixGetegid()

public actual fun geteuid(): UidT =
    libcUnixGeteuid()

public actual fun getgid(): GidT =
    libcUnixGetgid()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    libcUnixGetgroups(ngroupsMax, groups.rawAddress.toCPointer<ByteVar>())

public actual fun getlogin(): MutPtr =
    MutPtr(libcUnixGetlogin()?.toLong() ?: 0L)

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    libcUnixGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun getpgid(pid: PidT): PidT =
    libcUnixGetpgid(pid)

public actual fun getpgrp(): PidT =
    libcUnixGetpgrp()

public actual fun getpid(): PidT =
    libcUnixGetpid()

public actual fun getppid(): PidT =
    libcUnixGetppid()

public actual fun getuid(): UidT =
    libcUnixGetuid()

public actual fun isatty(fd: CInt): CInt =
    libcUnixIsatty(fd)

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    libcUnixLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcUnixLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    libcUnixPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun pipe(fds: MutPtr): CInt =
    libcUnixPipe(fds.rawAddress.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    libcUnixPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), align, size)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    libcUnixRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: ConstPtr): CInt =
    libcUnixRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun seteuid(uid: UidT): CInt =
    libcUnixSeteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libcUnixSetegid(gid)

public actual fun setgid(gid: GidT): CInt =
    libcUnixSetgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    libcUnixSetpgid(pid, pgid)

public actual fun setsid(): PidT =
    libcUnixSetsid()

public actual fun setuid(uid: UidT): CInt =
    libcUnixSetuid(uid)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    libcUnixSetreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    libcUnixSetregid(rgid, egid)

public actual fun sleep(secs: CUint): CUint =
    libcUnixSleep(secs)

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    libcUnixTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    libcUnixTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr =
    MutPtr(libcUnixTtyname(fd)?.toLong() ?: 0L)

public actual fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixTtynameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun unlink(c: ConstPtr): CInt =
    libcUnixUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun wait(status: MutPtr): PidT =
    libcUnixWait(status.rawAddress.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    libcUnixWaitpid(pid, status.rawAddress.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    libcUnixWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    libcUnixPread(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    libcUnixPwrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    libcUnixUmask(mask)

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    libcUnixUtime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libcUnixKill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    libcUnixKillpg(pgrp, sig)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    libcUnixMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    libcUnixMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcUnixMlockall(flags)

public actual fun munlockall(): CInt =
    libcUnixMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    MutPtr(libcUnixMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    libcUnixMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: ConstPtr): CUint =
    libcUnixIfNametoindex(ifname.rawAddress.toCPointer<ByteVar>())

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr =
    MutPtr(libcUnixIfIndextoname(ifindex, ifname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libcUnixFsync(fd)

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    libcUnixSetenv(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(name: ConstPtr): CInt =
    libcUnixUnsetenv(name.rawAddress.toCPointer<ByteVar>())

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    libcUnixSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    libcUnixTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcUnixFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libcUnixSignal(signum, handler)

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    libcUnixGetrusage(resource, usage.rawAddress.toCPointer<ByteVar>())

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    MutPtr(libcUnixRealpath(pathname.rawAddress.toCPointer<ByteVar>(), resolved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun times(buf: MutPtr): ClockT =
    libcUnixTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libcUnixPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcUnixPthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    libcUnixPthreadJoin(native.toLong().toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr): Nothing {
    libcUnixPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    libcUnixPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    libcUnixPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    libcUnixPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    libcUnixPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    libcUnixPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcUnixPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libcUnixSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcUnixPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcUnixPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(libcUnixPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    libcUnixPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    libcUnixPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    libcUnixPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    libcUnixPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    libcUnixPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    libcUnixPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    libcUnixPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    libcUnixPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    libcUnixPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    libcUnixPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    libcUnixPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    libcUnixPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    libcUnixPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    libcUnixPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    libcUnixPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    libcUnixPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    libcUnixPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    libcUnixPthreadRwlockInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    libcUnixPthreadRwlockDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    libcUnixPthreadRwlockRdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    libcUnixPthreadRwlockTryrdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    libcUnixPthreadRwlockWrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    libcUnixPthreadRwlockTrywrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    libcUnixPthreadRwlockUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    libcUnixPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    libcUnixPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    libcUnixGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    libcUnixRaise(signum)

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    libcUnixUtimes(filename.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(libcUnixDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr =
    MutPtr(libcUnixDlerror()?.toLong() ?: 0L)

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(libcUnixDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr): CInt =
    libcUnixDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    libcUnixGetaddrinfo(node.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: MutPtr) {
    libcUnixFreeaddrinfo(res.rawAddress.toCPointer<ByteVar>())
}

public actual fun hstrerror(errcode: CInt): ConstPtr =
    ConstPtr(libcUnixHstrerror(errcode)?.toLong() ?: 0L)

public actual fun gaiStrerror(errcode: CInt): ConstPtr =
    ConstPtr(libcUnixGaiStrerror(errcode)?.toLong() ?: 0L)

public actual fun resInit(): CInt =
    libcUnixResInit()

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcUnixGmtimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcUnixLocaltimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mktime(tm: MutPtr): TimeT =
    libcUnixMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun time(time: MutPtr): TimeT =
    libcUnixTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    MutPtr(libcUnixGmtime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timeP: ConstPtr): MutPtr =
    MutPtr(libcUnixLocaltime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcUnixDifftime(time1, time0)

public actual fun timegm(tm: MutPtr): TimeT =
    libcUnixTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    libcUnixMknod(pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    libcUnixGethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun endservent() {
    libcUnixEndservent()
}

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    MutPtr(libcUnixGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getservbyport(port: CInt, proto: ConstPtr): MutPtr =
    MutPtr(libcUnixGetservbyport(port, proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getservent(): MutPtr =
    MutPtr(libcUnixGetservent()?.toLong() ?: 0L)

public actual fun setservent(stayopen: CInt) {
    libcUnixSetservent(stayopen)
}

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    MutPtr(libcUnixGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(proto: CInt): MutPtr =
    MutPtr(libcUnixGetprotobynumber(proto)?.toLong() ?: 0L)

public actual fun chroot(name: ConstPtr): CInt =
    libcUnixChroot(name.rawAddress.toCPointer<ByteVar>())

public actual fun usleep(secs: UsecondsT): CInt =
    libcUnixUsleep(secs)

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    libcUnixSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    libcUnixRecv(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: MutPtr): CInt =
    libcUnixPutenv(string.rawAddress.toCPointer<ByteVar>())

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    libcUnixPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt =
    libcUnixSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    MutPtr(libcUnixSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr =
    MutPtr(libcUnixLocaleconv()?.toLong() ?: 0L)

public actual fun semWait(sem: MutPtr): CInt =
    libcUnixSemWait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTrywait(sem: MutPtr): CInt =
    libcUnixSemTrywait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semPost(sem: MutPtr): CInt =
    libcUnixSemPost(sem.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs(path: ConstPtr, buf: MutPtr): CInt =
    libcUnixStatvfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: MutPtr): CInt =
    libcUnixFstatvfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sigemptyset(set: MutPtr): CInt =
    libcUnixSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    libcUnixSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: MutPtr): CInt =
    libcUnixSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    libcUnixSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    libcUnixSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcUnixSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr): CInt =
    libcUnixSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libcUnixSysconf(name)

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    libcUnixMkfifo(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    libcUnixFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    libcUnixFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    libcUnixTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr): SpeedT =
    libcUnixCfgetispeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    libcUnixCfgetospeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    libcUnixCfsetispeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    libcUnixCfsetospeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    libcUnixTcgetattr(fd, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    libcUnixTcsetattr(fd, optionalActions, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libcUnixTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libcUnixTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    libcUnixTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libcUnixTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr): CInt =
    libcUnixMkstemp(template.rawAddress.toCPointer<ByteVar>())

public actual fun mkdtemp(template: MutPtr): MutPtr =
    MutPtr(libcUnixMkdtemp(template.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    MutPtr(libcUnixTmpnam(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    libcUnixOpenlog(ident.rawAddress.toCPointer<ByteVar>(), logopt, facility)
}

public actual fun closelog() {
    libcUnixCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libcUnixSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    libcUnixSyslog(priority, message.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun nice(incr: CInt): CInt =
    libcUnixNice(incr)

public actual fun grantpt(fd: CInt): CInt =
    libcUnixGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    libcUnixPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr =
    MutPtr(libcUnixPtsname(fd)?.toLong() ?: 0L)

public actual fun unlockpt(fd: CInt): CInt =
    libcUnixUnlockpt(fd)

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcUnixStrcasestr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    libcUnixGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    libcUnixLockf(fd, cmd, len)

public actual fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt =
    libcUnixAdjtime(delta.rawAddress.toCPointer<ByteVar>(), olddelta.rawAddress.toCPointer<ByteVar>())

public actual fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixStpncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    libcUnixConfstr(name, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun dladdr(addr: ConstPtr, info: MutPtr): CInt =
    libcUnixDladdr(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun flock(fd: CInt, operation: CInt): CInt =
    libcUnixFlock(fd, operation)

public actual fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    MutPtr(libcUnixOpenWmemstream(ptr.rawAddress.toCPointer<ByteVar>(), sizeloc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getsid(pid: PidT): PidT =
    libcUnixGetsid(pid)

public actual fun pause(): CInt =
    libcUnixPause()

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcUnixMkdirat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    libcUnixOpenat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fdopendir(fd: CInt): MutPtr =
    MutPtr(libcUnixFdopendir(fd)?.toLong() ?: 0L)

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    libcUnixReaddirR(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt =
    libcUnixReadlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsiz)

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt =
    libcUnixReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsz)

public actual fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt =
    libcUnixPselect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    libcUnixSigaction(signum, act.rawAddress.toCPointer<ByteVar>(), oldact.rawAddress.toCPointer<ByteVar>())

public actual fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr =
    MutPtr(libcUnixFmemopen(buf.rawAddress.toCPointer<ByteVar>(), size, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    MutPtr(libcUnixOpenMemstream(ptr.rawAddress.toCPointer<ByteVar>(), sizeloc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libcUnixAtexit(0L.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: MutPtr): CInt =
    libcUnixCfmakeraw(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt =
    libcUnixCfsetspeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    libcUnixFnmatch(pattern.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), flags)
