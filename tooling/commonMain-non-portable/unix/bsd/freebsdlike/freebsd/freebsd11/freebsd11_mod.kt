// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/freebsd11_mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.Filedesc
import io.github.kotlinmania.libc.FixptT
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.LocaleT
import io.github.kotlinmania.libc.LwpidT
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
import io.github.kotlinmania.libc.VmSizeT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

// APIs that were changed after FreeBSD 11
// The type of `nlinkT` changed from `UShort` to `ULong` in FreeBSD 12:
public typealias NlinkT = UShort

// Type of `devT` changed from `UInt` to `ULong` in FreeBSD 12:
public typealias DevT = UInt

// Type of `inoT` changed from `__uint32_t` to `__uint64_t` in FreeBSD 12:
public typealias InoT = UInt

public open class Kevent(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: IntptrT,
    public var udata: COpaquePointer?,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    // Type of shmNattc changed from `int` to `shmattT` (aka `unsigned
    // int`) in FreeBSD 12:
    public var shmNattch: CInt,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
)

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
    public var kiTdev: io.github.kotlinmania.libc.DevT,
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

public open class Dirent(
    public var dFileno: io.github.kotlinmania.libc.InoT,
    public var dReclen: UShort,
    public var dType: UByte,
    // Type of `dNamlen` changed from `char` to `UShort` in FreeBSD 12:
    public var dNamlen: UByte,
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
    // Array length changed from 88 to 1024 in FreeBSD 12:
    public var fMntfromname: List<CChar>,
    // Array length changed from 88 to 1024 in FreeBSD 12:
    public var fMntonname: List<CChar>,
)

public open class Vnstat(
    public var vnFileid: ULong,
    public var vnSize: ULong,
    public var vnMntdir: COpaquePointer?,
    public var vnDev: UInt,
    public var vnFsid: UInt,
    public var vnType: CInt,
    public var vnMode: UShort,
    public var vnDevname: List<CChar>,
)

public val ELAST: CInt = 96

public val RAND_MAX: CInt = 0x7ffffffd

public val KI_NSPARE_PTR: Int = 6

public val MINCORE_SUPER: CInt = 0x20

/**
 * max length of devicename
 */
public val SPECNAMELEN: CInt = 63

public fun makedev(major: CUint, minor: CUint): io.github.kotlinmania.libc.DevT {
    val major1 = major.toUInt()
    val minor1 = minor.toUInt()
    return (major1 shl 8) or minor1
}

public fun major(dev: io.github.kotlinmania.libc.DevT): CInt {
    return ((dev shr 8) and 0xffu).toInt()
}

public fun minor(dev: io.github.kotlinmania.libc.DevT): CInt {
    return (dev and 0xffff00ffu).toInt()
}

// Return type cInt was removed in FreeBSD 12
public expect fun setgrent(): CInt

// Type of `addr` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

// Return type cInt was removed in FreeBSD 12
public expect fun freelocale(loc: LocaleT): CInt

// Return type cInt changed to ssizeT in FreeBSD 12:
public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt

// Type of `path` argument changed from `const void *` to `void *`
// in FreeBSD 12
public expect fun dirname(path: String?): COpaquePointer?

public expect fun basename(path: String?): COpaquePointer?

// Argument order of the function pointer changed in FreeBSD 14. From 14 onwards the signature
// matches the POSIX specification by having the third argument be a mutable pointer, on
// earlier versions the first argument is the mutable pointer.
public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?)
