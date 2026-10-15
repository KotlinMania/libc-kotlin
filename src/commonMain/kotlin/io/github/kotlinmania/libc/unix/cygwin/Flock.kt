// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
