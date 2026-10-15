// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class FfEffect(
    val type: UShort,
    val id: Short,
    val direction: UShort,
    val trigger: FfTrigger,
    val replay: FfReplay,
    val u: ULongArray,
    val u2: UIntArray,
)
