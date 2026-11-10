@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNewlibRtemsNapiAddon(): Boolean

private val _unixNewlibRtemsNapiAvailable: Boolean = _initUnixNewlibRtemsNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_futimens(p0, p1)")
private external fun _wasm_libc_unix_newlib_rtems_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_rtems_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_rtems_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_newlib_rtems_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_newlib_rtems_pthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_getentropy(p0, p1)")
private external fun _wasm_libc_unix_newlib_rtems_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_newlib_rtems_arc4randomBuf(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_rtems_setgroups(p0, p1)")
private external fun _wasm_libc_unix_newlib_rtems_setgroups(p0: Int, p1: String): Int

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    if (_unixNewlibRtemsNapiAvailable) {
        _wasm_libc_unix_newlib_rtems_arc4randomBuf((buf?.value ?: 0L).toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt =
    if (_unixNewlibRtemsNapiAvailable) _wasm_libc_unix_newlib_rtems_setgroups(ngroups, (grouplist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
