package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public fun bpfMiscOp(code: UInt): UInt = code and 0xf8u
