// port-lint: source unix/linux_like/linux/gnu/b64/powerpc64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public data class PtRegs(
    val gpr: ULongArray,
    val nip: ULong,
    val msr: ULong,
    val origGpr3: ULong,
    val ctr: ULong,
    val link: ULong,
    val xer: ULong,
    val ccr: ULong,
    val softe: ULong,
    val trap: ULong,
    val dar: ULong,
    val dsisr: ULong,
    val result: ULong,
)
