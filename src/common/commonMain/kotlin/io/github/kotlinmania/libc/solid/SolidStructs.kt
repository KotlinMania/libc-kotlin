package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort

// stat.h
public data class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: CShort = 0,
    public var stNlink: CShort = 0,
    public var stUid: CShort = 0,
    public var stGid: CShort = 0,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stMtime: TimeT = 0L,
    public var stCtime: TimeT = 0L,
    public var stBlksize: BlksizeT = 0,
)

// time.h
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
    public var tmGmtoff: CLong = 0L,
    public var tmZone: COpaquePointer? = null,
)

// stdlib.h
public data class QdivT(
    public var quot: QuadT = 0L,
    public var rem: QuadT = 0L,
)

public data class LldivT(
    public var quot: CLonglong = 0L,
    public var rem: CLonglong = 0L,
)

public data class DivT(
    public var quot: CInt = 0,
    public var rem: CInt = 0,
)

public data class LdivT(
    public var quot: CLong = 0L,
    public var rem: CLong = 0L,
)

// locale.h
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
    public var intNCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public data class Iovec(
    public var iovBase: COpaquePointer? = null,
    public var iovLen: SizeT = 0uL,
)

public data class Timeval(
    public var tvSec: CLong = 0L,
    public var tvUsec: CLong = 0L,
)
