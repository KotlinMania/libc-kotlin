@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

private object UnixNuttxJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_nuttx_errno(): Long

    @JvmStatic
    external fun libc_unix_nuttx_bind(sockfd: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libc_unix_nuttx_ioctl(fd: Int, request: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_recvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, srcAddr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_clockGettime(clockid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_nuttx_pthreadSetnameNp(thread: Long, name: String?): Int

    @JvmStatic
    external fun libc_unix_nuttx_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_nuttx_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_nuttx_arc4random(): Int

    @JvmStatic
    external fun libc_unix_nuttx_arc4randomBuf(bytes: Long, nbytes: Long)
}

public actual fun errno(): COpaquePointer? =
    UnixNuttxJniBridge.libc_unix_nuttx_errno().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_bind(sockfd, (addr?.value ?: 0L), addrlen.toInt())

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun dirfd(dirp: DIR?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_dirfd((dirp?.handle ?: 0L))

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_recvfrom(sockfd, (buf?.value ?: 0L), len.toLong(), flags, (srcAddr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_pthreadCreate((thread?.value ?: 0L), (attr?.value ?: 0L), 0L, (arg?.value ?: 0L))

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_clockGettime(clockid, (tp?.value ?: 0L))

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_futimens(fd, (times?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_pthreadSetnameNp(thread.toLong(), name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    UnixNuttxJniBridge.libc_unix_nuttx_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    UnixNuttxJniBridge.libc_unix_nuttx_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun arc4random(): UInt =
    UnixNuttxJniBridge.libc_unix_nuttx_arc4random().toUInt()

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    UnixNuttxJniBridge.libc_unix_nuttx_arc4randomBuf((bytes?.value ?: 0L), nbytes.toLong())
}
