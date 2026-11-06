@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun exit(code: CInt): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_exit(code)
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_abort()
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_aligned_alloc(a, b)?.let { COpaquePointer(it.toLong()) }

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_calloc(amt, amt2)?.let { COpaquePointer(it.toLong()) }

public actual fun free(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_free(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun getenv(s: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getenv(s)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(amt: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_malloc(amt)?.let { COpaquePointer(it.toLong()) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_malloc_usable_size(ptr?.value?.toCPointer<ByteVar>())

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rand()

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_read(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_realloc(ptr?.value?.toCPointer<ByteVar>(), amt)?.let { COpaquePointer(it.toLong()) }

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_setenv(k, v, a)

public actual fun unsetenv(k: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_unsetenv(k)

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clearenv()

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_write(fd, ptr?.value?.toCPointer<ByteVar>(), size)

public actual fun fopen(a: String?, b: String?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fopen(a, b)?.let { FILE(it.toLong()) }

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_freopen(a, b, f?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fclose(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fclose(f?.handle?.toCPointer<ByteVar>())

public actual fun remove(a: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_remove(a)

public actual fun rename(a: String?, b: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rename(a, b)

public actual fun feof(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_feof(f?.handle?.toCPointer<ByteVar>())

public actual fun ferror(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ferror(f?.handle?.toCPointer<ByteVar>())

public actual fun fflush(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fflush(f?.handle?.toCPointer<ByteVar>())

public actual fun clearerr(f: FILE?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clearerr(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fseek(f?.handle?.toCPointer<ByteVar>(), b, c)

public actual fun ftell(f: FILE?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ftell(f?.handle?.toCPointer<ByteVar>())

public actual fun rewind(f: FILE?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rewind(f?.handle?.toCPointer<ByteVar>())
}

public actual fun fgetpos(f: FILE?, pos: FposT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fgetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fsetpos(f: FILE?, pos: FposT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fsetpos(f?.handle?.toCPointer<ByteVar>(), pos?.value?.toCPointer<ByteVar>())

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fread(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fwrite(buf?.value?.toCPointer<ByteVar>(), a, b, f?.handle?.toCPointer<ByteVar>())

public actual fun fgetc(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fgetc(f?.handle?.toCPointer<ByteVar>())

public actual fun getc(f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getc(f?.handle?.toCPointer<ByteVar>())

public actual fun getchar(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getchar()

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ungetc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun fputc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fputc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putc(a: CInt, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_putc(a, f?.handle?.toCPointer<ByteVar>())

public actual fun putchar(a: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_putchar(a)

public actual fun fputs(a: String?, f: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fputs(a, f?.handle?.toCPointer<ByteVar>())

public actual fun puts(a: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_puts(a)

public actual fun perror(a: String?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_perror(a)
}

public actual fun srand(a: CUint) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_srand(a)
}

public actual fun atexit(a: AtexitACallback): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_atexit(a.toInt())

public actual fun atQuickExit(a: AtexitACallback): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_at_quick_exit(a.toInt())

public actual fun quickExit(a: CInt): Nothing {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_quick_exit(a)
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_posix_memalign(a?.value?.toCPointer<ByteVar>(), b, c)

public actual fun randR(a: CUint?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rand_r(a?.value?.toCPointer<ByteVar>())

public actual fun random(): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_random()

public actual fun srandom(a: CUint) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_srandom(a)
}

public actual fun putenv(a: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_putenv(a?.value?.toCPointer<ByteVar>())

public actual fun clock(): ClockT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clock()

public actual fun time(a: CLonglong?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_time(a?.value?.toCPointer<ByteVar>())

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_difftime(a, b)

public actual fun mktime(a: Tm?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_mktime(a?.value?.toCPointer<ByteVar>())

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: Tm?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strftime(a?.value?.toCPointer<ByteVar>(), b, c, d?.value?.toCPointer<ByteVar>())

public actual fun gmtime(a: CLonglong?): Tm? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_gmtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun gmtimeR(a: CLonglong?, b: Tm?): Tm? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_gmtime_r(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtime(a: CLonglong?): Tm? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_localtime(a?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun localtimeR(a: CLonglong?, b: Tm?): Tm? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_localtime_r(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun asctimeR(a: Tm?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_asctime_r(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ctimeR(a: CLonglong?, b: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ctime_r(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nanosleep(a: Timespec?, b: Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_nanosleep(a?.value?.toCPointer<ByteVar>(), b?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(a: ClockidT, b: Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clock_getres(a, b?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(a: ClockidT, b: Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clock_gettime(a, b?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: Timespec?, c: Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_clock_nanosleep(a, a2, b?.value?.toCPointer<ByteVar>(), c?.value?.toCPointer<ByteVar>())

public actual fun isalnum(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isalnum(c)

public actual fun isalpha(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isalpha(c)

public actual fun iscntrl(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_iscntrl(c)

public actual fun isdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isdigit(c)

public actual fun isgraph(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isgraph(c)

public actual fun islower(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_islower(c)

public actual fun isprint(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isprint(c)

public actual fun ispunct(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ispunct(c)

public actual fun isspace(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isspace(c)

public actual fun isupper(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isupper(c)

public actual fun isxdigit(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isxdigit(c)

public actual fun isblank(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isblank(c)

public actual fun tolower(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_tolower(c)

public actual fun toupper(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_toupper(c)

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_setvbuf(stream?.handle?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), mode, size)

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_setbuf(stream?.handle?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>())
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fgets(buf?.value?.toCPointer<ByteVar>(), n, stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun atof(s: String?): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_atof(s)

public actual fun atoi(s: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_atoi(s)

public actual fun atol(s: String?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_atol(s)

public actual fun atoll(s: String?): CLonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_atoll(s)

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtod(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtof(s, endp?.value?.toCPointer<ByteVar>())

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtol(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtoll(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtoul(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtoull(s, endp?.value?.toCPointer<ByteVar>(), base)

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcpy(dst?.value?.toCPointer<ByteVar>(), src)?.let { COpaquePointer(it.toLong()) }

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strncpy(dst?.value?.toCPointer<ByteVar>(), src, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcat(s?.value?.toCPointer<ByteVar>(), ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strncat(s?.value?.toCPointer<ByteVar>(), ct, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strcmp(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcmp(cs, ct)

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strncmp(cs, ct, n)

public actual fun strcoll(cs: String?, ct: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcoll(cs, ct)

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strrchr(cs, c)?.let { COpaquePointer(it.toLong()) }

public actual fun strspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strspn(cs, ct)

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcspn(cs, ct)

public actual fun strdup(cs: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strdup(cs)?.let { COpaquePointer(it.toLong()) }

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strndup(cs, n)?.let { COpaquePointer(it.toLong()) }

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strpbrk(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strstr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcasecmp(s1, s2)

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strncasecmp(s1, s2, n)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strlen(cs)

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strnlen(cs, maxlen)

public actual fun strerror(n: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strerror(n)?.let { COpaquePointer(it.toLong()) }

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strtok(s?.value?.toCPointer<ByteVar>(), t)?.let { COpaquePointer(it.toLong()) }

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strxfrm(s?.value?.toCPointer<ByteVar>(), ct, n)

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memcmp(cx?.value?.toCPointer<ByteVar>(), ct?.value?.toCPointer<ByteVar>(), n)

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memcpy(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memmove(dest?.value?.toCPointer<ByteVar>(), src?.value?.toCPointer<ByteVar>(), n)?.let { COpaquePointer(it.toLong()) }

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memset(dest?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun getcharUnlocked(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getchar_unlocked()

public actual fun putcharUnlocked(c: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_putchar_unlocked(c)

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_shutdown(socket, how)

public actual fun fstat(fildes: CInt, buf: Stat?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fstat(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_mkdir(path, mode)

public actual fun stat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_stat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fdopen(fd, mode)?.let { FILE(it.toLong()) }

public actual fun fileno(stream: FILE?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fileno(stream?.handle?.toCPointer<ByteVar>())

public actual fun creat(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_creat(path, mode)

public actual fun opendir(dirname: String?): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_opendir(dirname)?.let { DIR(it.toLong()) }

public actual fun fdopendir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fdopendir(fd)?.let { DIR(it.toLong()) }

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_readdir(dirp?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closedir(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_closedir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun rewinddir(dirp: DIR?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rewinddir(dirp?.handle?.toCPointer<ByteVar>())
}

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: Stat?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fstatat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_mkdirat(dirfd, pathname, mode)

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_readlinkat(dirfd, pathname, buf?.value?.toCPointer<ByteVar>(), bufsiz)

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_symlinkat(target, newdirfd, linkpath)

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_unlinkat(dirfd, pathname, flags)

public actual fun access(path: String?, amode: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_access(path, amode)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_close(fd)

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fpathconf(filedes, name)

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getopt(argc, argv?.value?.toCPointer<ByteVar>(), optstr)

public actual fun isatty(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_isatty(fd)

public actual fun link(src: String?, dst: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_link(src, dst)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_lseek(fd, offset, whence)

public actual fun pathconf(path: String?, name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pathconf(path, name)

public actual fun rmdir(path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_rmdir(path)

public actual fun sleep(secs: CUint): CUint =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_sleep(secs)

public actual fun unlink(c: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_unlink(c)

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pread(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pwrite(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun lstat(path: String?, buf: Stat?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_lstat(path, buf?.value?.toCPointer<ByteVar>())

public actual fun fsync(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fsync(fd)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fdatasync(fd)

public actual fun symlink(path1: String?, path2: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_symlink(path1, path2)

public actual fun truncate(path: String?, length: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_truncate(path, length)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ftruncate(fd, length)

public actual fun getrusage(resource: CInt, usage: Rusage?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getrusage(resource, usage?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_times(buf?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun usleep(secs: CUint): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_usleep(secs)

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_send(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_recv(socket, buf?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_poll(fds?.value?.toCPointer<ByteVar>(), nfds, timeout)

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_setlocale(category, locale)?.let { COpaquePointer(it.toLong()) }

public actual fun localeconv(): Lconv? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_localeconv()?.let { COpaquePointer(it.toLong()) }

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_readlink(path, buf?.value?.toCPointer<ByteVar>(), bufsz)

public actual fun timegm(tm: io.github.kotlinmania.libc.Tm?): TimeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_timegm(tm?.value?.toCPointer<ByteVar>())

public actual fun sysconf(name: CInt): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_sysconf(name)

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fseeko(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun ftello(stream: FILE?): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_ftello(stream?.handle?.toCPointer<ByteVar>())

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_posix_fallocate(fd, offset, len)

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_strcasestr(cs, ct)?.let { COpaquePointer(it.toLong()) }

public actual fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getline(lineptr?.value?.toCPointer<ByteVar>(), n?.value?.toCPointer<ByteVar>(), stream?.handle?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun pwritev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_posix_fadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_memrchr(cx?.value?.toCPointer<ByteVar>(), c, n)?.let { COpaquePointer(it.toLong()) }

public actual fun abs(i: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_abs(i)

public actual fun labs(i: CLong): CLong =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_labs(i)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_duplocale(base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun schedYield(): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_sched_yield()

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_getcwd(buf?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun chdir(dir: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_chdir(dir)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_nl_langinfo_l(item, loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun select(nfds: CInt, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_select(nfds, readfds?.value?.toCPointer<ByteVar>(), writefds?.value?.toCPointer<ByteVar>(), errorfds?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_register_preopened_fd(fd, path)

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_fd_renumber(fd, newfd)

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_unlinkat(fd, path)

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_rmdirat(fd, path)

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_find_relpath(path, absPrefix?.value?.toCPointer<ByteVar>(), relativePath?.value?.toCPointer<ByteVar>(), relativePathLen)

public actual fun wasilibcTell(fd: CInt): OffT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_tell(fd)

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_wasilibc_unlinkat(dirfd, path)

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_wasilibc_rmdirat(dirfd, path)

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_linkat(olddirfd, oldpath, newdirfd, newpath, flags)

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_symlinkat(target, dirfd, path)

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_readlinkat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_faccessat(dirfd, path, mode, flags)

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_renameat(olddirfd, oldpath, newdirfd, newpath)

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_openat_nomode(dirfd, path, flags)

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: Stat?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_fstatat(dirfd, path, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_mkdirat_nomode(dirfd, path)

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_nocwd_opendirat(dirfd, path)?.let { DIR(it.toLong()) }

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_access(pathname, mode, flags)

public actual fun wasilibcStat(pathname: String?, buf: Stat?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_stat(pathname, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcUtimens(pathname: String?, times: io.github.kotlinmania.libc.Timespec?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_utimens(pathname, times?.value?.toCPointer<ByteVar>(), flags)

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_link(oldpath, newpath, flags)

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_link_oldat(olddirfd, oldpath, newpath, flags)

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_link_newat(oldpath, newdirfd, newpath, flags)

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_rename_oldat(olddirfd, oldpath, newpath)

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_wasilibc_rename_newat(oldpath, newdirfd, newpath)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_arc4random()

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_arc4random_buf(a?.value?.toCPointer<ByteVar>(), b)
}

public actual fun arc4randomUniform(a: UInt): UInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_arc4random_uniform(a)

public actual fun errnoLocation(): CInt? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_errno_location()?.let { COpaquePointer(it.toLong()) }

public actual fun chmod(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_chmod(path, mode)

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_fchmod(fd, mode)

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_realpath(pathname, resolved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSelf(): PthreadT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_self()?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadCreate(native: COpaquePointer?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_equal(t1?.value?.toCPointer<ByteVar>(), t2?.value?.toCPointer<ByteVar>())

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_join(native?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_attr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_attr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: ULong?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_attr_getstacksize(attr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_attr_setstacksize(attr?.value?.toCPointer<ByteVar>(), stackSize)

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_attr_setdetachstate(attr?.value?.toCPointer<ByteVar>(), state)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_detach(thread?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_key_create(key?.value?.toCPointer<ByteVar>(), dtor?.value?.toCPointer<ByteVar>())

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_key_delete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_getspecific(key)?.let { COpaquePointer(it.toLong()) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_setspecific(key, value?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutex_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutex_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexLock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutex_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutex_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutex_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutexattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutexattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_mutexattr_settype(attr?.value?.toCPointer<ByteVar>(), type)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_init(cond?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_wait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_timedwait(cond?.value?.toCPointer<ByteVar>(), lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_signal(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_broadcast(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_cond_destroy(cond?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_condattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_condattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockInit(lock: PthreadRwlockT?, attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_init(lock?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockDestroy(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockRdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_rdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTryrdlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_tryrdlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockWrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_wrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTrywrlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_trywrlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockUnlock(lock: PthreadRwlockT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlock_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlockattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_wasi_mod_pthread_rwlockattr_destroy(attr?.value?.toCPointer<ByteVar>())
