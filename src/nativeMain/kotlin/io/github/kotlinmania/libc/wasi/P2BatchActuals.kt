// port-lint: source P2.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt = platform.posix.socket(domain, type, protocol)
public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("connect requires manual FFI bridge — not yet implemented")

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    throw UnsupportedOperationException("bind requires manual FFI bridge — not yet implemented")

public actual fun listen(socket: CInt, backlog: CInt): CInt = platform.posix.listen(socket, backlog)
public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("accept requires manual FFI bridge — not yet implemented")

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockname requires manual FFI bridge — not yet implemented")

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getpeername requires manual FFI bridge — not yet implemented")

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    throw UnsupportedOperationException("sendto requires manual FFI bridge — not yet implemented")

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom requires manual FFI bridge — not yet implemented")

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt =
    throw UnsupportedOperationException("getsockopt requires manual FFI bridge — not yet implemented")

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    throw UnsupportedOperationException("setsockopt requires manual FFI bridge — not yet implemented")

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getaddrinfo requires manual FFI bridge — not yet implemented")

public actual fun freeaddrinfo(p: Addrinfo?) {
    throw UnsupportedOperationException("freeaddrinfo requires manual FFI bridge — not yet implemented")
}

public actual fun gaiStrerror(ecode: CInt): String? =
    throw UnsupportedOperationException("gaiStrerror requires manual FFI bridge — not yet implemented")
