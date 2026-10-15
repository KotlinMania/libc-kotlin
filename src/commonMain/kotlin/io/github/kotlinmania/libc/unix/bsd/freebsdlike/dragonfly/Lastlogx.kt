// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Lastlogx(
    val llTv: Timeval,
    val llLine: ByteArray,
    val llHost: ByteArray,
    val llSs: SockaddrStorage,
)
