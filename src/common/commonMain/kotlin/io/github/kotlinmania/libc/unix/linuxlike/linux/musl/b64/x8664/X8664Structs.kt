@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
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
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var pad0: CInt = 0,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: LongArray = LongArray(3),
)

public class UserRegsStruct(
    public var r15: CUlong = 0uL,
    public var r14: CUlong = 0uL,
    public var r13: CUlong = 0uL,
    public var r12: CUlong = 0uL,
    public var rbp: CUlong = 0uL,
    public var rbx: CUlong = 0uL,
    public var r11: CUlong = 0uL,
    public var r10: CUlong = 0uL,
    public var r9: CUlong = 0uL,
    public var r8: CUlong = 0uL,
    public var rax: CUlong = 0uL,
    public var rcx: CUlong = 0uL,
    public var rdx: CUlong = 0uL,
    public var rsi: CUlong = 0uL,
    public var rdi: CUlong = 0uL,
    public var origRax: CUlong = 0uL,
    public var rip: CUlong = 0uL,
    public var cs: CUlong = 0uL,
    public var eflags: CUlong = 0uL,
    public var rsp: CUlong = 0uL,
    public var ss: CUlong = 0uL,
    public var fsBase: CUlong = 0uL,
    public var gsBase: CUlong = 0uL,
    public var ds: CUlong = 0uL,
    public var es: CUlong = 0uL,
    public var fs: CUlong = 0uL,
    public var gs: CUlong = 0uL,
)

public data class User(
    public var regs: UserRegsStruct = UserRegsStruct(),
    public var uFpvalid: CInt = 0,
    public var i387: UserFpregsStruct = UserFpregsStruct(),
    public var uTsize: CUlong = 0uL,
    public var uDsize: CUlong = 0uL,
    public var uSsize: CUlong = 0uL,
    public var startCode: CUlong = 0uL,
    public var startStack: CUlong = 0uL,
    public var signal: CLong = 0L,
    public var reserved: CInt = 0,
    public var uAr0: UserRegsStruct? = null,
    public var uFpstate: UserFpregsStruct? = null,
    public var magic: CUlong = 0uL,
    public var uComm: UByteArray = UByteArray(32),
    public var uDebugreg: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false
        if (this.regs != other.regs) return false
        if (this.uFpvalid != other.uFpvalid) return false
        if (this.i387 != other.i387) return false
        if (this.uTsize != other.uTsize) return false
        if (this.uDsize != other.uDsize) return false
        if (this.uSsize != other.uSsize) return false
        if (this.startCode != other.startCode) return false
        if (this.startStack != other.startStack) return false
        if (this.signal != other.signal) return false
        if (this.reserved != other.reserved) return false
        if (this.uAr0 != other.uAr0) return false
        if (this.uFpstate != other.uFpstate) return false
        if (this.magic != other.magic) return false
        if (!this.uComm.contentEquals(other.uComm)) return false
        if (!this.uDebugreg.contentEquals(other.uDebugreg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regs.hashCode()
        result = 31 * result + this.uFpvalid.hashCode()
        result = 31 * result + this.i387.hashCode()
        result = 31 * result + this.uTsize.hashCode()
        result = 31 * result + this.uDsize.hashCode()
        result = 31 * result + this.uSsize.hashCode()
        result = 31 * result + this.startCode.hashCode()
        result = 31 * result + this.startStack.hashCode()
        result = 31 * result + this.signal.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.uAr0.hashCode()
        result = 31 * result + this.uFpstate.hashCode()
        result = 31 * result + this.magic.hashCode()
        result = 31 * result + this.uComm.contentHashCode()
        result = 31 * result + this.uDebugreg.contentHashCode()
        return result
    }
}

// GitHub repo: ifduyue/musl/
// commit: b4b1e10364c8737a632be61582e05a8d3acf5690
// file: arch/x8664/bits/signal.h#L80-L84
public data class McontextT(
    public var gregs: LongArray = LongArray(23),
    public var private: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }
}

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

public data class UserFpregsStruct(
    public var cwd: CUshort = 0u,
    public var swd: CUshort = 0u,
    public var ftw: CUshort = 0u,
    public var fop: CUshort = 0u,
    public var rip: CUlong = 0uL,
    public var rdp: CUlong = 0uL,
    public var mxcsr: CUint = 0u,
    public var mxcrMask: CUint = 0u,
    public var stSpace: UIntArray = UIntArray(32),
    public var xmmSpace: UIntArray = UIntArray(64),
    public var padding: UIntArray = UIntArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpregsStruct) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.ftw != other.ftw) return false
        if (this.fop != other.fop) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcrMask != other.mxcrMask) return false
        if (!this.stSpace.contentEquals(other.stSpace)) return false
        if (!this.xmmSpace.contentEquals(other.xmmSpace)) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.ftw.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcrMask.hashCode()
        result = 31 * result + this.stSpace.contentHashCode()
        result = 31 * result + this.xmmSpace.contentHashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucSigmask: SigsetT = SigsetT(),
    public var private: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.private.contentHashCode()
        return result
    }
}

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
