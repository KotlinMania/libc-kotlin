// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpInitmsg(
    val sinitNumOstreams: UShort,
    val sinitMaxInstreams: UShort,
    val sinitMaxAttempts: UShort,
    val sinitMaxInitTimeo: UShort,
)
