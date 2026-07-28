// port-lint: source unix/hurd/b64.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public typealias Int64T = CLong
public typealias Uint64T = CULong
public typealias IntFast16T = CLong
public typealias IntFast32T = CLong
public typealias IntFast64T = CLong
public typealias UintFast16T = CULong
public typealias UintFast32T = CULong
public typealias UintFast64T = CULong
public typealias QuadT = CLong
public typealias UQuadT = CULong
public typealias IntmaxT = CLong
public typealias UintmaxT = CULong
public typealias SquadType = CLong
public typealias UquadType = CULong
public typealias SwordType = CLong
public typealias UwordType = CULong
public typealias Slong32Type = CInt
public typealias Ulong32Type = CUInt
public typealias S64Type = CLong
public typealias U64Type = CULong
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
    val eIdent: UByteArray,
    val eType: Elf64Half,
    val eMachine: Elf64Half,
    val eVersion: Elf64Word,
    val eEntry: Elf64Addr,
    val ePhoff: Elf64Off,
    val eShoff: Elf64Off,
    val eFlags: Elf64Word,
    val eEhsize: Elf64Half,
    val ePhentsize: Elf64Half,
    val ePhnum: Elf64Half,
    val eShentsize: Elf64Half,
    val eShnum: Elf64Half,
    val eShstrndx: Elf64Half,
)

public data class Elf64Shdr(
    val shName: Elf64Word,
    val shType: Elf64Word,
    val shFlags: Elf64Xword,
    val shAddr: Elf64Addr,
    val shOffset: Elf64Off,
    val shSize: Elf64Xword,
    val shLink: Elf64Word,
    val shInfo: Elf64Word,
    val shAddralign: Elf64Xword,
    val shEntsize: Elf64Xword,
)

public data class Elf64Sym(
    val stName: Elf64Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf64Section,
    val stValue: Elf64Addr,
    val stSize: Elf64Xword,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)
