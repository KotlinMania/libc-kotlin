// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class NlMmapHdr(
    val nmStatus: UInt,
    val nmLen: UInt,
    val nmGroup: UInt,
    val nmPid: UInt,
    val nmUid: UInt,
    val nmGid: UInt,
)
