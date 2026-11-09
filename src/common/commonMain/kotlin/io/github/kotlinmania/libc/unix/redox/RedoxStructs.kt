@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

// intentionally not public, only used for fdSet
public data class Utsname(
    public var sysname: UByteArray = UByteArray((UTSLENGTH).toInt()),
    public var nodename: UByteArray = UByteArray((UTSLENGTH).toInt()),
    public var release: UByteArray = UByteArray((UTSLENGTH).toInt()),
    public var version: UByteArray = UByteArray((UTSLENGTH).toInt()),
    public var machine: UByteArray = UByteArray((UTSLENGTH).toInt()),
    public var domainname: UByteArray = UByteArray((UTSLENGTH).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        if (!this.domainname.contentEquals(other.domainname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        result = 31 * result + this.domainname.contentHashCode()
        return result
    }
}

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: CUshort = 0u,
    public var dType: CUchar = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SockaddrUn(public var sunFamily: SaFamilyT = 0u, public var sunPath: UByteArray = UByteArray(108)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPadding: UByteArray = UByteArray((128 - 8 - 8).toInt()),
    public var ssAlign: CUlong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPadding.contentEquals(other.ssPadding)) return false
        if (this.ssAlign != other.ssAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPadding.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        return result
    }
}

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SizeT = 0uL,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class EpollEvent(
    public var events: UInt = 0u,
    public var u64: ULong = 0uL,
    public var pad: ULong = 0uL,
)

public data class FdSet(public var fdsBits: ULongArray = ULongArray((FD_SETSIZE.toInt() / ULONG_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fdsBits.contentHashCode()
    }
}

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public class Lconv(
    public var currencySymbol: COpaquePointer? = null,
    public var decimalPoint: COpaquePointer? = null,
    public var fracDigits: CChar = 0u,
    public var grouping: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var intFracDigits: CChar = 0u,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var positiveSign: COpaquePointer? = null,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var thousandsSep: COpaquePointer? = null,
)

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: SizeT = 0uL,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SizeT = 0uL,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0,
    public var pwGid: GidT = 0,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saFlags: CUlong = 0uL,
    public var saRestorer: SigactionSaRestorerCallback? = null,
    public var saMask: SigsetT = 0uL,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }
}

public data class Sockaddr(public var saFamily: SaFamilyT = 0u, public var saData: UByteArray = UByteArray(14)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0,
    public var stUid: UidT = 0,
    public var stGid: GidT = 0,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var pad: UByteArray = UByteArray(24),
)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray((NCCS).toInt()),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

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

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0,
    public var gid: GidT = 0,
)

public data class PthreadAttrT(public var bytes: UByteArray = UByteArray((PTHREAD_ATTR_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadBarrierT(public var bytes: UByteArray = UByteArray((PTHREAD_BARRIER_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadBarrierattrT(public var bytes: UByteArray = UByteArray((PTHREAD_BARRIERATTR_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierattrT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadMutexT(public var bytes: UByteArray = UByteArray((PTHREAD_MUTEX_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadRwlockT(public var bytes: UByteArray = UByteArray((PTHREAD_RWLOCK_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadMutexattrT(public var bytes: UByteArray = UByteArray((PTHREAD_MUTEXATTR_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadRwlockattrT(public var bytes: UByteArray = UByteArray((PTHREAD_RWLOCKATTR_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadCondT(public var bytes: UByteArray = UByteArray((PTHREAD_COND_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadCondattrT(public var bytes: UByteArray = UByteArray((PTHREAD_CONDATTR_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadOnceT(public var bytes: UByteArray = UByteArray((PTHREAD_ONCE_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadOnceT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}

public data class PthreadSpinlockT(public var bytes: UByteArray = UByteArray((PTHREAD_SPINLOCK_SIZE).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadSpinlockT) return false
        if (!this.bytes.contentEquals(other.bytes)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bytes.contentHashCode()
    }
}
