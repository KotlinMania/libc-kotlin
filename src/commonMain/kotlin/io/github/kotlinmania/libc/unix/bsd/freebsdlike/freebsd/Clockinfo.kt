// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Clockinfo(
    val hz: Int,
    val tick: Int,
    val spare: Int,
    val stathz: Int,
    val profhz: Int,
)
