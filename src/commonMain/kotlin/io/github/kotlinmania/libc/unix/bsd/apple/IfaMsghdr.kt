// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class IfaMsghdr(
    val ifamMsglen: UShort,
    val ifamVersion: UByte,
    val ifamType: UByte,
    val ifamAddrs: Int,
    val ifamFlags: Int,
    val ifamIndex: UShort,
    val ifamMetric: Int,
)
