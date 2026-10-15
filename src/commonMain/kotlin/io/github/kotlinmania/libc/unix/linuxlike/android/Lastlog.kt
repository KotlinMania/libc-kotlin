// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Lastlog(
    val llTime: Long,
    val llLine: ByteArray,
    val llHost: ByteArray,
)
