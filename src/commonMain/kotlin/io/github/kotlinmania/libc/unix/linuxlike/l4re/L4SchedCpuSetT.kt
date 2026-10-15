// port-lint: source unix/linux_like/l4re/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*

public data class L4SchedCpuSetT(
    val granOffset: ULong,
    val map: ULong,
)
