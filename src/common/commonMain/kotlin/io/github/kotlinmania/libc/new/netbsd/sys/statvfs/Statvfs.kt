// port-lint: source new/netbsd/sys/statvfs.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.netbsd.sys.statvfs

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.FsblkcntT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.FsfilcntT

// Header: `sys / statvfs.h`
//
// <https://github.com/NetBSD/src/blob/trunk/sys/sys/statvfs.h>

public val VFS_NAMELEN: Int = 32

public val VFS_MNAMELEN: Int = 1024

public class Statvfs(
    public var fFlag: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fIosize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fBresvd: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFresvd: FsfilcntT = 0uL,
    public var fSyncreads: ULong = 0uL,
    public var fSyncwrites: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fFsidx: FsidT = FsidT(),
    public var fFsid: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fOwner: UidT = 0u,
    // This type is updated in a future version
    public var fSpare: UIntArray = UIntArray(4),
    public var fFstypename: UByteArray = UByteArray(VFS_NAMELEN),
    public var fMntonname: UByteArray = UByteArray(VFS_MNAMELEN),
    public var fMntfromname: UByteArray = UByteArray(VFS_MNAMELEN),
)
