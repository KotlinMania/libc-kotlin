// port-lint: source unix/haiku/x86_64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class FpuState(
    val control: CUShort,
    val status: CUShort,
    val tag: CUShort,
    val opcode: CUShort,
    val rip: CULong,
    val rdp: CULong,
    val mxcsr: CUInt,
    val mscsrMask: CUInt,
    val fpreg: List<UByteArray>,
    val xmm: List<UByteArray>,
)

public data class XstateHdr(
    val bv: CULong,
    val xcompBv: CULong,
)

public data class Savefpu(
    val fpFxsave: FpuState,
    val fpXstate: XstateHdr,
    val fpYmm: List<UByteArray>,
)

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
