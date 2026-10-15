// port-lint: source Mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower not available on Android host — use androidNative target for FFI")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper not available on Android host — use androidNative target for FFI")

public actual fun getStdioFile(fileno: Int): FILE? =
    throw UnsupportedOperationException("getStdioFile not available on Android host — use androidNative target for FFI")

public actual fun clearerr(arg1: FILE?): Unit = throw UnsupportedOperationException("clearerr not available on Android host — use androidNative target for FFI")

public actual fun fclose(arg1: FILE?): Int =
    throw UnsupportedOperationException("fclose not available on Android host — use androidNative target for FFI")

public actual fun feof(arg1: FILE?): Int =
    throw UnsupportedOperationException("feof not available on Android host — use androidNative target for FFI")

public actual fun ferror(arg1: FILE?): Int =
    throw UnsupportedOperationException("ferror not available on Android host — use androidNative target for FFI")

public actual fun fflush(arg1: FILE?): Int =
    throw UnsupportedOperationException("fflush not available on Android host — use androidNative target for FFI")

public actual fun fgetc(arg1: FILE?): Int =
    throw UnsupportedOperationException("fgetc not available on Android host — use androidNative target for FFI")

public actual fun fgets(arg1: String?, arg2: Int, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets not available on Android host — use androidNative target for FFI")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    throw UnsupportedOperationException("fopen not available on Android host — use androidNative target for FFI")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf not available on Android host — use androidNative target for FFI")

public actual fun fputc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("fputc not available on Android host — use androidNative target for FFI")

public actual fun fputs(arg1: String?, arg2: FILE?): Int =
    throw UnsupportedOperationException("fputs not available on Android host — use androidNative target for FFI")

public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread not available on Android host — use androidNative target for FFI")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    throw UnsupportedOperationException("freopen not available on Android host — use androidNative target for FFI")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf not available on Android host — use androidNative target for FFI")

public actual fun fseek(arg1: FILE?, arg2: Long, arg3: Int): Int =
    throw UnsupportedOperationException("fseek not available on Android host — use androidNative target for FFI")

public actual fun ftell(arg1: FILE?): Long =
    throw UnsupportedOperationException("ftell not available on Android host — use androidNative target for FFI")

public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fwrite not available on Android host — use androidNative target for FFI")

public actual fun getc(arg1: FILE?): Int =
    throw UnsupportedOperationException("getc not available on Android host — use androidNative target for FFI")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar not available on Android host — use androidNative target for FFI")

public actual fun perror(arg1: String?): Unit = throw UnsupportedOperationException("perror not available on Android host — use androidNative target for FFI")

public actual fun printf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf not available on Android host — use androidNative target for FFI")

public actual fun putc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putc not available on Android host — use androidNative target for FFI")

public actual fun putchar(arg1: Int): Int =
    throw UnsupportedOperationException("putchar not available on Android host — use androidNative target for FFI")

public actual fun puts(arg1: String?): Int =
    throw UnsupportedOperationException("puts not available on Android host — use androidNative target for FFI")

public actual fun remove(arg1: String?): Int =
    throw UnsupportedOperationException("remove not available on Android host — use androidNative target for FFI")

public actual fun rewind(arg1: FILE?): Unit = throw UnsupportedOperationException("rewind not available on Android host — use androidNative target for FFI")

public actual fun scanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf not available on Android host — use androidNative target for FFI")

public actual fun setbuf(arg1: FILE?, arg2: String?): Unit = throw UnsupportedOperationException("setbuf not available on Android host — use androidNative target for FFI")

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: Int, arg4: ULong): Int =
    throw UnsupportedOperationException("setvbuf not available on Android host — use androidNative target for FFI")

public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf not available on Android host — use androidNative target for FFI")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile not available on Android host — use androidNative target for FFI")

public actual fun ungetc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("ungetc not available on Android host — use androidNative target for FFI")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfprintf not available on Android host — use androidNative target for FFI")

public actual fun vprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("vprintf not available on Android host — use androidNative target for FFI")

