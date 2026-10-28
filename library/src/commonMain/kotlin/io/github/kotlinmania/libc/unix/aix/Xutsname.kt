package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Xutsname(
    val nid: UInt,
    val longnid: ULong,
)
