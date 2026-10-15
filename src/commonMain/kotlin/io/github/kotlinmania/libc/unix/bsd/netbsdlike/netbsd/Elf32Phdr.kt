// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

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
