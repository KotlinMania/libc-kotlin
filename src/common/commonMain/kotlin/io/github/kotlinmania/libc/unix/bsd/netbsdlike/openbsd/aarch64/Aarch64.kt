// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public typealias UcontextT = Sigcontext

public data class Sigcontext(
    public var scUnused: CInt = 0,
    public var scMask: CInt = 0,
    public var scSp: CUlong = 0uL,
    public var scLr: CUlong = 0uL,
    public var scElr: CUlong = 0uL,
    public var scSpsr: CUlong = 0uL,
    public var scX: ULongArray = ULongArray(30),
    public var scCookie: CLong = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigcontext) return false
        if (this.scUnused != other.scUnused) return false
        if (this.scMask != other.scMask) return false
        if (this.scSp != other.scSp) return false
        if (this.scLr != other.scLr) return false
        if (this.scElr != other.scElr) return false
        if (this.scSpsr != other.scSpsr) return false
        if (!this.scX.contentEquals(other.scX)) return false
        if (this.scCookie != other.scCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUnused.hashCode()
        result = 31 * result + this.scMask.hashCode()
        result = 31 * result + this.scSp.hashCode()
        result = 31 * result + this.scLr.hashCode()
        result = 31 * result + this.scElr.hashCode()
        result = 31 * result + this.scSpsr.hashCode()
        result = 31 * result + this.scX.contentHashCode()
        result = 31 * result + this.scCookie.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigcontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigcontext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 288L
                override fun readNative(addr: Long): Sigcontext =
                    Sigcontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (30).toInt())
                        ).readNative(addr + 40L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 280L),
                    )
                override fun writeNative(addr: Long, value: Sigcontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.scUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.scMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.scSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.scLr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.scElr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.scSpsr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (30).toInt())
                    ).writeNative(addr + 40L, value.scX.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 280L, value.scCookie)
                }
            }
    }
}

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
