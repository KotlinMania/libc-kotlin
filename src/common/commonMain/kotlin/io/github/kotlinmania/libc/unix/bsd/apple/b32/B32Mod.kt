// port-lint: source unix/bsd/apple/b32/b32_mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UintptrT

// 32-bit specific Apple (ios/darwin) definitions

public typealias BooleanT = CInt

public open class IfData(
    public var ifiType: CUchar,
    public var ifiTypelen: CUchar,
    public var ifiPhysical: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiRecvquota: CUchar,
    public var ifiXmitquota: CUchar,
    public var ifiUnused1: CUchar,
    public var ifiMtu: UInt,
    public var ifiMetric: UInt,
    public var ifiBaudrate: UInt,
    public var ifiIpackets: UInt,
    public var ifiIerrors: UInt,
    public var ifiOpackets: UInt,
    public var ifiOerrors: UInt,
    public var ifiCollisions: UInt,
    public var ifiIbytes: UInt,
    public var ifiObytes: UInt,
    public var ifiImcasts: UInt,
    public var ifiOmcasts: UInt,
    public var ifiIqdrops: UInt,
    public var ifiNoproto: UInt,
    public var ifiRecvtiming: UInt,
    public var ifiXmittiming: UInt,
    public var ifiLastchange: Timeval,
    public var ifiUnused2: UInt,
    public var ifiHwassist: UInt,
    public var ifiReserved1: UInt,
    public var ifiReserved2: UInt,
)

public open class BpfHdr(
    public var bhTstamp: Timeval,
    public var bhCaplen: UInt,
    public var bhDatalen: UInt,
    public var bhHdrlen: CUshort,
)

public open class MallocZoneT(public var private: List<UintptrT>)

public open class MaxAlignT(public var priv: List<Double>)

public val NET_RT_MAXID: CInt = 10

public val TIOCTIMESTAMP: CUlong = 0x40087459uL

public val TIOCDCDTIMESTAMP: CUlong = 0x40087458uL

public val BIOCSETF: CUlong = 0x80084267uL

public val BIOCSRTIMEOUT: CUlong = 0x8008426duL

public val BIOCGRTIMEOUT: CUlong = 0x4008426euL

public val BIOCSETFNR: CUlong = 0x8008427euL

public expect fun exchangedata(path1: String?, path2: String?, options: CUlong): CInt
