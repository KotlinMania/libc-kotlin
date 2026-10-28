package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Elf64Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: ULong,
    val shAddr: ULong,
    val shOffset: ULong,
    val shSize: ULong,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: ULong,
    val shEntsize: ULong,
)
