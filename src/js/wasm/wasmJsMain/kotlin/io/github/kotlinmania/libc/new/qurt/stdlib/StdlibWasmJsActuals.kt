@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.stdlib

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
import io.github.kotlinmania.libc.new.qurt.DivT
import io.github.kotlinmania.libc.new.qurt.LdivT
import io.github.kotlinmania.libc.new.qurt.LldivT
import io.github.kotlinmania.libc.new.qurt.SizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewQurtStdlibNapiAddon(): Boolean

private val _newQurtStdlibNapiAvailable: Boolean = _initNewQurtStdlibNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_malloc(p0)")
private external fun _wasm_libc_new_qurt_stdlib_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_calloc(p0, p1)")
private external fun _wasm_libc_new_qurt_stdlib_calloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_realloc(p0, p1)")
private external fun _wasm_libc_new_qurt_stdlib_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_free(p0)")
private external fun _wasm_libc_new_qurt_stdlib_free(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_stdlib_abort()")
private external fun _wasm_libc_new_qurt_stdlib_abort()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_exit(p0)")
private external fun _wasm_libc_new_qurt_stdlib_exit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_atexit(p0)")
private external fun _wasm_libc_new_qurt_stdlib_atexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_getenv(p0)")
private external fun _wasm_libc_new_qurt_stdlib_getenv(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_setenv(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdlib_setenv(p0: String?, p1: String?, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_unsetenv(p0)")
private external fun _wasm_libc_new_qurt_stdlib_unsetenv(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_atoi(p0)")
private external fun _wasm_libc_new_qurt_stdlib_atoi(p0: String?): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_atol(p0)")
private external fun _wasm_libc_new_qurt_stdlib_atol(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_atoll(p0)")
private external fun _wasm_libc_new_qurt_stdlib_atoll(p0: String?): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtol(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdlib_strtol(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtoul(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdlib_strtoul(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtoll(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdlib_strtoll(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtoull(p0, p1, p2)")
private external fun _wasm_libc_new_qurt_stdlib_strtoull(p0: String?, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtod(p0, p1)")
private external fun _wasm_libc_new_qurt_stdlib_strtod(p0: String?, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_strtof(p0, p1)")
private external fun _wasm_libc_new_qurt_stdlib_strtof(p0: String?, p1: String): Double

@JsFun("() => globalThis.__km_napi_libc.libc_new_qurt_stdlib_rand()")
private external fun _wasm_libc_new_qurt_stdlib_rand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_srand(p0)")
private external fun _wasm_libc_new_qurt_stdlib_srand(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_qsort(p0, p1, p2, p3)")
private external fun _wasm_libc_new_qurt_stdlib_qsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_bsearch(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_new_qurt_stdlib_bsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_abs(p0)")
private external fun _wasm_libc_new_qurt_stdlib_abs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_labs(p0)")
private external fun _wasm_libc_new_qurt_stdlib_labs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_qurt_stdlib_llabs(p0)")
private external fun _wasm_libc_new_qurt_stdlib_llabs(p0: String): String

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_calloc(nmemb.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_realloc((ptr?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: COpaquePointer?) {
    if (_newQurtStdlibNapiAvailable) {
        _wasm_libc_new_qurt_stdlib_free((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_newQurtStdlibNapiAvailable) {
        _wasm_libc_new_qurt_stdlib_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_newQurtStdlibNapiAvailable) {
        _wasm_libc_new_qurt_stdlib_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_atexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(name: String?): COpaquePointer? =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_getenv(name).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_setenv(name, value, overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: String?): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_unsetenv(name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(nptr: String?): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_atoi(nptr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(nptr: String?): CLong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_atol(nptr).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(nptr: String?): CLonglong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_atoll(nptr).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtol(nptr, (endptr?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtoul(nptr, (endptr?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtoll(nptr, (endptr?.value ?: 0L).toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtoull(nptr, (endptr?.value ?: 0L).toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtod(nptr, (endptr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_strtof(nptr, (endptr?.value ?: 0L).toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_rand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_newQurtStdlibNapiAvailable) {
        _wasm_libc_new_qurt_stdlib_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    if (_newQurtStdlibNapiAvailable) {
        _wasm_libc_new_qurt_stdlib_qsort((base?.value ?: 0L).toString(), nmemb.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), nmemb.toString(), size.toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(j: CInt): CInt =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_abs(j) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(j: CLong): CLong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_labs(j.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(j: CLonglong): CLonglong =
    if (_newQurtStdlibNapiAvailable) _wasm_libc_new_qurt_stdlib_llabs(j.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")
