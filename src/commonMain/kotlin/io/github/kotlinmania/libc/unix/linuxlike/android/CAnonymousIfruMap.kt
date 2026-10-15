// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class CAnonymousIfruMap(
    val memStart: ULong,
    val memEnd: ULong,
    val baseAddr: UShort,
    val irq: UByte,
    val dma: UByte,
    val port: UByte,
)
