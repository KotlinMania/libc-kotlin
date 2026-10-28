@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_a64l
import libc.cinterop.libc_abs
import libc.cinterop.libc_access
import libc.cinterop.libc_atoi
import libc.cinterop.libc_atol
import libc.cinterop.libc_atoll
import libc.cinterop.libc_calloc
import libc.cinterop.libc_chdir
import libc.cinterop.libc_clearerr
import libc.cinterop.libc_close
import libc.cinterop.libc_dup
import libc.cinterop.libc_dup2
import libc.cinterop.libc_fclose
import libc.cinterop.libc_fdopen
import libc.cinterop.libc_feof
import libc.cinterop.libc_ferror
import libc.cinterop.libc_fflush
import libc.cinterop.libc_ffs
import libc.cinterop.libc_fgetc
import libc.cinterop.libc_fileno
import libc.cinterop.libc_fopen
import libc.cinterop.libc_fputc
import libc.cinterop.libc_fputs
import libc.cinterop.libc_free
import libc.cinterop.libc_freopen
import libc.cinterop.libc_fseek
import libc.cinterop.libc_fseeko
import libc.cinterop.libc_ftell
import libc.cinterop.libc_ftello
import libc.cinterop.libc_ftrylockfile
import libc.cinterop.libc_getc
import libc.cinterop.libc_getchar
import libc.cinterop.libc_getenv
import libc.cinterop.libc_getpid
import libc.cinterop.libc_getsubopt
import libc.cinterop.libc_getw
import libc.cinterop.libc_isalnum
import libc.cinterop.libc_isalpha
import libc.cinterop.libc_isblank
import libc.cinterop.libc_iscntrl
import libc.cinterop.libc_isdigit
import libc.cinterop.libc_isgraph
import libc.cinterop.libc_islower
import libc.cinterop.libc_isprint
import libc.cinterop.libc_ispunct
import libc.cinterop.libc_isspace
import libc.cinterop.libc_isupper
import libc.cinterop.libc_isxdigit
import libc.cinterop.libc_labs
import libc.cinterop.libc_llabs
import libc.cinterop.libc_lrand48
import libc.cinterop.libc_lseek
import libc.cinterop.libc_malloc
import libc.cinterop.libc_mblen
import libc.cinterop.libc_memalign
import libc.cinterop.libc_mkdir
import libc.cinterop.libc_mkostemp
import libc.cinterop.libc_mkostemps
import libc.cinterop.libc_mkstemp
import libc.cinterop.libc_mrand48
import libc.cinterop.libc_perror
import libc.cinterop.libc_putc
import libc.cinterop.libc_putchar
import libc.cinterop.libc_puts
import libc.cinterop.libc_putw
import libc.cinterop.libc_radixsort
import libc.cinterop.libc_raise
import libc.cinterop.libc_rand
import libc.cinterop.libc_random
import libc.cinterop.libc_remove
import libc.cinterop.libc_rename
import libc.cinterop.libc_rewind
import libc.cinterop.libc_rmdir
import libc.cinterop.libc_setenv
import libc.cinterop.libc_setlocale
import libc.cinterop.libc_setvbuf
import libc.cinterop.libc_sradixsort
import libc.cinterop.libc_srand
import libc.cinterop.libc_strcasecmp
import libc.cinterop.libc_strchr
import libc.cinterop.libc_strcmp
import libc.cinterop.libc_strcoll
import libc.cinterop.libc_strcpy
import libc.cinterop.libc_strcspn
import libc.cinterop.libc_strdup
import libc.cinterop.libc_strerror
import libc.cinterop.libc_strlcat
import libc.cinterop.libc_strlcpy
import libc.cinterop.libc_strlen
import libc.cinterop.libc_strncasecmp
import libc.cinterop.libc_strncmp
import libc.cinterop.libc_strnlen
import libc.cinterop.libc_strpbrk
import libc.cinterop.libc_strrchr
import libc.cinterop.libc_strspn
import libc.cinterop.libc_strstr
import libc.cinterop.libc_tmpfile
import libc.cinterop.libc_tmpnam
import libc.cinterop.libc_tolower
import libc.cinterop.libc_toupper
import libc.cinterop.libc_ungetc
import libc.cinterop.libc_unsetenv
import libc.cinterop.libc_usleep

public actual fun isalnum(c: Int): Int = libc.cinterop.libc_isalnum(c)

public actual fun isalpha(c: Int): Int = libc.cinterop.libc_isalpha(c)

public actual fun iscntrl(c: Int): Int = libc.cinterop.libc_iscntrl(c)

