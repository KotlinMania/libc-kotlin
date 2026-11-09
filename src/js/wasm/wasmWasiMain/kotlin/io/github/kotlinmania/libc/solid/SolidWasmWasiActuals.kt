@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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
    0

public actual fun isalpha(c: CInt): CInt =
    0

public actual fun iscntrl(c: CInt): CInt =
    0

public actual fun isdigit(c: CInt): CInt =
    0

public actual fun isgraph(c: CInt): CInt =
    0

public actual fun islower(c: CInt): CInt =
    0

public actual fun isprint(c: CInt): CInt =
    0

public actual fun ispunct(c: CInt): CInt =
    0

public actual fun isspace(c: CInt): CInt =
    0

public actual fun isupper(c: CInt): CInt =
    0

public actual fun isxdigit(c: CInt): CInt =
    0

public actual fun isblank(c: CInt): CInt =
    0

public actual fun tolower(c: CInt): CInt =
    0

public actual fun toupper(c: CInt): CInt =
    0

public actual fun getStdioFile(fileno: CInt): FILE? =
    null

public actual fun clearerr(arg1: FILE?) {
}

public actual fun fclose(arg1: FILE?): CInt =
    0

public actual fun feof(arg1: FILE?): CInt =
    0

public actual fun ferror(arg1: FILE?): CInt =
    0

public actual fun fflush(arg1: FILE?): CInt =
    0

public actual fun fgetc(arg1: FILE?): CInt =
    0

public actual fun fgets(arg1: COpaquePointer?, arg2: CInt, arg3: FILE?): COpaquePointer? =
    null

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    null

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    0

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    0

