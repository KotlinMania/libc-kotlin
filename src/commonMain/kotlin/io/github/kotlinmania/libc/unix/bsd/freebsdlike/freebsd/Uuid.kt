// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Uuid(
    val timeLow: UInt,
    val timeMid: UShort,
    val timeHiAndVersion: UShort,
    val clockSeqLow: UByte,
    val node: UByteArray,
)
