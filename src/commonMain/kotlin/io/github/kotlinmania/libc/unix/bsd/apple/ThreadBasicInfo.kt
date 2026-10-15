// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ThreadBasicInfo(
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
    val cpuUsage: Int,
    val policy: Int,
    val runState: Int,
    val flags: Int,
    val suspendCount: Int,
    val sleepTime: Int,
)
