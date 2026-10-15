// port-lint: source unix/linux_like/l4re/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
