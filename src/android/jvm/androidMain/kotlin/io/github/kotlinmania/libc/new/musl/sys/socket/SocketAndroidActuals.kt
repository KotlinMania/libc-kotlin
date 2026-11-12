@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.musl.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Mmsghdr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewMuslSysSocketJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewMuslSysSocketSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcNewMuslSysSocketRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint): CInt =
    NewMuslSysSocketJniBridge.libcNewMuslSysSocketSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint, timeout: MutPtr<Timespec>): CInt =
    NewMuslSysSocketJniBridge.libcNewMuslSysSocketRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt(), timeout.rawAddress)
