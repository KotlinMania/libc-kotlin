// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class DlPhdrInfo(
    val dlpiAddr: UInt,
    val dlpiName: String?,
    val dlpiPhdr: io.github.kotlinmania.libc.unix.hurd.Elf32Phdr?,
    val dlpiPhnum: UShort,
    val dlpiAdds: ULong,
    val dlpiSubs: ULong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)
