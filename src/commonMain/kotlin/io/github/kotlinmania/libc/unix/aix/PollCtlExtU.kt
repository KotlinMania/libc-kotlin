package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class PollCtlExtU(
    val addr: COpaquePointer? = null,
    val data32: UInt? = null,
    val data: ULong? = null,
)
