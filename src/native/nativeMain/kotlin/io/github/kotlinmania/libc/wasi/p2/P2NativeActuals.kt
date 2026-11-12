@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Accept
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Accept4
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Bind
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Connect
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Freeaddrinfo
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2GaiStrerror
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Getaddrinfo
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Getpeername
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Getsockname
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Getsockopt
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Listen
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Recvfrom
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Sendto
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Setsockopt
import io.github.kotlinmania.libc.wasi.p2.cinterop.libcWasiP2Socket
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    libcWasiP2Socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    libcWasiP2Connect(fd, name.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun bind(socket: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt =
    libcWasiP2Bind(socket, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    libcWasiP2Listen(socket, backlog)

public actual fun accept(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    libcWasiP2Accept(socket, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun accept4(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    libcWasiP2Accept4(socket, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getsockname(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    libcWasiP2Getsockname(socket, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun getpeername(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt =
    libcWasiP2Getpeername(socket, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun sendto(socket: CInt, buffer: ConstPtr<CVoid>, length: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT =
    libcWasiP2Sendto(socket, buffer.rawAddress.toCPointer<ByteVar>(), length, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun recvfrom(socket: CInt, buffer: MutPtr<CVoid>, length: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcWasiP2Recvfrom(socket, buffer.rawAddress.toCPointer<ByteVar>(), length, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt =
    libcWasiP2Getsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen.rawAddress.toCPointer<ByteVar>())

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr<CVoid>, optlen: SocklenT): CInt =
    libcWasiP2Setsockopt(sockfd, level, optname, optval.rawAddress.toCPointer<ByteVar>(), optlen)

public actual fun getaddrinfo(host: ConstPtr<CChar>, serv: ConstPtr<CChar>, hint: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt =
    libcWasiP2Getaddrinfo(host.rawAddress.toCPointer<ByteVar>(), serv.rawAddress.toCPointer<ByteVar>(), hint.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun freeaddrinfo(p: MutPtr<Addrinfo>) {
    libcWasiP2Freeaddrinfo(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun gaiStrerror(ecode: CInt): ConstPtr<CChar> =
    ConstPtr(libcWasiP2GaiStrerror(ecode)?.toLong() ?: 0L)
