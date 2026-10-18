package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)
