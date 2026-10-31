package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public fun cmsgLen(length: UInt): UInt = ((16uL + 7uL) and 7uL.inv()).toUInt() + length
