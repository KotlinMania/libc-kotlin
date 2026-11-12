@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.SaFamilyT
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_HOSTSIZE
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_LINESIZE
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.UT_NAMESIZE
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64.U64
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

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
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
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

public data class FsidT(
    public var value: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsidT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsidT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FsidT =
                    FsidT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                        ).readNative(addr).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: FsidT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (2).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((17L + ((NCCS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override fun readNative(addr: Long): Termios =
                    Termios(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                        ).readNative(addr + 17L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Termios) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.cLine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                    ).writeNative(addr + 17L, value.cCc.toList())
                }
            }
    }
}

public data class Termios2(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(19),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios2) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
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
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Termios2 =
                    Termios2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (19).toInt())
                        ).readNative(addr + 17L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Termios2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.cLine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (19).toInt())
                    ).writeNative(addr + 17L, value.cCc.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cIspeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cOspeed)
                }
            }
    }
}

public data class Mallinfo(
    public var arena: SizeT = 0uL,
    public var ordblks: SizeT = 0uL,
    public var smblks: SizeT = 0uL,
    public var hblks: SizeT = 0uL,
    public var hblkhd: SizeT = 0uL,
    public var usmblks: SizeT = 0uL,
    public var fsmblks: SizeT = 0uL,
    public var uordblks: SizeT = 0uL,
    public var fordblks: SizeT = 0uL,
    public var keepcost: SizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Mallinfo =
                    Mallinfo(
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
                    )
                override fun writeNative(addr: Long, value: Mallinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.arena)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.smblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.hblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.hblkhd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.usmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fsmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.uordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.keepcost)
                }
            }
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock =
                    Flock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: KernelLoffT = 0L,
    public var lLen: KernelLoffT = 0L,
    public var lPid: KernelPidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock64 =
                    Flock64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class CpuSetT(
    public var bits: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): CpuSetT =
                    CpuSetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CpuSetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr, value.bits.toList())
                }
            }
    }
}

public data class SemT(
    public var count: CUint = 0u,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (this.count != other.count) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SemT =
                    SemT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                        ).readNative(addr + 4L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SemT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                    ).writeNative(addr + 4L, value.reserved.toList())
                }
            }
    }
}

public data class ExitStatus(
    public var eTermination: CShort = 0,
    public var eExit: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ExitStatus =
                    ExitStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ExitStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.eTermination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.eExit)
                }
            }
    }
}

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fReserved: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fReserved.contentEquals(other.fReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): Statvfs =
                    Statvfs(
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr + 88L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Statvfs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.fFavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.fNamemax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr + 88L, value.fReserved.toList())
                }
            }
    }
}

public class SignalfdSiginfo(
    public var ssiSigno: UInt = 0u,
    public var ssiErrno: Int = 0,
    public var ssiCode: Int = 0,
    public var ssiPid: UInt = 0u,
    public var ssiUid: UInt = 0u,
    public var ssiFd: Int = 0,
    public var ssiTid: UInt = 0u,
    public var ssiBand: UInt = 0u,
    public var ssiOverrun: UInt = 0u,
    public var ssiTrapno: UInt = 0u,
    public var ssiStatus: Int = 0,
    public var ssiInt: Int = 0,
    public var ssiPtr: CUlonglong = 0uL,
    public var ssiUtime: CUlonglong = 0uL,
    public var ssiStime: CUlonglong = 0uL,
    public var ssiAddr: CUlonglong = 0uL,
    public var ssiAddrLsb: UShort = 0u,
    public var pad2: UShort = 0u,
    public var ssiSyscall: Int = 0,
    public var ssiCallAddr: ULong = 0uL,
    public var ssiArch: UInt = 0u,
    public var pad: UByteArray = UByteArray(28),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalfdSiginfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalfdSiginfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SignalfdSiginfo =
                    SignalfdSiginfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SignalfdSiginfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssiSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ssiErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssiCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ssiPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ssiUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.ssiFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ssiTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ssiBand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ssiOverrun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ssiTrapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.ssiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.ssiInt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ssiPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ssiUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ssiStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ssiAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.ssiAddrLsb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.ssiSyscall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ssiCallAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.ssiArch)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                    ).writeNative(addr + 100L, value.pad.toList())
                }
            }
    }
}

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
)

public data class Genlmsghdr(
    public var cmd: UByte = 0u,
    public var version: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Genlmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Genlmsghdr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Genlmsghdr =
                    Genlmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Genlmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class Nlmsghdr(
    public var nlmsgLen: UInt = 0u,
    public var nlmsgType: UShort = 0u,
    public var nlmsgFlags: UShort = 0u,
    public var nlmsgSeq: UInt = 0u,
    public var nlmsgPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsghdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Nlmsghdr =
                    Nlmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Nlmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nlmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.nlmsgType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.nlmsgFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nlmsgSeq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nlmsgPid)
                }
            }
    }
}

