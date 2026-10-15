// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhnum: UShort,
)
