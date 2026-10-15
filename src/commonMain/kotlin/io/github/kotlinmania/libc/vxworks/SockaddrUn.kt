// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: UByte,
    val sunPath: ByteArray,
)
