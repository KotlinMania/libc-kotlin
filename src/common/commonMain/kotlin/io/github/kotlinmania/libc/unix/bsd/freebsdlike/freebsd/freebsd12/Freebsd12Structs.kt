@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

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
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.VmSizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.BlksizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.COMMLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.FflagsT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Filedesc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.FixptT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.KI_EMULNAMELEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.KI_NGROUPS
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.KI_NSPARE_INT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.KI_NSPARE_LONG
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOCKNAMELEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOGINCLASSLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOGNAMELEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LwpidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MAXCOMLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Pargs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Priority
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SegszT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.TDNAMLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ULong
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UShort
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.VmProtT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.WMESGLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: ShmattT = 0u,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
)

public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: CShort = 0,
    public var flags: CUshort = 0u,
    public var fflags: CUint = 0u,
    public var data: Long = 0L,
    public var udata: COpaquePointer? = null,
    public var ext: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        if (!this.ext.contentEquals(other.ext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        result = 31 * result + this.ext.contentHashCode()
        return result
    }
}

public data class KvmPage(
    public var version: CUint = 0u,
    public var paddr: CUlong = 0uL,
    public var kmapVaddr: CUlong = 0uL,
    public var dmapVaddr: CUlong = 0uL,
    public var prot: VmProtT = 0u,
    public var offset: ULong = 0uL,
    public var len: SizeT = 0uL,
)

public class KinfoProc {
    /**
     * Size of this structure.
     */
    public var kiStructsize: CInt = 0

    /**
     * Reserved: layout identifier.
     */
    public var kiLayout: CInt = 0

    /**
     * Address of command arguments.
     */
    public var kiArgs: Pargs? = null

    // This is normally "struct proc".
    /**
     * Address of proc.
     */
    public var kiPaddr: COpaquePointer? = null

    // This is normally "struct user".
    /**
     * Kernel virtual address of u-area.
     */
    public var kiAddr: COpaquePointer? = null

    // This is normally "struct vnode".
    /**
     * Pointer to trace file.
     */
    public var kiTracep: COpaquePointer? = null

    // This is normally "struct vnode".
    /**
     * Pointer to executable file.
     */
    public var kiTextvp: COpaquePointer? = null

    /**
     * Pointer to open file info.
     */
    public var kiFd: Filedesc? = null

    // This is normally "struct vmspace".
    /**
     * Pointer to kernel vmspace struct.
     */
    public var kiVmspace: COpaquePointer? = null

    /**
     * Sleep address.
     */
    public var kiWchan: COpaquePointer? = null

    /**
     * Process identifier.
     */
    public var kiPid: PidT = 0

    /**
     * Parent process ID.
     */
    public var kiPpid: PidT = 0

    /**
     * Process group ID.
     */
    public var kiPgid: PidT = 0

    /**
     * tty process group ID.
     */
    public var kiTpgid: PidT = 0

    /**
     * Process session ID.
     */
    public var kiSid: PidT = 0

    /**
     * Terminal session ID.
     */
    public var kiTsid: PidT = 0

    /**
     * Job control counter.
     */
    public var kiJobc: CShort = 0

    /**
     * Unused (just here for alignment).
     */
    public var kiSpareShort1: CShort = 0

    /**
     * Controlling tty dev.
     */
    public var kiTdevFreebsd11: UInt = 0u

    /**
     * Signals arrived but not delivered.
     */
    public var kiSiglist: SigsetT = SigsetT()

    /**
     * Current signal mask.
     */
    public var kiSigmask: SigsetT = SigsetT()

    /**
     * Signals being ignored.
     */
    public var kiSigignore: SigsetT = SigsetT()

    /**
     * Signals being caught by user.
     */
    public var kiSigcatch: SigsetT = SigsetT()

    /**
     * Effective user ID.
     */
    public var kiUid: UidT = 0u

    /**
     * Real user ID.
     */
    public var kiRuid: UidT = 0u

    /**
     * Saved effective user ID.
     */
    public var kiSvuid: UidT = 0u

    /**
     * Real group ID.
     */
    public var kiRgid: GidT = 0u

    /**
     * Saved effective group ID.
     */
    public var kiSvgid: GidT = 0u

    /**
     * Number of groups.
     */
    public var kiNgroups: CShort = 0

