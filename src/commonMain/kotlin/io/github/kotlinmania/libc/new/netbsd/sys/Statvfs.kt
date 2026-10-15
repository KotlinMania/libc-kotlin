// port-lint: source new/netbsd/sys/statvfs.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fFlag: ULong,
    val fBsize: ULong,
    val fFrsize: ULong,
    val fIosize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fBresvd: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFresvd: ULong,
    val fSyncreads: ULong,
    val fSyncwrites: ULong,
    val fAsyncreads: ULong,
    val fAsyncwrites: ULong,
    val fFsidx: ULong,
    val fFsid: ULong,
    val fNamemax: ULong,
    val fOwner: UInt,
    val fSpare: UIntArray,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
)
