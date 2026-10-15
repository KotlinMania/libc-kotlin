// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class RusageInfoV3(
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
    val riChildUserTime: ULong,
    val riChildSystemTime: ULong,
    val riChildPkgIdleWkups: ULong,
    val riChildInterruptWkups: ULong,
    val riChildPageins: ULong,
    val riChildElapsedAbstime: ULong,
    val riDiskioBytesread: ULong,
    val riDiskioByteswritten: ULong,
    val riCpuTimeQosDefault: ULong,
    val riCpuTimeQosMaintenance: ULong,
    val riCpuTimeQosBackground: ULong,
    val riCpuTimeQosUtility: ULong,
    val riCpuTimeQosLegacy: ULong,
    val riCpuTimeQosUserInitiated: ULong,
    val riCpuTimeQosUserInteractive: ULong,
    val riBilledSystemTime: ULong,
    val riServicedSystemTime: ULong,
)
