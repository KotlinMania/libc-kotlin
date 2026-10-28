package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class RegexT(
    val reNsub: ULong,
    val reComp: COpaquePointer?,
    val reCflags: Int,
    val reErroff: ULong,
    val reLen: ULong,
    val reUcoll: List<UInt>,
    val reLsub: LongArray,
    val reEsub: LongArray,
    val reMap: COpaquePointer?,
    val maxsub: Int,
)
