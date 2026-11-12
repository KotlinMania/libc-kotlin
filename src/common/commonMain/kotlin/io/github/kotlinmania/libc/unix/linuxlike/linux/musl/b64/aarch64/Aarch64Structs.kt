@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.Uint128T
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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad0: CUlong = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var pad1: CInt = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var unused: UIntArray = UIntArray(2),
)

public data class UserRegsStruct(
    public var regs: ULongArray = ULongArray(31),
    public var sp: CUlonglong = 0uL,
    public var pc: CUlonglong = 0uL,
    public var pstate: CUlonglong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserRegsStruct) return false
        if (!this.regs.contentEquals(other.regs)) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.pstate != other.pstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regs.contentHashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.pstate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UserRegsStruct =
                    UserRegsStruct(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (31).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: UserRegsStruct) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (31).toInt())
                    ).writeNative(addr, value.regs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.sp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.pc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.pstate)
                }
            }
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

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucStack: StackT,
    public var ucSigmask: SigsetT,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucSigmask = SigsetT(),
        ucMcontextCtorArg = McontextT(),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr<UcontextT> = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): SigsetT = this.ucSigmask

    public operator fun component5(): McontextT = this.ucMcontext

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr<UcontextT> = this.ucLink, ucStack: StackT = this.ucStack, ucSigmask: SigsetT = this.ucSigmask, ucMcontext: McontextT = this.ucMcontext): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucSigmask = ucSigmask, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucSigmask: SigsetT = SigsetT(),
            ucMcontext: McontextT = McontextT(),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucSigmask = ucSigmask,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}

public data class McontextT(
    public var faultAddress: CUlong = 0uL,
    public var regs: ULongArray = ULongArray(31),
    public var sp: CUlong = 0uL,
    public var pc: CUlong = 0uL,
    public var pstate: CUlong = 0uL,
    public var reserved: ULongArray = ULongArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (this.faultAddress != other.faultAddress) return false
        if (!this.regs.contentEquals(other.regs)) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.pstate != other.pstate) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.faultAddress.hashCode()
        result = 31 * result + this.regs.contentHashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.pstate.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CloneArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CloneArgs> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CloneArgs =
                    CloneArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: CloneArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pidfd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.childTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.parentTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.exitSignal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.stackSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.tls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.setTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.setTidSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.cgroup)
                }
            }
    }
}

public data class UserFpsimdStruct(
    public var vregs: List<Uint128T> = List(32) { U128() },
    public var fpsr: UInt = 0u,
    public var fpcr: UInt = 0u,
)

public data class MaxAlignT(
    public var priv: FloatArray = FloatArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (8).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}
