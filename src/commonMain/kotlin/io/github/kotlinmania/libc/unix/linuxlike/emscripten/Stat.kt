// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: UInt,
    val stInoTruncated: Long,
    val stMode: UInt,
    val stNlink: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: UInt,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Int,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stIno: ULong,
)