    /**
     * Unused (just here for alignment).
     */
    public var kiSpareShort2: CShort = 0

    /**
     * Groups.
     */
    public var kiGroups: UShortArray = UShortArray(KI_NGROUPS)

    /**
     * Virtual size.
     */
    public var kiSize: VmSizeT = 0uL

    /**
     * Current resident set size in pages.
     */
    public var kiRssize: SegszT = 0

    /**
     * Resident set size before last swap.
     */
    public var kiSwrss: SegszT = 0

    /**
     * Text size (pages) Note.
     */
    public var kiTsize: SegszT = 0

    /**
     * Data size (pages) Note.
     */
    public var kiDsize: SegszT = 0

    /**
     * Stack size (pages).
     */
    public var kiSsize: SegszT = 0

    /**
     * Exit status for wait & stop signal.
     */
    public var kiXstat: UShort = 0u

    /**
     * Accounting flags.
     */
    public var kiAcflag: UShort = 0u

    /**
     * %cpu for process during `kiSwtime`.
     */
    public var kiPctcpu: FixptT = 0u

    /**
     * Time averaged value of `kiCpticks`.
     */
    public var kiEstcpu: UInt = 0u

    /**
     * Time since last blocked.
     */
    public var kiSlptime: UInt = 0u

    /**
     * Time swapped in or out.
     */
    public var kiSwtime: UInt = 0u

    /**
     * Number of copy-on-write faults.
     */
    public var kiCow: UInt = 0u

    /**
     * Real time in microsec.
     */
    public var kiRuntime: ULong = 0uL

    /**
     * Starting time.
     */
    public var kiStart: Timeval = Timeval()

    /**
     * Time used by process children.
     */
    public var kiChildtime: Timeval = Timeval()

    /**
     * P_* flags.
     */
    public var kiFlag: CLong = 0L

    /**
     * KI_* flags (below).
     */
    public var kiKiflag: CLong = 0L

    /**
     * Kernel trace points.
     */
    public var kiTraceflag: CInt = 0

    /**
     * S* process status.
     */
    public var kiStat: CChar = 0u

    /**
     * Process "nice" value.
     */
    public var kiNice: Byte = 0

    // signed char
    /**
     * Process lock (prevent swap) count.
     */
    public var kiLock: CChar = 0u

    /**
     * Run queue index.
     */
    public var kiRqindex: CChar = 0u

    /**
     * Which cpu we are on.
     */
    public var kiOncpuOld: CUchar = 0u

    /**
     * Last cpu we were on.
     */
    public var kiLastcpuOld: CUchar = 0u

    /**
     * Thread name.
     */
    public var kiTdname: UByteArray = UByteArray(TDNAMLEN + 1)

    /**
     * Wchan message.
     */
    public var kiWmesg: UByteArray = UByteArray(WMESGLEN + 1)

    /**
     * Setlogin name.
     */
    public var kiLogin: UByteArray = UByteArray(LOGNAMELEN + 1)

    /**
     * Lock name.
     */
    public var kiLockname: UByteArray = UByteArray(LOCKNAMELEN + 1)

    /**
     * Command name.
     */
    public var kiComm: UByteArray = UByteArray(COMMLEN + 1)

    /**
     * Emulation name.
     */
    public var kiEmul: UByteArray = UByteArray(KI_EMULNAMELEN + 1)

    /**
     * Login class.
     */
    public var kiLoginclass: UByteArray = UByteArray(LOGINCLASSLEN + 1)

    /**
     * More thread name.
     */
    public var kiMoretdname: UByteArray = UByteArray(MAXCOMLEN - TDNAMLEN + 1)

    /**
     * Spare string space.
     */
    public var kiSparestrings: List<UByteArray> = List(2) { UByteArray(0) }

    // little Note to allow PartialEq
    /**
     * Spare room for growth.
     */
    public var kiSpareints: IntArray = IntArray(KI_NSPARE_INT)

    /**
     * Controlling tty dev.
     */
    public var kiTdev: DevT = 0uL

    /**
     * Which cpu we are on.
     */
    public var kiOncpu: CInt = 0

    /**
     * Last cpu we were on.
     */
    public var kiLastcpu: CInt = 0

