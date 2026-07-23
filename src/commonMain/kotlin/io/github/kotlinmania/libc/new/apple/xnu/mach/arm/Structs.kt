// port-lint: source new/apple/xnu/mach/arm/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.arm

import io.github.kotlinmania.libc.*

public data class DarwinArmExceptionState64(
    val far: ULong,
    val esr: UInt,
    val exception: UInt,
)

public data class DarwinArmThreadState64(
    val x: ULongArray,
    val fp: ULong,
    val lr: ULong,
    val sp: ULong,
    val pc: ULong,
    val cpsr: UInt,
    val pad: UInt,
)

public data class DarwinArmNeonState64(
    val v: List<Uint128T>,
    val fpsr: UInt,
    val fpcr: UInt,
)

    val opaque: ByteArray,
)
