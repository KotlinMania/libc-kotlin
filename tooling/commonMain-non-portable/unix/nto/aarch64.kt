// port-lint: source unix/nto/aarch64.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public typealias WcharT = UInt

public typealias TimeT = Long

public open class Aarch64QregT(public var qlo: ULong, public var qhi: ULong)

public open class Aarch64FpuRegisters(
    public var reg: List<io.github.kotlinmania.libc.Aarch64QregT>,
    public var fpsr: UInt,
    public var fpcr: UInt,
)

public open class Aarch64CpuRegisters(
    public var gpr: List<ULong>,
    public var elr: ULong,
    public var pstate: ULong,
)

public open class McontextT(public var cpu: io.github.kotlinmania.libc.Aarch64CpuRegisters, public var fpu: io.github.kotlinmania.libc.Aarch64FpuRegisters)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)
