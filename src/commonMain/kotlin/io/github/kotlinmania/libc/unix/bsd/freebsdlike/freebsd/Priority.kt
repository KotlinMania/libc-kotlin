// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Priority(
    val priClass: UByte,
    val priLevel: UByte,
    val priNative: UByte,
    val priUser: UByte,
)
