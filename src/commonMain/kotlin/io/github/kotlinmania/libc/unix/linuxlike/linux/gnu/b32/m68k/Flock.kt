// port-lint: source unix/linux_like/linux/gnu/b32/m68k/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.m68k

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
