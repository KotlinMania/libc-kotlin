@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
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

public class Stat(
    public var stDev: DevT = 0uL,
    public var stDevPadding: CInt = 0,
    public var stInoTruncated: CLong = 0L,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stRdevPadding: CInt = 0,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtim32: CAnonymousTimespec32 = CAnonymousTimespec32(),
    public var stMtim32: CAnonymousTimespec32 = CAnonymousTimespec32(),
    public var stCtim32: CAnonymousTimespec32 = CAnonymousTimespec32(),
    public var stIno: InoT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var pad0: UInt = 0u,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var pad1: UInt = 0u,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var pad2: UInt = 0u,
)

public data class CAnonymousTimespec32(public var tvSec: CLong = 0L, public var tvNsec: CLong = 0L)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssFlags: CInt = 0,
    public var ssSize: SizeT = 0uL,
)

public data class IpcPerm(
    public var key: KeyT = 0,
    public var ipcPermKey: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CInt = 0,
    public var unused1: CLong = 0L,
    public var unused2: CLong = 0L,
)

public class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmAtimeLo: CUlong = 0uL,
    public var shmAtimeHi: CUlong = 0uL,
    public var shmDtimeLo: CUlong = 0uL,
    public var shmDtimeHi: CUlong = 0uL,
    public var msgCtimeLo: CUlong = 0uL,
    public var msgCtimeHi: CUlong = 0uL,
    public var shmAtime: TimeT = 0L,
    public var unused1: CInt = 0,
    public var shmDtime: TimeT = 0L,
    public var unused2: CInt = 0,
    public var shmCtime: TimeT = 0L,
    public var unused3: CInt = 0,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: CUlong = 0uL,
    public var pad1: CUlong = 0uL,
    public var pad2: CUlong = 0uL,
    public var pad3: CUlong = 0uL,
)

public class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStimeLo: CUlong = 0uL,
    public var msgStimeHi: CUlong = 0uL,
    public var msgRtimeLo: CUlong = 0uL,
    public var msgRtimeHi: CUlong = 0uL,
    public var msgCtimeLo: CUlong = 0uL,
    public var msgCtimeHi: CUlong = 0uL,
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

public class McontextT(
    public var trapNo: CUlong = 0uL,
    public var errorCode: CUlong = 0uL,
    public var oldmask: CUlong = 0uL,
    public var armR0: CUlong = 0uL,
    public var armR1: CUlong = 0uL,
    public var armR2: CUlong = 0uL,
    public var armR3: CUlong = 0uL,
    public var armR4: CUlong = 0uL,
    public var armR5: CUlong = 0uL,
    public var armR6: CUlong = 0uL,
    public var armR7: CUlong = 0uL,
    public var armR8: CUlong = 0uL,
    public var armR9: CUlong = 0uL,
    public var armR10: CUlong = 0uL,
    public var armFp: CUlong = 0uL,
    public var armIp: CUlong = 0uL,
    public var armSp: CUlong = 0uL,
    public var armLr: CUlong = 0uL,
    public var armPc: CUlong = 0uL,
    public var armCpsr: CUlong = 0uL,
    public var faultAddress: CUlong = 0uL,
)

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucRegspace: ULongArray = ULongArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (!this.ucRegspace.contentEquals(other.ucRegspace)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucRegspace.contentHashCode()
        return result
    }
}

public data class MaxAlignT(public var priv: Pair<Long, Long> = Pair<Long, Long>(0L, 0L))
