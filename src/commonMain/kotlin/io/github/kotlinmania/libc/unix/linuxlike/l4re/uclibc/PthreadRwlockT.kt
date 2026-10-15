package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val rwLock: PthreadFastlock,
    val rwReaders: Int,
    val rwWriter: io.github.kotlinmania.libc.COpaquePointer?,
    val rwReadWaiting: io.github.kotlinmania.libc.COpaquePointer?,
    val rwWriteWaiting: io.github.kotlinmania.libc.COpaquePointer?,
    val rwKind: Int,
    val rwPshared: Int,
)
