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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> {
                override val sizeBytes: Long = 360L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UserRegsStruct =
                    UserRegsStruct(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 272L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 280L),
                    )
                override fun writeNative(addr: Long, value: UserRegsStruct) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.regs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.origA0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.csrEra)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 272L, value.csrBadv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 280L, value.reserved)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpStruct> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UserFpStruct =
                    UserFpStruct(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: UserFpStruct) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.fpr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.fcc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.fcsr)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}
