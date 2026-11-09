package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
// note this is the struct called stat64 in Windows. Not stat, nor stati64.
public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: UShort,
    public var stNlink: CShort,
    public var stUid: CShort,
    public var stGid: CShort,
    public var stRdev: DevT,
    public var stSize: Long,
    public var stAtime: Time64T,
    public var stMtime: Time64T,
    public var stCtime: Time64T,
)

// note that this is called utimbuf64 in Windows
public open class Utimbuf(public var actime: Time64T, public var modtime: Time64T)

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
)

public open class Timeval(public var tvSec: CLong, public var tvUsec: CLong)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Sockaddr(public var saFamily: CUshort, public var saData: List<CChar>)
