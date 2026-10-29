package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfaMsghdrl(
    val ifamMsglen: UShort,
    val ifamVersion: UByte,
    val ifamType: UByte,
    val ifamAddrs: Int,
    val ifamFlags: Int,
    val ifamIndex: UShort,
    val ifamSpare1: UShort,
    val ifamLen: UShort,
    val ifamDataOff: UShort,
    val ifamMetric: Int,
    val ifamData: IfData,
)
