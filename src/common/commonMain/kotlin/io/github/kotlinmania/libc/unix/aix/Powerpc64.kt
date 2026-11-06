// port-lint: source unix/aix/powerpc64.rs
package io.github.kotlinmania.libc.unix.aix

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
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT

public fun interface FileopsTFoRwCallback {
    public operator fun invoke(file: File?, rw: UioRw, io: COpaquePointer?, ext: CLong, secattr: COpaquePointer?): CInt
}

public fun interface FileopsTFoIoctlCallback {
    public operator fun invoke(file: File?, a: CLong, b: CaddrT, c: CLong, d: CLong): CInt
}

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FileopsTFoSelectCallback {
    public operator fun invoke(file: File?, a: CInt, b: CUshort?, c: FnCallback): CInt
}

public fun interface FileopsTFoCloseCallback {
    public operator fun invoke(file: File?): CInt
}

public fun interface FileopsTFoFstatCallback {
    public operator fun invoke(file: File?, sstat: Stat?): CInt
}

// Define lockDataInstrumented as an empty enum
public sealed class LockDataInstrumented {
}

public open class SigsetT(public var ssSet: List<CUlong>)

public open class FdSet(public var fdsBits: List<CLong>)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lSysid: CUint,
    public var lPid: PidT,
    public var lVfs: CInt,
    public var lStart: OffT,
    public var lLen: OffT,
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
    public var fBasetype: List<CChar>,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fFstr: List<CChar>,
    public var fFiller: List<CUlong>,
)

public open class PthreadRwlockT(public var rwWord: List<CLong>)

public open class PthreadCondT(public var cvWord: List<CLong>)

public open class PthreadMutexT(public var mtWord: List<CLong>)

public open class PthreadOnceT(public var onWord: List<CLong>)

public open class Stat(
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
    public var stPadtoLl: CUint,
    public var stSize: OffT,
)

public open class Statfs(
    public var fVersion: CInt,
    public var fType: CInt,
    public var fBsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsblkcntT,
    public var fFfree: FsblkcntT,
    public var fFsid: Fsid64T,
    public var fVfstype: CInt,
    public var fFsize: CUlong,
    public var fVfsnumber: CInt,
    public var fVfsoff: CInt,
    public var fVfslen: CInt,
    public var fVfsvers: CInt,
    public var fFname: List<CChar>,
    public var fFpack: List<CChar>,
    public var fNameMax: CInt,
)

public open class Aiocb(
    public var aioLioOpcode: CInt,
    public var aioFildes: CInt,
    public var aioWord1: CInt,
    public var aioOffset: OffT,
    public var aioBuf: COpaquePointer?,
    public var aioReturn: SsizeT,
    public var aioErrno: CInt,
    public var aioNbytes: SizeT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioWord2: CInt,
    public var aioFp: CInt,
    public var aioHandle: Aiocb?,
    public var aioReserved: List<CUint>,
    public var aioSigevTid: CLong,
)

public open class VmxregT(public var v: List<CUint>)

public open class VmxContextT(
    public var vr: List<VmxregT>,
    public var pad1: List<CUint>,
    public var vscr: CUint,
    public var vrsave: CUint,
    public var pad2: List<CUint>,
)

public open class VsxContextT(public var vsrDw1: List<CUlonglong>)

public open class TmContextT(
    public var vmx: VmxContextT,
    public var vsx: VsxContextT,
    public var gpr: List<CUlonglong>,
    public var lr: CUlonglong,
    public var ctr: CUlonglong,
    public var cr: CUint,
    public var xer: CUint,
    public var amr: CUlonglong,
    public var texasr: CUlonglong,
    public var tfiar: CUlonglong,
    public var tfhar: CUlonglong,
    public var ppr: CUlonglong,
    public var dscr: CUlonglong,
    public var tar: CUlonglong,
    public var fpscr: CUint,
    public var fpscrx: CUint,
    public var fpr: List<FpregT>,
    public var tmcontext: CChar,
    public var tmstate: CChar,
    public var prevowner: CChar,
    public var pad: List<CChar>,
)

public open class Context64(
    public var gpr: List<CUlonglong>,
    public var msr: CUlonglong,
    public var iar: CUlonglong,
    public var lr: CUlonglong,
    public var ctr: CUlonglong,
    public var cr: CUint,
    public var xer: CUint,
    public var fpscr: CUint,
    public var fpscrx: CUint,
    public var except: List<CUlonglong>,
    public var fpr: List<FpregT>,
    public var fpeu: CChar,
    public var fpinfo: CChar,
    public var fpscr2431: CChar,
    public var pad: List<CChar>,
    public var excpType: CInt,
)