public data class Nlmsgerr(
    public var error: CInt = 0,
    public var msg: Nlmsghdr = Nlmsghdr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsgerr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsgerr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Nlmsgerr =
                    Nlmsgerr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (Nlmsghdr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Nlmsgerr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.error)
                    (Nlmsghdr.typeLayout()).writeNative(addr + 4L, value.msg)
                }
            }
    }
}

public data class NlPktinfo(
    public var group: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPktinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPktinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NlPktinfo =
                    NlPktinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NlPktinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.group)
                }
            }
    }
}

public data class NlMmapReq(
    public var nmBlockSize: CUint = 0u,
    public var nmBlockNr: CUint = 0u,
    public var nmFrameSize: CUint = 0u,
    public var nmFrameNr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapReq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NlMmapReq =
                    NlMmapReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NlMmapReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nmBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nmBlockNr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nmFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nmFrameNr)
                }
            }
    }
}

public data class NlMmapHdr(
    public var nmStatus: CUint = 0u,
    public var nmLen: CUint = 0u,
    public var nmGroup: UInt = 0u,
    public var nmPid: UInt = 0u,
    public var nmUid: UInt = 0u,
    public var nmGid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapHdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NlMmapHdr =
                    NlMmapHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NlMmapHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nmStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nmLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nmGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nmPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nmUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nmGid)
                }
            }
    }
}

public data class Nlattr(
    public var nlaLen: UShort = 0u,
    public var nlaType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlattr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Nlattr =
                    Nlattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Nlattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nlaLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nlaType)
                }
            }
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CInt = 0,
)

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InotifyEvent =
                    InotifyEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: InotifyEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.len)
                }
            }
    }
}

public data class SockExtendedErr(
    public var eeErrno: UInt = 0u,
    public var eeOrigin: UByte = 0u,
    public var eeType: UByte = 0u,
    public var eeCode: UByte = 0u,
    public var eePad: UByte = 0u,
    public var eeInfo: UInt = 0u,
    public var eeData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockExtendedErr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockExtendedErr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockExtendedErr =
                    SockExtendedErr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockExtendedErr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eeErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.eeOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.eeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.eeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.eePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eeInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.eeData)
                }
            }
    }
}

public class RegexT internal constructor(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    reEndpCtorArg: ConstPtr<CChar>,
    reGutsCtorArg: MutPtr<CVoid>,
) {
    public var reEndp: ConstPtr<CChar> = reEndpCtorArg
        internal set

    public var reGuts: MutPtr<CVoid> = reGutsCtorArg
        internal set

    public constructor() : this(
        reMagic = 0,
        reNsub = 0uL,
        reEndpCtorArg = ConstPtr(0L),
        reGutsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.reMagic

    public operator fun component2(): SizeT = this.reNsub

    public operator fun component3(): ConstPtr<CChar> = this.reEndp

    public operator fun component4(): MutPtr<CVoid> = this.reGuts

    public fun copy(reMagic: CInt = this.reMagic, reNsub: SizeT = this.reNsub, reEndp: ConstPtr<CChar> = this.reEndp, reGuts: MutPtr<CVoid> = this.reGuts): RegexT = RegexT(reMagic = reMagic, reNsub = reNsub, reEndpCtorArg = reEndp, reGutsCtorArg = reGuts)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.reMagic != other.reMagic) return false
        if (this.reNsub != other.reNsub) return false
        if (this.reEndp != other.reEndp) return false
        if (this.reGuts != other.reGuts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reMagic.hashCode()
        result = 31 * result + this.reNsub.hashCode()
        result = 31 * result + this.reEndp.hashCode()
        result = 31 * result + this.reGuts.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RegexT =
                    RegexT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RegexT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.reMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reNsub)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.reEndp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reGuts)
                }
            }

        public operator fun invoke(
            reMagic: CInt = 0,
            reNsub: SizeT = 0uL,
            reEndp: ConstPtr<CChar> = ConstPtr(0L),
            reGuts: MutPtr<CVoid> = MutPtr(0L),
        ): RegexT =
            RegexT(
                reMagic = reMagic,
                reNsub = reNsub,
                reEndpCtorArg = reEndp,
                reGutsCtorArg = reGuts,
            )
    }
}

public data class RegmatchT(
    public var rmSo: SsizeT = 0L,
    public var rmEo: SsizeT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RegmatchT =
                    RegmatchT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RegmatchT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.rmSo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rmEo)
                }
            }
    }
}

public data class SockaddrVm(
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: CUint = 0u,
    public var svmCid: CUint = 0u,
    public var svmZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVm) return false
        if (this.svmFamily != other.svmFamily) return false
        if (this.svmReserved1 != other.svmReserved1) return false
        if (this.svmPort != other.svmPort) return false
        if (this.svmCid != other.svmCid) return false
        if (!this.svmZero.contentEquals(other.svmZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svmFamily.hashCode()
        result = 31 * result + this.svmReserved1.hashCode()
        result = 31 * result + this.svmPort.hashCode()
        result = 31 * result + this.svmCid.hashCode()
        result = 31 * result + this.svmZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrVm =
                    SockaddrVm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrVm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.svmFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.svmReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.svmPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.svmCid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.svmZero.toList())
                }
            }
    }
}

