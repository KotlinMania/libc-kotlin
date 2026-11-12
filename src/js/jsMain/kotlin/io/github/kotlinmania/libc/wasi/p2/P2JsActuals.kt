@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val wasiP2NapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/libc-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_libc = null; return null; })()")

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Socket(domain, type, protocol) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(fd: CInt, name: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Connect(fd, name.rawAddress.toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Bind(socket, addr.rawAddress.toString(), addrlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Listen(socket, backlog) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Accept(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Accept4(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Getsockname(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Getpeername(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buffer: ConstPtr<CVoid>, length: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Sendto(socket, buffer.rawAddress.toString(), length.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buffer: MutPtr<CVoid>, length: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Recvfrom(socket, buffer.rawAddress.toString(), length.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Getsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr<CVoid>, optlen: SocklenT): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Setsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(host: ConstPtr<CChar>, serv: ConstPtr<CChar>, hint: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    if (wasiP2NapiAddon != null) (wasiP2NapiAddon.libcWasiP2Getaddrinfo(host.rawAddress.toString(), serv.rawAddress.toString(), hint.rawAddress.toString(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(p: MutPtr<Addrinfo>) {
    if (wasiP2NapiAddon != null) {
        wasiP2NapiAddon.libcWasiP2Freeaddrinfo(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(ecode: CInt): ConstPtr<CChar> =
    if (wasiP2NapiAddon != null) ConstPtr((wasiP2NapiAddon.libcWasiP2GaiStrerror(ecode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
