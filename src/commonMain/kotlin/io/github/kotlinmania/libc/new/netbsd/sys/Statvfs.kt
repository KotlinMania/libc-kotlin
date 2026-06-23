// port-lint: source new/netbsd/sys/statvfs.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fFlag: CULong,
    val fBsize: CULong,
    val fFrsize: CULong,
    val fIosize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fBresvd: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFresvd: FsfilcntT,
    val fSyncreads: ULong,
    val fSyncwrites: ULong,
    val fAsyncreads: ULong,
    val fAsyncwrites: ULong,
    val fFsidx: FsidT,
    val fFsid: CULong,
    val fNamemax: CULong,
    val fOwner: UidT,
    val fSpare: UIntArray,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fMntfromname: ByteArray,
)
