@file:OptIn(ExperimentalUnsignedTypes::class)
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
import io.github.kotlinmania.libc.unix.IFNAMSIZ
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
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.McontextT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.RegisterT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.SPECNAMELEN

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
public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var unused1: IntArray = IntArray(2),
    public var unused2: COpaquePointer? = null,
    public var aioLioOpcode: CInt = 0,
    public var aioReqprio: CInt = 0,
    // unused 3 through 5 are the __aiocb_private structure
    public var unused3: CLong = 0L,
    public var unused4: CLong = 0L,
    public var unused5: COpaquePointer? = null,
    public var aioSigevent: Sigevent = Sigevent(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (!this.unused1.contentEquals(other.unused1)) return false
        if (this.unused2 != other.unused2) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        if (this.aioSigevent != other.aioSigevent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.unused1.contentHashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        return result
    }
}

public data class Jail(
    public var version: UInt = 0u,
    public var path: COpaquePointer? = null,
    public var hostname: COpaquePointer? = null,
    public var jailname: COpaquePointer? = null,
    public var ip4s: CUint = 0u,
    public var ip6s: CUint = 0u,
    public var ip4: InAddr? = null,
    public var ip6: In6Addr? = null,
)

public data class Statvfs(
    public var fBavail: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

// internal structure has changed over time
public data class Sem(public var data: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sem) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
)

public data class InputEvent(
    public var time: Timeval = Timeval(),
    public var type: UShort = 0u,
    public var code: UShort = 0u,
    public var value: Int = 0,
)

public data class InputAbsinfo(
    public var value: Int = 0,
    public var minimum: Int = 0,
    public var maximum: Int = 0,
    public var fuzz: Int = 0,
    public var flat: Int = 0,
    public var resolution: Int = 0,
)

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var unused1: COpaquePointer? = null,
    public var unused2: COpaquePointer? = null,
    public var msgCbytes: MsglenT = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
)

public data class StackT(
    public var ssSp: COpaquePointer? = null,
    public var ssSize: SizeT = 0uL,
    public var ssFlags: CInt = 0,
)

public data class Mmsghdr(public var msgHdr: Msghdr = Msghdr(), public var msgLen: SsizeT = 0L)

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

public data class PtraceVmEntry(
    public var pveEntry: CInt = 0,
    public var pveTimestamp: CInt = 0,
    public var pveStart: CUlong = 0uL,
    public var pveEnd: CUlong = 0uL,
    public var pveOffset: CUlong = 0uL,
    public var pveProt: CUint = 0u,
    public var pvePathlen: CUint = 0u,
    public var pveFileid: CLong = 0L,
    public var pveFsid: UInt = 0u,
    public var pvePath: COpaquePointer? = null,
)

public data class PtraceLwpinfo(
    public var plLwpid: LwpidT = 0,
    public var plEvent: CInt = 0,
    public var plFlags: CInt = 0,
    public var plSigmask: SigsetT = SigsetT(),
    public var plSiglist: SigsetT = SigsetT(),
    public var plSiginfo: SiginfoT = SiginfoT(),
    public var plTdname: UByteArray = UByteArray((MAXCOMLEN.toInt() + 1).toInt()),
    public var plChildPid: PidT = 0,
    public var plSyscallCode: CUint = 0u,
    public var plSyscallNarg: CUint = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceLwpinfo) return false
        if (this.plLwpid != other.plLwpid) return false
        if (this.plEvent != other.plEvent) return false
        if (this.plFlags != other.plFlags) return false
        if (this.plSigmask != other.plSigmask) return false
        if (this.plSiglist != other.plSiglist) return false
        if (this.plSiginfo != other.plSiginfo) return false
        if (!this.plTdname.contentEquals(other.plTdname)) return false
        if (this.plChildPid != other.plChildPid) return false
        if (this.plSyscallCode != other.plSyscallCode) return false
        if (this.plSyscallNarg != other.plSyscallNarg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.plLwpid.hashCode()
        result = 31 * result + this.plEvent.hashCode()
        result = 31 * result + this.plFlags.hashCode()
        result = 31 * result + this.plSigmask.hashCode()
        result = 31 * result + this.plSiglist.hashCode()
        result = 31 * result + this.plSiginfo.hashCode()
        result = 31 * result + this.plTdname.contentHashCode()
        result = 31 * result + this.plChildPid.hashCode()
        result = 31 * result + this.plSyscallCode.hashCode()
        result = 31 * result + this.plSyscallNarg.hashCode()
        return result
    }
}

public data class PtraceScRet(public var srRetval: LongArray = LongArray(2), public var srError: CInt = 0) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceScRet) return false
        if (!this.srRetval.contentEquals(other.srRetval)) return false
        if (this.srError != other.srError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srRetval.contentHashCode()
        result = 31 * result + this.srError.hashCode()
        return result
    }
}

public data class PtraceCoredump(
    public var pcFd: CInt = 0,
    public var pcFlags: UInt = 0u,
    public var pcLimit: OffT = 0L,
)

public data class PtraceScRemote(
    public var pscrRet: PtraceScRet = PtraceScRet(),
    public var pscrSyscall: CUint = 0u,
    public var pscrNargs: CUint = 0u,
    public var pscrArgs: RegisterT? = null,
)

public data class CpusetT(public var bits: LongArray = LongArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpusetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.bits.contentHashCode()
    }
}

public data class CapRightsT(public var crRights: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CapRightsT) return false
        if (!this.crRights.contentEquals(other.crRights)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.crRights.contentHashCode()
    }
}

public data class Umutex(
    public var mOwner: LwpidT = 0,
    public var mFlags: UInt = 0u,
    public var mCeilings: UIntArray = UIntArray(2),
    public var mRbLink: UintptrT = 0uL,
    public var mSpare: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Umutex) return false
        if (this.mOwner != other.mOwner) return false
        if (this.mFlags != other.mFlags) return false
        if (!this.mCeilings.contentEquals(other.mCeilings)) return false
        if (this.mRbLink != other.mRbLink) return false
        if (!this.mSpare.contentEquals(other.mSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mOwner.hashCode()
        result = 31 * result + this.mFlags.hashCode()
        result = 31 * result + this.mCeilings.contentHashCode()
        result = 31 * result + this.mRbLink.hashCode()
        result = 31 * result + this.mSpare.contentHashCode()
        return result
    }
}

public data class Ucond(
    public var cHasWaiters: UInt = 0u,
    public var cFlags: UInt = 0u,
    public var cClockid: UInt = 0u,
    public var cSpare: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ucond) return false
        if (this.cHasWaiters != other.cHasWaiters) return false
        if (this.cFlags != other.cFlags) return false
        if (this.cClockid != other.cClockid) return false
        if (!this.cSpare.contentEquals(other.cSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cHasWaiters.hashCode()
        result = 31 * result + this.cFlags.hashCode()
        result = 31 * result + this.cClockid.hashCode()
        result = 31 * result + this.cSpare.contentHashCode()
        return result
    }
}

public data class Uuid(
    public var timeLow: UInt = 0u,
    public var timeMid: UShort = 0u,
    public var timeHiAndVersion: UShort = 0u,
    public var clockSeqHiAndReserved: UByte = 0u,
    public var clockSeqLow: UByte = 0u,
    public var node: UByteArray = UByteArray((UUID_NODE_LEN).toInt()),
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

public data class CAnonymousPthreadSpinlock(public var sClock: Umutex = Umutex())

public data class CAnonymousPthreadBarrierattr(public var pshared: CInt = 0)

public data class CAnonymousPthreadBarrier(
    public var bLock: Umutex = Umutex(),
    public var bCv: Ucond = Ucond(),
    public var bCycle: Long = 0L,
    public var bCount: CInt = 0,
    public var bWaiters: CInt = 0,
    public var bRefcount: CInt = 0,
    public var bDestroying: CInt = 0,
)

public class KinfoVmentry(
    public var kveStructsize: CInt = 0,
    public var kveType: CInt = 0,
    public var kveStart: ULong = 0uL,
    public var kveEnd: ULong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveVnFileid: ULong = 0uL,
    public var kveVnFsidFreebsd11: UInt = 0u,
    public var kveVnFsid: UInt = 0u,
    public var kveFlags: CInt = 0,
    public var kveResident: CInt = 0,
    public var kvePrivateResident: CInt = 0,
    public var kveProtection: CInt = 0,
    public var kveRefCount: CInt = 0,
    public var kveShadowCount: CInt = 0,
    public var kveVnType: CInt = 0,
    public var kveVnSize: ULong = 0uL,
    public var kveVnRdevFreebsd11: UInt = 0u,
    public var kveVnRdev: UInt = 0u,
    public var kveVnMode: UShort = 0u,
    public var kveStatus: UShort = 0u,
    public var kveIsSpare: IntArray = IntArray(8),
    public var kvePath: List<UByteArray> = List(32) { UByteArray(0) },
)

public data class CAnonymousFilestat(public var stqeNext: Filestat? = null)

public data class Filestat(
    public var fsType: CInt = 0,
    public var fsFlags: CInt = 0,
    public var fsFflags: CInt = 0,
    public var fsUflags: CInt = 0,
    public var fsFd: CInt = 0,
    public var fsRefCount: CInt = 0,
    public var fsOffset: OffT = 0L,
    public var fsTypedep: COpaquePointer? = null,
    public var fsPath: COpaquePointer? = null,
    public var next: CAnonymousFilestat = CAnonymousFilestat(),
    public var fsCapRights: CapRightsT = CapRightsT(),
)

public data class FilestatList(public var stqhFirst: Filestat? = null, public var stqhLast: COpaquePointer? = null)

public data class Procstat(
    public var tpe: CInt = 0,
    public var kd: UintptrT = 0uL,
    public var vmentries: COpaquePointer? = null,
    public var files: COpaquePointer? = null,
    public var argv: COpaquePointer? = null,
    public var envv: COpaquePointer? = null,
    public var core: UintptrT = 0uL,
)

public data class Itimerspec(public var itInterval: Timespec = Timespec(), public var itValue: Timespec = Timespec())

public data class CAnonymousTimer(public var priv: IntArray = IntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousTimer) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}

