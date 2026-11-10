@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

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
import io.github.kotlinmania.libc.new.netbsd.sys.ipc.IpcPerm
import io.github.kotlinmania.libc.new.netbsd.sys.types.DevT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct = apply {
        fields.add("$name: $value")
    }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append(name).append(" { ").append(fields.joinToString(", ")).append(" }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public data class Aiocb(
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioFildes: CInt = 0,
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioSigevent: Sigevent = Sigevent(),
    public var state: CInt = 0,
    public var errno: CInt = 0,
    public var retval: SsizeT = 0L,
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

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
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

public class Stat(
    public var stDev: DevT = 0uL,
    public var stMode: ModeT = 0u,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimensec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimensec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimensec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimensec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stSpare: UIntArray = UIntArray(2),
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

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var pad1: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    public var pad2: ULongArray = ULongArray(13),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.pad1 != other.pad1) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad1.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }

    public fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public fun siCode(): CInt {
        return this.siCode
    }

    public fun siErrno(): CInt {
        return this.siErrno
    }

    public fun siPid(): PidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoTimer?))!!.pid
    }

    public fun siUid(): UidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoTimer?))!!.uid
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var value: Sigval = Sigval(),
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoTimer?))!!.value
    }

    public fun siStatus(): CInt {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var status: CInt = 0,
        )
        return (((((this as Any?) as SiginfoT?) as Any?) as SiginfoTimer?))!!.status
    }
}

public data class PthreadAttrT(
    public var ptaMagic: CUint = 0u,
    public var ptaFlags: CInt = 0,
    public var ptaPrivate: COpaquePointer? = null,
)

public data class PthreadMutexT(
    public var ptmMagic: CUint = 0u,
    public var ptmErrorcheck: PthreadSpinT = 0u,
    public var ptmPad1: UByteArray = UByteArray(3),
    // actually a union with a non-unused, 0-initialized field
    public var ptmUnused: PthreadSpinT = 0u,
    public var ptmPad2: UByteArray = UByteArray(3),
    public var ptmOwner: PthreadT = 0uL,
    public var ptmWaiters: COpaquePointer? = null,
    public var ptmRecursed: CUint = 0u,
    public var ptmSpare2: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.ptmMagic != other.ptmMagic) return false
        if (this.ptmErrorcheck != other.ptmErrorcheck) return false
        if (!this.ptmPad1.contentEquals(other.ptmPad1)) return false
        if (this.ptmUnused != other.ptmUnused) return false
        if (!this.ptmPad2.contentEquals(other.ptmPad2)) return false
        if (this.ptmOwner != other.ptmOwner) return false
        if (this.ptmWaiters != other.ptmWaiters) return false
        if (this.ptmRecursed != other.ptmRecursed) return false
        if (this.ptmSpare2 != other.ptmSpare2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptmMagic.hashCode()
        result = 31 * result + this.ptmErrorcheck.hashCode()
        result = 31 * result + this.ptmPad1.contentHashCode()
        result = 31 * result + this.ptmUnused.hashCode()
        result = 31 * result + this.ptmPad2.contentHashCode()
        result = 31 * result + this.ptmOwner.hashCode()
        result = 31 * result + this.ptmWaiters.hashCode()
        result = 31 * result + this.ptmRecursed.hashCode()
        result = 31 * result + this.ptmSpare2.hashCode()
        return result
    }
}

public data class PthreadMutexattrT(public var ptmaMagic: CUint = 0u, public var ptmaPrivate: COpaquePointer? = null)

public data class PthreadRwlockattrT(public var ptraMagic: CUint = 0u, public var ptraPrivate: COpaquePointer? = null)

public data class PthreadCondT(
    public var ptcMagic: CUint = 0u,
    public var ptcLock: PthreadSpinT = 0u,
    public var ptcWaitersFirst: COpaquePointer? = null,
    public var ptcWaitersLast: COpaquePointer? = null,
    public var ptcMutex: PthreadMutexT? = null,
    public var ptcPrivate: COpaquePointer? = null,
)

public data class PthreadCondattrT(public var ptcaMagic: CUint = 0u, public var ptcaPrivate: COpaquePointer? = null)

public data class PthreadRwlockT(
    public var ptrMagic: CUint = 0u,
    public var ptrInterlock: PthreadSpinT = 0u,
    public var ptrRblockedFirst: COpaquePointer? = null,
    public var ptrRblockedLast: COpaquePointer? = null,
    public var ptrWblockedFirst: COpaquePointer? = null,
    public var ptrWblockedLast: COpaquePointer? = null,
    public var ptrNreaders: CUint = 0u,
    public var ptrOwner: PthreadT = 0uL,
    public var ptrPrivate: COpaquePointer? = null,
)

