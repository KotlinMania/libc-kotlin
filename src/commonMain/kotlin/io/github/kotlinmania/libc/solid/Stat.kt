// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: Short,
    val stNlink: Short,
    val stUid: Short,
    val stGid: Short,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Long,
    val stMtime: Long,
    val stCtime: Long,
    val stBlksize: Int,
)
