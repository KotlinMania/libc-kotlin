package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.riscv32

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
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.NlinkT

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad1: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var pad2: CInt = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var pad0: UInt = 0u,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: IntArray = IntArray(2),
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
)

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: CUshort = 0u,
    public var pad1: CUshort = 0u,
    public var seq: CUshort = 0u,
    public var pad2: CUshort = 0u,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var unused5: CUlong = 0uL,
    public var unused6: CUlong = 0uL,
)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0L,
    public var unused1: CInt = 0,
    public var msgRtime: TimeT = 0L,
    public var unused2: CInt = 0,
    public var msgCtime: TimeT = 0L,
    public var unused3: CInt = 0,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var pad1: CUlong = 0uL,
    public var pad2: CUlong = 0uL,
)

public data class MaxAlignT(
    public var priv0: Long = 0L,
    public var priv1: Double = 0.0,
)
