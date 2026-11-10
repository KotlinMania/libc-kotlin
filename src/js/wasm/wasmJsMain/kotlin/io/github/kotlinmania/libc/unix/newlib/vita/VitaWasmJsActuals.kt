@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNewlibVitaNapiAddon(): Boolean

private val _unixNewlibVitaNapiAvailable: Boolean = _initUnixNewlibVitaNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_futimens(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_writev(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_writev(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_readv(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_readv(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_sendmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_sendmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_recvmsg(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_recvmsg(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_newlib_vita_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadAttrGetschedparam(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadAttrGetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadAttrSetschedparam(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadAttrSetschedparam(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadAttrGetprocessoridNp(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadAttrGetprocessoridNp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadAttrSetprocessoridNp(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadAttrSetprocessoridNp(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadGetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_pthreadGetschedparam(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadSetschedparam(p0, p1, p2)")
private external fun _wasm_libc_unix_newlib_vita_pthreadSetschedparam(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadCondattrGetclock(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadCondattrGetclock(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pthreadCondattrSetclock(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_libc.libc_unix_newlib_vita_pthreadGetprocessoridNp()")
private external fun _wasm_libc_unix_newlib_vita_pthreadGetprocessoridNp(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_getentropy(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_getentropy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_newlib_vita_pipe2(p0, p1)")
private external fun _wasm_libc_unix_newlib_vita_pipe2(p0: String, p1: Int): Int

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_writev(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_readv(fd, (iov?.value ?: 0L).toString(), iovcnt).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_sendmsg(s, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvmsg(s: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_recvmsg(s, (msg?.value ?: 0L).toString(), flags).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadCreate((native?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadAttrGetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadAttrSetschedparam((attr?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadAttrGetprocessoridNp((attr?.value ?: 0L).toString(), (processorId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadAttrSetprocessoridNp((attr?.value ?: 0L).toString(), processorId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadGetschedparam(native.toLong().toString(), (policy?.value ?: 0L).toString(), (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadSetschedparam(native.toLong().toString(), policy, (param?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadCondattrGetclock((attr?.value ?: 0L).toString(), (clockId?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetprocessoridNp(): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pthreadGetprocessoridNp() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_getentropy((buf?.value ?: 0L).toString(), buflen.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    if (_unixNewlibVitaNapiAvailable) _wasm_libc_unix_newlib_vita_pipe2((fds?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")