/**
 * Used to hold a copy of the command line, if it had a sane length.
 */
public data class Pargs(
    /**
     * Reference count.
     */
    public var arRef: UInt = 0u,
    /**
     * Length.
     */
    public var arLength: UInt = 0u,
    /**
     * Arguments.
     */
    public var arArgs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pargs) return false
        if (this.arRef != other.arRef) return false
        if (this.arLength != other.arLength) return false
        if (!this.arArgs.contentEquals(other.arArgs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.arRef.hashCode()
        result = 31 * result + this.arLength.hashCode()
        result = 31 * result + this.arArgs.contentHashCode()
        return result
    }
}

public data class Priority(
    /**
     * Scheduling class.
     */
    public var priClass: UChar = 0u,
    /**
     * Normal priority level.
     */
    public var priLevel: UChar = 0u,
    /**
     * Priority before propagation.
     */
    public var priNative: UChar = 0u,
    /**
     * User priority based on pCpu and pNice.
     */
    public var priUser: UChar = 0u,
)

public data class KvmSwap(
    public var kswDevname: UByteArray = UByteArray(32),
    public var kswUsed: UInt = 0u,
    public var kswTotal: UInt = 0u,
    public var kswFlags: CInt = 0,
    public var kswReserved1: UInt = 0u,
    public var kswReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KvmSwap) return false
        if (!this.kswDevname.contentEquals(other.kswDevname)) return false
        if (this.kswUsed != other.kswUsed) return false
        if (this.kswTotal != other.kswTotal) return false
        if (this.kswFlags != other.kswFlags) return false
        if (this.kswReserved1 != other.kswReserved1) return false
        if (this.kswReserved2 != other.kswReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kswDevname.contentHashCode()
        result = 31 * result + this.kswUsed.hashCode()
        result = 31 * result + this.kswTotal.hashCode()
        result = 31 * result + this.kswFlags.hashCode()
        result = 31 * result + this.kswReserved1.hashCode()
        result = 31 * result + this.kswReserved2.hashCode()
        return result
    }
}

public data class Nlist(
    /**
     * symbol name (in memory)
     */
    public var nName: COpaquePointer? = null,
    /**
     * type defines
     */
    public var nType: CUchar = 0u,
    /**
     * "type" and binding information
     */
    public var nOther: CChar = 0u,
    /**
     * used by stab entries
     */
    public var nDesc: CShort = 0,
    public var nValue: CUlong = 0uL,
)

public data class KvmNlist(
    public var nName: COpaquePointer? = null,
    public var nType: CUchar = 0u,
    public var nValue: KvaddrT = 0uL,
)

public data class CAnonymousSem(public var priv: UintptrT = 0uL)

public data class SemidDs(
    public var semPerm: IpcPerm = IpcPerm(),
    public var semBase: CAnonymousSem? = null,
    public var semNsems: CUshort = 0u,
    public var semOtime: TimeT = 0L,
    public var semCtime: TimeT = 0L,
)

public data class Vmtotal(
    public var tVm: ULong = 0uL,
    public var tAvm: ULong = 0uL,
    public var tRm: ULong = 0uL,
    public var tArm: ULong = 0uL,
    public var tVmshr: ULong = 0uL,
    public var tAvmshr: ULong = 0uL,
    public var tRmshr: ULong = 0uL,
    public var tArmshr: ULong = 0uL,
    public var tFree: ULong = 0uL,
    public var tRq: Short = 0,
    public var tDw: Short = 0,
    public var tPw: Short = 0,
    public var tSl: Short = 0,
    public var tSw: Short = 0,
    public var tPad: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vmtotal) return false
        if (this.tVm != other.tVm) return false
        if (this.tAvm != other.tAvm) return false
        if (this.tRm != other.tRm) return false
        if (this.tArm != other.tArm) return false
        if (this.tVmshr != other.tVmshr) return false
        if (this.tAvmshr != other.tAvmshr) return false
        if (this.tRmshr != other.tRmshr) return false
        if (this.tArmshr != other.tArmshr) return false
        if (this.tFree != other.tFree) return false
        if (this.tRq != other.tRq) return false
        if (this.tDw != other.tDw) return false
        if (this.tPw != other.tPw) return false
        if (this.tSl != other.tSl) return false
        if (this.tSw != other.tSw) return false
        if (!this.tPad.contentEquals(other.tPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tVm.hashCode()
        result = 31 * result + this.tAvm.hashCode()
        result = 31 * result + this.tRm.hashCode()
        result = 31 * result + this.tArm.hashCode()
        result = 31 * result + this.tVmshr.hashCode()
        result = 31 * result + this.tAvmshr.hashCode()
        result = 31 * result + this.tRmshr.hashCode()
        result = 31 * result + this.tArmshr.hashCode()
        result = 31 * result + this.tFree.hashCode()
        result = 31 * result + this.tRq.hashCode()
        result = 31 * result + this.tDw.hashCode()
        result = 31 * result + this.tPw.hashCode()
        result = 31 * result + this.tSl.hashCode()
        result = 31 * result + this.tSw.hashCode()
        result = 31 * result + this.tPad.contentHashCode()
        return result
    }
}

public data class Sockstat(
    public var inpPpcb: ULong = 0uL,
    public var soAddr: ULong = 0uL,
    public var soPcb: ULong = 0uL,
    public var unpConn: ULong = 0uL,
    public var domFamily: CInt = 0,
    public var proto: CInt = 0,
    public var soRcvSbState: CInt = 0,
    public var soSndSbState: CInt = 0,
    /**
     * Socket address.
     */
    public var saLocal: SockaddrStorage = SockaddrStorage(),
    /**
     * Peer address.
     */
    public var saPeer: SockaddrStorage = SockaddrStorage(),
    public var type: CInt = 0,
    public var dname: UByteArray = UByteArray(32),
    public var sendq: CUint = 0u,
    public var recvq: CUint = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockstat) return false
        if (this.inpPpcb != other.inpPpcb) return false
        if (this.soAddr != other.soAddr) return false
        if (this.soPcb != other.soPcb) return false
        if (this.unpConn != other.unpConn) return false
        if (this.domFamily != other.domFamily) return false
        if (this.proto != other.proto) return false
        if (this.soRcvSbState != other.soRcvSbState) return false
        if (this.soSndSbState != other.soSndSbState) return false
        if (this.saLocal != other.saLocal) return false
        if (this.saPeer != other.saPeer) return false
        if (this.type != other.type) return false
        if (!this.dname.contentEquals(other.dname)) return false
        if (this.sendq != other.sendq) return false
        if (this.recvq != other.recvq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inpPpcb.hashCode()
        result = 31 * result + this.soAddr.hashCode()
        result = 31 * result + this.soPcb.hashCode()
        result = 31 * result + this.unpConn.hashCode()
        result = 31 * result + this.domFamily.hashCode()
        result = 31 * result + this.proto.hashCode()
        result = 31 * result + this.soRcvSbState.hashCode()
        result = 31 * result + this.soSndSbState.hashCode()
        result = 31 * result + this.saLocal.hashCode()
        result = 31 * result + this.saPeer.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dname.contentHashCode()
        result = 31 * result + this.sendq.hashCode()
        result = 31 * result + this.recvq.hashCode()
        return result
    }
}

public data class Shmstat(public var size: ULong = 0uL, public var mode: UShort = 0u)

public data class SpacectlRange(public var rOffset: OffT = 0L, public var rLen: OffT = 0L)

public data class RusageExt(
    public var ruxRuntime: ULong = 0uL,
    public var ruxUticks: ULong = 0uL,
    public var ruxSticks: ULong = 0uL,
    public var ruxIticks: ULong = 0uL,
    public var ruxUu: ULong = 0uL,
    public var ruxSu: ULong = 0uL,
    public var ruxTu: ULong = 0uL,
)

public data class IfClonereq(
    public var ifcrTotal: CInt = 0,
    public var ifcrCount: CInt = 0,
    public var ifcrBuffer: COpaquePointer? = null,
)

