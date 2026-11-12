@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
// note this is the struct called stat64 in Windows. Not stat, nor stati64.
public data class Stat(
    public var stDev: DevT = 0u,
    public var stIno: InoT = 0u,
    public var stMode: UShort = 0u,
    public var stNlink: CShort = 0,
    public var stUid: CShort = 0,
    public var stGid: CShort = 0,
    public var stRdev: DevT = 0u,
    public var stSize: Long = 0L,
    public var stAtime: Time64T = 0L,
    public var stMtime: Time64T = 0L,
    public var stCtime: Time64T = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stCtime)
                }
            }
    }
}

// note that this is called utimbuf64 in Windows
public data class Utimbuf(
    public var actime: Time64T = 0L,
    public var modtime: Time64T = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Utimbuf =
                    Utimbuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Utimbuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.actime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.modtime)
                }
            }
    }
}

public data class Tm(
    public var tmSec: CInt = 0,
    public var tmMin: CInt = 0,
    public var tmHour: CInt = 0,
    public var tmMday: CInt = 0,
    public var tmMon: CInt = 0,
    public var tmYear: CInt = 0,
    public var tmWday: CInt = 0,
    public var tmYday: CInt = 0,
    public var tmIsdst: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Tm =
                    Tm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Tm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmMday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmMon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmWday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmYday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmIsdst)
                }
            }
    }
}

public data class Timeval(
    public var tvSec: CLong = 0L,
    public var tvUsec: CLong = 0L,
)

public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
)

public data class Sockaddr(
    public var saFamily: CUshort = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (14).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData)
                }
            }
    }
}
