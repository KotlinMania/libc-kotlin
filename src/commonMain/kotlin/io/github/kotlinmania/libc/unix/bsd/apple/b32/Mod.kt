// port-lint: source unix/bsd/apple/b32/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*

public typealias BooleanT = CInt

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
    val ifiLastchange: Timeval,
    val ifiUnused2: UInt,
    val ifiHwassist: UInt,
    val ifiReserved1: UInt,
    val ifiReserved2: UInt,
)

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: CUShort,
)

public data class MallocZoneT(
    val private: List<UintptrT>,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

public const val NET_RT_MAXID: CInt = 10
public const val TIOCTIMESTAMP: CULong = 0x40087459uL
public const val TIOCDCDTIMESTAMP: CULong = 0x40087458uL
public const val BIOCSETF: CULong = 0x80084267uL
public const val BIOCSRTIMEOUT: CULong = 0x8008426duL
public const val BIOCGRTIMEOUT: CULong = 0x4008426euL
public const val BIOCSETFNR: CULong = 0x8008427euL

public expect fun exchangedata(path1: String?, path2: String?, options: CULong): CInt