public data class IfMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt = 0,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort = 0u,
    public var ifmSpare1: CUshort = 0u,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData = IfData(),
)

public data class IfMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt = 0,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort = 0u,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifmSpare1: CUshort = 0u,
    /**
     * length of ifMsghdrl incl. ifData
     */
    public var ifmLen: CUshort = 0u,
    /**
     * offset of ifData from beginning
     */
    public var ifmDataOff: CUshort = 0u,
    public var ifmSpare2: CInt = 0,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData = IfData(),
)

public data class IfaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort = 0u,
    public var ifamSpare1: CUshort = 0u,
    /**
     * value of ifaIfp->ifMetric
     */
    public var ifamMetric: CInt = 0,
)

public data class IfaMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort = 0u,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifamSpare1: CUshort = 0u,
    /**
     * length of ifaMsghdrl incl. ifData
     */
    public var ifamLen: CUshort = 0u,
    /**
     * offset of ifData from beginning
     */
    public var ifamDataOff: CUshort = 0u,
    /**
     * value of ifaIfp->ifMetric
     */
    public var ifamMetric: CInt = 0,
    /**
     * statistics and other data about if or address
     */
    public var ifamData: IfData = IfData(),
)

public data class IfmaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifmamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmamIndex: CUshort = 0u,
    public var ifmamSpare1: CUshort = 0u,
)

public data class IfAnnouncemsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifanMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifanVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifanType: CUchar = 0u,
    /**
     * index for associated ifp
     */
    public var ifanIndex: CUshort = 0u,
    /**
     * if name, e.g. "en0"
     */
    public var ifanName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * what type of announcement
     */
    public var ifanWhat: CUshort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfAnnouncemsghdr) return false
        if (this.ifanMsglen != other.ifanMsglen) return false
        if (this.ifanVersion != other.ifanVersion) return false
        if (this.ifanType != other.ifanType) return false
        if (this.ifanIndex != other.ifanIndex) return false
        if (!this.ifanName.contentEquals(other.ifanName)) return false
        if (this.ifanWhat != other.ifanWhat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifanMsglen.hashCode()
        result = 31 * result + this.ifanVersion.hashCode()
        result = 31 * result + this.ifanType.hashCode()
        result = 31 * result + this.ifanIndex.hashCode()
        result = 31 * result + this.ifanName.contentHashCode()
        result = 31 * result + this.ifanWhat.hashCode()
        return result
    }
}

public data class IfreqBuffer(public var length: SizeT = 0uL, public var buffer: COpaquePointer? = null)

public data class Ifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifraAddr: Sockaddr = Sockaddr(),
    public var ifraBroadaddr: Sockaddr = Sockaddr(),
    public var ifraMask: Sockaddr = Sockaddr(),
    public var ifraVhid: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifaliasreq) return false
        if (!this.ifraName.contentEquals(other.ifraName)) return false
        if (this.ifraAddr != other.ifraAddr) return false
        if (this.ifraBroadaddr != other.ifraBroadaddr) return false
        if (this.ifraMask != other.ifraMask) return false
        if (this.ifraVhid != other.ifraVhid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifraName.contentHashCode()
        result = 31 * result + this.ifraAddr.hashCode()
        result = 31 * result + this.ifraBroadaddr.hashCode()
        result = 31 * result + this.ifraMask.hashCode()
        result = 31 * result + this.ifraVhid.hashCode()
        return result
    }
}

/**
 * 9.x compat
 */
public data class Oifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifraAddr: Sockaddr = Sockaddr(),
    public var ifraBroadaddr: Sockaddr = Sockaddr(),
    public var ifraMask: Sockaddr = Sockaddr(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oifaliasreq) return false
        if (!this.ifraName.contentEquals(other.ifraName)) return false
        if (this.ifraAddr != other.ifraAddr) return false
        if (this.ifraBroadaddr != other.ifraBroadaddr) return false
        if (this.ifraMask != other.ifraMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifraName.contentHashCode()
        result = 31 * result + this.ifraAddr.hashCode()
        result = 31 * result + this.ifraBroadaddr.hashCode()
        result = 31 * result + this.ifraMask.hashCode()
        return result
    }
}

public data class Ifmediareq(
    /**
     * if name, e.g. "en0"
     */
    public var ifmName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * current media options
     */
    public var ifmCurrent: CInt = 0,
    /**
     * don't care mask
     */
    public var ifmMask: CInt = 0,
    /**
     * media status
     */
    public var ifmStatus: CInt = 0,
    /**
     * active options
     */
    public var ifmActive: CInt = 0,
    /**
     * # entries in ifmUlist array
     */
    public var ifmCount: CInt = 0,
    /**
     * media words
     */
    public var ifmUlist: CInt? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifmediareq) return false
        if (!this.ifmName.contentEquals(other.ifmName)) return false
        if (this.ifmCurrent != other.ifmCurrent) return false
        if (this.ifmMask != other.ifmMask) return false
        if (this.ifmStatus != other.ifmStatus) return false
        if (this.ifmActive != other.ifmActive) return false
        if (this.ifmCount != other.ifmCount) return false
        if (this.ifmUlist != other.ifmUlist) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifmName.contentHashCode()
        result = 31 * result + this.ifmCurrent.hashCode()
        result = 31 * result + this.ifmMask.hashCode()
        result = 31 * result + this.ifmStatus.hashCode()
        result = 31 * result + this.ifmActive.hashCode()
        result = 31 * result + this.ifmCount.hashCode()
        result = 31 * result + this.ifmUlist.hashCode()
        return result
    }
}

public data class Ifdrv(
    /**
     * if name, e.g. "en0"
     */
    public var ifdName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifdCmd: CUlong = 0uL,
    public var ifdLen: SizeT = 0uL,
    public var ifdData: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifdrv) return false
        if (!this.ifdName.contentEquals(other.ifdName)) return false
        if (this.ifdCmd != other.ifdCmd) return false
        if (this.ifdLen != other.ifdLen) return false
        if (this.ifdData != other.ifdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifdName.contentHashCode()
        result = 31 * result + this.ifdCmd.hashCode()
        result = 31 * result + this.ifdLen.hashCode()
        result = 31 * result + this.ifdData.hashCode()
        return result
    }
}

public data class Ifi2creq(
    /**
     * i2c address (0xA0, 0xA2)
     */
    public var devAddr: UByte = 0u,
    /**
     * read offset
     */
    public var offset: UByte = 0u,
    /**
     * read length
     */
    public var len: UByte = 0u,
    public var spare0: UByte = 0u,
    public var spare1: UInt = 0u,
    /**
     * read buffer
     */
    public var data: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifi2creq) return false
        if (this.devAddr != other.devAddr) return false
        if (this.offset != other.offset) return false
        if (this.len != other.len) return false
        if (this.spare0 != other.spare0) return false
        if (this.spare1 != other.spare1) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.devAddr.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.spare0.hashCode()
        result = 31 * result + this.spare1.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Ifrsshash(
    /**
     * if name, e.g. "en0"
     */
    public var ifrhName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * RSS_FUNC_
     */
    public var ifrhFunc: UByte = 0u,
    public var ifrhSpare0: UByte = 0u,
    public var ifrhSpare1: UShort = 0u,
    /**
     * RSS_TYPE_
     */
    public var ifrhTypes: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifrsshash) return false
        if (!this.ifrhName.contentEquals(other.ifrhName)) return false
        if (this.ifrhFunc != other.ifrhFunc) return false
        if (this.ifrhSpare0 != other.ifrhSpare0) return false
        if (this.ifrhSpare1 != other.ifrhSpare1) return false
        if (this.ifrhTypes != other.ifrhTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrhName.contentHashCode()
        result = 31 * result + this.ifrhFunc.hashCode()
        result = 31 * result + this.ifrhSpare0.hashCode()
        result = 31 * result + this.ifrhSpare1.hashCode()
        result = 31 * result + this.ifrhTypes.hashCode()
        return result
    }
}

public data class Ifmibdata(
    /**
     * name of interface
     */
    public var ifmdName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * number of promiscuous listeners
     */
    public var ifmdPcount: CInt = 0,
    /**
     * interface flags
     */
    public var ifmdFlags: CInt = 0,
    /**
     * instantaneous length of send queue
     */
    public var ifmdSndLen: CInt = 0,
    /**
     * maximum length of send queue
     */
    public var ifmdSndMaxlen: CInt = 0,
    /**
     * number of drops in send queue
     */
    public var ifmdSndDrops: CInt = 0,
    /**
     * for future expansion
     */
    public var ifmdFiller: IntArray = IntArray(4),
    /**
     * generic information and statistics
     */
    public var ifmdData: IfData = IfData(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifmibdata) return false
        if (!this.ifmdName.contentEquals(other.ifmdName)) return false
        if (this.ifmdPcount != other.ifmdPcount) return false
        if (this.ifmdFlags != other.ifmdFlags) return false
        if (this.ifmdSndLen != other.ifmdSndLen) return false
        if (this.ifmdSndMaxlen != other.ifmdSndMaxlen) return false
        if (this.ifmdSndDrops != other.ifmdSndDrops) return false
        if (!this.ifmdFiller.contentEquals(other.ifmdFiller)) return false
        if (this.ifmdData != other.ifmdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifmdName.contentHashCode()
        result = 31 * result + this.ifmdPcount.hashCode()
        result = 31 * result + this.ifmdFlags.hashCode()
        result = 31 * result + this.ifmdSndLen.hashCode()
        result = 31 * result + this.ifmdSndMaxlen.hashCode()
        result = 31 * result + this.ifmdSndDrops.hashCode()
        result = 31 * result + this.ifmdFiller.contentHashCode()
        result = 31 * result + this.ifmdData.hashCode()
        return result
    }
}

