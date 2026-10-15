// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpRcvinfo(
    val rcvSid: UShort,
    val rcvSsn: UShort,
    val rcvFlags: UShort,
    val rcvPpid: UInt,
    val rcvTsn: UInt,
    val rcvCumtsn: UInt,
    val rcvContext: UInt,
    val rcvAssocId: UInt,
)
