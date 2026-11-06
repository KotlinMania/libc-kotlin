@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.musl.sys

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    io.github.kotlinmania.libc.new.musl.sys.cinterop.libc_socket_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.new.musl.sys.cinterop.libc_socket_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())
