// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpNxtinfo(
    val nxtSid: UShort,
    val nxtFlags: UShort,
    val nxtPpid: UInt,
    val nxtLength: UInt,
    val nxtAssocId: UInt,
)
