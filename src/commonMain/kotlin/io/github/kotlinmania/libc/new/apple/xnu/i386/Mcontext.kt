// port-lint: source new/apple/xnu/i386/_mcontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.i386

import io.github.kotlinmania.libc.*

/**
 * Header: `i386/_mcontext.h`.
 */

public data class DarwinMcontext64(
    val es: DarwinX86ExceptionState64,
    val ss: DarwinX86ThreadState64,
    val fs: DarwinX86FloatState64,
)

public typealias McontextT = DarwinMcontext64?
