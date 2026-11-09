@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
}

public actual fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt =
    0
