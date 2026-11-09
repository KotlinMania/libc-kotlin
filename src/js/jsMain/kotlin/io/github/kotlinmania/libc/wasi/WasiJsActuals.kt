@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _wasiNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/libc_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-libc/build/Release/libc_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-libc/build/Debug/libc_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-libc/dist/build/Release/libc_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-libc/dist/build/Debug/libc_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

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
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_exit(code)
    }
    error("Unreachable noreturn C function exit")
}

public actual fun abort(): Nothing {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_abort()
    }
    error("Unreachable noreturn C function abort")
}

public actual fun alignedAlloc(a: SizeT, b: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_alignedAlloc(a.toString(), b.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun calloc(amt: SizeT, amt2: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_calloc(amt.toString(), amt2.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun free(ptr: COpaquePointer?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_free((ptr?.value ?: 0L).toString())
    }
}

public actual fun getenv(s: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getenv(s) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun malloc(amt: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_malloc(amt.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_mallocUsableSize((ptr?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_sbrk(increment.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun rand(): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_rand() as Int) else 0

public actual fun read(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_read(fd, (ptr?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun realloc(ptr: COpaquePointer?, amt: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_realloc((ptr?.value ?: 0L).toString(), amt.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun setenv(k: String?, v: String?, a: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_setenv(k, v, a) as Int) else 0

public actual fun unsetenv(k: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_unsetenv(k) as Int) else 0

public actual fun clearenv(): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_clearenv() as Int) else 0

public actual fun write(fd: CInt, ptr: COpaquePointer?, size: SizeT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_write(fd, (ptr?.value ?: 0L).toString(), size.toString()) as String).toLong() else 0L

public actual fun fopen(a: String?, b: String?): FILE? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fopen(a, b) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun freopen(a: String?, b: String?, f: FILE?): FILE? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_freopen(a, b, (f?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fclose(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fclose((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun remove(a: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_remove(a) as Int) else 0

public actual fun rename(a: String?, b: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_rename(a, b) as Int) else 0

public actual fun feof(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_feof((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun ferror(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ferror((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun fflush(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fflush((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun clearerr(f: FILE?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_clearerr((f?.handle ?: 0L).toString())
    }
}

public actual fun fseek(f: FILE?, b: CLong, c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fseek((f?.handle ?: 0L).toString(), b.toString(), c) as Int) else 0

public actual fun ftell(f: FILE?): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ftell((f?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun rewind(f: FILE?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_rewind((f?.handle ?: 0L).toString())
    }
}

public actual fun fgetpos(f: FILE?, pos: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fgetpos((f?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) as Int) else 0

public actual fun fsetpos(f: FILE?, pos: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fsetpos((f?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) as Int) else 0

public actual fun fread(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fread((buf?.value ?: 0L).toString(), a.toString(), b.toString(), (f?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fwrite(buf: COpaquePointer?, a: SizeT, b: SizeT, f: FILE?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fwrite((buf?.value ?: 0L).toString(), a.toString(), b.toString(), (f?.handle ?: 0L).toString()) as String).toULong() else 0uL

public actual fun fgetc(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fgetc((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun getc(f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getc((f?.handle ?: 0L).toString()) as Int) else 0

public actual fun getchar(): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getchar() as Int) else 0

public actual fun ungetc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ungetc(a, (f?.handle ?: 0L).toString()) as Int) else 0

public actual fun fputc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fputc(a, (f?.handle ?: 0L).toString()) as Int) else 0

public actual fun putc(a: CInt, f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_putc(a, (f?.handle ?: 0L).toString()) as Int) else 0

public actual fun putchar(a: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_putchar(a) as Int) else 0

public actual fun fputs(a: String?, f: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fputs(a, (f?.handle ?: 0L).toString()) as Int) else 0

public actual fun puts(a: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_puts(a) as Int) else 0

public actual fun perror(a: String?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_perror(a)
    }
}

public actual fun srand(a: CUint) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_srand(a.toInt())
    }
}

public actual fun atexit(a: AtexitACallback): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atexit(0L.toString()) as Int) else 0

public actual fun atQuickExit(a: AtexitACallback): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atQuickExit(0L.toString()) as Int) else 0

public actual fun quickExit(a: CInt): Nothing {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_quickExit(a)
    }
    error("Unreachable noreturn C function quickExit")
}

public actual fun posixMemalign(a: COpaquePointer?, b: SizeT, c: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_posixMemalign((a?.value ?: 0L).toString(), b.toString(), c.toString()) as Int) else 0

public actual fun randR(a: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_randR((a?.value ?: 0L).toString()) as Int) else 0

public actual fun random(): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_random() as String).toLong() else 0L

public actual fun srandom(a: CUint) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_srandom(a.toInt())
    }
}

public actual fun putenv(a: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_putenv((a?.value ?: 0L).toString()) as Int) else 0

public actual fun clock(): ClockT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_clock() as String).toLong() else 0L

public actual fun time(a: COpaquePointer?): TimeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_time((a?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun difftime(a: TimeT, b: TimeT): CDouble =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_difftime(a.toString(), b.toString()) as Double) else 0.0

public actual fun mktime(a: COpaquePointer?): TimeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_mktime((a?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun strftime(a: COpaquePointer?, b: SizeT, c: String?, d: COpaquePointer?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strftime((a?.value ?: 0L).toString(), b.toString(), c, (d?.value ?: 0L).toString()) as String).toULong() else 0uL

public actual fun gmtime(a: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_gmtime((a?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun gmtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_gmtimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtime(a: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_localtime((a?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localtimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_localtimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun asctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_asctimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun ctimeR(a: COpaquePointer?, b: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ctimeR((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nanosleep(a: COpaquePointer?, b: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_nanosleep((a?.value ?: 0L).toString(), (b?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGetres(a: ClockidT, b: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_clockGetres(a, (b?.value ?: 0L).toString()) as Int) else 0

public actual fun clockGettime(a: ClockidT, b: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_clockGettime(a, (b?.value ?: 0L).toString()) as Int) else 0

public actual fun clockNanosleep(a: ClockidT, a2: CInt, b: COpaquePointer?, c: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_clockNanosleep(a, a2, (b?.value ?: 0L).toString(), (c?.value ?: 0L).toString()) as Int) else 0

public actual fun isalnum(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isalnum(c) as Int) else 0

public actual fun isalpha(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isalpha(c) as Int) else 0

public actual fun iscntrl(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_iscntrl(c) as Int) else 0

public actual fun isdigit(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isdigit(c) as Int) else 0

public actual fun isgraph(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isgraph(c) as Int) else 0

public actual fun islower(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_islower(c) as Int) else 0

public actual fun isprint(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isprint(c) as Int) else 0

public actual fun ispunct(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ispunct(c) as Int) else 0

public actual fun isspace(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isspace(c) as Int) else 0

public actual fun isupper(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isupper(c) as Int) else 0

public actual fun isxdigit(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isxdigit(c) as Int) else 0

public actual fun isblank(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isblank(c) as Int) else 0

public actual fun tolower(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_tolower(c) as Int) else 0

public actual fun toupper(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_toupper(c) as Int) else 0

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else 0

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    }
}

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun atof(s: String?): CDouble =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atof(s) as Double) else 0.0

public actual fun atoi(s: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atoi(s) as Int) else 0

public actual fun atol(s: String?): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atol(s) as String).toLong() else 0L

public actual fun atoll(s: String?): CLonglong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_atoll(s) as String).toLong() else 0L

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtod(s, (endp?.value ?: 0L).toString()) as Double) else 0.0

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtof(s, (endp?.value ?: 0L).toString()) as Double).toFloat() else 0.0f

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtol(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtoll(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else 0L

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtoul(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtoull(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else 0uL

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcat((s?.value ?: 0L).toString(), ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strncat((s?.value ?: 0L).toString(), ct, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcmp(cs, ct) as Int) else 0

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strncmp(cs, ct, n.toString()) as Int) else 0

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcoll(cs, ct) as Int) else 0

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strrchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strspn(cs, ct) as String).toULong() else 0uL

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcspn(cs, ct) as String).toULong() else 0uL

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strdup(cs) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strndup(cs: String?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strndup(cs, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strpbrk(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strstr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcasecmp(s1, s2) as Int) else 0

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strncasecmp(s1, s2, n.toString()) as Int) else 0

public actual fun strlen(cs: String?): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strlen(cs) as String).toULong() else 0uL

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strnlen(cs, maxlen.toString()) as String).toULong() else 0uL

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strerror(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strtok((s?.value ?: 0L).toString(), t) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()) as String).toULong() else 0uL

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else 0

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

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
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getcharUnlocked() as Int) else 0

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_putcharUnlocked(c) as Int) else 0

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_shutdown(socket, how) as Int) else 0

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fstat(fildes, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_mkdir(path, mode.toInt()) as Int) else 0

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_stat(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fdopen(fd, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else null

public actual fun fileno(stream: FILE?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fileno((stream?.handle ?: 0L).toString()) as Int) else 0

public actual fun open(path: String?, oflag: CInt): CInt =
    0

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_creat(path, mode.toInt()) as Int) else 0

public actual fun fcntl(fd: CInt, cmd: CInt): CInt =
    0

public actual fun opendir(dirname: String?): DIR? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_opendir(dirname) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun fdopendir(fd: CInt): DIR? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fdopendir(fd) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_readdir((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun closedir(dirp: DIR?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_closedir((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun rewinddir(dirp: DIR?) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_rewinddir((dirp?.handle ?: 0L).toString())
    }
}

public actual fun dirfd(dirp: DIR?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_dirfd((dirp?.handle ?: 0L).toString()) as Int) else 0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    0

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_linkat(olddirfd, oldpath, newdirfd, newpath, flags) as Int) else 0

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_mkdirat(dirfd, pathname, mode.toInt()) as Int) else 0

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()) as String).toLong() else 0L

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_renameat(olddirfd, oldpath, newdirfd, newpath) as Int) else 0

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_symlinkat(target, newdirfd, linkpath) as Int) else 0

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_unlinkat(dirfd, pathname, flags) as Int) else 0

public actual fun access(path: String?, amode: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_access(path, amode) as Int) else 0

public actual fun close(fd: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_close(fd) as Int) else 0

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fpathconf(filedes, name) as String).toLong() else 0L

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getopt(argc, (argv?.value ?: 0L).toString(), optstr) as Int) else 0

public actual fun isatty(fd: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_isatty(fd) as Int) else 0

public actual fun link(src: String?, dst: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_link(src, dst) as Int) else 0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_lseek(fd, offset.toString(), whence) as String).toLong() else 0L

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pathconf(path, name) as String).toLong() else 0L

public actual fun rmdir(path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_rmdir(path) as Int) else 0

public actual fun sleep(secs: CUint): CUint =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_sleep(secs.toInt()) as Int).toUInt() else 0u

public actual fun unlink(c: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_unlink(c) as Int) else 0

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0L

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else 0L

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_lstat(path, (buf?.value ?: 0L).toString()) as Int) else 0

public actual fun fsync(fd: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fsync(fd) as Int) else 0

public actual fun fdatasync(fd: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fdatasync(fd) as Int) else 0

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_symlink(path1, path2) as Int) else 0

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_truncate(path, length.toString()) as Int) else 0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ftruncate(fd, length.toString()) as Int) else 0

public actual fun getrusage(resource: CInt, usage: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getrusage(resource, (usage?.value ?: 0L).toString()) as Int) else 0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else 0

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_times((buf?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun usleep(secs: CUint): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_usleep(secs.toInt()) as Int) else 0

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else 0L

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else 0L

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) as Int) else 0

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_setlocale(category, locale) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun localeconv(): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_localeconv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()) as String).toLong() else 0L

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_timegm((tm?.value ?: 0L).toString()) as String).toLong() else 0L

public actual fun sysconf(name: CInt): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_sysconf(name) as String).toLong() else 0L

public actual fun ioctl(fd: CInt, request: CInt): CInt =
    0

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else 0

public actual fun ftello(stream: FILE?): OffT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_ftello((stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_posixFallocate(fd, offset.toString(), len.toString()) as Int) else 0

public actual fun strcasestr(cs: String?, ct: String?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_strcasestr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as String).toLong() else 0L

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_faccessat(dirfd, pathname, mode, flags) as Int) else 0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else 0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else 0L

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else 0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_futimens(fd, (times?.value ?: 0L).toString()) as Int) else 0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else 0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) as Int) else 0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun abs(i: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_abs(i) as Int) else 0

public actual fun labs(i: CLong): CLong =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_labs(i.toString()) as String).toLong() else 0L

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_duplocale(base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun freelocale(loc: LocaleT) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_freelocale(loc.toLong().toString())
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_newlocale(mask, locale, base.toLong().toString()) as String).toLong().toULong()() else null

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_uselocale(loc.toLong().toString()) as String).toLong().toULong()() else null

public actual fun schedYield(): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_schedYield() as Int) else 0

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun chdir(dir: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_chdir(dir) as Int) else 0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_nlLanginfoL(item, loc.toLong().toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else 0

public actual fun wasilibcRegisterPreopenedFd(fd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcRegisterPreopenedFd(fd, path) as Int) else 0

public actual fun wasilibcFdRenumber(fd: CInt, newfd: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcFdRenumber(fd, newfd) as Int) else 0

public actual fun wasilibcUnlinkat(fd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcUnlinkat(fd, path) as Int) else 0

public actual fun wasilibcRmdirat(fd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcRmdirat(fd, path) as Int) else 0

public actual fun wasilibcFindRelpath(path: String?, absPrefix: COpaquePointer?, relativePath: COpaquePointer?, relativePathLen: ULong): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcFindRelpath(path, (absPrefix?.value ?: 0L).toString(), (relativePath?.value ?: 0L).toString(), relativePathLen.toString()) as Int) else 0

public actual fun wasilibcTell(fd: CInt): OffT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcTell(fd) as String).toLong() else 0L

public actual fun wasilibcNocwdWasilibcUnlinkat(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdWasilibcUnlinkat(dirfd, path) as Int) else 0

public actual fun wasilibcNocwdWasilibcRmdirat(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdWasilibcRmdirat(dirfd, path) as Int) else 0

public actual fun wasilibcNocwdLinkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdLinkat(olddirfd, oldpath, newdirfd, newpath, flags) as Int) else 0

