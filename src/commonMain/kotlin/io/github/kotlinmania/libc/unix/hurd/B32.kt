// port-lint: source unix/hurd/b32.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public typealias Int64T = CLongLong

public typealias Uint64T = CULongLong

public typealias IntFast16T = CInt

public typealias IntFast32T = CInt

public typealias IntFast64T = CLongLong

public typealias UintFast16T = CUInt

public typealias UintFast32T = CUInt

public typealias UintFast64T = CULongLong

public typealias QuadT = CLongLong

public typealias UQuadT = CULongLong

public typealias IntmaxT = CLongLong

public typealias UintmaxT = CULongLong

public typealias SquadType = Int64T

public typealias UquadType = Uint64T

public typealias SwordType = CInt

public typealias UwordType = CUInt

public typealias Slong32Type = CLong

public typealias Ulong32Type = CULong

public typealias S64Type = Int64T

public typealias U64Type = Uint64T

public typealias IpcPidT = CUShort

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
    val eIdent: ByteArray,
    val eType: Elf32Half,
    val eMachine: Elf32Half,
    val eVersion: Elf32Word,
    val eEntry: Elf32Addr,
    val ePhoff: Elf32Off,
    val eShoff: Elf32Off,
    val eFlags: Elf32Word,
    val eEhsize: Elf32Half,
    val ePhentsize: Elf32Half,
    val ePhnum: Elf32Half,
    val eShentsize: Elf32Half,
    val eShnum: Elf32Half,
    val eShstrndx: Elf32Half,
) {
    init {
        require(eIdent.size == 16) { "e_ident must be 16 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Elf32Ehdr
        return eIdent.contentEquals(other.eIdent) && eType == other.eType && eMachine == other.eMachine &&
            eVersion == other.eVersion && eEntry == other.eEntry && ePhoff == other.ePhoff &&
            eShoff == other.eShoff && eFlags == other.eFlags && eEhsize == other.eEhsize &&
            ePhentsize == other.ePhentsize && ePhnum == other.ePhnum && eShentsize == other.eShentsize &&
            eShnum == other.eShnum && eShstrndx == other.eShstrndx
    }

    override fun hashCode(): Int = 31 * eIdent.contentHashCode() + eType.hashCode()
}

public data class Elf32Shdr(
    val shName: Elf32Word,
    val shType: Elf32Word,
    val shFlags: Elf32Word,
    val shAddr: Elf32Addr,
    val shOffset: Elf32Off,
    val shSize: Elf32Word,
    val shLink: Elf32Word,
    val shInfo: Elf32Word,
    val shAddralign: Elf32Word,
    val shEntsize: Elf32Word,
)

public data class Elf32Sym(
    val stName: Elf32Word,
    val stValue: Elf32Addr,
    val stSize: Elf32Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf32Section,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)
