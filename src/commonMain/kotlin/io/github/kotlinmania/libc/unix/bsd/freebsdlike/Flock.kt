// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class Flock(
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
    val lType: Short,
    val lWhence: Short,
    val lSysid: Int,
)
