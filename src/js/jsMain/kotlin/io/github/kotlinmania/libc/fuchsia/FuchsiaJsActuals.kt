@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

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
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT

private val _fuchsiaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun isalnum(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_iscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_islower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ispunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_toupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fopen(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_freopen(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fflush((file?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fclose((file?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_remove(filename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_rename(oldname, newname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_putchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fgetc((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fputc(c, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fputs(s, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_puts(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ungetc(c, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ftell((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_feof((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ferror((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_atof(s) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_atoi(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_atol(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_atoll(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtod(s, (endp?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtof(s, (endp?.value ?: 0L).toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtol(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtoll(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtoul(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtoull(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_atexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_system(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getenv(s) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strcat((s?.value ?: 0L).toString(), ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strncat((s?.value ?: 0L).toString(), ct, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strcmp(cs, ct) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strncmp(cs, ct, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strcoll(cs, ct) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strrchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strspn(cs, ct) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strcspn(cs, ct) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strdup(cs) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strpbrk(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strstr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strlen(cs) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, maxlen: SizeT): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strnlen(cs, maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strerror(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strtok((s?.value ?: 0L).toString(), t) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_wcslen((buf?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_abs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_labs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_rand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnam(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpwnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpwuid(uid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_putcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_socket(domain, ty, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: COpaquePointer?, len: SocklenT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_connect(socket, (address?.value ?: 0L).toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_listen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_accept(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpeername(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_socketpair(domain, type, protocol, (socketVector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shutdown(socket, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_chmod(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fchmod(fd, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fstat(fildes, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkdir(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_stat(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pclose((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fdopen(fd, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fileno((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_creat(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: String?): DIR? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_opendir(dirname) as String).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readdir((dirp?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readdirR((dirp?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: DIR?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_closedir((dirp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openat(dirfd: CInt, pathname: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_openat(dirfd, pathname, flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fchmodat(dirfd, pathname, mode.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fstatat(dirfd, pathname, (buf?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_linkat(olddirfd, oldpath, newdirfd, newpath, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkdirat(dirfd, pathname, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: String?, buf: COpaquePointer?, bufsiz: SizeT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readlinkat(dirfd, pathname, (buf?.value ?: 0L).toString(), bufsiz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_renameat(olddirfd, oldpath, newdirfd, newpath) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_symlinkat(target, newdirfd, linkpath) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_unlinkat(dirfd, pathname, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_access(path, amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_alarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_chdir(dir) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_chown(path, uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_lchown(path, uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_close(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execl(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execle(path, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: String?, arg0: String?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execlp(file, arg0, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: String?, argv: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execv(prog, (argv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execve(prog, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: String?, argv: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execvp(c, (argv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getegid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_geteuid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getlogin() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getopt(argc, (argv?.value ?: 0L).toString(), optstr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpgid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpgrp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getppid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getuid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_isatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_link(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_lseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pathconf(path, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pipe((fds?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_read(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_rmdir(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_seteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setpgid(pid, pgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setsid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcgetpgrp(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcsetpgrp(fd, pgrp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ttyname(fd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_unlink(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: COpaquePointer?): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_wait((status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_waitpid(pid, (status?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pread(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: OffT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pwrite(fd, (buf?.value ?: 0L).toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_umask(mask.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_utime(file, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_kill(pid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_munlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_munlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_munmap((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: String?): CUint =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ifNametoindex(ifname) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ifIndextoname(ifindex.toInt(), (ifname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_lstat(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setenv(name, value, overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_unsetenv(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_symlink(path1, path2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ftruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_signal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: String?, resolved: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_realpath(pathname, (resolved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_flock(fd, operation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_times((buf?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadJoin(native.toLong().toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stackSize: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadGetspecific(key.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadSetspecific(key.toInt(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexLock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexTrylock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: COpaquePointer?, type: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexattrSettype((attr?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondWait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockInit((lock?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockDestroy((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockRdlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockTryrdlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockWrlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockTrywrlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockUnlock((lock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadSetnameNp(thread.toLong().toString(), name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_raise(signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_utimes(filename, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dlopen(filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dlerror() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dlsym((handle?.value ?: 0L).toString(), symbol) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dlclose((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_freeaddrinfo((res?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_gaiStrerror(errcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_resInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mktime((tm?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_time((time?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_gmtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_localtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mknod(pathname, mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_gethostname((name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getservbyname(name, proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getprotobyname(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getprotobynumber(proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_usleep(secs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_recv(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_putenv((string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_poll((fds?.value ?: 0L).toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_select(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setlocale(category, locale) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_localeconv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semDestroy((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semWait((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semTrywait((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semPost((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semInit((sem?.value ?: 0L).toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_statvfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fstatvfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsz: SizeT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readlink(path, (buf?.value ?: 0L).toString(), bufsz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigemptyset((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigaddset((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigfillset((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigdelset((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigismember((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigpending((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_timegm((tm?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getsid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkfifo(path, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: COpaquePointer?, writefds: COpaquePointer?, errorfds: COpaquePointer?, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pselect(nfds, (readfds?.value ?: 0L).toString(), (writefds?.value ?: 0L).toString(), (errorfds?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ftello((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcdrain(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: COpaquePointer?): SpeedT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_cfgetispeed((termios?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_cfgetospeed((termios?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_cfmakeraw((termios?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_cfsetspeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcgetattr(fd, (termios?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcflow(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcgetsid(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkstemp((template?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkdtemp((template?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tmpnam((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_openlog(ident, logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_closelog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setlogmask(maskpri) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_syslog(priority, message, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun grantpt(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_grantpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_posixOpenpt(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ptsname(fd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_unlockpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clockGetres(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clockGettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clockSettime(clkId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dirfd((dirp?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadGetattrNp(native.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrGetstack((attr?.value ?: 0L).toString(), (stackaddr?.value ?: 0L).toString(), (stacksize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memalign(align.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setgroups(ngroups.toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pipe2((fds?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_statfs(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fstatfs(fd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_memrchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_posixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_duplocale((base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_freelocale((loc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_newlocale(mask, locale, (base?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_uselocale((loc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): DIR? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fdopendir(fd) as String).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mknodat(dirfd, pathname, mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_accept4(fd, (addr?.value ?: 0L).toString(), (len?.value ?: 0L).toString(), flg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ptsnameR(fd, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setreuid(ruid.toInt(), euid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setregid(rgid.toInt(), egid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getresuid((ruid?.value ?: 0L).toString(), (euid?.value ?: 0L).toString(), (suid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getresgid((rgid?.value ?: 0L).toString(), (egid?.value ?: 0L).toString(), (sgid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_acct(filename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_brk((addr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_openpty((amaster?.value ?: 0L).toString(), (aslave?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), (termp?.value ?: 0L).toString(), (winp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_execvpe(file, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fexecve(fd, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_lutimes(file, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_setpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_endpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpwent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmOpen(name, oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmat(shmid, (shmaddr?.value ?: 0L).toString(), shmflg) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmdt((shmaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmctl(shmid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ftok(pathname, projId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semget(key, nsems, semflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semop(semid, (sops?.value ?: 0L).toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_msgctl(msqid, cmd, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_msgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_msgrcv(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_msgsnd(msqid, (msgp?.value ?: 0L).toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_errnoLocation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_fallocate(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_posixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readahead(fd, offset.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_signalfd(fd, (mask?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_timerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_timerfdGettime(fd, (currValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_timerfdSettime(fd, flags, (newValue?.value ?: 0L).toString(), (oldValue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pwritev(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_preadv(fd, (iov?.value ?: 0L).toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: String?, id: CInt, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_quotactl(cmd, special, id, (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dup3(oldfd, newfd, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkostemp((template?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkostemps((template?.value ?: 0L).toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigtimedwait((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigwaitinfo((set?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_nlLanginfoL(item, (locale?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getnameinfo((sa?.value ?: 0L).toString(), salen.toInt(), (host?.value ?: 0L).toString(), hostlen.toInt(), (serv?.value ?: 0L).toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_reboot(howTo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setfsgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setfsuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkfifoat(dirfd, pathname, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ifNameindex() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_ifFreenameindex((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_syncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getifaddrs((ifap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_freeifaddrs((ifa?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_glob(pattern, flags, 0L.toString(), (pglob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: COpaquePointer?) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_globfree((pglob?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_posixMadvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_shmUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_seekdir((dirp?.handle ?: 0L).toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: DIR?): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_telldir((dirp?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_madvise((addr?.value ?: 0L).toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_recvfrom(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mkstemps((template?.value ?: 0L).toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_futimes(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_nlLanginfo(item) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_bind(socket, (address?.value ?: 0L).toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sendmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_recvmsg(fd, (msg?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getdomainname((name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_setdomainname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_vhangup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sendmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_recvmmsg(sockfd, (msgvec?.value ?: 0L).toString(), vlen.toInt(), flags, (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_sync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_syscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedGetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedSetaffinity(pid, cpusetsize.toString(), (cpuset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_umount(target) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_tee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_settimeofday((tv?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: COpaquePointer?, fdOut: CInt, offOut: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_splice(fdIn, (offIn?.value ?: 0L).toString(), fdOut, (offOut?.value ?: 0L).toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_eventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semTimedwait((sem?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semGetvalue((sem?.value ?: 0L).toString(), (sval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_swapoff(puath) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: COpaquePointer?, nrSegs: SizeT, flags: CUint): SsizeT =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_vmsplice(fd, (iov?.value ?: 0L).toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_mount(src, target, fstype, flags.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_personality(persona.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_ppoll((fds?.value ?: 0L).toString(), nfds.toString(), (timeout?.value ?: 0L).toString(), (sigmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadMutexTimedlock((lock?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: COpaquePointer?, flags: CInt, arg: COpaquePointer?, vararg variadicArgs: Long): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clone(0L.toString(), (childStack?.value ?: 0L).toString(), flags, (arg?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrGetguardsize((attr?.value ?: 0L).toString(), (guardsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAttrSetguardsize((attr?.value ?: 0L).toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: String?, len: SizeT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sethostname(name, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: String?, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_umount2(target, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_swapon(path, swapflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigsuspend((mask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrgidR(gid.toInt(), (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigaltstack((ss?.value ?: 0L).toString(), (oss?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semClose((sem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrnamR(name, (grp?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: String?, group: GidT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_initgroups(user, group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: String?): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrnam(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: String?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_semUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_daemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpwnamR(name, (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getpwuidR(uid.toInt(), (pwd?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_sigwait((set?.value ?: 0L).toString(), (sig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrgid(gid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_setgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (_fuchsiaNapiAddon != null) {
        _fuchsiaNapiAddon.libc_fuchsia_endgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): COpaquePointer? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_getgrouplist(user, group.toInt(), (groups?.value ?: 0L).toString(), (ngroups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: String?, mode: String?): FILE? =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_popen(command, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_faccessat(dirfd, pathname, mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    if (_fuchsiaNapiAddon != null) (_fuchsiaNapiAddon.libc_fuchsia_dlIteratePhdr(0L.toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
