// port-lint: source unix/hurd/b64.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public typealias Int64T = Long
public typealias Uint64T = ULong

public typealias IntFast16T = Long
public typealias IntFast32T = Long
public typealias IntFast64T = Long
public typealias UintFast16T = ULong
public typealias UintFast32T = ULong
public typealias UintFast64T = ULong

public typealias QuadT = Long
public typealias UQuadT = ULong
public typealias IntmaxT = Long
public typealias UintmaxT = ULong

public typealias SquadType = Long
public typealias UquadType = ULong
public typealias SwordType = Long
public typealias UwordType = ULong
public typealias Slong32Type = Int
public typealias Ulong32Type = UInt
public typealias S64Type = Long
public typealias U64Type = ULong

public typealias IpcPidT = Int

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
    val eType: UShort,
    val eMachine: UShort,
    val eVersion: UInt,
    val eEntry: ULong,
    val ePhoff: ULong,
    val eShoff: ULong,
    val eFlags: UInt,
    val eEhsize: UShort,
    val ePhentsize: UShort,
    val ePhnum: UShort,
    val eShentsize: UShort,
    val eShnum: UShort,
    val eShstrndx: UShort,
)

public data class Elf64Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: ULong,
    val shAddr: ULong,
    val shOffset: ULong,
    val shSize: ULong,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: ULong,
    val shEntsize: ULong,
)

public data class Elf64Sym(
    val stName: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
    val stValue: ULong,
    val stSize: ULong,
)

public data class Elf64Phdr(
    val pType: UInt,
    val pFlags: UInt,
    val pOffset: ULong,
    val pVaddr: ULong,
    val pPaddr: ULong,
    val pFilesz: ULong,
    val pMemsz: ULong,
    val pAlign: ULong,
)
