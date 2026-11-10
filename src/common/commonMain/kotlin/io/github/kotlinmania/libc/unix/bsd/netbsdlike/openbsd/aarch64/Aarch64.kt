// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong

public typealias UcontextT = Sigcontext

public data class Sigcontext(
    public var scUnused: CInt = 0,
    public var scMask: CInt = 0,
    public var scSp: CUlong = 0uL,
    public var scLr: CUlong = 0uL,
    public var scElr: CUlong = 0uL,
    public var scSpsr: CUlong = 0uL,
    public var scX: ULongArray = ULongArray(30),
    public var scCookie: CLong = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigcontext) return false
        if (this.scUnused != other.scUnused) return false
        if (this.scMask != other.scMask) return false
        if (this.scSp != other.scSp) return false
        if (this.scLr != other.scLr) return false
        if (this.scElr != other.scElr) return false
        if (this.scSpsr != other.scSpsr) return false
        if (!this.scX.contentEquals(other.scX)) return false
        if (this.scCookie != other.scCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUnused.hashCode()
        result = 31 * result + this.scMask.hashCode()
        result = 31 * result + this.scSp.hashCode()
        result = 31 * result + this.scLr.hashCode()
        result = 31 * result + this.scElr.hashCode()
        result = 31 * result + this.scSpsr.hashCode()
        result = 31 * result + this.scX.contentHashCode()
        result = 31 * result + this.scCookie.hashCode()
        return result
    }
}

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = 8 - 1
