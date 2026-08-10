// port-lint: source unix/aix/powerpc64.rs
package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.unix.Sigval

import io.github.kotlinmania.libc.*

// Opaque type — C empty enum used as an opaque pointer target.
public class LockDataInstrumented

public data class SigsetT(
    val ssSet: ULongArray,
)

public data class FdSet(
    val fdsBits: LongArray,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lSysid: CUInt,
    val lPid: PidT,
    val lVfs: CInt,
    val lStart: OffT,
    val lLen: OffT,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fBasetype: ByteArray,
    val fFlag: CULong,
    val fNamemax: CULong,
    val fFstr: ByteArray,
    val fFiller: ULongArray,
)

public data class PthreadRwlockT(
    val rwWord: LongArray,
)

public data class PthreadCondT(
    val cvWord: LongArray,
)

public data class PthreadMutexT(
    val mtWord: LongArray,
)

public data class PthreadOnceT(
    val onWord: LongArray,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stFlag: CUShort,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSsize: CInt,
    val stAtim: StTimespec,
    val stMtim: StTimespec,
    val stCtim: StTimespec,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stVfstype: CInt,
    val stVfs: CUInt,
    val stType: CUInt,
    val stGen: CUInt,
    val stPadtoLl: CUInt,
    val stSize: OffT,
)

public data class Statfs(
    val fVersion: CInt,
    val fType: CInt,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsblkcntT,
    val fFfree: FsblkcntT,
    val fFsid: Fsid64T,
    val fVfstype: CInt,
    val fFsize: CULong,
    val fVfsnumber: CInt,
    val fVfsoff: CInt,
    val fVfslen: CInt,
    val fVfsvers: CInt,
    val fFname: ByteArray,
    val fFpack: ByteArray,
    val fNameMax: CInt,
)

public data class Aiocb(
    val aioLioOpcode: CInt,
    val aioFildes: CInt,
    val aioWord1: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioReturn: SsizeT,
    val aioErrno: CInt,
    val aioNbytes: ULong,
    val aioReqprio: CInt,
    val aioSigevent: Sigevent,
    val aioWord2: CInt,
    val aioFp: CInt,
    val aioHandle: Aiocb?,
    val aioSigevTid: CLong,
)

public data class VmxregT(
    val v: UIntArray,
)

public data class VmxContextT(
    val vr: List<VmxregT>,
    val pad1: UIntArray,
    val vscr: CUInt,
    val vrsave: CUInt,
    val pad2: UIntArray,
)

public data class VsxContextT(
    val vsrDw1: ULongArray,
)

public data class TmContextT(
    val vmx: VmxContextT,
    val vsx: VsxContextT,
    val gpr: ULongArray,
    val lr: CULongLong,
    val ctr: CULongLong,
    val cr: CUInt,
    val xer: CUInt,
    val amr: CULongLong,
    val texasr: CULongLong,
    val tfiar: CULongLong,
    val tfhar: CULongLong,
    val ppr: CULongLong,
    val dscr: CULongLong,
    val tar: CULongLong,
    val fpscr: CUInt,
    val fpscrx: CUInt,
    val fpr: List<FpregT>,
    val tmcontext: CChar,
    val tmstate: CChar,
    val prevowner: CChar,
    val pad: ByteArray,
)

public data class Context64(
    val gpr: ULongArray,
    val msr: CULongLong,
    val iar: CULongLong,
    val lr: CULongLong,
    val ctr: CULongLong,
    val cr: CUInt,
    val xer: CUInt,
    val fpscr: CUInt,
    val fpscrx: CUInt,
    val except: ULongArray,
    val fpr: List<FpregT>,
    val fpeu: CChar,
    val fpinfo: CChar,
    val fpscr2431: CChar,
    val pad: ByteArray,
    val excpType: CInt,
)

public data class McontextT(
    val jmpContext: Context64,
)

public data class ExtctxT(
    val flags: CUInt,
    val rsvd1: UIntArray,
    val vmx: VmxContextT,
    val ukeys: UIntArray,
    val vsx: VsxContextT,
    val tm: TmContextT,
    val extctxMagic: CInt,
)

