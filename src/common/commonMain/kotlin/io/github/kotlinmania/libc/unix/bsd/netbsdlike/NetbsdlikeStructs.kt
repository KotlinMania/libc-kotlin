@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.NCCS
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class SchedParam(
    public var schedPriority: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                }
            }
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
)

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
            ssSize: SizeT = 0uL,
            ssFlags: CInt = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssSize = ssSize,
                ssFlags = ssFlags,
            )
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CUint = 0u,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: CInt = 0,
    public var cOspeed: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Flock(
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
)

public class PtraceIoDesc internal constructor(
    public var piodOp: CInt,
    piodOffsCtorArg: MutPtr<CVoid>,
    piodAddrCtorArg: MutPtr<CVoid>,
    public var piodLen: SizeT,
) {
    public var piodOffs: MutPtr<CVoid> = piodOffsCtorArg
        internal set

    public var piodAddr: MutPtr<CVoid> = piodAddrCtorArg
        internal set

    public constructor() : this(
        piodOp = 0,
        piodOffsCtorArg = MutPtr(0L),
        piodAddrCtorArg = MutPtr(0L),
        piodLen = 0uL,
    )

    public operator fun component1(): CInt = this.piodOp

    public operator fun component2(): MutPtr<CVoid> = this.piodOffs

    public operator fun component3(): MutPtr<CVoid> = this.piodAddr

    public operator fun component4(): SizeT = this.piodLen

    public fun copy(piodOp: CInt = this.piodOp, piodOffs: MutPtr<CVoid> = this.piodOffs, piodAddr: MutPtr<CVoid> = this.piodAddr, piodLen: SizeT = this.piodLen): PtraceIoDesc = PtraceIoDesc(piodOp = piodOp, piodOffsCtorArg = piodOffs, piodAddrCtorArg = piodAddr, piodLen = piodLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceIoDesc) return false
        if (this.piodOp != other.piodOp) return false
        if (this.piodOffs != other.piodOffs) return false
        if (this.piodAddr != other.piodAddr) return false
        if (this.piodLen != other.piodLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.piodOp.hashCode()
        result = 31 * result + this.piodOffs.hashCode()
        result = 31 * result + this.piodAddr.hashCode()
        result = 31 * result + this.piodLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceIoDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceIoDesc> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PtraceIoDesc =
                    PtraceIoDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PtraceIoDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.piodOp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.piodOffs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.piodAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.piodLen)
                }
            }

        public operator fun invoke(
            piodOp: CInt = 0,
            piodOffs: MutPtr<CVoid> = MutPtr(0L),
            piodAddr: MutPtr<CVoid> = MutPtr(0L),
            piodLen: SizeT = 0uL,
        ): PtraceIoDesc =
            PtraceIoDesc(
                piodOp = piodOp,
                piodOffsCtorArg = piodOffs,
                piodAddrCtorArg = piodAddr,
                piodLen = piodLen,
            )
    }
}

public data class Mmsghdr(
    public var msgHdr: Msghdr = Msghdr(),
    public var msgLen: CUint = 0u,
)
