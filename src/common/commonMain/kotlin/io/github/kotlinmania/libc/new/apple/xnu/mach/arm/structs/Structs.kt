// port-lint: source new/apple/xnu/mach/arm/_structs.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.apple.xnu.mach.arm.structs

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Uint128T

// Header: `arm / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/arm/_structs.h>

public data class DarwinArmExceptionState64(
    public var far: ULong = 0uL,
    public var esr: UInt = 0u,
    public var exception: UInt = 0u,
)

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
}

public data class DarwinArmNeonState64(
    public var v: List<Uint128T> = List(32) { U128() },
    public var fpsr: UInt = 0u,
    public var fpcr: UInt = 0u,
)
