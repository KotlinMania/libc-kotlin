package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.TimeT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public open class Stat(
    public var stDev: CUlong,
    public var stPad1: List<CLong>,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    public var stPad2: List<CLong>,
    public var stSize: OffT,
    public var stPad3: CLong,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var atimePad: CInt,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var mtimePad: CInt,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var ctimePad: CInt,
    public var stCtimeNsec: CLong,
    public var stPad4: CLong,
    public var stPad5: List<CLong>,
)

public open class Stat64(
    public var stDev: CUlong,
    public var stPad1: List<CLong>,
    public var stIno: Ino64T,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: CUlong,
    public var stPad2: List<CLong>,
    public var stSize: Off64T,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var atimePad: CInt,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var mtimePad: CInt,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var ctimePad: CInt,
    public var stCtimeNsec: CLong,
    public var stPad3: CLong,
    public var stPad5: List<CLong>,
)

public open class Statfs(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fFrsize: CLong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fFiles: FsblkcntT,
    public var fFfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fFlags: CLong,
    public var fSpare: List<CLong>,
)

public open class Statfs64(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fFrsize: CLong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fBavail: ULong,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fFlags: CLong,
    public var fSpare: List<CLong>,
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
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class Sigaction(
    public var saFlags: CInt,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saRestorer: SigactionSaRestorerCallback?,
    public var resv: List<CInt>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad: List<CInt>,
)

public open class IpcPerm(
    public var key: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: CUint,
    public var seq: CUshort,
    public var pad1: CUshort,
    public var unused1: CUlong,
    public var unused2: CUlong,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: ShmattT,
    public var unused4: CUlong,
    public var unused5: CUlong,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStime: TimeT,
    public var glibcReserved1: CUlong,
    public var msgRtime: TimeT,
    public var glibcReserved2: CUlong,
    public var msgCtime: TimeT,
    public var glibcReserved3: CUlong,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var glibcReserved4: CUlong,
    public var glibcReserved5: CUlong,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lSysid: CLong,
    public var lPid: PidT,
    public var glibcReserved0: List<CLong>,
)

public open class MaxAlignT(public var priv: List<Float>)
