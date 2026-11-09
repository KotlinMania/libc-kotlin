package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

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
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage

public fun interface UcontextTUcCofuncCallback {
    public operator fun invoke(uc: COpaquePointer?, arg: COpaquePointer?)
}

public open class Kevent(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: IntptrT,
    public var udata: COpaquePointer?,
)

public open class ExitStatus(public var eTermination: UShort, public var eExit: UShort)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioVal: CInt,
    public var aioErr: CInt,
)

public open class Uuid(
    public var timeLow: UInt,
    public var timeMid: UShort,
    public var timeHiAndVersion: UShort,
    public var clockSeqHiAndReserved: UByte,
    public var clockSeqLow: UByte,
    public var node: List<UByte>,
)

public open class MqAttr(
    public var mqFlags: CLong,
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqCurmsgs: CLong,
)

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
    public var fOwner: UidT,
    public var fType: CUint,
    public var fSyncreads: ULong,
    public var fSyncwrites: ULong,
    public var fAsyncreads: ULong,
    public var fAsyncwrites: ULong,
    public var fFsidUuid: UuidT,
    public var fUidUuid: UuidT,
)

public open class Stat(
    public var stIno: InoT,
    public var stNlink: NlinkT,
    public var stDev: DevT,
    public var stMode: ModeT,
    public var stPadding1: UShort,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stSize: OffT,
    public var stBlocks: Long,
    public var oldStBlksize: UInt,
    public var stFlags: UInt,
    public var stGen: UInt,
    public var stLspare: Int,
    public var stBlksize: Long,
    public var stQspare2: Long,
)

public open class IfData(
    public var ifiType: CUchar,
    public var ifiPhysical: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiRecvquota: CUchar,
    public var ifiXmitquota: CUchar,
    public var ifiMtu: CUlong,
    public var ifiMetric: CUlong,
    public var ifiLinkState: CUlong,
    public var ifiBaudrate: ULong,
    public var ifiIpackets: CUlong,
    public var ifiIerrors: CUlong,
    public var ifiOpackets: CUlong,
    public var ifiOerrors: CUlong,
    public var ifiCollisions: CUlong,
    public var ifiIbytes: CUlong,
    public var ifiObytes: CUlong,
    public var ifiImcasts: CUlong,
    public var ifiOmcasts: CUlong,
    public var ifiIqdrops: CUlong,
    public var ifiNoproto: CUlong,
    public var ifiHwassist: CUlong,
    public var ifiOqdrops: CUlong,
    public var ifiLastchange: Timeval,
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

public open class SockaddrDl(
    public var sdlLen: CUchar,
    public var sdlFamily: CUchar,
    public var sdlIndex: CUshort,
    public var sdlType: CUchar,
    public var sdlNlen: CUchar,
    public var sdlAlen: CUchar,
    public var sdlSlen: CUchar,
    public var sdlData: List<CChar>,
    public var sdlRcf: CUshort,
    public var sdlRoute: List<CUshort>,
)

public open class Xucred(
    public var crVersion: CUint,
    public var crUid: UidT,
    public var crNgroups: CShort,
    public var crGroups: List<GidT>,
    public var crUnused1: COpaquePointer?,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

public open class CpumaskT(public var ary: List<ULong>)

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

public open class KinfoFile(
    public var fSize: SizeT,
    public var fPid: PidT,
    public var fUid: UidT,
    public var fFd: CInt,
    public var fFile: COpaquePointer?,
    public var fType: CShort,
    public var fCount: CInt,
    public var fMsgcount: CInt,
    public var fOffset: OffT,
    public var fData: COpaquePointer?,
    public var fFlag: CUint,
)

public open class KinfoCputime(
    public var cpUser: ULong,
    public var cpNice: ULong,
    public var cpSys: ULong,
    public var cpIntr: ULong,
    public var cpIdel: ULong,
    public var cpUnused01: ULong,
    public var cpUnused02: ULong,
    public var cpSamplePc: ULong,
    public var cpSampleSp: ULong,
    public var cpMsg: List<CChar>,
)

public open class KinfoLwp(
    public var klPid: PidT,
    public var klTid: LwpidT,
    public var klFlags: CInt,
    public var klStat: Lwpstat,
    public var klLock: CInt,
    public var klTdflags: CInt,
    public var klMpcount: CInt,
    public var klPrio: CInt,
    public var klTdprio: CInt,
    public var klRtprio: Rtprio,
    public var klUticks: ULong,
    public var klSticks: ULong,
    public var klIticks: ULong,
    public var klCpticks: ULong,
    public var klPctcpu: CUint,
    public var klSlptime: CUint,
    public var klOrigcpu: CInt,
    public var klEstcpu: CInt,
    public var klCpuid: CInt,
    public var klRu: Rusage,
    public var klSiglist: SigsetT,
    public var klSigmask: SigsetT,
    public var klWchan: UintptrT,
    public var klWmesg: List<CChar>,
    public var klComm: List<CChar>,
)

public open class KinfoProc(
    public var kpPaddr: UintptrT,
    public var kpFlags: CInt,
    public var kpStat: Procstat,
    public var kpLock: CInt,
    public var kpAcflag: CInt,
    public var kpTraceflag: CInt,
    public var kpFd: UintptrT,
    public var kpSiglist: SigsetT,
    public var kpSigignore: SigsetT,
    public var kpSigcatch: SigsetT,
    public var kpSigflag: CInt,
    public var kpStart: Timeval,
    public var kpComm: List<CChar>,
    public var kpUid: UidT,
    public var kpNgroups: CShort,
    public var kpGroups: List<GidT>,
    public var kpRuid: UidT,
    public var kpSvuid: UidT,
    public var kpRgid: GidT,
    public var kpSvgid: GidT,
    public var kpPid: PidT,
    public var kpPpid: PidT,
    public var kpPgid: PidT,
    public var kpJobc: CInt,
    public var kpSid: PidT,
    public var kpLogin: List<CChar>,
    // MAXNAMELEN rounded up to the nearest sizeof(long)
    public var kpTdev: DevT,
    public var kpTpgid: PidT,
    public var kpTsid: PidT,
    public var kpExitstat: CUshort,
    public var kpNthreads: CInt,
    public var kpNice: CInt,
    public var kpSwtime: CUint,
    public var kpVmMapSize: SizeT,
    public var kpVmRssize: SegszT,
    public var kpVmSwrss: SegszT,
    public var kpVmTsize: SegszT,
    public var kpVmDsize: SegszT,
    public var kpVmSsize: SegszT,
    public var kpVmPrssize: CUint,
    public var kpJailid: CInt,
    public var kpRu: Rusage,
    public var kpCru: Rusage,
    public var kpAuxflags: CInt,
    public var kpLwp: KinfoLwp,
    public var kpKtaddr: UintptrT,
    public var kpSpare: List<CInt>,
)

public open class CAnonymousVmMap(public var priv: List<UintptrT>)

public open class VmMapEntry(
    public var priv: List<UintptrT>,
    public var eflags: VmEflagsT,
    public var maptype: VmMaptypeT,
    public var protection: VmProtT,
    public var maxProtection: VmProtT,
    public var inheritance: VmInheritT,
    public var wiredCount: CInt,
    public var id: VmSubsysT,
)

public open class CAnonymousPmap(
    public var priv1: List<UintptrT>,
    public var priv2: List<UintptrT>,
    public var priv3: List<UintptrT>,
    public var priv4: List<UintptrT>,
    public var priv5: List<UintptrT>,
)

public open class Vmspace(
    public var vmMap: CAnonymousVmMap,
    public var vmPmap: CAnonymousPmap,
    public var vmFlags: CInt,
    public var vmShm: COpaquePointer?,
    public var vmRssize: SegszT,
    public var vmSwrss: SegszT,
    public var vmTsize: SegszT,
    public var vmDsize: SegszT,
    public var vmSsize: SegszT,
    public var vmTaddr: COpaquePointer?,
    public var vmDaddr: COpaquePointer?,
    public var vmMaxsaddr: COpaquePointer?,
    public var vmMinsaddr: COpaquePointer?,
    public var unused1: CInt,
    public var unused2: CInt,
    public var vmPagesupply: CInt,
    public var vmHoldcnt: CUint,
    public var vmRefcnt: CUint,
)

public open class CpuctlMsrArgsT(public var msr: CInt, public var data: ULong)

public open class CpuctlCpuidArgsT(public var level: CInt, public var data: List<UInt>)

public open class CpuctlCpuidCountArgsT(
    public var level: CInt,
    public var levelType: CInt,
    public var data: List<UInt>,
)

public open class CpuctlUpdateArgsT(public var data: COpaquePointer?, public var size: SizeT)

public open class Utmpx(
    public var utName: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utHost: List<CChar>,
    public var utUnused: List<UByte>,
    public var utSession: UShort,
    public var utType: UShort,
    public var utPid: PidT,
    public var utExit: ExitStatus,
    public var utSs: SockaddrStorage,
    public var utTv: Timeval,
    public var utUnused2: List<UByte>,
)

public open class Lastlogx(
    public var llTv: Timeval,
    public var llLine: List<CChar>,
    public var llHost: List<CChar>,
    public var llSs: SockaddrStorage,
)

public open class Dirent(
    public var dFileno: InoT,
    public var dNamlen: UShort,
    public var dType: UByte,
    public var unused1: UByte,
    public var unused2: UInt,
    public var dName: List<CChar>,
)

public open class Statfs(
    public var spare2: CLong,
    public var fBsize: CLong,
    public var fIosize: CLong,
    public var fBlocks: CLong,
    public var fBfree: CLong,
    public var fBavail: CLong,
    public var fFiles: CLong,
    public var fFfree: CLong,
    public var fFsid: FsidT,
    public var fOwner: UidT,
    public var fType: CInt,
    public var fFlags: CInt,
    public var fSyncwrites: CLong,
    public var fAsyncwrites: CLong,
    public var fFstypename: List<CChar>,
    public var fMntonname: List<CChar>,
    public var fSyncreads: CLong,
    public var fAsyncreads: CLong,
    public var spares1: CShort,
    public var fMntfromname: List<CChar>,
    public var spares2: CShort,
    public var spare: List<CLong>,
)

public open class Sigevent(
    public var sigevNotify: CInt,
    // The union is 8-byte in size, so it is aligned at a 8-byte offset.
    public var unused1: CInt,
    public var sigevSigno: CInt,
    // actually a union
    // pad the union
    public var unused2: CInt,
    public var sigevValue: Sigval,
    public var unused3: COpaquePointer?,
)

public open class McontextT(
    public var mcOnstack: RegisterT,
    public var mcRdi: RegisterT,
    public var mcRsi: RegisterT,
    public var mcRdx: RegisterT,
    public var mcRcx: RegisterT,
    public var mcR8: RegisterT,
    public var mcR9: RegisterT,
    public var mcRax: RegisterT,
    public var mcRbx: RegisterT,
    public var mcRbp: RegisterT,
    public var mcR10: RegisterT,
    public var mcR11: RegisterT,
    public var mcR12: RegisterT,
    public var mcR13: RegisterT,
    public var mcR14: RegisterT,
    public var mcR15: RegisterT,
    public var mcXflags: RegisterT,
    public var mcTrapno: RegisterT,
    public var mcAddr: RegisterT,
    public var mcFlags: RegisterT,
    public var mcErr: RegisterT,
    public var mcRip: RegisterT,
    public var mcCs: RegisterT,
    public var mcRflags: RegisterT,
    public var mcRsp: RegisterT,
    public var mcSs: RegisterT,
    public var mcLen: CUint,
    public var mcFpformat: CUint,
    public var mcOwnedfp: CUint,
    public var reserved: CUint,
    public var unused: List<CUint>,
    public var mcFpregs: List<CUint>,
)

public open class UcontextT(
    public var ucSigmask: SigsetT,
    public var ucMcontext: McontextT,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var ucCofunc: UcontextTUcCofuncCallback?,
    public var ucArg: COpaquePointer?,
    public var pad: List<CInt>,
)
