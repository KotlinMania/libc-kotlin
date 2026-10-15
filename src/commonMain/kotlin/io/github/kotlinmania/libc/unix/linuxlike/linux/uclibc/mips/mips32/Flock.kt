// port-lint: source unix/linux_like/linux/uclibc/mips/mips32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Int,
    val lLen: Int,
    val lSysid: Long,
    val lPid: Int,
)
