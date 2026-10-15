// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousPosixSpawnFae(
    val open: CAnonymousPosixSpawnFaeOpen? = null,
    val dup2: CAnonymousPosixSpawnFaeDup2? = null,
)
