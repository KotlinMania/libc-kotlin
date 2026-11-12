@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.qurt.stdlib

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
import io.github.kotlinmania.libc.new.qurt.DivT
import io.github.kotlinmania.libc.new.qurt.LdivT
import io.github.kotlinmania.libc.new.qurt.LldivT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewQurtStdlibNapiAddon(): Boolean

private val newQurtStdlibNapiAvailable: Boolean = initNewQurtStdlibNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibMalloc(p0)")
private external fun wasmLibcNewQurtStdlibMalloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdlibCalloc(p0, p1)")
private external fun wasmLibcNewQurtStdlibCalloc(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdlibRealloc(p0, p1)")
private external fun wasmLibcNewQurtStdlibRealloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibFree(p0)")
private external fun wasmLibcNewQurtStdlibFree(p0: String)

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtStdlibAbort()")
private external fun wasmLibcNewQurtStdlibAbort()

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibExit(p0)")
private external fun wasmLibcNewQurtStdlibExit(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibAtexit(p0)")
private external fun wasmLibcNewQurtStdlibAtexit(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibGetenv(p0)")
private external fun wasmLibcNewQurtStdlibGetenv(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdlibSetenv(p0, p1, p2)")
private external fun wasmLibcNewQurtStdlibSetenv(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibUnsetenv(p0)")
private external fun wasmLibcNewQurtStdlibUnsetenv(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibAtoi(p0)")
private external fun wasmLibcNewQurtStdlibAtoi(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibAtol(p0)")
private external fun wasmLibcNewQurtStdlibAtol(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibAtoll(p0)")
private external fun wasmLibcNewQurtStdlibAtoll(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtol(p0, p1, p2)")
private external fun wasmLibcNewQurtStdlibStrtol(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtoul(p0, p1, p2)")
private external fun wasmLibcNewQurtStdlibStrtoul(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtoll(p0, p1, p2)")
private external fun wasmLibcNewQurtStdlibStrtoll(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtoull(p0, p1, p2)")
private external fun wasmLibcNewQurtStdlibStrtoull(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtod(p0, p1)")
private external fun wasmLibcNewQurtStdlibStrtod(p0: String, p1: String): Double

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewQurtStdlibStrtof(p0, p1)")
private external fun wasmLibcNewQurtStdlibStrtof(p0: String, p1: String): Double

@JsFun("() => globalThis.__km_napi_libc.libcNewQurtStdlibRand()")
private external fun wasmLibcNewQurtStdlibRand(): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibSrand(p0)")
private external fun wasmLibcNewQurtStdlibSrand(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcNewQurtStdlibQsort(p0, p1, p2, p3)")
private external fun wasmLibcNewQurtStdlibQsort(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcNewQurtStdlibBsearch(p0, p1, p2, p3, p4)")
private external fun wasmLibcNewQurtStdlibBsearch(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibAbs(p0)")
private external fun wasmLibcNewQurtStdlibAbs(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibLabs(p0)")
private external fun wasmLibcNewQurtStdlibLabs(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewQurtStdlibLlabs(p0)")
private external fun wasmLibcNewQurtStdlibLlabs(p0: String): String

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    if (newQurtStdlibNapiAvailable) MutPtr(wasmLibcNewQurtStdlibMalloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    if (newQurtStdlibNapiAvailable) MutPtr(wasmLibcNewQurtStdlibCalloc(nmemb.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    if (newQurtStdlibNapiAvailable) MutPtr(wasmLibcNewQurtStdlibRealloc(ptr.rawAddress.toString(), size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: MutPtr<CVoid>) {
    if (newQurtStdlibNapiAvailable) {
        wasmLibcNewQurtStdlibFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (newQurtStdlibNapiAvailable) {
        wasmLibcNewQurtStdlibAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (newQurtStdlibNapiAvailable) {
        wasmLibcNewQurtStdlibExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibAtexit(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(name: ConstPtr<CChar>): MutPtr<CChar> =
    if (newQurtStdlibNapiAvailable) MutPtr(wasmLibcNewQurtStdlibGetenv(name.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr<CChar>, value: ConstPtr<CChar>, overwrite: CInt): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr<CChar>): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibUnsetenv(name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(nptr: ConstPtr<CChar>): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibAtoi(nptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(nptr: ConstPtr<CChar>): CLong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibAtol(nptr.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(nptr: ConstPtr<CChar>): CLonglong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibAtoll(nptr.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtol(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtoul(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CLonglong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtoll(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>, base: CInt): CUlonglong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtoull(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CDouble =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtod(nptr.rawAddress.toString(), endptr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(nptr: ConstPtr<CChar>, endptr: MutPtr<MutPtr<CChar>>): CFloat =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibStrtof(nptr.rawAddress.toString(), endptr.rawAddress.toString()).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibRand() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (newQurtStdlibNapiAvailable) {
        wasmLibcNewQurtStdlibSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsort(base: MutPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    if (newQurtStdlibNapiAvailable) {
        wasmLibcNewQurtStdlibQsort(base.rawAddress.toString(), nmemb.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr<CVoid> =
    if (newQurtStdlibNapiAvailable) MutPtr(wasmLibcNewQurtStdlibBsearch(key.rawAddress.toString(), base.rawAddress.toString(), nmemb.toString(), size.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(j: CInt): CInt =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibAbs(j) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(j: CLong): CLong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibLabs(j.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(j: CLonglong): CLonglong =
    if (newQurtStdlibNapiAvailable) wasmLibcNewQurtStdlibLlabs(j.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")
