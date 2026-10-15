// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class MachHeader(
    val magic: UInt,
    val cputype: Int,
    val cpusubtype: Int,
    val filetype: UInt,
    val ncmds: UInt,
    val sizeofcmds: UInt,
    val flags: UInt,
)
