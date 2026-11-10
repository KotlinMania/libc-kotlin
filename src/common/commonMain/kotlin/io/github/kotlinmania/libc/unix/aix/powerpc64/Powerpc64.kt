// port-lint: source unix/aix/powerpc64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.BlkcntT
import io.github.kotlinmania.libc.unix.aix.BlksizeT
import io.github.kotlinmania.libc.unix.aix.CaddrT
import io.github.kotlinmania.libc.unix.aix.DevT
import io.github.kotlinmania.libc.unix.aix.FsblkcntT
import io.github.kotlinmania.libc.unix.aix.FsfilcntT
import io.github.kotlinmania.libc.unix.aix.Fsid64T
import io.github.kotlinmania.libc.unix.aix.InoT
import io.github.kotlinmania.libc.unix.aix.IpcPerm
import io.github.kotlinmania.libc.unix.aix.ModeT
import io.github.kotlinmania.libc.unix.aix.NlinkT
import io.github.kotlinmania.libc.unix.aix.OffT
import io.github.kotlinmania.libc.unix.aix.Sigevent
import io.github.kotlinmania.libc.unix.aix.StTimespec
import io.github.kotlinmania.libc.unix.aix.StackT
import io.github.kotlinmania.libc.unix.aix.TimeT
import io.github.kotlinmania.libc.unix.aix.UioRw

public fun interface FileopsTFoRwCallback {
    public operator fun invoke(file: COpaquePointer?, rw: UioRw, io: COpaquePointer?, ext: CLong, secattr: COpaquePointer?): CInt
}

public fun interface FileopsTFoIoctlCallback {
    public operator fun invoke(file: COpaquePointer?, a: CLong, b: CaddrT, c: CLong, d: CLong): CInt
}

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FileopsTFoSelectCallback {
    public operator fun invoke(file: COpaquePointer?, a: CInt, b: COpaquePointer?, c: FnCallback): CInt
}

public fun interface FileopsTFoCloseCallback {
    public operator fun invoke(file: COpaquePointer?): CInt
}

public fun interface FileopsTFoFstatCallback {
    public operator fun invoke(file: COpaquePointer?, sstat: COpaquePointer?): CInt
}

// Define lockDataInstrumented as an empty enum
public class LockDataInstrumented(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public data class SigsetT(public var ssSet: ULongArray = ULongArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.ssSet.contentEquals(other.ssSet)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ssSet.contentHashCode()
    }
}

public data class FdSet(public var fdsBits: LongArray = LongArray(1024)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fdsBits.contentHashCode()
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lSysid: CUint = 0u,
    public var lPid: PidT = 0,
    public var lVfs: CInt = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
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
    public var fFstr: UByteArray = UByteArray(32),
    public var fFiller: ULongArray = ULongArray(16),
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
        if (!this.fFstr.contentEquals(other.fFstr)) return false
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
        result = 31 * result + this.fFstr.contentHashCode()
        result = 31 * result + this.fFiller.contentHashCode()
        return result
    }
}

public data class PthreadRwlockT(public var rwWord: LongArray = LongArray(10)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.rwWord.contentEquals(other.rwWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.rwWord.contentHashCode()
    }
}

public data class PthreadCondT(public var cvWord: LongArray = LongArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.cvWord.contentEquals(other.cvWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.cvWord.contentHashCode()
    }
}

public data class PthreadMutexT(public var mtWord: LongArray = LongArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.mtWord.contentEquals(other.mtWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.mtWord.contentHashCode()
    }
}

public data class PthreadOnceT(public var onWord: LongArray = LongArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadOnceT) return false
        if (!this.onWord.contentEquals(other.onWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.onWord.contentHashCode()
    }
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0,
    public var stFlag: CUshort = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSsize: CInt = 0,
    public var stAtim: StTimespec = StTimespec(),
    public var stMtim: StTimespec = StTimespec(),
    public var stCtim: StTimespec = StTimespec(),
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stVfstype: CInt = 0,
    public var stVfs: CUint = 0u,
    public var stType: CUint = 0u,
    public var stGen: CUint = 0u,
    public var stReserved: UIntArray = UIntArray(9),
    public var stPadtoLl: CUint = 0u,
    public var stSize: OffT = 0L,
)

