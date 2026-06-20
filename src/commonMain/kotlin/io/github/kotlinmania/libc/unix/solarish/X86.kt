// port-lint: source unix/solarish/x86.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public typealias Elf32Addr = CULong

public typealias Elf32Half = CUShort

public typealias Elf32Off = CULong

public typealias Elf32Sword = CLong

public typealias Elf32Word = CULong

public typealias Elf32Lword = CULongLong

public typealias Elf32Phdr = CAnonymousElf32Phdr

public data class CAnonymousElf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf32Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf32Phdr?,
    val dlpiPhnum: Elf32Half,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
)
