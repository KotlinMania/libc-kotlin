// port-lint: source new/glibc/sysdeps/unix/linux/net/route.rs
package io.github.kotlinmania.libc.new.glibc.sysdeps.unix.linux.net.route

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.Sockaddr

// Header: `net / route.h`
//
// Source header: `sysdeps / unix / sysv / linux / net / route.h`
// <https://github.com/bminor/glibc/blob/master/sysdeps/unix/sysv/linux/net/route.h>

public data class Rtentry(
    public var rtPad1: CUlong = 0uL,
    public var rtDst: Sockaddr = Sockaddr(),
    public var rtGateway: Sockaddr = Sockaddr(),
    public var rtGenmask: Sockaddr = Sockaddr(),
    public var rtFlags: CUshort = 0u,
    public var rtPad2: CShort = 0,
    public var rtPad3: CUlong = 0uL,
    public var rtTos: CUchar = 0u,
    public var rtClass: CUchar = 0u,
    // Note(1.0): private padding fields
    public var rtPad4: ShortArray = ShortArray(3),
    public var rtMetric: CShort = 0,
    public var rtDev: COpaquePointer? = null,
    public var rtMtu: CUlong = 0uL,
    public var rtWindow: CUlong = 0uL,
    public var rtIrtt: CUshort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rtentry) return false
        if (this.rtPad1 != other.rtPad1) return false
        if (this.rtDst != other.rtDst) return false
        if (this.rtGateway != other.rtGateway) return false
        if (this.rtGenmask != other.rtGenmask) return false
        if (this.rtFlags != other.rtFlags) return false
        if (this.rtPad2 != other.rtPad2) return false
        if (this.rtPad3 != other.rtPad3) return false
        if (this.rtTos != other.rtTos) return false
        if (this.rtClass != other.rtClass) return false
        if (!this.rtPad4.contentEquals(other.rtPad4)) return false
        if (this.rtMetric != other.rtMetric) return false
        if (this.rtDev != other.rtDev) return false
        if (this.rtMtu != other.rtMtu) return false
        if (this.rtWindow != other.rtWindow) return false
        if (this.rtIrtt != other.rtIrtt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rtPad1.hashCode()
        result = 31 * result + this.rtDst.hashCode()
        result = 31 * result + this.rtGateway.hashCode()
        result = 31 * result + this.rtGenmask.hashCode()
        result = 31 * result + this.rtFlags.hashCode()
        result = 31 * result + this.rtPad2.hashCode()
        result = 31 * result + this.rtPad3.hashCode()
        result = 31 * result + this.rtTos.hashCode()
        result = 31 * result + this.rtClass.hashCode()
        result = 31 * result + this.rtPad4.contentHashCode()
        result = 31 * result + this.rtMetric.hashCode()
        result = 31 * result + this.rtDev.hashCode()
        result = 31 * result + this.rtMtu.hashCode()
        result = 31 * result + this.rtWindow.hashCode()
        result = 31 * result + this.rtIrtt.hashCode()
        return result
    }
}
