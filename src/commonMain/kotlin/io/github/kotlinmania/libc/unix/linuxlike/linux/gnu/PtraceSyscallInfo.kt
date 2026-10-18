package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class PtraceSyscallInfo(
    val op: UByte,
    val pad: List<UByte>,
    val arch: UInt,
    val instructionPointer: ULong,
    val stackPointer: ULong,
    val u: CAnonymousPtraceSyscallInfoData,
)
