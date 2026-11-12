@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
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
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.KvaddrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOCKNAMELEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOGINCLASSLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LOGNAMELEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.LwpidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MAXCOMLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Pargs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Priority
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SegszT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.TDNAMLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.VmProtT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.WMESGLEN
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    udataCtorArg: MutPtr<CVoid>,
    public var ext: ULongArray,
) {
    public var udata: MutPtr<CVoid> = udataCtorArg
        internal set

    public constructor() : this(
        ident = 0uL,
        filter = 0,
        flags = 0u,
        fflags = 0u,
        data = 0L,
        udataCtorArg = MutPtr(0L),
        ext = ULongArray(4),
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): CShort = this.filter

    public operator fun component3(): CUshort = this.flags

    public operator fun component4(): CUint = this.fflags

    public operator fun component5(): Long = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public operator fun component7(): ULongArray = this.ext

    public fun copy(ident: UintptrT = this.ident, filter: CShort = this.filter, flags: CUshort = this.flags, fflags: CUint = this.fflags, data: Long = this.data, udata: MutPtr<CVoid> = this.udata, ext: ULongArray = this.ext): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata, ext = ext)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 32L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.udata)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 32L, value.ext.toList())
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: CShort = 0,
            flags: CUshort = 0u,
            fflags: CUint = 0u,
            data: Long = 0L,
            udata: MutPtr<CVoid> = MutPtr(0L),
            ext: ULongArray = ULongArray(4),
        ): Kevent =
            Kevent(
                ident = ident,
                filter = filter,
                flags = flags,
                fflags = fflags,
                data = data,
                udataCtorArg = udata,
                ext = ext,
            )
    }
}

public data class KvmPage(
    public var kpVersion: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u,
    public var kpPaddr: KpaddrT = 0uL,
    public var kpKmapVaddr: KvaddrT = 0uL,
    public var kpDmapVaddr: KvaddrT = 0uL,
    public var kpProt: VmProtT = 0u,
    public var kpOffset: OffT = 0L,
    public var kpLen: SizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KvmPage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KvmPage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): KvmPage =
                    KvmPage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: KvmPage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.kpVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.kpPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kpKmapVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.kpDmapVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.kpProt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.kpOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.kpLen)
                }
            }
    }
}

public data class CAnonymousDomainset(
    public var priv: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousDomainset) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousDomainset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousDomainset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CAnonymousDomainset =
                    CAnonymousDomainset(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CAnonymousDomainset) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}

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
    public var kiArgs: MutPtr<Pargs> = MutPtr(0L)
        internal set

    // This is normally "struct proc".

    /**
     * Address of proc.
     */
    public var kiPaddr: MutPtr<CVoid> = MutPtr(0L)
        internal set

    // This is normally "struct user".

    /**
     * Kernel virtual address of u-area.
     */
    public var kiAddr: MutPtr<CVoid> = MutPtr(0L)
        internal set

    // This is normally "struct vnode".

    /**
     * Pointer to trace file.
     */
    public var kiTracep: MutPtr<CVoid> = MutPtr(0L)
        internal set

    // This is normally "struct vnode".

    /**
     * Pointer to executable file.
     */
    public var kiTextvp: MutPtr<CVoid> = MutPtr(0L)
        internal set

    /**
     * Pointer to open file info.
     */
    public var kiFd: MutPtr<Filedesc> = MutPtr(0L)
        internal set

    // This is normally "struct vmspace".

    /**
     * Pointer to kernel vmspace struct.
     */
    public var kiVmspace: MutPtr<CVoid> = MutPtr(0L)
        internal set

    /**
     * Sleep address.
     */
    public var kiWchan: ConstPtr<CVoid> = ConstPtr(0L)
        internal set

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
    public var kiXstat: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UShort = 0u

    /**
     * Accounting flags.
     */
    public var kiAcflag: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UShort = 0u

    /**
     * %cpu for process during `kiSwtime`.
     */
    public var kiPctcpu: FixptT = 0u

    /**
     * Time averaged value of `kiCpticks`.
     */
    public var kiEstcpu: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u

    /**
     * Time since last blocked.
     */
    public var kiSlptime: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u

    /**
     * Time swapped in or out.
     */
    public var kiSwtime: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u

    /**
     * Number of copy-on-write faults.
     */
    public var kiCow: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u

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
    public var kiTdev: ULong = 0uL

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
    public var kiCrFlags: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.UInt = 0u

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
    public var kiPcb: MutPtr<CVoid> = MutPtr(0L)
        internal set

    /**
     * Kernel virtual addr of stack.
     */
    public var kiKstack: MutPtr<CVoid> = MutPtr(0L)
        internal set

    /**
     * User convenience pointer.
     */
    public var kiUdata: MutPtr<CVoid> = MutPtr(0L)
        internal set

    // This is normally "struct thread".
    public var kiTdaddr: MutPtr<CVoid> = MutPtr(0L)
        internal set

    // This is normally "struct pwddesc".

    /**
     * Pointer to process paths info.
     */
    public var kiPd: MutPtr<CVoid> = MutPtr(0L)
        internal set

    public var kiSpareptrs: List<MutPtr<CVoid>> = List(KI_NSPARE_PTR) { MutPtr(0L) }
        internal set

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
    public var stFilerev: ULong = 0uL,
    public var stSpare: ULongArray = ULongArray(9),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                        ).readNative(addr + 152L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 26L, value.stPadding0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.stPadding1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stBirthtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stBirthtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.stFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.stGen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.stFilerev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                    ).writeNative(addr + 152L, value.stSpare.toList())
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dFileno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.dPad0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.dNamlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.dPad1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 24L, value.dName.toList())
                }
            }
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

