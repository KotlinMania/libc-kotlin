// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PosixSpawnFileActionsT(
    val allocated: Int,
    val used: Int,
    val actions: Int?,
)
