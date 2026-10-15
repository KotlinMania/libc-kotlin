// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcessorBasicInfo(
    val cpuType: Int,
    val cpuSubtype: Int,
    val running: Int,
    val slotNum: Int,
    val isMaster: Int,
)
