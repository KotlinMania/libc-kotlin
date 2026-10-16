package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Xucred(
    val crVersion: UInt,
    val crUid: UInt,
    val crNgroups: Short,
    val crGroups: List<UInt>,
)
