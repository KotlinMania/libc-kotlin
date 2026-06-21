// port-lint: source unix/nto/x86_64.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = UInt

public typealias TimeT = Long

// rsvd1 / rsvd2 are layout padding.
public data class X8664CpuRegisters(
    val rdi: ULong,
    val rsi: ULong,
    val rdx: ULong,
    val r10: ULong,
    val r8: ULong,
    val r9: ULong,
    val rax: ULong,
    val rbx: ULong,
    val rbp: ULong,
    val rcx: ULong,
    val r11: ULong,
    val r12: ULong,
    val r13: ULong,
    val r14: ULong,
    val r15: ULong,
    val rip: ULong,
    val cs: UInt,
    val rflags: ULong,
    val rsp: ULong,
    val ss: UInt,
)

public data class McontextT(
    val cpu: X8664CpuRegisters,
    val fpu: X8664FpuRegisters,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class FsaveArea64(
    val fpuControlWord: UInt,
    val fpuStatusWord: UInt,
    val fpuTagWord: UInt,
    val fpuIp: UInt,
    val fpuCs: UInt,
    val fpuOp: UInt,
    val fpuDs: UInt,
    val stRegs: ByteArray,
) {
    init {
        require(stRegs.size == 80) { "st_regs must be 80 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as FsaveArea64
        return fpuControlWord == other.fpuControlWord && fpuStatusWord == other.fpuStatusWord &&
            fpuTagWord == other.fpuTagWord && fpuIp == other.fpuIp && fpuCs == other.fpuCs &&
            fpuOp == other.fpuOp && fpuDs == other.fpuDs && stRegs.contentEquals(other.stRegs)
    }

    override fun hashCode(): Int = 31 * fpuControlWord.hashCode() + stRegs.contentHashCode()
}

// reserved2 is layout padding.
public data class FxsaveArea64(
    val fpuControlWord: UShort,
    val fpuStatusWord: UShort,
    val fpuTagWord: UShort,
    val fpuOperand: UShort,
    val fpuRip: ULong,
    val fpuRdp: ULong,
    val mxcsr: UInt,
    val mxcsrMask: UInt,
    val stRegs: ByteArray,
    val xmmRegs: ByteArray,
) {
    init {
        require(stRegs.size == 128) { "st_regs must be 128 bytes" }
        require(xmmRegs.size == 128) { "xmm_regs must be 128 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as FxsaveArea64
        return fpuControlWord == other.fpuControlWord && fpuStatusWord == other.fpuStatusWord &&
            fpuTagWord == other.fpuTagWord && fpuOperand == other.fpuOperand && fpuRip == other.fpuRip &&
            fpuRdp == other.fpuRdp && mxcsr == other.mxcsr && mxcsrMask == other.mxcsrMask &&
            stRegs.contentEquals(other.stRegs) && xmmRegs.contentEquals(other.xmmRegs)
    }

    override fun hashCode(): Int = 31 * stRegs.contentHashCode() + xmmRegs.contentHashCode()
}

public data class FpuExtentionSavearea64(
    val other: ByteArray,
    val xstateBv: ULong,
    val xstateUndef: ULongArray,
    val xstateInfo: ByteArray,
) {
    init {
        require(other.size == 512) { "other must be 512 bytes" }
        require(xstateUndef.size == 7) { "xstate_undef must be 7 entries" }
        require(xstateInfo.size == 224) { "xstate_info must be 224 bytes" }
    }

    override fun equals(other2: Any?): Boolean {
        if (this === other2) return true
        if (other2 == null || this::class != other2::class) return false
        other2 as FpuExtentionSavearea64
        return other.contentEquals(other2.other) && xstateBv == other2.xstateBv &&
            xstateUndef.contentEquals(other2.xstateUndef) && xstateInfo.contentEquals(other2.xstateInfo)
    }

    override fun hashCode(): Int {
        var result = other.contentHashCode()
        result = 31 * result + xstateBv.hashCode()
        result = 31 * result + xstateUndef.contentHashCode()
        result = 31 * result + xstateInfo.contentHashCode()
        return result
    }
}

// C union; only one view is valid at a time. data is [u8; 1024].
public data class X8664FpuRegisters(
    val fsaveArea: FsaveArea64? = null,
    val fxsaveArea: FxsaveArea64? = null,
    val xsaveArea: FpuExtentionSavearea64? = null,
    val data: ByteArray? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as X8664FpuRegisters
        if (fsaveArea != other.fsaveArea) return false
        if (fxsaveArea != other.fxsaveArea) return false
        if (xsaveArea != other.xsaveArea) return false
        if (data != null) {
            if (other.data == null || !data.contentEquals(other.data)) return false
        } else if (other.data != null) {
            return false
        }
        return true
    }

    override fun hashCode(): Int = 31 * (fsaveArea?.hashCode() ?: 0) + (data?.contentHashCode() ?: 0)
}