// linux/elf.h
public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Elf32Phdr =
                    Elf32Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Elf32Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pAlign)
                }
            }
    }
}

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Elf64Phdr =
                    Elf64Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Elf64Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pAlign)
                }
            }
    }
}

// link.h
public class DlPhdrInfo internal constructor(
    public var dlpiAddr: Elf64Addr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<Elf64Phdr>,
    public var dlpiPhnum: Elf64Half,
    // These fields were added in Android R
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: SizeT,
    dlpiTlsDataCtorArg: MutPtr<CVoid>,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<Elf64Phdr> = dlpiPhdrCtorArg
        internal set

    public var dlpiTlsData: MutPtr<CVoid> = dlpiTlsDataCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
        dlpiTlsModid = 0uL,
        dlpiTlsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Elf64Addr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<Elf64Phdr> = this.dlpiPhdr

    public operator fun component4(): Elf64Half = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public operator fun component7(): SizeT = this.dlpiTlsModid

    public operator fun component8(): MutPtr<CVoid> = this.dlpiTlsData

    public fun copy(dlpiAddr: Elf64Addr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<Elf64Phdr> = this.dlpiPhdr, dlpiPhnum: Elf64Half = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs, dlpiTlsModid: SizeT = this.dlpiTlsModid, dlpiTlsData: MutPtr<CVoid> = this.dlpiTlsData): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs, dlpiTlsModid = dlpiTlsModid, dlpiTlsDataCtorArg = dlpiTlsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        if (this.dlpiTlsModid != other.dlpiTlsModid) return false
        if (this.dlpiTlsData != other.dlpiTlsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        result = 31 * result + this.dlpiTlsModid.hashCode()
        result = 31 * result + this.dlpiTlsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DlPhdrInfo =
                    DlPhdrInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Elf64Phdr>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DlPhdrInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dlpiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.dlpiName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Elf64Phdr>(64)
                    ).writeNative(addr + 16L, value.dlpiPhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dlpiPhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.dlpiAdds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dlpiSubs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.dlpiTlsModid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.dlpiTlsData)
                }
            }

        public operator fun invoke(
            dlpiAddr: Elf64Addr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<Elf64Phdr> = ConstPtr(0L),
            dlpiPhnum: Elf64Half = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
            dlpiTlsModid: SizeT = 0uL,
            dlpiTlsData: MutPtr<CVoid> = MutPtr(0L),
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
                dlpiAdds = dlpiAdds,
                dlpiSubs = dlpiSubs,
                dlpiTlsModid = dlpiTlsModid,
                dlpiTlsDataCtorArg = dlpiTlsData,
            )
    }
}

// linux/seccomp.h
public data class SeccompData(
    public var nr: CInt = 0,
    public var arch: U32 = 0u,
    public var instructionPointer: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeccompData) return false
        if (this.nr != other.nr) return false
        if (this.arch != other.arch) return false
        if (this.instructionPointer != other.instructionPointer) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.arch.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): SeccompData =
                    SeccompData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: SeccompData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.nr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.arch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instructionPointer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 16L, value.args.toList())
                }
            }
    }
}

public data class SeccompMetadata(
    public var filterOff: U64 = 0uL,
    public var flags: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeccompMetadata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SeccompMetadata =
                    SeccompMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SeccompMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.filterOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class PtracePeeksiginfoArgs(
    public var off: U64 = 0uL,
    public var flags: U32 = 0u,
    public var nr: S32 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtracePeeksiginfoArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtracePeeksiginfoArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PtracePeeksiginfoArgs =
                    PtracePeeksiginfoArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PtracePeeksiginfoArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.off)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nr)
                }
            }
    }
}

// linux/input.h
public data class InputEvent(
    public var time: Timeval = Timeval(),
    public var type: U16 = 0u,
    public var code: U16 = 0u,
    public var value: S32 = 0,
)

public data class InputId(
    public var bustype: U16 = 0u,
    public var vendor: U16 = 0u,
    public var product: U16 = 0u,
    public var version: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputId> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): InputId =
                    InputId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: InputId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bustype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.vendor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.product)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.version)
                }
            }
    }
}

public data class InputAbsinfo(
    public var value: S32 = 0,
    public var minimum: S32 = 0,
    public var maximum: S32 = 0,
    public var fuzz: S32 = 0,
    public var flat: S32 = 0,
    public var resolution: S32 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): InputAbsinfo =
                    InputAbsinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: InputAbsinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.maximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fuzz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.flat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.resolution)
                }
            }
    }
}

public data class InputKeymapEntry(
    public var flags: U8 = 0u,
    public var len: U8 = 0u,
    public var index: U16 = 0u,
    public var keycode: U32 = 0u,
    public var scancode: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InputKeymapEntry) return false
        if (this.flags != other.flags) return false
        if (this.len != other.len) return false
        if (this.index != other.index) return false
        if (this.keycode != other.keycode) return false
        if (!this.scancode.contentEquals(other.scancode)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keycode.hashCode()
        result = 31 * result + this.scancode.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputKeymapEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputKeymapEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): InputKeymapEntry =
                    InputKeymapEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: InputKeymapEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keycode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.scancode.toList())
                }
            }
    }
}

