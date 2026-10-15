// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: Int,
    val stNlink: ULong,
    val stUid: UShort,
    val stGid: UShort,
    val stRdev: ULong,
    val stSize: Long,
    val stAtim: Timespec,
    val stAtime: Long,
    val stMtim: Timespec,
    val stMtime: Long,
    val stCtim: Timespec,
    val stCtime: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAttrib: UByte,
)
