// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Tpacket2Hdr(
    val tpStatus: UInt,
    val tpLen: UInt,
    val tpSnaplen: UInt,
    val tpMac: UShort,
    val tpNet: UShort,
    val tpSec: UInt,
    val tpNsec: UInt,
    val tpVlanTci: UShort,
    val tpVlanTpid: UShort,
    val tpPadding: List<UByte>,
)
