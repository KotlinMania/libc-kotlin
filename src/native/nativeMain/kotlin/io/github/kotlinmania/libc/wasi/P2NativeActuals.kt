@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_connect(fd, name?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_bind(socket, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_listen(socket, backlog)

public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_accept(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: CUint?, flags: CInt): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_accept4(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_getsockname(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_getpeername(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_sendto(socket, buffer?.value?.toCPointer<ByteVar>(), length, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_recvfrom(socket, buffer?.value?.toCPointer<ByteVar>(), length, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_setsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen)

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_getaddrinfo(host, serv, hint?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(p: Addrinfo?) {
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_freeaddrinfo(p?.value?.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.wasi.cinterop.libc_p2_gai_strerror(ecode)?.let { COpaquePointer(it.toLong()) }
