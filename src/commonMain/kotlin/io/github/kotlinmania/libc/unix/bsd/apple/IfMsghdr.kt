package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.bsd.apple.b64.IfData

import io.github.kotlinmania.libc.*

public data class IfMsghdr(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmIndex: UShort,
    val ifmData: IfData,
)
