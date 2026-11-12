@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.bioniclibc.sys.socket

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.bioniclibc.sys.socket.cinterop.libcNewBioniclibcSysSocketRecvfrom
import io.github.kotlinmania.libc.new.bioniclibc.sys.socket.cinterop.libcNewBioniclibcSysSocketRecvmmsg
import io.github.kotlinmania.libc.new.bioniclibc.sys.socket.cinterop.libcNewBioniclibcSysSocketSendmmsg
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SocklenT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Mmsghdr
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcNewBioniclibcSysSocketRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sendmmsg(sockfd: CInt, msgvec: ConstPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    libcNewBioniclibcSysSocketSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    libcNewBioniclibcSysSocketRecvfrom(socket, buf.rawAddress.toCPointer<ByteVar>(), len, flags, addr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())
