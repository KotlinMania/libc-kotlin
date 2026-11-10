@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
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

public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: CShort = 0,
    public var flags: CUshort = 0u,
    public var fflags: CUint = 0u,
    public var data: IntptrT = 0L,
    public var udata: COpaquePointer? = null,
)

public data class ExitStatus(
    public var eTermination: UShort = 0u,
    public var eExit: UShort = 0u,
)

public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioSigevent: Sigevent = Sigevent(),
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    public var aioVal: CInt = 0,
    public var aioErr: CInt = 0,
)

public data class Uuid(
    public var timeLow: UInt = 0u,
    public var timeMid: UShort = 0u,
    public var timeHiAndVersion: UShort = 0u,
    public var clockSeqHiAndReserved: UByte = 0u,
    public var clockSeqLow: UByte = 0u,
    public var node: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Uuid) return false
        if (this.timeLow != other.timeLow) return false
        if (this.timeMid != other.timeMid) return false
        if (this.timeHiAndVersion != other.timeHiAndVersion) return false
        if (this.clockSeqHiAndReserved != other.clockSeqHiAndReserved) return false
        if (this.clockSeqLow != other.clockSeqLow) return false
        if (!this.node.contentEquals(other.node)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeLow.hashCode()
        result = 31 * result + this.timeMid.hashCode()
        result = 31 * result + this.timeHiAndVersion.hashCode()
        result = 31 * result + this.clockSeqHiAndReserved.hashCode()
        result = 31 * result + this.clockSeqLow.hashCode()
        result = 31 * result + this.node.contentHashCode()
        return result
    }
}

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
)

public class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fOwner: UidT = 0u,
    public var fType: CUint = 0u,
    public var fSyncreads: ULong = 0uL,
    public var fSyncwrites: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fFsidUuid: UuidT = Uuid(),
    public var fUidUuid: UuidT = Uuid(),
)

public class Stat(
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stDev: DevT = 0u,
    public var stMode: ModeT = 0u,
    public var stPadding1: UShort = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0u,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: Long = 0L,
    public var oldStBlksize: UInt = 0u,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stLspare: Int = 0,
    public var stBlksize: Long = 0L,
    public var stQspare2: Long = 0L,
)

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiMtu: CUlong = 0uL,
    public var ifiMetric: CUlong = 0uL,
    public var ifiLinkState: CUlong = 0uL,
    public var ifiBaudrate: ULong = 0uL,
    public var ifiIpackets: CUlong = 0uL,
    public var ifiIerrors: CUlong = 0uL,
    public var ifiOpackets: CUlong = 0uL,
    public var ifiOerrors: CUlong = 0uL,
    public var ifiCollisions: CUlong = 0uL,
    public var ifiIbytes: CUlong = 0uL,
    public var ifiObytes: CUlong = 0uL,
    public var ifiImcasts: CUlong = 0uL,
    public var ifiOmcasts: CUlong = 0uL,
    public var ifiIqdrops: CUlong = 0uL,
    public var ifiNoproto: CUlong = 0uL,
    public var ifiHwassist: CUlong = 0uL,
    public var ifiOqdrops: CUlong = 0uL,
    public var ifiLastchange: Timeval = Timeval(),
)

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmData: IfData = IfData(),
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
    public var sdlRcf: CUshort = 0u,
    public var sdlRoute: UShortArray = UShortArray(16),
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
        if (this.sdlRcf != other.sdlRcf) return false
        if (!this.sdlRoute.contentEquals(other.sdlRoute)) return false
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
        result = 31 * result + this.sdlRcf.hashCode()
        result = 31 * result + this.sdlRoute.contentHashCode()
        return result
    }
}

public data class Xucred(
    public var crVersion: CUint = 0u,
    public var crUid: UidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(16),
    public var crUnused1: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        if (this.crUnused1 != other.crUnused1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        result = 31 * result + this.crUnused1.hashCode()
        return result
    }
}

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class CpumaskT(
    public var ary: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpumaskT) return false
        if (!this.ary.contentEquals(other.ary)) return false
        return true
    }

    override fun hashCode(): Int = this.ary.contentHashCode()
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

public data class KinfoFile(
    public var fSize: SizeT = 0uL,
    public var fPid: PidT = 0,
    public var fUid: UidT = 0u,
    public var fFd: CInt = 0,
    public var fFile: COpaquePointer? = null,
    public var fType: CShort = 0,
    public var fCount: CInt = 0,
    public var fMsgcount: CInt = 0,
    public var fOffset: OffT = 0L,
    public var fData: COpaquePointer? = null,
    public var fFlag: CUint = 0u,
)

