@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.vxworks.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFflush(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFclose(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
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

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
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

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSystem(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfgetospeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr<Termios>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfmakeraw(termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfsetispeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCfsetospeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrcasecmp(s1.rawAddress.toString(), s2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncasecmp(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrncasecmp(s1.rawAddress.toString(), s2.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrnlen(cs.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWcslen(buf.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memccpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemccpy(dest.rawAddress.toString(), src.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedAlloc(alignment: SizeT, size: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksAlignedAlloc(alignment.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTimes(buf.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMkdtemp(template.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetprotobyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetprotobynumber(proto) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksCreat(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAlarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchdir(dirfd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchdir(dirfd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetegid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGeteuid() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetgroups(ngroupsMax, groups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetlogin() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSeteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTtyname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr<CInt>): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWait(status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUmask(mask) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMunmap(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncate(path: ConstPtr<CChar>, length: OffT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTruncate(path.rawAddress.toString(), length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShmOpen(name.rawAddress.toString(), oflag, mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadEqual(t1.toLong().toString(), t2.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigaddset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlopen(filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlerror() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDlclose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: MutPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMktime(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr<TimeT>): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTime(time.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGmtime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaltime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(time1: TimeT, time0: TimeT): CDouble =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDifftime(time1.toString(), time0.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: UsecondsT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUsleep(secs.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPutenv(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr<Lconv> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigpending(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkfifo(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkstemp(template.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksTmpnam(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
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

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (vxworksNapiAddon != null) {
        vxworksNapiAddon.libcVxworksSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getline(lineptr: MutPtr<MutPtr<CChar>>, n: MutPtr<SizeT>, stream: MutPtr<FILE>): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetline(lineptr.rawAddress.toString(), n.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcsetattr(fd, optionalActions, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcgetattr(fd, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun confstr(name: CInt, buf: MutPtr<CChar>, len: SizeT): SizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksConfstr(name, buf.rawAddress.toString(), len.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fnmatch(pattern: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFnmatch(pattern.rawAddress.toString(), name.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchmodat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUtime(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(blockSize: SizeT, sizeArg: SizeT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksMemalign(blockSize.toString(), sizeArg.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(attr: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChdir(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(pAttr: MutPtr<PthreadMutexattrT>, pType: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexattrSettype(pAttr.rawAddress.toString(), pType) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(mutex: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexInit(mutex.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexDestroy(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexLock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexTrylock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(attr: MutPtr<PthreadMutexT>, spec: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexTimedlock(attr.rawAddress.toString(), spec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadMutexUnlock(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetname(pAttr: MutPtr<PthreadAttrT>, name: MutPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetname(pAttr.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stacksize: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetstacksize(attr.rawAddress.toString(), stacksize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, size: MutPtr<SizeT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrGetstacksize(attr.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(pThread: MutPtr<PthreadT>, pAttr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, value: MutPtr<CVoid>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCreate(pThread.rawAddress.toString(), pAttr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSetschedparam(native.toLong().toString(), policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadGetschedparam(native.toLong().toString(), policy.rawAddress.toString(), param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetinheritsched(attr.rawAddress.toString(), inheritsched) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrSetschedpolicy(attr.rawAddress.toString(), policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(thread: MutPtr<PthreadAttrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrDestroy(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(pDir: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReaddirR(pDir.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(pDir: MutPtr<DIR>): MutPtr<Dirent> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksReaddir(pDir.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPoll(fds.rawAddress.toString(), nfds.toInt(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(pAttr: ConstPtr<PthreadCondattrT>, pClockId: MutPtr<ClockidT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrGetclock(pAttr.rawAddress.toString(), pClockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(pAttr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondattrSetclock(pAttr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondWait(cond.rawAddress.toString(), mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrSetmaxreaders(attr: MutPtr<PthreadRwlockattrT>, attr2: CUint): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockattrSetmaxreaders(attr.rawAddress.toString(), attr2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<PthreadRwlockattrT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockInit(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockRdlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTryrdlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedrdlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTimedrdlock(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockWrlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTrywrlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTimedwrlock(attr: MutPtr<PthreadRwlockT>, host: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockTimedwrlock(attr.rawAddress.toString(), host.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(attr: MutPtr<PthreadRwlockT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadRwlockUnlock(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadKeyDelete(key.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSetspecific(key.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksPthreadGetspecific(key.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadCondTimedwait(cond.rawAddress.toString(), mutex.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetname(attr: MutPtr<PthreadAttrT>, name: MutPtr<MutPtr<CChar>>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadAttrGetname(attr.rawAddress.toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(thread: PthreadT, status: MutPtr<MutPtr<CVoid>>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadJoin(thread.toLong().toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockGettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockSettime(clockId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockGetres(clockId, res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClockNanosleep(clockId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksAccept(s, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksBind(fd, addr.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: CInt, name: ConstPtr<Sockaddr>, namelen: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksConnect(s, name.rawAddress.toString(), namelen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: CInt, name: MutPtr<Sockaddr>, namelen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetpeername(s, name.rawAddress.toString(), namelen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksListen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecv(s, buf.rawAddress.toString(), bufLen.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: CInt, buf: MutPtr<CVoid>, bufLen: SizeT, flags: CInt, from: MutPtr<Sockaddr>, pFromLen: MutPtr<SocklenT>): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecvfrom(s, buf.rawAddress.toString(), bufLen.toString(), flags, from.rawAddress.toString(), pFromLen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(socket: CInt, mp: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRecvmsg(socket, mp.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(socket: CInt, mp: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSendmsg(socket, mp.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(s: CInt, how: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksShutdown(s, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSocket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gaiStrerror(errcode: CInt): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksGaiStrerror(errcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRead(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWrite(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(src: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDup(src) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksDup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPipe(fds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnlink(pathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
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

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWaitpid(pid, status.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(attr: CInt): CLong =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSysconf(attr) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(envVarName: ConstPtr<CChar>, envVarValue: ConstPtr<CChar>, overwrite: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSetenv(envVarName.rawAddress.toString(), envVarValue.rawAddress.toString(), overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(envVarName: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksUnsetenv(envVarName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(fileName: ConstPtr<CChar>, resolvedName: MutPtr<CChar>): MutPtr<CChar> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksRealpath(fileName.rawAddress.toString(), resolvedName.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsize: SizeT): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsize.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(name: ConstPtr<CChar>): MutPtr<DIR> =
    if (vxworksNapiAddon != null) MutPtr((vxworksNapiAddon.libcVxworksOpendir(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(dirName: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMkdir(dirName.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksChmod(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(attr1: CInt, attr2: ModeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFchmod(attr1, attr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(ptr: MutPtr<DIR>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksClosedir(ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
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

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigemptyset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigfillset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigdelset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksSigismember(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
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

public actual fun taskNameSet(taskId: TaskId, taskName: MutPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskNameSet(taskId, taskName.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskNameGet(taskId: TaskId, bufName: MutPtr<CChar>, bufsize: SizeT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksTaskNameGet(taskId, bufName.rawAddress.toString(), bufsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpInfoGet(rtpId: RtpId, rtpStruct: MutPtr<RtpDesc>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRtpInfoGet(rtpId, rtpStruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtpSpawn(pubrtpFileName: ConstPtr<CChar>, argv: MutPtr<ConstPtr<CChar>>, envp: MutPtr<ConstPtr<CChar>>, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRtpSpawn(pubrtpFileName.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString(), priority, uStackSize.toString(), options, taskOptions) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsAbsolute(filepath: ConstPtr<CChar>, pNameTail: MutPtr<ConstPtr<CChar>>): Bool =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksPathIsAbsolute(filepath.rawAddress.toString(), pNameTail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandBytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randABytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandABytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randUBytes(buf: MutPtr<CUchar>, length: CInt): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandUBytes(buf.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun randSecure(): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksRandSecure() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong().toInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqClose(mqd: MqdT): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqClose(mqd.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqReceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqTimedreceive(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.rawAddress.toString(), absTimeout.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqSend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqTimedsend(mqd.toLong().toString(), msgPtr.rawAddress.toString(), msgLen.toString(), msgPrio.toInt(), absTimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqGetattr(mqd.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksMqSetattr(mqd.toLong().toString(), newattr.rawAddress.toString(), oldattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuEnabledGet(): CpusetT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksVxCpuEnabledGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vxCpuConfiguredGet(): CpusetT =
    if (vxworksNapiAddon != null) (vxworksNapiAddon.libcVxworksVxCpuConfiguredGet() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
