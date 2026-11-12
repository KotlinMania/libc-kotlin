// port-lint: source new/musl/sched.rs
package io.github.kotlinmania.libc.new.musl.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.TimeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class CAnonSchedParamReserved2(
    public var reserved1: TimeT = 0L,
    public var reserved2: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonSchedParamReserved2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonSchedParamReserved2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonSchedParamReserved2 =
                    CAnonSchedParamReserved2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonSchedParamReserved2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var reserved1: CInt = 0,
    public var reserved2: LongArray = LongArray(4),
    public var reserved3: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.reserved3 != other.reserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.reserved3.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                        ).readNative(addr + 8L).toLongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                    ).writeNative(addr + 8L, value.reserved2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.reserved3)
                }
            }
    }
}
