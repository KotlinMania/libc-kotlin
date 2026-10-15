// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadBarrierT(
    val baLock: PthreadFastlock,
    val baRequired: Int,
    val baPresent: Int,
    val baWaiting: io.github.kotlinmania.libc.COpaquePointer?,
)
