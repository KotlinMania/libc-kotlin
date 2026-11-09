package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

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
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.McontextT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.RegisterT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT

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

// sys/cpuset.h
public open class Aiocb(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var unused1: List<CInt>,
    public var unused2: COpaquePointer?,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    // unused 3 through 5 are the __aiocb_private structure
    public var unused3: CLong,
    public var unused4: CLong,
    public var unused5: COpaquePointer?,
    public var aioSigevent: Sigevent,
)

public open class Jail(
    public var version: UInt,
    public var path: COpaquePointer?,
    public var hostname: COpaquePointer?,
    public var jailname: COpaquePointer?,
    public var ip4s: CUint,
    public var ip6s: CUint,
    public var ip4: InAddr?,
    public var ip6: In6Addr?,
)

public open class Statvfs(
    public var fBavail: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBlocks: FsblkcntT,
    public var fFavail: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFiles: FsfilcntT,
    public var fBsize: CUlong,
    public var fFlag: CUlong,
    public var fFrsize: CUlong,
    public var fFsid: CUlong,
    public var fNamemax: CUlong,
)

// internal structure has changed over time
public open class Sem(public var data: List<UInt>)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class InputEvent(
    public var time: Timeval,
    public var type: UShort,
    public var code: UShort,
    public var value: Int,
)

public open class InputAbsinfo(
    public var value: Int,
    public var minimum: Int,
    public var maximum: Int,
    public var fuzz: Int,
    public var flat: Int,
    public var resolution: Int,
)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var msgCbytes: MsglenT,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: SsizeT)

public open class Sockcred(
    public var scUid: UidT,
    public var scEuid: UidT,
    public var scGid: GidT,
    public var scEgid: GidT,
    public var scNgroups: CInt,
    public var scGroups: List<GidT>,
)

public open class PtraceVmEntry(
    public var pveEntry: CInt,
    public var pveTimestamp: CInt,
    public var pveStart: CUlong,
    public var pveEnd: CUlong,
    public var pveOffset: CUlong,
    public var pveProt: CUint,
    public var pvePathlen: CUint,
    public var pveFileid: CLong,
    public var pveFsid: UInt,
    public var pvePath: COpaquePointer?,
)

public open class PtraceLwpinfo(
    public var plLwpid: LwpidT,
    public var plEvent: CInt,
    public var plFlags: CInt,
    public var plSigmask: SigsetT,
    public var plSiglist: SigsetT,
    public var plSiginfo: SiginfoT,
    public var plTdname: List<CChar>,
    public var plChildPid: PidT,
    public var plSyscallCode: CUint,
    public var plSyscallNarg: CUint,
)

public open class PtraceScRet(public var srRetval: List<RegisterT>, public var srError: CInt)

public open class PtraceCoredump(
    public var pcFd: CInt,
    public var pcFlags: UInt,
    public var pcLimit: OffT,
)

public open class PtraceScRemote(
    public var pscrRet: PtraceScRet,
    public var pscrSyscall: CUint,
    public var pscrNargs: CUint,
    public var pscrArgs: RegisterT?,
)

public open class CpusetT(public var bits: List<CLong>)

public open class CapRightsT(public var crRights: List<ULong>)

public open class Umutex(
    public var mOwner: LwpidT,
    public var mFlags: UInt,
    public var mCeilings: List<UInt>,
    public var mRbLink: UintptrT,
    public var mSpare: List<UInt>,
)

public open class Ucond(
    public var cHasWaiters: UInt,
    public var cFlags: UInt,
    public var cClockid: UInt,
    public var cSpare: List<UInt>,
)

public open class Uuid(
    public var timeLow: UInt,
    public var timeMid: UShort,
    public var timeHiAndVersion: UShort,
    public var clockSeqHiAndReserved: UByte,
    public var clockSeqLow: UByte,
    public var node: List<UByte>,
)

public open class CAnonymousPthreadSpinlock(public var sClock: Umutex)

public open class CAnonymousPthreadBarrierattr(public var pshared: CInt)

public open class CAnonymousPthreadBarrier(
    public var bLock: Umutex,
    public var bCv: Ucond,
    public var bCycle: Long,
    public var bCount: CInt,
    public var bWaiters: CInt,
    public var bRefcount: CInt,
    public var bDestroying: CInt,
)

public open class KinfoVmentry(
    public var kveStructsize: CInt,
    public var kveType: CInt,
    public var kveStart: ULong,
    public var kveEnd: ULong,
    public var kveOffset: ULong,
    public var kveVnFileid: ULong,
    public var kveVnFsidFreebsd11: UInt,
    public var kveVnFsid: UInt,
    public var kveFlags: CInt,
    public var kveResident: CInt,
    public var kvePrivateResident: CInt,
    public var kveProtection: CInt,
    public var kveRefCount: CInt,
    public var kveShadowCount: CInt,
    public var kveVnType: CInt,
    public var kveVnSize: ULong,
    public var kveVnRdevFreebsd11: UInt,
    public var kveVnRdev: UInt,
    public var kveVnMode: UShort,
    public var kveStatus: UShort,
    public var kveIsSpare: List<CInt>,
    public var kvePath: List<List<CChar>>,
)

