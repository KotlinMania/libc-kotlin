// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lZero1: Int,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
    val lSysid: UInt,
)
