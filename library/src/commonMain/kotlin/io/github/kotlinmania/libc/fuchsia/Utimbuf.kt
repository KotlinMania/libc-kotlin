package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Utimbuf(
    val actime: Long,
    val modtime: Long,
)
