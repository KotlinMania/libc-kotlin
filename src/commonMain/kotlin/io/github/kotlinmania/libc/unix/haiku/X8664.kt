// port-lint: source unix/haiku/x86_64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class FpuState(
    val control: UShort,
    val status: UShort,
    val tag: UShort,
    val opcode: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mscsrMask: UInt,
    val fpreg: List<UByteArray>,
    val xmm: List<UByteArray>,
)

public data class XstateHdr(
    val bv: ULong,
    val xcompBv: ULong,
)

public data class Savefpu(
    val fpFxsave: FpuState,
    val fpXstate: XstateHdr,
    val fpYmm: List<UByteArray>,
)

public data class McontextT(
    val rax: ULong,
    val rbx: ULong,
    val rcx: ULong,
    val rdx: ULong,
    val rdi: ULong,
    val rsi: ULong,
    val rbp: ULong,
    val r8: ULong,
    val r9: ULong,
    val r10: ULong,
    val r11: ULong,
    val r12: ULong,
    val r13: ULong,
    val r14: ULong,
    val r15: ULong,
    val rsp: ULong,
    val rip: ULong,
    val rflags: ULong,
    val fpu: Savefpu,
)

public data class UcontextT(
    val ucLink: UcontextT?,
    val ucSigmask: ULong,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)
