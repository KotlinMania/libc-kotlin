// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Tms(
    val tmsUtime: Long,
    val tmsStime: Long,
    val tmsCutime: Long,
    val tmsCstime: Long,
)
