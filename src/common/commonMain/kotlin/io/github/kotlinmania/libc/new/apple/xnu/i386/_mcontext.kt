// port-lint: source new/apple/xnu/i386/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.i386

// Header: `i386 / _mcontext.h`
//
// <https://github.com/apple-oss-distributions/xnu/blob/main/bsd/i386/_mcontext.h>

public open class DarwinMcontext64(
    public var es: DarwinX86ExceptionState64,
    public var ss: DarwinX86ThreadState64,
    public var fs: DarwinX86FloatState64,
)

public typealias McontextT = DarwinMcontext64?
