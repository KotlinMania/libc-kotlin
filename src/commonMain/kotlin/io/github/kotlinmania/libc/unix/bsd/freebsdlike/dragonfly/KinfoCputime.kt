package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class KinfoCputime(
    val cpUser: ULong,
    val cpNice: ULong,
    val cpSys: ULong,
    val cpIntr: ULong,
    val cpIdel: ULong,
    val cpSamplePc: ULong,
    val cpSampleSp: ULong,
    val cpMsg: ByteArray,
)
