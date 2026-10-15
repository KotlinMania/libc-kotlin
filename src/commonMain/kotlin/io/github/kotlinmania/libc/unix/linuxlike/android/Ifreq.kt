package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)
