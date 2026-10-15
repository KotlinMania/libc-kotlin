// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: ULong,
    val saMask: SigsetT,
    val saFlags: Int,
    val saUser: ULong,
)
