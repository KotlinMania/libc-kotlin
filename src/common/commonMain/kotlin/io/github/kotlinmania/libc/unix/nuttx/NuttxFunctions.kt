package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public expect fun errno(): MutPtr<CInt>

public expect fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int

public expect fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int

public expect fun dirfd(dirp: MutPtr<DIR>): Int

public expect fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, srcAddr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int

public expect fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): Int

public expect fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int

public expect fun futimens(fd: Int, times: ConstPtr<Timespec>): Int

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): Int

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): Int

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: ULong): Int

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: ULong, flags: UInt): Long

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(bytes: MutPtr<CVoid>, nbytes: ULong)
