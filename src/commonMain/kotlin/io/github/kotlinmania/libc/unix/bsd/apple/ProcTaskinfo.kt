// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcTaskinfo(
    val ptiVirtualSize: ULong,
    val ptiResidentSize: ULong,
    val ptiTotalUser: ULong,
    val ptiTotalSystem: ULong,
    val ptiThreadsUser: ULong,
    val ptiThreadsSystem: ULong,
    val ptiPolicy: Int,
    val ptiFaults: Int,
    val ptiPageins: Int,
    val ptiCowFaults: Int,
    val ptiMessagesSent: Int,
    val ptiMessagesReceived: Int,
    val ptiSyscallsMach: Int,
    val ptiSyscallsUnix: Int,
    val ptiCsw: Int,
    val ptiThreadnum: Int,
    val ptiNumrunning: Int,
    val ptiPriority: Int,
)
