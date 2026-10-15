// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class ClockidT(
    val value: COpaquePointer?,
)
