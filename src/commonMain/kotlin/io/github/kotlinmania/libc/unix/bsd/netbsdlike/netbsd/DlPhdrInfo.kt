package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiName: String?,
    val dlpiPhdr: io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.Elf64Phdr?,
    val dlpiPhnum: UShort,
    val dlpiAdds: ULong,
    val dlpiSubs: ULong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)
