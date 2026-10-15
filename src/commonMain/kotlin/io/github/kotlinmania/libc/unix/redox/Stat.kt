// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: Int,
    val stUid: Int,
    val stGid: Int,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: ULong,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
)
