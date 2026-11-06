package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.COpaquePointer

internal object NuttxModRawLibc {
    external fun errno(): Long?
    external fun bind(sockfd: Int, addr: Long, addrlen: Int): Int
    external fun dirfd(dirp: Long): Int
    external fun recvfrom(sockfd: Int, buf: Long, len: Long, flags: Int, srcAddr: Long, addrlen: Long): Int
    external fun pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int
    external fun clockGettime(clockid: Int, tp: Long): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun arc4random(): Int
    external fun arc4randomBuf(bytes: Long, nbytes: Long)
}

public actual fun errno(): CInt? =
    NuttxModRawLibc.errno()

public actual fun bind(sockfd: Int, addr: Sockaddr?, addrlen: SocklenT): Int =
    NuttxModRawLibc.bind(sockfd, addr?.toLong() ?: 0L, addrlen)

public actual fun dirfd(dirp: DIR?): Int =
    NuttxModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: UInt?): Int =
    NuttxModRawLibc.recvfrom(sockfd, buf?.value ?: 0L, len, flags, srcAddr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun pthreadCreate(thread: Int?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    NuttxModRawLibc.pthreadCreate(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, startRoutine, arg?.value ?: 0L)

public actual fun clockGettime(clockid: ClockidT, tp: Timespec?): Int =
    NuttxModRawLibc.clockGettime(clockid, tp?.toLong() ?: 0L)

public actual fun futimens(fd: Int, times: Timespec?): Int =
    NuttxModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): Int =
    NuttxModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    NuttxModRawLibc.pthreadSetnameNp(thread, name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    NuttxModRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    NuttxModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun arc4random(): UInt =
    NuttxModRawLibc.arc4random()

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
    NuttxModRawLibc.arc4randomBuf(bytes?.value ?: 0L, nbytes)
}
