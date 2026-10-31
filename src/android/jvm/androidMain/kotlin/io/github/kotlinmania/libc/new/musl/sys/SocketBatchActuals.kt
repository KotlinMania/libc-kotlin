package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")