public actual fun gets(arg1: String?): String? =
    throw UnsupportedOperationException("gets not available on Android host — use androidNative target for FFI")

public actual fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf not available on Android host — use androidNative target for FFI")

public actual fun tmpnam(arg1: String?): String? =
    throw UnsupportedOperationException("tmpnam not available on Android host — use androidNative target for FFI")

public actual fun vsprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsprintf not available on Android host — use androidNative target for FFI")

public actual fun rename(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("rename not available on Android host — use androidNative target for FFI")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("asiprintf not available on Android host — use androidNative target for FFI")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiprintf not available on Android host — use androidNative target for FFI")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiscanf not available on Android host — use androidNative target for FFI")

public actual fun iprintf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iprintf not available on Android host — use androidNative target for FFI")

public actual fun iscanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iscanf not available on Android host — use androidNative target for FFI")

public actual fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siprintf not available on Android host — use androidNative target for FFI")

public actual fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siscanf not available on Android host — use androidNative target for FFI")

public actual fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sniprintf not available on Android host — use androidNative target for FFI")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vasiprintf not available on Android host — use androidNative target for FFI")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiprintf not available on Android host — use androidNative target for FFI")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiscanf not available on Android host — use androidNative target for FFI")

public actual fun viprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viprintf not available on Android host — use androidNative target for FFI")

public actual fun viscanf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viscanf not available on Android host — use androidNative target for FFI")

public actual fun vsiprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiprintf not available on Android host — use androidNative target for FFI")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiscanf not available on Android host — use androidNative target for FFI")

public actual fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsniprintf not available on Android host — use androidNative target for FFI")

