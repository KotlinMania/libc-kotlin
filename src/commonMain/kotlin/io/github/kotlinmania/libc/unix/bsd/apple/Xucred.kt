package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Xucred(
    val crVersion: UInt,
    val crUid: UInt,
    val crNgroups: Short,
    val crGroups: List<UInt>,
)
