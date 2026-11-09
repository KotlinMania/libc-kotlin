package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

public expect fun errno(): COpaquePointer?

public expect fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int

public expect fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int

public expect fun dirfd(dirp: DIR?): Int

public expect fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int

public expect fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: FnCallback, arg: COpaquePointer?): Int

public expect fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int

public expect fun futimens(fd: Int, times: COpaquePointer?): Int

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): Int

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong)
