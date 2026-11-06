@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_errno()?.let { COpaquePointer(it.toLong()) }

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_bind(sockfd, addr?.value?.toCPointer<ByteVar>(), addrlen)

public actual fun dirfd(dirp: DIR?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: UInt?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_recvfrom(sockfd, buf?.value?.toCPointer<ByteVar>(), len, flags, srcAddr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun pthreadCreate(thread: Int?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_pthread_create(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), startRoutine.toInt(), arg?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_clock_gettime(clockid, tp?.value?.toCPointer<ByteVar>())

public actual fun futimens(fd: Int, times: Timespec?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_pthread_setname_np(thread, name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_pthread_getname_np(thread, name?.value?.toCPointer<ByteVar>(), len)

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun arc4random(): UInt =
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_arc4random()

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    io.github.kotlinmania.libc.unix.nuttx.cinterop.libc_nuttx_mod_arc4random_buf(bytes?.value?.toCPointer<ByteVar>(), nbytes)
}
