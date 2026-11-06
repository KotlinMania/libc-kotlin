@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.bioniclibc.sys

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    libc.cinterop.libc_socket_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    libc.cinterop.libc_socket_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    libc.cinterop.libc_socket_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())
