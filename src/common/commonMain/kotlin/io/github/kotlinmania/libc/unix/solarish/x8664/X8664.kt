// port-lint: source unix/solarish/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.solarish.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.libc.unix.solarish.StackT
import io.github.kotlinmania.libc.unix.solarish.Upad128T
import io.github.kotlinmania.libc.unix.solarish.solaris.XrsT

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

public data class CAnonymousFpchipState(
    public var cw: UShort = 0u,
    public var sw: UShort = 0u,
    public var fctw: UByte = 0u,
    public var fxRsvd: UByte = 0u,
    public var fop: UShort = 0u,
    public var rip: ULong = 0uL,
    public var rdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcsrMask: UInt = 0u,
    public var st: List<Upad128T> = List(8) { Upad128T() },
    public var xmm: List<Upad128T> = List(16) { Upad128T() },
    public var fxIgn: List<Upad128T> = List(6) { Upad128T() },
    public var status: UInt = 0u,
    public var xstatus: UInt = 0u,
)

public data class CAnonymousElf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)

public data class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: CAnonymousElf64Phdr? = null,
    public var dlpiPhnum: Elf64Half = 0u,
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: CUlong = 0uL,
    public var dlpiTlsData: COpaquePointer? = null,
)

public data class FpregsetT(public var fpRegSet: CAnonymousFpRegSet = CAnonymousFpRegSet())

public data class McontextT(public var gregs: LongArray = LongArray(28), public var fpregs: FpregsetT = FpregsetT()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.fpregs != other.fpregs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.fpregs.hashCode()
        return result
    }
}

public data class UcontextT(
    public var ucFlags: CUlong = 0uL,
    public var ucLink: UcontextT? = null,
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucBrandData: List<COpaquePointer> = List(3) { COpaquePointer(0L) },
    public var ucXsave: CLong = 0L,
    public var ucFiller: CLong = 0L,
    public var ucXrs: XrsT = XrsT(),
    public var ucLwpid: CUint = 0u,
)

public data class CAnonymousFpRegSet(public var fpchipState: CAnonymousFpchipState = CAnonymousFpchipState(), public var fFpregs: List<UIntArray> = List(10) { UIntArray(0) }) {
    public fun eq(other: CAnonymousFpRegSet): Boolean {
        return this.fpchipState == other.fpchipState || this.fFpregs.zip(other.fFpregs).all({ (a, b) -> a.contentEquals(b) })
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
