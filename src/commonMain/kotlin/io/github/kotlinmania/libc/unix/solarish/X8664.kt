// port-lint: source unix/solarish/x86_64.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class CAnonymousFpchipState(
    val cw: UShort,
    val sw: UShort,
    val fctw: UByte,
    val fxRsvd: UByte,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcsrMask: UInt,
    val st: List<Upad128T>,
    val xmm: List<Upad128T>,
    val fxIgn: List<Upad128T>,
    val status: UInt,
    val xstatus: UInt,
)

public data class CAnonymousElf64Phdr(
    val pType: UInt,
    val pFlags: UInt,
    val pOffset: ULong,
    val pVaddr: ULong,
    val pPaddr: ULong,
    val pFilesz: ULong,
    val pMemsz: ULong,
    val pAlign: ULong,
)

public data class FpregsetT(
    val fpRegSet: CAnonymousFpRegSet,
)

public data class McontextT(
    val gregs: List<Long>,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucBrandData: LongArray,
    val ucXsave: Long,
    val ucFiller: Long,
    val ucXrs: XrsT,
    val ucLwpid: UInt,
    val ucFiller2: LongArray,
)

// C union; only one variant is valid at a time.
public data class CAnonymousFpRegSet(
    val fpchipState: CAnonymousFpchipState? = null,
    val fFpregs: List<UIntArray>? = null,
)

public const val REG_GSBASE: Int = 27
public const val REG_FSBASE: Int = 26
public const val REG_DS: Int = 25
public const val REG_ES: Int = 24
public const val REG_GS: Int = 23
public const val REG_FS: Int = 22
public const val REG_SS: Int = 21
public const val REG_RSP: Int = 20
public const val REG_RFL: Int = 19
public const val REG_CS: Int = 18
public const val REG_RIP: Int = 17
public const val REG_ERR: Int = 16
public const val REG_TRAPNO: Int = 15
public const val REG_RAX: Int = 14
public const val REG_RCX: Int = 13
public const val REG_RDX: Int = 12
public const val REG_RBX: Int = 11
public const val REG_RBP: Int = 10
public const val REG_RSI: Int = 9
public const val REG_RDI: Int = 8
public const val REG_R8: Int = 7
public const val REG_R9: Int = 6
public const val REG_R10: Int = 5
public const val REG_R11: Int = 4
public const val REG_R12: Int = 3
public const val REG_R13: Int = 2
public const val REG_R14: Int = 1
public const val REG_R15: Int = 0
