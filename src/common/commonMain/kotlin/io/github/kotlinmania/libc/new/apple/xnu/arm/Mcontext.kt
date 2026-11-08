// port-lint: source new/apple/xnu/arm/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.arm

import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmExceptionState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmThreadState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.DarwinArmNeonState64

// Header: `arm / _mcontext.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/bsd/arm/_mcontext.h>

public open class DarwinMcontext64(
    public var es: DarwinArmExceptionState64,
    public var ss: DarwinArmThreadState64,
    public var ns: DarwinArmNeonState64,
)

public typealias McontextT = DarwinMcontext64?
