@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.FposT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtStdioNapiAddon(): Boolean

private val newQurtStdioNapiAvailable: Boolean = initNewQurtStdioNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioFopen(p0, p1)")
private external fun wasmLibcNewQurtStdioFopen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdioFreopen(p0, p1, p2)")
private external fun wasmLibcNewQurtStdioFreopen(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFclose(p0)")
private external fun wasmLibcNewQurtStdioFclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFflush(p0)")
private external fun wasmLibcNewQurtStdioFflush(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtStdioFread(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtStdioFread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtStdioFwrite(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtStdioFwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFgetc(p0)")
private external fun wasmLibcNewQurtStdioFgetc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioFputc(p0, p1)")
private external fun wasmLibcNewQurtStdioFputc(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtStdioGetchar()")
private external fun wasmLibcNewQurtStdioGetchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioPutchar(p0)")
private external fun wasmLibcNewQurtStdioPutchar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioUngetc(p0, p1)")
private external fun wasmLibcNewQurtStdioUngetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdioFgets(p0, p1, p2)")
private external fun wasmLibcNewQurtStdioFgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioFputs(p0, p1)")
private external fun wasmLibcNewQurtStdioFputs(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioGets(p0)")
private external fun wasmLibcNewQurtStdioGets(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioPuts(p0)")
private external fun wasmLibcNewQurtStdioPuts(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcNewQurtStdioPrintf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcNewQurtStdioPrintf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcNewQurtStdioFprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcNewQurtStdioFprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcNewQurtStdioSprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcNewQurtStdioSprintf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libcNewQurtStdioSnprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmLibcNewQurtStdioSnprintf(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioVprintf(p0, p1)")
private external fun wasmLibcNewQurtStdioVprintf(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdioVfprintf(p0, p1, p2)")
private external fun wasmLibcNewQurtStdioVfprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdioVsprintf(p0, p1, p2)")
private external fun wasmLibcNewQurtStdioVsprintf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtStdioVsnprintf(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtStdioVsnprintf(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcNewQurtStdioScanf(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcNewQurtStdioScanf(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcNewQurtStdioFscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcNewQurtStdioFscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libcNewQurtStdioSscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmLibcNewQurtStdioSscanf(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdioFseek(p0, p1, p2)")
private external fun wasmLibcNewQurtStdioFseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFtell(p0)")
private external fun wasmLibcNewQurtStdioFtell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioRewind(p0)")
private external fun wasmLibcNewQurtStdioRewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioFgetpos(p0, p1)")
private external fun wasmLibcNewQurtStdioFgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioFsetpos(p0, p1)")
private external fun wasmLibcNewQurtStdioFsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioClearerr(p0)")
private external fun wasmLibcNewQurtStdioClearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFeof(p0)")
private external fun wasmLibcNewQurtStdioFeof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioFerror(p0)")
private external fun wasmLibcNewQurtStdioFerror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioPerror(p0)")
private external fun wasmLibcNewQurtStdioPerror(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioRemove(p0)")
private external fun wasmLibcNewQurtStdioRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioRename(p0, p1)")
private external fun wasmLibcNewQurtStdioRename(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtStdioTmpfile()")
private external fun wasmLibcNewQurtStdioTmpfile(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdioTmpnam(p0)")
private external fun wasmLibcNewQurtStdioTmpnam(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtStdioSetvbuf(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtStdioSetvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdioSetbuf(p0, p1)")
private external fun wasmLibcNewQurtStdioSetbuf(p0: String, p1: String)

public actual fun fopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioFopen(filename.rawAddress.toString(), mode.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, stream: MutPtr<FILE>): MutPtr<FILE> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioFreopen(filename.rawAddress.toString(), mode.rawAddress.toString(), stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFclose(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFflush(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: MutPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFread(ptr.rawAddress.toString(), size.toString(), nmemb.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: ConstPtr<CVoid>, size: SizeT, nmemb: SizeT, stream: MutPtr<FILE>): SizeT =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFwrite(ptr.rawAddress.toString(), size.toString(), nmemb.toString(), stream.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFgetc(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFputc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioGetchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioPutchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioUngetc(c, stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(s: MutPtr<CChar>, size: CInt, stream: MutPtr<FILE>): MutPtr<CChar> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioFgets(s.rawAddress.toString(), size, stream.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: ConstPtr<CChar>, stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFputs(s.rawAddress.toString(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(s: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioGets(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: ConstPtr<CChar>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioPuts(s.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioPrintf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFprintf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioSprintf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioSnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(format: ConstPtr<CChar>, ap: VaList): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioVprintf(format.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, ap: VaList): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioVfprintf(stream.rawAddress.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: MutPtr<CChar>, format: ConstPtr<CChar>, ap: VaList): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioVsprintf(s.rawAddress.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: MutPtr<CChar>, n: SizeT, format: ConstPtr<CChar>, ap: VaList): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioVsnprintf(s.rawAddress.toString(), n.toString(), format.rawAddress.toString(), ap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioScanf(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: MutPtr<FILE>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFscanf(stream.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: ConstPtr<CChar>, format: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioSscanf(s.rawAddress.toString(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: MutPtr<FILE>, offset: CLong, whence: CInt): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFseek(stream.rawAddress.toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: MutPtr<FILE>): CLong =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFtell(stream.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: MutPtr<FILE>) {
    if (newQurtStdioNapiAvailable) {
        wasmLibcNewQurtStdioRewind(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: MutPtr<FILE>, pos: MutPtr<FposT>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFgetpos(stream.rawAddress.toString(), pos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: MutPtr<FILE>, pos: ConstPtr<FposT>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFsetpos(stream.rawAddress.toString(), pos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: MutPtr<FILE>) {
    if (newQurtStdioNapiAvailable) {
        wasmLibcNewQurtStdioClearerr(stream.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun feof(stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFeof(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: MutPtr<FILE>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioFerror(stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: ConstPtr<CChar>) {
    if (newQurtStdioNapiAvailable) {
        wasmLibcNewQurtStdioPerror(s.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun remove(filename: ConstPtr<CChar>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioRemove(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(old: ConstPtr<CChar>, new: ConstPtr<CChar>): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioRename(old.rawAddress.toString(), new.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): MutPtr<FILE> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioTmpfile().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(s: MutPtr<CChar>): MutPtr<CChar> =
    if (newQurtStdioNapiAvailable) MutPtr(wasmLibcNewQurtStdioTmpnam(s.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>, mode: CInt, size: SizeT): CInt =
    if (newQurtStdioNapiAvailable) wasmLibcNewQurtStdioSetvbuf(stream.rawAddress.toString(), buffer.rawAddress.toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: MutPtr<FILE>, buffer: MutPtr<CChar>) {
    if (newQurtStdioNapiAvailable) {
        wasmLibcNewQurtStdioSetbuf(stream.rawAddress.toString(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
