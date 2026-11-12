@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(libcVxworksFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    MutPtr(libcVxworksFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr): CInt =
    libcVxworksFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr): CInt =
    libcVxworksFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr): CInt =
    libcVxworksRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    libcVxworksRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr =
    MutPtr(libcVxworksTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    libcVxworksSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    libcVxworksSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcVxworksGetchar()

public actual fun putchar(c: CInt): CInt =
    libcVxworksPutchar(c)

public actual fun fgetc(stream: MutPtr): CInt =
    libcVxworksFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    MutPtr(libcVxworksFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    libcVxworksFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    libcVxworksFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr): CInt =
    libcVxworksPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    libcVxworksUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcVxworksFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    libcVxworksFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    libcVxworksFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr): CLong =
    libcVxworksFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr) {
    libcVxworksRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    libcVxworksFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    libcVxworksFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr): CInt =
    libcVxworksFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr): CInt =
    libcVxworksFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun perror(s: ConstPtr) {
    libcVxworksPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr): CDouble =
    libcVxworksAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr): CInt =
    libcVxworksAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr): CLong =
    libcVxworksAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr): CLonglong =
    libcVxworksAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    libcVxworksStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    libcVxworksStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    libcVxworksStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    libcVxworksStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    libcVxworksStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    libcVxworksStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    MutPtr(libcVxworksCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr =
    MutPtr(libcVxworksMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcVxworksRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr) {
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

public actual fun system(s: ConstPtr): CInt =
    libcVxworksSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr): MutPtr =
    MutPtr(libcVxworksGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    libcVxworksCfgetospeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: MutPtr): CInt =
    libcVxworksCfmakeraw(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    libcVxworksCfsetispeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    libcVxworksCfsetospeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcVxworksStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcVxworksStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    libcVxworksStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcVxworksStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    libcVxworksStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcVxworksStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcVxworksStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcVxworksStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcVxworksStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcVxworksStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcVxworksStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr): SizeT =
    libcVxworksStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    libcVxworksStrnlen(cs.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strerror(n: CInt): MutPtr =
    MutPtr(libcVxworksStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    MutPtr(libcVxworksStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    libcVxworksStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun wcslen(buf: ConstPtr): SizeT =
    libcVxworksWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    libcVxworksWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcVxworksMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    MutPtr(libcVxworksWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcVxworksMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcVxworksMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcVxworksMemccpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcVxworksMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcVxworksMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    MutPtr(libcVxworksAlignedAlloc(alignment, size)?.toLong() ?: 0L)

public actual fun uname(buf: MutPtr): CInt =
    libcVxworksUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun times(buf: MutPtr): ClockT =
    libcVxworksTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libcVxworksTcflush(fd, action)

public actual fun pclose(stream: MutPtr): CInt =
    libcVxworksPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun mkdtemp(template: MutPtr): MutPtr =
    MutPtr(libcVxworksMkdtemp(template.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    libcVxworksLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    libcVxworksUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    MutPtr(libcVxworksGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(proto: CInt): MutPtr =
    MutPtr(libcVxworksGetprotobynumber(proto)?.toLong() ?: 0L)

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    MutPtr(libcVxworksGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    libcVxworksFchownat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), owner, group, flags)

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcVxworksSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcVxworksGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcVxworksPutcharUnlocked(c)

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    libcVxworksStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    MutPtr(libcVxworksFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr): CInt =
    libcVxworksFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    libcVxworksCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun rewinddir(dirp: MutPtr) {
    libcVxworksRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libcVxworksFchown(fd, owner, group)

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    libcVxworksAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun alarm(seconds: CUint): CUint =
    libcVxworksAlarm(seconds)

public actual fun fchdir(dirfd: CInt): CInt =
    libcVxworksFchdir(dirfd)

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    libcVxworksChown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcVxworksFpathconf(filedes, name)

public actual fun getegid(): GidT =
    libcVxworksGetegid()

public actual fun geteuid(): UidT =
    libcVxworksGeteuid()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    libcVxworksGetgroups(ngroupsMax, groups.rawAddress.toCPointer<ByteVar>())

public actual fun getlogin(): MutPtr =
    MutPtr(libcVxworksGetlogin()?.toLong() ?: 0L)

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    libcVxworksGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    libcVxworksPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun pause(): CInt =
    libcVxworksPause()

public actual fun seteuid(uid: UidT): CInt =
    libcVxworksSeteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libcVxworksSetegid(gid)

public actual fun sleep(secs: CUint): CUint =
    libcVxworksSleep(secs)

public actual fun ttyname(fd: CInt): MutPtr =
    MutPtr(libcVxworksTtyname(fd)?.toLong() ?: 0L)

public actual fun wait(status: MutPtr): PidT =
    libcVxworksWait(status.rawAddress.toCPointer<ByteVar>())

public actual fun umask(mask: ModeT): ModeT =
    libcVxworksUmask(mask)

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    libcVxworksMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcVxworksMlockall(flags)

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    libcVxworksMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlockall(): CInt =
    libcVxworksMunlockall()

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    MutPtr(libcVxworksMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    libcVxworksMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcVxworksMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    libcVxworksMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    libcVxworksTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    libcVxworksShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmUnlink(name: ConstPtr): CInt =
    libcVxworksShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcVxworksGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr): Nothing {
    libcVxworksPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    libcVxworksPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcVxworksPthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcVxworksStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    libcVxworksSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    libcVxworksSigaction(signum, act.rawAddress.toCPointer<ByteVar>(), oldact.rawAddress.toCPointer<ByteVar>())

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    libcVxworksUtimes(filename.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcVxworksFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcVxworksUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(libcVxworksDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr =
    MutPtr(libcVxworksDlerror()?.toLong() ?: 0L)

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    MutPtr(libcVxworksDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr): CInt =
    libcVxworksDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr(addr: MutPtr, info: MutPtr): CInt =
    libcVxworksDladdr(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcVxworksGmtimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(libcVxworksLocaltimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mktime(tm: MutPtr): TimeT =
    libcVxworksMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun time(time: MutPtr): TimeT =
    libcVxworksTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    MutPtr(libcVxworksGmtime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timeP: ConstPtr): MutPtr =
    MutPtr(libcVxworksLocaltime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun timegm(tm: MutPtr): TimeT =
    libcVxworksTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    libcVxworksDifftime(time1, time0)

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    libcVxworksGethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun usleep(secs: UsecondsT): CInt =
    libcVxworksUsleep(secs)

public actual fun putenv(string: MutPtr): CInt =
    libcVxworksPutenv(string.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    MutPtr(libcVxworksSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr =
    MutPtr(libcVxworksLocaleconv()?.toLong() ?: 0L)

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcVxworksSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr): CInt =
    libcVxworksSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    libcVxworksMkfifo(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    libcVxworksFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    libcVxworksFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemp(template: MutPtr): CInt =
    libcVxworksMkstemp(template.rawAddress.toCPointer<ByteVar>())

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    MutPtr(libcVxworksTmpnam(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    libcVxworksOpenlog(ident.rawAddress.toCPointer<ByteVar>(), logopt, facility)
}

public actual fun closelog() {
    libcVxworksCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libcVxworksSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    libcVxworksSyslog(priority, message.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    libcVxworksGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    libcVxworksTcsetattr(fd, optionalActions, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    libcVxworksTcgetattr(fd, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libcVxworksTcsendbreak(fd, duration)

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    libcVxworksConfstr(name, buf.rawAddress.toCPointer<ByteVar>(), len)

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    libcVxworksFnmatch(pattern.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    libcVxworksSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    libcVxworksFchmodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    libcVxworksUtime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr =
    MutPtr(libcVxworksMemalign(blockSize, sizeArg)?.toLong() ?: 0L)

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcVxworksGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun chdir(attr: ConstPtr): CInt =
    libcVxworksChdir(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    libcVxworksPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    libcVxworksPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(pAttr: MutPtr, pType: CInt): CInt =
    libcVxworksPthreadMutexattrSettype(pAttr.rawAddress.toCPointer<ByteVar>(), pType)

public actual fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt =
    libcVxworksPthreadMutexInit(mutex.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(mutex: MutPtr): CInt =
    libcVxworksPthreadMutexDestroy(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(mutex: MutPtr): CInt =
    libcVxworksPthreadMutexLock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(mutex: MutPtr): CInt =
    libcVxworksPthreadMutexTrylock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(attr: MutPtr, spec: ConstPtr): CInt =
    libcVxworksPthreadMutexTimedlock(attr.rawAddress.toCPointer<ByteVar>(), spec.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(mutex: MutPtr): CInt =
    libcVxworksPthreadMutexUnlock(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetname(pAttr: MutPtr, name: MutPtr): CInt =
    libcVxworksPthreadAttrSetname(pAttr.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt =
    libcVxworksPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    libcVxworksPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    libcVxworksPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(pThread: MutPtr, pAttr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr): CInt =
    libcVxworksPthreadCreate(pThread.rawAddress.toCPointer<ByteVar>(), pAttr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcVxworksPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcVxworksPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    libcVxworksPthreadAttrSetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    libcVxworksPthreadAttrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrDestroy(thread: MutPtr): CInt =
    libcVxworksPthreadAttrDestroy(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcVxworksPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    libcVxworksPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    libcVxworksFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    libcVxworksLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcVxworksFtruncate(fd, length)

public actual fun readdirR(pDir: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    libcVxworksReaddirR(pDir.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun readdir(pDir: MutPtr): MutPtr =
    MutPtr(libcVxworksReaddir(pDir.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    libcVxworksPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    libcVxworksPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    libcVxworksPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr, pClockId: MutPtr): CInt =
    libcVxworksPthreadCondattrGetclock(pAttr.rawAddress.toCPointer<ByteVar>(), pClockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(pAttr: MutPtr, clockId: ClockidT): CInt =
    libcVxworksPthreadCondattrSetclock(pAttr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    libcVxworksPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    libcVxworksPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    libcVxworksPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    libcVxworksPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt =
    libcVxworksPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr, attr2: CUint): CInt =
    libcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress.toCPointer<ByteVar>(), attr2)

public actual fun pthreadRwlockInit(attr: MutPtr, host: ConstPtr): CInt =
    libcVxworksPthreadRwlockInit(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockRdlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockTryrdlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr, host: ConstPtr): CInt =
    libcVxworksPthreadRwlockTimedrdlock(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockWrlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockTrywrlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr, host: ConstPtr): CInt =
    libcVxworksPthreadRwlockTimedwrlock(attr.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(attr: MutPtr): CInt =
    libcVxworksPthreadRwlockUnlock(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcVxworksPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcVxworksPthreadKeyDelete(key)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    libcVxworksPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(libcVxworksPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt =
    libcVxworksPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), mutex.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetname(attr: MutPtr, name: MutPtr): CInt =
    libcVxworksPthreadAttrGetname(attr.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr): CInt =
    libcVxworksPthreadJoin(thread.toLong().toCPointer<ByteVar>(), status.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libcVxworksPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    libcVxworksClockGettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    libcVxworksClockSettime(clockId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    libcVxworksClockGetres(clockId, res.rawAddress.toCPointer<ByteVar>())

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcVxworksNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun accept(s: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    libcVxworksAccept(s, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    libcVxworksBind(fd, addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun connect(s: CInt, name: ConstPtr, namelen: SocklenT): CInt =
    libcVxworksConnect(s, name.rawAddress.toCPointer<ByteVar>(), namelen)

public actual fun getpeername(s: CInt, name: MutPtr, namelen: MutPtr): CInt =
    libcVxworksGetpeername(s, name.rawAddress.toCPointer<ByteVar>(), namelen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    libcVxworksGetsockname(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    libcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcVxworksListen(socket, backlog)

public actual fun recv(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt): SsizeT =
    libcVxworksRecv(s, buf.rawAddress.toCPointer<ByteVar>(), bufLen, flags)

public actual fun recvfrom(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt, from: MutPtr, pFromLen: MutPtr): SsizeT =
    libcVxworksRecvfrom(s, buf.rawAddress.toCPointer<ByteVar>(), bufLen, flags, from.rawAddress.toCPointer<ByteVar>(), pFromLen.rawAddress.toCPointer<ByteVar>())

public actual fun recvmsg(socket: CInt, mp: MutPtr, flags: CInt): SsizeT =
    libcVxworksRecvmsg(socket, mp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    libcVxworksSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun sendmsg(socket: CInt, mp: ConstPtr, flags: CInt): SsizeT =
    libcVxworksSendmsg(socket, mp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    libcVxworksSendto(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    libcVxworksSetsockopt(socket, level, name, value.rawAddress.toCPointer<ByteVar>(), optionLen)

public actual fun shutdown(s: CInt, how: CInt): CInt =
    libcVxworksShutdown(s, how)

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libcVxworksSocket(domain, type, protocol)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun gaiStrerror(errcode: CInt): MutPtr =
    MutPtr(libcVxworksGaiStrerror(errcode)?.toLong() ?: 0L)

public actual fun close(fd: CInt): CInt =
    libcVxworksClose(fd)

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    libcVxworksRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    libcVxworksWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun isatty(fd: CInt): CInt =
    libcVxworksIsatty(fd)

public actual fun dup(src: CInt): CInt =
    libcVxworksDup(src)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcVxworksDup2(src, dst)

public actual fun pipe(fds: MutPtr): CInt =
    libcVxworksPipe(fds.rawAddress.toCPointer<ByteVar>())

public actual fun unlink(pathname: ConstPtr): CInt =
    libcVxworksUnlink(pathname.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcVxworksLseek(fd, offset, whence)

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    libcVxworksGetaddrinfo(node.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: MutPtr) {
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

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    libcVxworksWaitpid(pid, status.rawAddress.toCPointer<ByteVar>(), options)

public actual fun sysconf(attr: CInt): CLong =
    libcVxworksSysconf(attr)

public actual fun setenv(envVarName: ConstPtr, envVarValue: ConstPtr, overwrite: CInt): CInt =
    libcVxworksSetenv(envVarName.rawAddress.toCPointer<ByteVar>(), envVarValue.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(envVarName: ConstPtr): CInt =
    libcVxworksUnsetenv(envVarName.rawAddress.toCPointer<ByteVar>())

public actual fun realpath(fileName: ConstPtr, resolvedName: MutPtr): MutPtr =
    MutPtr(libcVxworksRealpath(fileName.rawAddress.toCPointer<ByteVar>(), resolvedName.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    libcVxworksLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsize: SizeT): SsizeT =
    libcVxworksReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    libcVxworksSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun opendir(name: ConstPtr): MutPtr =
    MutPtr(libcVxworksOpendir(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rmdir(path: ConstPtr): CInt =
    libcVxworksRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(dirName: ConstPtr, mode: ModeT): CInt =
    libcVxworksMkdir(dirName.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    libcVxworksChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    libcVxworksFchmod(attr1, attr2)

public actual fun fsync(fd: CInt): CInt =
    libcVxworksFsync(fd)

public actual fun closedir(ptr: MutPtr): CInt =
    libcVxworksClosedir(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcVxworksSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcVxworksSchedGetPriorityMin(policy)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcVxworksSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcVxworksSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcVxworksSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcVxworksSchedGetscheduler(pid)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
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

public actual fun sigemptyset(set: MutPtr): CInt =
    libcVxworksSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigfillset(set: MutPtr): CInt =
    libcVxworksSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    libcVxworksSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    libcVxworksSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt =
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

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr): CInt =
    libcVxworksTaskNameSet(taskId, taskName.rawAddress.toCPointer<ByteVar>())

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr, bufsize: SizeT): CInt =
    libcVxworksTaskNameGet(taskId, bufName.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr): CInt =
    libcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress.toCPointer<ByteVar>())

public actual fun rtpSpawn(pubrtpFileName: ConstPtr, argv: MutPtr, envp: MutPtr, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    libcVxworksRtpSpawn(pubrtpFileName.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), priority, uStackSize, options, taskOptions)

public actual fun pathIsAbsolute(filepath: ConstPtr, pNameTail: MutPtr): Bool =
    libcVxworksPathIsAbsolute(filepath.rawAddress.toCPointer<ByteVar>(), pNameTail.rawAddress.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcVxworksWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcVxworksReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun randBytes(buf: MutPtr, length: CInt): CInt =
    libcVxworksRandBytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randABytes(buf: MutPtr, length: CInt): CInt =
    libcVxworksRandABytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randUBytes(buf: MutPtr, length: CInt): CInt =
    libcVxworksRandUBytes(buf.rawAddress.toCPointer<ByteVar>(), length)

public actual fun randSecure(): CInt =
    libcVxworksRandSecure()

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcVxworksMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcVxworksMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr): CInt =
    libcVxworksMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    libcVxworksMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    libcVxworksMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    libcVxworksMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    libcVxworksMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    libcVxworksMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    libcVxworksMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun vxCpuEnabledGet(): CpusetT =
    libcVxworksVxCpuEnabledGet()

public actual fun vxCpuConfiguredGet(): CpusetT =
    libcVxworksVxCpuConfiguredGet()
