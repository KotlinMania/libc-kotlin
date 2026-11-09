// port-lint: source unix/haiku/x86_64.rs
package io.github.kotlinmania.libc.unix.haiku.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.haiku.SigsetT
import io.github.kotlinmania.libc.unix.haiku.StackT

public open class FpuState(
    public var control: CUshort,
    public var status: CUshort,
    public var tag: CUshort,
    public var opcode: CUshort,
    public var rip: CUlong,
    public var rdp: CUlong,
    public var mxcsr: CUint,
    public var mscsrMask: CUint,
    public var fpreg: List<List<CUchar>>,
    public var xmm: List<List<CUchar>>,
    public var reserved416511: List<CUchar>,
)

public open class XstateHdr(
    public var bv: CUlong,
    public var xcompBv: CUlong,
    public var reserved: List<CUchar>,
)

public open class Savefpu(
    public var fpFxsave: FpuState,
    public var fpXstate: XstateHdr,
    public var fpYmm: List<List<CUchar>>,
)

public open class McontextT(
    public var rax: CUlong,
    public var rbx: CUlong,
    public var rcx: CUlong,
    public var rdx: CUlong,
    public var rdi: CUlong,
    public var rsi: CUlong,
    public var rbp: CUlong,
    public var r8: CUlong,
    public var r9: CUlong,
    public var r10: CUlong,
    public var r11: CUlong,
    public var r12: CUlong,
    public var r13: CUlong,
    public var r14: CUlong,
    public var r15: CUlong,
    public var rsp: CUlong,
    public var rip: CUlong,
    public var rflags: CUlong,
    public var fpu: Savefpu,
)

public open class UcontextT(
    public var ucLink: UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
)
