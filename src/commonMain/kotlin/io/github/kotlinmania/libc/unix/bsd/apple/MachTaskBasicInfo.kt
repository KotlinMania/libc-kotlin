// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class MachTaskBasicInfo(
    val virtualSize: ULong,
    val residentSize: ULong,
    val residentSizeMax: ULong,
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
    val policy: Int,
    val suspendCount: Int,
)
