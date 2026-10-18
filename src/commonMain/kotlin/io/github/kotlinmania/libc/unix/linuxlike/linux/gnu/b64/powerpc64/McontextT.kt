package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public data class McontextT(
    val signal: Int,
    val handler: ULong,
    val oldmask: ULong,
    val regs: PtRegs?,
    val gpRegs: ULongArray,
    val fpRegs: ULongArray,
    val vRegs: VrregsetT?,
    val vmxReserve: LongArray,
)
