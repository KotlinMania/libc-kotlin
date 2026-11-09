package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.ClockT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SusecondsT

public open class Group(
    public var grName: COpaquePointer?,
    public var grPasswd: COpaquePointer?,
    public var grGid: GidT,
    public var grMem: COpaquePointer?,
)

public open class Utimbuf(public var actime: TimeT, public var modtime: TimeT)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Timespec(
    public var tvSec: TimeT,
    public var tvNsec: CLong,
    public var pad0: UInt,
)

public open class Rlimit(public var rlimCur: RlimT, public var rlimMax: RlimT)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
    public var reserved: List<CLong>,
)

public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CInt)

public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    public var hAddrList: COpaquePointer?,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

public open class Winsize(
    public var wsRow: CUshort,
    public var wsCol: CUshort,
    public var wsXpixel: CUshort,
    public var wsYpixel: CUshort,
)

public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

public open class Sigval(
    // Actually a union of an int and a void*
    public var sivalPtr: COpaquePointer?,
)

// <sys/time.h>
public open class Itimerval(public var itInterval: Timeval, public var itValue: Timeval)

// <sys/times.h>
public open class Tms(
    public var tmsUtime: ClockT,
    public var tmsStime: ClockT,
    public var tmsCutime: ClockT,
    public var tmsCstime: ClockT,
)

public open class Servent(
    public var sName: COpaquePointer?,
    public var sAliases: COpaquePointer?,
    public var sPort: CShort,
    public var sProto: COpaquePointer?,
)

public open class Protoent(
    public var pName: COpaquePointer?,
    public var pAliases: COpaquePointer?,
    public var pProto: CInt,
)

public open class In6Addr(public var s6Addr: List<UByte>)
