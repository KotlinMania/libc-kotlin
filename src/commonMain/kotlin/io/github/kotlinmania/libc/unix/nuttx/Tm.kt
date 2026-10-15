// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

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
    val tmGmtoff: Long,
    val tmZone: String?,
)
