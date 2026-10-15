// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PtraceLwpstatus(
    val plLwpid: Int,
    val plSigpend: SigsetT,
    val plSigmask: SigsetT,
    val plName: ByteArray,
    val plPrivate: COpaquePointer?,
)
