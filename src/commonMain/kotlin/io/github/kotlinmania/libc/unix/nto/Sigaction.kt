// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saFlags: Int,
    val saMask: SigsetT,
)
