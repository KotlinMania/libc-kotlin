// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saFlags: ULong,
    val saRestorer: (() -> Unit)?,
    val saMask: ULong,
)
