// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PosixSpawnFileActionsEntryT(
    val faeAction: FaeAction,
    val faeFildes: Int,
    val faeData: CAnonymousPosixSpawnFae,
)
