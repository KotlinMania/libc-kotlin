// port-lint: source P2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public actual fun socket(domain: Int, type: Int, protocol: Int): Int =
    throw UnsupportedOperationException("socket not available on Android host — use androidNative target for FFI")

public actual fun connect(fd: Int, name: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("connect not available on Android host — use androidNative target for FFI")

public actual fun bind(socket: Int, addr: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("bind not available on Android host — use androidNative target for FFI")

public actual fun listen(socket: Int, backlog: Int): Int =
    throw UnsupportedOperationException("listen not available on Android host — use androidNative target for FFI")

public actual fun accept(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept not available on Android host — use androidNative target for FFI")

public actual fun accept4(socket: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun getsockname(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getsockname not available on Android host — use androidNative target for FFI")

public actual fun getpeername(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getpeername not available on Android host — use androidNative target for FFI")

public actual fun sendto(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto not available on Android host — use androidNative target for FFI")

public actual fun recvfrom(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on Android host — use androidNative target for FFI")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt not available on Android host — use androidNative target for FFI")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt): Int =
    throw UnsupportedOperationException("setsockopt not available on Android host — use androidNative target for FFI")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo not available on Android host — use androidNative target for FFI")

public actual fun freeaddrinfo(p: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo not available on Android host — use androidNative target for FFI")

public actual fun gaiStrerror(ecode: Int): String? =
    throw UnsupportedOperationException("gaiStrerror not available on Android host — use androidNative target for FFI")
