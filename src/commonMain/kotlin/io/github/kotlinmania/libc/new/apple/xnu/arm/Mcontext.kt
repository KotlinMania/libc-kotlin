// port-lint: source new/apple/xnu/arm/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.arm

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias McontextT = DarwinMcontext64?

public data class DarwinMcontext64(
    val es: DarwinArmExceptionState64,
    val ss: DarwinArmThreadState64,
    val ns: DarwinArmNeonState64,
)
