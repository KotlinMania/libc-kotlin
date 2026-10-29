package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class PtraceScRemote(
    val pscrRet: PtraceScRet,
    val pscrSyscall: UInt,
    val pscrNargs: UInt,
    val pscrArgs: Long?,
)
