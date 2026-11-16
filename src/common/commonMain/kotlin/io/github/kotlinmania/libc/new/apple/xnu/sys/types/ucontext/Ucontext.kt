// port-lint: source new/apple/xnu/sys/_types/_ucontext.rs
package io.github.kotlinmania.libc.new.apple.xnu.sys.types.ucontext

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.xnu.arm.mcontext.McontextT
import io.github.kotlinmania.libc.unix.bsd.apple.SigsetT
import io.github.kotlinmania.libc.unix.bsd.apple.StackT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `sys / _types / _ucontext.h`

public class DarwinUcontext internal constructor(
    public var ucOnstack: CInt,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucLinkCtorArg: MutPtr,
    public var ucMcsize: Int,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucOnstack = 0,
        ucSigmask = 0u,
        ucStack = StackT(),
        ucLinkCtorArg = MutPtr(0L),
        ucMcsize = 0,
        ucMcontextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.ucOnstack

    public operator fun component2(): SigsetT = this.ucSigmask

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): MutPtr = this.ucLink

    public operator fun component5(): Int = this.ucMcsize

    public operator fun component6(): McontextT = this.ucMcontext

    public fun copy(ucOnstack: CInt = this.ucOnstack, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucLink: MutPtr = this.ucLink, ucMcsize: Int = this.ucMcsize, ucMcontext: McontextT = this.ucMcontext): DarwinUcontext = DarwinUcontext(ucOnstack = ucOnstack, ucSigmask = ucSigmask, ucStack = ucStack, ucLinkCtorArg = ucLink, ucMcsize = ucMcsize, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DarwinUcontext) return false
        if (this.ucOnstack != other.ucOnstack) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucMcsize != other.ucMcsize) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucOnstack.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucMcsize.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucOnstack: CInt = 0,
            ucSigmask: SigsetT = 0u,
            ucStack: StackT = StackT(),
            ucLink: MutPtr = MutPtr(0L),
            ucMcsize: Int = 0,
            ucMcontext: McontextT = MutPtr(0L),
        ): DarwinUcontext =
            DarwinUcontext(
                ucOnstack = ucOnstack,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucLinkCtorArg = ucLink,
                ucMcsize = ucMcsize,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}

public typealias UcontextT = DarwinUcontext
