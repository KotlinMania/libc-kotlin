@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errno(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_bind(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    0

public actual fun dirfd(dirp: DIR?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_recvfrom(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags, srcAddr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: FnCallback, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_pthreadCreate(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_clockGettime(clockid, tp?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_arc4random()

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_unix_nuttx_arc4randomBuf(bytes?.value?.toCPointer<ByteVar>(), nbytes)
}
