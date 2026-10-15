// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifi2creq(
    val devAddr: UByte,
    val offset: UByte,
    val len: UByte,
    val spare0: UByte,
    val spare1: UInt,
    val data: UByteArray,
)