public data class IfmibIso88023(
    public var dot3StatsAlignmentErrors: UInt = 0u,
    public var dot3StatsFCSErrors: UInt = 0u,
    public var dot3StatsSingleCollisionFrames: UInt = 0u,
    public var dot3StatsMultipleCollisionFrames: UInt = 0u,
    public var dot3StatsSQETestErrors: UInt = 0u,
    public var dot3StatsDeferredTransmissions: UInt = 0u,
    public var dot3StatsLateCollisions: UInt = 0u,
    public var dot3StatsExcessiveCollisions: UInt = 0u,
    public var dot3StatsInternalMacTransmitErrors: UInt = 0u,
    public var dot3StatsCarrierSenseErrors: UInt = 0u,
    public var dot3StatsFrameTooLongs: UInt = 0u,
    public var dot3StatsInternalMacReceiveErrors: UInt = 0u,
    public var dot3StatsEtherChipSet: UInt = 0u,
    public var dot3StatsMissedFrames: UInt = 0u,
    public var dot3StatsCollFrequencies: UIntArray = UIntArray(16),
    public var dot3Compliance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfmibIso88023) return false
        if (this.dot3StatsAlignmentErrors != other.dot3StatsAlignmentErrors) return false
        if (this.dot3StatsFCSErrors != other.dot3StatsFCSErrors) return false
        if (this.dot3StatsSingleCollisionFrames != other.dot3StatsSingleCollisionFrames) return false
        if (this.dot3StatsMultipleCollisionFrames != other.dot3StatsMultipleCollisionFrames) return false
        if (this.dot3StatsSQETestErrors != other.dot3StatsSQETestErrors) return false
        if (this.dot3StatsDeferredTransmissions != other.dot3StatsDeferredTransmissions) return false
        if (this.dot3StatsLateCollisions != other.dot3StatsLateCollisions) return false
        if (this.dot3StatsExcessiveCollisions != other.dot3StatsExcessiveCollisions) return false
        if (this.dot3StatsInternalMacTransmitErrors != other.dot3StatsInternalMacTransmitErrors) return false
        if (this.dot3StatsCarrierSenseErrors != other.dot3StatsCarrierSenseErrors) return false
        if (this.dot3StatsFrameTooLongs != other.dot3StatsFrameTooLongs) return false
        if (this.dot3StatsInternalMacReceiveErrors != other.dot3StatsInternalMacReceiveErrors) return false
        if (this.dot3StatsEtherChipSet != other.dot3StatsEtherChipSet) return false
        if (this.dot3StatsMissedFrames != other.dot3StatsMissedFrames) return false
        if (!this.dot3StatsCollFrequencies.contentEquals(other.dot3StatsCollFrequencies)) return false
        if (this.dot3Compliance != other.dot3Compliance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot3StatsAlignmentErrors.hashCode()
        result = 31 * result + this.dot3StatsFCSErrors.hashCode()
        result = 31 * result + this.dot3StatsSingleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsMultipleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsSQETestErrors.hashCode()
        result = 31 * result + this.dot3StatsDeferredTransmissions.hashCode()
        result = 31 * result + this.dot3StatsLateCollisions.hashCode()
        result = 31 * result + this.dot3StatsExcessiveCollisions.hashCode()
        result = 31 * result + this.dot3StatsInternalMacTransmitErrors.hashCode()
        result = 31 * result + this.dot3StatsCarrierSenseErrors.hashCode()
        result = 31 * result + this.dot3StatsFrameTooLongs.hashCode()
        result = 31 * result + this.dot3StatsInternalMacReceiveErrors.hashCode()
        result = 31 * result + this.dot3StatsEtherChipSet.hashCode()
        result = 31 * result + this.dot3StatsMissedFrames.hashCode()
        result = 31 * result + this.dot3StatsCollFrequencies.contentHashCode()
        result = 31 * result + this.dot3Compliance.hashCode()
        return result
    }
}

public data class CAnonymousPh(public var ph1: ULong = 0uL, public var ph2: ULong = 0uL)

public data class Fid(
    public var fidLen: CUshort = 0u,
    public var fidData0: CUshort = 0u,
    public var fidData: UByteArray = UByteArray(MAXFIDSZ.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fid) return false
        if (this.fidLen != other.fidLen) return false
        if (this.fidData0 != other.fidData0) return false
        if (!this.fidData.contentEquals(other.fidData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fidLen.hashCode()
        result = 31 * result + this.fidData0.hashCode()
        result = 31 * result + this.fidData.contentHashCode()
        return result
    }
}

public data class Fhandle(public var fhFsid: FsidT = FsidT(), public var fhFid: Fid = Fid())

public data class Bintime(public var sec: TimeT = 0L, public var frac: ULong = 0uL)

public data class Clockinfo(
    /**
     * clock frequency
     */
    public var hz: CInt = 0,
    /**
     * micro-seconds per hz tick
     */
    public var tick: CInt = 0,
    public var spare: CInt = 0,
    /**
     * statistics clock frequency
     */
    public var stathz: CInt = 0,
    /**
     * profiling clock frequency
     */
    public var profhz: CInt = 0,
)

public data class CAnonymousStailqEntryDevstat(public var stqeNext: Devstat? = null)

public class Devstat(
    /**
     * Update sequence
     */
    public var sequence0: UInt = 0u,
    /**
     * Allocated entry
     */
    public var allocated: CInt = 0,
    /**
     * started ops
     */
    public var startCount: UInt = 0u,
    /**
     * completed ops
     */
    public var endCount: UInt = 0u,
    /**
     * busy time unaccounted for since this time
     */
    public var busyFrom: Bintime = Bintime(),
    public var devLinks: CAnonymousStailqEntryDevstat = CAnonymousStailqEntryDevstat(),
    /**
     * Devstat device number.
     */
    public var deviceNumber: UInt = 0u,
    public var deviceName: UByteArray = UByteArray(DEVSTAT_NAME_LEN.toInt()),
    public var unitNumber: CInt = 0,
    public var bytes: ULongArray = ULongArray(DEVSTAT_N_TRANS_FLAGS.toInt()),
    public var operations: ULongArray = ULongArray(DEVSTAT_N_TRANS_FLAGS.toInt()),
    public var duration: List<Bintime> = List(DEVSTAT_N_TRANS_FLAGS.toInt()) { Bintime() },
    public var busyTime: Bintime = Bintime(),
    /**
     * Time the device was created.
     */
    public var creationTime: Bintime = Bintime(),
    /**
     * Block size, bytes
     */
    public var blockSize: UInt = 0u,
    /**
     * The number of simple, ordered, and head of queue tags sent.
     */
    public var tagTypes: ULongArray = ULongArray(3),
    /**
     * Which statistics are supported by a given device.
     */
    public var flags: DevstatSupportFlags = DevstatSupportFlags.entries.first(),
    /**
     * Device type
     */
    public var deviceType: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
    /**
     * Controls list pos.
     */
    public var priority: DevstatPriority = DevstatPriority.entries.first(),
    /**
     * Identification for GEOM nodes
     */
    public var id: COpaquePointer? = null,
    /**
     * Update sequence
     */
    public var sequence1: UInt = 0u,
)

public data class DevstatMatch(
    public var matchFields: DevstatMatchFlags = DevstatMatchFlags.entries.first(),
    public var deviceType: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
    public var numMatchCategories: CInt = 0,
)

public data class DevstatMatchTable(
    public var matchStr: COpaquePointer? = null,
    public var type: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
    public var matchField: DevstatMatchFlags = DevstatMatchFlags.entries.first(),
)

public data class DeviceSelection(
    public var deviceNumber: UInt = 0u,
    public var deviceName: UByteArray = UByteArray(DEVSTAT_NAME_LEN.toInt()),
    public var unitNumber: CInt = 0,
    public var selected: CInt = 0,
    public var bytes: ULong = 0uL,
    public var position: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceSelection) return false
        if (this.deviceNumber != other.deviceNumber) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.unitNumber != other.unitNumber) return false
        if (this.selected != other.selected) return false
        if (this.bytes != other.bytes) return false
        if (this.position != other.position) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceNumber.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        result = 31 * result + this.unitNumber.hashCode()
        result = 31 * result + this.selected.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.position.hashCode()
        return result
    }
}

