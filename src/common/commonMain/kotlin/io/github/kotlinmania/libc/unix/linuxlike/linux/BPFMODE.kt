package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public fun bpfMode(code: UInt): UInt = code and 0xe0u
