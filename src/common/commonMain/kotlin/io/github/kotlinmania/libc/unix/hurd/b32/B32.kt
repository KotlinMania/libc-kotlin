// port-lint: source unix/hurd/b32.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

public typealias Int64T = CLonglong

public typealias Uint64T = CUlonglong

public typealias IntFast16T = CInt

public typealias IntFast32T = CInt

public typealias IntFast64T = CLonglong

public typealias UintFast16T = CUint

public typealias UintFast32T = CUint

public typealias UintFast64T = CUlonglong

public typealias QuadT = CLonglong

public typealias UQuadT = CUlonglong

public typealias IntmaxT = CLonglong

public typealias UintmaxT = CUlonglong

public typealias SquadType = Int64T

public typealias UquadType = Uint64T

public typealias SwordType = CInt

public typealias UwordType = CUint

public typealias Slong32Type = CLong

public typealias Ulong32Type = CUlong

public typealias S64Type = Int64T

public typealias U64Type = Uint64T

public typealias IpcPidT = CUshort

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Section = UShort

public typealias ElfAddr = Elf32Addr

public typealias ElfHalf = Elf32Half

public typealias ElfEhdr = Elf32Ehdr

public typealias ElfPhdr = Elf32Phdr

public typealias ElfShdr = Elf32Shdr

public typealias ElfSym = Elf32Sym

public data class Elf32Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf32Half = 0u,
    public var eMachine: Elf32Half = 0u,
    public var eVersion: Elf32Word = 0u,
    public var eEntry: Elf32Addr = 0u,
    public var ePhoff: Elf32Off = 0u,
    public var eShoff: Elf32Off = 0u,
    public var eFlags: Elf32Word = 0u,
    public var eEhsize: Elf32Half = 0u,
    public var ePhentsize: Elf32Half = 0u,
    public var ePhnum: Elf32Half = 0u,
    public var eShentsize: Elf32Half = 0u,
    public var eShnum: Elf32Half = 0u,
    public var eShstrndx: Elf32Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf32Ehdr) return false
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

public data class Elf32Shdr(
    public var shName: Elf32Word = 0u,
    public var shType: Elf32Word = 0u,
    public var shFlags: Elf32Word = 0u,
    public var shAddr: Elf32Addr = 0u,
    public var shOffset: Elf32Off = 0u,
    public var shSize: Elf32Word = 0u,
    public var shLink: Elf32Word = 0u,
    public var shInfo: Elf32Word = 0u,
    public var shAddralign: Elf32Word = 0u,
    public var shEntsize: Elf32Word = 0u,
)

public data class Elf32Sym(
    public var stName: Elf32Word = 0u,
    public var stValue: Elf32Addr = 0u,
    public var stSize: Elf32Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf32Section = 0u,
)

public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
)
