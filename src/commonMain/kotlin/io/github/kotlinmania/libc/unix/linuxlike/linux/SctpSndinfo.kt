// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpSndinfo(
    val sndSid: UShort,
    val sndFlags: UShort,
    val sndPpid: UInt,
    val sndContext: UInt,
    val sndAssocId: Int,
)
