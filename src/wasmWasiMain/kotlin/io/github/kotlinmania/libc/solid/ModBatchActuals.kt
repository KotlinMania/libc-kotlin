// port-lint: source Mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on WASI — no C library access")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on WASI — no C library access")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on WASI — no C library access")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on WASI — no C library access")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on WASI — no C library access")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on WASI — no C library access")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on WASI — no C library access")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on WASI — no C library access")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on WASI — no C library access")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on WASI — no C library access")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on WASI — no C library access")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on WASI — no C library access")

public actual fun tolower(c: CInt): CInt =
    throw UnsupportedOperationException("tolower not available on WASI — no C library access")

public actual fun toupper(c: CInt): CInt =
    throw UnsupportedOperationException("toupper not available on WASI — no C library access")

public actual fun getStdioFile(fileno: CInt): FILE? =
    throw UnsupportedOperationException("getStdioFile not available on WASI — no C library access")

public actual fun clearerr(arg1: FILE?) {
    throw UnsupportedOperationException("clearerr not available on WASI — no C library access")
}

public actual fun fclose(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fclose not available on WASI — no C library access")

public actual fun feof(arg1: FILE?): CInt =
    throw UnsupportedOperationException("feof not available on WASI — no C library access")

public actual fun ferror(arg1: FILE?): CInt =
    throw UnsupportedOperationException("ferror not available on WASI — no C library access")

public actual fun fflush(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fflush not available on WASI — no C library access")

public actual fun fgetc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fgetc not available on WASI — no C library access")

public actual fun fgets(arg1: String?, arg2: CInt, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on WASI — no C library access")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on WASI — no C library access")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fprintf not available on WASI — no C library access")

public actual fun fputc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("fputc not available on WASI — no C library access")

public actual fun fputs(arg1: String?, arg2: FILE?): CInt =
    throw UnsupportedOperationException("fputs not available on WASI — no C library access")

public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on WASI — no C library access")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on WASI — no C library access")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fscanf not available on WASI — no C library access")

public actual fun fseek(arg1: FILE?, arg2: CLong, arg3: CInt): CInt =
    throw UnsupportedOperationException("fseek not available on WASI — no C library access")

public actual fun ftell(arg1: FILE?): CLong =
    throw UnsupportedOperationException("ftell not available on WASI — no C library access")

public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on WASI — no C library access")

public actual fun getc(arg1: FILE?): CInt =
    throw UnsupportedOperationException("getc not available on WASI — no C library access")

public actual fun getchar(): CInt =
    throw UnsupportedOperationException("getchar not available on WASI — no C library access")

public actual fun perror(arg1: String?) {
    throw UnsupportedOperationException("perror not available on WASI — no C library access")
}

public actual fun printf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("printf not available on WASI — no C library access")

public actual fun putc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putc not available on WASI — no C library access")

public actual fun putchar(arg1: CInt): CInt =
    throw UnsupportedOperationException("putchar not available on WASI — no C library access")

public actual fun puts(arg1: String?): CInt =
    throw UnsupportedOperationException("puts not available on WASI — no C library access")

public actual fun remove(arg1: String?): CInt =
    throw UnsupportedOperationException("remove not available on WASI — no C library access")

public actual fun rewind(arg1: FILE?) {
    throw UnsupportedOperationException("rewind not available on WASI — no C library access")
}

public actual fun scanf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("scanf not available on WASI — no C library access")

public actual fun setbuf(arg1: FILE?, arg2: String?) {
    throw UnsupportedOperationException("setbuf not available on WASI — no C library access")
}

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: CInt, arg4: ULong): CInt =
    throw UnsupportedOperationException("setvbuf not available on WASI — no C library access")

public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sscanf not available on WASI — no C library access")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on WASI — no C library access")