public open class CAnonymousFilestat(public var stqeNext: Filestat?)

public open class Filestat(
    public var fsType: CInt,
    public var fsFlags: CInt,
    public var fsFflags: CInt,
    public var fsUflags: CInt,
    public var fsFd: CInt,
    public var fsRefCount: CInt,
    public var fsOffset: OffT,
    public var fsTypedep: COpaquePointer?,
    public var fsPath: COpaquePointer?,
    public var next: CAnonymousFilestat,
    public var fsCapRights: CapRightsT,
)

public open class FilestatList(public var stqhFirst: Filestat?, public var stqhLast: COpaquePointer?)

public open class Procstat(
    public var tpe: CInt,
    public var kd: UintptrT,
    public var vmentries: COpaquePointer?,
    public var files: COpaquePointer?,
    public var argv: COpaquePointer?,
    public var envv: COpaquePointer?,
    public var core: UintptrT,
)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class CAnonymousTimer(public var priv: List<CInt>)

/**
 * Used to hold a copy of the command line, if it had a sane length.
 */
public open class Pargs(
    /**
     * Reference count.
     */
    public var arRef: UInt,
    /**
     * Length.
     */
    public var arLength: UInt,
    /**
     * Arguments.
     */
    public var arArgs: List<CUchar>,
)

public open class Priority(
    /**
     * Scheduling class.
     */
    public var priClass: UChar,
    /**
     * Normal priority level.
     */
    public var priLevel: UChar,
    /**
     * Priority before propagation.
     */
    public var priNative: UChar,
    /**
     * User priority based on pCpu and pNice.
     */
    public var priUser: UChar,
)

public open class KvmSwap(
    public var kswDevname: List<CChar>,
    public var kswUsed: UInt,
    public var kswTotal: UInt,
    public var kswFlags: CInt,
    public var kswReserved1: UInt,
    public var kswReserved2: UInt,
)

public open class Nlist(
    /**
     * symbol name (in memory)
     */
    public var nName: COpaquePointer?,
    /**
     * type defines
     */
    public var nType: CUchar,
    /**
     * "type" and binding information
     */
    public var nOther: CChar,
    /**
     * used by stab entries
     */
    public var nDesc: CShort,
    public var nValue: CUlong,
)

public open class KvmNlist(
    public var nName: COpaquePointer?,
    public var nType: CUchar,
    public var nValue: KvaddrT,
)

public open class CAnonymousSem(public var priv: UintptrT)

public open class SemidDs(
    public var semPerm: IpcPerm,
    public var semBase: CAnonymousSem?,
    public var semNsems: CUshort,
    public var semOtime: TimeT,
    public var semCtime: TimeT,
)

public open class Vmtotal(
    public var tVm: ULong,
    public var tAvm: ULong,
    public var tRm: ULong,
    public var tArm: ULong,
    public var tVmshr: ULong,
    public var tAvmshr: ULong,
    public var tRmshr: ULong,
    public var tArmshr: ULong,
    public var tFree: ULong,
    public var tRq: Short,
    public var tDw: Short,
    public var tPw: Short,
    public var tSl: Short,
    public var tSw: Short,
    public var tPad: List<UShort>,
)

public open class Sockstat(
    public var inpPpcb: ULong,
    public var soAddr: ULong,
    public var soPcb: ULong,
    public var unpConn: ULong,
    public var domFamily: CInt,
    public var proto: CInt,
    public var soRcvSbState: CInt,
    public var soSndSbState: CInt,
    /**
     * Socket address.
     */
    public var saLocal: SockaddrStorage,
    /**
     * Peer address.
     */
    public var saPeer: SockaddrStorage,
    public var type: CInt,
    public var dname: List<CChar>,
    public var sendq: CUint,
    public var recvq: CUint,
)

public open class Shmstat(public var size: ULong, public var mode: UShort)

public open class SpacectlRange(public var rOffset: OffT, public var rLen: OffT)

public open class RusageExt(
    public var ruxRuntime: ULong,
    public var ruxUticks: ULong,
    public var ruxSticks: ULong,
    public var ruxIticks: ULong,
    public var ruxUu: ULong,
    public var ruxSu: ULong,
    public var ruxTu: ULong,
)

public open class IfClonereq(
    public var ifcrTotal: CInt,
    public var ifcrCount: CInt,
    public var ifcrBuffer: COpaquePointer?,
)

public open class IfMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar,
    /**
     * message type
     */
    public var ifmType: CUchar,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort,
    public var ifmSpare1: CUshort,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData,
)

public open class IfMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar,
    /**
     * message type
     */
    public var ifmType: CUchar,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifmSpare1: CUshort,
    /**
     * length of ifMsghdrl incl. ifData
     */
    public var ifmLen: CUshort,
    /**
     * offset of ifData from beginning
     */
    public var ifmDataOff: CUshort,
    public var ifmSpare2: CInt,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData,
)

