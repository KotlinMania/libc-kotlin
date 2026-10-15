package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class McontextT(
    val gregs: List<Int>,
    val fpregs: LibcFpstate?,
    val oldmask: ULong,
    val cr2: ULong,
)
