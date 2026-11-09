@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

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
import io.github.kotlinmania.libc.unix.bsd.UsecondsT
import io.github.kotlinmania.libc.unix.bsd.apple.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadKeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.NfdsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.PthreadT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.WcharT

private val _unixNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/libc_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-libc/build/Release/libc_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-libc/build/Debug/libc_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-libc/dist/build/Release/libc_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-libc/dist/build/Debug/libc_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isalnum(c) as Int) else 0

public actual fun isalpha(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isalpha(c) as Int) else 0

public actual fun iscntrl(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_iscntrl(c) as Int) else 0

public actual fun isdigit(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isdigit(c) as Int) else 0

public actual fun isgraph(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isgraph(c) as Int) else 0

public actual fun islower(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_islower(c) as Int) else 0

public actual fun isprint(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isprint(c) as Int) else 0

public actual fun ispunct(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ispunct(c) as Int) else 0

public actual fun isspace(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isspace(c) as Int) else 0

public actual fun isupper(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isupper(c) as Int) else 0

public actual fun isxdigit(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isxdigit(c) as Int) else 0

public actual fun isblank(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isblank(c) as Int) else 0

public actual fun tolower(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tolower(c) as Int) else 0

public actual fun toupper(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_toupper(c) as Int) else 0

public actual fun qsort(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_qsort((base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString())
    }
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), num.toString(), size.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fopen(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_freopen(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fflush(file: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fflush((file?.handle ?: 0L).toString()) as Int) else 0

public actual fun fclose(file: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fclose((file?.handle ?: 0L).toString()) as Int) else 0

public actual fun remove(filename: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_remove(filename) as Int) else 0

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_rename(oldname, newname) as Int) else 0

public actual fun tmpfile(): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else 0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    }
}

public actual fun getchar(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getchar() as Int) else 0

public actual fun putchar(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_putchar(c) as Int) else 0

