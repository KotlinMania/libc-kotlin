// port-lint: source new/apple/libpthread/pthread_/sched.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class SchedParam(
    val schedPriority: CInt,
    val opaque: ByteArray,
)
