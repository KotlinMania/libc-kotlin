package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Timeval
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.csky.IpcPerm

public open class Stat(
    public var stDev: DevT,
    public var pad1: CUint,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var pad2: CUint,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var atimePad: CInt,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var mtimePad: CInt,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var ctimePad: CInt,
    public var glibcReserved4: CLong,
    public var glibcReserved5: CLong,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadAttrT(public var size: List<UInt>)

public open class SigsetT(public var value: List<CUlong>)

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

public open class SemidDs(
    public var semPerm: IpcPerm,
    public var semOtime: TimeT,
    public var reserved: SyscallUlongT,
    public var semCtime: TimeT,
    public var reserved2: SyscallUlongT,
    public var semNsems: SyscallUlongT,
    public var glibcReserved3: SyscallUlongT,
    public var glibcReserved4: SyscallUlongT,
)

public open class Timex(
    public var modes: CUint,
    public var pad1: CInt,
    public var offset: CLonglong,
    public var freq: CLonglong,
    public var maxerror: CLonglong,
    public var esterror: CLonglong,
    public var status: CInt,
    public var pad2: CInt,
    public var constant: CLonglong,
    public var precision: CLonglong,
    public var tolerance: CLonglong,
    public var time: Timeval,
    public var tick: CLonglong,
    public var ppsfreq: CLonglong,
    public var jitter: CLonglong,
    public var shift: CInt,
    public var pad3: CInt,
    public var stabil: CLonglong,
    public var jitcnt: CLonglong,
    public var calcnt: CLonglong,
    public var errcnt: CLonglong,
    public var stbcnt: CLonglong,
    public var tai: CInt,
    public var unused1: Int,
    public var unused2: Int,
    public var unused3: Int,
    public var unused4: Int,
    public var unused5: Int,
    public var unused6: Int,
    public var unused7: Int,
    public var unused8: Int,
    public var unused9: Int,
    public var unused10: Int,
    public var unused11: Int,
)
