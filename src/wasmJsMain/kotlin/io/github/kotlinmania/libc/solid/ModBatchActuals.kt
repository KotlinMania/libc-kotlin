package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum requires N-API addon")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha requires N-API addon")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl requires N-API addon")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit requires N-API addon")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph requires N-API addon")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower requires N-API addon")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint requires N-API addon")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct requires N-API addon")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace requires N-API addon")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper requires N-API addon")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit requires N-API addon")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank requires N-API addon")

public actual fun tolower(c: Int): Int =
    throw UnsupportedOperationException("tolower requires N-API addon")

public actual fun toupper(c: Int): Int =
    throw UnsupportedOperationException("toupper requires N-API addon")

public actual fun getStdioFile(fileno: Int): FILE? =
    throw UnsupportedOperationException("getStdioFile requires N-API addon")

public actual fun clearerr(arg1: FILE?): Unit = throw UnsupportedOperationException("clearerr requires N-API addon")

public actual fun fclose(arg1: FILE?): Int =
    throw UnsupportedOperationException("fclose requires N-API addon")

public actual fun feof(arg1: FILE?): Int =
    throw UnsupportedOperationException("feof requires N-API addon")

public actual fun ferror(arg1: FILE?): Int =
    throw UnsupportedOperationException("ferror requires N-API addon")

public actual fun fflush(arg1: FILE?): Int =
    throw UnsupportedOperationException("fflush requires N-API addon")

public actual fun fgetc(arg1: FILE?): Int =
    throw UnsupportedOperationException("fgetc requires N-API addon")

public actual fun fgets(arg1: String?, arg2: Int, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets requires N-API addon")

public actual fun fopen(arg1: String?, arg2: String?): FILE? =
    throw UnsupportedOperationException("fopen requires N-API addon")

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires N-API addon")

public actual fun fputc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("fputc requires N-API addon")

public actual fun fputs(arg1: String?, arg2: FILE?): Int =
    throw UnsupportedOperationException("fputs requires N-API addon")

public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread requires N-API addon")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? =
    throw UnsupportedOperationException("freopen requires N-API addon")

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires N-API addon")

public actual fun fseek(arg1: FILE?, arg2: Long, arg3: Int): Int =
    throw UnsupportedOperationException("fseek requires N-API addon")

public actual fun ftell(arg1: FILE?): Long =
    throw UnsupportedOperationException("ftell requires N-API addon")

public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires N-API addon")

public actual fun getc(arg1: FILE?): Int =
    throw UnsupportedOperationException("getc requires N-API addon")

public actual fun getchar(): Int =
    throw UnsupportedOperationException("getchar requires N-API addon")

public actual fun perror(arg1: String?): Unit = throw UnsupportedOperationException("perror requires N-API addon")

public actual fun printf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires N-API addon")

public actual fun putc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putc requires N-API addon")

public actual fun putchar(arg1: Int): Int =
    throw UnsupportedOperationException("putchar requires N-API addon")

public actual fun puts(arg1: String?): Int =
    throw UnsupportedOperationException("puts requires N-API addon")

public actual fun remove(arg1: String?): Int =
    throw UnsupportedOperationException("remove requires N-API addon")

public actual fun rewind(arg1: FILE?): Unit = throw UnsupportedOperationException("rewind requires N-API addon")

public actual fun scanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires N-API addon")

public actual fun setbuf(arg1: FILE?, arg2: String?): Unit = throw UnsupportedOperationException("setbuf requires N-API addon")

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: Int, arg4: ULong): Int =
    throw UnsupportedOperationException("setvbuf requires N-API addon")

public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires N-API addon")

public actual fun tmpfile(): FILE? =
    throw UnsupportedOperationException("tmpfile requires N-API addon")

public actual fun ungetc(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("ungetc requires N-API addon")

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfprintf requires N-API addon")

public actual fun vprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("vprintf requires N-API addon")

public actual fun gets(arg1: String?): String? =
    throw UnsupportedOperationException("gets requires N-API addon")

public actual fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires N-API addon")

public actual fun tmpnam(arg1: String?): String? =
    throw UnsupportedOperationException("tmpnam requires N-API addon")

public actual fun vsprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsprintf requires N-API addon")

public actual fun rename(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("rename requires N-API addon")

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("asiprintf requires N-API addon")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiprintf requires N-API addon")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiscanf requires N-API addon")

public actual fun iprintf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iprintf requires N-API addon")

public actual fun iscanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iscanf requires N-API addon")

public actual fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siprintf requires N-API addon")

public actual fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siscanf requires N-API addon")

public actual fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sniprintf requires N-API addon")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vasiprintf requires N-API addon")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiprintf requires N-API addon")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiscanf requires N-API addon")

