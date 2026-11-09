@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.b64.TimeT

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinLen != other.sinLen) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinLen.hashCode()
        result = 31 * result + this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: UByte = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiCanonname: COpaquePointer? = null,
    public var aiAddr: Sockaddr? = null,
    public var aiNext: Addrinfo? = null,
)

public data class Ifaddrs(
    public var ifaNext: Ifaddrs? = null,
    public var ifaName: COpaquePointer? = null,
    public var ifaFlags: CUint = 0u,
    public var ifaAddr: Sockaddr? = null,
    public var ifaNetmask: Sockaddr? = null,
    public var ifaDstaddr: Sockaddr? = null,
    public var ifaData: COpaquePointer? = null,
)

public data class FdSet(
    // size for 1024 bits, and a fdMask with size u32
    public var fdsBits: UIntArray = UIntArray(32),
) {
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
    public var tmGmtoff: CInt = 0,
    public var tmZone: COpaquePointer? = null,
)

public data class Utsname(
    public var sysname: UByteArray = UByteArray(32),
    public var nodename: UByteArray = UByteArray(32),
    public var release: UByteArray = UByteArray(32),
    public var version: UByteArray = UByteArray(32),
    public var machine: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        return result
    }
}

public class Lconv(
    public var decimalPoint: COpaquePointer? = null,
    public var thousandsSep: COpaquePointer? = null,
    public var grouping: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var currencySymbol: COpaquePointer? = null,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var positiveSign: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var intFracDigits: CChar = 0u,
    public var fracDigits: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public data class Msghdr(
    public var msgName: COpaquePointer? = null,
    public var msgNamelen: SocklenT = 0u,
    public var msgIov: Iovec? = null,
    public var msgIovlen: CInt = 0,
    public var msgControl: COpaquePointer? = null,
    public var msgControllen: SocklenT = 0u,
    public var msgFlags: CInt = 0,
)

public data class Cmsghdr(
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CChar = 0u,
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
    public var cCc: UByteArray = UByteArray((NCCS).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        return result
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0L,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stSize: OffT = 0L,
    public var stRdev: DevT = 0,
    public var stBlksize: BlksizeT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stCrtime: TimeT = 0L,
    public var stCrtimeNsec: CLong = 0L,
    public var stType: UInt = 0u,
    public var stBlocks: BlkcntT = 0L,
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var unused1: SizeT = 0uL,
    public var glOffs: SizeT = 0uL,
    public var unused2: SizeT = 0uL,
    public var glPathv: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
    public var unused6: COpaquePointer? = null,
    public var unused7: COpaquePointer? = null,
    public var unused8: COpaquePointer? = null,
)

public data class PthreadMutexT(
    public var flags: UInt = 0u,
    public var lock: Int = 0,
    public var unused: Int = 0,
    public var owner: Int = 0,
    public var ownerCount: Int = 0,
)

public data class PthreadCondT(
    public var flags: UInt = 0u,
    public var unused: Int = 0,
    public var mutex: COpaquePointer? = null,
    public var waiterCount: Int = 0,
    public var lock: Int = 0,
)

public data class PthreadRwlockT(
    public var flags: UInt = 0u,
    public var owner: Int = 0,
    public var lockSem: Int = 0,
    // this is actually a union
    public var lockCount: Int = 0,
    public var readerCount: Int = 0,
    public var writerCount: Int = 0,
    public var waiters: List<COpaquePointer?> = List(2) { null },
)

public data class PthreadSpinlockT(public var lock: UInt = 0u)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
    public var pwGecos: COpaquePointer? = null,
)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0L,
    public var fBfree: FsblkcntT = 0L,
    public var fBavail: FsblkcntT = 0L,
    public var fFiles: FsfilcntT = 0L,
    public var fFfree: FsfilcntT = 0L,
    public var fFavail: FsfilcntT = 0L,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siAddr: COpaquePointer? = null,
    public var siStatus: CInt = 0,
    public var siBand: CLong = 0L,
    public var sigval: COpaquePointer? = null,
) {
    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siPid(): PidT {
        return this.siPid
    }

    public fun siUid(): UidT {
        return this.siUid
    }

    public fun siStatus(): CInt {
        return this.siStatus
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    // actually a union with saHandler
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
    public var saUserdata: COpaquePointer? = null,
)

public data class SemT(
    public var type: Int = 0,
    public var namedSemId: Int = 0,
    // actually a union with unnamedSem (i32)
    public var padding: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (this.type != other.type) return false
        if (this.namedSemId != other.namedSemId) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.namedSemId.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
)

public data class SockaddrDl(
    public var sdlLen: UByte = 0u,
    public var sdlFamily: UByte = 0u,
    public var sdlEType: UShort = 0u,
    public var sdlIndex: UInt = 0u,
    public var sdlType: UByte = 0u,
    public var sdlNlen: UByte = 0u,
    public var sdlAlen: UByte = 0u,
    public var sdlSlen: UByte = 0u,
    public var sdlData: UByteArray = UByteArray(46),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (this.sdlEType != other.sdlEType) return false
        if (this.sdlIndex != other.sdlIndex) return false
        if (this.sdlType != other.sdlType) return false
        if (this.sdlNlen != other.sdlNlen) return false
        if (this.sdlAlen != other.sdlAlen) return false
        if (this.sdlSlen != other.sdlSlen) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlLen.hashCode()
        result = 31 * result + this.sdlFamily.hashCode()
        result = 31 * result + this.sdlEType.hashCode()
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        return result
    }
}

