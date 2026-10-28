package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long
