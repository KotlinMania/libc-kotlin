package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun jailGet(iov: Iovec?, niov: UInt, flags: Int): Int
