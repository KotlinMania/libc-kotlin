// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpNxtinfo(
    val nxtSid: UShort,
    val nxtFlags: UShort,
    val nxtPpid: UInt,
    val nxtLength: UInt,
    val nxtAssocId: Int,
)
