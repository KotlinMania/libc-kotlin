// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val endian: ByteArray,
    val kernelversion: ByteArray,
    val releaseversion: ByteArray,
    val processor: ByteArray,
    val bsprevision: ByteArray,
    val builddate: ByteArray,
)
