// port-lint: source unix/haiku/b64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public typealias TimeT = Long
public typealias ElfAddr = Elf64Addr
public typealias ElfHalf = Elf64Half
public typealias ElfPhdr = Elf64Phdr

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
