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
)

public data class McontextT(
    val cpu: Aarch64CpuRegisters,
    val fpu: Aarch64FpuRegisters,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)
