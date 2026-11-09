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
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.LwpidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.IpcPerm

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

public open class Aiocb(
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var state: CInt,
    public var errno: CInt,
    public var retval: SsizeT,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var glMatchc: SizeT,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var glPathv: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
    public var unused6: COpaquePointer?,
    public var unused7: COpaquePointer?,
    public var unused8: COpaquePointer?,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
)

public open class SigsetT(public var bits: List<UInt>)

public open class Stat(
    public var stDev: DevT,
    public var stMode: ModeT,
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimensec: CLong,
    public var stMtime: TimeT,
    public var stMtimensec: CLong,
    public var stCtime: TimeT,
    public var stCtimensec: CLong,
    public var stBirthtime: TimeT,
    public var stBirthtimensec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: BlksizeT,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stSpare: List<UInt>,
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad1: CInt,
    public var siAddr: COpaquePointer?,
    public var pad2: List<ULong>,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siCode(): CInt {
        return this.siCode
    }

    public open fun siErrno(): CInt {
        return this.siErrno
    }

    public open fun siPid(): PidT {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var pad1: CInt,
            public var pid: PidT,
        )
        return (((this as SiginfoT?) as SiginfoTimer?)).pid
    }

    public open fun siUid(): UidT {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var pad1: CInt,
            public var pid: PidT,
            public var uid: UidT,
        )
        return (((this as SiginfoT?) as SiginfoTimer?)).uid
    }

    public open fun siValue(): Sigval {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var pad1: CInt,
            public var pid: PidT,
            public var uid: UidT,
            public var value: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoTimer?)).value
    }

    public open fun siStatus(): CInt {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var pad1: CInt,
            public var pid: PidT,
            public var uid: UidT,
            public var status: CInt,
        )
        return (((this as SiginfoT?) as SiginfoTimer?)).status
    }
}

public open class PthreadAttrT(
    public var ptaMagic: CUint,
    public var ptaFlags: CInt,
    public var ptaPrivate: COpaquePointer?,
)

public open class PthreadMutexT(
    public var ptmMagic: CUint,
    public var ptmErrorcheck: PthreadSpinT,
    public var ptmPad1: List<UByte>,
    // actually a union with a non-unused, 0-initialized field
    public var ptmUnused: PthreadSpinT,
    public var ptmPad2: List<UByte>,
    public var ptmOwner: PthreadT,
    public var ptmWaiters: COpaquePointer?,
    public var ptmRecursed: CUint,
    public var ptmSpare2: COpaquePointer?,
)

public open class PthreadMutexattrT(public var ptmaMagic: CUint, public var ptmaPrivate: COpaquePointer?)

public open class PthreadRwlockattrT(public var ptraMagic: CUint, public var ptraPrivate: COpaquePointer?)

public open class PthreadCondT(
    public var ptcMagic: CUint,
    public var ptcLock: PthreadSpinT,
    public var ptcWaitersFirst: COpaquePointer?,
    public var ptcWaitersLast: COpaquePointer?,
    public var ptcMutex: PthreadMutexT?,
    public var ptcPrivate: COpaquePointer?,
)

public open class PthreadCondattrT(public var ptcaMagic: CUint, public var ptcaPrivate: COpaquePointer?)

public open class PthreadRwlockT(
    public var ptrMagic: CUint,
    public var ptrInterlock: PthreadSpinT,
    public var ptrRblockedFirst: COpaquePointer?,
    public var ptrRblockedLast: COpaquePointer?,
    public var ptrWblockedFirst: COpaquePointer?,
    public var ptrWblockedLast: COpaquePointer?,
    public var ptrNreaders: CUint,
    public var ptrOwner: PthreadT,
    public var ptrPrivate: COpaquePointer?,
)

public open class PthreadSpinlockT(
    public var ptsMagic: CUint,
    public var ptsSpin: PthreadSpinT,
    public var ptsFlags: CInt,
)

public open class Kevent(
    public var ident: UintptrT,
    public var filter: UInt,
    public var flags: UInt,
    public var fflags: UInt,
    public var data: Long,
    public var udata: COpaquePointer?,
)

public open class Dqblk(
    public var dqbBhardlimit: UInt,
    public var dqbBsoftlimit: UInt,
    public var dqbCurblocks: UInt,
    public var dqbIhardlimit: UInt,
    public var dqbIsoftlimit: UInt,
    public var dqbCurinodes: UInt,
    public var dqbBtime: Int,
    public var dqbItime: Int,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intNCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
)

public open class Sockcred(
    public var scPid: PidT,
    public var scUid: UidT,
    public var scEuid: UidT,
    public var scGid: GidT,
    public var scEgid: GidT,
    public var scNgroups: CInt,
    public var scGroups: List<GidT>,
)

public open class Uucred(
    public var crUnused: CUshort,
    public var crUid: UidT,
    public var crGid: GidT,
    public var crNgroups: CShort,
    public var crGroups: List<GidT>,
)

