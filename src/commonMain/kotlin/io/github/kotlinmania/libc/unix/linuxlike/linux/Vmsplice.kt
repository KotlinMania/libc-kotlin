package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long
