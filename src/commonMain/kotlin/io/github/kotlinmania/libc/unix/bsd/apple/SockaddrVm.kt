// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SockaddrVm(
    val svmLen: UByte,
    val svmFamily: UShort,
    val svmReserved1: UShort,
    val svmPort: UInt,
    val svmCid: UInt,
)
