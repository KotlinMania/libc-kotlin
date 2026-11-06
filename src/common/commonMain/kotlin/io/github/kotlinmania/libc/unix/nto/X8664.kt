// port-lint: source unix/nto/x86_64.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

public typealias WcharT = UInt

public typealias TimeT = Long

public open class X8664CpuRegisters(
    public var rdi: ULong,
    public var rsi: ULong,
    public var rdx: ULong,
    public var r10: ULong,
    public var r8: ULong,
    public var r9: ULong,
    public var rax: ULong,
    public var rbx: ULong,
    public var rbp: ULong,
    public var rcx: ULong,
    public var r11: ULong,
    public var r12: ULong,
    public var r13: ULong,
    public var r14: ULong,
    public var r15: ULong,
    public var rip: ULong,
    public var cs: UInt,
    public var rsvd1: UInt,
    public var rflags: ULong,
    public var rsp: ULong,
    public var ss: UInt,
    public var rsvd2: UInt,
)

public open class McontextT(public var cpu: X8664CpuRegisters, public var fpu: X8664FpuRegisters)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class FsaveArea64(
    public var fpuControlWord: UInt,
    public var fpuStatusWord: UInt,
    public var fpuTagWord: UInt,
    public var fpuIp: UInt,
    public var fpuCs: UInt,
    public var fpuOp: UInt,
    public var fpuDs: UInt,
    public var stRegs: List<UByte>,
)

public open class FxsaveArea64(
    public var fpuControlWord: UShort,
    public var fpuStatusWord: UShort,
    public var fpuTagWord: UShort,
    public var fpuOperand: UShort,
    public var fpuRip: ULong,
    public var fpuRdp: ULong,
    public var mxcsr: UInt,
    public var mxcsrMask: UInt,
    public var stRegs: List<UByte>,
    public var xmmRegs: List<UByte>,
    public var reserved2: List<UByte>,
)

public open class FpuExtentionSavearea64(
    public var other: List<UByte>,
    public var xstateBv: ULong,
    public var xstateUndef: List<ULong>,
    public var xstateInfo: List<UByte>,
)

public open class X8664FpuRegisters(
    public var fsaveArea: FsaveArea64? = null,
    public var fxsaveArea: FxsaveArea64? = null,
    public var xsaveArea: FpuExtentionSavearea64? = null,
    public var data: List<UByte>? = null,
) {
    public open fun eq(other: X8664FpuRegisters): Boolean {
        return this.fsaveArea == other.fsaveArea || this.fxsaveArea == other.fxsaveArea || this.xsaveArea == other.xsaveArea
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.fsaveArea).hashCode()
            state = 31 * state + (this.fxsaveArea).hashCode()
            state = 31 * state + (this.xsaveArea).hashCode()
        }
        return state
    }
}
