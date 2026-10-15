// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpRcvinfo(
    val rcvSid: UShort,
    val rcvSsn: UShort,
    val rcvFlags: UShort,
    val rcvPpid: UInt,
    val rcvTsn: UInt,
    val rcvCumtsn: UInt,
    val rcvContext: UInt,
    val rcvAssocId: Int,
)
