package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val cLock: PthreadFastlock,
    val cWaiting: io.github.kotlinmania.libc.COpaquePointer?,
    val padding: UByteArray,
    val align: Long,
)
