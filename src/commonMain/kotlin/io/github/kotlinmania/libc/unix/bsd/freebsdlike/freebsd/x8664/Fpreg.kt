// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public data class Fpreg(
    val fprEnv: ULongArray,
    val fprAcc: List<UByteArray>,
    val fprXacc: List<UByteArray>,
    val fprSpare: ULongArray,
)
