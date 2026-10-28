package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class IfmaMsghdr2(
    val ifmamMsglen: UShort,
    val ifmamVersion: UByte,
    val ifmamType: UByte,
    val ifmamAddrs: Int,
    val ifmamFlags: Int,
    val ifmamIndex: UShort,
    val ifmamRefcount: Int,
)
