package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public fun bpfOp(code: UInt): UInt = code and 0xf0u
