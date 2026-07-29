// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public typealias DevT = UInt
public typealias WcharT = Int
public typealias ClockT = ULong
public typealias InoT = ULong
public typealias LwpidT = Int
public typealias NlinkT = UInt
public typealias BlksizeT = Long
public typealias ClockidT = CULong
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias UuidT = Uuid
public typealias FsblkcntT = ULong
public typealias FsfilcntT = ULong
public typealias IdtypeT = CUInt
public typealias ShmattT = CUInt
public typealias MqdT = CInt
public typealias SemT = Sem?
public typealias CpusetT = CpumaskT
public typealias CpuSetT = CpumaskT
public typealias RegisterT = CLong
public typealias UmtxT = CInt
public typealias PthreadBarrierattrT = CInt
public typealias PthreadBarrierT = UintptrT
public typealias PthreadSpinlockT = UintptrT
public typealias SegszT = ULong
public typealias VmProtT = UByte
public typealias VmMaptypeT = UByte
public typealias VmInheritT = Byte
public typealias VmSubsysT = CInt
public typealias VmEflagsT = CUInt
public typealias VmMapT = CAnonymousVmMap?
public typealias VmMapEntryT = VmMapEntry?
public typealias Pmap = CAnonymousPmap

public enum class Lwpstat(
    public val value: UInt,
) {
    LSRUN(1u),
    LSSTOP(2u),
    LSSLEEP(3u),
}

public enum class Procstat(
    public val value: UInt,
) {
    SIDL(1u),
    SACTIVE(2u),
    SSTOP(3u),
    SZOMB(4u),
    SCORE(5u),
}

public data class Kevent(
    val ident: UintptrT,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: IntptrT,
    val udata: COpaquePointer?,
)

public data class ExitStatus(
    val eTermination: UShort,
    val eExit: UShort,
)

public data class Aiocb(
    val aioFildes: CInt,
    val aioOffset: OffT,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioVal: CInt,
    val aioErr: CInt,
)

public data class Uuid(
    val timeLow: UInt,
    val timeMid: UShort,
    val timeHiAndVersion: UShort,
    val clockSeqLow: UByte,
    val node: UByteArray,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
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
    val fFlag: CULong,
    val fNamemax: CULong,
    val fOwner: UidT,
    val fType: CUInt,
    val fSyncreads: ULong,
    val fSyncwrites: ULong,
    val fAsyncreads: ULong,
    val fAsyncwrites: ULong,
    val fFsidUuid: UuidT,
    val fUidUuid: UuidT,
)

public data class Stat(
    val stIno: InoT,
    val stNlink: NlinkT,
    val stDev: DevT,
    val stMode: ModeT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stSize: OffT,
    val stBlocks: Long,
    val oldStBlksize: UInt,
    val stFlags: UInt,
    val stGen: UInt,
    val stLspare: Int,
    val stBlksize: Long,
    val stQspare2: Long,
)

public data class IfData(
    val ifiType: CUChar,
    val ifiPhysical: CUChar,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiRecvquota: CUChar,
    val ifiXmitquota: CUChar,
    val ifiMtu: CULong,
    val ifiMetric: CULong,
    val ifiLinkState: CULong,
    val ifiBaudrate: ULong,
    val ifiIpackets: CULong,
    val ifiIerrors: CULong,
    val ifiOpackets: CULong,
    val ifiOerrors: CULong,
    val ifiCollisions: CULong,
    val ifiIbytes: CULong,
    val ifiObytes: CULong,
    val ifiImcasts: CULong,
    val ifiOmcasts: CULong,
    val ifiIqdrops: CULong,
    val ifiNoproto: CULong,
    val ifiHwassist: CULong,
    val ifiOqdrops: CULong,
    val ifiLastchange: Timeval,
)

public data class IfMsghdr(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmData: IfData,
)

public data class SockaddrDl(
    val sdlLen: CUChar,
    val sdlFamily: CUChar,
    val sdlIndex: CUShort,
    val sdlType: CUChar,
    val sdlNlen: CUChar,
    val sdlAlen: CUChar,
    val sdlSlen: CUChar,
    val sdlData: ByteArray,
    val sdlRcf: CUShort,
    val sdlRoute: UShortArray,
)

