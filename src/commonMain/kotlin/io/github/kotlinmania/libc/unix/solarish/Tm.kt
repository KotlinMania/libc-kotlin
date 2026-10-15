// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Tm(
    val tmSec: Int,
    val tmMin: Int,
    val tmHour: Int,
    val tmMday: Int,
    val tmMon: Int,
    val tmYear: Int,
    val tmWday: Int,
    val tmYday: Int,
    val tmIsdst: Int,
)
