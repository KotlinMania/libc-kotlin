@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
public actual var OPTARG: MutPtr<CChar>
    get() = throw UnsupportedOperationException("WasmWasi foreign static optarg requires a host memory/aggregate ABI adapter")
    set(value) {
        throw UnsupportedOperationException("WasmWasi foreign static optarg requires a host memory/aggregate ABI adapter")
    }

@kotlin.wasm.WasmImport("libc", "libcSolidGetOPTERR")
private external fun wasiLibcSolidGetOPTERR(): Int

@kotlin.wasm.WasmImport("libc", "libcSolidSetOPTERR")
private external fun wasiLibcSolidSetOPTERR(value: Int): Unit

public actual var OPTERR: CInt
    get() = wasiLibcSolidGetOPTERR().toInt()
    set(value) {
        wasiLibcSolidSetOPTERR(value)
    }

@kotlin.wasm.WasmImport("libc", "libcSolidGetOPTIND")
private external fun wasiLibcSolidGetOPTIND(): Int

@kotlin.wasm.WasmImport("libc", "libcSolidSetOPTIND")
private external fun wasiLibcSolidSetOPTIND(value: Int): Unit

public actual var OPTIND: CInt
    get() = wasiLibcSolidGetOPTIND().toInt()
    set(value) {
        wasiLibcSolidSetOPTIND(value)
    }

@kotlin.wasm.WasmImport("libc", "libcSolidGetOPTOPT")
private external fun wasiLibcSolidGetOPTOPT(): Int

@kotlin.wasm.WasmImport("libc", "libcSolidSetOPTOPT")
private external fun wasiLibcSolidSetOPTOPT(value: Int): Unit

public actual var OPTOPT: CInt
    get() = wasiLibcSolidGetOPTOPT().toInt()
    set(value) {
        wasiLibcSolidSetOPTOPT(value)
    }

@kotlin.wasm.WasmImport("libc", "libcSolidGetOPTRESET")
private external fun wasiLibcSolidGetOPTRESET(): Int

@kotlin.wasm.WasmImport("libc", "libcSolidSetOPTRESET")
private external fun wasiLibcSolidSetOPTRESET(value: Int): Unit

public actual var OPTRESET: CInt
    get() = wasiLibcSolidGetOPTRESET().toInt()
    set(value) {
        wasiLibcSolidSetOPTRESET(value)
    }

public actual var SUBOPTARG: MutPtr<CChar>
    get() = throw UnsupportedOperationException("WasmWasi foreign static suboptarg requires a host memory/aggregate ABI adapter")
    set(value) {
        throw UnsupportedOperationException("WasmWasi foreign static suboptarg requires a host memory/aggregate ABI adapter")
    }

