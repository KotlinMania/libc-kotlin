package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class In6Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru6,
)
