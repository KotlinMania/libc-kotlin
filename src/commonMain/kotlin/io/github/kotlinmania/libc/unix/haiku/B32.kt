// port-lint: source unix/haiku/b32.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public typealias TimeT = Int
public typealias ElfAddr = Elf32Addr
public typealias ElfHalf = Elf32Half
public typealias ElfPhdr = Elf32Phdr

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
