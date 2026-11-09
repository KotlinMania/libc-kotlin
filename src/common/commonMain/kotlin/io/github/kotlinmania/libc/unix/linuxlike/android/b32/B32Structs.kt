package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.android.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.android.InoT
import io.github.kotlinmania.libc.unix.linuxlike.android.NlinkT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Rlimit64(public var rlimCur: ULong, public var rlimMax: ULong)

public open class Stat(
    public var stDev: CUlonglong,
    public var pad0: List<CUchar>,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad3: List<CUchar>,
    public var stSize: CLonglong,
    public var stBlksize: BlksizeT,
    public var stBlocks: CUlonglong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
)

public open class Stat64(
    public var stDev: CUlonglong,
    public var pad0: List<CUchar>,
    public var stIno: InoT,
    public var stMode: CUint,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlonglong,
    public var pad3: List<CUchar>,
    public var stSize: CLonglong,
    public var stBlksize: BlksizeT,
    public var stBlocks: CUlonglong,
    public var stAtime: CLong,
    public var stAtimeNsec: CLong,
    public var stMtime: CLong,
    public var stMtimeNsec: CLong,
    public var stCtime: CLong,
    public var stCtimeNsec: CLong,
)

public open class Statfs64(
    public var fType: UInt,
    public var fBsize: UInt,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: UInt,
    public var fFrsize: UInt,
    public var fFlags: UInt,
    public var fSpare: List<UInt>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: CUlong,
    public var fBfree: CUlong,
    public var fBavail: CUlong,
    public var fFiles: CUlong,
    public var fFfree: CUlong,
    public var fFavail: CUlong,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class PthreadAttrT(
    public var flags: UInt,
    public var stackBase: COpaquePointer?,
    public var stackSize: SizeT,
    public var guardSize: SizeT,
    public var schedPolicy: Int,
    public var schedPriority: Int,
)

public open class PthreadMutexT(public var value: CInt)

public open class PthreadCondT(public var value: CInt)

public open class PthreadRwlockT(
    public var lock: PthreadMutexT,
    public var cond: PthreadCondT,
    public var numLocks: CInt,
    public var writerThreadId: CInt,
    public var pendingReaders: CInt,
    public var pendingWriters: CInt,
    public var attr: Int,
    public var reserved: List<CChar>,
)

public open class PthreadBarrierT(public var private: List<Int>)

public open class PthreadSpinlockT(public var private: List<Int>)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Statfs(
    public var fType: UInt,
    public var fBsize: UInt,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: UInt,
    public var fFrsize: UInt,
    public var fFlags: UInt,
    public var fSpare: List<UInt>,
)

public open class Sysinfo(
    public var uptime: CLong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var f: List<CChar>,
)

public open class Sigset64T(public var bits: List<CUlong>)
