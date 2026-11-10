@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _newQurtStdlibNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_malloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nmemb: SizeT, size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_calloc(nmemb.toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_realloc((ptr?.value ?: 0L).toString(), size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: COpaquePointer?) {
    if (_newQurtStdlibNapiAddon != null) {
        _newQurtStdlibNapiAddon.libc_new_qurt_stdlib_free((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (_newQurtStdlibNapiAddon != null) {
        _newQurtStdlibNapiAddon.libc_new_qurt_stdlib_abort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (_newQurtStdlibNapiAddon != null) {
        _newQurtStdlibNapiAddon.libc_new_qurt_stdlib_exit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_atexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(name: String?): COpaquePointer? =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_getenv(name) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: String?, value: String?, overwrite: CInt): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_setenv(name, value, overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: String?): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_unsetenv(name) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(nptr: String?): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_atoi(nptr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(nptr: String?): CLong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_atol(nptr) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(nptr: String?): CLonglong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_atoll(nptr) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(nptr: String?, endptr: COpaquePointer?, base: CInt): CLong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtol(nptr, (endptr?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtoul(nptr, (endptr?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(nptr: String?, endptr: COpaquePointer?, base: CInt): CLonglong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtoll(nptr, (endptr?.value ?: 0L).toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(nptr: String?, endptr: COpaquePointer?, base: CInt): CUlonglong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtoull(nptr, (endptr?.value ?: 0L).toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(nptr: String?, endptr: COpaquePointer?): CDouble =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtod(nptr, (endptr?.value ?: 0L).toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(nptr: String?, endptr: COpaquePointer?): CFloat =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_strtof(nptr, (endptr?.value ?: 0L).toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_rand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (_newQurtStdlibNapiAddon != null) {
        _newQurtStdlibNapiAddon.libc_new_qurt_stdlib_srand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsort(base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    if (_newQurtStdlibNapiAddon != null) {
        _newQurtStdlibNapiAddon.libc_new_qurt_stdlib_qsort((base?.value ?: 0L).toString(), nmemb.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): COpaquePointer? =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_bsearch((key?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), nmemb.toString(), size.toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(j: CInt): CInt =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_abs(j) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(j: CLong): CLong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_labs(j.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(j: CLonglong): CLonglong =
    if (_newQurtStdlibNapiAddon != null) (_newQurtStdlibNapiAddon.libc_new_qurt_stdlib_llabs(j.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")
