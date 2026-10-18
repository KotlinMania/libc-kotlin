package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fBsize: UInt,
    val fIosize: Int,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fOwner: UInt,
    val fType: UInt,
    val fFlags: UInt,
    val fFssubtype: UInt,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
    val fFlagsExt: UInt,
    val fReserved: UIntArray,
)
