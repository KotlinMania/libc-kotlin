package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfAnnouncemsghdr(
    val ifanMsglen: UShort,
    val ifanVersion: UByte,
    val ifanType: UByte,
    val ifanIndex: UShort,
    val ifanName: ByteArray,
    val ifanWhat: UShort,
)
