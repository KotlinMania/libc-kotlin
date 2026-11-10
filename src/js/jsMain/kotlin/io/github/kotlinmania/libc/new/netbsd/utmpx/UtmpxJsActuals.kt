@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UidT

private val _newNetbsdUtmpxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun setutxent() {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_setutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_endutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxent() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxid((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_pututxline((ut?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: String?, ut: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_updwtmpx(file, (ut?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): COpaquePointer? =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: String?, uid: UidT, ll: COpaquePointer?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_updlastlogx(fname, uid.toInt(), (ll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutmp((ux?.value ?: 0L).toString(), (u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
    if (_newNetbsdUtmpxNapiAddon != null) {
        _newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_getutmpx((u?.value ?: 0L).toString(), (ux?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: String?): CInt =
    if (_newNetbsdUtmpxNapiAddon != null) (_newNetbsdUtmpxNapiAddon.libc_new_netbsd_utmpx_utmpxname(file) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
