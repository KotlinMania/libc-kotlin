package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)
