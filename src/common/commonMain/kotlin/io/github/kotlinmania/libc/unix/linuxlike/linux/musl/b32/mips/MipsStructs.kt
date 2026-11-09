package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.NlinkT

public open class Stat(
    public var stDev: DevT,
    public var stPadding1: List<CLong>,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stPadding2: List<CLong>,
    public var stSize: OffT,
    public var stAtim32: CAnonymousTimespec32,
    public var stMtim32: CAnonymousTimespec32,
    public var stCtim32: CAnonymousTimespec32,
    public var stBlksize: BlksizeT,
    public var stPadding3: CLong,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var pad0: UInt,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var pad1: UInt,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var pad2: UInt,
    public var stPadding4: List<CLong>,
)

public open class CAnonymousTimespec32(public var tvSec: CLong, public var tvNsec: CLong)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class IpcPerm(
    public var key: KeyT,
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CInt,
    public var unused1: CLong,
    public var unused2: CLong,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmAtimeLo: CLong,
    public var shmDtimeLo: CLong,
    public var shmCtimeLo: CLong,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
    public var shmAtimeHi: CUshort,
    public var shmDtimeHi: CUshort,
    public var shmCtimeHi: CUshort,
)

public open class Statfs(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fBavail: FsblkcntT,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Statfs64(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fBavail: FsblkcntT,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStimeLo: CUlong,
    public var msgStimeHi: CUlong,
    public var msgRtimeLo: CUlong,
    public var msgRtimeHi: CUlong,
    public var msgCtimeLo: CUlong,
    public var msgCtimeHi: CUlong,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
)

public open class MaxAlignT(public var priv: List<Float>)
