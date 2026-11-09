package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SockaddrIn6
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.IfData
import io.github.kotlinmania.libc.unix.bsd.apple.b64.Timeval32
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT

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

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class IpMreqn(
    public var imrMultiaddr: InAddr,
    public var imrAddress: InAddr,
    public var imrIfindex: CInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var unused1: CInt,
    public var glOffs: SizeT,
    public var unused2: CInt,
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

public open class MachTimebaseInfo(public var numer: UInt, public var denom: UInt)

public open class Stat(
    public var stDev: DevT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stIno: InoT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: BlkcntT,
    public var stBlksize: BlksizeT,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stLspare: Int,
    public var stQspare: List<Long>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siAddr: COpaquePointer?,
    // Requires it to be union for tests
    // pub siValue: crate::sigval,
    public var pad: List<Int>,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): Sigval {
        open class SiginfoTimer(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siStatus: CInt,
            public var siAddr: COpaquePointer?,
            public var siValue: Sigval,
        )
        return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).siValue
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

public open class Sigaction(
    // Note(union): this field is actually a union
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class FstoreT(
    public var fstFlags: CUint,
    public var fstPosmode: CInt,
    public var fstOffset: OffT,
    public var fstLength: OffT,
    public var fstBytesalloc: OffT,
)

public open class FpunchholeT(
    public var fpFlags: CUint,
    // unused
    public var reserved: CUint,
    // (to maintain 8-byte alignment)
    public var fpOffset: OffT,
    // IN: start of the region
    public var fpLength: OffT,
)

public open class FtrimactivefileT(public var ftaOffset: OffT, public var ftaLength: OffT)

public open class FspecreadT(
    public var fsrFlags: CUint,
    public var reserved: CUint,
    public var fsrOffset: OffT,
    public var fsrLength: OffT,
)

public open class Radvisory(public var raOffset: OffT, public var raCount: CInt)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<CChar>,
)

public open class Kevent64S(
    public var ident: ULong,
    public var filter: Short,
    public var flags: UShort,
    public var fflags: UInt,
    public var data: Long,
    public var udata: ULong,
    public var ext: List<ULong>,
)

public open class Dqblk(
    public var dqbBhardlimit: ULong,
    public var dqbBsoftlimit: ULong,
    public var dqbCurbytes: ULong,
    public var dqbIhardlimit: UInt,
    public var dqbIsoftlimit: UInt,
    public var dqbCurinodes: UInt,
    public var dqbBtime: UInt,
    public var dqbItime: UInt,
    public var dqbId: UInt,
    public var dqbSpare: List<UInt>,
)

public open class IfMsghdr(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmIndex: CUshort,
    public var ifmData: IfData,
)

public open class IfaMsghdr(
    public var ifamMsglen: CUshort,
    public var ifamVersion: CUchar,
    public var ifamType: CUchar,
    public var ifamAddrs: CInt,
    public var ifamFlags: CInt,
    public var ifamIndex: CUshort,
    public var ifamMetric: CInt,
)

public open class IfmaMsghdr(
    public var ifmamMsglen: CUshort,
    public var ifmamVersion: CUchar,
    public var ifmamType: CUchar,
    public var ifmamAddrs: CInt,
    public var ifmamFlags: CInt,
    public var ifmamIndex: CUshort,
)

public open class IfmaMsghdr2(
    public var ifmamMsglen: CUshort,
    public var ifmamVersion: CUchar,
    public var ifmamType: CUchar,
    public var ifmamAddrs: CInt,
    public var ifmamFlags: CInt,
    public var ifmamIndex: CUshort,
    public var ifmamRefcount: Int,
)

public open class RtMetrics(
    public var rmxLocks: UInt,
    public var rmxMtu: UInt,
    public var rmxHopcount: UInt,
    public var rmxExpire: Int,
    public var rmxRecvpipe: UInt,
    public var rmxSendpipe: UInt,
    public var rmxSsthresh: UInt,
    public var rmxRtt: UInt,
    public var rmxRttvar: UInt,
    public var rmxPksent: UInt,
    /**
     * This field does not exist anymore, the u32 is now part of a resized
     * `rmxFiller` array.
     */
    public var rmxState: UInt,
    public var rmxFiller: List<UInt>,
)

public open class RtMsghdr(
    public var rtmMsglen: CUshort,
    public var rtmVersion: CUchar,
    public var rtmType: CUchar,
    public var rtmIndex: CUshort,
    public var rtmFlags: CInt,
    public var rtmAddrs: CInt,
    public var rtmPid: PidT,
    public var rtmSeq: CInt,
    public var rtmErrno: CInt,
    public var rtmUse: CInt,
    public var rtmInits: UInt,
    public var rtmRmx: RtMetrics,
)

public open class RtMsghdr2(
    public var rtmMsglen: CUshort,
    public var rtmVersion: CUchar,
    public var rtmType: CUchar,
    public var rtmIndex: CUshort,
    public var rtmFlags: CInt,
    public var rtmAddrs: CInt,
    public var rtmRefcnt: Int,
    public var rtmParentflags: CInt,
    public var rtmReserved: CInt,
    public var rtmUse: CInt,
    public var rtmInits: UInt,
    public var rtmRmx: RtMetrics,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class Flock(
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
    public var lType: CShort,
    public var lWhence: CShort,
)

public open class SfHdtr(
    public var headers: Iovec?,
    public var hdrCnt: CInt,
    public var trailers: Iovec?,
    public var trlCnt: CInt,
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

public open class ProcTaskinfo(
    public var ptiVirtualSize: ULong,
    public var ptiResidentSize: ULong,
    public var ptiTotalUser: ULong,
    public var ptiTotalSystem: ULong,
    public var ptiThreadsUser: ULong,
    public var ptiThreadsSystem: ULong,
    public var ptiPolicy: Int,
    public var ptiFaults: Int,
    public var ptiPageins: Int,
    public var ptiCowFaults: Int,
    public var ptiMessagesSent: Int,
    public var ptiMessagesReceived: Int,
    public var ptiSyscallsMach: Int,
    public var ptiSyscallsUnix: Int,
    public var ptiCsw: Int,
    public var ptiThreadnum: Int,
    public var ptiNumrunning: Int,
    public var ptiPriority: Int,
)

public open class ProcBsdinfo(
    public var pbiFlags: UInt,
    public var pbiStatus: UInt,
    public var pbiXstatus: UInt,
    public var pbiPid: UInt,
    public var pbiPpid: UInt,
    public var pbiUid: UidT,
    public var pbiGid: GidT,
    public var pbiRuid: UidT,
    public var pbiRgid: GidT,
    public var pbiSvuid: UidT,
    public var pbiSvgid: GidT,
    public var rfu1: UInt,
    public var pbiComm: List<CChar>,
    public var pbiName: List<CChar>,
    // MAXCOMLEN * 2, but macro isn't happy...
    public var pbiNfiles: UInt,
    public var pbiPgid: UInt,
    public var pbiPjobc: UInt,
    public var eTdev: UInt,
    public var eTpgid: UInt,
    public var pbiNice: Int,
    public var pbiStartTvsec: ULong,
    public var pbiStartTvusec: ULong,
)

public open class ProcTaskallinfo(public var pbsd: ProcBsdinfo, public var ptinfo: ProcTaskinfo)

public open class XswUsage(
    public var xsuTotal: ULong,
    public var xsuAvail: ULong,
    public var xsuUsed: ULong,
    public var xsuPagesize: UInt,
    public var xsuEncrypted: BooleanT,
)

public open class Xucred(
    public var crVersion: CUint,
    public var crUid: UidT,
    public var crNgroups: CShort,
    public var crGroups: List<GidT>,
)

public open class MachHeader(
    public var magic: UInt,
    public var cputype: CpuTypeT,
    public var cpusubtype: CpuSubtypeT,
    public var filetype: UInt,
    public var ncmds: UInt,
    public var sizeofcmds: UInt,
    public var flags: UInt,
)

public open class MachHeader64(
    public var magic: UInt,
    public var cputype: CpuTypeT,
    public var cpusubtype: CpuSubtypeT,
    public var filetype: UInt,
    public var ncmds: UInt,
    public var sizeofcmds: UInt,
    public var flags: UInt,
    public var reserved: UInt,
)

public open class SegmentCommand(
    public var cmd: UInt,
    public var cmdsize: UInt,
    public var segname: List<CChar>,
    public var vmaddr: UInt,
    public var vmsize: UInt,
    public var fileoff: UInt,
    public var filesize: UInt,
    public var maxprot: VmProtT,
    public var initprot: VmProtT,
    public var nsects: UInt,
    public var flags: UInt,
)

public open class SegmentCommand64(
    public var cmd: UInt,
    public var cmdsize: UInt,
    public var segname: List<CChar>,
    public var vmaddr: ULong,
    public var vmsize: ULong,
    public var fileoff: ULong,
    public var filesize: ULong,
    public var maxprot: VmProtT,
    public var initprot: VmProtT,
    public var nsects: UInt,
    public var flags: UInt,
)

public open class LoadCommand(public var cmd: UInt, public var cmdsize: UInt)

public open class SockaddrDl(
    public var sdlLen: CUchar,
    public var sdlFamily: CUchar,
    public var sdlIndex: CUshort,
    public var sdlType: CUchar,
    public var sdlNlen: CUchar,
    public var sdlAlen: CUchar,
    public var sdlSlen: CUchar,
    public var sdlData: List<CChar>,
)

public open class SockaddrInarp(
    public var sinLen: CUchar,
    public var sinFamily: CUchar,
    public var sinPort: CUshort,
    public var sinAddr: InAddr,
    public var sinSrcaddr: InAddr,
    public var sinTos: CUshort,
    public var sinOther: CUshort,
)

public open class SockaddrCtl(
    public var scLen: CUchar,
    public var scFamily: CUchar,
    public var ssSysaddr: UShort,
    public var scId: UInt,
    public var scUnit: UInt,
    public var scReserved: List<UInt>,
)

public open class InPktinfo(
    public var ipiIfindex: CUint,
    public var ipiSpecDst: InAddr,
    public var ipiAddr: InAddr,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: CUint)

// sys/ipc.h:
public open class IpcPerm(
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
    public var key: KeyT,
)

// sys/sem.h
public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

// sys/shm.h
public open class Arphdr(
    public var arHrd: UShort,
    public var arPro: UShort,
    public var arHln: UByte,
    public var arPln: UByte,
    public var arOp: UShort,
)

public open class InAddr(public var sAddr: InAddrT)

// net/ndrv.h
public open class SockaddrNdrv(
    public var sndLen: CUchar,
    public var sndFamily: CUchar,
    public var sndName: List<CUchar>,
)

// sys/socket.h
public open class SaEndpointsT(
    public var saeSrcif: CUint,
    // optional source interface
    public var saeSrcaddr: Sockaddr?,
    // optional source address
    public var saeSrcaddrlen: SocklenT,
    // size of source address
    public var saeDstaddr: Sockaddr?,
    // destination address
    public var saeDstaddrlen: SocklenT,
)

public open class Timex(
    public var modes: CUint,
    public var offset: CLong,
    public var freq: CLong,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var status: CInt,
    public var constant: CLong,
    public var precision: CLong,
    public var tolerance: CLong,
    public var ppsfreq: CLong,
    public var jitter: CLong,
    public var shift: CInt,
    public var stabil: CLong,
    public var jitcnt: CLong,
    public var calcnt: CLong,
    public var errcnt: CLong,
    public var stbcnt: CLong,
)

public open class Ntptimeval(
    public var time: Timespec,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var tai: CLong,
    public var timeState: CInt,
)

public open class ThreadStandardPolicy(public var noData: NaturalT)

public open class ThreadExtendedPolicy(public var timeshare: BooleanT)

public open class ThreadTimeConstraintPolicy(
    public var period: UInt,
    public var computation: UInt,
    public var constraint: UInt,
    public var preemptible: BooleanT,
)

public open class ThreadPrecedencePolicy(public var importance: IntegerT)

public open class ThreadAffinityPolicy(public var affinityTag: IntegerT)

public open class ThreadBackgroundPolicy(public var priority: IntegerT)

public open class ThreadLatencyQosPolicy(public var threadLatencyQosTier: ThreadLatencyQosT)

public open class ThreadThroughputQosPolicy(public var threadThroughputQosTier: ThreadThroughputQosT)

// malloc/malloc.h
public open class MallocStatisticsT(
    public var blocksInUse: CUint,
    public var sizeInUse: SizeT,
    public var maxSizeInUse: SizeT,
    public var sizeAllocated: SizeT,
)

public open class Mstats(
    public var bytesTotal: SizeT,
    public var chunksUsed: SizeT,
    public var bytesUsed: SizeT,
    public var chunksFree: SizeT,
    public var bytesFree: SizeT,
)

public open class VmRangeT(public var address: VmAddressT, public var size: VmSizeT)

public open class VinfoStat(
    public var vstDev: UInt,
    public var vstMode: UShort,
    public var vstNlink: UShort,
    public var vstIno: ULong,
    public var vstUid: UidT,
    public var vstGid: GidT,
    public var vstAtime: Long,
    public var vstAtimensec: Long,
    public var vstMtime: Long,
    public var vstMtimensec: Long,
    public var vstCtime: Long,
    public var vstCtimensec: Long,
    public var vstBirthtime: Long,
    public var vstBirthtimensec: Long,
    public var vstSize: OffT,
    public var vstBlocks: Long,
    public var vstBlksize: Int,
    public var vstFlags: UInt,
    public var vstGen: UInt,
    public var vstRdev: UInt,
    public var vstQspare: List<Long>,
)

public open class VnodeInfo(
    public var viStat: VinfoStat,
    public var viType: CInt,
    public var viPad: CInt,
    public var viFsid: FsidT,
)

public open class VnodeInfoPath(
    public var vipVi: VnodeInfo,
    // Normally it's `vipPath: [cChar; MAXPATHLEN]` but because libc supports an old rustc
    // version, we go around this limitation like this.
    public var vipPath: List<List<CChar>>,
)

public open class ProcVnodepathinfo(public var pviCdir: VnodeInfoPath, public var pviRdir: VnodeInfoPath)

public open class VmStatistics(
    public var freeCount: NaturalT,
    public var activeCount: NaturalT,
    public var inactiveCount: NaturalT,
    public var wireCount: NaturalT,
    public var zeroFillCount: NaturalT,
    public var reactivations: NaturalT,
    public var pageins: NaturalT,
    public var pageouts: NaturalT,
    public var faults: NaturalT,
    public var cowFaults: NaturalT,
    public var lookups: NaturalT,
    public var hits: NaturalT,
    public var purgeableCount: NaturalT,
    public var purges: NaturalT,
    public var speculativeCount: NaturalT,
)

public open class TaskThreadTimesInfo(public var userTime: TimeValueT, public var systemTime: TimeValueT)

public open class RusageInfoV0(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
)

public open class RusageInfoV1(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
)

public open class RusageInfoV2(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
)

public open class RusageInfoV3(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
    public var riCpuTimeQosDefault: ULong,
    public var riCpuTimeQosMaintenance: ULong,
    public var riCpuTimeQosBackground: ULong,
    public var riCpuTimeQosUtility: ULong,
    public var riCpuTimeQosLegacy: ULong,
    public var riCpuTimeQosUserInitiated: ULong,
    public var riCpuTimeQosUserInteractive: ULong,
    public var riBilledSystemTime: ULong,
    public var riServicedSystemTime: ULong,
)

public open class RusageInfoV4(
    public var riUuid: List<UByte>,
    public var riUserTime: ULong,
    public var riSystemTime: ULong,
    public var riPkgIdleWkups: ULong,
    public var riInterruptWkups: ULong,
    public var riPageins: ULong,
    public var riWiredSize: ULong,
    public var riResidentSize: ULong,
    public var riPhysFootprint: ULong,
    public var riProcStartAbstime: ULong,
    public var riProcExitAbstime: ULong,
    public var riChildUserTime: ULong,
    public var riChildSystemTime: ULong,
    public var riChildPkgIdleWkups: ULong,
    public var riChildInterruptWkups: ULong,
    public var riChildPageins: ULong,
    public var riChildElapsedAbstime: ULong,
    public var riDiskioBytesread: ULong,
    public var riDiskioByteswritten: ULong,
    public var riCpuTimeQosDefault: ULong,
    public var riCpuTimeQosMaintenance: ULong,
    public var riCpuTimeQosBackground: ULong,
    public var riCpuTimeQosUtility: ULong,
    public var riCpuTimeQosLegacy: ULong,
    public var riCpuTimeQosUserInitiated: ULong,
    public var riCpuTimeQosUserInteractive: ULong,
    public var riBilledSystemTime: ULong,
    public var riServicedSystemTime: ULong,
    public var riLogicalWrites: ULong,
    public var riLifetimeMaxPhysFootprint: ULong,
    public var riInstructions: ULong,
    public var riCycles: ULong,
    public var riBilledEnergy: ULong,
    public var riServicedEnergy: ULong,
    public var riIntervalMaxPhysFootprint: ULong,
    public var riRunnableTime: ULong,
)

public open class ImageOffset(public var uuid: UuidT, public var offset: UInt)

public open class Attrlist(
    public var bitmapcount: CUshort,
    public var reserved: UShort,
    public var commonattr: AttrgroupT,
    public var volattr: AttrgroupT,
    public var dirattr: AttrgroupT,
    public var fileattr: AttrgroupT,
    public var forkattr: AttrgroupT,
)

public open class AttrreferenceT(public var attrDataoffset: Int, public var attrLength: UInt)

public open class VolCapabilitiesAttrT(public var capabilities: VolCapabilitiesSetT, public var valid: VolCapabilitiesSetT)

public open class AttributeSetT(
    public var commonattr: AttrgroupT,
    public var volattr: AttrgroupT,
    public var dirattr: AttrgroupT,
    public var fileattr: AttrgroupT,
    public var forkattr: AttrgroupT,
)

public open class VolAttributesAttrT(public var validattr: AttributeSetT, public var nativeattr: AttributeSetT)

public open class TcpConnectionInfo(
    public var tcpiState: UByte,
    public var tcpiSndWscale: UByte,
    public var tcpiRcvWscale: UByte,
    public var pad1: UByte,
    public var tcpiOptions: UInt,
    public var tcpiFlags: UInt,
    public var tcpiRto: UInt,
    public var tcpiMaxseg: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiSndWnd: UInt,
    public var tcpiSndSbbytes: UInt,
    public var tcpiRcvWnd: UInt,
    public var tcpiRttcur: UInt,
    public var tcpiSrtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiTfoCookieReq: UInt,
    public var tcpiTfoCookieRcv: UInt,
    public var tcpiTfoSynLoss: UInt,
    public var tcpiTfoSynDataSent: UInt,
    public var tcpiTfoSynDataAcked: UInt,
    public var tcpiTfoSynDataRcv: UInt,
    public var tcpiTfoCookieReqRcv: UInt,
    public var tcpiTfoCookieSent: UInt,
    public var tcpiTfoCookieInvalid: UInt,
    public var tcpiTfoCookieWrong: UInt,
    public var tcpiTfoNoCookieRcv: UInt,
    public var tcpiTfoHeuristicsDisable: UInt,
    public var tcpiTfoSendBlackhole: UInt,
    public var tcpiTfoRecvBlackhole: UInt,
    public var tcpiTfoOnebyteProxy: UInt,
    public var pad2: UInt,
    public var tcpiTxpackets: ULong,
    public var tcpiTxbytes: ULong,
    public var tcpiTxretransmitbytes: ULong,
    public var tcpiRxpackets: ULong,
    public var tcpiRxbytes: ULong,
    public var tcpiRxoutoforderbytes: ULong,
    public var tcpiRxretransmitpackets: ULong,
)

public open class In6Addrlifetime(
    public var ia6tExpire: TimeT,
    public var ia6tPreferred: TimeT,
    public var ia6tVltime: UInt,
    public var ia6tPltime: UInt,
)

public open class In6Ifstat(
    public var ifs6InReceive: UQuadT,
    public var ifs6InHdrerr: UQuadT,
    public var ifs6InToobig: UQuadT,
    public var ifs6InNoroute: UQuadT,
    public var ifs6InAddrerr: UQuadT,
    public var ifs6InProtounknown: UQuadT,
    public var ifs6InTruncated: UQuadT,
    public var ifs6InDiscard: UQuadT,
    public var ifs6InDeliver: UQuadT,
    public var ifs6OutForward: UQuadT,
    public var ifs6OutRequest: UQuadT,
    public var ifs6OutDiscard: UQuadT,
    public var ifs6OutFragok: UQuadT,
    public var ifs6OutFragfail: UQuadT,
    public var ifs6OutFragcreat: UQuadT,
    public var ifs6ReassReqd: UQuadT,
    public var ifs6ReassOk: UQuadT,
    public var ifs6AtmfragRcvd: UQuadT,
    public var ifs6ReassFail: UQuadT,
    public var ifs6InMcast: UQuadT,
    public var ifs6OutMcast: UQuadT,
    public var ifs6CantfowardIcmp6: UQuadT,
    public var ifs6AddrExpiryCnt: UQuadT,
    public var ifs6PfxExpiryCnt: UQuadT,
    public var ifs6DefrtrExpiryCnt: UQuadT,
)

public open class Icmp6Ifstat(
    public var ifs6InMsg: UQuadT,
    public var ifs6InError: UQuadT,
    public var ifs6InDstunreach: UQuadT,
    public var ifs6InAdminprohib: UQuadT,
    public var ifs6InTimeexceed: UQuadT,
    public var ifs6InParamprob: UQuadT,
    public var ifs6InPkttoobig: UQuadT,
    public var ifs6InEcho: UQuadT,
    public var ifs6InEchoreply: UQuadT,
    public var ifs6InRoutersolicit: UQuadT,
    public var ifs6InRouteradvert: UQuadT,
    public var ifs6InNeighborsolicit: UQuadT,
    public var ifs6InNeighboradvert: UQuadT,
    public var ifs6InRedirect: UQuadT,
    public var ifs6InMldquery: UQuadT,
    public var ifs6InMldreport: UQuadT,
    public var ifs6InMlddone: UQuadT,
    public var ifs6OutMsg: UQuadT,
    public var ifs6OutError: UQuadT,
    public var ifs6OutDstunreach: UQuadT,
    public var ifs6OutAdminprohib: UQuadT,
    public var ifs6OutTimeexceed: UQuadT,
    public var ifs6OutParamprob: UQuadT,
    public var ifs6OutPkttoobig: UQuadT,
    public var ifs6OutEcho: UQuadT,
    public var ifs6OutEchoreply: UQuadT,
    public var ifs6OutRoutersolicit: UQuadT,
    public var ifs6OutRouteradvert: UQuadT,
    public var ifs6OutNeighborsolicit: UQuadT,
    public var ifs6OutNeighboradvert: UQuadT,
    public var ifs6OutRedirect: UQuadT,
    public var ifs6OutMldquery: UQuadT,
    public var ifs6OutMldreport: UQuadT,
    public var ifs6OutMlddone: UQuadT,
)

// mach/hostInfo.h
public open class HostCpuLoadInfo(public var cpuTicks: List<NaturalT>)

// net/ifMib.h
public open class Ifmibdata(
    /**
     * Name of interface
     */
    public var ifmdName: List<CChar>,
    /**
     * Number of promiscuous listeners
     */
    public var ifmdPcount: CUint,
    /**
     * Interface flags
     */
    public var ifmdFlags: CUint,
    /**
     * Instantaneous length of send queue
     */
    public var ifmdSndLen: CUint,
    /**
     * Maximum length of send queue
     */
    public var ifmdSndMaxlen: CUint,
    /**
     * Number of drops in send queue
     */
    public var ifmdSndDrops: CUint,
    /**
     * For future expansion
     */
    public var ifmdFiller: List<CUint>,
    /**
     * Generic information and statistics
     */
    public var ifmdData: IfData64,
)

public open class IfsIso88023(
    public var dot3StatsAlignmentErrors: UInt,
    public var dot3StatsFCSErrors: UInt,
    public var dot3StatsSingleCollisionFrames: UInt,
    public var dot3StatsMultipleCollisionFrames: UInt,
    public var dot3StatsSQETestErrors: UInt,
    public var dot3StatsDeferredTransmissions: UInt,
    public var dot3StatsLateCollisions: UInt,
    public var dot3StatsExcessiveCollisions: UInt,
    public var dot3StatsInternalMacTransmitErrors: UInt,
    public var dot3StatsCarrierSenseErrors: UInt,
    public var dot3StatsFrameTooLongs: UInt,
    public var dot3StatsInternalMacReceiveErrors: UInt,
    public var dot3StatsEtherChipSet: UInt,
    public var dot3StatsMissedFrames: UInt,
    public var dot3StatsCollFrequencies: List<UInt>,
    public var dot3Compliance: UInt,
)

// kernControl.h
public open class CtlInfo(public var ctlId: UInt, public var ctlName: List<CChar>)

// sys/procInfo.h
public open class ProcFdinfo(public var procFd: Int, public var procFdtype: UInt)

public open class Kevent(
    public var ident: UintptrT,
    public var filter: Short,
    public var flags: UShort,
    public var fflags: UInt,
    public var data: IntptrT,
    public var udata: COpaquePointer?,
)

public open class SemidDs(
    // Note the manpage shows different types than the system header.
    public var semPerm: IpcPerm,
    public var semBase: Int,
    public var semNsems: CUshort,
    public var semOtime: TimeT,
    public var semPad1: Int,
    public var semCtime: TimeT,
    public var semPad2: Int,
    public var semPad3: List<Int>,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmAtime: TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmDtime: TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmCtime: TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    // Note: 64-bit wrong align => wrong offset:
    public var shmInternal: COpaquePointer?,
)

public open class ProcThreadinfo(
    public var pthUserTime: ULong,
    public var pthSystemTime: ULong,
    public var pthCpuUsage: Int,
    public var pthPolicy: Int,
    public var pthRunState: Int,
    public var pthFlags: Int,
    public var pthSleepTime: Int,
    public var pthCurpri: Int,
    public var pthPriority: Int,
    public var pthMaxpriority: Int,
    public var pthName: List<CChar>,
)

public open class Statfs(
    public var fBsize: UInt,
    public var fIosize: Int,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: ULong,
    public var fFiles: ULong,
    public var fFfree: ULong,
    public var fFsid: FsidT,
    public var fOwner: UidT,
    public var fType: UInt,
    public var fFlags: UInt,
    public var fFssubtype: UInt,
    public var fFstypename: List<CChar>,
    public var fMntonname: List<CChar>,
    public var fMntfromname: List<CChar>,
    public var fFlagsExt: UInt,
    public var fReserved: List<UInt>,
)

public open class Dirent(
    public var dIno: ULong,
    public var dSeekoff: ULong,
    public var dReclen: UShort,
    public var dNamlen: UShort,
    public var dType: UByte,
    public var dName: List<CChar>,
)

public open class SockaddrStorage(
    public var ssLen: UByte,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<UByte>,
    public var ssAlign: Long,
    public var ssPad2: List<UByte>,
)

public open class Utmpx(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utTv: Timeval,
    public var utHost: List<CChar>,
    public var utPad: List<UInt>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var unused1: COpaquePointer?,
    // actually a function pointer
    public var sigevNotifyAttributes: PthreadAttrT?,
)

public open class ProcessorCpuLoadInfo(public var cpuTicks: List<CUint>)

public open class ProcessorBasicInfo(
    public var cpuType: CpuTypeT,
    public var cpuSubtype: CpuSubtypeT,
    public var running: BooleanT,
    public var slotNum: CInt,
    public var isMaster: BooleanT,
)

public open class ProcessorSetBasicInfo(public var processorCount: CInt, public var defaultPolicy: CInt)

public open class ProcessorSetLoadInfo(
    public var taskCount: CInt,
    public var threadCount: CInt,
    public var loadAverage: IntegerT,
    public var machFactor: IntegerT,
)

public open class TimeValueT(public var seconds: IntegerT, public var microseconds: IntegerT)

public open class ThreadBasicInfo(
    public var userTime: TimeValueT,
    public var systemTime: TimeValueT,
    public var cpuUsage: IntegerT,
    public var policy: PolicyT,
    public var runState: IntegerT,
    public var flags: IntegerT,
    public var suspendCount: IntegerT,
    public var sleepTime: IntegerT,
)

public open class ThreadIdentifierInfo(
    public var threadId: ULong,
    public var threadHandle: ULong,
    public var dispatchQaddr: ULong,
)

public open class ThreadExtendedInfo(
    public var pthUserTime: ULong,
    public var pthSystemTime: ULong,
    public var pthCpuUsage: Int,
    public var pthPolicy: Int,
    public var pthRunState: Int,
    public var pthFlags: Int,
    public var pthSleepTime: Int,
    public var pthCurpri: Int,
    public var pthPriority: Int,
    public var pthMaxpriority: Int,
    public var pthName: List<CChar>,
)

public open class IfData64(
    public var ifiType: CUchar,
    public var ifiTypelen: CUchar,
    public var ifiPhysical: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiRecvquota: CUchar,
    public var ifiXmitquota: CUchar,
    public var ifiUnused1: CUchar,
    public var ifiMtu: UInt,
    public var ifiMetric: UInt,
    public var ifiBaudrate: ULong,
    public var ifiIpackets: ULong,
    public var ifiIerrors: ULong,
    public var ifiOpackets: ULong,
    public var ifiOerrors: ULong,
    public var ifiCollisions: ULong,
    public var ifiIbytes: ULong,
    public var ifiObytes: ULong,
    public var ifiImcasts: ULong,
    public var ifiOmcasts: ULong,
    public var ifiIqdrops: ULong,
    public var ifiNoproto: ULong,
    public var ifiRecvtiming: UInt,
    public var ifiXmittiming: UInt,
    public var ifiLastchange: Timeval32,
)

public open class IfMsghdr2(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmIndex: CUshort,
    public var ifmSndLen: CInt,
    public var ifmSndMaxlen: CInt,
    public var ifmSndDrops: CInt,
    public var ifmTimer: CInt,
    public var ifmData: IfData64,
)

public open class VmStatistics64(
    public var freeCount: NaturalT,
    public var activeCount: NaturalT,
    public var inactiveCount: NaturalT,
    public var wireCount: NaturalT,
    public var zeroFillCount: ULong,
    public var reactivations: ULong,
    public var pageins: ULong,
    public var pageouts: ULong,
    public var faults: ULong,
    public var cowFaults: ULong,
    public var lookups: ULong,
    public var hits: ULong,
    public var purges: ULong,
    public var purgeableCount: NaturalT,
    public var speculativeCount: NaturalT,
    public var decompressions: ULong,
    public var compressions: ULong,
    public var swapins: ULong,
    public var swapouts: ULong,
    public var compressorPageCount: NaturalT,
    public var throttledCount: NaturalT,
    public var externalPageCount: NaturalT,
    public var internalPageCount: NaturalT,
    public var totalUncompressedPagesInCompressor: ULong,
)

public open class MachTaskBasicInfo(
    public var virtualSize: MachVmSizeT,
    public var residentSize: MachVmSizeT,
    public var residentSizeMax: MachVmSizeT,
    public var userTime: TimeValueT,
    public var systemTime: TimeValueT,
    public var policy: PolicyT,
    public var suspendCount: IntegerT,
)

public open class Log2phys(
    public var l2pFlags: CUint,
    public var l2pContigbytes: OffT,
    public var l2pDevoffset: OffT,
)

public open class OsUnfairLockS(public var osUnfairLockOpaque: UInt)

public open class SockaddrVm(
    public var svmLen: CUchar,
    public var svmFamily: SaFamilyT,
    public var svmReserved1: CUshort,
    public var svmPort: CUint,
    public var svmCid: CUint,
)

public open class Ifdevmtu(
    public var ifdmCurrent: CInt,
    public var ifdmMin: CInt,
    public var ifdmMax: CInt,
)

public open class Ifkpi(
    public var ifkModuleId: CUint,
    public var ifkType: CUint,
    public var ifkData: CAnonymousIfkData,
)

public open class Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru)

public open class In6Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru6)

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu) {
    public open fun eq(other: Ifconf): Boolean {
        val lenPtr1 = addrOf(this.ifcLen)
        val lenPtr2 = addrOf(other.ifcLen)
        val ifcuPtr1 = addrOf(this.ifcIfcu)
        val ifcuPtr2 = addrOf(other.ifcIfcu)
        // SAFETY: `ifconf` implements `Copy` so the reads are valid
        val len1 = lenPtr1.readUnaligned()
        val len2 = lenPtr2.readUnaligned()
        val ifcu1 = ifcuPtr1.readUnaligned()
        val ifcu2 = ifcuPtr2.readUnaligned()
        return len1 == len2 && ifcu1 == ifcu2
    }
}