public data class KinfoCputime(
    public var cpUser: ULong = 0uL,
    public var cpNice: ULong = 0uL,
    public var cpSys: ULong = 0uL,
    public var cpIntr: ULong = 0uL,
    public var cpIdel: ULong = 0uL,
    public var cpUnused01: ULong = 0uL,
    public var cpUnused02: ULong = 0uL,
    public var cpSamplePc: ULong = 0uL,
    public var cpSampleSp: ULong = 0uL,
    public var cpMsg: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KinfoCputime) return false
        if (this.cpUser != other.cpUser) return false
        if (this.cpNice != other.cpNice) return false
        if (this.cpSys != other.cpSys) return false
        if (this.cpIntr != other.cpIntr) return false
        if (this.cpIdel != other.cpIdel) return false
        if (this.cpUnused01 != other.cpUnused01) return false
        if (this.cpUnused02 != other.cpUnused02) return false
        if (this.cpSamplePc != other.cpSamplePc) return false
        if (this.cpSampleSp != other.cpSampleSp) return false
        if (!this.cpMsg.contentEquals(other.cpMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cpUser.hashCode()
        result = 31 * result + this.cpNice.hashCode()
        result = 31 * result + this.cpSys.hashCode()
        result = 31 * result + this.cpIntr.hashCode()
        result = 31 * result + this.cpIdel.hashCode()
        result = 31 * result + this.cpUnused01.hashCode()
        result = 31 * result + this.cpUnused02.hashCode()
        result = 31 * result + this.cpSamplePc.hashCode()
        result = 31 * result + this.cpSampleSp.hashCode()
        result = 31 * result + this.cpMsg.contentHashCode()
        return result
    }
}

public class KinfoLwp(
    public var klPid: PidT = 0,
    public var klTid: LwpidT = 0,
    public var klFlags: CInt = 0,
    public var klStat: Lwpstat = Lwpstat.entries.first(),
    public var klLock: CInt = 0,
    public var klTdflags: CInt = 0,
    public var klMpcount: CInt = 0,
    public var klPrio: CInt = 0,
    public var klTdprio: CInt = 0,
    public var klRtprio: Rtprio = Rtprio(),
    public var klUticks: ULong = 0uL,
    public var klSticks: ULong = 0uL,
    public var klIticks: ULong = 0uL,
    public var klCpticks: ULong = 0uL,
    public var klPctcpu: CUint = 0u,
    public var klSlptime: CUint = 0u,
    public var klOrigcpu: CInt = 0,
    public var klEstcpu: CInt = 0,
    public var klCpuid: CInt = 0,
    public var klRu: Rusage = Rusage(),
    public var klSiglist: SigsetT = SigsetT(),
    public var klSigmask: SigsetT = SigsetT(),
    public var klWchan: UintptrT = 0uL,
    public var klWmesg: UByteArray = UByteArray(9),
    public var klComm: UByteArray = UByteArray(MAXCOMLEN + 1),
)

public class KinfoProc(
    public var kpPaddr: UintptrT = 0uL,
    public var kpFlags: CInt = 0,
    public var kpStat: Procstat = Procstat.entries.first(),
    public var kpLock: CInt = 0,
    public var kpAcflag: CInt = 0,
    public var kpTraceflag: CInt = 0,
    public var kpFd: UintptrT = 0uL,
    public var kpSiglist: SigsetT = SigsetT(),
    public var kpSigignore: SigsetT = SigsetT(),
    public var kpSigcatch: SigsetT = SigsetT(),
    public var kpSigflag: CInt = 0,
    public var kpStart: Timeval = Timeval(),
    public var kpComm: UByteArray = UByteArray(MAXCOMLEN + 1),
    public var kpUid: UidT = 0u,
    public var kpNgroups: CShort = 0,
    public var kpGroups: UShortArray = UShortArray(NGROUPS),
    public var kpRuid: UidT = 0u,
    public var kpSvuid: UidT = 0u,
    public var kpRgid: GidT = 0u,
    public var kpSvgid: GidT = 0u,
    public var kpPid: PidT = 0,
    public var kpPpid: PidT = 0,
    public var kpPgid: PidT = 0,
    public var kpJobc: CInt = 0,
    public var kpSid: PidT = 0,
    public var kpLogin: UByteArray = UByteArray(40),
    // MAXNAMELEN rounded up to the nearest sizeof(long)
    public var kpTdev: DevT = 0u,
    public var kpTpgid: PidT = 0,
    public var kpTsid: PidT = 0,
    public var kpExitstat: CUshort = 0u,
    public var kpNthreads: CInt = 0,
    public var kpNice: CInt = 0,
    public var kpSwtime: CUint = 0u,
    public var kpVmMapSize: SizeT = 0uL,
    public var kpVmRssize: SegszT = 0,
    public var kpVmSwrss: SegszT = 0,
    public var kpVmTsize: SegszT = 0,
    public var kpVmDsize: SegszT = 0,
    public var kpVmSsize: SegszT = 0,
    public var kpVmPrssize: CUint = 0u,
    public var kpJailid: CInt = 0,
    public var kpRu: Rusage = Rusage(),
    public var kpCru: Rusage = Rusage(),
    public var kpAuxflags: CInt = 0,
    public var kpLwp: KinfoLwp = KinfoLwp(),
    public var kpKtaddr: UintptrT = 0uL,
    public var kpSpare: IntArray = IntArray(2),
)

