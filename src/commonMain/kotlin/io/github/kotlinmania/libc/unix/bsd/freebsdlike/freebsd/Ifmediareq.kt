// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifmediareq(
    val ifmName: ByteArray,
    val ifmCurrent: Int,
    val ifmMask: Int,
    val ifmStatus: Int,
    val ifmActive: Int,
    val ifmCount: Int,
    val ifmUlist: Int?,
)
