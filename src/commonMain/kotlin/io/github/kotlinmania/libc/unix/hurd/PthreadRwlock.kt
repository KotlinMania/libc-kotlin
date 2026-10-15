// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadRwlock(
    val held: Int,
    val lock: Int,
    val readers: Int,
    val readerqueue: Pthread?,
    val writerqueue: Pthread?,
    val attr: PthreadRwlockattr?,
    val data: COpaquePointer?,
)
