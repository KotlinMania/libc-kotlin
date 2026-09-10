// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toLong
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.CPointer
import libc.cinterop.libc_aligned_alloc
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_chmod
import libc.cinterop.libc_creat
import libc.cinterop.libc_fdopen
import libc.cinterop.libc_fopen
import libc.cinterop.libc_freopen
import libc.cinterop.libc_getenv
import libc.cinterop.libc_llabs
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memalign
import libc.cinterop.libc_memccpy
import libc.cinterop.libc_memchr
import libc.cinterop.libc_memcpy
import libc.cinterop.libc_memmem
import libc.cinterop.libc_memmove
import libc.cinterop.libc_memset
import libc.cinterop.libc_read
import libc.cinterop.libc_realloc
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_strcat
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strdup
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strerror_r
import libc.cinterop.libc_strncat
import libc.cinterop.libc_strncpy
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strstr
import libc.cinterop.libc_tmpfile

public actual fun isalnum(c: CInt): CInt = libc.cinterop.libc_isalnum(c)
public actual fun isalpha(c: CInt): CInt = libc.cinterop.libc_isalpha(c)
public actual fun iscntrl(c: CInt): CInt = libc.cinterop.libc_iscntrl(c)
public actual fun isdigit(c: CInt): CInt = libc.cinterop.libc_isdigit(c)
public actual fun isgraph(c: CInt): CInt = libc.cinterop.libc_isgraph(c)
public actual fun islower(c: CInt): CInt = libc.cinterop.libc_islower(c)
public actual fun isprint(c: CInt): CInt = libc.cinterop.libc_isprint(c)
public actual fun ispunct(c: CInt): CInt = libc.cinterop.libc_ispunct(c)
public actual fun isspace(c: CInt): CInt = libc.cinterop.libc_isspace(c)
public actual fun isupper(c: CInt): CInt = libc.cinterop.libc_isupper(c)
public actual fun isxdigit(c: CInt): CInt = libc.cinterop.libc_isxdigit(c)
public actual fun isblank(c: CInt): CInt = libc.cinterop.libc_isblank(c)
public actual fun tolower(c: CInt): CInt = libc.cinterop.libc_tolower(c)
public actual fun toupper(c: CInt): CInt = libc.cinterop.libc_toupper(c)
public actual fun getStdioFile(fileno: CInt): FILE? =
    throw UnsupportedOperationException("getStdioFile requires manual FFI bridge — not yet implemented")

public actual fun clearerr(arg1: FILE?) {
    throw UnsupportedOperationException("clearerr requires manual FFI bridge — not yet implemented")
}

