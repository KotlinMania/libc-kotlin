// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd12/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias NlinkT = ULong
public typealias DevT = ULong
public typealias InoT = ULong
public typealias ShmattT = CUInt

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
)

public data class Kevent(
    val ident: UintptrT,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: Long,
    val udata: COpaquePointer?,
    val ext: ULongArray,
)

public data class KvmPage(
    val version: CUInt,
    val paddr: CULong,
    val kmapVaddr: CULong,
    val dmapVaddr: CULong,
    val prot: VmProtT,
    val offset: ULong,
    val len: ULong,
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
    val kiTdevFreebsd11: UInt,
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
    val kiSparestrings: List<[cChar>,
    val kiSpareints: IntArray,
    val kiTdev: DevT,
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
    val kiSpareptrs: List<*mut cVoid>,
    val kiSparelongs: LongArray,
    val kiSflag: CLong,
    val kiTdflags: CLong,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stNlink: NlinkT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtimExt: Int,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtimExt: Int,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtimExt: Int,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBtimExt: Int,
    val stBirthtime: TimeT,
    val stBirthtimeNsec: CLong,
    val stSize: OffT,
    val stBlocks: BlkcntT,
    val stBlksize: BlksizeT,
    val stFlags: FflagsT,
    val stGen: ULong,
    val stSpare: ULongArray,
)

public data class Dirent(
    val dFileno: InoT,
    val dOff: OffT,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UShort,
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
    val vnDev: ULong,
    val vnFsid: ULong,
    val vnMntdir: String?,
    val vnType: CInt,
    val vnMode: UShort,
    val vnDevname: ByteArray,
)

public const val RAND_MAX: CInt = 0x7fff_fffd
public const val ELAST: CInt = 97
public const val SPECNAMELEN: CInt = 63
public const val KI_NSPARE_PTR: ULong = 6uL
public const val MINCORE_SUPER: CInt = 0x20

public expect fun setgrent()
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun freelocale(loc: LocaleT)
public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT
public expect fun dirname(path: String?): String?
public expect fun basename(path: String?): String?
public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?)
