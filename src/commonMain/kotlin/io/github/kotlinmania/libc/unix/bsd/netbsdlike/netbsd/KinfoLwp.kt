// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class KinfoLwp(
    val lForw: ULong,
    val lBack: ULong,
    val lLaddr: ULong,
    val lAddr: ULong,
    val lLid: Int,
    val lFlag: Int,
    val lSwtime: UInt,
    val lSlptime: UInt,
    val lSchedflags: Int,
    val lHoldcnt: Int,
    val lPriority: UByte,
    val lUsrpri: UByte,
    val lStat: Byte,
    val lWmesg: ByteArray,
    val lWchan: ULong,
    val lCpuid: ULong,
    val lRtimeSec: UInt,
    val lRtimeUsec: UInt,
    val lCpticks: UInt,
    val lPctcpu: UInt,
    val lPid: UInt,
    val lName: ByteArray,
)
