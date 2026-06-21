// port-lint: source unix/bsd/apple/b64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b64

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class Timeval32(
    val tvSec: Int,
    val tvUsec: Int,
)

public data class IfData(
    val ifiType: CUChar,
    val ifiTypelen: CUChar,
    val ifiPhysical: CUChar,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiRecvquota: CUChar,
    val ifiXmitquota: CUChar,
    val ifiUnused1: CUChar,
    val ifiMtu: UInt,
    val ifiMetric: UInt,
    val ifiBaudrate: UInt,
    val ifiIpackets: UInt,
    val ifiIerrors: UInt,
    val ifiOpackets: UInt,
    val ifiOerrors: UInt,
    val ifiCollisions: UInt,
    val ifiIbytes: UInt,
    val ifiObytes: UInt,
    val ifiImcasts: UInt,
    val ifiOmcasts: UInt,
    val ifiIqdrops: UInt,
    val ifiNoproto: UInt,
    val ifiRecvtiming: UInt,
    val ifiXmittiming: UInt,
    val ifiLastchange: Timeval32,
    val ifiUnused2: UInt,
    val ifiHwassist: UInt,
    val ifiReserved1: UInt,
    val ifiReserved2: UInt,
)

public data class BpfHdr(
    val bhTstamp: Timeval32,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: CUShort,
)

public const val NET_RT_MAXID: CInt = 11
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
public const val TIOCDCDTIMESTAMP: CULong = 0x40107458uL
public const val BIOCSETF: CULong = 0x80104267uL
public const val BIOCSRTIMEOUT: CULong = 0x8010426duL
public const val BIOCGRTIMEOUT: CULong = 0x4010426euL
public const val BIOCSETFNR: CULong = 0x8010427euL

public expect fun exchangedata(path1: String?, path2: String?, options: CUInt): CInt
