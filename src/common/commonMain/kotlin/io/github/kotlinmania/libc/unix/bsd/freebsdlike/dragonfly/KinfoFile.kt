package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class KinfoFile(
    val fSize: ULong,
    val fPid: Int,
    val fUid: UInt,
    val fFd: Int,
    val fFile: COpaquePointer?,
    val fType: Short,
    val fCount: Int,
    val fMsgcount: Int,
    val fOffset: Long,
    val fData: COpaquePointer?,
    val fFlag: UInt,
)
