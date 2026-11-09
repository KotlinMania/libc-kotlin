package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.android.FsidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public open class SigsetT(public var value: List<CUlong>)

public open class Sigaction(
    public var saFlags: CInt,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saRestorer: SigactionSaRestorerCallback?,
)

public open class Rlimit64(public var rlimCur: CUlonglong, public var rlimMax: CUlonglong)

public open class PthreadAttrT(
    public var flags: UInt,
    public var stackBase: COpaquePointer?,
    public var stackSize: SizeT,
    public var guardSize: SizeT,
    public var schedPolicy: Int,
    public var schedPriority: Int,
    public var reserved: List<CChar>,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Statfs(
    public var fType: ULong,
    public var fBsize: ULong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: ULong,
    public var fFrsize: ULong,
    public var fFlags: ULong,
    public var fSpare: List<ULong>,
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

public open class Statfs64(
    public var fType: ULong,
    public var fBsize: ULong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fNamelen: ULong,
    public var fFrsize: ULong,
    public var fFlags: ULong,
    public var fSpare: List<ULong>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFavail: ULong,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadBarrierT(public var private: List<Long>)

public open class PthreadSpinlockT(public var private: Long)

public open class PthreadMutexT(public var value: CInt, public var reserved: List<CChar>)

public open class PthreadCondT(public var value: CInt, public var reserved: List<CChar>)

public open class PthreadRwlockT(
    public var numLocks: CInt,
    public var writerThreadId: CInt,
    public var pendingReaders: CInt,
    public var pendingWriters: CInt,
    public var attr: Int,
    public var reserved: List<CChar>,
)

public open class Sigset64T(public var bits: List<CUlong>)
