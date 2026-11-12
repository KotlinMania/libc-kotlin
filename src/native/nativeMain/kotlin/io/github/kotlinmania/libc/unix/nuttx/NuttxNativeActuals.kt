@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxArc4random
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxArc4randomBuf
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxBind
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxClockGettime
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxDirfd
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxErrno
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxFutimens
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxGetrandom
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxIoctl
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxPthreadCreate
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxPthreadGetnameNp
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxPthreadSetnameNp
import io.github.kotlinmania.libc.unix.nuttx.cinterop.libcUnixNuttxRecvfrom
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errno(): MutPtr<CInt> =
    MutPtr(libcUnixNuttxErrno()?.toLong() ?: 0L)

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    libcUnixNuttxBind(sockfd, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    libcUnixNuttxIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dirfd(dirp: MutPtr<DIR>): Int =
    libcUnixNuttxDirfd(dirp.rawAddress.toCPointer<ByteVar>())

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, srcAddr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    libcUnixNuttxRecvfrom(sockfd, buf.rawAddress.toCPointer<ByteVar>(), len, flags, srcAddr.rawAddress.toCPointer<ByteVar>(), addrlen.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): Int =
    libcUnixNuttxPthreadCreate(thread.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    libcUnixNuttxClockGettime(clockid, tp.rawAddress.toCPointer<ByteVar>())

public actual fun futimens(fd: Int, times: ConstPtr<Timespec>): Int =
    libcUnixNuttxFutimens(fd, times.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): Int =
    libcUnixNuttxPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): Int =
    libcUnixNuttxPthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: ULong): Int =
    libcUnixNuttxPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: ULong, flags: UInt): Long =
    libcUnixNuttxGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun arc4random(): UInt =
    libcUnixNuttxArc4random()

public actual fun arc4randomBuf(bytes: MutPtr<CVoid>, nbytes: ULong) {
    libcUnixNuttxArc4randomBuf(bytes.rawAddress.toCPointer<ByteVar>(), nbytes)
}