public data class InputMask(
    public var type: U32 = 0u,
    public var codesSize: U32 = 0u,
    public var codesPtr: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMask> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InputMask =
                    InputMask(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InputMask) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.codesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.codesPtr)
                }
            }
    }
}

public data class FfReplay(
    public var length: U16 = 0u,
    public var delay: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfReplay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfReplay> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfReplay =
                    FfReplay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfReplay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.delay)
                }
            }
    }
}

public data class FfTrigger(
    public var button: U16 = 0u,
    public var interval: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfTrigger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfTrigger> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfTrigger =
                    FfTrigger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfTrigger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.button)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.interval)
                }
            }
    }
}

public data class FfEnvelope(
    public var attackLength: U16 = 0u,
    public var attackLevel: U16 = 0u,
    public var fadeLength: U16 = 0u,
    public var fadeLevel: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEnvelope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEnvelope> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FfEnvelope =
                    FfEnvelope(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: FfEnvelope) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.attackLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.attackLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.fadeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fadeLevel)
                }
            }
    }
}

public data class FfConstantEffect(
    public var level: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConstantEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConstantEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): FfConstantEffect =
                    FfConstantEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (FfEnvelope.typeLayout()).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfConstantEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.level)
                    (FfEnvelope.typeLayout()).writeNative(addr + 2L, value.envelope)
                }
            }
    }
}

public data class FfRampEffect(
    public var startLevel: S16 = 0,
    public var endLevel: S16 = 0,
    public var envelope: FfEnvelope = FfEnvelope(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRampEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRampEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FfRampEffect =
                    FfRampEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (FfEnvelope.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FfRampEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.startLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.endLevel)
                    (FfEnvelope.typeLayout()).writeNative(addr + 4L, value.envelope)
                }
            }
    }
}

public data class FfConditionEffect(
    public var rightSaturation: U16 = 0u,
    public var leftSaturation: U16 = 0u,
    public var rightCoeff: S16 = 0,
    public var leftCoeff: S16 = 0,
    public var deadband: U16 = 0u,
    public var center: S16 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConditionEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfConditionEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): FfConditionEffect =
                    FfConditionEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: FfConditionEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rightSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.leftSaturation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.rightCoeff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.leftCoeff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.deadband)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.center)
                }
            }
    }
}

public class FfPeriodicEffect internal constructor(
    public var waveform: U16,
    public var period: U16,
    public var magnitude: S16,
    public var offset: S16,
    public var phase: U16,
    public var envelope: FfEnvelope,
    public var customLen: U32,
    customDataCtorArg: MutPtr<S16>,
) {
    public var customData: MutPtr<S16> = customDataCtorArg
        internal set

    public constructor() : this(
        waveform = 0u,
        period = 0u,
        magnitude = 0,
        offset = 0,
        phase = 0u,
        envelope = FfEnvelope(),
        customLen = 0u,
        customDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): U16 = this.waveform

    public operator fun component2(): U16 = this.period

    public operator fun component3(): S16 = this.magnitude

    public operator fun component4(): S16 = this.offset

    public operator fun component5(): U16 = this.phase

    public operator fun component6(): FfEnvelope = this.envelope

    public operator fun component7(): U32 = this.customLen

    public operator fun component8(): MutPtr<S16> = this.customData

    public fun copy(waveform: U16 = this.waveform, period: U16 = this.period, magnitude: S16 = this.magnitude, offset: S16 = this.offset, phase: U16 = this.phase, envelope: FfEnvelope = this.envelope, customLen: U32 = this.customLen, customData: MutPtr<S16> = this.customData): FfPeriodicEffect = FfPeriodicEffect(waveform = waveform, period = period, magnitude = magnitude, offset = offset, phase = phase, envelope = envelope, customLen = customLen, customDataCtorArg = customData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfPeriodicEffect) return false
        if (this.waveform != other.waveform) return false
        if (this.period != other.period) return false
        if (this.magnitude != other.magnitude) return false
        if (this.offset != other.offset) return false
        if (this.phase != other.phase) return false
        if (this.envelope != other.envelope) return false
        if (this.customLen != other.customLen) return false
        if (this.customData != other.customData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.waveform.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.magnitude.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.phase.hashCode()
        result = 31 * result + this.envelope.hashCode()
        result = 31 * result + this.customLen.hashCode()
        result = 31 * result + this.customData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfPeriodicEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfPeriodicEffect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FfPeriodicEffect =
                    FfPeriodicEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (FfEnvelope.typeLayout()).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<S16>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FfPeriodicEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.waveform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.period)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.magnitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.phase)
                    (FfEnvelope.typeLayout()).writeNative(addr + 10L, value.envelope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.customLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<S16>(64)
                    ).writeNative(addr + 24L, value.customData)
                }
            }

        public operator fun invoke(
            waveform: U16 = 0u,
            period: U16 = 0u,
            magnitude: S16 = 0,
            offset: S16 = 0,
            phase: U16 = 0u,
            envelope: FfEnvelope = FfEnvelope(),
            customLen: U32 = 0u,
            customData: MutPtr<S16> = MutPtr(0L),
        ): FfPeriodicEffect =
            FfPeriodicEffect(
                waveform = waveform,
                period = period,
                magnitude = magnitude,
                offset = offset,
                phase = phase,
                envelope = envelope,
                customLen = customLen,
                customDataCtorArg = customData,
            )
    }
}

