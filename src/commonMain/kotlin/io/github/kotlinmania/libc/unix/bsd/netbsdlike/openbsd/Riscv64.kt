// port-lint: source unix/bsd/netbsdlike/openbsd/riscv64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public typealias UcontextT = Sigcontext

// __sc_unused is layout padding.
public data class Sigcontext(
    val scMask: CInt,
    val scRa: CLong,
    val scSp: CLong,
    val scGp: CLong,
    val scTp: CLong,
    val scT: LongArray,
    val scS: LongArray,
    val scA: LongArray,
    val scSepc: CLong,
    val scF: LongArray,
    val scFcsr: CLong,
    val scCookie: CLong,
) {
    init {
        require(scT.size == 7) { "sc_t must be 7 entries" }
        require(scS.size == 12) { "sc_s must be 12 entries" }
        require(scA.size == 8) { "sc_a must be 8 entries" }
        require(scF.size == 32) { "sc_f must be 32 entries" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Sigcontext
        return scMask == other.scMask && scRa == other.scRa && scSp == other.scSp && scGp == other.scGp &&
            scTp == other.scTp && scT.contentEquals(other.scT) && scS.contentEquals(other.scS) &&
            scA.contentEquals(other.scA) && scSepc == other.scSepc && scF.contentEquals(other.scF) &&
            scFcsr == other.scFcsr && scCookie == other.scCookie
    }

    override fun hashCode(): Int {
        var result = scMask
        result = 31 * result + scT.contentHashCode()
        result = 31 * result + scS.contentHashCode()
        result = 31 * result + scA.contentHashCode()
        result = 31 * result + scF.contentHashCode()
        return result
    }
}

// _ALIGNBYTES = size_of::<c_long>() - 1
internal const val ALIGNBYTES: Int = 7

public const val MAX_PAGE_SHIFT: UInt = 12u