public open class IfaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar,
    /**
     * message type
     */
    public var ifamType: CUchar,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort,
    public var ifamSpare1: CUshort,
    /**
     * value of ifaIfp->ifMetric
     */
    public var ifamMetric: CInt,
)

public open class IfaMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar,
    /**
     * message type
     */
    public var ifamType: CUchar,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifamSpare1: CUshort,
    /**
     * length of ifaMsghdrl incl. ifData
     */
    public var ifamLen: CUshort,
    /**
     * offset of ifData from beginning
     */
    public var ifamDataOff: CUshort,
    /**
     * value of ifaIfp->ifMetric
     */
    public var ifamMetric: CInt,
    /**
     * statistics and other data about if or address
     */
    public var ifamData: IfData,
)

public open class IfmaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmamMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifmamVersion: CUchar,
    /**
     * message type
     */
    public var ifmamType: CUchar,
    /**
     * like rtmAddrs
     */
    public var ifmamAddrs: CInt,
    /**
     * value of ifaFlags
     */
    public var ifmamFlags: CInt,
    /**
     * index for associated ifp
     */
    public var ifmamIndex: CUshort,
    public var ifmamSpare1: CUshort,
)

public open class IfAnnouncemsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifanMsglen: CUshort,
    /**
     * future binary compatibility
     */
    public var ifanVersion: CUchar,
    /**
     * message type
     */
    public var ifanType: CUchar,
    /**
     * index for associated ifp
     */
    public var ifanIndex: CUshort,
    /**
     * if name, e.g. "en0"
     */
    public var ifanName: List<CChar>,
    /**
     * what type of announcement
     */
    public var ifanWhat: CUshort,
)

public open class IfreqBuffer(public var length: SizeT, public var buffer: COpaquePointer?)

public open class Ifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: List<CChar>,
    public var ifraAddr: Sockaddr,
    public var ifraBroadaddr: Sockaddr,
    public var ifraMask: Sockaddr,
    public var ifraVhid: CInt,
)

/**
 * 9.x compat
 */
public open class Oifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: List<CChar>,
    public var ifraAddr: Sockaddr,
    public var ifraBroadaddr: Sockaddr,
    public var ifraMask: Sockaddr,
)

public open class Ifmediareq(
    /**
     * if name, e.g. "en0"
     */
    public var ifmName: List<CChar>,
    /**
     * current media options
     */
    public var ifmCurrent: CInt,
    /**
     * don't care mask
     */
    public var ifmMask: CInt,
    /**
     * media status
     */
    public var ifmStatus: CInt,
    /**
     * active options
     */
    public var ifmActive: CInt,
    /**
     * # entries in ifmUlist array
     */
    public var ifmCount: CInt,
    /**
     * media words
     */
    public var ifmUlist: CInt?,
)

public open class Ifdrv(
    /**
     * if name, e.g. "en0"
     */
    public var ifdName: List<CChar>,
    public var ifdCmd: CUlong,
    public var ifdLen: SizeT,
    public var ifdData: COpaquePointer?,
)

public open class Ifi2creq(
    /**
     * i2c address (0xA0, 0xA2)
     */
    public var devAddr: UByte,
    /**
     * read offset
     */
    public var offset: UByte,
    /**
     * read length
     */
    public var len: UByte,
    public var spare0: UByte,
    public var spare1: UInt,
    /**
     * read buffer
     */
    public var data: List<UByte>,
)

public open class Ifrsshash(
    /**
     * if name, e.g. "en0"
     */
    public var ifrhName: List<CChar>,
    /**
     * RSS_FUNC_
     */
    public var ifrhFunc: UByte,
    public var ifrhSpare0: UByte,
    public var ifrhSpare1: UShort,
    /**
     * RSS_TYPE_
     */
    public var ifrhTypes: UInt,
)

public open class Ifmibdata(
    /**
     * name of interface
     */
    public var ifmdName: List<CChar>,
    /**
     * number of promiscuous listeners
     */
    public var ifmdPcount: CInt,
    /**
     * interface flags
     */
    public var ifmdFlags: CInt,
    /**
     * instantaneous length of send queue
     */
    public var ifmdSndLen: CInt,
    /**
     * maximum length of send queue
     */
    public var ifmdSndMaxlen: CInt,
    /**
     * number of drops in send queue
     */
    public var ifmdSndDrops: CInt,
    /**
     * for future expansion
     */
    public var ifmdFiller: List<CInt>,
    /**
     * generic information and statistics
     */
    public var ifmdData: IfData,
)