public class Statfs(
    public var fVersion: CInt = 0,
    public var fType: CInt = 0,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fFsid: Fsid64T = Fsid64T(),
    public var fVfstype: CInt = 0,
    public var fFsize: CUlong = 0uL,
    public var fVfsnumber: CInt = 0,
    public var fVfsoff: CInt = 0,
    public var fVfslen: CInt = 0,
    public var fVfsvers: CInt = 0,
    public var fFname: UByteArray = UByteArray(32),
    public var fFpack: UByteArray = UByteArray(32),
    public var fNameMax: CInt = 0,
)

public data class Aiocb(
    public var aioLioOpcode: CInt = 0,
    public var aioFildes: CInt = 0,
    public var aioWord1: CInt = 0,
    public var aioOffset: OffT = 0L,
    public var aioBuf: COpaquePointer? = null,
    public var aioReturn: SsizeT = 0L,
    public var aioErrno: CInt = 0,
    public var aioNbytes: SizeT = 0uL,
    public var aioReqprio: CInt = 0,
    public var aioSigevent: Sigevent = Sigevent(),
    public var aioWord2: CInt = 0,
    public var aioFp: CInt = 0,
    public var aioHandle: Aiocb? = null,
    public var aioReserved: UIntArray = UIntArray(2),
    public var aioSigevTid: CLong = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioWord1 != other.aioWord1) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioReturn != other.aioReturn) return false
        if (this.aioErrno != other.aioErrno) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.aioWord2 != other.aioWord2) return false
        if (this.aioFp != other.aioFp) return false
        if (this.aioHandle != other.aioHandle) return false
        if (!this.aioReserved.contentEquals(other.aioReserved)) return false
        if (this.aioSigevTid != other.aioSigevTid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioFildes.hashCode()
        result = 31 * result + this.aioWord1.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioReturn.hashCode()
        result = 31 * result + this.aioErrno.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.aioWord2.hashCode()
        result = 31 * result + this.aioFp.hashCode()
        result = 31 * result + this.aioHandle.hashCode()
        result = 31 * result + this.aioReserved.contentHashCode()
        result = 31 * result + this.aioSigevTid.hashCode()
        return result
    }
}

public data class VmxregT(public var v: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmxregT) return false
        if (!this.v.contentEquals(other.v)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.v.contentHashCode()
    }
}

public data class VmxContextT(
    public var vr: List<VmxregT> = List(32) { VmxregT() },
    public var pad1: UIntArray = UIntArray(3),
    public var vscr: CUint = 0u,
    public var vrsave: CUint = 0u,
    public var pad2: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmxContextT) return false
        if (this.vr != other.vr) return false
        if (!this.pad1.contentEquals(other.pad1)) return false
        if (this.vscr != other.vscr) return false
        if (this.vrsave != other.vrsave) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vr.hashCode()
        result = 31 * result + this.pad1.contentHashCode()
        result = 31 * result + this.vscr.hashCode()
        result = 31 * result + this.vrsave.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }
}

public data class VsxContextT(public var vsrDw1: ULongArray = ULongArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VsxContextT) return false
        if (!this.vsrDw1.contentEquals(other.vsrDw1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.vsrDw1.contentHashCode()
    }
}

public class TmContextT(
    public var vmx: VmxContextT = VmxContextT(),
    public var vsx: VsxContextT = VsxContextT(),
    public var gpr: ULongArray = ULongArray(32),
    public var lr: CUlonglong = 0uL,
    public var ctr: CUlonglong = 0uL,
    public var cr: CUint = 0u,
    public var xer: CUint = 0u,
    public var amr: CUlonglong = 0uL,
    public var texasr: CUlonglong = 0uL,
    public var tfiar: CUlonglong = 0uL,
    public var tfhar: CUlonglong = 0uL,
    public var ppr: CUlonglong = 0uL,
    public var dscr: CUlonglong = 0uL,
    public var tar: CUlonglong = 0uL,
    public var fpscr: CUint = 0u,
    public var fpscrx: CUint = 0u,
    public var fpr: List<FpregT> = List(32) { FpregT() },
    public var tmcontext: CChar = 0u,
    public var tmstate: CChar = 0u,
    public var prevowner: CChar = 0u,
    public var pad: UByteArray = UByteArray(5),
)

