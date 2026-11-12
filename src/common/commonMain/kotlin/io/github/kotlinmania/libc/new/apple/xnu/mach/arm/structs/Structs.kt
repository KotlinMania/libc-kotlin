// port-lint: source new/apple/xnu/mach/arm/_structs.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.xnu.mach.arm.structs

import io.github.kotlinmania.libc.Uint128T
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Header: `arm / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/arm/_structs.h>

public data class DarwinArmExceptionState64(
    public var far: ULong = 0uL,
    public var esr: UInt = 0u,
    public var exception: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinArmExceptionState64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinArmExceptionState64> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DarwinArmExceptionState64 =
                    DarwinArmExceptionState64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DarwinArmExceptionState64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.far)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.esr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.exception)
                }
            }
    }
}

public data class DarwinArmThreadState64(
    public var x: ULongArray = ULongArray(29),
    public var fp: ULong = 0uL,
    public var lr: ULong = 0uL,
    public var sp: ULong = 0uL,
    public var pc: ULong = 0uL,
    public var cpsr: UInt = 0u,
    public var pad: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinArmThreadState64) return false
        if (!this.x.contentEquals(other.x)) return false
        if (this.fp != other.fp) return false
        if (this.lr != other.lr) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.cpsr != other.cpsr) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.x.contentHashCode()
        result = 31 * result + this.fp.hashCode()
        result = 31 * result + this.lr.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.cpsr.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinArmThreadState64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DarwinArmThreadState64> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DarwinArmThreadState64 =
                    DarwinArmThreadState64(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (29).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                    )
                override fun writeNative(addr: Long, value: DarwinArmThreadState64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (29).toInt())
                    ).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.fp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.lr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.sp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.pc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.cpsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.pad)
                }
            }
    }
}

public data class DarwinArmNeonState64(
    public var v: List<Uint128T> = List(32) { U128() },
    public var fpsr: UInt = 0u,
    public var fpcr: UInt = 0u,
)
