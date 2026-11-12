@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initNewNetbsdUtmpxNapiAddon(): Boolean

private val newNetbsdUtmpxNapiAvailable: Boolean = initNewNetbsdUtmpxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libcNewNetbsdUtmpxSetutxent()")
private external fun wasmLibcNewNetbsdUtmpxSetutxent()

@JsFun("() => globalThis.__km_napi_libc.libcNewNetbsdUtmpxEndutxent()")
private external fun wasmLibcNewNetbsdUtmpxEndutxent()

@JsFun("() => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetutxent()")
private external fun wasmLibcNewNetbsdUtmpxGetutxent(): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetutxid(p0)")
private external fun wasmLibcNewNetbsdUtmpxGetutxid(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetutxline(p0)")
private external fun wasmLibcNewNetbsdUtmpxGetutxline(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxPututxline(p0)")
private external fun wasmLibcNewNetbsdUtmpxPututxline(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxUpdwtmpx(p0, p1)")
private external fun wasmLibcNewNetbsdUtmpxUpdwtmpx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetlastlogx(p0, p1, p2)")
private external fun wasmLibcNewNetbsdUtmpxGetlastlogx(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxUpdlastlogx(p0, p1, p2)")
private external fun wasmLibcNewNetbsdUtmpxUpdlastlogx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetutmp(p0, p1)")
private external fun wasmLibcNewNetbsdUtmpxGetutmp(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxGetutmpx(p0, p1)")
private external fun wasmLibcNewNetbsdUtmpxGetutmpx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcNewNetbsdUtmpxUtmpxname(p0)")
private external fun wasmLibcNewNetbsdUtmpxUtmpxname(p0: String): Int

public actual fun setutxent() {
    if (newNetbsdUtmpxNapiAvailable) {
        wasmLibcNewNetbsdUtmpxSetutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun endutxent() {
    if (newNetbsdUtmpxNapiAvailable) {
        wasmLibcNewNetbsdUtmpxEndutxent()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutxent(): MutPtr =
    if (newNetbsdUtmpxNapiAvailable) MutPtr(wasmLibcNewNetbsdUtmpxGetutxent().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    if (newNetbsdUtmpxNapiAvailable) MutPtr(wasmLibcNewNetbsdUtmpxGetutxid(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    if (newNetbsdUtmpxNapiAvailable) MutPtr(wasmLibcNewNetbsdUtmpxGetutxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    if (newNetbsdUtmpxNapiAvailable) MutPtr(wasmLibcNewNetbsdUtmpxPututxline(ut.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    if (newNetbsdUtmpxNapiAvailable) wasmLibcNewNetbsdUtmpxUpdwtmpx(file.rawAddress.toString(), ut.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    if (newNetbsdUtmpxNapiAvailable) MutPtr(wasmLibcNewNetbsdUtmpxGetlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    if (newNetbsdUtmpxNapiAvailable) wasmLibcNewNetbsdUtmpxUpdlastlogx(fname.rawAddress.toString(), uid.toInt(), ll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    if (newNetbsdUtmpxNapiAvailable) {
        wasmLibcNewNetbsdUtmpxGetutmp(ux.rawAddress.toString(), u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    if (newNetbsdUtmpxNapiAvailable) {
        wasmLibcNewNetbsdUtmpxGetutmpx(u.rawAddress.toString(), ux.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun utmpxname(file: ConstPtr): CInt =
    if (newNetbsdUtmpxNapiAvailable) wasmLibcNewNetbsdUtmpxUtmpxname(file.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
