// port-lint: source unix/nto/x86_64.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

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

// McontextT and StackT are defined in Aarch64.kt (first definitions in this package).

public data class FsaveArea64(
    val fpuControlWord: UInt,
    val fpuStatusWord: UInt,
    val fpuTagWord: UInt,
    val fpuIp: UInt,
    val fpuCs: UInt,
    val fpuOp: UInt,
    val fpuDs: UInt,
    val stRegs: UByteArray,
)

public data class FxsaveArea64(
    val fpuControlWord: UShort,
    val fpuStatusWord: UShort,
    val fpuTagWord: UShort,
    val fpuOperand: UShort,
    val fpuRip: ULong,
    val fpuRdp: ULong,
    val mxcsr: UInt,
    val mxcsrMask: UInt,
    val stRegs: UByteArray,
    val xmmRegs: UByteArray,
)

public data class FpuExtentionSavearea64(
    val other: UByteArray,
    val xstateBv: ULong,
    val xstateUndef: ULongArray,
    val xstateInfo: UByteArray,
)

// C union; only one variant is valid at a time.
public data class X8664FpuRegisters(
    val fsaveArea: FsaveArea64? = null,
    val fxsaveArea: FxsaveArea64? = null,
    val xsaveArea: FpuExtentionSavearea64? = null,
    val data: UByteArray? = null,
)
