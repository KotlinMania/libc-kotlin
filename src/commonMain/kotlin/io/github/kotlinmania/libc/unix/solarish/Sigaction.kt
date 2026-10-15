// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: Int,
    val saSigaction: ULong,
    val saMask: SigsetT,
)