public data class CAnonymousVmMap(
    public var priv: ULongArray = ULongArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousVmMap) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()
}

public data class VmMapEntry(
    public var priv: ULongArray = ULongArray(15),
    public var eflags: VmEflagsT = 0u,
    public var maptype: VmMaptypeT = 0u,
    public var protection: VmProtT = 0u,
    public var maxProtection: VmProtT = 0u,
    public var inheritance: VmInheritT = 0,
    public var wiredCount: CInt = 0,
    public var id: VmSubsysT = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmMapEntry) return false
        if (!this.priv.contentEquals(other.priv)) return false
        if (this.eflags != other.eflags) return false
        if (this.maptype != other.maptype) return false
        if (this.protection != other.protection) return false
        if (this.maxProtection != other.maxProtection) return false
        if (this.inheritance != other.inheritance) return false
        if (this.wiredCount != other.wiredCount) return false
        if (this.id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priv.contentHashCode()
        result = 31 * result + this.eflags.hashCode()
        result = 31 * result + this.maptype.hashCode()
        result = 31 * result + this.protection.hashCode()
        result = 31 * result + this.maxProtection.hashCode()
        result = 31 * result + this.inheritance.hashCode()
        result = 31 * result + this.wiredCount.hashCode()
        result = 31 * result + this.id.hashCode()
        return result
    }
}

public data class CAnonymousPmap(
    public var priv1: ULongArray = ULongArray(32),
    public var priv2: ULongArray = ULongArray(32),
    public var priv3: ULongArray = ULongArray(32),
    public var priv4: ULongArray = ULongArray(32),
    public var priv5: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPmap) return false
        if (!this.priv1.contentEquals(other.priv1)) return false
        if (!this.priv2.contentEquals(other.priv2)) return false
        if (!this.priv3.contentEquals(other.priv3)) return false
        if (!this.priv4.contentEquals(other.priv4)) return false
        if (!this.priv5.contentEquals(other.priv5)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priv1.contentHashCode()
        result = 31 * result + this.priv2.contentHashCode()
        result = 31 * result + this.priv3.contentHashCode()
        result = 31 * result + this.priv4.contentHashCode()
        result = 31 * result + this.priv5.contentHashCode()
        return result
    }
}

public class Vmspace(
    public var vmMap: CAnonymousVmMap = CAnonymousVmMap(),
    public var vmPmap: CAnonymousPmap = CAnonymousPmap(),
    public var vmFlags: CInt = 0,
    public var vmShm: COpaquePointer? = null,
    public var vmRssize: SegszT = 0,
    public var vmSwrss: SegszT = 0,
    public var vmTsize: SegszT = 0,
    public var vmDsize: SegszT = 0,
    public var vmSsize: SegszT = 0,
    public var vmTaddr: COpaquePointer? = null,
    public var vmDaddr: COpaquePointer? = null,
    public var vmMaxsaddr: COpaquePointer? = null,
    public var vmMinsaddr: COpaquePointer? = null,
    public var unused1: CInt = 0,
    public var unused2: CInt = 0,
    public var vmPagesupply: CInt = 0,
    public var vmHoldcnt: CUint = 0u,
    public var vmRefcnt: CUint = 0u,
)

public data class CpuctlMsrArgsT(
    public var msr: CInt = 0,
    public var data: ULong = 0uL,
)

public data class CpuctlCpuidArgsT(
    public var level: CInt = 0,
    public var data: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuctlCpuidArgsT) return false
        if (this.level != other.level) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class CpuctlCpuidCountArgsT(
    public var level: CInt = 0,
    public var levelType: CInt = 0,
    public var data: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuctlCpuidCountArgsT) return false
        if (this.level != other.level) return false
        if (this.levelType != other.levelType) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.levelType.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class CpuctlUpdateArgsT(
    public var data: COpaquePointer? = null,
    public var size: SizeT = 0uL,
)

