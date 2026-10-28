package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long
