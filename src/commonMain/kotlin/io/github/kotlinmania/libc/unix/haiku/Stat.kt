// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: Int,
    val stIno: Long,
    val stMode: UInt,
    val stNlink: Int,
    val stUid: UInt,
    val stGid: UInt,
    val stSize: Long,
    val stRdev: Int,
    val stBlksize: Int,
    val stAtime: Int,
    val stAtimeNsec: Long,
    val stMtime: Int,
    val stMtimeNsec: Long,
    val stCtime: Int,
    val stCtimeNsec: Long,
    val stCrtime: Int,
    val stCrtimeNsec: Long,
    val stType: UInt,
    val stBlocks: Long,
)
