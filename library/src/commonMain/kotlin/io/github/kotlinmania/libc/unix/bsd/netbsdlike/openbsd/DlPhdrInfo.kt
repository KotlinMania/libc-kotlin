package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiName: String?,
    val dlpiPhdr: io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.Elf64Phdr?,
    val dlpiPhnum: UShort,
)
