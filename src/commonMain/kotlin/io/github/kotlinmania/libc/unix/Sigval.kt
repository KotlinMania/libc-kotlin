// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Sigval(
    val sivalPtr: COpaquePointer?,
)
