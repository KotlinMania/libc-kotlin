// port-lint: source unix/bsd/netbsdlike/openbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*


public data class Sigcontext(
    val scMask: CInt,
    val scRa: CLong,
    val scSp: CLong,
    val scGp: CLong,
    val scTp: CLong,
    val scT: LongArray,
    val scS: LongArray,
    val scA: LongArray,
    val scSepc: CLong,
    val scF: LongArray,
    val scFcsr: CLong,
    val scCookie: CLong,
)

