@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Timespec

public data class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UInt = 0u,
    public var stGid: UInt = 0u,
    public var stRdev: DevT = 0,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: Long = 0L,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stat) return false
        if (this.stDev != other.stDev) return false
        if (this.stIno != other.stIno) return false
        if (this.stMode != other.stMode) return false
        if (this.stNlink != other.stNlink) return false
        if (this.stUid != other.stUid) return false
        if (this.stGid != other.stGid) return false
        if (this.stRdev != other.stRdev) return false
        if (this.stSize != other.stSize) return false
        if (this.stAtim != other.stAtim) return false
        if (this.stMtim != other.stMtim) return false
        if (this.stCtim != other.stCtim) return false
        if (this.stBlksize != other.stBlksize) return false
        if (this.stBlocks != other.stBlocks) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stDev.hashCode()
        result = 31 * result + this.stIno.hashCode()
        result = 31 * result + this.stMode.hashCode()
        result = 31 * result + this.stNlink.hashCode()
        result = 31 * result + this.stUid.hashCode()
        result = 31 * result + this.stGid.hashCode()
        result = 31 * result + this.stRdev.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stAtim.hashCode()
        result = 31 * result + this.stMtim.hashCode()
        result = 31 * result + this.stCtim.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
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

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UInt = 0u,
    public var pwGid: UInt = 0u,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwGecos != other.pwGecos) return false
        if (this.pwDir != other.pwDir) return false
        if (this.pwShell != other.pwShell) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwName.hashCode()
        result = 31 * result + this.pwPasswd.hashCode()
        result = 31 * result + this.pwUid.hashCode()
        result = 31 * result + this.pwGid.hashCode()
        result = 31 * result + this.pwGecos.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SemT(public var value: IntArray = IntArray(SEM_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class PthreadAttrT(public var value: IntArray = IntArray(PTHREAD_ATTR_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class PthreadMutexT(public var value: IntArray = IntArray(PTHREAD_MUTEX_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class PthreadCondT(public var value: IntArray = IntArray(PTHREAD_COND_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class PthreadCondattrT(public var value: IntArray = IntArray(PTHREAD_CONDATTR_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

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
    public var intFracDigits: Byte = 0,
    public var fracDigits: Byte = 0,
    public var pCsPrecedes: Byte = 0,
    public var pSepBySpace: Byte = 0,
    public var nCsPrecedes: Byte = 0,
    public var nSepBySpace: Byte = 0,
    public var pSignPosn: Byte = 0,
    public var nSignPosn: Byte = 0,
    public var intNCsPrecedes: Byte = 0,
    public var intNSepBySpace: Byte = 0,
    public var intNSignPosn: Byte = 0,
    public var intPCsPrecedes: Byte = 0,
    public var intPSepBySpace: Byte = 0,
    public var intPSignPosn: Byte = 0,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
)

public data class Tm(
    public var tmSec: Int = 0,
    public var tmMin: Int = 0,
    public var tmHour: Int = 0,
    public var tmMday: Int = 0,
    public var tmMon: Int = 0,
    public var tmYear: Int = 0,
    public var tmWday: Int = 0,
    public var tmYday: Int = 0,
    public var tmIsdst: Int = 0,
    public var tmGmtoff: Int = 0,
    public var tmZone: COpaquePointer? = null,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tm) return false
        if (this.tmSec != other.tmSec) return false
        if (this.tmMin != other.tmMin) return false
        if (this.tmHour != other.tmHour) return false
        if (this.tmMday != other.tmMday) return false
        if (this.tmMon != other.tmMon) return false
        if (this.tmYear != other.tmYear) return false
        if (this.tmWday != other.tmWday) return false
        if (this.tmYday != other.tmYday) return false
        if (this.tmIsdst != other.tmIsdst) return false
        if (this.tmGmtoff != other.tmGmtoff) return false
        if (this.tmZone != other.tmZone) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tmSec.hashCode()
        result = 31 * result + this.tmMin.hashCode()
        result = 31 * result + this.tmHour.hashCode()
        result = 31 * result + this.tmMday.hashCode()
        result = 31 * result + this.tmMon.hashCode()
        result = 31 * result + this.tmYear.hashCode()
        result = 31 * result + this.tmWday.hashCode()
        result = 31 * result + this.tmYday.hashCode()
        result = 31 * result + this.tmIsdst.hashCode()
        result = 31 * result + this.tmGmtoff.hashCode()
        result = 31 * result + this.tmZone.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Addrinfo(
    public var aiFlags: Int = 0,
    public var aiFamily: Int = 0,
    public var aiSocktype: Int = 0,
    public var aiProtocol: Int = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiAddr: Sockaddr? = null,
    public var aiCanonname: COpaquePointer? = null,
    public var aiNext: Addrinfo? = null,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiNext != other.aiNext) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PthreadRwlockT(public var value: IntArray = IntArray(PTHREAD_RWLOCK_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class Statvfs(
    public var fBsize: Int = 0,
    public var fFrsize: Int = 0,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fFavail: FsblkcntT = 0uL,
    public var fFsid: Int = 0,
    public var fFlag: Int = 0,
    public var fNamemax: Int = 0,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Dirent(public var dType: UByte = 0u, public var dName: UByteArray = UByteArray(NAME_MAX + 1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class FdSet(public var value: UIntArray = UIntArray(FDSET_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class SigsetT(public var value: UIntArray = UIntArray(SIGSET_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class Sigaction(
    public var saHandler: Int = 0,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: Int = 0,
    public var saUser: Int = 0,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigaction) return false
        if (this.saHandler != other.saHandler) return false
        if (this.saMask != other.saMask) return false
        if (this.saFlags != other.saFlags) return false
        if (this.saUser != other.saUser) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saHandler.hashCode()
        result = 31 * result + this.saMask.hashCode()
        result = 31 * result + this.saFlags.hashCode()
        result = 31 * result + this.saUser.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(12),
    public var cSpeed: SpeedT = 0uL,
    public var reserved: IntArray = IntArray(DEFAULT_RESERVED_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cSpeed != other.cSpeed) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cSpeed.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class InAddr(public var sAddr: InAddrT = 0u)

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

public data class SockaddrStorage(public var ssFamily: SaFamilyT = 0u, public var ssData: UIntArray = UIntArray(SOCKADDR_STORAGE_SIZE)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssData.contentEquals(other.ssData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssData.contentHashCode()
        return result
    }
}

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr = In6Addr(), public var ipv6mrInterface: UInt = 0u)
