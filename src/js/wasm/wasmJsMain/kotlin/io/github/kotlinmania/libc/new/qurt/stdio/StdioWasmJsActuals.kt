@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.stdio

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.FILE
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.VaList

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtStdioNapiAddon(): Boolean

private val _newQurtStdioNapiAvailable: Boolean = _initNewQurtStdioNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fopen(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_fopen(p0: String?, p1: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdio_freopen(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdio_freopen(p0: String?, p1: String?, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fclose(p0)")
private external fun _wasm_libc_new_qurt_stdio_fclose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fflush(p0)")
private external fun _wasm_libc_new_qurt_stdio_fflush(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fread(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_stdio_fread(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fwrite(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_stdio_fwrite(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fgetc(p0)")
private external fun _wasm_libc_new_qurt_stdio_fgetc(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fputc(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_fputc(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_stdio_getchar()")
private external fun _wasm_libc_new_qurt_stdio_getchar(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_putchar(p0)")
private external fun _wasm_libc_new_qurt_stdio_putchar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_ungetc(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_ungetc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fgets(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdio_fgets(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fputs(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_fputs(p0: String?, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_gets(p0)")
private external fun _wasm_libc_new_qurt_stdio_gets(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_puts(p0)")
private external fun _wasm_libc_new_qurt_stdio_puts(p0: String?): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_new_qurt_stdio_printf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_new_qurt_stdio_printf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_new_qurt_stdio_fprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_new_qurt_stdio_sprintf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_new_qurt_stdio_sprintf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_libc.libc_new_qurt_stdio_snprintf(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_libc_new_qurt_stdio_snprintf(p0: String, p1: String, p2: String?, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_vprintf(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_vprintf(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdio_vfprintf(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdio_vfprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdio_vsprintf(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdio_vsprintf(p0: String, p1: String?, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_stdio_vsnprintf(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_stdio_vsnprintf(p0: String, p1: String, p2: String?, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_new_qurt_stdio_scanf(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_new_qurt_stdio_scanf(p0: String?, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_new_qurt_stdio_fscanf(p0: String, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_new_qurt_stdio_sscanf(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_new_qurt_stdio_sscanf(p0: String?, p1: String?, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fseek(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdio_fseek(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_ftell(p0)")
private external fun _wasm_libc_new_qurt_stdio_ftell(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_rewind(p0)")
private external fun _wasm_libc_new_qurt_stdio_rewind(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fgetpos(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_fgetpos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_fsetpos(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_fsetpos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_clearerr(p0)")
private external fun _wasm_libc_new_qurt_stdio_clearerr(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_feof(p0)")
private external fun _wasm_libc_new_qurt_stdio_feof(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_ferror(p0)")
private external fun _wasm_libc_new_qurt_stdio_ferror(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_perror(p0)")
private external fun _wasm_libc_new_qurt_stdio_perror(p0: String?)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_remove(p0)")
private external fun _wasm_libc_new_qurt_stdio_remove(p0: String?): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_rename(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_rename(p0: String?, p1: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_stdio_tmpfile()")
private external fun _wasm_libc_new_qurt_stdio_tmpfile(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdio_tmpnam(p0)")
private external fun _wasm_libc_new_qurt_stdio_tmpnam(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_stdio_setvbuf(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_stdio_setvbuf(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdio_setbuf(p0, p1)")
private external fun _wasm_libc_new_qurt_stdio_setbuf(p0: String, p1: String)

public actual fun fopen(filename: String?, mode: String?): FILE? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fopen(filename, mode).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freopen(filename: String?, mode: String?, stream: FILE?): FILE? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_freopen(filename, mode, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fclose(stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fclose((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fflush(stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fflush((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fread(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fread((ptr?.value ?: 0L).toString(), size.toString(), nmemb.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwrite(ptr: COpaquePointer?, size: SizeT, nmemb: SizeT, stream: FILE?): SizeT =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fwrite((ptr?.value ?: 0L).toString(), size.toString(), nmemb.toString(), (stream?.handle ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgetc(stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fgetc((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputc(c: CInt, stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fputc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getchar(): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_getchar() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun putchar(c: CInt): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_putchar(c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ungetc(c: CInt, stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_ungetc(c, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fgets(s: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fgets((s?.value ?: 0L).toString(), size, (stream?.handle ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fputs(s: String?, stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fputs(s, (stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gets(s: COpaquePointer?): COpaquePointer? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_gets((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun puts(s: String?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_puts(s) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printf(format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_printf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fprintf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_sprintf((s?.value ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_snprintf((s?.value ?: 0L).toString(), n.toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vprintf(format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_vprintf(format, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vfprintf(stream: FILE?, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_vfprintf((stream?.handle ?: 0L).toString(), format, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsprintf(s: COpaquePointer?, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_vsprintf((s?.value ?: 0L).toString(), format, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vsnprintf(s: COpaquePointer?, n: SizeT, format: String?, ap: VaList): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_vsnprintf((s?.value ?: 0L).toString(), n.toString(), format, (ap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanf(format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_scanf(format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fscanf((stream?.handle ?: 0L).toString(), format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_sscanf(s, format, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fseek((stream?.handle ?: 0L).toString(), offset.toString(), whence) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftell(stream: FILE?): CLong =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_ftell((stream?.handle ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rewind(stream: FILE?) {
    if (_newQurtStdioNapiAvailable) {
        _wasm_libc_new_qurt_stdio_rewind((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fgetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fgetpos((stream?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fsetpos(stream: FILE?, pos: COpaquePointer?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_fsetpos((stream?.handle ?: 0L).toString(), (pos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearerr(stream: FILE?) {
    if (_newQurtStdioNapiAvailable) {
        _wasm_libc_new_qurt_stdio_clearerr((stream?.handle ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun feof(stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_feof((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ferror(stream: FILE?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_ferror((stream?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perror(s: String?) {
    if (_newQurtStdioNapiAvailable) {
        _wasm_libc_new_qurt_stdio_perror(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun remove(filename: String?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_remove(filename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rename(old: String?, new: String?): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_rename(old, new) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpfile(): FILE? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_tmpfile().toLong().let { if (it == 0L) null else FILE(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmpnam(s: COpaquePointer?): COpaquePointer? =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_tmpnam((s?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt =
    if (_newQurtStdioNapiAvailable) _wasm_libc_new_qurt_stdio_setvbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString(), mode, size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setbuf(stream: FILE?, buffer: COpaquePointer?) {
    if (_newQurtStdioNapiAvailable) {
        _wasm_libc_new_qurt_stdio_setbuf((stream?.handle ?: 0L).toString(), (buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
