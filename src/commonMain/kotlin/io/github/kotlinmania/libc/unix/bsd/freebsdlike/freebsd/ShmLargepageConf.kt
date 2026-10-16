package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class ShmLargepageConf(
    val psind: Int,
    val allocPolicy: Int,
)
