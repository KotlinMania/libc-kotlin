package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*

public data class McontextT(
    val gregs: List<Long>,
    val fpregs: LibcFpstate?,
    val private: ULongArray,
)