public open class CAnonymousIfkData(public var ifkPtr: COpaquePointer?? = null, public var ifkValue: CInt? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifk_data").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfkData): Boolean {
        return this.ifkPtr == other.ifkPtr && this.ifkValue == other.ifkValue
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifkPtr).hashCode()
            state = 31 * state + (this.ifkValue).hashCode()
        }
        return state
    }
}

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruFlags: CShort? = null,
    public var ifruMetrics: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruPhys: CInt? = null,
    public var ifruMedia: CInt? = null,
    public var ifruIntval: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruDevmtu: Ifdevmtu? = null,
    public var ifruKpi: Ifkpi? = null,
    public var ifruWakeFlags: UInt? = null,
    public var ifruRouteRefcnt: UInt? = null,
    public var ifruCap: List<CInt>? = null,
    public var ifruFunctionalType: UInt? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetrics == other.ifruMetrics && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruDevmtu == other.ifruDevmtu && this.ifruKpi == other.ifruKpi && this.ifruWakeFlags == other.ifruWakeFlags && this.ifruRouteRefcnt == other.ifruRouteRefcnt && this.ifruCap.iter().zip(other.ifruCap.iter()).all({ (a, b) -> a == b }) && this.ifruFunctionalType == other.ifruFunctionalType
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifruAddr).hashCode()
            state = 31 * state + (this.ifruDstaddr).hashCode()
            state = 31 * state + (this.ifruBroadaddr).hashCode()
            state = 31 * state + (this.ifruFlags).hashCode()
            state = 31 * state + (this.ifruMetrics).hashCode()
            state = 31 * state + (this.ifruMtu).hashCode()
            state = 31 * state + (this.ifruPhys).hashCode()
            state = 31 * state + (this.ifruMedia).hashCode()
            state = 31 * state + (this.ifruIntval).hashCode()
            state = 31 * state + (this.ifruData).hashCode()
            state = 31 * state + (this.ifruDevmtu).hashCode()
            state = 31 * state + (this.ifruKpi).hashCode()
            state = 31 * state + (this.ifruWakeFlags).hashCode()
            state = 31 * state + (this.ifruRouteRefcnt).hashCode()
            state = 31 * state + (this.ifruCap).hashCode()
            state = 31 * state + (this.ifruFunctionalType).hashCode()
        }
        return state
    }
}

