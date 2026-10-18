// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types
import io.github.kotlinmania.libc.unix.bsd.apple.StackT

import io.github.kotlinmania.libc.*

public data class DarwinUcontext(
    val ucOnstack: Int,
    val ucSigmask: ULong,
    val ucStack: StackT,
    val ucLink: io.github.kotlinmania.libc.new.apple.xnu.sys.types.DarwinUcontext?,
    val ucMcsize: ULong,
    val ucMcontext: COpaquePointer?,
)
