@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val windowsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalnum(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsalnum(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isalpha(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsalpha(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iscntrl(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIscntrl(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isdigit(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isgraph(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsgraph(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun islower(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIslower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isprint(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsprint(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ispunct(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIspunct(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isspace(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsspace(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isupper(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isxdigit(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsxdigit(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isblank(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsblank(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tolower(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsTolower(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toupper(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsToupper(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qsort(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortComparCallback?) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsQsort(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsortS(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortSComparCallback?, arg: MutPtr<CVoid>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsQsortS(base.rawAddress.toString(), num.toString(), size.toString(), 0L.toString(), arg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), file.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(file: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFflush(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(file: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFclose(file.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(oldname: ConstPtr<CChar>, newname: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRename(oldname.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buf: MutPtr<CChar>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsSetbuf(stream.rawAddress.toString(), buf.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getchar(): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPutchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(buf: MutPtr<CChar>, n: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsFgets(buf.rawAddress.toString(), n, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFread(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFwrite(ptr.rawAddress.toString(), size.toString(), nobj.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, ptr: MutPtr<FposT>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFgetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, ptr: ConstPtr<FposT>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFsetpos(stream.rawAddress.toString(), ptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun atof(s: ConstPtr<CChar>): CDouble =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAtof(s.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAtoi(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(s: ConstPtr<CChar>): CLong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAtol(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(s: ConstPtr<CChar>): CLonglong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAtoll(s.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CDouble =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtod(s.rawAddress.toString(), endp.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>): CFloat =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtof(s.rawAddress.toString(), endp.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtol(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtoll(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtoul(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(s: ConstPtr<CChar>, endp: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrtoull(s.rawAddress.toString(), endp.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsCalloc(nobj.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msize(p: MutPtr<CVoid>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsMsize(p.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsRealloc(p.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: MutPtr<CVoid>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsFree(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(cb: AtexitCbCallback): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun system(s: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSystem(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(s: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsGetenv(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrcpy(dst.rawAddress.toString(), src.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrncpy(dst.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcat(s: MutPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrcat(s.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncat(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrncat(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrcmp(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strncmp(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrncmp(cs.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcoll(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrcoll(cs.rawAddress.toString(), ct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strrchr(cs: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrrchr(cs.rawAddress.toString(), c) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strcspn(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrcspn(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strdup(cs: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrdup(cs.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strpbrk(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrpbrk(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strstr(cs: ConstPtr<CChar>, ct: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrstr(cs.rawAddress.toString(), ct.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrlen(cs.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strnlen(cs: ConstPtr<CChar>, maxlen: SizeT): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrnlen(cs.rawAddress.toString(), maxlen.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strerror(n: CInt): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrerror(n) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtok(s: MutPtr<CChar>, t: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsStrtok(s.rawAddress.toString(), t.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strxfrm(s: MutPtr<CChar>, ct: ConstPtr<CChar>, n: SizeT): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStrxfrm(s.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcslen(buf: ConstPtr<WcharT>): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWcslen(buf.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcsnlen(str: ConstPtr<WcharT>, numberOfElements: SizeT): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWcsnlen(str.rawAddress.toString(), numberOfElements.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcstombs(dest: MutPtr<CChar>, src: ConstPtr<WcharT>, n: SizeT): SizeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWcstombs(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsMemchr(cx.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcmp(cx: ConstPtr<CVoid>, ct: ConstPtr<CVoid>, n: SizeT): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsMemcmp(cx.rawAddress.toString(), ct.rawAddress.toString(), n.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsMemcpy(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memmove(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsMemmove(dest.rawAddress.toString(), src.rawAddress.toString(), n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun memset(dest: MutPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsMemset(dest.rawAddress.toString(), c, n.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(i: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAbs(i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(i: CLong): CLong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsLabs(i.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun signal(signum: CInt, handler: SighandlerT): SighandlerT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSignal(signum, handler.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun raise(signum: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRaise(signum) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clock(): ClockT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsClock() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ctime(sourceTime: ConstPtr<TimeT>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsCtime(sourceTime.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun difftime(timeEnd: TimeT, timeStart: TimeT): CDouble =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsDifftime(timeEnd.toString(), timeStart.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gmtimeS(destTime: MutPtr<Tm>, srcTime: ConstPtr<TimeT>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGmtimeS(destTime.rawAddress.toString(), srcTime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDaylight(hours: MutPtr<CInt>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetDaylight(hours.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDstbias(seconds: MutPtr<CLong>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetDstbias(seconds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimezone(seconds: MutPtr<CLong>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetTimezone(seconds.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTzname(pReturnValue: MutPtr<SizeT>, timeZoneName: MutPtr<CChar>, sizeInBytes: SizeT, index: CInt): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetTzname(pReturnValue.rawAddress.toString(), timeZoneName.rawAddress.toString(), sizeInBytes.toString(), index) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localtimeS(tmDest: MutPtr<Tm>, sourceTime: ConstPtr<TimeT>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsLocaltimeS(tmDest.rawAddress.toString(), sourceTime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun time(destTime: MutPtr<TimeT>): TimeT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsTime(destTime.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzset() {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsTzset()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun chmod(path: ConstPtr<CChar>, mode: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsChmod(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wchmod(path: ConstPtr<WcharT>, mode: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWchmod(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkdir(path: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsMkdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrmdir(path: ConstPtr<WcharT>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWrmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fstat(fildes: CInt, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFstat(fildes, buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stat(path: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsStat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wstat(path: ConstPtr<WcharT>, buf: MutPtr<Stat>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWstat(path.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wutime(file: ConstPtr<WcharT>, buf: MutPtr<Utimbuf>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWutime(file.rawAddress.toString(), buf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsPopen(command.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pclose(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fdopen(fd: CInt, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsFdopen(fd, mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileno(stream: MutPtr<FILE>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsFileno(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun open(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsOpen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wopen(path: ConstPtr<WcharT>, oflag: CInt, vararg variadicArgs: Long): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWopen(path.rawAddress.toString(), oflag, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun creat(path: ConstPtr<CChar>, mode: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsCreat(path.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun access(path: ConstPtr<CChar>, amode: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAccess(path.rawAddress.toString(), amode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chdir(dir: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsChdir(dir.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsClose(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup(fd: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsDup(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dup2(src: CInt, dst: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsDup2(src, dst) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execl(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecl(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecl(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execle(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecle(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecle(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlp(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExeclp(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclp(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexeclp(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execlpe(path: ConstPtr<CChar>, arg0: ConstPtr<CChar>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExeclpe(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexeclpe(path: ConstPtr<WcharT>, arg0: ConstPtr<WcharT>, vararg variadicArgs: Long): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexeclpe(path.rawAddress.toString(), arg0.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execv(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecv(prog.rawAddress.toString(), argv.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execve(prog: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvp(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecvp(c.rawAddress.toString(), argv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun execvpe(c: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsExecvpe(c.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecv(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecv(prog.rawAddress.toString(), argv.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecve(prog: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecve(prog.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvp(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecvp(c.rawAddress.toString(), argv.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wexecvpe(c: ConstPtr<WcharT>, argv: ConstPtr<ConstPtr<WcharT>>, envp: ConstPtr<ConstPtr<WcharT>>): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWexecvpe(c.rawAddress.toString(), argv.rawAddress.toString(), envp.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getcwd(buf: MutPtr<CChar>, size: CInt): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsGetcwd(buf.rawAddress.toString(), size) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpid(): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetpid() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isatty(fd: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsIsatty(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek(fd: CInt, offset: CLong, origin: CInt): CLong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsLseek(fd, offset.toString(), origin) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lseek64(fd: CInt, offset: CLonglong, origin: CInt): CLonglong =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsLseek64(fd, offset.toString(), origin) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe(fds: MutPtr<CInt>, psize: CUint, textmode: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPipe(fds.rawAddress.toString(), psize.toInt(), textmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: CUint): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRead(fd, buf.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rmdir(path: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRmdir(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlink(c: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsUnlink(c.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: CUint): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWrite(fd, buf.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commit(fd: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsCommit(fd) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOsfhandle(fd: CInt): IntptrT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetOsfhandle(fd) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openOsfhandle(osfhandle: IntptrT, flags: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsOpenOsfhandle(osfhandle.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setlocale(category: CInt, locale: ConstPtr<CChar>): MutPtr<CChar> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsSetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsetlocale(category: CInt, locale: ConstPtr<WcharT>): MutPtr<WcharT> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsWsetlocale(category, locale.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedMalloc(size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsAlignedMalloc(size.toString(), alignment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignedFree(ptr: MutPtr<CVoid>) {
    if (windowsNapiAddon != null) {
        windowsNapiAddon.libcWindowsAlignedFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun alignedRealloc(memblock: MutPtr<CVoid>, size: SizeT, alignment: SizeT): MutPtr<CVoid> =
    if (windowsNapiAddon != null) MutPtr((windowsNapiAddon.libcWindowsAlignedRealloc(memblock.rawAddress.toString(), size.toString(), alignment.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenv(envstring: ConstPtr<CChar>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPutenv(envstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenv(envstring: ConstPtr<WcharT>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWputenv(envstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putenvS(envstring: ConstPtr<CChar>, valueString: ConstPtr<CChar>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsPutenvS(envstring.rawAddress.toString(), valueString.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wputenvS(envstring: ConstPtr<WcharT>, valueString: ConstPtr<WcharT>): ErrnoT =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsWputenvS(envstring.rawAddress.toString(), valueString.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(s: Socket, backlog: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsListen(s.toString(), backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(s: Socket, addr: MutPtr<Sockaddr>, addrlen: MutPtr<CInt>): Socket =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsAccept(s.toString(), addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsBind(s.toString(), name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(s: Socket, name: ConstPtr<Sockaddr>, namelen: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsConnect(s.toString(), name.rawAddress.toString(), namelen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetpeername(s.toString(), name.rawAddress.toString(), nameln.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(s: Socket, name: MutPtr<Sockaddr>, nameln: MutPtr<CInt>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetsockname(s.toString(), name.rawAddress.toString(), nameln.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(s: Socket, level: CInt, optname: CInt, optval: MutPtr<CChar>, optlen: MutPtr<CInt>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsGetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(s: Socket, buf: MutPtr<CChar>, len: CInt, flags: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<CInt>): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsRecvfrom(s.toString(), buf.rawAddress.toString(), len, flags, from.rawAddress.toString(), fromlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(s: Socket, buf: ConstPtr<CChar>, len: CInt, flags: CInt, to: ConstPtr<Sockaddr>, tolen: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSendto(s.toString(), buf.rawAddress.toString(), len, flags, to.rawAddress.toString(), tolen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(s: Socket, level: CInt, optname: CInt, optval: ConstPtr<CChar>, optlen: CInt): CInt =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSetsockopt(s.toString(), level, optname, optval.rawAddress.toString(), optlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun socket(af: CInt, socketType: CInt, protocol: CInt): Socket =
    if (windowsNapiAddon != null) (windowsNapiAddon.libcWindowsSocket(af, socketType, protocol) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
