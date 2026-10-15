// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Pollfd(
    val fd: Int,
    val events: Short,
    var revents: Short,
)
