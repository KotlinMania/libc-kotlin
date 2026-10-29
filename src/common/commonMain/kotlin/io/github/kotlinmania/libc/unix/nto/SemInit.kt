package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, pshared: Int, value: UInt): Int
