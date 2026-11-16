// port-lint: source unix/bsd/netbsdlike/netbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.PT_FIRSTMACH
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.StackT

public typealias CGregT = ULong

public typealias CpuSimpleLockNvT = CUchar

// Note(alignment): Type is `__aligned(8)`
public typealias FpregsetT = List<CChar>

public open class McontextT(
    public var gregs: List<CGregT>,
    public var mcTlsbase: CGregT,
    public var fpregs: FpregsetT,
)

public open class UcontextT(
    public var ucFlags: CUint,
    public var ucLink: io.github.kotlinmania.libc.UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucMcontext: io.github.kotlinmania.libc.McontextT,
)

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4

public val REG_RDI: CInt = 0

public val REG_RSI: CInt = 1

public val REG_RDX: CInt = 2

public val REG_RCX: CInt = 3

public val REG_R8: CInt = 4

public val REG_R9: CInt = 5

public val REG_R10: CInt = 6

public val REG_R11: CInt = 7

public val REG_R12: CInt = 8

public val REG_R13: CInt = 9

public val REG_R14: CInt = 10

public val REG_R15: CInt = 11

public val REG_RBP: CInt = 12

public val REG_RBX: CInt = 13

public val REG_RAX: CInt = 14

public val REG_GS: CInt = 15

public val REG_FS: CInt = 16

public val REG_ES: CInt = 17

public val REG_DS: CInt = 18

public val REG_TRAPNO: CInt = 19

public val REG_ERR: CInt = 20

public val REG_RIP: CInt = 21

public val REG_CS: CInt = 22

public val REG_RFLAGS: CInt = 23

public val REG_RSP: CInt = 24

public val REG_SS: CInt = 25
