// port-lint: source new/apple/xnu/mach/i386/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.i386

import io.github.kotlinmania.libc.*

/**
 * Header: `i386/_structs.h`.
 */

public data class DarwinMmstReg(
    val mmstReg: ByteArray,
    val mmstRsrv: ByteArray,
) {
    init {
        require(mmstReg.size == 10) { "__mmst_reg must be 10 bytes" }
        require(mmstRsrv.size == 6) { "__mmst_rsrv must be 6 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as DarwinMmstReg
        if (!mmstReg.contentEquals(other.mmstReg)) return false
        if (!mmstRsrv.contentEquals(other.mmstRsrv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = mmstReg.contentHashCode()
        result = 31 * result + mmstRsrv.contentHashCode()
        return result
    }
}

public data class DarwinXmmReg(
    val xmmReg: ByteArray,
) {
    init {
        require(xmmReg.size == 16) { "__xmm_reg must be 16 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as DarwinXmmReg
        return xmmReg.contentEquals(other.xmmReg)
    }

    override fun hashCode(): Int = xmmReg.contentHashCode()
}

public data class DarwinX86ThreadState64(
    val rax: ULong,
    val rbx: ULong,
    val rcx: ULong,
    val rdx: ULong,
    val rdi: ULong,
    val rsi: ULong,
    val rbp: ULong,
    val rsp: ULong,
    val r8: ULong,
    val r9: ULong,
    val r10: ULong,
    val r11: ULong,
    val r12: ULong,
    val r13: ULong,
    val r14: ULong,
    val r15: ULong,
    val rip: ULong,
    val rflags: ULong,
    val cs: ULong,
    val fs: ULong,
    val gs: ULong,
)

public data class DarwinX86ExceptionState64(
    val trapno: UShort,
    val cpu: UShort,
    val err: UInt,
    val faultvaddr: ULong,
)

// __fpu_rsrv4 is actually [u8; 96] upstream, widened to [u32; 24] to keep the
// array length under the auto-trait threshold.
public data class DarwinX86FloatState64(
    val fpuReserved: IntArray,
    val fpuFcw: CShort,
    val fpuFsw: CShort,
    val fpuFtw: UByte,
    val fpuRsrv1: UByte,
    val fpuFop: UShort,
    val fpuIp: UInt,
    val fpuCs: UShort,
    val fpuRsrv2: UShort,
    val fpuDp: UInt,
    val fpuDs: UShort,
    val fpuRsrv3: UShort,
    val fpuMxcsr: UInt,
    val fpuMxcsrmask: UInt,
    val fpuStmm0: DarwinMmstReg,
    val fpuStmm1: DarwinMmstReg,
    val fpuStmm2: DarwinMmstReg,
    val fpuStmm3: DarwinMmstReg,
    val fpuStmm4: DarwinMmstReg,
    val fpuStmm5: DarwinMmstReg,
    val fpuStmm6: DarwinMmstReg,
    val fpuStmm7: DarwinMmstReg,
    val fpuXmm0: DarwinXmmReg,
    val fpuXmm1: DarwinXmmReg,
    val fpuXmm2: DarwinXmmReg,
    val fpuXmm3: DarwinXmmReg,
    val fpuXmm4: DarwinXmmReg,
    val fpuXmm5: DarwinXmmReg,
    val fpuXmm6: DarwinXmmReg,
    val fpuXmm7: DarwinXmmReg,
    val fpuXmm8: DarwinXmmReg,
    val fpuXmm9: DarwinXmmReg,
    val fpuXmm10: DarwinXmmReg,
    val fpuXmm11: DarwinXmmReg,
    val fpuXmm12: DarwinXmmReg,
    val fpuXmm13: DarwinXmmReg,
    val fpuXmm14: DarwinXmmReg,
    val fpuXmm15: DarwinXmmReg,
    val fpuRsrv4: UIntArray,
    val fpuReserved1: CInt,
) {
    init {
        require(fpuReserved.size == 2) { "__fpu_reserved must be 2 entries" }
        require(fpuRsrv4.size == 24) { "__fpu_rsrv4 must be 24 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as DarwinX86FloatState64
        if (!fpuReserved.contentEquals(other.fpuReserved)) return false
        if (fpuFcw != other.fpuFcw) return false
        if (fpuFsw != other.fpuFsw) return false
        if (fpuFtw != other.fpuFtw) return false
        if (fpuRsrv1 != other.fpuRsrv1) return false
        if (fpuFop != other.fpuFop) return false
        if (fpuIp != other.fpuIp) return false
        if (fpuCs != other.fpuCs) return false
        if (fpuRsrv2 != other.fpuRsrv2) return false
        if (fpuDp != other.fpuDp) return false
        if (fpuDs != other.fpuDs) return false
        if (fpuRsrv3 != other.fpuRsrv3) return false
        if (fpuMxcsr != other.fpuMxcsr) return false
        if (fpuMxcsrmask != other.fpuMxcsrmask) return false
        if (fpuStmm0 != other.fpuStmm0) return false
        if (fpuStmm1 != other.fpuStmm1) return false
        if (fpuStmm2 != other.fpuStmm2) return false
        if (fpuStmm3 != other.fpuStmm3) return false
        if (fpuStmm4 != other.fpuStmm4) return false
        if (fpuStmm5 != other.fpuStmm5) return false
        if (fpuStmm6 != other.fpuStmm6) return false
        if (fpuStmm7 != other.fpuStmm7) return false
        if (fpuXmm0 != other.fpuXmm0) return false
        if (fpuXmm1 != other.fpuXmm1) return false
        if (fpuXmm2 != other.fpuXmm2) return false
        if (fpuXmm3 != other.fpuXmm3) return false
        if (fpuXmm4 != other.fpuXmm4) return false
        if (fpuXmm5 != other.fpuXmm5) return false
        if (fpuXmm6 != other.fpuXmm6) return false
        if (fpuXmm7 != other.fpuXmm7) return false
        if (fpuXmm8 != other.fpuXmm8) return false
        if (fpuXmm9 != other.fpuXmm9) return false
        if (fpuXmm10 != other.fpuXmm10) return false
        if (fpuXmm11 != other.fpuXmm11) return false
        if (fpuXmm12 != other.fpuXmm12) return false
        if (fpuXmm13 != other.fpuXmm13) return false
        if (fpuXmm14 != other.fpuXmm14) return false
        if (fpuXmm15 != other.fpuXmm15) return false
        if (!fpuRsrv4.contentEquals(other.fpuRsrv4)) return false
        if (fpuReserved1 != other.fpuReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = fpuReserved.contentHashCode()
        result = 31 * result + fpuFcw.hashCode()
        result = 31 * result + fpuFsw.hashCode()
        result = 31 * result + fpuFtw.hashCode()
        result = 31 * result + fpuRsrv1.hashCode()
        result = 31 * result + fpuFop.hashCode()
        result = 31 * result + fpuIp.hashCode()
        result = 31 * result + fpuCs.hashCode()
        result = 31 * result + fpuRsrv2.hashCode()
        result = 31 * result + fpuDp.hashCode()
        result = 31 * result + fpuDs.hashCode()
        result = 31 * result + fpuRsrv3.hashCode()
        result = 31 * result + fpuMxcsr.hashCode()
        result = 31 * result + fpuMxcsrmask.hashCode()
        result = 31 * result + fpuStmm0.hashCode()
        result = 31 * result + fpuStmm1.hashCode()
        result = 31 * result + fpuStmm2.hashCode()
        result = 31 * result + fpuStmm3.hashCode()
        result = 31 * result + fpuStmm4.hashCode()
        result = 31 * result + fpuStmm5.hashCode()
        result = 31 * result + fpuStmm6.hashCode()
        result = 31 * result + fpuStmm7.hashCode()
        result = 31 * result + fpuXmm0.hashCode()
        result = 31 * result + fpuXmm1.hashCode()
        result = 31 * result + fpuXmm2.hashCode()
        result = 31 * result + fpuXmm3.hashCode()
        result = 31 * result + fpuXmm4.hashCode()
        result = 31 * result + fpuXmm5.hashCode()
        result = 31 * result + fpuXmm6.hashCode()
        result = 31 * result + fpuXmm7.hashCode()
        result = 31 * result + fpuXmm8.hashCode()
        result = 31 * result + fpuXmm9.hashCode()
        result = 31 * result + fpuXmm10.hashCode()
        result = 31 * result + fpuXmm11.hashCode()
        result = 31 * result + fpuXmm12.hashCode()
        result = 31 * result + fpuXmm13.hashCode()
        result = 31 * result + fpuXmm14.hashCode()
        result = 31 * result + fpuXmm15.hashCode()
        result = 31 * result + fpuRsrv4.contentHashCode()
        result = 31 * result + fpuReserved1.hashCode()
        return result
    }
}
