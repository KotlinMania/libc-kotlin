// port-lint: source unix/solarish/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.libc.unix.solarish.StackT
import io.github.kotlinmania.libc.unix.solarish.Upad128T
import io.github.kotlinmania.libc.unix.solarish.solaris.XrsT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class DlPhdrInfo internal constructor(
    public var dlpiAddr: Elf64Addr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<Elf64Phdr>,
    public var dlpiPhnum: Elf64Half,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: CUlong,
    dlpiTlsDataCtorArg: MutPtr<CVoid>,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<Elf64Phdr> = dlpiPhdrCtorArg
        internal set

    public var dlpiTlsData: MutPtr<CVoid> = dlpiTlsDataCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
        dlpiTlsModid = 0uL,
        dlpiTlsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Elf64Addr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<Elf64Phdr> = this.dlpiPhdr

    public operator fun component4(): Elf64Half = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public operator fun component7(): CUlong = this.dlpiTlsModid

    public operator fun component8(): MutPtr<CVoid> = this.dlpiTlsData

    public fun copy(dlpiAddr: Elf64Addr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<Elf64Phdr> = this.dlpiPhdr, dlpiPhnum: Elf64Half = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs, dlpiTlsModid: CUlong = this.dlpiTlsModid, dlpiTlsData: MutPtr<CVoid> = this.dlpiTlsData): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs, dlpiTlsModid = dlpiTlsModid, dlpiTlsDataCtorArg = dlpiTlsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        if (this.dlpiTlsModid != other.dlpiTlsModid) return false
        if (this.dlpiTlsData != other.dlpiTlsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        result = 31 * result + this.dlpiTlsModid.hashCode()
        result = 31 * result + this.dlpiTlsData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dlpiAddr: Elf64Addr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<Elf64Phdr> = ConstPtr(0L),
            dlpiPhnum: Elf64Half = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
            dlpiTlsModid: CUlong = 0uL,
            dlpiTlsData: MutPtr<CVoid> = MutPtr(0L),
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
                dlpiAdds = dlpiAdds,
                dlpiSubs = dlpiSubs,
                dlpiTlsModid = dlpiTlsModid,
                dlpiTlsDataCtorArg = dlpiTlsData,
            )
    }
}

public data class FpregsetT(
    public var fpRegSet: CAnonymousFpRegSet = CAnonymousFpRegSet(),
)

public data class McontextT(
    public var gregs: LongArray = LongArray(28),
    public var fpregs: FpregsetT = FpregsetT(),
) {
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

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    ucBrandDataCtorArg: List<MutPtr<CVoid>>,
    public var ucXsave: CLong,
    public var ucFiller: CLong,
    public var ucXrs: XrsT,
    public var ucLwpid: CUint,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public var ucBrandData: List<MutPtr<CVoid>> = ucBrandDataCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = SigsetT(),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
        ucBrandDataCtorArg = List(3) { MutPtr(0L) },
        ucXsave = 0L,
        ucFiller = 0L,
        ucXrs = XrsT(),
        ucLwpid = 0u,
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr<UcontextT> = this.ucLink

    public operator fun component3(): SigsetT = this.ucSigmask

    public operator fun component4(): StackT = this.ucStack

    public operator fun component5(): McontextT = this.ucMcontext

    public operator fun component6(): List<MutPtr<CVoid>> = this.ucBrandData

    public operator fun component7(): CLong = this.ucXsave

    public operator fun component8(): CLong = this.ucFiller

    public operator fun component9(): XrsT = this.ucXrs

    public operator fun component10(): CUint = this.ucLwpid

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr<UcontextT> = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucBrandData: List<MutPtr<CVoid>> = this.ucBrandData, ucXsave: CLong = this.ucXsave, ucFiller: CLong = this.ucFiller, ucXrs: XrsT = this.ucXrs, ucLwpid: CUint = this.ucLwpid): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucBrandDataCtorArg = ucBrandData, ucXsave = ucXsave, ucFiller = ucFiller, ucXrs = ucXrs, ucLwpid = ucLwpid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucBrandData != other.ucBrandData) return false
        if (this.ucXsave != other.ucXsave) return false
        if (this.ucFiller != other.ucFiller) return false
        if (this.ucXrs != other.ucXrs) return false
        if (this.ucLwpid != other.ucLwpid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucBrandData.hashCode()
        result = 31 * result + this.ucXsave.hashCode()
        result = 31 * result + this.ucFiller.hashCode()
        result = 31 * result + this.ucXrs.hashCode()
        result = 31 * result + this.ucLwpid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucSigmask: SigsetT = SigsetT(),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
            ucBrandData: List<MutPtr<CVoid>> = List(3) { MutPtr(0L) },
            ucXsave: CLong = 0L,
            ucFiller: CLong = 0L,
            ucXrs: XrsT = XrsT(),
            ucLwpid: CUint = 0u,
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucBrandDataCtorArg = ucBrandData,
                ucXsave = ucXsave,
                ucFiller = ucFiller,
                ucXrs = ucXrs,
                ucLwpid = ucLwpid,
            )
    }
}

public data class CAnonymousFpRegSet(
    public var fpchipState: CAnonymousFpchipState = CAnonymousFpchipState(),
    public var fFpregs: List<UIntArray> = List(10) { UIntArray(0) },
) {
    public fun eq(other: CAnonymousFpRegSet): Boolean = this.fpchipState == other.fpchipState || (this.fFpregs.zip(other.fFpregs)).all({ (a, b) -> a.contentEquals(b) })

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
