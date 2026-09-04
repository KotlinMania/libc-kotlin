// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum requires manual FFI bridge — not yet implemented")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha requires manual FFI bridge — not yet implemented")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl requires manual FFI bridge — not yet implemented")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit requires manual FFI bridge — not yet implemented")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph requires manual FFI bridge — not yet implemented")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower requires manual FFI bridge — not yet implemented")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint requires manual FFI bridge — not yet implemented")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct requires manual FFI bridge — not yet implemented")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace requires manual FFI bridge — not yet implemented")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper requires manual FFI bridge — not yet implemented")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit requires manual FFI bridge — not yet implemented")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank requires manual FFI bridge — not yet implemented")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower requires manual FFI bridge — not yet implemented")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper requires manual FFI bridge — not yet implemented")

public actual fun getStdioFile(fileno: CInt): FILE? =
    throw UnsupportedOperationException("getStdioFile requires manual FFI bridge — not yet implemented")

public actual fun clearerr(arg1: FILE?) {
    throw UnsupportedOperationException("clearerr requires manual FFI bridge — not yet implemented")
}

public actual fun fclose(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fclose requires manual FFI bridge — not yet implemented")

public actual fun feof(arg1: FILE?): CInt =
    throw UnsupportedOperationException("feof requires manual FFI bridge — not yet implemented")

public actual fun ferror(arg1: FILE?): CInt =
    throw UnsupportedOperationException("ferror requires manual FFI bridge — not yet implemented")

public actual fun fflush(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fflush requires manual FFI bridge — not yet implemented")

public actual fun fgetc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fgetc requires manual FFI bridge — not yet implemented")

public actual fun fgets(arg1: String?, arg2: CInt, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    throw UnsupportedOperationException("fopen requires manual FFI bridge — not yet implemented")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("fputc requires manual FFI bridge — not yet implemented")

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    throw UnsupportedOperationException("fputs requires manual FFI bridge — not yet implemented")

public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires manual FFI bridge — not yet implemented")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    throw UnsupportedOperationException("fseek requires manual FFI bridge — not yet implemented")

public actual fun ftell(arg1: FILE?): CLong =
    throw UnsupportedOperationException("ftell requires manual FFI bridge — not yet implemented")

public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires manual FFI bridge — not yet implemented")

public actual fun getc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("getc requires manual FFI bridge — not yet implemented")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar requires manual FFI bridge — not yet implemented")

public actual fun perror(arg1: String?) {
    throw UnsupportedOperationException("perror requires manual FFI bridge — not yet implemented")
}

public actual fun printf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putc requires manual FFI bridge — not yet implemented")

public actual fun putchar(arg1: CInt): CInt =
    throw UnsupportedOperationException("putchar requires manual FFI bridge — not yet implemented")

public actual fun puts(arg1: String?): CInt =
    throw UnsupportedOperationException("puts requires manual FFI bridge — not yet implemented")

public actual fun remove(arg1: String?): CInt =
    throw UnsupportedOperationException("remove requires manual FFI bridge — not yet implemented")

public actual fun rewind(arg1: FILE?) {
    throw UnsupportedOperationException("rewind requires manual FFI bridge — not yet implemented")
}

public actual fun scanf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(arg1: FILE?, arg2: String?) {
    throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")
}

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: CInt, arg4: ULong): CInt =
    throw UnsupportedOperationException("setvbuf requires manual FFI bridge — not yet implemented")

public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires manual FFI bridge — not yet implemented")

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("ungetc requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("rename requires manual FFI bridge — not yet implemented")

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

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires manual FFI bridge — not yet implemented")

public actual fun fileno(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fileno requires manual FFI bridge — not yet implemented")

public actual fun flockfile(arg1: FILE?) {
    throw UnsupportedOperationException("flockfile requires manual FFI bridge — not yet implemented")
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    throw UnsupportedOperationException("ftrylockfile requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("getw requires manual FFI bridge — not yet implemented")

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putw requires manual FFI bridge — not yet implemented")

public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko requires manual FFI bridge — not yet implemented")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello requires manual FFI bridge — not yet implemented")

public actual fun abs(arg1: CInt): CInt =
    throw UnsupportedOperationException("abs requires manual FFI bridge — not yet implemented")

public actual fun atoi(arg1: String?): CInt =
    throw UnsupportedOperationException("atoi requires manual FFI bridge — not yet implemented")

public actual fun atol(arg1: String?): CLong =
    throw UnsupportedOperationException("atol requires manual FFI bridge — not yet implemented")

public actual fun itoa(arg1: CInt, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("itoa requires manual FFI bridge — not yet implemented")

public actual fun ltoa(arg1: CLong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ltoa requires manual FFI bridge — not yet implemented")

public actual fun ultoa(arg1: CULong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ultoa requires manual FFI bridge — not yet implemented")

public actual fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires manual FFI bridge — not yet implemented")

public actual fun free(arg1: COpaquePointer?) {
    throw UnsupportedOperationException("free requires manual FFI bridge — not yet implemented")
}

public actual fun getenv(arg1: String?): String? =
    throw UnsupportedOperationException("getenv requires manual FFI bridge — not yet implemented")

public actual fun labs(arg1: CLong): CLong =
    throw UnsupportedOperationException("labs requires manual FFI bridge — not yet implemented")

public actual fun malloc(arg1: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires manual FFI bridge — not yet implemented")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand requires manual FFI bridge — not yet implemented")

public actual fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires manual FFI bridge — not yet implemented")

public actual fun srand(arg1: CUInt) {
    throw UnsupportedOperationException("srand requires manual FFI bridge — not yet implemented")
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    throw UnsupportedOperationException("strtol requires manual FFI bridge — not yet implemented")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun mblen(arg1: String?, arg2: ULong): CInt =
    throw UnsupportedOperationException("mblen requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("lrand48 requires manual FFI bridge — not yet implemented")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("a64l requires manual FFI bridge — not yet implemented")

public actual fun l64a(arg1: CLong): String? =
    throw UnsupportedOperationException("l64a requires manual FFI bridge — not yet implemented")

public actual fun random(): CLong =
    throw UnsupportedOperationException("random requires manual FFI bridge — not yet implemented")

public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate requires manual FFI bridge — not yet implemented")

public actual fun initstate(arg1: CUInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate requires manual FFI bridge — not yet implemented")

public actual fun srandom(arg1: CUInt) {
    throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")
}

public actual fun mkostemp(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires manual FFI bridge — not yet implemented")

public actual fun mkostemps(arg1: String?, arg2: CInt, arg3: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires manual FFI bridge — not yet implemented")

public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires manual FFI bridge — not yet implemented")

public actual fun mkstemp(arg1: String?): CInt =
    throw UnsupportedOperationException("mkstemp requires manual FFI bridge — not yet implemented")

public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp requires manual FFI bridge — not yet implemented")

public actual fun atoll(arg1: String?): CLongLong =
    throw UnsupportedOperationException("atoll requires manual FFI bridge — not yet implemented")

public actual fun llabs(arg1: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs requires manual FFI bridge — not yet implemented")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires manual FFI bridge — not yet implemented")

public actual fun quickExit(arg1: CInt) {
    throw UnsupportedOperationException("quickExit requires manual FFI bridge — not yet implemented")
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    throw UnsupportedOperationException("setenv requires manual FFI bridge — not yet implemented")

public actual fun unsetenv(arg1: String?): CInt =
    throw UnsupportedOperationException("unsetenv requires manual FFI bridge — not yet implemented")

public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    throw UnsupportedOperationException("dehumanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("getenvR requires manual FFI bridge — not yet implemented")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    throw UnsupportedOperationException("radixsort requires manual FFI bridge — not yet implemented")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    throw UnsupportedOperationException("sradixsort requires manual FFI bridge — not yet implemented")

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

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires manual FFI bridge — not yet implemented")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    throw UnsupportedOperationException("memcmp requires manual FFI bridge — not yet implemented")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires manual FFI bridge — not yet implemented")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires manual FFI bridge — not yet implemented")

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires manual FFI bridge — not yet implemented")

public actual fun strcat(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcat requires manual FFI bridge — not yet implemented")

public actual fun strchr(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("strchr requires manual FFI bridge — not yet implemented")

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcmp requires manual FFI bridge — not yet implemented")

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcoll requires manual FFI bridge — not yet implemented")

public actual fun strcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcpy requires manual FFI bridge — not yet implemented")

public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strcspn requires manual FFI bridge — not yet implemented")

public actual fun strerror(arg1: CInt): String? =
    throw UnsupportedOperationException("strerror requires manual FFI bridge — not yet implemented")

public actual fun strlen(arg1: String?): ULong =
    throw UnsupportedOperationException("strlen requires manual FFI bridge — not yet implemented")

public actual fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncat requires manual FFI bridge — not yet implemented")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strncmp requires manual FFI bridge — not yet implemented")

public actual fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncpy requires manual FFI bridge — not yet implemented")

public actual fun strpbrk(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strpbrk requires manual FFI bridge — not yet implemented")

public actual fun strrchr(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("strrchr requires manual FFI bridge — not yet implemented")

public actual fun strspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strspn requires manual FFI bridge — not yet implemented")

public actual fun strstr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strstr requires manual FFI bridge — not yet implemented")

public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok requires manual FFI bridge — not yet implemented")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(arg1: CInt, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strerrorR requires manual FFI bridge — not yet implemented")

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires manual FFI bridge — not yet implemented")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires manual FFI bridge — not yet implemented")

public actual fun strdup(arg1: String?): String? =
    throw UnsupportedOperationException("strdup requires manual FFI bridge — not yet implemented")

public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy requires manual FFI bridge — not yet implemented")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires manual FFI bridge — not yet implemented")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires manual FFI bridge — not yet implemented")

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires manual FFI bridge — not yet implemented")

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcat requires manual FFI bridge — not yet implemented")

public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcpy requires manual FFI bridge — not yet implemented")

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
    throw UnsupportedOperationException("bcmp requires manual FFI bridge — not yet implemented")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong) {
    throw UnsupportedOperationException("bcopy requires manual FFI bridge — not yet implemented")
}

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong) {
    throw UnsupportedOperationException("bzero requires manual FFI bridge — not yet implemented")
}

public actual fun ffs(arg1: CInt): CInt =
    throw UnsupportedOperationException("ffs requires manual FFI bridge — not yet implemented")

public actual fun rindex(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("rindex requires manual FFI bridge — not yet implemented")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp requires manual FFI bridge — not yet implemented")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp requires manual FFI bridge — not yet implemented")

public actual fun raise(arg1: CInt): CInt =
    throw UnsupportedOperationException("raise requires manual FFI bridge — not yet implemented")

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

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("chmod requires manual FFI bridge — not yet implemented")

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("mkdir requires manual FFI bridge — not yet implemented")

public actual fun open(arg1: String?, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("creat requires manual FFI bridge — not yet implemented")

public actual fun close(arg1: CInt): CInt =
    throw UnsupportedOperationException("close requires manual FFI bridge — not yet implemented")

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("read requires manual FFI bridge — not yet implemented")

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("write requires manual FFI bridge — not yet implemented")

public actual fun unlink(arg1: String?): CInt =
    throw UnsupportedOperationException("unlink requires manual FFI bridge — not yet implemented")

public actual fun tell(arg1: CInt): CLong =
    throw UnsupportedOperationException("tell requires manual FFI bridge — not yet implemented")

public actual fun dup(arg1: CInt): CInt =
    throw UnsupportedOperationException("dup requires manual FFI bridge — not yet implemented")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    throw UnsupportedOperationException("dup2 requires manual FFI bridge — not yet implemented")

public actual fun access(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("access requires manual FFI bridge — not yet implemented")

public actual fun rmdir(arg1: String?): CInt =
    throw UnsupportedOperationException("rmdir requires manual FFI bridge — not yet implemented")

public actual fun chdir(arg1: String?): CInt =
    throw UnsupportedOperationException("chdir requires manual FFI bridge — not yet implemented")

public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd requires manual FFI bridge — not yet implemented")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd requires manual FFI bridge — not yet implemented")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getsubopt requires manual FFI bridge — not yet implemented")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid requires manual FFI bridge — not yet implemented")

public actual fun usleep(arg1: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep requires manual FFI bridge — not yet implemented")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun setlocale(arg1: CInt, arg2: String?): String? =
    throw UnsupportedOperationException("setlocale requires manual FFI bridge — not yet implemented")

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

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires manual FFI bridge — not yet implemented")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    throw UnsupportedOperationException("lseek requires manual FFI bridge — not yet implemented")

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
