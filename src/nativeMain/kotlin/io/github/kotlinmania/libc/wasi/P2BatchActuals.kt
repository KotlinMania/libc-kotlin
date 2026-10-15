// port-lint: source P2.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import libc.cinterop.libc_gai_strerror
import libc.cinterop.libc_listen

public actual fun connect(fd: Int, name: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: Int, addr: Sockaddr?, addrlen: UInt): Int =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: Int, backlog: Int): Int = libc.cinterop.libc_listen(socket, backlog)

public actual fun accept(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun accept4(socket: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun getpeername(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun sendto(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long =
    throw UnsupportedOperationException("sendto requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt): Int =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(p: Addrinfo?): Unit = throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun gaiStrerror(ecode: Int): String? {
    val result = libc.cinterop.libc_gai_strerror(ecode)
    return result?.toKString()
}
