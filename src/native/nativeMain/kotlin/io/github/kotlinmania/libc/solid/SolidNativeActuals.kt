@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.libc.solid.cinterop.libcSolidA64l
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAbort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAbs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAccess
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAlignedAlloc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAsctime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAsctimeR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAsiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtQuickExit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtexit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtof
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtoi
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtol
import io.github.kotlinmania.libc.solid.cinterop.libcSolidAtoll
import io.github.kotlinmania.libc.solid.cinterop.libcSolidBcmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidBcopy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidBsearch
import io.github.kotlinmania.libc.solid.cinterop.libcSolidBzero
import io.github.kotlinmania.libc.solid.cinterop.libcSolidCalloc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidChdir
import io.github.kotlinmania.libc.solid.cinterop.libcSolidChmod
import io.github.kotlinmania.libc.solid.cinterop.libcSolidClearerr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidClock
import io.github.kotlinmania.libc.solid.cinterop.libcSolidClose
import io.github.kotlinmania.libc.solid.cinterop.libcSolidConsttimeMemequal
import io.github.kotlinmania.libc.solid.cinterop.libcSolidCreat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidCtime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidCtimeR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDehumanizeNumber
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDifftime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDup
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDup2
import io.github.kotlinmania.libc.solid.cinterop.libcSolidDuplocale
import io.github.kotlinmania.libc.solid.cinterop.libcSolidErand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidExit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidExplicitMemset
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFclose
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFcntl
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFdopen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFeof
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFerror
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFflush
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFfs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFgetc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFgetpos
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFgets
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFileno
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFiscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFlockfile
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFopen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFputc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFputs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFread
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFree
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFreelocale
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFreopen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFseek
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFseeko
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFsetpos
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFstat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFtell
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFtello
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFtrylockfile
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFunlockfile
import io.github.kotlinmania.libc.solid.cinterop.libcSolidFwrite
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetOPTERR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetOPTIND
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetOPTOPT
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetOPTRESET
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetSUBOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetStdioFile
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetcUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetchar
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetcharUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetcwd
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetenv
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetenvR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetopt
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetpid
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetprogname
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGets
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetsubopt
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetw
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGetwd
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGmtime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidGmtimeR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidHeapsort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidHumanizeNumber
import io.github.kotlinmania.libc.solid.cinterop.libcSolidInitstate
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsalnum
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsalpha
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsblank
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIscntrl
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsdigit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsgraph
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIslower
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsprint
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIspunct
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsspace
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsupper
import io.github.kotlinmania.libc.solid.cinterop.libcSolidIsxdigit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidItoa
import io.github.kotlinmania.libc.solid.cinterop.libcSolidJrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidL64a
import io.github.kotlinmania.libc.solid.cinterop.libcSolidL64aR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLabs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLcong48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLlabs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLocaleconv
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLocaleconvL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLocaltime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLocaltimeR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLseek
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLstat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidLtoa
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMalloc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMbCurMaxL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMblen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMblenL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMbstowcs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMbstowcsL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMbtowc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMbtowcL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemalign
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemccpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemchr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemcmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemcpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemmem
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemmove
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemrchr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMemset
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMergesort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMkdir
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMkdtemp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMkostemp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMkostemps
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMkstemp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMktemp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMktime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidMrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidNewlocale
import io.github.kotlinmania.libc.solid.cinterop.libcSolidNlLanginfo
import io.github.kotlinmania.libc.solid.cinterop.libcSolidNlLanginfoL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidNrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidOpen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPerror
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPopcount
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPopcount32
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPopcount64
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPopcountl
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPopcountll
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPrintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutcUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutchar
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutcharUnlocked
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutenv
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPuts
import io.github.kotlinmania.libc.solid.cinterop.libcSolidPutw
import io.github.kotlinmania.libc.solid.cinterop.libcSolidQabs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidQsort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidQuickExit
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRadixsort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRaise
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRand
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRandR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRandom
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRead
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRealloc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRemove
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRename
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRewind
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRindex
import io.github.kotlinmania.libc.solid.cinterop.libcSolidRmdir
import io.github.kotlinmania.libc.solid.cinterop.libcSolidScanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSeed48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetOPTERR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetOPTIND
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetOPTOPT
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetOPTRESET
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetSUBOPTARG
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetbuf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetenv
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetlocale
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetprogname
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetstate
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSetvbuf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSignal
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSiscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSleep
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSniprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSnprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSradixsort
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSrand
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSrand48
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSrandom
import io.github.kotlinmania.libc.solid.cinterop.libcSolidSscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStpcpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStpncpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcasecmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcasestr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrchr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcoll
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcollL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrcspn
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrdup
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrerror
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrerrorL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrerrorR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStresep
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrftime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrlcat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrlcpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrlen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrncasecmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrncat
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrncmp
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrncpy
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrndup
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrnlen
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrpbrk
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrrchr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrsep
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrspn
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrstr
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrsuftoll
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrsuftollx
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtod
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtodL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtof
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtofL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtok
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtokR
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtol
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtolL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtold
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoldL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoll
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtollL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoq
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoqL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoul
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoulL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoull
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtoullL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtouq
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrtouqL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrxfrm
import io.github.kotlinmania.libc.solid.cinterop.libcSolidStrxfrmL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTell
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTempnam
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTmpfile
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTmpnam
import io.github.kotlinmania.libc.solid.cinterop.libcSolidTolower
import io.github.kotlinmania.libc.solid.cinterop.libcSolidToupper
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUltoa
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUngetc
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUnlink
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUnsetenv
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUsleep
import io.github.kotlinmania.libc.solid.cinterop.libcSolidUtime
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVasiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVdiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVfiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVfiscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVfprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidViprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidViscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVsiprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVsiscanf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVsniprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVsnprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidVsprintf
import io.github.kotlinmania.libc.solid.cinterop.libcSolidWcstombs
import io.github.kotlinmania.libc.solid.cinterop.libcSolidWcstombsL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidWctomb
import io.github.kotlinmania.libc.solid.cinterop.libcSolidWctombL
import io.github.kotlinmania.libc.solid.cinterop.libcSolidWrite
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual var OPTARG: MutPtr
    get() = MutPtr(libcSolidGetOPTARG()?.toLong() ?: 0L)
    set(value) {
        libcSolidSetOPTARG(value.rawAddress.toCPointer<ByteVar>())
    }

