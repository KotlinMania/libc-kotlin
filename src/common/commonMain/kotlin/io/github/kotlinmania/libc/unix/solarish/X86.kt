// port-lint: source unix/solarish/x86.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public typealias Elf32Addr = ULong
public typealias Elf32Half = UShort
public typealias Elf32Off = ULong
public typealias Elf32Sword = Long
public typealias Elf32Word = ULong
public typealias Elf32Lword = ULong
public typealias Elf32Phdr = CAnonymousElf32Phdr

public data class CAnonymousElf32Phdr(
    val pType: ULong,
    val pOffset: ULong,
    val pVaddr: ULong,
    val pPaddr: ULong,
    val pFilesz: ULong,
    val pMemsz: ULong,
    val pFlags: ULong,
    val pAlign: ULong,
)

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiName: String?,
    val dlpiPhdr: io.github.kotlinmania.libc.unix.solarish.CAnonymousElf32Phdr?,
    val dlpiPhnum: UShort,
    val dlpiAdds: ULong,
    val dlpiSubs: ULong,
)
