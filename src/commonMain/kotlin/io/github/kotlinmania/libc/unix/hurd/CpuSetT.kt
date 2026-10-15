// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class CpuSetT(
    val bits: UIntArray,
    val bits2: ULongArray,
)