public actual var OPTERR: CInt
    get() = libcSolidGetOPTERR()
    set(value) {
        libcSolidSetOPTERR(value)
    }

public actual var OPTIND: CInt
    get() = libcSolidGetOPTIND()
    set(value) {
        libcSolidSetOPTIND(value)
    }

public actual var OPTOPT: CInt
    get() = libcSolidGetOPTOPT()
    set(value) {
        libcSolidSetOPTOPT(value)
    }

public actual var OPTRESET: CInt
    get() = libcSolidGetOPTRESET()
    set(value) {
        libcSolidSetOPTRESET(value)
    }

public actual var SUBOPTARG: MutPtr
    get() = MutPtr(libcSolidGetSUBOPTARG()?.toLong() ?: 0L)
    set(value) {
        libcSolidSetSUBOPTARG(value.rawAddress.toCPointer<ByteVar>())
    }

public actual fun isalnum(c: CInt): CInt =
    libcSolidIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    libcSolidIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    libcSolidIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    libcSolidIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    libcSolidIsgraph(c)

public actual fun islower(c: CInt): CInt =
    libcSolidIslower(c)

public actual fun isprint(c: CInt): CInt =
    libcSolidIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    libcSolidIspunct(c)

public actual fun isspace(c: CInt): CInt =
    libcSolidIsspace(c)

public actual fun isupper(c: CInt): CInt =
    libcSolidIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    libcSolidIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    libcSolidIsblank(c)

public actual fun tolower(c: CInt): CInt =
    libcSolidTolower(c)

