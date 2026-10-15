// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class CpuSetT(
    val bits: List<ULong>,
    val bits2: List<ULong>,
)
