package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

// Horizon OS works doesn't or can't hold any of this information
public fun wifstopped(status: CInt): Boolean {
    return false
}

public fun wstopsig(status: CInt): CInt {
    return 0
}

public fun wifcontinued(status: CInt): Boolean {
    return true
}

public fun wifsignaled(status: CInt): Boolean {
    return false
}

public fun wtermsig(status: CInt): CInt {
    return 0
}

public fun wifexited(status: CInt): Boolean {
    return true
}

public fun wexitstatus(status: CInt): CInt {
    return 0
}

public fun wcoredump(status: CInt): Boolean {
    return false
}

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt

public expect fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadGetprocessoridNp(): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun gethostid(): CLong