public actual fun vdiprintf(arg1: Int, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vdiprintf not available on Android host — use androidNative target for FFI")

public actual fun diprintf(arg1: Int, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("diprintf not available on Android host — use androidNative target for FFI")

public actual fun fgetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fgetpos not available on Android host — use androidNative target for FFI")

public actual fun fsetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fsetpos not available on Android host — use androidNative target for FFI")

public actual fun fdopen(arg1: Int, arg2: String?): FILE? =
    throw UnsupportedOperationException("fdopen not available on Android host — use androidNative target for FFI")

public actual fun fileno(arg1: FILE?): Int =
    throw UnsupportedOperationException("fileno not available on Android host — use androidNative target for FFI")

public actual fun flockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("flockfile not available on Android host — use androidNative target for FFI")

public actual fun ftrylockfile(arg1: FILE?): Int =
    throw UnsupportedOperationException("ftrylockfile not available on Android host — use androidNative target for FFI")

public actual fun funlockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("funlockfile not available on Android host — use androidNative target for FFI")

public actual fun getcUnlocked(arg1: FILE?): Int =
    throw UnsupportedOperationException("getcUnlocked not available on Android host — use androidNative target for FFI")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun putcUnlocked(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putcUnlocked not available on Android host — use androidNative target for FFI")

public actual fun putcharUnlocked(arg1: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked not available on Android host — use androidNative target for FFI")

public actual fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf not available on Android host — use androidNative target for FFI")

public actual fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsnprintf not available on Android host — use androidNative target for FFI")

public actual fun getw(arg1: FILE?): Int =
    throw UnsupportedOperationException("getw not available on Android host — use androidNative target for FFI")

public actual fun putw(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putw not available on Android host — use androidNative target for FFI")

public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam not available on Android host — use androidNative target for FFI")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko not available on Android host — use androidNative target for FFI")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello not available on Android host — use androidNative target for FFI")

public actual fun abs(arg1: Int): Int =
    throw UnsupportedOperationException("abs not available on Android host — use androidNative target for FFI")

public actual fun atoi(arg1: String?): Int =
    throw UnsupportedOperationException("atoi not available on Android host — use androidNative target for FFI")

public actual fun atol(arg1: String?): Long =
    throw UnsupportedOperationException("atol not available on Android host — use androidNative target for FFI")

public actual fun itoa(arg1: Int, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("itoa not available on Android host — use androidNative target for FFI")

public actual fun ltoa(arg1: Long, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ltoa not available on Android host — use androidNative target for FFI")

public actual fun ultoa(arg1: ULong, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ultoa not available on Android host — use androidNative target for FFI")

public actual fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on Android host — use androidNative target for FFI")

public actual fun free(arg1: COpaquePointer?): Unit = throw UnsupportedOperationException("free not available on Android host — use androidNative target for FFI")

public actual fun getenv(arg1: String?): String? =
    throw UnsupportedOperationException("getenv not available on Android host — use androidNative target for FFI")

public actual fun labs(arg1: Long): Long =
    throw UnsupportedOperationException("labs not available on Android host — use androidNative target for FFI")

public actual fun malloc(arg1: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on Android host — use androidNative target for FFI")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on Android host — use androidNative target for FFI")

public actual fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on Android host — use androidNative target for FFI")

public actual fun srand(arg1: UInt): Unit = throw UnsupportedOperationException("srand not available on Android host — use androidNative target for FFI")

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtol not available on Android host — use androidNative target for FFI")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoul not available on Android host — use androidNative target for FFI")

public actual fun mblen(arg1: String?, arg2: ULong): Int =
    throw UnsupportedOperationException("mblen not available on Android host — use androidNative target for FFI")

public actual fun mbstowcs(arg1: UInt?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("mbstowcs not available on Android host — use androidNative target for FFI")

public actual fun wctomb(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("wctomb not available on Android host — use androidNative target for FFI")

public actual fun mbtowc(arg1: UInt?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("mbtowc not available on Android host — use androidNative target for FFI")

public actual fun wcstombs(arg1: String?, arg2: UInt?, arg3: ULong): ULong =
    throw UnsupportedOperationException("wcstombs not available on Android host — use androidNative target for FFI")

public actual fun randR(arg1: UInt?): Int =
    throw UnsupportedOperationException("randR not available on Android host — use androidNative target for FFI")

public actual fun jrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on Android host — use androidNative target for FFI")

public actual fun lcong48(arg1: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on Android host — use androidNative target for FFI")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on Android host — use androidNative target for FFI")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on Android host — use androidNative target for FFI")

public actual fun nrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on Android host — use androidNative target for FFI")

public actual fun seed48(arg1: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on Android host — use androidNative target for FFI")

public actual fun srand48(arg1: Long): Unit = throw UnsupportedOperationException("srand48 not available on Android host — use androidNative target for FFI")

public actual fun putenv(arg1: String?): Int =
    throw UnsupportedOperationException("putenv not available on Android host — use androidNative target for FFI")

public actual fun a64l(arg1: String?): Long =
    throw UnsupportedOperationException("a64l not available on Android host — use androidNative target for FFI")

public actual fun l64a(arg1: Long): String? =
    throw UnsupportedOperationException("l64a not available on Android host — use androidNative target for FFI")

public actual fun random(): Long =
    throw UnsupportedOperationException("random not available on Android host — use androidNative target for FFI")

public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate not available on Android host — use androidNative target for FFI")

public actual fun initstate(arg1: UInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate not available on Android host — use androidNative target for FFI")

public actual fun srandom(arg1: UInt): Unit = throw UnsupportedOperationException("srandom not available on Android host — use androidNative target for FFI")

public actual fun mkostemp(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("mkostemp not available on Android host — use androidNative target for FFI")

public actual fun mkostemps(arg1: String?, arg2: Int, arg3: Int): Int =
    throw UnsupportedOperationException("mkostemps not available on Android host — use androidNative target for FFI")

public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp not available on Android host — use androidNative target for FFI")

public actual fun mkstemp(arg1: String?): Int =
    throw UnsupportedOperationException("mkstemp not available on Android host — use androidNative target for FFI")

public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp not available on Android host — use androidNative target for FFI")

public actual fun atoll(arg1: String?): Long =
    throw UnsupportedOperationException("atoll not available on Android host — use androidNative target for FFI")

public actual fun llabs(arg1: Long): Long =
    throw UnsupportedOperationException("llabs not available on Android host — use androidNative target for FFI")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtoll not available on Android host — use androidNative target for FFI")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoull not available on Android host — use androidNative target for FFI")

public actual fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc not available on Android host — use androidNative target for FFI")

public actual fun quickExit(arg1: Int): Unit = throw UnsupportedOperationException("quickExit not available on Android host — use androidNative target for FFI")

public actual fun setenv(arg1: String?, arg2: String?, arg3: Int): Int =
    throw UnsupportedOperationException("setenv not available on Android host — use androidNative target for FFI")

public actual fun unsetenv(arg1: String?): Int =
    throw UnsupportedOperationException("unsetenv not available on Android host — use androidNative target for FFI")

public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: Int, arg6: Int): Int =
    throw UnsupportedOperationException("humanizeNumber not available on Android host — use androidNative target for FFI")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("dehumanizeNumber not available on Android host — use androidNative target for FFI")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("getenvR not available on Android host — use androidNative target for FFI")

public actual fun radixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    throw UnsupportedOperationException("radixsort not available on Android host — use androidNative target for FFI")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    throw UnsupportedOperationException("sradixsort not available on Android host — use androidNative target for FFI")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on Android host — use androidNative target for FFI")

public actual fun setprogname(arg1: String?): Unit = throw UnsupportedOperationException("setprogname not available on Android host — use androidNative target for FFI")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: Long, arg4: Long): Long =
    throw UnsupportedOperationException("strsuftoll not available on Android host — use androidNative target for FFI")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: Long, arg4: Long, arg5: String?, arg6: ULong): Long =
    throw UnsupportedOperationException("strsuftollx not available on Android host — use androidNative target for FFI")

public actual fun l64aR(arg1: Long, arg2: String?, arg3: Int): Int =
    throw UnsupportedOperationException("l64aR not available on Android host — use androidNative target for FFI")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtolL not available on Android host — use androidNative target for FFI")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoulL not available on Android host — use androidNative target for FFI")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtollL not available on Android host — use androidNative target for FFI")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoullL not available on Android host — use androidNative target for FFI")

public actual fun mbCurMaxL(arg1: ULong): ULong =
    throw UnsupportedOperationException("mbCurMaxL not available on Android host — use androidNative target for FFI")

public actual fun mblenL(arg1: String?, arg2: ULong, arg3: ULong): Int =
    throw UnsupportedOperationException("mblenL not available on Android host — use androidNative target for FFI")

public actual fun mbstowcsL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("mbstowcsL not available on Android host — use androidNative target for FFI")

public actual fun wctombL(arg1: String?, arg2: UInt, arg3: ULong): Int =
    throw UnsupportedOperationException("wctombL not available on Android host — use androidNative target for FFI")

public actual fun mbtowcL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): Int =
    throw UnsupportedOperationException("mbtowcL not available on Android host — use androidNative target for FFI")

public actual fun wcstombsL(arg1: String?, arg2: UInt?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("wcstombsL not available on Android host — use androidNative target for FFI")

public actual fun memchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr not available on Android host — use androidNative target for FFI")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("memcmp not available on Android host — use androidNative target for FFI")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy not available on Android host — use androidNative target for FFI")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove not available on Android host — use androidNative target for FFI")

public actual fun memset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset not available on Android host — use androidNative target for FFI")

public actual fun strcat(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcat not available on Android host — use androidNative target for FFI")

public actual fun strchr(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("strchr not available on Android host — use androidNative target for FFI")

public actual fun strcmp(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcmp not available on Android host — use androidNative target for FFI")

public actual fun strcoll(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcoll not available on Android host — use androidNative target for FFI")

public actual fun strcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcpy not available on Android host — use androidNative target for FFI")

public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strcspn not available on Android host — use androidNative target for FFI")

public actual fun strerror(arg1: Int): String? =
    throw UnsupportedOperationException("strerror not available on Android host — use androidNative target for FFI")

public actual fun strlen(arg1: String?): ULong =
    throw UnsupportedOperationException("strlen not available on Android host — use androidNative target for FFI")

public actual fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncat not available on Android host — use androidNative target for FFI")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strncmp not available on Android host — use androidNative target for FFI")

public actual fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncpy not available on Android host — use androidNative target for FFI")

public actual fun strpbrk(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strpbrk not available on Android host — use androidNative target for FFI")

public actual fun strrchr(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("strrchr not available on Android host — use androidNative target for FFI")

public actual fun strspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strspn not available on Android host — use androidNative target for FFI")

public actual fun strstr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strstr not available on Android host — use androidNative target for FFI")

public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok not available on Android host — use androidNative target for FFI")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR not available on Android host — use androidNative target for FFI")

public actual fun strerrorR(arg1: Int, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on Android host — use androidNative target for FFI")

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strxfrm not available on Android host — use androidNative target for FFI")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy not available on Android host — use androidNative target for FFI")

public actual fun strdup(arg1: String?): String? =
    throw UnsupportedOperationException("strdup not available on Android host — use androidNative target for FFI")

public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy not available on Android host — use androidNative target for FFI")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy not available on Android host — use androidNative target for FFI")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    throw UnsupportedOperationException("strnlen not available on Android host — use androidNative target for FFI")

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr not available on Android host — use androidNative target for FFI")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcat not available on Android host — use androidNative target for FFI")

public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcpy not available on Android host — use androidNative target for FFI")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): String? =
    throw UnsupportedOperationException("strsep not available on Android host — use androidNative target for FFI")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("stresep not available on Android host — use androidNative target for FFI")

public actual fun strndup(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("strndup not available on Android host — use androidNative target for FFI")

public actual fun memrchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on Android host — use androidNative target for FFI")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("explicitMemset not available on Android host — use androidNative target for FFI")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal not available on Android host — use androidNative target for FFI")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strcollL not available on Android host — use androidNative target for FFI")

public actual fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("strxfrmL not available on Android host — use androidNative target for FFI")

public actual fun strerrorL(arg1: Int, arg2: ULong): String? =
    throw UnsupportedOperationException("strerrorL not available on Android host — use androidNative target for FFI")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("bcmp not available on Android host — use androidNative target for FFI")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Unit = throw UnsupportedOperationException("bcopy not available on Android host — use androidNative target for FFI")

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong): Unit = throw UnsupportedOperationException("bzero not available on Android host — use androidNative target for FFI")

public actual fun ffs(arg1: Int): Int =
    throw UnsupportedOperationException("ffs not available on Android host — use androidNative target for FFI")

public actual fun rindex(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("rindex not available on Android host — use androidNative target for FFI")

public actual fun strcasecmp(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcasecmp not available on Android host — use androidNative target for FFI")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strncasecmp not available on Android host — use androidNative target for FFI")

public actual fun raise(arg1: Int): Int =
    throw UnsupportedOperationException("raise not available on Android host — use androidNative target for FFI")

public actual fun asctime(arg1: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on Android host — use androidNative target for FFI")

public actual fun ctime(arg1: Long?): String? =
    throw UnsupportedOperationException("ctime not available on Android host — use androidNative target for FFI")

public actual fun gmtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("gmtime not available on Android host — use androidNative target for FFI")

public actual fun localtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("localtime not available on Android host — use androidNative target for FFI")

public actual fun time(arg1: Long?): Long =
    throw UnsupportedOperationException("time not available on Android host — use androidNative target for FFI")

public actual fun mktime(arg1: Tm?): Long =
    throw UnsupportedOperationException("mktime not available on Android host — use androidNative target for FFI")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime not available on Android host — use androidNative target for FFI")

public actual fun utime(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("utime not available on Android host — use androidNative target for FFI")

public actual fun asctimeR(arg1: Tm?, arg2: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on Android host — use androidNative target for FFI")

public actual fun ctimeR(arg1: Long?, arg2: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on Android host — use androidNative target for FFI")

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR not available on Android host — use androidNative target for FFI")

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR not available on Android host — use androidNative target for FFI")

public actual fun stat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("stat not available on Android host — use androidNative target for FFI")

public actual fun lstat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("lstat not available on Android host — use androidNative target for FFI")

public actual fun fstat(arg1: Int, arg2: Stat?): Int =
    throw UnsupportedOperationException("fstat not available on Android host — use androidNative target for FFI")

public actual fun chmod(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("chmod not available on Android host — use androidNative target for FFI")

public actual fun mkdir(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("mkdir not available on Android host — use androidNative target for FFI")

public actual fun open(arg1: String?, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open not available on Android host — use androidNative target for FFI")

public actual fun creat(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("creat not available on Android host — use androidNative target for FFI")

public actual fun close(arg1: Int): Int =
    throw UnsupportedOperationException("close not available on Android host — use androidNative target for FFI")

public actual fun read(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("read not available on Android host — use androidNative target for FFI")

public actual fun write(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("write not available on Android host — use androidNative target for FFI")

public actual fun unlink(arg1: String?): Int =
    throw UnsupportedOperationException("unlink not available on Android host — use androidNative target for FFI")

public actual fun tell(arg1: Int): Long =
    throw UnsupportedOperationException("tell not available on Android host — use androidNative target for FFI")

public actual fun dup(arg1: Int): Int =
    throw UnsupportedOperationException("dup not available on Android host — use androidNative target for FFI")

public actual fun dup2(arg1: Int, arg2: Int): Int =
    throw UnsupportedOperationException("dup2 not available on Android host — use androidNative target for FFI")

public actual fun access(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("access not available on Android host — use androidNative target for FFI")

public actual fun rmdir(arg1: String?): Int =
    throw UnsupportedOperationException("rmdir not available on Android host — use androidNative target for FFI")

public actual fun chdir(arg1: String?): Int =
    throw UnsupportedOperationException("chdir not available on Android host — use androidNative target for FFI")

public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd not available on Android host — use androidNative target for FFI")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd not available on Android host — use androidNative target for FFI")

public actual fun getopt(arg1: Int, arg2: COpaquePointer?, arg3: String?): Int =
    throw UnsupportedOperationException("getopt not available on Android host — use androidNative target for FFI")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): Int =
    throw UnsupportedOperationException("getsubopt not available on Android host — use androidNative target for FFI")

public actual fun fcntl(arg1: Int, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl not available on Android host — use androidNative target for FFI")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid not available on Android host — use androidNative target for FFI")

public actual fun usleep(arg1: UInt): Int =
    throw UnsupportedOperationException("usleep not available on Android host — use androidNative target for FFI")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv not available on Android host — use androidNative target for FFI")

public actual fun setlocale(arg1: Int, arg2: String?): String? =
    throw UnsupportedOperationException("setlocale not available on Android host — use androidNative target for FFI")

public actual fun duplocale(arg1: ULong): ULong =
    throw UnsupportedOperationException("duplocale not available on Android host — use androidNative target for FFI")

public actual fun freelocale(arg1: ULong): Unit = throw UnsupportedOperationException("freelocale not available on Android host — use androidNative target for FFI")

public actual fun localeconvL(arg1: ULong): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on Android host — use androidNative target for FFI")

public actual fun newlocale(arg1: Int, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("newlocale not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfo(item: Long): String? =
    throw UnsupportedOperationException("nlLanginfo not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: Long, locale: ULong): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on Android host — use androidNative target for FFI")

public actual fun lseek(arg1: Int, arg2: Long, arg3: Int): Long =
    throw UnsupportedOperationException("lseek not available on Android host — use androidNative target for FFI")

public actual fun atexit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit not available on Android host — use androidNative target for FFI")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch not available on Android host — use androidNative target for FFI")

public actual fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort not available on Android host — use androidNative target for FFI")

public actual fun atQuickExit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit not available on Android host — use androidNative target for FFI")

public actual fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("heapsort not available on Android host — use androidNative target for FFI")

public actual fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("mergesort not available on Android host — use androidNative target for FFI")
