package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.U128

public open class ClongDouble(public var value: U128) {
    public var field0: U128
        get() = value
        set(v) { value = v }
}

public open class PthreadCondT(public var size: List<UByte>)

public open class PthreadMutexT(public var size: List<UByte>)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

public open class PthreadAttrT(public var size: List<ULong>)

public open class CpuSetT(public var bits: List<CUlong>)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

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
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class MbstateT(public var opaque1: CUint, public var opaque2: CUint)

public open class SemT(public var value: List<CInt>)

public open class DivT(public var quot: CInt, public var rem: CInt)
