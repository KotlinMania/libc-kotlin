package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun jailSet(iov: Iovec?, niov: UInt, flags: Int): Int
