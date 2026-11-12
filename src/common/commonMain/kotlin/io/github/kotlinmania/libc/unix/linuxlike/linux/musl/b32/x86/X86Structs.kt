@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
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
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.SigsetT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 208L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (CAnonymousTimespec32.typeLayout()).readNative(addr + 80L),
                        (CAnonymousTimespec32.typeLayout()).readNative(addr + 96L),
                        (CAnonymousTimespec32.typeLayout()).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.stDevPadding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.stInoTruncated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.stRdevPadding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stBlocks)
                    (CAnonymousTimespec32.typeLayout()).writeNative(addr + 80L, value.stAtim32)
                    (CAnonymousTimespec32.typeLayout()).writeNative(addr + 96L, value.stMtim32)
                    (CAnonymousTimespec32.typeLayout()).writeNative(addr + 112L, value.stCtim32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.pad0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.pad2)
                }
            }
    }
}

public data class CAnonymousTimespec32(
    public var tvSec: CLong = 0L,
    public var tvNsec: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousTimespec32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousTimespec32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousTimespec32 =
                    CAnonymousTimespec32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousTimespec32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvNsec)
                }
            }
    }
}

public data class McontextT(
    public var private: UIntArray = UIntArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int = this.private.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (22).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (22).toInt())
                    ).writeNative(addr, value.private.toList())
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    public var ssSp: MutPtr = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssFlags != other.ssFlags) return false
        if (this.ssSize != other.ssSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr = MutPtr(0L),
            ssFlags: CInt = 0,
            ssSize: SizeT = 0uL,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssFlags = ssFlags,
                ssSize = ssSize,
            )
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpcPerm =
                    IpcPerm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpcPerm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ipcPermKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.cuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.cgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.seq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.unused2)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 184L
                override fun readNative(addr: Long): ShmidDs =
                    ShmidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                    )
                override fun writeNative(addr: Long, value: ShmidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.shmPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.shmSegsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.shmAtimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.shmAtimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.shmDtimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.shmDtimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.msgCtimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.msgCtimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.shmAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.shmDtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.unused2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.shmCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.unused3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 140L, value.shmCpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 144L, value.shmLpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.shmNattch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.pad3)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 184L
                override fun readNative(addr: Long): MsqidDs =
                    MsqidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                    )
                override fun writeNative(addr: Long, value: MsqidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.msgPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.msgStimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.msgStimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.msgRtimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.msgRtimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.msgCtimeLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.msgCtimeHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.msgStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.msgRtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.unused2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.msgCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.unused3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.msgCbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.msgQnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.msgQbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 160L, value.msgLspid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 164L, value.msgLrpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.pad2)
                }
            }
    }
}

public data class UserFpxregsStruct(
    public var cwd: CUshort = 0u,
    public var swd: CUshort = 0u,
    public var twd: CUshort = 0u,
    public var fop: CUshort = 0u,
    public var fip: CLong = 0L,
    public var fcs: CLong = 0L,
    public var foo: CLong = 0L,
    public var fos: CLong = 0L,
    public var mxcsr: CLong = 0L,
    public var reserved: CLong = 0L,
    public var stSpace: LongArray = LongArray(32),
    public var xmmSpace: LongArray = LongArray(32),
    public var padding: LongArray = LongArray(56),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpxregsStruct) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.twd != other.twd) return false
        if (this.fop != other.fop) return false
        if (this.fip != other.fip) return false
        if (this.fcs != other.fcs) return false
        if (this.foo != other.foo) return false
        if (this.fos != other.fos) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.reserved != other.reserved) return false
        if (!this.stSpace.contentEquals(other.stSpace)) return false
        if (!this.xmmSpace.contentEquals(other.xmmSpace)) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.twd.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.fip.hashCode()
        result = 31 * result + this.fcs.hashCode()
        result = 31 * result + this.foo.hashCode()
        result = 31 * result + this.fos.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.stSpace.contentHashCode()
        result = 31 * result + this.xmmSpace.contentHashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpxregsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpxregsStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1016L
                override fun readNative(addr: Long): UserFpxregsStruct =
                    UserFpxregsStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                        ).readNative(addr + 56L).toLongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                        ).readNative(addr + 312L).toLongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (56).toInt())
                        ).readNative(addr + 568L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: UserFpxregsStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cwd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.swd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.twd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.foo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.fos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                    ).writeNative(addr + 56L, value.stSpace.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                    ).writeNative(addr + 312L, value.xmmSpace.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (56).toInt())
                    ).writeNative(addr + 568L, value.padding.toList())
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    public var ucSigmask: SigsetT,
    public var private: UByteArray,
) {
    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
        ucSigmask = SigsetT(),
        private = UByteArray(112),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): SigsetT = this.ucSigmask

    public operator fun component6(): UByteArray = this.private

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr = this.ucLink, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucSigmask: SigsetT = this.ucSigmask, private: UByteArray = this.private): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucSigmask = ucSigmask, private = private)

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

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
            ucSigmask: SigsetT = SigsetT(),
            private: UByteArray = UByteArray(112),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucSigmask = ucSigmask,
                private = private,
            )
    }
}

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(3),
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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (3).toInt())
                        ).readNative(addr).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (3).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}
