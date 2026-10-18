package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousPtpPeroutRequest1(
    val start: PtpClockTime? = null,
    val phase: PtpClockTime? = null,
)
