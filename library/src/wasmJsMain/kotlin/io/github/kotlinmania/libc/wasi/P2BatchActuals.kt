// port-lint: source P2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket requires N-API addon")

public actual fun connect(fd: Int, name: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("connect requires N-API addon")

public actual fun bind(socket: Int, addr: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("bind requires N-API addon")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen requires N-API addon")

public actual fun accept(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept requires N-API addon")

public actual fun accept4(socket: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun getsockname(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires N-API addon")

public actual fun getpeername(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires N-API addon")

public actual fun sendto(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires N-API addon")

public actual fun recvfrom(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires N-API addon")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires N-API addon")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires N-API addon")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires N-API addon")

public actual fun freeaddrinfo(p: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires N-API addon")

public actual fun gaiStrerror(ecode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror requires N-API addon")