public open class IfmibIso88023(
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

public open class CAnonymousPh(public var ph1: ULong, public var ph2: ULong)

public open class Fid(
    public var fidLen: CUshort,
    public var fidData0: CUshort,
    public var fidData: List<CChar>,
)

public open class Fhandle(public var fhFsid: FsidT, public var fhFid: Fid)

public open class Bintime(public var sec: TimeT, public var frac: ULong)

public open class Clockinfo(
    /**
     * clock frequency
     */
    public var hz: CInt,
    /**
     * micro-seconds per hz tick
     */
    public var tick: CInt,
    public var spare: CInt,
    /**
     * statistics clock frequency
     */
    public var stathz: CInt,
    /**
     * profiling clock frequency
     */
    public var profhz: CInt,
)

public open class CAnonymousStailqEntryDevstat(public var stqeNext: Devstat?)

public open class Devstat(
    /**
     * Update sequence
     */
    public var sequence0: UInt,
    /**
     * Allocated entry
     */
    public var allocated: CInt,
    /**
     * started ops
     */
    public var startCount: UInt,
    /**
     * completed ops
     */
    public var endCount: UInt,
    /**
     * busy time unaccounted for since this time
     */
    public var busyFrom: Bintime,
    public var devLinks: CAnonymousStailqEntryDevstat,
    /**
     * Devstat device number.
     */
    public var deviceNumber: UInt,
    public var deviceName: List<CChar>,
    public var unitNumber: CInt,
    public var bytes: List<ULong>,
    public var operations: List<ULong>,
    public var duration: List<Bintime>,
    public var busyTime: Bintime,
    /**
     * Time the device was created.
     */
    public var creationTime: Bintime,
    /**
     * Block size, bytes
     */
    public var blockSize: UInt,
    /**
     * The number of simple, ordered, and head of queue tags sent.
     */
    public var tagTypes: List<ULong>,
    /**
     * Which statistics are supported by a given device.
     */
    public var flags: DevstatSupportFlags,
    /**
     * Device type
     */
    public var deviceType: DevstatTypeFlags,
    /**
     * Controls list pos.
     */
    public var priority: DevstatPriority,
    /**
     * Identification for GEOM nodes
     */
    public var id: COpaquePointer?,
    /**
     * Update sequence
     */
    public var sequence1: UInt,
)

public open class DevstatMatch(
    public var matchFields: DevstatMatchFlags,
    public var deviceType: DevstatTypeFlags,
    public var numMatchCategories: CInt,
)

public open class DevstatMatchTable(
    public var matchStr: COpaquePointer?,
    public var type: DevstatTypeFlags,
    public var matchField: DevstatMatchFlags,
)

public open class DeviceSelection(
    public var deviceNumber: UInt,
    public var deviceName: List<CChar>,
    public var unitNumber: CInt,
    public var selected: CInt,
    public var bytes: ULong,
    public var position: CInt,
)

public open class Devinfo(
    public var devices: Devstat?,
    public var memPtr: COpaquePointer?,
    public var generation: CLong,
    public var numdevs: CInt,
)

public open class Sockcred2(
    public var scVersion: CInt,
    public var scPid: PidT,
    public var scUid: UidT,
    public var scEuid: UidT,
    public var scGid: GidT,
    public var scEgid: GidT,
    public var scNgroups: CInt,
    public var scGroups: List<GidT>,
)

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu)

public open class AuMaskT(public var amSuccess: CUint, public var amFailure: CUint)

public open class AuTidT(public var port: UInt, public var machine: UInt)

public open class AuditinfoT(
    public var aiAuid: AuIdT,
    public var aiMask: AuMaskT,
    public var aiTermid: AuTidT,
    public var aiAsid: AuAsidT,
)

public open class TcpFastopen(public var enable: CInt, public var psk: List<UByte>)

public open class TcpFunctionSet(public var functionSetName: List<CChar>, public var pcbcnt: UInt)

// Note: this structure will change in a backwards-incompatible way in
// FreeBSD 15.
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
    public var tcpiDeliveredCe: UInt,
    public var tcpiReceivedCe: UInt,
    public var tcpiDeliveredE1Bytes: UInt,
    public var tcpiDeliveredE0Bytes: UInt,
    public var tcpiDeliveredCeBytes: UInt,
    public var tcpiReceivedE1Bytes: UInt,
    public var tcpiReceivedE0Bytes: UInt,
    public var tcpiReceivedCeBytes: UInt,
    public var tcpiTotalTlp: UInt,
    public var tcpiTotalTlpBytes: ULong,
    public var tcpiSndUna: UInt,
    public var tcpiSndMax: UInt,
    public var tcpiRcvNumsacks: UInt,
    public var tcpiRcvAdv: UInt,
    public var tcpiDupacks: UInt,
    public var tcpiPad: List<UInt>,
)

public open class UmtxTime(
    public var timeout: Timespec,
    public var flags: UInt,
    public var clockid: UInt,
)

public open class ShmLargepageConf(
    public var psind: CInt,
    public var allocPolicy: CInt,
    public var pad: List<CInt>,
)

public open class MemoryType(public var priva: List<UintptrT>, public var privb: List<UintptrT>)

public open class MemoryTypeList(public var priv: List<UintptrT>)

public open class Pidfh(public var priva: List<List<UintptrT>>, public var privb: List<UintptrT>)

public open class SctpEvent(
    public var seAssocId: SctpAssocT,
    public var seType: UShort,
    public var seOn: UByte,
)