public data class Context64(
    public var gpr: ULongArray = ULongArray(32),
    public var msr: CUlonglong = 0uL,
    public var iar: CUlonglong = 0uL,
    public var lr: CUlonglong = 0uL,
    public var ctr: CUlonglong = 0uL,
    public var cr: CUint = 0u,
    public var xer: CUint = 0u,
    public var fpscr: CUint = 0u,
    public var fpscrx: CUint = 0u,
    public var except: ULongArray = ULongArray(1),
    public var fpr: List<FpregT> = List(32) { FpregT() },
    public var fpeu: CChar = 0u,
    public var fpinfo: CChar = 0u,
    public var fpscr2431: CChar = 0u,
    public var pad: UByteArray = UByteArray(1),
    public var excpType: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Context64) return false
        if (!this.gpr.contentEquals(other.gpr)) return false
        if (this.msr != other.msr) return false
        if (this.iar != other.iar) return false
        if (this.lr != other.lr) return false
        if (this.ctr != other.ctr) return false
        if (this.cr != other.cr) return false
        if (this.xer != other.xer) return false
        if (this.fpscr != other.fpscr) return false
        if (this.fpscrx != other.fpscrx) return false
        if (!this.except.contentEquals(other.except)) return false
        if (this.fpr != other.fpr) return false
        if (this.fpeu != other.fpeu) return false
        if (this.fpinfo != other.fpinfo) return false
        if (this.fpscr2431 != other.fpscr2431) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.excpType != other.excpType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpr.contentHashCode()
        result = 31 * result + this.msr.hashCode()
        result = 31 * result + this.iar.hashCode()
        result = 31 * result + this.lr.hashCode()
        result = 31 * result + this.ctr.hashCode()
        result = 31 * result + this.cr.hashCode()
        result = 31 * result + this.xer.hashCode()
        result = 31 * result + this.fpscr.hashCode()
        result = 31 * result + this.fpscrx.hashCode()
        result = 31 * result + this.except.contentHashCode()
        result = 31 * result + this.fpr.hashCode()
        result = 31 * result + this.fpeu.hashCode()
        result = 31 * result + this.fpinfo.hashCode()
        result = 31 * result + this.fpscr2431.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.excpType.hashCode()
        return result
    }
}

public data class McontextT(public var jmpContext: Context64 = Context64())

public data class ExtctxT(
    public var flags: CUint = 0u,
    public var rsvd1: UIntArray = UIntArray(3),
    public var vmx: VmxContextT = VmxContextT(),
    public var ukeys: UIntArray = UIntArray(2),
    public var vsx: VsxContextT = VsxContextT(),
    public var tm: TmContextT = TmContextT(),
    public var reserved: UByteArray = UByteArray(1860),
    public var extctxMagic: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtctxT) return false
        if (this.flags != other.flags) return false
        if (!this.rsvd1.contentEquals(other.rsvd1)) return false
        if (this.vmx != other.vmx) return false
        if (!this.ukeys.contentEquals(other.ukeys)) return false
        if (this.vsx != other.vsx) return false
        if (this.tm != other.tm) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.extctxMagic != other.extctxMagic) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.rsvd1.contentHashCode()
        result = 31 * result + this.vmx.hashCode()
        result = 31 * result + this.ukeys.contentHashCode()
        result = 31 * result + this.vsx.hashCode()
        result = 31 * result + this.tm.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.extctxMagic.hashCode()
        return result
    }
}

