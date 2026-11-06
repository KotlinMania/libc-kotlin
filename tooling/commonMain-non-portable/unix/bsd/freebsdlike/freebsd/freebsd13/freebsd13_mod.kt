// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd13/freebsd13_mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CpulevelT
import io.github.kotlinmania.libc.CpuwhichT
import io.github.kotlinmania.libc.FflagsT
import io.github.kotlinmania.libc.Filedesc
import io.github.kotlinmania.libc.FixptT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.IdT
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.KvaddrT
import io.github.kotlinmania.libc.KvmT
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.LwpidT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.Pargs
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Priority
import io.github.kotlinmania.libc.Rusage
import io.github.kotlinmania.libc.SegszT
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UInt
import io.github.kotlinmania.libc.UShort
import io.github.kotlinmania.libc.UidT
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.VmProtT
import io.github.kotlinmania.libc.VmSizeT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs in FreeBSD 13 that have changed since 11.
public typealias NlinkT = ULong

public typealias DevT = ULong

public typealias InoT = ULong

public typealias ShmattT = CUint

public typealias KpaddrT = ULong

public typealias KssizeT = Long

public typealias DomainsetT = CAnonymousDomainset

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: io.github.kotlinmania.libc.ShmattT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
)

public open class Kevent(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    public var udata: COpaquePointer?,
    public var ext: List<ULong>,
)

public open class KvmPage(
    public var kpVersion: UInt,
    public var kpPaddr: io.github.kotlinmania.libc.KpaddrT,
    public var kpKmapVaddr: KvaddrT,
    public var kpDmapVaddr: KvaddrT,
    public var kpProt: VmProtT,
    public var kpOffset: OffT,
    public var kpLen: SizeT,
)

public open class CAnonymousDomainset(public var priv: List<CUlong>)

