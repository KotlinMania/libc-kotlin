package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int