public actual fun isdigit(c: Int): Int = libc.cinterop.libc_isdigit(c)

public actual fun isgraph(c: Int): Int = libc.cinterop.libc_isgraph(c)

public actual fun islower(c: Int): Int = libc.cinterop.libc_islower(c)

public actual fun isprint(c: Int): Int = libc.cinterop.libc_isprint(c)

public actual fun ispunct(c: Int): Int = libc.cinterop.libc_ispunct(c)

public actual fun isspace(c: Int): Int = libc.cinterop.libc_isspace(c)

public actual fun isupper(c: Int): Int = libc.cinterop.libc_isupper(c)

public actual fun isxdigit(c: Int): Int = libc.cinterop.libc_isxdigit(c)

public actual fun isblank(c: Int): Int = libc.cinterop.libc_isblank(c)

public actual fun tolower(c: Int): Int = libc.cinterop.libc_tolower(c)

public actual fun toupper(c: Int): Int = libc.cinterop.libc_toupper(c)

public actual fun getStdioFile(fileno: Int): FILE? =
    throw UnsupportedOperationException("getStdioFile requires manual FFI bridge — not yet implemented")

public actual fun clearerr(arg1: FILE?) {
    if (arg1 == null) return
    val arg1Ptr: CPointer<ByteVar>? = arg1.handle.toCPointer()
    libc_clearerr(arg1Ptr)
}

