@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.bsd.FdSet
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.apple.Dirent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Addrinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.DlInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Lconv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadCondattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Tm
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
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadCondT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadMutexT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Sigaction
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.Stat
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664.notx32.Statvfs
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SemT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.powerpc64.Termios
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    libcUnixQsort(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())
}

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr<CVoid> =
    MutPtr(libcUnixBsearch(key.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcUnixFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr<FILE>): CInt =
    libcUnixFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr<FILE>): CInt =
    libcUnixFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    libcUnixRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    libcUnixRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(libcUnixTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcUnixSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    libcUnixSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcUnixGetchar()

public actual fun putchar(c: CInt): CInt =
    libcUnixPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    libcUnixFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcUnixFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcUnixFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    libcUnixFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr<CChar>): CInt =
    libcUnixPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcUnixUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcUnixFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcUnixFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    libcUnixFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    libcUnixFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr<FILE>) {
    libcUnixRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    libcUnixFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    libcUnixFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr<FILE>): CInt =
    libcUnixFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    libcUnixFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun clearerr(stream: MutPtr<FILE>) {
    libcUnixClearerr(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun perror(s: ConstPtr<CChar>) {
    libcUnixPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcUnixAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcUnixAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcUnixAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcUnixAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    libcUnixStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    libcUnixStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcUnixStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcUnixStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcUnixStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcUnixStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
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

public actual fun system(s: ConstPtr<CChar>): CInt =
    libcUnixSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun stpcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStpcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcUnixStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    libcUnixStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcUnixStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcUnixStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcUnixStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcUnixStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcUnixStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixStrndup(cs.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    libcUnixStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    libcUnixStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcUnixStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    libcUnixStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(libcUnixStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtokR(s: MutPtr<CChar>, t: ConstPtr<CChar>, p: MutPtr<MutPtr<CChar>>): MutPtr<CChar> =
    MutPtr(libcUnixStrtokR(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    libcUnixStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strsignal(sig: CInt): MutPtr<CChar> =
    MutPtr(libcUnixStrsignal(sig)?.toLong() ?: 0L)

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    libcUnixWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    libcUnixWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(libcUnixWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcUnixMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixMemccpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    MutPtr(libcUnixGetpwnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    MutPtr(libcUnixGetpwuid(uid)?.toLong() ?: 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcUnixGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcUnixPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    libcUnixSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    libcUnixConnect(socket, address.rawAddress.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcUnixListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcUnixAccept(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcUnixGetpeername(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcUnixGetsockname(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    libcUnixSetsockopt(socket, level, name, value.rawAddress.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    libcUnixSocketpair(domain, type, protocol, socketVector.rawAddress.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    libcUnixSendto(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libcUnixShutdown(socket, how)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libcUnixFchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    libcUnixFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcUnixStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    libcUnixPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    libcUnixFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcUnixOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcUnixOpendir(dirname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcUnixReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    libcUnixClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    libcUnixRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    libcUnixFchmodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libcUnixFchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    libcUnixFchownat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    libcUnixFstatat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    libcUnixRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    libcUnixSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    libcUnixAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun alarm(seconds: CUint): CUint =
    libcUnixAlarm(seconds)

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    libcUnixChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun fchdir(dirfd: CInt): CInt =
    libcUnixFchdir(dirfd)

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    libcUnixChown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    libcUnixLchown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun close(fd: CInt): CInt =
    libcUnixClose(fd)

public actual fun dup(fd: CInt): CInt =
    libcUnixDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcUnixDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixExecl(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixExecle(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixExeclp(file.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixExecv(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixExecve(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixExecvp(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    libcUnixFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcUnixFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun getegid(): GidT =
    libcUnixGetegid()

public actual fun geteuid(): UidT =
    libcUnixGeteuid()

public actual fun getgid(): GidT =
    libcUnixGetgid()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    libcUnixGetgroups(ngroupsMax, groups.rawAddress.toCPointer<ByteVar>())

public actual fun getlogin(): MutPtr<CChar> =
    MutPtr(libcUnixGetlogin()?.toLong() ?: 0L)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
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

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    libcUnixLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcUnixLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    libcUnixPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    libcUnixPipe(fds.rawAddress.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    libcUnixPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), align, size)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    libcUnixRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
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

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    libcUnixTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    libcUnixTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    MutPtr(libcUnixTtyname(fd)?.toLong() ?: 0L)

public actual fun ttynameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixTtynameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    libcUnixUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun wait(status: MutPtr<CInt>): PidT =
    libcUnixWait(status.rawAddress.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    libcUnixWaitpid(pid, status.rawAddress.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    libcUnixWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcUnixPread(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcUnixPwrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    libcUnixUmask(mask)

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    libcUnixUtime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libcUnixKill(pid, sig)

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    libcUnixKillpg(pgrp, sig)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcUnixMlockall(flags)

public actual fun munlockall(): CInt =
    libcUnixMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcUnixMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcUnixMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    libcUnixIfNametoindex(ifname.rawAddress.toCPointer<ByteVar>())

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixIfIndextoname(ifindex, ifname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcUnixLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libcUnixFsync(fd)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    libcUnixSetenv(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    libcUnixUnsetenv(name.rawAddress.toCPointer<ByteVar>())

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    libcUnixSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    libcUnixTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcUnixFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libcUnixSignal(signum, handler)

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    libcUnixGetrusage(resource, usage.rawAddress.toCPointer<ByteVar>())

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixRealpath(pathname.rawAddress.toCPointer<ByteVar>(), resolved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun times(buf: MutPtr<Tms>): ClockT =
    libcUnixTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libcUnixPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcUnixPthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixPthreadJoin(native.toLong().toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    libcUnixPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    libcUnixPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    libcUnixPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcUnixPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libcUnixSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcUnixPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcUnixPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcUnixPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcUnixPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcUnixPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    libcUnixPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    libcUnixPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    libcUnixPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    libcUnixPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcUnixPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcUnixPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    libcUnixPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcUnixPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    libcUnixPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcUnixPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcUnixPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcUnixPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    libcUnixPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    libcUnixPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    libcUnixPthreadRwlockInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockRdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockTryrdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockWrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockTrywrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcUnixPthreadRwlockUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcUnixPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcUnixPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    libcUnixGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    libcUnixRaise(signum)

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixUtimes(filename.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(libcUnixDlerror()?.toLong() ?: 0L)

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcUnixDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    libcUnixDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    libcUnixGetaddrinfo(node.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    libcUnixFreeaddrinfo(res.rawAddress.toCPointer<ByteVar>())
}

public actual fun hstrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(libcUnixHstrerror(errcode)?.toLong() ?: 0L)

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(libcUnixGaiStrerror(errcode)?.toLong() ?: 0L)

public actual fun resInit(): CInt =
    libcUnixResInit()

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcUnixGmtimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcUnixLocaltimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    libcUnixMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun time(time: MutPtr<TimeT>): TimeT =
    libcUnixTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcUnixGmtime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcUnixLocaltime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcUnixDifftime(time1, time0)

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    libcUnixTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcUnixMknod(pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixGethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun endservent() {
    libcUnixEndservent()
}

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(libcUnixGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getservbyport(port: CInt, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(libcUnixGetservbyport(port, proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getservent(): MutPtr<Servent> =
    MutPtr(libcUnixGetservent()?.toLong() ?: 0L)

public actual fun setservent(stayopen: CInt) {
    libcUnixSetservent(stayopen)
}

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    MutPtr(libcUnixGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    MutPtr(libcUnixGetprotobynumber(proto)?.toLong() ?: 0L)

public actual fun chroot(name: ConstPtr<CChar>): CInt =
    libcUnixChroot(name.rawAddress.toCPointer<ByteVar>())

public actual fun usleep(secs: UsecondsT): CInt =
    libcUnixUsleep(secs)

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcUnixSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcUnixRecv(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: MutPtr<CChar>): CInt =
    libcUnixPutenv(string.rawAddress.toCPointer<ByteVar>())

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    libcUnixPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    libcUnixSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(libcUnixLocaleconv()?.toLong() ?: 0L)

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    libcUnixSemWait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    libcUnixSemTrywait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    libcUnixSemPost(sem.rawAddress.toCPointer<ByteVar>())

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    libcUnixStatvfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    libcUnixFstatvfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    libcUnixSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcUnixSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    libcUnixSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcUnixSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    libcUnixSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcUnixSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    libcUnixSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libcUnixSysconf(name)

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixMkfifo(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    libcUnixFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    libcUnixFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    libcUnixTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    libcUnixCfgetispeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    libcUnixCfgetospeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcUnixCfsetispeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcUnixCfsetospeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    libcUnixTcgetattr(fd, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    libcUnixTcsetattr(fd, optionalActions, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libcUnixTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libcUnixTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    libcUnixTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libcUnixTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    libcUnixMkstemp(template.rawAddress.toCPointer<ByteVar>())

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixMkdtemp(template.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixTmpnam(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    libcUnixOpenlog(ident.rawAddress.toCPointer<ByteVar>(), logopt, facility)
}

public actual fun closelog() {
    libcUnixCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libcUnixSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixSyslog(priority, message.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun nice(incr: CInt): CInt =
    libcUnixNice(incr)

public actual fun grantpt(fd: CInt): CInt =
    libcUnixGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    libcUnixPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    MutPtr(libcUnixPtsname(fd)?.toLong() ?: 0L)

public actual fun unlockpt(fd: CInt): CInt =
    libcUnixUnlockpt(fd)

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixStrcasestr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    libcUnixGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    libcUnixLockf(fd, cmd, len)

public actual fun adjtime(delta: ConstPtr<Timeval>, olddelta: MutPtr<Timeval>): CInt =
    libcUnixAdjtime(delta.rawAddress.toCPointer<ByteVar>(), olddelta.rawAddress.toCPointer<ByteVar>())

public actual fun stpncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixStpncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT =
    libcUnixConfstr(name, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    libcUnixDladdr(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun flock(fd: CInt, operation: CInt): CInt =
    libcUnixFlock(fd, operation)

public actual fun openWmemstream(ptr: MutPtr<MutPtr<WcharT>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE> =
    MutPtr(libcUnixOpenWmemstream(ptr.rawAddress.toCPointer<ByteVar>(), sizeloc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getsid(pid: PidT): PidT =
    libcUnixGetsid(pid)

public actual fun pause(): CInt =
    libcUnixPause()

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcUnixMkdirat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    libcUnixOpenat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(libcUnixFdopendir(fd)?.toLong() ?: 0L)

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    libcUnixReaddirR(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): CInt =
    libcUnixReadlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsiz)

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): CInt =
    libcUnixReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsz)

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixPselect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    libcUnixSigaction(signum, act.rawAddress.toCPointer<ByteVar>(), oldact.rawAddress.toCPointer<ByteVar>())

public actual fun fmemopen(buf: MutPtr<CVoid>, size: SizeT, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcUnixFmemopen(buf.rawAddress.toCPointer<ByteVar>(), size, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openMemstream(ptr: MutPtr<MutPtr<CChar>>, sizeloc: MutPtr<SizeT>): MutPtr<FILE> =
    MutPtr(libcUnixOpenMemstream(ptr.rawAddress.toCPointer<ByteVar>(), sizeloc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libcUnixAtexit(0L.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: MutPtr<Termios>): CInt =
    libcUnixCfmakeraw(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcUnixCfsetspeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixFnmatch(pattern.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), flags)