public data class Utmpx(
    public var utName: UByteArray = UByteArray(32),
    public var utId: UByteArray = UByteArray(4),
    public var utLine: UByteArray = UByteArray(32),
    public var utHost: UByteArray = UByteArray(256),
    public var utUnused: UByteArray = UByteArray(16),
    public var utSession: UShort = 0u,
    public var utType: UShort = 0u,
    public var utPid: PidT = 0,
    public var utExit: ExitStatus = ExitStatus(),
    public var utSs: SockaddrStorage = SockaddrStorage(),
    public var utTv: Timeval = Timeval(),
    public var utUnused2: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utUnused.contentEquals(other.utUnused)) return false
        if (this.utSession != other.utSession) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (this.utExit != other.utExit) return false
        if (this.utSs != other.utSs) return false
        if (this.utTv != other.utTv) return false
        if (!this.utUnused2.contentEquals(other.utUnused2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utName.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utUnused.contentHashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSs.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utUnused2.contentHashCode()
        return result
    }
}

public data class Lastlogx(
    public var llTv: Timeval = Timeval(),
    public var llLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var llHost: UByteArray = UByteArray(UTX_HOSTSIZE),
    public var llSs: SockaddrStorage = SockaddrStorage(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlogx) return false
        if (this.llTv != other.llTv) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        if (this.llSs != other.llSs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTv.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        result = 31 * result + this.llSs.hashCode()
        return result
    }
}

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var unused1: UByte = 0u,
    public var unused2: UInt = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public class Statfs(
    public var spare2: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fIosize: CLong = 0L,
    public var fBlocks: CLong = 0L,
    public var fBfree: CLong = 0L,
    public var fBavail: CLong = 0L,
    public var fFiles: CLong = 0L,
    public var fFfree: CLong = 0L,
    public var fFsid: FsidT = FsidT(),
    public var fOwner: UidT = 0u,
    public var fType: CInt = 0,
    public var fFlags: CInt = 0,
    public var fSyncwrites: CLong = 0L,
    public var fAsyncwrites: CLong = 0L,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(80),
    public var fSyncreads: CLong = 0L,
    public var fAsyncreads: CLong = 0L,
    public var spares1: CShort = 0,
    public var fMntfromname: UByteArray = UByteArray(80),
    public var spares2: CShort = 0,
    public var spare: LongArray = LongArray(2),
)

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    // The union is 8-byte in size, so it is aligned at a 8-byte offset.
    public var unused1: CInt = 0,
    public var sigevSigno: CInt = 0,
    // actually a union
    // pad the union
    public var unused2: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var unused3: COpaquePointer? = null,
)

public class McontextT(
    public var mcOnstack: RegisterT = 0L,
    public var mcRdi: RegisterT = 0L,
    public var mcRsi: RegisterT = 0L,
    public var mcRdx: RegisterT = 0L,
    public var mcRcx: RegisterT = 0L,
    public var mcR8: RegisterT = 0L,
    public var mcR9: RegisterT = 0L,
    public var mcRax: RegisterT = 0L,
    public var mcRbx: RegisterT = 0L,
    public var mcRbp: RegisterT = 0L,
    public var mcR10: RegisterT = 0L,
    public var mcR11: RegisterT = 0L,
    public var mcR12: RegisterT = 0L,
    public var mcR13: RegisterT = 0L,
    public var mcR14: RegisterT = 0L,
    public var mcR15: RegisterT = 0L,
    public var mcXflags: RegisterT = 0L,
    public var mcTrapno: RegisterT = 0L,
    public var mcAddr: RegisterT = 0L,
    public var mcFlags: RegisterT = 0L,
    public var mcErr: RegisterT = 0L,
    public var mcRip: RegisterT = 0L,
    public var mcCs: RegisterT = 0L,
    public var mcRflags: RegisterT = 0L,
    public var mcRsp: RegisterT = 0L,
    public var mcSs: RegisterT = 0L,
    public var mcLen: CUint = 0u,
    public var mcFpformat: CUint = 0u,
    public var mcOwnedfp: CUint = 0u,
    public var reserved: CUint = 0u,
    public var unused: UIntArray = UIntArray(8),
    public var mcFpregs: UIntArray = UIntArray(256),
)

public data class UcontextT(
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucCofunc: UcontextTUcCofuncCallback? = null,
    public var ucArg: COpaquePointer? = null,
    public var pad: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucCofunc != other.ucCofunc) return false
        if (this.ucArg != other.ucArg) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSigmask.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucCofunc.hashCode()
        result = 31 * result + this.ucArg.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}
