package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class AuditinfoT(
    val aiAuid: UInt,
    val aiMask: AuMaskT,
    val aiTermid: AuTidT,
    val aiAsid: Int,
)
