// port-lint: source new/apple/xnu/mach/i386/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.i386

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class DarwinMmstReg(
    val mmstReg: ByteArray,
    val mmstRsrv: ByteArray,
)

public data class DarwinXmmReg(
    val xmmReg: ByteArray,
)

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
)
