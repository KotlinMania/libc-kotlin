// port-lint: source new/apple/libpthread/pthread_/sched.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var opaque: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 4L, value.opaque)
                }
            }
    }
}
