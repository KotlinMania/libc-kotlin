@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows

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

private val _windowsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun isalnum(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isalnum(c) as Int) else 0

public actual fun isalpha(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isalpha(c) as Int) else 0

public actual fun iscntrl(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_iscntrl(c) as Int) else 0

public actual fun isdigit(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isdigit(c) as Int) else 0

public actual fun isgraph(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isgraph(c) as Int) else 0

public actual fun islower(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_islower(c) as Int) else 0

public actual fun isprint(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isprint(c) as Int) else 0

public actual fun ispunct(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_ispunct(c) as Int) else 0

public actual fun isspace(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isspace(c) as Int) else 0

public actual fun isupper(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isupper(c) as Int) else 0

public actual fun isxdigit(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isxdigit(c) as Int) else 0

public actual fun isblank(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isblank(c) as Int) else 0

public actual fun tolower(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_tolower(c) as Int) else 0

public actual fun toupper(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_toupper(c) as Int) else 0

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_qsort((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString())
    }
}

public actual fun qsortS(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback1?, arg: COpaquePointer?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_qsortS((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString(), (arg?.value ?: 0L).toString())
    }
}

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fopen(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_freopen(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fflush(file: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fflush((file?.handle ?: 0L).toString()) as Int) else 0

public actual fun fclose(file: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fclose((file?.handle ?: 0L).toString()) as Int) else 0

public actual fun remove(filename: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_remove(filename) as Int) else 0

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_rename(oldname, newname) as Int) else 0

public actual fun tmpfile(): FILE? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else 0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    }
}

public actual fun getchar(): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getchar() as Int) else 0

public actual fun putchar(c: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_putchar(c) as Int) else 0

