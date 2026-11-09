package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.SigsetT

public open class Stat(
    public var stDev: DevT,
    public var stDevPadding: CInt,
    public var stInoTruncated: CLong,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stRdevPadding: CInt,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtim32: CAnonymousTimespec32,
    public var stMtim32: CAnonymousTimespec32,
    public var stCtim32: CAnonymousTimespec32,
    public var stIno: InoT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var pad0: UInt,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var pad1: UInt,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var pad2: UInt,
)

public open class CAnonymousTimespec32(public var tvSec: CLong, public var tvNsec: CLong)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
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
    public var shmAtimeLo: CUlong,
    public var shmAtimeHi: CUlong,
    public var shmDtimeLo: CUlong,
    public var shmDtimeHi: CUlong,
    public var msgCtimeLo: CUlong,
    public var msgCtimeHi: CUlong,
    public var shmAtime: TimeT,
    public var unused1: CInt,
    public var shmDtime: TimeT,
    public var unused2: CInt,
    public var shmCtime: TimeT,
    public var unused3: CInt,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
    public var pad3: CUlong,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgStimeLo: CUlong,
    public var msgStimeHi: CUlong,
    public var msgRtimeLo: CUlong,
    public var msgRtimeHi: CUlong,
    public var msgCtimeLo: CUlong,
    public var msgCtimeHi: CUlong,
    public var msgStime: TimeT,
    public var unused1: CInt,
    public var msgRtime: TimeT,
    public var unused2: CInt,
    public var msgCtime: TimeT,
    public var unused3: CInt,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class McontextT(
    public var trapNo: CUlong,
    public var errorCode: CUlong,
    public var oldmask: CUlong,
    public var armR0: CUlong,
    public var armR1: CUlong,
    public var armR2: CUlong,
    public var armR3: CUlong,
    public var armR4: CUlong,
    public var armR5: CUlong,
    public var armR6: CUlong,
    public var armR7: CUlong,
    public var armR8: CUlong,
    public var armR9: CUlong,
    public var armR10: CUlong,
    public var armFp: CUlong,
    public var armIp: CUlong,
    public var armSp: CUlong,
    public var armLr: CUlong,
    public var armPc: CUlong,
    public var armCpsr: CUlong,
    public var faultAddress: CUlong,
)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucSigmask: SigsetT,
    public var ucRegspace: List<CUlonglong>,
)

public open class MaxAlignT(public var priv: Pair<Long, Long>)