public data class UcontextT(
    public var scOnstack: CInt = 0,
    public var ucSigmask: SigsetT = SigsetT(),
    public var scUerror: CInt = 0,
    public var ucMcontext: McontextT = McontextT(),
    public var ucLink: UcontextT? = null,
    public var ucStack: StackT = StackT(),
    public var extctx: ExtctxT? = null,
    public var extctxMagic: CInt = 0,
    public var pad: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.scOnstack != other.scOnstack) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.scUerror != other.scUerror) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.extctx != other.extctx) return false
        if (this.extctxMagic != other.extctxMagic) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scOnstack.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.scUerror.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.extctx.hashCode()
        result = 31 * result + this.extctxMagic.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class Utmpx(
    public var utUser: UByteArray = UByteArray(256),
    public var utId: UByteArray = UByteArray(14),
    public var utLine: UByteArray = UByteArray(64),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utHost: UByteArray = UByteArray(256),
    public var dblWordPad: CInt = 0,
    public var reservedA: IntArray = IntArray(2),
    public var reservedV: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.dblWordPad != other.dblWordPad) return false
        if (!this.reservedA.contentEquals(other.reservedA)) return false
        if (!this.reservedV.contentEquals(other.reservedV)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.dblWordPad.hashCode()
        result = 31 * result + this.reservedA.contentHashCode()
        result = 31 * result + this.reservedV.contentHashCode()
        return result
    }
}

public data class PthreadSpinlockT(public var spWord: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadSpinlockT) return false
        if (!this.spWord.contentEquals(other.spWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.spWord.contentHashCode()
    }
}

public data class PthreadBarrierT(public var brWord: LongArray = LongArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.brWord.contentEquals(other.brWord)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.brWord.contentHashCode()
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgFirst: CUint = 0u,
    public var msgLast: CUint = 0u,
    public var msgCbytes: CUint = 0u,
    public var msgQnum: CUint = 0u,
    public var msgQbytes: CUlong = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
    public var msgRwait: CInt = 0,
    public var msgWwait: CInt = 0,
    public var msgReqevents: CUshort = 0u,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siAddr: COpaquePointer? = null,
    public var siBand: CLong = 0L,
    public var siValue: Sigval = Sigval(),
    public var siFlags: CInt = 0,
    public var pad: IntArray = IntArray(3),
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
        if (this.siBand != other.siBand) return false
        if (this.siValue != other.siValue) return false
        if (this.siFlags != other.siFlags) return false
        if (!this.pad.contentEquals(other.pad)) return false
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
        result = 31 * result + this.siBand.hashCode()
        result = 31 * result + this.siValue.hashCode()
        result = 31 * result + this.siFlags.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class PollfdExt(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
    public var data: PollfdExtU = PollfdExtU(),
)

public data class KernelSimpleLock(public var slock: CLong = 0L, public var slockp: LockDataInstrumented? = null)

public data class FileopsT(
    public var foRw: FileopsTFoRwCallback? = null,
    public var foIoctl: FileopsTFoIoctlCallback? = null,
    public var foSelect: FileopsTFoSelectCallback? = null,
    public var foClose: FileopsTFoCloseCallback? = null,
    public var foFstat: FileopsTFoFstatCallback? = null,
)

public data class File(
    public var fFlag: CLong = 0L,
    public var fCount: CInt = 0,
    public var fOptions: CShort = 0,
    public var fType: CShort = 0,
    // Should be pointer to 'vnode'
    public var fData: COpaquePointer? = null,
    public var fOffset: CLonglong = 0L,
    public var fDirOff: CLong = 0L,
    // Should be pointer to 'cred'
    public var fCred: COpaquePointer? = null,
    public var fLock: KernelSimpleLock = KernelSimpleLock(),
    public var fOffsetLock: KernelSimpleLock = KernelSimpleLock(),
    public var fVinfo: CaddrT = null,
    public var fOps: FileopsT? = null,
    public var fParentp: CaddrT = null,
    public var fFnamep: CaddrT = null,
    public var fFdata: UByteArray = UByteArray(160),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is File) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fCount != other.fCount) return false
        if (this.fOptions != other.fOptions) return false
        if (this.fType != other.fType) return false
        if (this.fData != other.fData) return false
        if (this.fOffset != other.fOffset) return false
        if (this.fDirOff != other.fDirOff) return false
        if (this.fCred != other.fCred) return false
        if (this.fLock != other.fLock) return false
        if (this.fOffsetLock != other.fOffsetLock) return false
        if (this.fVinfo != other.fVinfo) return false
        if (this.fOps != other.fOps) return false
        if (this.fParentp != other.fParentp) return false
        if (this.fFnamep != other.fFnamep) return false
        if (!this.fFdata.contentEquals(other.fFdata)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlag.hashCode()
        result = 31 * result + this.fCount.hashCode()
        result = 31 * result + this.fOptions.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fData.hashCode()
        result = 31 * result + this.fOffset.hashCode()
        result = 31 * result + this.fDirOff.hashCode()
        result = 31 * result + this.fCred.hashCode()
        result = 31 * result + this.fLock.hashCode()
        result = 31 * result + this.fOffsetLock.hashCode()
        result = 31 * result + this.fVinfo.hashCode()
        result = 31 * result + this.fOps.hashCode()
        result = 31 * result + this.fParentp.hashCode()
        result = 31 * result + this.fFnamep.hashCode()
        result = 31 * result + this.fFdata.contentHashCode()
        return result
    }
}