public data class PthreadSpinlockT(
    public var ptsMagic: CUint = 0u,
    public var ptsSpin: PthreadSpinT = 0u,
    public var ptsFlags: CInt = 0,
)

public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: UInt = 0u,
    public var flags: UInt = 0u,
    public var fflags: UInt = 0u,
    public var data: Long = 0L,
    public var udata: COpaquePointer? = null,
)

public data class Dqblk(
    public var dqbBhardlimit: UInt = 0u,
    public var dqbBsoftlimit: UInt = 0u,
    public var dqbCurblocks: UInt = 0u,
    public var dqbIhardlimit: UInt = 0u,
    public var dqbIsoftlimit: UInt = 0u,
    public var dqbCurinodes: UInt = 0u,
    public var dqbBtime: Int = 0,
    public var dqbItime: Int = 0,
)

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

public data class Sockcred(
    public var scPid: PidT = 0,
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
        if (this.scPid != other.scPid) return false
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scPid.hashCode()
        result = 31 * result + this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public data class Uucred(
    public var crUnused: CUshort = 0u,
    public var crUid: UidT = 0u,
    public var crGid: GidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(NGROUPS_MAX.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Uucred) return false
        if (this.crUnused != other.crUnused) return false
        if (this.crUid != other.crUid) return false
        if (this.crGid != other.crGid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUnused.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crGid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }
}

public data class Unpcbid(
    public var unpPid: PidT = 0,
    public var unpEuid: UidT = 0u,
    public var unpEgid: GidT = 0u,
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: UByte = 0u,
    public var sdlNlen: UByte = 0u,
    public var sdlAlen: UByte = 0u,
    public var sdlSlen: UByte = 0u,
    public var sdlData: UByteArray = UByteArray(24),
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

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: ShmattT = 0u,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmInternal: COpaquePointer? = null,
)

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

public data class Aux32Info(public var aType: Elf32Word = 0u, public var aV: Elf32Word = 0u)

public data class Aux64Info(public var aType: Elf64Word = 0u, public var aV: Elf64Xword = 0uL)

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

public data class KiSigsetT(public var bits: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KiSigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public class KinfoProc2 {
    public var pForw: ULong = 0uL

    public var pBack: ULong = 0uL

    public var pPaddr: ULong = 0uL

    public var pAddr: ULong = 0uL

    public var pFd: ULong = 0uL

    public var pCwdi: ULong = 0uL

    public var pStats: ULong = 0uL

    public var pLimit: ULong = 0uL

    public var pVmspace: ULong = 0uL

    public var pSigacts: ULong = 0uL

    public var pSess: ULong = 0uL

    public var pTsess: ULong = 0uL

    public var pRu: ULong = 0uL

    public var pEflag: Int = 0

    public var pExitsig: Int = 0

    public var pFlag: Int = 0

    public var pPid: Int = 0

    public var pPpid: Int = 0

    public var pSid: Int = 0

    public var pPgid: Int = 0

    public var pTpgid: Int = 0

    public var pUid: UInt = 0u

    public var pRuid: UInt = 0u

    public var pGid: UInt = 0u

    public var pRgid: UInt = 0u

    public var pGroups: UIntArray = UIntArray(KI_NGROUPS.toInt())

    public var pNgroups: Short = 0

    public var pJobc: Short = 0

    public var pTdev: UInt = 0u

    public var pEstcpu: UInt = 0u

    public var pRtimeSec: UInt = 0u

    public var pRtimeUsec: UInt = 0u

    public var pCpticks: Int = 0

    public var pPctcpu: UInt = 0u

    public var pSwtime: UInt = 0u

    public var pSlptime: UInt = 0u

    public var pSchedflags: Int = 0

    public var pUticks: ULong = 0uL

    public var pSticks: ULong = 0uL

    public var pIticks: ULong = 0uL

    public var pTracep: ULong = 0uL

    public var pTraceflag: Int = 0

    public var pHoldcnt: Int = 0

    public var pSiglist: KiSigsetT = KiSigsetT()

    public var pSigmask: KiSigsetT = KiSigsetT()

    public var pSigignore: KiSigsetT = KiSigsetT()

    public var pSigcatch: KiSigsetT = KiSigsetT()

    public var pStat: Byte = 0

    public var pPriority: UByte = 0u

    public var pUsrpri: UByte = 0u

    public var pNice: UByte = 0u

    public var pXstat: UShort = 0u

    public var pAcflag: UShort = 0u

    public var pComm: UByteArray = UByteArray(KI_MAXCOMLEN.toInt())

    public var pWmesg: UByteArray = UByteArray(KI_WMESGLEN.toInt())

    public var pWchan: ULong = 0uL

    public var pLogin: UByteArray = UByteArray(KI_MAXLOGNAME.toInt())

    public var pVmRssize: Int = 0

    public var pVmTsize: Int = 0

    public var pVmDsize: Int = 0

    public var pVmSsize: Int = 0

    public var pUvalid: Long = 0L

    public var pUstartSec: UInt = 0u

    public var pUstartUsec: UInt = 0u

    public var pUutimeSec: UInt = 0u

    public var pUutimeUsec: UInt = 0u

    public var pUstimeSec: UInt = 0u

    public var pUstimeUsec: UInt = 0u

    public var pUruMaxrss: ULong = 0uL

    public var pUruIxrss: ULong = 0uL

    public var pUruIdrss: ULong = 0uL

    public var pUruIsrss: ULong = 0uL

    public var pUruMinflt: ULong = 0uL

    public var pUruMajflt: ULong = 0uL

    public var pUruNswap: ULong = 0uL

    public var pUruInblock: ULong = 0uL

    public var pUruOublock: ULong = 0uL

    public var pUruMsgsnd: ULong = 0uL

    public var pUruMsgrcv: ULong = 0uL

    public var pUruNsignals: ULong = 0uL

    public var pUruNvcsw: ULong = 0uL

    public var pUruNivcsw: ULong = 0uL

    public var pUctimeSec: UInt = 0u

    public var pUctimeUsec: UInt = 0u

    public var pCpuid: ULong = 0uL

    public var pRealflag: ULong = 0uL

    public var pNlwps: ULong = 0uL

    public var pNrlwps: ULong = 0uL

    public var pRealstat: ULong = 0uL

    public var pSvuid: UInt = 0u

    public var pSvgid: UInt = 0u

    public var pEname: UByteArray = UByteArray(KI_MAXEMULLEN.toInt())

    public var pVmVsize: Long = 0L

    public var pVmMsize: Long = 0L
}

public class KinfoLwp(
    public var lForw: ULong = 0uL,
    public var lBack: ULong = 0uL,
    public var lLaddr: ULong = 0uL,
    public var lAddr: ULong = 0uL,
    public var lLid: Int = 0,
    public var lFlag: Int = 0,
    public var lSwtime: UInt = 0u,
    public var lSlptime: UInt = 0u,
    public var lSchedflags: Int = 0,
    public var lHoldcnt: Int = 0,
    public var lPriority: UByte = 0u,
    public var lUsrpri: UByte = 0u,
    public var lStat: Byte = 0,
    public var lPad1: Byte = 0,
    public var lPad2: Int = 0,
    public var lWmesg: UByteArray = UByteArray(KI_WMESGLEN.toInt()),
    public var lWchan: ULong = 0uL,
    public var lCpuid: ULong = 0uL,
    public var lRtimeSec: UInt = 0u,
    public var lRtimeUsec: UInt = 0u,
    public var lCpticks: UInt = 0u,
    public var lPctcpu: UInt = 0u,
    public var lPid: UInt = 0u,
    public var lName: UByteArray = UByteArray(KI_LNAMELEN.toInt()),
)

public class KinfoVmentry(
    public var kveStart: ULong = 0uL,
    public var kveEnd: ULong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveType: UInt = 0u,
    public var kveFlags: UInt = 0u,
    public var kveCount: UInt = 0u,
    public var kveWiredCount: UInt = 0u,
    public var kveAdvice: UInt = 0u,
    public var kveAttributes: UInt = 0u,
    public var kveProtection: UInt = 0u,
    public var kveMaxProtection: UInt = 0u,
    public var kveRefCount: UInt = 0u,
    public var kveInheritance: UInt = 0u,
    public var kveVnFileid: ULong = 0uL,
    public var kveVnSize: ULong = 0uL,
    public var kveVnFsid: ULong = 0uL,
    public var kveVnRdev: ULong = 0uL,
    public var kveVnType: UInt = 0u,
    public var kveVnMode: UInt = 0u,
    public var kvePath: UByteArray = UByteArray(PATH_MAX.toInt()),
)

public data class CAnonymousPosixSpawnFaeOpen(
    public var path: COpaquePointer? = null,
    public var oflag: CInt = 0,
    public var mode: ModeT = 0u,
)

public data class CAnonymousPosixSpawnFaeDup2(public var newfildes: CInt = 0)

public data class PosixSpawnattrT(
    public var saFlags: CShort = 0,
    public var saPgroup: PidT = 0,
    public var saSchedparam: SchedParam = SchedParam(),
    public var saSchedpolicy: CInt = 0,
    public var saSigdefault: SigsetT = SigsetT(),
    public var saSigmask: SigsetT = SigsetT(),
)

public data class PosixSpawnFileActionsEntryT(
    public var faeAction: FaeAction = FaeAction.entries.first(),
    public var faeFildes: CInt = 0,
    public var faeData: CAnonymousPosixSpawnFae = CAnonymousPosixSpawnFae(),
)

public data class PosixSpawnFileActionsT(
    public var size: CUint = 0u,
    public var len: CUint = 0u,
    public var fae: PosixSpawnFileActionsEntryT? = null,
)

public data class PtraceLwpinfo(public var plLwpid: LwpidT = 0, public var plEvent: CInt = 0)

public data class PtraceLwpstatus(
    public var plLwpid: LwpidT = 0,
    public var plSigpend: SigsetT = SigsetT(),
    public var plSigmask: SigsetT = SigsetT(),
    public var plName: UByteArray = UByteArray(20),
    public var plPrivate: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceLwpstatus) return false
        if (this.plLwpid != other.plLwpid) return false
        if (this.plSigpend != other.plSigpend) return false
        if (this.plSigmask != other.plSigmask) return false
        if (!this.plName.contentEquals(other.plName)) return false
        if (this.plPrivate != other.plPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.plLwpid.hashCode()
        result = 31 * result + this.plSigpend.hashCode()
        result = 31 * result + this.plSigmask.hashCode()
        result = 31 * result + this.plName.contentHashCode()
        result = 31 * result + this.plPrivate.hashCode()
        return result
    }
}

public data class PtraceSiginfo(public var psiSiginfo: SiginfoT = SiginfoT(), public var psiLwpid: LwpidT = 0)

public data class PtraceEvent(public var peSetEvent: CInt = 0)

public data class Sysctldesc(
    public var descrNum: Int = 0,
    public var descrVer: UInt = 0u,
    public var descrLen: UInt = 0u,
    public var descrStr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysctldesc) return false
        if (this.descrNum != other.descrNum) return false
        if (this.descrVer != other.descrVer) return false
        if (this.descrLen != other.descrLen) return false
        if (!this.descrStr.contentEquals(other.descrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descrNum.hashCode()
        result = 31 * result + this.descrVer.hashCode()
        result = 31 * result + this.descrLen.hashCode()
        result = 31 * result + this.descrStr.contentHashCode()
        return result
    }
}

public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    public var tcpSndWscale: UByte = 0u,
    public var tcpRcvWscale: UByte = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiAto: UInt = 0u,
    public var tcpiSndMss: UInt = 0u,
    public var tcpiRcvMss: UInt = 0u,
    public var tcpiUnacked: UInt = 0u,
    public var tcpiSacked: UInt = 0u,
    public var tcpiLost: UInt = 0u,
    public var tcpiRetrans: UInt = 0u,
    public var tcpiFackets: UInt = 0u,
    public var tcpiLastDataSent: UInt = 0u,
    public var tcpiLastAckSent: UInt = 0u,
    public var tcpiLastDataRecv: UInt = 0u,
    public var tcpiLastAckRecv: UInt = 0u,
    public var tcpiPmtu: UInt = 0u,
    public var tcpiRcvSsthresh: UInt = 0u,
    public var tcpiRtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiAdvmss: UInt = 0u,
    public var tcpiReordering: UInt = 0u,
    public var tcpiRcvRtt: UInt = 0u,
    public var tcpiRcvSpace: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndBwnd: UInt = 0u,
    public var tcpiSndNxt: UInt = 0u,
    public var tcpiRcvNxt: UInt = 0u,
    public var tcpiToeTid: UInt = 0u,
    public var tcpiSndRexmitpack: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndZerowin: UInt = 0u,
    public var tcpiPad: UIntArray = UIntArray(26),
)

public data class InPktinfo(public var ipiAddr: InAddr = InAddr(), public var ipiIfindex: CUint = 0u)

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
)

public data class InAddr(public var sAddr: InAddrT = 0u)

public data class IpMreq(public var imrMultiaddr: InAddr = InAddr(), public var imrInterface: InAddr = InAddr())

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

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dReclen: UShort = 0u,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: Long = 0L,
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

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var unused1: COpaquePointer? = null,
    // actually a function pointer
    public var sigevNotifyAttributes: COpaquePointer? = null,
)

public data class CAnonymousPosixSpawnFae(public var open: CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(), public var dup2: CAnonymousPosixSpawnFaeDup2 = CAnonymousPosixSpawnFaeDup2()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_posix_spawn_fae").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousPosixSpawnFae): Boolean {
        return this.open == other.open || this.dup2 == other.dup2
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.open).hashCode()
            state = 31 * state + (this.dup2).hashCode()
        }
        return state
    }
}
