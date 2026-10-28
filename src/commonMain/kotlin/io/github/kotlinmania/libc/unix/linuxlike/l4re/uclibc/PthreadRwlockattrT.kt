package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class PthreadRwlockattrT(
    val lockkind: Int,
    val pshared: Int,
)
