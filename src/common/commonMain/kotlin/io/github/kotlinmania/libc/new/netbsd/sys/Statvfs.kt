// port-lint: source new/netbsd/sys/statvfs.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.FsfilcntT

// Header: `sys / statvfs.h`
//
// <https://github.com/NetBSD/src/blob/trunk/sys/sys/statvfs.h>

public val VFS_NAMELEN: Int = 32

public val VFS_MNAMELEN: Int = 1024

public open class Statvfs(
    public var fFlag: CUlong,
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fIosize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fBresvd: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFresvd: FsfilcntT,
    public var fSyncreads: ULong,
    public var fSyncwrites: ULong,
    public var fAsyncreads: ULong,
    public var fAsyncwrites: ULong,
    public var fFsidx: FsidT,
    public var fFsid: CUlong,
    public var fNamemax: CUlong,
    public var fOwner: UidT,
    // This type is updated in a future version
    public var fSpare: List<UInt>,
    public var fFstypename: List<CChar>,
    public var fMntonname: List<CChar>,
    public var fMntfromname: List<CChar>,
)
