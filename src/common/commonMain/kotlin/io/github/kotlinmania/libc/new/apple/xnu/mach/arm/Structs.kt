// port-lint: source new/apple/xnu/mach/arm/_structs.rs
package io.github.kotlinmania.libc.new.apple.xnu.mach.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Uint128T

// Header: `arm / _structs.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/osfmk/mach/arm/_structs.h>

public open class DarwinArmExceptionState64(
    public var far: ULong,
    public var esr: UInt,
    public var exception: UInt,
)

public open class DarwinArmThreadState64(
    public var x: List<ULong>,
    public var fp: ULong,
    public var lr: ULong,
    public var sp: ULong,
    public var pc: ULong,
    public var cpsr: UInt,
    public var pad: UInt,
)

public open class DarwinArmNeonState64(
    public var v: List<Uint128T>,
    public var fpsr: UInt,
    public var fpcr: UInt,
)
