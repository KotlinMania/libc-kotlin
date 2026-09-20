// port-lint: source P2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    throw UnsupportedOperationException("socket not available on JVM — no C library access")

public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("connect not available on JVM — no C library access")

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    throw UnsupportedOperationException("listen not available on JVM — no C library access")

public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept not available on JVM — no C library access")

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on JVM — no C library access")

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname not available on JVM — no C library access")

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername not available on JVM — no C library access")

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto not available on JVM — no C library access")

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt not available on JVM — no C library access")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt not available on JVM — no C library access")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo not available on JVM — no C library access")

public actual fun freeaddrinfo(p: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo not available on JVM — no C library access")
}

public actual fun gaiStrerror(ecode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror not available on JVM — no C library access")

