// port-lint: source unix/linux_like/linux/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