public data class Spwd(
    public var spNamp: COpaquePointer? = null,
    public var spPwdp: COpaquePointer? = null,
    public var spLstchg: CInt = 0,
    public var spMin: CInt = 0,
    public var spMax: CInt = 0,
    public var spWarn: CInt = 0,
    public var spInact: CInt = 0,
    public var spExpire: CInt = 0,
    public var spFlag: CInt = 0,
)

public data class RegexT(
    public var buffer: COpaquePointer? = null,
    public var allocated: SizeT = 0uL,
    public var used: SizeT = 0uL,
    public var syntax: CUlong = 0uL,
    public var fastmap: COpaquePointer? = null,
    public var translate: COpaquePointer? = null,
    public var reNsub: SizeT = 0uL,
    public var bitfield: UByte = 0u,
)

public data class RegmatchT(public var rmSo: RegoffT = 0, public var rmEo: RegoffT = 0)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgQnum: MsgqnumT = 0u,
    public var msgQbytes: MsglenT = 0u,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
)

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class Entry(public var key: COpaquePointer? = null, public var data: COpaquePointer? = null)

public data class Option(
    public var name: COpaquePointer? = null,
    public var hasArg: CInt = 0,
    public var flag: CInt? = null,
    public var value: CInt = 0,
)

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: ULong = 0uL,
    public var ssPad3: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssPad2 != other.ssPad2) return false
        if (!this.ssPad3.contentEquals(other.ssPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssPad2.hashCode()
        result = 31 * result + this.ssPad3.contentHashCode()
        return result
    }
}

public data class Dirent(
    public var dDev: DevT = 0,
    public var dPdev: DevT = 0,
    public var dIno: InoT = 0L,
    public var dPino: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dName: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dDev != other.dDev) return false
        if (this.dPdev != other.dPdev) return false
        if (this.dIno != other.dIno) return false
        if (this.dPino != other.dPino) return false
        if (this.dReclen != other.dReclen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dDev.hashCode()
        result = 31 * result + this.dPdev.hashCode()
        result = 31 * result + this.dIno.hashCode()
        result = 31 * result + this.dPino.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var unused1: COpaquePointer? = null,
    // actually a function pointer
    public var sigevNotifyAttributes: COpaquePointer? = null,
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utId: UByteArray = UByteArray(8),
    public var utPid: PidT = 0,
    public var utUser: UByteArray = UByteArray(32),
    public var utLine: UByteArray = UByteArray(16),
    public var utHost: UByteArray = UByteArray(128),
    public var utReserved: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utPid != other.utPid) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utReserved.contentEquals(other.utReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utReserved.contentHashCode()
        return result
    }
}
