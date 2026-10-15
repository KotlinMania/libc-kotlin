// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class PropInfo(
    val name: ByteArray,
    val serial: UInt,
    val value: ByteArray,
)
