// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias NlinkT = UShort
public typealias DevT = UInt
public typealias InoT = UInt

public data class Kevent(
    val ident: UintptrT,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: IntptrT,
    val udata: COpaquePointer?,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: CInt,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
)

public data class KinfoProc(
    val kiStructsize: CInt,
    val kiLayout: CInt,
    val kiArgs: Pargs?,
    val kiPaddr: COpaquePointer?,
    val kiAddr: COpaquePointer?,
    val kiTracep: COpaquePointer?,
    val kiTextvp: COpaquePointer?,
    val kiFd: Filedesc?,
    val kiVmspace: COpaquePointer?,
    val kiWchan: COpaquePointer?,
    val kiPid: PidT,
    val kiPpid: PidT,
    val kiPgid: PidT,
    val kiTpgid: PidT,
    val kiSid: PidT,
    val kiTsid: PidT,
    val kiJobc: CShort,
    val kiSpareShort1: CShort,
    val kiTdev: DevT,
    val kiSiglist: SigsetT,
    val kiSigmask: SigsetT,
    val kiSigignore: SigsetT,
    val kiSigcatch: SigsetT,
    val kiUid: UidT,
    val kiRuid: UidT,
    val kiSvuid: UidT,
    val kiRgid: GidT,
    val kiSvgid: GidT,
    val kiNgroups: CShort,
    val kiSpareShort2: CShort,
    val kiGroups: List<GidT>,
    val kiSize: VmSizeT,
    val kiRssize: SegszT,
    val kiSwrss: SegszT,
    val kiTsize: SegszT,
    val kiDsize: SegszT,
    val kiSsize: SegszT,
    val kiXstat: UShort,
    val kiAcflag: UShort,
    val kiPctcpu: FixptT,
    val kiEstcpu: UInt,
    val kiSlptime: UInt,
    val kiSwtime: UInt,
    val kiCow: UInt,
    val kiRuntime: ULong,
    val kiStart: Timeval,
    val kiChildtime: Timeval,
    val kiFlag: CLong,
    val kiKiflag: CLong,
    val kiTraceflag: CInt,
    val kiStat: CChar,
    val kiNice: Byte,
    val kiLock: CChar,
    val kiRqindex: CChar,
    val kiOncpuOld: CUChar,
    val kiLastcpuOld: CUChar,
    val kiTdname: ByteArray,
    val kiWmesg: ByteArray,
    val kiLogin: ByteArray,
    val kiLockname: ByteArray,
    val kiComm: ByteArray,
    val kiEmul: ByteArray,
    val kiLoginclass: ByteArray,
    val kiMoretdname: ByteArray,
    val kiSparestrings: List<ByteArray>,
    val kiSpareints: IntArray,
    val kiOncpu: CInt,
    val kiLastcpu: CInt,
    val kiTracer: CInt,
    val kiFlag2: CInt,
    val kiFibnum: CInt,
    val kiCrFlags: UInt,
    val kiJid: CInt,
    val kiNumthreads: CInt,
    val kiTid: LwpidT,
    val kiPri: Priority,
    val kiRusage: Rusage,
    val kiRusageCh: Rusage,
    val kiPcb: COpaquePointer?,
    val kiKstack: COpaquePointer?,
    val kiUdata: COpaquePointer?,
    val kiTdaddr: COpaquePointer?,
    val kiSpareptrs: List<COpaquePointer?>,
    val kiSparelongs: LongArray,
    val kiSflag: CLong,
    val kiTdflags: CLong,
)

public data class Dirent(
    val dFileno: InoT,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UByte,
    val dName: ByteArray,
)

public data class Statfs(
    val fVersion: UInt,
    val fType: UInt,
    val fFlags: ULong,
    val fBsize: ULong,
    val fIosize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: Long,
    val fFiles: ULong,
    val fFfree: Long,
    val fSyncwrites: ULong,
    val fAsyncwrites: ULong,
    val fSyncreads: ULong,
    val fAsyncreads: ULong,
    val fSpare: ULongArray,
    val fNamemax: UInt,
    val fOwner: UidT,
    val fFsid: FsidT,
    val fCharspare: ByteArray,
    val fFstypename: ByteArray,
    val fMntfromname: ByteArray,
    val fMntonname: ByteArray,
)

public data class Vnstat(
    val vnFileid: ULong,
    val vnSize: ULong,
    val vnMntdir: String?,
    val vnDev: UInt,
    val vnFsid: UInt,
    val vnType: CInt,
    val vnMode: UShort,
    val vnDevname: ByteArray,
)

public const val ELAST: CInt = 96
public const val RAND_MAX: CInt = 0x7fff_fffd
public const val KI_NSPARE_PTR: ULong = 6uL
public const val MINCORE_SUPER: CInt = 0x20
public const val SPECNAMELEN: CInt = 63

public expect fun setgrent(): CInt
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun freelocale(loc: LocaleT): CInt
public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): CInt
public expect fun dirname(path: String?): String?
public expect fun basename(path: String?): String?
public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?)
