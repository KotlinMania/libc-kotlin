package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiAddr2: UInt,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhdr2: Elf32Phdr?,
    val dlpiPhnum: UShort,
    val dlpiPhnum2: UShort,
    val dlpiAdds: ULong,
    val dlpiSubs: ULong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)