@kotlin.wasm.WasmImport("libc", "libcSolidIsalnum")
private external fun wasiLibcSolidIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcSolidIsalnum(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsalpha")
private external fun wasiLibcSolidIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcSolidIsalpha(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIscntrl")
private external fun wasiLibcSolidIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcSolidIscntrl(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsdigit")
private external fun wasiLibcSolidIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcSolidIsdigit(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsgraph")
private external fun wasiLibcSolidIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcSolidIsgraph(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIslower")
private external fun wasiLibcSolidIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcSolidIslower(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsprint")
private external fun wasiLibcSolidIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcSolidIsprint(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIspunct")
private external fun wasiLibcSolidIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcSolidIspunct(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsspace")
private external fun wasiLibcSolidIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcSolidIsspace(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsupper")
private external fun wasiLibcSolidIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcSolidIsupper(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsxdigit")
private external fun wasiLibcSolidIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcSolidIsxdigit(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidIsblank")
private external fun wasiLibcSolidIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcSolidIsblank(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidTolower")
private external fun wasiLibcSolidTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcSolidTolower(c).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidToupper")
private external fun wasiLibcSolidToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcSolidToupper(c).toInt()

public actual fun getStdioFile(fileno: CInt): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetStdioFile")

public actual fun clearerr(arg1: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidClearerr")

public actual fun fclose(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFclose")

public actual fun feof(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFeof")

public actual fun ferror(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFerror")

public actual fun fflush(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFflush")

public actual fun fgetc(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFgetc")

public actual fun fgets(arg1: MutPtr<CChar>, arg2: CInt, arg3: MutPtr<FILE>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFgets")

public actual fun fopen(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFopen")

public actual fun fprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFprintf")

public actual fun fputc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFputc")

public actual fun fputs(arg1: ConstPtr<CChar>, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFputs")

public actual fun fread(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFread")

public actual fun freopen(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFreopen")

public actual fun fscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFscanf")

public actual fun fseek(arg1: MutPtr<FILE>, arg2: CLong, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFseek")

public actual fun ftell(arg1: MutPtr<FILE>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFtell")

public actual fun fwrite(arg1: ConstPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFwrite")

public actual fun getc(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetc")

@kotlin.wasm.WasmImport("libc", "libcSolidGetchar")
private external fun wasiLibcSolidGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcSolidGetchar().toInt()

public actual fun perror(arg1: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPerror")

public actual fun printf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPrintf")

public actual fun putc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPutc")

@kotlin.wasm.WasmImport("libc", "libcSolidPutchar")
private external fun wasiLibcSolidPutchar(arg1: Int): Int

public actual fun putchar(arg1: CInt): CInt =
    wasiLibcSolidPutchar(arg1).toInt()

public actual fun puts(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPuts")

public actual fun remove(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRemove")

public actual fun rewind(arg1: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRewind")

public actual fun scanf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidScanf")

public actual fun setbuf(arg1: MutPtr<FILE>, arg2: MutPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetbuf")

public actual fun setvbuf(arg1: MutPtr<FILE>, arg2: MutPtr<CChar>, arg3: CInt, arg4: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetvbuf")

public actual fun sscanf(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSscanf")

public actual fun tmpfile(): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidTmpfile")

public actual fun ungetc(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidUngetc")

public actual fun vfprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVfprintf")

public actual fun vprintf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVprintf")

public actual fun gets(arg1: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGets")

public actual fun sprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSprintf")

public actual fun tmpnam(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidTmpnam")

public actual fun vsprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVsprintf")

public actual fun rename(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRename")

public actual fun asiprintf(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAsiprintf")

public actual fun fiprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFiprintf")

public actual fun fiscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFiscanf")

public actual fun iprintf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidIprintf")

public actual fun iscanf(arg1: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidIscanf")

public actual fun siprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSiprintf")

public actual fun siscanf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSiscanf")

public actual fun sniprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSniprintf")

public actual fun vasiprintf(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVasiprintf")

public actual fun vfiprintf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVfiprintf")

public actual fun vfiscanf(arg1: MutPtr<FILE>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVfiscanf")

public actual fun viprintf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidViprintf")

public actual fun viscanf(arg1: ConstPtr<CChar>, arg2: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidViscanf")

public actual fun vsiprintf(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVsiprintf")

public actual fun vsiscanf(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVsiscanf")

public actual fun vsniprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVsniprintf")

public actual fun vdiprintf(arg1: CInt, arg2: ConstPtr<CChar>, arg3: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVdiprintf")

public actual fun diprintf(arg1: CInt, arg2: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidDiprintf")

public actual fun fgetpos(arg1: MutPtr<FILE>, arg2: MutPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFgetpos")

public actual fun fsetpos(arg1: MutPtr<FILE>, arg2: ConstPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFsetpos")

public actual fun fdopen(arg1: CInt, arg2: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFdopen")

public actual fun fileno(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFileno")

public actual fun flockfile(arg1: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFlockfile")

public actual fun ftrylockfile(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFtrylockfile")

public actual fun funlockfile(arg1: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFunlockfile")

public actual fun getcUnlocked(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetcUnlocked")

@kotlin.wasm.WasmImport("libc", "libcSolidGetcharUnlocked")
private external fun wasiLibcSolidGetcharUnlocked(): Int

public actual fun getcharUnlocked(): CInt =
    wasiLibcSolidGetcharUnlocked().toInt()

public actual fun putcUnlocked(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPutcUnlocked")

@kotlin.wasm.WasmImport("libc", "libcSolidPutcharUnlocked")
private external fun wasiLibcSolidPutcharUnlocked(arg1: Int): Int

public actual fun putcharUnlocked(arg1: CInt): CInt =
    wasiLibcSolidPutcharUnlocked(arg1).toInt()

public actual fun snprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSnprintf")

public actual fun vsnprintf(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: VaList): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidVsnprintf")

public actual fun getw(arg1: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetw")

public actual fun putw(arg1: CInt, arg2: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPutw")

public actual fun tempnam(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidTempnam")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFseeko")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFtello")

public actual fun atof(arg1: ConstPtr<CChar>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtof")

public actual fun strtod(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtod")

@kotlin.wasm.WasmImport("libc", "libcSolidDrand48")
private external fun wasiLibcSolidDrand48(): Double

public actual fun drand48(): Double =
    wasiLibcSolidDrand48().toDouble()

public actual fun erand48(arg1: MutPtr<CUshort>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidErand48")

public actual fun strtof(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Float =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtof")

public actual fun strtold(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtold")

public actual fun strtodL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtodL")

public actual fun strtofL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Float =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtofL")

public actual fun strtoldL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: LocaleT): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoldL")

@kotlin.wasm.WasmImport("libc", "libcSolidExit")
private external fun wasiLibcSolidExit(arg1: Int): Unit

public actual fun exit(arg1: CInt): Nothing {
    wasiLibcSolidExit(arg1)
    error("C noreturn function libcSolidExit returned")
}

@kotlin.wasm.WasmImport("libc", "libcSolidAbort")
private external fun wasiLibcSolidAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcSolidAbort()
    error("C noreturn function libcSolidAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcSolidAbs")
private external fun wasiLibcSolidAbs(arg1: Int): Int

public actual fun abs(arg1: CInt): CInt =
    wasiLibcSolidAbs(arg1).toInt()

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtexit")

public actual fun atoi(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtoi")

public actual fun atol(arg1: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtol")

public actual fun itoa(arg1: CInt, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidItoa")

public actual fun ltoa(arg1: CLong, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLtoa")

public actual fun ultoa(arg1: CUlong, arg2: MutPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidUltoa")

public actual fun bsearch(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidBsearch")

public actual fun calloc(arg1: SizeT, arg2: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidCalloc")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidDiv")

public actual fun free(arg1: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFree")

public actual fun getenv(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetenv")

@kotlin.wasm.WasmImport("libc", "libcSolidLabs")
private external fun wasiLibcSolidLabs(arg1: Long): Long

public actual fun labs(arg1: CLong): CLong =
    wasiLibcSolidLabs(arg1).toLong()

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLdiv")

public actual fun malloc(arg1: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMalloc")

public actual fun qsort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidQsort")

@kotlin.wasm.WasmImport("libc", "libcSolidRand")
private external fun wasiLibcSolidRand(): Int

public actual fun rand(): CInt =
    wasiLibcSolidRand().toInt()

public actual fun realloc(arg1: MutPtr<CVoid>, arg2: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRealloc")

@kotlin.wasm.WasmImport("libc", "libcSolidSrand")
private external fun wasiLibcSolidSrand(arg1: Int): Unit

public actual fun srand(arg1: CUint): Unit =
    wasiLibcSolidSrand(arg1.toInt())

public actual fun strtol(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtol")

public actual fun strtoul(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoul")

public actual fun mblen(arg1: ConstPtr<CChar>, arg2: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMblen")

public actual fun mbstowcs(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMbstowcs")

public actual fun wctomb(arg1: MutPtr<CChar>, arg2: WcharT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidWctomb")

public actual fun mbtowc(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMbtowc")

public actual fun wcstombs(arg1: MutPtr<CChar>, arg2: ConstPtr<WcharT>, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidWcstombs")

public actual fun randR(arg1: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRandR")

public actual fun jrand48(arg1: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidJrand48")

public actual fun lcong48(arg1: MutPtr<CUshort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLcong48")

@kotlin.wasm.WasmImport("libc", "libcSolidLrand48")
private external fun wasiLibcSolidLrand48(): Long

public actual fun lrand48(): CLong =
    wasiLibcSolidLrand48().toLong()

@kotlin.wasm.WasmImport("libc", "libcSolidMrand48")
private external fun wasiLibcSolidMrand48(): Long

public actual fun mrand48(): CLong =
    wasiLibcSolidMrand48().toLong()

public actual fun nrand48(arg1: MutPtr<CUshort>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidNrand48")

public actual fun seed48(arg1: MutPtr<CUshort>): MutPtr<CUshort> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSeed48")

@kotlin.wasm.WasmImport("libc", "libcSolidSrand48")
private external fun wasiLibcSolidSrand48(arg1: Long): Unit

public actual fun srand48(arg1: CLong): Unit =
    wasiLibcSolidSrand48(arg1)

public actual fun putenv(arg1: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidPutenv")

public actual fun a64l(arg1: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidA64l")

public actual fun l64a(arg1: CLong): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidL64a")

@kotlin.wasm.WasmImport("libc", "libcSolidRandom")
private external fun wasiLibcSolidRandom(): Long

public actual fun random(): CLong =
    wasiLibcSolidRandom().toLong()

public actual fun setstate(arg1: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetstate")

public actual fun initstate(arg1: CUint, arg2: MutPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidInitstate")

@kotlin.wasm.WasmImport("libc", "libcSolidSrandom")
private external fun wasiLibcSolidSrandom(arg1: Int): Unit

public actual fun srandom(arg1: CUint): Unit =
    wasiLibcSolidSrandom(arg1.toInt())

public actual fun mkostemp(arg1: MutPtr<CChar>, arg2: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMkostemp")

public actual fun mkostemps(arg1: MutPtr<CChar>, arg2: CInt, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMkostemps")

public actual fun mkdtemp(arg1: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMkdtemp")

public actual fun mkstemp(arg1: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMkstemp")

public actual fun mktemp(arg1: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMktemp")

public actual fun atoll(arg1: ConstPtr<CChar>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtoll")

@kotlin.wasm.WasmImport("libc", "libcSolidLlabs")
private external fun wasiLibcSolidLlabs(arg1: Long): Long

public actual fun llabs(arg1: CLonglong): CLonglong =
    wasiLibcSolidLlabs(arg1).toLong()

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLldiv")

public actual fun strtoll(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoll")

public actual fun strtoull(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoull")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAlignedAlloc")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAtQuickExit")

@kotlin.wasm.WasmImport("libc", "libcSolidQuickExit")
private external fun wasiLibcSolidQuickExit(arg1: Int): Unit

public actual fun quickExit(arg1: CInt): Unit =
    wasiLibcSolidQuickExit(arg1)

public actual fun setenv(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetenv")

public actual fun unsetenv(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidUnsetenv")

public actual fun humanizeNumber(arg1: MutPtr<CChar>, arg2: SizeT, arg3: Long, arg4: ConstPtr<CChar>, arg5: CInt, arg6: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidHumanizeNumber")

public actual fun dehumanizeNumber(arg1: ConstPtr<CChar>, arg2: MutPtr<Long>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidDehumanizeNumber")

public actual fun getenvR(arg1: ConstPtr<CChar>, arg2: MutPtr<CChar>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetenvR")

public actual fun heapsort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidHeapsort")

public actual fun mergesort(arg1: MutPtr<CVoid>, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMergesort")

public actual fun radixsort(arg1: MutPtr<ConstPtr<CUchar>>, arg2: CInt, arg3: ConstPtr<CUchar>, arg4: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRadixsort")

public actual fun sradixsort(arg1: MutPtr<ConstPtr<CUchar>>, arg2: CInt, arg3: ConstPtr<CUchar>, arg4: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSradixsort")

public actual fun getprogname(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetprogname")

public actual fun setprogname(arg1: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetprogname")

@kotlin.wasm.WasmImport("libc", "libcSolidQabs")
private external fun wasiLibcSolidQabs(arg1: Long): Long

public actual fun qabs(arg1: QuadT): QuadT =
    wasiLibcSolidQabs(arg1).toLong()

public actual fun strtoq(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): QuadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoq")

public actual fun strtouq(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt): UQuadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtouq")

public actual fun strsuftoll(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CLonglong, arg4: CLonglong): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrsuftoll")

public actual fun strsuftollx(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: CLonglong, arg4: CLonglong, arg5: MutPtr<CChar>, arg6: SizeT): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrsuftollx")

public actual fun l64aR(arg1: CLong, arg2: MutPtr<CChar>, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidL64aR")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidQdiv")

public actual fun strtolL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtolL")

public actual fun strtoulL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoulL")

public actual fun strtollL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtollL")

public actual fun strtoullL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoullL")

public actual fun strtoqL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): QuadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtoqL")

public actual fun strtouqL(arg1: ConstPtr<CChar>, arg2: MutPtr<MutPtr<CChar>>, arg3: CInt, arg4: LocaleT): UQuadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtouqL")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMbCurMaxL")

public actual fun mblenL(arg1: ConstPtr<CChar>, arg2: SizeT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMblenL")

public actual fun mbstowcsL(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMbstowcsL")

public actual fun wctombL(arg1: MutPtr<CChar>, arg2: WcharT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidWctombL")

public actual fun mbtowcL(arg1: MutPtr<WcharT>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMbtowcL")

public actual fun wcstombsL(arg1: MutPtr<CChar>, arg2: ConstPtr<WcharT>, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidWcstombsL")

public actual fun memchr(arg1: ConstPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemchr")

public actual fun memcmp(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemcmp")

public actual fun memcpy(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemcpy")

public actual fun memmove(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemmove")

public actual fun memset(arg1: MutPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemset")

public actual fun strcat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcat")

public actual fun strchr(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrchr")

public actual fun strcmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcmp")

public actual fun strcoll(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcoll")

public actual fun strcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcpy")

public actual fun strcspn(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcspn")

public actual fun strerror(arg1: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrerror")

public actual fun strlen(arg1: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrlen")

public actual fun strncat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrncat")

public actual fun strncmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrncmp")

public actual fun strncpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrncpy")

public actual fun strpbrk(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrpbrk")

public actual fun strrchr(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrrchr")

public actual fun strspn(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrspn")

public actual fun strstr(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrstr")

public actual fun strtok(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtok")

public actual fun strtokR(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: MutPtr<MutPtr<CChar>>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrtokR")

public actual fun strerrorR(arg1: CInt, arg2: MutPtr<CChar>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrerrorR")

public actual fun strxfrm(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrxfrm")

public actual fun memccpy(arg1: MutPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: CInt, arg4: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemccpy")

public actual fun strdup(arg1: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrdup")

public actual fun stpcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStpcpy")

public actual fun stpncpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStpncpy")

public actual fun strnlen(arg1: ConstPtr<CChar>, arg2: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrnlen")

public actual fun memmem(arg1: ConstPtr<CVoid>, arg2: SizeT, arg3: ConstPtr<CVoid>, arg4: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemmem")

public actual fun strcasestr(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcasestr")

public actual fun strlcat(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrlcat")

public actual fun strlcpy(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrlcpy")

public actual fun strsep(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrsep")

public actual fun stresep(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<CChar>, arg3: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStresep")

public actual fun strndup(arg1: ConstPtr<CChar>, arg2: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrndup")

public actual fun memrchr(arg1: ConstPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemrchr")

public actual fun explicitMemset(arg1: MutPtr<CVoid>, arg2: CInt, arg3: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidExplicitMemset")

public actual fun consttimeMemequal(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidConsttimeMemequal")

public actual fun strcollL(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcollL")

public actual fun strxfrmL(arg1: MutPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrxfrmL")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrerrorL")

public actual fun bcmp(arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidBcmp")

public actual fun bcopy(arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>, arg3: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidBcopy")

public actual fun bzero(arg1: MutPtr<CVoid>, arg2: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidBzero")

@kotlin.wasm.WasmImport("libc", "libcSolidFfs")
private external fun wasiLibcSolidFfs(arg1: Int): Int

public actual fun ffs(arg1: CInt): CInt =
    wasiLibcSolidFfs(arg1).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidPopcount")
private external fun wasiLibcSolidPopcount(arg1: Int): Int

public actual fun popcount(arg1: CUint): CUint =
    wasiLibcSolidPopcount(arg1.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcSolidPopcountl")
private external fun wasiLibcSolidPopcountl(arg1: Long): Int

public actual fun popcountl(arg1: CUlong): CUint =
    wasiLibcSolidPopcountl(arg1.toLong()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcSolidPopcountll")
private external fun wasiLibcSolidPopcountll(arg1: Long): Int

public actual fun popcountll(arg1: CUlonglong): CUint =
    wasiLibcSolidPopcountll(arg1.toLong()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcSolidPopcount32")
private external fun wasiLibcSolidPopcount32(arg1: Int): Int

public actual fun popcount32(arg1: UInt): CUint =
    wasiLibcSolidPopcount32(arg1.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcSolidPopcount64")
private external fun wasiLibcSolidPopcount64(arg1: Long): Int

public actual fun popcount64(arg1: ULong): CUint =
    wasiLibcSolidPopcount64(arg1.toLong()).toUInt()

public actual fun rindex(arg1: ConstPtr<CChar>, arg2: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRindex")

public actual fun strcasecmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrcasecmp")

public actual fun strncasecmp(arg1: ConstPtr<CChar>, arg2: ConstPtr<CChar>, arg3: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrncasecmp")

@kotlin.wasm.WasmImport("libc", "libcSolidSignal")
private external fun wasiLibcSolidSignal(arg1: Int, arg2: Long): Long

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    wasiLibcSolidSignal(arg1, arg2.toLong()).toULong()

@kotlin.wasm.WasmImport("libc", "libcSolidRaise")
private external fun wasiLibcSolidRaise(arg1: Int): Int

public actual fun raise(arg1: CInt): CInt =
    wasiLibcSolidRaise(arg1).toInt()

public actual fun asctime(arg1: ConstPtr<Tm>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAsctime")

@kotlin.wasm.WasmImport("libc", "libcSolidClock")
private external fun wasiLibcSolidClock(): Int

public actual fun clock(): ClockT =
    wasiLibcSolidClock().toUInt()

public actual fun ctime(arg1: ConstPtr<TimeT>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidCtime")

@kotlin.wasm.WasmImport("libc", "libcSolidDifftime")
private external fun wasiLibcSolidDifftime(arg1: Long, arg2: Long): Double

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    wasiLibcSolidDifftime(arg1, arg2).toDouble()

public actual fun gmtime(arg1: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGmtime")

public actual fun localtime(arg1: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLocaltime")

public actual fun time(arg1: MutPtr<TimeT>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidTime")

public actual fun mktime(arg1: MutPtr<Tm>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMktime")

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStrftime")

public actual fun utime(arg1: ConstPtr<CChar>, arg2: MutPtr<TimeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidUtime")

public actual fun asctimeR(arg1: ConstPtr<Tm>, arg2: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAsctimeR")

public actual fun ctimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidCtimeR")

public actual fun gmtimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGmtimeR")

public actual fun localtimeR(arg1: ConstPtr<TimeT>, arg2: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLocaltimeR")

public actual fun stat(arg1: ConstPtr<CChar>, arg2: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidStat")

public actual fun lstat(arg1: ConstPtr<CChar>, arg2: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLstat")

public actual fun fstat(arg1: CInt, arg2: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFstat")

public actual fun chmod(arg1: ConstPtr<CChar>, arg2: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidChmod")

public actual fun mkdir(arg1: ConstPtr<CChar>, arg2: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMkdir")

public actual fun open(arg1: ConstPtr<CChar>, arg2: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidOpen")

public actual fun creat(arg1: ConstPtr<CChar>, arg2: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidCreat")

@kotlin.wasm.WasmImport("libc", "libcSolidClose")
private external fun wasiLibcSolidClose(arg1: Int): Int

public actual fun close(arg1: CInt): CInt =
    wasiLibcSolidClose(arg1).toInt()

public actual fun read(arg1: CInt, arg2: MutPtr<CVoid>, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRead")

public actual fun write(arg1: CInt, arg2: ConstPtr<CVoid>, arg3: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidWrite")

public actual fun unlink(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidUnlink")

@kotlin.wasm.WasmImport("libc", "libcSolidTell")
private external fun wasiLibcSolidTell(arg1: Int): Long

public actual fun tell(arg1: CInt): CLong =
    wasiLibcSolidTell(arg1).toLong()

@kotlin.wasm.WasmImport("libc", "libcSolidDup")
private external fun wasiLibcSolidDup(arg1: Int): Int

public actual fun dup(arg1: CInt): CInt =
    wasiLibcSolidDup(arg1).toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidDup2")
private external fun wasiLibcSolidDup2(arg1: Int, arg2: Int): Int

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    wasiLibcSolidDup2(arg1, arg2).toInt()

public actual fun access(arg1: ConstPtr<CChar>, arg2: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidAccess")

public actual fun rmdir(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidRmdir")

public actual fun chdir(arg1: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidChdir")

public actual fun getwd(arg1: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetwd")

public actual fun getcwd(arg1: MutPtr<CChar>, arg2: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetcwd")

public actual fun getopt(arg1: CInt, arg2: MutPtr<MutPtr<CChar>>, arg3: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetopt")

public actual fun getsubopt(arg1: MutPtr<MutPtr<CChar>>, arg2: ConstPtr<MutPtr<CChar>>, arg3: MutPtr<MutPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidGetsubopt")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFcntl")

@kotlin.wasm.WasmImport("libc", "libcSolidGetpid")
private external fun wasiLibcSolidGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcSolidGetpid().toInt()

@kotlin.wasm.WasmImport("libc", "libcSolidSleep")
private external fun wasiLibcSolidSleep(arg1: Int): Int

public actual fun sleep(arg1: CUint): CUint =
    wasiLibcSolidSleep(arg1.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcSolidUsleep")
private external fun wasiLibcSolidUsleep(arg1: Int): Int

public actual fun usleep(arg1: UsecondsT): CInt =
    wasiLibcSolidUsleep(arg1.toInt()).toInt()

public actual fun localeconv(): MutPtr<Lconv> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLocaleconv")

public actual fun setlocale(arg1: CInt, arg2: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidSetlocale")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidDuplocale")

public actual fun freelocale(arg1: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidFreelocale")

public actual fun localeconvL(arg1: LocaleT): MutPtr<Lconv> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidLocaleconvL")

public actual fun newlocale(arg1: CInt, arg2: ConstPtr<CChar>, arg3: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidNewlocale")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidNlLanginfo")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidNlLanginfoL")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcSolidMemalign")

@kotlin.wasm.WasmImport("libc", "libcSolidLseek")
private external fun wasiLibcSolidLseek(arg1: Int, arg2: Long, arg3: Int): Long

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    wasiLibcSolidLseek(arg1, arg2, arg3).toLong()
