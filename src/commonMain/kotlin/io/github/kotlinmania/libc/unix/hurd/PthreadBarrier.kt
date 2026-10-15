// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadBarrier(
    val lock: Int,
    val queue: Pthread?,
    val pending: UInt,
    val count: UInt,
    val attr: PthreadBarrierattr?,
    val data: COpaquePointer?,
)
