package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public expect fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long
