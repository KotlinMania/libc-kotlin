package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fchmod(fd: Int, mode: UInt): Int
