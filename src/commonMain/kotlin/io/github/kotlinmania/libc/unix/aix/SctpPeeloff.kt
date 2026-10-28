package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sctpPeeloff(s: Int, id: UInt?): Int
