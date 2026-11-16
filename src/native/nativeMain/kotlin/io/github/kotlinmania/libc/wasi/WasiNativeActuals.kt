@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAbort
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAbs
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAccess
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAlignedAlloc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiArc4random
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiArc4randomBuf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiArc4randomUniform
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAsctimeR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtQuickExit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtexit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtof
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtoi
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtol
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiAtoll
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiCalloc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiChdir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiChmod
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiClearenv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiClearerr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiClock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiClose
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiClosedir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiCreat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiCtimeR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiDifftime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiDirfd
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiDuplocale
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiErrnoLocation
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiExit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFaccessat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFchmod
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFclose
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFcntl
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFdatasync
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFdopen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFdopendir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFeof
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFerror
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFflush
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFgetc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFgetpos
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFgets
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFileno
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFopen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFpathconf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFprintf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFputc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFputs
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFread
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFree
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFreelocale
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFreopen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFscanf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFseek
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFseeko
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFsetpos
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFstat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFstatat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFsync
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFtell
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFtello
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFtruncate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFutimens
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiFwrite
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetCLOCKMONOTONIC1
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetCLOCKREALTIME1
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetENVIRON
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetchar
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetcharUnlocked
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetcwd
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetentropy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetenv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetline
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetopt
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGetrusage
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGettimeofday
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGmtime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiGmtimeR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIoctl
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsalnum
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsalpha
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsatty
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsblank
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIscntrl
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsdigit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsgraph
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIslower
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsprint
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIspunct
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsspace
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsupper
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiIsxdigit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLabs
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLink
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLocaleconv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLocaltime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLocaltimeR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLseek
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiLstat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMalloc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMallocUsableSize
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemchr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemcmp
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemcpy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemmove
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemrchr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMemset
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMkdir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMkdirat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiMktime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiNanosleep
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiNewlocale
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiNlLanginfo
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiNlLanginfoL
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiOpen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiOpenat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiOpendir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPathconf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPerror
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPoll
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPosixFadvise
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPosixFallocate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPosixMemalign
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPread
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPreadv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPrintf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadAttrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadAttrGetstacksize
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadAttrInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadAttrSetdetachstate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadAttrSetstacksize
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondBroadcast
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondSignal
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondTimedwait
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondWait
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCondattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadCreate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadDetach
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadEqual
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadGetspecific
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadJoin
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadKeyCreate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadKeyDelete
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexLock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexTrylock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexUnlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadMutexattrSettype
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockRdlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockTryrdlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockTrywrlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockUnlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockWrlock
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockattrDestroy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadRwlockattrInit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadSelf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPthreadSetspecific
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPutc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPutchar
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPutcharUnlocked
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPutenv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPuts
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPwrite
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiPwritev
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiQuickExit
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRand
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRandR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRandom
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRead
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiReaddir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiReadlink
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiReadlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiReadv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRealloc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRealpath
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRecv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRemove
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRename
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRenameat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRewind
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRewinddir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiRmdir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSbrk
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiScanf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSchedYield
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSeekdir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSelect
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSend
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSetENVIRON
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSetbuf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSetenv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSetlocale
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSetvbuf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiShutdown
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSleep
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSnprintf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSprintf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSrand
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSrandom
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSscanf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcasecmp
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcasestr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrchr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcmp
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcoll
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcpy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrcspn
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrdup
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrerror
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrerrorR
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrftime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrlen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrncasecmp
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrncat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrncmp
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrncpy
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrndup
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrnlen
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrpbrk
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrrchr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrspn
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrstr
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtod
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtof
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtok
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtol
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtoll
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtoul
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrtoull
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiStrxfrm
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSymlink
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSymlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiSysconf
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTelldir
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTime
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTimegm
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTimes
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTolower
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiToupper
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiTruncate
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUngetc
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUnlink
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUnlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUnsetenv
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUselocale
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUsleep
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiUtimensat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcAccess
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcFdRenumber
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcFindRelpath
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcLink
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcLinkNewat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcLinkOldat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdFaccessat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdFstatat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdLinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdMkdiratNomode
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdOpenatNomode
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdOpendirat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdReadlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdRenameat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdSymlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdUtimensat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdWasilibcRmdirat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcNocwdWasilibcUnlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcRegisterPreopenedFd
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcRenameNewat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcRenameOldat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcRmdirat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcStat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcTell
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcUnlinkat
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWasilibcUtimens
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWrite
import io.github.kotlinmania.libc.wasi.cinterop.libcWasiWritev
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var ENVIRON: MutPtr
    get() = MutPtr(libcWasiGetENVIRON()?.toLong() ?: 0L)
    set(value) {
        libcWasiSetENVIRON(value.rawAddress.toCPointer<ByteVar>())
    }

