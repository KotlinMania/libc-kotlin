@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.loongarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.BlkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.InoT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.StackT

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
    public var stBlksize: BlksizeT = 0,
    public var pad2: CInt = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: IntArray = IntArray(2),
)

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: CUint = 0u,
    public var seq: CInt = 0,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
)

public data class UserRegsStruct(
    public var regs: ULongArray = ULongArray(32),
    public var origA0: ULong = 0uL,
    public var csrEra: ULong = 0uL,
    public var csrBadv: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserRegsStruct) return false
        if (!this.regs.contentEquals(other.regs)) return false
        if (this.origA0 != other.origA0) return false
        if (this.csrEra != other.csrEra) return false
        if (this.csrBadv != other.csrBadv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regs.contentHashCode()
        result = 31 * result + this.origA0.hashCode()
        result = 31 * result + this.csrEra.hashCode()
        result = 31 * result + this.csrBadv.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class UserFpStruct(
    public var fpr: ULongArray = ULongArray(32),
    public var fcc: ULong = 0uL,
    public var fcsr: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpStruct) return false
        if (!this.fpr.contentEquals(other.fpr)) return false
        if (this.fcc != other.fcc) return false
        if (this.fcsr != other.fcsr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fpr.contentHashCode()
        result = 31 * result + this.fcc.hashCode()
        result = 31 * result + this.fcsr.hashCode()
        return result
    }
}

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucMcontext: McontextT = McontextT(),
)

public data class McontextT(
    public var pc: CUlong = 0uL,
    public var gregs: ULongArray = ULongArray(32),
    public var flags: CUint = 0u,
    public var extcontext: ULongArray = ULongArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (this.pc != other.pc) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.flags != other.flags) return false
        if (!this.extcontext.contentEquals(other.extcontext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pc.hashCode()
        result = 31 * result + this.gregs.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.extcontext.contentHashCode()
        return result
    }
}

public data class CloneArgs(
    public var flags: CUlonglong = 0uL,
    public var pidfd: CUlonglong = 0uL,
    public var childTid: CUlonglong = 0uL,
    public var parentTid: CUlonglong = 0uL,
    public var exitSignal: CUlonglong = 0uL,
    public var stack: CUlonglong = 0uL,
    public var stackSize: CUlonglong = 0uL,
    public var tls: CUlonglong = 0uL,
    public var setTid: CUlonglong = 0uL,
    public var setTidSize: CUlonglong = 0uL,
    public var cgroup: CUlonglong = 0uL,
)

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()
}
