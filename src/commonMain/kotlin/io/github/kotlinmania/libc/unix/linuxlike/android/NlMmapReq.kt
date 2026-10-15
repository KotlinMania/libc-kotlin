// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class NlMmapReq(
    val nmBlockSize: UInt,
    val nmBlockNr: UInt,
    val nmFrameSize: UInt,
    val nmFrameNr: UInt,
)