public data class FfRumbleEffect(
    public var strongMagnitude: U16 = 0u,
    public var weakMagnitude: U16 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRumbleEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfRumbleEffect> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FfRumbleEffect =
                    FfRumbleEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FfRumbleEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.strongMagnitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.weakMagnitude)
                }
            }
    }
}

public data class FfEffect(
    public var type: U16 = 0u,
    public var id: S16 = 0,
    public var direction: U16 = 0u,
    public var trigger: FfTrigger = FfTrigger(),
    public var replay: FfReplay = FfReplay(),
    // Note(1.0): this is actually a union
    public var u: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FfEffect) return false
        if (this.type != other.type) return false
        if (this.id != other.id) return false
        if (this.direction != other.direction) return false
        if (this.trigger != other.trigger) return false
        if (this.replay != other.replay) return false
        if (!this.u.contentEquals(other.u)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.trigger.hashCode()
        result = 31 * result + this.replay.hashCode()
        result = 31 * result + this.u.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FfEffect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): FfEffect =
                    FfEffect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (FfTrigger.typeLayout()).readNative(addr + 6L),
                        (FfReplay.typeLayout()).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: FfEffect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.direction)
                    (FfTrigger.typeLayout()).writeNative(addr + 6L, value.trigger)
                    (FfReplay.typeLayout()).writeNative(addr + 10L, value.replay)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 16L, value.u.toList())
                }
            }
    }
}

// linux/uinput.h
public data class UinputFfUpload(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effect: FfEffect = FfEffect(),
    public var old: FfEffect = FfEffect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfUpload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfUpload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): UinputFfUpload =
                    UinputFfUpload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (FfEffect.typeLayout()).readNative(addr + 8L),
                        (FfEffect.typeLayout()).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: UinputFfUpload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.retval)
                    (FfEffect.typeLayout()).writeNative(addr + 8L, value.effect)
                    (FfEffect.typeLayout()).writeNative(addr + 56L, value.old)
                }
            }
    }
}

public data class UinputFfErase(
    public var requestId: U32 = 0u,
    public var retval: S32 = 0,
    public var effectId: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfErase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputFfErase> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UinputFfErase =
                    UinputFfErase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UinputFfErase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.retval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.effectId)
                }
            }
    }
}

public data class UinputAbsSetup(
    public var code: U16 = 0u,
    public var absinfo: InputAbsinfo = InputAbsinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputAbsSetup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputAbsSetup> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): UinputAbsSetup =
                    UinputAbsSetup(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (InputAbsinfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UinputAbsSetup) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.code)
                    (InputAbsinfo.typeLayout()).writeNative(addr + 4L, value.absinfo)
                }
            }
    }
}

public class Option internal constructor(
    nameCtorArg: ConstPtr<CChar>,
    public var hasArg: CInt,
    flagCtorArg: MutPtr<CInt>,
    public var value: CInt,
) {
    public var name: ConstPtr<CChar> = nameCtorArg
        internal set

    public var flag: MutPtr<CInt> = flagCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        hasArg = 0,
        flagCtorArg = MutPtr(0L),
        value = 0,
    )

    public operator fun component1(): ConstPtr<CChar> = this.name

    public operator fun component2(): CInt = this.hasArg

    public operator fun component3(): MutPtr<CInt> = this.flag

    public operator fun component4(): CInt = this.value

    public fun copy(name: ConstPtr<CChar> = this.name, hasArg: CInt = this.hasArg, flag: MutPtr<CInt> = this.flag, value: CInt = this.value): Option = Option(nameCtorArg = name, hasArg = hasArg, flagCtorArg = flag, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Option) return false
        if (this.name != other.name) return false
        if (this.hasArg != other.hasArg) return false
        if (this.flag != other.flag) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.hasArg.hashCode()
        result = 31 * result + this.flag.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Option =
                    Option(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CInt>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Option) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hasArg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CInt>(64)
                    ).writeNative(addr + 16L, value.flag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.value)
                }
            }

        public operator fun invoke(
            name: ConstPtr<CChar> = ConstPtr(0L),
            hasArg: CInt = 0,
            flag: MutPtr<CInt> = MutPtr(0L),
            value: CInt = 0,
        ): Option =
            Option(
                nameCtorArg = name,
                hasArg = hasArg,
                flagCtorArg = flag,
                value = value,
            )
    }
}

