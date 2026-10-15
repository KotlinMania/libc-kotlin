// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

public data class Xmmreg(
    val xmmEnv: UIntArray,
    val xmmAcc: List<UByteArray>,
    val xmmReg: List<UByteArray>,
    val xmmPad: UByteArray,
)
