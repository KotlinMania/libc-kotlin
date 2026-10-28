package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class IfMsghdr2(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmIndex: UShort,
    val ifmSndLen: Int,
    val ifmSndMaxlen: Int,
    val ifmSndDrops: Int,
    val ifmTimer: Int,
    val ifmData: IfData64,
)
