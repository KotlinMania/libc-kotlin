// port-lint: source unix/linux_like/android/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val lock: PthreadMutexT,
    val cond: PthreadCondT,
    val numLocks: Int,
    val writerThreadId: Int,
    val pendingReaders: Int,
    val pendingWriters: Int,
    val attr: Int,
)
