// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types.ucontext

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.xnu.arm.mcontext.McontextT
import io.github.kotlinmania.libc.unix.bsd.apple.SigsetT
import io.github.kotlinmania.libc.unix.bsd.apple.StackT

// Header: `sys / _types / _ucontext.h`

public data class DarwinUcontext(
    public var ucOnstack: CInt = 0,
    public var ucSigmask: SigsetT = 0u,
    public var ucStack: StackT = StackT(),
    public var ucLink: DarwinUcontext? = null,
    public var ucMcsize: Int = 0,
    public var ucMcontext: McontextT = null,
)

public typealias UcontextT = DarwinUcontext
