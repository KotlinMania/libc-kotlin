package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer

internal object P2RawLibc {
    external fun socket(domain: Int, type: Int, protocol: Int): Int
    external fun connect(fd: Int, name: Long, addrlen: Int): Int
    external fun bind(socket: Int, addr: Long, addrlen: Int): Int
    external fun listen(socket: Int, backlog: Int): Int
    external fun accept(socket: Int, addr: Long, addrlen: Long): Int
    external fun accept4(socket: Int, addr: Long, addrlen: Long, flags: Int): Int
    external fun getsockname(socket: Int, addr: Long, addrlen: Long): Int
    external fun getpeername(socket: Int, addr: Long, addrlen: Long): Int
    external fun sendto(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Int): Long
    external fun recvfrom(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int
    external fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int
    external fun getaddrinfo(host: String?, serv: String?, hint: Long, res: Long): Int
    external fun freeaddrinfo(p: Long)
    external fun gaiStrerror(ecode: Int): Long?
}

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    P2RawLibc.socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    P2RawLibc.connect(fd, name?.toLong() ?: 0L, addrlen)

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    P2RawLibc.bind(socket, addr?.toLong() ?: 0L, addrlen)

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    P2RawLibc.listen(socket, backlog)

public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    P2RawLibc.accept(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: CUint?, flags: CInt): CInt =
    P2RawLibc.accept4(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    P2RawLibc.getsockname(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    P2RawLibc.getpeername(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    P2RawLibc.sendto(socket, buffer?.value ?: 0L, length, flags, addr?.toLong() ?: 0L, addrlen)

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT =
    P2RawLibc.recvfrom(socket, buffer?.value ?: 0L, length, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    P2RawLibc.getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    P2RawLibc.setsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen)

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    P2RawLibc.getaddrinfo(host, serv, hint?.toLong() ?: 0L, res?.value ?: 0L)

public actual fun freeaddrinfo(p: Addrinfo?) {
    P2RawLibc.freeaddrinfo(p?.toLong() ?: 0L)
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    P2RawLibc.gaiStrerror(ecode).let { if (it == 0L) null else COpaquePointer(it) }
