// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Tls12CryptoInfoAesGcm128(
    val info: TlsCryptoInfo,
    val iv: UByteArray,
    val key: UByteArray,
    val salt: UByteArray,
    val recSeq: UByteArray,
)
