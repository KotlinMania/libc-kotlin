// port-lint: source unix/haiku/x86_64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

// _fpreg is [[c_uchar; 8]; 16] (128 bytes); _xmm is [[c_uchar; 16]; 16] (256
// bytes); _reserved_416_511 is layout padding.
public data class FpuState(
    val control: CUShort,
    val status: CUShort,
    val tag: CUShort,
    val opcode: CUShort,
    val rip: CULong,
    val rdp: CULong,
    val mxcsr: CUInt,
    val mscsrMask: CUInt,
    val fpreg: ByteArray,
    val xmm: ByteArray,
) {
    init {
        require(fpreg.size == 128) { "_fpreg must be 128 bytes" }
        require(xmm.size == 256) { "_xmm must be 256 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as FpuState
        return control == other.control && status == other.status && tag == other.tag &&
            opcode == other.opcode && rip == other.rip && rdp == other.rdp && mxcsr == other.mxcsr &&
            mscsrMask == other.mscsrMask && fpreg.contentEquals(other.fpreg) && xmm.contentEquals(other.xmm)
    }

    override fun hashCode(): Int = 31 * fpreg.contentHashCode() + xmm.contentHashCode()
}

// _reserved is layout padding.
public data class XstateHdr(
    val bv: CULong,
    val xcompBv: CULong,
)

public data class Savefpu(
    val fpFxsave: FpuState,
    val fpXstate: XstateHdr,
    val fpYmm: ByteArray,
) {
    init {
        require(fpYmm.size == 256) { "_fp_ymm must be 256 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Savefpu
        if (fpFxsave != other.fpFxsave) return false
        if (fpXstate != other.fpXstate) return false
        if (!fpYmm.contentEquals(other.fpYmm)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = fpFxsave.hashCode()
        result = 31 * result + fpXstate.hashCode()
        result = 31 * result + fpYmm.contentHashCode()
        return result
    }
}

public data class McontextT(
    val rax: CULong,
    val rbx: CULong,
    val rcx: CULong,
    val rdx: CULong,
    val rdi: CULong,
    val rsi: CULong,
    val rbp: CULong,
    val r8: CULong,
    val r9: CULong,
    val r10: CULong,
    val r11: CULong,
    val r12: CULong,
    val r13: CULong,
    val r14: CULong,
    val r15: CULong,
    val rsp: CULong,
    val rip: CULong,
    val rflags: CULong,
    val fpu: Savefpu,
)

public data class UcontextT(
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)