public data class Devinfo(
    public var devices: Devstat? = null,
    public var memPtr: COpaquePointer? = null,
    public var generation: CLong = 0L,
    public var numdevs: CInt = 0,
)

public data class Sockcred2(
    public var scVersion: CInt = 0,
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
        if (other !is Sockcred2) return false
        if (this.scVersion != other.scVersion) return false
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
        var result = this.scVersion.hashCode()
        result = 31 * result + this.scPid.hashCode()
        result = 31 * result + this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public data class Ifconf(public var ifcLen: CInt = 0, public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu())

public data class AuMaskT(public var amSuccess: CUint = 0u, public var amFailure: CUint = 0u)

public data class AuTidT(public var port: UInt = 0u, public var machine: UInt = 0u)

public data class AuditinfoT(
    public var aiAuid: AuIdT = 0u,
    public var aiMask: AuMaskT = AuMaskT(),
    public var aiTermid: AuTidT = AuTidT(),
    public var aiAsid: AuAsidT = 0,
)

public data class TcpFastopen(public var enable: CInt = 0, public var psk: UByteArray = UByteArray(TCP_FASTOPEN_PSK_LEN.toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpFastopen) return false
        if (this.enable != other.enable) return false
        if (!this.psk.contentEquals(other.psk)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enable.hashCode()
        result = 31 * result + this.psk.contentHashCode()
        return result
    }
}

public data class TcpFunctionSet(public var functionSetName: UByteArray = UByteArray(TCP_FUNCTION_NAME_LEN_MAX.toInt()), public var pcbcnt: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpFunctionSet) return false
        if (!this.functionSetName.contentEquals(other.functionSetName)) return false
        if (this.pcbcnt != other.pcbcnt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.functionSetName.contentHashCode()
        result = 31 * result + this.pcbcnt.hashCode()
        return result
    }
}

// Note: this structure will change in a backwards-incompatible way in
// FreeBSD 15.
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
    public var tcpiDeliveredCe: UInt = 0u,
    public var tcpiReceivedCe: UInt = 0u,
    public var tcpiDeliveredE1Bytes: UInt = 0u,
    public var tcpiDeliveredE0Bytes: UInt = 0u,
    public var tcpiDeliveredCeBytes: UInt = 0u,
    public var tcpiReceivedE1Bytes: UInt = 0u,
    public var tcpiReceivedE0Bytes: UInt = 0u,
    public var tcpiReceivedCeBytes: UInt = 0u,
    public var tcpiTotalTlp: UInt = 0u,
    public var tcpiTotalTlpBytes: ULong = 0uL,
    public var tcpiSndUna: UInt = 0u,
    public var tcpiSndMax: UInt = 0u,
    public var tcpiRcvNumsacks: UInt = 0u,
    public var tcpiRcvAdv: UInt = 0u,
    public var tcpiDupacks: UInt = 0u,
    public var tcpiPad: UIntArray = UIntArray(10),
)

public data class UmtxTime(
    public var timeout: Timespec = Timespec(),
    public var flags: UInt = 0u,
    public var clockid: UInt = 0u,
)

public data class ShmLargepageConf(
    public var psind: CInt = 0,
    public var allocPolicy: CInt = 0,
    public var pad: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmLargepageConf) return false
        if (this.psind != other.psind) return false
        if (this.allocPolicy != other.allocPolicy) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psind.hashCode()
        result = 31 * result + this.allocPolicy.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class MemoryType(public var priva: ULongArray = ULongArray(32), public var privb: ULongArray = ULongArray(26)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryType) return false
        if (!this.priva.contentEquals(other.priva)) return false
        if (!this.privb.contentEquals(other.privb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priva.contentHashCode()
        result = 31 * result + this.privb.contentHashCode()
        return result
    }
}

public data class MemoryTypeList(public var priv: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryTypeList) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}

public data class Pidfh(public var priva: List<ULongArray> = List(8) { ULongArray(0) }, public var privb: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pidfh) return false
        if (this.priva != other.priva) return false
        if (!this.privb.contentEquals(other.privb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priva.hashCode()
        result = 31 * result + this.privb.contentHashCode()
        return result
    }
}

public data class SctpEvent(
    public var seAssocId: SctpAssocT = 0u,
    public var seType: UShort = 0u,
    public var seOn: UByte = 0u,
)

public data class SctpEventSubscribe(
    public var sctpDataIoEvent: UByte = 0u,
    public var sctpAssociationEvent: UByte = 0u,
    public var sctpAddressEvent: UByte = 0u,
    public var sctpSendFailureEvent: UByte = 0u,
    public var sctpPeerErrorEvent: UByte = 0u,
    public var sctpShutdownEvent: UByte = 0u,
    public var sctpPartialDeliveryEvent: UByte = 0u,
    public var sctpAdaptationLayerEvent: UByte = 0u,
    public var sctpAuthenticationEvent: UByte = 0u,
    public var sctpSenderDryEvent: UByte = 0u,
    public var sctpStreamResetEvent: UByte = 0u,
)

public data class SctpInitmsg(
    public var sinitNumOstreams: UShort = 0u,
    public var sinitMaxInstreams: UShort = 0u,
    public var sinitMaxAttempts: UShort = 0u,
    public var sinitMaxInitTimeo: UShort = 0u,
)

public data class SctpSndrcvinfo(
    public var sinfoStream: UShort = 0u,
    public var sinfoSsn: UShort = 0u,
    public var sinfoFlags: UShort = 0u,
    public var sinfoPpid: UInt = 0u,
    public var sinfoContext: UInt = 0u,
    public var sinfoTimetolive: UInt = 0u,
    public var sinfoTsn: UInt = 0u,
    public var sinfoCumtsn: UInt = 0u,
    public var sinfoAssocId: SctpAssocT = 0u,
    public var sinfoKeynumber: UShort = 0u,
    public var sinfoKeynumberValid: UShort = 0u,
    public var reservePad: List<UByteArray> = List(4) { UByteArray(0) },
)

public class SctpExtrcvinfo(
    public var sinfoStream: UShort = 0u,
    public var sinfoSsn: UShort = 0u,
    public var sinfoFlags: UShort = 0u,
    public var sinfoPpid: UInt = 0u,
    public var sinfoContext: UInt = 0u,
    public var sinfoTimetolive: UInt = 0u,
    public var sinfoTsn: UInt = 0u,
    public var sinfoCumtsn: UInt = 0u,
    public var sinfoAssocId: SctpAssocT = 0u,
    public var serinfoNextFlags: UShort = 0u,
    public var serinfoNextStream: UShort = 0u,
    public var serinfoNextAid: UInt = 0u,
    public var serinfoNextLength: UInt = 0u,
    public var serinfoNextPpid: UInt = 0u,
    public var sinfoKeynumber: UShort = 0u,
    public var sinfoKeynumberValid: UShort = 0u,
    public var reservePad: List<UByteArray> = List(4) { UByteArray(0) },
)

public data class SctpSndinfo(
    public var sndSid: UShort = 0u,
    public var sndFlags: UShort = 0u,
    public var sndPpid: UInt = 0u,
    public var sndContext: UInt = 0u,
    public var sndAssocId: SctpAssocT = 0u,
)

public data class SctpPrinfo(public var prPolicy: UShort = 0u, public var prValue: UInt = 0u)

public data class SctpDefaultPrinfo(
    public var prPolicy: UShort = 0u,
    public var prValue: UInt = 0u,
    public var prAssocId: SctpAssocT = 0u,
)

public data class SctpAuthinfo(public var authKeynumber: UShort = 0u)

public data class SctpRcvinfo(
    public var rcvSid: UShort = 0u,
    public var rcvSsn: UShort = 0u,
    public var rcvFlags: UShort = 0u,
    public var rcvPpid: UInt = 0u,
    public var rcvTsn: UInt = 0u,
    public var rcvCumtsn: UInt = 0u,
    public var rcvContext: UInt = 0u,
    public var rcvAssocId: SctpAssocT = 0u,
)

public data class SctpNxtinfo(
    public var nxtSid: UShort = 0u,
    public var nxtFlags: UShort = 0u,
    public var nxtPpid: UInt = 0u,
    public var nxtLength: UInt = 0u,
    public var nxtAssocId: SctpAssocT = 0u,
)

public data class SctpRecvvRn(public var recvvRcvinfo: SctpRcvinfo = SctpRcvinfo(), public var recvvNxtinfo: SctpNxtinfo = SctpNxtinfo())

public data class SctpSendvSpa(
    public var sendvFlags: UInt = 0u,
    public var sendvSndinfo: SctpSndinfo = SctpSndinfo(),
    public var sendvPrinfo: SctpPrinfo = SctpPrinfo(),
    public var sendvAuthinfo: SctpAuthinfo = SctpAuthinfo(),
)

public data class SctpSndAllCompletes(
    public var sallStream: UShort = 0u,
    public var sallFlags: UShort = 0u,
    public var sallPpid: UInt = 0u,
    public var sallContext: UInt = 0u,
    public var sallNumSent: UInt = 0u,
    public var sallNumFailed: UInt = 0u,
)

