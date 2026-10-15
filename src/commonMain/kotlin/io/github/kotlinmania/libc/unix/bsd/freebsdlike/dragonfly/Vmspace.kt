package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Vmspace(
    val vmMap: CAnonymousVmMap,
    val vmPmap: CAnonymousPmap,
    val vmFlags: Int,
    val vmShm: String?,
    val vmRssize: ULong,
    val vmSwrss: ULong,
    val vmTsize: ULong,
    val vmDsize: ULong,
    val vmSsize: ULong,
    val vmTaddr: String?,
    val vmDaddr: String?,
    val vmMaxsaddr: String?,
    val vmMinsaddr: String?,
    val vmPagesupply: Int,
    val vmHoldcnt: UInt,
    val vmRefcnt: UInt,
)
