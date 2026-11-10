@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNewlibEspidfNapiAddon(): Boolean

private val _unixNewlibEspidfNapiAvailable: Boolean = _initUnixNewlibEspidfNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_newlib_espidf_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_espidf_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_gethostname(p0, p1)")
private external fun _wasm_libc_unix_newlib_espidf_gethostname(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_espidf_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_espidf_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_espidf_eventfd(p0, p1)")
private external fun _wasm_libc_unix_newlib_espidf_eventfd(p0: Int, p1: Int): Int

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibEspidfNapiAvailable) _wasm_libc_unix_newlib_espidf_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    if (_unixNewlibEspidfNapiAvailable) _wasm_libc_unix_newlib_espidf_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gethostname(name: COpaquePointer?, namelen: SsizeT) {
    if (_unixNewlibEspidfNapiAvailable) {
        _wasm_libc_unix_newlib_espidf_gethostname((name?.value ?: 0L).toString(), namelen.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibEspidfNapiAvailable) _wasm_libc_unix_newlib_espidf_sendmsg(s, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibEspidfNapiAvailable) _wasm_libc_unix_newlib_espidf_recvmsg(s, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    if (_unixNewlibEspidfNapiAvailable) _wasm_libc_unix_newlib_espidf_eventfd(initval.toInt(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
