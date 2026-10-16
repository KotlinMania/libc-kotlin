package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val numLocks: Int,
    val writerThreadId: Int,
    val pendingReaders: Int,
    val pendingWriters: Int,
    val attr: Int,
)
