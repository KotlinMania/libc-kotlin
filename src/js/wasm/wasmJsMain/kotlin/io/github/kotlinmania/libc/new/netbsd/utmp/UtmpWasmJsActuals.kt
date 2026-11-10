@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initNewNetbsdUtmpNapiAddon(): Boolean

private val _newNetbsdUtmpNapiAvailable: Boolean = _initNewNetbsdUtmpNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_libc.libc_new_netbsd_utmp_utmpname(p0)")
private external fun _wasm_libc_new_netbsd_utmp_utmpname(p0: String?): Int

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmp_setutent()")
private external fun _wasm_libc_new_netbsd_utmp_setutent()

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmp_getutent()")
private external fun _wasm_libc_new_netbsd_utmp_getutent(): String

@JsFun("() => globalThis.__km_napi_libc.libc_new_netbsd_utmp_endutent()")
private external fun _wasm_libc_new_netbsd_utmp_endutent()

public actual fun utmpname(file: String?): CInt =
    if (_newNetbsdUtmpNapiAvailable) _wasm_libc_new_netbsd_utmp_utmpname(file) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setutent() {
    if (_newNetbsdUtmpNapiAvailable) {
        _wasm_libc_new_netbsd_utmp_setutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutent(): COpaquePointer? =
    if (_newNetbsdUtmpNapiAvailable) _wasm_libc_new_netbsd_utmp_getutent().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endutent() {
    if (_newNetbsdUtmpNapiAvailable) {
        _wasm_libc_new_netbsd_utmp_endutent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
