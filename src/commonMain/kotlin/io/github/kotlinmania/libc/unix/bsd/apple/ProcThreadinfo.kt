// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcThreadinfo(
    val pthUserTime: ULong,
    val pthSystemTime: ULong,
    val pthCpuUsage: Int,
    val pthPolicy: Int,
    val pthRunState: Int,
    val pthFlags: Int,
    val pthSleepTime: Int,
    val pthCurpri: Int,
    val pthPriority: Int,
    val pthMaxpriority: Int,
    val pthName: ByteArray,
)
