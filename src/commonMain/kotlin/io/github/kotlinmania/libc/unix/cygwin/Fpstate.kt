// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Fpstate(
    val cwd: UShort,
    val swd: UShort,
    val ftw: UShort,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcrMask: UInt,
    val st: List<UcFpxreg>,
    val xmm: List<UcXmmreg>,
)
