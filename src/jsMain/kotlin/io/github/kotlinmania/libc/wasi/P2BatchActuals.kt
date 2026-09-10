// port-lint: source P2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires N-API addon")

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun freeaddrinfo(p: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires N-API addon")
}

public actual fun gaiStrerror(ecode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon")

