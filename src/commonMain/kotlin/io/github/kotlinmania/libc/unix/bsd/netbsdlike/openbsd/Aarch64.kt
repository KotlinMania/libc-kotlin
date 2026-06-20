// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias UcontextT = Sigcontext

// __sc_unused is layout padding.
public data class Sigcontext(
    val scMask: CInt,
    val scSp: CULong,
    val scLr: CULong,
    val scElr: CULong,
    val scSpsr: CULong,
    val scX: ULongArray,
    val scCookie: CLong,
) {
    init {
        require(scX.size == 30) { "sc_x must be 30 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Sigcontext
        return scMask == other.scMask && scSp == other.scSp && scLr == other.scLr &&
            scElr == other.scElr && scSpsr == other.scSpsr && scX.contentEquals(other.scX) &&
            scCookie == other.scCookie
    }

    override fun hashCode(): Int = 31 * scMask + scX.contentHashCode()
}

// _ALIGNBYTES = size_of::<c_long>() - 1
internal const val ALIGNBYTES: Int = 7

public const val MAX_PAGE_SHIFT: UInt = 12u
