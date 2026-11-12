@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val vxworksNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun isalnum(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFflush(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFclose(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr, newname: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buf: MutPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPutchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr, n: CInt, stream: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr, ptr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr, ptr: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr): CLonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr, endp: MutPtr): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr, endp: MutPtr): CFloat =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr, endp: MutPtr, base: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr, endp: MutPtr, base: CInt): CLonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr, endp: MutPtr, base: CInt): CUlong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr, endp: MutPtr, base: CInt): CUlonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr, size: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSystem(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr): SpeedT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfgetospeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfmakeraw(termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: MutPtr, speed: SpeedT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfsetispeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr, speed: SpeedT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfsetospeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr, src: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr, ct: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr, ct: ConstPtr, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr, ct: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr, ct: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr, c: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr, c: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr, ct: ConstPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr, ct: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr, s2: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr, s2: ConstPtr, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrnlen(cs.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr, t: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr, ct: ConstPtr, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWcslen(buf.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr, src: ConstPtr, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr, c: WcharT, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr, ct: ConstPtr, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr, src: ConstPtr, c: CInt, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr, c: CInt, n: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksAlignedAlloc(alignment.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr): ClockT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTimes(buf.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMkdtemp(template.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetprotobyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetprotobynumber(proto) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: ConstPtr, proto: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr, owner: UidT, group: GidT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr, buf: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCreat(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr, amode: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAlarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchdir(dirfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr, uid: UidT, gid: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetegid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGeteuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetgroups(ngroupsMax, groups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetlogin() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr, optstr: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr, name: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSeteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTtyname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWait(status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUmask(mask) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunmap(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr, length: OffT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTruncate(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShmOpen(name.rawAddress.toString(), oflag, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr): Nothing {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr, state: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigaddset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr, oldact: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr, times: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr, flag: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlopen(filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlerror() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr, symbol: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDlclose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: MutPtr, info: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr, result: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMktime(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTime(time.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGmtime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaltime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDifftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUsleep(secs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPutenv(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigpending(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkfifo(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr, offset: OffT, whence: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr): OffT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkstemp(template.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTmpnam(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr, logopt: CInt, facility: CInt) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetlogmask(maskpri) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr, vararg variadicArgs: Long) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getline(lineptr: MutPtr, n: MutPtr, stream: MutPtr): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcsetattr(fd, optionalActions, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcgetattr(fd, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: MutPtr, len: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksConfstr(name, buf.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFnmatch(pattern.rawAddress.toString(), name.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr, newdirfd: CInt, linkpath: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchmodat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr, buf: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtime(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemalign(blockSize.toString(), sizeArg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr, size: SizeT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(attr: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChdir(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(pAttr: MutPtr, pType: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrSettype(pAttr.rawAddress.toString(), pType) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: MutPtr, attr: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexInit(mutex.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexDestroy(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexLock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexTrylock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(attr: MutPtr, spec: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexTimedlock(attr.rawAddress.toString(), spec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexUnlock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetname(pAttr: MutPtr, name: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetname(pAttr.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr, stacksize: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetstacksize(attr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr, size: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrGetstacksize(attr.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(pThread: MutPtr, pAttr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCreate(pThread.rawAddress.toString(), pAttr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(thread: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrDestroy(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr, buf: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(pDir: MutPtr, entry: MutPtr, result: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReaddirR(pDir.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(pDir: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksReaddir(pDir.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr, nfds: NfdsT, timeout: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPoll(fds.rawAddress.toString(), nfds.toInt(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr, pClockId: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrGetclock(pAttr.rawAddress.toString(), pClockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(pAttr: MutPtr, clockId: ClockidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrSetclock(pAttr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr, attr: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr, mutex: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondWait(cond.rawAddress.toString(), mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr, attr2: CUint): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress.toString(), attr2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(attr: MutPtr, host: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockInit(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockRdlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTryrdlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr, host: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTimedrdlock(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockWrlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTrywrlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr, host: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTimedwrlock(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockUnlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadKeyDelete(key.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSetspecific(key.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksPthreadGetspecific(key.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr, mutex: MutPtr, abstime: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondTimedwait(cond.rawAddress.toString(), mutex.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetname(attr: MutPtr, name: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrGetname(attr.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadJoin(thread.toLong().toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockGettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockSettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockGetres(clockId, res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr, rmtp: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAccept(s, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksBind(fd, addr.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: CInt, name: ConstPtr, namelen: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksConnect(s, name.rawAddress.toString(), namelen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: CInt, name: MutPtr, namelen: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetpeername(s, name.rawAddress.toString(), namelen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr, addressLen: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksListen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecv(s, buf.rawAddress.toString(), bufLen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: CInt, buf: MutPtr, bufLen: SizeT, flags: CInt, from: MutPtr, pFromLen: MutPtr): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecvfrom(s, buf.rawAddress.toString(), bufLen.toString(), flags, from.rawAddress.toString(), pFromLen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, mp: MutPtr, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecvmsg(socket, mp.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, mp: ConstPtr, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSendmsg(socket, mp.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr, len: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr, optionLen: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShutdown(s, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSocket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGaiStrerror(errcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr, count: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRead(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr, count: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWrite(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(src: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDup(src) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPipe(fds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnlink(pathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr, service: ConstPtr, hints: ConstPtr, res: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSignal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetppid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetpgid(pid, pgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr, options: CInt): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWaitpid(pid, status.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(attr: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSysconf(attr) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(envVarName: ConstPtr, envVarValue: ConstPtr, overwrite: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetenv(envVarName.rawAddress.toString(), envVarValue.rawAddress.toString(), overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(envVarName: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnsetenv(envVarName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(fileName: ConstPtr, resolvedName: MutPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksRealpath(fileName.rawAddress.toString(), resolvedName.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr, dst: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr, buf: MutPtr, bufsize: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr, path2: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(name: ConstPtr): MutPtr =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksOpendir(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(dirName: ConstPtr, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkdir(dirName.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChmod(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchmod(attr1, attr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(ptr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClosedir(ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedRrGetInterval(pid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoSet(err: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksErrnoSet(err) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoGet(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksErrnoGet() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetgid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigemptyset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigfillset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigdelset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigismember(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSigmask(how, set.rawAddress.toString(), oset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, signo: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksKill(pid, signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskKill(taskId: TaskId, signo: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskKill(taskId, signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signo: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRaise(signo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskIdSelf(): TaskId =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskIdSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDelay(ticks: VxTicksT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskDelay(ticks.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskNameSet(taskId, taskName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr, bufsize: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskNameGet(taskId, bufName.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpSpawn(pubrtpFileName: ConstPtr, argv: MutPtr, envp: MutPtr, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRtpSpawn(pubrtpFileName.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), priority, uStackSize.toString(), options, taskOptions) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsAbsolute(filepath: ConstPtr, pNameTail: MutPtr): Bool =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPathIsAbsolute(filepath.rawAddress.toString(), pNameTail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randBytes(buf: MutPtr, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandBytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randABytes(buf: MutPtr, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandABytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randUBytes(buf: MutPtr, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandUBytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randSecure(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandSecure() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuEnabledGet(): CpusetT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksVxCpuEnabledGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuConfiguredGet(): CpusetT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksVxCpuConfiguredGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
