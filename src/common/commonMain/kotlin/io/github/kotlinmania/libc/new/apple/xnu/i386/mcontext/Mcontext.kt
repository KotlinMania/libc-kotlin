// port-lint: source new/apple/xnu/i386/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.i386.mcontext

import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.structs.DarwinX86ExceptionState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.structs.DarwinX86FloatState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.structs.DarwinX86ThreadState64
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `i386 / _mcontext.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/bsd/i386/_mcontext.h>

public data class DarwinMcontext64(
    public var es: DarwinX86ExceptionState64 = DarwinX86ExceptionState64(),
    public var ss: DarwinX86ThreadState64 = DarwinX86ThreadState64(),
    public var fs: DarwinX86FloatState64 = DarwinX86FloatState64(),
)

public typealias McontextT = MutPtr<DarwinMcontext64>