public open class McontextT(public var jmpContext: Context64)

public open class ExtctxT(
    public var flags: CUint,
    public var rsvd1: List<CUint>,
    public var vmx: VmxContextT,
    public var ukeys: List<CUint>,
    public var vsx: VsxContextT,
    public var tm: TmContextT,
    public var reserved: List<CChar>,
    public var extctxMagic: CInt,
)

public open class UcontextT(
    public var scOnstack: CInt,
    public var ucSigmask: SigsetT,
    public var scUerror: CInt,
    public var ucMcontext: McontextT,
    public var ucLink: UcontextT?,
    public var ucStack: StackT,
    public var extctx: ExtctxT?,
    public var extctxMagic: CInt,
    public var pad: List<CInt>,
)

public open class Utmpx(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utTv: Timeval,
    public var utHost: List<CChar>,
    public var dblWordPad: CInt,
    public var reservedA: List<CInt>,
    public var reservedV: List<CInt>,
)

public open class PthreadSpinlockT(public var spWord: List<CLong>)

public open class PthreadBarrierT(public var brWord: List<CLong>)

public open class MsqidDs(
    public var msgPerm: IpcPerm,
    public var msgFirst: CUint,
    public var msgLast: CUint,
    public var msgCbytes: CUint,
    public var msgQnum: CUint,
    public var msgQbytes: CUlong,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
    public var msgRwait: CInt,
    public var msgWwait: CInt,
    public var msgReqevents: CUshort,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siAddr: COpaquePointer?,
    public var siBand: CLong,
    public var siValue: Sigval,
    public var siFlags: CInt,
    public var pad: List<CInt>,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): Sigval {
        return this.siValue
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

public open class PollfdExt(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
    public var data: PollfdExtU,
)

public open class KernelSimpleLock(public var slock: CLong? = null, public var slockp: LockDataInstrumented?? = null)

public open class FileopsT(
    public var foRw: FileopsTFoRwCallback?,
    public var foIoctl: FileopsTFoIoctlCallback?,
    public var foSelect: FileopsTFoSelectCallback?,
    public var foClose: FileopsTFoCloseCallback?,
    public var foFstat: FileopsTFoFstatCallback?,
)

public open class File(
    public var fFlag: CLong,
    public var fCount: CInt,
    public var fOptions: CShort,
    public var fType: CShort,
    // Should be pointer to 'vnode'
    public var fData: COpaquePointer?,
    public var fOffset: CLonglong,
    public var fDirOff: CLong,
    // Should be pointer to 'cred'
    public var fCred: COpaquePointer?,
    public var fLock: KernelSimpleLock,
    public var fOffsetLock: KernelSimpleLock,
    public var fVinfo: CaddrT,
    public var fOps: FileopsT?,
    public var fParentp: CaddrT,
    public var fFnamep: CaddrT,
    public var fFdata: List<CChar>,
)

public open class LdInfoFile(
    public var ldinfoFd: CInt? = null,
    public var ldinfoFp: File?? = null,
    public var coreOffset: CLong? = null,
)

public open class LdInfo(
    public var ldinfoNext: CUint,
    public var ldinfoFlags: CUint,
    public var file: LdInfoFile,
    public var ldinfoTextorg: COpaquePointer?,
    public var ldinfoTextsize: CUlong,
    public var ldinfoDataorg: COpaquePointer?,
    public var ldinfoDatasize: CUlong,
    public var ldinfoFilename: List<CChar>,
)

public open class PollfdExtU(
    public var addr: COpaquePointer?? = null,
    public var data32: UInt? = null,
    public var data: ULong? = null,
) {
    public open fun eq(other: PollfdExtU): Boolean {
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

public open class FpregT(public var d: CDouble) {
    public open fun eq(other: FpregT): Boolean {
        return this.d == other.d
    }

    public override fun hashCode(): Int {
        var state = 0
        val d: ULong = this.d.toBits()
        state = 31 * state + (d).hashCode()
        return state
    }
}

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(mtWord = listOf(0u, 2u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(cvWord = listOf(0u, 0u, 0u, 0u, 2u, 0u))

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(rwWord = listOf(2u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u, 0u))

public val PTHREAD_ONCE_INIT: PthreadOnceT = Any(onWord = listOf(0, 0, 0, 0, 0, 2, 0, 0, 0))

public val RLIM_INFINITY: CUlong = 0x7fffffffffffffffuL

public fun getsystemcfg(label: CInt): CUlong {
    return LibcDynamicFfi.invoke("getsystemcfg", -1, longArrayOf(label.toLong())).toULong()
}
