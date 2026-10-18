package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.unix.In6Addr

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)
