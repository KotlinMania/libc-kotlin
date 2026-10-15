// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Pollfd(
    val fd: Int,
    val events: Short,
    val revents: Short,
)
