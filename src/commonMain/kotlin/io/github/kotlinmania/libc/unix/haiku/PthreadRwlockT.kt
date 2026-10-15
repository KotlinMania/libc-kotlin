// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val flags: UInt,
    val owner: Int,
    val lockSem: Int,
    val lockCount: Int,
    val readerCount: Int,
    val writerCount: Int,
    val waiters: LongArray,
)
