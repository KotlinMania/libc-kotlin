// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SockaddrCtl(
    val scLen: UByte,
    val scFamily: UByte,
    val ssSysaddr: UShort,
    val scId: UInt,
    val scUnit: UInt,
    val scReserved: UIntArray,
)
