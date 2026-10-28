package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public data class UmtxTime(
    val timeout: Timespec,
    val flags: UInt,
    val clockid: UInt,
)