public data class UcontextT(
    val scOnstack: CInt,
    val ucSigmask: SigsetT,
    val scUerror: CInt,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val extctx: ExtctxT?,
    val extctxMagic: CInt,
    val pad: IntArray,
)

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: PidT,
    val utType: CShort,
    val utTv: Timeval,
    val utHost: ByteArray,
    val dblWordPad: CInt,
    val reservedA: IntArray,
    val reservedV: IntArray,
)

public data class PthreadSpinlockT(
    val spWord: LongArray,
)

public data class PthreadBarrierT(
    val brWord: LongArray,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgFirst: CUInt,
    val msgLast: CUInt,
    val msgCbytes: CUInt,
    val msgQnum: CUInt,
    val msgQbytes: CULong,
    val msgLspid: PidT,
    val msgLrpid: PidT,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgRwait: CInt,
    val msgWwait: CInt,
    val msgReqevents: CUShort,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siStatus: CInt,
    val siAddr: COpaquePointer?,
    val siBand: CLong,
    val siValue: Sigval,
    val siFlags: CInt,
    val pad: IntArray,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
) {
    public fun siAddr(): COpaquePointer? = siAddr
    public fun siValue(): Sigval? = siValue
    public fun siPid(): PidT = siPid
    public fun siUid(): UidT = siUid
    public fun siStatus(): CInt = siStatus
    public fun siUtime(): CLong = siUtime ?: 0L
    public fun siStime(): CLong = siStime ?: 0L
}

public data class PollfdExt(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
    val data: PollfdExtU,
)

public data class FileopsT(
    val foRw: ((File?, UioRw, COpaquePointer?, CLong, COpaquePointer?) -> CInt)?,
    val foIoctl: ((File?, CLong, CaddrT, CLong, CLong) -> CInt)?,
    val foSelect: ((File?, CInt, CUShort?, (() -> Unit)?) -> CInt)?,
    val foClose: ((File?) -> CInt)?,
    val foFstat: ((File?, Stat?) -> CInt)?,
)

public data class File(
    val fFlag: CLong,
    val fCount: CInt,
    val fOptions: CShort,
    val fType: CShort,
    val fData: COpaquePointer?,
    val fOffset: CLongLong,
    val fDirOff: CLong,
    val fCred: COpaquePointer?,
    val fLock: KernelSimpleLock,
    val fOffsetLock: KernelSimpleLock,
    val fVinfo: CaddrT,
    val fOps: FileopsT?,
    val fParentp: CaddrT,
    val fFnamep: CaddrT,
    val fFdata: ByteArray,
)

public data class LdInfo(
    val ldinfoNext: CUInt,
    val ldinfoFlags: CUInt,
    val file: LdInfoFile,
    val ldinfoTextorg: COpaquePointer?,
    val ldinfoTextsize: CULong,
    val ldinfoDataorg: COpaquePointer?,
    val ldinfoDatasize: CULong,
    val ldinfoFilename: ByteArray,
)

public data class FpregT(
    val d: CDouble,
)

// C union; only one variant is valid at a time.
public data class KernelSimpleLock(
    val slock: CLong? = null,
    val slockp: LockDataInstrumented? = null,
)

// C union; only one variant is valid at a time.
public data class LdInfoFile(
    val ldinfoFd: CInt? = null,
    val ldinfoFp: File? = null,
    val coreOffset: CLong? = null,
)

// C union; only one variant is valid at a time.
public data class PollfdExtU(
    val addr: COpaquePointer? = null,
    val data32: UInt? = null,
    val data: ULong? = null,
)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mtWord = listOf(0, 2, 0, 0, 0, 0, 0, 0))
public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(cvWord = listOf(0, 0, 0, 0, 2, 0))
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwWord = listOf(2, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ONCE_INIT: PthreadOnceT = PthreadOnceT(onWord = listOf(0, 0, 0, 0, 0, 2, 0, 0, 0))
public const val RLIM_INFINITY: CULong = 0x7fffffffffffffffuL

public expect fun getsystemcfg(label: CInt): CULong
