package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt {
    // (status >> 8) & 0xff
    return wexitstatus(status)
}

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) > 0) && ((status and 0x7f) < 0x7f)

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0xff) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = true

public fun wcoredump(status: CInt): Boolean = false

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT)

public expect fun setgroups(ngroups: CInt, grouplist: ConstPtr<GidT>): CInt
