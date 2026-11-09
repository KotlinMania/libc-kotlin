// port-lint: source new/apple/xnu/mach/i386/_structs.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.apple.xnu.mach.i386.structs

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort

// Header: `i386 / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/i386/_structs.h>

public data class DarwinMmstReg(public var mmstReg: UByteArray = UByteArray(10), public var mmstRsrv: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinMmstReg) return false
        if (!this.mmstReg.contentEquals(other.mmstReg)) return false
        if (!this.mmstRsrv.contentEquals(other.mmstRsrv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mmstReg.contentHashCode()
        result = 31 * result + this.mmstRsrv.contentHashCode()
        return result
    }
}

public data class DarwinXmmReg(public var xmmReg: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinXmmReg) return false
        if (!this.xmmReg.contentEquals(other.xmmReg)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.xmmReg.contentHashCode()
    }
}

public class DarwinX86ThreadState64(
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var rflags: ULong = 0uL,
    public var cs: ULong = 0uL,
    public var fs: ULong = 0uL,
    public var gs: ULong = 0uL,
)

public data class DarwinX86ExceptionState64(
    public var trapno: UShort = 0u,
    public var cpu: UShort = 0u,
    public var err: UInt = 0u,
    public var faultvaddr: ULong = 0uL,
)

public class DarwinX86FloatState64(
    public var fpuReserved: IntArray = IntArray(2),
    public var fpuFcw: CShort = 0,
    public var fpuFsw: CShort = 0,
    public var fpuFtw: UByte = 0u,
    public var fpuRsrv1: UByte = 0u,
    public var fpuFop: UShort = 0u,
    public var fpuIp: UInt = 0u,
    public var fpuCs: UShort = 0u,
    public var fpuRsrv2: UShort = 0u,
    public var fpuDp: UInt = 0u,
    public var fpuDs: UShort = 0u,
    public var fpuRsrv3: UShort = 0u,
    public var fpuMxcsr: UInt = 0u,
    public var fpuMxcsrmask: UInt = 0u,
    public var fpuStmm0: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm1: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm2: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm3: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm4: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm5: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm6: DarwinMmstReg = DarwinMmstReg(),
    public var fpuStmm7: DarwinMmstReg = DarwinMmstReg(),
    public var fpuXmm0: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm1: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm2: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm3: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm4: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm5: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm6: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm7: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm8: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm9: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm10: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm11: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm12: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm13: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm14: DarwinXmmReg = DarwinXmmReg(),
    public var fpuXmm15: DarwinXmmReg = DarwinXmmReg(),
    // Note(apple): this field is actually [u8; 96], but defining it with a bigger type allows
    // us to auto-implement traits for it since the length of the array is less than 32
    public var fpuRsrv4: UIntArray = UIntArray(24),
    public var fpuReserved1: CInt = 0,
)