public data class CAnonymousIfruMap(
    public var memStart: CUlong = 0uL,
    public var memEnd: CUlong = 0uL,
    public var baseAddr: CUshort = 0u,
    public var irq: CUchar = 0u,
    public var dma: CUchar = 0u,
    public var port: CUchar = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfruMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfruMap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CAnonymousIfruMap =
                    CAnonymousIfruMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousIfruMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.memStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.memEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.baseAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.irq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.dma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.port)
                }
            }
    }
}

public data class In6Ifreq(
    public var ifr6Addr: In6Addr = In6Addr(),
    public var ifr6Prefixlen: UInt = 0u,
    public var ifr6Ifindex: CInt = 0,
)

public data class SockaddrNl(
    public var nlFamily: SaFamilyT = 0u,
    public var nlPad: CUshort = 0u,
    public var nlPid: UInt = 0u,
    public var nlGroups: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SockaddrNl =
                    SockaddrNl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SockaddrNl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nlPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nlPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nlGroups)
                }
            }
    }
}

public data class Dirent(
    public var dIno: ULong = 0uL,
    public var dOff: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 19L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 19L, value.dName.toList())
                }
            }
    }
}

public data class Dirent64(
    public var dIno: ULong = 0uL,
    public var dOff: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent64) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent64 =
                    Dirent64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 19L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 19L, value.dName.toList())
                }
            }
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public fun siAddr(): MutPtr<CVoid> {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                .mutPtrLayout<CVoid>(64)
                .readNative(scratch + 16L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siValue(): Sigval {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out = Sigval.typeLayout().readNative(scratch + 24L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun sifields(): Sifields {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            Sifields(
                alignPointerCtorArg =
                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                        .mutPtrLayout<CVoid>(64)
                        .readNative(scratch + 16L),
                sigchld = SifieldsSigchld.typeLayout().readNative(scratch + 16L),
            )
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siPid(): PidT = this.sifields().sigchld.siPid

    public fun siUid(): UidT = this.sifields().sigchld.siUid

    public fun siStatus(): CInt = this.sifields().sigchld.siStatus

    public fun siUtime(): CLong = this.sifields().sigchld.siUtime

    public fun siStime(): CLong = this.sifields().sigchld.siStime

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                        ).readNative(addr + 12L).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                        ).readNative(addr + 128L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                    ).writeNative(addr + 12L, value.pad.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                    ).writeNative(addr + 128L, value.align.toList())
                }
            }
    }
}

public data class Lastlog(
    public var llTime: TimeT = 0L,
    public var llLine: UByteArray = UByteArray(UT_LINESIZE),
    public var llHost: UByteArray = UByteArray(UT_HOSTSIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlog) return false
        if (this.llTime != other.llTime) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTime.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastlog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastlog> {
                override val alignBytes: Long = 8L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((UT_LINESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((UT_HOSTSIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): Lastlog =
                    Lastlog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Lastlog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.llTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE).toInt())
                    ).writeNative(addr + 8L, value.llLine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE).toInt())
                    ).writeNative(addr + off2, value.llHost.toList())
                }
            }
    }
}

public data class Utmp(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: CLong = 0L,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: IntArray = IntArray(4),
    public var unused: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utExit != other.utExit) return false
        if (this.utSession != other.utSession) return false
        if (this.utTv != other.utTv) return false
        if (!this.utAddrV6.contentEquals(other.utAddrV6)) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utAddrV6.contentHashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }
}

public data class SockaddrAlg(
    public var salgFamily: SaFamilyT = 0u,
    public var salgType: UByteArray = UByteArray(14),
    public var salgFeat: UInt = 0u,
    public var salgMask: UInt = 0u,
    public var salgName: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrAlg) return false
        if (this.salgFamily != other.salgFamily) return false
        if (!this.salgType.contentEquals(other.salgType)) return false
        if (this.salgFeat != other.salgFeat) return false
        if (this.salgMask != other.salgMask) return false
        if (!this.salgName.contentEquals(other.salgName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.salgFamily.hashCode()
        result = 31 * result + this.salgType.contentHashCode()
        result = 31 * result + this.salgFeat.hashCode()
        result = 31 * result + this.salgMask.hashCode()
        result = 31 * result + this.salgName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAlg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAlg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): SockaddrAlg =
                    SockaddrAlg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrAlg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.salgFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.salgType.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.salgFeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.salgMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 24L, value.salgName.toList())
                }
            }
    }
}

public data class UinputSetup(
    public var id: InputId = InputId(),
    public var name: UByteArray = UByteArray(UINPUT_MAX_NAME_SIZE),
    public var ffEffectsMax: U32 = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputSetup) return false
        if (this.id != other.id) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputSetup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputSetup> {
                override val alignBytes: Long = 4L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((UINPUT_MAX_NAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 4L), 4L)
                override fun readNative(addr: Long): UinputSetup =
                    UinputSetup(
                        (InputId.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off2),
                    )
                override fun writeNative(addr: Long, value: UinputSetup) {
                    (InputId.typeLayout()).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                    ).writeNative(addr + 8L, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off2, value.ffEffectsMax)
                }
            }
    }
}