public open class KinfoProc(
    /**
     * Size of this structure.
     */
    public var kiStructsize: CInt,
    /**
     * Reserved: layout identifier.
     */
    public var kiLayout: CInt,
    /**
     * Address of command arguments.
     */
    public var kiArgs: Pargs?,
    // This is normally "struct proc".
    /**
     * Address of proc.
     */
    public var kiPaddr: COpaquePointer?,
    // This is normally "struct user".
    /**
     * Kernel virtual address of u-area.
     */
    public var kiAddr: COpaquePointer?,
    // This is normally "struct vnode".
    /**
     * Pointer to trace file.
     */
    public var kiTracep: COpaquePointer?,
    // This is normally "struct vnode".
    /**
     * Pointer to executable file.
     */
    public var kiTextvp: COpaquePointer?,
    /**
     * Pointer to open file info.
     */
    public var kiFd: Filedesc?,
    // This is normally "struct vmspace".
    /**
     * Pointer to kernel vmspace struct.
     */
    public var kiVmspace: COpaquePointer?,
    /**
     * Sleep address.
     */
    public var kiWchan: COpaquePointer?,
    /**
     * Process identifier.
     */
    public var kiPid: PidT,
    /**
     * Parent process ID.
     */
    public var kiPpid: PidT,
    /**
     * Process group ID.
     */
    public var kiPgid: PidT,
    /**
     * tty process group ID.
     */
    public var kiTpgid: PidT,
    /**
     * Process session ID.
     */
    public var kiSid: PidT,
    /**
     * Terminal session ID.
     */
    public var kiTsid: PidT,
    /**
     * Job control counter.
     */
    public var kiJobc: CShort,
    /**
     * Unused (just here for alignment).
     */
    public var kiSpareShort1: CShort,
    /**
     * Controlling tty dev.
     */
    public var kiTdevFreebsd11: UInt,
    /**
     * Signals arrived but not delivered.
     */
    public var kiSiglist: SigsetT,
    /**
     * Current signal mask.
     */
    public var kiSigmask: SigsetT,
    /**
     * Signals being ignored.
     */
    public var kiSigignore: SigsetT,
    /**
     * Signals being caught by user.
     */
    public var kiSigcatch: SigsetT,
    /**
     * Effective user ID.
     */
    public var kiUid: UidT,
    /**
     * Real user ID.
     */
    public var kiRuid: UidT,
    /**
     * Saved effective user ID.
     */
    public var kiSvuid: UidT,
    /**
     * Real group ID.
     */
    public var kiRgid: GidT,
    /**
     * Saved effective group ID.
     */
    public var kiSvgid: GidT,
    /**
     * Number of groups.
     */
    public var kiNgroups: CShort,
    /**
     * Unused (just here for alignment).
     */
    public var kiSpareShort2: CShort,
    /**
     * Groups.
     */
    public var kiGroups: List<GidT>,
    /**
     * Virtual size.
     */
    public var kiSize: VmSizeT,
    /**
     * Current resident set size in pages.
     */
    public var kiRssize: SegszT,
    /**
     * Resident set size before last swap.
     */
    public var kiSwrss: SegszT,
    /**
     * Text size (pages) Note.
     */
    public var kiTsize: SegszT,
    /**
     * Data size (pages) Note.
     */
    public var kiDsize: SegszT,
    /**
     * Stack size (pages).
     */
    public var kiSsize: SegszT,
    /**
     * Exit status for wait & stop signal.
     */
    public var kiXstat: UShort,
    /**
     * Accounting flags.
     */
    public var kiAcflag: UShort,
    /**
     * %cpu for process during `kiSwtime`.
     */
    public var kiPctcpu: FixptT,
    /**
     * Time averaged value of `kiCpticks`.
     */
    public var kiEstcpu: UInt,
    /**
     * Time since last blocked.
     */
    public var kiSlptime: UInt,
    /**
     * Time swapped in or out.
     */
    public var kiSwtime: UInt,
    /**
     * Number of copy-on-write faults.
     */
    public var kiCow: UInt,
    /**
     * Real time in microsec.
     */
    public var kiRuntime: ULong,
    /**
     * Starting time.
     */
    public var kiStart: Timeval,
    /**
     * Time used by process children.
     */
    public var kiChildtime: Timeval,
    /**
     * P_* flags.
     */
    public var kiFlag: CLong,
    /**
     * KI_* flags (below).
     */
    public var kiKiflag: CLong,
    /**
     * Kernel trace points.
     */
    public var kiTraceflag: CInt,
    /**
     * S* process status.
     */
    public var kiStat: CChar,
    /**
     * Process "nice" value.
     */
    public var kiNice: Byte,
    // signed char
    /**
     * Process lock (prevent swap) count.
     */
    public var kiLock: CChar,
    /**
     * Run queue index.
     */
    public var kiRqindex: CChar,
    /**
     * Which cpu we are on.
     */
    public var kiOncpuOld: CUchar,
    /**
     * Last cpu we were on.
     */
    public var kiLastcpuOld: CUchar,
    /**
     * Thread name.
     */
    public var kiTdname: List<CChar>,
    /**
     * Wchan message.
     */
    public var kiWmesg: List<CChar>,
    /**
     * Setlogin name.
     */
    public var kiLogin: List<CChar>,
    /**
     * Lock name.
     */
    public var kiLockname: List<CChar>,
    /**
     * Command name.
     */
    public var kiComm: List<CChar>,
    /**
     * Emulation name.
     */
    public var kiEmul: List<CChar>,
    /**
     * Login class.
     */
    public var kiLoginclass: List<CChar>,
    /**
     * More thread name.
     */
    public var kiMoretdname: List<CChar>,
    /**
     * Spare string space.
     */
    public var kiSparestrings: List<List<CChar>>,
    // little Note to allow PartialEq
    /**
     * Spare room for growth.
     */
    public var kiSpareints: List<CInt>,
    /**
     * Controlling tty dev.
     */
    public var kiTdev: ULong,
    /**
     * Which cpu we are on.
     */
    public var kiOncpu: CInt,
    /**
     * Last cpu we were on.
     */
    public var kiLastcpu: CInt,
    /**
     * PID of tracing process.
     */
    public var kiTracer: CInt,
    /**
     * P2_* flags.
     */
    public var kiFlag2: CInt,
    /**
     * Default FIB number.
     */
    public var kiFibnum: CInt,
    /**
     * Credential flags.
     */
    public var kiCrFlags: UInt,
    /**
     * Process jail ID.
     */
    public var kiJid: CInt,
    /**
     * Number of threads in total.
     */
    public var kiNumthreads: CInt,
    /**
     * Thread ID.
     */
    public var kiTid: LwpidT,
    /**
     * Process priority.
     */
    public var kiPri: Priority,
    /**
     * Process rusage statistics.
     */
    public var kiRusage: Rusage,
    /**
     * rusage of children processes.
     */
    public var kiRusageCh: Rusage,
    // This is normally "struct pcb".
    /**
     * Kernel virtual addr of pcb.
     */
    public var kiPcb: COpaquePointer?,
    /**
     * Kernel virtual addr of stack.
     */
    public var kiKstack: COpaquePointer?,
    /**
     * User convenience pointer.
     */
    public var kiUdata: COpaquePointer?,
    // This is normally "struct thread".
    public var kiTdaddr: COpaquePointer?,
    // This is normally "struct pwddesc".
    /**
     * Pointer to process paths info.
     */
    public var kiPd: COpaquePointer?,
    public var kiSpareptrs: List<COpaquePointer?>,
    public var kiSparelongs: List<CLong>,
    /**
     * PS_* flags.
     */
    public var kiSflag: CLong,
    /**
     * kthread flag.
     */
    public var kiTdflags: CLong,
)

