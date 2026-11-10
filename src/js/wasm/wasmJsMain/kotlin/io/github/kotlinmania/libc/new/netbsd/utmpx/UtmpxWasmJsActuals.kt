@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewNetbsdUtmpxNapiAddon(): Boolean

private val _newNetbsdUtmpxNapiAvailable: Boolean = _initNewNetbsdUtmpxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_setutxent()")
private external fun _wasm_libc_new_netbsd_utmpx_setutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_endutxent()")
private external fun _wasm_libc_new_netbsd_utmpx_endutxent()

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getutxent()")
private external fun _wasm_libc_new_netbsd_utmpx_getutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getutxid(p0)")
private external fun _wasm_libc_new_netbsd_utmpx_getutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getutxline(p0)")
private external fun _wasm_libc_new_netbsd_utmpx_getutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_pututxline(p0)")
private external fun _wasm_libc_new_netbsd_utmpx_pututxline(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_updwtmpx(p0, p1)")
private external fun _wasm_libc_new_netbsd_utmpx_updwtmpx(p0: String?, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getlastlogx(p0, p1, p2)")
private external fun _wasm_libc_new_netbsd_utmpx_getlastlogx(p0: String?, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_updlastlogx(p0, p1, p2)")
private external fun _wasm_libc_new_netbsd_utmpx_updlastlogx(p0: String?, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getutmp(p0, p1)")
private external fun _wasm_libc_new_netbsd_utmpx_getutmp(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_getutmpx(p0, p1)")
private external fun _wasm_libc_new_netbsd_utmpx_getutmpx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_netbsd_utmpx_utmpxname(p0)")
private external fun _wasm_libc_new_netbsd_utmpx_utmpxname(p0: String?): Int

public actual fun setutxent() {
    if (_newNetbsdUtmpxNapiAvailable) {
        _wasm_libc_new_netbsd_utmpx_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_newNetbsdUtmpxNapiAvailable) {
        _wasm_libc_new_netbsd_utmpx_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_getutxent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_getutxid((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_getutxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_pututxline((ut?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_updwtmpx(file, (ut?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_getlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_updlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAvailable) {
        _wasm_libc_new_netbsd_utmpx_getutmp((ux?.value ?: 0L).toString(), (u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAvailable) {
        _wasm_libc_new_netbsd_utmpx_getutmpx((u?.value ?: 0L).toString(), (ux?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_newNetbsdUtmpxNapiAvailable) _wasm_libc_new_netbsd_utmpx_utmpxname(file) else throw UnsupportedOperationException("Native FFI addon is not available")
