// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: Int,
    val esterror: Int,
)
