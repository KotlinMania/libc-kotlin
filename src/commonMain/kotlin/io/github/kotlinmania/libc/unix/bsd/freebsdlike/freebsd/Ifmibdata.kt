package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifmibdata(
    val ifmdName: ByteArray,
    val ifmdPcount: Int,
    val ifmdFlags: Int,
    val ifmdSndLen: Int,
    val ifmdSndMaxlen: Int,
    val ifmdSndDrops: Int,
    val ifmdFiller: IntArray,
    val ifmdData: IfData,
)