public data class SctpPcbinfo(
    public var epCount: UInt = 0u,
    public var asocCount: UInt = 0u,
    public var laddrCount: UInt = 0u,
    public var raddrCount: UInt = 0u,
    public var chkCount: UInt = 0u,
    public var readqCount: UInt = 0u,
    public var freeChunks: UInt = 0u,
    public var streamOque: UInt = 0u,
)

public data class SctpSockstat(
    public var ssAssocId: SctpAssocT = 0u,
    public var ssTotalSndbuf: UInt = 0u,
    public var ssTotalRecvBuf: UInt = 0u,
)

public data class SctpAssocChange(
    public var sacType: UShort = 0u,
    public var sacFlags: UShort = 0u,
    public var sacLength: UInt = 0u,
    public var sacState: UShort = 0u,
    public var sacError: UShort = 0u,
    public var sacOutboundStreams: UShort = 0u,
    public var sacInboundStreams: UShort = 0u,
    public var sacAssocId: SctpAssocT = 0u,
    public var sacInfo: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpAssocChange) return false
        if (this.sacType != other.sacType) return false
        if (this.sacFlags != other.sacFlags) return false
        if (this.sacLength != other.sacLength) return false
        if (this.sacState != other.sacState) return false
        if (this.sacError != other.sacError) return false
        if (this.sacOutboundStreams != other.sacOutboundStreams) return false
        if (this.sacInboundStreams != other.sacInboundStreams) return false
        if (this.sacAssocId != other.sacAssocId) return false
        if (!this.sacInfo.contentEquals(other.sacInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sacType.hashCode()
        result = 31 * result + this.sacFlags.hashCode()
        result = 31 * result + this.sacLength.hashCode()
        result = 31 * result + this.sacState.hashCode()
        result = 31 * result + this.sacError.hashCode()
        result = 31 * result + this.sacOutboundStreams.hashCode()
        result = 31 * result + this.sacInboundStreams.hashCode()
        result = 31 * result + this.sacAssocId.hashCode()
        result = 31 * result + this.sacInfo.contentHashCode()
        return result
    }
}

public data class SctpPaddrChange(
    public var spcType: UShort = 0u,
    public var spcFlags: UShort = 0u,
    public var spcLength: UInt = 0u,
    public var spcAaddr: SockaddrStorage = SockaddrStorage(),
    public var spcState: UInt = 0u,
    public var spcError: UInt = 0u,
    public var spcAssocId: SctpAssocT = 0u,
)

public data class SctpRemoteError(
    public var sreType: UShort = 0u,
    public var sreFlags: UShort = 0u,
    public var sreLength: UInt = 0u,
    public var sreError: UShort = 0u,
    public var sreAssocId: SctpAssocT = 0u,
    public var sreData: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpRemoteError) return false
        if (this.sreType != other.sreType) return false
        if (this.sreFlags != other.sreFlags) return false
        if (this.sreLength != other.sreLength) return false
        if (this.sreError != other.sreError) return false
        if (this.sreAssocId != other.sreAssocId) return false
        if (!this.sreData.contentEquals(other.sreData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sreType.hashCode()
        result = 31 * result + this.sreFlags.hashCode()
        result = 31 * result + this.sreLength.hashCode()
        result = 31 * result + this.sreError.hashCode()
        result = 31 * result + this.sreAssocId.hashCode()
        result = 31 * result + this.sreData.contentHashCode()
        return result
    }
}

public data class SctpSendFailedEvent(
    public var ssfeType: UShort = 0u,
    public var ssfeFlags: UShort = 0u,
    public var ssfeLength: UInt = 0u,
    public var ssfeError: UInt = 0u,
    public var ssfeInfo: SctpSndinfo = SctpSndinfo(),
    public var ssfeAssocId: SctpAssocT = 0u,
    public var ssfeData: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpSendFailedEvent) return false
        if (this.ssfeType != other.ssfeType) return false
        if (this.ssfeFlags != other.ssfeFlags) return false
        if (this.ssfeLength != other.ssfeLength) return false
        if (this.ssfeError != other.ssfeError) return false
        if (this.ssfeInfo != other.ssfeInfo) return false
        if (this.ssfeAssocId != other.ssfeAssocId) return false
        if (!this.ssfeData.contentEquals(other.ssfeData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssfeType.hashCode()
        result = 31 * result + this.ssfeFlags.hashCode()
        result = 31 * result + this.ssfeLength.hashCode()
        result = 31 * result + this.ssfeError.hashCode()
        result = 31 * result + this.ssfeInfo.hashCode()
        result = 31 * result + this.ssfeAssocId.hashCode()
        result = 31 * result + this.ssfeData.contentHashCode()
        return result
    }
}

public data class SctpShutdownEvent(
    public var sseType: UShort = 0u,
    public var sseFlags: UShort = 0u,
    public var sseLength: UInt = 0u,
    public var sseAssocId: SctpAssocT = 0u,
)

public data class SctpAdaptationEvent(
    public var saiType: UShort = 0u,
    public var saiFlags: UShort = 0u,
    public var saiLength: UInt = 0u,
    public var saiAdaptationInd: UInt = 0u,
    public var saiAssocId: SctpAssocT = 0u,
)

public data class SctpSetadaptation(public var ssbAdaptationInd: UInt = 0u)

public data class SctpPdapiEvent(
    public var pdapiType: UShort = 0u,
    public var pdapiFlags: UShort = 0u,
    public var pdapiLength: UInt = 0u,
    public var pdapiIndication: UInt = 0u,
    public var pdapiStream: UShort = 0u,
    public var pdapiSeq: UShort = 0u,
    public var pdapiAssocId: SctpAssocT = 0u,
)

public data class SctpSenderDryEvent(
    public var senderDryType: UShort = 0u,
    public var senderDryFlags: UShort = 0u,
    public var senderDryLength: UInt = 0u,
    public var senderDryAssocId: SctpAssocT = 0u,
)

public data class SctpStreamResetEvent(
    public var strresetType: UShort = 0u,
    public var strresetFlags: UShort = 0u,
    public var strresetLength: UInt = 0u,
    public var strresetAssocId: SctpAssocT = 0u,
    public var strresetStreamList: UShortArray = UShortArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpStreamResetEvent) return false
        if (this.strresetType != other.strresetType) return false
        if (this.strresetFlags != other.strresetFlags) return false
        if (this.strresetLength != other.strresetLength) return false
        if (this.strresetAssocId != other.strresetAssocId) return false
        if (!this.strresetStreamList.contentEquals(other.strresetStreamList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strresetType.hashCode()
        result = 31 * result + this.strresetFlags.hashCode()
        result = 31 * result + this.strresetLength.hashCode()
        result = 31 * result + this.strresetAssocId.hashCode()
        result = 31 * result + this.strresetStreamList.contentHashCode()
        return result
    }
}

public data class SctpStreamChangeEvent(
    public var strchangeType: UShort = 0u,
    public var strchangeFlags: UShort = 0u,
    public var strchangeLength: UInt = 0u,
    public var strchangeAssocId: SctpAssocT = 0u,
    public var strchangeInstrms: UShort = 0u,
    public var strchangeOutstrms: UShort = 0u,
)

public data class Filedesc(
    public var fdFiles: Fdescenttbl? = null,
    public var fdMap: CUlong? = null,
    public var fdFreefile: CInt = 0,
    public var fdRefcnt: CInt = 0,
    public var fdHoldcnt: CInt = 0,
    public var fdSx: Sx = Sx(),
    public var fdKqlist: Kqlist = Kqlist(),
    public var fdHoldleaderscount: CInt = 0,
    public var fdHoldleaderswakeup: CInt = 0,
)

public data class Fdescenttbl(public var fdtNfiles: CInt = 0, public var fdtOfiles: List<COpaquePointer?> = List(0) { null })

public data class Sx(public var lockObject: LockObject = LockObject(), public var sxLock: UintptrT = 0uL)

public data class LockObject(
    public var loName: COpaquePointer? = null,
    public var loFlags: CUint = 0u,
    public var loData: CUint = 0u,
    // This is normally `class witness`.
    public var loWitness: COpaquePointer? = null,
)

public data class Kqlist(public var tqhFirst: COpaquePointer? = null, public var tqhLast: COpaquePointer? = null)

public data class Splice(
    public var spFd: CInt = 0,
    public var spMax: OffT = 0L,
    public var spIdle: Timeval = Timeval(),
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utId: UByteArray = UByteArray(8),
    public var utPid: PidT = 0,
    public var utUser: UByteArray = UByteArray(32),
    public var utLine: UByteArray = UByteArray(16),
    public var utHost: UByteArray = UByteArray(128),
    public var utSpare: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utPid != other.utPid) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utSpare.contentEquals(other.utSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utSpare.contentHashCode()
        return result
    }
}

