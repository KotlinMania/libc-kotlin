package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.COpaquePointer

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT
