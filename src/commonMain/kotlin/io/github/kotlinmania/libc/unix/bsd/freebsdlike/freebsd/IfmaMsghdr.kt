// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfmaMsghdr(
    val ifmamMsglen: UShort,
    val ifmamVersion: UByte,
    val ifmamType: UByte,
    val ifmamAddrs: Int,
    val ifmamFlags: Int,
    val ifmamIndex: UShort,
    val ifmamSpare1: UShort,
)
