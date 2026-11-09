@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
// note this is the struct called stat64 in Windows. Not stat, nor stati64.
public data class Stat(
    public var stDev: DevT = 0u,
    public var stIno: InoT = 0u,
    public var stMode: UShort = 0u,
    public var stNlink: CShort = 0,
    public var stUid: CShort = 0,
    public var stGid: CShort = 0,
    public var stRdev: DevT = 0u,
    public var stSize: Long = 0L,
    public var stAtime: Time64T = 0L,
    public var stMtime: Time64T = 0L,
    public var stCtime: Time64T = 0L,
)

// note that this is called utimbuf64 in Windows
public data class Utimbuf(public var actime: Time64T = 0L, public var modtime: Time64T = 0L)

public data class Tm(
    public var tmSec: CInt = 0,
    public var tmMin: CInt = 0,
    public var tmHour: CInt = 0,
    public var tmMday: CInt = 0,
    public var tmMon: CInt = 0,
    public var tmYear: CInt = 0,
    public var tmWday: CInt = 0,
    public var tmYday: CInt = 0,
    public var tmIsdst: CInt = 0,
)

public data class Timeval(public var tvSec: CLong = 0L, public var tvUsec: CLong = 0L)

public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: CLong = 0L)

public data class Sockaddr(public var saFamily: CUshort = 0u, public var saData: UByteArray = UByteArray(14)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}
