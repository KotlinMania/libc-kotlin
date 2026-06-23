// port-lint: source unix/bsd/netbsdlike/netbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public typealias CGregT = ULong
public typealias CpuSimpleLockNvT = CUChar

public data class McontextT(
    val gregs: List<CGregT>,
    val mcTlsbase: CGregT,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: CUInt,
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)

public const val PT_STEP: CInt = PT_FIRSTMACH + 0
public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
public const val _REG_RDI: CInt = 0
public const val _REG_RSI: CInt = 1
public const val _REG_RDX: CInt = 2
public const val _REG_RCX: CInt = 3
public const val _REG_R8: CInt = 4
public const val _REG_R9: CInt = 5
public const val _REG_R10: CInt = 6
public const val _REG_R11: CInt = 7
public const val _REG_R12: CInt = 8
public const val _REG_R13: CInt = 9
public const val _REG_R14: CInt = 10
public const val _REG_R15: CInt = 11
public const val _REG_RBP: CInt = 12
public const val _REG_RBX: CInt = 13
public const val _REG_RAX: CInt = 14
public const val _REG_GS: CInt = 15
public const val _REG_FS: CInt = 16
public const val _REG_ES: CInt = 17
public const val _REG_DS: CInt = 18
public const val _REG_TRAPNO: CInt = 19
public const val _REG_ERR: CInt = 20
public const val _REG_RIP: CInt = 21
public const val _REG_CS: CInt = 22
public const val _REG_RFLAGS: CInt = 23
public const val _REG_RSP: CInt = 24
public const val _REG_SS: CInt = 25
