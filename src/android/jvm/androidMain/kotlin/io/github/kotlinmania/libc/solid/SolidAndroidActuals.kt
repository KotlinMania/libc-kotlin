@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.solid.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object SolidJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcSolidGetOPTARG(): Long

    @JvmStatic
    external fun libcSolidSetOPTARG(value: Long)

    @JvmStatic
    external fun libcSolidGetOPTERR(): Int

    @JvmStatic
    external fun libcSolidSetOPTERR(value: Int)

    @JvmStatic
    external fun libcSolidGetOPTIND(): Int

    @JvmStatic
    external fun libcSolidSetOPTIND(value: Int)

    @JvmStatic
    external fun libcSolidGetOPTOPT(): Int

    @JvmStatic
    external fun libcSolidSetOPTOPT(value: Int)

    @JvmStatic
    external fun libcSolidGetOPTRESET(): Int

    @JvmStatic
    external fun libcSolidSetOPTRESET(value: Int)

    @JvmStatic
    external fun libcSolidGetSUBOPTARG(): Long

    @JvmStatic
    external fun libcSolidSetSUBOPTARG(value: Long)

    @JvmStatic
    external fun libcSolidIsalnum(c: Int): Int

    @JvmStatic
    external fun libcSolidIsalpha(c: Int): Int

    @JvmStatic
    external fun libcSolidIscntrl(c: Int): Int

    @JvmStatic
    external fun libcSolidIsdigit(c: Int): Int

    @JvmStatic
    external fun libcSolidIsgraph(c: Int): Int

    @JvmStatic
    external fun libcSolidIslower(c: Int): Int

    @JvmStatic
    external fun libcSolidIsprint(c: Int): Int

    @JvmStatic
    external fun libcSolidIspunct(c: Int): Int

    @JvmStatic
    external fun libcSolidIsspace(c: Int): Int

    @JvmStatic
    external fun libcSolidIsupper(c: Int): Int

    @JvmStatic
    external fun libcSolidIsxdigit(c: Int): Int

    @JvmStatic
    external fun libcSolidIsblank(c: Int): Int

    @JvmStatic
    external fun libcSolidTolower(c: Int): Int

    @JvmStatic
    external fun libcSolidToupper(c: Int): Int

    @JvmStatic
    external fun libcSolidGetStdioFile(fileno: Int): Long

    @JvmStatic
    external fun libcSolidClearerr(arg1: Long)

    @JvmStatic
    external fun libcSolidFclose(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFeof(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFerror(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFflush(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFgetc(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFgets(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libcSolidFopen(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidFprintf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidFputc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidFputs(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidFread(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidFreopen(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidFscanf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidFseek(arg1: Long, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libcSolidFtell(arg1: Long): Long

    @JvmStatic
    external fun libcSolidFwrite(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidGetc(arg1: Long): Int

    @JvmStatic
    external fun libcSolidGetchar(): Int

    @JvmStatic
    external fun libcSolidPerror(arg1: Long)

    @JvmStatic
    external fun libcSolidPrintf(arg1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidPutc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidPutchar(arg1: Int): Int

    @JvmStatic
    external fun libcSolidPuts(arg1: Long): Int

    @JvmStatic
    external fun libcSolidRemove(arg1: Long): Int

    @JvmStatic
    external fun libcSolidRewind(arg1: Long)

    @JvmStatic
    external fun libcSolidScanf(arg1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidSetbuf(arg1: Long, arg2: Long)

    @JvmStatic
    external fun libcSolidSetvbuf(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Int

    @JvmStatic
    external fun libcSolidSscanf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidTmpfile(): Long

    @JvmStatic
    external fun libcSolidUngetc(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidVfprintf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidVprintf(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidGets(arg1: Long): Long

    @JvmStatic
    external fun libcSolidSprintf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidTmpnam(arg1: Long): Long

    @JvmStatic
    external fun libcSolidVsprintf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidRename(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidAsiprintf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidFiprintf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidFiscanf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidIprintf(arg1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidIscanf(arg1: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidSiprintf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidSiscanf(arg1: Long, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidSniprintf(arg1: Long, arg2: Long, arg3: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidVasiprintf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidVfiprintf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidVfiscanf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidViprintf(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidViscanf(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidVsiprintf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidVsiscanf(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidVsniprintf(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libcSolidVdiprintf(arg1: Int, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidDiprintf(arg1: Int, arg2: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidFgetpos(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidFsetpos(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidFdopen(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libcSolidFileno(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFlockfile(arg1: Long)

    @JvmStatic
    external fun libcSolidFtrylockfile(arg1: Long): Int

    @JvmStatic
    external fun libcSolidFunlockfile(arg1: Long)

    @JvmStatic
    external fun libcSolidGetcUnlocked(arg1: Long): Int

    @JvmStatic
    external fun libcSolidGetcharUnlocked(): Int

    @JvmStatic
    external fun libcSolidPutcUnlocked(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidPutcharUnlocked(arg1: Int): Int

    @JvmStatic
    external fun libcSolidSnprintf(arg1: Long, arg2: Long, arg3: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidVsnprintf(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libcSolidGetw(arg1: Long): Int

    @JvmStatic
    external fun libcSolidPutw(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidTempnam(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidFseeko(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcSolidFtello(stream: Long): Long

    @JvmStatic
    external fun libcSolidAtof(arg1: Long): Double

    @JvmStatic
    external fun libcSolidStrtod(arg1: Long, arg2: Long): Double

    @JvmStatic
    external fun libcSolidDrand48(): Double

    @JvmStatic
    external fun libcSolidErand48(arg1: Long): Double

    @JvmStatic
    external fun libcSolidStrtof(arg1: Long, arg2: Long): Float

    @JvmStatic
    external fun libcSolidStrtold(arg1: Long, arg2: Long): Double

    @JvmStatic
    external fun libcSolidStrtodL(arg1: Long, arg2: Long, arg3: Long): Double

    @JvmStatic
    external fun libcSolidStrtofL(arg1: Long, arg2: Long, arg3: Long): Float

    @JvmStatic
    external fun libcSolidStrtoldL(arg1: Long, arg2: Long, arg3: Long): Double

    @JvmStatic
    external fun libcSolidExit(arg1: Int)

    @JvmStatic
    external fun libcSolidAbort()

    @JvmStatic
    external fun libcSolidAbs(arg1: Int): Int

    @JvmStatic
    external fun libcSolidAtexit(arg1: Long): Int

    @JvmStatic
    external fun libcSolidAtoi(arg1: Long): Int

    @JvmStatic
    external fun libcSolidAtol(arg1: Long): Long

    @JvmStatic
    external fun libcSolidItoa(arg1: Int, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidLtoa(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidUltoa(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidBsearch(arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Long

    @JvmStatic
    external fun libcSolidCalloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidFree(arg1: Long)

    @JvmStatic
    external fun libcSolidGetenv(arg1: Long): Long

    @JvmStatic
    external fun libcSolidLabs(arg1: Long): Long

    @JvmStatic
    external fun libcSolidMalloc(arg1: Long): Long

    @JvmStatic
    external fun libcSolidQsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long)

    @JvmStatic
    external fun libcSolidRand(): Int

    @JvmStatic
    external fun libcSolidRealloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidSrand(arg1: Int)

    @JvmStatic
    external fun libcSolidStrtol(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidStrtoul(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidMblen(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidMbstowcs(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidWctomb(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidMbtowc(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidWcstombs(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidRandR(arg1: Long): Int

    @JvmStatic
    external fun libcSolidJrand48(arg1: Long): Long

    @JvmStatic
    external fun libcSolidLcong48(arg1: Long)

    @JvmStatic
    external fun libcSolidLrand48(): Long

    @JvmStatic
    external fun libcSolidMrand48(): Long

    @JvmStatic
    external fun libcSolidNrand48(arg1: Long): Long

    @JvmStatic
    external fun libcSolidSeed48(arg1: Long): Long

    @JvmStatic
    external fun libcSolidSrand48(arg1: Long)

    @JvmStatic
    external fun libcSolidPutenv(arg1: Long): Int

    @JvmStatic
    external fun libcSolidA64l(arg1: Long): Long

    @JvmStatic
    external fun libcSolidL64a(arg1: Long): Long

    @JvmStatic
    external fun libcSolidRandom(): Long

    @JvmStatic
    external fun libcSolidSetstate(arg1: Long): Long

    @JvmStatic
    external fun libcSolidInitstate(arg1: Int, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidSrandom(arg1: Int)

    @JvmStatic
    external fun libcSolidMkostemp(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidMkostemps(arg1: Long, arg2: Int, arg3: Int): Int

    @JvmStatic
    external fun libcSolidMkdtemp(arg1: Long): Long

    @JvmStatic
    external fun libcSolidMkstemp(arg1: Long): Int

    @JvmStatic
    external fun libcSolidMktemp(arg1: Long): Long

    @JvmStatic
    external fun libcSolidAtoll(arg1: Long): Long

    @JvmStatic
    external fun libcSolidLlabs(arg1: Long): Long

    @JvmStatic
    external fun libcSolidStrtoll(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidStrtoull(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidAlignedAlloc(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidAtQuickExit(arg1: Long): Int

    @JvmStatic
    external fun libcSolidQuickExit(arg1: Int)

    @JvmStatic
    external fun libcSolidSetenv(arg1: Long, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libcSolidUnsetenv(arg1: Long): Int

    @JvmStatic
    external fun libcSolidHumanizeNumber(arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Int, arg6: Int): Int

    @JvmStatic
    external fun libcSolidDehumanizeNumber(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidGetenvR(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidHeapsort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libcSolidMergesort(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libcSolidRadixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int

    @JvmStatic
    external fun libcSolidSradixsort(arg1: Long, arg2: Int, arg3: Long, arg4: Int): Int

    @JvmStatic
    external fun libcSolidGetprogname(): Long

    @JvmStatic
    external fun libcSolidSetprogname(arg1: Long)

    @JvmStatic
    external fun libcSolidQabs(arg1: Long): Long

    @JvmStatic
    external fun libcSolidStrtoq(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidStrtouq(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidStrsuftoll(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrsuftollx(arg1: Long, arg2: Long, arg3: Long, arg4: Long, arg5: Long, arg6: Long): Long

    @JvmStatic
    external fun libcSolidL64aR(arg1: Long, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libcSolidStrtolL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrtoulL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrtollL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrtoullL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrtoqL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrtouqL(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidMbCurMaxL(arg1: Long): Long

    @JvmStatic
    external fun libcSolidMblenL(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidMbstowcsL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidWctombL(arg1: Long, arg2: Int, arg3: Long): Int

    @JvmStatic
    external fun libcSolidMbtowcL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Int

    @JvmStatic
    external fun libcSolidWcstombsL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidMemchr(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libcSolidMemcmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidMemcpy(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidMemmove(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidMemset(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrcat(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrchr(arg1: Long, arg2: Int): Long

    @JvmStatic
    external fun libcSolidStrcmp(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidStrcoll(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidStrcpy(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrcspn(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrerror(arg1: Int): Long

    @JvmStatic
    external fun libcSolidStrlen(arg1: Long): Long

    @JvmStatic
    external fun libcSolidStrncat(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrncmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidStrncpy(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrpbrk(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrrchr(arg1: Long, arg2: Int): Long

    @JvmStatic
    external fun libcSolidStrspn(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrstr(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrtok(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrtokR(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrerrorR(arg1: Int, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidStrxfrm(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidMemccpy(arg1: Long, arg2: Long, arg3: Int, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrdup(arg1: Long): Long

    @JvmStatic
    external fun libcSolidStpcpy(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStpncpy(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrnlen(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidMemmem(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrcasestr(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStrlcat(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrlcpy(arg1: Long, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidStrsep(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStresep(arg1: Long, arg2: Long, arg3: Int): Long

    @JvmStatic
    external fun libcSolidStrndup(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidMemrchr(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libcSolidExplicitMemset(arg1: Long, arg2: Int, arg3: Long): Long

    @JvmStatic
    external fun libcSolidConsttimeMemequal(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidStrcollL(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidStrxfrmL(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidStrerrorL(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libcSolidBcmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidBcopy(arg1: Long, arg2: Long, arg3: Long)

    @JvmStatic
    external fun libcSolidBzero(arg1: Long, arg2: Long)

    @JvmStatic
    external fun libcSolidFfs(arg1: Int): Int

    @JvmStatic
    external fun libcSolidPopcount(arg1: Int): Int

    @JvmStatic
    external fun libcSolidPopcountl(arg1: Long): Int

    @JvmStatic
    external fun libcSolidPopcountll(arg1: Long): Int

    @JvmStatic
    external fun libcSolidPopcount32(arg1: Int): Int

    @JvmStatic
    external fun libcSolidPopcount64(arg1: Long): Int

    @JvmStatic
    external fun libcSolidRindex(arg1: Long, arg2: Int): Long

    @JvmStatic
    external fun libcSolidStrcasecmp(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidStrncasecmp(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidSignal(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libcSolidRaise(arg1: Int): Int

    @JvmStatic
    external fun libcSolidAsctime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidClock(): Int

    @JvmStatic
    external fun libcSolidCtime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidDifftime(arg1: Long, arg2: Long): Double

    @JvmStatic
    external fun libcSolidGmtime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidLocaltime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidTime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidMktime(arg1: Long): Long

    @JvmStatic
    external fun libcSolidStrftime(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcSolidUtime(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidAsctimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidCtimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidGmtimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidLocaltimeR(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidStat(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidLstat(arg1: Long, arg2: Long): Int

    @JvmStatic
    external fun libcSolidFstat(arg1: Int, arg2: Long): Int

    @JvmStatic
    external fun libcSolidChmod(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidMkdir(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidOpen(arg1: Long, arg2: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidCreat(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidClose(arg1: Int): Int

    @JvmStatic
    external fun libcSolidRead(arg1: Int, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libcSolidWrite(arg1: Int, arg2: Long, arg3: Int): Int

    @JvmStatic
    external fun libcSolidUnlink(arg1: Long): Int

    @JvmStatic
    external fun libcSolidTell(arg1: Int): Long

    @JvmStatic
    external fun libcSolidDup(arg1: Int): Int

    @JvmStatic
    external fun libcSolidDup2(arg1: Int, arg2: Int): Int

    @JvmStatic
    external fun libcSolidAccess(arg1: Long, arg2: Int): Int

    @JvmStatic
    external fun libcSolidRmdir(arg1: Long): Int

    @JvmStatic
    external fun libcSolidChdir(arg1: Long): Int

    @JvmStatic
    external fun libcSolidGetwd(arg1: Long): Long

    @JvmStatic
    external fun libcSolidGetcwd(arg1: Long, arg2: Long): Long

    @JvmStatic
    external fun libcSolidGetopt(arg1: Int, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidGetsubopt(arg1: Long, arg2: Long, arg3: Long): Int

    @JvmStatic
    external fun libcSolidFcntl(arg1: Int, arg2: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcSolidGetpid(): Int

    @JvmStatic
    external fun libcSolidSleep(arg1: Int): Int

    @JvmStatic
    external fun libcSolidUsleep(arg1: Int): Int

    @JvmStatic
    external fun libcSolidLocaleconv(): Long

    @JvmStatic
    external fun libcSolidSetlocale(arg1: Int, arg2: Long): Long

    @JvmStatic
    external fun libcSolidDuplocale(arg1: Long): Long

    @JvmStatic
    external fun libcSolidFreelocale(arg1: Long)

    @JvmStatic
    external fun libcSolidLocaleconvL(arg1: Long): Long

    @JvmStatic
    external fun libcSolidNewlocale(arg1: Int, arg2: Long, arg3: Long): Long

    @JvmStatic
    external fun libcSolidNlLanginfo(item: Long): Long

    @JvmStatic
    external fun libcSolidNlLanginfoL(item: Long, locale: Long): Long

    @JvmStatic
    external fun libcSolidMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcSolidLseek(arg1: Int, arg2: Long, arg3: Int): Long
}

public actual var OPTARG: MutPtr<CChar>
    get() = MutPtr(SolidJniBridge.libcSolidGetOPTARG())
    set(value) {
        SolidJniBridge.libcSolidSetOPTARG(value.rawAddress)
    }

public actual var OPTERR: CInt
    get() = SolidJniBridge.libcSolidGetOPTERR()
    set(value) {
        SolidJniBridge.libcSolidSetOPTERR(value)
    }

public actual var OPTIND: CInt
    get() = SolidJniBridge.libcSolidGetOPTIND()
    set(value) {
        SolidJniBridge.libcSolidSetOPTIND(value)
    }

public actual var OPTOPT: CInt
    get() = SolidJniBridge.libcSolidGetOPTOPT()
    set(value) {
        SolidJniBridge.libcSolidSetOPTOPT(value)
    }

public actual var OPTRESET: CInt
    get() = SolidJniBridge.libcSolidGetOPTRESET()
    set(value) {
        SolidJniBridge.libcSolidSetOPTRESET(value)
    }

public actual var SUBOPTARG: MutPtr<CChar>
    get() = MutPtr(SolidJniBridge.libcSolidGetSUBOPTARG())
    set(value) {
        SolidJniBridge.libcSolidSetSUBOPTARG(value.rawAddress)
    }

public actual fun isalnum(c: CInt): CInt =
    SolidJniBridge.libcSolidIsalnum(c)

public actual fun isalpha(c: CInt): CInt =
    SolidJniBridge.libcSolidIsalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    SolidJniBridge.libcSolidIscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    SolidJniBridge.libcSolidIsdigit(c)

public actual fun isgraph(c: CInt): CInt =
    SolidJniBridge.libcSolidIsgraph(c)

public actual fun islower(c: CInt): CInt =
    SolidJniBridge.libcSolidIslower(c)

public actual fun isprint(c: CInt): CInt =
    SolidJniBridge.libcSolidIsprint(c)

public actual fun ispunct(c: CInt): CInt =
    SolidJniBridge.libcSolidIspunct(c)

public actual fun isspace(c: CInt): CInt =
    SolidJniBridge.libcSolidIsspace(c)

public actual fun isupper(c: CInt): CInt =
    SolidJniBridge.libcSolidIsupper(c)

public actual fun isxdigit(c: CInt): CInt =
    SolidJniBridge.libcSolidIsxdigit(c)

public actual fun isblank(c: CInt): CInt =
    SolidJniBridge.libcSolidIsblank(c)

public actual fun tolower(c: CInt): CInt =
    SolidJniBridge.libcSolidTolower(c)

public actual fun toupper(c: CInt): CInt =
    SolidJniBridge.libcSolidToupper(c)

public actual fun getStdioFile(fileno: CInt): MutPtr<FILE> =
    MutPtr(SolidJniBridge.libcSolidGetStdioFile(fileno))

public actual fun clearerr(arg1: MutPtr<FILE>) {
    SolidJniBridge.libcSolidClearerr(arg1.rawAddress)
}

public actual fun fclose(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFclose(arg1.rawAddress)

public actual fun feof(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFeof(arg1.rawAddress)

public actual fun ferror(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFerror(arg1.rawAddress)

public actual fun fflush(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFflush(arg1.rawAddress)

public actual fun fgetc(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFgetc(arg1.rawAddress)

public actual fun fgets(arg1: MutPtr<CChar>, arg2: CInt, arg3: MutPtr<FILE>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidFgets(arg1.rawAddress, arg2, arg3.rawAddress))

public actual fun fopen(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(SolidJniBridge.libcSolidFopen(arg1.rawAddress, arg2.rawAddress))

public actual fun fprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidFprintf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fputc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFputc(arg1, arg2.rawAddress)

public actual fun fputs(arg1: ConstPtr<CChar>, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFputs(arg1.rawAddress, arg2.rawAddress)

public actual fun fread(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: MutPtr<FILE>): SizeT =
    SolidJniBridge.libcSolidFread(arg1.rawAddress, arg2.toLong(), arg3.toLong(), arg4.rawAddress).toULong()

public actual fun freopen(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(SolidJniBridge.libcSolidFreopen(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress))

public actual fun fscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidFscanf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fseek(arg1: MutPtr<FILE>, arg2: CLong, arg3: CInt): CInt =
    SolidJniBridge.libcSolidFseek(arg1.rawAddress, arg2, arg3)

public actual fun ftell(arg1: MutPtr<FILE>): CLong =
    SolidJniBridge.libcSolidFtell(arg1.rawAddress)

public actual fun fwrite(arg1: ConstPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: MutPtr<FILE>): SizeT =
    SolidJniBridge.libcSolidFwrite(arg1.rawAddress, arg2.toLong(), arg3.toLong(), arg4.rawAddress).toULong()

public actual fun getc(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidGetc(arg1.rawAddress)

public actual fun getchar(): CInt =
    SolidJniBridge.libcSolidGetchar()

public actual fun perror(arg1: ConstPtr<CChar>) {
    SolidJniBridge.libcSolidPerror(arg1.rawAddress)
}

public actual fun printf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidPrintf(arg1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun putc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidPutc(arg1, arg2.rawAddress)

public actual fun putchar(arg1: CInt): CInt =
    SolidJniBridge.libcSolidPutchar(arg1)

public actual fun puts(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidPuts(arg1.rawAddress)

public actual fun remove(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidRemove(arg1.rawAddress)

public actual fun rewind(arg1: MutPtr<FILE>) {
    SolidJniBridge.libcSolidRewind(arg1.rawAddress)
}

public actual fun scanf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidScanf(arg1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun setbuf(arg1: MutPtr<FILE>, arg2: MutPtr<CChar>) {
    SolidJniBridge.libcSolidSetbuf(arg1.rawAddress, arg2.rawAddress)
}

public actual fun setvbuf(arg1: MutPtr<FILE>, arg2: MutPtr<CChar>, arg3: CInt, arg4: SizeT): CInt =
    SolidJniBridge.libcSolidSetvbuf(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong())

public actual fun sscanf(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSscanf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpfile(): MutPtr<FILE> =
    MutPtr(SolidJniBridge.libcSolidTmpfile())

public actual fun ungetc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidUngetc(arg1, arg2.rawAddress)

public actual fun vfprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVfprintf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun vprintf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    SolidJniBridge.libcSolidVprintf(arg1.rawAddress, arg2.rawAddress)

public actual fun gets(arg1: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidGets(arg1.rawAddress))

public actual fun sprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSprintf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun tmpnam(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidTmpnam(arg1.rawAddress))

public actual fun vsprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVsprintf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun rename(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidRename(arg1.rawAddress, arg2.rawAddress)

public actual fun asiprintf(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidAsiprintf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidFiprintf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fiscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidFiscanf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iprintf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidIprintf(arg1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun iscanf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidIscanf(arg1.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSiprintf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun siscanf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSiscanf(arg1.rawAddress, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun sniprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSniprintf(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vasiprintf(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVasiprintf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun vfiprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVfiprintf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun vfiscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVfiscanf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun viprintf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    SolidJniBridge.libcSolidViprintf(arg1.rawAddress, arg2.rawAddress)

public actual fun viscanf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    SolidJniBridge.libcSolidViscanf(arg1.rawAddress, arg2.rawAddress)

public actual fun vsiprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVsiprintf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun vsiscanf(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVsiscanf(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun vsniprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: VaList): CInt =
    SolidJniBridge.libcSolidVsniprintf(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, arg4.rawAddress)

public actual fun vdiprintf(arg1: CInt, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    SolidJniBridge.libcSolidVdiprintf(arg1, arg2.rawAddress, arg3.rawAddress)

public actual fun diprintf(arg1: CInt, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidDiprintf(arg1, arg2.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun fgetpos(arg1: MutPtr<FILE>, arg2: MutPtr<FposT>): CInt =
    SolidJniBridge.libcSolidFgetpos(arg1.rawAddress, arg2.rawAddress)

public actual fun fsetpos(arg1: MutPtr<FILE>, arg2: ConstPtr<FposT>): CInt =
    SolidJniBridge.libcSolidFsetpos(arg1.rawAddress, arg2.rawAddress)

public actual fun fdopen(arg1: CInt, arg2: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(SolidJniBridge.libcSolidFdopen(arg1, arg2.rawAddress))

public actual fun fileno(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFileno(arg1.rawAddress)

public actual fun flockfile(arg1: MutPtr<FILE>) {
    SolidJniBridge.libcSolidFlockfile(arg1.rawAddress)
}

public actual fun ftrylockfile(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidFtrylockfile(arg1.rawAddress)

public actual fun funlockfile(arg1: MutPtr<FILE>) {
    SolidJniBridge.libcSolidFunlockfile(arg1.rawAddress)
}

public actual fun getcUnlocked(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidGetcUnlocked(arg1.rawAddress)

public actual fun getcharUnlocked(): CInt =
    SolidJniBridge.libcSolidGetcharUnlocked()

public actual fun putcUnlocked(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidPutcUnlocked(arg1, arg2.rawAddress)

public actual fun putcharUnlocked(arg1: CInt): CInt =
    SolidJniBridge.libcSolidPutcharUnlocked(arg1)

public actual fun snprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidSnprintf(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun vsnprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: VaList): CInt =
    SolidJniBridge.libcSolidVsnprintf(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, arg4.rawAddress)

public actual fun getw(arg1: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidGetw(arg1.rawAddress)

public actual fun putw(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    SolidJniBridge.libcSolidPutw(arg1, arg2.rawAddress)

public actual fun tempnam(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidTempnam(arg1.rawAddress, arg2.rawAddress))

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    SolidJniBridge.libcSolidFseeko(stream.rawAddress, offset, whence)

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    SolidJniBridge.libcSolidFtello(stream.rawAddress)

public actual fun atof(arg1: ConstPtr<CChar>): Double =
    SolidJniBridge.libcSolidAtof(arg1.rawAddress)

public actual fun strtod(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Double =
    SolidJniBridge.libcSolidStrtod(arg1.rawAddress, arg2.rawAddress)

public actual fun drand48(): Double =
    SolidJniBridge.libcSolidDrand48()

public actual fun erand48(arg1: MutPtr<CUshort>): Double =
    SolidJniBridge.libcSolidErand48(arg1.rawAddress)

public actual fun strtof(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Float =
    SolidJniBridge.libcSolidStrtof(arg1.rawAddress, arg2.rawAddress)

public actual fun strtold(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Double =
    SolidJniBridge.libcSolidStrtold(arg1.rawAddress, arg2.rawAddress)

public actual fun strtodL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Double =
    SolidJniBridge.libcSolidStrtodL(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun strtofL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Float =
    SolidJniBridge.libcSolidStrtofL(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun strtoldL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Double =
    SolidJniBridge.libcSolidStrtoldL(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun exit(arg1: CInt): Nothing {
    SolidJniBridge.libcSolidExit(arg1)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    SolidJniBridge.libcSolidAbort()
    error("Unreachable noreturn C function abort")
}

public actual fun abs(arg1: CInt): CInt =
    SolidJniBridge.libcSolidAbs(arg1)

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    SolidJniBridge.libcSolidAtexit(0L)

public actual fun atoi(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidAtoi(arg1.rawAddress)

public actual fun atol(arg1: ConstPtr<CChar>): CLong =
    SolidJniBridge.libcSolidAtol(arg1.rawAddress)

public actual fun itoa(arg1: CInt, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidItoa(arg1, arg2.rawAddress, arg3))

public actual fun ltoa(arg1: CLong, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidLtoa(arg1, arg2.rawAddress, arg3))

public actual fun ultoa(arg1: CUlong, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidUltoa(arg1.toLong(), arg2.rawAddress, arg3))

public actual fun bsearch(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidBsearch(arg1.rawAddress, arg2.rawAddress, arg3.toLong(), arg4.toLong(), 0L))

public actual fun calloc(arg1: SizeT, arg2: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidCalloc(arg1.toLong(), arg2.toLong()))

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: MutPtr<CVoid>) {
    SolidJniBridge.libcSolidFree(arg1.rawAddress)
}

public actual fun getenv(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidGetenv(arg1.rawAddress))

public actual fun labs(arg1: CLong): CLong =
    SolidJniBridge.libcSolidLabs(arg1)

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMalloc(arg1.toLong()))

public actual fun qsort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    SolidJniBridge.libcSolidQsort(arg1.rawAddress, arg2.toLong(), arg3.toLong(), 0L)
}

public actual fun rand(): CInt =
    SolidJniBridge.libcSolidRand()

public actual fun realloc(arg1: MutPtr<CVoid>, arg2: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidRealloc(arg1.rawAddress, arg2.toLong()))

public actual fun srand(arg1: CUint) {
    SolidJniBridge.libcSolidSrand(arg1.toInt())
}

public actual fun strtol(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CLong =
    SolidJniBridge.libcSolidStrtol(arg1.rawAddress, arg2.rawAddress, arg3)

public actual fun strtoul(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CUlong =
    SolidJniBridge.libcSolidStrtoul(arg1.rawAddress, arg2.rawAddress, arg3).toULong()

public actual fun mblen(arg1: ConstPtr<CChar>, arg2: SizeT): CInt =
    SolidJniBridge.libcSolidMblen(arg1.rawAddress, arg2.toLong())

public actual fun mbstowcs(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    SolidJniBridge.libcSolidMbstowcs(arg1.rawAddress, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun wctomb(arg1: MutPtr<CChar>, arg2: WcharT): CInt =
    SolidJniBridge.libcSolidWctomb(arg1.rawAddress, arg2.toInt())

public actual fun mbtowc(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidMbtowc(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun wcstombs(arg1: MutPtr<CChar>, arg2: ConstPtr<WcharT>, arg3: SizeT): SizeT =
    SolidJniBridge.libcSolidWcstombs(arg1.rawAddress, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun randR(arg1: MutPtr<CUint>): CInt =
    SolidJniBridge.libcSolidRandR(arg1.rawAddress)

public actual fun jrand48(arg1: MutPtr<CUshort>): CLong =
    SolidJniBridge.libcSolidJrand48(arg1.rawAddress)

public actual fun lcong48(arg1: MutPtr<CUshort>) {
    SolidJniBridge.libcSolidLcong48(arg1.rawAddress)
}

public actual fun lrand48(): CLong =
    SolidJniBridge.libcSolidLrand48()

public actual fun mrand48(): CLong =
    SolidJniBridge.libcSolidMrand48()

public actual fun nrand48(arg1: MutPtr<CUshort>): CLong =
    SolidJniBridge.libcSolidNrand48(arg1.rawAddress)

public actual fun seed48(arg1: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(SolidJniBridge.libcSolidSeed48(arg1.rawAddress))

public actual fun srand48(arg1: CLong) {
    SolidJniBridge.libcSolidSrand48(arg1)
}

public actual fun putenv(arg1: MutPtr<CChar>): CInt =
    SolidJniBridge.libcSolidPutenv(arg1.rawAddress)

public actual fun a64l(arg1: ConstPtr<CChar>): CLong =
    SolidJniBridge.libcSolidA64l(arg1.rawAddress)

public actual fun l64a(arg1: CLong): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidL64a(arg1))

public actual fun random(): CLong =
    SolidJniBridge.libcSolidRandom()

public actual fun setstate(arg1: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidSetstate(arg1.rawAddress))

public actual fun initstate(arg1: CUint, arg2: MutPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidInitstate(arg1.toInt(), arg2.rawAddress, arg3.toLong()))

public actual fun srandom(arg1: CUint) {
    SolidJniBridge.libcSolidSrandom(arg1.toInt())
}

public actual fun mkostemp(arg1: MutPtr<CChar>, arg2: CInt): CInt =
    SolidJniBridge.libcSolidMkostemp(arg1.rawAddress, arg2)

public actual fun mkostemps(arg1: MutPtr<CChar>, arg2: CInt, arg3: CInt): CInt =
    SolidJniBridge.libcSolidMkostemps(arg1.rawAddress, arg2, arg3)

public actual fun mkdtemp(arg1: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidMkdtemp(arg1.rawAddress))

public actual fun mkstemp(arg1: MutPtr<CChar>): CInt =
    SolidJniBridge.libcSolidMkstemp(arg1.rawAddress)

public actual fun mktemp(arg1: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidMktemp(arg1.rawAddress))

public actual fun atoll(arg1: ConstPtr<CChar>): CLonglong =
    SolidJniBridge.libcSolidAtoll(arg1.rawAddress)

public actual fun llabs(arg1: CLonglong): CLonglong =
    SolidJniBridge.libcSolidLlabs(arg1)

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CLonglong =
    SolidJniBridge.libcSolidStrtoll(arg1.rawAddress, arg2.rawAddress, arg3)

public actual fun strtoull(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CUlonglong =
    SolidJniBridge.libcSolidStrtoull(arg1.rawAddress, arg2.rawAddress, arg3).toULong()

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidAlignedAlloc(arg1.toLong(), arg2.toLong()))

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    SolidJniBridge.libcSolidAtQuickExit(0L)

public actual fun quickExit(arg1: CInt) {
    SolidJniBridge.libcSolidQuickExit(arg1)
}

public actual fun setenv(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CInt): CInt =
    SolidJniBridge.libcSolidSetenv(arg1.rawAddress, arg2.rawAddress, arg3)

public actual fun unsetenv(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidUnsetenv(arg1.rawAddress)

public actual fun humanizeNumber(arg1: MutPtr<CChar>, arg2: SizeT, arg3: Long, arg4: ConstPtr<CChar>, arg5: CInt, arg6: CInt): CInt =
    SolidJniBridge.libcSolidHumanizeNumber(arg1.rawAddress, arg2.toLong(), arg3, arg4.rawAddress, arg5, arg6)

public actual fun dehumanizeNumber(arg1: ConstPtr<CChar>, arg2: MutPtr<Long>): CInt =
    SolidJniBridge.libcSolidDehumanizeNumber(arg1.rawAddress, arg2.rawAddress)

public actual fun getenvR(arg1: ConstPtr<CChar>, arg2: MutPtr<CChar>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidGetenvR(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun heapsort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidJniBridge.libcSolidHeapsort(arg1.rawAddress, arg2.toLong(), arg3.toLong(), 0L)

public actual fun mergesort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    SolidJniBridge.libcSolidMergesort(arg1.rawAddress, arg2.toLong(), arg3.toLong(), 0L)

public actual fun radixsort(arg1: MutPtr<ConstPtr<CUchar>>, arg2: CInt, arg3: ConstPtr<CUchar>, arg4: CUint): CInt =
    SolidJniBridge.libcSolidRadixsort(arg1.rawAddress, arg2, arg3.rawAddress, arg4.toInt())

public actual fun sradixsort(arg1: MutPtr<ConstPtr<CUchar>>, arg2: CInt, arg3: ConstPtr<CUchar>, arg4: CUint): CInt =
    SolidJniBridge.libcSolidSradixsort(arg1.rawAddress, arg2, arg3.rawAddress, arg4.toInt())

public actual fun getprogname(): ConstPtr<CChar> =
    ConstPtr(SolidJniBridge.libcSolidGetprogname())

public actual fun setprogname(arg1: ConstPtr<CChar>) {
    SolidJniBridge.libcSolidSetprogname(arg1.rawAddress)
}

public actual fun qabs(arg1: QuadT): QuadT =
    SolidJniBridge.libcSolidQabs(arg1)

public actual fun strtoq(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): QuadT =
    SolidJniBridge.libcSolidStrtoq(arg1.rawAddress, arg2.rawAddress, arg3)

public actual fun strtouq(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): UQuadT =
    SolidJniBridge.libcSolidStrtouq(arg1.rawAddress, arg2.rawAddress, arg3).toULong()

public actual fun strsuftoll(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CLonglong, arg4: CLonglong): CLonglong =
    SolidJniBridge.libcSolidStrsuftoll(arg1.rawAddress, arg2.rawAddress, arg3, arg4)

public actual fun strsuftollx(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr<CChar>, arg6: SizeT): CLonglong =
    SolidJniBridge.libcSolidStrsuftollx(arg1.rawAddress, arg2.rawAddress, arg3, arg4, arg5.rawAddress, arg6.toLong())

public actual fun l64aR(arg1: CLong, arg2: MutPtr<CChar>, arg3: CInt): CInt =
    SolidJniBridge.libcSolidL64aR(arg1, arg2.rawAddress, arg3)

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CLong =
    SolidJniBridge.libcSolidStrtolL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong())

public actual fun strtoulL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CUlong =
    SolidJniBridge.libcSolidStrtoulL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong()).toULong()

public actual fun strtollL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CLonglong =
    SolidJniBridge.libcSolidStrtollL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong())

public actual fun strtoullL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CUlonglong =
    SolidJniBridge.libcSolidStrtoullL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong()).toULong()

public actual fun strtoqL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): QuadT =
    SolidJniBridge.libcSolidStrtoqL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong())

public actual fun strtouqL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): UQuadT =
    SolidJniBridge.libcSolidStrtouqL(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong()).toULong()

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    SolidJniBridge.libcSolidMbCurMaxL(arg1.toLong()).toULong()

public actual fun mblenL(arg1: ConstPtr<CChar>, arg2: SizeT, arg3: LocaleT): CInt =
    SolidJniBridge.libcSolidMblenL(arg1.rawAddress, arg2.toLong(), arg3.toLong())

public actual fun mbstowcsL(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libcSolidMbstowcsL(arg1.rawAddress, arg2.rawAddress, arg3.toLong(), arg4.toLong()).toULong()

public actual fun wctombL(arg1: MutPtr<CChar>, arg2: WcharT, arg3: LocaleT): CInt =
    SolidJniBridge.libcSolidWctombL(arg1.rawAddress, arg2.toInt(), arg3.toLong())

public actual fun mbtowcL(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): CInt =
    SolidJniBridge.libcSolidMbtowcL(arg1.rawAddress, arg2.rawAddress, arg3.toLong(), arg4.toLong())

public actual fun wcstombsL(arg1: MutPtr<CChar>, arg2: ConstPtr<WcharT>, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libcSolidWcstombsL(arg1.rawAddress, arg2.rawAddress, arg3.toLong(), arg4.toLong()).toULong()

public actual fun memchr(arg1: ConstPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemchr(arg1.rawAddress, arg2, arg3.toLong()))

public actual fun memcmp(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidMemcmp(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun memcpy(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemcpy(arg1.rawAddress, arg2.rawAddress, arg3.toLong()))

public actual fun memmove(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemmove(arg1.rawAddress, arg2.rawAddress, arg3.toLong()))

public actual fun memset(arg1: MutPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemset(arg1.rawAddress, arg2, arg3.toLong()))

public actual fun strcat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrcat(arg1.rawAddress, arg2.rawAddress))

public actual fun strchr(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrchr(arg1.rawAddress, arg2))

public actual fun strcmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidStrcmp(arg1.rawAddress, arg2.rawAddress)

public actual fun strcoll(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidStrcoll(arg1.rawAddress, arg2.rawAddress)

public actual fun strcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrcpy(arg1.rawAddress, arg2.rawAddress))

public actual fun strcspn(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): SizeT =
    SolidJniBridge.libcSolidStrcspn(arg1.rawAddress, arg2.rawAddress).toULong()

public actual fun strerror(arg1: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrerror(arg1))

public actual fun strlen(arg1: ConstPtr<CChar>): SizeT =
    SolidJniBridge.libcSolidStrlen(arg1.rawAddress).toULong()

public actual fun strncat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrncat(arg1.rawAddress, arg2.rawAddress, arg3.toLong()))

public actual fun strncmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidStrncmp(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun strncpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrncpy(arg1.rawAddress, arg2.rawAddress, arg3.toLong()))

public actual fun strpbrk(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrpbrk(arg1.rawAddress, arg2.rawAddress))

public actual fun strrchr(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrrchr(arg1.rawAddress, arg2))

public actual fun strspn(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): SizeT =
    SolidJniBridge.libcSolidStrspn(arg1.rawAddress, arg2.rawAddress).toULong()

public actual fun strstr(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrstr(arg1.rawAddress, arg2.rawAddress))

public actual fun strtok(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrtok(arg1.rawAddress, arg2.rawAddress))

public actual fun strtokR(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: MutPtr<MutPtr<CChar>>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrtokR(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress))

public actual fun strerrorR(arg1: CInt, arg2: MutPtr<CChar>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidStrerrorR(arg1, arg2.rawAddress, arg3.toLong())

public actual fun strxfrm(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    SolidJniBridge.libcSolidStrxfrm(arg1.rawAddress, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun memccpy(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: CInt, arg4: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemccpy(arg1.rawAddress, arg2.rawAddress, arg3, arg4.toLong()))

public actual fun strdup(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrdup(arg1.rawAddress))

public actual fun stpcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStpcpy(arg1.rawAddress, arg2.rawAddress))

public actual fun stpncpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStpncpy(arg1.rawAddress, arg2.rawAddress, arg3.toLong()))

public actual fun strnlen(arg1: ConstPtr<CChar>, arg2: SizeT): SizeT =
    SolidJniBridge.libcSolidStrnlen(arg1.rawAddress, arg2.toLong()).toULong()

public actual fun memmem(arg1: ConstPtr<CVoid>, arg2: SizeT, arg3: ConstPtr<CVoid>, arg4: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemmem(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, arg4.toLong()))

public actual fun strcasestr(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrcasestr(arg1.rawAddress, arg2.rawAddress))

public actual fun strlcat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    SolidJniBridge.libcSolidStrlcat(arg1.rawAddress, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun strlcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    SolidJniBridge.libcSolidStrlcpy(arg1.rawAddress, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun strsep(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrsep(arg1.rawAddress, arg2.rawAddress))

public actual fun stresep(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStresep(arg1.rawAddress, arg2.rawAddress, arg3))

public actual fun strndup(arg1: ConstPtr<CChar>, arg2: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrndup(arg1.rawAddress, arg2.toLong()))

public actual fun memrchr(arg1: ConstPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemrchr(arg1.rawAddress, arg2, arg3.toLong()))

public actual fun explicitMemset(arg1: MutPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidExplicitMemset(arg1.rawAddress, arg2, arg3.toLong()))

public actual fun consttimeMemequal(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidConsttimeMemequal(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun strcollL(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: LocaleT): CInt =
    SolidJniBridge.libcSolidStrcollL(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun strxfrmL(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): SizeT =
    SolidJniBridge.libcSolidStrxfrmL(arg1.rawAddress, arg2.rawAddress, arg3.toLong(), arg4.toLong()).toULong()

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidStrerrorL(arg1, arg2.toLong()))

public actual fun bcmp(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidBcmp(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun bcopy(arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>, arg3: SizeT) {
    SolidJniBridge.libcSolidBcopy(arg1.rawAddress, arg2.rawAddress, arg3.toLong())
}

public actual fun bzero(arg1: MutPtr<CVoid>, arg2: SizeT) {
    SolidJniBridge.libcSolidBzero(arg1.rawAddress, arg2.toLong())
}

public actual fun ffs(arg1: CInt): CInt =
    SolidJniBridge.libcSolidFfs(arg1)

public actual fun popcount(arg1: CUint): CUint =
    SolidJniBridge.libcSolidPopcount(arg1.toInt()).toUInt()

public actual fun popcountl(arg1: CUlong): CUint =
    SolidJniBridge.libcSolidPopcountl(arg1.toLong()).toUInt()

public actual fun popcountll(arg1: CUlonglong): CUint =
    SolidJniBridge.libcSolidPopcountll(arg1.toLong()).toUInt()

public actual fun popcount32(arg1: UInt): CUint =
    SolidJniBridge.libcSolidPopcount32(arg1.toInt()).toUInt()

public actual fun popcount64(arg1: ULong): CUint =
    SolidJniBridge.libcSolidPopcount64(arg1.toLong()).toUInt()

public actual fun rindex(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidRindex(arg1.rawAddress, arg2))

public actual fun strcasecmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidStrcasecmp(arg1.rawAddress, arg2.rawAddress)

public actual fun strncasecmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    SolidJniBridge.libcSolidStrncasecmp(arg1.rawAddress, arg2.rawAddress, arg3.toLong())

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    SolidJniBridge.libcSolidSignal(arg1, arg2.toLong()).toULong()

public actual fun raise(arg1: CInt): CInt =
    SolidJniBridge.libcSolidRaise(arg1)

public actual fun asctime(arg1: ConstPtr<Tm>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidAsctime(arg1.rawAddress))

public actual fun clock(): ClockT =
    SolidJniBridge.libcSolidClock().toUInt()

public actual fun ctime(arg1: ConstPtr<TimeT>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidCtime(arg1.rawAddress))

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    SolidJniBridge.libcSolidDifftime(arg1, arg2)

public actual fun gmtime(arg1: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(SolidJniBridge.libcSolidGmtime(arg1.rawAddress))

public actual fun localtime(arg1: ConstPtr<TimeT>): MutPtr<Tm> =
    MutPtr(SolidJniBridge.libcSolidLocaltime(arg1.rawAddress))

public actual fun time(arg1: MutPtr<TimeT>): TimeT =
    SolidJniBridge.libcSolidTime(arg1.rawAddress)

public actual fun mktime(arg1: MutPtr<Tm>): TimeT =
    SolidJniBridge.libcSolidMktime(arg1.rawAddress)

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    SolidJniBridge.libcSolidStrftime(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, arg4.rawAddress).toULong()

public actual fun utime(arg1: ConstPtr<CChar>, arg2: MutPtr<TimeT>): CInt =
    SolidJniBridge.libcSolidUtime(arg1.rawAddress, arg2.rawAddress)

public actual fun asctimeR(arg1: ConstPtr<Tm>, arg2: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidAsctimeR(arg1.rawAddress, arg2.rawAddress))

public actual fun ctimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidCtimeR(arg1.rawAddress, arg2.rawAddress))

public actual fun gmtimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(SolidJniBridge.libcSolidGmtimeR(arg1.rawAddress, arg2.rawAddress))

public actual fun localtimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<Tm>): MutPtr<Tm> =
    MutPtr(SolidJniBridge.libcSolidLocaltimeR(arg1.rawAddress, arg2.rawAddress))

public actual fun stat(arg1: ConstPtr<CChar>, arg2: MutPtr<Stat>): CInt =
    SolidJniBridge.libcSolidStat(arg1.rawAddress, arg2.rawAddress)

public actual fun lstat(arg1: ConstPtr<CChar>, arg2: MutPtr<Stat>): CInt =
    SolidJniBridge.libcSolidLstat(arg1.rawAddress, arg2.rawAddress)

public actual fun fstat(arg1: CInt, arg2: MutPtr<Stat>): CInt =
    SolidJniBridge.libcSolidFstat(arg1, arg2.rawAddress)

public actual fun chmod(arg1: ConstPtr<CChar>, arg2: ModeT): CInt =
    SolidJniBridge.libcSolidChmod(arg1.rawAddress, arg2.toInt())

public actual fun mkdir(arg1: ConstPtr<CChar>, arg2: ModeT): CInt =
    SolidJniBridge.libcSolidMkdir(arg1.rawAddress, arg2.toInt())

public actual fun open(arg1: ConstPtr<CChar>, arg2: CInt, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidOpen(arg1.rawAddress, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun creat(arg1: ConstPtr<CChar>, arg2: CInt): CInt =
    SolidJniBridge.libcSolidCreat(arg1.rawAddress, arg2)

public actual fun close(arg1: CInt): CInt =
    SolidJniBridge.libcSolidClose(arg1)

public actual fun read(arg1: CInt, arg2: MutPtr<CVoid>, arg3: CInt): CInt =
    SolidJniBridge.libcSolidRead(arg1, arg2.rawAddress, arg3)

public actual fun write(arg1: CInt, arg2: ConstPtr<CVoid>, arg3: CInt): CInt =
    SolidJniBridge.libcSolidWrite(arg1, arg2.rawAddress, arg3)

public actual fun unlink(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidUnlink(arg1.rawAddress)

public actual fun tell(arg1: CInt): CLong =
    SolidJniBridge.libcSolidTell(arg1)

public actual fun dup(arg1: CInt): CInt =
    SolidJniBridge.libcSolidDup(arg1)

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    SolidJniBridge.libcSolidDup2(arg1, arg2)

public actual fun access(arg1: ConstPtr<CChar>, arg2: CInt): CInt =
    SolidJniBridge.libcSolidAccess(arg1.rawAddress, arg2)

public actual fun rmdir(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidRmdir(arg1.rawAddress)

public actual fun chdir(arg1: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidChdir(arg1.rawAddress)

public actual fun getwd(arg1: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidGetwd(arg1.rawAddress))

public actual fun getcwd(arg1: MutPtr<CChar>, arg2: SizeT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidGetcwd(arg1.rawAddress, arg2.toLong()))

public actual fun getopt(arg1: CInt, arg2: MutPtr<MutPtr<CChar>>, arg3: ConstPtr<CChar>): CInt =
    SolidJniBridge.libcSolidGetopt(arg1, arg2.rawAddress, arg3.rawAddress)

public actual fun getsubopt(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<MutPtr<CChar>>, arg3: MutPtr<MutPtr<CChar>>): CInt =
    SolidJniBridge.libcSolidGetsubopt(arg1.rawAddress, arg2.rawAddress, arg3.rawAddress)

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    SolidJniBridge.libcSolidFcntl(arg1, arg2, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getpid(): PidT =
    SolidJniBridge.libcSolidGetpid()

public actual fun sleep(arg1: CUint): CUint =
    SolidJniBridge.libcSolidSleep(arg1.toInt()).toUInt()

public actual fun usleep(arg1: UsecondsT): CInt =
    SolidJniBridge.libcSolidUsleep(arg1.toInt())

public actual fun localeconv(): MutPtr<Lconv> =
    MutPtr(SolidJniBridge.libcSolidLocaleconv())

public actual fun setlocale(arg1: CInt, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidSetlocale(arg1, arg2.rawAddress))

public actual fun duplocale(arg1: LocaleT): LocaleT =
    SolidJniBridge.libcSolidDuplocale(arg1.toLong()).toULong()

public actual fun freelocale(arg1: LocaleT) {
    SolidJniBridge.libcSolidFreelocale(arg1.toLong())
}

public actual fun localeconvL(arg1: LocaleT): MutPtr<Lconv> =
    MutPtr(SolidJniBridge.libcSolidLocaleconvL(arg1.toLong()))

public actual fun newlocale(arg1: CInt, arg2: ConstPtr<CChar>, arg3: LocaleT): LocaleT =
    SolidJniBridge.libcSolidNewlocale(arg1, arg2.rawAddress, arg3.toLong()).toULong()

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidNlLanginfo(item))

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    MutPtr(SolidJniBridge.libcSolidNlLanginfoL(item, locale.toLong()))

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(SolidJniBridge.libcSolidMemalign(align.toLong(), size.toLong()))

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    SolidJniBridge.libcSolidLseek(arg1, arg2, arg3)
