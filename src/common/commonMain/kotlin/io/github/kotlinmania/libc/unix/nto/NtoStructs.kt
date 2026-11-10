@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.I128
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.nto.aarch64.McontextT
import io.github.kotlinmania.libc.unix.nto.aarch64.StackT
import io.github.kotlinmania.libc.unix.nto.aarch64.TimeT

public fun interface GlobTGlErrfuncCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: CInt): CInt
}

public fun interface ThreadAttrExitfuncCallback {
    public operator fun invoke(fake: COpaquePointer?)
}

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public data class DirentExtra(
    public var dDatalen: UShort = 0u,
    public var dType: UShort = 0u,
    public var dReserved: UInt = 0u,
)

public class Stat(
    public var stIno: InoT = 0uL,
    public var stSize: OffT = 0L,
    public var stDev: DevT = 0u,
    public var stRdev: DevT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var oldStMtime: Time32t = 0u,
    public var oldStAtime: Time32t = 0u,
    public var oldStCtime: Time32t = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stBlocksize: BlksizeT = 0u,
    public var stNblocks: Int = 0,
    public var stBlksize: BlksizeT = 0u,
    public var stBlocks: BlkcntT = 0uL,
    public var stMtim: Timespec = Timespec(),
    public var stAtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
)

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
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
    public var sinZero: ByteArray = ByteArray(8),
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
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
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

public data class FdSet(
    public var fdsBits: UIntArray = UIntArray(2 * FD_SETSIZE / ULONG_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int = this.fdsBits.contentHashCode()
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

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var schedCurpriority: CInt = 0,
    public var reserved: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (this.schedCurpriority != other.schedCurpriority) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.schedCurpriority.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public class Lconv(
    public var currencySymbol: COpaquePointer? = null,
    public var intCurrSymbol: COpaquePointer? = null,
    public var monDecimalPoint: COpaquePointer? = null,
    public var monGrouping: COpaquePointer? = null,
    public var monThousandsSep: COpaquePointer? = null,
    public var negativeSign: COpaquePointer? = null,
    public var positiveSign: COpaquePointer? = null,
    public var fracDigits: CChar = 0u,
    public var intFracDigits: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var decimalPoint: COpaquePointer? = null,
    public var grouping: COpaquePointer? = null,
    public var thousandsSep: COpaquePointer? = null,
    public var fracGrouping: COpaquePointer? = null,
    public var fracSep: COpaquePointer? = null,
    public var falseVal: COpaquePointer? = null,
    public var trueVal: COpaquePointer? = null,
    public var no: COpaquePointer? = null,
    public var yes: COpaquePointer? = null,
    public var nostr: COpaquePointer? = null,
    public var yesstr: COpaquePointer? = null,
    public var reserved: List<COpaquePointer> = List(8) { COpaquePointer(0L) },
)

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: CUint = 0u,
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

public data class Arpreq(
    public var arpPa: Sockaddr = Sockaddr(),
    public var arpHa: Sockaddr = Sockaddr(),
    public var arpFlags: CInt = 0,
)

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public data class Mmsghdr(
    public var msgHdr: Msghdr = Msghdr(),
    public var msgLen: CUint = 0u,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var data: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        data class SiginfoSiAddr(
            public var pad: UByteArray = UByteArray(32),
            public var siAddr: COpaquePointer? = null,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoSiAddr) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.siAddr != other.siAddr) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.pad.contentHashCode()
                result = 31 * result + this.siAddr.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiAddr?))!!.siAddr
    }

    public fun siValue(): Sigval {
        data class SiginfoSiValue(
            public var pad: UByteArray = UByteArray(32),
            public var siValue: Sigval = Sigval(),
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoSiValue) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.siValue != other.siValue) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.pad.contentHashCode()
                result = 31 * result + this.siValue.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiValue?))!!.siValue
    }

    public fun siPid(): PidT {
        data class SiginfoSiPid(
            public var pad: UByteArray = UByteArray(16),
            public var siPid: PidT = 0,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoSiPid) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.siPid != other.siPid) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.pad.contentHashCode()
                result = 31 * result + this.siPid.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiPid?))!!.siPid
    }

    public fun siUid(): UidT {
        data class SiginfoSiUid(
            public var pad: UByteArray = UByteArray(24),
            public var siUid: UidT = 0u,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoSiUid) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.siUid != other.siUid) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.pad.contentHashCode()
                result = 31 * result + this.siUid.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiUid?))!!.siUid
    }

    public fun siStatus(): CInt {
        data class SiginfoSiStatus(
            public var pad: UByteArray = UByteArray(28),
            public var siStatus: CInt = 0,
        ) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is SiginfoSiStatus) return false
                if (!this.pad.contentEquals(other.pad)) return false
                if (this.siStatus != other.siStatus) return false
                return true
            }

            override fun hashCode(): Int {
                var result = this.pad.contentHashCode()
                result = 31 * result + this.siStatus.hashCode()
                return result
            }
        }
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoSiStatus?))!!.siStatus
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saFlags: CInt = 0,
    public var saMask: SigsetT = SigsetT(),
)

