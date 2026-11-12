// port-lint: source unix/haiku/x86_64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku.x8664

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.haiku.SigsetT
import io.github.kotlinmania.libc.unix.haiku.StackT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class FpuState(
    public var control: CUshort = 0u,
    public var status: CUshort = 0u,
    public var tag: CUshort = 0u,
    public var opcode: CUshort = 0u,
    public var rip: CUlong = 0uL,
    public var rdp: CUlong = 0uL,
    public var mxcsr: CUint = 0u,
    public var mscsrMask: CUint = 0u,
    public var fpreg: List<UByteArray> = List(16) { UByteArray(0) },
    public var xmm: List<UByteArray> = List(16) { UByteArray(0) },
    public var reserved416511: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FpuState) return false
        if (this.control != other.control) return false
        if (this.status != other.status) return false
        if (this.tag != other.tag) return false
        if (this.opcode != other.opcode) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mscsrMask != other.mscsrMask) return false
        if (this.fpreg != other.fpreg) return false
        if (this.xmm != other.xmm) return false
        if (!this.reserved416511.contentEquals(other.reserved416511)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.control.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.opcode.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mscsrMask.hashCode()
        result = 31 * result + this.fpreg.hashCode()
        result = 31 * result + this.xmm.hashCode()
        result = 31 * result + this.reserved416511.contentHashCode()
        return result
    }
}

public data class XstateHdr(
    public var bv: CUlong = 0uL,
    public var xcompBv: CUlong = 0uL,
    public var reserved: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateHdr) return false
        if (this.bv != other.bv) return false
        if (this.xcompBv != other.xcompBv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bv.hashCode()
        result = 31 * result + this.xcompBv.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Savefpu(
    public var fpFxsave: FpuState = FpuState(),
    public var fpXstate: XstateHdr = XstateHdr(),
    public var fpYmm: List<UByteArray> = List(16) { UByteArray(0) },
)

public class McontextT(
    public var rax: CUlong = 0uL,
    public var rbx: CUlong = 0uL,
    public var rcx: CUlong = 0uL,
    public var rdx: CUlong = 0uL,
    public var rdi: CUlong = 0uL,
    public var rsi: CUlong = 0uL,
    public var rbp: CUlong = 0uL,
    public var r8: CUlong = 0uL,
    public var r9: CUlong = 0uL,
    public var r10: CUlong = 0uL,
    public var r11: CUlong = 0uL,
    public var r12: CUlong = 0uL,
    public var r13: CUlong = 0uL,
    public var r14: CUlong = 0uL,
    public var r15: CUlong = 0uL,
    public var rsp: CUlong = 0uL,
    public var rip: CUlong = 0uL,
    public var rflags: CUlong = 0uL,
    public var fpu: Savefpu = Savefpu(),
)

public class UcontextT internal constructor(
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = 0uL,
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
    )

    public operator fun component1(): MutPtr<UcontextT> = this.ucLink

    public operator fun component2(): SigsetT = this.ucSigmask

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public fun copy(ucLink: MutPtr<UcontextT> = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext): UcontextT = UcontextT(ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucSigmask: SigsetT = 0uL,
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
        ): UcontextT =
            UcontextT(
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}
