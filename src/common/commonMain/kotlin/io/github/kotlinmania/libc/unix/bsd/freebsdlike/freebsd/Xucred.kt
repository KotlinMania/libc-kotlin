package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Xucred(
    val crVersion: UInt,
    val crUid: UInt,
    val crNgroups: Short,
    val crGroups: List<UInt>,
    val crPidCAnonymousUnion: CAnonymousCrPid,
)