public data class Sync(
    public var union: CUint = 0u,
    public var owner: CUint = 0u,
)

public data class Rlimit64(
    public var rlimCur: Rlim64T = 0uL,
    public var rlimMax: Rlim64T = 0uL,
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glMatchc: CInt = 0,
    public var glPathv: COpaquePointer? = null,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var glErrfunc: GlobTGlErrfuncCallback = GlobTGlErrfuncCallback { _, _ -> 0 },
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
)

public data class Passwd(
    public var pwName: COpaquePointer? = null,
    public var pwPasswd: COpaquePointer? = null,
    public var pwUid: UidT = 0u,
    public var pwGid: GidT = 0u,
    public var pwAge: COpaquePointer? = null,
    public var pwComment: COpaquePointer? = null,
    public var pwGecos: COpaquePointer? = null,
    public var pwDir: COpaquePointer? = null,
    public var pwShell: COpaquePointer? = null,
)

public data class IfNameindex(
    public var ifIndex: CUint = 0u,
    public var ifName: COpaquePointer? = null,
)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class Elf32Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf32Half = 0u,
    public var eMachine: Elf32Half = 0u,
    public var eVersion: Elf32Word = 0u,
    public var eEntry: Elf32Addr = 0u,
    public var ePhoff: Elf32Off = 0u,
    public var eShoff: Elf32Off = 0u,
    public var eFlags: Elf32Word = 0u,
    public var eEhsize: Elf32Half = 0u,
    public var ePhentsize: Elf32Half = 0u,
    public var ePhnum: Elf32Half = 0u,
    public var eShentsize: Elf32Half = 0u,
    public var eShnum: Elf32Half = 0u,
    public var eShstrndx: Elf32Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf32Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }
}

public data class Elf64Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf64Half = 0u,
    public var eMachine: Elf64Half = 0u,
    public var eVersion: Elf64Word = 0u,
    public var eEntry: Elf64Addr = 0uL,
    public var ePhoff: Elf64Off = 0uL,
    public var eShoff: Elf64Off = 0uL,
    public var eFlags: Elf64Word = 0u,
    public var eEhsize: Elf64Half = 0u,
    public var ePhentsize: Elf64Half = 0u,
    public var ePhnum: Elf64Half = 0u,
    public var eShentsize: Elf64Half = 0u,
    public var eShnum: Elf64Half = 0u,
    public var eShstrndx: Elf64Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf64Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }
}

public data class Elf32Sym(
    public var stName: Elf32Word = 0u,
    public var stValue: Elf32Addr = 0u,
    public var stSize: Elf32Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf32Section = 0u,
)

public data class Elf64Sym(
    public var stName: Elf64Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf64Section = 0u,
    public var stValue: Elf64Addr = 0uL,
    public var stSize: Elf64Xword = 0uL,
)

public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
)

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)

public data class Elf32Shdr(
    public var shName: Elf32Word = 0u,
    public var shType: Elf32Word = 0u,
    public var shFlags: Elf32Word = 0u,
    public var shAddr: Elf32Addr = 0u,
    public var shOffset: Elf32Off = 0u,
    public var shSize: Elf32Word = 0u,
    public var shLink: Elf32Word = 0u,
    public var shInfo: Elf32Word = 0u,
    public var shAddralign: Elf32Word = 0u,
    public var shEntsize: Elf32Word = 0u,
)

