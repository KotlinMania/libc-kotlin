// port-lint: source unix/aix/powerpc64.rs
package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.Timeval

// Opaque type — C empty enum used as an opaque pointer target.
public class LockDataInstrumented

public data class SigsetT(
    val ssSet: ULongArray,
)

public data class FdSet(
    val fdsBits: LongArray,
)

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lSysid: UInt,
    val lPid: Int,
    val lVfs: Int,
    val lStart: Long,
    val lLen: Long,
)

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fBasetype: ByteArray,
    val fFlag: ULong,
    val fNamemax: ULong,
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
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: Short,
    val stFlag: UShort,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSsize: Int,
    val stAtim: StTimespec,
    val stMtim: StTimespec,
    val stCtim: StTimespec,
    val stBlksize: Long,
    val stBlocks: Long,
    val stVfstype: Int,
    val stVfs: UInt,
    val stType: UInt,
    val stGen: UInt,
    val stPadtoLl: UInt,
    val stSize: Long,
)

public data class Statfs(
    val fVersion: Int,
    val fType: Int,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: Fsid64T,
    val fVfstype: Int,
    val fFsize: ULong,
    val fVfsnumber: Int,
    val fVfsoff: Int,
    val fVfslen: Int,
    val fVfsvers: Int,
    val fFname: ByteArray,
    val fFpack: ByteArray,
    val fNameMax: Int,
)

public data class Aiocb(
    val aioLioOpcode: Int,
    val aioFildes: Int,
    val aioWord1: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioReturn: Long,
    val aioErrno: Int,
    val aioNbytes: ULong,
    val aioReqprio: Int,
    val aioSigevent: Sigevent,
    val aioWord2: Int,
    val aioFp: Int,
    val aioHandle: Aiocb?,
    val aioSigevTid: Long,
)

public data class VmxregT(
    val v: UIntArray,
)

public data class VmxContextT(
    val vr: List<VmxregT>,
    val pad1: UIntArray,
    val vscr: UInt,
    val vrsave: UInt,
    val pad2: UIntArray,
)

public data class VsxContextT(
    val vsrDw1: ULongArray,
)

public data class TmContextT(
    val vmx: VmxContextT,
    val vsx: VsxContextT,
    val gpr: ULongArray,
    val lr: ULong,
    val ctr: ULong,
    val cr: UInt,
    val xer: UInt,
    val amr: ULong,
    val texasr: ULong,
    val tfiar: ULong,
    val tfhar: ULong,
    val ppr: ULong,
    val dscr: ULong,
    val tar: ULong,
    val fpscr: UInt,
    val fpscrx: UInt,
    val fpr: List<FpregT>,
    val tmcontext: Byte,
    val tmstate: Byte,
    val prevowner: Byte,
    val pad: ByteArray,
)

public data class Context64(
    val gpr: ULongArray,
    val msr: ULong,
    val iar: ULong,
    val lr: ULong,
    val ctr: ULong,
    val cr: UInt,
    val xer: UInt,
    val fpscr: UInt,
    val fpscrx: UInt,
    val except: ULongArray,
    val fpr: List<FpregT>,
    val fpeu: Byte,
    val fpinfo: Byte,
    val fpscr2431: Byte,
    val pad: ByteArray,
    val excpType: Int,
)

public data class McontextT(
    val jmpContext: Context64,
)

public data class ExtctxT(
    val flags: UInt,
    val rsvd1: UIntArray,
    val vmx: VmxContextT,
    val ukeys: UIntArray,
    val vsx: VsxContextT,
    val tm: TmContextT,
    val extctxMagic: Int,
)

public data class UcontextT(
    val scOnstack: Int,
    val ucSigmask: SigsetT,
    val scUerror: Int,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val extctx: ExtctxT?,
    val extctxMagic: Int,
    val pad: IntArray,
)

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: Int,
    val utType: Short,
    val utTv: Timeval,
    val utHost: ByteArray,
    val dblWordPad: Int,
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
    val msgFirst: UInt,
    val msgLast: UInt,
    val msgCbytes: UInt,
    val msgQnum: UInt,
    val msgQbytes: ULong,
    val msgLspid: Int,
    val msgLrpid: Int,
    val msgStime: Long,
    val msgRtime: Long,
    val msgCtime: Long,
    val msgRwait: Int,
    val msgWwait: Int,
    val msgReqevents: UShort,
)

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siErrno: Int,
    val siCode: Int,
    val siPid: Int,
    val siUid: UInt,
    val siStatus: Int,
    val siAddr: COpaquePointer?,
    val siBand: Long,
    val siValue: Sigval,
    val siFlags: Int,
    val pad: IntArray,
    val siUtime: Long? = null,
    val siStime: Long? = null,
) {
    internal fun siAddr(): COpaquePointer? = siAddr
    internal fun siValue(): Sigval = siValue
    internal fun siPid(): Int = siPid
    internal fun siUid(): UInt = siUid
    internal fun siStatus(): Int = siStatus
}

public data class PollfdExt(
    val fd: Int,
    val events: Short,
    val revents: Short,
    val data: PollfdExtU,
)

public data class FileopsT(
    val foRw: FileReadWrite?,
    val foIoctl: FileIoctl?,
    val foSelect: FileSelect?,
    val foClose: FileClose?,
    val foFstat: FileStat?,
)

public data class File(
    val fFlag: Long,
    val fCount: Int,
    val fOptions: Short,
    val fType: Short,
    val fData: COpaquePointer?,
    val fOffset: Long,
    val fDirOff: Long,
    val fCred: COpaquePointer?,
    val fLock: KernelSimpleLock,
    val fOffsetLock: KernelSimpleLock,
    val fVinfo: String?,
    val fOps: FileopsT?,
    val fParentp: String?,
    val fFnamep: String?,
    val fFdata: ByteArray,
)

public data class LdInfo(
    val ldinfoNext: UInt,
    val ldinfoFlags: UInt,
    val file: LdInfoFile,
    val ldinfoTextorg: COpaquePointer?,
    val ldinfoTextsize: ULong,
    val ldinfoDataorg: COpaquePointer?,
    val ldinfoDatasize: ULong,
    val ldinfoFilename: ByteArray,
)

public data class FpregT(
    val d: Double,
)

// C union; only one variant is valid at a time.
public data class KernelSimpleLock(
    val slock: Long? = null,
    val slockp: LockDataInstrumented? = null,
)

// C union; only one variant is valid at a time.
public data class LdInfoFile(
    val ldinfoFd: Int? = null,
    val ldinfoFp: File? = null,
    val coreOffset: Long? = null,
)

// C union; only one variant is valid at a time.
public data class PollfdExtU(
    val addr: COpaquePointer? = null,
    val data32: UInt? = null,
    val data: ULong? = null,
)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mtWord = longArrayOf(0, 2, 0, 0, 0, 0, 0, 0))
public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(cvWord = longArrayOf(0, 0, 0, 0, 2, 0))
public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwWord = longArrayOf(2, 0, 0, 0, 0, 0, 0, 0, 0, 0))
public val PTHREAD_ONCE_INIT: PthreadOnceT = PthreadOnceT(onWord = longArrayOf(0, 0, 0, 0, 0, 2, 0, 0, 0))
public const val RLIM_INFINITY: ULong = 0x7fffffffffffffffuL

public expect fun getsystemcfg(label: Int): ULong
