// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Elf32Sym(
    val stName: UInt,
    val stValue: UInt,
    val stSize: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
)