public actual fun viprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viprintf requires N-API addon")

public actual fun viscanf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viscanf requires N-API addon")

public actual fun vsiprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiprintf requires N-API addon")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiscanf requires N-API addon")

public actual fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsniprintf requires N-API addon")

public actual fun vdiprintf(arg1: Int, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vdiprintf requires N-API addon")

public actual fun diprintf(arg1: Int, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("diprintf requires N-API addon")

public actual fun fgetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires N-API addon")

public actual fun fsetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires N-API addon")

public actual fun fdopen(arg1: Int, arg2: String?): FILE? =
    throw UnsupportedOperationException("fdopen requires N-API addon")

public actual fun fileno(arg1: FILE?): Int =
    throw UnsupportedOperationException("fileno requires N-API addon")

public actual fun flockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("flockfile requires N-API addon")

public actual fun ftrylockfile(arg1: FILE?): Int =
    throw UnsupportedOperationException("ftrylockfile requires N-API addon")

public actual fun funlockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("funlockfile requires N-API addon")

public actual fun getcUnlocked(arg1: FILE?): Int =
    throw UnsupportedOperationException("getcUnlocked requires N-API addon")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires N-API addon")

public actual fun putcUnlocked(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putcUnlocked requires N-API addon")

public actual fun putcharUnlocked(arg1: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires N-API addon")

public actual fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires N-API addon")

public actual fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsnprintf requires N-API addon")

public actual fun getw(arg1: FILE?): Int =
    throw UnsupportedOperationException("getw requires N-API addon")

public actual fun putw(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putw requires N-API addon")

public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam requires N-API addon")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    throw UnsupportedOperationException("fseeko requires N-API addon")

public actual fun ftello(stream: FILE?): Long =
    throw UnsupportedOperationException("ftello requires N-API addon")

public actual fun abs(arg1: Int): Int =
    throw UnsupportedOperationException("abs requires N-API addon")

public actual fun atoi(arg1: String?): Int =
    throw UnsupportedOperationException("atoi requires N-API addon")

public actual fun atol(arg1: String?): Long =
    throw UnsupportedOperationException("atol requires N-API addon")

public actual fun itoa(arg1: Int, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("itoa requires N-API addon")

public actual fun ltoa(arg1: Long, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ltoa requires N-API addon")

public actual fun ultoa(arg1: ULong, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ultoa requires N-API addon")

public actual fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("calloc requires N-API addon")

public actual fun free(arg1: COpaquePointer?): Unit = throw UnsupportedOperationException("free requires N-API addon")

public actual fun getenv(arg1: String?): String? =
    throw UnsupportedOperationException("getenv requires N-API addon")

public actual fun labs(arg1: Long): Long =
    throw UnsupportedOperationException("labs requires N-API addon")

public actual fun malloc(arg1: ULong): COpaquePointer? =
    throw UnsupportedOperationException("malloc requires N-API addon")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand requires N-API addon")

public actual fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires N-API addon")

public actual fun srand(arg1: UInt): Unit = throw UnsupportedOperationException("srand requires N-API addon")

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtol requires N-API addon")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoul requires N-API addon")

public actual fun mblen(arg1: String?, arg2: ULong): Int =
    throw UnsupportedOperationException("mblen requires N-API addon")

public actual fun mbstowcs(arg1: UInt?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("mbstowcs requires N-API addon")

public actual fun wctomb(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("wctomb requires N-API addon")

public actual fun mbtowc(arg1: UInt?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("mbtowc requires N-API addon")

public actual fun wcstombs(arg1: String?, arg2: UInt?, arg3: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires N-API addon")

public actual fun randR(arg1: UInt?): Int =
    throw UnsupportedOperationException("randR requires N-API addon")

public actual fun jrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires N-API addon")

public actual fun lcong48(arg1: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires N-API addon")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 requires N-API addon")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 requires N-API addon")

public actual fun nrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires N-API addon")

public actual fun seed48(arg1: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires N-API addon")

public actual fun srand48(arg1: Long): Unit = throw UnsupportedOperationException("srand48 requires N-API addon")

public actual fun putenv(arg1: String?): Int =
    throw UnsupportedOperationException("putenv requires N-API addon")

public actual fun a64l(arg1: String?): Long =
    throw UnsupportedOperationException("a64l requires N-API addon")

public actual fun l64a(arg1: Long): String? =
    throw UnsupportedOperationException("l64a requires N-API addon")

public actual fun random(): Long =
    throw UnsupportedOperationException("random requires N-API addon")

public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate requires N-API addon")

public actual fun initstate(arg1: UInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate requires N-API addon")

public actual fun srandom(arg1: UInt): Unit = throw UnsupportedOperationException("srandom requires N-API addon")

public actual fun mkostemp(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(arg1: String?, arg2: Int, arg3: Int): Int =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires N-API addon")

public actual fun mkstemp(arg1: String?): Int =
    throw UnsupportedOperationException("mkstemp requires N-API addon")

public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp requires N-API addon")

public actual fun atoll(arg1: String?): Long =
    throw UnsupportedOperationException("atoll requires N-API addon")

public actual fun llabs(arg1: Long): Long =
    throw UnsupportedOperationException("llabs requires N-API addon")

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtoll requires N-API addon")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoull requires N-API addon")

public actual fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires N-API addon")

public actual fun quickExit(arg1: Int): Unit = throw UnsupportedOperationException("quickExit requires N-API addon")

public actual fun setenv(arg1: String?, arg2: String?, arg3: Int): Int =
    throw UnsupportedOperationException("setenv requires N-API addon")

public actual fun unsetenv(arg1: String?): Int =
    throw UnsupportedOperationException("unsetenv requires N-API addon")

public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: Int, arg6: Int): Int =
    throw UnsupportedOperationException("humanizeNumber requires N-API addon")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("dehumanizeNumber requires N-API addon")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("getenvR requires N-API addon")

public actual fun radixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    throw UnsupportedOperationException("radixsort requires N-API addon")

public actual fun sradixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    throw UnsupportedOperationException("sradixsort requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(arg1: String?): Unit = throw UnsupportedOperationException("setprogname requires N-API addon")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: Long, arg4: Long): Long =
    throw UnsupportedOperationException("strsuftoll requires N-API addon")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: Long, arg4: Long, arg5: String?, arg6: ULong): Long =
    throw UnsupportedOperationException("strsuftollx requires N-API addon")

public actual fun l64aR(arg1: Long, arg2: String?, arg3: Int): Int =
    throw UnsupportedOperationException("l64aR requires N-API addon")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtolL requires N-API addon")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoulL requires N-API addon")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtollL requires N-API addon")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoullL requires N-API addon")

public actual fun mbCurMaxL(arg1: ULong): ULong =
    throw UnsupportedOperationException("mbCurMaxL requires N-API addon")

public actual fun mblenL(arg1: String?, arg2: ULong, arg3: ULong): Int =
    throw UnsupportedOperationException("mblenL requires N-API addon")

public actual fun mbstowcsL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("mbstowcsL requires N-API addon")

public actual fun wctombL(arg1: String?, arg2: UInt, arg3: ULong): Int =
    throw UnsupportedOperationException("wctombL requires N-API addon")

public actual fun mbtowcL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): Int =
    throw UnsupportedOperationException("mbtowcL requires N-API addon")

public actual fun wcstombsL(arg1: String?, arg2: UInt?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("wcstombsL requires N-API addon")

public actual fun memchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires N-API addon")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("memcmp requires N-API addon")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires N-API addon")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires N-API addon")

public actual fun memset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires N-API addon")

public actual fun strcat(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcat requires N-API addon")

public actual fun strchr(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("strchr requires N-API addon")

public actual fun strcmp(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcmp requires N-API addon")

public actual fun strcoll(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcoll requires N-API addon")

public actual fun strcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcpy requires N-API addon")

public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strcspn requires N-API addon")

public actual fun strerror(arg1: Int): String? =
    throw UnsupportedOperationException("strerror requires N-API addon")

public actual fun strlen(arg1: String?): ULong =
    throw UnsupportedOperationException("strlen requires N-API addon")

public actual fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncat requires N-API addon")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strncmp requires N-API addon")

public actual fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncpy requires N-API addon")

public actual fun strpbrk(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strpbrk requires N-API addon")

public actual fun strrchr(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("strrchr requires N-API addon")

public actual fun strspn(arg1: String?, arg2: String?): ULong =
    throw UnsupportedOperationException("strspn requires N-API addon")

public actual fun strstr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strstr requires N-API addon")

public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok requires N-API addon")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires N-API addon")

public actual fun strerrorR(arg1: Int, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires N-API addon")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires N-API addon")

public actual fun strdup(arg1: String?): String? =
    throw UnsupportedOperationException("strdup requires N-API addon")

public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy requires N-API addon")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires N-API addon")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    throw UnsupportedOperationException("strnlen requires N-API addon")

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr requires N-API addon")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcat requires N-API addon")

public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strlcpy requires N-API addon")

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("stresep requires N-API addon")

public actual fun strndup(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("strndup requires N-API addon")

public actual fun memrchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("explicitMemset requires N-API addon")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal requires N-API addon")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strcollL requires N-API addon")

public actual fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("strxfrmL requires N-API addon")

public actual fun strerrorL(arg1: Int, arg2: ULong): String? =
    throw UnsupportedOperationException("strerrorL requires N-API addon")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("bcmp requires N-API addon")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Unit = throw UnsupportedOperationException("bcopy requires N-API addon")

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong): Unit = throw UnsupportedOperationException("bzero requires N-API addon")

public actual fun ffs(arg1: Int): Int =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun rindex(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("rindex requires N-API addon")

public actual fun strcasecmp(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("strcasecmp requires N-API addon")

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strncasecmp requires N-API addon")

public actual fun raise(arg1: Int): Int =
    throw UnsupportedOperationException("raise requires N-API addon")

public actual fun asctime(arg1: Tm?): String? =
    throw UnsupportedOperationException("asctime requires N-API addon")

public actual fun ctime(arg1: Long?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun gmtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires N-API addon")

public actual fun localtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires N-API addon")

public actual fun time(arg1: Long?): Long =
    throw UnsupportedOperationException("time requires N-API addon")

public actual fun mktime(arg1: Tm?): Long =
    throw UnsupportedOperationException("mktime requires N-API addon")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires N-API addon")

public actual fun utime(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("utime requires N-API addon")

public actual fun asctimeR(arg1: Tm?, arg2: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(arg1: Long?, arg2: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires N-API addon")

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires N-API addon")

public actual fun stat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("stat requires N-API addon")

public actual fun lstat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("lstat requires N-API addon")

public actual fun fstat(arg1: Int, arg2: Stat?): Int =
    throw UnsupportedOperationException("fstat requires N-API addon")

public actual fun chmod(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("chmod requires N-API addon")

public actual fun mkdir(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("mkdir requires N-API addon")

public actual fun open(arg1: String?, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun close(arg1: Int): Int =
    throw UnsupportedOperationException("close requires N-API addon")

public actual fun read(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("read requires N-API addon")

public actual fun write(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("write requires N-API addon")

public actual fun unlink(arg1: String?): Int =
    throw UnsupportedOperationException("unlink requires N-API addon")

public actual fun tell(arg1: Int): Long =
    throw UnsupportedOperationException("tell requires N-API addon")

public actual fun dup(arg1: Int): Int =
    throw UnsupportedOperationException("dup requires N-API addon")

public actual fun dup2(arg1: Int, arg2: Int): Int =
    throw UnsupportedOperationException("dup2 requires N-API addon")

public actual fun access(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("access requires N-API addon")

public actual fun rmdir(arg1: String?): Int =
    throw UnsupportedOperationException("rmdir requires N-API addon")

public actual fun chdir(arg1: String?): Int =
    throw UnsupportedOperationException("chdir requires N-API addon")

public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd requires N-API addon")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd requires N-API addon")

public actual fun getopt(arg1: Int, arg2: COpaquePointer?, arg3: String?): Int =
    throw UnsupportedOperationException("getopt requires N-API addon")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): Int =
    throw UnsupportedOperationException("getsubopt requires N-API addon")

public actual fun fcntl(arg1: Int, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires N-API addon")

public actual fun getpid(): Int =
    throw UnsupportedOperationException("getpid requires N-API addon")

public actual fun usleep(arg1: UInt): Int =
    throw UnsupportedOperationException("usleep requires N-API addon")

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires N-API addon")

public actual fun setlocale(arg1: Int, arg2: String?): String? =
    throw UnsupportedOperationException("setlocale requires N-API addon")

public actual fun duplocale(arg1: ULong): ULong =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(arg1: ULong): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun localeconvL(arg1: ULong): Lconv? =
    throw UnsupportedOperationException("localeconvL requires N-API addon")

public actual fun newlocale(arg1: Int, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun nlLanginfo(item: Long): String? =
    throw UnsupportedOperationException("nlLanginfo requires N-API addon")

public actual fun nlLanginfoL(item: Long, locale: ULong): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign requires N-API addon")

public actual fun lseek(arg1: Int, arg2: Long, arg3: Int): Long =
    throw UnsupportedOperationException("lseek requires N-API addon")

public actual fun atexit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires N-API addon")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires N-API addon")

public actual fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires N-API addon")

public actual fun atQuickExit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit requires N-API addon")

public actual fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("heapsort requires N-API addon")

public actual fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("mergesort requires N-API addon")
