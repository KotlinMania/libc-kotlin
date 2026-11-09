package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 0x7f
}

public fun wstopsig(status: CInt): CInt {
    // (status >> 8) & 0xff
    return wexitstatus(status)
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0x7f) > 0) && ((status and 0x7f) < 0x7f)
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7f
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xff) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifcontinued(status: CInt): Boolean {
    return true
}

public fun wcoredump(status: CInt): Boolean {
    return false
}

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT)

public expect fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt
