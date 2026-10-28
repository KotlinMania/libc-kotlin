package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val pthreadCondFlag: UByteArray,
    val pthreadCondType: UShort,
    val pthreadCondMagic: UShort,
    val pthreadCondData: ULong,
)
