// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class CAnonymousPosixSpawnFaeOpen(
    val path: String?,
    val oflag: Int,
    val mode: UInt,
)
