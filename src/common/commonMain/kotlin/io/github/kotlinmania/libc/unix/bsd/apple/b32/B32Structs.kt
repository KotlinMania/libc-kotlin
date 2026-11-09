@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.Timeval

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiTypelen: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiUnused1: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiBaudrate: UInt = 0u,
    public var ifiIpackets: UInt = 0u,
    public var ifiIerrors: UInt = 0u,
    public var ifiOpackets: UInt = 0u,
    public var ifiOerrors: UInt = 0u,
    public var ifiCollisions: UInt = 0u,
    public var ifiIbytes: UInt = 0u,
    public var ifiObytes: UInt = 0u,
    public var ifiImcasts: UInt = 0u,
    public var ifiOmcasts: UInt = 0u,
    public var ifiIqdrops: UInt = 0u,
    public var ifiNoproto: UInt = 0u,
    public var ifiRecvtiming: UInt = 0u,
    public var ifiXmittiming: UInt = 0u,
    public var ifiLastchange: Timeval = Timeval(),
    public var ifiUnused2: UInt = 0u,
    public var ifiHwassist: UInt = 0u,
    public var ifiReserved1: UInt = 0u,
    public var ifiReserved2: UInt = 0u,
)

public data class BpfHdr(
    public var bhTstamp: Timeval = Timeval(),
    public var bhCaplen: UInt = 0u,
    public var bhDatalen: UInt = 0u,
    public var bhHdrlen: CUshort = 0u,
)

public data class MallocZoneT(public var private: ULongArray = ULongArray(18)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MallocZoneT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.private.contentHashCode()
    }
}

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}
