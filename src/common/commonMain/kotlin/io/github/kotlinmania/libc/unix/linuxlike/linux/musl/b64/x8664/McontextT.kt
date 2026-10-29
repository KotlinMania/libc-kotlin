package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.x8664

import io.github.kotlinmania.libc.*

public data class McontextT(
    val gregs: List<Long>,
    val private: ULongArray,
)
