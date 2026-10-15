// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpSndinfo(
    val sndSid: UShort,
    val sndFlags: UShort,
    val sndPpid: UInt,
    val sndContext: UInt,
    val sndAssocId: UInt,
)