public actual fun fclose(arg1: FILE?): Int =
    libc.cinterop.libc_fclose(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun feof(arg1: FILE?): Int =
    libc.cinterop.libc_feof(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun ferror(arg1: FILE?): Int =
    libc.cinterop.libc_ferror(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fflush(arg1: FILE?): Int =
    libc.cinterop.libc_fflush(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fgetc(arg1: FILE?): Int =
    libc.cinterop.libc_fgetc(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fgets(arg1: String?, arg2: Int, arg3: FILE?): String? =
    throw UnsupportedOperationException("fgets requires manual FFI bridge — not yet implemented")

public actual fun fopen(arg1: String?, arg2: String?): FILE? {
    if (arg1 == null) return null
    if (arg2 == null) return null
    val result = libc_fopen(arg1, arg2)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fprintf requires manual FFI bridge — not yet implemented")

public actual fun fputc(arg1: Int, arg2: FILE?): Int =
    libc.cinterop.libc_fputc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fputs(arg1: String?, arg2: FILE?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_fputs(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun fread(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fread requires manual FFI bridge — not yet implemented")

public actual fun freopen(arg1: String?, arg2: String?, arg3: FILE?): FILE? {
    if (arg2 == null) return null
    if (arg3 == null) return null
    val filePtr: CPointer<ByteVar>? = arg3.handle.toCPointer()
    val result = libc_freopen(arg1, arg2, filePtr)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fscanf requires manual FFI bridge — not yet implemented")

public actual fun fseek(arg1: FILE?, arg2: Long, arg3: Int): Int =
    libc.cinterop.libc_fseek(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3)

public actual fun ftell(arg1: FILE?): Long =
    libc.cinterop.libc_ftell(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fwrite(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: FILE?): ULong =
    throw UnsupportedOperationException("fwrite requires FFI bridge")

public actual fun getc(arg1: FILE?): Int =
    libc.cinterop.libc_getc(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getchar(): Int = libc.cinterop.libc_getchar()

public actual fun perror(arg1: String?) {
    if (arg1 == null) return
    libc_perror(arg1)
}

public actual fun printf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("printf requires manual FFI bridge — not yet implemented")

public actual fun putc(arg1: Int, arg2: FILE?): Int =
    libc.cinterop.libc_putc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun putchar(arg1: Int): Int = libc.cinterop.libc_putchar(arg1)

public actual fun puts(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_puts(arg1)
}

public actual fun remove(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_remove(arg1)
}

public actual fun rewind(arg1: FILE?) {
    if (arg1 == null) return
    val streamPtr: CPointer<ByteVar>? = arg1.handle.toCPointer()
    libc_rewind(streamPtr)
}

public actual fun scanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("scanf requires manual FFI bridge — not yet implemented")

public actual fun setbuf(arg1: FILE?, arg2: String?): Unit = throw UnsupportedOperationException("setbuf requires manual FFI bridge — not yet implemented")

public actual fun setvbuf(arg1: FILE?, arg2: String?, arg3: Int, arg4: ULong): Int =
    libc.cinterop.libc_setvbuf(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3, arg4)

public actual fun sscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sscanf requires manual FFI bridge — not yet implemented")

public actual fun tmpfile(): FILE? {
    val result = libc_tmpfile()
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun ungetc(arg1: Int, arg2: FILE?): Int =
    libc.cinterop.libc_ungetc(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun vfprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfprintf requires manual FFI bridge — not yet implemented")

public actual fun vprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("vprintf requires manual FFI bridge — not yet implemented")

public actual fun gets(arg1: String?): String? =
    throw UnsupportedOperationException("gets requires manual FFI bridge — not yet implemented")

public actual fun sprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sprintf requires manual FFI bridge — not yet implemented")

public actual fun tmpnam(arg1: String?): String? =
    memScoped {
        val buf = allocArray<ByteVar>(1024)
        val result = libc.cinterop.libc_tmpnam(buf)
        result?.toKString()
    }

public actual fun vsprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsprintf requires manual FFI bridge — not yet implemented")

public actual fun rename(arg1: String?, arg2: String?): Int {
    if (arg1 == null) return -1
    if (arg2 == null) return -1
    return libc.cinterop.libc_rename(arg1, arg2)
}

public actual fun asiprintf(arg1: COpaquePointer?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("asiprintf requires manual FFI bridge — not yet implemented")

public actual fun fiprintf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiprintf requires manual FFI bridge — not yet implemented")

public actual fun fiscanf(arg1: FILE?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("fiscanf requires manual FFI bridge — not yet implemented")

public actual fun iprintf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iprintf requires manual FFI bridge — not yet implemented")

public actual fun iscanf(arg1: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("iscanf requires manual FFI bridge — not yet implemented")

public actual fun siprintf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siprintf requires manual FFI bridge — not yet implemented")

public actual fun siscanf(arg1: String?, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("siscanf requires manual FFI bridge — not yet implemented")

public actual fun sniprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("sniprintf requires manual FFI bridge — not yet implemented")

public actual fun vasiprintf(arg1: COpaquePointer?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vasiprintf requires manual FFI bridge — not yet implemented")

public actual fun vfiprintf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiprintf requires manual FFI bridge — not yet implemented")

public actual fun vfiscanf(arg1: FILE?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vfiscanf requires manual FFI bridge — not yet implemented")

public actual fun viprintf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viprintf requires manual FFI bridge — not yet implemented")

public actual fun viscanf(arg1: String?, arg2: String?): Int =
    throw UnsupportedOperationException("viscanf requires manual FFI bridge — not yet implemented")

public actual fun vsiprintf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiprintf requires manual FFI bridge — not yet implemented")

public actual fun vsiscanf(arg1: String?, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vsiscanf requires manual FFI bridge — not yet implemented")

public actual fun vsniprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsniprintf requires manual FFI bridge — not yet implemented")

public actual fun vdiprintf(arg1: Int, arg2: String?, arg3: String?): Int =
    throw UnsupportedOperationException("vdiprintf requires manual FFI bridge — not yet implemented")

public actual fun diprintf(arg1: Int, arg2: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("diprintf requires manual FFI bridge — not yet implemented")

public actual fun fgetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fgetpos requires manual FFI bridge — not yet implemented")

public actual fun fsetpos(arg1: FILE?, arg2: Long?): Int =
    throw UnsupportedOperationException("fsetpos requires manual FFI bridge — not yet implemented")

public actual fun fdopen(arg1: Int, arg2: String?): FILE? {
    val result = libc_fdopen(arg1, arg2)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun fileno(arg1: FILE?): Int =
    libc.cinterop.libc_fileno(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun flockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("flockfile requires manual FFI bridge — not yet implemented")

public actual fun ftrylockfile(arg1: FILE?): Int =
    libc.cinterop.libc_ftrylockfile(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun funlockfile(arg1: FILE?): Unit = throw UnsupportedOperationException("funlockfile requires manual FFI bridge — not yet implemented")

public actual fun getcUnlocked(arg1: FILE?): Int =
    throw UnsupportedOperationException("getcUnlocked requires manual FFI bridge — not yet implemented")

public actual fun getcharUnlocked(): Int =
    throw UnsupportedOperationException("getcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcUnlocked(arg1: Int, arg2: FILE?): Int =
    throw UnsupportedOperationException("putcUnlocked requires manual FFI bridge — not yet implemented")

public actual fun putcharUnlocked(arg1: Int): Int =
    throw UnsupportedOperationException("putcharUnlocked requires manual FFI bridge — not yet implemented")

public actual fun snprintf(arg1: String?, arg2: ULong, arg3: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("snprintf requires manual FFI bridge — not yet implemented")

public actual fun vsnprintf(arg1: String?, arg2: ULong, arg3: String?, arg4: String?): Int =
    throw UnsupportedOperationException("vsnprintf requires manual FFI bridge — not yet implemented")

public actual fun getw(arg1: FILE?): Int =
    libc.cinterop.libc_getw(arg1?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun putw(arg1: Int, arg2: FILE?): Int =
    libc.cinterop.libc_putw(arg1, arg2?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun tempnam(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("tempnam requires manual FFI bridge — not yet implemented")

public actual fun fseeko(stream: FILE?, offset: Long, whence: Int): Int =
    libc.cinterop.libc_fseeko(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): Long =
    libc.cinterop.libc_ftello(stream?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun abs(arg1: Int): Int =
    libc.cinterop.libc_abs(arg1)

public actual fun atoi(arg1: String?): Int {
    if (arg1 == null) return 0
    return libc.cinterop.libc_atoi(arg1)
}

public actual fun atol(arg1: String?): Long =
    libc.cinterop.libc_atol(arg1)

public actual fun itoa(arg1: Int, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("itoa requires manual FFI bridge — not yet implemented")

public actual fun ltoa(arg1: Long, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ltoa requires manual FFI bridge — not yet implemented")

public actual fun ultoa(arg1: ULong, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("ultoa requires manual FFI bridge — not yet implemented")

public actual fun calloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    libc.cinterop.libc_calloc(arg1, arg2)?.let { COpaquePointer(it.toLong()) }

public actual fun free(arg1: COpaquePointer?) {
    if (arg1 == null) return
    val pPtr: CPointer<ByteVar>? = arg1.value.toCPointer()
    if (arg1.allocationAlignment != 0uL) libc.cinterop.libc_aligned_free(pPtr) else libc.cinterop.libc_free(pPtr)
}

public actual fun getenv(arg1: String?): String? {
    if (arg1 == null) return null
    val result = libc_getenv(arg1)
    return result?.toKString()
}

public actual fun labs(arg1: Long): Long =
    libc.cinterop.libc_labs(arg1)

public actual fun malloc(arg1: ULong): COpaquePointer? =
    libc.cinterop.libc_malloc(arg1)?.let { COpaquePointer(it.toLong()) }

public actual fun rand(): Int =
    libc.cinterop.libc_rand()

public actual fun realloc(arg1: COpaquePointer?, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("realloc requires FFI bridge")

public actual fun srand(arg1: UInt) {
    libc_srand(arg1)
}

public actual fun strtol(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtol requires FFI bridge")

public actual fun strtoul(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoul requires manual FFI bridge — not yet implemented")

public actual fun mblen(arg1: String?, arg2: ULong): Int =
    libc.cinterop.libc_mblen(arg1, arg2)

public actual fun mbstowcs(arg1: UInt?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("mbstowcs requires manual FFI bridge — not yet implemented")

public actual fun wctomb(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("wctomb requires manual FFI bridge — not yet implemented")

public actual fun mbtowc(arg1: UInt?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("mbtowc requires manual FFI bridge — not yet implemented")

public actual fun wcstombs(arg1: String?, arg2: UInt?, arg3: ULong): ULong =
    throw UnsupportedOperationException("wcstombs requires manual FFI bridge — not yet implemented")

public actual fun randR(arg1: UInt?): Int =
    throw UnsupportedOperationException("randR requires manual FFI bridge — not yet implemented")

public actual fun jrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("jrand48 requires manual FFI bridge — not yet implemented")

public actual fun lcong48(arg1: UShort?): Unit = throw UnsupportedOperationException("lcong48 requires manual FFI bridge — not yet implemented")

public actual fun lrand48(): Long =
    libc.cinterop.libc_lrand48()

public actual fun mrand48(): Long =
    libc.cinterop.libc_mrand48()

public actual fun nrand48(arg1: UShort?): Long =
    throw UnsupportedOperationException("nrand48 requires manual FFI bridge — not yet implemented")

public actual fun seed48(arg1: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 requires manual FFI bridge — not yet implemented")

public actual fun srand48(arg1: Long): Unit = throw UnsupportedOperationException("srand48 requires manual FFI bridge — not yet implemented")

public actual fun putenv(arg1: String?): Int =
    throw UnsupportedOperationException("putenv requires manual FFI bridge — not yet implemented")

public actual fun a64l(arg1: String?): Long =
    libc.cinterop.libc_a64l(arg1)

public actual fun l64a(arg1: Long): String? =
    throw UnsupportedOperationException("l64a requires manual FFI bridge — not yet implemented")

public actual fun random(): Long =
    libc.cinterop.libc_random()

public actual fun setstate(arg1: String?): String? =
    throw UnsupportedOperationException("setstate requires manual FFI bridge — not yet implemented")

public actual fun initstate(arg1: UInt, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("initstate requires manual FFI bridge — not yet implemented")

public actual fun srandom(arg1: UInt): Unit = throw UnsupportedOperationException("srandom requires manual FFI bridge — not yet implemented")

public actual fun mkostemp(arg1: String?, arg2: Int): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_mkostemp(arg1, arg2)
}

public actual fun mkostemps(arg1: String?, arg2: Int, arg3: Int): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_mkostemps(arg1, arg2, arg3)
}

public actual fun mkdtemp(arg1: String?): String? =
    throw UnsupportedOperationException("mkdtemp requires FFI bridge")

public actual fun mkstemp(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_mkstemp(arg1)
}

public actual fun mktemp(arg1: String?): String? =
    throw UnsupportedOperationException("mktemp requires manual FFI bridge — not yet implemented")

public actual fun atoll(arg1: String?): Long {
    if (arg1 == null) return 0
    val result = libc_atoll(arg1)
    return result
}

public actual fun llabs(arg1: Long): Long {
    val result = libc_llabs(arg1)
    return result
}

public actual fun strtoll(arg1: String?, arg2: COpaquePointer?, arg3: Int): Long =
    throw UnsupportedOperationException("strtoll requires manual FFI bridge — not yet implemented")

public actual fun strtoull(arg1: String?, arg2: COpaquePointer?, arg3: Int): ULong =
    throw UnsupportedOperationException("strtoull requires manual FFI bridge — not yet implemented")

public actual fun alignedAlloc(arg1: ULong, arg2: ULong): COpaquePointer? =
    throw UnsupportedOperationException("alignedAlloc requires FFI bridge")

public actual fun quickExit(arg1: Int): Unit = throw UnsupportedOperationException("quickExit requires manual FFI bridge — not yet implemented")

public actual fun setenv(arg1: String?, arg2: String?, arg3: Int): Int {
    if (arg1 == null) return -1
    if (arg2 == null) return -1
    return libc.cinterop.libc_setenv(arg1, arg2, arg3)
}

public actual fun unsetenv(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_unsetenv(arg1)
}

public actual fun humanizeNumber(arg1: String?, arg2: ULong, arg3: Long, arg4: String?, arg5: Int, arg6: Int): Int =
    throw UnsupportedOperationException("humanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun dehumanizeNumber(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("dehumanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun getenvR(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("getenvR requires manual FFI bridge — not yet implemented")

public actual fun radixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    libc.cinterop.libc_radixsort(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg4)

public actual fun sradixsort(arg1: COpaquePointer?, arg2: Int, arg3: COpaquePointer?, arg4: UInt): Int =
    libc.cinterop.libc_sradixsort(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2, arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg4)

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(arg1: String?): Unit = throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")

public actual fun strsuftoll(arg1: String?, arg2: String?, arg3: Long, arg4: Long): Long =
    throw UnsupportedOperationException("strsuftoll requires manual FFI bridge — not yet implemented")

public actual fun strsuftollx(arg1: String?, arg2: String?, arg3: Long, arg4: Long, arg5: String?, arg6: ULong): Long =
    throw UnsupportedOperationException("strsuftollx requires manual FFI bridge — not yet implemented")

public actual fun l64aR(arg1: Long, arg2: String?, arg3: Int): Int =
    throw UnsupportedOperationException("l64aR requires manual FFI bridge — not yet implemented")

public actual fun strtolL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtolL requires manual FFI bridge — not yet implemented")

public actual fun strtoulL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoulL requires manual FFI bridge — not yet implemented")

public actual fun strtollL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): Long =
    throw UnsupportedOperationException("strtollL requires manual FFI bridge — not yet implemented")

public actual fun strtoullL(arg1: String?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): ULong =
    throw UnsupportedOperationException("strtoullL requires manual FFI bridge — not yet implemented")

public actual fun mbCurMaxL(arg1: ULong): ULong =
    throw UnsupportedOperationException("mbCurMaxL requires manual FFI bridge — not yet implemented")

public actual fun mblenL(arg1: String?, arg2: ULong, arg3: ULong): Int =
    throw UnsupportedOperationException("mblenL requires manual FFI bridge — not yet implemented")

public actual fun mbstowcsL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("mbstowcsL requires manual FFI bridge — not yet implemented")

public actual fun wctombL(arg1: String?, arg2: UInt, arg3: ULong): Int =
    throw UnsupportedOperationException("wctombL requires manual FFI bridge — not yet implemented")

public actual fun mbtowcL(arg1: UInt?, arg2: String?, arg3: ULong, arg4: ULong): Int =
    throw UnsupportedOperationException("mbtowcL requires manual FFI bridge — not yet implemented")

public actual fun wcstombsL(arg1: String?, arg2: UInt?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("wcstombsL requires manual FFI bridge — not yet implemented")

public actual fun memchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memchr requires FFI bridge")

public actual fun memcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("memcmp requires FFI bridge")

public actual fun memcpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memcpy requires FFI bridge")

public actual fun memmove(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmove requires FFI bridge")

public actual fun memset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memset requires FFI bridge")

public actual fun strcat(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcat requires FFI bridge")

public actual fun strchr(arg1: String?, arg2: Int): String? {
    if (arg1 == null) return null
    return memScoped {
        val cstr = arg1.cstr.ptr
        val result = libc_strchr(cstr, arg2)
        result?.toKString()
    }
}

public actual fun strcmp(arg1: String?, arg2: String?): Int {
    if (arg1 == null) return -1
    if (arg2 == null) return -1
    return libc.cinterop.libc_strcmp(arg1, arg2)
}

public actual fun strcoll(arg1: String?, arg2: String?): Int {
    if (arg1 == null) return -1
    if (arg2 == null) return -1
    return libc.cinterop.libc_strcoll(arg1, arg2)
}

public actual fun strcpy(arg1: String?, arg2: String?): String? {
    if (arg2 == null) return null
    return memScoped {
        val srcBuf = arg2.cstr.ptr
        val len = arg2.length + 1
        val dstBuf = allocArray<ByteVar>(len)
        libc.cinterop.libc_strcpy(dstBuf, srcBuf)
        dstBuf.toKString()
    }
}

public actual fun strcspn(arg1: String?, arg2: String?): ULong =
    libc.cinterop.libc_strcspn(arg1, arg2)

public actual fun strerror(arg1: Int): String? {
    val result = libc_strerror(arg1)
    return result?.toKString()
}

public actual fun strlen(arg1: String?): ULong =
    libc.cinterop.libc_strlen(arg1)

public actual fun strncat(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncat requires FFI bridge")

public actual fun strncmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    libc.cinterop.libc_strncmp(arg1, arg2, arg3)

public actual fun strncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("strncpy requires FFI bridge")

public actual fun strpbrk(arg1: String?, arg2: String?): String? {
    if (arg1 == null) return null
    if (arg2 == null) return null
    return memScoped {
        val cstr = arg1.cstr.ptr
        val caccept = arg2.cstr.ptr
        val result = libc_strpbrk(cstr, caccept)
        result?.toKString()
    }
}

public actual fun strrchr(arg1: String?, arg2: Int): String? {
    if (arg1 == null) return null
    return memScoped {
        val cstr = arg1.cstr.ptr
        val result = libc_strrchr(cstr, arg2)
        result?.toKString()
    }
}

public actual fun strspn(arg1: String?, arg2: String?): ULong =
    libc.cinterop.libc_strspn(arg1, arg2)

public actual fun strstr(arg1: String?, arg2: String?): String? {
    if (arg1 == null) return null
    if (arg2 == null) return null
    return memScoped {
        val cstr = arg1.cstr.ptr
        val nstr = arg2.cstr.ptr
        val result = libc.cinterop.libc_strstr(cstr, nstr)
        result?.toKString()
    }
}

public actual fun strtok(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strtok requires FFI bridge")

public actual fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String? =
    throw UnsupportedOperationException("strtokR requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(arg1: Int, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun strxfrm(arg1: String?, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("strxfrm requires FFI bridge")

public actual fun memccpy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: Int, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memccpy requires FFI bridge")

public actual fun strdup(arg1: String?): String? {
    if (arg1 == null) return null
    return memScoped {
        val cstr = arg1.cstr.ptr
        val dup = libc_strdup(cstr)
        val result = dup?.toKString()
        if (dup != null) libc_free(dup)
        result
    }
}

public actual fun stpcpy(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("stpcpy requires manual FFI bridge — not yet implemented")

public actual fun stpncpy(arg1: String?, arg2: String?, arg3: ULong): String? =
    throw UnsupportedOperationException("stpncpy requires manual FFI bridge — not yet implemented")

public actual fun strnlen(arg1: String?, arg2: ULong): ULong =
    libc.cinterop.libc_strnlen(arg1, arg2)

public actual fun memmem(arg1: COpaquePointer?, arg2: ULong, arg3: COpaquePointer?, arg4: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun strcasestr(arg1: String?, arg2: String?): String? =
    throw UnsupportedOperationException("strcasestr requires manual FFI bridge — not yet implemented")

public actual fun strlcat(arg1: String?, arg2: String?, arg3: ULong): ULong =
    libc.cinterop.libc_strlcat(arg1, arg2, arg3)

public actual fun strlcpy(arg1: String?, arg2: String?, arg3: ULong): ULong =
    libc.cinterop.libc_strlcpy(arg1, arg2, arg3)

public actual fun strsep(arg1: COpaquePointer?, arg2: String?): String? =
    throw UnsupportedOperationException("strsep requires manual FFI bridge — not yet implemented")

public actual fun stresep(arg1: COpaquePointer?, arg2: String?, arg3: Int): String? =
    throw UnsupportedOperationException("stresep requires manual FFI bridge — not yet implemented")

public actual fun strndup(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("strndup requires manual FFI bridge — not yet implemented")

public actual fun memrchr(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun explicitMemset(arg1: COpaquePointer?, arg2: Int, arg3: ULong): COpaquePointer? =
    throw UnsupportedOperationException("explicitMemset requires manual FFI bridge — not yet implemented")

public actual fun consttimeMemequal(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal requires manual FFI bridge — not yet implemented")

public actual fun strcollL(arg1: String?, arg2: String?, arg3: ULong): Int =
    throw UnsupportedOperationException("strcollL requires manual FFI bridge — not yet implemented")

public actual fun strxfrmL(arg1: String?, arg2: String?, arg3: ULong, arg4: ULong): ULong =
    throw UnsupportedOperationException("strxfrmL requires manual FFI bridge — not yet implemented")

public actual fun strerrorL(arg1: Int, arg2: ULong): String? =
    throw UnsupportedOperationException("strerrorL requires manual FFI bridge — not yet implemented")

public actual fun bcmp(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Int =
    throw UnsupportedOperationException("bcmp requires manual FFI bridge — not yet implemented")

public actual fun bcopy(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong): Unit = throw UnsupportedOperationException("bcopy requires manual FFI bridge — not yet implemented")

public actual fun bzero(arg1: COpaquePointer?, arg2: ULong): Unit = throw UnsupportedOperationException("bzero requires manual FFI bridge — not yet implemented")

public actual fun ffs(arg1: Int): Int =
    libc.cinterop.libc_ffs(arg1)

public actual fun rindex(arg1: String?, arg2: Int): String? =
    throw UnsupportedOperationException("rindex requires manual FFI bridge — not yet implemented")

public actual fun strcasecmp(arg1: String?, arg2: String?): Int {
    if (arg1 == null) return -1
    if (arg2 == null) return -1
    return libc.cinterop.libc_strcasecmp(arg1, arg2)
}

public actual fun strncasecmp(arg1: String?, arg2: String?, arg3: ULong): Int =
    libc.cinterop.libc_strncasecmp(arg1, arg2, arg3)

public actual fun raise(arg1: Int): Int = libc.cinterop.libc_raise(arg1)

public actual fun asctime(arg1: Tm?): String? =
    throw UnsupportedOperationException("asctime requires manual FFI bridge — not yet implemented")

public actual fun ctime(arg1: Long?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun gmtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("gmtime requires manual FFI bridge — not yet implemented")

public actual fun localtime(arg1: Long?): Tm? =
    throw UnsupportedOperationException("localtime requires manual FFI bridge — not yet implemented")

public actual fun time(arg1: Long?): Long =
    throw UnsupportedOperationException("time requires manual FFI bridge — not yet implemented")

public actual fun mktime(arg1: Tm?): Long =
    throw UnsupportedOperationException("mktime requires manual FFI bridge — not yet implemented")

public actual fun strftime(arg1: String?, arg2: ULong, arg3: String?, arg4: Tm?): ULong =
    throw UnsupportedOperationException("strftime requires manual FFI bridge — not yet implemented")

public actual fun utime(arg1: String?, arg2: Long?): Int =
    throw UnsupportedOperationException("utime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(arg1: Tm?, arg2: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(arg1: Long?, arg2: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun gmtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("gmtimeR requires manual FFI bridge — not yet implemented")

public actual fun localtimeR(arg1: Long?, arg2: Tm?): Tm? =
    throw UnsupportedOperationException("localtimeR requires manual FFI bridge — not yet implemented")

public actual fun stat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("stat requires manual FFI bridge — not yet implemented")

public actual fun lstat(arg1: String?, arg2: Stat?): Int =
    throw UnsupportedOperationException("lstat requires manual FFI bridge — not yet implemented")

public actual fun fstat(arg1: Int, arg2: Stat?): Int =
    throw UnsupportedOperationException("fstat requires manual FFI bridge — not yet implemented")

public actual fun chmod(arg1: String?, arg2: UInt): Int =
    throw UnsupportedOperationException("chmod requires FFI bridge")

public actual fun mkdir(arg1: String?, arg2: UInt): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_mkdir(arg1, arg2.toInt())
}

public actual fun open(arg1: String?, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("open requires manual FFI bridge — not yet implemented")

public actual fun creat(arg1: String?, arg2: Int): Int =
    throw UnsupportedOperationException("creat requires FFI bridge")

public actual fun close(arg1: Int): Int = libc.cinterop.libc_close(arg1)

public actual fun read(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("read requires FFI bridge")

public actual fun write(arg1: Int, arg2: COpaquePointer?, arg3: Int): Int =
    throw UnsupportedOperationException("write requires manual FFI bridge — UInt/ULong type mismatch")

public actual fun unlink(arg1: String?): Int =
    throw UnsupportedOperationException("unlink requires FFI bridge")

public actual fun tell(arg1: Int): Long =
    throw UnsupportedOperationException("tell requires manual FFI bridge — not yet implemented")

public actual fun dup(arg1: Int): Int = libc.cinterop.libc_dup(arg1)

public actual fun dup2(arg1: Int, arg2: Int): Int = libc.cinterop.libc_dup2(arg1, arg2)

public actual fun access(arg1: String?, arg2: Int): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_access(arg1, arg2)
}

public actual fun rmdir(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_rmdir(arg1)
}

public actual fun chdir(arg1: String?): Int {
    if (arg1 == null) return -1
    return libc.cinterop.libc_chdir(arg1)
}

public actual fun getwd(arg1: String?): String? =
    throw UnsupportedOperationException("getwd requires manual FFI bridge — not yet implemented")

public actual fun getcwd(arg1: String?, arg2: ULong): String? =
    throw UnsupportedOperationException("getcwd requires FFI bridge")

public actual fun getopt(arg1: Int, arg2: COpaquePointer?, arg3: String?): Int =
    throw UnsupportedOperationException("getopt requires manual FFI bridge — not yet implemented")

public actual fun getsubopt(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): Int =
    libc.cinterop.libc_getsubopt(arg1?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg2?.value?.toCPointer<kotlinx.cinterop.ByteVar>(), arg3?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun fcntl(arg1: Int, arg2: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("fcntl requires manual FFI bridge — not yet implemented")

public actual fun getpid(): Int =
    libc.cinterop.libc_getpid()

public actual fun usleep(arg1: UInt): Int =
    libc.cinterop.libc_usleep(arg1)

public actual fun localeconv(): Lconv? =
    throw UnsupportedOperationException("localeconv requires manual FFI bridge — not yet implemented")

public actual fun setlocale(arg1: Int, arg2: String?): String? {
    val result = libc_setlocale(arg1, arg2)
    return result?.toKString()
}

public actual fun duplocale(arg1: ULong): ULong =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(arg1: ULong): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun localeconvL(arg1: ULong): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(arg1: Int, arg2: String?, arg3: ULong): ULong =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfo(item: Long): String? =
    throw UnsupportedOperationException("nlLanginfo requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: Long, locale: ULong): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    libc.cinterop.libc_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun lseek(arg1: Int, arg2: Long, arg3: Int): Long =
    libc.cinterop.libc_lseek(arg1, arg2, arg3)

public actual fun atexit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atexit requires manual FFI bridge — not yet implemented")

public actual fun bsearch(arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: ULong, arg4: ULong, arg5: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("bsearch requires manual FFI bridge — not yet implemented")

public actual fun qsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsort requires manual FFI bridge — not yet implemented")

public actual fun atQuickExit(arg1: (() -> Unit)?): Int =
    throw UnsupportedOperationException("atQuickExit requires manual FFI bridge — not yet implemented")

public actual fun heapsort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("heapsort requires manual FFI bridge — not yet implemented")

public actual fun mergesort(arg1: COpaquePointer?, arg2: ULong, arg3: ULong, arg4: ((COpaquePointer?, COpaquePointer?) -> Int)?): Int =
    throw UnsupportedOperationException("mergesort requires manual FFI bridge — not yet implemented")
