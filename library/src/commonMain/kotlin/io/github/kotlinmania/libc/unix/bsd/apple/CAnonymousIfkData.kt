package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfkData(
    val ifkPtr: COpaquePointer? = null,
    val ifkValue: Int? = null,
)
