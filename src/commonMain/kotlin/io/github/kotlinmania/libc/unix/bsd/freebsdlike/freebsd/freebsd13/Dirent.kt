// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd13/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dFileno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UShort,
    val dName: ByteArray,
)