public actual fun fgetc(stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fgetc((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fputc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fputs(s, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun puts(s: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_puts(s) as Int) else 0

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ungetc(c, (stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun ftell(stream: FILE?): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ftell((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun rewind(stream: FILE?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_rewind((stream?.handle ?: 0L).toString())
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else 0

public actual fun feof(stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_feof((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun ferror(stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ferror((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun clearerr(stream: FILE?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_clearerr((stream?.handle ?: 0L).toString())
    }
}

public actual fun perror(s: String?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_perror(s)
    }
}

public actual fun atof(s: String?): CDouble =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_atof(s) as Double) else 0.0

public actual fun atoi(s: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_atoi(s) as Int) else 0

public actual fun atol(s: String?): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_atol(s) as String).toLong() else 0L

public actual fun atoll(s: String?): CLonglong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_atoll(s) as String).toLong() else 0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtod(s, (endp?.value ?: 0L).toString()) as Double) else 0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtof(s, (endp?.value ?: 0L).toString()) as Double).toFloat() else 0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtol(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtoll(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtoul(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtoull(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun free(p: COpaquePointer?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_free((p?.value ?: 0L).toString())
    }
}

public actual fun abort(): Nothing {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_abort()
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_exit(status)
    }
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_system(s) as Int) else 0

public actual fun getenv(s: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getenv(s) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun stpcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_stpcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcat((s?.value ?: 0L).toString(), ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strncat((s?.value ?: 0L).toString(), ct, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcmp(cs, ct) as Int) else 0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strncmp(cs, ct, n.toString()) as Int) else 0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcoll(cs, ct) as Int) else 0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strrchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strspn(cs, ct) as String).toULong() else 0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcspn(cs, ct) as String).toULong() else 0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strdup(cs) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strndup(cs, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strpbrk(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strstr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcasecmp(s1, s2) as Int) else 0

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strncasecmp(s1, s2, n.toString()) as Int) else 0

public actual fun strlen(cs: String?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strlen(cs) as String).toULong() else 0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strnlen(cs, maxlen.toString()) as String).toULong() else 0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strerror(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtok((s?.value ?: 0L).toString(), t) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strtokR(s: COpaquePointer?, t: String?, p: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strtokR((s?.value ?: 0L).toString(), t, (p?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()) as String).toULong() else 0uL

public actual fun strsignal(sig: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strsignal(sig) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_wcslen((buf?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toULong() else 0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else 0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_memccpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpwnam(name: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpwnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpwuid(uid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun getcharUnlocked(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getcharUnlocked() as Int) else 0

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_putcharUnlocked(c) as Int) else 0

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_socket(domain, ty, protocol) as Int) else 0

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_connect(socket, (address?.value ?: 0L).toString(), len.toInt()) as Int) else 0

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_listen(socket, backlog) as Int) else 0

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_accept(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else 0

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpeername(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else 0

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else 0

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) as Int) else 0

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_socketpair(domain, type, protocol, (socketVector?.value ?: 0L).toString()) as Int) else 0

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()) as String).toLong() else 0L

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_shutdown(socket, how) as Int) else 0

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_chmod(path, mode.toInt()) as Int) else 0

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fchmod(fd, mode.toInt()) as Int) else 0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fstat(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mkdir(path, mode.toInt()) as Int) else 0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_stat(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun pclose(stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pclose((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fdopen(fd, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fileno(stream: FILE?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fileno((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_creat(path, mode.toInt()) as Int) else 0

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_opendir(dirname) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_readdir((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun closedir(dirp: DIR?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_closedir((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun rewinddir(dirp: DIR?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_rewinddir((dirp?.handle ?: 0L).toString())
    }
}

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fchmodat(dirfd, pathname, mode.toInt(), flags) as Int) else 0

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fchown(fd, owner.toInt(), group.toInt()) as Int) else 0

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) as Int) else 0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_linkat(olddirfd, oldpath, newdirfd, newpath, flags) as Int) else 0

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_renameat(olddirfd, oldpath, newdirfd, newpath) as Int) else 0

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_symlinkat(target, newdirfd, linkpath) as Int) else 0

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_unlinkat(dirfd, pathname, flags) as Int) else 0

public actual fun access(path: String?, amode: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_access(path, amode) as Int) else 0

public actual fun alarm(seconds: CUint): CUint =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_alarm(seconds.toInt()) as Int).toUInt() else 0u

public actual fun chdir(dir: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_chdir(dir) as Int) else 0

public actual fun fchdir(dirfd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fchdir(dirfd) as Int) else 0

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_chown(path, uid.toInt(), gid.toInt()) as Int) else 0

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_lchown(path, uid.toInt(), gid.toInt()) as Int) else 0

public actual fun close(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_close(fd) as Int) else 0

public actual fun dup(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dup(fd) as Int) else 0

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dup2(src, dst) as Int) else 0

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    0

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_execv(prog, (argv?.value ?: 0L).toString()) as Int) else 0

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else 0

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_execvp(c, (argv?.value ?: 0L).toString()) as Int) else 0

public actual fun fork(): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fork() as Int) else 0

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fpathconf(filedes, name) as String).toLong() else 0L

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getegid(): GidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getegid() as Int).toUShort() else 0u

public actual fun geteuid(): UidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_geteuid() as Int).toUShort() else 0u

public actual fun getgid(): GidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getgid() as Int).toUShort() else 0u

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) as Int) else 0

public actual fun getlogin(): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getlogin() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getopt(argc, (argv?.value ?: 0L).toString(), optstr) as Int) else 0

public actual fun getpgid(pid: PidT): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpgid(pid) as Int) else 0

public actual fun getpgrp(): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpgrp() as Int) else 0

public actual fun getpid(): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getpid() as Int) else 0

public actual fun getppid(): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getppid() as Int) else 0

public actual fun getuid(): UidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getuid() as Int).toUShort() else 0u

public actual fun isatty(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_isatty(fd) as Int) else 0

