// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: SigsetT,
    val saFlags: Int,
    val saRestorer: (() -> Unit)?,
)
