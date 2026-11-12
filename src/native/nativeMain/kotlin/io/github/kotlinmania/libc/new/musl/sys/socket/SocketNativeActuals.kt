@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.musl.sys.socket

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.musl.sys.socket.cinterop.libcNewMuslSysSocketRecvmmsg
import io.github.kotlinmania.libc.new.musl.sys.socket.cinterop.libcNewMuslSysSocketSendmmsg
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Mmsghdr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint): CInt =
    libcNewMuslSysSocketSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint, timeout: MutPtr<Timespec>): CInt =
    libcNewMuslSysSocketRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())