public open class SctpEventSubscribe(
    public var sctpDataIoEvent: UByte,
    public var sctpAssociationEvent: UByte,
    public var sctpAddressEvent: UByte,
    public var sctpSendFailureEvent: UByte,
    public var sctpPeerErrorEvent: UByte,
    public var sctpShutdownEvent: UByte,
    public var sctpPartialDeliveryEvent: UByte,
    public var sctpAdaptationLayerEvent: UByte,
    public var sctpAuthenticationEvent: UByte,
    public var sctpSenderDryEvent: UByte,
    public var sctpStreamResetEvent: UByte,
)

public open class SctpInitmsg(
    public var sinitNumOstreams: UShort,
    public var sinitMaxInstreams: UShort,
    public var sinitMaxAttempts: UShort,
    public var sinitMaxInitTimeo: UShort,
)

public open class SctpSndrcvinfo(
    public var sinfoStream: UShort,
    public var sinfoSsn: UShort,
    public var sinfoFlags: UShort,
    public var sinfoPpid: UInt,
    public var sinfoContext: UInt,
    public var sinfoTimetolive: UInt,
    public var sinfoTsn: UInt,
    public var sinfoCumtsn: UInt,
    public var sinfoAssocId: SctpAssocT,
    public var sinfoKeynumber: UShort,
    public var sinfoKeynumberValid: UShort,
    public var reservePad: List<List<UByte>>,
)

public open class SctpExtrcvinfo(
    public var sinfoStream: UShort,
    public var sinfoSsn: UShort,
    public var sinfoFlags: UShort,
    public var sinfoPpid: UInt,
    public var sinfoContext: UInt,
    public var sinfoTimetolive: UInt,
    public var sinfoTsn: UInt,
    public var sinfoCumtsn: UInt,
    public var sinfoAssocId: SctpAssocT,
    public var serinfoNextFlags: UShort,
    public var serinfoNextStream: UShort,
    public var serinfoNextAid: UInt,
    public var serinfoNextLength: UInt,
    public var serinfoNextPpid: UInt,
    public var sinfoKeynumber: UShort,
    public var sinfoKeynumberValid: UShort,
    public var reservePad: List<List<UByte>>,
)

public open class SctpSndinfo(
    public var sndSid: UShort,
    public var sndFlags: UShort,
    public var sndPpid: UInt,
    public var sndContext: UInt,
    public var sndAssocId: SctpAssocT,
)

public open class SctpPrinfo(public var prPolicy: UShort, public var prValue: UInt)

public open class SctpDefaultPrinfo(
    public var prPolicy: UShort,
    public var prValue: UInt,
    public var prAssocId: SctpAssocT,
)

public open class SctpAuthinfo(public var authKeynumber: UShort)

public open class SctpRcvinfo(
    public var rcvSid: UShort,
    public var rcvSsn: UShort,
    public var rcvFlags: UShort,
    public var rcvPpid: UInt,
    public var rcvTsn: UInt,
    public var rcvCumtsn: UInt,
    public var rcvContext: UInt,
    public var rcvAssocId: SctpAssocT,
)

public open class SctpNxtinfo(
    public var nxtSid: UShort,
    public var nxtFlags: UShort,
    public var nxtPpid: UInt,
    public var nxtLength: UInt,
    public var nxtAssocId: SctpAssocT,
)

public open class SctpRecvvRn(public var recvvRcvinfo: SctpRcvinfo, public var recvvNxtinfo: SctpNxtinfo)

public open class SctpSendvSpa(
    public var sendvFlags: UInt,
    public var sendvSndinfo: SctpSndinfo,
    public var sendvPrinfo: SctpPrinfo,
    public var sendvAuthinfo: SctpAuthinfo,
)

public open class SctpSndAllCompletes(
    public var sallStream: UShort,
    public var sallFlags: UShort,
    public var sallPpid: UInt,
    public var sallContext: UInt,
    public var sallNumSent: UInt,
    public var sallNumFailed: UInt,
)

public open class SctpPcbinfo(
    public var epCount: UInt,
    public var asocCount: UInt,
    public var laddrCount: UInt,
    public var raddrCount: UInt,
    public var chkCount: UInt,
    public var readqCount: UInt,
    public var freeChunks: UInt,
    public var streamOque: UInt,
)

public open class SctpSockstat(
    public var ssAssocId: SctpAssocT,
    public var ssTotalSndbuf: UInt,
    public var ssTotalRecvBuf: UInt,
)

public open class SctpAssocChange(
    public var sacType: UShort,
    public var sacFlags: UShort,
    public var sacLength: UInt,
    public var sacState: UShort,
    public var sacError: UShort,
    public var sacOutboundStreams: UShort,
    public var sacInboundStreams: UShort,
    public var sacAssocId: SctpAssocT,
    public var sacInfo: List<UByte>,
)

public open class SctpPaddrChange(
    public var spcType: UShort,
    public var spcFlags: UShort,
    public var spcLength: UInt,
    public var spcAaddr: SockaddrStorage,
    public var spcState: UInt,
    public var spcError: UInt,
    public var spcAssocId: SctpAssocT,
)

public open class SctpRemoteError(
    public var sreType: UShort,
    public var sreFlags: UShort,
    public var sreLength: UInt,
    public var sreError: UShort,
    public var sreAssocId: SctpAssocT,
    public var sreData: List<UByte>,
)

