@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initUnixNuttxNapiAddon(): Boolean

private val _unixNuttxNapiAvailable: Boolean = _initUnixNuttxNapiAddon()

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nuttx_errno()")
private external fun _wasm_libc_unix_nuttx_errno(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nuttx_bind(p0, p1, p2)")
private external fun _wasm_libc_unix_nuttx_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_libc.libc_unix_nuttx_ioctl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_libc_unix_nuttx_ioctl(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_unix_nuttx_dirfd(p0)")
private external fun _wasm_libc_unix_nuttx_dirfd(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_unix_nuttx_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_unix_nuttx_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_unix_nuttx_pthreadCreate(p0, p1, p2, p3)")
private external fun _wasm_libc_unix_nuttx_pthreadCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nuttx_clockGettime(p0, p1)")
private external fun _wasm_libc_unix_nuttx_clockGettime(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nuttx_futimens(p0, p1)")
private external fun _wasm_libc_unix_nuttx_futimens(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nuttx_pthreadCondattrSetclock(p0, p1)")
private external fun _wasm_libc_unix_nuttx_pthreadCondattrSetclock(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nuttx_pthreadSetnameNp(p0, p1)")
private external fun _wasm_libc_unix_nuttx_pthreadSetnameNp(p0: String, p1: String?): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nuttx_pthreadGetnameNp(p0, p1, p2)")
private external fun _wasm_libc_unix_nuttx_pthreadGetnameNp(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_unix_nuttx_getrandom(p0, p1, p2)")
private external fun _wasm_libc_unix_nuttx_getrandom(p0: String, p1: String, p2: Int): String

@JsFun("() => globalThis.__km_napi_libc.libc_unix_nuttx_arc4random()")
private external fun _wasm_libc_unix_nuttx_arc4random(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_unix_nuttx_arc4randomBuf(p0, p1)")
private external fun _wasm_libc_unix_nuttx_arc4randomBuf(p0: String, p1: String)

public actual fun errno(): COpaquePointer? =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_errno().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_bind(sockfd, (addr?.value ?: 0L).toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dirfd(dirp: DIR?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_dirfd((dirp?.handle ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_recvfrom(sockfd, (buf?.value ?: 0L).toString(), len.toString(), flags, (srcAddr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_pthreadCreate((thread?.value ?: 0L).toString(), (attr?.value ?: 0L).toString(), 0L.toString(), (arg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_clockGettime(clockid, (tp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_futimens(fd, (times?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_pthreadCondattrSetclock((attr?.value ?: 0L).toString(), clockId) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_pthreadSetnameNp(thread.toLong().toString(), name) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_pthreadGetnameNp(thread.toLong().toString(), (name?.value ?: 0L).toString(), len.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_getrandom((buf?.value ?: 0L).toString(), buflen.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4random(): UInt =
    if (_unixNuttxNapiAvailable) _wasm_libc_unix_nuttx_arc4random().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    if (_unixNuttxNapiAvailable) {
        _wasm_libc_unix_nuttx_arc4randomBuf((bytes?.value ?: 0L).toString(), nbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