public actual fun wasilibcNocwdSymlinkat(target: String?, dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdSymlinkat(target, dirfd, path) as Int) else 0

public actual fun wasilibcNocwdReadlinkat(dirfd: CInt, path: String?, buf: COpaquePointer?, bufsize: ULong): Long =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdReadlinkat(dirfd, path, (buf?.value ?: 0L).toString(), bufsize.toString()) as String).toLong() else 0L

public actual fun wasilibcNocwdFaccessat(dirfd: CInt, path: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdFaccessat(dirfd, path, mode, flags) as Int) else 0

public actual fun wasilibcNocwdRenameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdRenameat(olddirfd, oldpath, newdirfd, newpath) as Int) else 0

public actual fun wasilibcNocwdOpenatNomode(dirfd: CInt, path: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdOpenatNomode(dirfd, path, flags) as Int) else 0

public actual fun wasilibcNocwdFstatat(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdFstatat(dirfd, path, (buf?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun wasilibcNocwdMkdiratNomode(dirfd: CInt, path: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdMkdiratNomode(dirfd, path) as Int) else 0

public actual fun wasilibcNocwdUtimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdUtimensat(dirfd, path, (times?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun wasilibcNocwdOpendirat(dirfd: CInt, path: String?): DIR? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcNocwdOpendirat(dirfd, path) as String).toLong().let { if (it == 0L) null else DIR(it) } else null

public actual fun wasilibcAccess(pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcAccess(pathname, mode, flags) as Int) else 0

public actual fun wasilibcStat(pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcStat(pathname, (buf?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun wasilibcUtimens(pathname: String?, times: COpaquePointer?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcUtimens(pathname, (times?.value ?: 0L).toString(), flags) as Int) else 0

public actual fun wasilibcLink(oldpath: String?, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcLink(oldpath, newpath, flags) as Int) else 0

public actual fun wasilibcLinkOldat(olddirfd: CInt, oldpath: String?, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcLinkOldat(olddirfd, oldpath, newpath, flags) as Int) else 0

public actual fun wasilibcLinkNewat(oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcLinkNewat(oldpath, newdirfd, newpath, flags) as Int) else 0

public actual fun wasilibcRenameOldat(olddirfd: CInt, oldpath: String?, newpath: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcRenameOldat(olddirfd, oldpath, newpath) as Int) else 0

public actual fun wasilibcRenameNewat(oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_wasilibcRenameNewat(oldpath, newdirfd, newpath) as Int) else 0

public actual fun arc4random(): UInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_arc4random() as Int).toUInt() else 0u

public actual fun arc4randomBuf(a: COpaquePointer?, b: SizeT) {
    if (_wasiNapiAddon != null) {
        _wasiNapiAddon.libc_wasi_arc4randomBuf((a?.value ?: 0L).toString(), b.toString())
    }
}

public actual fun arc4randomUniform(a: UInt): UInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_arc4randomUniform(a.toInt()) as Int).toUInt() else 0u

public actual fun errnoLocation(): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_chmod(path, mode.toInt()) as Int) else 0

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_fchmod(fd, mode.toInt()) as Int) else 0

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_realpath(pathname, (resolved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadSelf(): PthreadT =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadSelf() as String).toLong().toULong()() else null

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else 0

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) as Int) else 0

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) as Int) else 0

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadDetach(thread.toLong().toString()) as Int) else 0

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else 0

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadKeyDelete(key.toInt()) as Int) else 0

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadGetspecific(key.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else null

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexLock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexTrylock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) as Int) else 0

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) as Int) else 0

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_wasiNapiAddon != null) (_wasiNapiAddon.libc_wasi_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) as Int) else 0
