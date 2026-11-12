@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val unixNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual val IN6ADDR_LOOPBACK: In6Addr
    get() = In6Addr()

public actual val IN6ADDR_ANY: In6Addr
    get() = In6Addr()

public actual fun isalnum(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixQsort(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: ConstPtr, base: ConstPtr, num: SizeT, size: SizeT, compar: QsortComparCallback?): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixBsearch(key.rawAddress.toString(), base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFflush(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFclose(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPutchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixClearerr(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun perror(s: ConstPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr): CDouble =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun system(s: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSystem(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStpcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strndup(cs: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrndup(cs.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, maxlen: SizeT): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrnlen(cs.rawAddress.toString(), maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtokR(s: MutPtr, t: ConstPtr, p: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrtokR(s.rawAddress.toString(), t.rawAddress.toString(), p.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strsignal(sig: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrsignal(sig) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixWcslen(buf.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnam(name: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetpwnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetpwuid(uid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSocket(domain, ty, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: ConstPtr, len: SocklenT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixConnect(socket, address.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixListen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAccept(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetpeername(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSocketpair(domain, type, protocol, socketVector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixShutdown(socket, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixChmod(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFchmod(fd, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCreat(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixOpendir(dirname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixClosedir(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFchmodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAlarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixChdir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFchdir(dirfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLchown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixDup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixDup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: ConstPtr, arg0: ConstPtr, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExeclp(file.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr, argv: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExecv(prog.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr, argv: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetegid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGeteuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetgid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetgroups(ngroupsMax, groups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetlogin() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetpgid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetpgrp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetppid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPipe(fds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr, align: SizeT, size: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixAlignedAlloc(alignment.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRead(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSeteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetpgid(pid, pgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetsid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetreuid(ruid.toInt(), euid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetregid(rgid.toInt(), egid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcgetpgrp(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcsetpgrp(fd, pgrp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixTtyname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttynameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTtynameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUnlink(c.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixWait(status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixWaitpid(pid, status.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixWrite(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr, count: SizeT, offset: OffT): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr, count: SizeT, offset: OffT): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUmask(mask.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUtime(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixKill(pid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killpg(pgrp: PidT, sig: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixKillpg(pgrp, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMunlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMunlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMunmap(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: ConstPtr): CUint =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixIfNametoindex(ifname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixIfIndextoname(ifindex.toInt(), ifname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUnsetenv(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTruncate(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSignal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrusage(resource: CInt, usage: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetrusage(resource, usage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr, resolved: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr): ClockT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTimes(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr): Nothing {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, stacksize: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stackSize: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadKeyDelete(key) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixPthreadGetspecific(key) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadSetspecific(key, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr, type: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadMutexattrSettype(attr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, lock: MutPtr, abstime: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr, attr: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockRdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockTryrdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockWrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockTrywrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRaise(signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixDlopen(filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixDlerror() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixDlclose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hstrerror(errcode: CInt): ConstPtr =
    if (unixNapiAddon != null) ConstPtr((unixNapiAddon.libcUnixHstrerror(errcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): ConstPtr =
    if (unixNapiAddon != null) ConstPtr((unixNapiAddon.libcUnixGaiStrerror(errcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixResInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr): TimeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMktime(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr): TimeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTime(time.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGmtime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixLocaltime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixDifftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr): TimeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMknod(pathname.rawAddress.toString(), mode.toInt(), dev) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endservent() {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixEndservent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyport(port: CInt, proto: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetservbyport(port, proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservent(): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetservent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setservent(stayopen: CInt) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixSetservent(stayopen)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetprotobyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixGetprotobynumber(proto) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chroot(name: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixChroot(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUsleep(secs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixRecv(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPutenv(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPoll(fds.rawAddress.toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSemWait(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSemTrywait(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSemPost(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: ConstPtr, buf: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixStatvfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFstatvfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigemptyset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigaddset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigfillset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigdelset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigismember(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigpending(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMkfifo(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcdrain(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: ConstPtr): SpeedT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfgetispeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfgetospeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfsetispeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfsetospeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcgetattr(fd, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcsetattr(fd, optionalActions, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcflow(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcgetsid(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixTcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMkstemp(template.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixMkdtemp(template.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixTmpnam(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSetlogmask(maskpri) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    if (unixNapiAddon != null) {
        unixNapiAddon.libcUnixSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nice(incr: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixNice(incr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grantpt(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGrantpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPosixOpenpt(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixPtsname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixUnlockpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasestr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStrcasestr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockf(fd: CInt, cmd: CInt, len: OffT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixLockf(fd, cmd, len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjtime(delta: ConstPtr, olddelta: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAdjtime(delta.rawAddress.toString(), olddelta.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stpncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixStpncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixConfstr(name, buf.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: ConstPtr, info: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFlock(fd, operation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWmemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixOpenWmemstream(ptr.rawAddress.toString(), sizeloc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixGetsid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openat(dirfd: CInt, pathname: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFdopendir(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr, buf: MutPtr, bufsiz: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsz: SizeT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: MutPtr, writefds: MutPtr, errorfds: MutPtr, timeout: MutPtr, sigmask: ConstPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixPselect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmemopen(buf: MutPtr, size: SizeT, mode: ConstPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixFmemopen(buf.rawAddress.toString(), size.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openMemstream(ptr: MutPtr, sizeloc: MutPtr): MutPtr =
    if (unixNapiAddon != null) MutPtr((unixNapiAddon.libcUnixOpenMemstream(ptr.rawAddress.toString(), sizeloc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfmakeraw(termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: MutPtr, speed: SpeedT): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixCfsetspeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    if (unixNapiAddon != null) (unixNapiAddon.libcUnixFnmatch(pattern.rawAddress.toString(), name.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
