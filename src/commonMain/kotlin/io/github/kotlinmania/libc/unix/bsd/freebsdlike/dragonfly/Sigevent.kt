package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.unix.Sigval

import io.github.kotlinmania.libc.*

public data class Sigevent(
    val sigevNotify: Int,
    val sigevSigno: Int,
    val sigevValue: Sigval,
)
