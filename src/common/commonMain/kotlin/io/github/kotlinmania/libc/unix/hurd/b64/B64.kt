// port-lint: source unix/hurd/b64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public typealias Int64T = CLong

public typealias Uint64T = CUlong

public typealias IntFast16T = CLong

public typealias IntFast32T = CLong

public typealias IntFast64T = CLong

public typealias UintFast16T = CUlong

public typealias UintFast32T = CUlong

public typealias UintFast64T = CUlong

public typealias QuadT = CLong

public typealias UQuadT = CUlong

public typealias IntmaxT = CLong

public typealias UintmaxT = CUlong

public typealias SquadType = CLong

public typealias UquadType = CUlong

public typealias SwordType = CLong

public typealias UwordType = CUlong

public typealias Slong32Type = CInt

public typealias Ulong32Type = CUint

public typealias S64Type = CLong

public typealias U64Type = CUlong

public typealias IpcPidT = CInt

public typealias Elf64Half = UShort

public typealias Elf64Word = UInt

public typealias Elf64Off = ULong

public typealias Elf64Addr = ULong

public typealias Elf64Xword = ULong

public typealias Elf64Sxword = Long

public typealias Elf64Section = UShort

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfEhdr = Elf64Ehdr

public typealias ElfPhdr = Elf64Phdr

public typealias ElfShdr = Elf64Shdr

public typealias ElfSym = Elf64Sym

public data class Elf64Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf64Half = 0u,
    public var eMachine: Elf64Half = 0u,
    public var eVersion: Elf64Word = 0u,
    public var eEntry: Elf64Addr = 0uL,
    public var ePhoff: Elf64Off = 0uL,
    public var eShoff: Elf64Off = 0uL,
    public var eFlags: Elf64Word = 0u,
    public var eEhsize: Elf64Half = 0u,
    public var ePhentsize: Elf64Half = 0u,
    public var ePhnum: Elf64Half = 0u,
    public var eShentsize: Elf64Half = 0u,
    public var eShnum: Elf64Half = 0u,
    public var eShstrndx: Elf64Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf64Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }
}

public data class Elf64Shdr(
    public var shName: Elf64Word = 0u,
    public var shType: Elf64Word = 0u,
    public var shFlags: Elf64Xword = 0uL,
    public var shAddr: Elf64Addr = 0uL,
    public var shOffset: Elf64Off = 0uL,
    public var shSize: Elf64Xword = 0uL,
    public var shLink: Elf64Word = 0u,
    public var shInfo: Elf64Word = 0u,
    public var shAddralign: Elf64Xword = 0uL,
    public var shEntsize: Elf64Xword = 0uL,
)

public data class Elf64Sym(
    public var stName: Elf64Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf64Section = 0u,
    public var stValue: Elf64Addr = 0uL,
    public var stSize: Elf64Xword = 0uL,
)

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)
