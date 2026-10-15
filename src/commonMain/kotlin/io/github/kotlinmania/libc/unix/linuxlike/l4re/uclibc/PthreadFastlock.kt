package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadFastlock(
    val status: Long,
    val spinlock: Int,
)
