package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class IfMsghdr(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmHdrlen: UShort,
    val ifmIndex: UShort,
    val ifmTableid: UShort,
    val ifmPad1: UByte,
    val ifmPad2: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmXflags: Int,
    val ifmData: IfData,
)
