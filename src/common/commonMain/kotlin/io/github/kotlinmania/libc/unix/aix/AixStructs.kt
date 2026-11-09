package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.Int64T
import io.github.kotlinmania.libc.Uint16T
import io.github.kotlinmania.libc.Uint32T
import io.github.kotlinmania.libc.Uint64T
import io.github.kotlinmania.libc.unix.CcT
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
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(value: Sigval)
}

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

public open class FsidT(public var value: List<CUint>)

public open class Fsid64T(public var value: List<Uint64T>)

public open class Timezone(public var tzMinuteswest: CInt, public var tzDsttime: CInt)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class Dirent(
    public var dOffset: CUlong,
    public var dIno: InoT,
    public var dReclen: CUshort,
    public var dNamlen: CUshort,
    public var dName: List<CChar>,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cCc: List<CcT>,
)

public open class Flock64(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lSysid: CUint,
    public var lPid: PidT,
    public var lVfs: CInt,
    public var lStart: Off64T,
    public var lLen: Off64T,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

public open class Statvfs64(
    public var fBsize: Blksize64T,
    public var fFrsize: Blksize64T,
    public var fBlocks: Blkcnt64T,
    public var fBfree: Blkcnt64T,
    public var fBavail: Blkcnt64T,
    public var fFiles: Blkcnt64T,
    public var fFfree: Blkcnt64T,
    public var fFavail: Blkcnt64T,
    public var fFsid: Fsid64T,
    public var fBasetype: List<CChar>,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fFstr: List<CChar>,
    public var fFiller: List<CUlong>,
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
    public var leftParenthesis: COpaquePointer?,
    public var rightParenthesis: COpaquePointer?,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
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
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: CUlong,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
    public var aiEflags: CInt,
)

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
)

public open class Sockaddr(
    public var saLen: CUchar,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
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

public open class SockaddrIn(
    public var sinLen: CUchar,
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<CUchar>,
)

public open class SockaddrIn6(
    public var sin6Len: CUchar,
    public var sin6Family: CUchar,
    public var sin6Port: Uint16T,
    public var sin6Flowinfo: Uint32T,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: Uint32T,
)

public open class SockaddrStorage(
    public var ssLen: CUchar,
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Int64T,
    public var ssPad2: List<CChar>,
)

public open class SockaddrUn(
    public var sunLen: CUchar,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

public open class StTimespec(public var tvSec: TimeT, public var tvNsec: CInt)

public open class Statfs64(
    public var fVersion: CInt,
    public var fType: CInt,
    public var fBsize: Blksize64T,
    public var fBlocks: Blkcnt64T,
    public var fBfree: Blkcnt64T,
    public var fBavail: Blkcnt64T,
    public var fFiles: Uint64T,
    public var fFfree: Uint64T,
    public var fFsid: Fsid64T,
    public var fVfstype: CInt,
    public var fFsize: Blksize64T,
    public var fVfsnumber: CInt,
    public var fVfsoff: CInt,
    public var fVfslen: CInt,
    public var fVfsvers: CInt,
    public var fFname: List<CChar>,
    public var fFpack: List<CChar>,
    public var fNameMax: CInt,
)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
)

public open class Xutsname(
    public var nid: CUint,
    public var reserved: CInt,
    public var longnid: CUlonglong,
)

public open class Cmsghdr(
    public var cmsgLen: SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback,
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class Osigevent(public var sevtValue: COpaquePointer?, public var sevtSigno: SignalT)

public open class PollCtl(
    public var cmd: CShort,
    public var events: CShort,
    public var fd: CInt,
)

public open class SfParms(
    public var headerData: COpaquePointer?,
    public var headerLength: CUint,
    public var fileDescriptor: CInt,
    public var fileSize: Uint64T,
    public var fileOffset: Uint64T,
    public var fileBytes: Int64T,
    public var trailerData: COpaquePointer?,
    public var trailerLength: CUint,
    public var bytesSent: Uint64T,
)

public open class Mmsghdr(public var msgHdr: Msghdr, public var msgLen: CUint)

public open class SchedParam(
    public var schedPriority: CInt,
    public var schedPolicy: CInt,
    public var schedReserved: List<CInt>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
    public var pad: List<CInt>,
)

public open class PosixSpawnattrT(
    public var posixAttrFlags: CShort,
    public var posixAttrPgroup: PidT,
    public var posixAttrSigmask: SigsetT,
    public var posixAttrSigdefault: SigsetT,
    public var posixAttrSchedpolicy: CInt,
    public var posixAttrSchedparam: SchedParam,
)

public open class GlobT(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glPadr: COpaquePointer?,
    public var glPtx: COpaquePointer?,
)

public open class Mallinfo(
    public var arena: CUlong,
    public var ordblks: CInt,
    public var smblks: CInt,
    public var hblks: CInt,
    public var hblkhd: CInt,
    public var usmblks: CUlong,
    public var fsmblks: CUlong,
    public var uordblks: CUlong,
    public var fordblks: CUlong,
    public var keepcost: CInt,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class Utmp(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utTime: Time64T,
    public var utExit: ExitStatus,
    public var utHost: List<CChar>,
    public var dblWordPad: CInt,
    public var reservedA: List<CInt>,
    public var reservedV: List<CInt>,
)

public open class RegmatchT(public var rmSo: RegoffT, public var rmEo: RegoffT)

public open class RegexT(
    public var reNsub: SizeT,
    public var reComp: COpaquePointer?,
    public var reCflags: CInt,
    public var reErroff: SizeT,
    public var reLen: SizeT,
    public var reUcoll: List<WcharT>,
    public var reLsub: List<COpaquePointer?>,
    public var reEsub: List<COpaquePointer?>,
    public var reMap: CUchar?,
    public var maxsub: CInt,
    public var unused: List<COpaquePointer?>,
)

public open class Rlimit64(public var rlimCur: Rlim64T, public var rlimMax: Rlim64T)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmCnattch: ShmattT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmHandle: Uint32T,
    public var shmExtshm: CInt,
    public var shmPagesize: Int64T,
    public var shmLba: Uint64T,
    public var shmReserved0: Int64T,
    public var shmReserved1: Int64T,
)

public open class Stat64(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stFlag: CUshort,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSsize: CInt,
    public var stAtim: StTimespec,
    public var stMtim: StTimespec,
    public var stCtim: StTimespec,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stVfstype: CInt,
    public var stVfs: CUint,
    public var stType: CUint,
    public var stGen: CUint,
    public var stReserved: List<CUint>,
    public var stSize: Off64T,
)

public open class Mntent(
    public var mntFsname: COpaquePointer?,
    public var mntDir: COpaquePointer?,
    public var mntType: COpaquePointer?,
    public var mntOpts: COpaquePointer?,
    public var mntFreq: CInt,
    public var mntPassno: CInt,
)

public open class IpcPerm(
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
    public var reserved: CUshort,
    public var key: KeyT,
)

public open class Entry(public var key: COpaquePointer?, public var data: COpaquePointer?)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
)

public open class Sembuf(
    public var semNum: CUshort,
    public var semOp: CShort,
    public var semFlg: CShort,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    // Note(union): this field is actually a union
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class PollCtlExt(
    public var version: UByte,
    public var command: UByte,
    public var events: CShort,
    public var fd: CInt,
    public var u: PollCtlExtU,
    public var reserved64: List<ULong>,
)

public open class PollCtlExtU(
    public var addr: COpaquePointer?? = null,
    public var data32: UInt? = null,
    public var data: ULong? = null,
) {
    public open fun fmt(f: StringBuilder) {
        DebugStruct(f, "__poll_ctl_ext_u").finishNonExhaustive()
    }

    public open fun eq(other: PollCtlExtU): Boolean {
        return this.addr == other.addr && this.data32 == other.data32 && this.data == other.data
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.addr).hashCode()
            state = 31 * state + (this.data32).hashCode()
            state = 31 * state + (this.data).hashCode()
        }
        return state
    }
}
