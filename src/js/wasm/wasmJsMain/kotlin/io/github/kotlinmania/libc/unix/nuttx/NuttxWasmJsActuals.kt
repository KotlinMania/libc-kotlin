@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

public actual fun errno(): COpaquePointer? =
    null

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    0

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    0

public actual fun dirfd(dirp: DIR?): Int =
    0

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    0

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    0

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    0

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    0

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    0L

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong) {
}