public data class LdInfoFile(
    public var ldinfoFd: CInt = 0,
    public var ldinfoFp: File? = null,
    public var coreOffset: CLong = 0L,
)

public data class LdInfo(
    public var ldinfoNext: CUint = 0u,
    public var ldinfoFlags: CUint = 0u,
    public var file: LdInfoFile = LdInfoFile(),
    public var ldinfoTextorg: COpaquePointer? = null,
    public var ldinfoTextsize: CUlong = 0uL,
    public var ldinfoDataorg: COpaquePointer? = null,
    public var ldinfoDatasize: CUlong = 0uL,
    public var ldinfoFilename: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdInfo) return false
        if (this.ldinfoNext != other.ldinfoNext) return false
        if (this.ldinfoFlags != other.ldinfoFlags) return false
        if (this.file != other.file) return false
        if (this.ldinfoTextorg != other.ldinfoTextorg) return false
        if (this.ldinfoTextsize != other.ldinfoTextsize) return false
        if (this.ldinfoDataorg != other.ldinfoDataorg) return false
        if (this.ldinfoDatasize != other.ldinfoDatasize) return false
        if (!this.ldinfoFilename.contentEquals(other.ldinfoFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldinfoNext.hashCode()
        result = 31 * result + this.ldinfoFlags.hashCode()
        result = 31 * result + this.file.hashCode()
        result = 31 * result + this.ldinfoTextorg.hashCode()
        result = 31 * result + this.ldinfoTextsize.hashCode()
        result = 31 * result + this.ldinfoDataorg.hashCode()
        result = 31 * result + this.ldinfoDatasize.hashCode()
        result = 31 * result + this.ldinfoFilename.contentHashCode()
        return result
    }
}

public data class PollfdExtU(
    public var addr: COpaquePointer? = null,
    public var data32: UInt = 0u,
    public var data: ULong = 0uL,
) {
    public fun eq(other: PollfdExtU): Boolean {
        return this.addr == other.addr && this.data32 == other.data32 && this.data == other.data
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.addr).hashCode()
            state = 31 * state + (this.data).hashCode()
            state = 31 * state + (this.data32).hashCode()
        }
        return state
    }
}

public data class FpregT(public var d: CDouble = 0.0) {
    public fun eq(other: FpregT): Boolean {
        return this.d == other.d
    }

    public override fun hashCode(): Int {
        var state = 0
        val d: ULong = this.d.toRawBits().toULong()
        state = 31 * state + (d).hashCode()
        return state
    }
}

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mtWord = longArrayOf(0L, 2L, 0L, 0L, 0L, 0L, 0L, 0L))

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(cvWord = longArrayOf(0L, 0L, 0L, 0L, 2L, 0L))

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwWord = longArrayOf(2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L))

public val PTHREAD_ONCE_INIT: PthreadOnceT = PthreadOnceT(onWord = longArrayOf(0L, 0L, 0L, 0L, 0L, 2L, 0L, 0L, 0L))

public val RLIM_INFINITY: CUlong = 0x7fffffffffffffffuL

public expect fun getsystemcfg(label: CInt): CUlong
