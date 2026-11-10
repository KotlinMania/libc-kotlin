@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(4)) {
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

public data class ClockidT(public var value: COpaquePointer? = null) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public data class FposT(public var data: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FposT) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

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
    public var tmGmtoff: CInt = 0,
    public var tmZone: COpaquePointer? = null,
    public var tmNsec: CInt = 0,
)

public data class Timeval(public var tvSec: TimeT = 0L, public var tvUsec: SusecondsT = 0L)

public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: CLong = 0L)

public data class Tms(
    public var tmsUtime: ClockT = 0L,
    public var tmsStime: ClockT = 0L,
    public var tmsCutime: ClockT = 0L,
    public var tmsCstime: ClockT = 0L,
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

public data class Iovec(public var iovBase: COpaquePointer? = null, public var iovLen: SizeT = 0uL)

public class Lconv(
    public var decimalPoint: COpaquePointer? = null,
    public var thousandsSep: COpaquePointer? = null,
    public var grouping: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var currencySymbol: COpaquePointer? = null,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var positiveSign: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var intFracDigits: CChar = 0u,
    public var fracDigits: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
)

public data class Rusage(public var ruUtime: Timeval = Timeval(), public var ruStime: Timeval = Timeval())

public data class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var pad0: CUint = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var reserved: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stat) return false
        if (this.stDev != other.stDev) return false
        if (this.stIno != other.stIno) return false
        if (this.stNlink != other.stNlink) return false
        if (this.stMode != other.stMode) return false
        if (this.stUid != other.stUid) return false
        if (this.stGid != other.stGid) return false
        if (this.pad0 != other.pad0) return false
        if (this.stRdev != other.stRdev) return false
        if (this.stSize != other.stSize) return false
        if (this.stBlksize != other.stBlksize) return false
        if (this.stBlocks != other.stBlocks) return false
        if (this.stAtim != other.stAtim) return false
        if (this.stMtim != other.stMtim) return false
        if (this.stCtim != other.stCtim) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stDev.hashCode()
        result = 31 * result + this.stIno.hashCode()
        result = 31 * result + this.stNlink.hashCode()
        result = 31 * result + this.stMode.hashCode()
        result = 31 * result + this.stUid.hashCode()
        result = 31 * result + this.stGid.hashCode()
        result = 31 * result + this.pad0.hashCode()
        result = 31 * result + this.stRdev.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.stAtim.hashCode()
        result = 31 * result + this.stMtim.hashCode()
        result = 31 * result + this.stCtim.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FdSet(public var nfds: Int = 0, public var fds: IntArray = IntArray(FD_SETSIZE.toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (this.nfds != other.nfds) return false
        if (!this.fds.contentEquals(other.fds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nfds.hashCode()
        result = 31 * result + this.fds.contentHashCode()
        return result
    }
}

public data class PthreadAttrT(public var size: LongArray = LongArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.size.contentHashCode()
    }
}

public data class PthreadMutexattrT(public var attr: CUint = 0u)

public data class PthreadCondattrT(public var attr: CUint = 0u)

public data class PthreadBarrierattrT(public var attr: CUint = 0u)

public data class PthreadRwlockattrT(public var attr: UIntArray = UIntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.attr.contentEquals(other.attr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.attr.contentHashCode()
    }
}

public data class PthreadCondT(public var size: List<COpaquePointer> = List(12) { COpaquePointer(0L) })

public data class PthreadMutexT(public var size: List<COpaquePointer> = List(6) { COpaquePointer(0L) })

public data class PthreadRwlockT(public var size: List<COpaquePointer> = List(8) { COpaquePointer(0L) })

public data class PthreadBarrierT(public var size: List<COpaquePointer> = List(5) { COpaquePointer(0L) })

// Declare dirent outside of s! so that it doesn't implement Copy, Eq, Hash,
// etc., since it contains a flexible array member with a dynamic size.
public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dType: CUchar = 0u,
    /**
     * dName is declared in WASI libc as a flexible array member, which
     * can't be directly expressed in Rust. As an imperfect workaround,
     * declare it as a zero-length array instead.
     */
    public var dName: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}
