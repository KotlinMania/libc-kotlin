@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

private var _ffi_static_ENVIRON: COpaquePointer? = null
public actual var ENVIRON: COpaquePointer?
    get() = _ffi_static_ENVIRON
    set(value) {
        _ffi_static_ENVIRON = value
    }

public actual val CLOCK_MONOTONIC: UByte
    get() = 0u

public actual val CLOCK_REALTIME: UByte
    get() = 0u

public actual fun exit(code: CInt): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_exit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_alignedAlloc(a, b)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_calloc(amt, amt2)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_malloc(amt)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mallocUsableSize(ptr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rand()

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_read(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_realloc(ptr?.value?.toCPointer<ByteVar>(), amt)?.let { COpaquePointer(it.toLong()) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setenv(k, v, a)

public actual fun unsetenv(k: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unsetenv(k)

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clearenv()

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_write(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun fopen(a: String?, b: String?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fopen(a, b)?.let { FILE(it.toLong()) }

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_freopen(a, b, f?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fclose(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fclose(f?.handle?.toCPointer<ByteVar>())

public actual fun remove(a: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_remove(a)

public actual fun rename(a: String?, b: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rename(a, b)

public actual fun feof(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_feof(f?.handle?.toCPointer<ByteVar>())

public actual fun ferror(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ferror(f?.handle?.toCPointer<ByteVar>())

public actual fun fflush(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fflush(f?.handle?.toCPointer<ByteVar>())

public actual fun clearerr(f: FILE?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clearerr(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fseek(f?.handle?.toCPointer<ByteVar>(), b, c)

public actual fun ftell(f: FILE?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftell(f?.handle?.toCPointer<ByteVar>())

public actual fun rewind(f: FILE?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rewind(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fsetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fread(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fwrite(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgetc(f?.handle?.toCPointer<ByteVar>())

public actual fun getc(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getc(f?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getchar()

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ungetc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun fputc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fputc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putchar(a: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putchar(a)

public actual fun fputs(a: String?, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fputs(a, f?.handle?.toCPointer<ByteVar>())

public actual fun puts(a: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_puts(a)

public actual fun perror(a: String?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_perror(a)
}

public actual fun srand(a: CUint) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_srand(a)
}

public actual fun atexit(a: AtexitACallback): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atexit(0L.toCPointer<ByteVar>())

public actual fun atQuickExit(a: AtexitACallback): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atQuickExit(0L.toCPointer<ByteVar>())

public actual fun quickExit(a: CInt): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_quickExit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixMemalign(a?.value?.toCPointer<ByteVar>(), b, c)

public actual fun randR(a: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_randR(a?.value?.toCPointer<ByteVar>())

public actual fun random(): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_random()

public actual fun srandom(a: CUint) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_srandom(a)
}

public actual fun putenv(a: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putenv(a?.value?.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clock()

public actual fun time(a: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_time(a?.value?.toCPointer<ByteVar>())

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_difftime(a, b)

public actual fun mktime(a: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mktime(a?.value?.toCPointer<ByteVar>())

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strftime(a?.value?.toCPointer<ByteVar>(), b, c, d?.value?.toCPointer<ByteVar>())

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gmtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gmtimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localtimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_asctimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ctimeR(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nanosleep(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clockGetres(a, b?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clockGettime(a, b?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_clockNanosleep(a, a2, b?.value?.toCPointer<ByteVar>(), c?.value?.toCPointer<ByteVar>())

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_toupper(c)

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strndup(cs, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun fprintf(stream: FILE?, format: String?): CInt =
    0

public actual fun printf(format: String?): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?): CInt =
    0

public actual fun scanf(format: String?): CInt =
    0

public actual fun sscanf(s: String?, format: String?): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getcharUnlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_putcharUnlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_shutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mkdir(path, mode)

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun open(path: String?, oflag: CInt): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_creat(path, mode)

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun fdopendir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_access(path, amode)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_close(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pathconf(path, name)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_rmdir(path)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sleep(secs)

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_unlink(c)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getrusage(resource, usage?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun times(buf: COpaquePointer?): ClockT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_times(buf?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun usleep(secs: CUint): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun timegm(tm: COpaquePointer?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_sysconf(name)

public actual fun ioctl(fd: CInt, request: CInt): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixFallocate(fd, offset, len)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_strcasestr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_faccessat(dirfd, pathname, mode, flags)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_labs(i)

public actual fun duplocale(base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_duplocale(base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_freelocale(loc.toLong().toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_newlocale(mask, locale, base.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_uselocale(loc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_schedYield()

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_chdir(dir)

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_nlLanginfoL(item, loc.toLong().toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRegisterPreopenedFd(fd, path)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcFdRenumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcUnlinkat(fd, path)

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRmdirat(fd, path)

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcFindRelpath(path, absPrefix?.value?.toCPointer<ByteVar>(), relativePath?.value?.toCPointer<ByteVar>(), relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcTell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd, path)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd, path)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdSymlinkat(target, dirfd, path)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdReadlinkat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdFaccessat(dirfd, path, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdOpenatNomode(dirfd, path, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdFstatat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdMkdiratNomode(dirfd, path)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdUtimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcNocwdOpendirat(dirfd, path)?.let { DIR(it.toLong()) }

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcAccess(pathname, mode, flags)

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcStat(pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcUtimens(pathname, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLink(oldpath, newpath, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLinkOldat(olddirfd, oldpath, newpath, flags)

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcLinkNewat(oldpath, newdirfd, newpath, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRenameOldat(olddirfd, oldpath, newpath)

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_wasilibcRenameNewat(oldpath, newdirfd, newpath)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4random()

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4randomBuf(a?.value?.toCPointer<ByteVar>(), b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_arc4randomUniform(a)

public actual fun errnoLocation(): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_errnoLocation()?.let { COpaquePointer(it.toLong()) }

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_fchmod(fd, mode)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadSelf()?.toLong() ?: 0L

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadEqual(t1.toLong().toCPointer<ByteVar>(), t2.toLong().toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadJoin(native.toLong().toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrGetstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrSetstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadAttrSetdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadDetach(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadKeyCreate(key?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadGetspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadSetspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadMutexattrSettype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondInit(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondWait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondTimedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondSignal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondBroadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondDestroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadCondattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockInit(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockRdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockTryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockWrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockTrywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_pthreadRwlockattrDestroy(attr?.value?.toCPointer<ByteVar>())
