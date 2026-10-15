// port-lint: source unix/linux_like/linux/uclibc/mips/mips64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips64

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
