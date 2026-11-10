@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ClockT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SusecondsT

public data class Group(
    public var grName: COpaquePointer? = null,
    public var grPasswd: COpaquePointer? = null,
    public var grGid: GidT = 0u,
    public var grMem: COpaquePointer? = null,
)

public data class Utimbuf(
    public var actime: TimeT = 0L,
    public var modtime: TimeT = 0L,
)

public data class Timeval(
    public var tvSec: TimeT = 0L,
    public var tvUsec: SusecondsT = 0L,
)

public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
    public var pad0: UInt = 0u,
)

public data class Rlimit(
    public var rlimCur: RlimT = 0uL,
    public var rlimMax: RlimT = 0uL,
)

public class Rusage(
    public var ruUtime: Timeval = Timeval(),
    public var ruStime: Timeval = Timeval(),
    public var ruMaxrss: CLong = 0L,
    public var ruIxrss: CLong = 0L,
    public var ruIdrss: CLong = 0L,
    public var ruIsrss: CLong = 0L,
    public var ruMinflt: CLong = 0L,
    public var ruMajflt: CLong = 0L,
    public var ruNswap: CLong = 0L,
    public var ruInblock: CLong = 0L,
    public var ruOublock: CLong = 0L,
    public var ruMsgsnd: CLong = 0L,
    public var ruMsgrcv: CLong = 0L,
    public var ruNsignals: CLong = 0L,
    public var ruNvcsw: CLong = 0L,
    public var ruNivcsw: CLong = 0L,
    public var reserved: LongArray = LongArray(16),
)

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: CInt = 0,
)

public data class Hostent(
    public var hName: COpaquePointer? = null,
    public var hAliases: COpaquePointer? = null,
    public var hAddrtype: CInt = 0,
    public var hLength: CInt = 0,
    public var hAddrList: COpaquePointer? = null,
)

public data class Iovec(
    public var iovBase: COpaquePointer? = null,
    public var iovLen: SizeT = 0uL,
)

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
)

public data class Winsize(
    public var wsRow: CUshort = 0u,
    public var wsCol: CUshort = 0u,
    public var wsXpixel: CUshort = 0u,
    public var wsYpixel: CUshort = 0u,
)

public data class Linger(
    public var lOnoff: CInt = 0,
    public var lLinger: CInt = 0,
)

public data class Sigval(
    // Actually a union of an int and a void*
    public var sivalPtr: COpaquePointer? = null,
)

// <sys/time.h>
public data class Itimerval(
    public var itInterval: Timeval = Timeval(),
    public var itValue: Timeval = Timeval(),
)

// <sys/times.h>
public data class Tms(
    public var tmsUtime: ClockT = 0,
    public var tmsStime: ClockT = 0,
    public var tmsCutime: ClockT = 0,
    public var tmsCstime: ClockT = 0,
)

public data class Servent(
    public var sName: COpaquePointer? = null,
    public var sAliases: COpaquePointer? = null,
    public var sPort: CShort = 0,
    public var sProto: COpaquePointer? = null,
)

public data class Protoent(
    public var pName: COpaquePointer? = null,
    public var pAliases: COpaquePointer? = null,
    public var pProto: CInt = 0,
)

public data class In6Addr(
    public var s6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr) return false
        if (!this.s6Addr.contentEquals(other.s6Addr)) return false
        return true
    }

    override fun hashCode(): Int = this.s6Addr.contentHashCode()
}
