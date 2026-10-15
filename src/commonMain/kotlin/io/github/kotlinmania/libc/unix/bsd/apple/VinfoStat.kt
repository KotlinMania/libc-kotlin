// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VinfoStat(
    val vstDev: UInt,
    val vstMode: UShort,
    val vstNlink: UShort,
    val vstIno: ULong,
    val vstUid: UInt,
    val vstGid: UInt,
    val vstAtime: Long,
    val vstAtimensec: Long,
    val vstMtime: Long,
    val vstMtimensec: Long,
    val vstCtime: Long,
    val vstCtimensec: Long,
    val vstBirthtime: Long,
    val vstBirthtimensec: Long,
    val vstSize: Long,
    val vstBlocks: Long,
    val vstBlksize: Int,
    val vstFlags: UInt,
    val vstGen: UInt,
    val vstRdev: UInt,
    val vstQspare: LongArray,
)
