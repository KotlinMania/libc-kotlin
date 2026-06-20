// port-lint: source new/netbsd/sys/statvfs.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/statvfs.h`.
 */

internal const val VFS_NAMELEN: Int = 32
internal const val VFS_MNAMELEN: Int = 1024

// f_spare is reserved. f_mntfromlabel was added in NetBSD 10.
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
) {
    init {
        require(fSpare.size == 4) { "f_spare must be 4 entries" }
        require(fFstypename.size == VFS_NAMELEN) { "f_fstypename must be $VFS_NAMELEN bytes" }
        require(fMntonname.size == VFS_MNAMELEN) { "f_mntonname must be $VFS_MNAMELEN bytes" }
        require(fMntfromname.size == VFS_MNAMELEN) { "f_mntfromname must be $VFS_MNAMELEN bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Statvfs
        if (fFlag != other.fFlag) return false
        if (fBsize != other.fBsize) return false
        if (fFrsize != other.fFrsize) return false
        if (fIosize != other.fIosize) return false
        if (fBlocks != other.fBlocks) return false
        if (fBfree != other.fBfree) return false
        if (fBavail != other.fBavail) return false
        if (fBresvd != other.fBresvd) return false
        if (fFiles != other.fFiles) return false
        if (fFfree != other.fFfree) return false
        if (fFavail != other.fFavail) return false
        if (fFresvd != other.fFresvd) return false
        if (fSyncreads != other.fSyncreads) return false
        if (fSyncwrites != other.fSyncwrites) return false
        if (fAsyncreads != other.fAsyncreads) return false
        if (fAsyncwrites != other.fAsyncwrites) return false
        if (fFsidx != other.fFsidx) return false
        if (fFsid != other.fFsid) return false
        if (fNamemax != other.fNamemax) return false
        if (fOwner != other.fOwner) return false
        if (!fSpare.contentEquals(other.fSpare)) return false
        if (!fFstypename.contentEquals(other.fFstypename)) return false
        if (!fMntonname.contentEquals(other.fMntonname)) return false
        if (!fMntfromname.contentEquals(other.fMntfromname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = fFlag.hashCode()
        result = 31 * result + fBsize.hashCode()
        result = 31 * result + fFrsize.hashCode()
        result = 31 * result + fIosize.hashCode()
        result = 31 * result + fBlocks.hashCode()
        result = 31 * result + fBfree.hashCode()
        result = 31 * result + fBavail.hashCode()
        result = 31 * result + fBresvd.hashCode()
        result = 31 * result + fFiles.hashCode()
        result = 31 * result + fFfree.hashCode()
        result = 31 * result + fFavail.hashCode()
        result = 31 * result + fFresvd.hashCode()
        result = 31 * result + fSyncreads.hashCode()
        result = 31 * result + fSyncwrites.hashCode()
        result = 31 * result + fAsyncreads.hashCode()
        result = 31 * result + fAsyncwrites.hashCode()
        result = 31 * result + fFsidx.hashCode()
        result = 31 * result + fFsid.hashCode()
        result = 31 * result + fNamemax.hashCode()
        result = 31 * result + fOwner.hashCode()
        result = 31 * result + fSpare.contentHashCode()
        result = 31 * result + fFstypename.contentHashCode()
        result = 31 * result + fMntonname.contentHashCode()
        result = 31 * result + fMntfromname.contentHashCode()
        return result
    }
}