public actual fun toupper(c: CInt): CInt =
    libcSolidToupper(c)

public actual fun getStdioFile(fileno: CInt): MutPtr =
    MutPtr(libcSolidGetStdioFile(fileno)?.toLong() ?: 0L)

public actual fun clearerr(arg1: MutPtr) {
    libcSolidClearerr(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun fclose(arg1: MutPtr): CInt =
    libcSolidFclose(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun feof(arg1: MutPtr): CInt =
    libcSolidFeof(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun ferror(arg1: MutPtr): CInt =
    libcSolidFerror(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun fflush(arg1: MutPtr): CInt =
    libcSolidFflush(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun fgetc(arg1: MutPtr): CInt =
    libcSolidFgetc(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun fgets(arg1: MutPtr, arg2: CInt, arg3: MutPtr): MutPtr =
    MutPtr(libcSolidFgets(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fopen(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidFopen(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidFprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fputc(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidFputc(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun fputs(arg1: ConstPtr, arg2: MutPtr): CInt =
    libcSolidFputs(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun fread(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    libcSolidFread(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, arg4.rawAddress.toCPointer<ByteVar>())

public actual fun freopen(arg1: ConstPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    MutPtr(libcSolidFreopen(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidFscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(arg1: MutPtr, arg2: CLong, arg3: CInt): CInt =
    libcSolidFseek(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)

public actual fun ftell(arg1: MutPtr): CLong =
    libcSolidFtell(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun fwrite(arg1: ConstPtr, arg2: SizeT, arg3: SizeT, arg4: MutPtr): SizeT =
    libcSolidFwrite(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, arg4.rawAddress.toCPointer<ByteVar>())

public actual fun getc(arg1: MutPtr): CInt =
    libcSolidGetc(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    libcSolidGetchar()

public actual fun perror(arg1: ConstPtr) {
    libcSolidPerror(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun printf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidPrintf(arg1.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun putc(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidPutc(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun putchar(arg1: CInt): CInt =
    libcSolidPutchar(arg1)

public actual fun puts(arg1: ConstPtr): CInt =
    libcSolidPuts(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun remove(arg1: ConstPtr): CInt =
    libcSolidRemove(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun rewind(arg1: MutPtr) {
    libcSolidRewind(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun scanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidScanf(arg1.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun setbuf(arg1: MutPtr, arg2: MutPtr) {
    libcSolidSetbuf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())
}

public actual fun setvbuf(arg1: MutPtr, arg2: MutPtr, arg3: CInt, arg4: SizeT): CInt =
    libcSolidSetvbuf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4)

public actual fun sscanf(arg1: ConstPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpfile(): MutPtr =
    MutPtr(libcSolidTmpfile()?.toLong() ?: 0L)

public actual fun ungetc(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidUngetc(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun vfprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVfprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun vprintf(arg1: ConstPtr, arg2: VaList): CInt =
    libcSolidVprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun gets(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidGets(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun sprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpnam(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidTmpnam(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun vsprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVsprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun rename(arg1: ConstPtr, arg2: ConstPtr): CInt =
    libcSolidRename(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun asiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidAsiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidFiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidFiscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iprintf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidIprintf(arg1.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iscanf(arg1: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidIscanf(arg1.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siprintf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siscanf(arg1: MutPtr, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSiscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSniprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vasiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVasiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun vfiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVfiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun vfiscanf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVfiscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun viprintf(arg1: ConstPtr, arg2: VaList): CInt =
    libcSolidViprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun viscanf(arg1: ConstPtr, arg2: VaList): CInt =
    libcSolidViscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun vsiprintf(arg1: MutPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVsiprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun vsiscanf(arg1: ConstPtr, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVsiscanf(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun vsniprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    libcSolidVsniprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4.rawAddress.toCPointer<ByteVar>())

public actual fun vdiprintf(arg1: CInt, arg2: ConstPtr, arg3: VaList): CInt =
    libcSolidVdiprintf(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun diprintf(arg1: CInt, arg2: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidDiprintf(arg1, arg2.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fgetpos(arg1: MutPtr, arg2: MutPtr): CInt =
    libcSolidFgetpos(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun fsetpos(arg1: MutPtr, arg2: ConstPtr): CInt =
    libcSolidFsetpos(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun fdopen(arg1: CInt, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidFdopen(arg1, arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fileno(arg1: MutPtr): CInt =
    libcSolidFileno(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun flockfile(arg1: MutPtr) {
    libcSolidFlockfile(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun ftrylockfile(arg1: MutPtr): CInt =
    libcSolidFtrylockfile(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun funlockfile(arg1: MutPtr) {
    libcSolidFunlockfile(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun getcUnlocked(arg1: MutPtr): CInt =
    libcSolidGetcUnlocked(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun getcharUnlocked(): CInt =
    libcSolidGetcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidPutcUnlocked(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun putcharUnlocked(arg1: CInt): CInt =
    libcSolidPutcharUnlocked(arg1)

public actual fun snprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, vararg variadicArgs: Long): CInt =
    libcSolidSnprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: VaList): CInt =
    libcSolidVsnprintf(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4.rawAddress.toCPointer<ByteVar>())

public actual fun getw(arg1: MutPtr): CInt =
    libcSolidGetw(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun putw(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidPutw(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun tempnam(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidTempnam(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    libcSolidFseeko(stream.rawAddress.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: MutPtr): OffT =
    libcSolidFtello(stream.rawAddress.toCPointer<ByteVar>())

public actual fun atof(arg1: ConstPtr): Double =
    libcSolidAtof(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun strtod(arg1: ConstPtr, arg2: MutPtr): Double =
    libcSolidStrtod(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun drand48(): Double =
    libcSolidDrand48()

public actual fun erand48(arg1: MutPtr): Double =
    libcSolidErand48(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun strtof(arg1: ConstPtr, arg2: MutPtr): Float =
    libcSolidStrtof(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strtold(arg1: ConstPtr, arg2: MutPtr): Double =
    libcSolidStrtold(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strtodL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    libcSolidStrtodL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtofL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Float =
    libcSolidStrtofL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strtoldL(arg1: ConstPtr, arg2: MutPtr, arg3: LocaleT): Double =
    libcSolidStrtoldL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun exit(arg1: CInt): Nothing {
    libcSolidExit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    libcSolidAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    libcSolidAbs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    libcSolidAtexit(0L.toCPointer<ByteVar>())

public actual fun atoi(arg1: ConstPtr): CInt =
    libcSolidAtoi(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun atol(arg1: ConstPtr): CLong =
    libcSolidAtol(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun itoa(arg1: CInt, arg2: MutPtr, arg3: CInt): MutPtr =
    MutPtr(libcSolidItoa(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun ltoa(arg1: CLong, arg2: MutPtr, arg3: CInt): MutPtr =
    MutPtr(libcSolidLtoa(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun ultoa(arg1: CUlong, arg2: MutPtr, arg3: CInt): MutPtr =
    MutPtr(libcSolidUltoa(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun bsearch(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr =
    MutPtr(libcSolidBsearch(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4, 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun calloc(arg1: SizeT, arg2: SizeT): MutPtr =
    MutPtr(libcSolidCalloc(arg1, arg2)?.toLong() ?: 0L)

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: MutPtr) {
    libcSolidFree(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun getenv(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidGetenv(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun labs(arg1: CLong): CLong =
    libcSolidLabs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): MutPtr =
    MutPtr(libcSolidMalloc(arg1)?.toLong() ?: 0L)

public actual fun qsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    libcSolidQsort(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())
}

public actual fun rand(): CInt =
    libcSolidRand()

public actual fun realloc(arg1: MutPtr, arg2: SizeT): MutPtr =
    MutPtr(libcSolidRealloc(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun srand(arg1: CUint) {
    libcSolidSrand(arg1)
}

public actual fun strtol(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLong =
    libcSolidStrtol(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strtoul(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlong =
    libcSolidStrtoul(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun mblen(arg1: ConstPtr, arg2: SizeT): CInt =
    libcSolidMblen(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun mbstowcs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    libcSolidMbstowcs(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun wctomb(arg1: MutPtr, arg2: WcharT): CInt =
    libcSolidWctomb(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun mbtowc(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidMbtowc(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun wcstombs(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    libcSolidWcstombs(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun randR(arg1: MutPtr): CInt =
    libcSolidRandR(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun jrand48(arg1: MutPtr): CLong =
    libcSolidJrand48(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun lcong48(arg1: MutPtr) {
    libcSolidLcong48(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun lrand48(): CLong =
    libcSolidLrand48()

public actual fun mrand48(): CLong =
    libcSolidMrand48()

public actual fun nrand48(arg1: MutPtr): CLong =
    libcSolidNrand48(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun seed48(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidSeed48(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun srand48(arg1: CLong) {
    libcSolidSrand48(arg1)
}

public actual fun putenv(arg1: MutPtr): CInt =
    libcSolidPutenv(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun a64l(arg1: ConstPtr): CLong =
    libcSolidA64l(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun l64a(arg1: CLong): MutPtr =
    MutPtr(libcSolidL64a(arg1)?.toLong() ?: 0L)

public actual fun random(): CLong =
    libcSolidRandom()

public actual fun setstate(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidSetstate(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun initstate(arg1: CUint, arg2: MutPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidInitstate(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun srandom(arg1: CUint) {
    libcSolidSrandom(arg1)
}

public actual fun mkostemp(arg1: MutPtr, arg2: CInt): CInt =
    libcSolidMkostemp(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun mkostemps(arg1: MutPtr, arg2: CInt, arg3: CInt): CInt =
    libcSolidMkostemps(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)

public actual fun mkdtemp(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidMkdtemp(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mkstemp(arg1: MutPtr): CInt =
    libcSolidMkstemp(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun mktemp(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidMktemp(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun atoll(arg1: ConstPtr): CLonglong =
    libcSolidAtoll(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun llabs(arg1: CLonglong): CLonglong =
    libcSolidLlabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CLonglong =
    libcSolidStrtoll(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strtoull(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): CUlonglong =
    libcSolidStrtoull(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr =
    MutPtr(libcSolidAlignedAlloc(arg1, arg2)?.toLong() ?: 0L)

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    libcSolidAtQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(arg1: CInt) {
    libcSolidQuickExit(arg1)
}

public actual fun setenv(arg1: ConstPtr, arg2: ConstPtr, arg3: CInt): CInt =
    libcSolidSetenv(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun unsetenv(arg1: ConstPtr): CInt =
    libcSolidUnsetenv(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun humanizeNumber(arg1: MutPtr, arg2: SizeT, arg3: Long, arg4: ConstPtr, arg5: CInt, arg6: CInt): CInt =
    libcSolidHumanizeNumber(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, arg4.rawAddress.toCPointer<ByteVar>(), arg5, arg6)

public actual fun dehumanizeNumber(arg1: ConstPtr, arg2: MutPtr): CInt =
    libcSolidDehumanizeNumber(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun getenvR(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT): CInt =
    libcSolidGetenvR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun heapsort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    libcSolidHeapsort(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun mergesort(arg1: MutPtr, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    libcSolidMergesort(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3, 0L.toCPointer<ByteVar>())

public actual fun radixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    libcSolidRadixsort(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4)

public actual fun sradixsort(arg1: MutPtr, arg2: CInt, arg3: ConstPtr, arg4: CUint): CInt =
    libcSolidSradixsort(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4)

public actual fun getprogname(): ConstPtr =
    ConstPtr(libcSolidGetprogname()?.toLong() ?: 0L)

public actual fun setprogname(arg1: ConstPtr) {
    libcSolidSetprogname(arg1.rawAddress.toCPointer<ByteVar>())
}

public actual fun qabs(arg1: QuadT): QuadT =
    libcSolidQabs(arg1)

public actual fun strtoq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): QuadT =
    libcSolidStrtoq(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strtouq(arg1: ConstPtr, arg2: MutPtr, arg3: CInt): UQuadT =
    libcSolidStrtouq(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strsuftoll(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong): CLonglong =
    libcSolidStrsuftoll(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4)

public actual fun strsuftollx(arg1: ConstPtr, arg2: ConstPtr, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr, arg6: SizeT): CLonglong =
    libcSolidStrsuftollx(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4, arg5.rawAddress.toCPointer<ByteVar>(), arg6)

public actual fun l64aR(arg1: CLong, arg2: MutPtr, arg3: CInt): CInt =
    libcSolidL64aR(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLong =
    libcSolidStrtolL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoulL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlong =
    libcSolidStrtoulL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtollL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CLonglong =
    libcSolidStrtollL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoullL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): CUlonglong =
    libcSolidStrtoullL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtoqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): QuadT =
    libcSolidStrtoqL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strtouqL(arg1: ConstPtr, arg2: MutPtr, arg3: CInt, arg4: LocaleT): UQuadT =
    libcSolidStrtouqL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    libcSolidMbCurMaxL(arg1.toLong().toCPointer<ByteVar>())

public actual fun mblenL(arg1: ConstPtr, arg2: SizeT, arg3: LocaleT): CInt =
    libcSolidMblenL(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbstowcsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    libcSolidMbstowcsL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wctombL(arg1: MutPtr, arg2: WcharT, arg3: LocaleT): CInt =
    libcSolidWctombL(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.toLong().toCPointer<ByteVar>())

public actual fun mbtowcL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): CInt =
    libcSolidMbtowcL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun wcstombsL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    libcSolidWcstombsL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun memchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    MutPtr(libcSolidMemchr(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)?.toLong() ?: 0L)

public actual fun memcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidMemcmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun memcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidMemcpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun memmove(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidMemmove(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun memset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    MutPtr(libcSolidMemset(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)?.toLong() ?: 0L)

public actual fun strcat(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrcat(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    MutPtr(libcSolidStrchr(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun strcmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    libcSolidStrcmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strcoll(arg1: ConstPtr, arg2: ConstPtr): CInt =
    libcSolidStrcoll(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrcpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strcspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    libcSolidStrcspn(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strerror(arg1: CInt): MutPtr =
    MutPtr(libcSolidStrerror(arg1)?.toLong() ?: 0L)

public actual fun strlen(arg1: ConstPtr): SizeT =
    libcSolidStrlen(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun strncat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidStrncat(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun strncmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidStrncmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidStrncpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun strpbrk(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrpbrk(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strrchr(arg1: ConstPtr, arg2: CInt): MutPtr =
    MutPtr(libcSolidStrrchr(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun strspn(arg1: ConstPtr, arg2: ConstPtr): SizeT =
    libcSolidStrspn(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strstr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrstr(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtok(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrtok(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strtokR(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): MutPtr =
    MutPtr(libcSolidStrtokR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strerrorR(arg1: CInt, arg2: MutPtr, arg3: SizeT): CInt =
    libcSolidStrerrorR(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strxfrm(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    libcSolidStrxfrm(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun memccpy(arg1: MutPtr, arg2: ConstPtr, arg3: CInt, arg4: SizeT): MutPtr =
    MutPtr(libcSolidMemccpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4)?.toLong() ?: 0L)

public actual fun strdup(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidStrdup(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stpcpy(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStpcpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stpncpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): MutPtr =
    MutPtr(libcSolidStpncpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun strnlen(arg1: ConstPtr, arg2: SizeT): SizeT =
    libcSolidStrnlen(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun memmem(arg1: ConstPtr, arg2: SizeT, arg3: ConstPtr, arg4: SizeT): MutPtr =
    MutPtr(libcSolidMemmem(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4)?.toLong() ?: 0L)

public actual fun strcasestr(arg1: ConstPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrcasestr(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strlcat(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    libcSolidStrlcat(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strlcpy(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT): SizeT =
    libcSolidStrlcpy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strsep(arg1: MutPtr, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidStrsep(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stresep(arg1: MutPtr, arg2: ConstPtr, arg3: CInt): MutPtr =
    MutPtr(libcSolidStresep(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)?.toLong() ?: 0L)

public actual fun strndup(arg1: ConstPtr, arg2: SizeT): MutPtr =
    MutPtr(libcSolidStrndup(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun memrchr(arg1: ConstPtr, arg2: CInt, arg3: SizeT): MutPtr =
    MutPtr(libcSolidMemrchr(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)?.toLong() ?: 0L)

public actual fun explicitMemset(arg1: MutPtr, arg2: CInt, arg3: SizeT): MutPtr =
    MutPtr(libcSolidExplicitMemset(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3)?.toLong() ?: 0L)

public actual fun consttimeMemequal(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidConsttimeMemequal(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun strcollL(arg1: ConstPtr, arg2: ConstPtr, arg3: LocaleT): CInt =
    libcSolidStrcollL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())

public actual fun strxfrmL(arg1: MutPtr, arg2: ConstPtr, arg3: SizeT, arg4: LocaleT): SizeT =
    libcSolidStrxfrmL(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3, arg4.toLong().toCPointer<ByteVar>())

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr =
    MutPtr(libcSolidStrerrorL(arg1, arg2.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bcmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidBcmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun bcopy(arg1: ConstPtr, arg2: MutPtr, arg3: SizeT) {
    libcSolidBcopy(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)
}

public actual fun bzero(arg1: MutPtr, arg2: SizeT) {
    libcSolidBzero(arg1.rawAddress.toCPointer<ByteVar>(), arg2)
}

public actual fun ffs(arg1: CInt): CInt =
    libcSolidFfs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    libcSolidPopcount(arg1)

public actual fun popcountl(arg1: CUlong): CUint =
    libcSolidPopcountl(arg1)

public actual fun popcountll(arg1: CUlonglong): CUint =
    libcSolidPopcountll(arg1)

public actual fun popcount32(arg1: UInt): CUint =
    libcSolidPopcount32(arg1)

public actual fun popcount64(arg1: ULong): CUint =
    libcSolidPopcount64(arg1)

public actual fun rindex(arg1: ConstPtr, arg2: CInt): MutPtr =
    MutPtr(libcSolidRindex(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun strcasecmp(arg1: ConstPtr, arg2: ConstPtr): CInt =
    libcSolidStrcasecmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun strncasecmp(arg1: ConstPtr, arg2: ConstPtr, arg3: SizeT): CInt =
    libcSolidStrncasecmp(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    libcSolidSignal(arg1, arg2)

public actual fun raise(arg1: CInt): CInt =
    libcSolidRaise(arg1)

public actual fun asctime(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidAsctime(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun clock(): ClockT =
    libcSolidClock()

public actual fun ctime(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidCtime(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    libcSolidDifftime(arg1, arg2)

public actual fun gmtime(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidGmtime(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtime(arg1: ConstPtr): MutPtr =
    MutPtr(libcSolidLocaltime(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun time(arg1: MutPtr): TimeT =
    libcSolidTime(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun mktime(arg1: MutPtr): TimeT =
    libcSolidMktime(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun strftime(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: ConstPtr): SizeT =
    libcSolidStrftime(arg1.rawAddress.toCPointer<ByteVar>(), arg2, arg3.rawAddress.toCPointer<ByteVar>(), arg4.rawAddress.toCPointer<ByteVar>())

public actual fun utime(arg1: ConstPtr, arg2: MutPtr): CInt =
    libcSolidUtime(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun asctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    MutPtr(libcSolidAsctimeR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    MutPtr(libcSolidCtimeR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gmtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    MutPtr(libcSolidGmtimeR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun localtimeR(arg1: ConstPtr, arg2: MutPtr): MutPtr =
    MutPtr(libcSolidLocaltimeR(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun stat(arg1: ConstPtr, arg2: MutPtr): CInt =
    libcSolidStat(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun lstat(arg1: ConstPtr, arg2: MutPtr): CInt =
    libcSolidLstat(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(arg1: CInt, arg2: MutPtr): CInt =
    libcSolidFstat(arg1, arg2.rawAddress.toCPointer<ByteVar>())

public actual fun chmod(arg1: ConstPtr, arg2: ModeT): CInt =
    libcSolidChmod(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun mkdir(arg1: ConstPtr, arg2: ModeT): CInt =
    libcSolidMkdir(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun open(arg1: ConstPtr, arg2: CInt, vararg variadicArgs: Long): CInt =
    libcSolidOpen(arg1.rawAddress.toCPointer<ByteVar>(), arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(arg1: ConstPtr, arg2: CInt): CInt =
    libcSolidCreat(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun close(arg1: CInt): CInt =
    libcSolidClose(arg1)

public actual fun read(arg1: CInt, arg2: MutPtr, arg3: CInt): CInt =
    libcSolidRead(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun write(arg1: CInt, arg2: ConstPtr, arg3: CInt): CInt =
    libcSolidWrite(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3)

public actual fun unlink(arg1: ConstPtr): CInt =
    libcSolidUnlink(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun tell(arg1: CInt): CLong =
    libcSolidTell(arg1)

public actual fun dup(arg1: CInt): CInt =
    libcSolidDup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    libcSolidDup2(arg1, arg2)

public actual fun access(arg1: ConstPtr, arg2: CInt): CInt =
    libcSolidAccess(arg1.rawAddress.toCPointer<ByteVar>(), arg2)

public actual fun rmdir(arg1: ConstPtr): CInt =
    libcSolidRmdir(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun chdir(arg1: ConstPtr): CInt =
    libcSolidChdir(arg1.rawAddress.toCPointer<ByteVar>())

public actual fun getwd(arg1: MutPtr): MutPtr =
    MutPtr(libcSolidGetwd(arg1.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getcwd(arg1: MutPtr, arg2: SizeT): MutPtr =
    MutPtr(libcSolidGetcwd(arg1.rawAddress.toCPointer<ByteVar>(), arg2)?.toLong() ?: 0L)

public actual fun getopt(arg1: CInt, arg2: MutPtr, arg3: ConstPtr): CInt =
    libcSolidGetopt(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun getsubopt(arg1: MutPtr, arg2: ConstPtr, arg3: MutPtr): CInt =
    libcSolidGetsubopt(arg1.rawAddress.toCPointer<ByteVar>(), arg2.rawAddress.toCPointer<ByteVar>(), arg3.rawAddress.toCPointer<ByteVar>())

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    libcSolidFcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpid(): PidT =
    libcSolidGetpid()

public actual fun sleep(arg1: CUint): CUint =
    libcSolidSleep(arg1)

public actual fun usleep(arg1: UsecondsT): CInt =
    libcSolidUsleep(arg1)

public actual fun localeconv(): MutPtr =
    MutPtr(libcSolidLocaleconv()?.toLong() ?: 0L)

public actual fun setlocale(arg1: CInt, arg2: ConstPtr): MutPtr =
    MutPtr(libcSolidSetlocale(arg1, arg2.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun duplocale(arg1: LocaleT): LocaleT =
    (libcSolidDuplocale(arg1.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun freelocale(arg1: LocaleT) {
    libcSolidFreelocale(arg1.toLong().toCPointer<ByteVar>())
}

public actual fun localeconvL(arg1: LocaleT): MutPtr =
    MutPtr(libcSolidLocaleconvL(arg1.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun newlocale(arg1: CInt, arg2: ConstPtr, arg3: LocaleT): LocaleT =
    (libcSolidNewlocale(arg1, arg2.rawAddress.toCPointer<ByteVar>(), arg3.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L).toULong()

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(libcSolidNlLanginfo(item)?.toLong() ?: 0L)

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr =
    MutPtr(libcSolidNlLanginfoL(item, locale.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(libcSolidMemalign(align, size)?.toLong() ?: 0L)

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    libcSolidLseek(arg1, arg2, arg3)
