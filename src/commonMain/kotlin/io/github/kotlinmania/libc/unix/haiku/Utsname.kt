// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
)