    /**
     * PID of tracing process.
     */
    public var kiTracer: CInt = 0

    /**
     * P2_* flags.
     */
    public var kiFlag2: CInt = 0

    /**
     * Default FIB number.
     */
    public var kiFibnum: CInt = 0

    /**
     * Credential flags.
     */
    public var kiCrFlags: UInt = 0u

    /**
     * Process jail ID.
     */
    public var kiJid: CInt = 0

    /**
     * Number of threads in total.
     */
    public var kiNumthreads: CInt = 0

    /**
     * Thread ID.
     */
    public var kiTid: LwpidT = 0

    /**
     * Process priority.
     */
    public var kiPri: Priority = Priority()

    /**
     * Process rusage statistics.
     */
    public var kiRusage: Rusage = Rusage()

    /**
     * rusage of children processes.
     */
    public var kiRusageCh: Rusage = Rusage()

    // This is normally "struct pcb".
    /**
     * Kernel virtual addr of pcb.
     */
    public var kiPcb: COpaquePointer? = null

    /**
     * Kernel virtual addr of stack.
     */
    public var kiKstack: COpaquePointer? = null

    /**
     * User convenience pointer.
     */
    public var kiUdata: COpaquePointer? = null

    // This is normally "struct thread".
    public var kiTdaddr: COpaquePointer? = null

    public var kiSpareptrs: List<COpaquePointer> = List(KI_NSPARE_PTR) { COpaquePointer() }

    public var kiSparelongs: LongArray = LongArray(KI_NSPARE_LONG)

    /**
     * PS_* flags.
     */
    public var kiSflag: CLong = 0L

    /**
     * kthread flag.
     */
    public var kiTdflags: CLong = 0L
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0u,
    public var stPadding0: Short = 0,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stPadding1: Int = 0,
    public var stRdev: DevT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: FflagsT = 0u,
    public var stGen: ULong = 0uL,
    public var stSpare: ULongArray = ULongArray(10),
)

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dPad0: UByte = 0u,
    public var dNamlen: UShort = 0u,
    public var dPad1: UShort = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (this.dPad0 != other.dPad0) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dPad1 != other.dPad1) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dPad0.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dPad1.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public class Statfs(
    public var fVersion: UInt = 0u,
    public var fType: UInt = 0u,
    public var fFlags: ULong = 0uL,
    public var fBsize: ULong = 0uL,
    public var fIosize: ULong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: Long = 0L,
    public var fFiles: ULong = 0uL,
    public var fFfree: Long = 0L,
    public var fSyncwrites: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fSyncreads: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fSpare: ULongArray = ULongArray(10),
    public var fNamemax: UInt = 0u,
    public var fOwner: UidT = 0u,
    public var fFsid: FsidT = FsidT(),
    public var fCharspare: UByteArray = UByteArray(80),
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntfromname: UByteArray = UByteArray(1024),
    public var fMntonname: UByteArray = UByteArray(1024),
)

public data class Vnstat(
    public var vnFileid: ULong = 0uL,
    public var vnSize: ULong = 0uL,
    public var vnDev: ULong = 0uL,
    public var vnFsid: ULong = 0uL,
    public var vnMntdir: COpaquePointer? = null,
    public var vnType: CInt = 0,
    public var vnMode: UShort = 0u,
    public var vnDevname: UByteArray = UByteArray(SPECNAMELEN + 1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vnstat) return false
        if (this.vnFileid != other.vnFileid) return false
        if (this.vnSize != other.vnSize) return false
        if (this.vnDev != other.vnDev) return false
        if (this.vnFsid != other.vnFsid) return false
        if (this.vnMntdir != other.vnMntdir) return false
        if (this.vnType != other.vnType) return false
        if (this.vnMode != other.vnMode) return false
        if (!this.vnDevname.contentEquals(other.vnDevname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vnFileid.hashCode()
        result = 31 * result + this.vnSize.hashCode()
        result = 31 * result + this.vnDev.hashCode()
        result = 31 * result + this.vnFsid.hashCode()
        result = 31 * result + this.vnMntdir.hashCode()
        result = 31 * result + this.vnType.hashCode()
        result = 31 * result + this.vnMode.hashCode()
        result = 31 * result + this.vnDevname.contentHashCode()
        return result
    }
}
