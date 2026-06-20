// port-lint: source unix/nto/aarch64.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = UInt

public typealias TimeT = Long

public data class Aarch64QregT(
    val qlo: ULong,
    val qhi: ULong,
)

public data class Aarch64FpuRegisters(
    val reg: List<Aarch64QregT>,
    val fpsr: UInt,
    val fpcr: UInt,
)

public data class Aarch64CpuRegisters(
    val gpr: ULongArray,
    val elr: ULong,
    val pstate: ULong,
) {
    init {
        require(gpr.size == 32) { "gpr must be 32 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Aarch64CpuRegisters
        if (!gpr.contentEquals(other.gpr)) return false
        if (elr != other.elr) return false
        if (pstate != other.pstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = gpr.contentHashCode()
        result = 31 * result + elr.hashCode()
        result = 31 * result + pstate.hashCode()
        return result
    }
}

public data class McontextT(
    val cpu: Aarch64CpuRegisters,
    val fpu: Aarch64FpuRegisters,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)
