// port-lint: source unix/newlib/generic.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class SigsetT(
    val value: UInt,
)

public data class Stat(
    val stDev: Short,
    val stIno: UShort,
    val stMode: UInt,
    val stNlink: UShort,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: Short,
    val stSize: Long,
    val stAtime: Long,
    val stSpare1: Long,
    val stMtime: Long,
    val stSpare2: Long,
    val stCtime: Long,
    val stSpare3: Long,
    val stBlksize: Int,
    val stBlocks: Int,
    val stSpare4: LongArray,
)

public data class Dirent(
    val dIno: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
