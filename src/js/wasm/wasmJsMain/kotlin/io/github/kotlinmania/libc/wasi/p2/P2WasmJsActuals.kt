@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_libc !== 'undefined') return globalThis.__km_napi_libc !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_libc = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_libc = null; return false; } try { globalThis.__km_napi_libc = req('@kotlinmania/libc-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['libc_native.node', 'build/node-ffi/libc_native.node', 'build/node-ffi/release/libc_native.node', 'build/node-ffi/debug/libc_native.node', 'src/js/node-libc/build/Release/libc_native.node', 'src/js/node-libc/build/Debug/libc_native.node', 'src/js/node-libc/dist/build/Release/libc_native.node', 'src/js/node-libc/dist/build/Debug/libc_native.node', 'c_native.node', 'build/node-ffi/c_native.node', 'build/node-ffi/release/c_native.node', 'build/node-ffi/debug/c_native.node', 'src/js/node-libc/build/Release/c_native.node', 'src/js/node-libc/build/Debug/c_native.node', 'src/js/node-libc/dist/build/Release/c_native.node', 'src/js/node-libc/dist/build/Debug/c_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_libc = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_libc = null; return false; }")
private external fun initWasiP2NapiAddon(): Boolean

private val wasiP2NapiAvailable: Boolean = initWasiP2NapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Socket(p0, p1, p2)")
private external fun wasmLibcWasiP2Socket(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Connect(p0, p1, p2)")
private external fun wasmLibcWasiP2Connect(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Bind(p0, p1, p2)")
private external fun wasmLibcWasiP2Bind(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_libc.libcWasiP2Listen(p0, p1)")
private external fun wasmLibcWasiP2Listen(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Accept(p0, p1, p2)")
private external fun wasmLibcWasiP2Accept(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiP2Accept4(p0, p1, p2, p3)")
private external fun wasmLibcWasiP2Accept4(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Getsockname(p0, p1, p2)")
private external fun wasmLibcWasiP2Getsockname(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_libc.libcWasiP2Getpeername(p0, p1, p2)")
private external fun wasmLibcWasiP2Getpeername(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWasiP2Sendto(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWasiP2Sendto(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_libc.libcWasiP2Recvfrom(p0, p1, p2, p3, p4, p5)")
private external fun wasmLibcWasiP2Recvfrom(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWasiP2Getsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcWasiP2Getsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_libc.libcWasiP2Setsockopt(p0, p1, p2, p3, p4)")
private external fun wasmLibcWasiP2Setsockopt(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_libc.libcWasiP2Getaddrinfo(p0, p1, p2, p3)")
private external fun wasmLibcWasiP2Getaddrinfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiP2Freeaddrinfo(p0)")
private external fun wasmLibcWasiP2Freeaddrinfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_libc.libcWasiP2GaiStrerror(p0)")
private external fun wasmLibcWasiP2GaiStrerror(p0: Int): String

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Socket(domain, type, protocol) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connect(fd: CInt, name: ConstPtr, addrlen: SocklenT): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Connect(fd, name.rawAddress.toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bind(socket: CInt, addr: ConstPtr, addrlen: SocklenT): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Bind(socket, addr.rawAddress.toString(), addrlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Listen(socket, backlog) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Accept(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accept4(socket: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Accept4(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockname(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Getsockname(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getpeername(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Getpeername(socket, addr.rawAddress.toString(), addrlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendto(socket: CInt, buffer: ConstPtr, length: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Sendto(socket, buffer.rawAddress.toString(), length.toString(), flags, addr.rawAddress.toString(), addrlen.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recvfrom(socket: CInt, buffer: MutPtr, length: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Recvfrom(socket, buffer.rawAddress.toString(), length.toString(), flags, addr.rawAddress.toString(), addrlen.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Getsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr, optlen: SocklenT): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Setsockopt(sockfd, level, optname, optval.rawAddress.toString(), optlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getaddrinfo(host: ConstPtr, serv: ConstPtr, hint: ConstPtr, res: MutPtr): CInt =
    if (wasiP2NapiAvailable) wasmLibcWasiP2Getaddrinfo(host.rawAddress.toString(), serv.rawAddress.toString(), hint.rawAddress.toString(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeaddrinfo(p: MutPtr) {
    if (wasiP2NapiAvailable) {
        wasmLibcWasiP2Freeaddrinfo(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gaiStrerror(ecode: CInt): ConstPtr =
    if (wasiP2NapiAvailable) ConstPtr(wasmLibcWasiP2GaiStrerror(ecode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