public open class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer?? = null, public var ifcuReq: Ifreq?? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfcIfcu): Boolean {
        return this.ifcuBuf == other.ifcuBuf && this.ifcuReq == other.ifcuReq
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ifcuBuf).hashCode()
        state = 31 * state + (this.ifcuReq).hashCode()
        return state
    }
}

public open class CAnonymousIfrIfru6(
    public var ifruAddr: SockaddrIn6? = null,
    public var ifruDstaddr: SockaddrIn6? = null,
    public var ifruFlags: CInt? = null,
    public var ifruFlags6: CInt? = null,
    public var ifruMetrics: CInt? = null,
    public var ifruIntval: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruLifetime: In6Addrlifetime? = null,
    public var ifruStat: In6Ifstat? = null,
    public var ifruIcmp6stat: Icmp6Ifstat? = null,
    public var ifruScopeId: List<UInt>? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru6").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfrIfru6): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruFlags == other.ifruFlags && this.ifruFlags6 == other.ifruFlags6 && this.ifruMetrics == other.ifruMetrics && this.ifruIntval == other.ifruIntval && this.ifruData == other.ifruData && this.ifruScopeId.iter().zip(other.ifruScopeId.iter()).all({ (a, b) -> a == b })
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.ifruAddr).hashCode()
            state = 31 * state + (this.ifruDstaddr).hashCode()
            state = 31 * state + (this.ifruFlags).hashCode()
            state = 31 * state + (this.ifruFlags6).hashCode()
            state = 31 * state + (this.ifruMetrics).hashCode()
            state = 31 * state + (this.ifruIntval).hashCode()
            state = 31 * state + (this.ifruData).hashCode()
            state = 31 * state + (this.ifruScopeId).hashCode()
        }
        return state
    }
}

public open class Semun(
    public var value: CInt? = null,
    public var buf: SemidDs?? = null,
    public var array: CUshort?? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "semun").finishNonExhaustive()
    }

    public open fun eq(other: Semun): Boolean {
        return this.value == other.value
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.value).hashCode()
        return state
    }
}
