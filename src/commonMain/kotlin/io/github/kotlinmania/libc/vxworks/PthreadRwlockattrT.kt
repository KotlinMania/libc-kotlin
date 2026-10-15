// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadRwlockattrT(
    val rwlockAttrStatus: Int,
    val rwlockAttrPshared: Int,
    val rwlockAttrMaxReaders: UInt,
    val rwlockAttrConformOpt: UInt,
)
