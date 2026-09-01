// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types

import io.github.kotlinmania.libc.*

public typealias UcontextT = DarwinUcontext

public data class DarwinUcontext(
    val ucOnstack: CInt,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucLink: UcontextT?,
    val ucMcsize: ULong,
    val ucMcontext: COpaquePointer?,
)
