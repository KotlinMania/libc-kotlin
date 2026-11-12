// port-lint: source unix/bsd/netbsdlike/openbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.riscv64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout

public typealias UcontextT = Sigcontext

public data class Sigcontext(
    public var scUnused: CInt = 0,
    public var scMask: CInt = 0,
    public var scRa: CLong = 0L,
    public var scSp: CLong = 0L,
    public var scGp: CLong = 0L,
    public var scTp: CLong = 0L,
    public var scT: LongArray = LongArray(7),
    public var scS: LongArray = LongArray(12),
    public var scA: LongArray = LongArray(8),
    public var scSepc: CLong = 0L,
    public var scF: LongArray = LongArray(32),
    public var scFcsr: CLong = 0L,
    public var scCookie: CLong = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigcontext) return false
        if (this.scUnused != other.scUnused) return false
        if (this.scMask != other.scMask) return false
        if (this.scRa != other.scRa) return false
        if (this.scSp != other.scSp) return false
        if (this.scGp != other.scGp) return false
        if (this.scTp != other.scTp) return false
        if (!this.scT.contentEquals(other.scT)) return false
        if (!this.scS.contentEquals(other.scS)) return false
        if (!this.scA.contentEquals(other.scA)) return false
        if (this.scSepc != other.scSepc) return false
        if (!this.scF.contentEquals(other.scF)) return false
        if (this.scFcsr != other.scFcsr) return false
        if (this.scCookie != other.scCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUnused.hashCode()
        result = 31 * result + this.scMask.hashCode()
        result = 31 * result + this.scRa.hashCode()
        result = 31 * result + this.scSp.hashCode()
        result = 31 * result + this.scGp.hashCode()
        result = 31 * result + this.scTp.hashCode()
        result = 31 * result + this.scT.contentHashCode()
        result = 31 * result + this.scS.contentHashCode()
        result = 31 * result + this.scA.contentHashCode()
        result = 31 * result + this.scSepc.hashCode()
        result = 31 * result + this.scF.contentHashCode()
        result = 31 * result + this.scFcsr.hashCode()
        result = 31 * result + this.scCookie.hashCode()
        return result
    }
}

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
