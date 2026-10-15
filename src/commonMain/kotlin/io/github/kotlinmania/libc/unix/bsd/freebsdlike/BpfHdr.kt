// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: UShort,
)
