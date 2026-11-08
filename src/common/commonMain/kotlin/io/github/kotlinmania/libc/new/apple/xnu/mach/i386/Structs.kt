// port-lint: source new/apple/xnu/mach/i386/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.i386

import io.github.kotlinmania.libc.*

// Header: `i386 / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/i386/_structs.h>

public open class DarwinMmstReg(public var mmstReg: List<CChar>, public var mmstRsrv: List<CChar>)

public open class DarwinXmmReg(public var xmmReg: List<CChar>)

public open class DarwinX86ThreadState64(
    public var rax: ULong,
    public var rbx: ULong,
    public var rcx: ULong,
    public var rdx: ULong,
    public var rdi: ULong,
    public var rsi: ULong,
    public var rbp: ULong,
    public var rsp: ULong,
    public var r8: ULong,
    public var r9: ULong,
    public var r10: ULong,
    public var r11: ULong,
    public var r12: ULong,
    public var r13: ULong,
    public var r14: ULong,
    public var r15: ULong,
    public var rip: ULong,
    public var rflags: ULong,
    public var cs: ULong,
    public var fs: ULong,
    public var gs: ULong,
)

public open class DarwinX86ExceptionState64(
    public var trapno: UShort,
    public var cpu: UShort,
    public var err: UInt,
    public var faultvaddr: ULong,
)

public open class DarwinX86FloatState64(
    public var fpuReserved: List<CInt>,
    public var fpuFcw: CShort,
    public var fpuFsw: CShort,
    public var fpuFtw: UByte,
    public var fpuRsrv1: UByte,
    public var fpuFop: UShort,
    public var fpuIp: UInt,
    public var fpuCs: UShort,
    public var fpuRsrv2: UShort,
    public var fpuDp: UInt,
    public var fpuDs: UShort,
    public var fpuRsrv3: UShort,
    public var fpuMxcsr: UInt,
    public var fpuMxcsrmask: UInt,
    public var fpuStmm0: DarwinMmstReg,
    public var fpuStmm1: DarwinMmstReg,
    public var fpuStmm2: DarwinMmstReg,
    public var fpuStmm3: DarwinMmstReg,
    public var fpuStmm4: DarwinMmstReg,
    public var fpuStmm5: DarwinMmstReg,
    public var fpuStmm6: DarwinMmstReg,
    public var fpuStmm7: DarwinMmstReg,
    public var fpuXmm0: DarwinXmmReg,
    public var fpuXmm1: DarwinXmmReg,
    public var fpuXmm2: DarwinXmmReg,
    public var fpuXmm3: DarwinXmmReg,
    public var fpuXmm4: DarwinXmmReg,
    public var fpuXmm5: DarwinXmmReg,
    public var fpuXmm6: DarwinXmmReg,
    public var fpuXmm7: DarwinXmmReg,
    public var fpuXmm8: DarwinXmmReg,
    public var fpuXmm9: DarwinXmmReg,
    public var fpuXmm10: DarwinXmmReg,
    public var fpuXmm11: DarwinXmmReg,
    public var fpuXmm12: DarwinXmmReg,
    public var fpuXmm13: DarwinXmmReg,
    public var fpuXmm14: DarwinXmmReg,
    public var fpuXmm15: DarwinXmmReg,
    // Note(apple): this field is actually [u8; 96], but defining it with a bigger type allows
    // us to auto-implement traits for it since the length of the array is less than 32
    public var fpuRsrv4: List<UInt>,
    public var fpuReserved1: CInt,
)
