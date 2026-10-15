// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class CpusetT(
    val bits: LongArray,
    val bits2: LongArray,
    val bits3: LongArray,
    val bits4: LongArray,
)
