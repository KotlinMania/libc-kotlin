// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Splice(
    val spFd: Int,
    val spMax: Long,
    val spIdle: Timeval,
)
