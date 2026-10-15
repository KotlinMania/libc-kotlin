package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