public open class Unpcbid(
    public var unpPid: PidT,
    public var unpEuid: UidT,
    public var unpEgid: GidT,
)

public open class SockaddrDl(
    public var sdlLen: CUchar,
    public var sdlFamily: CUchar,
    public var sdlIndex: CUshort,
    public var sdlType: UByte,
    public var sdlNlen: UByte,
    public var sdlAlen: UByte,
    public var sdlSlen: UByte,
    public var sdlData: List<CChar>,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmInternal: COpaquePointer?,
)

// elf.h
public open class Elf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)

public open class Aux32Info(public var aType: Elf32Word, public var aV: Elf32Word)

public open class Aux64Info(public var aType: Elf64Word, public var aV: Elf64Xword)

// link.h
public open class DlPhdrInfo(
    public var dlpiAddr: ElfAddr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: Elf64Phdr?,
    public var dlpiPhnum: ElfHalf,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: Int,
    public var dlpiTlsData: COpaquePointer?,
)

public open class AcceptFilterArg(public var afName: List<CChar>, public var afArg: List<CChar>)

public open class KiSigsetT(public var bits: List<UInt>)

public open class KinfoProc2(
    public var pForw: ULong,
    public var pBack: ULong,
    public var pPaddr: ULong,
    public var pAddr: ULong,
    public var pFd: ULong,
    public var pCwdi: ULong,
    public var pStats: ULong,
    public var pLimit: ULong,
    public var pVmspace: ULong,
    public var pSigacts: ULong,
    public var pSess: ULong,
    public var pTsess: ULong,
    public var pRu: ULong,
    public var pEflag: Int,
    public var pExitsig: Int,
    public var pFlag: Int,
    public var pPid: Int,
    public var pPpid: Int,
    public var pSid: Int,
    public var pPgid: Int,
    public var pTpgid: Int,
    public var pUid: UInt,
    public var pRuid: UInt,
    public var pGid: UInt,
    public var pRgid: UInt,
    public var pGroups: List<UInt>,
    public var pNgroups: Short,
    public var pJobc: Short,
    public var pTdev: UInt,
    public var pEstcpu: UInt,
    public var pRtimeSec: UInt,
    public var pRtimeUsec: UInt,
    public var pCpticks: Int,
    public var pPctcpu: UInt,
    public var pSwtime: UInt,
    public var pSlptime: UInt,
    public var pSchedflags: Int,
    public var pUticks: ULong,
    public var pSticks: ULong,
    public var pIticks: ULong,
    public var pTracep: ULong,
    public var pTraceflag: Int,
    public var pHoldcnt: Int,
    public var pSiglist: KiSigsetT,
    public var pSigmask: KiSigsetT,
    public var pSigignore: KiSigsetT,
    public var pSigcatch: KiSigsetT,
    public var pStat: Byte,
    public var pPriority: UByte,
    public var pUsrpri: UByte,
    public var pNice: UByte,
    public var pXstat: UShort,
    public var pAcflag: UShort,
    public var pComm: List<CChar>,
    public var pWmesg: List<CChar>,
    public var pWchan: ULong,
    public var pLogin: List<CChar>,
    public var pVmRssize: Int,
    public var pVmTsize: Int,
    public var pVmDsize: Int,
    public var pVmSsize: Int,
    public var pUvalid: Long,
    public var pUstartSec: UInt,
    public var pUstartUsec: UInt,
    public var pUutimeSec: UInt,
    public var pUutimeUsec: UInt,
    public var pUstimeSec: UInt,
    public var pUstimeUsec: UInt,
    public var pUruMaxrss: ULong,
    public var pUruIxrss: ULong,
    public var pUruIdrss: ULong,
    public var pUruIsrss: ULong,
    public var pUruMinflt: ULong,
    public var pUruMajflt: ULong,
    public var pUruNswap: ULong,
    public var pUruInblock: ULong,
    public var pUruOublock: ULong,
    public var pUruMsgsnd: ULong,
    public var pUruMsgrcv: ULong,
    public var pUruNsignals: ULong,
    public var pUruNvcsw: ULong,
    public var pUruNivcsw: ULong,
    public var pUctimeSec: UInt,
    public var pUctimeUsec: UInt,
    public var pCpuid: ULong,
    public var pRealflag: ULong,
    public var pNlwps: ULong,
    public var pNrlwps: ULong,
    public var pRealstat: ULong,
    public var pSvuid: UInt,
    public var pSvgid: UInt,
    public var pEname: List<CChar>,
    public var pVmVsize: Long,
    public var pVmMsize: Long,
)

public open class KinfoLwp(
    public var lForw: ULong,
    public var lBack: ULong,
    public var lLaddr: ULong,
    public var lAddr: ULong,
    public var lLid: Int,
    public var lFlag: Int,
    public var lSwtime: UInt,
    public var lSlptime: UInt,
    public var lSchedflags: Int,
    public var lHoldcnt: Int,
    public var lPriority: UByte,
    public var lUsrpri: UByte,
    public var lStat: Byte,
    public var lPad1: Byte,
    public var lPad2: Int,
    public var lWmesg: List<CChar>,
    public var lWchan: ULong,
    public var lCpuid: ULong,
    public var lRtimeSec: UInt,
    public var lRtimeUsec: UInt,
    public var lCpticks: UInt,
    public var lPctcpu: UInt,
    public var lPid: UInt,
    public var lName: List<CChar>,
)

