package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUshort

public open class Timeval32(public var tvSec: Int, public var tvUsec: Int)

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
    public var ifiLastchange: Timeval32,
    public var ifiUnused2: UInt,
    public var ifiHwassist: UInt,
    public var ifiReserved1: UInt,
    public var ifiReserved2: UInt,
)

public open class BpfHdr(
    public var bhTstamp: Timeval32,
    public var bhCaplen: UInt,
    public var bhDatalen: UInt,
    public var bhHdrlen: CUshort,
)
