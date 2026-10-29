package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun disconnectx(socket: Int, associd: UInt, connid: UInt): Int