public open class Stat(
    public var stDev: io.github.kotlinmania.libc.DevT,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stMode: ModeT,
    public var stPadding0: Short,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stPadding1: Int,
    public var stRdev: io.github.kotlinmania.libc.DevT,
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
    public var stFlags: FflagsT,
    public var stGen: ULong,
    public var stSpare: List<ULong>,
)

public open class Dirent(
    public var dFileno: io.github.kotlinmania.libc.InoT,
    public var dOff: OffT,
    public var dReclen: UShort,
    public var dType: UByte,
    public var dPad0: UByte,
    public var dNamlen: UShort,
    public var dPad1: UShort,
    public var dName: List<CChar>,
)

public open class Statfs(
    public var fVersion: UInt,
    public var fType: UInt,
    public var fFlags: ULong,
    public var fBsize: ULong,
    public var fIosize: ULong,
    public var fBlocks: ULong,
    public var fBfree: ULong,
    public var fBavail: Long,
    public var fFiles: ULong,
    public var fFfree: Long,
    public var fSyncwrites: ULong,
    public var fAsyncwrites: ULong,
    public var fSyncreads: ULong,
    public var fAsyncreads: ULong,
    public var fSpare: List<ULong>,
    public var fNamemax: UInt,
    public var fOwner: UidT,
    public var fFsid: FsidT,
    public var fCharspare: List<CChar>,
    public var fFstypename: List<CChar>,
    public var fMntfromname: List<CChar>,
    public var fMntonname: List<CChar>,
)

public open class Vnstat(
    public var vnFileid: ULong,
    public var vnSize: ULong,
    public var vnDev: ULong,
    public var vnFsid: ULong,
    public var vnMntdir: COpaquePointer?,
    public var vnType: CInt,
    public var vnMode: UShort,
    public var vnDevname: List<CChar>,
)

public val RAND_MAX: CInt = 0x7fffffff

public val ELAST: CInt = 97

public val KF_TYPE_EVENTFD: CInt = 13

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 255

public val KI_NSPARE_PTR: Int = 5

/**
 * domainset policies
 */
public val DOMAINSET_POLICY_INVALID: CInt = 0

public val DOMAINSET_POLICY_ROUNDROBIN: CInt = 1

public val DOMAINSET_POLICY_FIRSTTOUCH: CInt = 2

public val DOMAINSET_POLICY_PREFER: CInt = 3

public val DOMAINSET_POLICY_INTERLEAVE: CInt = 4

public val MINCORE_SUPER: CInt = 0x20

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0
    dev = dev or (((major1 and 0xffffff00uL).toULong()) shl 32)
    dev = dev or (((major1 and 0x000000ffuL).toULong()) shl 8)
    dev = dev or (((minor1 and 0x0000ff00uL).toULong()) shl 24)
    dev = dev or (((minor1 and 0xffff00ffuL).toULong()) shl 0)
    return dev
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CInt {
    return (((dev shr 32) and 0xffffff00uL) or ((dev shr 8) and 0xffuL)).toInt()
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CInt {
    return (((dev shr 24) and 0xff00uL) or (dev and 0xffff00ffuL)).toInt()
}

public expect fun setgrent()

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt?): CInt

public expect fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CAnonymousDomainset?, policy: CInt): CInt

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?)

public expect fun kvmKerndisp(kd: KvmT?): io.github.kotlinmania.libc.KssizeT
