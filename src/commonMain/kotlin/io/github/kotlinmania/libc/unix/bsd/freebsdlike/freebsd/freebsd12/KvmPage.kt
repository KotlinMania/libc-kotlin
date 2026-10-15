package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*

public data class KvmPage(
    val version: UInt,
    val paddr: ULong,
    val kmapVaddr: ULong,
    val dmapVaddr: ULong,
    val prot: Int,
    val offset: ULong,
    val len: ULong,
)
