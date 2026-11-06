// port-lint: source unix/hurd/b64.rs
package io.github.kotlinmania.libc.unix.hurd

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

public open class Elf64Ehdr(
    public var eIdent: List<CUchar>,
    public var eType: Elf64Half,
    public var eMachine: Elf64Half,
    public var eVersion: Elf64Word,
    public var eEntry: Elf64Addr,
    public var ePhoff: Elf64Off,
    public var eShoff: Elf64Off,
    public var eFlags: Elf64Word,
    public var eEhsize: Elf64Half,
    public var ePhentsize: Elf64Half,
    public var ePhnum: Elf64Half,
    public var eShentsize: Elf64Half,
    public var eShnum: Elf64Half,
    public var eShstrndx: Elf64Half,
)

public open class Elf64Shdr(
    public var shName: Elf64Word,
    public var shType: Elf64Word,
    public var shFlags: Elf64Xword,
    public var shAddr: Elf64Addr,
    public var shOffset: Elf64Off,
    public var shSize: Elf64Xword,
    public var shLink: Elf64Word,
    public var shInfo: Elf64Word,
    public var shAddralign: Elf64Xword,
    public var shEntsize: Elf64Xword,
)

public open class Elf64Sym(
    public var stName: Elf64Word,
    public var stInfo: CUchar,
    public var stOther: CUchar,
    public var stShndx: Elf64Section,
    public var stValue: Elf64Addr,
    public var stSize: Elf64Xword,
)

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)
