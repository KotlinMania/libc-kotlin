@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcWasiP2Socket")
private external fun wasiLibcWasiP2Socket(domain: Int, type: Int, protocol: Int): Int

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    wasiLibcWasiP2Socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Connect")

public actual fun bind(socket: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Bind")

@kotlin.wasm.WasmImport("libc", "libcWasiP2Listen")
private external fun wasiLibcWasiP2Listen(socket: Int, backlog: Int): Int

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    wasiLibcWasiP2Listen(socket, backlog)

public actual fun accept(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Accept")

public actual fun accept4(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Accept4")

public actual fun getsockname(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getsockname")

public actual fun getpeername(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getpeername")

public actual fun sendto(socket: CInt, buffer: ConstPtr<CVoid>, length: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Sendto")

public actual fun recvfrom(socket: CInt, buffer: MutPtr<CVoid>, length: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Recvfrom")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getsockopt")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr<CVoid>, optlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Setsockopt")

public actual fun getaddrinfo(host: ConstPtr<CChar>, serv: ConstPtr<CChar>, hint: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getaddrinfo")

public actual fun freeaddrinfo(p: MutPtr<Addrinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Freeaddrinfo")

public actual fun gaiStrerror(ecode: CInt): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2GaiStrerror")
