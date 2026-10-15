// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class CtlInfo(
    val ctlId: UInt,
    val ctlName: ByteArray,
)
