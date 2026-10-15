// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UByte,
    val saData: ByteArray,
)