public open class SctpSendFailedEvent(
    public var ssfeType: UShort,
    public var ssfeFlags: UShort,
    public var ssfeLength: UInt,
    public var ssfeError: UInt,
    public var ssfeInfo: SctpSndinfo,
    public var ssfeAssocId: SctpAssocT,
    public var ssfeData: List<UByte>,
)

public open class SctpShutdownEvent(
    public var sseType: UShort,
    public var sseFlags: UShort,
    public var sseLength: UInt,
    public var sseAssocId: SctpAssocT,
)

public open class SctpAdaptationEvent(
    public var saiType: UShort,
    public var saiFlags: UShort,
    public var saiLength: UInt,
    public var saiAdaptationInd: UInt,
    public var saiAssocId: SctpAssocT,
)

public open class SctpSetadaptation(public var ssbAdaptationInd: UInt)

public open class SctpPdapiEvent(
    public var pdapiType: UShort,
    public var pdapiFlags: UShort,
    public var pdapiLength: UInt,
    public var pdapiIndication: UInt,
    public var pdapiStream: UShort,
    public var pdapiSeq: UShort,
    public var pdapiAssocId: SctpAssocT,
)

public open class SctpSenderDryEvent(
    public var senderDryType: UShort,
    public var senderDryFlags: UShort,
    public var senderDryLength: UInt,
    public var senderDryAssocId: SctpAssocT,
)

public open class SctpStreamResetEvent(
    public var strresetType: UShort,
    public var strresetFlags: UShort,
    public var strresetLength: UInt,
    public var strresetAssocId: SctpAssocT,
    public var strresetStreamList: List<UShort>,
)

public open class SctpStreamChangeEvent(
    public var strchangeType: UShort,
    public var strchangeFlags: UShort,
    public var strchangeLength: UInt,
    public var strchangeAssocId: SctpAssocT,
    public var strchangeInstrms: UShort,
    public var strchangeOutstrms: UShort,
)

public open class Filedesc(
    public var fdFiles: Fdescenttbl?,
    public var fdMap: CUlong?,
    public var fdFreefile: CInt,
    public var fdRefcnt: CInt,
    public var fdHoldcnt: CInt,
    public var fdSx: Sx,
    public var fdKqlist: Kqlist,
    public var fdHoldleaderscount: CInt,
    public var fdHoldleaderswakeup: CInt,
)

public open class Fdescenttbl(public var fdtNfiles: CInt, public var fdtOfiles: List<COpaquePointer?>)

public open class Sx(public var lockObject: LockObject, public var sxLock: UintptrT)

public open class LockObject(
    public var loName: COpaquePointer?,
    public var loFlags: CUint,
    public var loData: CUint,
    // This is normally `class witness`.
    public var loWitness: COpaquePointer?,
)

public open class Kqlist(public var tqhFirst: COpaquePointer?, public var tqhLast: COpaquePointer?)

public open class Splice(
    public var spFd: CInt,
    public var spMax: OffT,
    public var spIdle: Timeval,
)

public open class Utmpx(
    public var utType: CShort,
    public var utTv: Timeval,
    public var utId: List<CChar>,
    public var utPid: PidT,
    public var utUser: List<CChar>,
    public var utLine: List<CChar>,
    public var utHost: List<CChar>,
    public var utSpare: List<CChar>,
)

public open class Xucred(
    public var crVersion: CUint,
    public var crUid: UidT,
    public var crNgroups: CShort,
    public var crGroups: List<GidT>,
    public var crPidCAnonymousUnion: CAnonymousCrPid,
)

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

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
    public var reserved: List<CLong>,
)

public open class Ptsstat(public var dev: ULong, public var devname: List<CChar>)

public open class Elf32Auxinfo(public var aType: CInt, public var aUn: CAnonymousElf32AuxvUnion)

public open class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: CAnonymousIfrIfru,
)

public open class IfData(
    /**
     * ethernet, tokenring, etc
     */
    public var ifiType: UByte,
    /**
     * e.g., AUI, Thinnet, 10base-T, etc
     */
    public var ifiPhysical: UByte,
    /**
     * media address length
     */
    public var ifiAddrlen: UByte,
    /**
     * media header length
     */
    public var ifiHdrlen: UByte,
    /**
     * current link state
     */
    public var ifiLinkState: UByte,
    /**
     * carp vhid
     */
    public var ifiVhid: UByte,
    /**
     * length of this data struct
     */
    public var ifiDatalen: UShort,
    /**
     * maximum transmission unit
     */
    public var ifiMtu: UInt,
    /**
     * routing metric (external only)
     */
    public var ifiMetric: UInt,
    /**
     * linespeed
     */
    public var ifiBaudrate: ULong,
    /**
     * packets received on interface
     */
    public var ifiIpackets: ULong,
    /**
     * input errors on interface
     */
    public var ifiIerrors: ULong,
    /**
     * packets sent on interface
     */
    public var ifiOpackets: ULong,
    /**
     * output errors on interface
     */
    public var ifiOerrors: ULong,
    /**
     * collisions on csma interfaces
     */
    public var ifiCollisions: ULong,
    /**
     * total number of octets received
     */
    public var ifiIbytes: ULong,
    /**
     * total number of octets sent
     */
    public var ifiObytes: ULong,
    /**
     * packets received via multicast
     */
    public var ifiImcasts: ULong,
    /**
     * packets sent via multicast
     */
    public var ifiOmcasts: ULong,
    /**
     * dropped on input
     */
    public var ifiIqdrops: ULong,
    /**
     * dropped on output
     */
    public var ifiOqdrops: ULong,
    /**
     * destined for unsupported protocol
     */
    public var ifiNoproto: ULong,
    /**
     * HW offload capabilities, see IFCAP
     */
    public var ifiHwassist: ULong,
    /**
     * uptime at attach or stat reset
     */
    public var ifiEpoch: CAnonymousIfiEpoch,
    /**
     * time of last administrative change
     */
    public var ifiLastchange: CAnonymousIfiLastchange,
)

