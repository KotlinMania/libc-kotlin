package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class RusageInfoV0(
    val riUuid: UByteArray,
    val riUserTime: ULong,
    val riSystemTime: ULong,
    val riPkgIdleWkups: ULong,
    val riInterruptWkups: ULong,
    val riPageins: ULong,
    val riWiredSize: ULong,
    val riResidentSize: ULong,
    val riPhysFootprint: ULong,
    val riProcStartAbstime: ULong,
    val riProcExitAbstime: ULong,
)
