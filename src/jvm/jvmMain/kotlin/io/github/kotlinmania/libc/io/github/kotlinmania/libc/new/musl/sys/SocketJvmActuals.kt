package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.COpaquePointer

internal object SocketRawLibc {
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
}

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    SocketRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    SocketRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    SocketRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    SocketRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    SocketRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)
