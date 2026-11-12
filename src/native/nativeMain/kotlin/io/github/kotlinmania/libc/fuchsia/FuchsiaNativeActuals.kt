@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAbort
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAbs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAccept
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAccept4
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAccess
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAcct
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAlarm
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAtexit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAtof
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAtoi
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAtol
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaAtoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaBind
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaBrk
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCalloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfgetispeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfgetospeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfmakeraw
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfsetispeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfsetospeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCfsetspeed
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaChdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaChmod
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaChown
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClearenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClockGetres
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClockGettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClockNanosleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClockSettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClone
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClose
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaClosedir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCloselog
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaConnect
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaCreat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDaemon
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDirfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDlIteratePhdr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDladdr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDlclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDlerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDlopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDlsym
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDup
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDup2
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDup3
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaDuplocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaEndgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaEndpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaErrnoLocation
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaEventfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecle
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExeclp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecve
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecvp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExecvpe
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaExit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFaccessat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFallocate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFchmod
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFchmodat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFchown
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFchownat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFcntl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFdatasync
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFdopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFdopendir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFeof
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFexecve
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFflush
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFgetc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFgetpos
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFgets
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFileno
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFork
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFpathconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFputc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFputs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFread
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFree
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFreeaddrinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFreeifaddrs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFreelocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFreopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFscanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFseek
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFseeko
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFsetpos
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFstat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFstatat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFstatfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFstatvfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFsync
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFtell
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFtello
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFtok
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFtruncate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFutimens
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFutimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaFwrite
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGaiStrerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetaddrinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetchar
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetcharUnlocked
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetcwd
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetdomainname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetdtablesize
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetegid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGeteuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrgidR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrnamR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgrouplist
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGethostname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetifaddrs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetlogin
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetnameinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpeername
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetppid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetprotobyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetprotobynumber
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpwnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpwnamR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpwuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetpwuidR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetresgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetresuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetservbyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetsockname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetsockopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGettimeofday
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGetuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGlob
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGlobfree
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGmtime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGmtimeR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaGrantpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIfFreenameindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIfIndextoname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIfNameindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIfNametoindex
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaInitgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIoctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsalnum
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsalpha
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsatty
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsblank
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIscntrl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsdigit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsgraph
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIslower
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsprint
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIspunct
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsspace
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsupper
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaIsxdigit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaKill
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLabs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLchown
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaListen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLocaleconv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLocaltime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLocaltimeR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLseek
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLstat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaLutimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMadvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMalloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemalign
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemcmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemcpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemmove
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemrchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMemset
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkdirat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkdtemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkfifo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkfifoat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMknod
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMknodat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkostemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkostemps
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkstemp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMkstemps
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMktime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMlockall
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMmap
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMount
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMprotect
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMsgctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMsgget
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMsgrcv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMsgsnd
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMsync
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMunlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMunlockall
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaMunmap
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaNanosleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaNewlocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaNlLanginfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaNlLanginfoL
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaOpen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaOpenat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaOpendir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaOpenlog
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaOpenpty
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPathconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPause
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPclose
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPersonality
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPipe
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPipe2
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPopen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPosixFadvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPosixFallocate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPosixMadvise
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPosixMemalign
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPosixOpenpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPpoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPread
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPreadv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPrintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPselect
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAtfork
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrGetguardsize
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrGetstack
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrGetstacksize
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrSetdetachstate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrSetguardsize
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadAttrSetstacksize
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCancel
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondBroadcast
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondSignal
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondTimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondWait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondattrGetclock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCondattrSetclock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadDetach
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadExit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadGetattrNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadGetnameNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadGetspecific
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadJoin
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadKeyCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadKeyDelete
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadKill
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexLock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexTimedlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexTrylock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexUnlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadMutexattrSettype
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockRdlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockTryrdlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockTrywrlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockUnlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockWrlock
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockattrDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadRwlockattrInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadSelf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadSetnameNp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadSetspecific
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPthreadSigmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPtsname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPtsnameR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPutchar
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPutcharUnlocked
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPutenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPuts
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPwrite
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaPwritev
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaQuotactl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRaise
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRand
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRead
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReadahead
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReaddir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReaddirR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReadlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReadlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReadv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRealloc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRealpath
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaReboot
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRecv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRecvfrom
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRecvmmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRecvmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRemove
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRename
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRenameat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaResInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRewind
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRewinddir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaRmdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaScanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedGetPriorityMax
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedGetPriorityMin
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedGetaffinity
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedGetparam
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedGetscheduler
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedRrGetInterval
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedSetaffinity
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedSetparam
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedSetscheduler
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSchedYield
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSeekdir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSelect
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemClose
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemDestroy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemGetvalue
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemInit
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemOpen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemPost
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemTimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemTrywait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemUnlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemWait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemget
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSemop
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSend
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSendmmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSendmsg
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSendto
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetbuf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetdomainname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetegid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSeteuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetfsgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetfsuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetgrent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetgroups
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSethostname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetlocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetlogmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetpgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetpwent
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetregid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetresgid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetresuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetreuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetsockopt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSettimeofday
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetuid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSetvbuf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmOpen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmUnlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmctl
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmdt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShmget
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaShutdown
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigaction
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigaddset
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigaltstack
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigdelset
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigemptyset
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigfillset
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigismember
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSignal
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSignalfd
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigpending
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigprocmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigsuspend
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigtimedwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigwait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSigwaitinfo
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSnprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSocket
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSocketpair
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSplice
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSprintf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSrand
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSscanf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStatfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStatvfs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrcat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrcmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrcoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrcpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrcspn
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrdup
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrerror
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrerrorR
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrlen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrncat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrncmp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrncpy
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrnlen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrpbrk
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrrchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrspn
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrstr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtod
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtof
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtok
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtol
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtoll
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtoul
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrtoull
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaStrxfrm
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSwapoff
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSwapon
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSymlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSymlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSync
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSyncFileRange
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSyscall
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSysconf
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSyslog
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaSystem
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcdrain
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcflow
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcflush
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcgetattr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcgetpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcgetsid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcsendbreak
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcsetattr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTcsetpgrp
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTee
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTelldir
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTimegm
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTimerfdCreate
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTimerfdGettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTimerfdSettime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTmpfile
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTmpnam
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTolower
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaToupper
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaTtyname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUmask
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUmount
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUmount2
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUname
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUngetc
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUnlink
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUnlinkat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUnlockpt
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUnsetenv
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUselocale
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUsleep
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUtime
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUtimensat
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaUtimes
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaVhangup
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaVmsplice
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWait
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWaitid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWaitpid
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWcslen
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWcstombs
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWmemchr
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWrite
import io.github.kotlinmania.libc.fuchsia.cinterop.libcFuchsiaWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun isalnum(c: CInt): CInt =
    libcFuchsiaIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcFuchsiaIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcFuchsiaIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcFuchsiaIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcFuchsiaIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcFuchsiaIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcFuchsiaIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcFuchsiaIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcFuchsiaIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcFuchsiaIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcFuchsiaIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcFuchsiaIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcFuchsiaTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcFuchsiaToupper(c)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcFuchsiaFopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcFuchsiaFreopen(filename.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>(), file.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fflush(file: MutPtr<FILE>): CInt =
    libcFuchsiaFflush(file.rawAddress.toCPointer<ByteVar>())

public actual fun fclose(file: MutPtr<FILE>): CInt =
    libcFuchsiaFclose(file.rawAddress.toCPointer<ByteVar>())

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    libcFuchsiaRemove(filename.rawAddress.toCPointer<ByteVar>())

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    libcFuchsiaRename(oldname.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(libcFuchsiaTmpfile()?.toLong() ?: 0L)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcFuchsiaSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    libcFuchsiaSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun getchar(): CInt =
    libcFuchsiaGetchar()

public actual fun putchar(c: CInt): CInt =
    libcFuchsiaPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    libcFuchsiaFgetc(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcFuchsiaFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcFuchsiaFputc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    libcFuchsiaFputs(s.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun puts(s: ConstPtr<CChar>): CInt =
    libcFuchsiaPuts(s.rawAddress.toCPointer<ByteVar>())

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    libcFuchsiaUngetc(c, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcFuchsiaFread(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    libcFuchsiaFwrite(ptr.rawAddress.toCPointer<ByteVar>(), size, nobj, stream.rawAddress.toCPointer<ByteVar>())

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    libcFuchsiaFseek(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    libcFuchsiaFtell(stream.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(stream: MutPtr<FILE>) {
    libcFuchsiaRewind(stream.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    libcFuchsiaFgetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    libcFuchsiaFsetpos(stream.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())

public actual fun feof(stream: MutPtr<FILE>): CInt =
    libcFuchsiaFeof(stream.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    libcFuchsiaFerror(stream.rawAddress.toCPointer<ByteVar>())

public actual fun perror(s: ConstPtr<CChar>) {
    libcFuchsiaPerror(s.rawAddress.toCPointer<ByteVar>())
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcFuchsiaAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcFuchsiaAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcFuchsiaAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcFuchsiaAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    libcFuchsiaStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    libcFuchsiaStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcFuchsiaStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcFuchsiaStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcFuchsiaStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcFuchsiaStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
    libcFuchsiaFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun abort(): Nothing {
    libcFuchsiaAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    libcFuchsiaExit(status)
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    libcFuchsiaAtexit(0L.toCPointer<ByteVar>())

public actual fun system(s: ConstPtr<CChar>): CInt =
    libcFuchsiaSystem(s.rawAddress.toCPointer<ByteVar>())

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcFuchsiaStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    libcFuchsiaStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcFuchsiaStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcFuchsiaStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcFuchsiaStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcFuchsiaStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    libcFuchsiaStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    libcFuchsiaStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    libcFuchsiaWcslen(buf.rawAddress.toCPointer<ByteVar>())

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    libcFuchsiaWcstombs(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    MutPtr(libcFuchsiaWmemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcFuchsiaMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun abs(i: CInt): CInt =
    libcFuchsiaAbs(i)

public actual fun labs(i: CLong): CLong =
    libcFuchsiaLabs(i)

public actual fun rand(): CInt =
    libcFuchsiaRand()

public actual fun srand(seed: CUint) {
    libcFuchsiaSrand(seed)
}

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    MutPtr(libcFuchsiaGetpwnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    MutPtr(libcFuchsiaGetpwuid(uid)?.toLong() ?: 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcFuchsiaGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcFuchsiaPutcharUnlocked(c)

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    libcFuchsiaSocket(domain, ty, protocol)

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    libcFuchsiaConnect(socket, address.rawAddress.toCPointer<ByteVar>(), len)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcFuchsiaListen(socket, backlog)

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcFuchsiaAccept(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcFuchsiaGetpeername(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    libcFuchsiaGetsockname(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen.rawAddress.toCPointer<ByteVar>())

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    libcFuchsiaSetsockopt(socket, level, name, value.rawAddress.toCPointer<ByteVar>(), optionLen)

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    libcFuchsiaSocketpair(domain, type, protocol, socketVector.rawAddress.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    libcFuchsiaSendto(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libcFuchsiaShutdown(socket, how)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libcFuchsiaFchmod(fd, mode)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    libcFuchsiaFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcFuchsiaStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    libcFuchsiaPclose(stream.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcFuchsiaFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    libcFuchsiaFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcFuchsiaOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcFuchsiaFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcFuchsiaOpendir(dirname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcFuchsiaReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    libcFuchsiaReaddirR(dirp.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    libcFuchsiaClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    libcFuchsiaRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    libcFuchsiaOpenat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    libcFuchsiaFchmodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    libcFuchsiaFchown(fd, owner, group)

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    libcFuchsiaFchownat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), owner, group, flags)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    libcFuchsiaFstatat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcFuchsiaLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaMkdirat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    libcFuchsiaReadlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    libcFuchsiaRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    libcFuchsiaSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    libcFuchsiaUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    libcFuchsiaAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun alarm(seconds: CUint): CUint =
    libcFuchsiaAlarm(seconds)

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    libcFuchsiaChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    libcFuchsiaChown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    libcFuchsiaLchown(path.rawAddress.toCPointer<ByteVar>(), uid, gid)

public actual fun close(fd: CInt): CInt =
    libcFuchsiaClose(fd)

public actual fun dup(fd: CInt): CInt =
    libcFuchsiaDup(fd)

public actual fun dup2(src: CInt, dst: CInt): CInt =
    libcFuchsiaDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaExecl(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaExecle(path.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcFuchsiaExeclp(file.rawAddress.toCPointer<ByteVar>(), arg0.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    libcFuchsiaExecv(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcFuchsiaExecve(prog.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    libcFuchsiaExecvp(c.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>())

public actual fun fork(): PidT =
    libcFuchsiaFork()

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcFuchsiaFpathconf(filedes, name)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(libcFuchsiaGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun getegid(): GidT =
    libcFuchsiaGetegid()

public actual fun geteuid(): UidT =
    libcFuchsiaGeteuid()

public actual fun getgid(): GidT =
    libcFuchsiaGetgid()

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    libcFuchsiaGetgroups(ngroupsMax, groups.rawAddress.toCPointer<ByteVar>())

public actual fun getlogin(): MutPtr<CChar> =
    MutPtr(libcFuchsiaGetlogin()?.toLong() ?: 0L)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    libcFuchsiaGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun getpgid(pid: PidT): PidT =
    libcFuchsiaGetpgid(pid)

public actual fun getpgrp(): PidT =
    libcFuchsiaGetpgrp()

public actual fun getpid(): PidT =
    libcFuchsiaGetpid()

public actual fun getppid(): PidT =
    libcFuchsiaGetppid()

public actual fun getuid(): UidT =
    libcFuchsiaGetuid()

public actual fun isatty(fd: CInt): CInt =
    libcFuchsiaIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    libcFuchsiaLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcFuchsiaLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    libcFuchsiaPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun pause(): CInt =
    libcFuchsiaPause()

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    libcFuchsiaPipe(fds.rawAddress.toCPointer<ByteVar>())

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    libcFuchsiaPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), align, size)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    libcFuchsiaRead(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    libcFuchsiaRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun seteuid(uid: UidT): CInt =
    libcFuchsiaSeteuid(uid)

public actual fun setegid(gid: GidT): CInt =
    libcFuchsiaSetegid(gid)

public actual fun setgid(gid: GidT): CInt =
    libcFuchsiaSetgid(gid)

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    libcFuchsiaSetpgid(pid, pgid)

public actual fun setsid(): PidT =
    libcFuchsiaSetsid()

public actual fun setuid(uid: UidT): CInt =
    libcFuchsiaSetuid(uid)

public actual fun sleep(secs: CUint): CUint =
    libcFuchsiaSleep(secs)

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcFuchsiaNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun tcgetpgrp(fd: CInt): PidT =
    libcFuchsiaTcgetpgrp(fd)

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    libcFuchsiaTcsetpgrp(fd, pgrp)

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    MutPtr(libcFuchsiaTtyname(fd)?.toLong() ?: 0L)

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    libcFuchsiaUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun wait(status: MutPtr<CInt>): PidT =
    libcFuchsiaWait(status.rawAddress.toCPointer<ByteVar>())

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    libcFuchsiaWaitpid(pid, status.rawAddress.toCPointer<ByteVar>(), options)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    libcFuchsiaWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcFuchsiaPread(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcFuchsiaPwrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun umask(mask: ModeT): ModeT =
    libcFuchsiaUmask(mask)

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    libcFuchsiaUtime(file.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libcFuchsiaKill(pid, sig)

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcFuchsiaMlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    libcFuchsiaMunlock(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun mlockall(flags: CInt): CInt =
    libcFuchsiaMlockall(flags)

public actual fun munlockall(): CInt =
    libcFuchsiaMunlockall()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcFuchsiaMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    libcFuchsiaIfNametoindex(ifname.rawAddress.toCPointer<ByteVar>())

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaIfIndextoname(ifindex, ifname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcFuchsiaLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libcFuchsiaFsync(fd)

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    libcFuchsiaSetenv(name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), overwrite)

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    libcFuchsiaUnsetenv(name.rawAddress.toCPointer<ByteVar>())

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    libcFuchsiaSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcFuchsiaFtruncate(fd, length)

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    libcFuchsiaSignal(signum, handler)

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaRealpath(pathname.rawAddress.toCPointer<ByteVar>(), resolved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun flock(fd: CInt, operation: CInt): CInt =
    libcFuchsiaFlock(fd, operation)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcFuchsiaGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun times(buf: MutPtr<Tms>): ClockT =
    libcFuchsiaTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSelf(): PthreadT =
    (libcFuchsiaPthreadSelf()?.toLong() ?: 0L).toULong()

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    libcFuchsiaPthreadJoin(native.toLong().toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    libcFuchsiaPthreadExit(value.rawAddress.toCPointer<ByteVar>())
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcFuchsiaPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    libcFuchsiaPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    libcFuchsiaPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    libcFuchsiaPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    libcFuchsiaPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcFuchsiaPthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun schedYield(): CInt =
    libcFuchsiaSchedYield()

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcFuchsiaPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcFuchsiaPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcFuchsiaPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcFuchsiaPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    libcFuchsiaPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    libcFuchsiaPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    libcFuchsiaPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    libcFuchsiaPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcFuchsiaPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcFuchsiaPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    libcFuchsiaPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcFuchsiaPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    libcFuchsiaPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcFuchsiaPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcFuchsiaPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcFuchsiaPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcFuchsiaPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    libcFuchsiaPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    libcFuchsiaPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    libcFuchsiaPthreadRwlockInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockRdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockTryrdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockWrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockTrywrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcFuchsiaPthreadRwlockUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcFuchsiaPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcFuchsiaPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    libcFuchsiaPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    libcFuchsiaPthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcFuchsiaStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    libcFuchsiaGetsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun raise(signum: CInt): CInt =
    libcFuchsiaRaise(signum)

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    libcFuchsiaSigaction(signum, act.rawAddress.toCPointer<ByteVar>(), oldact.rawAddress.toCPointer<ByteVar>())

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcFuchsiaUtimes(filename.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcFuchsiaDlopen(filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlerror(): MutPtr<CChar> =
    MutPtr(libcFuchsiaDlerror()?.toLong() ?: 0L)

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcFuchsiaDlsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    libcFuchsiaDlclose(handle.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    libcFuchsiaDladdr(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    libcFuchsiaGetaddrinfo(node.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), hints.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    libcFuchsiaFreeaddrinfo(res.rawAddress.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    ConstPtr(libcFuchsiaGaiStrerror(errcode)?.toLong() ?: 0L)

public actual fun resInit(): CInt =
    libcFuchsiaResInit()

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcFuchsiaGmtimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcFuchsiaLocaltimeR(timeP.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    libcFuchsiaMktime(tm.rawAddress.toCPointer<ByteVar>())

public actual fun time(time: MutPtr<TimeT>): TimeT =
    libcFuchsiaTime(time.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcFuchsiaGmtime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcFuchsiaLocaltime(timeP.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcFuchsiaMknod(pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    libcFuchsiaUname(buf.rawAddress.toCPointer<ByteVar>())

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcFuchsiaGethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    MutPtr(libcFuchsiaGetservbyname(name.rawAddress.toCPointer<ByteVar>(), proto.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    MutPtr(libcFuchsiaGetprotobyname(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    MutPtr(libcFuchsiaGetprotobynumber(proto)?.toLong() ?: 0L)

public actual fun usleep(secs: CUint): CInt =
    libcFuchsiaUsleep(secs)

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcFuchsiaSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcFuchsiaRecv(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun putenv(string: MutPtr<CChar>): CInt =
    libcFuchsiaPutenv(string.rawAddress.toCPointer<ByteVar>())

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    libcFuchsiaPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    libcFuchsiaSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(libcFuchsiaLocaleconv()?.toLong() ?: 0L)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    libcFuchsiaSemDestroy(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    libcFuchsiaSemWait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    libcFuchsiaSemTrywait(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    libcFuchsiaSemPost(sem.rawAddress.toCPointer<ByteVar>())

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    libcFuchsiaSemInit(sem.rawAddress.toCPointer<ByteVar>(), pshared, value)

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    libcFuchsiaStatvfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    libcFuchsiaFstatvfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    libcFuchsiaReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsz)

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    libcFuchsiaSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcFuchsiaSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    libcFuchsiaSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcFuchsiaSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    libcFuchsiaSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcFuchsiaSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    libcFuchsiaSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    libcFuchsiaTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun getsid(pid: PidT): PidT =
    libcFuchsiaGetsid(pid)

public actual fun sysconf(name: CInt): CLong =
    libcFuchsiaSysconf(name)

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaMkfifo(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcFuchsiaPselect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    libcFuchsiaFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    libcFuchsiaFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun tcdrain(fd: CInt): CInt =
    libcFuchsiaTcdrain(fd)

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    libcFuchsiaCfgetispeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    libcFuchsiaCfgetospeed(termios.rawAddress.toCPointer<ByteVar>())

public actual fun cfmakeraw(termios: MutPtr<Termios>) {
    libcFuchsiaCfmakeraw(termios.rawAddress.toCPointer<ByteVar>())
}

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcFuchsiaCfsetispeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcFuchsiaCfsetospeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    libcFuchsiaCfsetspeed(termios.rawAddress.toCPointer<ByteVar>(), speed)

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    libcFuchsiaTcgetattr(fd, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    libcFuchsiaTcsetattr(fd, optionalActions, termios.rawAddress.toCPointer<ByteVar>())

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    libcFuchsiaTcflow(fd, action)

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    libcFuchsiaTcflush(fd, action)

public actual fun tcgetsid(fd: CInt): PidT =
    libcFuchsiaTcgetsid(fd)

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    libcFuchsiaTcsendbreak(fd, duration)

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    libcFuchsiaMkstemp(template.rawAddress.toCPointer<ByteVar>())

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaMkdtemp(template.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcFuchsiaTmpnam(ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    libcFuchsiaOpenlog(ident.rawAddress.toCPointer<ByteVar>(), logopt, facility)
}

public actual fun closelog() {
    libcFuchsiaCloselog()
}

public actual fun setlogmask(maskpri: CInt): CInt =
    libcFuchsiaSetlogmask(maskpri)

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcFuchsiaSyslog(priority, message.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun grantpt(fd: CInt): CInt =
    libcFuchsiaGrantpt(fd)

public actual fun posixOpenpt(flags: CInt): CInt =
    libcFuchsiaPosixOpenpt(flags)

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    MutPtr(libcFuchsiaPtsname(fd)?.toLong() ?: 0L)

public actual fun unlockpt(fd: CInt): CInt =
    libcFuchsiaUnlockpt(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libcFuchsiaFdatasync(fd)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcFuchsiaClockGetres(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcFuchsiaClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    libcFuchsiaClockSettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcFuchsiaDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcFuchsiaPthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcFuchsiaPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemalign(align, size)?.toLong() ?: 0L)

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    libcFuchsiaSetgroups(ngroups, ptr.rawAddress.toCPointer<ByteVar>())

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    libcFuchsiaPipe2(fds.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcFuchsiaStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcFuchsiaFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcFuchsiaMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcFuchsiaPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcFuchsiaFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcFuchsiaUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcFuchsiaDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcFuchsiaFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcFuchsiaNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcFuchsiaUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(libcFuchsiaFdopendir(fd)?.toLong() ?: 0L)

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    libcFuchsiaMknodat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, dev)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    libcFuchsiaPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    libcFuchsiaPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    libcFuchsiaAccept4(fd, addr.rawAddress.toCPointer<ByteVar>(), len.rawAddress.toCPointer<ByteVar>(), flg)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcFuchsiaPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun clearenv(): CInt =
    libcFuchsiaClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcFuchsiaWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    libcFuchsiaSetreuid(ruid, euid)

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    libcFuchsiaSetregid(rgid, egid)

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    libcFuchsiaGetresuid(ruid.rawAddress.toCPointer<ByteVar>(), euid.rawAddress.toCPointer<ByteVar>(), suid.rawAddress.toCPointer<ByteVar>())

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    libcFuchsiaGetresgid(rgid.rawAddress.toCPointer<ByteVar>(), egid.rawAddress.toCPointer<ByteVar>(), sgid.rawAddress.toCPointer<ByteVar>())

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    libcFuchsiaAcct(filename.rawAddress.toCPointer<ByteVar>())

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    libcFuchsiaBrk(addr.rawAddress.toCPointer<ByteVar>())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    libcFuchsiaSetresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    libcFuchsiaSetresuid(ruid, euid, suid)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    libcFuchsiaOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcFuchsiaExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcFuchsiaFexecve(fd, argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcFuchsiaIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcFuchsiaLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun setpwent() {
    libcFuchsiaSetpwent()
}

public actual fun endpwent() {
    libcFuchsiaEndpwent()
}

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(libcFuchsiaGetpwent()?.toLong() ?: 0L)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    libcFuchsiaShmOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, mode)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcFuchsiaShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcFuchsiaShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcFuchsiaShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcFuchsiaShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    libcFuchsiaFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    libcFuchsiaSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    libcFuchsiaSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcFuchsiaSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    libcFuchsiaMsgctl(msqid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libcFuchsiaMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    libcFuchsiaMsgrcv(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    libcFuchsiaMsgsnd(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcFuchsiaMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(libcFuchsiaErrnoLocation()?.toLong() ?: 0L)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    libcFuchsiaFallocate(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcFuchsiaPosixFallocate(fd, offset, len)

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    libcFuchsiaReadahead(fd, offset, count)

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    libcFuchsiaSignalfd(fd, mask.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    libcFuchsiaTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    libcFuchsiaTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcFuchsiaTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcFuchsiaPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcFuchsiaPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    libcFuchsiaQuotactl(cmd, special.rawAddress.toCPointer<ByteVar>(), id, data.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    libcFuchsiaDup3(oldfd, newfd, flags)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    libcFuchsiaMkostemp(template.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    libcFuchsiaMkostemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen, flags)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcFuchsiaSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcFuchsiaSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(libcFuchsiaNlLanginfoL(item, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcFuchsiaGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun reboot(howTo: CInt): CInt =
    libcFuchsiaReboot(howTo)

public actual fun setfsgid(gid: GidT): CInt =
    libcFuchsiaSetfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    libcFuchsiaSetfsuid(uid)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcFuchsiaMkfifoat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(libcFuchsiaIfNameindex()?.toLong() ?: 0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    libcFuchsiaIfFreenameindex(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    libcFuchsiaSyncFileRange(fd, offset, nbytes, flags)

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    libcFuchsiaGetifaddrs(ifap.rawAddress.toCPointer<ByteVar>())

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    libcFuchsiaFreeifaddrs(ifa.rawAddress.toCPointer<ByteVar>())
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    libcFuchsiaGlob(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree(pglob: MutPtr<GlobT>) {
    libcFuchsiaGlobfree(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcFuchsiaPosixMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    libcFuchsiaShmUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcFuchsiaSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcFuchsiaTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    libcFuchsiaMadvise(addr.rawAddress.toCPointer<ByteVar>(), len, advice)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    libcFuchsiaMsync(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcFuchsiaRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    libcFuchsiaMkstemps(template.rawAddress.toCPointer<ByteVar>(), suffixlen)

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    libcFuchsiaFutimes(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcFuchsiaNlLanginfo(item)?.toLong() ?: 0L)

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    libcFuchsiaBind(socket, address.rawAddress.toCPointer<ByteVar>(), addressLen)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcFuchsiaWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcFuchsiaReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    libcFuchsiaSendmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    libcFuchsiaRecvmsg(fd, msg.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    libcFuchsiaGetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcFuchsiaSetdomainname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun vhangup(): CInt =
    libcFuchsiaVhangup()

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    libcFuchsiaSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    libcFuchsiaRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sync() {
    libcFuchsiaSync()
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    libcFuchsiaSyscall(num, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcFuchsiaSchedGetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcFuchsiaSchedSetaffinity(pid, cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun umount(target: ConstPtr<CChar>): CInt =
    libcFuchsiaUmount(target.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    libcFuchsiaSchedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    libcFuchsiaTee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    libcFuchsiaSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    libcFuchsiaSplice(fdIn, offIn.rawAddress.toCPointer<ByteVar>(), fdOut, offOut.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcFuchsiaEventfd(initval, flags)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    libcFuchsiaSchedRrGetInterval(pid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    libcFuchsiaSemTimedwait(sem.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    libcFuchsiaSemGetvalue(sem.rawAddress.toCPointer<ByteVar>(), sval.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcFuchsiaSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    libcFuchsiaSwapoff(puath.rawAddress.toCPointer<ByteVar>())

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    libcFuchsiaVmsplice(fd, iov.rawAddress.toCPointer<ByteVar>(), nrSegs, flags)

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    libcFuchsiaMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), fstype.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun personality(persona: CUlong): CInt =
    libcFuchsiaPersonality(persona)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcFuchsiaSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcFuchsiaPpoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcFuchsiaPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    libcFuchsiaClone(0L.toCPointer<ByteVar>(), childStack.rawAddress.toCPointer<ByteVar>(), flags, arg.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcFuchsiaSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcFuchsiaClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcFuchsiaPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcFuchsiaPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    libcFuchsiaSethostname(name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    libcFuchsiaSchedGetPriorityMin(policy)

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    libcFuchsiaUmount2(target.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    libcFuchsiaSwapon(path.rawAddress.toCPointer<ByteVar>(), swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcFuchsiaSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcFuchsiaSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcFuchsiaGetgrgidR(gid, grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    libcFuchsiaSigaltstack(ss.rawAddress.toCPointer<ByteVar>(), oss.rawAddress.toCPointer<ByteVar>())

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    libcFuchsiaSemClose(sem.rawAddress.toCPointer<ByteVar>())

public actual fun getdtablesize(): CInt =
    libcFuchsiaGetdtablesize()

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcFuchsiaGetgrnamR(name.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    libcFuchsiaInitgroups(user.rawAddress.toCPointer<ByteVar>(), group)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcFuchsiaPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(libcFuchsiaSemOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(libcFuchsiaGetgrnam(name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcFuchsiaPthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcFuchsiaPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    libcFuchsiaSemUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    libcFuchsiaDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcFuchsiaGetpwnamR(name.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcFuchsiaGetpwuidR(uid, pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcFuchsiaSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    libcFuchsiaPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(libcFuchsiaGetgrgid(gid)?.toLong() ?: 0L)

public actual fun setgrent() {
    libcFuchsiaSetgrent()
}

public actual fun endgrent() {
    libcFuchsiaEndgrent()
}

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(libcFuchsiaGetgrent()?.toLong() ?: 0L)

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    libcFuchsiaGetgrouplist(user.rawAddress.toCPointer<ByteVar>(), group, groups.rawAddress.toCPointer<ByteVar>(), ngroups.rawAddress.toCPointer<ByteVar>())

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcFuchsiaPopen(command.rawAddress.toCPointer<ByteVar>(), mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcFuchsiaFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcFuchsiaPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcFuchsiaDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())
