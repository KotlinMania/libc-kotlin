// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class PtraceCoredump(
    val pcFd: Int,
    val pcFlags: UInt,
    val pcLimit: Long,
)
