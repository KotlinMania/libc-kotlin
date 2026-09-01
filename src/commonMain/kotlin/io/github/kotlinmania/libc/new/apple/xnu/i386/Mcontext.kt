// port-lint: source new/apple/xnu/i386/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.i386

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.DarwinX86ExceptionState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.DarwinX86FloatState64
import io.github.kotlinmania.libc.new.apple.xnu.mach.i386.DarwinX86ThreadState64

public typealias McontextT = DarwinMcontext64?

public data class DarwinMcontext64(
    val es: DarwinX86ExceptionState64,
    val ss: DarwinX86ThreadState64,
    val fs: DarwinX86FloatState64,
)
