// port-lint: source unix/solarish/x86_64.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias GregT = CLong
public typealias Elf64Addr = CULong
public typealias Elf64Half = CUShort
public typealias Elf64Off = CULong
public typealias Elf64Sword = CInt
public typealias Elf64Sxword = CLong
public typealias Elf64Word = CUInt
public typealias Elf64Xword = CULong
public typealias Elf64Lword = CULong
public typealias Elf64Phdr = CAnonymousElf64Phdr

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
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf64Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhnum: Elf64Half,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: CULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class FpregsetT(
    val fpRegSet: CAnonymousFpRegSet,
)

public data class McontextT(
    val gregs: List<GregT>,
    val fpregs: FpregsetT,
)

public data class UcontextT(
    val ucFlags: CULong,
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucBrandData: List<COpaquePointer?>,
    val ucXsave: CLong,
    val ucFiller: CLong,
    val ucXrs: XrsT,
    val ucLwpid: CUInt,
    val ucFiller: LongArray,
)

// C union; only one variant is valid at a time.
public data class CAnonymousFpRegSet(
    val fpchipState: CAnonymousFpchipState? = null,
    val fFpregs: List<UIntArray>? = null,
)

public const val REG_GSBASE: CInt = 27
public const val REG_FSBASE: CInt = 26
public const val REG_DS: CInt = 25
public const val REG_ES: CInt = 24
public const val REG_GS: CInt = 23
public const val REG_FS: CInt = 22
public const val REG_SS: CInt = 21
public const val REG_RSP: CInt = 20
public const val REG_RFL: CInt = 19
public const val REG_CS: CInt = 18
public const val REG_RIP: CInt = 17
public const val REG_ERR: CInt = 16
public const val REG_TRAPNO: CInt = 15
public const val REG_RAX: CInt = 14
public const val REG_RCX: CInt = 13
public const val REG_RDX: CInt = 12
public const val REG_RBX: CInt = 11
public const val REG_RBP: CInt = 10
public const val REG_RSI: CInt = 9
public const val REG_RDI: CInt = 8
public const val REG_R8: CInt = 7
public const val REG_R9: CInt = 6
public const val REG_R10: CInt = 5
public const val REG_R11: CInt = 4
public const val REG_R12: CInt = 3
public const val REG_R13: CInt = 2
public const val REG_R14: CInt = 1
public const val REG_R15: CInt = 0
