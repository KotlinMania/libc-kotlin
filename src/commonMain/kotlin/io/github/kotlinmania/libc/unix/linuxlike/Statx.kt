package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class Statx(
    val stxMask: UInt,
    val stxBlksize: UInt,
    val stxAttributes: ULong,
    val stxNlink: UInt,
    val stxUid: UInt,
    val stxGid: UInt,
    val stxMode: UShort,
    val stxIno: ULong,
    val stxSize: ULong,
    val stxBlocks: ULong,
    val stxAttributesMask: ULong,
    val stxAtime: StatxTimestamp,
    val stxBtime: StatxTimestamp,
    val stxCtime: StatxTimestamp,
    val stxMtime: StatxTimestamp,
    val stxRdevMajor: UInt,
    val stxRdevMinor: UInt,
    val stxDevMajor: UInt,
    val stxDevMinor: UInt,
    val stxMntId: ULong,
    val stxDioMemAlign: UInt,
    val stxDioOffsetAlign: UInt,
)
