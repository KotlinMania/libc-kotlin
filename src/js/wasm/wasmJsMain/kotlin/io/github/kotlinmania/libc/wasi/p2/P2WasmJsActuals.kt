@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun _initWasiP2NapiAddon(): Boolean

private val _wasiP2NapiAvailable: Boolean = _initWasiP2NapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_socket(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_connect(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_bind(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libc_wasi_p2_listen(p0, p1)")
private external fun _wasm_libc_wasi_p2_listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_accept(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_p2_accept4(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_p2_accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_getsockname(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libc_wasi_p2_getpeername(p0, p1, p2)")
private external fun _wasm_libc_wasi_p2_getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_wasi_p2_sendto(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_wasi_p2_sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libc_wasi_p2_recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_libc_wasi_p2_recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_wasi_p2_getsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_wasi_p2_getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libc_wasi_p2_setsockopt(p0, p1, p2, p3, p4)")
private external fun _wasm_libc_wasi_p2_setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libc_wasi_p2_getaddrinfo(p0, p1, p2, p3)")
private external fun _wasm_libc_wasi_p2_getaddrinfo(p0: String?, p1: String?, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_p2_freeaddrinfo(p0)")
private external fun _wasm_libc_wasi_p2_freeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libc_wasi_p2_gaiStrerror(p0)")
private external fun _wasm_libc_wasi_p2_gaiStrerror(p0: Int): String

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_socket(domain, type, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(fd: CInt, name: COpaquePointer?, addrlen: SocklenT): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_connect(fd, (name?.value ?: 0L).toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, addr: COpaquePointer?, addrlen: SocklenT): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_bind(socket, (addr?.value ?: 0L).toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_listen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_accept(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_accept4(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_getsockname(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_getpeername(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_sendto(socket, (buffer?.value ?: 0L).toString(), length.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_recvfrom(socket, (buffer?.value ?: 0L).toString(), length.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_setsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), optlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(host: String?, serv: String?, hint: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_getaddrinfo(host, serv, (hint?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(p: COpaquePointer?) {
    if (_wasiP2NapiAvailable) {
        _wasm_libc_wasi_p2_freeaddrinfo((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    if (_wasiP2NapiAvailable) _wasm_libc_wasi_p2_gaiStrerror(ecode).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
