package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class LockObject(
    val loName: String?,
    val loFlags: UInt,
    val loData: UInt,
    val loWitness: COpaquePointer?,
)
