// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/_types/_ucontext.h`.
 */

public data class DarwinUcontext(
    val ucOnstack: CInt,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucLink: DarwinUcontext?,
    val ucMcsize: ULong,
    val ucMcontext: McontextT,
)

public typealias UcontextT = DarwinUcontext