public open class Ifstat(
    /**
     * if name, e.g. "en0"
     */
    public var ifsName: List<CChar>,
    public var ascii: List<CChar>,
)

public open class Ifrsskey(
    /**
     * if name, e.g. "en0"
     */
    public var ifrkName: List<CChar>,
    /**
     * RSS_FUNC_
     */
    public var ifrkFunc: UByte,
    public var ifrkSpare0: UByte,
    public var ifrkKeylen: UShort,
    public var ifrkKey: List<UByte>,
)

public open class Ifdownreason(
    public var ifdrName: List<CChar>,
    public var ifdrReason: UInt,
    public var ifdrVendor: UInt,
    public var ifdrMsg: List<CChar>,
)

public open class Sctphdr(
    public var srcPort: UShort,
    public var destPort: UShort,
    public var vTag: UInt,
    public var checksum: UInt,
)

public open class SctpChunkhdr(
    public var chunkType: UByte,
    public var chunkFlags: UByte,
    public var chunkLength: UShort,
)

public open class SctpParamhdr(public var paramType: UShort, public var paramLength: UShort)

public open class SctpGenErrorCause(
    public var code: UShort,
    public var length: UShort,
    public var info: List<UByte>,
)

public open class SctpErrorCause(public var code: UShort, public var length: UShort)

public open class SctpErrorInvalidStream(
    public var cause: SctpErrorCause,
    public var streamId: UShort,
    public var reserved: UShort,
)

public open class SctpErrorMissingParam(
    public var cause: SctpErrorCause,
    public var numMissingParams: UInt,
    public var tpe: List<UByte>,
)

public open class SctpErrorStaleCookie(public var cause: SctpErrorCause, public var staleTime: UInt)

public open class SctpErrorOutOfResource(public var cause: SctpErrorCause)

public open class SctpErrorUnresolvAddr(public var cause: SctpErrorCause)

public open class SctpErrorUnrecognizedChunk(public var cause: SctpErrorCause, public var ch: SctpChunkhdr)

public open class SctpErrorNoUserData(public var cause: SctpErrorCause, public var tsn: UInt)

public open class SctpErrorAuthInvalidHmac(public var cause: SctpErrorCause, public var hmacId: UShort)

public open class KinfoFile(
    public var kfStructsize: CInt,
    public var kfType: CInt,
    public var kfFd: CInt,
    public var kfRefCount: CInt,
    public var kfFlags: CInt,
    public var kfPad0: CInt,
    public var kfOffset: Long,
    public var priv: List<UByte>,
    // Note(freebsd): this is really a giant union
    public var kfStatus: UShort,
    public var kfPad1: UShort,
    public var kfIspare0: CInt,
    public var kfCapRights: CapRightsT,
    public var kfCapSpare: ULong,
    public var kfPath: List<CChar>,
)

public open class CAnonymousCrPid(public var crUnused: COpaquePointer?? = null, public var crPid: PidT? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_cr_pid").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousCrPid): Boolean {
        return this.crPid == other.crPid
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.crPid).hashCode()
        return state
    }
}

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    // The rest of the structure is actually a union.  We expose only
    // sigevNotifyThreadId because it's the most useful union member.
    public var sigevNotifyThreadId: LwpidT,
    public var unused1: CInt,
    public var unused2: List<CLong>,
) {
    public open fun eq(other: Sigevent): Boolean {
        return this.sigevNotify == other.sigevNotify && this.sigevSigno == other.sigevSigno && this.sigevValue == other.sigevValue && this.sigevNotifyThreadId == other.sigevNotifyThreadId
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.sigevNotify).hashCode()
        state = 31 * state + (this.sigevSigno).hashCode()
        state = 31 * state + (this.sigevValue).hashCode()
        state = 31 * state + (this.sigevNotifyThreadId).hashCode()
        return state
    }
}

public open class CAnonymousElf32AuxvUnion(public var aVal: CInt? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf32_auxv_union").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousElf32AuxvUnion): Boolean {
        return this.aVal == other.aVal
    }

    public override fun hashCode(): Int {
        var state = 0
        error("traits")
        return state
    }
}

