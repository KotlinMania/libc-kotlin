// port-lint: source new/apple/xnu/mach/arm/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.arm

import io.github.kotlinmania.libc.*

/**
 * Header: `arm/_structs.h`.
 */

public data class DarwinArmExceptionState64(
    val far: ULong,
    val esr: UInt,
    val exception: UInt,
)

public data class DarwinArmThreadState64(
    val x: ULongArray,
    val fp: ULong,
    val lr: ULong,
    val sp: ULong,
    val pc: ULong,
    val cpsr: UInt,
    val pad: UInt,
) {
    init {
        require(x.size == 29) { "__x must be 29 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as DarwinArmThreadState64
        if (!x.contentEquals(other.x)) return false
        if (fp != other.fp) return false
        if (lr != other.lr) return false
        if (sp != other.sp) return false
        if (pc != other.pc) return false
        if (cpsr != other.cpsr) return false
        if (pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = x.contentHashCode()
        result = 31 * result + fp.hashCode()
        result = 31 * result + lr.hashCode()
        result = 31 * result + sp.hashCode()
        result = 31 * result + pc.hashCode()
        result = 31 * result + cpsr.hashCode()
        result = 31 * result + pad.hashCode()
        return result
    }
}

// On aarch64, __v is `[__uint128_t; 32]`; Kotlin has no 128-bit integer, so it
// is represented as 512 raw bytes. On 32-bit arm the whole struct is opaque
// padding (`[c_char; 32*16 + 2*size_of::<u32>()]`).
public data class DarwinArmNeonState64(
    val v: ByteArray,
    val fpsr: UInt,
    val fpcr: UInt,
) {
    init {
        require(v.size == 32 * 16) { "__v must be ${32 * 16} bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as DarwinArmNeonState64
        if (!v.contentEquals(other.v)) return false
        if (fpsr != other.fpsr) return false
        if (fpcr != other.fpcr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = v.contentHashCode()
        result = 31 * result + fpsr.hashCode()
        result = 31 * result + fpcr.hashCode()
        return result
    }
}
