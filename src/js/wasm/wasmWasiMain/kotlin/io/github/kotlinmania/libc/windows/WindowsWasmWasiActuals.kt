@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.windows

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
public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPrintf")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFprintf")

@kotlin.wasm.WasmImport("libc", "libcWindowsIsalnum")
private external fun wasiLibcWindowsIsalnum(c: Int): Int

public actual fun isalnum(c: CInt): CInt =
    wasiLibcWindowsIsalnum(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsalpha")
private external fun wasiLibcWindowsIsalpha(c: Int): Int

public actual fun isalpha(c: CInt): CInt =
    wasiLibcWindowsIsalpha(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIscntrl")
private external fun wasiLibcWindowsIscntrl(c: Int): Int

public actual fun iscntrl(c: CInt): CInt =
    wasiLibcWindowsIscntrl(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsdigit")
private external fun wasiLibcWindowsIsdigit(c: Int): Int

public actual fun isdigit(c: CInt): CInt =
    wasiLibcWindowsIsdigit(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsgraph")
private external fun wasiLibcWindowsIsgraph(c: Int): Int

public actual fun isgraph(c: CInt): CInt =
    wasiLibcWindowsIsgraph(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIslower")
private external fun wasiLibcWindowsIslower(c: Int): Int

public actual fun islower(c: CInt): CInt =
    wasiLibcWindowsIslower(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsprint")
private external fun wasiLibcWindowsIsprint(c: Int): Int

public actual fun isprint(c: CInt): CInt =
    wasiLibcWindowsIsprint(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIspunct")
private external fun wasiLibcWindowsIspunct(c: Int): Int

public actual fun ispunct(c: CInt): CInt =
    wasiLibcWindowsIspunct(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsspace")
private external fun wasiLibcWindowsIsspace(c: Int): Int

public actual fun isspace(c: CInt): CInt =
    wasiLibcWindowsIsspace(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsupper")
private external fun wasiLibcWindowsIsupper(c: Int): Int

public actual fun isupper(c: CInt): CInt =
    wasiLibcWindowsIsupper(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsxdigit")
private external fun wasiLibcWindowsIsxdigit(c: Int): Int

public actual fun isxdigit(c: CInt): CInt =
    wasiLibcWindowsIsxdigit(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsIsblank")
private external fun wasiLibcWindowsIsblank(c: Int): Int

public actual fun isblank(c: CInt): CInt =
    wasiLibcWindowsIsblank(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsTolower")
private external fun wasiLibcWindowsTolower(c: Int): Int

public actual fun tolower(c: CInt): CInt =
    wasiLibcWindowsTolower(c)

@kotlin.wasm.WasmImport("libc", "libcWindowsToupper")
private external fun wasiLibcWindowsToupper(c: Int): Int

public actual fun toupper(c: CInt): CInt =
    wasiLibcWindowsToupper(c)

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsQsort")

public actual fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsQsortS")

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFopen")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFreopen")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFflush")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFclose")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRemove")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRename")

public actual fun tmpfile(): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsTmpfile")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSetvbuf")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSetbuf")

@kotlin.wasm.WasmImport("libc", "libcWindowsGetchar")
private external fun wasiLibcWindowsGetchar(): Int

public actual fun getchar(): CInt =
    wasiLibcWindowsGetchar()

@kotlin.wasm.WasmImport("libc", "libcWindowsPutchar")
private external fun wasiLibcWindowsPutchar(c: Int): Int

public actual fun putchar(c: CInt): CInt =
    wasiLibcWindowsPutchar(c)

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFgetc")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFgets")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFputc")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFputs")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPuts")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsUngetc")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFread")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFwrite")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFseek")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFtell")

public actual fun rewind(stream: MutPtr<FILE>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRewind")

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFgetpos")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFsetpos")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFeof")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFerror")

public actual fun perror(s: ConstPtr<CChar>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPerror")

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAtof")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAtoi")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAtol")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAtoll")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtod")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtof")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtol")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtoll")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtoul")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtoull")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsCalloc")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMalloc")

