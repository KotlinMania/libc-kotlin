// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpExttsEvent(
    val t: PtpClockTime,
    val index: UInt,
    val flags: UInt,
    val rsv: UIntArray,
)