public actual fun ungetc(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("ungetc not available on WASI — no C library access")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfprintf not available on WASI — no C library access")

public actual fun vprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("vprintf not available on WASI — no C library access")

public actual fun gets(arg1: String?): String? =
    throw UnsupportedOperationException("gets not available on WASI — no C library access")

public actual fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sprintf not available on WASI — no C library access")

public actual fun tmpnam(arg1: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on WASI — no C library access")

public actual fun vsprintf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsprintf not available on WASI — no C library access")

public actual fun rename(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("rename not available on WASI — no C library access")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("asiprintf not available on WASI — no C library access")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fiprintf not available on WASI — no C library access")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fiscanf not available on WASI — no C library access")

public actual fun iprintf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("iprintf not available on WASI — no C library access")

public actual fun iscanf(arg1: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("iscanf not available on WASI — no C library access")

public actual fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("siprintf not available on WASI — no C library access")

public actual fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("siscanf not available on WASI — no C library access")

public actual fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("sniprintf not available on WASI — no C library access")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vasiprintf not available on WASI — no C library access")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfiprintf not available on WASI — no C library access")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vfiscanf not available on WASI — no C library access")

public actual fun viprintf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("viprintf not available on WASI — no C library access")

public actual fun viscanf(arg1: String?, arg2: VaList): CInt =
    throw UnsupportedOperationException("viscanf not available on WASI — no C library access")

public actual fun vsiprintf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsiprintf not available on WASI — no C library access")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vsiscanf not available on WASI — no C library access")

public actual fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("vsniprintf not available on WASI — no C library access")

public actual fun vdiprintf(arg1: CInt, arg2: String?, arg3: VaList): CInt =
    throw UnsupportedOperationException("vdiprintf not available on WASI — no C library access")

public actual fun diprintf(arg1: CInt, arg2: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("diprintf not available on WASI — no C library access")

public actual fun fgetpos(arg1: FILE?, arg2: FposT?): CInt =
    throw UnsupportedOperationException("fgetpos not available on WASI — no C library access")

public actual fun fsetpos(arg1: FILE?, arg2: FposT?): CInt =
    throw UnsupportedOperationException("fsetpos not available on WASI — no C library access")

public actual fun fdopen(arg1: CInt, arg2: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on WASI — no C library access")

public actual fun fileno(arg1: FILE?): CInt =
    throw UnsupportedOperationException("fileno not available on WASI — no C library access")

public actual fun flockfile(arg1: FILE?) {
    throw UnsupportedOperationException("flockfile not available on WASI — no C library access")
}

public actual fun ftrylockfile(arg1: FILE?): CInt =
    throw UnsupportedOperationException("ftrylockfile not available on WASI — no C library access")

public actual fun funlockfile(arg1: FILE?) {
    throw UnsupportedOperationException("funlockfile not available on WASI — no C library access")
}

public actual fun getcUnlocked(arg1: FILE?): CInt =
    throw UnsupportedOperationException("getcUnlocked not available on WASI — no C library access")

public actual fun getcharUnlocked(): CInt =
    throw UnsupportedOperationException("getcharUnlocked not available on WASI — no C library access")

public actual fun putcUnlocked(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putcUnlocked not available on WASI — no C library access")

public actual fun putcharUnlocked(arg1: CInt): CInt =
    throw UnsupportedOperationException("putcharUnlocked not available on WASI — no C library access")

public actual fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("snprintf not available on WASI — no C library access")

public actual fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: VaList): CInt =
    throw UnsupportedOperationException("vsnprintf not available on WASI — no C library access")

public actual fun getw(arg1: FILE?): CInt =
    throw UnsupportedOperationException("getw not available on WASI — no C library access")

public actual fun putw(arg1: CInt, arg2: FILE?): CInt =
    throw UnsupportedOperationException("putw not available on WASI — no C library access")

public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam not available on WASI — no C library access")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    throw UnsupportedOperationException("fseeko not available on WASI — no C library access")

public actual fun ftello(stream: FILE?): OffT =
    throw UnsupportedOperationException("ftello not available on WASI — no C library access")

public actual fun abs(arg1: CInt): CInt =
    throw UnsupportedOperationException("abs not available on WASI — no C library access")

public actual fun atoi(arg1: String?): CInt =
    throw UnsupportedOperationException("atoi not available on WASI — no C library access")

public actual fun atol(arg1: String?): CLong =
    throw UnsupportedOperationException("atol not available on WASI — no C library access")

public actual fun itoa(arg1: CInt, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("itoa not available on WASI — no C library access")

public actual fun ltoa(arg1: CLong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ltoa not available on WASI — no C library access")

public actual fun ultoa(arg1: CULong, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("ultoa not available on WASI — no C library access")

public actual fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on WASI — no C library access")

public actual fun free(arg1: COpaquePointer?) {
    throw UnsupportedOperationException("free not available on WASI — no C library access")
}

public actual fun getenv(arg1: String?): String? =
    throw UnsupportedOperationException("getenv not available on WASI — no C library access")

public actual fun labs(arg1: CLong): CLong =
    throw UnsupportedOperationException("labs not available on WASI — no C library access")

public actual fun malloc(arg1: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on WASI — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on WASI — no C library access")

public actual fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on WASI — no C library access")

public actual fun srand(arg1: CUInt) {
    throw UnsupportedOperationException("srand not available on WASI — no C library access")
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLong =
    throw UnsupportedOperationException("strtol not available on WASI — no C library access")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULong =
    throw UnsupportedOperationException("strtoul not available on WASI — no C library access")

public actual fun mblen(arg1: String?, arg2: ULong): CInt =
    throw UnsupportedOperationException("mblen not available on WASI — no C library access")

public actual fun mbstowcs(arg1: WcharT?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("mbstowcs not available on WASI — no C library access")

public actual fun wctomb(arg1: String?, arg2: WcharT): CInt =
    throw UnsupportedOperationException("wctomb not available on WASI — no C library access")

public actual fun mbtowc(arg1: WcharT?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("mbtowc not available on WASI — no C library access")

public actual fun wcstombs(arg1: String?, arg2: WcharT?, arg3: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on WASI — no C library access")

public actual fun randR(arg1: CUInt?): CInt =
    throw UnsupportedOperationException("randR not available on WASI — no C library access")

public actual fun jrand48(arg1: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 not available on WASI — no C library access")

public actual fun lcong48(arg1: CUShort?) {
    throw UnsupportedOperationException("lcong48 not available on WASI — no C library access")
}

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 not available on WASI — no C library access")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 not available on WASI — no C library access")

public actual fun nrand48(arg1: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 not available on WASI — no C library access")

public actual fun seed48(arg1: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 not available on WASI — no C library access")

public actual fun srand48(arg1: CLong) {
    throw UnsupportedOperationException("srand48 not available on WASI — no C library access")
}

public actual fun putenv(arg1: String?): CInt =
    throw UnsupportedOperationException("putenv not available on WASI — no C library access")

public actual fun a64l(arg1: String?): CLong =
    throw UnsupportedOperationException("a64l not available on WASI — no C library access")

public actual fun l64a(arg1: CLong): String? =
    throw UnsupportedOperationException("l64a not available on WASI — no C library access")

public actual fun random(): CLong =
    throw UnsupportedOperationException("random not available on WASI — no C library access")

public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate not available on WASI — no C library access")

public actual fun initstate(arg1: CUInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate not available on WASI — no C library access")

public actual fun srandom(arg1: CUInt) {
    throw UnsupportedOperationException("srandom not available on WASI — no C library access")
}

public actual fun mkostemp(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("mkostemp not available on WASI — no C library access")

public actual fun mkostemps(arg1: String?, arg2: CInt, arg3: CInt): CInt =
    throw UnsupportedOperationException("mkostemps not available on WASI — no C library access")

public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on WASI — no C library access")

public actual fun mkstemp(arg1: String?): CInt =
    throw UnsupportedOperationException("mkstemp not available on WASI — no C library access")

public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp not available on WASI — no C library access")

public actual fun atoll(arg1: String?): CLongLong =
    throw UnsupportedOperationException("atoll not available on WASI — no C library access")

public actual fun llabs(arg1: CLongLong): CLongLong =
    throw UnsupportedOperationException("llabs not available on WASI — no C library access")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CLongLong =
    throw UnsupportedOperationException("strtoll not available on WASI — no C library access")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: CInt): CULongLong =
    throw UnsupportedOperationException("strtoull not available on WASI — no C library access")

public actual fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on WASI — no C library access")

public actual fun quickExit(arg1: CInt) {
    throw UnsupportedOperationException("quickExit not available on WASI — no C library access")
}

public actual fun setenv(arg1: String?, arg2: String?, arg3: CInt): CInt =
    throw UnsupportedOperationException("setenv not available on WASI — no C library access")

public actual fun unsetenv(arg1: String?): CInt =
    throw UnsupportedOperationException("unsetenv not available on WASI — no C library access")

public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: CInt, arg6: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber not available on WASI — no C library access")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): CInt =
    throw UnsupportedOperationException("dehumanizeNumber not available on WASI — no C library access")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("getenvR not available on WASI — no C library access")

public actual fun radixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    throw UnsupportedOperationException("radixsort not available on WASI — no C library access")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: CInt, arg3: COpaquePointer?, arg4: CUInt): CInt =
    throw UnsupportedOperationException("sradixsort not available on WASI — no C library access")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on WASI — no C library access")

public actual fun setprogname(arg1: String?) {
    throw UnsupportedOperationException("setprogname not available on WASI — no C library access")
}

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong): CLongLong =
    throw UnsupportedOperationException("strsuftoll not available on WASI — no C library access")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: CLongLong, arg4: CLongLong, arg5: String?, arg6: ULong): CLongLong =
    throw UnsupportedOperationException("strsuftollx not available on WASI — no C library access")

public actual fun l64aR(arg1: CLong, arg2: String?, arg3: CInt): CInt =
    throw UnsupportedOperationException("l64aR not available on WASI — no C library access")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLong =
    throw UnsupportedOperationException("strtolL not available on WASI — no C library access")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULong =
    throw UnsupportedOperationException("strtoulL not available on WASI — no C library access")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CLongLong =
    throw UnsupportedOperationException("strtollL not available on WASI — no C library access")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: CInt, arg4: LocaleT): CULongLong =
    throw UnsupportedOperationException("strtoullL not available on WASI — no C library access")

public actual fun mbCurMaxL(arg1: LocaleT): ULong =
    throw UnsupportedOperationException("mbCurMaxL not available on WASI — no C library access")

public actual fun mblenL(arg1: String?, arg2: ULong, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("mblenL not available on WASI — no C library access")

public actual fun mbstowcsL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("mbstowcsL not available on WASI — no C library access")

public actual fun wctombL(arg1: String?, arg2: WcharT, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("wctombL not available on WASI — no C library access")

public actual fun mbtowcL(arg1: WcharT?, arg2: String?, arg3: ULong, arg4: LocaleT): CInt =
    throw UnsupportedOperationException("mbtowcL not available on WASI — no C library access")

public actual fun wcstombsL(arg1: String?, arg2: WcharT?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("wcstombsL not available on WASI — no C library access")

public actual fun memchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on WASI — no C library access")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    throw UnsupportedOperationException("memcmp not available on WASI — no C library access")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on WASI — no C library access")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on WASI — no C library access")

public actual fun memset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on WASI — no C library access")

public actual fun strcat(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcat not available on WASI — no C library access")

public actual fun strchr(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("strchr not available on WASI — no C library access")

public actual fun strcmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcmp not available on WASI — no C library access")

public actual fun strcoll(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcoll not available on WASI — no C library access")

public actual fun strcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcpy not available on WASI — no C library access")

public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on WASI — no C library access")

public actual fun strerror(arg1: CInt): String? =
    throw UnsupportedOperationException("strerror not available on WASI — no C library access")

public actual fun strlen(arg1: String?): ULong =
    throw UnsupportedOperationException("strlen not available on WASI — no C library access")

public actual fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncat not available on WASI — no C library access")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strncmp not available on WASI — no C library access")

public actual fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on WASI — no C library access")

public actual fun strpbrk(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on WASI — no C library access")

public actual fun strrchr(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("strrchr not available on WASI — no C library access")

public actual fun strspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strspn not available on WASI — no C library access")

public actual fun strstr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strstr not available on WASI — no C library access")

public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok not available on WASI — no C library access")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR not available on WASI — no C library access")

public actual fun strerrorR(arg1: CInt, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on WASI — no C library access")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: CInt, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on WASI — no C library access")

public actual fun strdup(arg1: String?): String? =
    throw UnsupportedOperationException("strdup not available on WASI — no C library access")

public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy not available on WASI — no C library access")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy not available on WASI — no C library access")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on WASI — no C library access")

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on WASI — no C library access")

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on WASI — no C library access")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcat not available on WASI — no C library access")

public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcpy not available on WASI — no C library access")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): String? =
    throw UnsupportedOperationException("strsep not available on WASI — no C library access")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: CInt): String? =
    throw UnsupportedOperationException("stresep not available on WASI — no C library access")

public actual fun strndup(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("strndup not available on WASI — no C library access")

public actual fun memrchr(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on WASI — no C library access")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: CInt, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("explicitMemset not available on WASI — no C library access")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    throw UnsupportedOperationException("consttimeMemequal not available on WASI — no C library access")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: LocaleT): CInt =
    throw UnsupportedOperationException("strcollL not available on WASI — no C library access")

public actual fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: LocaleT): ULong =
    throw UnsupportedOperationException("strxfrmL not available on WASI — no C library access")

public actual fun strerrorL(arg1: CInt, arg2: LocaleT): String? =
    throw UnsupportedOperationException("strerrorL not available on WASI — no C library access")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): CInt =
    throw UnsupportedOperationException("bcmp not available on WASI — no C library access")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong) {
    throw UnsupportedOperationException("bcopy not available on WASI — no C library access")
}

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong) {
    throw UnsupportedOperationException("bzero not available on WASI — no C library access")
}

public actual fun ffs(arg1: CInt): CInt =
    throw UnsupportedOperationException("ffs not available on WASI — no C library access")

public actual fun rindex(arg1: String?, arg2: CInt): String? =
    throw UnsupportedOperationException("rindex not available on WASI — no C library access")

public actual fun strcasecmp(arg1: String?, arg2: String?): CInt =
    throw UnsupportedOperationException("strcasecmp not available on WASI — no C library access")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): CInt =
    throw UnsupportedOperationException("strncasecmp not available on WASI — no C library access")

public actual fun raise(arg1: CInt): CInt =
    throw UnsupportedOperationException("raise not available on WASI — no C library access")

public actual fun asctime(arg1: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on WASI — no C library access")

public actual fun ctime(arg1: TimeT?): String? =
    throw UnsupportedOperationException("ctime not available on WASI — no C library access")

public actual fun gmtime(arg1: TimeT?): Tm? =
    throw UnsupportedOperationException("gmtime not available on WASI — no C library access")

public actual fun localtime(arg1: TimeT?): Tm? =
    throw UnsupportedOperationException("localtime not available on WASI — no C library access")

public actual fun time(arg1: TimeT?): TimeT =
    throw UnsupportedOperationException("time not available on WASI — no C library access")

public actual fun mktime(arg1: Tm?): TimeT =
    throw UnsupportedOperationException("mktime not available on WASI — no C library access")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on WASI — no C library access")

public actual fun utime(arg1: String?, arg2: TimeT?): CInt =
    throw UnsupportedOperationException("utime not available on WASI — no C library access")

public actual fun asctimeR(arg1: Tm?, arg2: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun ctimeR(arg1: TimeT?, arg2: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on WASI — no C library access")

public actual fun gmtimeR(arg1: TimeT?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on WASI — no C library access")

public actual fun localtimeR(arg1: TimeT?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on WASI — no C library access")

public actual fun stat(arg1: String?, arg2: Stat?): CInt =
    throw UnsupportedOperationException("stat not available on WASI — no C library access")

public actual fun lstat(arg1: String?, arg2: Stat?): CInt =
    throw UnsupportedOperationException("lstat not available on WASI — no C library access")

public actual fun fstat(arg1: CInt, arg2: Stat?): CInt =
    throw UnsupportedOperationException("fstat not available on WASI — no C library access")

public actual fun chmod(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("chmod not available on WASI — no C library access")

public actual fun mkdir(arg1: String?, arg2: ModeT): CInt =
    throw UnsupportedOperationException("mkdir not available on WASI — no C library access")

public actual fun open(arg1: String?, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open not available on WASI — no C library access")

public actual fun creat(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("creat not available on WASI — no C library access")

public actual fun close(arg1: CInt): CInt =
    throw UnsupportedOperationException("close not available on WASI — no C library access")

public actual fun read(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("read not available on WASI — no C library access")

public actual fun write(arg1: CInt, arg2: COpaquePointer?, arg3: CInt): CInt =
    throw UnsupportedOperationException("write not available on WASI — no C library access")

public actual fun unlink(arg1: String?): CInt =
    throw UnsupportedOperationException("unlink not available on WASI — no C library access")

public actual fun tell(arg1: CInt): CLong =
    throw UnsupportedOperationException("tell not available on WASI — no C library access")

public actual fun dup(arg1: CInt): CInt =
    throw UnsupportedOperationException("dup not available on WASI — no C library access")

public actual fun dup2(arg1: CInt, arg2: CInt): CInt =
    throw UnsupportedOperationException("dup2 not available on WASI — no C library access")

public actual fun access(arg1: String?, arg2: CInt): CInt =
    throw UnsupportedOperationException("access not available on WASI — no C library access")

public actual fun rmdir(arg1: String?): CInt =
    throw UnsupportedOperationException("rmdir not available on WASI — no C library access")

public actual fun chdir(arg1: String?): CInt =
    throw UnsupportedOperationException("chdir not available on WASI — no C library access")

public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd not available on WASI — no C library access")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on WASI — no C library access")

public actual fun getopt(arg1: CInt, arg2: COpaquePointer?, arg3: String?): CInt =
    throw UnsupportedOperationException("getopt not available on WASI — no C library access")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getsubopt not available on WASI — no C library access")

public actual fun fcntl(arg1: CInt, arg2: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl not available on WASI — no C library access")

public actual fun getpid(): PidT =
    throw UnsupportedOperationException("getpid not available on WASI — no C library access")

public actual fun usleep(arg1: UsecondsT): CInt =
    throw UnsupportedOperationException("usleep not available on WASI — no C library access")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on WASI — no C library access")

public actual fun setlocale(arg1: CInt, arg2: String?): String? =
    throw UnsupportedOperationException("setlocale not available on WASI — no C library access")

public actual fun duplocale(arg1: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on WASI — no C library access")

public actual fun freelocale(arg1: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on WASI — no C library access")
}

public actual fun localeconvL(arg1: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on WASI — no C library access")

public actual fun newlocale(arg1: CInt, arg2: String?, arg3: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on WASI — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on WASI — no C library access")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on WASI — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WASI — no C library access")

public actual fun lseek(arg1: CInt, arg2: OffT, arg3: CInt): OffT =
    throw UnsupportedOperationException("lseek not available on WASI — no C library access")


public actual fun atexit(arg1: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atexit not available on WASI — no C library access")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> CInt)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on WASI — no C library access")

public actual fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsort not available on WASI — no C library access")
}

public actual fun atQuickExit(arg1: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("atQuickExit not available on WASI — no C library access")

public actual fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt =
    throw UnsupportedOperationException("heapsort not available on WASI — no C library access")

public actual fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> CInt)?): CInt =
    throw UnsupportedOperationException("mergesort not available on WASI — no C library access")
