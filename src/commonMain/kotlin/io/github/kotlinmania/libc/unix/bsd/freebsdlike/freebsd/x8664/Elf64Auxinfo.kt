// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public data class Elf64Auxinfo(
    val aType: Long,
    val aUn: CAnonymousElf64AuxvUnion,
)
