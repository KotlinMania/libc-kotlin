package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class LgrpAffinityArgsT(
    val idtype: UInt,
    val id: Int,
    val lgrp: Int,
    val aff: Int,
)
