// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Arpreq(
    val arpPa: Sockaddr,
    val arpHa: Sockaddr,
    val arpFlags: Int,
    val arpNetmask: Sockaddr,
    val arpDev: ByteArray,
)
