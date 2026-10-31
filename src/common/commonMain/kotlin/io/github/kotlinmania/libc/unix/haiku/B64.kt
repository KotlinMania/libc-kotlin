// port-lint: source unix/haiku/b64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public typealias TimeT = Long
public typealias ElfAddr = ULong
public typealias ElfHalf = UShort
public typealias ElfPhdr = Elf64Phdr

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
