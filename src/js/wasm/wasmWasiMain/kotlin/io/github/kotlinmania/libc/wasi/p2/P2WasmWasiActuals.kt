@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcWasiP2Socket")
private external fun wasiLibcWasiP2Socket(domain: Int, type: Int, protocol: Int): Int

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    wasiLibcWasiP2Socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: ConstPtr, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Connect")

public actual fun bind(socket: CInt, addr: ConstPtr, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Bind")

@kotlin.wasm.WasmImport("libc", "libcWasiP2Listen")
private external fun wasiLibcWasiP2Listen(socket: Int, backlog: Int): Int

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    wasiLibcWasiP2Listen(socket, backlog)

public actual fun accept(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Accept")

public actual fun accept4(socket: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Accept4")

public actual fun getsockname(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getsockname")

public actual fun getpeername(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getpeername")

public actual fun sendto(socket: CInt, buffer: ConstPtr, length: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Sendto")

public actual fun recvfrom(socket: CInt, buffer: MutPtr, length: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Recvfrom")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getsockopt")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr, optlen: SocklenT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Setsockopt")

public actual fun getaddrinfo(host: ConstPtr, serv: ConstPtr, hint: ConstPtr, res: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Getaddrinfo")

public actual fun freeaddrinfo(p: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2Freeaddrinfo")

public actual fun gaiStrerror(ecode: CInt): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcWasiP2GaiStrerror")
