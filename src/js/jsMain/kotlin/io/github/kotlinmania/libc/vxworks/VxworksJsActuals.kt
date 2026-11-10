@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

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
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT

private val _vxworksNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun isalnum(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_iscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_islower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ispunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_toupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fopen(filename, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, file: FILE?): FILE? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_freopen(filename, mode, (file?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fflush((file?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fclose((file?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_remove(filename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: String?, newname: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_rename(oldname, newname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tmpfile() as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buf: COpaquePointer?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_setbuf((stream?.handle ?: 0L).toString(), (buf?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_putchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fgetc((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fgets((buf?.value ?: 0L).toString(), n, (stream?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fputc(c, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fputs(s, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_puts(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ungetc(c, (stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fread((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nobj.toString(), (stream?.handle ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ftell((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fgetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, ptr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fsetpos((stream?.handle ?: 0L).toString(), (ptr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_feof((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ferror((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: String?): CDouble =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_atof(s) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_atoi(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: String?): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_atol(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: String?): CLonglong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_atoll(s) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: String?, endp: COpaquePointer?): CDouble =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtod(s, (endp?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: String?, endp: COpaquePointer?): CFloat =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtof(s, (endp?.value ?: 0L).toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtol(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtoll(s, (endp?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtoul(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtoull(s, (endp?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_calloc(nobj.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_realloc((p?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_atexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_system(s) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getenv(s) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: COpaquePointer?): SpeedT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_cfgetospeed((termios?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_cfmakeraw((termios?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_cfsetispeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: COpaquePointer?, speed: SpeedT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_cfsetospeed((termios?.value ?: 0L).toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcpy((dst?.value ?: 0L).toString(), src) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strncpy((dst?.value ?: 0L).toString(), src, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcat((s?.value ?: 0L).toString(), ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strncat((s?.value ?: 0L).toString(), ct, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: String?, ct: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcmp(cs, ct) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: String?, ct: String?, n: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strncmp(cs, ct, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: String?, ct: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcoll(cs, ct) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: String?, c: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: String?, c: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strrchr(cs, c) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: String?, ct: String?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strspn(cs, ct) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: String?, ct: String?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcspn(cs, ct) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strdup(cs) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: String?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strpbrk(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: String?, ct: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strstr(cs, ct) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: String?, s2: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strcasecmp(s1, s2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strncasecmp(s1, s2, n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strlen(cs) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: String?, n: SizeT): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strnlen(cs, n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strerror(n) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: COpaquePointer?, t: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strtok((s?.value ?: 0L).toString(), t) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strxfrm((s?.value ?: 0L).toString(), ct, n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: COpaquePointer?): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_wcslen((buf?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_wcstombs((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memchr((cx?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: COpaquePointer?, c: WcharT, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_wmemchr((cx?.value ?: 0L).toString(), c.toInt(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memcmp((cx?.value ?: 0L).toString(), (ct?.value ?: 0L).toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memcpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memccpy((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memmove((dest?.value ?: 0L).toString(), (src?.value ?: 0L).toString(), n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memset((dest?.value ?: 0L).toString(), c, n.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_alignedAlloc(alignment.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_uname((buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: COpaquePointer?): ClockT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_times((buf?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pclose((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mkdtemp((template?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_linkat(olddirfd, oldpath, newdirfd, newpath, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_unlinkat(dirfd, pathname, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getprotobyname(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getprotobynumber(proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: String?, proto: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getservbyname(name, proto) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fchownat(dirfd, pathname, owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_putcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_stat(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: String?): FILE? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fdopen(fd, mode) as String).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: FILE?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fileno((stream?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_creat(path, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: DIR?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_rewinddir((dirp?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: String?, amode: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_access(path, amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_alarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fchdir(dirfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: String?, uid: UidT, gid: GidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_chown(path, uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getegid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_geteuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getgroups(ngroupsMax, (groups?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getlogin() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getopt(argc, (argv?.value ?: 0L).toString(), optstr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: String?, name: CInt): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pathconf(path, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_seteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ttyname(fd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: COpaquePointer?): PidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_wait((status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_umask(mask) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_munlock((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_munlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_munmap((addr?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mprotect((addr?.value ?: 0L).toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_msync((addr?.value ?: 0L).toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: String?, length: OffT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_truncate(path, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_shmOpen(name, oflag, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_shmUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_gettimeofday((tp?.value ?: 0L).toString(), (tz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: COpaquePointer?): Nothing {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_pthreadExit((value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: COpaquePointer?, state: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrSetdetachstate((attr?.value ?: 0L).toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_strerrorR(errnum, (buf?.value ?: 0L).toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigaddset((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: COpaquePointer?, oldact: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigaction(signum, (act?.value ?: 0L).toString(), (oldact?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: String?, times: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_utimes(filename, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_futimens(fd, (times?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_utimensat(dirfd, path, (times?.value ?: 0L).toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: String?, flag: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dlopen(filename, flag) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dlerror() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dlsym((handle?.value ?: 0L).toString(), symbol) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dlclose((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: COpaquePointer?, info: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dladdr((addr?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_gmtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_localtimeR((timeP?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: COpaquePointer?): TimeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mktime((tm?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: COpaquePointer?): TimeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_time((time?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_gmtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_localtime((timeP?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: COpaquePointer?): TimeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_timegm((tm?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_difftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, len: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_gethostname((name?.value ?: 0L).toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_usleep(secs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_putenv((string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: String?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setlocale(category, locale) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_localeconv() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigprocmask(how, (set?.value ?: 0L).toString(), (oldset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigpending((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mkfifo(path, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fseeko((stream?.handle ?: 0L).toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: FILE?): OffT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ftello((stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mkstemp((template?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tmpnam((ptr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: String?, logopt: CInt, facility: CInt) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_openlog(ident, logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_closelog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setlogmask(maskpri) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_syslog(priority, message, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getline(lineptr: COpaquePointer?, n: COpaquePointer?, stream: FILE?): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getline((lineptr?.value ?: 0L).toString(), (n?.value ?: 0L).toString(), (stream?.handle ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tcsetattr(fd, optionalActions, (termios?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tcgetattr(fd, (termios?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_tcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_confstr(name, (buf?.value ?: 0L).toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fnmatch(pattern, name, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_symlinkat(target, newdirfd, linkpath) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fchmodat(dirfd, pathname, mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_utime(file, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_memalign(blockSize.toString(), sizeArg.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getcwd((buf?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(attr: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_chdir(attr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(pAttr: COpaquePointer?, pType: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexattrSettype((pAttr?.value ?: 0L).toString(), pType) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexInit((mutex?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexDestroy((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexLock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexTrylock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(attr: COpaquePointer?, spec: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexTimedlock((attr?.value ?: 0L).toString(), (spec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadMutexUnlock((mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetname(pAttr: COpaquePointer?, name: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrSetname((pAttr?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: COpaquePointer?, stacksize: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrSetstacksize((attr?.value ?: 0L).toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: COpaquePointer?, size: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrGetstacksize((attr?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(pThread: COpaquePointer?, pAttr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCreate((pThread?.value ?: 0L).toString(), (pAttr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrSetinheritsched((attr?.value ?: 0L).toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrSetschedpolicy((attr?.value ?: 0L).toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(thread: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrDestroy((thread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fstat(fildes, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: String?, buf: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_lstat(path, (buf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ftruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(pDir: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_readdirR((pDir?.handle ?: 0L).toString(), (entry?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(pDir: DIR?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_readdir((pDir?.handle ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_open(path, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: COpaquePointer?, nfds: NfdsT, timeout: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_poll((fds?.value ?: 0L).toString(), nfds.toInt(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(pAttr: COpaquePointer?, pClockId: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondattrGetclock((pAttr?.value ?: 0L).toString(), (pClockId?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(pAttr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondattrSetclock((pAttr?.value ?: 0L).toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: COpaquePointer?, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondInit((cond?.value ?: 0L).toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondDestroy((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondSignal((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondBroadcast((cond?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: COpaquePointer?, mutex: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondWait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockattrInit((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockattrDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetmaxreaders(attr: COpaquePointer?, attr2: CUint): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockattrSetmaxreaders((attr?.value ?: 0L).toString(), attr2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockInit((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockDestroy((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockRdlock((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockTryrdlock((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockTimedrdlock((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockWrlock((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockTrywrlock((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(attr: COpaquePointer?, host: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockTimedwrlock((attr?.value ?: 0L).toString(), (host?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadRwlockUnlock((attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: COpaquePointer?, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadKeyCreate((key?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadKeyDelete(key.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadSetspecific(key.toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadGetspecific(key.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: COpaquePointer?, mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadCondTimedwait((cond?.value ?: 0L).toString(), (mutex?.value ?: 0L).toString(), (abstime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetname(attr: COpaquePointer?, name: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadAttrGetname((attr?.value ?: 0L).toString(), (name?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadJoin(thread.toLong().toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_clockGettime(clockId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_clockSettime(clockId, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_clockGetres(clockId, (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_clockNanosleep(clockId, flags, (rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_accept(s, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_bind(fd, (addr?.value ?: 0L).toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: CInt, name: COpaquePointer?, namelen: SocklenT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_connect(s, (name?.value ?: 0L).toString(), namelen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: CInt, name: COpaquePointer?, namelen: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getpeername(s, (name?.value ?: 0L).toString(), (namelen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: COpaquePointer?, addressLen: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getsockname(socket, (address?.value ?: 0L).toString(), (addressLen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_listen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_recv(s, (buf?.value ?: 0L).toString(), bufLen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: COpaquePointer?, pFromLen: COpaquePointer?): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_recvfrom(s, (buf?.value ?: 0L).toString(), bufLen.toString(), flags, (from?.value ?: 0L).toString(), (pFromLen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_recvmsg(socket, (mp?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_send(socket, (buf?.value ?: 0L).toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, mp: COpaquePointer?, flags: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sendmsg(socket, (mp?.value ?: 0L).toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sendto(socket, (buf?.value ?: 0L).toString(), len.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setsockopt(socket, level, name, (value?.value ?: 0L).toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_shutdown(s, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_socket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_gaiStrerror(errcode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_close(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_read(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_write(fd, (buf?.value ?: 0L).toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_isatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(src: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dup(src) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_dup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pipe((fds?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_unlink(pathname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_lseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: String?, service: String?, hints: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getaddrinfo(node, service, (hints?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: COpaquePointer?) {
    if (_vxworksNapiAddon != null) {
        _vxworksNapiAddon.libc_vxworks_freeaddrinfo((res?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_signal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getppid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setpgid(pid, pgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: COpaquePointer?, options: CInt): PidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_waitpid(pid, (status?.value ?: 0L).toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(attr: CInt): CLong =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sysconf(attr) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setenv(envVarName, envVarValue, overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(envVarName: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_unsetenv(envVarName) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_realpath(fileName, (resolvedName?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: String?, dst: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_link(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_readlink(path, (buf?.value ?: 0L).toString(), bufsize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: String?, path2: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_symlink(path1, path2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(name: String?): DIR? =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_opendir(name) as String).toLong().let { if (it == 0L) null else DIR(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_rmdir(path) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(dirName: String?, mode: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mkdir(dirName, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: String?, mode: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_chmod(path, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fchmod(attr1, attr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_fsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(ptr: DIR?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_closedir((ptr?.handle ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedSetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedGetparam(pid, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedSetscheduler(pid, policy, (param?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedRrGetInterval(pid, (tp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_schedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoSet(err: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_errnoSet(err) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoGet(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_errnoGet() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getgid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_setuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_getuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigemptyset((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigfillset((set?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigdelset((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_sigismember((set?.value ?: 0L).toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pthreadSigmask(how, (set?.value ?: 0L).toString(), (oset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_kill(pid, signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_taskKill(taskId, signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signo: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_raise(signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskIdSelf(): TaskId =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_taskIdSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_taskDelay(ticks.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameSet(taskId: TaskId, taskName: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_taskNameSet(taskId, (taskName?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameGet(taskId: TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_taskNameGet(taskId, (bufName?.value ?: 0L).toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_rtpInfoGet(rtpId, (rtpStruct?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_rtpSpawn(pubrtpFileName, (argv?.value ?: 0L).toString(), (envp?.value ?: 0L).toString(), priority, uStackSize.toString(), options, taskOptions) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_pathIsAbsolute(filepath, (pNameTail?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_writev(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_readv(fd, (iov?.value ?: 0L).toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randBytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_randBytes((buf?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randABytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_randABytes((buf?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randUBytes(buf: COpaquePointer?, length: CInt): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_randUBytes((buf?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randSecure(): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_randSecure() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqOpen(name, oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: String?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqUnlink(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqReceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqTimedreceive(mqd.toLong().toString(), (msgPtr?.value ?: 0L).toString(), msgLen.toString(), (msgPrio?.value ?: 0L).toString(), (absTimeout?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqSend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqTimedsend(mqd.toLong().toString(), msgPtr, msgLen.toString(), msgPrio.toInt(), (absTimeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqGetattr(mqd.toLong().toString(), (attr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_mqSetattr(mqd.toLong().toString(), (newattr?.value ?: 0L).toString(), (oldattr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuEnabledGet(): CpusetT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_vxCpuEnabledGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuConfiguredGet(): CpusetT =
    if (_vxworksNapiAddon != null) (_vxworksNapiAddon.libc_vxworks_vxCpuConfiguredGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
