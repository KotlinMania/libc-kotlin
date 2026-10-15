package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Uucred(
    val crUid: UInt,
    val crGid: UInt,
    val crNgroups: Short,
    val crGroups: List<UInt>,
)
