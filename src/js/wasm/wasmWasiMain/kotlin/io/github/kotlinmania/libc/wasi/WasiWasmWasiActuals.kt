@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual var ENVIRON: MutPtr<MutPtr<CChar>>
    get() = throw UnsupportedOperationException("WasmWasi foreign static environ requires a host memory/aggregate ABI adapter")
    set(value) {
        throw UnsupportedOperationException("WasmWasi foreign static environ requires a host memory/aggregate ABI adapter")
    }

@kotlin.wasm.WasmImport("libc", "libcWasiGetCLOCKMONOTONIC1")
private external fun wasiLibcWasiGetCLOCKMONOTONIC1(): Int

public actual val CLOCK_MONOTONIC1: UByte
    get() = wasiLibcWasiGetCLOCKMONOTONIC1().toUByte()

@kotlin.wasm.WasmImport("libc", "libcWasiGetCLOCKREALTIME1")
private external fun wasiLibcWasiGetCLOCKREALTIME1(): Int

public actual val CLOCK_REALTIME1: UByte
    get() = wasiLibcWasiGetCLOCKREALTIME1().toUByte()

@kotlin.wasm.WasmImport("libc", "libcWasiExit")
private external fun wasiLibcWasiExit(code: Int): Unit

public actual fun exit(code: CInt): Nothing {
    wasiLibcWasiExit(code)
    error("C noreturn function libcWasiExit returned")
}

@kotlin.wasm.WasmImport("libc", "libcWasiAbort")
private external fun wasiLibcWasiAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcWasiAbort()
    error("C noreturn function libcWasiAbort returned")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAlignedAlloc")

