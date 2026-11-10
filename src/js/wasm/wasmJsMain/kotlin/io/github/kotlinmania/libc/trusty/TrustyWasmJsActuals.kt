@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initTrustyNapiAddon(): Boolean

private val _trustyNapiAvailable: Boolean = _initTrustyNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_calloc(p0, p1)")
private external fun _wasm_libc_trusty_calloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_trusty_malloc(p0)")
private external fun _wasm_libc_trusty_malloc(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_realloc(p0, p1)")
private external fun _wasm_libc_trusty_realloc(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_trusty_free(p0)")
private external fun _wasm_libc_trusty_free(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_memalign(p0, p1)")
private external fun _wasm_libc_trusty_memalign(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_trusty_posixMemalign(p0, p1, p2)")
private external fun _wasm_libc_trusty_posixMemalign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_trusty_write(p0, p1, p2)")
private external fun _wasm_libc_trusty_write(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_trusty_writev(p0, p1, p2)")
private external fun _wasm_libc_trusty_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_trusty_close(p0)")
private external fun _wasm_libc_trusty_close(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_trusty_strlen(p0)")
private external fun _wasm_libc_trusty_strlen(p0: String?): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_trusty_getauxval(p0)")
private external fun _wasm_libc_trusty_getauxval(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_trusty_mmap(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_trusty_mmap(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_munmap(p0, p1)")
private external fun _wasm_libc_trusty_munmap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_clockGettime(p0, p1)")
private external fun _wasm_libc_trusty_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_trusty_nanosleep(p0, p1)")
private external fun _wasm_libc_trusty_nanosleep(p0: String, p1: String): Int

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    if (_trustyNapiAvailable) _wasm_libc_trusty_calloc(nobj.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun malloc(size: SizeT): COpaquePointer? =
    if (_trustyNapiAvailable) _wasm_libc_trusty_malloc(size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    if (_trustyNapiAvailable) _wasm_libc_trusty_realloc((p?.value ?: 0L).toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun free(p: COpaquePointer?) {
    if (_trustyNapiAvailable) {
        _wasm_libc_trusty_free((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    if (_trustyNapiAvailable) _wasm_libc_trusty_memalign(align.toString(), size.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    if (_trustyNapiAvailable) _wasm_libc_trusty_posixMemalign((memptr?.value ?: 0L).toString(), align.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    if (_trustyNapiAvailable) _wasm_libc_trusty_write(fd, (buf?.value ?: 0L).toString(), count.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_trustyNapiAvailable) _wasm_libc_trusty_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun close(fd: CInt): CInt =
    if (_trustyNapiAvailable) _wasm_libc_trusty_close(fd) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strlen(cs: String?): SizeT =
    if (_trustyNapiAvailable) _wasm_libc_trusty_strlen(cs).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getauxval(type: CUlong): CUlong =
    if (_trustyNapiAvailable) _wasm_libc_trusty_getauxval(type.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    if (_trustyNapiAvailable) _wasm_libc_trusty_mmap((addr?.value ?: 0L).toString(), len.toString(), prot, flags, fd, offset.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    if (_trustyNapiAvailable) _wasm_libc_trusty_munmap((addr?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    if (_trustyNapiAvailable) _wasm_libc_trusty_clockGettime(clkId, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    if (_trustyNapiAvailable) _wasm_libc_trusty_nanosleep((rqtp?.value ?: 0L).toString(), (rmtp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
