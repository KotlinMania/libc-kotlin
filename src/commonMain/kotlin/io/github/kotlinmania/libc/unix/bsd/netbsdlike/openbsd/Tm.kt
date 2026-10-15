// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

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
