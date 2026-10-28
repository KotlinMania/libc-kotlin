// port-lint: source unix/bsd/freebsdlike/freebsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Gpregs(
    val gpX: List<Long>,
    val gpLr: Long,
    val gpSp: Long,
    val gpElr: Long,
    val gpSpsr: UInt,
    val gpPad: Int,
)

public data class Fpregs(
    val fpQ: ByteArray,
    val fpSr: UInt,
    val fpCr: UInt,
    val fpFlags: Int,
    val fpPad: Int,
)

public data class McontextT(
    val mcGpregs: Gpregs,
    val mcFpregs: Fpregs,
    val mcFlags: Int,
    val mcPad: Int,
    val mcSpare: ULongArray,
)

public const val BIOCSRTIMEOUT: ULong = 0x8010426duL
public const val BIOCGRTIMEOUT: ULong = 0x4010426euL
public const val MAP_32BIT: Int = 0x00080000
public const val MINSIGSTKSZ: ULong = 4096uL
public const val TIOCTIMESTAMP: ULong = 0x40107459uL
