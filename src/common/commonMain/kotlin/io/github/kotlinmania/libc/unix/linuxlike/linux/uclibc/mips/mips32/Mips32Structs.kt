package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Blkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Ino64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.ShmattT

public open class Stat(
    public var stDev: DevT,
    public var stPad1: List<CLong>,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stPad2: List<CLong>,
    public var stSize: OffT,
    public var stPad3: CLong,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stPad5: List<CLong>,
)

public open class Stat64(
    public var stDev: DevT,
    public var stPad1: List<CLong>,
    public var stIno: Ino64T,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stPad2: List<CLong>,
    public var stSize: Off64T,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: BlksizeT,
    public var stPad3: CLong,
    public var stBlocks: Blkcnt64T,
    public var stPad5: List<CLong>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFiles: Fsfilcnt64T,
    public var fFfree: Fsfilcnt64T,
    public var fFavail: Fsfilcnt64T,
    public var fFsid: CUlong,
    public var fUnused: CInt,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fSpare: List<CInt>,
)

public open class PthreadAttrT(public var size: List<UInt>)

public open class Sigaction(
    public var saFlags: CUint,
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var restorer: COpaquePointer?,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class SigsetT(public var value: List<CUlong>)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad: List<CInt>,
)

public open class Glob64T(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
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
    public var fSpare: List<CLong>,
)

public open class Statfs64(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fFrsize: CLong,
    public var fBlocks: Fsblkcnt64T,
    public var fBfree: Fsblkcnt64T,
    public var fFiles: Fsblkcnt64T,
    public var fFfree: Fsblkcnt64T,
    public var fBavail: Fsblkcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CLong,
    public var fFlags: CLong,
    public var fSpare: List<CLong>,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lSysid: CLong,
    public var lPid: PidT,
    public var pad: List<CLong>,
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

public open class SemT(public var size: List<CChar>)
