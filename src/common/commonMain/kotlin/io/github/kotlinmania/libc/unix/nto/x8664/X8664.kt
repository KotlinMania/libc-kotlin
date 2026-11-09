// port-lint: source unix/nto/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.nto.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT

public typealias WcharT = UInt

public typealias TimeT = Long

public class X8664CpuRegisters(
    public var rdi: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var cs: UInt = 0u,
    public var rsvd1: UInt = 0u,
    public var rflags: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var ss: UInt = 0u,
    public var rsvd2: UInt = 0u,
)

public data class McontextT(public var cpu: X8664CpuRegisters = X8664CpuRegisters(), public var fpu: X8664FpuRegisters = X8664FpuRegisters())

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class FsaveArea64(
    public var fpuControlWord: UInt = 0u,
    public var fpuStatusWord: UInt = 0u,
    public var fpuTagWord: UInt = 0u,
    public var fpuIp: UInt = 0u,
    public var fpuCs: UInt = 0u,
    public var fpuOp: UInt = 0u,
    public var fpuDs: UInt = 0u,
    public var stRegs: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsaveArea64) return false
        if (this.fpuControlWord != other.fpuControlWord) return false
        if (this.fpuStatusWord != other.fpuStatusWord) return false
        if (this.fpuTagWord != other.fpuTagWord) return false
        if (this.fpuIp != other.fpuIp) return false
        if (this.fpuCs != other.fpuCs) return false
        if (this.fpuOp != other.fpuOp) return false
        if (this.fpuDs != other.fpuDs) return false
        if (!this.stRegs.contentEquals(other.stRegs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fpuControlWord.hashCode()
        result = 31 * result + this.fpuStatusWord.hashCode()
        result = 31 * result + this.fpuTagWord.hashCode()
        result = 31 * result + this.fpuIp.hashCode()
        result = 31 * result + this.fpuCs.hashCode()
        result = 31 * result + this.fpuOp.hashCode()
        result = 31 * result + this.fpuDs.hashCode()
        result = 31 * result + this.stRegs.contentHashCode()
        return result
    }
}

public data class FxsaveArea64(
    public var fpuControlWord: UShort = 0u,
    public var fpuStatusWord: UShort = 0u,
    public var fpuTagWord: UShort = 0u,
    public var fpuOperand: UShort = 0u,
    public var fpuRip: ULong = 0uL,
    public var fpuRdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcsrMask: UInt = 0u,
    public var stRegs: UByteArray = UByteArray(128),
    public var xmmRegs: UByteArray = UByteArray(128),
    public var reserved2: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FxsaveArea64) return false
        if (this.fpuControlWord != other.fpuControlWord) return false
        if (this.fpuStatusWord != other.fpuStatusWord) return false
        if (this.fpuTagWord != other.fpuTagWord) return false
        if (this.fpuOperand != other.fpuOperand) return false
        if (this.fpuRip != other.fpuRip) return false
        if (this.fpuRdp != other.fpuRdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcsrMask != other.mxcsrMask) return false
        if (!this.stRegs.contentEquals(other.stRegs)) return false
        if (!this.xmmRegs.contentEquals(other.xmmRegs)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fpuControlWord.hashCode()
        result = 31 * result + this.fpuStatusWord.hashCode()
        result = 31 * result + this.fpuTagWord.hashCode()
        result = 31 * result + this.fpuOperand.hashCode()
        result = 31 * result + this.fpuRip.hashCode()
        result = 31 * result + this.fpuRdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcsrMask.hashCode()
        result = 31 * result + this.stRegs.contentHashCode()
        result = 31 * result + this.xmmRegs.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class FpuExtentionSavearea64(
    public var other: UByteArray = UByteArray(512),
    public var xstateBv: ULong = 0uL,
    public var xstateUndef: ULongArray = ULongArray(7),
    public var xstateInfo: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FpuExtentionSavearea64) return false
        if (!this.other.contentEquals(other.other)) return false
        if (this.xstateBv != other.xstateBv) return false
        if (!this.xstateUndef.contentEquals(other.xstateUndef)) return false
        if (!this.xstateInfo.contentEquals(other.xstateInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.other.contentHashCode()
        result = 31 * result + this.xstateBv.hashCode()
        result = 31 * result + this.xstateUndef.contentHashCode()
        result = 31 * result + this.xstateInfo.contentHashCode()
        return result
    }
}

public data class X8664FpuRegisters(
    public var fsaveArea: FsaveArea64 = FsaveArea64(),
    public var fxsaveArea: FxsaveArea64 = FxsaveArea64(),
    public var xsaveArea: FpuExtentionSavearea64 = FpuExtentionSavearea64(),
    public var data: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is X8664FpuRegisters) return false
        if (this.fsaveArea != other.fsaveArea) return false
        if (this.fxsaveArea != other.fxsaveArea) return false
        if (this.xsaveArea != other.xsaveArea) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fsaveArea.hashCode()
        result = 31 * result + this.fxsaveArea.hashCode()
        result = 31 * result + this.xsaveArea.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public fun eq(other: X8664FpuRegisters): Boolean {
        return this.fsaveArea == other.fsaveArea || this.fxsaveArea == other.fxsaveArea || this.xsaveArea == other.xsaveArea
    }
}
