// port-lint: source new/apple/xnu/arm/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmExceptionState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmNeonState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmThreadState64

public typealias McontextT = DarwinMcontext64?

public data class DarwinMcontext64(
    val es: DarwinArmExceptionState64,
    val ss: DarwinArmThreadState64,
    val ns: DarwinArmNeonState64,
)
