// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadCond(
    val lock: Int,
    val queue: Pthread?,
    val attr: PthreadCondattr?,
    val wrefs: UInt,
    val data: COpaquePointer?,
)
