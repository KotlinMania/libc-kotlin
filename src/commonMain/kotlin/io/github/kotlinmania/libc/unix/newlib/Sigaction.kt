// port-lint: source unix/newlib/mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: ((Int) -> Unit)?,
    val saMask: SigsetT,
    val saFlags: Int,
)
