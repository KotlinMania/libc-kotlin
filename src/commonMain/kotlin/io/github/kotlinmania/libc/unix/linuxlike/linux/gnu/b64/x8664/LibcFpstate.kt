// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class LibcFpstate(
    val cwd: UShort,
    val swd: UShort,
    val ftw: UShort,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcrMask: UInt,
    val st: List<LibcFpxreg>,
    val xmm: List<LibcXmmreg>,
    val private: ULongArray,
)