public actual fun link(src: String?, dst: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_link(src, dst) as Int) else 0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_lseek(fd, offset.toString(), whence) as String).toLong() else 0L

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pathconf(path, name) as String).toLong() else 0L

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pipe((fds?.value ?: 0L).toString()) as Int) else 0

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) as Int) else 0

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_alignedAlloc(alignment.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_read(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun rmdir(path: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_rmdir(path) as Int) else 0

public actual fun seteuid(uid: UidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_seteuid(uid.toInt()) as Int) else 0

public actual fun setegid(gid: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setegid(gid.toInt()) as Int) else 0

public actual fun setgid(gid: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setgid(gid.toInt()) as Int) else 0

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setpgid(pid, pgid) as Int) else 0

public actual fun setsid(): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setsid() as Int) else 0

public actual fun setuid(uid: UidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setuid(uid.toInt()) as Int) else 0

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setreuid(ruid.toInt(), euid.toInt()) as Int) else 0

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setregid(rgid.toInt(), egid.toInt()) as Int) else 0

public actual fun sleep(secs: CUint): CUint =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sleep(secs.toInt()) as Int).toUInt() else 0u

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else 0

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcgetpgrp(fd) as Int) else 0

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcsetpgrp(fd, pgrp) as Int) else 0

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ttyname(fd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ttynameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ttynameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun unlink(c: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_unlink(c) as Int) else 0

public actual fun wait(status: COpaquePointer?): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_wait((status?.value ?: 0L).toString()) as Int) else 0

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_waitpid(pid, (status?.value ?: 0L).toString(), options) as Int) else 0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else 0L

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0L

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0L

public actual fun umask(mask: ModeT): ModeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_umask(mask.toInt()) as Int).toUInt() else 0u

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_utime(file, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_kill(pid, sig) as Int) else 0

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_killpg(pgrp, sig) as Int) else 0

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_munlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun mlockall(flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mlockall(flags) as Int) else 0

public actual fun munlockall(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_munlockall() as Int) else 0

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_munmap((addr?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun ifNametoindex(ifname: String?): CUint =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ifNametoindex(ifname) as Int).toUInt() else 0u

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_lstat(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fsync(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fsync(fd) as Int) else 0

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setenv(name, value, overwrite) as Int) else 0

public actual fun unsetenv(name: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_unsetenv(name) as Int) else 0

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_symlink(path1, path2) as Int) else 0

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_truncate(path, length.toString()) as Int) else 0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ftruncate(fd, length.toString()) as Int) else 0

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_signal(signum, handler.toString()) as String).toULong() else 0uL

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getrusage(resource, (usage?.value ?: 0L).toString()) as Int) else 0

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_realpath(pathname, (resolved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_times((buf?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadSelf(): PthreadT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadSelf() as String).toLong().toULong() else 0uL

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else 0

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_pthreadExit((value?.value ?: 0L).toString())
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) as Int) else 0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) as Int) else 0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadDetach(thread.toLong().toString()) as Int) else 0

public actual fun schedYield(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_schedYield() as Int) else 0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: FnCallback1?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else 0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadKeyDelete(key) as Int) else 0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadGetspecific(key) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadSetspecific(key, (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) as Int) else 0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else 0

public actual fun raise(signum: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_raise(signum) as Int) else 0

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_utimes(filename, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dlopen(filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlerror(): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dlerror() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dlsym((handle?.value ?: 0L).toString(), symbol) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dlclose((handle?.value ?: 0L).toString()) as Int) else 0

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int) else 0

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_freeaddrinfo((res?.value ?: 0L).toString())
    }
}