public data class Elf64Shdr(
    public var shName: Elf64Word = 0u,
    public var shType: Elf64Word = 0u,
    public var shFlags: Elf64Xword = 0uL,
    public var shAddr: Elf64Addr = 0uL,
    public var shOffset: Elf64Off = 0uL,
    public var shSize: Elf64Xword = 0uL,
    public var shLink: Elf64Word = 0u,
    public var shInfo: Elf64Word = 0u,
    public var shAddralign: Elf64Xword = 0uL,
    public var shEntsize: Elf64Xword = 0uL,
)

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CUint = 0u,
)

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
)

public data class RegmatchT(
    public var rmSo: RegoffT = 0L,
    public var rmEo: RegoffT = 0L,
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

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var reserved: UIntArray = UIntArray(3),
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
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Mallinfo(
    public var arena: CInt = 0,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CInt = 0,
    public var fsmblks: CInt = 0,
    public var uordblks: CInt = 0,
    public var fordblks: CInt = 0,
    public var keepcost: CInt = 0,
)

public data class Flock(
    public var lType: Short = 0,
    public var lWhence: Short = 0,
    public var lZero1: Int = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lSysid: UInt = 0u,
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
    public var fBasetype: UByteArray = UByteArray(16),
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFiller: UIntArray = UIntArray(21),
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
        if (!this.fBasetype.contentEquals(other.fBasetype)) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fFiller.contentEquals(other.fFiller)) return false
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
        result = 31 * result + this.fBasetype.contentHashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFiller.contentHashCode()
        return result
    }
}

public class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioSigevent: Sigevent = Sigevent(),
    public var aioLioOpcode: CInt = 0,
    public var aioLioState: COpaquePointer? = null,
    public var aioPad: IntArray = IntArray(3),
    public var aioNext: Aiocb? = null,
    public var aioFlag: CUint = 0u,
    public var aioIotype: CUint = 0u,
    public var aioResult: SsizeT = 0L,
    public var aioError: CUint = 0u,
    public var aioSuspend: COpaquePointer? = null,
    public var aioPlist: COpaquePointer? = null,
    public var aioPolicy: CInt = 0,
    public var aioParam: SchedParam = SchedParam(),
)

public data class PthreadAttrT(
    public var data1: CLong = 0L,
    public var data2: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.data1 != other.data1) return false
        if (!this.data2.contentEquals(other.data2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data1.hashCode()
        result = 31 * result + this.data2.contentHashCode()
        return result
    }
}

public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUint = 0u,
    public var key: KeyT = 0u,
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpcPerm) return false
        if (this.uid != other.uid) return false
        if (this.gid != other.gid) return false
        if (this.cuid != other.cuid) return false
        if (this.cgid != other.cgid) return false
        if (this.mode != other.mode) return false
        if (this.seq != other.seq) return false
        if (this.key != other.key) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uid.hashCode()
        result = 31 * result + this.gid.hashCode()
        result = 31 * result + this.cuid.hashCode()
        result = 31 * result + this.cgid.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.seq.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RegexT(
    public var reMagic: CInt = 0,
    public var reNsub: SizeT = 0uL,
    public var reEndp: COpaquePointer? = null,
    public var reG: COpaquePointer? = null,
)

public data class ThreadAttr(
    public var flags: CInt = 0,
    public var stacksize: SizeT = 0uL,
    public var stackaddr: COpaquePointer? = null,
    public var exitfunc: ThreadAttrExitfuncCallback? = null,
    public var policy: CInt = 0,
    public var param: SchedParam = SchedParam(),
    public var guardsize: CUint = 0u,
    public var prealloc: CUint = 0u,
    public var spare: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThreadAttr) return false
        if (this.flags != other.flags) return false
        if (this.stacksize != other.stacksize) return false
        if (this.stackaddr != other.stackaddr) return false
        if (this.exitfunc != other.exitfunc) return false
        if (this.policy != other.policy) return false
        if (this.param != other.param) return false
        if (this.guardsize != other.guardsize) return false
        if (this.prealloc != other.prealloc) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.stacksize.hashCode()
        result = 31 * result + this.stackaddr.hashCode()
        result = 31 * result + this.exitfunc.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.param.hashCode()
        result = 31 * result + this.guardsize.hashCode()
        result = 31 * result + this.prealloc.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }
}

