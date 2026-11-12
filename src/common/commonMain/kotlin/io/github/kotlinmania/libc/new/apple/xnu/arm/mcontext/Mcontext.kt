// port-lint: source new/apple/xnu/arm/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.arm.mcontext

import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.structs.DarwinArmExceptionState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.structs.DarwinArmNeonState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.arm.structs.DarwinArmThreadState64
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `arm / _mcontext.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/bsd/arm/_mcontext.h>

public data class DarwinMcontext64(
    public var es: DarwinArmExceptionState64 = DarwinArmExceptionState64(),
    public var ss: DarwinArmThreadState64 = DarwinArmThreadState64(),
    public var ns: DarwinArmNeonState64 = DarwinArmNeonState64(),
)

public typealias McontextT = MutPtr<DarwinMcontext64>