public actual fun msize(p: MutPtr<CVoid>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMsize")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRealloc")

public actual fun free(p: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFree")

@kotlin.wasm.WasmImport("libc", "libcWindowsAbort")
private external fun wasiLibcWindowsAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcWindowsAbort()
    error("C noreturn function libcWindowsAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcWindowsExit")
private external fun wasiLibcWindowsExit(status: Int): Unit

public actual fun exit(status: CInt): Nothing {
    wasiLibcWindowsExit(status)
    error("C noreturn function libcWindowsExit returned")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAtexit")

public actual fun system(s: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSystem")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetenv")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrcpy")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrncpy")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrcat")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrncat")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrcmp")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrncmp")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrcoll")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrchr")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrrchr")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrspn")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrcspn")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrdup")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrpbrk")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrstr")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrlen")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrnlen")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrerror")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrtok")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStrxfrm")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWcslen")

public actual fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWcsnlen")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWcstombs")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMemchr")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMemcmp")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMemcpy")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMemmove")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMemset")

@kotlin.wasm.WasmImport("libc", "libcWindowsAbs")
private external fun wasiLibcWindowsAbs(i: Int): Int

public actual fun abs(i: CInt): CInt =
    wasiLibcWindowsAbs(i)

@kotlin.wasm.WasmImport("libc", "libcWindowsLabs")
private external fun wasiLibcWindowsLabs(i: Long): Long

public actual fun labs(i: CLong): CLong =
    wasiLibcWindowsLabs(i)

@kotlin.wasm.WasmImport("libc", "libcWindowsRand")
private external fun wasiLibcWindowsRand(): Int

public actual fun rand(): CInt =
    wasiLibcWindowsRand()

@kotlin.wasm.WasmImport("libc", "libcWindowsSrand")
private external fun wasiLibcWindowsSrand(seed: Int): Unit

public actual fun srand(seed: CUint): Unit =
    wasiLibcWindowsSrand(seed.toInt())

@kotlin.wasm.WasmImport("libc", "libcWindowsSignal")
private external fun wasiLibcWindowsSignal(signum: Int, handler: Long): Long

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    wasiLibcWindowsSignal(signum, handler.toLong()).toULong()

@kotlin.wasm.WasmImport("libc", "libcWindowsRaise")
private external fun wasiLibcWindowsRaise(signum: Int): Int

public actual fun raise(signum: CInt): CInt =
    wasiLibcWindowsRaise(signum)

@kotlin.wasm.WasmImport("libc", "libcWindowsClock")
private external fun wasiLibcWindowsClock(): Int

public actual fun clock(): ClockT =
    wasiLibcWindowsClock()

public actual fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsCtime")

@kotlin.wasm.WasmImport("libc", "libcWindowsDifftime")
private external fun wasiLibcWindowsDifftime(timeEnd: Long, timeStart: Long): Double

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    wasiLibcWindowsDifftime(timeEnd, timeStart)

public actual fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGmtimeS")

public actual fun getDaylight(hours: MutPtr<CInt>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetDaylight")

public actual fun getDstbias(seconds: MutPtr<CLong>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetDstbias")

public actual fun getTimezone(seconds: MutPtr<CLong>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetTimezone")

public actual fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetTzname")

public actual fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsLocaltimeS")

public actual fun time(destTime: MutPtr<TimeT>): TimeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsTime")

@kotlin.wasm.WasmImport("libc", "libcWindowsTzset")
private external fun wasiLibcWindowsTzset(): Unit

public actual fun tzset(): Unit =
    wasiLibcWindowsTzset()

public actual fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsChmod")

public actual fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWchmod")

public actual fun mkdir(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsMkdir")

public actual fun wrmdir(path: ConstPtr<WcharT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWrmdir")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFstat")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsStat")

public actual fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWstat")

public actual fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWutime")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPopen")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPclose")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFdopen")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsFileno")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsOpen")

public actual fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWopen")

public actual fun creat(path: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsCreat")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAccess")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsChdir")

@kotlin.wasm.WasmImport("libc", "libcWindowsClose")
private external fun wasiLibcWindowsClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcWindowsClose(fd)

@kotlin.wasm.WasmImport("libc", "libcWindowsDup")
private external fun wasiLibcWindowsDup(fd: Int): Int

public actual fun dup(fd: CInt): CInt =
    wasiLibcWindowsDup(fd)

@kotlin.wasm.WasmImport("libc", "libcWindowsDup2")
private external fun wasiLibcWindowsDup2(src: Int, dst: Int): Int

public actual fun dup2(src: CInt, dst: CInt): CInt =
    wasiLibcWindowsDup2(src, dst)

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecl")

public actual fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecl")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecle")

