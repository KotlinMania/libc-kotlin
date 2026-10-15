package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class SemT(
    val size: ByteArray? = null,
    val align: Long? = null,
)
