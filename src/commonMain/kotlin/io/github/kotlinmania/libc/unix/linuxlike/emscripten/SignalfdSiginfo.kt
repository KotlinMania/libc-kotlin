package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class SignalfdSiginfo(
    val ssiSigno: UInt,
    val ssiErrno: Int,
    val ssiCode: Int,
    val ssiPid: UInt,
    val ssiUid: UInt,
    val ssiFd: Int,
    val ssiTid: UInt,
    val ssiBand: UInt,
    val ssiOverrun: UInt,
    val ssiTrapno: UInt,
    val ssiStatus: Int,
    val ssiInt: Int,
    val ssiPtr: ULong,
    val ssiUtime: ULong,
    val ssiStime: ULong,
    val ssiAddr: ULong,
    val ssiAddrLsb: UShort,
    val ssiSyscall: Int,
    val ssiCallAddr: ULong,
    val ssiArch: UInt,
)