public actual fun fclose(arg1: FILE?): CInt =
    libc.cinterop.libc_fclose(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun feof(arg1: FILE?): CInt =
    libc.cinterop.libc_feof(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun ferror(arg1: FILE?): CInt =
    libc.cinterop.libc_ferror(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fflush(arg1: FILE?): CInt =
    libc.cinterop.libc_fflush(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgetc(arg1: FILE?): CInt =
    libc.cinterop.libc_fgetc(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fgets(arg1: String?, arg2: CInt, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fopen(filename: String?, mode: String?): FILE? {
    val result = libc_fopen(filename, mode)
    return if (result != null) FILE(result.toLong()) else null
}
public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    libc.cinterop.libc_fputc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    libc.cinterop.libc_fputs(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? {
    if (file == null) return null
    val filePtr: CPointer<ByteVar>? = file.handle.toCPointer()
    val result = libc_freopen(filename, mode, filePtr)
    return if (result != null) FILE(result.toLong()) else null
}
public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    libc.cinterop.libc_fseek(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3)
public actual fun ftell(arg1: FILE?): CLong =
    libc.cinterop.libc_ftell(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    libc.cinterop.libc_fwrite(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3, arg4?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getc(arg1: FILE?): CInt =
    libc.cinterop.libc_getc(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun getchar(): CInt = libc.cinterop.libc_getchar()
public actual fun perror(arg1: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun printf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    libc.cinterop.libc_putc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun putchar(arg1: CInt): CInt = libc.cinterop.libc_putchar(arg1)
public actual fun puts(arg1: String?): CInt =
    libc.cinterop.libc_puts(arg1)
public actual fun remove(arg1: String?): CInt =
    libc.cinterop.libc_remove(arg1)
public actual fun rewind(arg1: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun scanf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(arg1: FILE?, arg2: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: CInt, arg4: ULong): CInt =
    libc.cinterop.libc_setvbuf(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3, arg4)
public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? {
    val result = libc_tmpfile()
    return if (result != null) FILE(result.toLong()) else null
}
public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    libc.cinterop.libc_ungetc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfprintf requires manual FFI bridge — not yet implemented")

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("vprintf requires manual FFI bridge — not yet implemented")

public actual fun gets(arg1: String?): String? =
    throw UnsupportedOperationException("gets requires manual FFI bridge — not yet implemented")

public actual fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun tmpnam(arg1: String?): String? =
    throw UnsupportedOperationException("tmpnam requires manual FFI bridge — not yet implemented")

public actual fun vsprintf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsprintf requires manual FFI bridge — not yet implemented")

public actual fun rename(arg1: String?, arg2: String?): CInt =
    libc.cinterop.libc_rename(arg1, arg2)
public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("asiprintf requires manual FFI bridge — not yet implemented")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fiprintf requires manual FFI bridge — not yet implemented")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fiscanf requires manual FFI bridge — not yet implemented")

public actual fun iprintf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("iprintf requires manual FFI bridge — not yet implemented")

public actual fun iscanf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("iscanf requires manual FFI bridge — not yet implemented")

public actual fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("siprintf requires manual FFI bridge — not yet implemented")

public actual fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("siscanf requires manual FFI bridge — not yet implemented")

public actual fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sniprintf requires manual FFI bridge — not yet implemented")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vasiprintf requires manual FFI bridge — not yet implemented")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfiprintf requires manual FFI bridge — not yet implemented")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfiscanf requires manual FFI bridge — not yet implemented")

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("viprintf requires manual FFI bridge — not yet implemented")

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("viscanf requires manual FFI bridge — not yet implemented")

public actual fun vsiprintf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsiprintf requires manual FFI bridge — not yet implemented")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsiscanf requires manual FFI bridge — not yet implemented")

public actual fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("vsniprintf requires manual FFI bridge — not yet implemented")

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vdiprintf requires manual FFI bridge — not yet implemented")

public actual fun diprintf(arg1: CInt, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("diprintf requires manual FFI bridge — not yet implemented")

public actual fun fgetpos(arg1: FILE?, arg2: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(arg1: FILE?, arg2: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun fdopen(fd: CInt, mode: String?): FILE? {
    val result = libc_fdopen(fd, mode)
    return if (result != null) FILE(result.toLong()) else null
}
public actual fun fileno(arg1: FILE?): CInt =
    libc.cinterop.libc_fileno(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun flockfile(arg1: FILE?) {
    throw UnsupportedOperationException("flockfile requires manual FFI bridge — not yet implemented")
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    libc.cinterop.libc_ftrylockfile(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun funlockfile(arg1: FILE?) {
    throw UnsupportedOperationException("funlockfile requires manual FFI bridge — not yet implemented")
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    throw UnsupportedOperationException("getcUnlocked requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putcUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf requires manual FFI bridge — not yet implemented")

public actual fun getw(arg1: FILE?): CInt =
    libc.cinterop.libc_getw(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    libc.cinterop.libc_putw(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)
public actual fun ftello(stream: FILE?): OffT =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun abs(arg1: CInt): CInt =
    libc.cinterop.libc_abs(arg1)
public actual fun atoi(arg1: String?): CInt =
    libc.cinterop.libc_atoi(arg1)
public actual fun atol(arg1: String?): CLong =
    libc.cinterop.libc_atol(arg1)
public actual fun itoa(arg1: CInt, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("itoa requires manual FFI bridge — not yet implemented")

public actual fun ltoa(arg1: CLong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ltoa requires manual FFI bridge — not yet implemented")

public actual fun ultoa(arg1: CULong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ultoa requires manual FFI bridge — not yet implemented")

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? {
    val result = libc_calloc(nobj, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun free(arg1: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun getenv(s: String?): String? {
    val result = libc_getenv(s)
    return result?.toKString()
}
public actual fun labs(arg1: CLong): CLong =
    libc.cinterop.libc_labs(arg1)
public actual fun malloc(size: ULong): COpaquePointer? {
    val result = libc_malloc(size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun rand(): CInt =
    libc.cinterop.libc_rand()
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    if (p == null) return null
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    val result = libc_realloc(pPtr, size)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun srand(arg1: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    libc.cinterop.libc_strtol(arg1, arg2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg3)
public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun mblen(arg1: String?, arg2: ULong): CInt =
    libc.cinterop.libc_mblen(arg1, arg2)
public actual fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("mbstowcs requires manual FFI bridge — not yet implemented")

public actual fun wctomb(arg1: String?, arg2: WcharT): CInt =
    throw UnsupportedOperationException("wctomb requires manual FFI bridge — not yet implemented")

public actual fun mbtowc(arg1: WcharT?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("mbtowc requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(arg1: String?, arg2: WcharT?, arg3: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun randR(arg1: CUInt?): CInt =
    throw UnsupportedOperationException("randR requires manual FFI bridge — not yet implemented")

public actual fun jrand48(arg1: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(arg1: CUShort?) {
    throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")
}

public actual fun lrand48(): CLong =
    libc.cinterop.libc_lrand48()
public actual fun mrand48(): CLong =
    libc.cinterop.libc_mrand48()
public actual fun nrand48(arg1: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun seed48(arg1: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(arg1: CLong) {
    throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")
}

public actual fun putenv(arg1: String?): CInt =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun a64l(arg1: String?): CLong =
    libc.cinterop.libc_a64l(arg1)
public actual fun l64a(arg1: CLong): String? =
    throw UnsupportedOperationException("l64a requires manual FFI bridge — not yet implemented")

public actual fun random(): CLong =
    libc.cinterop.libc_random()
public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate requires manual FFI bridge — not yet implemented")

public actual fun initstate(arg1: CUInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate requires manual FFI bridge — not yet implemented")

public actual fun srandom(arg1: CUInt) {
    throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")
}

public actual fun mkostemp(arg1: String?, arg2: CInt): CInt =
    libc.cinterop.libc_mkostemp(arg1, arg2)
public actual fun mkostemps(arg1: String?, arg2: CInt, arg3: CInt): CInt =
    libc.cinterop.libc_mkostemps(arg1, arg2, arg3)
public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires manual FFI bridge — not yet implemented")

public actual fun mkstemp(arg1: String?): CInt =
    libc.cinterop.libc_mkstemp(arg1)
public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp requires manual FFI bridge — not yet implemented")

public actual fun atoll(s: String?): CLongLong {
    val result = libc_atoll(s)
    return result
}
public actual fun llabs(a: CLongLong): CLongLong {
    val result = libc_llabs(a)
    return result
}
public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(align: ULong, len: ULong): COpaquePointer? {
    val result = libc_aligned_alloc(align, len)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun quickExit(arg1: CInt) {
    throw UnsupportedOperationException("quickExit requires manual FFI bridge — not yet implemented")
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    libc.cinterop.libc_setenv(arg1, arg2, arg3)
public actual fun unsetenv(arg1: String?): CInt =
    libc.cinterop.libc_unsetenv(arg1)
public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    throw UnsupportedOperationException("dehumanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("getenvR requires manual FFI bridge — not yet implemented")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    libc.cinterop.libc_radixsort(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg4)
public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    libc.cinterop.libc_sradixsort(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg4)
public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(arg1: String?) {
    throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")
}

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong): CLongLong =
    throw UnsupportedOperationException("strsuftoll requires manual FFI bridge — not yet implemented")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong, arg5: String?, arg6: ULong): CLongLong =
    throw UnsupportedOperationException("strsuftollx requires manual FFI bridge — not yet implemented")

public actual fun l64aR(arg1: CLong, arg2: String?, arg3: CInt): CInt =
    throw UnsupportedOperationException("l64aR requires manual FFI bridge — not yet implemented")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    throw UnsupportedOperationException("strtolL requires manual FFI bridge — not yet implemented")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULong =
    throw UnsupportedOperationException("strtoulL requires manual FFI bridge — not yet implemented")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLongLong =
    throw UnsupportedOperationException("strtollL requires manual FFI bridge — not yet implemented")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULongLong =
    throw UnsupportedOperationException("strtoullL requires manual FFI bridge — not yet implemented")

public actual fun mbCurMaxL(arg1: LocaleT): ULong =
    throw UnsupportedOperationException("mbCurMaxL requires manual FFI bridge — not yet implemented")

public actual fun mblenL(arg1: String?, arg2: ULong, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("mblenL requires manual FFI bridge — not yet implemented")

public actual fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("mbstowcsL requires manual FFI bridge — not yet implemented")

public actual fun wctombL(arg1: String?, arg2: WcharT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("wctombL requires manual FFI bridge — not yet implemented")

public actual fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): CInt =
    throw UnsupportedOperationException("mbtowcL requires manual FFI bridge — not yet implemented")

public actual fun wcstombsL(arg1: String?, arg2: WcharT?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("wcstombsL requires manual FFI bridge — not yet implemented")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (cx == null) return null
    val cxPtr: CPointer<ByteVar>? = cx.value.toCPointer()
    val result = libc_memchr(cxPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    libc.cinterop.libc_memcmp(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg3)
public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memcpy(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    if (src == null) return null
    val srcPtr: CPointer<ByteVar>? = src.value.toCPointer()
    val result = libc_memmove(destPtr, srcPtr, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? {
    if (dest == null) return null
    val destPtr: CPointer<ByteVar>? = dest.value.toCPointer()
    val result = libc_memset(destPtr, c, n)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun strcat(s: String?, ct: String?): String? {
    val result = libc_strcat(s, ct)
    return result?.toKString()
}
public actual fun strchr(s: String?, c: CInt): String? {
    val result = libc_strchr(s, c)
    return result?.toKString()
}
public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    libc.cinterop.libc_strcmp(arg1, arg2)
public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    libc.cinterop.libc_strcoll(arg1, arg2)
public actual fun strcpy(dst: String?, src: String?): String? {
    val result = libc_strcpy(dst, src)
    return result?.toKString()
}
public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    libc.cinterop.libc_strcspn(arg1, arg2)
public actual fun strerror(e: CInt): String? {
    val result = libc_strerror(e)
    return result?.toKString()
}
public actual fun strlen(arg1: String?): ULong =
    libc.cinterop.libc_strlen(arg1)
public actual fun strncat(s: String?, ct: String?, n: ULong): String? {
    val result = libc_strncat(s, ct, n)
    return result?.toKString()
}
public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    libc.cinterop.libc_strncmp(arg1, arg2, arg3)
public actual fun strncpy(dst: String?, src: String?, n: ULong): String? {
    val result = libc_strncpy(dst, src, n)
    return result?.toKString()
}
public actual fun strpbrk(cs: String?, ct: String?): String? {
    val result = libc_strpbrk(cs, ct)
    return result?.toKString()
}
public actual fun strrchr(s: String?, c: CInt): String? {
    val result = libc_strrchr(s, c)
    return result?.toKString()
}
public actual fun strspn(arg1: String?, arg2: String?): ULong =
    libc.cinterop.libc_strspn(arg1, arg2)
public actual fun strstr(h: String?, n: String?): String? {
    val result = libc_strstr(h, n)
    return result?.toKString()
}
public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt {
    val result = libc_strerror_r(errnum, buf, buflen)
    return result
}

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    libc.cinterop.libc_strxfrm(arg1, arg2, arg3)
public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: ULong): COpaquePointer? {
    if (arg1 == null) return null
    val arg1Ptr: CPointer<ByteVar>? = arg1.value.toCPointer()
    if (arg2 == null) return null
    val arg2Ptr: CPointer<ByteVar>? = arg2.value.toCPointer()
    val result = libc_memccpy(arg1Ptr, arg2Ptr, arg3, arg4)
    return if (result != null) COpaquePointer(result.toLong()) else null
}
public actual fun strdup(cs: String?): String? {
    val result = libc_strdup(cs)
    return result?.toKString()
}
public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy requires manual FFI bridge — not yet implemented")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires manual FFI bridge — not yet implemented")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    libc.cinterop.libc_strnlen(arg1, arg2)
public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? {
    if (arg1 == null) return null
    val arg1Ptr: CPointer<ByteVar>? = arg1.value.toCPointer()
    if (arg3 == null) return null
    val arg3Ptr: CPointer<ByteVar>? = arg3.value.toCPointer()
    val result = libc_memmem(arg1Ptr, arg2, arg3Ptr, arg4)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    libc.cinterop.libc_strlcat(arg1, arg2, arg3)
public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    libc.cinterop.libc_strlcpy(arg1, arg2, arg3)
public actual fun strsep(arg1: COpaquePointer?, arg2: String?): String? =
    throw UnsupportedOperationException("strsep requires manual FFI bridge — not yet implemented")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("stresep requires manual FFI bridge — not yet implemented")

public actual fun strndup(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("strndup requires manual FFI bridge — not yet implemented")

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("explicitMemset requires manual FFI bridge — not yet implemented")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    throw UnsupportedOperationException("consttimeMemequal requires manual FFI bridge — not yet implemented")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("strcollL requires manual FFI bridge — not yet implemented")

public actual fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("strxfrmL requires manual FFI bridge — not yet implemented")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): String? =
    throw UnsupportedOperationException("strerrorL requires manual FFI bridge — not yet implemented")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    libc.cinterop.libc_bcmp(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg3)
public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong) {
    throw UnsupportedOperationException("bcopy requires manual FFI bridge — not yet implemented")
}

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong) {
    throw UnsupportedOperationException("bzero requires manual FFI bridge — not yet implemented")
}

public actual fun ffs(arg1: CInt): CInt =
    libc.cinterop.libc_ffs(arg1)
public actual fun rindex(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("rindex requires manual FFI bridge — not yet implemented")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    libc.cinterop.libc_strcasecmp(arg1, arg2)
public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    libc.cinterop.libc_strncasecmp(arg1, arg2, arg3)
public actual fun raise(arg1: CInt): CInt = libc.cinterop.libc_raise(arg1)
public actual fun asctime(arg1: Tm?): String? =
    throw UnsupportedOperationException("asctime requires manual FFI bridge — not yet implemented")

public actual fun ctime(arg1: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun gmtime(arg1: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(arg1: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun time(arg1: TimeT?): TimeT =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun mktime(arg1: Tm?): TimeT =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun utime(arg1: String?, arg2: TimeT?): CInt =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(arg1: Tm?, arg2: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(arg1: TimeT?, arg2: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(arg1: TimeT?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(arg1: TimeT?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun stat(arg1: String?, arg2: Stat?): CInt =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun lstat(arg1: String?, arg2: Stat?): CInt =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fstat(arg1: CInt, arg2: Stat?): CInt =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun chmod(path: String?, mode: ModeT): CInt {
    val result = libc_chmod(path, mode.toInt())
    return result
}
public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    libc.cinterop.libc_mkdir(arg1, arg2.toInt())
public actual fun open(arg1: String?, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(path: String?, mode: ModeT): CInt {
    val result = libc_creat(path, mode.toInt())
    return result
}
public actual fun close(arg1: CInt): CInt = libc.cinterop.libc_close(arg1)
public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt {
    if (arg2 == null) return -1
    val arg2Ptr: CPointer<ByteVar>? = arg2.value.toCPointer()
    val result = libc_read(arg1, arg2Ptr, arg3)
    return result
}
public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")
public actual fun unlink(arg1: String?): CInt =
    libc.cinterop.libc_unlink(arg1)
public actual fun tell(arg1: CInt): CLong =
    throw UnsupportedOperationException("tell requires manual FFI bridge — not yet implemented")

public actual fun dup(arg1: CInt): CInt = libc.cinterop.libc_dup(arg1)
public actual fun dup2(arg1: CInt, arg2: CInt): CInt = libc.cinterop.libc_dup2(arg1, arg2)
public actual fun access(arg1: String?, arg2: CInt): CInt =
    libc.cinterop.libc_access(arg1, arg2)
public actual fun rmdir(arg1: String?): CInt =
    libc.cinterop.libc_rmdir(arg1)
public actual fun chdir(arg1: String?): CInt =
    libc.cinterop.libc_chdir(arg1)
public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd requires manual FFI bridge — not yet implemented")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    libc.cinterop.libc_getsubopt(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
public actual fun fcntl(arg1: CInt, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun getpid(): PidT =
    libc.cinterop.libc_getpid()
public actual fun usleep(arg1: UsecondsT): CInt =
    libc.cinterop.libc_usleep(arg1)
public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun setlocale(cat: CInt, name: String?): String? {
    val result = libc_setlocale(cat, name)
    return result?.toKString()
}
public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(arg1: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun localeconvL(arg1: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer? {
    val result = libc_memalign(blockSize, sizeArg)
    return if (result != null) COpaquePointer(result.toLong()) else null
}

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    libc.cinterop.libc_lseek(arg1, arg2, arg3)
public actual fun atexit(arg1: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")
}

public actual fun atQuickExit(arg1: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atQuickExit requires manual FFI bridge — not yet implemented")

public actual fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt =
    throw UnsupportedOperationException("heapsort requires manual FFI bridge — not yet implemented")

public actual fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt =
    throw UnsupportedOperationException("mergesort requires manual FFI bridge — not yet implemented")