public data class Xucred(
    public var crVersion: CUint = 0u,
    public var crUid: UidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(16),
    public var crPidCAnonymousUnion: CAnonymousCrPid = CAnonymousCrPid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        if (this.crPidCAnonymousUnion != other.crPidCAnonymousUnion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        result = 31 * result + this.crPidCAnonymousUnion.hashCode()
        return result
    }
}

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(46),
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

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MqAttr) return false
        if (this.mqFlags != other.mqFlags) return false
        if (this.mqMaxmsg != other.mqMaxmsg) return false
        if (this.mqMsgsize != other.mqMsgsize) return false
        if (this.mqCurmsgs != other.mqCurmsgs) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mqFlags.hashCode()
        result = 31 * result + this.mqMaxmsg.hashCode()
        result = 31 * result + this.mqMsgsize.hashCode()
        result = 31 * result + this.mqCurmsgs.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Ptsstat(public var dev: ULong = 0uL, public var devname: UByteArray = UByteArray((SPECNAMELEN.toInt() + 1).toInt())) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ptsstat) return false
        if (this.dev != other.dev) return false
        if (!this.devname.contentEquals(other.devname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dev.hashCode()
        result = 31 * result + this.devname.contentHashCode()
        return result
    }
}

public data class Elf32Auxinfo(public var aType: CInt = 0, public var aUn: CAnonymousElf32AuxvUnion = CAnonymousElf32AuxvUnion())

public data class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public class IfData(
    /**
     * ethernet, tokenring, etc
     */
    public var ifiType: UByte = 0u,
    /**
     * e.g., AUI, Thinnet, 10base-T, etc
     */
    public var ifiPhysical: UByte = 0u,
    /**
     * media address length
     */
    public var ifiAddrlen: UByte = 0u,
    /**
     * media header length
     */
    public var ifiHdrlen: UByte = 0u,
    /**
     * current link state
     */
    public var ifiLinkState: UByte = 0u,
    /**
     * carp vhid
     */
    public var ifiVhid: UByte = 0u,
    /**
     * length of this data struct
     */
    public var ifiDatalen: UShort = 0u,
    /**
     * maximum transmission unit
     */
    public var ifiMtu: UInt = 0u,
    /**
     * routing metric (external only)
     */
    public var ifiMetric: UInt = 0u,
    /**
     * linespeed
     */
    public var ifiBaudrate: ULong = 0uL,
    /**
     * packets received on interface
     */
    public var ifiIpackets: ULong = 0uL,
    /**
     * input errors on interface
     */
    public var ifiIerrors: ULong = 0uL,
    /**
     * packets sent on interface
     */
    public var ifiOpackets: ULong = 0uL,
    /**
     * output errors on interface
     */
    public var ifiOerrors: ULong = 0uL,
    /**
     * collisions on csma interfaces
     */
    public var ifiCollisions: ULong = 0uL,
    /**
     * total number of octets received
     */
    public var ifiIbytes: ULong = 0uL,
    /**
     * total number of octets sent
     */
    public var ifiObytes: ULong = 0uL,
    /**
     * packets received via multicast
     */
    public var ifiImcasts: ULong = 0uL,
    /**
     * packets sent via multicast
     */
    public var ifiOmcasts: ULong = 0uL,
    /**
     * dropped on input
     */
    public var ifiIqdrops: ULong = 0uL,
    /**
     * dropped on output
     */
    public var ifiOqdrops: ULong = 0uL,
    /**
     * destined for unsupported protocol
     */
    public var ifiNoproto: ULong = 0uL,
    /**
     * HW offload capabilities, see IFCAP
     */
    public var ifiHwassist: ULong = 0uL,
    /**
     * uptime at attach or stat reset
     */
    public var ifiEpoch: CAnonymousIfiEpoch = CAnonymousIfiEpoch(),
    /**
     * time of last administrative change
     */
    public var ifiLastchange: CAnonymousIfiLastchange = CAnonymousIfiLastchange(),
)

public data class Ifstat(
    /**
     * if name, e.g. "en0"
     */
    public var ifsName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ascii: UByteArray = UByteArray((IFSTATMAX.toInt() + 1).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifstat) return false
        if (!this.ifsName.contentEquals(other.ifsName)) return false
        if (!this.ascii.contentEquals(other.ascii)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifsName.contentHashCode()
        result = 31 * result + this.ascii.contentHashCode()
        return result
    }
}

public data class Ifrsskey(
    /**
     * if name, e.g. "en0"
     */
    public var ifrkName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * RSS_FUNC_
     */
    public var ifrkFunc: UByte = 0u,
    public var ifrkSpare0: UByte = 0u,
    public var ifrkKeylen: UShort = 0u,
    public var ifrkKey: UByteArray = UByteArray(RSS_KEYLEN.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifrsskey) return false
        if (!this.ifrkName.contentEquals(other.ifrkName)) return false
        if (this.ifrkFunc != other.ifrkFunc) return false
        if (this.ifrkSpare0 != other.ifrkSpare0) return false
        if (this.ifrkKeylen != other.ifrkKeylen) return false
        if (!this.ifrkKey.contentEquals(other.ifrkKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrkName.contentHashCode()
        result = 31 * result + this.ifrkFunc.hashCode()
        result = 31 * result + this.ifrkSpare0.hashCode()
        result = 31 * result + this.ifrkKeylen.hashCode()
        result = 31 * result + this.ifrkKey.contentHashCode()
        return result
    }
}

public data class Ifdownreason(
    public var ifdrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifdrReason: UInt = 0u,
    public var ifdrVendor: UInt = 0u,
    public var ifdrMsg: UByteArray = UByteArray(IFDR_MSG_SIZE.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifdownreason) return false
        if (!this.ifdrName.contentEquals(other.ifdrName)) return false
        if (this.ifdrReason != other.ifdrReason) return false
        if (this.ifdrVendor != other.ifdrVendor) return false
        if (!this.ifdrMsg.contentEquals(other.ifdrMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifdrName.contentHashCode()
        result = 31 * result + this.ifdrReason.hashCode()
        result = 31 * result + this.ifdrVendor.hashCode()
        result = 31 * result + this.ifdrMsg.contentHashCode()
        return result
    }
}

public data class Sctphdr(
    public var srcPort: UShort = 0u,
    public var destPort: UShort = 0u,
    public var vTag: UInt = 0u,
    public var checksum: UInt = 0u,
)

public data class SctpChunkhdr(
    public var chunkType: UByte = 0u,
    public var chunkFlags: UByte = 0u,
    public var chunkLength: UShort = 0u,
)

public data class SctpParamhdr(public var paramType: UShort = 0u, public var paramLength: UShort = 0u)

public data class SctpGenErrorCause(
    public var code: UShort = 0u,
    public var length: UShort = 0u,
    public var info: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpGenErrorCause) return false
        if (this.code != other.code) return false
        if (this.length != other.length) return false
        if (!this.info.contentEquals(other.info)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.info.contentHashCode()
        return result
    }
}

public data class SctpErrorCause(public var code: UShort = 0u, public var length: UShort = 0u)

public data class SctpErrorInvalidStream(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var streamId: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class SctpErrorMissingParam(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var numMissingParams: UInt = 0u,
    public var tpe: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpErrorMissingParam) return false
        if (this.cause != other.cause) return false
        if (this.numMissingParams != other.numMissingParams) return false
        if (!this.tpe.contentEquals(other.tpe)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cause.hashCode()
        result = 31 * result + this.numMissingParams.hashCode()
        result = 31 * result + this.tpe.contentHashCode()
        return result
    }
}

public data class SctpErrorStaleCookie(public var cause: SctpErrorCause = SctpErrorCause(), public var staleTime: UInt = 0u)

public data class SctpErrorOutOfResource(public var cause: SctpErrorCause = SctpErrorCause())

public data class SctpErrorUnresolvAddr(public var cause: SctpErrorCause = SctpErrorCause())

public data class SctpErrorUnrecognizedChunk(public var cause: SctpErrorCause = SctpErrorCause(), public var ch: SctpChunkhdr = SctpChunkhdr())

public data class SctpErrorNoUserData(public var cause: SctpErrorCause = SctpErrorCause(), public var tsn: UInt = 0u)

public data class SctpErrorAuthInvalidHmac(public var cause: SctpErrorCause = SctpErrorCause(), public var hmacId: UShort = 0u)

public data class KinfoFile(
    public var kfStructsize: CInt = 0,
    public var kfType: CInt = 0,
    public var kfFd: CInt = 0,
    public var kfRefCount: CInt = 0,
    public var kfFlags: CInt = 0,
    public var kfPad0: CInt = 0,
    public var kfOffset: Long = 0L,
    public var priv: UByteArray = UByteArray(304),
    // Note(freebsd): this is really a giant union
    public var kfStatus: UShort = 0u,
    public var kfPad1: UShort = 0u,
    public var kfIspare0: CInt = 0,
    public var kfCapRights: CapRightsT = CapRightsT(),
    public var kfCapSpare: ULong = 0uL,
    public var kfPath: UByteArray = UByteArray(PATH_MAX.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KinfoFile) return false
        if (this.kfStructsize != other.kfStructsize) return false
        if (this.kfType != other.kfType) return false
        if (this.kfFd != other.kfFd) return false
        if (this.kfRefCount != other.kfRefCount) return false
        if (this.kfFlags != other.kfFlags) return false
        if (this.kfPad0 != other.kfPad0) return false
        if (this.kfOffset != other.kfOffset) return false
        if (!this.priv.contentEquals(other.priv)) return false
        if (this.kfStatus != other.kfStatus) return false
        if (this.kfPad1 != other.kfPad1) return false
        if (this.kfIspare0 != other.kfIspare0) return false
        if (this.kfCapRights != other.kfCapRights) return false
        if (this.kfCapSpare != other.kfCapSpare) return false
        if (!this.kfPath.contentEquals(other.kfPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kfStructsize.hashCode()
        result = 31 * result + this.kfType.hashCode()
        result = 31 * result + this.kfFd.hashCode()
        result = 31 * result + this.kfRefCount.hashCode()
        result = 31 * result + this.kfFlags.hashCode()
        result = 31 * result + this.kfPad0.hashCode()
        result = 31 * result + this.kfOffset.hashCode()
        result = 31 * result + this.priv.contentHashCode()
        result = 31 * result + this.kfStatus.hashCode()
        result = 31 * result + this.kfPad1.hashCode()
        result = 31 * result + this.kfIspare0.hashCode()
        result = 31 * result + this.kfCapRights.hashCode()
        result = 31 * result + this.kfCapSpare.hashCode()
        result = 31 * result + this.kfPath.contentHashCode()
        return result
    }
}

public data class CAnonymousCrPid(public var crUnused: COpaquePointer? = null, public var crPid: PidT = 0) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_cr_pid").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousCrPid): Boolean {
        return this.crPid == other.crPid
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.crPid).hashCode()
        return state
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    // The rest of the structure is actually a union.  We expose only
    // sigevNotifyThreadId because it's the most useful union member.
    public var sigevNotifyThreadId: LwpidT = 0,
    public var unused1: CInt = 0,
    public var unused2: LongArray = LongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevNotifyThreadId != other.sigevNotifyThreadId) return false
        if (this.unused1 != other.unused1) return false
        if (!this.unused2.contentEquals(other.unused2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.sigevNotifyThreadId.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.contentHashCode()
        return result
    }

    public fun eq(other: Sigevent): Boolean {
        return this.sigevNotify == other.sigevNotify && this.sigevSigno == other.sigevSigno && this.sigevValue == other.sigevValue && this.sigevNotifyThreadId == other.sigevNotifyThreadId
    }
}

