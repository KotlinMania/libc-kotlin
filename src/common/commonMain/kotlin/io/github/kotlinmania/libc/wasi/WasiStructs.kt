package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint

public open class MaxAlignT(public var priv: List<Double>)

public open class ClockidT(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class FposT(public var data: List<UByte>)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CInt,
    public var tmZone: COpaquePointer?,
    public var tmNsec: CInt,
)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Tms(
    public var tmsUtime: ClockT,
    public var tmsStime: ClockT,
    public var tmsCutime: ClockT,
    public var tmsCstime: ClockT,
)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

public open class Rusage(public var ruUtime: Timeval, public var ruStime: Timeval)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stMode: ModeT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var pad0: CUint,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stAtim: Timespec,
    public var stMtim: Timespec,
    public var stCtim: Timespec,
    public var reserved: List<CLonglong>,
)

public open class FdSet(public var nfds: Int, public var fds: List<CInt>)

public open class PthreadAttrT(public var size: List<CLong>)

public open class PthreadMutexattrT(public var attr: CUint)

public open class PthreadCondattrT(public var attr: CUint)

public open class PthreadBarrierattrT(public var attr: CUint)

public open class PthreadRwlockattrT(public var attr: List<CUint>)

public open class PthreadCondT(public var size: List<COpaquePointer?>)

public open class PthreadMutexT(public var size: List<COpaquePointer?>)

public open class PthreadRwlockT(public var size: List<COpaquePointer?>)

public open class PthreadBarrierT(public var size: List<COpaquePointer?>)

// Declare dirent outside of s! so that it doesn't implement Copy, Eq, Hash,
// etc., since it contains a flexible array member with a dynamic size.
public open class Dirent(
    public var dIno: InoT,
    public var dType: CUchar,
    /**
     * dName is declared in WASI libc as a flexible array member, which
     * can't be directly expressed in Rust. As an imperfect workaround,
     * declare it as a zero-length array instead.
     */
    public var dName: List<CChar>,
)
