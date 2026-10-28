package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfMsghdrl(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmIndex: UShort,
    val ifmSpare1: UShort,
    val ifmLen: UShort,
    val ifmDataOff: UShort,
    val ifmSpare2: Int,
    val ifmData: IfData,
)
