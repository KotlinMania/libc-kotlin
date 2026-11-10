@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT

private val _wasiP2NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_socket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(fd: CInt, name: COpaquePointer?, addrlen: SocklenT): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_connect(fd, (name?.value ?: 0L).toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, addr: COpaquePointer?, addrlen: SocklenT): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_bind(socket, (addr?.value ?: 0L).toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_listen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_accept(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_accept4(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_getsockname(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_getpeername(socket, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_sendto(socket, (buffer?.value ?: 0L).toString(), length.toString(), flags, (addr?.value ?: 0L).toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_recvfrom(socket, (buffer?.value ?: 0L).toString(), length.toString(), flags, (addr?.value ?: 0L).toString(), (addrlen?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_getsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), (optlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_setsockopt(sockfd, level, optname, (optval?.value ?: 0L).toString(), optlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(host: String?, serv: String?, hint: COpaquePointer?, res: COpaquePointer?): CInt =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_getaddrinfo(host, serv, (hint?.value ?: 0L).toString(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(p: COpaquePointer?) {
    if (_wasiP2NapiAddon != null) {
        _wasiP2NapiAddon.libc_wasi_p2_freeaddrinfo((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    if (_wasiP2NapiAddon != null) (_wasiP2NapiAddon.libc_wasi_p2_gaiStrerror(ecode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
