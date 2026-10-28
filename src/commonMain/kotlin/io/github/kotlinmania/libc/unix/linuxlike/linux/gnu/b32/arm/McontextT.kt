package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.arm

import io.github.kotlinmania.libc.*

public data class McontextT(
    val trapNo: ULong,
    val errorCode: ULong,
    val oldmask: ULong,
    val armR0: ULong,
    val armR1: ULong,
    val armR2: ULong,
    val armR3: ULong,
    val armR4: ULong,
    val armR5: ULong,
    val armR6: ULong,
    val armR7: ULong,
    val armR8: ULong,
    val armR9: ULong,
    val armR10: ULong,
    val armFp: ULong,
    val armIp: ULong,
    val armSp: ULong,
    val armLr: ULong,
    val armPc: ULong,
    val armCpsr: ULong,
    val faultAddress: ULong,
)
