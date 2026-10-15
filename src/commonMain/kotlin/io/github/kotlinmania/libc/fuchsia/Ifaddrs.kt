// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Ifaddrs(
    val ifaNext: Ifaddrs?,
    val ifaName: String?,
    val ifaFlags: UInt,
    val ifaAddr: Sockaddr?,
    val ifaNetmask: Sockaddr?,
    val ifaIfu: Sockaddr?,
    val ifaData: COpaquePointer?,
)
