package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fFlags: UInt,
    val fBsize: UInt,
    val fIosize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: Long,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: Long,
    val fSyncwrites: ULong,
    val fSyncreads: ULong,
    val fAsyncwrites: ULong,
    val fAsyncreads: ULong,
    val fFsid: ULong,
    val fNamemax: UInt,
    val fOwner: UInt,
    val fCtime: ULong,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
    val fMntfromspec: ByteArray,
    val mountInfo: MountInfo,
)
