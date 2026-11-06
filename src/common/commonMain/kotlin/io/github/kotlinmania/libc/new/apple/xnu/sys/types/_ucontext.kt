// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.StackT

// Header: `sys / _types / _ucontext.h`

public open class DarwinUcontext(
    public var ucOnstack: CInt,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucLink: DarwinUcontext?,
    public var ucMcsize: Int,
    public var ucMcontext: McontextT,
)

public typealias UcontextT = DarwinUcontext
