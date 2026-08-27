// port-lint: source libc/src/unix/bsd/freebsdlike/freebsd/freebsd14/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*

public typealias NlinkT = ULong
public typealias DevT = ULong
public typealias InoT = ULong
public typealias ShmattT = CUInt
public typealias KpaddrT = ULong
public typealias KssizeT = Long
public typealias DomainsetT = CAnonymousDomainset

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
    val kpVersion: UInt,
    val kpPaddr: KpaddrT,
    val kpKmapVaddr: KvaddrT,
    val kpDmapVaddr: KvaddrT,
    val kpProt: VmProtT,
    val kpOffset: OffT,
    val kpLen: ULong,
)

public data class CAnonymousDomainset(
    val priv: ULongArray,
    val priv2: ULongArray,
)

public data class KinfoProc(
    val kiStructsize: CInt,
    val kiLayout: CInt,
    val kiArgs: Pargs,
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
    val kiSparestrings: List<ByteArray>,
    val kiSpareints: IntArray,
    val kiTdev: ULong,
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
    val kiPd: COpaquePointer?,
    val kiSpareptrs: List<COpaquePointer?>,
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
    val stFilerev: ULong,
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

public const val RAND_MAX: CInt = 0x7fff_ffff
public const val ELAST: CInt = 97
public const val KF_TYPE_EVENTFD: CInt = 13
public const val SPECNAMELEN: CInt = 255
public const val KI_NSPARE_PTR: ULong = 5uL
public const val DOMAINSET_POLICY_INVALID: CInt = 0
public const val DOMAINSET_POLICY_ROUNDROBIN: CInt = 1
public const val DOMAINSET_POLICY_FIRSTTOUCH: CInt = 2
public const val DOMAINSET_POLICY_PREFER: CInt = 3
public const val DOMAINSET_POLICY_INTERLEAVE: CInt = 4
public const val MINCORE_SUPER: CInt = 0x60

public fun setgrent() { }

public fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt = -1

public fun freelocale(loc: LocaleT) { }

public fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtyp: CLong, msgflg: CInt): SsizeT = -1L

public fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: DomainsetT?, policy: CInt?): CInt = -1

public fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: DomainsetT?, policy: CInt): CInt = -1

public fun dirname(path: String?): String? = null

public fun basename(path: String?): String? = null

public fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) { }

public fun kvmKerndisp(kd: KvmT): KssizeT = throw UnsupportedOperationException("Not implemented on this platform")