public data class UinputUserDev(
    public var name: UByteArray = UByteArray(UINPUT_MAX_NAME_SIZE),
    public var id: InputId = InputId(),
    public var ffEffectsMax: U32 = 0u,
    public var absmax: IntArray = IntArray(ABS_CNT),
    public var absmin: IntArray = IntArray(ABS_CNT),
    public var absfuzz: IntArray = IntArray(ABS_CNT),
    public var absflat: IntArray = IntArray(ABS_CNT),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UinputUserDev) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.id != other.id) return false
        if (this.ffEffectsMax != other.ffEffectsMax) return false
        if (!this.absmax.contentEquals(other.absmax)) return false
        if (!this.absmin.contentEquals(other.absmin)) return false
        if (!this.absfuzz.contentEquals(other.absfuzz)) return false
        if (!this.absflat.contentEquals(other.absflat)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.ffEffectsMax.hashCode()
        result = 31 * result + this.absmax.contentHashCode()
        result = 31 * result + this.absmin.contentHashCode()
        result = 31 * result + this.absfuzz.contentHashCode()
        result = 31 * result + this.absflat.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputUserDev> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UinputUserDev> {
                override val alignBytes: Long = 4L
                private val off1: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((UINPUT_MAX_NAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 2L)
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off1 + 8L), 4L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 4L), 4L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                private val off5: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off5 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + ((ABS_CNT).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 4L)
                override fun readNative(addr: Long): UinputUserDev =
                    UinputUserDev(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                        ).readNative(addr).toUByteArray(),
                        (InputId.typeLayout()).readNative(addr + off1),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off2),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off3).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off4).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off5).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                        ).readNative(addr + off6).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: UinputUserDev) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UINPUT_MAX_NAME_SIZE).toInt())
                    ).writeNative(addr, value.name.toList())
                    (InputId.typeLayout()).writeNative(addr + off1, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off2, value.ffEffectsMax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off3, value.absmax.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off4, value.absmin.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off5, value.absfuzz.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (ABS_CNT).toInt())
                    ).writeNative(addr + off6, value.absflat.toList())
                }
            }
    }
}

public data class PropInfo(
    public var name: UByteArray = UByteArray(32),
    public var serial: CUint = 0u,
    public var value: UByteArray = UByteArray(92),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropInfo) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.serial != other.serial) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.serial.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): PropInfo =
                    PropInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (92).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PropInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.serial)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (92).toInt())
                    ).writeNative(addr + 36L, value.value.toList())
                }
            }
    }
}

/**
 * WARNING: The `PartialEq`, `Eq` and `Hash` implementations of this
 * type are unsound and will be removed in the future.
 */
