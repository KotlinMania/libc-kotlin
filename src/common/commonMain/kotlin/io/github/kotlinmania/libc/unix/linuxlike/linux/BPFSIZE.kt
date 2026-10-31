package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public fun bpfSize(code: UInt): UInt = code and 0x18u
