@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlonglong
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
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.NCCS
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT

// link.h
public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class GlobT(
    public var glPathc: SizeT = 0uL,
    public var glMatchc: SizeT = 0uL,
    public var glOffs: SizeT = 0uL,
    public var glFlags: CInt = 0,
    public var glPathv: COpaquePointer? = null,
    public var unused3: COpaquePointer? = null,
    public var unused4: COpaquePointer? = null,
    public var unused5: COpaquePointer? = null,
    public var unused6: COpaquePointer? = null,
    public var unused7: COpaquePointer? = null,
    public var unused8: COpaquePointer? = null,
)

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

public data class SigsetT(public var bits: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    public var siValue: Sigval = Sigval(),
    public var pad1: CLong = 0L,
    public var pad2: IntArray = IntArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siStatus != other.siStatus) return false
        if (this.siAddr != other.siAddr) return false
        if (this.siValue != other.siValue) return false
        if (this.pad1 != other.pad1) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siStatus.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.siValue.hashCode()
        result = 31 * result + this.pad1.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siValue(): Sigval {
        return this.siValue
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
    public var saFlags: CInt = 0,
    public var saMask: SigsetT = SigsetT(),
)

public data class SchedParam(public var schedPriority: CInt = 0)

public data class DlInfo(
    public var dliFname: COpaquePointer? = null,
    public var dliFbase: COpaquePointer? = null,
    public var dliSname: COpaquePointer? = null,
    public var dliSaddr: COpaquePointer? = null,
)

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
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

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
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
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Flock(
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lSysid: CInt = 0,
)

public data class SfHdtr(
    public var headers: Iovec? = null,
    public var hdrCnt: CInt = 0,
    public var trailers: Iovec? = null,
    public var trlCnt: CInt = 0,
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
    public var intFracDigits: CChar = 0u,
    public var fracDigits: CChar = 0u,
    public var pCsPrecedes: CChar = 0u,
    public var pSepBySpace: CChar = 0u,
    public var nCsPrecedes: CChar = 0u,
    public var nSepBySpace: CChar = 0u,
    public var pSignPosn: CChar = 0u,
    public var nSignPosn: CChar = 0u,
    public var intPCsPrecedes: CChar = 0u,
    public var intNCsPrecedes: CChar = 0u,
    public var intPSepBySpace: CChar = 0u,
    public var intNSepBySpace: CChar = 0u,
    public var intPSignPosn: CChar = 0u,
    public var intNSignPosn: CChar = 0u,
)

public data class Cmsgcred(
    public var cmcredPid: PidT = 0,
    public var cmcredUid: UidT = 0u,
    public var cmcredEuid: UidT = 0u,
    public var cmcredGid: GidT = 0u,
    public var cmcredNgroups: CShort = 0,
    public var cmcredGroups: UShortArray = UShortArray(CMGROUP_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cmsgcred) return false
        if (this.cmcredPid != other.cmcredPid) return false
        if (this.cmcredUid != other.cmcredUid) return false
        if (this.cmcredEuid != other.cmcredEuid) return false
        if (this.cmcredGid != other.cmcredGid) return false
        if (this.cmcredNgroups != other.cmcredNgroups) return false
        if (!this.cmcredGroups.contentEquals(other.cmcredGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmcredPid.hashCode()
        result = 31 * result + this.cmcredUid.hashCode()
        result = 31 * result + this.cmcredEuid.hashCode()
        result = 31 * result + this.cmcredGid.hashCode()
        result = 31 * result + this.cmcredNgroups.hashCode()
        result = 31 * result + this.cmcredGroups.contentHashCode()
        return result
    }
}

public data class Rtprio(public var type: CUshort = 0u, public var prio: CUshort = 0u)

public data class In6Pktinfo(public var ipi6Addr: In6Addr = In6Addr(), public var ipi6Ifindex: CUint = 0u)

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public class Timex(
    public var modes: CUint = 0u,
    public var offset: CLong = 0L,
    public var freq: CLong = 0L,
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var status: CInt = 0,
    public var constant: CLong = 0L,
    public var precision: CLong = 0L,
    public var tolerance: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
)

public data class Ntptimeval(
    public var time: Timespec = Timespec(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var timeState: CInt = 0,
)

public data class AcceptFilterArg(public var afName: UByteArray = UByteArray(16), public var afArg: UByteArray = UByteArray((256 - 16).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcceptFilterArg) return false
        if (!this.afName.contentEquals(other.afName)) return false
        if (!this.afArg.contentEquals(other.afArg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.afName.contentHashCode()
        result = 31 * result + this.afArg.contentHashCode()
        return result
    }
}

public data class PtraceIoDesc(
    public var piodOp: CInt = 0,
    public var piodOffs: COpaquePointer? = null,
    public var piodAddr: COpaquePointer? = null,
    public var piodLen: SizeT = 0uL,
)

// bpf.h
public data class BpfProgram(public var bfLen: CUint = 0u, public var bfInsns: BpfInsn? = null)

public data class BpfStat(public var bsRecv: CUint = 0u, public var bsDrop: CUint = 0u)

public data class BpfVersion(public var bvMajor: CUshort = 0u, public var bvMinor: CUshort = 0u)

public data class BpfHdr(
    public var bhTstamp: Timeval = Timeval(),
    public var bhCaplen: UInt = 0u,
    public var bhDatalen: UInt = 0u,
    public var bhHdrlen: CUshort = 0u,
)

public data class BpfInsn(
    public var code: CUshort = 0u,
    public var jt: CUchar = 0u,
    public var jf: CUchar = 0u,
    public var k: UInt = 0u,
)

public data class BpfDltlist(public var bflLen: CUint = 0u, public var bflList: CUint? = null)

// elf.h
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

// link.h
public data class DlPhdrInfo(
    public var dlpiAddr: ElfAddr = 0u,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: Elf64Phdr? = null,
    public var dlpiPhnum: ElfHalf = 0u,
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
    public var dlpiTlsModid: Int = 0,
    public var dlpiTlsData: COpaquePointer? = null,
)

public data class IpcPerm(
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var key: KeyT = 0L,
)

public data class Eui64(public var octet: UByteArray = UByteArray(EUI64_LEN)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eui64) return false
        if (!this.octet.contentEquals(other.octet)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.octet.contentHashCode()
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
