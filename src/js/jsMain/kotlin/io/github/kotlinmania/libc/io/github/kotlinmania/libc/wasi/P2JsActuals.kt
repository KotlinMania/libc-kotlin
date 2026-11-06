package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.COpaquePointer

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').socket(domain, type, protocol)") as CInt

public actual fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').connect(fd, name?.toLong() ?: 0L, addrlen)") as CInt

public actual fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, addr?.toLong() ?: 0L, addrlen)") as CInt

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').listen(socket, backlog)") as CInt

public actual fun accept(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as CInt

public actual fun accept4(socket: CInt, addr: Sockaddr?, addrlen: CUint?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)") as CInt

public actual fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockname(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as CInt

public actual fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeername(socket, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as CInt

public actual fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendto(socket, buffer?.value ?: 0L, length, flags, addr?.toLong() ?: 0L, addrlen)") as SsizeT

public actual fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buffer?.value ?: 0L, length, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen?.toLong() ?: 0L)") as CInt

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setsockopt(sockfd, level, optname, optval?.value ?: 0L, optlen)") as CInt

public actual fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getaddrinfo(host, serv, hint?.toLong() ?: 0L, res?.value ?: 0L)") as CInt

public actual fun freeaddrinfo(p: Addrinfo?) {
    js("require('@kotlinmania/libc-native-bindings').freeaddrinfo(p?.toLong() ?: 0L)")
}

public actual fun gaiStrerror(ecode: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').gaiStrerror(ecode)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }
