package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public expect fun errno(): MutPtr

public expect fun bind(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int

public expect fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int

public expect fun dirfd(dirp: MutPtr): Int

public expect fun recvfrom(sockfd: Int, buf: MutPtr, len: ULong, flags: Int, srcAddr: MutPtr, addrlen: MutPtr): Int

public expect fun pthreadCreate(thread: MutPtr, attr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr): Int

public expect fun clockGettime(clockid: ClockidT, tp: MutPtr): Int

public expect fun futimens(fd: Int, times: ConstPtr): Int

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): Int

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): Int

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: ULong): Int

public expect fun getrandom(buf: MutPtr, buflen: ULong, flags: UInt): Long

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(bytes: MutPtr, nbytes: ULong)