public data class SyncAttr(
    public var protocol: CInt = 0,
    public var flags: CInt = 0,
    public var prioceiling: CInt = 0,
    public var clockid: CInt = 0,
    public var count: CInt = 0,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SyncAttr) return false
        if (this.protocol != other.protocol) return false
        if (this.flags != other.flags) return false
        if (this.prioceiling != other.prioceiling) return false
        if (this.clockid != other.clockid) return false
        if (this.count != other.count) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocol.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.prioceiling.hashCode()
        result = 31 * result + this.clockid.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Sockcred(
    public var scUid: UidT = 0u,
    public var scEuid: UidT = 0u,
    public var scGid: GidT = 0u,
    public var scEgid: GidT = 0u,
    public var scNgroups: CInt = 0,
    public var scGroups: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockcred) return false
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public data class BpfProgram(
    public var bfLen: CUint = 0u,
    public var bfInsns: BpfInsn? = null,
)

public data class BpfStat(
    public var bsRecv: ULong = 0uL,
    public var bsDrop: ULong = 0uL,
    public var bsCapt: ULong = 0uL,
    public var bsPadding: ULongArray = ULongArray(13),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BpfStat) return false
        if (this.bsRecv != other.bsRecv) return false
        if (this.bsDrop != other.bsDrop) return false
        if (this.bsCapt != other.bsCapt) return false
        if (!this.bsPadding.contentEquals(other.bsPadding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bsRecv.hashCode()
        result = 31 * result + this.bsDrop.hashCode()
        result = 31 * result + this.bsCapt.hashCode()
        result = 31 * result + this.bsPadding.contentHashCode()
        return result
    }
}

public data class BpfVersion(
    public var bvMajor: CUshort = 0u,
    public var bvMinor: CUshort = 0u,
)

public data class BpfHdr(
    public var bhTstamp: Timeval = Timeval(),
    public var bhCaplen: UInt = 0u,
    public var bhDatalen: UInt = 0u,
    public var bhHdrlen: UShort = 0u,
)

public data class BpfInsn(
    public var code: UShort = 0u,
    public var jt: CUchar = 0u,
    public var jf: CUchar = 0u,
    public var k: UInt = 0u,
)

public data class BpfDltlist(
    public var bflLen: CUint = 0u,
    public var bflList: CUint? = null,
)

public data class Unpcbid(
    public var unpPid: PidT = 0,
    public var unpEuid: UidT = 0u,
    public var unpEgid: GidT = 0u,
)

public data class DlPhdrInfo(
    public var dlpiAddr: Elf64Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: Elf64Half = 0u,
)

public data class UcontextT(
    public var ucLink: UcontextT? = null,
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucStack: StackT = StackT(),
    public var ucMcontext: McontextT = McontextT(),
)

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
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
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(SYSNAME_SIZE),
    public var nodename: UByteArray = UByteArray(SYSNAME_SIZE),
    public var release: UByteArray = UByteArray(SYSNAME_SIZE),
    public var version: UByteArray = UByteArray(SYSNAME_SIZE),
    public var machine: UByteArray = UByteArray(SYSNAME_SIZE),
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

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var padding1: CInt = 0,
    public var sigevSigno: CInt = 0,
    // union
    public var padding2: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var sigevUn2: Int = 0,
)

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOffset: OffT = 0L,
    public var dReclen: CShort = 0,
    public var dNamelen: CShort = 0,
    public var dName: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOffset != other.dOffset) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamelen != other.dNamelen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOffset.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamelen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SigsetT(
    public var value: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class MqAttr(
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqFlags: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var mqSendwait: CLong = 0L,
    public var mqRecvwait: CLong = 0L,
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: SaFamilyT = 0u,
    public var sdlIndex: UShort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
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
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        return result
    }
}

