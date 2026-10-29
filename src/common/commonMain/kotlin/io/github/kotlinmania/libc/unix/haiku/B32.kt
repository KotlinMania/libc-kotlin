// port-lint: source unix/haiku/b32.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

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
