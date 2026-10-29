package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun thrKill(id: UInt, sig: Int): Int
