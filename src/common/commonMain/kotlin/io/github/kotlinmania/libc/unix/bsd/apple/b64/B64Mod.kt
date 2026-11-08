// port-lint: source unix/bsd/apple/b64/b64_mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*

// 64-bit specific Apple (ios/darwin) definitions

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
    public var bhTstamp: io.github.kotlinmania.libc.Timeval32,
    public var bhCaplen: UInt,
    public var bhDatalen: UInt,
    public var bhHdrlen: CUshort,
)

public val NET_RT_MAXID: CInt = 11

public val TIOCTIMESTAMP: CUlong = 0x40107459uL

public val TIOCDCDTIMESTAMP: CUlong = 0x40107458uL

public val BIOCSETF: CUlong = 0x80104267uL

public val BIOCSRTIMEOUT: CUlong = 0x8010426duL

public val BIOCGRTIMEOUT: CUlong = 0x4010426euL

public val BIOCSETFNR: CUlong = 0x8010427euL

public expect fun exchangedata(path1: String?, path2: String?, options: CUint): CInt
