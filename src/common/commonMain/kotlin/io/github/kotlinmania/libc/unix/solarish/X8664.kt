// port-lint: source unix/solarish/x86_64.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

public typealias GregT = CLong

public typealias Elf64Addr = CUlong

public typealias Elf64Half = CUshort

public typealias Elf64Off = CUlong

public typealias Elf64Sword = CInt

public typealias Elf64Sxword = CLong

public typealias Elf64Word = CUint

public typealias Elf64Xword = CUlong

public typealias Elf64Lword = CUlong

public typealias Elf64Phdr = CAnonymousElf64Phdr

public open class CAnonymousFpchipState(
    public var cw: UShort,
    public var sw: UShort,
    public var fctw: UByte,
    public var fxRsvd: UByte,
    public var fop: UShort,
    public var rip: ULong,
    public var rdp: ULong,
    public var mxcsr: UInt,
    public var mxcsrMask: UInt,
    public var st: List<Upad128T>,
    public var xmm: List<Upad128T>,
    public var fxIgn: List<Upad128T>,
    public var status: UInt,
    public var xstatus: UInt,
)

public open class CAnonymousElf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)

public open class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: CAnonymousElf64Phdr?,
    public var dlpiPhnum: Elf64Half,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: CUlong,
    public var dlpiTlsData: COpaquePointer?,
)

public open class FpregsetT(public var fpRegSet: CAnonymousFpRegSet)

public open class McontextT(public var gregs: List<GregT>, public var fpregs: FpregsetT)

public open class UcontextT(
    public var ucFlags: CUlong,
    public var ucLink: UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucMcontext: McontextT,
    public var ucBrandData: List<COpaquePointer?>,
    public var ucXsave: CLong,
    public var ucFiller: CLong,
    public var ucXrs: solaris.XrsT,
    public var ucLwpid: CUint,
)

public open class CAnonymousFpRegSet(public var fpchipState: CAnonymousFpchipState? = null, public var fFpregs: List<List<UInt>>? = null) {
    public open fun eq(other: CAnonymousFpRegSet): Boolean {
        return this.fpchipState == other.fpchipState || this.fFpregs.iter().zip(other.fFpregs.iter()).all({ (a, b) -> a == b })
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.fFpregs).hashCode()
        }
        return state
    }
}

// sys/regset.h
public val REG_GSBASE: CInt = 27

public val REG_FSBASE: CInt = 26

public val REG_DS: CInt = 25

public val REG_ES: CInt = 24

public val REG_GS: CInt = 23

public val REG_FS: CInt = 22

public val REG_SS: CInt = 21

public val REG_RSP: CInt = 20

public val REG_RFL: CInt = 19

public val REG_CS: CInt = 18

public val REG_RIP: CInt = 17

public val REG_ERR: CInt = 16

public val REG_TRAPNO: CInt = 15

public val REG_RAX: CInt = 14

public val REG_RCX: CInt = 13

public val REG_RDX: CInt = 12

public val REG_RBX: CInt = 11

public val REG_RBP: CInt = 10

public val REG_RSI: CInt = 9

public val REG_RDI: CInt = 8

public val REG_R8: CInt = 7

public val REG_R9: CInt = 6

public val REG_R10: CInt = 5

public val REG_R11: CInt = 4

public val REG_R12: CInt = 3

public val REG_R13: CInt = 2

public val REG_R14: CInt = 1

public val REG_R15: CInt = 0
