// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val cLock: PthreadFastlock,
    val cWaiting: io.github.kotlinmania.libc.COpaquePointer?,
    val padding: UByteArray,
    val align: Long,
)