public open class KinfoVmentry(
    public var kveStart: ULong,
    public var kveEnd: ULong,
    public var kveOffset: ULong,
    public var kveType: UInt,
    public var kveFlags: UInt,
    public var kveCount: UInt,
    public var kveWiredCount: UInt,
    public var kveAdvice: UInt,
    public var kveAttributes: UInt,
    public var kveProtection: UInt,
    public var kveMaxProtection: UInt,
    public var kveRefCount: UInt,
    public var kveInheritance: UInt,
    public var kveVnFileid: ULong,
    public var kveVnSize: ULong,
    public var kveVnFsid: ULong,
    public var kveVnRdev: ULong,
    public var kveVnType: UInt,
    public var kveVnMode: UInt,
    public var kvePath: List<CChar>,
)

public open class CAnonymousPosixSpawnFaeOpen(
    public var path: COpaquePointer?,
    public var oflag: CInt,
    public var mode: ModeT,
)

public open class CAnonymousPosixSpawnFaeDup2(public var newfildes: CInt)

public open class PosixSpawnattrT(
    public var saFlags: CShort,
    public var saPgroup: PidT,
    public var saSchedparam: SchedParam,
    public var saSchedpolicy: CInt,
    public var saSigdefault: SigsetT,
    public var saSigmask: SigsetT,
)

public open class PosixSpawnFileActionsEntryT(
    public var faeAction: FaeAction,
    public var faeFildes: CInt,
    public var faeData: CAnonymousPosixSpawnFae,
)

public open class PosixSpawnFileActionsT(
    public var size: CUint,
    public var len: CUint,
    public var fae: PosixSpawnFileActionsEntryT?,
)

public open class PtraceLwpinfo(public var plLwpid: LwpidT, public var plEvent: CInt)

public open class PtraceLwpstatus(
    public var plLwpid: LwpidT,
    public var plSigpend: SigsetT,
    public var plSigmask: SigsetT,
    public var plName: List<CChar>,
    public var plPrivate: COpaquePointer?,
)

public open class PtraceSiginfo(public var psiSiginfo: SiginfoT, public var psiLwpid: LwpidT)

public open class PtraceEvent(public var peSetEvent: CInt)

public open class Sysctldesc(
    public var descrNum: Int,
    public var descrVer: UInt,
    public var descrLen: UInt,
    public var descrStr: List<CChar>,
)

public open class TcpInfo(
    public var tcpiState: UByte,
    public var tcpiCaState: UByte,
    public var tcpiRetransmits: UByte,
    public var tcpiProbes: UByte,
    public var tcpiBackoff: UByte,
    public var tcpiOptions: UByte,
    public var tcpSndWscale: UByte,
    public var tcpRcvWscale: UByte,
    public var tcpiRto: UInt,
    public var tcpiAto: UInt,
    public var tcpiSndMss: UInt,
    public var tcpiRcvMss: UInt,
    public var tcpiUnacked: UInt,
    public var tcpiSacked: UInt,
    public var tcpiLost: UInt,
    public var tcpiRetrans: UInt,
    public var tcpiFackets: UInt,
    public var tcpiLastDataSent: UInt,
    public var tcpiLastAckSent: UInt,
    public var tcpiLastDataRecv: UInt,
    public var tcpiLastAckRecv: UInt,
    public var tcpiPmtu: UInt,
    public var tcpiRcvSsthresh: UInt,
    public var tcpiRtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiAdvmss: UInt,
    public var tcpiReordering: UInt,
    public var tcpiRcvRtt: UInt,
    public var tcpiRcvSpace: UInt,
    public var tcpiSndWnd: UInt,
    public var tcpiSndBwnd: UInt,
    public var tcpiSndNxt: UInt,
    public var tcpiRcvNxt: UInt,
    public var tcpiToeTid: UInt,
    public var tcpiSndRexmitpack: UInt,
    public var tcpiRcvOoopack: UInt,
    public var tcpiSndZerowin: UInt,
    public var tcpiPad: List<UInt>,
)

public open class InPktinfo(public var ipiAddr: InAddr, public var ipiIfindex: CUint)

public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<Byte>,
)

public open class Dirent(
    public var dFileno: InoT,
    public var dReclen: UShort,
    public var dNamlen: UShort,
    public var dType: UByte,
    public var dName: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssPad2: Long,
    public var ssPad3: List<UByte>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class CAnonymousPosixSpawnFae(public var open: CAnonymousPosixSpawnFaeOpen? = null, public var dup2: CAnonymousPosixSpawnFaeDup2? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_posix_spawn_fae").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousPosixSpawnFae): Boolean {
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
