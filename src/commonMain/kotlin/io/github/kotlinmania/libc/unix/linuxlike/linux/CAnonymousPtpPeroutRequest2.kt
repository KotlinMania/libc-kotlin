package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousPtpPeroutRequest2(
    val on: PtpClockTime? = null,
    val rsv: UIntArray? = null,
)
