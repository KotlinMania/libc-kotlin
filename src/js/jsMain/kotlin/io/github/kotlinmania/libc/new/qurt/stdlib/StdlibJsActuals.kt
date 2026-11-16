@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.stdlib

import io.github.kotlinmania.libc.*
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val newQurtStdlibNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun malloc(size: SizeT): MutPtr =
    if (newQurtStdlibNapiAddon != null) MutPtr((newQurtStdlibNapiAddon.libcNewQurtStdlibMalloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calloc(nmemb: SizeT, size: SizeT): MutPtr =
    if (newQurtStdlibNapiAddon != null) MutPtr((newQurtStdlibNapiAddon.libcNewQurtStdlibCalloc(nmemb.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(ptr: MutPtr, size: SizeT): MutPtr =
    if (newQurtStdlibNapiAddon != null) MutPtr((newQurtStdlibNapiAddon.libcNewQurtStdlibRealloc(ptr.rawAddress.toString(), size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(ptr: MutPtr) {
    if (newQurtStdlibNapiAddon != null) {
        newQurtStdlibNapiAddon.libcNewQurtStdlibFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun abort(): Nothing {
    if (newQurtStdlibNapiAddon != null) {
        newQurtStdlibNapiAddon.libcNewQurtStdlibAbort()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function abort")
}

public actual fun exit(status: CInt): Nothing {
    if (newQurtStdlibNapiAddon != null) {
        newQurtStdlibNapiAddon.libcNewQurtStdlibExit(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
    error("Unreachable noreturn C function exit")
}

public actual fun atexit(function: AtexitFunctionCallback): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibAtexit(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getenv(name: ConstPtr): MutPtr =
    if (newQurtStdlibNapiAddon != null) MutPtr((newQurtStdlibNapiAddon.libcNewQurtStdlibGetenv(name.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setenv(name: ConstPtr, value: ConstPtr, overwrite: CInt): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibSetenv(name.rawAddress.toString(), value.rawAddress.toString(), overwrite) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsetenv(name: ConstPtr): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibUnsetenv(name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoi(nptr: ConstPtr): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibAtoi(nptr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atol(nptr: ConstPtr): CLong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibAtol(nptr.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun atoll(nptr: ConstPtr): CLonglong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibAtoll(nptr.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtol(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtol(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoul(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtoul(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoll(nptr: ConstPtr, endptr: MutPtr, base: CInt): CLonglong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtoll(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtoull(nptr: ConstPtr, endptr: MutPtr, base: CInt): CUlonglong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtoull(nptr.rawAddress.toString(), endptr.rawAddress.toString(), base) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtod(nptr: ConstPtr, endptr: MutPtr): CDouble =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtod(nptr.rawAddress.toString(), endptr.rawAddress.toString()) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strtof(nptr: ConstPtr, endptr: MutPtr): CFloat =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibStrtof(nptr.rawAddress.toString(), endptr.rawAddress.toString()) as Double).toFloat() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rand(): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibRand() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srand(seed: CUint) {
    if (newQurtStdlibNapiAddon != null) {
        newQurtStdlibNapiAddon.libcNewQurtStdlibSrand(seed.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun qsort(base: MutPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback) {
    if (newQurtStdlibNapiAddon != null) {
        newQurtStdlibNapiAddon.libcNewQurtStdlibQsort(base.rawAddress.toString(), nmemb.toString(), size.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bsearch(key: ConstPtr, base: ConstPtr, nmemb: SizeT, size: SizeT, compar: QsortComparCallback): MutPtr =
    if (newQurtStdlibNapiAddon != null) MutPtr((newQurtStdlibNapiAddon.libcNewQurtStdlibBsearch(key.rawAddress.toString(), base.rawAddress.toString(), nmemb.toString(), size.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abs(j: CInt): CInt =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibAbs(j) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun labs(j: CLong): CLong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibLabs(j.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun llabs(j: CLonglong): CLonglong =
    if (newQurtStdlibNapiAddon != null) (newQurtStdlibNapiAddon.libcNewQurtStdlibLlabs(j.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun div(numer: CInt, denom: CInt): DivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ldiv(numer: CLong, denom: CLong): LdivT =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lldiv(numer: CLonglong, denom: CLonglong): LldivT =
    throw UnsupportedOperationException("Native FFI addon is not available")
