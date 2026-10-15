package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Tls12CryptoInfoChacha20Poly1305(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)
