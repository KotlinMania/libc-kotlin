// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public typealias WcharT = Int
public typealias DevT = UInt
public typealias SocklenT = UInt
public typealias PthreadT = CULong
public typealias ModeT = UInt
public typealias ShmattT = CULong
public typealias MqdT = CInt
public typealias MsgqnumT = CULong
public typealias MsglenT = CULong
public typealias NfdsT = CULong
public typealias NlItem = CInt
public typealias IdtypeT = CUInt
public typealias LoffT = Long
public typealias PthreadKeyT = CUInt
public typealias ClockT = CLong
public typealias TimeT = Long
public typealias SusecondsT = CLong
public typealias InoT = ULong
public typealias OffT = Long
public typealias BlkcntT = Int
public typealias BlksizeT = CLong
public typealias FsblkcntT = UInt
public typealias FsfilcntT = UInt
public typealias RlimT = ULong
public typealias NlinkT = UInt
public typealias Ino64T = InoT
public typealias Off64T = OffT
public typealias Blkcnt64T = BlkcntT
public typealias Rlim64T = RlimT
public typealias Rlimit64 = Rlimit
public typealias Flock64 = Flock
public typealias Stat64 = Stat
public typealias Statfs64 = Statfs
public typealias Statvfs64 = Statvfs
public typealias Dirent64 = Dirent

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: CLong,
    val spMin: CLong,
    val spMax: CLong,
    val spWarn: CLong,
    val spInact: CLong,
    val spExpire: CLong,
    val spFlag: CULong,
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
    val fSpare: IntArray,
)

public data class SignalfdSiginfo(
    val ssiSigno: UInt,
    val ssiErrno: Int,
    val ssiCode: Int,
    val ssiPid: UInt,
    val ssiUid: UInt,
    val ssiFd: Int,
    val ssiTid: UInt,
    val ssiBand: UInt,
    val ssiOverrun: UInt,
    val ssiTrapno: UInt,
    val ssiStatus: Int,
    val ssiInt: Int,
    val ssiPtr: ULong,
    val ssiUtime: ULong,
    val ssiStime: ULong,
    val ssiAddr: ULong,
    val ssiAddrLsb: UShort,
    val ssiSyscall: Int,
    val ssiCallAddr: ULong,
    val ssiArch: UInt,
)

public data class FsidT(
    val `val`: IntArray,
)

public data class CpuSetT(
    val bits: UIntArray,
)

public data class Msginfo(
    val msgpool: CInt,
    val msgmap: CInt,
    val msgmax: CInt,
    val msgmnb: CInt,
    val msgmni: CInt,
    val msgssz: CInt,
    val msgtql: CInt,
    val msgseg: CUShort,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: (() -> Unit)?,
)

