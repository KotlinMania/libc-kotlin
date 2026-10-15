// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Oifaliasreq(
    val ifraName: ByteArray,
    val ifraAddr: Sockaddr,
    val ifraBroadaddr: Sockaddr,
    val ifraMask: Sockaddr,
)
