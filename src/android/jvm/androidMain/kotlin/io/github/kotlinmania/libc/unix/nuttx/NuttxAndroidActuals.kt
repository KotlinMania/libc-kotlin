@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNuttxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNuttxErrno(): Long

    @JvmStatic
    external fun libcUnixNuttxBind(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcUnixNuttxIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixNuttxDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixNuttxRecvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, srcAddr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcUnixNuttxPthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixNuttxClockGettime(clockid: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixNuttxFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixNuttxPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixNuttxPthreadSetnameNp(thread: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixNuttxPthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixNuttxGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNuttxArc4random(): Int

    @JvmStatic
    external fun libcUnixNuttxArc4randomBuf(bytes: Long, nbytes: Long)
}

public actual fun errno(): MutPtr<CInt> =
    MutPtr(UnixNuttxJniBridge.libcUnixNuttxErrno())

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    UnixNuttxJniBridge.libcUnixNuttxBind(sockfd, addr.rawAddress, addrlen.toInt())

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    UnixNuttxJniBridge.libcUnixNuttxIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dirfd(dirp: MutPtr<DIR>): Int =
    UnixNuttxJniBridge.libcUnixNuttxDirfd(dirp.rawAddress)

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, srcAddr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    UnixNuttxJniBridge.libcUnixNuttxRecvfrom(sockfd, buf.rawAddress, len.toLong(), flags, srcAddr.rawAddress, addrlen.rawAddress)

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): Int =
    UnixNuttxJniBridge.libcUnixNuttxPthreadCreate(thread.rawAddress, attr.rawAddress, 0L, arg.rawAddress)

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    UnixNuttxJniBridge.libcUnixNuttxClockGettime(clockid, tp.rawAddress)

public actual fun futimens(fd: Int, times: ConstPtr<Timespec>): Int =
    UnixNuttxJniBridge.libcUnixNuttxFutimens(fd, times.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): Int =
    UnixNuttxJniBridge.libcUnixNuttxPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): Int =
    UnixNuttxJniBridge.libcUnixNuttxPthreadSetnameNp(thread.toLong(), name.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: ULong): Int =
    UnixNuttxJniBridge.libcUnixNuttxPthreadGetnameNp(thread.toLong(), name.rawAddress, len.toLong())

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: ULong, flags: UInt): Long =
    UnixNuttxJniBridge.libcUnixNuttxGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun arc4random(): UInt =
    UnixNuttxJniBridge.libcUnixNuttxArc4random().toUInt()

public actual fun arc4randomBuf(bytes: MutPtr<CVoid>, nbytes: ULong) {
    UnixNuttxJniBridge.libcUnixNuttxArc4randomBuf(bytes.rawAddress, nbytes.toLong())
}
