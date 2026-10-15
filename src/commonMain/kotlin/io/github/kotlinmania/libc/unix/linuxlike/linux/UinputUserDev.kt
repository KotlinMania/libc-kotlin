// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class UinputUserDev(
    val name: ByteArray,
    val id: InputId,
    val ffEffectsMax: UInt,
    val absmax: List<Int>,
    val absmin: List<Int>,
    val absfuzz: List<Int>,
    val absflat: List<Int>,
)
