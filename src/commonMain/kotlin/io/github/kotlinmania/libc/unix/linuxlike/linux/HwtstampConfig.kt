package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class HwtstampConfig(
    val flags: Int,
    val txType: Int,
    val rxFilter: Int,
)
