@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtStdioNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun fopen(filename: ConstPtr, mode: ConstPtr): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioFopen(filename.rawAddress.toString(), mode.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr, mode: ConstPtr, stream: MutPtr): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFclose(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFflush(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFread(ptr.rawAddress.toString(), size.toString(), nmemb.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr, size: SizeT, nmemb: SizeT, stream: MutPtr): SizeT =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFwrite(ptr.rawAddress.toString(), size.toString(), nmemb.toString(), stream.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFgetc(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFputc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioGetchar() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioPutchar(c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioUngetc(c, stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(s: MutPtr, size: CInt, stream: MutPtr): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioFgets(s.rawAddress.toString(), size, stream.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr, stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFputs(s.rawAddress.toString(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(s: MutPtr): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioGets(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioPuts(s.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr, n: SizeT, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(format: ConstPtr, ap: VaList): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioVprintf(format.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(stream: MutPtr, format: ConstPtr, ap: VaList): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioVfprintf(stream.rawAddress.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: MutPtr, format: ConstPtr, ap: VaList): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioVsprintf(s.rawAddress.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: MutPtr, n: SizeT, format: ConstPtr, ap: VaList): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioVsnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr, format: ConstPtr, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr, offset: CLong, whence: CInt): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFseek(stream.rawAddress.toString(), offset.toString(), whence) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr): CLong =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFtell(stream.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr) {
    if (newQurtStdioNapiAddon != null) {
        newQurtStdioNapiAddon.libcNewQurtStdioRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr, pos: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFgetpos(stream.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr, pos: ConstPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFsetpos(stream.rawAddress.toString(), pos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: MutPtr) {
    if (newQurtStdioNapiAddon != null) {
        newQurtStdioNapiAddon.libcNewQurtStdioClearerr(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun feof(stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFeof(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioFerror(stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr) {
    if (newQurtStdioNapiAddon != null) {
        newQurtStdioNapiAddon.libcNewQurtStdioPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun remove(filename: ConstPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioRemove(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(old: ConstPtr, new: ConstPtr): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioRename(old.rawAddress.toString(), new.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioTmpfile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(s: MutPtr): MutPtr =
    if (newQurtStdioNapiAddon != null) MutPtr((newQurtStdioNapiAddon.libcNewQurtStdioTmpnam(s.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr, buffer: MutPtr, mode: CInt, size: SizeT): CInt =
    if (newQurtStdioNapiAddon != null) (newQurtStdioNapiAddon.libcNewQurtStdioSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr, buffer: MutPtr) {
    if (newQurtStdioNapiAddon != null) {
        newQurtStdioNapiAddon.libcNewQurtStdioSetbuf(stream.rawAddress.toString(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
