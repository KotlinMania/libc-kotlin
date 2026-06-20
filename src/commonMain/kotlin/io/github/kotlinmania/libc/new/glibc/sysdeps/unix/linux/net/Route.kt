// port-lint: source new/glibc/sysdeps/unix/linux/net/route.rs
package io.github.kotlinmania.libc.new.glibc.sysdeps.unix.linux.net

import io.github.kotlinmania.libc.*

/**
 * Header: `net/route.h`.
 */

// rt_pad4 is `[c_short; 3]` on 64-bit targets and a single `c_short` on 32-bit.
public data class Rtentry(
    val rtPad1: CULong,
    val rtDst: Sockaddr,
    val rtGateway: Sockaddr,
    val rtGenmask: Sockaddr,
    val rtFlags: CUShort,
    val rtPad2: CShort,
    val rtPad3: CULong,
    val rtTos: CUChar,
    val rtClass: CUChar,
    val rtPad4: ShortArray,
    val rtMetric: CShort,
    val rtDev: String?,
    val rtMtu: CULong,
    val rtWindow: CULong,
    val rtIrtt: CUShort,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Rtentry
        if (rtPad1 != other.rtPad1) return false
        if (rtDst != other.rtDst) return false
        if (rtGateway != other.rtGateway) return false
        if (rtGenmask != other.rtGenmask) return false
        if (rtFlags != other.rtFlags) return false
        if (rtPad2 != other.rtPad2) return false
        if (rtPad3 != other.rtPad3) return false
        if (rtTos != other.rtTos) return false
        if (rtClass != other.rtClass) return false
        if (!rtPad4.contentEquals(other.rtPad4)) return false
        if (rtMetric != other.rtMetric) return false
        if (rtDev != other.rtDev) return false
        if (rtMtu != other.rtMtu) return false
        if (rtWindow != other.rtWindow) return false
        if (rtIrtt != other.rtIrtt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = rtPad1.hashCode()
        result = 31 * result + rtDst.hashCode()
        result = 31 * result + rtGateway.hashCode()
        result = 31 * result + rtGenmask.hashCode()
        result = 31 * result + rtFlags.hashCode()
        result = 31 * result + rtPad2.hashCode()
        result = 31 * result + rtPad3.hashCode()
        result = 31 * result + rtTos.hashCode()
        result = 31 * result + rtClass.hashCode()
        result = 31 * result + rtPad4.contentHashCode()
        result = 31 * result + rtMetric.hashCode()
        result = 31 * result + (rtDev?.hashCode() ?: 0)
        result = 31 * result + rtMtu.hashCode()
        result = 31 * result + rtWindow.hashCode()
        result = 31 * result + rtIrtt.hashCode()
        return result
    }
}