public actual fun fgetc(stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fgetc((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fputc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fputs(s, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun puts(s: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_puts(s) as Int) else 0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_ungetc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun ftell(stream: FILE?): CLong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_ftell((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun rewind(stream: FILE?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_rewind((stream?.handle ?: 0L).toString())
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun feof(stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_feof((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun ferror(stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_ferror((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun perror(s: String?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_perror(s)
    }
}

public actual fun atof(s: String?): CDouble =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_atof(s) as Double) else 0.0

public actual fun atoi(s: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_atoi(s) as Int) else 0

public actual fun atol(s: String?): CLong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_atol(s) as String).toLong() else 0L

public actual fun atoll(s: String?): CLonglong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_atoll(s) as String).toLong() else 0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtod(s, (endp?.value ?: 0L).toString()) as Double) else 0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtof(s, (endp?.value ?: 0L).toString()) as Double).toFloat() else 0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtol(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtoll(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtoul(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtoull(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun msize(p: COpaquePointer?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_msize((p?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun free(p: COpaquePointer?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_free((p?.value ?: 0L).toString())
    }
}

public actual fun abort(): Nothing {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_abort()
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_exit(status)
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: FnCallback2): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_atexit(0L.toString()) as Int) else 0

public actual fun system(s: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_system(s) as Int) else 0

public actual fun getenv(s: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getenv(s) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strcat((s?.value ?: 0L).toString(), ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strncat((s?.value ?: 0L).toString(), ct, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strcmp(cs, ct) as Int) else 0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strncmp(cs, ct, n.toString()) as Int) else 0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strcoll(cs, ct) as Int) else 0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strrchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strspn(cs, ct) as String).toULong() else 0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strcspn(cs, ct) as String).toULong() else 0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strdup(cs) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strpbrk(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strstr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strlen(cs: String?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strlen(cs) as String).toULong() else 0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strnlen(cs, maxlen.toString()) as String).toULong() else 0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strerror(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strtok((s?.value ?: 0L).toString(), t) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()) as String).toULong() else 0uL

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wcslen((buf?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun wcsnlen(str: COpaquePointer?, numberOfElements: SizeT): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wcsnlen((str?.value ?: 0L).toString(), numberOfElements.toString()) as String).toULong() else 0uL

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toULong() else 0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else 0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun abs(i: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_labs(i.toString()) as String).toLong() else 0L

public actual fun rand(): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_rand() as Int) else 0

public actual fun srand(seed: CUint) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_srand(seed.toInt())
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_signal(signum, handler.toString()) as String).toULong() else 0uL

public actual fun raise(signum: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_raise(signum) as Int) else 0

public actual fun clock(): ClockT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_clock() as Int) else 0

public actual fun ctime(sourceTime: COpaquePointer?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_ctime((sourceTime?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_difftime(timeEnd.toString(), timeStart.toString()) as Double) else 0.0

public actual fun gmtimeS(destTime: COpaquePointer?, srcTime: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_gmtimeS((destTime?.value ?: 0L).toString(), (srcTime?.value ?: 0L).toString()) as Int) else 0

public actual fun getDaylight(hours: COpaquePointer?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getDaylight((hours?.value ?: 0L).toString()) as Int) else 0

public actual fun getDstbias(seconds: COpaquePointer?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getDstbias((seconds?.value ?: 0L).toString()) as Int) else 0

public actual fun getTimezone(seconds: COpaquePointer?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getTimezone((seconds?.value ?: 0L).toString()) as Int) else 0

public actual fun getTzname(pReturnValue: COpaquePointer?, timeZoneName: COpaquePointer?, sizeInBytes: SizeT, index: CInt): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getTzname((pReturnValue?.value ?: 0L).toString(), (timeZoneName?.value ?: 0L).toString(), sizeInBytes.toString(), index) as Int) else 0

public actual fun localtimeS(tmDest: COpaquePointer?, sourceTime: COpaquePointer?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_localtimeS((tmDest?.value ?: 0L).toString(), (sourceTime?.value ?: 0L).toString()) as Int) else 0

public actual fun time(destTime: COpaquePointer?): TimeT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_time((destTime?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun tzset() {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_tzset()
    }
}

public actual fun chmod(path: String?, mode: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_chmod(path, mode) as Int) else 0

public actual fun wchmod(path: COpaquePointer?, mode: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wchmod((path?.value ?: 0L).toString(), mode) as Int) else 0

public actual fun mkdir(path: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_mkdir(path) as Int) else 0

public actual fun wrmdir(path: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wrmdir((path?.value ?: 0L).toString()) as Int) else 0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fstat(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_stat(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun wstat(path: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wstat((path?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun wutime(file: COpaquePointer?, buf: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wutime((file?.value ?: 0L).toString(), (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun pclose(stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_pclose((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fdopen(fd, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fileno(stream: FILE?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_fileno((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun wopen(path: COpaquePointer?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_creat(path, mode) as Int) else 0

public actual fun access(path: String?, amode: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_access(path, amode) as Int) else 0

public actual fun chdir(dir: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_chdir(dir) as Int) else 0

public actual fun close(fd: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_close(fd) as Int) else 0

public actual fun dup(fd: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_dup(fd) as Int) else 0

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_dup2(src, dst) as Int) else 0

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexecl(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexecle(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execlp(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexeclp(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execlpe(path: String?, arg0: String?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun wexeclpe(path: COpaquePointer?, arg0: COpaquePointer?, vararg variadicArgs: Long): IntptrT =
    0L

public actual fun execv(prog: String?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_execv(prog, (argv?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_execvp(c, (argv?.value ?: 0L).toString()) as Int) else 0

public actual fun execvpe(c: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_execvpe(c, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun wexecv(prog: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wexecv((prog?.value ?: 0L).toString(), (argv?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun wexecve(prog: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wexecve((prog?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun wexecvp(c: COpaquePointer?, argv: COpaquePointer?): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wexecvp((c?.value ?: 0L).toString(), (argv?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun wexecvpe(c: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wexecvpe((c?.value ?: 0L).toString(), (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun getcwd(buf: COpaquePointer?, size: CInt): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getcwd((buf?.value ?: 0L).toString(), size) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpid(): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getpid() as Int) else 0

public actual fun isatty(fd: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_isatty(fd) as Int) else 0

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_lseek(fd, offset.toString(), origin) as String).toLong() else 0L

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_lseek64(fd, offset.toString(), origin) as String).toLong() else 0L

public actual fun pipe(fds: COpaquePointer?, psize: CUint, textmode: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_pipe((fds?.value ?: 0L).toString(), psize.toInt(), textmode) as Int) else 0

public actual fun read(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_read(fd, (buf?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun rmdir(path: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_rmdir(path) as Int) else 0

public actual fun unlink(c: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_unlink(c) as Int) else 0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: CUint): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_write(fd, (buf?.value ?: 0L).toString(), count.toInt()) as Int) else 0

public actual fun commit(fd: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_commit(fd) as Int) else 0

public actual fun getOsfhandle(fd: CInt): IntptrT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getOsfhandle(fd) as String).toLong() else 0L

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_openOsfhandle(osfhandle.toString(), flags) as Int) else 0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_setlocale(category, locale) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun wsetlocale(category: CInt, locale: COpaquePointer?): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wsetlocale(category, (locale?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_alignedMalloc(size.toString(), alignment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun alignedFree(ptr: COpaquePointer?) {
    if (_windowsNapiAddon != null) {
        _windowsNapiAddon.libc_windows_alignedFree((ptr?.value ?: 0L).toString())
    }
}

public actual fun alignedRealloc(memblock: COpaquePointer?, size: SizeT, alignment: SizeT): COpaquePointer? =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_alignedRealloc((memblock?.value ?: 0L).toString(), size.toString(), alignment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun putenv(envstring: String?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_putenv(envstring) as Int) else 0

public actual fun wputenv(envstring: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wputenv((envstring?.value ?: 0L).toString()) as Int) else 0

public actual fun putenvS(envstring: String?, valueString: String?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_putenvS(envstring, valueString) as Int) else 0

public actual fun wputenvS(envstring: COpaquePointer?, valueString: COpaquePointer?): ErrnoT =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_wputenvS((envstring?.value ?: 0L).toString(), (valueString?.value ?: 0L).toString()) as Int) else 0

public actual fun listen(s: Socket, backlog: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_listen(s.toString(), backlog) as Int) else 0

public actual fun accept(s: Socket, addr: COpaquePointer?, addrlen: COpaquePointer?): Socket =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_accept(s.toString(), (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun bind(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_bind(s.toString(), (name?.value ?: 0L).toString(), namelen) as Int) else 0

public actual fun connect(s: Socket, name: COpaquePointer?, namelen: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_connect(s.toString(), (name?.value ?: 0L).toString(), namelen) as Int) else 0

public actual fun getpeername(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getpeername(s.toString(), (name?.value ?: 0L).toString(), (nameln?.value ?: 0L).toString()) as Int) else 0

public actual fun getsockname(s: Socket, name: COpaquePointer?, nameln: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getsockname(s.toString(), (name?.value ?: 0L).toString(), (nameln?.value ?: 0L).toString()) as Int) else 0

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_getsockopt(s.toString(), level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else 0

public actual fun recvfrom(s: Socket, buf: COpaquePointer?, len: CInt, flags: CInt, from: COpaquePointer?, fromlen: COpaquePointer?): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_recvfrom(s.toString(), (buf?.value ?: 0L).toString(), len, flags, (from?.value ?: 0L).toString(), (fromlen?.value ?: 0L).toString()) as Int) else 0

public actual fun sendto(s: Socket, buf: String?, len: CInt, flags: CInt, to: COpaquePointer?, tolen: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_sendto(s.toString(), buf, len, flags, (to?.value ?: 0L).toString(), tolen) as Int) else 0

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: String?, optlen: CInt): CInt =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_setsockopt(s.toString(), level, optname, optval, optlen) as Int) else 0

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    if (_windowsNapiAddon != null) (_windowsNapiAddon.libc_windows_socket(af, socketType, protocol) as String).toULong() else 0uL