public actual val CLOCK_MONOTONIC1: UByte
    get() = libcWasiGetCLOCKMONOTONIC1()

public actual val CLOCK_REALTIME1: UByte
    get() = libcWasiGetCLOCKREALTIME1()

public actual fun exit(code: CInt): Nothing {
    libcWasiExit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    libcWasiAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr =
    MutPtr(libcWasiAlignedAlloc(a, b)?.toLong() ?: 0L)

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr =
    MutPtr(libcWasiCalloc(amt, amt2)?.toLong() ?: 0L)

public actual fun free(ptr: MutPtr) {
    libcWasiFree(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getenv(s: ConstPtr): MutPtr =
    MutPtr(libcWasiGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun malloc(amt: SizeT): MutPtr =
    MutPtr(libcWasiMalloc(amt)?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    libcWasiMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr =
    MutPtr(libcWasiSbrk(increment)?.toLong() ?: 0L)

public actual fun rand(): CInt =
    libcWasiRand()

public actual fun read(fd: CInt, ptr: MutPtr, size: SizeT): SsizeT =
    libcWasiRead(fd, ptr.rawAddress.toCPointer<ByteVar>(), size)

public actual fun realloc(ptr: MutPtr, amt: SizeT): MutPtr =
    MutPtr(libcWasiRealloc(ptr.rawAddress.toCPointer<ByteVar>(), amt)?.toLong() ?: 0L)

public actual fun setenv(k: ConstPtr, v: ConstPtr, a: CInt): CInt =
    libcWasiSetenv(k.rawAddress.toCPointer<ByteVar>(), v.rawAddress.toCPointer<ByteVar>(), a)

public actual fun unsetenv(k: ConstPtr): CInt =
    libcWasiUnsetenv(k.rawAddress.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    libcWasiClearenv()

public actual fun write(fd: CInt, ptr: ConstPtr, size: SizeT): SsizeT =
    libcWasiWrite(fd, ptr.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fopen(a: ConstPtr, b: ConstPtr): MutPtr =
    MutPtr(libcWasiFopen(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(a: ConstPtr, b: ConstPtr, f: MutPtr): MutPtr =
    MutPtr(libcWasiFreopen(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), f.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fclose(f: MutPtr): CInt =
    libcWasiFclose(f.rawAddress.toCPointer<ByteVar>())

public actual fun remove(a: ConstPtr): CInt =
    libcWasiRemove(a.rawAddress.toCPointer<ByteVar>())

public actual fun rename(a: ConstPtr, b: ConstPtr): CInt =
    libcWasiRename(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())

public actual fun feof(f: MutPtr): CInt =
    libcWasiFeof(f.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(f: MutPtr): CInt =
    libcWasiFerror(f.rawAddress.toCPointer<ByteVar>())

public actual fun fflush(f: MutPtr): CInt =
    libcWasiFflush(f.rawAddress.toCPointer<ByteVar>())

public actual fun clearerr(f: MutPtr) {
    libcWasiClearerr(f.rawAddress.toCPointer<ByteVar>())
}

public actual fun fseek(f: MutPtr, b: CLong, c: CInt): CInt =
    libcWasiFseek(f.rawAddress.toCPointer<ByteVar>(), b, c)

public actual fun ftell(f: MutPtr): CLong =
    libcWasiFtell(f.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(f: MutPtr) {
    libcWasiRewind(f.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(f: MutPtr, pos: MutPtr): CInt =
    libcWasiFgetpos(f.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(f: MutPtr, pos: ConstPtr): CInt =
    libcWasiFsetpos(f.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun fread(buf: MutPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    libcWasiFread(buf.rawAddress.toCPointer<ByteVar>(), a, b, f.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(buf: ConstPtr, a: SizeT, b: SizeT, f: MutPtr): SizeT =
    libcWasiFwrite(buf.rawAddress.toCPointer<ByteVar>(), a, b, f.rawAddress.toCPointer<ByteVar>())

public actual fun fgetc(f: MutPtr): CInt =
    libcWasiFgetc(f.rawAddress.toCPointer<ByteVar>())

public actual fun getc(f: MutPtr): CInt =
    libcWasiGetc(f.rawAddress.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libcWasiGetchar()

public actual fun ungetc(a: CInt, f: MutPtr): CInt =
    libcWasiUngetc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun fputc(a: CInt, f: MutPtr): CInt =
    libcWasiFputc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun putc(a: CInt, f: MutPtr): CInt =
    libcWasiPutc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun putchar(a: CInt): CInt =
    libcWasiPutchar(a)

public actual fun fputs(a: ConstPtr, f: MutPtr): CInt =
    libcWasiFputs(a.rawAddress.toCPointer<ByteVar>(), f.rawAddress.toCPointer<ByteVar>())

public actual fun puts(a: ConstPtr): CInt =
    libcWasiPuts(a.rawAddress.toCPointer<ByteVar>())

public actual fun perror(a: ConstPtr) {
    libcWasiPerror(a.rawAddress.toCPointer<ByteVar>())
}

public actual fun srand(a: CUint) {
    libcWasiSrand(a)
}

public actual fun atexit(a: AtexitACallback): CInt =
    libcWasiAtexit(0L.toCPointer<ByteVar>())

public actual fun atQuickExit(a: AtexitACallback): CInt =
    libcWasiAtQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(a: CInt): Nothing {
    libcWasiQuickExit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: MutPtr, b: SizeT, c: SizeT): CInt =
    libcWasiPosixMemalign(a.rawAddress.toCPointer<ByteVar>(), b, c)

public actual fun randR(a: MutPtr): CInt =
    libcWasiRandR(a.rawAddress.toCPointer<ByteVar>())

public actual fun random(): CLong =
    libcWasiRandom()

public actual fun srandom(a: CUint) {
    libcWasiSrandom(a)
}

public actual fun putenv(a: MutPtr): CInt =
    libcWasiPutenv(a.rawAddress.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libcWasiClock()

public actual fun time(a: MutPtr): TimeT =
    libcWasiTime(a.rawAddress.toCPointer<ByteVar>())

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    libcWasiDifftime(a, b)

public actual fun mktime(a: MutPtr): TimeT =
    libcWasiMktime(a.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(a: MutPtr, b: SizeT, c: ConstPtr, d: ConstPtr): SizeT =
    libcWasiStrftime(a.rawAddress.toCPointer<ByteVar>(), b, c.rawAddress.toCPointer<ByteVar>(), d.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(a: ConstPtr): MutPtr =
    MutPtr(libcWasiGmtime(a.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gmtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    MutPtr(libcWasiGmtimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(a: ConstPtr): MutPtr =
    MutPtr(libcWasiLocaltime(a.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(a: ConstPtr, b: MutPtr): MutPtr =
    MutPtr(libcWasiLocaltimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    MutPtr(libcWasiAsctimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(a: ConstPtr, b: MutPtr): MutPtr =
    MutPtr(libcWasiCtimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nanosleep(a: ConstPtr, b: MutPtr): CInt =
    libcWasiNanosleep(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(a: ClockidT, b: MutPtr): CInt =
    0

public actual fun clockGettime(a: ClockidT, b: MutPtr): CInt =
    0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr, c: MutPtr): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    libcWasiIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcWasiIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcWasiIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcWasiIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcWasiIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcWasiIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcWasiIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcWasiIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcWasiIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcWasiIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcWasiIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcWasiIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcWasiTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcWasiToupper(c)

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    libcWasiSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    libcWasiSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    MutPtr(libcWasiFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun atof(s: ConstPtr): CDouble =
    libcWasiAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr): CInt =
    libcWasiAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr): CLong =
    libcWasiAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr): CLonglong =
    libcWasiAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    libcWasiStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    libcWasiStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    libcWasiStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    libcWasiStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    libcWasiStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    libcWasiStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    MutPtr(libcWasiStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcWasiStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcWasiStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcWasiStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    libcWasiStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcWasiStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    libcWasiStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcWasiStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    MutPtr(libcWasiStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcWasiStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    libcWasiStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr): MutPtr =
    MutPtr(libcWasiStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcWasiStrndup(cs.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcWasiStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcWasiStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    libcWasiStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    libcWasiStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr): SizeT =
    libcWasiStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    libcWasiStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr =
    MutPtr(libcWasiStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    MutPtr(libcWasiStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    libcWasiStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcWasiMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    libcWasiMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcWasiMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcWasiMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcWasiMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    libcWasiSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcWasiGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcWasiPutcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libcWasiShutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    libcWasiFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    libcWasiMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    libcWasiStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    MutPtr(libcWasiFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr): CInt =
    libcWasiFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcWasiOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    libcWasiCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr): MutPtr =
    MutPtr(libcWasiOpendir(dirname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fdopendir(fd: CInt): MutPtr =
    MutPtr(libcWasiFdopendir(fd)?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr): MutPtr =
    MutPtr(libcWasiReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: MutPtr): CInt =
    libcWasiClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: MutPtr) {
    libcWasiRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: MutPtr): CInt =
    libcWasiDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    libcWasiSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    libcWasiTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    libcWasiOpenat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    libcWasiFstatat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    libcWasiLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    libcWasiMkdirat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): SsizeT =
    libcWasiReadlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    libcWasiRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    libcWasiSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    libcWasiUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    libcWasiAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun close(fd: CInt): CInt =
    libcWasiClose(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcWasiFpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    libcWasiGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun isatty(fd: CInt): CInt =
    libcWasiIsatty(fd)

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    libcWasiLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcWasiLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    libcWasiPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun rmdir(path: ConstPtr): CInt =
    libcWasiRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun sleep(secs: CUint): CUint =
    libcWasiSleep(secs)

public actual fun unlink(c: ConstPtr): CInt =
    libcWasiUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    libcWasiPread(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    libcWasiPwrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    libcWasiLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libcWasiFsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libcWasiFdatasync(fd)

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    libcWasiSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    libcWasiTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcWasiFtruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    libcWasiGetrusage(resource, usage.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcWasiGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun times(buf: MutPtr): ClockT =
    libcWasiTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcWasiStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun usleep(secs: CUint): CInt =
    libcWasiUsleep(secs)

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    libcWasiSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    libcWasiRecv(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    libcWasiPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    MutPtr(libcWasiSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr =
    MutPtr(libcWasiLocaleconv()?.toLong() ?: 0L)

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): SsizeT =
    libcWasiReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsz)

public actual fun timegm(tm: MutPtr): TimeT =
    libcWasiTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libcWasiSysconf(name)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    libcWasiFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    libcWasiFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcWasiPosixFallocate(fd, offset, len)

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    MutPtr(libcWasiStrcasestr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    libcWasiGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcWasiFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcWasiWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    libcWasiReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcWasiPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    libcWasiPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcWasiPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    libcWasiFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    libcWasiUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcWasiGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    MutPtr(libcWasiMemrchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun abs(i: CInt): CInt =
    libcWasiAbs(i)

public actual fun labs(i: CLong): CLong =
    libcWasiLabs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcWasiDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcWasiFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcWasiNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcWasiUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun schedYield(): CInt =
    libcWasiSchedYield()

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    MutPtr(libcWasiGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun chdir(dir: ConstPtr): CInt =
    libcWasiChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcWasiNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr =
    MutPtr(libcWasiNlLanginfoL(item, loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: ConstPtr): CInt =
    libcWasiSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    libcWasiWasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcUnlinkat(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcRmdirat(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcFindRelpath(path: ConstPtr, absPrefix: MutPtr, relativePath: MutPtr, relativePathLen: ULong): CInt =
    libcWasiWasilibcFindRelpath(path.rawAddress.toCPointer<ByteVar>(), absPrefix.rawAddress.toCPointer<ByteVar>(), relativePath.rawAddress.toCPointer<ByteVar>(), relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    libcWasiWasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr, dirfd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcNocwdSymlinkat(target.rawAddress.toCPointer<ByteVar>(), dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr, buf: MutPtr, bufsize: ULong): Long =
    libcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    libcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    libcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr): CInt =
    libcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr): MutPtr =
    MutPtr(libcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wasilibcAccess(pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    libcWasiWasilibcAccess(pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun wasilibcStat(pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    libcWasiWasilibcStat(pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcUtimens(pathname: ConstPtr, times: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcUtimens(pathname.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLink(oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcLink(oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLinkNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    libcWasiWasilibcLinkNewat(oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr, newpath: ConstPtr): CInt =
    libcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRenameNewat(oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    libcWasiWasilibcRenameNewat(oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun arc4random(): UInt =
    libcWasiArc4random()

public actual fun arc4randomBuf(a: MutPtr, b: SizeT) {
    libcWasiArc4randomBuf(a.rawAddress.toCPointer<ByteVar>(), b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    libcWasiArc4randomUniform(a)

public actual fun errnoLocation(): MutPtr =
    MutPtr(libcWasiErrnoLocation()?.toLong() ?: 0L)

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    libcWasiChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libcWasiFchmod(fd, mode)

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    MutPtr(libcWasiRealpath(pathname.rawAddress.toCPointer<ByteVar>(), resolved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadSelf(): PthreadT =
    MutPtr(libcWasiPthreadSelf()?.toLong() ?: 0L)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcWasiPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcWasiPthreadEqual(t1.rawAddress.toCPointer<ByteVar>(), t2.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    libcWasiPthreadJoin(native.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    libcWasiPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    libcWasiPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    libcWasiPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    libcWasiPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    libcWasiPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcWasiPthreadDetach(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcWasiPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcWasiPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    MutPtr(libcWasiPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    libcWasiPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    libcWasiPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    libcWasiPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    libcWasiPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    libcWasiPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    libcWasiPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    libcWasiPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    libcWasiPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    libcWasiPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    libcWasiPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    libcWasiPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    libcWasiPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    libcWasiPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    libcWasiPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    libcWasiPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    libcWasiPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    libcWasiPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    libcWasiPthreadRwlockInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    libcWasiPthreadRwlockDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    libcWasiPthreadRwlockRdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    libcWasiPthreadRwlockTryrdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    libcWasiPthreadRwlockWrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    libcWasiPthreadRwlockTrywrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    libcWasiPthreadRwlockUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    libcWasiPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    libcWasiPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())
