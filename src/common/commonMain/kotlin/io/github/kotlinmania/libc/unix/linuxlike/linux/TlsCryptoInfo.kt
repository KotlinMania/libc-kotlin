package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TlsCryptoInfo(
    val version: UShort,
    val cipherType: UShort,
)
