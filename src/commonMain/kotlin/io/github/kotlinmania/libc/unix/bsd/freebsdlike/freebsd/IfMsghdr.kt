// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfMsghdr(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmIndex: UShort,
    val ifmSpare1: UShort,
    val ifmData: IfData,
)
