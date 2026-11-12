// port-lint: source new/glibc/sysdeps/unix/linux/net/route.rs
package io.github.kotlinmania.libc.new.glibc.sysdeps.unix.linux.net.route

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.Sockaddr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `net / route.h`
//
// Source header: `sysdeps / unix / sysv / linux / net / route.h`
// <https://github.com/bminor/glibc/blob/master/sysdeps/unix/sysv/linux/net/route.h>

public class Rtentry internal constructor(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    // Note(1.0): private padding fields
    public var rtPad4: ShortArray,
    public var rtMetric: CShort,
    rtDevCtorArg: MutPtr<CChar>,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
) {
    public var rtDev: MutPtr<CChar> = rtDevCtorArg
        internal set

    public constructor() : this(
        rtPad1 = 0uL,
        rtDst = Sockaddr(),
        rtGateway = Sockaddr(),
        rtGenmask = Sockaddr(),
        rtFlags = 0u,
        rtPad2 = 0,
        rtPad3 = 0uL,
        rtTos = 0u,
        rtClass = 0u,
        rtPad4 = ShortArray(3),
        rtMetric = 0,
        rtDevCtorArg = MutPtr(0L),
        rtMtu = 0uL,
        rtWindow = 0uL,
        rtIrtt = 0u,
    )

    public operator fun component1(): CUlong = this.rtPad1

    public operator fun component2(): Sockaddr = this.rtDst

    public operator fun component3(): Sockaddr = this.rtGateway

    public operator fun component4(): Sockaddr = this.rtGenmask

    public operator fun component5(): CUshort = this.rtFlags

    public operator fun component6(): CShort = this.rtPad2

    public operator fun component7(): CUlong = this.rtPad3

    public operator fun component8(): CUchar = this.rtTos

    public operator fun component9(): CUchar = this.rtClass

    public operator fun component10(): ShortArray = this.rtPad4

    public operator fun component11(): CShort = this.rtMetric

    public operator fun component12(): MutPtr<CChar> = this.rtDev

    public operator fun component13(): CUlong = this.rtMtu

    public operator fun component14(): CUlong = this.rtWindow

    public operator fun component15(): CUshort = this.rtIrtt

    public fun copy(rtPad1: CUlong = this.rtPad1, rtDst: Sockaddr = this.rtDst, rtGateway: Sockaddr = this.rtGateway, rtGenmask: Sockaddr = this.rtGenmask, rtFlags: CUshort = this.rtFlags, rtPad2: CShort = this.rtPad2, rtPad3: CUlong = this.rtPad3, rtTos: CUchar = this.rtTos, rtClass: CUchar = this.rtClass, rtPad4: ShortArray = this.rtPad4, rtMetric: CShort = this.rtMetric, rtDev: MutPtr<CChar> = this.rtDev, rtMtu: CUlong = this.rtMtu, rtWindow: CUlong = this.rtWindow, rtIrtt: CUshort = this.rtIrtt): Rtentry = Rtentry(rtPad1 = rtPad1, rtDst = rtDst, rtGateway = rtGateway, rtGenmask = rtGenmask, rtFlags = rtFlags, rtPad2 = rtPad2, rtPad3 = rtPad3, rtTos = rtTos, rtClass = rtClass, rtPad4 = rtPad4, rtMetric = rtMetric, rtDevCtorArg = rtDev, rtMtu = rtMtu, rtWindow = rtWindow, rtIrtt = rtIrtt)

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

    public companion object {
        public operator fun invoke(
            rtPad1: CUlong = 0uL,
            rtDst: Sockaddr = Sockaddr(),
            rtGateway: Sockaddr = Sockaddr(),
            rtGenmask: Sockaddr = Sockaddr(),
            rtFlags: CUshort = 0u,
            rtPad2: CShort = 0,
            rtPad3: CUlong = 0uL,
            rtTos: CUchar = 0u,
            rtClass: CUchar = 0u,
            rtPad4: ShortArray = ShortArray(3),
            rtMetric: CShort = 0,
            rtDev: MutPtr<CChar> = MutPtr(0L),
            rtMtu: CUlong = 0uL,
            rtWindow: CUlong = 0uL,
            rtIrtt: CUshort = 0u,
        ): Rtentry =
            Rtentry(
                rtPad1 = rtPad1,
                rtDst = rtDst,
                rtGateway = rtGateway,
                rtGenmask = rtGenmask,
                rtFlags = rtFlags,
                rtPad2 = rtPad2,
                rtPad3 = rtPad3,
                rtTos = rtTos,
                rtClass = rtClass,
                rtPad4 = rtPad4,
                rtMetric = rtMetric,
                rtDevCtorArg = rtDev,
                rtMtu = rtMtu,
                rtWindow = rtWindow,
                rtIrtt = rtIrtt,
            )
    }
}
