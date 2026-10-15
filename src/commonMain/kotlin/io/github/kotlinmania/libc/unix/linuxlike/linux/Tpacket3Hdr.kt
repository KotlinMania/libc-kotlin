// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Tpacket3Hdr(
    val tpNextOffset: UInt,
    val tpSec: UInt,
    val tpNsec: UInt,
    val tpSnaplen: UInt,
    val tpLen: UInt,
    val tpStatus: UInt,
    val tpMac: UShort,
    val tpNet: UShort,
    val hv1: TpacketHdrVariant1,
    val tpPadding: List<UByte>,
)
