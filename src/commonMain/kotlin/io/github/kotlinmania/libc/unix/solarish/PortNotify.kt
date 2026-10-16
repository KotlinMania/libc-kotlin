package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class PortNotify(
    val portnfyPort: Int,
    val portnfyUser: COpaquePointer?,
)