public actual fun calloc(amt: SizeT, amt2: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiCalloc")

public actual fun free(ptr: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFree")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetenv")

public actual fun malloc(amt: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMalloc")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMallocUsableSize")

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSbrk")

@kotlin.wasm.WasmImport("libc", "libcWasiRand")
private external fun wasiLibcWasiRand(): Int

public actual fun rand(): CInt =
    wasiLibcWasiRand()

public actual fun read(fd: CInt, ptr: MutPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRead")

public actual fun realloc(ptr: MutPtr<CVoid>, amt: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRealloc")

public actual fun setenv(k: ConstPtr<CChar>, v: ConstPtr<CChar>, a: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSetenv")

public actual fun unsetenv(k: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUnsetenv")

@kotlin.wasm.WasmImport("libc", "libcWasiClearenv")
private external fun wasiLibcWasiClearenv(): Int

public actual fun clearenv(): CInt =
    wasiLibcWasiClearenv()

public actual fun write(fd: CInt, ptr: ConstPtr<CVoid>, size: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWrite")

public actual fun fopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFopen")

public actual fun freopen(a: ConstPtr<CChar>, b: ConstPtr<CChar>, f: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFreopen")

public actual fun fclose(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFclose")

public actual fun remove(a: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRemove")

public actual fun rename(a: ConstPtr<CChar>, b: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRename")

public actual fun feof(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFeof")

public actual fun ferror(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFerror")

public actual fun fflush(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFflush")

public actual fun clearerr(f: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiClearerr")

public actual fun fseek(f: MutPtr<FILE>, b: CLong, c: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFseek")

public actual fun ftell(f: MutPtr<FILE>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFtell")

public actual fun rewind(f: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRewind")

public actual fun fgetpos(f: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFgetpos")

public actual fun fsetpos(f: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFsetpos")

public actual fun fread(buf: MutPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFread")

public actual fun fwrite(buf: ConstPtr<CVoid>, a: SizeT, b: SizeT, f: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFwrite")

public actual fun fgetc(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFgetc")

public actual fun getc(f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetc")

@kotlin.wasm.WasmImport("libc", "libcWasiGetchar")
private external fun wasiLibcWasiGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcWasiGetchar()

public actual fun ungetc(a: CInt, f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUngetc")

public actual fun fputc(a: CInt, f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFputc")

public actual fun putc(a: CInt, f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPutc")

@kotlin.wasm.WasmImport("libc", "libcWasiPutchar")
private external fun wasiLibcWasiPutchar(a: Int): Int

public actual fun putchar(a: CInt): CInt =
    wasiLibcWasiPutchar(a)

public actual fun fputs(a: ConstPtr<CChar>, f: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFputs")

public actual fun puts(a: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPuts")

public actual fun perror(a: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPerror")

@kotlin.wasm.WasmImport("libc", "libcWasiSrand")
private external fun wasiLibcWasiSrand(a: Int): Unit

public actual fun srand(a: CUint): Unit =
    wasiLibcWasiSrand(a.toInt())

public actual fun atexit(a: AtexitACallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtexit")

public actual fun atQuickExit(a: AtexitACallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtQuickExit")

@kotlin.wasm.WasmImport("libc", "libcWasiQuickExit")
private external fun wasiLibcWasiQuickExit(a: Int): Unit

public actual fun quickExit(a: CInt): Nothing {
    wasiLibcWasiQuickExit(a)
    error("C noreturn function libcWasiQuickExit returned")
}

public actual fun posixMemalign(a: MutPtr<MutPtr<CVoid>>, b: SizeT, c: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPosixMemalign")

public actual fun randR(a: MutPtr<CUint>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRandR")

@kotlin.wasm.WasmImport("libc", "libcWasiRandom")
private external fun wasiLibcWasiRandom(): Long

public actual fun random(): CLong =
    wasiLibcWasiRandom()

@kotlin.wasm.WasmImport("libc", "libcWasiSrandom")
private external fun wasiLibcWasiSrandom(a: Int): Unit

public actual fun srandom(a: CUint): Unit =
    wasiLibcWasiSrandom(a.toInt())

public actual fun putenv(a: MutPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPutenv")

@kotlin.wasm.WasmImport("libc", "libcWasiClock")
private external fun wasiLibcWasiClock(): Long

public actual fun clock(): ClockT =
    wasiLibcWasiClock()

public actual fun time(a: MutPtr<TimeT>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiTime")

@kotlin.wasm.WasmImport("libc", "libcWasiDifftime")
private external fun wasiLibcWasiDifftime(a: Long, b: Long): Double

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    wasiLibcWasiDifftime(a, b)

public actual fun mktime(a: MutPtr<Tm>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMktime")

public actual fun strftime(a: MutPtr<CChar>, b: SizeT, c: ConstPtr<CChar>, d: ConstPtr<Tm>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrftime")

public actual fun gmtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGmtime")

public actual fun gmtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGmtimeR")

public actual fun localtime(a: ConstPtr<TimeT>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLocaltime")

public actual fun localtimeR(a: ConstPtr<TimeT>, b: MutPtr<Tm>): MutPtr<Tm> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLocaltimeR")

public actual fun asctimeR(a: ConstPtr<Tm>, b: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAsctimeR")

public actual fun ctimeR(a: ConstPtr<TimeT>, b: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiCtimeR")

public actual fun nanosleep(a: ConstPtr<Timespec>, b: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiNanosleep")

public actual fun clockGetres(a: ClockidT, b: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiClockGetres")

public actual fun clockGettime(a: ClockidT, b: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiClockGettime")

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: ConstPtr<Timespec>, c: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiClockNanosleep")

@kotlin.wasm.WasmImport("libc", "libcWasiIsalnum")
private external fun wasiLibcWasiIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcWasiIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsalpha")
private external fun wasiLibcWasiIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcWasiIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIscntrl")
private external fun wasiLibcWasiIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcWasiIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsdigit")
private external fun wasiLibcWasiIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcWasiIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsgraph")
private external fun wasiLibcWasiIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcWasiIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIslower")
private external fun wasiLibcWasiIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcWasiIslower(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsprint")
private external fun wasiLibcWasiIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcWasiIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIspunct")
private external fun wasiLibcWasiIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcWasiIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsspace")
private external fun wasiLibcWasiIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcWasiIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsupper")
private external fun wasiLibcWasiIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcWasiIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsxdigit")
private external fun wasiLibcWasiIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcWasiIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcWasiIsblank")
private external fun wasiLibcWasiIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcWasiIsblank(c)

@kotlin.wasm.WasmImport("libc", "libcWasiTolower")
private external fun wasiLibcWasiTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcWasiTolower(c)

@kotlin.wasm.WasmImport("libc", "libcWasiToupper")
private external fun wasiLibcWasiToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcWasiToupper(c)

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSetvbuf")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSetbuf")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFgets")

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtof")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtoi")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtol")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAtoll")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtod")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtof")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtol")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtoll")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtoul")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtoull")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcpy")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrncpy")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcat")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrncat")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcmp")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrncmp")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcoll")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrchr")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrrchr")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrspn")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcspn")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrdup")

public actual fun strndup(cs: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrndup")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrpbrk")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrstr")

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcasecmp")

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrncasecmp")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrlen")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrnlen")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrerror")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrtok")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrxfrm")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemchr")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemcmp")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemcpy")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemmove")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemset")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFprintf")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPrintf")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSnprintf")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSprintf")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFscanf")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiScanf")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSscanf")

@kotlin.wasm.WasmImport("libc", "libcWasiGetcharUnlocked")
private external fun wasiLibcWasiGetcharUnlocked(): Int

public actual fun getcharUnlocked(): CInt =
    wasiLibcWasiGetcharUnlocked()

@kotlin.wasm.WasmImport("libc", "libcWasiPutcharUnlocked")
private external fun wasiLibcWasiPutcharUnlocked(c: Int): Int

public actual fun putcharUnlocked(c: CInt): CInt =
    wasiLibcWasiPutcharUnlocked(c)

@kotlin.wasm.WasmImport("libc", "libcWasiShutdown")
private external fun wasiLibcWasiShutdown(socket: Int, how: Int): Int

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    wasiLibcWasiShutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFstat")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMkdir")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStat")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFdopen")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFileno")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiOpen")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiCreat")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFcntl")

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiOpendir")

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFdopendir")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiReaddir")

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiClosedir")

public actual fun rewinddir(dirp: MutPtr<DIR>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRewinddir")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiDirfd")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSeekdir")

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiTelldir")

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiOpenat")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFstatat")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLinkat")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMkdirat")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiReadlinkat")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRenameat")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSymlinkat")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUnlinkat")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiAccess")

@kotlin.wasm.WasmImport("libc", "libcWasiClose")
private external fun wasiLibcWasiClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcWasiClose(fd)

@kotlin.wasm.WasmImport("libc", "libcWasiFpathconf")
private external fun wasiLibcWasiFpathconf(filedes: Int, name: Int): Long

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    wasiLibcWasiFpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetopt")

@kotlin.wasm.WasmImport("libc", "libcWasiIsatty")
private external fun wasiLibcWasiIsatty(fd: Int): Int

public actual fun isatty(fd: CInt): CInt =
    wasiLibcWasiIsatty(fd)

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLink")

@kotlin.wasm.WasmImport("libc", "libcWasiLseek")
private external fun wasiLibcWasiLseek(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    wasiLibcWasiLseek(fd, offset, whence)

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPathconf")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRmdir")

@kotlin.wasm.WasmImport("libc", "libcWasiSleep")
private external fun wasiLibcWasiSleep(secs: Int): Int

public actual fun sleep(secs: CUint): CUint =
    wasiLibcWasiSleep(secs.toInt()).toUInt()

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUnlink")

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPread")

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPwrite")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLstat")

@kotlin.wasm.WasmImport("libc", "libcWasiFsync")
private external fun wasiLibcWasiFsync(fd: Int): Int

public actual fun fsync(fd: CInt): CInt =
    wasiLibcWasiFsync(fd)

@kotlin.wasm.WasmImport("libc", "libcWasiFdatasync")
private external fun wasiLibcWasiFdatasync(fd: Int): Int

public actual fun fdatasync(fd: CInt): CInt =
    wasiLibcWasiFdatasync(fd)

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSymlink")

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiTruncate")

@kotlin.wasm.WasmImport("libc", "libcWasiFtruncate")
private external fun wasiLibcWasiFtruncate(fd: Int, length: Long): Int

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    wasiLibcWasiFtruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: MutPtr<Rusage>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetrusage")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGettimeofday")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiTimes")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrerrorR")

@kotlin.wasm.WasmImport("libc", "libcWasiUsleep")
private external fun wasiLibcWasiUsleep(secs: Int): Int

public actual fun usleep(secs: CUint): CInt =
    wasiLibcWasiUsleep(secs.toInt())

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSend")

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRecv")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPoll")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSetlocale")

public actual fun localeconv(): MutPtr<Lconv> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiLocaleconv")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiReadlink")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiTimegm")

@kotlin.wasm.WasmImport("libc", "libcWasiSysconf")
private external fun wasiLibcWasiSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcWasiSysconf(name)

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiIoctl")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFseeko")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFtello")

@kotlin.wasm.WasmImport("libc", "libcWasiPosixFallocate")
private external fun wasiLibcWasiPosixFallocate(fd: Int, offset: Long, len: Long): Int

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    wasiLibcWasiPosixFallocate(fd, offset, len)

public actual fun strcasestr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiStrcasestr")

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetline")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFaccessat")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWritev")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiReadv")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPreadv")

@kotlin.wasm.WasmImport("libc", "libcWasiPosixFadvise")
private external fun wasiLibcWasiPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    wasiLibcWasiPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFutimens")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUtimensat")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetentropy")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiMemrchr")

@kotlin.wasm.WasmImport("libc", "libcWasiAbs")
private external fun wasiLibcWasiAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcWasiAbs(i)

@kotlin.wasm.WasmImport("libc", "libcWasiLabs")
private external fun wasiLibcWasiLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcWasiLabs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiDuplocale")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiFreelocale")

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiNewlocale")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiUselocale")

@kotlin.wasm.WasmImport("libc", "libcWasiSchedYield")
private external fun wasiLibcWasiSchedYield(): Int

public actual fun schedYield(): CInt =
    wasiLibcWasiSchedYield()

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiGetcwd")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiChdir")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiNlLanginfo")

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiNlLanginfoL")

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiSelect")

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcRegisterPreopenedFd")

@kotlin.wasm.WasmImport("libc", "libcWasiWasilibcFdRenumber")
private external fun wasiLibcWasiWasilibcFdRenumber(fd: Int, newfd: Int): Int

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    wasiLibcWasiWasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcUnlinkat")

public actual fun wasilibcRmdirat(fd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcRmdirat")

public actual fun wasilibcFindRelpath(path: ConstPtr<CChar>, absPrefix: MutPtr<ConstPtr<CChar>>, relativePath: MutPtr<MutPtr<CChar>>, relativePathLen: ULong): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcFindRelpath")

@kotlin.wasm.WasmImport("libc", "libcWasiWasilibcTell")
private external fun wasiLibcWasiWasilibcTell(fd: Int): Long

public actual fun wasilibcTell(fd: CInt): OffT =
    wasiLibcWasiWasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdWasilibcUnlinkat")

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdWasilibcRmdirat")

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdLinkat")

public actual fun wasilibcNocwdSymlinkat(target: ConstPtr<CChar>, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdSymlinkat")

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdReadlinkat")

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdFaccessat")

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdRenameat")

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdOpenatNomode")

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdFstatat")

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdMkdiratNomode")

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdUtimensat")

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: ConstPtr<CChar>): MutPtr<DIR> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcNocwdOpendirat")

public actual fun wasilibcAccess(pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcAccess")

public actual fun wasilibcStat(pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcStat")

public actual fun wasilibcUtimens(pathname: ConstPtr<CChar>, times: ConstPtr<Timespec>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcUtimens")

public actual fun wasilibcLink(oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcLink")

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcLinkOldat")

public actual fun wasilibcLinkNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcLinkNewat")

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcRenameOldat")

public actual fun wasilibcRenameNewat(oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiWasilibcRenameNewat")

@kotlin.wasm.WasmImport("libc", "libcWasiArc4random")
private external fun wasiLibcWasiArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcWasiArc4random().toUInt()

public actual fun arc4randomBuf(a: MutPtr<CVoid>, b: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiArc4randomBuf")

@kotlin.wasm.WasmImport("libc", "libcWasiArc4randomUniform")
private external fun wasiLibcWasiArc4randomUniform(a: Int): Int

public actual fun arc4randomUniform(a: UInt): UInt =
    wasiLibcWasiArc4randomUniform(a.toInt()).toUInt()

public actual fun errnoLocation(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiErrnoLocation")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiChmod")

@kotlin.wasm.WasmImport("libc", "libcWasiFchmod")
private external fun wasiLibcWasiFchmod(fd: Int, mode: Int): Int

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    wasiLibcWasiFchmod(fd, mode.toInt())

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiRealpath")

public actual fun pthreadSelf(): PthreadT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadSelf")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCreate")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadEqual")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadJoin")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadAttrInit")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadAttrDestroy")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadAttrGetstacksize")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadAttrSetstacksize")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadAttrSetdetachstate")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadDetach")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadKeyCreate")

@kotlin.wasm.WasmImport("libc", "libcWasiPthreadKeyDelete")
private external fun wasiLibcWasiPthreadKeyDelete(key: Int): Int

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    wasiLibcWasiPthreadKeyDelete(key.toInt())

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadGetspecific")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadSetspecific")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexInit")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexDestroy")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexLock")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexTrylock")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexUnlock")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexattrInit")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexattrDestroy")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadMutexattrSettype")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondInit")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondWait")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondTimedwait")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondSignal")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondBroadcast")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondDestroy")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondattrInit")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadCondattrDestroy")

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockInit")

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockDestroy")

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockRdlock")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockTryrdlock")

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockWrlock")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockTrywrlock")

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockUnlock")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockattrInit")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiPthreadRwlockattrDestroy")
