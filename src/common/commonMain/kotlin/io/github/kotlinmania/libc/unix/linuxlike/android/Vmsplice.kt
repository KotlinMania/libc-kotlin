package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long
