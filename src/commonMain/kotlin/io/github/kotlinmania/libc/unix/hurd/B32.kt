// port-lint: source unix/hurd/b32.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Elf32Ehdr(
    val eIdent: UByteArray,
    val eType: UShort,
    val eMachine: UShort,
    val eVersion: UInt,
    val eEntry: UInt,
    val ePhoff: UInt,
    val eShoff: UInt,
    val eFlags: UInt,
    val eEhsize: UShort,
    val ePhentsize: UShort,
    val ePhnum: UShort,
    val eShentsize: UShort,
    val eShnum: UShort,
    val eShstrndx: UShort,
)

public data class Elf32Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: UInt,
    val shAddr: UInt,
    val shOffset: UInt,
    val shSize: UInt,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: UInt,
    val shEntsize: UInt,
)

public data class Elf32Sym(
    val stName: UInt,
    val stValue: UInt,
    val stSize: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
)

public data class Elf32Phdr(
    val pType: UInt,
    val pOffset: UInt,
    val pVaddr: UInt,
    val pPaddr: UInt,
    val pFilesz: UInt,
    val pMemsz: UInt,
    val pFlags: UInt,
    val pAlign: UInt,
)
