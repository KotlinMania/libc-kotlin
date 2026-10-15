// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketReq3(
    val tpBlockSize: UInt,
    val tpBlockNr: UInt,
    val tpFrameSize: UInt,
    val tpFrameNr: UInt,
    val tpRetireBlkTov: UInt,
    val tpSizeofPriv: UInt,
    val tpFeatureReqWord: UInt,
)
