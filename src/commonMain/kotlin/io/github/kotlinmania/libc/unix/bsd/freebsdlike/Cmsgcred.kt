package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class Cmsgcred(
    val cmcredPid: Int,
    val cmcredUid: UInt,
    val cmcredEuid: UInt,
    val cmcredGid: UInt,
    val cmcredNgroups: Short,
    val cmcredGroups: List<UInt>,
)
