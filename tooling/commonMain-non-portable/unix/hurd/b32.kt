// port-lint: source unix/hurd/b32.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

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

public typealias SquadType = io.github.kotlinmania.libc.Int64T

public typealias UquadType = io.github.kotlinmania.libc.Uint64T

public typealias SwordType = CInt

public typealias UwordType = CUint

public typealias Slong32Type = CLong

public typealias Ulong32Type = CUlong

public typealias S64Type = io.github.kotlinmania.libc.Int64T

public typealias U64Type = io.github.kotlinmania.libc.Uint64T

public typealias IpcPidT = CUshort

public typealias Elf32Half = UShort

public typealias Elf32Word = UInt

public typealias Elf32Off = UInt

public typealias Elf32Addr = UInt

public typealias Elf32Section = UShort

public typealias ElfAddr = io.github.kotlinmania.libc.Elf32Addr

public typealias ElfHalf = io.github.kotlinmania.libc.Elf32Half

public typealias ElfEhdr = io.github.kotlinmania.libc.Elf32Ehdr

public typealias ElfPhdr = io.github.kotlinmania.libc.Elf32Phdr

public typealias ElfShdr = io.github.kotlinmania.libc.Elf32Shdr

public typealias ElfSym = io.github.kotlinmania.libc.Elf32Sym

public open class Elf32Ehdr(
    public var eIdent: List<CUchar>,
    public var eType: Elf32Half,
    public var eMachine: Elf32Half,
    public var eVersion: Elf32Word,
    public var eEntry: Elf32Addr,
    public var ePhoff: Elf32Off,
    public var eShoff: Elf32Off,
    public var eFlags: Elf32Word,
    public var eEhsize: Elf32Half,
    public var ePhentsize: Elf32Half,
    public var ePhnum: Elf32Half,
    public var eShentsize: Elf32Half,
    public var eShnum: Elf32Half,
    public var eShstrndx: Elf32Half,
)

public open class Elf32Shdr(
    public var shName: Elf32Word,
    public var shType: Elf32Word,
    public var shFlags: Elf32Word,
    public var shAddr: Elf32Addr,
    public var shOffset: Elf32Off,
    public var shSize: Elf32Word,
    public var shLink: Elf32Word,
    public var shInfo: Elf32Word,
    public var shAddralign: Elf32Word,
    public var shEntsize: Elf32Word,
)

public open class Elf32Sym(
    public var stName: Elf32Word,
    public var stValue: Elf32Addr,
    public var stSize: Elf32Word,
    public var stInfo: CUchar,
    public var stOther: CUchar,
    public var stShndx: Elf32Section,
)

public open class Elf32Phdr(
    public var pType: io.github.kotlinmania.libc.Elf32Word,
    public var pOffset: io.github.kotlinmania.libc.Elf32Off,
    public var pVaddr: io.github.kotlinmania.libc.Elf32Addr,
    public var pPaddr: io.github.kotlinmania.libc.Elf32Addr,
    public var pFilesz: io.github.kotlinmania.libc.Elf32Word,
    public var pMemsz: io.github.kotlinmania.libc.Elf32Word,
    public var pFlags: io.github.kotlinmania.libc.Elf32Word,
    public var pAlign: io.github.kotlinmania.libc.Elf32Word,
)