public actual fun hstrerror(errcode: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_hstrerror(errcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_gaiStrerror(errcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun resInit(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_resInit() as Int) else 0

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mktime((tm?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun time(time: COpaquePointer?): TimeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_time((time?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_gmtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_localtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_difftime(time1.toString(), time0.toString()) as Double) else 0.0

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_timegm((tm?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mknod(pathname, mode.toInt(), dev) as Int) else 0

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_gethostname((name?.value ?: 0L).toString(), len.toString()) as Int) else 0

public actual fun endservent() {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_endservent()
    }
}

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getservbyname(name, proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getservbyport(port: CInt, proto: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getservbyport(port, proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getservent(): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getservent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setservent(stayopen: CInt) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_setservent(stayopen)
    }
}

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getprotobyname(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getprotobynumber(proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun chroot(name: String?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_chroot(name) as Int) else 0

public actual fun usleep(secs: UsecondsT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_usleep(secs.toInt()) as Int) else 0

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else 0L

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else 0L

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_putenv((string?.value ?: 0L).toString()) as Int) else 0

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) as Int) else 0

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setlocale(category, locale) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localeconv(): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_localeconv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_semWait((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_semTrywait((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_semPost((sem?.value ?: 0L).toString()) as Int) else 0

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_statvfs(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fstatvfs(fd, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigemptyset((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigaddset((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigfillset((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigdelset((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigismember((set?.value ?: 0L).toString(), signum) as Int) else 0

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else 0

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigpending((set?.value ?: 0L).toString()) as Int) else 0

public actual fun sysconf(name: CInt): CLong =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sysconf(name) as String).toLong() else 0L

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mkfifo(path, mode.toInt()) as Int) else 0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun ftello(stream: FILE?): OffT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ftello((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun tcdrain(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcdrain(fd) as Int) else 0

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfgetispeed((termios?.value ?: 0L).toString()) as Int).toUInt() else 0u

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfgetospeed((termios?.value ?: 0L).toString()) as Int).toUInt() else 0u

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else 0

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else 0

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcgetattr(fd, (termios?.value ?: 0L).toString()) as Int) else 0

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) as Int) else 0

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcflow(fd, action) as Int) else 0

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcflush(fd, action) as Int) else 0

public actual fun tcgetsid(fd: CInt): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcgetsid(fd) as Int) else 0

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tcsendbreak(fd, duration) as Int) else 0

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mkstemp((template?.value ?: 0L).toString()) as Int) else 0

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mkdtemp((template?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_tmpnam((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_openlog(ident, logopt, facility)
    }
}

public actual fun closelog() {
    if (_unixNapiAddon != null) {
        _unixNapiAddon.libc_unix_closelog()
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_setlogmask(maskpri) as Int) else 0

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
}

public actual fun nice(incr: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_nice(incr) as Int) else 0

public actual fun grantpt(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_grantpt(fd) as Int) else 0

public actual fun posixOpenpt(flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_posixOpenpt(flags) as Int) else 0

public actual fun ptsname(fd: CInt): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_ptsname(fd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun unlockpt(fd: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_unlockpt(fd) as Int) else 0

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_strcasestr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_lockf(fd, cmd, len.toString()) as Int) else 0

public actual fun adjtime(delta: COpaquePointer?, olddelta: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_adjtime((delta?.value ?: 0L).toString(), (olddelta?.value ?: 0L).toString()) as Int) else 0

public actual fun stpncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_stpncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    0

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_confstr(name, (buf?.value ?: 0L).toString(), len.toString()) as String).toULong() else 0uL

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else 0

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_flock(fd, operation) as Int) else 0

public actual fun openWmemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_openWmemstream((ptr?.value ?: 0L).toString(), (sizeloc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun getsid(pid: PidT): PidT =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_getsid(pid) as Int) else 0

public actual fun pause(): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pause() as Int) else 0

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_mkdirat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fdopendir(fd: CInt): DIR? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fdopendir(fd) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else 0

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()) as Int) else 0

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()) as Int) else 0

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_pselect(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else 0

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) as Int) else 0

public actual fun fmemopen(buf: COpaquePointer?, size: SizeT, mode: String?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fmemopen((buf?.value ?: 0L).toString(), size.toString(), mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun openMemstream(ptr: COpaquePointer?, sizeloc: COpaquePointer?): FILE? =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_openMemstream((ptr?.value ?: 0L).toString(), (sizeloc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun atexit(cb: FnCallback2): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_atexit(0L.toString()) as Int) else 0

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfmakeraw((termios?.value ?: 0L).toString()) as Int) else 0

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_cfsetspeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else 0

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    if (_unixNapiAddon != null) (_unixNapiAddon.libc_unix_fnmatch(pattern, name, flags) as Int) else 0
