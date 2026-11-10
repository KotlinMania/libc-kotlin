// port-lint: source unix/nto/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

public typealias WcharT = UInt

public typealias TimeT = Long

public data class Aarch64QregT(
    public var qlo: ULong = 0uL,
    public var qhi: ULong = 0uL,
)

public data class Aarch64FpuRegisters(
    public var reg: List<Aarch64QregT> = List(32) { Aarch64QregT() },
    public var fpsr: UInt = 0u,
    public var fpcr: UInt = 0u,
)

public data class Aarch64CpuRegisters(
    public var gpr: ULongArray = ULongArray(32),
    public var elr: ULong = 0uL,
    public var pstate: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aarch64CpuRegisters) return false
        if (!this.gpr.contentEquals(other.gpr)) return false
        if (this.elr != other.elr) return false
        if (this.pstate != other.pstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpr.contentHashCode()
        result = 31 * result + this.elr.hashCode()
        result = 31 * result + this.pstate.hashCode()
        return result
    }
}

public data class McontextT(
    public var cpu: Aarch64CpuRegisters = Aarch64CpuRegisters(),
    public var fpu: Aarch64FpuRegisters = Aarch64FpuRegisters(),
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)