public data class IpcPerm(
    val ipcPermKey: KeyT,
    val uid: UidT,
    val gid: GidT,
    val cuid: UidT,
    val cgid: GidT,
    val mode: ModeT,
    val seq: CInt,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CcT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class PthreadAttrT(
    val size: UIntArray,
)

public data class SigsetT(
    val `val`: ULongArray,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class SemT(
    val `val`: IntArray,
)

public data class Stat(
    val stDev: DevT,
    val stInoTruncated: CLong,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stIno: InoT,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmCpid: PidT,
    val shmLpid: PidT,
    val shmNattch: CULong,
)

public data class MsqidDs(
    val msgPerm: IpcPerm,
    val msgStime: TimeT,
    val msgRtime: TimeT,
    val msgCtime: TimeT,
    val msgCbytes: CULong,
    val msgQnum: MsgqnumT,
    val msgQbytes: MsglenT,
    val msgLspid: PidT,
    val msgLrpid: PidT,
)

public data class Statfs(
    val fType: CULong,
    val fBsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFrsize: CULong,
    val fFlags: CULong,
    val fSpare: ULongArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val pad: IntArray,
    val align: List<ULong>,
)

public data class ArpdRequest(
    val req: CUShort,
    val ip: UInt,
    val dev: CULong,
    val stamp: CULong,
    val updated: CULong,
    val ha: UByteArray,
)

public data class PthreadMutexT(
    val size: UByteArray,
)

public data class PthreadRwlockT(
    val size: UByteArray,
)

public data class PthreadMutexattrT(
    val size: UByteArray,
)

public data class PthreadRwlockattrT(
    val size: UByteArray,
)

public data class PthreadCondattrT(
    val size: UByteArray,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class Sysinfo(
    val uptime: CULong,
    val loads: ULongArray,
    val totalram: CULong,
    val freeram: CULong,
    val sharedram: CULong,
    val bufferram: CULong,
    val totalswap: CULong,
    val freeswap: CULong,
    val procs: CUShort,
    val pad: CUShort,
    val totalhigh: CULong,
    val freehigh: CULong,
    val memUnit: CUInt,
    val reserved: ByteArray,
)

public data class MqAttr(
    val mqFlags: CLong,
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqCurmsgs: CLong,
)

public data class PthreadCondT(
    val size: UByteArray,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

public const val MADV_SOFT_OFFLINE: CInt = 101
public const val MS_NOUSER: CULong = 0x80000000uL
public const val MS_RMT_MASK: CULong = 0x02800051uL
public const val ABDAY_1: NlItem = 0x20000
public const val ABDAY_2: NlItem = 0x20001
public const val ABDAY_3: NlItem = 0x20002
public const val ABDAY_4: NlItem = 0x20003
public const val ABDAY_5: NlItem = 0x20004
public const val ABDAY_6: NlItem = 0x20005
public const val ABDAY_7: NlItem = 0x20006
public const val DAY_1: NlItem = 0x20007
public const val DAY_2: NlItem = 0x20008
public const val DAY_3: NlItem = 0x20009
public const val DAY_4: NlItem = 0x2000A
public const val DAY_5: NlItem = 0x2000B
public const val DAY_6: NlItem = 0x2000C
public const val DAY_7: NlItem = 0x2000D
public const val ABMON_1: NlItem = 0x2000E
public const val ABMON_2: NlItem = 0x2000F
public const val ABMON_3: NlItem = 0x20010
public const val ABMON_4: NlItem = 0x20011
public const val ABMON_5: NlItem = 0x20012
public const val ABMON_6: NlItem = 0x20013
public const val ABMON_7: NlItem = 0x20014
public const val ABMON_8: NlItem = 0x20015
public const val ABMON_9: NlItem = 0x20016
public const val ABMON_10: NlItem = 0x20017
public const val ABMON_11: NlItem = 0x20018
public const val ABMON_12: NlItem = 0x20019
public const val MON_1: NlItem = 0x2001A
public const val MON_2: NlItem = 0x2001B
public const val MON_3: NlItem = 0x2001C
public const val MON_4: NlItem = 0x2001D
public const val MON_5: NlItem = 0x2001E
public const val MON_6: NlItem = 0x2001F
public const val MON_7: NlItem = 0x20020
public const val MON_8: NlItem = 0x20021
public const val MON_9: NlItem = 0x20022
public const val MON_10: NlItem = 0x20023
public const val MON_11: NlItem = 0x20024
public const val MON_12: NlItem = 0x20025
public const val AM_STR: NlItem = 0x20026
public const val PM_STR: NlItem = 0x20027
public const val D_T_FMT: NlItem = 0x20028
public const val D_FMT: NlItem = 0x20029
public const val T_FMT: NlItem = 0x2002A
public const val T_FMT_AMPM: NlItem = 0x2002B
public const val ERA: NlItem = 0x2002C
public const val ERA_D_FMT: NlItem = 0x2002E
public const val ALT_DIGITS: NlItem = 0x2002F
public const val ERA_D_T_FMT: NlItem = 0x20030
public const val ERA_T_FMT: NlItem = 0x20031
public const val CODESET: NlItem = 14
public const val CRNCYSTR: NlItem = 0x4000F
public const val RUSAGE_THREAD: CInt = 1
public const val RUSAGE_CHILDREN: CInt = -1
public const val RADIXCHAR: NlItem = 0x10000
public const val THOUSEP: NlItem = 0x10001
public const val YESEXPR: NlItem = 0x50000
public const val NOEXPR: NlItem = 0x50001
public const val YESSTR: NlItem = 0x50002
public const val NOSTR: NlItem = 0x50003
public const val FILENAME_MAX: CUInt = 4096u
public const val L_tmpnam: CUInt = 20u
public const val _PC_LINK_MAX: CInt = 0
public const val _PC_MAX_CANON: CInt = 1
public const val _PC_MAX_INPUT: CInt = 2
public const val _PC_NAME_MAX: CInt = 3
public const val _PC_PATH_MAX: CInt = 4
public const val _PC_PIPE_BUF: CInt = 5
public const val _PC_CHOWN_RESTRICTED: CInt = 6
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_SYNC_IO: CInt = 9
public const val _PC_ASYNC_IO: CInt = 10
public const val _PC_PRIO_IO: CInt = 11
public const val _PC_SOCK_MAXBUF: CInt = 12
public const val _PC_FILESIZEBITS: CInt = 13
public const val _PC_REC_INCR_XFER_SIZE: CInt = 14
public const val _PC_REC_MAX_XFER_SIZE: CInt = 15
public const val _PC_REC_MIN_XFER_SIZE: CInt = 16
public const val _PC_REC_XFER_ALIGN: CInt = 17
public const val _PC_ALLOC_SIZE_MIN: CInt = 18
public const val _PC_SYMLINK_MAX: CInt = 19
public const val _PC_2_SYMLINKS: CInt = 20
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_STREAM_MAX: CInt = 5
public const val _SC_TZNAME_MAX: CInt = 6
public const val _SC_JOB_CONTROL: CInt = 7
public const val _SC_SAVED_IDS: CInt = 8
public const val _SC_REALTIME_SIGNALS: CInt = 9
public const val _SC_PRIORITY_SCHEDULING: CInt = 10
public const val _SC_TIMERS: CInt = 11
public const val _SC_ASYNCHRONOUS_IO: CInt = 12
public const val _SC_PRIORITIZED_IO: CInt = 13
public const val _SC_SYNCHRONIZED_IO: CInt = 14
public const val _SC_FSYNC: CInt = 15
public const val _SC_MAPPED_FILES: CInt = 16
public const val _SC_MEMLOCK: CInt = 17
public const val _SC_MEMLOCK_RANGE: CInt = 18
public const val _SC_MEMORY_PROTECTION: CInt = 19
public const val _SC_MESSAGE_PASSING: CInt = 20
public const val _SC_SEMAPHORES: CInt = 21
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 22
public const val _SC_AIO_LISTIO_MAX: CInt = 23
public const val _SC_AIO_MAX: CInt = 24
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 25
public const val _SC_DELAYTIMER_MAX: CInt = 26
public const val _SC_MQ_OPEN_MAX: CInt = 27
public const val _SC_MQ_PRIO_MAX: CInt = 28
public const val _SC_VERSION: CInt = 29
public const val _SC_PAGESIZE: CInt = 30
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_RTSIG_MAX: CInt = 31
public const val _SC_SEM_NSEMS_MAX: CInt = 32
public const val _SC_SEM_VALUE_MAX: CInt = 33
public const val _SC_SIGQUEUE_MAX: CInt = 34
public const val _SC_TIMER_MAX: CInt = 35
public const val _SC_BC_BASE_MAX: CInt = 36
public const val _SC_BC_DIM_MAX: CInt = 37
public const val _SC_BC_SCALE_MAX: CInt = 38
public const val _SC_BC_STRING_MAX: CInt = 39
public const val _SC_COLL_WEIGHTS_MAX: CInt = 40
public const val _SC_EXPR_NEST_MAX: CInt = 42
public const val _SC_LINE_MAX: CInt = 43
public const val _SC_RE_DUP_MAX: CInt = 44
public const val _SC_2_VERSION: CInt = 46
public const val _SC_2_C_BIND: CInt = 47
public const val _SC_2_C_DEV: CInt = 48
public const val _SC_2_FORT_DEV: CInt = 49
public const val _SC_2_FORT_RUN: CInt = 50
public const val _SC_2_SW_DEV: CInt = 51
public const val _SC_2_LOCALEDEF: CInt = 52
public const val _SC_UIO_MAXIOV: CInt = 60
public const val _SC_IOV_MAX: CInt = 60
public const val _SC_THREADS: CInt = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 68
public const val _SC_GETGR_R_SIZE_MAX: CInt = 69
public const val _SC_GETPW_R_SIZE_MAX: CInt = 70
public const val _SC_LOGIN_NAME_MAX: CInt = 71
public const val _SC_TTY_NAME_MAX: CInt = 72
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73
public const val _SC_THREAD_KEYS_MAX: CInt = 74
public const val _SC_THREAD_STACK_MIN: CInt = 75
public const val _SC_THREAD_THREADS_MAX: CInt = 76
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 77
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 78
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 79
public const val _SC_THREAD_PRIO_INHERIT: CInt = 80
public const val _SC_THREAD_PRIO_PROTECT: CInt = 81
public const val _SC_THREAD_PROCESS_SHARED: CInt = 82
public const val _SC_NPROCESSORS_CONF: CInt = 83
public const val _SC_NPROCESSORS_ONLN: CInt = 84
public const val _SC_PHYS_PAGES: CInt = 85
public const val _SC_AVPHYS_PAGES: CInt = 86
public const val _SC_ATEXIT_MAX: CInt = 87
public const val _SC_PASS_MAX: CInt = 88
public const val _SC_XOPEN_VERSION: CInt = 89
public const val _SC_XOPEN_XCU_VERSION: CInt = 90
public const val _SC_XOPEN_UNIX: CInt = 91
public const val _SC_XOPEN_CRYPT: CInt = 92
public const val _SC_XOPEN_ENH_I18N: CInt = 93
public const val _SC_XOPEN_SHM: CInt = 94
public const val _SC_2_CHAR_TERM: CInt = 95
public const val _SC_2_UPE: CInt = 97
public const val _SC_XOPEN_XPG2: CInt = 98
public const val _SC_XOPEN_XPG3: CInt = 99
public const val _SC_XOPEN_XPG4: CInt = 100
public const val _SC_NZERO: CInt = 109
public const val _SC_XBS5_ILP32_OFF32: CInt = 125
public const val _SC_XBS5_ILP32_OFFBIG: CInt = 126
public const val _SC_XBS5_LP64_OFF64: CInt = 127
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = 128
public const val _SC_XOPEN_LEGACY: CInt = 129
public const val _SC_XOPEN_REALTIME: CInt = 130
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 131
public const val _SC_ADVISORY_INFO: CInt = 132
public const val _SC_BARRIERS: CInt = 133
public const val _SC_CLOCK_SELECTION: CInt = 137
public const val _SC_CPUTIME: CInt = 138
public const val _SC_THREAD_CPUTIME: CInt = 139
public const val _SC_MONOTONIC_CLOCK: CInt = 149
public const val _SC_READER_WRITER_LOCKS: CInt = 153
public const val _SC_SPIN_LOCKS: CInt = 154
public const val _SC_REGEXP: CInt = 155
public const val _SC_SHELL: CInt = 157
public const val _SC_SPAWN: CInt = 159
public const val _SC_SPORADIC_SERVER: CInt = 160
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 161
public const val _SC_TIMEOUTS: CInt = 164
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 165
public const val _SC_2_PBS: CInt = 168
public const val _SC_2_PBS_ACCOUNTING: CInt = 169
public const val _SC_2_PBS_LOCATE: CInt = 170
public const val _SC_2_PBS_MESSAGE: CInt = 171
public const val _SC_2_PBS_TRACK: CInt = 172
public const val _SC_SYMLOOP_MAX: CInt = 173
public const val _SC_STREAMS: CInt = 174
public const val _SC_2_PBS_CHECKPOINT: CInt = 175
public const val _SC_V6_ILP32_OFF32: CInt = 176
public const val _SC_V6_ILP32_OFFBIG: CInt = 177
public const val _SC_V6_LP64_OFF64: CInt = 178
public const val _SC_V6_LPBIG_OFFBIG: CInt = 179
public const val _SC_HOST_NAME_MAX: CInt = 180
public const val _SC_TRACE: CInt = 181
public const val _SC_TRACE_EVENT_FILTER: CInt = 182
public const val _SC_TRACE_INHERIT: CInt = 183
public const val _SC_TRACE_LOG: CInt = 184
public const val _SC_IPV6: CInt = 235
public const val _SC_RAW_SOCKETS: CInt = 236
public const val _SC_V7_ILP32_OFF32: CInt = 237
public const val _SC_V7_ILP32_OFFBIG: CInt = 238
public const val _SC_V7_LP64_OFF64: CInt = 239
public const val _SC_V7_LPBIG_OFFBIG: CInt = 240
public const val _SC_SS_REPL_MAX: CInt = 241
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 242
public const val _SC_TRACE_NAME_MAX: CInt = 243
public const val _SC_TRACE_SYS_MAX: CInt = 244
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 245
public const val _SC_XOPEN_STREAMS: CInt = 246
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public val GLOB_ERR: CInt = 1 shl 0
public val GLOB_MARK: CInt = 1 shl 1
public val GLOB_NOSORT: CInt = 1 shl 2
public val GLOB_DOOFFS: CInt = 1 shl 3
public val GLOB_NOCHECK: CInt = 1 shl 4
public val GLOB_APPEND: CInt = 1 shl 5
public val GLOB_NOESCAPE: CInt = 1 shl 6
public const val GLOB_NOSPACE: CInt = 1
public const val GLOB_ABORTED: CInt = 2
public const val GLOB_NOMATCH: CInt = 3
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val AT_EACCESS: CInt = 0x200
public const val S_IEXEC: ModeT = 64u
public const val S_IWRITE: ModeT = 128u
public const val S_IREAD: ModeT = 256u
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val ST_RDONLY: CULong = 1uL
public const val ST_NOSUID: CULong = 2uL
public const val ST_NODEV: CULong = 4uL
public const val ST_NOEXEC: CULong = 8uL
public const val ST_SYNCHRONOUS: CULong = 16uL
public const val ST_MANDLOCK: CULong = 64uL
public const val ST_WRITE: CULong = 128uL
public const val ST_APPEND: CULong = 256uL
public const val ST_IMMUTABLE: CULong = 512uL
public const val ST_NOATIME: CULong = 1024uL
public const val ST_NODIRATIME: CULong = 2048uL
public const val RTLD_NODELETE: CInt = 0x1000
public const val RTLD_NOW: CInt = 0x2

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_BATCH: CInt = 3
public const val SCHED_IDLE: CInt = 5
public const val AF_IB: CInt = 27
public const val AF_MPLS: CInt = 28
public const val AF_NFC: CInt = 39
public const val AF_VSOCK: CInt = 40
public const val PF_IB: CInt = AF_IB
public const val PF_MPLS: CInt = AF_MPLS
public const val PF_NFC: CInt = AF_NFC
public const val PF_VSOCK: CInt = AF_VSOCK
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val IPC_INFO: CInt = 3
public const val MSG_STAT: CInt = 11
public const val MSG_INFO: CInt = 12
public const val MSG_NOERROR: CInt = 4096
public const val MSG_EXCEPT: CInt = 8192
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_REMAP: CInt = 16384
public const val SHM_EXEC: CInt = 32768
public const val SHM_LOCK: CInt = 11
public const val SHM_UNLOCK: CInt = 12
public const val SHM_HUGETLB: CInt = 2048
public const val SHM_NORESERVE: CInt = 4096
public const val LOG_NFACILITIES: CInt = 24
public const val AI_PASSIVE: CInt = 0x0001
public const val AI_CANONNAME: CInt = 0x0002
public const val AI_NUMERICHOST: CInt = 0x0004
public const val AI_V4MAPPED: CInt = 0x0008
public const val AI_ALL: CInt = 0x0010
public const val AI_ADDRCONFIG: CInt = 0x0020
public const val AI_NUMERICSERV: CInt = 0x0400
public const val EAI_BADFLAGS: CInt = -1
public const val EAI_NONAME: CInt = -2
public const val EAI_AGAIN: CInt = -3
public const val EAI_FAIL: CInt = -4
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_MEMORY: CInt = -10
public const val EAI_OVERFLOW: CInt = -12
public const val NI_NUMERICHOST: CInt = 1
public const val NI_NUMERICSERV: CInt = 2
public const val NI_NOFQDN: CInt = 4
public const val NI_NAMEREQD: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val SYNC_FILE_RANGE_WAIT_BEFORE: CUInt = 1u
public const val SYNC_FILE_RANGE_WRITE: CUInt = 2u
public const val SYNC_FILE_RANGE_WAIT_AFTER: CUInt = 4u
public const val EAI_SYSTEM: CInt = -11
public const val MREMAP_MAYMOVE: CInt = 1
public const val MREMAP_FIXED: CInt = 2
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val _POSIX_VDISABLE: CcT = 0u
public const val FALLOC_FL_KEEP_SIZE: CInt = 0x01
public const val FALLOC_FL_PUNCH_HOLE: CInt = 0x02
public const val NCCS: ULong = 32uL
public const val O_TRUNC: CInt = 512
public const val O_NOATIME: CInt = 262144
public const val O_CLOEXEC: CInt = 0x80000
public const val EPERM: CInt = 63
public const val ENOENT: CInt = 44
public const val ESRCH: CInt = 71
public const val EINTR: CInt = 27
public const val EIO: CInt = 29
public const val ENXIO: CInt = 60
public const val E2BIG: CInt = 1
public const val ENOEXEC: CInt = 45
public const val EBADF: CInt = 8
public const val ECHILD: CInt = 12
public const val EAGAIN: CInt = 6
public const val ENOMEM: CInt = 48
public const val EACCES: CInt = 2
public const val EFAULT: CInt = 21
public const val ENOTBLK: CInt = 105
public const val EBUSY: CInt = 10
public const val EEXIST: CInt = 20
public const val EXDEV: CInt = 75
public const val ENODEV: CInt = 43
public const val ENOTDIR: CInt = 54
public const val EISDIR: CInt = 31
public const val EINVAL: CInt = 28
public const val ENFILE: CInt = 41
public const val EMFILE: CInt = 33
public const val ENOTTY: CInt = 59
public const val ETXTBSY: CInt = 74
public const val EFBIG: CInt = 22
public const val ENOSPC: CInt = 51
public const val ESPIPE: CInt = 70
public const val EROFS: CInt = 69
public const val EMLINK: CInt = 34
public const val EPIPE: CInt = 64
public const val EDOM: CInt = 18
public const val ERANGE: CInt = 68
public const val EWOULDBLOCK: CInt = EAGAIN
public const val ENOLINK: CInt = 47
public const val EPROTO: CInt = 65
public const val EDEADLK: CInt = 16
public const val EDEADLOCK: CInt = EDEADLK
public const val ENAMETOOLONG: CInt = 37
public const val ENOLCK: CInt = 46
public const val ENOSYS: CInt = 52
public const val ENOTEMPTY: CInt = 55
public const val ELOOP: CInt = 32
public const val ENOMSG: CInt = 49
public const val EIDRM: CInt = 24
public const val EMULTIHOP: CInt = 36
public const val EBADMSG: CInt = 9
public const val EOVERFLOW: CInt = 61
public const val EILSEQ: CInt = 25
public const val ENOTSOCK: CInt = 57
public const val EDESTADDRREQ: CInt = 17
public const val EMSGSIZE: CInt = 35
public const val EPROTOTYPE: CInt = 67
public const val ENOPROTOOPT: CInt = 50
public const val EPROTONOSUPPORT: CInt = 66
public const val EAFNOSUPPORT: CInt = 5
public const val EADDRINUSE: CInt = 3
public const val EADDRNOTAVAIL: CInt = 4
public const val ENETDOWN: CInt = 38
public const val ENETUNREACH: CInt = 40
public const val ENETRESET: CInt = 39
public const val ECONNABORTED: CInt = 13
public const val ECONNRESET: CInt = 15
public const val ENOBUFS: CInt = 42
public const val EISCONN: CInt = 30
public const val ENOTCONN: CInt = 53
public const val ETIMEDOUT: CInt = 73
public const val ECONNREFUSED: CInt = 14
public const val EHOSTUNREACH: CInt = 23
public const val EALREADY: CInt = 7
public const val EINPROGRESS: CInt = 26
public const val ESTALE: CInt = 72
public const val EDQUOT: CInt = 19
public const val ECANCELED: CInt = 11
public const val EOWNERDEAD: CInt = 62
public const val ENOTRECOVERABLE: CInt = 56
public const val ENOSTR: CInt = 100
public const val EBFONT: CInt = 101
public const val EBADSLT: CInt = 102
public const val EBADRQC: CInt = 103
public const val ENOANO: CInt = 104
public const val ECHRNG: CInt = 106
public const val EL3HLT: CInt = 107
public const val EL3RST: CInt = 108
public const val ELNRNG: CInt = 109
public const val EUNATCH: CInt = 110
public const val ENOCSI: CInt = 111
public const val EL2HLT: CInt = 112
public const val EBADE: CInt = 113
public const val EBADR: CInt = 114
public const val EXFULL: CInt = 115
public const val ENODATA: CInt = 116
public const val ETIME: CInt = 117
public const val ENOSR: CInt = 118
public const val ENONET: CInt = 119
public const val ENOPKG: CInt = 120
public const val EREMOTE: CInt = 121
public const val EADV: CInt = 122
public const val ESRMNT: CInt = 123
public const val ECOMM: CInt = 124
public const val EDOTDOT: CInt = 125
public const val ENOTUNIQ: CInt = 126
public const val EBADFD: CInt = 127
public const val EREMCHG: CInt = 128
public const val ELIBACC: CInt = 129
public const val ELIBBAD: CInt = 130
public const val ELIBSCN: CInt = 131
public const val ELIBMAX: CInt = 132
public const val ELIBEXEC: CInt = 133
public const val ERESTART: CInt = 134
public const val ESTRPIPE: CInt = 135
public const val EUSERS: CInt = 136
public const val ESOCKTNOSUPPORT: CInt = 137
public const val EOPNOTSUPP: CInt = 138
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val EPFNOSUPPORT: CInt = 139
public const val ESHUTDOWN: CInt = 140
public const val ETOOMANYREFS: CInt = 141
public const val EHOSTDOWN: CInt = 142
public const val EUCLEAN: CInt = 143
public const val ENOTNAM: CInt = 144
public const val ENAVAIL: CInt = 145
public const val EISNAM: CInt = 146
public const val EREMOTEIO: CInt = 147
public const val ENOMEDIUM: CInt = 148
public const val EMEDIUMTYPE: CInt = 149
public const val ENOKEY: CInt = 150
public const val EKEYEXPIRED: CInt = 151
public const val EKEYREVOKED: CInt = 152
public const val EKEYREJECTED: CInt = 153
public const val ERFKILL: CInt = 154
public const val EHWPOISON: CInt = 155
public const val EL2NSYNC: CInt = 156
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_RESETHAND: CInt = 0x80000000.toInt()
public const val SA_RESTART: CInt = 0x10000000
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val BUFSIZ: CUInt = 1024u
public const val TMP_MAX: CUInt = 10000u
public const val FOPEN_MAX: CUInt = 1000u
public const val O_PATH: CInt = 2097152
public const val O_EXEC: CInt = 2097152
public const val O_SEARCH: CInt = 2097152
public const val O_ACCMODE: CInt = 2097155
public const val O_NDELAY: CInt = O_NONBLOCK
public const val NI_MAXHOST: SocklenT = 255u
public const val PTHREAD_STACK_MIN: ULong = 2048uL
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val POSIX_MADV_DONTNEED: CInt = 4
public val RLIM_INFINITY: RlimT = 0uL.inv()
public const val RLIMIT_NLIMITS: CInt = 16
public const val RLIM_NLIMITS: CInt = RLIMIT_NLIMITS
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val SIGUNUSED: CInt = SIGSYS
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val CPU_SETSIZE: CInt = 1024
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val TIOCINQ: CInt = FIONREAD
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_NOLOAD: CInt = 0x4
public const val CLOCK_SGI_CYCLE: ClockidT = 10
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val SIGSTKSZ: ULong = 8192uL
public const val MINSIGSTKSZ: ULong = 2048uL
public const val CBAUD: TcflagT = 4111u
public const val TAB1: CInt = 0x00000800
public const val TAB2: CInt = 0x00001000
public const val TAB3: CInt = 0x00001800
public const val CR1: CInt = 0x00000200
public const val CR2: CInt = 0x00000400
public const val CR3: CInt = 0x00000600
public const val FF1: CInt = 0x00008000
public const val BS1: CInt = 0x00002000
public const val VT1: CInt = 0x00004000
public const val VWERASE: ULong = 14uL
public const val VREPRINT: ULong = 12uL
public const val VSUSP: ULong = 10uL
public const val VSTART: ULong = 8uL
public const val VSTOP: ULong = 9uL
public const val VDISCARD: ULong = 13uL
public const val VTIME: ULong = 5uL
public const val IXON: TcflagT = 0x00000400u
public const val IXOFF: TcflagT = 0x00001000u
public const val ONLCR: TcflagT = 0x4u
public const val CSIZE: TcflagT = 0x00000030u
public const val CS6: TcflagT = 0x00000010u
public const val CS7: TcflagT = 0x00000020u
public const val CS8: TcflagT = 0x00000030u
public const val CSTOPB: TcflagT = 0x00000040u
public const val CREAD: TcflagT = 0x00000080u
public const val PARENB: TcflagT = 0x00000100u
public const val PARODD: TcflagT = 0x00000200u
public const val HUPCL: TcflagT = 0x00000400u
public const val CLOCAL: TcflagT = 0x00000800u
public const val ECHOKE: TcflagT = 0x00000800u
public const val ECHOE: TcflagT = 0x00000010u
public const val ECHOK: TcflagT = 0x00000020u
public const val ECHONL: TcflagT = 0x00000040u
public const val ECHOPRT: TcflagT = 0x00000400u
public const val ECHOCTL: TcflagT = 0x00000200u
public const val ISIG: TcflagT = 0x00000001u
public const val ICANON: TcflagT = 0x00000002u
public const val PENDIN: TcflagT = 0x00004000u
public const val NOFLSH: TcflagT = 0x00000080u
public const val CBAUDEX: TcflagT = 4096u
public const val VSWTC: ULong = 7uL
public const val OLCUC: TcflagT = 2u
public const val NLDLY: TcflagT = 256u
public const val CRDLY: TcflagT = 1536u
public const val TABDLY: TcflagT = 6144u
public const val BSDLY: TcflagT = 8192u
public const val FFDLY: TcflagT = 32768u
public const val VTDLY: TcflagT = 16384u
public const val XTABS: TcflagT = 6144u
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 1u
public const val B75: SpeedT = 2u
public const val B110: SpeedT = 3u
public const val B134: SpeedT = 4u
public const val B150: SpeedT = 5u
public const val B200: SpeedT = 6u
public const val B300: SpeedT = 7u
public const val B600: SpeedT = 8u
public const val B1200: SpeedT = 9u
public const val B1800: SpeedT = 10u
public const val B2400: SpeedT = 11u
public const val B4800: SpeedT = 12u
public const val B9600: SpeedT = 13u
public const val B19200: SpeedT = 14u
public const val B38400: SpeedT = 15u
public const val B57600: SpeedT = 4097u
public const val B115200: SpeedT = 4098u
public const val B230400: SpeedT = 4099u
public const val B460800: SpeedT = 4100u
public const val B500000: SpeedT = 4101u
public const val B576000: SpeedT = 4102u
public const val B921600: SpeedT = 4103u
public const val B1000000: SpeedT = 4104u
public const val B1152000: SpeedT = 4105u
public const val B1500000: SpeedT = 4106u
public const val B2000000: SpeedT = 4107u
public const val B2500000: SpeedT = 4108u
public const val B3000000: SpeedT = 4109u
public const val B3500000: SpeedT = 4110u
public const val B4000000: SpeedT = 4111u
public const val SO_BINDTODEVICE: CInt = 25
public const val SO_TIMESTAMP: CInt = 63
public const val SO_MARK: CInt = 36
public const val SO_RXQ_OVFL: CInt = 40
public const val SO_PEEK_OFF: CInt = 42
public const val SO_BUSY_POLL: CInt = 46
public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL
public const val O_DIRECT: CInt = 0x4000
public const val O_DIRECTORY: CInt = 0x10000
public const val O_NOFOLLOW: CInt = 0x20000
public const val O_ASYNC: CInt = 0x2000
public const val FIOCLEX: CInt = 0x5451
public const val FIONBIO: CInt = 0x5421
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_NOFILE: CInt = 7
public const val RLIMIT_AS: CInt = 9
public const val RLIMIT_NPROC: CInt = 6
public const val RLIMIT_MEMLOCK: CInt = 8
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_LOCKS: CInt = 10
public const val RLIMIT_SIGPENDING: CInt = 11
public const val RLIMIT_MSGQUEUE: CInt = 12
public const val RLIMIT_NICE: CInt = 13
public const val RLIMIT_RTPRIO: CInt = 14
public const val O_APPEND: CInt = 1024
public const val O_CREAT: CInt = 64
public const val O_EXCL: CInt = 128
public const val O_NOCTTY: CInt = 256
public const val O_NONBLOCK: CInt = 2048
public const val O_SYNC: CInt = 1052672
public const val O_RSYNC: CInt = 1052672
public const val O_DSYNC: CInt = 4096
public const val SOCK_NONBLOCK: CInt = 2048
public const val MAP_ANON: CInt = 0x0020
public const val MAP_GROWSDOWN: CInt = 0x0100
public const val MAP_DENYWRITE: CInt = 0x0800
public const val MAP_EXECUTABLE: CInt = 0x01000
public const val MAP_LOCKED: CInt = 0x02000
public const val MAP_NORESERVE: CInt = 0x04000
public const val MAP_POPULATE: CInt = 0x08000
public const val MAP_NONBLOCK: CInt = 0x010000
public const val MAP_STACK: CInt = 0x020000
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_SEQPACKET: CInt = 5
public const val IPPROTO_MAX: CInt = 263
public const val SOL_SOCKET: CInt = 1
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_DONTROUTE: CInt = 5
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_OOBINLINE: CInt = 10
public const val SO_LINGER: CInt = 13
public const val SO_REUSEPORT: CInt = 15
public const val SO_RCVLOWAT: CInt = 18
public const val SO_SNDLOWAT: CInt = 19
public const val SO_RCVTIMEO: CInt = 66
public const val SO_SNDTIMEO: CInt = 67
public const val SO_ACCEPTCONN: CInt = 30
public const val IPV6_RTHDR_LOOSE: CInt = 0
public const val IPV6_RTHDR_STRICT: CInt = 1
public const val SA_ONSTACK: CInt = 0x08000000
public const val SA_SIGINFO: CInt = 0x00000004
public const val SA_NOCLDWAIT: CInt = 0x00000002
public const val SIGCHLD: CInt = 17
public const val SIGBUS: CInt = 7
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGUSR1: CInt = 10
public const val SIGUSR2: CInt = 12
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGURG: CInt = 23
public const val SIGIO: CInt = 29
public const val SIGSYS: CInt = 31
public const val SIGSTKFLT: CInt = 16
public const val SIGPOLL: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIG_SETMASK: CInt = 2
public const val SIG_BLOCK: CInt = 0x000000
public const val SIG_UNBLOCK: CInt = 0x01
public const val EXTPROC: TcflagT = 0x00010000u
public const val MAP_HUGETLB: CInt = 0x040000
public const val F_GETLK: CInt = 12
public const val F_GETOWN: CInt = 9
public const val F_SETLK: CInt = 13
public const val F_SETLKW: CInt = 14
public const val F_SETOWN: CInt = 8
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val VEOF: ULong = 4uL
public const val VEOL: ULong = 11uL
public const val VEOL2: ULong = 16uL
public const val VMIN: ULong = 6uL
public const val IEXTEN: TcflagT = 0x00008000u
public const val TOSTOP: TcflagT = 0x00000100u
public const val FLUSHO: TcflagT = 0x00001000u
public const val TCGETS: CInt = 0x5401
public const val TCSETS: CInt = 0x5402
public const val TCSETSW: CInt = 0x5403
public const val TCSETSF: CInt = 0x5404
public const val TCGETA: CInt = 0x5405
public const val TCSETA: CInt = 0x5406
public const val TCSETAW: CInt = 0x5407
public const val TCSETAF: CInt = 0x5408
public const val TCSBRK: CInt = 0x5409
public const val TCXONC: CInt = 0x540A
public const val TCFLSH: CInt = 0x540B
public const val TIOCGSOFTCAR: CInt = 0x5419
public const val TIOCSSOFTCAR: CInt = 0x541A
public const val TIOCLINUX: CInt = 0x541C
public const val TIOCGSERIAL: CInt = 0x541E
public const val TIOCEXCL: CInt = 0x540C
public const val TIOCNXCL: CInt = 0x540D
public const val TIOCSCTTY: CInt = 0x540E
public const val TIOCGPGRP: CInt = 0x540F
public const val TIOCSPGRP: CInt = 0x5410
public const val TIOCOUTQ: CInt = 0x5411
public const val TIOCSTI: CInt = 0x5412
public const val TIOCGWINSZ: CInt = 0x5413
public const val TIOCSWINSZ: CInt = 0x5414
public const val TIOCMGET: CInt = 0x5415
public const val TIOCMBIS: CInt = 0x5416
public const val TIOCMBIC: CInt = 0x5417
public const val TIOCMSET: CInt = 0x5418
public const val FIONREAD: CInt = 0x541B
public const val TIOCCONS: CInt = 0x541D
public const val SYS_gettid: CLong = 224
public const val POLLWRNORM: CShort = 0x100
public const val POLLWRBAND: CShort = 0x200
public const val TIOCM_LE: CInt = 0x001
public const val TIOCM_DTR: CInt = 0x002
public const val TIOCM_RTS: CInt = 0x004
public const val TIOCM_ST: CInt = 0x008
public const val TIOCM_SR: CInt = 0x010
public const val TIOCM_CTS: CInt = 0x020
public const val TIOCM_CAR: CInt = 0x040
public const val TIOCM_RNG: CInt = 0x080
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val O_TMPFILE: CInt = 0x410000
public const val MAX_ADDR_LEN: ULong = 7uL
public val ARPD_UPDATE: CUShort = (0x01).toUShort()
public val ARPD_LOOKUP: CUShort = (0x02).toUShort()
public val ARPD_FLUSH: CUShort = (0x03).toUShort()
public const val ATF_MAGIC: CInt = 0x80
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val SOMAXCONN: CInt = 128

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cPUZERO(cpuset: CpuSetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun errnoLocation(): CInt?

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): String?

public expect fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun mkstemps(template: String?, suffixlen: CInt): CInt

public expect fun nlLanginfo(item: NlItem): String?

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CUInt, timeout: Timespec?): CInt

public expect fun sync()

public expect fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
