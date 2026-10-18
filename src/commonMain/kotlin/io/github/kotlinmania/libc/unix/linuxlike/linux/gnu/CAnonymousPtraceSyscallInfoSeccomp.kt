package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class CAnonymousPtraceSyscallInfoSeccomp(
    val nr: ULong,
    val args: List<ULong>,
    val retData: UInt,
)
