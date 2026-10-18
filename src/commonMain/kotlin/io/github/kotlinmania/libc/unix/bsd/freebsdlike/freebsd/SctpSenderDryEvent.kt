package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpSenderDryEvent(
    val senderDryType: UShort,
    val senderDryFlags: UShort,
    val senderDryLength: UInt,
    val senderDryAssocId: UInt,
)