public actual fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecle")

public actual fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExeclp")

public actual fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexeclp")

public actual fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExeclpe")

public actual fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexeclpe")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecv")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecve")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecvp")

public actual fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsExecvpe")

public actual fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecv")

public actual fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecve")

public actual fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecvp")

public actual fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWexecvpe")

public actual fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetcwd")

@kotlin.wasm.WasmImport("libc", "libcWindowsGetpid")
private external fun wasiLibcWindowsGetpid(): Int

public actual fun getpid(): CInt =
    wasiLibcWindowsGetpid()

@kotlin.wasm.WasmImport("libc", "libcWindowsIsatty")
private external fun wasiLibcWindowsIsatty(fd: Int): Int

public actual fun isatty(fd: CInt): CInt =
    wasiLibcWindowsIsatty(fd)

@kotlin.wasm.WasmImport("libc", "libcWindowsLseek")
private external fun wasiLibcWindowsLseek(fd: Int, offset: Long, origin: Int): Long

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    wasiLibcWindowsLseek(fd, offset, origin)

@kotlin.wasm.WasmImport("libc", "libcWindowsLseek64")
private external fun wasiLibcWindowsLseek64(fd: Int, offset: Long, origin: Int): Long

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    wasiLibcWindowsLseek64(fd, offset, origin)

public actual fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPipe")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRead")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRmdir")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsUnlink")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWrite")

@kotlin.wasm.WasmImport("libc", "libcWindowsCommit")
private external fun wasiLibcWindowsCommit(fd: Int): Int

public actual fun commit(fd: CInt): CInt =
    wasiLibcWindowsCommit(fd)

@kotlin.wasm.WasmImport("libc", "libcWindowsGetOsfhandle")
private external fun wasiLibcWindowsGetOsfhandle(fd: Int): Long

public actual fun getOsfhandle(fd: CInt): IntptrT =
    wasiLibcWindowsGetOsfhandle(fd)

@kotlin.wasm.WasmImport("libc", "libcWindowsOpenOsfhandle")
private external fun wasiLibcWindowsOpenOsfhandle(osfhandle: Long, flags: Int): Int

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    wasiLibcWindowsOpenOsfhandle(osfhandle, flags)

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSetlocale")

public actual fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWsetlocale")

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAlignedMalloc")

public actual fun alignedFree(ptr: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAlignedFree")

public actual fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAlignedRealloc")

public actual fun putenv(envstring: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPutenv")

public actual fun wputenv(envstring: ConstPtr<WcharT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWputenv")

public actual fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsPutenvS")

public actual fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsWputenvS")

@kotlin.wasm.WasmImport("libc", "libcWindowsListen")
private external fun wasiLibcWindowsListen(s: Long, backlog: Int): Int

public actual fun listen(s: Socket, backlog: CInt): CInt =
    wasiLibcWindowsListen(s.toLong(), backlog)

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsAccept")

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsBind")

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsConnect")

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetpeername")

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetsockname")

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsGetsockopt")

public actual fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsRecvfrom")

public actual fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSendto")

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWindowsSetsockopt")

@kotlin.wasm.WasmImport("libc", "libcWindowsSocket")
private external fun wasiLibcWindowsSocket(af: Int, socketType: Int, protocol: Int): Long

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    wasiLibcWindowsSocket(af, socketType, protocol).toULong()