public data class AfAlgIv(
    public var ivlen: UInt = 0u,
    public var iv: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AfAlgIv) return false
        if (this.ivlen != other.ivlen) return false
        if (!this.iv.contentEquals(other.iv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ivlen.hashCode()
        result = 31 * result + this.iv.contentHashCode()
        return result
    }

    public fun asSlice(): List<UByte> = this.iv.take(this.ivlen.toInt())

    public fun eq(other: AfAlgIv): Boolean = this.asSlice() == other.asSlice()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AfAlgIv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AfAlgIv> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AfAlgIv =
                    AfAlgIv(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AfAlgIv) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ivlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 4L, value.iv.toList())
                }
            }
    }
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruNetmask: Sockaddr,
    public var ifruHwaddr: Sockaddr,
    public var ifruFlags: CShort,
    public var ifruIfindex: CInt,
    public var ifruMetric: CInt,
    public var ifruMtu: CInt,
    public var ifruMap: CAnonymousIfruMap,
    public var ifruSlave: UByteArray,
    public var ifruNewname: UByteArray,
    ifruDataCtorArg: MutPtr<CChar>,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruNetmask = Sockaddr(),
        ifruHwaddr = Sockaddr(),
        ifruFlags = 0,
        ifruIfindex = 0,
        ifruMetric = 0,
        ifruMtu = 0,
        ifruMap = CAnonymousIfruMap(),
        ifruSlave = UByteArray(IFNAMSIZ.toInt()),
        ifruNewname = UByteArray(IFNAMSIZ.toInt()),
        ifruDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): Sockaddr = this.ifruNetmask

    public operator fun component5(): Sockaddr = this.ifruHwaddr

    public operator fun component6(): CShort = this.ifruFlags

    public operator fun component7(): CInt = this.ifruIfindex

    public operator fun component8(): CInt = this.ifruMetric

    public operator fun component9(): CInt = this.ifruMtu

    public operator fun component10(): CAnonymousIfruMap = this.ifruMap

    public operator fun component11(): UByteArray = this.ifruSlave

    public operator fun component12(): UByteArray = this.ifruNewname

    public operator fun component13(): MutPtr<CChar> = this.ifruData

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruNetmask: Sockaddr = this.ifruNetmask, ifruHwaddr: Sockaddr = this.ifruHwaddr, ifruFlags: CShort = this.ifruFlags, ifruIfindex: CInt = this.ifruIfindex, ifruMetric: CInt = this.ifruMetric, ifruMtu: CInt = this.ifruMtu, ifruMap: CAnonymousIfruMap = this.ifruMap, ifruSlave: UByteArray = this.ifruSlave, ifruNewname: UByteArray = this.ifruNewname, ifruData: MutPtr<CChar> = this.ifruData): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruNetmask = ifruNetmask, ifruHwaddr = ifruHwaddr, ifruFlags = ifruFlags, ifruIfindex = ifruIfindex, ifruMetric = ifruMetric, ifruMtu = ifruMtu, ifruMap = ifruMap, ifruSlave = ifruSlave, ifruNewname = ifruNewname, ifruDataCtorArg = ifruData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruNetmask != other.ifruNetmask) return false
        if (this.ifruHwaddr != other.ifruHwaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruIfindex != other.ifruIfindex) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruMap != other.ifruMap) return false
        if (!this.ifruSlave.contentEquals(other.ifruSlave)) return false
        if (!this.ifruNewname.contentEquals(other.ifruNewname)) return false
        if (this.ifruData != other.ifruData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruNetmask.hashCode()
        result = 31 * result + this.ifruHwaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruIfindex.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruMap.hashCode()
        result = 31 * result + this.ifruSlave.contentHashCode()
        result = 31 * result + this.ifruNewname.contentHashCode()
        result = 31 * result + this.ifruData.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruNetmask: Sockaddr = Sockaddr(),
            ifruHwaddr: Sockaddr = Sockaddr(),
            ifruFlags: CShort = 0,
            ifruIfindex: CInt = 0,
            ifruMetric: CInt = 0,
            ifruMtu: CInt = 0,
            ifruMap: CAnonymousIfruMap = CAnonymousIfruMap(),
            ifruSlave: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifruNewname: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifruData: MutPtr<CChar> = MutPtr(0L),
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruNetmask = ifruNetmask,
                ifruHwaddr = ifruHwaddr,
                ifruFlags = ifruFlags,
                ifruIfindex = ifruIfindex,
                ifruMetric = ifruMetric,
                ifruMtu = ifruMtu,
                ifruMap = ifruMap,
                ifruSlave = ifruSlave,
                ifruNewname = ifruNewname,
                ifruDataCtorArg = ifruData,
            )
    }
}

public data class Ifreq(
    /**
     * interface name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: MutPtr<CChar>,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: MutPtr<CChar> = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: MutPtr<CChar> = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfcIfcu) return false
        if (this.ifcuBuf != other.ifcuBuf) return false
        if (this.ifcuReq != other.ifcuReq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifcuBuf.hashCode()
        result = 31 * result + this.ifcuReq.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            ifcuBuf: MutPtr<CChar> = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}

// Structure used in SIOCGIFCONF request.  Used to retrieve interface
// configuration for machine (useful for programs which must know all
// networks accessible).
public data class Ifconf(
    public var ifcLen: CInt = 0,
    // Size of buffer.
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public data class SifieldsSigchld(
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siUtime: CLong = 0L,
    public var siStime: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SifieldsSigchld> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SifieldsSigchld> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SifieldsSigchld =
                    SifieldsSigchld(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SifieldsSigchld) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.siUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.siUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.siStime)
                }
            }
    }
}

public class Sifields internal constructor(
    alignPointerCtorArg: MutPtr<CVoid>,
    public var sigchld: SifieldsSigchld,
) {
    public var alignPointer: MutPtr<CVoid> = alignPointerCtorArg
        internal set

    public constructor() : this(
        alignPointerCtorArg = MutPtr(0L),
        sigchld = SifieldsSigchld(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.alignPointer

    public operator fun component2(): SifieldsSigchld = this.sigchld

    public fun copy(alignPointer: MutPtr<CVoid> = this.alignPointer, sigchld: SifieldsSigchld = this.sigchld): Sifields = Sifields(alignPointerCtorArg = alignPointer, sigchld = sigchld)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sifields) return false
        if (this.alignPointer != other.alignPointer) return false
        if (this.sigchld != other.sigchld) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alignPointer.hashCode()
        result = 31 * result + this.sigchld.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sifields").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            alignPointer: MutPtr<CVoid> = MutPtr(0L),
            sigchld: SifieldsSigchld = SifieldsSigchld(),
        ): Sifields =
            Sifields(
                alignPointerCtorArg = alignPointer,
                sigchld = sigchld,
            )
    }
}

public data class SiginfoF(
    public var siginfoBase: IntArray = IntArray(3),
    public var sifields: Sifields = Sifields(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoF) return false
        if (!this.siginfoBase.contentEquals(other.siginfoBase)) return false
        if (this.sifields != other.sifields) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siginfoBase.contentHashCode()
        result = 31 * result + this.sifields.hashCode()
        return result
    }
}
