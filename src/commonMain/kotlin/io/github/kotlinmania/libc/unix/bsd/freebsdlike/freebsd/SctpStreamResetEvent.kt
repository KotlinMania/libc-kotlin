// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpStreamResetEvent(
    val strresetType: UShort,
    val strresetFlags: UShort,
    val strresetLength: UInt,
    val strresetAssocId: UInt,
    val strresetStreamList: UShortArray,
)
