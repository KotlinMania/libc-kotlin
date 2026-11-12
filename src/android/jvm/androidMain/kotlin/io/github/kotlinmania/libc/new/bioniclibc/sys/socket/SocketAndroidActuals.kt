@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.bioniclibc.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewBioniclibcSysSocketJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewBioniclibcSysSocketRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcNewBioniclibcSysSocketSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcNewBioniclibcSysSocketRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Int
}

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: ConstPtr): CInt =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun sendmmsg(sockfd: CInt, msgvec: ConstPtr, vlen: CUint, flags: CInt): CInt =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)
