@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var ENVIRON: MutPtr<MutPtr<CChar>>
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

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiAlignedAlloc(a, b)?.toLong() ?: 0L)

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiCalloc(amt, amt2)?.toLong() ?: 0L)

public actual fun free(ptr: MutPtr<CVoid>) {
    libcWasiFree(ptr.rawAddress.toCPointer<ByteVar>())
}

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiGetenv(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun malloc(amt: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiMalloc(amt)?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    libcWasiMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(libcWasiSbrk(increment)?.toLong() ?: 0L)

public actual fun rand(): CInt =
    libcWasiRand()

public actual fun read(fd: CInt, ptr: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcWasiRead(fd, ptr.rawAddress.toCPointer<ByteVar>(), size)

public actual fun realloc(ptr: MutPtr<CVoid>, amt: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiRealloc(ptr.rawAddress.toCPointer<ByteVar>(), amt)?.toLong() ?: 0L)

public actual fun setenv(k: ConstPtr<CChar>, v: ConstPtr<CChar>, a: CInt): CInt =
    libcWasiSetenv(k.rawAddress.toCPointer<ByteVar>(), v.rawAddress.toCPointer<ByteVar>(), a)

public actual fun unsetenv(k: ConstPtr<CChar>): CInt =
    libcWasiUnsetenv(k.rawAddress.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    libcWasiClearenv()

public actual fun write(fd: CInt, ptr: ConstPtr<CVoid>, size: SizeT): SsizeT =
    libcWasiWrite(fd, ptr.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcWasiFopen(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>, f: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(libcWasiFreopen(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), f.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fclose(f: MutPtr<FILE>): CInt =
    libcWasiFclose(f.rawAddress.toCPointer<ByteVar>())

public actual fun remove(a: ConstPtr<CChar>): CInt =
    libcWasiRemove(a.rawAddress.toCPointer<ByteVar>())

public actual fun rename(a: ConstPtr<CChar>, b: ConstPtr<CChar>): CInt =
    libcWasiRename(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())

public actual fun feof(f: MutPtr<FILE>): CInt =
    libcWasiFeof(f.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(f: MutPtr<FILE>): CInt =
    libcWasiFerror(f.rawAddress.toCPointer<ByteVar>())

public actual fun fflush(f: MutPtr<FILE>): CInt =
    libcWasiFflush(f.rawAddress.toCPointer<ByteVar>())

public actual fun clearerr(f: MutPtr<FILE>) {
    libcWasiClearerr(f.rawAddress.toCPointer<ByteVar>())
}

public actual fun fseek(f: MutPtr<FILE>, b: CLong, c: CInt): CInt =
    libcWasiFseek(f.rawAddress.toCPointer<ByteVar>(), b, c)

public actual fun ftell(f: MutPtr<FILE>): CLong =
    libcWasiFtell(f.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(f: MutPtr<FILE>) {
    libcWasiRewind(f.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgetpos(f: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    libcWasiFgetpos(f.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(f: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    libcWasiFsetpos(f.rawAddress.toCPointer<ByteVar>(), pos.rawAddress.toCPointer<ByteVar>())

public actual fun fread(buf: MutPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    libcWasiFread(buf.rawAddress.toCPointer<ByteVar>(), a, b, f.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(buf: ConstPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    libcWasiFwrite(buf.rawAddress.toCPointer<ByteVar>(), a, b, f.rawAddress.toCPointer<ByteVar>())

public actual fun fgetc(f: MutPtr<FILE>): CInt =
    libcWasiFgetc(f.rawAddress.toCPointer<ByteVar>())

public actual fun getc(f: MutPtr<FILE>): CInt =
    libcWasiGetc(f.rawAddress.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libcWasiGetchar()

public actual fun ungetc(a: CInt, f: MutPtr<FILE>): CInt =
    libcWasiUngetc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun fputc(a: CInt, f: MutPtr<FILE>): CInt =
    libcWasiFputc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun putc(a: CInt, f: MutPtr<FILE>): CInt =
    libcWasiPutc(a, f.rawAddress.toCPointer<ByteVar>())

public actual fun putchar(a: CInt): CInt =
    libcWasiPutchar(a)

public actual fun fputs(a: ConstPtr<CChar>, f: MutPtr<FILE>): CInt =
    libcWasiFputs(a.rawAddress.toCPointer<ByteVar>(), f.rawAddress.toCPointer<ByteVar>())

public actual fun puts(a: ConstPtr<CChar>): CInt =
    libcWasiPuts(a.rawAddress.toCPointer<ByteVar>())

public actual fun perror(a: ConstPtr<CChar>) {
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

public actual fun posixMemalign(a: MutPtr<MutPtr<CVoid>>, b: SizeT, c: SizeT): CInt =
    libcWasiPosixMemalign(a.rawAddress.toCPointer<ByteVar>(), b, c)

public actual fun randR(a: MutPtr<CUint>): CInt =
    libcWasiRandR(a.rawAddress.toCPointer<ByteVar>())

public actual fun random(): CLong =
    libcWasiRandom()

public actual fun srandom(a: CUint) {
    libcWasiSrandom(a)
}

public actual fun putenv(a: MutPtr<CChar>): CInt =
    libcWasiPutenv(a.rawAddress.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    libcWasiClock()

public actual fun time(a: MutPtr<TimeT>): TimeT =
    libcWasiTime(a.rawAddress.toCPointer<ByteVar>())

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    libcWasiDifftime(a, b)

public actual fun mktime(a: MutPtr<Tm>): TimeT =
    libcWasiMktime(a.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(a: MutPtr<CChar>, b: SizeT, c: ConstPtr<CChar>, d: ConstPtr<Tm>): SizeT =
    libcWasiStrftime(a.rawAddress.toCPointer<ByteVar>(), b, c.rawAddress.toCPointer<ByteVar>(), d.rawAddress.toCPointer<ByteVar>())

public actual fun gmtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcWasiGmtime(a.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gmtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcWasiGmtimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(libcWasiLocaltime(a.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(libcWasiLocaltimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun asctimeR(a: ConstPtr<Tm>, b: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiAsctimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(a: ConstPtr<TimeT>, b: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiCtimeR(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun nanosleep(a: ConstPtr<Timespec>, b: MutPtr<Timespec>): CInt =
    libcWasiNanosleep(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>())

public actual fun clockGetres(a: ClockidT, b: MutPtr<Timespec>): CInt =
    0

public actual fun clockGettime(a: ClockidT, b: MutPtr<Timespec>): CInt =
    0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr<Timespec>, c: MutPtr<Timespec>): CInt =
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

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    libcWasiSetvbuf(stream.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    libcWasiSetbuf(stream.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())
}

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(libcWasiFgets(buf.rawAddress.toCPointer<ByteVar>(), n, stream.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    libcWasiAtof(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    libcWasiAtoi(s.rawAddress.toCPointer<ByteVar>())

public actual fun atol(s: ConstPtr<CChar>): CLong =
    libcWasiAtol(s.rawAddress.toCPointer<ByteVar>())

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    libcWasiAtoll(s.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    libcWasiStrtod(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    libcWasiStrtof(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>())

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    libcWasiStrtol(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    libcWasiStrtoll(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    libcWasiStrtoul(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    libcWasiStrtoull(s.rawAddress.toCPointer<ByteVar>(), endp.rawAddress.toCPointer<ByteVar>(), base)

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcWasiStrncpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrcat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcWasiStrncat(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcWasiStrcmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    libcWasiStrncmp(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    libcWasiStrcoll(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcWasiStrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcWasiStrrchr(cs.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcWasiStrspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    libcWasiStrcspn(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrdup(cs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    MutPtr(libcWasiStrndup(cs.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrpbrk(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrstr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    libcWasiStrcasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    libcWasiStrncasecmp(s1.rawAddress.toCPointer<ByteVar>(), s2.rawAddress.toCPointer<ByteVar>(), n)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcWasiStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    libcWasiStrnlen(cs.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun strerror(n: CInt): MutPtr<CChar> =
    MutPtr(libcWasiStrerror(n)?.toLong() ?: 0L)

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrtok(s.rawAddress.toCPointer<ByteVar>(), t.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    libcWasiStrxfrm(s.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiMemchr(cx.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    libcWasiMemcmp(cx.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiMemcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiMemmove(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcWasiMemset(dest.rawAddress.toCPointer<ByteVar>(), c, n)?.toLong() ?: 0L)

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiFprintf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiPrintf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiSnprintf(s.rawAddress.toCPointer<ByteVar>(), n, format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiSprintf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiFscanf(stream.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiScanf(format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcWasiSscanf(s.rawAddress.toCPointer<ByteVar>(), format.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getcharUnlocked(): CInt =
    libcWasiGetcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    libcWasiPutcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    libcWasiShutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    libcWasiFstat(fildes, buf.rawAddress.toCPointer<ByteVar>())

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcWasiMkdir(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcWasiStat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(libcWasiFdopen(fd, mode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    libcWasiFileno(stream.rawAddress.toCPointer<ByteVar>())

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    libcWasiOpen(path.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcWasiCreat(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcWasiFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcWasiOpendir(dirname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    MutPtr(libcWasiFdopendir(fd)?.toLong() ?: 0L)

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    MutPtr(libcWasiReaddir(dirp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    libcWasiClosedir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    libcWasiRewinddir(dirp.rawAddress.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    libcWasiDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    libcWasiSeekdir(dirp.rawAddress.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    libcWasiTelldir(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    libcWasiOpenat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    libcWasiFstatat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    libcWasiMkdirat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    libcWasiReadlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    libcWasiRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    libcWasiSymlinkat(target.rawAddress.toCPointer<ByteVar>(), newdirfd, linkpath.rawAddress.toCPointer<ByteVar>())

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiUnlinkat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    libcWasiAccess(path.rawAddress.toCPointer<ByteVar>(), amode)

public actual fun close(fd: CInt): CInt =
    libcWasiClose(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    libcWasiFpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    libcWasiGetopt(argc, argv.rawAddress.toCPointer<ByteVar>(), optstr.rawAddress.toCPointer<ByteVar>())

public actual fun isatty(fd: CInt): CInt =
    libcWasiIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    libcWasiLink(src.rawAddress.toCPointer<ByteVar>(), dst.rawAddress.toCPointer<ByteVar>())

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    libcWasiLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    libcWasiPathconf(path.rawAddress.toCPointer<ByteVar>(), name)

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    libcWasiRmdir(path.rawAddress.toCPointer<ByteVar>())

public actual fun sleep(secs: CUint): CUint =
    libcWasiSleep(secs)

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    libcWasiUnlink(c.rawAddress.toCPointer<ByteVar>())

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcWasiPread(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    libcWasiPwrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count, offset)

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    libcWasiLstat(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    libcWasiFsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    libcWasiFdatasync(fd)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    libcWasiSymlink(path1.rawAddress.toCPointer<ByteVar>(), path2.rawAddress.toCPointer<ByteVar>())

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    libcWasiTruncate(path.rawAddress.toCPointer<ByteVar>(), length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    libcWasiFtruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    libcWasiGetrusage(resource, usage.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcWasiGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun times(buf: MutPtr<Tms>): ClockT =
    libcWasiTimes(buf.rawAddress.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcWasiStrerrorR(errnum, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun usleep(secs: CUint): CInt =
    libcWasiUsleep(secs)

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcWasiSend(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    libcWasiRecv(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    libcWasiPoll(fds.rawAddress.toCPointer<ByteVar>(), nfds, timeout)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiSetlocale(category, locale.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(libcWasiLocaleconv()?.toLong() ?: 0L)

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    libcWasiReadlink(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsz)

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    libcWasiTimegm(tm.rawAddress.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    libcWasiSysconf(name)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    libcWasiIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    libcWasiFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    libcWasiFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    libcWasiPosixFallocate(fd, offset, len)

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiStrcasestr(cs.rawAddress.toCPointer<ByteVar>(), ct.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    libcWasiGetline(lineptr.rawAddress.toCPointer<ByteVar>(), n.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcWasiFaccessat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcWasiWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcWasiReadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcWasiPwritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    libcWasiPreadv(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    libcWasiPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    libcWasiFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    libcWasiUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcWasiGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
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

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcWasiNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(libcWasiUselocale(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun schedYield(): CInt =
    libcWasiSchedYield()

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(libcWasiGetcwd(buf.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    libcWasiChdir(dir.rawAddress.toCPointer<ByteVar>())

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(libcWasiNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    MutPtr(libcWasiNlLanginfoL(item, loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): CInt =
    libcWasiSelect(nfds, readfds.rawAddress.toCPointer<ByteVar>(), writefds.rawAddress.toCPointer<ByteVar>(), errorfds.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcRegisterPreopenedFd(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    libcWasiWasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcUnlinkat(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcRmdirat(fd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcFindRelpath(path: ConstPtr<CChar>, absPrefix: MutPtr<ConstPtr<CChar>>, relativePath: MutPtr<MutPtr<CChar>>, relativePathLen: ULong): CInt =
    libcWasiWasilibcFindRelpath(path.rawAddress.toCPointer<ByteVar>(), absPrefix.rawAddress.toCPointer<ByteVar>(), relativePath.rawAddress.toCPointer<ByteVar>(), relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    libcWasiWasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcNocwdWasilibcUnlinkat(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcNocwdWasilibcRmdirat(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiWasilibcNocwdLinkat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr<CChar>, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcNocwdSymlinkat(target.rawAddress.toCPointer<ByteVar>(), dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: ULong): Long =
    libcWasiWasilibcNocwdReadlinkat(dirfd, path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcWasiWasilibcNocwdFaccessat(dirfd, path.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    libcWasiWasilibcNocwdRenameat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiWasilibcNocwdOpenatNomode(dirfd, path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    libcWasiWasilibcNocwdFstatat(dirfd, path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    libcWasiWasilibcNocwdMkdiratNomode(dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    libcWasiWasilibcNocwdUtimensat(dirfd, path.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr<CChar>): MutPtr<DIR> =
    MutPtr(libcWasiWasilibcNocwdOpendirat(dirfd, path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wasilibcAccess(pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    libcWasiWasilibcAccess(pathname.rawAddress.toCPointer<ByteVar>(), mode, flags)

public actual fun wasilibcStat(pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    libcWasiWasilibcStat(pathname.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcUtimens(pathname: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    libcWasiWasilibcUtimens(pathname.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLink(oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiWasilibcLink(oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiWasilibcLinkOldat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLinkNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    libcWasiWasilibcLinkNewat(oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>): CInt =
    libcWasiWasilibcRenameOldat(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newpath.rawAddress.toCPointer<ByteVar>())

public actual fun wasilibcRenameNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    libcWasiWasilibcRenameNewat(oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>())

public actual fun arc4random(): UInt =
    libcWasiArc4random()

public actual fun arc4randomBuf(a: MutPtr<CVoid>, b: SizeT) {
    libcWasiArc4randomBuf(a.rawAddress.toCPointer<ByteVar>(), b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    libcWasiArc4randomUniform(a)

public actual fun errnoLocation(): MutPtr<CInt> =
    MutPtr(libcWasiErrnoLocation()?.toLong() ?: 0L)

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    libcWasiChmod(path.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    libcWasiFchmod(fd, mode)

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcWasiRealpath(pathname.rawAddress.toCPointer<ByteVar>(), resolved.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pthreadSelf(): PthreadT =
    MutPtr(libcWasiPthreadSelf()?.toLong() ?: 0L)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    libcWasiPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    libcWasiPthreadEqual(t1.rawAddress.toCPointer<ByteVar>(), t2.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    libcWasiPthreadJoin(native.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    libcWasiPthreadAttrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    libcWasiPthreadAttrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    libcWasiPthreadAttrGetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    libcWasiPthreadAttrSetstacksize(attr.rawAddress.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    libcWasiPthreadAttrSetdetachstate(attr.rawAddress.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    libcWasiPthreadDetach(thread.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    libcWasiPthreadKeyCreate(key.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    libcWasiPthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    MutPtr(libcWasiPthreadGetspecific(key)?.toLong() ?: 0L)

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    libcWasiPthreadSetspecific(key, value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    libcWasiPthreadMutexInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    libcWasiPthreadMutexDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    libcWasiPthreadMutexLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    libcWasiPthreadMutexTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    libcWasiPthreadMutexUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcWasiPthreadMutexattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    libcWasiPthreadMutexattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    libcWasiPthreadMutexattrSettype(attr.rawAddress.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    libcWasiPthreadCondInit(cond.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    libcWasiPthreadCondWait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    libcWasiPthreadCondTimedwait(cond.rawAddress.toCPointer<ByteVar>(), lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    libcWasiPthreadCondSignal(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    libcWasiPthreadCondBroadcast(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    libcWasiPthreadCondDestroy(cond.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    libcWasiPthreadCondattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    libcWasiPthreadCondattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    libcWasiPthreadRwlockInit(lock.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockRdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockTryrdlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockWrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockTrywrlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    libcWasiPthreadRwlockUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcWasiPthreadRwlockattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    libcWasiPthreadRwlockattrDestroy(attr.rawAddress.toCPointer<ByteVar>())