public class Vnstat internal constructor(
    public var vnFileid: ULong,
    public var vnSize: ULong,
    public var vnDev: ULong,
    public var vnFsid: ULong,
    vnMntdirCtorArg: MutPtr<CChar>,
    public var vnType: CInt,
    public var vnMode: UShort,
    public var vnDevname: UByteArray,
) {
    public var vnMntdir: MutPtr<CChar> = vnMntdirCtorArg
        internal set

    public constructor() : this(
        vnFileid = 0uL,
        vnSize = 0uL,
        vnDev = 0uL,
        vnFsid = 0uL,
        vnMntdirCtorArg = MutPtr(0L),
        vnType = 0,
        vnMode = 0u,
        vnDevname = UByteArray(SPECNAMELEN + 1),
    )

    public operator fun component1(): ULong = this.vnFileid

    public operator fun component2(): ULong = this.vnSize

    public operator fun component3(): ULong = this.vnDev

    public operator fun component4(): ULong = this.vnFsid

    public operator fun component5(): MutPtr<CChar> = this.vnMntdir

    public operator fun component6(): CInt = this.vnType

    public operator fun component7(): UShort = this.vnMode

    public operator fun component8(): UByteArray = this.vnDevname

    public fun copy(vnFileid: ULong = this.vnFileid, vnSize: ULong = this.vnSize, vnDev: ULong = this.vnDev, vnFsid: ULong = this.vnFsid, vnMntdir: MutPtr<CChar> = this.vnMntdir, vnType: CInt = this.vnType, vnMode: UShort = this.vnMode, vnDevname: UByteArray = this.vnDevname): Vnstat = Vnstat(vnFileid = vnFileid, vnSize = vnSize, vnDev = vnDev, vnFsid = vnFsid, vnMntdirCtorArg = vnMntdir, vnType = vnType, vnMode = vnMode, vnDevname = vnDevname)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vnstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vnstat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((46L + ((SPECNAMELEN + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): Vnstat =
                    Vnstat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SPECNAMELEN + 1).toInt())
                        ).readNative(addr + 46L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Vnstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.vnFileid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.vnSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.vnDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.vnFsid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.vnMntdir)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.vnType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.vnMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SPECNAMELEN + 1).toInt())
                    ).writeNative(addr + 46L, value.vnDevname.toList())
                }
            }

        public operator fun invoke(
            vnFileid: ULong = 0uL,
            vnSize: ULong = 0uL,
            vnDev: ULong = 0uL,
            vnFsid: ULong = 0uL,
            vnMntdir: MutPtr<CChar> = MutPtr(0L),
            vnType: CInt = 0,
            vnMode: UShort = 0u,
            vnDevname: UByteArray = UByteArray(SPECNAMELEN + 1),
        ): Vnstat =
            Vnstat(
                vnFileid = vnFileid,
                vnSize = vnSize,
                vnDev = vnDev,
                vnFsid = vnFsid,
                vnMntdirCtorArg = vnMntdir,
                vnType = vnType,
                vnMode = vnMode,
                vnDevname = vnDevname,
            )
    }
}
