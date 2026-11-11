@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_accept
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_accept4
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_bind
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_connect
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_freeaddrinfo
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_gaiStrerror
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_getaddrinfo
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_getpeername
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_getsockname
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_getsockopt
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_listen
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_recvfrom
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_sendto
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_setsockopt
import io.github.kotlinmania.libc.wasi.p2.cinterop.libc_wasi_p2_socket
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libc_wasi_p2_socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: COpaquePointer?, addrlen: SocklenT): CInt =
    libc_wasi_p2_connect(fd, name?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun bind(socket: CInt, addr: COpaquePointer?, addrlen: SocklenT): CInt =
    libc_wasi_p2_bind(socket, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libc_wasi_p2_listen(socket, backlog)

public actual fun accept(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    libc_wasi_p2_accept(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun accept4(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    libc_wasi_p2_accept4(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>(), flags)

public actual fun getsockname(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    libc_wasi_p2_getsockname(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt =
    libc_wasi_p2_getpeername(socket, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT =
    libc_wasi_p2_sendto(socket, buffer?.value?.toCPointer<ByteVar>(), length, flags, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    libc_wasi_p2_recvfrom(socket, buffer?.value?.toCPointer<ByteVar>(), length, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt =
    libc_wasi_p2_getsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen?.value?.toCPointer<ByteVar>())

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    libc_wasi_p2_setsockopt(sockfd, level, optname, optval?.value?.toCPointer<ByteVar>(), optlen)

public actual fun getaddrinfo(host: String?, serv: String?, hint: COpaquePointer?, res: COpaquePointer?): CInt =
    libc_wasi_p2_getaddrinfo(host, serv, hint?.value?.toCPointer<ByteVar>(), res?.value?.toCPointer<ByteVar>())

public actual fun freeaddrinfo(p: COpaquePointer?) {
    libc_wasi_p2_freeaddrinfo(p?.value?.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    libc_wasi_p2_gaiStrerror(ecode)?.let { COpaquePointer(it.toLong()) }
