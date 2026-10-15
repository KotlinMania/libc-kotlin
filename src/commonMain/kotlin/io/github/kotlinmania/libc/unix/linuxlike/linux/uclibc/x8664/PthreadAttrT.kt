// port-lint: source unix/linux_like/linux/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class PthreadAttrT(
    val detachstate: Int,
    val schedpolicy: Int,
    val schedparam: SchedParam,
    val inheritsched: Int,
    val scope: Int,
    val guardsize: ULong,
    val stackaddrSet: Int,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
)