public data class CAnonymousElf32AuxvUnion(public var aVal: CInt = 0) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf32_auxv_union").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousElf32AuxvUnion): Boolean {
        return this.aVal == other.aVal
    }

    public override fun hashCode(): Int {
        var state = 0
        error("traits")
        return state
    }
}

public data class CAnonymousIfiEpoch(public var tt: TimeT = 0L, public var ph: ULong = 0uL) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_epoch").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfiEpoch): Boolean {
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

public data class CAnonymousIfiLastchange(public var tv: Timeval = Timeval(), public var ph: CAnonymousPh = CAnonymousPh()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_lastchange").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfiLastchange): Boolean {
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

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruBuffer: IfreqBuffer = IfreqBuffer(),
    public var ifruFlags: ShortArray = ShortArray(2),
    public var ifruIndex: CShort = 0,
    public var ifruJid: CInt = 0,
    public var ifruMetric: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruPhys: CInt = 0,
    public var ifruMedia: CInt = 0,
    public var ifruData: CaddrT = null,
    public var ifruCap: IntArray = IntArray(2),
    public var ifruFib: CUint = 0u,
    public var ifruVlanPcp: CUchar = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruBuffer != other.ifruBuffer) return false
        if (!this.ifruFlags.contentEquals(other.ifruFlags)) return false
        if (this.ifruIndex != other.ifruIndex) return false
        if (this.ifruJid != other.ifruJid) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFib != other.ifruFib) return false
        if (this.ifruVlanPcp != other.ifruVlanPcp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruBuffer.hashCode()
        result = 31 * result + this.ifruFlags.contentHashCode()
        result = 31 * result + this.ifruIndex.hashCode()
        result = 31 * result + this.ifruJid.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFib.hashCode()
        result = 31 * result + this.ifruVlanPcp.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean {
        return this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruBuffer == other.ifruBuffer && this.ifruFlags == other.ifruFlags && this.ifruIndex == other.ifruIndex && this.ifruJid == other.ifruJid && this.ifruMetric == other.ifruMetric && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruData == other.ifruData && this.ifruCap == other.ifruCap && this.ifruFib == other.ifruFib && this.ifruVlanPcp == other.ifruVlanPcp
    }
}

public data class CAnonymousIfcIfcu(public var ifcuBuf: CaddrT = null, public var ifcuReq: Ifreq? = null) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfcIfcu): Boolean {
        return this.ifcuBuf == other.ifcuBuf && this.ifcuReq == other.ifcuReq
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + (this.ifcuBuf).hashCode()
        state = 31 * state + (this.ifcuReq).hashCode()
        return state
    }
}

public data class UcontextT(
    public var ucSigmask: SigsetT = SigsetT(),
    public var ucMcontext: McontextT = McontextT(),
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var ucFlags: CInt = 0,
    public var spare: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucFlags != other.ucFlags) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSigmask.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucFlags.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }
}

public data class Xinpgen(
    public var xigLen: KsizeT = 0uL,
    public var xigCount: UInt = 0u,
    public var xigSpare32: UInt = 0u,
    public var xigGen: InpGenT = 0uL,
    public var xigSogen: SoGenT = 0uL,
    public var xigSpare64: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xinpgen) return false
        if (this.xigLen != other.xigLen) return false
        if (this.xigCount != other.xigCount) return false
        if (this.xigSpare32 != other.xigSpare32) return false
        if (this.xigGen != other.xigGen) return false
        if (this.xigSogen != other.xigSogen) return false
        if (!this.xigSpare64.contentEquals(other.xigSpare64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xigLen.hashCode()
        result = 31 * result + this.xigCount.hashCode()
        result = 31 * result + this.xigSpare32.hashCode()
        result = 31 * result + this.xigGen.hashCode()
        result = 31 * result + this.xigSogen.hashCode()
        result = 31 * result + this.xigSpare64.contentHashCode()
        return result
    }
}

public data class InAddr4in6(public var ia46Pad32: UIntArray = UIntArray(3), public var ia46Addr4: InAddr = InAddr()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InAddr4in6) return false
        if (!this.ia46Pad32.contentEquals(other.ia46Pad32)) return false
        if (this.ia46Addr4 != other.ia46Addr4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ia46Pad32.contentHashCode()
        result = 31 * result + this.ia46Addr4.hashCode()
        return result
    }
}

public data class InDependaddr(public var id46Addr: InAddr4in6 = InAddr4in6(), public var id6Addr: In6Addr = In6Addr()) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "in_dependaddr").finishNonExhaustive()
    }
}

public data class InEndpoints(
    public var ieFport: UShort = 0u,
    public var ieLport: UShort = 0u,
    public var ieDependfaddr: InDependaddr = InDependaddr(),
    public var ieDependladdr: InDependaddr = InDependaddr(),
    public var ie6Zoneid: UInt = 0u,
)

public data class InConninfo(
    public var incFlags: UByte = 0u,
    public var incLen: UByte = 0u,
    public var incFibnum: UShort = 0u,
    public var incIe: InEndpoints = InEndpoints(),
)

public class XktlsSessionOnedir(
    // Note: this field is called `gen` in upstream FreeBSD, but `gen` is
    // reserved keyword in Rust since the 2024 Edition, hence `gennum`.
    public var gennum: ULong = 0uL,
    public var rsrv1: ULongArray = ULongArray(8),
    public var rsrv2: UIntArray = UIntArray(8),
    public var iv: UByteArray = UByteArray(32),
    public var cipherAlgorithm: Int = 0,
    public var authAlgorithm: Int = 0,
    public var cipherKeyLen: UShort = 0u,
    public var ivLen: UShort = 0u,
    public var authKeyLen: UShort = 0u,
    public var maxFrameLen: UShort = 0u,
    public var tlsVmajor: UByte = 0u,
    public var tlsVminor: UByte = 0u,
    public var tlsHlen: UByte = 0u,
    public var tlsTlen: UByte = 0u,
    public var tlsBs: UByte = 0u,
    public var flags: UByte = 0u,
    public var drvStLen: UShort = 0u,
    public var ifnet: UByteArray = UByteArray(16),
)

public data class XktlsSession(
    public var tsz: UInt = 0u,
    public var fsz: UInt = 0u,
    public var inpGencnt: ULong = 0uL,
    public var soPcb: KvaddrT = 0uL,
    public var coninf: InConninfo = InConninfo(),
    public var rxVlanId: CUshort = 0u,
    public var rcv: XktlsSessionOnedir = XktlsSessionOnedir(),
    public var snd: XktlsSessionOnedir = XktlsSessionOnedir(),
)