public open class CAnonymousIfiEpoch(public var tt: TimeT? = null, public var ph: ULong? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_epoch").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfiEpoch): Boolean {
        return this.tt == other.tt && this.ph == other.ph
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.tt).hashCode()
            state = 31 * state + (this.ph).hashCode()
        }
        return state
    }
}

public open class CAnonymousIfiLastchange(public var tv: Timeval? = null, public var ph: CAnonymousPh? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_lastchange").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfiLastchange): Boolean {
        return this.tv == other.tv && this.ph == other.ph
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.tv).hashCode()
            state = 31 * state + (this.ph).hashCode()
        }
        return state
    }
}

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruBuffer: IfreqBuffer? = null,
    public var ifruFlags: List<CShort>? = null,
    public var ifruIndex: CShort? = null,
    public var ifruJid: CInt? = null,
    public var ifruMetric: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruPhys: CInt? = null,
    public var ifruMedia: CInt? = null,
    public var ifruData: CaddrT? = null,
    public var ifruCap: List<CInt>? = null,
    public var ifruFib: CUint? = null,
    public var ifruVlanPcp: CUchar? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public open fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruBuffer == other.ifruBuffer && this.ifruFlags == other.ifruFlags && this.ifruIndex == other.ifruIndex && this.ifruJid == other.ifruJid && this.ifruMetric == other.ifruMetric && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruData == other.ifruData && this.ifruCap == other.ifruCap && this.ifruFib == other.ifruFib && this.ifruVlanPcp == other.ifruVlanPcp
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ifruAddr).hashCode()
        state = 31 * state + (this.ifruDstaddr).hashCode()
        state = 31 * state + (this.ifruBroadaddr).hashCode()
        state = 31 * state + (this.ifruBuffer).hashCode()
        state = 31 * state + (this.ifruFlags).hashCode()
        state = 31 * state + (this.ifruIndex).hashCode()
        state = 31 * state + (this.ifruJid).hashCode()
        state = 31 * state + (this.ifruMetric).hashCode()
        state = 31 * state + (this.ifruMtu).hashCode()
        state = 31 * state + (this.ifruPhys).hashCode()
        state = 31 * state + (this.ifruMedia).hashCode()
        state = 31 * state + (this.ifruData).hashCode()
        state = 31 * state + (this.ifruCap).hashCode()
        state = 31 * state + (this.ifruFib).hashCode()
        state = 31 * state + (this.ifruVlanPcp).hashCode()
        return state
    }
}

public open class CAnonymousIfcIfcu(public var ifcuBuf: CaddrT? = null, public var ifcuReq: Ifreq?? = null) {
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

public open class UcontextT(
    public var ucSigmask: SigsetT,
    public var ucMcontext: McontextT,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucFlags: CInt,
    public var spare: List<CInt>,
)

public open class Xinpgen(
    public var xigLen: KsizeT,
    public var xigCount: UInt,
    public var xigSpare32: UInt,
    public var xigGen: InpGenT,
    public var xigSogen: SoGenT,
    public var xigSpare64: List<ULong>,
)

public open class InAddr4in6(public var ia46Pad32: List<UInt>, public var ia46Addr4: InAddr)

public open class InDependaddr(public var id46Addr: InAddr4in6? = null, public var id6Addr: In6Addr? = null) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "in_dependaddr").finishNonExhaustive()
    }
}

public open class InEndpoints(
    public var ieFport: UShort,
    public var ieLport: UShort,
    public var ieDependfaddr: InDependaddr,
    public var ieDependladdr: InDependaddr,
    public var ie6Zoneid: UInt,
)

public open class InConninfo(
    public var incFlags: UByte,
    public var incLen: UByte,
    public var incFibnum: UShort,
    public var incIe: InEndpoints,
)

public open class XktlsSessionOnedir(
    // Note: this field is called `gen` in upstream FreeBSD, but `gen` is
    // reserved keyword in Rust since the 2024 Edition, hence `gennum`.
    public var gennum: ULong,
    public var rsrv1: List<ULong>,
    public var rsrv2: List<UInt>,
    public var iv: List<UByte>,
    public var cipherAlgorithm: Int,
    public var authAlgorithm: Int,
    public var cipherKeyLen: UShort,
    public var ivLen: UShort,
    public var authKeyLen: UShort,
    public var maxFrameLen: UShort,
    public var tlsVmajor: UByte,
    public var tlsVminor: UByte,
    public var tlsHlen: UByte,
    public var tlsTlen: UByte,
    public var tlsBs: UByte,
    public var flags: UByte,
    public var drvStLen: UShort,
    public var ifnet: List<CChar>,
)

public open class XktlsSession(
    public var tsz: UInt,
    public var fsz: UInt,
    public var inpGencnt: ULong,
    public var soPcb: KvaddrT,
    public var coninf: InConninfo,
    public var rxVlanId: CUshort,
    public var rcv: XktlsSessionOnedir,
    public var snd: XktlsSessionOnedir,
)