public data class Msg(
    public var msgNext: Msg? = null,
    public var msgType: CLong = 0L,
    public var msgTs: CUshort = 0u,
    public var msgSpot: CShort = 0,
    public var pad: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msg) return false
        if (this.msgNext != other.msgNext) return false
        if (this.msgType != other.msgType) return false
        if (this.msgTs != other.msgTs) return false
        if (this.msgSpot != other.msgSpot) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgNext.hashCode()
        result = 31 * result + this.msgType.hashCode()
        result = 31 * result + this.msgTs.hashCode()
        result = 31 * result + this.msgSpot.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgFirst: Msg? = null,
    public var msgLast: Msg? = null,
    public var msgCbytes: MsglenT = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgPad1: CLong = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgPad2: CLong = 0L,
    public var msgCtime: TimeT = 0L,
    public var msgPad3: CLong = 0L,
    public var msgPad4: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsqidDs) return false
        if (this.msgPerm != other.msgPerm) return false
        if (this.msgFirst != other.msgFirst) return false
        if (this.msgLast != other.msgLast) return false
        if (this.msgCbytes != other.msgCbytes) return false
        if (this.msgQnum != other.msgQnum) return false
        if (this.msgQbytes != other.msgQbytes) return false
        if (this.msgLspid != other.msgLspid) return false
        if (this.msgLrpid != other.msgLrpid) return false
        if (this.msgStime != other.msgStime) return false
        if (this.msgPad1 != other.msgPad1) return false
        if (this.msgRtime != other.msgRtime) return false
        if (this.msgPad2 != other.msgPad2) return false
        if (this.msgCtime != other.msgCtime) return false
        if (this.msgPad3 != other.msgPad3) return false
        if (!this.msgPad4.contentEquals(other.msgPad4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgPerm.hashCode()
        result = 31 * result + this.msgFirst.hashCode()
        result = 31 * result + this.msgLast.hashCode()
        result = 31 * result + this.msgCbytes.hashCode()
        result = 31 * result + this.msgQnum.hashCode()
        result = 31 * result + this.msgQbytes.hashCode()
        result = 31 * result + this.msgLspid.hashCode()
        result = 31 * result + this.msgLrpid.hashCode()
        result = 31 * result + this.msgStime.hashCode()
        result = 31 * result + this.msgPad1.hashCode()
        result = 31 * result + this.msgRtime.hashCode()
        result = 31 * result + this.msgPad2.hashCode()
        result = 31 * result + this.msgCtime.hashCode()
        result = 31 * result + this.msgPad3.hashCode()
        result = 31 * result + this.msgPad4.contentHashCode()
        return result
    }
}

public data class SyncT(
    public var u: CUint = 0u,
    // union
    public var owner: CUint = 0u,
)

public data class PthreadBarrierT(
    // union
    public var pad: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int = this.pad.contentHashCode()
}

public data class PthreadRwlockT(
    public var active: CInt = 0,
    public var blockedwriters: CInt = 0,
    public var blockedreaders: CInt = 0,
    public var heavy: CInt = 0,
    public var lock: PthreadMutexT = SyncT(),
    // union
    public var rcond: PthreadCondT = SyncT(),
    // union
    public var wcond: PthreadCondT = SyncT(),
    // union
    public var owner: CUint = 0u,
    public var spare: CUint = 0u,
)

// There is no canonical definition of cLongdouble in Rust. For both AArch64 and x8664,
// however, the size and alignment properties are that of the gcc __int128 which corresponds (at
// least on rustc 1.78+ with LLVM 18, see
// https://blog.rust-lang.org/2024/03/30/i128-layout-update/) to i128. Use this instead until we
// get native f128 support.
//
// The definition was taken from the definition of the _Maxalignt struct in the QNX SDK.
// However, on QNX7, there is a different definition of std::maxAlignT (the C++ version of
// this type). In practice, this doesn't make a difference for the _alignment_ properties of the
// type - however, it changes the size, so using in in any other form than the zero-sized array
// form would be bogus and it would potentially change the size of the data type. On QNX8, this
// got fixed and both C and C++ are using the same definition.
public data class MaxAlignT(
    public var ll: CLonglong = 0L,
    public var ld: I128 = I128(),
)
