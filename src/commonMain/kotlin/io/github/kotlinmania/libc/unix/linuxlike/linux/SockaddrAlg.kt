// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SockaddrAlg(
    val salgFamily: UShort,
    val salgType: UByteArray,
    val salgFeat: UInt,
    val salgMask: UInt,
    val salgName: UByteArray,
)
