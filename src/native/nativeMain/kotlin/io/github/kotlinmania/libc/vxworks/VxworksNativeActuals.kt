@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAbort
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAccept
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAccess
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAlarm
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAlignedAlloc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAtexit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAtof
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAtoi
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAtol
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksAtoll
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksBind
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCalloc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCfgetospeed
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCfmakeraw
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCfsetispeed
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCfsetospeed
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksChdir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksChmod
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksChown
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClockGetres
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClockGettime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClockNanosleep
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClockSettime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClose
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksClosedir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCloselog
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksConfstr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksConnect
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksCreat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDifftime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDladdr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDlclose
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDlerror
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDlopen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDlsym
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDup
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksDup2
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksErrnoGet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksErrnoSet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksExit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFchdir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFchmod
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFchmodat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFchown
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFchownat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFclose
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFcntl
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFdopen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFeof
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFerror
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFflush
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFgetc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFgetpos
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFgets
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFileno
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFnmatch
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFopen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFpathconf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFputc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFputs
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFread
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFree
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFreeaddrinfo
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFreopen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFscanf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFseek
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFseeko
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFsetpos
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFstat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFsync
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFtell
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFtello
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFtruncate
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFutimens
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksFwrite
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGaiStrerror
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetaddrinfo
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetchar
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetcharUnlocked
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetcwd
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetegid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetenv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGeteuid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetgid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetgroups
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGethostname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetline
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetlogin
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetopt
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetpeername
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetpid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetppid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetprotobyname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetprotobynumber
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetservbyname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetsockname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetsockopt
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGettimeofday
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGetuid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGmtime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksGmtimeR
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIoctl
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsalnum
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsalpha
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsatty
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsblank
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIscntrl
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsdigit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsgraph
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIslower
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsprint
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIspunct
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsspace
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsupper
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksIsxdigit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksKill
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLinkat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksListen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLocaleconv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLocaltime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLocaltimeR
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLseek
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksLstat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMalloc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemalign
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemccpy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemchr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemcmp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemcpy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemmove
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMemset
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMkdir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMkdtemp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMkfifo
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMkstemp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMktime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMlockall
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMmap
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMprotect
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqClose
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqGetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqOpen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqReceive
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqSend
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqSetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqTimedreceive
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqTimedsend
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMqUnlink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMsync
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMunlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMunlockall
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksMunmap
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksNanosleep
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksOpen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksOpendir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksOpenlog
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPathIsAbsolute
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPathconf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPause
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPclose
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPerror
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPipe
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPoll
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPrintf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAtfork
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrGetname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrGetstacksize
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrSetdetachstate
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrSetinheritsched
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrSetname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrSetschedpolicy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadAttrSetstacksize
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondBroadcast
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondSignal
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondTimedwait
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondWait
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondattrGetclock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCondattrSetclock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadCreate
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadDetach
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadEqual
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadExit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadGetschedparam
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadGetspecific
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadJoin
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadKeyCreate
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadKeyDelete
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexLock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexTimedlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexTrylock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexUnlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadMutexattrSettype
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockRdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockTimedrdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockTimedwrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockTryrdlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockTrywrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockUnlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockWrlock
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockattrDestroy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockattrInit
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadRwlockattrSetmaxreaders
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadSelf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadSetschedparam
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadSetspecific
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPthreadSigmask
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPutchar
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPutcharUnlocked
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPutenv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksPuts
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRaise
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRandABytes
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRandBytes
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRandSecure
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRandUBytes
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRead
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksReaddir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksReaddirR
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksReadlink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksReadv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRealloc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRealpath
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRecv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRecvfrom
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRecvmsg
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRemove
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRename
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRewind
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRewinddir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRmdir
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRtpInfoGet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksRtpSpawn
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksScanf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedGetPriorityMax
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedGetPriorityMin
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedGetparam
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedGetscheduler
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedRrGetInterval
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedSetparam
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedSetscheduler
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSchedYield
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSend
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSendmsg
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSendto
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetbuf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetegid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetenv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSeteuid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetgid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetlocale
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetlogmask
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetpgid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetsockopt
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetuid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSetvbuf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksShmOpen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksShmUnlink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksShutdown
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigaction
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigaddset
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigdelset
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigemptyset
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigfillset
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigismember
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSignal
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigpending
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSigprocmask
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSleep
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSnprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSocket
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSprintf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSscanf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcasecmp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrchr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcmp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcoll
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcpy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrcspn
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrdup
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrerror
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrerrorR
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrlen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrncasecmp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrncat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrncmp
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrncpy
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrnlen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrpbrk
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrrchr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrspn
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrstr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtod
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtof
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtok
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtol
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtoll
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtoul
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrtoull
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksStrxfrm
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSymlink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSymlinkat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSysconf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSyslog
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksSystem
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTaskDelay
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTaskIdSelf
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTaskKill
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTaskNameGet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTaskNameSet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTcflush
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTcgetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTcsendbreak
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTcsetattr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTimegm
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTimes
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTmpfile
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTmpnam
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTolower
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksToupper
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTruncate
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksTtyname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUmask
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUname
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUngetc
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUnlink
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUnlinkat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUnsetenv
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUsleep
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUtime
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUtimensat
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksUtimes
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksVxCpuConfiguredGet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksVxCpuEnabledGet
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWait
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWaitpid
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWcslen
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWcstombs
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWmemchr
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWrite
import io.github.kotlinmania.libc.vxworks.cinterop.libcVxworksWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    libcVxworksIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcVxworksIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcVxworksIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcVxworksIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcVxworksIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcVxworksIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcVxworksIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcVxworksIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcVxworksIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcVxworksIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcVxworksIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcVxworksIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcVxworksTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcVxworksToupper(c)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcVxworksFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcVxworksFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr<FILE>): CInt =
    libcVxworksFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr<FILE>): CInt =
    libcVxworksFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    libcVxworksRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    libcVxworksRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(libcVxworksTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcVxworksSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    libcVxworksSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcVxworksGetchar()

public actual fun putchar(c: CInt): CInt =
    libcVxworksPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    libcVxworksFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcVxworksFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcVxworksFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    libcVxworksFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr<CChar>): CInt =
    libcVxworksPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcVxworksUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcVxworksFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcVxworksFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    libcVxworksFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    libcVxworksFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr<FILE>) {
    libcVxworksRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    libcVxworksFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    libcVxworksFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr<FILE>): CInt =
    libcVxworksFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    libcVxworksFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun perror(s: ConstPtr<CChar>) {
    libcVxworksPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcVxworksAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcVxworksAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcVxworksAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcVxworksAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    libcVxworksStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    libcVxworksStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcVxworksStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcVxworksStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcVxworksStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcVxworksStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
    libcVxworksFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libcVxworksAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libcVxworksExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    libcVxworksAtexit(0L.toCPointer<ByteVar>())

public actual fun system(s: ConstPtr<CChar>): CInt =
    libcVxworksSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    libcVxworksCfgetospeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: MutPtr<Termios>): CInt =
    libcVxworksCfmakeraw(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcVxworksCfsetispeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcVxworksCfsetospeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcVxworksStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcVxworksStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcVxworksStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    libcVxworksStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcVxworksStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcVxworksStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcVxworksStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcVxworksStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcVxworksStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    libcVxworksStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    libcVxworksStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcVxworksStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    libcVxworksStrnlen(cs.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(libcVxworksStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    libcVxworksStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    libcVxworksWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    libcVxworksWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(libcVxworksWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcVxworksMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemccpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcVxworksUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun times(buf: MutPtr<Tms>): ClockT =
    libcVxworksTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libcVxworksTcflush(fd, action)

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    libcVxworksPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksMkdtemp(template.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcVxworksLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    libcVxworksUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    MutPtr(libcVxworksGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    MutPtr(libcVxworksGetprotobynumber(proto)?.toLong() ?: 0L)

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(libcVxworksGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    libcVxworksFchownat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), owner, group, flags)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcVxworksSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcVxworksGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcVxworksPutcharUnlocked(c)

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcVxworksStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcVxworksFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    libcVxworksFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcVxworksCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    libcVxworksRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libcVxworksFchown(fd, owner, group)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    libcVxworksAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun alarm(seconds: CUint): CUint =
    libcVxworksAlarm(seconds)

public actual fun fchdir(dirfd: CInt): CInt =
    libcVxworksFchdir(dirfd)

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    libcVxworksChown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcVxworksFpathconf(filedes, name)

public actual fun getegid(): GidT =
    libcVxworksGetegid()

public actual fun geteuid(): UidT =
    libcVxworksGeteuid()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    libcVxworksGetgroups(ngroupsMax, groups.rawAddress.toCPointer<ByteVar>())

public actual fun getlogin(): MutPtr<CChar> =
    MutPtr(libcVxworksGetlogin()?.toLong() ?: 0L)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    libcVxworksGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    libcVxworksPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun pause(): CInt =
    libcVxworksPause()

public actual fun seteuid(uid: UidT): CInt =
    libcVxworksSeteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libcVxworksSetegid(gid)

public actual fun sleep(secs: CUint): CUint =
    libcVxworksSleep(secs)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    MutPtr(libcVxworksTtyname(fd)?.toLong() ?: 0L)

public actual fun wait(status: MutPtr<CInt>): PidT =
    libcVxworksWait(status.rawAddress.toCPointer<ByteVar>())

public actual fun umask(mask: ModeT): ModeT =
    libcVxworksUmask(mask)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcVxworksMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcVxworksMlockall(flags)

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcVxworksMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlockall(): CInt =
    libcVxworksMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcVxworksMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcVxworksMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcVxworksMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcVxworksMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    libcVxworksTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcVxworksShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcVxworksShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcVxworksGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    libcVxworksPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    libcVxworksPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcVxworksPthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcVxworksStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcVxworksSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    libcVxworksSigaction(signum, act.rawAddress.toCPointer<ByteVar>(), oldact.rawAddress.toCPointer<ByteVar>())

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcVxworksUtimes(filename.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcVxworksFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcVxworksUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcVxworksDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(libcVxworksDlerror()?.toLong() ?: 0L)

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcVxworksDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    libcVxworksDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr(addr: MutPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    libcVxworksDladdr(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcVxworksGmtimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcVxworksLocaltimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    libcVxworksMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun time(time: MutPtr<TimeT>): TimeT =
    libcVxworksTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcVxworksGmtime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcVxworksLocaltime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    libcVxworksTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcVxworksDifftime(time1, time0)

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcVxworksGethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun usleep(secs: UsecondsT): CInt =
    libcVxworksUsleep(secs)

public actual fun putenv(string: MutPtr<CChar>): CInt =
    libcVxworksPutenv(string.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(libcVxworksLocaleconv()?.toLong() ?: 0L)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcVxworksSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    libcVxworksSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcVxworksMkfifo(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    libcVxworksFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    libcVxworksFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    libcVxworksMkstemp(template.rawAddress.toCPointer<ByteVar>())

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksTmpnam(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    libcVxworksOpenlog(ident.rawAddress.toCPointer<ByteVar>(), logopt, facility)
}

public actual fun closelog() {
    libcVxworksCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libcVxworksSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcVxworksSyslog(priority, message.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    libcVxworksGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    libcVxworksTcsetattr(fd, optionalActions, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    libcVxworksTcgetattr(fd, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libcVxworksTcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT =
    libcVxworksConfstr(name, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    libcVxworksFnmatch(pattern.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    libcVxworksSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    libcVxworksFchmodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    libcVxworksUtime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr<CVoid> =
    MutPtr(libcVxworksMemalign(blockSize, sizeArg)?.toLong() ?: 0L)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(libcVxworksGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun chdir(attr: ConstPtr<CChar>): CInt =
    libcVxworksChdir(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcVxworksPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcVxworksPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(pAttr: MutPtr<PthreadMutexattrT>, pType: CInt): CInt =
    libcVxworksPthreadMutexattrSettype(pAttr.rawAddress.toCPointer<ByteVar>(), pType)

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcVxworksPthreadMutexInit(mutex.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    libcVxworksPthreadMutexDestroy(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcVxworksPthreadMutexLock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcVxworksPthreadMutexTrylock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(attr: MutPtr<PthreadMutexT>, spec: ConstPtr<Timespec>): CInt =
    libcVxworksPthreadMutexTimedlock(attr.rawAddress.toCPointer<ByteVar>(), spec.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    libcVxworksPthreadMutexUnlock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetname(pAttr: MutPtr<PthreadAttrT>, name: MutPtr<CChar>): CInt =
    libcVxworksPthreadAttrSetname(pAttr.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    libcVxworksPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    libcVxworksPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcVxworksPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(pThread: MutPtr<PthreadT>, pAttr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr<CVoid>): CInt =
    libcVxworksPthreadCreate(pThread.rawAddress.toCPointer<ByteVar>(), pAttr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcVxworksPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    libcVxworksPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    libcVxworksPthreadAttrSetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    libcVxworksPthreadAttrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrDestroy(thread: MutPtr<PthreadAttrT>): CInt =
    libcVxworksPthreadAttrDestroy(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcVxworksPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    libcVxworksPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    libcVxworksFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcVxworksLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcVxworksFtruncate(fd, length)

public actual fun readdirR(pDir: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    libcVxworksReaddirR(pDir.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readdir(pDir: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcVxworksReaddir(pDir.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    libcVxworksPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    libcVxworksPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    libcVxworksPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr<PthreadCondattrT>, pClockId: MutPtr<ClockidT>): CInt =
    libcVxworksPthreadCondattrGetclock(pAttr.rawAddress.toCPointer<ByteVar>(), pClockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(pAttr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcVxworksPthreadCondattrSetclock(pAttr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcVxworksPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcVxworksPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcVxworksPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcVxworksPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    libcVxworksPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcVxworksPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcVxworksPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr<PthreadRwlockattrT>, attr2: CUint): CInt =
    libcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress.toCPointer<ByteVar>(), attr2)

public actual fun pthreadRwlockInit(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<PthreadRwlockattrT>): CInt =
    libcVxworksPthreadRwlockInit(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockRdlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockTryrdlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    libcVxworksPthreadRwlockTimedrdlock(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockWrlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockTrywrlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    libcVxworksPthreadRwlockTimedwrlock(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(attr: MutPtr<PthreadRwlockT>): CInt =
    libcVxworksPthreadRwlockUnlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcVxworksPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcVxworksPthreadKeyDelete(key)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcVxworksPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcVxworksPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcVxworksPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetname(attr: MutPtr<PthreadAttrT>, name: MutPtr<MutPtr<CChar>>): CInt =
    libcVxworksPthreadAttrGetname(attr.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr<MutPtr<CVoid>>): CInt =
    libcVxworksPthreadJoin(thread.toLong().toCPointer<ByteVar>(), status.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libcVxworksPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcVxworksClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcVxworksClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    libcVxworksClockGetres(clockId, res.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcVxworksNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun accept(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    libcVxworksAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    libcVxworksBind(fd, addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun connect(s: CInt, name: ConstPtr<Sockaddr>, namelen: SocklenT): CInt =
    libcVxworksConnect(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: CInt, name: MutPtr<Sockaddr>, namelen: MutPtr<SocklenT>): CInt =
    libcVxworksGetpeername(s, name.rawAddress.toCPointer<ByteVar>(), namelen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcVxworksGetsockname(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    libcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcVxworksListen(socket, backlog)

public actual fun recv(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt): SsizeT =
    libcVxworksRecv(s, buf.rawAddress.toCPointer<ByteVar>(), bufLen, flags)

public actual fun recvfrom(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt, from: MutPtr<Sockaddr>, pFromLen: MutPtr<SocklenT>): SsizeT =
    libcVxworksRecvfrom(s, buf.rawAddress.toCPointer<ByteVar>(), bufLen, flags, from.rawAddress.toCPointer<ByteVar>(), pFromLen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, mp: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcVxworksRecvmsg(socket, mp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcVxworksSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sendmsg(socket: CInt, mp: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcVxworksSendmsg(socket, mp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    libcVxworksSendto(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    libcVxworksSetsockopt(socket, level, name, value.rawAddress.toCPointer<ByteVar>(), optionLen)

public actual fun shutdown(s: CInt, how: CInt): CInt =
    libcVxworksShutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libcVxworksSocket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun gaiStrerror(errcode: CInt): MutPtr<CChar> =
    MutPtr(libcVxworksGaiStrerror(errcode)?.toLong() ?: 0L)

public actual fun close(fd: CInt): CInt =
    libcVxworksClose(fd)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    libcVxworksRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    libcVxworksWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun isatty(fd: CInt): CInt =
    libcVxworksIsatty(fd)

public actual fun dup(src: CInt): CInt =
    libcVxworksDup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcVxworksDup2(src, dst)

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    libcVxworksPipe(fds.rawAddress.toCPointer<ByteVar>())

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    libcVxworksUnlink(pathname.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcVxworksLseek(fd, offset, whence)

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    libcVxworksGetaddrinfo(node.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    libcVxworksFreeaddrinfo(res.rawAddress.toCPointer<ByteVar>())
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libcVxworksSignal(signum, handler)

public actual fun getpid(): PidT =
    libcVxworksGetpid()

public actual fun getppid(): PidT =
    libcVxworksGetppid()

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    libcVxworksSetpgid(pid, pgid)

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    libcVxworksWaitpid(pid, status.rawAddress.toCPointer<ByteVar>(), options)

public actual fun sysconf(attr: CInt): CLong =
    libcVxworksSysconf(attr)

public actual fun setenv(envVarName: ConstPtr<CChar>, envVarValue: ConstPtr<CChar>, overwrite: CInt): CInt =
    libcVxworksSetenv(envVarName.rawAddress.toCPointer<ByteVar>(), envVarValue.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(envVarName: ConstPtr<CChar>): CInt =
    libcVxworksUnsetenv(envVarName.rawAddress.toCPointer<ByteVar>())

public actual fun realpath(fileName: ConstPtr<CChar>, resolvedName: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcVxworksRealpath(fileName.rawAddress.toCPointer<ByteVar>(), resolvedName.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    libcVxworksLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: SizeT): SsizeT =
    libcVxworksReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    libcVxworksSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcVxworksOpendir(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    libcVxworksRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(dirName: ConstPtr<CChar>, mode: ModeT): CInt =
    libcVxworksMkdir(dirName.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcVxworksChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    libcVxworksFchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    libcVxworksFsync(fd)

public actual fun closedir(ptr: MutPtr<DIR>): CInt =
    libcVxworksClosedir(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcVxworksSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcVxworksSchedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcVxworksSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcVxworksSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcVxworksSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcVxworksSchedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    libcVxworksSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libcVxworksSchedYield()

public actual fun errnoSet(err: CInt): CInt =
    libcVxworksErrnoSet(err)

public actual fun errnoGet(): CInt =
    libcVxworksErrnoGet()

public actual fun setgid(gid: GidT): CInt =
    libcVxworksSetgid(gid)

public actual fun getgid(): GidT =
    libcVxworksGetgid()

public actual fun setuid(uid: UidT): CInt =
    libcVxworksSetuid(uid)

public actual fun getuid(): UidT =
    libcVxworksGetuid()

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    libcVxworksSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    libcVxworksSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcVxworksSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    libcVxworksSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    libcVxworksPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oset.rawAddress.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, signo: CInt): CInt =
    libcVxworksKill(pid, signo)

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    0

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    libcVxworksTaskKill(taskId, signo)

public actual fun raise(signo: CInt): CInt =
    libcVxworksRaise(signo)

public actual fun taskIdSelf(): TaskId =
    libcVxworksTaskIdSelf()

public actual fun taskDelay(ticks: VxTicksT): CInt =
    libcVxworksTaskDelay(ticks)

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr<CChar>): CInt =
    libcVxworksTaskNameSet(taskId, taskName.rawAddress.toCPointer<ByteVar>())

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr<CChar>, bufsize: SizeT): CInt =
    libcVxworksTaskNameGet(taskId, bufName.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr<RtpDesc>): CInt =
    libcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress.toCPointer<ByteVar>())

public actual fun rtpSpawn(pubrtpFileName: ConstPtr<CChar>, argv: MutPtr<ConstPtr<CChar>>, envp: MutPtr<ConstPtr<CChar>>, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    libcVxworksRtpSpawn(pubrtpFileName.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), priority, uStackSize, options, taskOptions)

public actual fun pathIsAbsolute(filepath: ConstPtr<CChar>, pNameTail: MutPtr<ConstPtr<CChar>>): Bool =
    libcVxworksPathIsAbsolute(filepath.rawAddress.toCPointer<ByteVar>(), pNameTail.rawAddress.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcVxworksWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcVxworksReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun randBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    libcVxworksRandBytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randABytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    libcVxworksRandABytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randUBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    libcVxworksRandUBytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randSecure(): CInt =
    libcVxworksRandSecure()

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcVxworksMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcVxworksMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcVxworksMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcVxworksMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcVxworksMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcVxworksMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcVxworksMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    libcVxworksMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    libcVxworksMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun vxCpuEnabledGet(): CpusetT =
    libcVxworksVxCpuEnabledGet()

public actual fun vxCpuConfiguredGet(): CpusetT =
    libcVxworksVxCpuConfiguredGet()