public actual fun fread(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    0uL

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    null

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    0

public actual fun ftell(arg1: FILE?): CLong =
    0L

public actual fun fwrite(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: FILE?): SizeT =
    0uL

public actual fun getc(arg1: FILE?): CInt =
    0

public actual fun getchar(): CInt =
    0

public actual fun perror(arg1: String?) {
}

public actual fun printf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    0

public actual fun putchar(arg1: CInt): CInt =
    0

public actual fun puts(arg1: String?): CInt =
    0

public actual fun remove(arg1: String?): CInt =
    0

public actual fun rewind(arg1: FILE?) {
}

public actual fun scanf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun setbuf(arg1: FILE?, arg2: COpaquePointer?) {
}

public actual fun setvbuf(arg1: FILE?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): CInt =
    0

public actual fun sscanf(arg1: String?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun tmpfile(): FILE? =
    null

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    0

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    0

public actual fun gets(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun sprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun tmpnam(arg1: String?): COpaquePointer? =
    null

public actual fun vsprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun rename(arg1: String?, arg2: String?): CInt =
    0

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun iprintf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun iscanf(arg1: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun siprintf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun siscanf(arg1: COpaquePointer?, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    0

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    0

public actual fun vsiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    0

public actual fun vsniprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    0

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    0

public actual fun diprintf(arg1: CInt, arg2: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fgetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    0

public actual fun fsetpos(arg1: FILE?, arg2: COpaquePointer?): CInt =
    0

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    null

public actual fun fileno(arg1: FILE?): CInt =
    0

public actual fun flockfile(arg1: FILE?) {
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    0

public actual fun funlockfile(arg1: FILE?) {
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    0

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    0

public actual fun putcharUnlocked(arg1: CInt): CInt =
    0

public actual fun snprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun vsnprintf(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: VaList): CInt =
    0

public actual fun getw(arg1: FILE?): CInt =
    0

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    0

public actual fun tempnam(arg1: String?, arg2: String?): COpaquePointer? =
    null

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    0

public actual fun ftello(stream: FILE?): OffT =
    0L

public actual fun atof(arg1: String?): Double =
    0.0

public actual fun strtod(arg1: String?, arg2: COpaquePointer?): Double =
    0.0

public actual fun drand48(): Double =
    0.0

public actual fun erand48(arg1: COpaquePointer?): Double =
    0.0

public actual fun strtof(arg1: String?, arg2: COpaquePointer?): Float =
    0.0f

public actual fun strtold(arg1: String?, arg2: COpaquePointer?): Double =
    0.0

public actual fun strtodL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    0.0

public actual fun strtofL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Float =
    0.0f

public actual fun strtoldL(arg1: String?, arg2: COpaquePointer?, arg3: LocaleT): Double =
    0.0

public actual fun exit(arg1: CInt): Nothing =
    error("Unreachable noreturn C function exit")

public actual fun abort(): Nothing =
    error("Unreachable noreturn C function abort")

public actual fun abs(arg1: CInt): CInt =
    0

public actual fun atexit(arg1: AtexitArg1Callback?): CInt =
    0

public actual fun atoi(arg1: String?): CInt =
    0

public actual fun atol(arg1: String?): CLong =
    0L

public actual fun itoa(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    null

public actual fun ltoa(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    null

public actual fun ultoa(arg1: CUlong, arg2: COpaquePointer?, arg3: CInt): COpaquePointer? =
    null

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: SizeT, arg5: BsearchArg5Callback?): COpaquePointer? =
    null

public actual fun calloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    null

public actual fun div(arg1: CInt, arg2: CInt): DivT =
    DivT()

public actual fun free(arg1: COpaquePointer?) {
}

public actual fun getenv(arg1: String?): COpaquePointer? =
    null

public actual fun labs(arg1: CLong): CLong =
    0L

public actual fun ldiv(arg1: CLong, arg2: CLong): LdivT =
    LdivT()

public actual fun malloc(arg1: SizeT): COpaquePointer? =
    null

public actual fun qsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?) {
}

public actual fun rand(): CInt =
    0

public actual fun realloc(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    null

public actual fun srand(arg1: CUint) {
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    0L

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlong =
    0uL

public actual fun mblen(arg1: String?, arg2: SizeT): CInt =
    0

public actual fun mbstowcs(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    0uL

public actual fun wctomb(arg1: COpaquePointer?, arg2: WcharT): CInt =
    0

public actual fun mbtowc(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): CInt =
    0

public actual fun wcstombs(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): SizeT =
    0uL

public actual fun randR(arg1: COpaquePointer?): CInt =
    0

public actual fun jrand48(arg1: COpaquePointer?): CLong =
    0L

public actual fun lcong48(arg1: COpaquePointer?) {
}

public actual fun lrand48(): CLong =
    0L

public actual fun mrand48(): CLong =
    0L

public actual fun nrand48(arg1: COpaquePointer?): CLong =
    0L

public actual fun seed48(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun srand48(arg1: CLong) {
}

public actual fun putenv(arg1: COpaquePointer?): CInt =
    0

public actual fun a64l(arg1: String?): CLong =
    0L

public actual fun l64a(arg1: CLong): COpaquePointer? =
    null

public actual fun random(): CLong =
    0L

public actual fun setstate(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun initstate(arg1: CUint, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    null

public actual fun srandom(arg1: CUint) {
}

public actual fun mkostemp(arg1: COpaquePointer?, arg2: CInt): CInt =
    0

public actual fun mkostemps(arg1: COpaquePointer?, arg2: CInt, arg3: CInt): CInt =
    0

public actual fun mkdtemp(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun mkstemp(arg1: COpaquePointer?): CInt =
    0

public actual fun mktemp(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun atoll(arg1: String?): CLonglong =
    0L

public actual fun llabs(arg1: CLonglong): CLonglong =
    0L

public actual fun lldiv(arg1: CLonglong, arg2: CLonglong): LldivT =
    LldivT()

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLonglong =
    0L

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CUlonglong =
    0uL

public actual fun alignedAlloc(arg1: SizeT, arg2: SizeT): COpaquePointer? =
    null

public actual fun atQuickExit(arg1: AtexitArg1Callback?): CInt =
    0

public actual fun quickExit(arg1: CInt) {
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    0

public actual fun unsetenv(arg1: String?): CInt =
    0

public actual fun humanizeNumber(arg1: COpaquePointer?, arg2: SizeT, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    0

public actual fun dehumanizeNumber(arg1: String?, arg2: COpaquePointer?): CInt =
    0

public actual fun getenvR(arg1: String?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    0

public actual fun heapsort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    0

public actual fun mergesort(arg1: COpaquePointer?, arg2: SizeT, arg3: SizeT, arg4: BsearchArg5Callback?): CInt =
    0

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    0

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUint): CInt =
    0

public actual fun getprogname(): COpaquePointer? =
    null

public actual fun setprogname(arg1: String?) {
}

public actual fun qabs(arg1: QuadT): QuadT =
    0L

public actual fun strtoq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): QuadT =
    0L

public actual fun strtouq(arg1: String?, arg2: COpaquePointer?, arg3: CInt): UQuadT =
    0uL

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong): CLonglong =
    0L

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLonglong, arg4: CLonglong, arg5: COpaquePointer?, arg6: SizeT): CLonglong =
    0L

public actual fun l64aR(arg1: CLong, arg2: COpaquePointer?, arg3: CInt): CInt =
    0

public actual fun qdiv(arg1: QuadT, arg2: QuadT): QdivT =
    QdivT()

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    0L

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlong =
    0uL

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLonglong =
    0L

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CUlonglong =
    0uL

public actual fun strtoqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): QuadT =
    0L

public actual fun strtouqL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): UQuadT =
    0uL

public actual fun mbCurMaxL(arg1: LocaleT): SizeT =
    0uL

public actual fun mblenL(arg1: String?, arg2: SizeT, arg3: LocaleT): CInt =
    0

public actual fun mbstowcsL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    0uL

public actual fun wctombL(arg1: COpaquePointer?, arg2: WcharT, arg3: LocaleT): CInt =
    0

public actual fun mbtowcL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): CInt =
    0

public actual fun wcstombsL(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT, arg4: LocaleT): SizeT =
    0uL

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    null

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    0

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    null

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): COpaquePointer? =
    null

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    null

public actual fun strcat(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    null

public actual fun strchr(arg1: String?, arg2: CInt): COpaquePointer? =
    null

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    0

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    0

public actual fun strcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    null

public actual fun strcspn(arg1: String?, arg2: String?): SizeT =
    0uL

public actual fun strerror(arg1: CInt): COpaquePointer? =
    null

public actual fun strlen(arg1: String?): SizeT =
    0uL

public actual fun strncat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    null

public actual fun strncmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    0

public actual fun strncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    null

public actual fun strpbrk(arg1: String?, arg2: String?): COpaquePointer? =
    null

public actual fun strrchr(arg1: String?, arg2: CInt): COpaquePointer? =
    null

public actual fun strspn(arg1: String?, arg2: String?): SizeT =
    0uL

public actual fun strstr(arg1: String?, arg2: String?): COpaquePointer? =
    null

public actual fun strtok(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    null

public actual fun strtokR(arg1: COpaquePointer?, arg2: String?, arg3: COpaquePointer?): COpaquePointer? =
    null

public actual fun strerrorR(arg1: CInt, arg2: COpaquePointer?, arg3: SizeT): CInt =
    0

public actual fun strxfrm(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    0uL

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: SizeT): COpaquePointer? =
    null

public actual fun strdup(arg1: String?): COpaquePointer? =
    null

public actual fun stpcpy(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    null

public actual fun stpncpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): COpaquePointer? =
    null

public actual fun strnlen(arg1: String?, arg2: SizeT): SizeT =
    0uL

public actual fun memmem(arg1: COpaquePointer?, arg2: SizeT, arg3: COpaquePointer?, arg4: SizeT): COpaquePointer? =
    null

public actual fun strcasestr(arg1: String?, arg2: String?): COpaquePointer? =
    null

public actual fun strlcat(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    0uL

public actual fun strlcpy(arg1: COpaquePointer?, arg2: String?, arg3: SizeT): SizeT =
    0uL

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): COpaquePointer? =
    null

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): COpaquePointer? =
    null

public actual fun strndup(arg1: String?, arg2: SizeT): COpaquePointer? =
    null

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    null

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: SizeT): COpaquePointer? =
    null

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    0

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    0

public actual fun strxfrmL(arg1: COpaquePointer?, arg2: String?, arg3: SizeT, arg4: LocaleT): SizeT =
    0uL

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): COpaquePointer? =
    null

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT): CInt =
    0

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: SizeT) {
}

public actual fun bzero(arg1: COpaquePointer?, arg2: SizeT) {
}

public actual fun ffs(arg1: CInt): CInt =
    0

public actual fun popcount(arg1: CUint): CUint =
    0u

public actual fun popcountl(arg1: CUlong): CUint =
    0u

public actual fun popcountll(arg1: CUlonglong): CUint =
    0u

public actual fun popcount32(arg1: UInt): CUint =
    0u

public actual fun popcount64(arg1: ULong): CUint =
    0u

public actual fun rindex(arg1: String?, arg2: CInt): COpaquePointer? =
    null

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    0

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: SizeT): CInt =
    0

public actual fun signal(arg1: CInt, arg2: SighandlerT): SighandlerT =
    0uL

public actual fun raise(arg1: CInt): CInt =
    0

public actual fun asctime(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun clock(): ClockT =
    0u

public actual fun ctime(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun difftime(arg1: TimeT, arg2: TimeT): Double =
    0.0

public actual fun gmtime(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtime(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun time(arg1: COpaquePointer?): TimeT =
    0L

public actual fun mktime(arg1: COpaquePointer?): TimeT =
    0L

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    0uL

public actual fun utime(arg1: String?, arg2: COpaquePointer?): CInt =
    0

public actual fun asctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    null

public actual fun gmtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    null

public actual fun localtimeR(arg1: COpaquePointer?, arg2: COpaquePointer?): COpaquePointer? =
    null

public actual fun stat(arg1: String?, arg2: COpaquePointer?): CInt =
    0

public actual fun lstat(arg1: String?, arg2: COpaquePointer?): CInt =
    0

public actual fun fstat(arg1: CInt, arg2: COpaquePointer?): CInt =
    0

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    0

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    0

public actual fun open(arg1: String?, arg2: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    0

public actual fun close(arg1: CInt): CInt =
    0

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    0

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    0

public actual fun unlink(arg1: String?): CInt =
    0

public actual fun tell(arg1: CInt): CLong =
    0L

public actual fun dup(arg1: CInt): CInt =
    0

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    0

public actual fun access(arg1: String?, arg2: CInt): CInt =
    0

public actual fun rmdir(arg1: String?): CInt =
    0

public actual fun chdir(arg1: String?): CInt =
    0

public actual fun getwd(arg1: COpaquePointer?): COpaquePointer? =
    null

public actual fun getcwd(arg1: COpaquePointer?, arg2: SizeT): COpaquePointer? =
    null

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    0

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    0

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getpid(): PidT =
    0

public actual fun sleep(arg1: CUint): CUint =
    0u

public actual fun usleep(arg1: UsecondsT): CInt =
    0

public actual fun localeconv(): COpaquePointer? =
    null

public actual fun setlocale(arg1: CInt, arg2: String?): COpaquePointer? =
    null

public actual fun duplocale(arg1: LocaleT): LocaleT =
    0uL

public actual fun freelocale(arg1: LocaleT) {
}

public actual fun localeconvL(arg1: LocaleT): COpaquePointer? =
    null

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    0uL

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    null

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    0L
