// port-lint: source unix/hurd/b64.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

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
