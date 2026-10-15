// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

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
