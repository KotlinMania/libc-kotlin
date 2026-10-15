// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class PtraceRseqConfiguration(
    val rseqAbiPointer: ULong,
    val rseqAbiSize: UInt,
    val signature: UInt,
    val flags: UInt,
    val pad: UInt,
)
