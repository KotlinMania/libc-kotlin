package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SockaddrVm(
    val svmFamily: UShort,
    val svmReserved1: UShort,
    val svmPort: UInt,
    val svmCid: UInt,
    val svmZero: UByteArray,
)
