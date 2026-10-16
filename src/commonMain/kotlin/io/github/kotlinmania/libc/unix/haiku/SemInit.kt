package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: SemT?, pshared: Int, value: UInt): Int
