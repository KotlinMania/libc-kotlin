// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Elf32Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: UInt,
    val shAddr: UInt,
    val shOffset: UInt,
    val shSize: UInt,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: UInt,
    val shEntsize: UInt,
)
