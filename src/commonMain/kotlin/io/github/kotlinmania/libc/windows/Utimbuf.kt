// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public data class Utimbuf(
    val actime: Long,
    val modtime: Long,
)
