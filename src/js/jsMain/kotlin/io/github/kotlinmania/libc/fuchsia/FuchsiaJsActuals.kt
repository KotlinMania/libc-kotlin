@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CFloat
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.fuchsia.aarch64.Stat
import io.github.kotlinmania.libc.fuchsia.aarch64.WcharT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val fuchsiaNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun isalnum(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFflush(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFclose(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPutchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: SigactionSaRestorerCallback): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSystem(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrnlen(cs.rawAddress.toString(), maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWcslen(buf.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmemchr(cx: ConstPtr<WcharT>, c: WcharT, n: SizeT): MutPtr<WcharT> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaWmemchr(cx.rawAddress.toString(), c.toInt(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwnam(name: ConstPtr<CChar>): MutPtr<Passwd> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetpwnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuid(uid: UidT): MutPtr<Passwd> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetpwuid(uid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcharUnlocked(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetcharUnlocked() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putcharUnlocked(c: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPutcharUnlocked(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(domain: CInt, ty: CInt, protocol: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSocket(domain, ty, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(socket: CInt, address: ConstPtr<Sockaddr>, len: SocklenT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaConnect(socket, address.rawAddress.toString(), len.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaListen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAccept(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpeername(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetsockname(socket, address.rawAddress.toString(), addressLen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(socket: CInt, level: CInt, name: CInt, value: ConstPtr<CVoid>, optionLen: SocklenT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetsockopt(socket, level, name, value.rawAddress.toString(), optionLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socketpair(domain: CInt, type: CInt, protocol: CInt, socketVector: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSocketpair(domain, type, protocol, socketVector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSendto(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdown(socket: CInt, how: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShutdown(socket, how) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chmod(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaChmod(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmod(fd: CInt, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFchmod(fd, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkdir(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCreat(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFcntl(fd, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun opendir(dirname: ConstPtr<CChar>): MutPtr<DIR> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaOpendir(dirname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaReaddir(dirp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReaddirR(dirp.rawAddress.toString(), entry.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closedir(dirp: MutPtr<DIR>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClosedir(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewinddir(dirp: MutPtr<DIR>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaRewinddir(dirp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaOpenat(dirfd, pathname.rawAddress.toString(), flags, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchmodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFchmodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchown(fd: CInt, owner: UidT, group: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFchown(fd, owner.toInt(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fchownat(dirfd: CInt, pathname: ConstPtr<CChar>, owner: UidT, group: GidT, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFchownat(dirfd, pathname.rawAddress.toString(), owner.toInt(), group.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<Stat>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFstatat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun linkat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLinkat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdirat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkdirat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsiz: SizeT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReadlinkat(dirfd, pathname.rawAddress.toString(), buf.rawAddress.toString(), bufsiz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameat(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRenameat(olddirfd, oldpath.rawAddress.toString(), newdirfd, newpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlinkat(target: ConstPtr<CChar>, newdirfd: CInt, linkpath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSymlinkat(target.rawAddress.toString(), newdirfd, linkpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlinkat(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUnlinkat(dirfd, pathname.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alarm(seconds: CUint): CUint =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAlarm(seconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaChdir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaChown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lchown(path: ConstPtr<CChar>, uid: UidT, gid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLchown(path.rawAddress.toString(), uid.toInt(), gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(file: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExeclp(file.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecv(prog.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fork(): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFork() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fpathconf(filedes: CInt, name: CInt): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFpathconf(filedes, name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetcwd(buf.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getegid(): GidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetegid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun geteuid(): UidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGeteuid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgid(): GidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetgid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgroups(ngroupsMax: CInt, groups: MutPtr<GidT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetgroups(ngroupsMax, groups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlogin(): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetlogin() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getopt(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstr: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetopt(argc, argv.rawAddress.toString(), optstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgid(pid: PidT): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpgid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpgrp(): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpgrp() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getppid(): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetppid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getuid(): UidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetuid() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun link(src: ConstPtr<CChar>, dst: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLink(src.rawAddress.toString(), dst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLseek(fd, offset.toString(), whence) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathconf(path: ConstPtr<CChar>, name: CInt): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPathconf(path.rawAddress.toString(), name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pause(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPause() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPipe(fds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPosixMemalign(memptr.rawAddress.toString(), align.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRead(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seteuid(uid: UidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSeteuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setegid(gid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetegid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgid(gid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpgid(pid: PidT, pgid: PidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetpgid(pid, pgid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsid(): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetsid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setuid(uid: UidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sleep(secs: CUint): CUint =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSleep(secs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaNanosleep(rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetpgrp(fd: CInt): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcgetpgrp(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetpgrp(fd: CInt, pgrp: PidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcsetpgrp(fd, pgrp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ttyname(fd: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaTtyname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUnlink(c.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wait(status: MutPtr<CInt>): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWait(status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitpid(pid: PidT, status: MutPtr<CInt>, options: CInt): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWaitpid(pid, status.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWrite(fd, buf.rawAddress.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pread(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPread(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwrite(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: OffT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPwrite(fd, buf.rawAddress.toString(), count.toString(), offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umask(mask: ModeT): ModeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUmask(mask.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utime(file: ConstPtr<CChar>, buf: ConstPtr<Utimbuf>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUtime(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kill(pid: PidT, sig: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaKill(pid, sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlock(addr: ConstPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMunlock(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mlockall(flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMlockall(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munlockall(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMunlockall() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMmap(addr.rawAddress.toString(), len.toString(), prot, flags, fd, offset.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMunmap(addr.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(ifname: ConstPtr<CChar>): CUint =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIfNametoindex(ifname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifIndextoname(ifindex: CUint, ifname: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaIfIndextoname(ifindex.toInt(), ifname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lstat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsync(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFsync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUnsetenv(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun symlink(path1: ConstPtr<CChar>, path2: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSymlink(path1.rawAddress.toString(), path2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFtruncate(fd, length.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSignal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realpath(pathname: ConstPtr<CChar>, resolved: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaRealpath(pathname.rawAddress.toString(), resolved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flock(fd: CInt, operation: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFlock(fd, operation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGettimeofday(tp.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun times(buf: MutPtr<Tms>): ClockT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTimes(buf.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSelf(): PthreadT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadSelf() as String).toLong().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadJoin(native: PthreadT, value: MutPtr<MutPtr<CVoid>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadJoin(native.toLong().toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadExit(value: MutPtr<CVoid>): Nothing {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaPthreadExit(value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function pthreadExit")
}

public actual fun pthreadAttrInit(attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrDestroy(attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstacksize(attr: ConstPtr<PthreadAttrT>, stacksize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrGetstacksize(attr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetstacksize(attr: MutPtr<PthreadAttrT>, stackSize: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrSetstacksize(attr.rawAddress.toString(), stackSize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetdetachstate(attr: MutPtr<PthreadAttrT>, state: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrSetdetachstate(attr.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadDetach(thread: PthreadT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadDetach(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedYield(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedYield() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyCreate(key: MutPtr<PthreadKeyT>, dtor: PthreadKeyCreateDtorCallback?): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadKeyCreate(key.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadKeyDelete(key.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetspecific(key: PthreadKeyT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaPthreadGetspecific(key.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetspecific(key: PthreadKeyT, value: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadSetspecific(key.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexInit(lock: MutPtr<PthreadMutexT>, attr: ConstPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexDestroy(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexLock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexLock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTrylock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexTrylock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexUnlock(lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrInit(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrDestroy(attr: MutPtr<PthreadMutexattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexattrSettype(attr: MutPtr<PthreadMutexattrT>, type: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexattrSettype(attr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondInit(cond: MutPtr<PthreadCondT>, attr: ConstPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondInit(cond.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondWait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondWait(cond.rawAddress.toString(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondTimedwait(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondTimedwait(cond.rawAddress.toString(), lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondSignal(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondSignal(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondBroadcast(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondBroadcast(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondDestroy(cond: MutPtr<PthreadCondT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondDestroy(cond.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrInit(attr: MutPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrDestroy(attr: MutPtr<PthreadCondattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockInit(lock: MutPtr<PthreadRwlockT>, attr: ConstPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockInit(lock.rawAddress.toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockDestroy(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockDestroy(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockRdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockRdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTryrdlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockTryrdlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockWrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockWrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockTrywrlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockTrywrlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockUnlock(lock: MutPtr<PthreadRwlockT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockUnlock(lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrInit(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockattrInit(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadRwlockattrDestroy(attr: MutPtr<PthreadRwlockattrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadRwlockattrDestroy(attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadGetnameNp(thread.toLong().toString(), name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadSetnameNp(thread.toLong().toString(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStrerrorR(errnum, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRaise(signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaction(signum: CInt, act: ConstPtr<Sigaction>, oldact: MutPtr<Sigaction>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigaction(signum, act.rawAddress.toString(), oldact.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimes(filename: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUtimes(filename.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlopen(filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaDlopen(filename.rawAddress.toString(), flag) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlerror(): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaDlerror() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaDlsym(handle.rawAddress.toString(), symbol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlclose(handle: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDlclose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dladdr(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDladdr(addr.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(node: ConstPtr<CChar>, service: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetaddrinfo(node.rawAddress.toString(), service.rawAddress.toString(), hints.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(res: MutPtr<Addrinfo>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaFreeaddrinfo(res.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(errcode: CInt): ConstPtr<CChar> =
    if (fuchsiaNapiAddon != null) ConstPtr((fuchsiaNapiAddon.libcFuchsiaGaiStrerror(errcode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resInit(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaResInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGmtimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeR(timeP: ConstPtr<TimeT>, result: MutPtr<Tm>): MutPtr<Tm> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaLocaltimeR(timeP.rawAddress.toString(), result.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mktime(tm: MutPtr<Tm>): TimeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMktime(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(time: MutPtr<TimeT>): TimeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTime(time.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGmtime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtime(timeP: ConstPtr<TimeT>): MutPtr<Tm> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaLocaltime(timeP.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknod(pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMknod(pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUname(buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getservbyname(name: ConstPtr<CChar>, proto: ConstPtr<CChar>): MutPtr<Servent> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetservbyname(name.rawAddress.toString(), proto.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobyname(name: ConstPtr<CChar>): MutPtr<Protoent> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetprotobyname(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getprotobynumber(proto: CInt): MutPtr<Protoent> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetprotobynumber(proto) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun usleep(secs: CUint): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUsleep(secs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun send(socket: CInt, buf: ConstPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSend(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recv(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRecv(socket, buf.rawAddress.toString(), len.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(string: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPutenv(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPoll(fds.rawAddress.toString(), nfds.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun select(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: MutPtr<Timeval>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSelect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localeconv(): MutPtr<Lconv> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaLocaleconv() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemDestroy(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semWait(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemWait(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTrywait(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemTrywait(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semPost(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemPost(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemInit(sem.rawAddress.toString(), pshared, value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statvfs(path: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStatvfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatvfs(fd: CInt, buf: MutPtr<Statvfs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFstatvfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readlink(path: ConstPtr<CChar>, buf: MutPtr<CChar>, bufsz: SizeT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReadlink(path.rawAddress.toString(), buf.rawAddress.toString(), bufsz.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigemptyset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigaddset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigfillset(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigdelset(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigismember(set.rawAddress.toString(), signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigprocmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigpending(set.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timegm(tm: MutPtr<Tm>): TimeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTimegm(tm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsid(pid: PidT): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetsid(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sysconf(name: CInt): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSysconf(name) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifo(path: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkfifo(path.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pselect(nfds: CInt, readfds: MutPtr<FdSet>, writefds: MutPtr<FdSet>, errorfds: MutPtr<FdSet>, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPselect(nfds, readfds.rawAddress.toString(), writefds.rawAddress.toString(), errorfds.rawAddress.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseeko(stream: MutPtr<FILE>, offset: OffT, whence: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFseeko(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftello(stream: MutPtr<FILE>): OffT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFtello(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcdrain(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcdrain(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetispeed(termios: ConstPtr<Termios>): SpeedT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCfgetispeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfgetospeed(termios: ConstPtr<Termios>): SpeedT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCfgetospeed(termios.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfmakeraw(termios: MutPtr<Termios>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaCfmakeraw(termios.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cfsetispeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCfsetispeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetospeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCfsetospeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cfsetspeed(termios: MutPtr<Termios>, speed: SpeedT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaCfsetspeed(termios.rawAddress.toString(), speed.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetattr(fd: CInt, termios: MutPtr<Termios>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcgetattr(fd, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsetattr(fd: CInt, optionalActions: CInt, termios: ConstPtr<Termios>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcsetattr(fd, optionalActions, termios.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflow(fd: CInt, action: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcflow(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcflush(fd: CInt, action: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcflush(fd, action) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcgetsid(fd: CInt): PidT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcgetsid(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcsendbreak(fd: CInt, duration: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTcsendbreak(fd, duration) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemp(template: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkstemp(template.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdtemp(template: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMkdtemp(template.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(ptr: MutPtr<CChar>): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaTmpnam(ptr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openlog(ident: ConstPtr<CChar>, logopt: CInt, facility: CInt) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaOpenlog(ident.rawAddress.toString(), logopt, facility)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closelog() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaCloselog()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setlogmask(maskpri: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetlogmask(maskpri) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun syslog(priority: CInt, message: ConstPtr<CChar>, vararg variadicArgs: Long) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSyslog(priority, message.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun grantpt(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGrantpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixOpenpt(flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPosixOpenpt(flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsname(fd: CInt): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaPtsname(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockpt(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUnlockpt(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdatasync(fd: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFdatasync(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClockGetres(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClockGettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClockSettime(clkId, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDirfd(dirp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadGetattrNp(native.toLong().toString(), attr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrGetstack(attr.rawAddress.toString(), stackaddr.rawAddress.toString(), stacksize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemalign(align.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetgroups(ngroups.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPipe2(fds.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaStatfs(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFstatfs(fd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaMemrchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPosixFadvise(fd, offset.toString(), len.toString(), advise) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFutimens(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUtimensat(dirfd, path.rawAddress.toString(), times.rawAddress.toString(), flag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplocale(base: LocaleT): LocaleT =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaDuplocale(base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freelocale(loc: LocaleT) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaFreelocale(loc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaNewlocale(mask, locale.rawAddress.toString(), base.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uselocale(loc: LocaleT): LocaleT =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaUselocale(loc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopendir(fd: CInt): MutPtr<DIR> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaFdopendir(fd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMknodat(dirfd, pathname.rawAddress.toString(), mode.toInt(), dev.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondattrGetclock(attr.rawAddress.toString(), clockId.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCondattrSetclock(attr.rawAddress.toString(), clockId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAccept4(fd, addr.rawAddress.toString(), len.rawAddress.toString(), flg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPtsnameR(fd, buf.rawAddress.toString(), buflen.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearenv(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClearenv() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWaitid(idtype.toInt(), id.toInt(), infop.rawAddress.toString(), options) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setreuid(ruid: UidT, euid: UidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetreuid(ruid.toInt(), euid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setregid(rgid: GidT, egid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetregid(rgid.toInt(), egid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetresuid(ruid.rawAddress.toString(), euid.rawAddress.toString(), suid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetresgid(rgid.rawAddress.toString(), egid.rawAddress.toString(), sgid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acct(filename: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaAcct(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaBrk(addr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetresgid(rgid.toInt(), egid.toInt(), sgid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetresuid(ruid.toInt(), euid.toInt(), suid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaOpenpty(amaster.rawAddress.toString(), aslave.rawAddress.toString(), name.rawAddress.toString(), termp.rawAddress.toString(), winp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaExecvpe(file.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFexecve(fd, argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaIoctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaLutimes(file.rawAddress.toString(), times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setpwent() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSetpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endpwent() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaEndpwent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getpwent(): MutPtr<Passwd> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetpwent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShmOpen(name.rawAddress.toString(), oflag, mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShmget(key, size.toString(), shmflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaShmat(shmid, shmaddr.rawAddress.toString(), shmflg) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShmdt(shmaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShmctl(shmid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFtok(pathname.rawAddress.toString(), projId) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemget(key, nsems, semflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemop(semid, sops.rawAddress.toString(), nsops.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMsgctl(msqid, cmd, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMsgget(key, msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMsgrcv(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgtyp.toString(), msgflg) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMsgsnd(msqid, msgp.rawAddress.toString(), msgsz.toString(), msgflg) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMprotect(addr.rawAddress.toString(), len.toString(), prot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun errnoLocation(): MutPtr<CInt> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaErrnoLocation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFallocate(fd, mode, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPosixFallocate(fd, offset.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readahead(fd: CInt, offset: Off64T, count: SizeT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReadahead(fd, offset.toString(), count.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalfd(fd: CInt, mask: ConstPtr<SigsetT>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSignalfd(fd, mask.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTimerfdCreate(clockid, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTimerfdGettime(fd, currValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTimerfdSettime(fd, flags, newValue.rawAddress.toString(), oldValue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPwritev(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPreadv(fd, iov.rawAddress.toString(), iovcnt, offset.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun quotactl(cmd: CInt, special: ConstPtr<CChar>, id: CInt, data: MutPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaQuotactl(cmd, special.rawAddress.toString(), id, data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDup3(oldfd, newfd, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkostemp(template.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkostemps(template.rawAddress.toString(), suffixlen, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigtimedwait(set.rawAddress.toString(), info.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigwaitinfo(set.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaNlLanginfoL(item, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetnameinfo(sa.rawAddress.toString(), salen.toInt(), host.rawAddress.toString(), hostlen.toInt(), serv.rawAddress.toString(), servlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reboot(howTo: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReboot(howTo) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsgid(gid: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetfsgid(gid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setfsuid(uid: UidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetfsuid(uid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkfifoat(dirfd, pathname.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaIfNameindex() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaIfFreenameindex(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syncFileRange(fd: CInt, offset: Off64T, nbytes: Off64T, flags: CUint): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSyncFileRange(fd, offset.toString(), nbytes.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetifaddrs(ifap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeifaddrs(ifa: MutPtr<Ifaddrs>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaFreeifaddrs(ifa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGlob(pattern.rawAddress.toString(), flags, 0L.toString(), pglob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun globfree(pglob: MutPtr<GlobT>) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaGlobfree(pglob.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPosixMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaShmUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSeekdir(dirp.rawAddress.toString(), loc.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTelldir(dirp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMadvise(addr.rawAddress.toString(), len.toString(), advice) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMsync(addr.rawAddress.toString(), len.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRecvfrom(socket, buf.rawAddress.toString(), len.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMkstemps(template.rawAddress.toString(), suffixlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFutimes(fd, times.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaNlLanginfo(item) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaBind(socket, address.rawAddress.toString(), addressLen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaWritev(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaReadv(fd, iov.rawAddress.toString(), iovcnt) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSendmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRecvmsg(fd, msg.rawAddress.toString(), flags) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSetdomainname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhangup(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaVhangup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSendmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaRecvmmsg(sockfd, msgvec.rawAddress.toString(), vlen.toInt(), flags, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sync() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSync()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun syscall(num: CLong, vararg variadicArgs: Long): CLong =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSyscall(num.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedGetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedSetaffinity(pid, cpusetsize.toString(), cpuset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount(target: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUmount(target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedGetPriorityMax(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaTee(fdIn, fdOut, len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSettimeofday(tv.rawAddress.toString(), tz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun splice(fdIn: CInt, offIn: MutPtr<LoffT>, fdOut: CInt, offOut: MutPtr<LoffT>, len: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSplice(fdIn, offIn.rawAddress.toString(), fdOut, offOut.rawAddress.toString(), len.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaEventfd(initval.toInt(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedRrGetInterval(pid, tp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemTimedwait(sem.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemGetvalue(sem.rawAddress.toString(), sval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedSetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapoff(puath: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSwapoff(puath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vmsplice(fd: CInt, iov: ConstPtr<Iovec>, nrSegs: SizeT, flags: CUint): SsizeT =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaVmsplice(fd, iov.rawAddress.toString(), nrSegs.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, fstype: ConstPtr<CChar>, flags: CUlong, data: ConstPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaMount(src.rawAddress.toString(), target.rawAddress.toString(), fstype.rawAddress.toString(), flags.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun personality(persona: CUlong): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPersonality(persona.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedGetparam(pid, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPpoll(fds.rawAddress.toString(), nfds.toString(), timeout.rawAddress.toString(), sigmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadMutexTimedlock(lock.rawAddress.toString(), abstime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clone(cb: CloneCbCallback, childStack: MutPtr<CVoid>, flags: CInt, arg: MutPtr<CVoid>, vararg variadicArgs: Long): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClone(0L.toString(), childStack.rawAddress.toString(), flags, arg.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetscheduler(pid: PidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedGetscheduler(pid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaClockNanosleep(clkId, flags, rqtp.rawAddress.toString(), rmtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrGetguardsize(attr.rawAddress.toString(), guardsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAttrSetguardsize(attr.rawAddress.toString(), guardsize.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSethostname(name.rawAddress.toString(), len.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedGetPriorityMin(policy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun umount2(target: ConstPtr<CChar>, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaUmount2(target.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapon(path: ConstPtr<CChar>, swapflags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSwapon(path.rawAddress.toString(), swapflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSchedSetscheduler(pid, policy, param.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigsuspend(mask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetgrgidR(gid.toInt(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigaltstack(ss.rawAddress.toString(), oss.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemClose(sem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getdtablesize(): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetdtablesize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetgrnamR(name.rawAddress.toString(), grp.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaInitgroups(user.rawAddress.toString(), group.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadSigmask(how, set.rawAddress.toString(), oldset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaSemOpen(name.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetgrnam(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCancel(thread.toLong().toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadKill(thread.toLong().toString(), sig) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSemUnlink(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDaemon(nochdir, noclose) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpwnamR(name.rawAddress.toString(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetpwuidR(uid.toInt(), pwd.rawAddress.toString(), buf.rawAddress.toString(), buflen.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaSigwait(set.rawAddress.toString(), sig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAtfork(prepare: SigactionSaRestorerCallback?, parent: SigactionSaRestorerCallback?, child: SigactionSaRestorerCallback?): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadAtfork(0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetgrgid(gid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setgrent() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaSetgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endgrent() {
    if (fuchsiaNapiAddon != null) {
        fuchsiaNapiAddon.libcFuchsiaEndgrent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getgrent(): MutPtr<Group> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaGetgrent() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaGetgrouplist(user.rawAddress.toString(), group.toInt(), groups.rawAddress.toString(), ngroups.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (fuchsiaNapiAddon != null) MutPtr((fuchsiaNapiAddon.libcFuchsiaPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaFaccessat(dirfd, pathname.rawAddress.toString(), mode, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaPthreadCreate(native.rawAddress.toString(), attr.rawAddress.toString(), 0L.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    if (fuchsiaNapiAddon != null) (fuchsiaNapiAddon.libcFuchsiaDlIteratePhdr(0L.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
