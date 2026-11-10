@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.solid.aarch64.WcharT

private var _ffi_static_OPTARG: COpaquePointer? = null
public actual var OPTARG: COpaquePointer?
    get() = _ffi_static_OPTARG
    set(value) {
        _ffi_static_OPTARG = value
    }

private var _ffi_static_OPTERR: CInt = 0
public actual var OPTERR: CInt
    get() = _ffi_static_OPTERR
    set(value) {
        _ffi_static_OPTERR = value
    }

private var _ffi_static_OPTIND: CInt = 0
public actual var OPTIND: CInt
    get() = _ffi_static_OPTIND
    set(value) {
        _ffi_static_OPTIND = value
    }

private var _ffi_static_OPTOPT: CInt = 0
public actual var OPTOPT: CInt
    get() = _ffi_static_OPTOPT
    set(value) {
        _ffi_static_OPTOPT = value
    }

private var _ffi_static_OPTRESET: CInt = 0
public actual var OPTRESET: CInt
    get() = _ffi_static_OPTRESET
    set(value) {
        _ffi_static_OPTRESET = value
    }

private var _ffi_static_SUBOPTARG: COpaquePointer? = null
public actual var SUBOPTARG: COpaquePointer?
    get() = _ffi_static_SUBOPTARG
    set(value) {
        _ffi_static_SUBOPTARG = value
    }

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStdioFile(fileno: CInt): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearerr(arg1: FILE?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun fclose(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun feof(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ferror(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fflush(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftell(arg1: FILE?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perror(arg1: String?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putchar(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun puts(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun remove(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rewind(arg1: FILE?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rename(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fileno(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flockfile(arg1: FILE?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun funlockfile(arg1: FILE?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getw(arg1: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atof(arg1: String?): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drand48(): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun erand48(arg1: COpaquePointer?): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun exit(arg1: CInt): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abort(): Nothing =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun abs(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoi(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atol(arg1: String?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(arg1: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun labs(arg1: CLong): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun rand(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand(arg1: CUint) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun randR(arg1: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lcong48(arg1: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srand48(arg1: CLong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun a64l(arg1: String?): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun l64a(arg1: CLong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun random(): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun srandom(arg1: CUint) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atoll(arg1: String?): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun llabs(arg1: CLonglong): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun quickExit(arg1: CInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unsetenv(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getprogname(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setprogname(arg1: String?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun qabs(arg1: QuadT): QuadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerror(arg1: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlen(arg1: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strdup(arg1: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ffs(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popcount(arg1: CUint): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popcountl(arg1: CUlong): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popcountll(arg1: CUlonglong): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popcount32(arg1: UInt): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun popcount64(arg1: ULong): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun raise(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clock(): ClockT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun time(arg1: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unlink(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tell(arg1: CInt): CLong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup(arg1: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun access(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmdir(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chdir(arg1: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sleep(arg1: CUint): CUint =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun usleep(arg1: UsecondsT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun localeconv(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun freelocale(arg1: LocaleT) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