public data class Xucred(
    val crVersion: CUInt,
    val crUid: UidT,
    val crNgroups: CShort,
    val crGroups: List<GidT>,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class CpumaskT(
    val ary: ULongArray,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmInternal: COpaquePointer?,
)

public data class KinfoFile(
    val fSize: ULong,
    val fPid: PidT,
    val fUid: UidT,
    val fFd: CInt,
    val fFile: COpaquePointer?,
    val fType: CShort,
    val fCount: CInt,
    val fMsgcount: CInt,
    val fOffset: OffT,
    val fData: COpaquePointer?,
    val fFlag: CUInt,
)

public data class KinfoCputime(
    val cpUser: ULong,
    val cpNice: ULong,
    val cpSys: ULong,
    val cpIntr: ULong,
    val cpIdel: ULong,
    val cpSamplePc: ULong,
    val cpSampleSp: ULong,
    val cpMsg: ByteArray,
)

public data class KinfoLwp(
    val klPid: PidT,
    val klTid: LwpidT,
    val klFlags: CInt,
    val klStat: Lwpstat,
    val klLock: CInt,
    val klTdflags: CInt,
    val klMpcount: CInt,
    val klPrio: CInt,
    val klTdprio: CInt,
    val klRtprio: Rtprio,
    val klUticks: ULong,
    val klSticks: ULong,
    val klIticks: ULong,
    val klCpticks: ULong,
    val klPctcpu: CUInt,
    val klSlptime: CUInt,
    val klOrigcpu: CInt,
    val klEstcpu: CInt,
    val klCpuid: CInt,
    val klRu: Rusage,
    val klSiglist: SigsetT,
    val klSigmask: SigsetT,
    val klWchan: UintptrT,
    val klWmesg: ByteArray,
    val klComm: ByteArray,
)

public data class KinfoProc(
    val kpPaddr: UintptrT,
    val kpFlags: CInt,
    val kpStat: Procstat,
    val kpLock: CInt,
    val kpAcflag: CInt,
    val kpTraceflag: CInt,
    val kpFd: UintptrT,
    val kpSiglist: SigsetT,
    val kpSigignore: SigsetT,
    val kpSigcatch: SigsetT,
    val kpSigflag: CInt,
    val kpStart: Timeval,
    val kpComm: ByteArray,
    val kpUid: UidT,
    val kpNgroups: CShort,
    val kpGroups: List<GidT>,
    val kpRuid: UidT,
    val kpSvuid: UidT,
    val kpRgid: GidT,
    val kpSvgid: GidT,
    val kpPid: PidT,
    val kpPpid: PidT,
    val kpPgid: PidT,
    val kpJobc: CInt,
    val kpSid: PidT,
    val kpLogin: ByteArray,
    val kpTdev: DevT,
    val kpTpgid: PidT,
    val kpTsid: PidT,
    val kpExitstat: CUShort,
    val kpNthreads: CInt,
    val kpNice: CInt,
    val kpSwtime: CUInt,
    val kpVmMapSize: ULong,
    val kpVmRssize: SegszT,
    val kpVmSwrss: SegszT,
    val kpVmTsize: SegszT,
    val kpVmDsize: SegszT,
    val kpVmSsize: SegszT,
    val kpVmPrssize: CUInt,
    val kpJailid: CInt,
    val kpRu: Rusage,
    val kpCru: Rusage,
    val kpAuxflags: CInt,
    val kpLwp: KinfoLwp,
    val kpKtaddr: UintptrT,
    val kpSpare: IntArray,
)

public data class CAnonymousVmMap(
    val priv: List<UintptrT>,
)

public data class VmMapEntry(
    val priv: List<UintptrT>,
    val eflags: VmEflagsT,
    val maptype: VmMaptypeT,
    val protection: VmProtT,
    val maxProtection: VmProtT,
    val inheritance: VmInheritT,
    val wiredCount: CInt,
    val id: VmSubsysT,
)

public data class CAnonymousPmap(
    val priv1: List<UintptrT>,
    val priv2: List<UintptrT>,
    val priv3: List<UintptrT>,
    val priv4: List<UintptrT>,
    val priv5: List<UintptrT>,
)

public data class Vmspace(
    val vmMap: CAnonymousVmMap,
    val vmPmap: CAnonymousPmap,
    val vmFlags: CInt,
    val vmShm: String?,
    val vmRssize: SegszT,
    val vmSwrss: SegszT,
    val vmTsize: SegszT,
    val vmDsize: SegszT,
    val vmSsize: SegszT,
    val vmTaddr: String?,
    val vmDaddr: String?,
    val vmMaxsaddr: String?,
    val vmMinsaddr: String?,
    val vmPagesupply: CInt,
    val vmHoldcnt: CUInt,
    val vmRefcnt: CUInt,
)

public data class CpuctlMsrArgsT(
    val msr: CInt,
    val data: ULong,
)

public data class CpuctlCpuidArgsT(
    val level: CInt,
    val data: UIntArray,
)

public data class CpuctlCpuidCountArgsT(
    val level: CInt,
    val levelType: CInt,
    val data: UIntArray,
)

public data class CpuctlUpdateArgsT(
    val data: COpaquePointer?,
    val size: ULong,
)

public data class Utmpx(
    val utName: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
    val utSession: UShort,
    val utType: UShort,
    val utPid: PidT,
    val utExit: ExitStatus,
    val utSs: SockaddrStorage,
    val utTv: Timeval,
)

public data class Lastlogx(
    val llTv: Timeval,
    val llLine: ByteArray,
    val llHost: ByteArray,
    val llSs: SockaddrStorage,
)

public data class Dirent(
    val dFileno: InoT,
    val dNamlen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class Statfs(
    val spare2: CLong,
    val fBsize: CLong,
    val fIosize: CLong,
    val fBlocks: CLong,
    val fBfree: CLong,
    val fBavail: CLong,
    val fFiles: CLong,
    val fFfree: CLong,
    val fFsid: FsidT,
    val fOwner: UidT,
    val fType: CInt,
    val fFlags: CInt,
    val fSyncwrites: CLong,
    val fAsyncwrites: CLong,
    val fFstypename: ByteArray,
    val fMntonname: ByteArray,
    val fSyncreads: CLong,
    val fAsyncreads: CLong,
    val spares1: CShort,
    val fMntfromname: ByteArray,
    val spares2: CShort,
    val spare: LongArray,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
)

public data class McontextT(
    val mcOnstack: RegisterT,
    val mcRdi: RegisterT,
    val mcRsi: RegisterT,
    val mcRdx: RegisterT,
    val mcRcx: RegisterT,
    val mcR8: RegisterT,
    val mcR9: RegisterT,
    val mcRax: RegisterT,
    val mcRbx: RegisterT,
    val mcRbp: RegisterT,
    val mcR10: RegisterT,
    val mcR11: RegisterT,
    val mcR12: RegisterT,
    val mcR13: RegisterT,
    val mcR14: RegisterT,
    val mcR15: RegisterT,
    val mcXflags: RegisterT,
    val mcTrapno: RegisterT,
    val mcAddr: RegisterT,
    val mcFlags: RegisterT,
    val mcErr: RegisterT,
    val mcRip: RegisterT,
    val mcCs: RegisterT,
    val mcRflags: RegisterT,
    val mcRsp: RegisterT,
    val mcSs: RegisterT,
    val mcLen: CUInt,
    val mcFpformat: CUInt,
    val mcOwnedfp: CUInt,
    val mcFpregs: UIntArray,
)

public data class UcontextT(
    val ucSigmask: SigsetT,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucCofunc: ((UcontextT?, COpaquePointer?) -> Unit)?,
    val ucArg: COpaquePointer?,
)

public const val RAND_MAX: CInt = 0x7fff_ffff
public const val PTHREAD_STACK_MIN: ULong = 16384uL
public const val SIGSTKSZ: ULong = 40960uL
public const val SIGCKPT: CInt = 33
public const val SIGCKPTEXIT: CInt = 34
public const val CKPT_FREEZE: CInt = 0x1
public const val CKPT_THAW: CInt = 0x2
public const val MADV_INVAL: CInt = 10
public const val MADV_SETMAP: CInt = 11
public const val O_CLOEXEC: CInt = 0x00020000
public const val O_DIRECTORY: CInt = 0x08000000
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val F_GETPATH: CInt = 19
public const val ENOMEDIUM: CInt = 93
public const val ENOTRECOVERABLE: CInt = 94
public const val EOWNERDEAD: CInt = 95
public const val EASYNC: CInt = 99
public const val ELAST: CInt = 99
public const val RLIMIT_POSIXLOCKS: CInt = 11
public const val RLIM_NLIMITS: RlimT = 12uL
public const val Q_GETQUOTA: CInt = 0x300
public const val Q_SETQUOTA: CInt = 0x400
public const val CTL_UNSPEC: CInt = 0
public const val CTL_KERN: CInt = 1
public const val CTL_VM: CInt = 2
public const val CTL_VFS: CInt = 3
public const val CTL_NET: CInt = 4
public const val CTL_DEBUG: CInt = 5
public const val CTL_HW: CInt = 6
public const val CTL_MACHDEP: CInt = 7
public const val CTL_USER: CInt = 8
public const val CTL_P1003_1B: CInt = 9
public const val CTL_LWKT: CInt = 10
public const val CTL_MAXID: CInt = 11
public const val KERN_OSTYPE: CInt = 1
public const val KERN_OSRELEASE: CInt = 2
public const val KERN_OSREV: CInt = 3
public const val KERN_VERSION: CInt = 4
public const val KERN_MAXVNODES: CInt = 5
public const val KERN_MAXPROC: CInt = 6
public const val KERN_MAXFILES: CInt = 7
public const val KERN_ARGMAX: CInt = 8
public const val KERN_SECURELVL: CInt = 9
public const val KERN_HOSTNAME: CInt = 10
public const val KERN_HOSTID: CInt = 11
public const val KERN_CLOCKRATE: CInt = 12
public const val KERN_VNODE: CInt = 13
public const val KERN_PROC: CInt = 14
public const val KERN_FILE: CInt = 15
public const val KERN_PROF: CInt = 16
public const val KERN_POSIX1: CInt = 17
public const val KERN_NGROUPS: CInt = 18
public const val KERN_JOB_CONTROL: CInt = 19
public const val KERN_SAVED_IDS: CInt = 20
public const val KERN_BOOTTIME: CInt = 21
public const val KERN_NISDOMAINNAME: CInt = 22
public const val KERN_UPDATEINTERVAL: CInt = 23
public const val KERN_OSRELDATE: CInt = 24
public const val KERN_NTP_PLL: CInt = 25
public const val KERN_BOOTFILE: CInt = 26
public const val KERN_MAXFILESPERPROC: CInt = 27
public const val KERN_MAXPROCPERUID: CInt = 28
public const val KERN_DUMPDEV: CInt = 29
public const val KERN_IPC: CInt = 30
public const val KERN_DUMMY: CInt = 31
public const val KERN_PS_STRINGS: CInt = 32
public const val KERN_USRSTACK: CInt = 33
public const val KERN_LOGSIGEXIT: CInt = 34
public const val KERN_IOV_MAX: CInt = 35
public const val KERN_MAXPOSIXLOCKSPERUID: CInt = 36
public const val KERN_MAXID: CInt = 37
public const val KERN_PROC_ALL: CInt = 0
public const val KERN_PROC_PID: CInt = 1
public const val KERN_PROC_PGRP: CInt = 2
public const val KERN_PROC_SESSION: CInt = 3
public const val KERN_PROC_TTY: CInt = 4
public const val KERN_PROC_UID: CInt = 5
public const val KERN_PROC_RUID: CInt = 6
public const val KERN_PROC_ARGS: CInt = 7
public const val KERN_PROC_CWD: CInt = 8
public const val KERN_PROC_PATHNAME: CInt = 9
public const val KERN_PROC_FLAGMASK: CInt = 0x10
public const val KERN_PROC_FLAG_LWP: CInt = 0x10
public const val KIPC_MAXSOCKBUF: CInt = 1
public const val KIPC_SOCKBUF_WASTE: CInt = 2
public const val KIPC_SOMAXCONN: CInt = 3
public const val KIPC_MAX_LINKHDR: CInt = 4
public const val KIPC_MAX_PROTOHDR: CInt = 5
public const val KIPC_MAX_HDR: CInt = 6
public const val KIPC_MAX_DATALEN: CInt = 7
public const val KIPC_MBSTAT: CInt = 8
public const val KIPC_NMBCLUSTERS: CInt = 9
public const val HW_MACHINE: CInt = 1
public const val HW_MODEL: CInt = 2
public const val HW_NCPU: CInt = 3
public const val HW_BYTEORDER: CInt = 4
public const val HW_PHYSMEM: CInt = 5
public const val HW_USERMEM: CInt = 6
public const val HW_PAGESIZE: CInt = 7
public const val HW_DISKNAMES: CInt = 8
public const val HW_DISKSTATS: CInt = 9
public const val HW_FLOATINGPT: CInt = 10
public const val HW_MACHINE_ARCH: CInt = 11
public const val HW_MACHINE_PLATFORM: CInt = 12
public const val HW_SENSORS: CInt = 13
public const val HW_MAXID: CInt = 14
public const val USER_CS_PATH: CInt = 1
public const val USER_BC_BASE_MAX: CInt = 2
public const val USER_BC_DIM_MAX: CInt = 3
public const val USER_BC_SCALE_MAX: CInt = 4
public const val USER_BC_STRING_MAX: CInt = 5
public const val USER_COLL_WEIGHTS_MAX: CInt = 6
public const val USER_EXPR_NEST_MAX: CInt = 7
public const val USER_LINE_MAX: CInt = 8
public const val USER_RE_DUP_MAX: CInt = 9
public const val USER_POSIX2_VERSION: CInt = 10
public const val USER_POSIX2_C_BIND: CInt = 11
public const val USER_POSIX2_C_DEV: CInt = 12
public const val USER_POSIX2_CHAR_TERM: CInt = 13
public const val USER_POSIX2_FORT_DEV: CInt = 14
public const val USER_POSIX2_FORT_RUN: CInt = 15
public const val USER_POSIX2_LOCALEDEF: CInt = 16
public const val USER_POSIX2_SW_DEV: CInt = 17
public const val USER_POSIX2_UPE: CInt = 18
public const val USER_STREAM_MAX: CInt = 19
public const val USER_TZNAME_MAX: CInt = 20
public const val USER_MAXID: CInt = 21
public const val CTL_P1003_1B_ASYNCHRONOUS_IO: CInt = 1
public const val CTL_P1003_1B_MAPPED_FILES: CInt = 2
public const val CTL_P1003_1B_MEMLOCK: CInt = 3
public const val CTL_P1003_1B_MEMLOCK_RANGE: CInt = 4
public const val CTL_P1003_1B_MEMORY_PROTECTION: CInt = 5
public const val CTL_P1003_1B_MESSAGE_PASSING: CInt = 6
public const val CTL_P1003_1B_PRIORITIZED_IO: CInt = 7
public const val CTL_P1003_1B_PRIORITY_SCHEDULING: CInt = 8
public const val CTL_P1003_1B_REALTIME_SIGNALS: CInt = 9
public const val CTL_P1003_1B_SEMAPHORES: CInt = 10
public const val CTL_P1003_1B_FSYNC: CInt = 11
public const val CTL_P1003_1B_SHARED_MEMORY_OBJECTS: CInt = 12
public const val CTL_P1003_1B_SYNCHRONIZED_IO: CInt = 13
public const val CTL_P1003_1B_TIMERS: CInt = 14
public const val CTL_P1003_1B_AIO_LISTIO_MAX: CInt = 15
public const val CTL_P1003_1B_AIO_MAX: CInt = 16
public const val CTL_P1003_1B_AIO_PRIO_DELTA_MAX: CInt = 17
public const val CTL_P1003_1B_DELAYTIMER_MAX: CInt = 18
public const val CTL_P1003_1B_UNUSED1: CInt = 19
public const val CTL_P1003_1B_PAGESIZE: CInt = 20
public const val CTL_P1003_1B_RTSIG_MAX: CInt = 21
public const val CTL_P1003_1B_SEM_NSEMS_MAX: CInt = 22
public const val CTL_P1003_1B_SEM_VALUE_MAX: CInt = 23
public const val CTL_P1003_1B_SIGQUEUE_MAX: CInt = 24
public const val CTL_P1003_1B_TIMER_MAX: CInt = 25
public const val CTL_P1003_1B_MAXID: CInt = 26
public const val CPUCTL_RSMSR: CInt = 0xc0106301.toInt()
public const val CPUCTL_WRMSR: CInt = 0xc0106302.toInt()
public const val CPUCTL_CPUID: CInt = 0xc0106303.toInt()
public const val CPUCTL_UPDATE: CInt = 0xc0106304.toInt()
public const val CPUCTL_MSRSBIT: CInt = 0xc0106305.toInt()
public const val CPUCTL_MSRCBIT: CInt = 0xc0106306.toInt()
public const val CPUCTL_CPUID_COUNT: CInt = 0xc0106307.toInt()

// CPU_SETSIZE = size_of<CpumaskT>() * 8 (computed at the FFI boundary)
public const val EVFILT_READ: Short = -1
public const val EVFILT_WRITE: Short = -2
public const val EVFILT_AIO: Short = -3
public const val EVFILT_VNODE: Short = -4
public const val EVFILT_PROC: Short = -5
public const val EVFILT_SIGNAL: Short = -6
public const val EVFILT_TIMER: Short = -7
public const val EVFILT_EXCEPT: Short = -8
public const val EVFILT_USER: Short = -9
public const val EVFILT_FS: Short = -10
public val EV_ADD: UShort = (0x1).toUShort()
public val EV_DELETE: UShort = (0x2).toUShort()
public val EV_ENABLE: UShort = (0x4).toUShort()
public val EV_DISABLE: UShort = (0x8).toUShort()
public val EV_ONESHOT: UShort = (0x10).toUShort()
public val EV_CLEAR: UShort = (0x20).toUShort()
public val EV_RECEIPT: UShort = (0x40).toUShort()
public val EV_DISPATCH: UShort = (0x80).toUShort()
public val EV_NODATA: UShort = (0x1000).toUShort()
public val EV_FLAG1: UShort = (0x2000).toUShort()
public val EV_ERROR: UShort = (0x4000).toUShort()
public val EV_EOF: UShort = (0x8000).toUShort()
public val EV_HUP: UShort = (0x8000).toUShort()
public val EV_SYSFLAGS: UShort = (0xf000).toUShort()
public const val FIODNAME: CULong = 0x80106678uL
public const val NOTE_TRIGGER: UInt = 0x01000000u
public const val NOTE_FFNOP: UInt = 0x00000000u
public const val NOTE_FFAND: UInt = 0x40000000u
public const val NOTE_FFOR: UInt = 0x80000000u
public const val NOTE_FFCOPY: UInt = 0xc0000000u
public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u
public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu
public const val NOTE_LOWAT: UInt = 0x00000001u
public const val NOTE_OOB: UInt = 0x00000002u
public const val NOTE_DELETE: UInt = 0x00000001u
public const val NOTE_WRITE: UInt = 0x00000002u
public const val NOTE_EXTEND: UInt = 0x00000004u
public const val NOTE_ATTRIB: UInt = 0x00000008u
public const val NOTE_LINK: UInt = 0x00000010u
public const val NOTE_RENAME: UInt = 0x00000020u
public const val NOTE_REVOKE: UInt = 0x00000040u
public const val NOTE_EXIT: UInt = 0x80000000u
public const val NOTE_FORK: UInt = 0x40000000u
public const val NOTE_EXEC: UInt = 0x20000000u
public const val NOTE_PDATAMASK: UInt = 0x000fffffu
public const val NOTE_PCTRLMASK: UInt = 0xf0000000u
public const val NOTE_TRACK: UInt = 0x00000001u
public const val NOTE_TRACKERR: UInt = 0x00000002u
public const val NOTE_CHILD: UInt = 0x00000004u
public const val SO_SNDSPACE: CInt = 0x100a
public const val SO_CPUHINT: CInt = 0x1030
public const val SO_PASSCRED: CInt = 0x4000
public const val PT_FIRSTMACH: CInt = 32
public const val PROC_REAP_ACQUIRE: CInt = 0x0001
public const val PROC_REAP_RELEASE: CInt = 0x0002
public const val PROC_REAP_STATUS: CInt = 0x0003
public const val PROC_PDEATHSIG_CTL: CInt = 0x0004
public const val PROC_PDEATHSIG_STATUS: CInt = 0x0005
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_DEBUG: CInt = 0x4
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_SMART: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_ALLMULTI: CInt = 0x200
public const val IFF_OACTIVE_COMPAT: CInt = 0x400
public const val IFF_SIMPLEX: CInt = 0x800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_ALTPHYS: CInt = IFF_LINK2
public const val IFF_MULTICAST: CInt = 0x8000
public const val IFF_POLLING_COMPAT: CInt = 0x10000
public const val IFF_PPROMISC: CInt = 0x20000
public const val IFF_MONITOR: CInt = 0x40000
public const val IFF_STATICARP: CInt = 0x80000
public const val IFF_NPOLLING: CInt = 0x100000
public const val IFF_IDIRECT: CInt = 0x200000
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_GGP: CInt = 3
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_ST: CInt = 7
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PIGP: CInt = 9
public const val IPPROTO_RCCMON: CInt = 10
public const val IPPROTO_NVPII: CInt = 11
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_ARGUS: CInt = 13
public const val IPPROTO_EMCON: CInt = 14
public const val IPPROTO_XNET: CInt = 15
public const val IPPROTO_CHAOS: CInt = 16
public const val IPPROTO_MUX: CInt = 18
public const val IPPROTO_MEAS: CInt = 19
public const val IPPROTO_HMP: CInt = 20
public const val IPPROTO_PRM: CInt = 21
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_TRUNK1: CInt = 23
public const val IPPROTO_TRUNK2: CInt = 24
public const val IPPROTO_LEAF1: CInt = 25
public const val IPPROTO_LEAF2: CInt = 26
public const val IPPROTO_RDP: CInt = 27
public const val IPPROTO_IRTP: CInt = 28
public const val IPPROTO_TP: CInt = 29
public const val IPPROTO_BLT: CInt = 30
public const val IPPROTO_NSP: CInt = 31
public const val IPPROTO_INP: CInt = 32
public const val IPPROTO_SEP: CInt = 33
public const val IPPROTO_3PC: CInt = 34
public const val IPPROTO_IDPR: CInt = 35
public const val IPPROTO_XTP: CInt = 36
public const val IPPROTO_DDP: CInt = 37
public const val IPPROTO_CMTP: CInt = 38
public const val IPPROTO_TPXX: CInt = 39
public const val IPPROTO_IL: CInt = 40
public const val IPPROTO_SDRP: CInt = 42
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_IDRP: CInt = 45
public const val IPPROTO_RSVP: CInt = 46
public const val IPPROTO_GRE: CInt = 47
public const val IPPROTO_MHRP: CInt = 48
public const val IPPROTO_BHA: CInt = 49
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_INLSP: CInt = 52
public const val IPPROTO_SWIPE: CInt = 53
public const val IPPROTO_NHRP: CInt = 54
public const val IPPROTO_MOBILE: CInt = 55
public const val IPPROTO_TLSP: CInt = 56
public const val IPPROTO_SKIP: CInt = 57
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_AHIP: CInt = 61
public const val IPPROTO_CFTP: CInt = 62
public const val IPPROTO_HELLO: CInt = 63
public const val IPPROTO_SATEXPAK: CInt = 64
public const val IPPROTO_KRYPTOLAN: CInt = 65
public const val IPPROTO_RVD: CInt = 66
public const val IPPROTO_IPPC: CInt = 67
public const val IPPROTO_ADFS: CInt = 68
public const val IPPROTO_SATMON: CInt = 69
public const val IPPROTO_VISA: CInt = 70
public const val IPPROTO_IPCV: CInt = 71
public const val IPPROTO_CPNX: CInt = 72
public const val IPPROTO_CPHB: CInt = 73
public const val IPPROTO_WSN: CInt = 74
public const val IPPROTO_PVP: CInt = 75
public const val IPPROTO_BRSATMON: CInt = 76
public const val IPPROTO_ND: CInt = 77
public const val IPPROTO_WBMON: CInt = 78
public const val IPPROTO_WBEXPAK: CInt = 79
public const val IPPROTO_EON: CInt = 80
public const val IPPROTO_VMTP: CInt = 81
public const val IPPROTO_SVMTP: CInt = 82
public const val IPPROTO_VINES: CInt = 83
public const val IPPROTO_TTP: CInt = 84
public const val IPPROTO_IGP: CInt = 85
public const val IPPROTO_DGP: CInt = 86
public const val IPPROTO_TCF: CInt = 87
public const val IPPROTO_IGRP: CInt = 88
public const val IPPROTO_OSPFIGP: CInt = 89
public const val IPPROTO_SRPC: CInt = 90
public const val IPPROTO_LARP: CInt = 91
public const val IPPROTO_MTP: CInt = 92
public const val IPPROTO_AX25: CInt = 93
public const val IPPROTO_IPEIP: CInt = 94
public const val IPPROTO_MICP: CInt = 95
public const val IPPROTO_SCCSP: CInt = 96
public const val IPPROTO_ETHERIP: CInt = 97
public const val IPPROTO_ENCAP: CInt = 98
public const val IPPROTO_APES: CInt = 99
public const val IPPROTO_GMTP: CInt = 100
public const val IPPROTO_IPCOMP: CInt = 108
public const val IPPROTO_PIM: CInt = 103
public const val IPPROTO_CARP: CInt = 112
public const val IPPROTO_PGM: CInt = 113
public const val IPPROTO_PFSYNC: CInt = 240
public const val IPPROTO_DIVERT: CInt = 254
public const val IPPROTO_MAX: CInt = 256
public const val IPPROTO_DONE: CInt = 257
public const val IPPROTO_UNKNOWN: CInt = 258
public const val TCP_SIGNATURE_ENABLE: CInt = 16
public const val TCP_KEEPINIT: CInt = 32
public const val TCP_FASTKEEP: CInt = 128
public const val AF_BLUETOOTH: CInt = 33
public const val AF_MPLS: CInt = 34
public const val AF_IEEE80211: CInt = 35
public const val PF_BLUETOOTH: CInt = AF_BLUETOOTH
public const val NET_RT_DUMP: CInt = 1
public const val NET_RT_FLAGS: CInt = 2
public const val NET_RT_IFLIST: CInt = 3
public const val NET_RT_MAXID: CInt = 4
public const val SOMAXOPT_SIZE: CInt = 65536
public const val MSG_UNUSED09: CInt = 0x00000200
public const val MSG_NOSIGNAL: CInt = 0x00000400
public const val MSG_SYNC: CInt = 0x00000800
public const val MSG_CMSG_CLOEXEC: CInt = 0x00001000
public const val MSG_FBLOCKING: CInt = 0x00010000
public const val MSG_FNONBLOCKING: CInt = 0x00020000
public const val MSG_FMASK: CInt = 0xFFFF0000.toInt()
public const val MNT_NODEV: CInt = 0x00000010
public const val MNT_AUTOMOUNTED: CInt = 0x00000020
public const val MNT_TRIM: CInt = 0x01000000
public const val MNT_LOCAL: CInt = 0x00001000
public const val MNT_QUOTA: CInt = 0x00002000
public const val MNT_ROOTFS: CInt = 0x00004000
public const val MNT_USER: CInt = 0x00008000
public const val MNT_IGNORE: CInt = 0x00800000
public const val EMPTY: CShort = 0
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val OLD_TIME: CShort = 3
public const val NEW_TIME: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val ACCOUNTING: CShort = 9
public const val SIGNATURE: CShort = 10
public const val DOWNTIME: CShort = 11
public const val UTX_DB_UTMPX: CUInt = 0u
public const val UTX_DB_WTMPX: CUInt = 1u
public const val UTX_DB_LASTLOG: CUInt = 2u
public const val _UTX_LINESIZE: ULong = 32uL
public const val _UTX_USERSIZE: ULong = 32uL
public const val _UTX_IDSIZE: ULong = 4uL
public const val _UTX_HOSTSIZE: ULong = 256uL
public val LC_COLLATE_MASK: CInt = 1 shl 0
public val LC_CTYPE_MASK: CInt = 1 shl 1
public val LC_MONETARY_MASK: CInt = 1 shl 2
public val LC_NUMERIC_MASK: CInt = 1 shl 3
public val LC_TIME_MASK: CInt = 1 shl 4
public val LC_MESSAGES_MASK: CInt = 1 shl 5
public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK
public const val TIOCSIG: CULong = 0x2000745fuL
public const val BTUARTDISC: CInt = 0x7
public const val TIOCDCDTIMESTAMP: CULong = 0x40107458uL
public const val TIOCISPTMASTER: CULong = 0x20007455uL
public const val TIOCMODG: CULong = 0x40047403uL
public const val TIOCMODS: CULong = 0x80047404uL
public const val TIOCREMOTE: CULong = 0x80047469uL
public const val TIOCTIMESTAMP: CULong = 0x40107459uL
public const val AT_FDCWD: CInt = 0xFFFAFDCD.toInt()
public const val AT_SYMLINK_NOFOLLOW: CInt = 1
public const val AT_REMOVEDIR: CInt = 2
public const val AT_EACCESS: CInt = 4
public const val AT_SYMLINK_FOLLOW: CInt = 8
public const val VCHECKPT: ULong = 19uL
public const val _PC_2_SYMLINKS: CInt = 22
public const val _PC_TIMESTAMP_RESOLUTION: CInt = 23
public const val _CS_PATH: CInt = 1
public const val _SC_V7_ILP32_OFF32: CInt = 122
public const val _SC_V7_ILP32_OFFBIG: CInt = 123
public const val _SC_V7_LP64_OFF64: CInt = 124
public const val _SC_V7_LPBIG_OFFBIG: CInt = 125
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 126
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 127
public const val WCONTINUED: CInt = 0x4
public const val WSTOPPED: CInt = 0x2
public const val WNOWAIT: CInt = 0x8
public const val WEXITED: CInt = 0x10
public const val WTRAPPED: CInt = 0x20
public const val P_PID: IdtypeT = 0u
public const val P_PGID: IdtypeT = 2u
public const val P_ALL: IdtypeT = 7u
public val RTP_PRIO_REALTIME: CUShort = (0).toUShort()
public val RTP_PRIO_NORMAL: CUShort = (1).toUShort()
public val RTP_PRIO_IDLE: CUShort = (2).toUShort()
public val RTP_PRIO_THREAD: CUShort = (3).toUShort()
public const val UF_NOHISTORY: CULong = 0x00000040uL
public const val UF_CACHE: CULong = 0x00000080uL
public const val UF_XLINK: CULong = 0x00000100uL
public const val SF_NOHISTORY: CULong = 0x00400000uL
public const val SF_CACHE: CULong = 0x00800000uL
public const val SF_XLINK: CULong = 0x01000000uL
public const val UTIME_OMIT: CLong = -2
public const val UTIME_NOW: CLong = -1
public const val MINCORE_SUPER: CInt = 0x20
public const val MAXCOMLEN: ULong = 16uL
public const val MAXLOGNAME: ULong = 33uL
public const val NGROUPS: ULong = 16uL
public const val RB_PAUSE: CInt = 0x40000
public const val RB_VIDEO: CInt = 0x20000000
public const val RTF_CLONING: CInt = 0x100
public const val RTF_PRCLONING: CInt = 0x10000
public const val RTF_WASCLONED: CInt = 0x20000
public const val RTF_MPLSOPS: CInt = 0x1000000
public const val RTM_VERSION: CInt = 7
public const val RTAX_MPLS1: CInt = 8
public const val RTAX_MPLS2: CInt = 9
public const val RTAX_MPLS3: CInt = 10
public const val RTAX_MAX: CInt = 11

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cPUZERO(cpuset: CpuSetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun errnoLocation(): CInt?

public expect fun setgrent()

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun setutxdb(type: CUInt, file: String?): CInt

public expect fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt

public expect fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: ULong): String?

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: Rtprio?): CInt

public expect fun statfs(path: String?, buf: Statfs?): CInt

public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt

public expect fun uname(buf: Utsname?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt

public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt

public expect fun schedGetcpu(): CInt

public expect fun setproctitle(fmt: String?, vararg args: Any?)

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt

public expect fun updwtmpx(file: String?, ut: Utmpx?): CInt

public expect fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx?

public expect fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt

public expect fun getutxuser(name: String?): Utmpx

public expect fun utmpxname(file: String?): CInt

public expect fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt

public expect fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt

public expect fun umtxWakeup(ptr: CInt?, count: CInt): CInt

public expect fun dirname(path: String?): String?

public expect fun basename(path: String?): String?

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt

public expect fun closefrom(lowfd: CInt): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun freezero(ptr: COpaquePointer?, size: ULong)

public expect fun kvmVmMapEntryFirst(kvm: KvmT?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT

public expect fun kvmVmMapEntryNext(kvm: KvmT?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT
