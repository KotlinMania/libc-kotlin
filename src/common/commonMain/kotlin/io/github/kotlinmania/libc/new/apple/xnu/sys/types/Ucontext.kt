// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.xnu.arm.McontextT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.StackT

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
