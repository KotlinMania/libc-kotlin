// port-lint: source unix/linux_like/linux_l4re_shared.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public typealias Elf32Half = UShort
public typealias Elf32Word = UInt
public typealias Elf32Off = UInt
public typealias Elf32Addr = UInt
public typealias Elf32Xword = ULong
public typealias Elf32Sword = Int
public typealias Elf64Half = UShort
public typealias Elf64Word = UInt
public typealias Elf64Off = ULong
public typealias Elf64Addr = ULong
public typealias Elf64Xword = ULong
public typealias Elf64Sxword = Long
public typealias Elf64Sword = Int
public typealias Elf32Section = UShort
public typealias Elf64Section = UShort
public typealias Elf32Relr = Elf32Word
public typealias Elf64Relr = Elf32Xword
public typealias Elf32Rel = CAnonymousElf32Rel
public typealias Elf64Rel = CAnonymousElf64Rel
public typealias Elf32Rela = CAnonymousElf32Rela
public typealias Elf64Rela = CAnonymousElf64Rela
public typealias IconvT = COpaquePointer?

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

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class FsidT(
    val `val`: IntArray,
)

public data class PacketMreq(
    val mrIfindex: CInt,
    val mrType: CUShort,
    val mrAlen: CUShort,
    val mrAddress: UByteArray,
)

public data class CpuSetT(
    val bits: UIntArray,
    val bits: ULongArray,
)

public data class Sembuf(
    val semNum: CUShort,
    val semOp: CShort,
    val semFlg: CShort,
)

public data class DlPhdrInfo(
    val dlpiAddr: Elf64Addr,
    val dlpiAddr: Elf32Addr,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhdr: Elf32Phdr?,
    val dlpiPhnum: Elf64Half,
    val dlpiPhnum: Elf32Half,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class Elf32Ehdr(
    val eIdent: UByteArray,
    val eType: Elf32Half,
    val eMachine: Elf32Half,
    val eVersion: Elf32Word,
    val eEntry: Elf32Addr,
    val ePhoff: Elf32Off,
    val eShoff: Elf32Off,
    val eFlags: Elf32Word,
    val eEhsize: Elf32Half,
    val ePhentsize: Elf32Half,
    val ePhnum: Elf32Half,
    val eShentsize: Elf32Half,
    val eShnum: Elf32Half,
    val eShstrndx: Elf32Half,
)

public data class Elf64Ehdr(
    val eIdent: UByteArray,
    val eType: Elf64Half,
    val eMachine: Elf64Half,
    val eVersion: Elf64Word,
    val eEntry: Elf64Addr,
    val ePhoff: Elf64Off,
    val eShoff: Elf64Off,
    val eFlags: Elf64Word,
    val eEhsize: Elf64Half,
    val ePhentsize: Elf64Half,
    val ePhnum: Elf64Half,
    val eShentsize: Elf64Half,
    val eShnum: Elf64Half,
    val eShstrndx: Elf64Half,
)

public data class Elf32Sym(
    val stName: Elf32Word,
    val stValue: Elf32Addr,
    val stSize: Elf32Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf32Section,
)

public data class Elf64Sym(
    val stName: Elf64Word,
    val stInfo: CUChar,
    val stOther: CUChar,
    val stShndx: Elf64Section,
    val stValue: Elf64Addr,
    val stSize: Elf64Xword,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

public data class Elf32Shdr(
    val shName: Elf32Word,
    val shType: Elf32Word,
    val shFlags: Elf32Word,
    val shAddr: Elf32Addr,
    val shOffset: Elf32Off,
    val shSize: Elf32Word,
    val shLink: Elf32Word,
    val shInfo: Elf32Word,
    val shAddralign: Elf32Word,
    val shEntsize: Elf32Word,
)

public data class Elf64Shdr(
    val shName: Elf64Word,
    val shType: Elf64Word,
    val shFlags: Elf64Xword,
    val shAddr: Elf64Addr,
    val shOffset: Elf64Off,
    val shSize: Elf64Xword,
    val shLink: Elf64Word,
    val shInfo: Elf64Word,
    val shAddralign: Elf64Xword,
    val shEntsize: Elf64Xword,
)

public data class CAnonymousElf32Rel(
    val rOffset: Elf32Addr,
    val rInfo: Elf32Word,
)

public data class CAnonymousElf64Rel(
    val rOffset: Elf64Addr,
    val rInfo: Elf64Xword,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: CInt,
    val mntPassno: CInt,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class ArpdRequest(
    val req: CUShort,
    val ip: UInt,
    val dev: CULong,
    val stamp: CULong,
    val updated: CULong,
    val ha: UByteArray,
)

public data class RegmatchT(
    val rmSo: RegoffT,
    val rmEo: RegoffT,
)

public data class Option(
    val name: String?,
    val hasArg: CInt,
    val flag: CInt?,
    val `val`: CInt,
)

public data class Rlimit64(
    val rlimCur: Rlim64T,
    val rlimMax: Rlim64T,
)

public data class CAnonymousIfruMap(
    val memStart: CULong,
    val memEnd: CULong,
    val baseAddr: CUShort,
    val irq: CUChar,
    val dma: CUChar,
    val port: CUChar,
)

public data class Dirent(
    val dIno: InoT,
    val dOff: OffT,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class Dirent64(
    val dIno: Ino64T,
    val dOff: Off64T,
    val dReclen: CUShort,
    val dType: CUChar,
    val dName: ByteArray,
)

public data class CAnonymousElf32Rela(
    val rOffset: Elf32Addr,
    val rInfo: Elf32Word,
    val rAddend: Elf32Sword,
)

public data class CAnonymousElf64Rela(
    val rOffset: Elf64Addr,
    val rInfo: Elf64Xword,
    val rAddend: Elf64Sxword,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruNetmask: Sockaddr? = null,
    val ifruHwaddr: Sockaddr? = null,
    val ifruFlags: CShort? = null,
    val ifruIfindex: CInt? = null,
    val ifruMetric: CInt? = null,
    val ifruMtu: CInt? = null,
    val ifruMap: CAnonymousIfruMap? = null,
    val ifruSlave: ByteArray? = null,
    val ifruNewname: ByteArray? = null,
    val ifruData: String? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: String? = null,
    val ifcuReq: Ifreq? = null,
)

public const val ABDAY_1: NlItem = DATE_BASE
public const val ABDAY_2: NlItem = DATE_BASE + 0x1
public const val ABDAY_3: NlItem = DATE_BASE + 0x2
public const val ABDAY_4: NlItem = DATE_BASE + 0x3
public const val ABDAY_5: NlItem = DATE_BASE + 0x4
public const val ABDAY_6: NlItem = DATE_BASE + 0x5
public const val ABDAY_7: NlItem = DATE_BASE + 0x6
public const val DAY_1: NlItem = DATE_BASE + 0x7
public const val DAY_2: NlItem = DATE_BASE + 0x8
public const val DAY_3: NlItem = DATE_BASE + 0x9
public const val DAY_4: NlItem = DATE_BASE + 0xA
public const val DAY_5: NlItem = DATE_BASE + 0xB
public const val DAY_6: NlItem = DATE_BASE + 0xC
public const val DAY_7: NlItem = DATE_BASE + 0xD
public const val ABMON_1: NlItem = DATE_BASE + 0xE
public const val ABMON_2: NlItem = DATE_BASE + 0xF
public const val ABMON_3: NlItem = DATE_BASE + 0x10
public const val ABMON_4: NlItem = DATE_BASE + 0x11
public const val ABMON_5: NlItem = DATE_BASE + 0x12
public const val ABMON_6: NlItem = DATE_BASE + 0x13
public const val ABMON_7: NlItem = DATE_BASE + 0x14
public const val ABMON_8: NlItem = DATE_BASE + 0x15
public const val ABMON_9: NlItem = DATE_BASE + 0x16
public const val ABMON_10: NlItem = DATE_BASE + 0x17
public const val ABMON_11: NlItem = DATE_BASE + 0x18
public const val ABMON_12: NlItem = DATE_BASE + 0x19
public const val MON_1: NlItem = DATE_BASE + 0x1A
public const val MON_2: NlItem = DATE_BASE + 0x1B
public const val MON_3: NlItem = DATE_BASE + 0x1C
public const val MON_4: NlItem = DATE_BASE + 0x1D
public const val MON_5: NlItem = DATE_BASE + 0x1E
public const val MON_6: NlItem = DATE_BASE + 0x1F
public const val MON_7: NlItem = DATE_BASE + 0x20
public const val MON_8: NlItem = DATE_BASE + 0x21
public const val MON_9: NlItem = DATE_BASE + 0x22
public const val MON_10: NlItem = DATE_BASE + 0x23
public const val MON_11: NlItem = DATE_BASE + 0x24
public const val MON_12: NlItem = DATE_BASE + 0x25
public const val AM_STR: NlItem = DATE_BASE + 0x26
public const val PM_STR: NlItem = DATE_BASE + 0x27
public const val D_T_FMT: NlItem = DATE_BASE + 0x28
public const val D_FMT: NlItem = DATE_BASE + 0x29
public const val T_FMT: NlItem = DATE_BASE + 0x2A
public const val T_FMT_AMPM: NlItem = DATE_BASE + 0x2B
public const val ERA: NlItem = DATE_BASE + 0x2C
public const val ERA_D_FMT: NlItem = DATE_BASE + 0x2E
public const val ALT_DIGITS: NlItem = DATE_BASE + 0x2F
public const val ERA_D_T_FMT: NlItem = DATE_BASE + 0x30
public const val ERA_T_FMT: NlItem = DATE_BASE + 0x31
public const val CODESET: NlItem = 14
public const val CRNCYSTR: NlItem = 0x4000F
public const val RADIXCHAR: NlItem = 0x10000
public const val THOUSEP: NlItem = 0x10001
public const val YESEXPR: NlItem = 0x50000
public const val NOEXPR: NlItem = 0x50001
public const val YESSTR: NlItem = 0x50002
public const val NOSTR: NlItem = 0x50003
public const val CODESET: NlItem = 10
public const val CRNCYSTR: NlItem = 0x215
public const val RADIXCHAR: NlItem = 0x100
public const val THOUSEP: NlItem = 0x101
public const val YESEXPR: NlItem = 0x500
public const val NOEXPR: NlItem = 0x501
public const val YESSTR: NlItem = 0x502
public const val NOSTR: NlItem = 0x503
public const val RUSAGE_CHILDREN: CInt = -1
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
public const val _CS_PATH: CInt = 0
public const val _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: CInt = 1
public const val _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: CInt = 4
public const val _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: CInt = 5
public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116
public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117
public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118
public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119
public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120
public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121
public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122
public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123
public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124
public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125
public const val _CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126
public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127
public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131
public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132
public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133
public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134
public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135
public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136
public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137
public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138
public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139
public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140
public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141
public const val _CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142
public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143
public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public const val EI_NIDENT: ULong = 16uL
public const val EI_MAG0: ULong = 0uL
public val ELFMAG0: UByte = (0x7f).toUByte()
public const val EI_MAG1: ULong = 1uL
public const val ELFMAG1: UByte = 0x45u
public const val EI_MAG2: ULong = 2uL
public const val ELFMAG2: UByte = 0x4Cu
public const val EI_MAG3: ULong = 3uL
public const val ELFMAG3: UByte = 0x46u
public const val SELFMAG: ULong = 4uL
public const val EI_CLASS: ULong = 4uL
public val ELFCLASSNONE: UByte = (0).toUByte()
public val ELFCLASS32: UByte = (1).toUByte()
public val ELFCLASS64: UByte = (2).toUByte()
public const val ELFCLASSNUM: ULong = 3uL
public const val EI_DATA: ULong = 5uL
public val ELFDATANONE: UByte = (0).toUByte()
public val ELFDATA2LSB: UByte = (1).toUByte()
public val ELFDATA2MSB: UByte = (2).toUByte()
public const val ELFDATANUM: ULong = 3uL
public const val EI_VERSION: ULong = 6uL
public const val EI_OSABI: ULong = 7uL
public val ELFOSABI_NONE: UByte = (0).toUByte()
public val ELFOSABI_SYSV: UByte = (0).toUByte()
public val ELFOSABI_HPUX: UByte = (1).toUByte()
public val ELFOSABI_NETBSD: UByte = (2).toUByte()
public val ELFOSABI_GNU: UByte = (3).toUByte()
public const val ELFOSABI_LINUX: UByte = ELFOSABI_GNU
public val ELFOSABI_SOLARIS: UByte = (6).toUByte()
public val ELFOSABI_AIX: UByte = (7).toUByte()
public val ELFOSABI_IRIX: UByte = (8).toUByte()
public val ELFOSABI_FREEBSD: UByte = (9).toUByte()
public val ELFOSABI_TRU64: UByte = (10).toUByte()
public val ELFOSABI_MODESTO: UByte = (11).toUByte()
public val ELFOSABI_OPENBSD: UByte = (12).toUByte()
public val ELFOSABI_ARM: UByte = (97).toUByte()
public val ELFOSABI_STANDALONE: UByte = (255).toUByte()
public const val EI_ABIVERSION: ULong = 8uL
public const val EI_PAD: ULong = 9uL
public val ET_NONE: UShort = (0).toUShort()
public val ET_REL: UShort = (1).toUShort()
public val ET_EXEC: UShort = (2).toUShort()
public val ET_DYN: UShort = (3).toUShort()
public val ET_CORE: UShort = (4).toUShort()
public val ET_NUM: UShort = (5).toUShort()
public val ET_LOOS: UShort = (0xfe00).toUShort()
public val ET_HIOS: UShort = (0xfeff).toUShort()
public val ET_LOPROC: UShort = (0xff00).toUShort()
public val ET_HIPROC: UShort = (0xffff).toUShort()
public val EM_NONE: UShort = (0).toUShort()
public val EM_M32: UShort = (1).toUShort()
public val EM_SPARC: UShort = (2).toUShort()
public val EM_386: UShort = (3).toUShort()
public val EM_68K: UShort = (4).toUShort()
public val EM_88K: UShort = (5).toUShort()
public val EM_860: UShort = (7).toUShort()
public val EM_MIPS: UShort = (8).toUShort()
public val EM_S370: UShort = (9).toUShort()
public val EM_MIPS_RS3_LE: UShort = (10).toUShort()
public val EM_PARISC: UShort = (15).toUShort()
public val EM_VPP500: UShort = (17).toUShort()
public val EM_SPARC32PLUS: UShort = (18).toUShort()
public val EM_960: UShort = (19).toUShort()
public val EM_PPC: UShort = (20).toUShort()
public val EM_PPC64: UShort = (21).toUShort()
public val EM_S390: UShort = (22).toUShort()
public val EM_V800: UShort = (36).toUShort()
public val EM_FR20: UShort = (37).toUShort()
public val EM_RH32: UShort = (38).toUShort()
public val EM_RCE: UShort = (39).toUShort()
public val EM_ARM: UShort = (40).toUShort()
public val EM_FAKE_ALPHA: UShort = (41).toUShort()
public val EM_SH: UShort = (42).toUShort()
public val EM_SPARCV9: UShort = (43).toUShort()
public val EM_TRICORE: UShort = (44).toUShort()
public val EM_ARC: UShort = (45).toUShort()
public val EM_H8_300: UShort = (46).toUShort()
public val EM_H8_300H: UShort = (47).toUShort()
public val EM_H8S: UShort = (48).toUShort()
public val EM_H8_500: UShort = (49).toUShort()
public val EM_IA_64: UShort = (50).toUShort()
public val EM_MIPS_X: UShort = (51).toUShort()
public val EM_COLDFIRE: UShort = (52).toUShort()
public val EM_68HC12: UShort = (53).toUShort()
public val EM_MMA: UShort = (54).toUShort()
public val EM_PCP: UShort = (55).toUShort()
public val EM_NCPU: UShort = (56).toUShort()
public val EM_NDR1: UShort = (57).toUShort()
public val EM_STARCORE: UShort = (58).toUShort()
public val EM_ME16: UShort = (59).toUShort()
public val EM_ST100: UShort = (60).toUShort()
public val EM_TINYJ: UShort = (61).toUShort()
public val EM_X86_64: UShort = (62).toUShort()
public val EM_PDSP: UShort = (63).toUShort()
public val EM_FX66: UShort = (66).toUShort()
public val EM_ST9PLUS: UShort = (67).toUShort()
public val EM_ST7: UShort = (68).toUShort()
public val EM_68HC16: UShort = (69).toUShort()
public val EM_68HC11: UShort = (70).toUShort()
public val EM_68HC08: UShort = (71).toUShort()
public val EM_68HC05: UShort = (72).toUShort()
public val EM_SVX: UShort = (73).toUShort()
public val EM_ST19: UShort = (74).toUShort()
public val EM_VAX: UShort = (75).toUShort()
public val EM_CRIS: UShort = (76).toUShort()
public val EM_JAVELIN: UShort = (77).toUShort()
public val EM_FIREPATH: UShort = (78).toUShort()
public val EM_ZSP: UShort = (79).toUShort()
public val EM_MMIX: UShort = (80).toUShort()
public val EM_HUANY: UShort = (81).toUShort()
public val EM_PRISM: UShort = (82).toUShort()
public val EM_AVR: UShort = (83).toUShort()
public val EM_FR30: UShort = (84).toUShort()
public val EM_D10V: UShort = (85).toUShort()
public val EM_D30V: UShort = (86).toUShort()
public val EM_V850: UShort = (87).toUShort()
public val EM_M32R: UShort = (88).toUShort()
public val EM_MN10300: UShort = (89).toUShort()
public val EM_MN10200: UShort = (90).toUShort()
public val EM_PJ: UShort = (91).toUShort()
public val EM_OPENRISC: UShort = (92).toUShort()
public val EM_OR1K: UShort = (92).toUShort()
public val EM_ARC_A5: UShort = (93).toUShort()
public val EM_XTENSA: UShort = (94).toUShort()
public val EM_AARCH64: UShort = (183).toUShort()
public val EM_TILEPRO: UShort = (188).toUShort()
public val EM_TILEGX: UShort = (191).toUShort()
public val EM_RISCV: UShort = (243).toUShort()
public val EM_ALPHA: UShort = (0x9026).toUShort()
public const val EV_NONE: UInt = 0u
public const val EV_CURRENT: UInt = 1u
public const val EV_NUM: UInt = 2u
public const val PT_NULL: UInt = 0u
public const val PT_LOAD: UInt = 1u
public const val PT_DYNAMIC: UInt = 2u
public const val PT_INTERP: UInt = 3u
public const val PT_NOTE: UInt = 4u
public const val PT_SHLIB: UInt = 5u
public const val PT_PHDR: UInt = 6u
public const val PT_TLS: UInt = 7u
public const val PT_NUM: UInt = 8u
public const val PT_LOOS: UInt = 0x60000000u
public const val PT_GNU_EH_FRAME: UInt = 0x6474e550u
public const val PT_GNU_STACK: UInt = 0x6474e551u
public const val PT_GNU_RELRO: UInt = 0x6474e552u
public const val PT_LOSUNW: UInt = 0x6ffffffau
public const val PT_SUNWBSS: UInt = 0x6ffffffau
public const val PT_SUNWSTACK: UInt = 0x6ffffffbu
public const val PT_HISUNW: UInt = 0x6fffffffu
public const val PT_HIOS: UInt = 0x6fffffffu
public const val PT_LOPROC: UInt = 0x70000000u
public const val PT_HIPROC: UInt = 0x7fffffffu
public val PF_X: UInt = 1 shl 0
public val PF_W: UInt = 1 shl 1
public val PF_R: UInt = 1 shl 2
public const val PF_MASKOS: UInt = 0x0ff00000u
public const val PF_MASKPROC: UInt = 0xf0000000u
public const val AT_NULL: CULong = 0uL
public const val AT_IGNORE: CULong = 1uL
public const val AT_EXECFD: CULong = 2uL
public const val AT_PHDR: CULong = 3uL
public const val AT_PHENT: CULong = 4uL
public const val AT_PHNUM: CULong = 5uL
public const val AT_PAGESZ: CULong = 6uL
public const val AT_BASE: CULong = 7uL
public const val AT_FLAGS: CULong = 8uL
public const val AT_ENTRY: CULong = 9uL
public const val AT_NOTELF: CULong = 10uL
public const val AT_UID: CULong = 11uL
public const val AT_EUID: CULong = 12uL
public const val AT_GID: CULong = 13uL
public const val AT_EGID: CULong = 14uL
public const val AT_PLATFORM: CULong = 15uL
public const val AT_HWCAP: CULong = 16uL
public const val AT_CLKTCK: CULong = 17uL
public const val AT_SECURE: CULong = 23uL
public const val AT_BASE_PLATFORM: CULong = 24uL
public const val AT_RANDOM: CULong = 25uL
public const val AT_HWCAP2: CULong = 26uL
public const val AT_HWCAP3: CULong = 29uL
public const val AT_HWCAP4: CULong = 30uL
public const val AT_EXECFN: CULong = 31uL
public const val AT_SYSINFO_EHDR: CULong = 33uL
public const val AT_MINSIGSTKSZ: CULong = 51uL
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
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val S_IEXEC: ModeT = 64
public const val S_IWRITE: ModeT = 128
public const val S_IREAD: ModeT = 256
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
public const val AT_EACCESS: CInt = 0x200
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1
public const val PTHREAD_ONCE_INIT: PthreadOnceT = 0
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 1
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_MUTEX_STALLED: CInt = 0
public const val PTHREAD_MUTEX_ROBUST: CInt = 1
public const val PTHREAD_PRIO_NONE: CInt = 0
public const val PTHREAD_PRIO_INHERIT: CInt = 1
public const val PTHREAD_PRIO_PROTECT: CInt = 2
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val PTHREAD_INHERIT_SCHED: CInt = 0
public const val PTHREAD_EXPLICIT_SCHED: CInt = 1
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val IPPROTO_MAX: CInt = 256
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1

// IPC_STAT is 0x102 on musl32_time64 targets.
public const val IPC_STAT: CInt = 2
public const val IPC_INFO: CInt = 3
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_REMAP: CInt = 16384
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
public const val EAI_NODATA: CInt = -5
public const val EAI_FAMILY: CInt = -6
public const val EAI_SOCKTYPE: CInt = -7
public const val EAI_SERVICE: CInt = -8
public const val EAI_MEMORY: CInt = -10
public const val EAI_SYSTEM: CInt = -11
public const val EAI_OVERFLOW: CInt = -12
public const val NI_NUMERICHOST: CInt = 1
public const val NI_NUMERICSERV: CInt = 2
public const val NI_NOFQDN: CInt = 4
public const val NI_NAMEREQD: CInt = 8
public const val NI_DGRAM: CInt = 16
public const val NI_IDN: CInt = 32
public const val AIO_CANCELED: CInt = 0
public const val AIO_NOTCANCELED: CInt = 1
public const val AIO_ALLDONE: CInt = 2
public const val LIO_READ: CInt = 0
public const val LIO_WRITE: CInt = 1
public const val LIO_NOP: CInt = 2
public const val LIO_WAIT: CInt = 0
public const val LIO_NOWAIT: CInt = 1
public const val RUSAGE_THREAD: CInt = 1
public const val MSG_COPY: CInt = 16384
public const val SHM_EXEC: CInt = 32768
public const val IPV6_MULTICAST_ALL: CInt = 29
public const val IPV6_ROUTER_ALERT_ISOLATE: CInt = 30
public const val PACKET_MR_UNICAST: CInt = 3
public const val PTRACE_EVENT_STOP: CInt = 128
public const val UDP_SEGMENT: CInt = 103
public const val UDP_GRO: CInt = 104
public const val PR_SET_PDEATHSIG: CInt = 1
public const val PR_GET_PDEATHSIG: CInt = 2
public const val PR_GET_DUMPABLE: CInt = 3
public const val PR_SET_DUMPABLE: CInt = 4
public const val PR_GET_UNALIGN: CInt = 5
public const val PR_SET_UNALIGN: CInt = 6
public const val PR_UNALIGN_NOPRINT: CInt = 1
public const val PR_UNALIGN_SIGBUS: CInt = 2
public const val PR_GET_KEEPCAPS: CInt = 7
public const val PR_SET_KEEPCAPS: CInt = 8
public const val PR_GET_FPEMU: CInt = 9
public const val PR_SET_FPEMU: CInt = 10
public const val PR_FPEMU_NOPRINT: CInt = 1
public const val PR_FPEMU_SIGFPE: CInt = 2
public const val PR_GET_FPEXC: CInt = 11
public const val PR_SET_FPEXC: CInt = 12
public const val PR_FP_EXC_SW_ENABLE: CInt = 0x80
public const val PR_FP_EXC_DIV: CInt = 0x010000
public const val PR_FP_EXC_OVF: CInt = 0x020000
public const val PR_FP_EXC_UND: CInt = 0x040000
public const val PR_FP_EXC_RES: CInt = 0x080000
public const val PR_FP_EXC_INV: CInt = 0x100000
public const val PR_FP_EXC_DISABLED: CInt = 0
public const val PR_FP_EXC_NONRECOV: CInt = 1
public const val PR_FP_EXC_ASYNC: CInt = 2
public const val PR_FP_EXC_PRECISE: CInt = 3
public const val PR_GET_TIMING: CInt = 13
public const val PR_SET_TIMING: CInt = 14
public const val PR_TIMING_STATISTICAL: CInt = 0
public const val PR_TIMING_TIMESTAMP: CInt = 1
public const val PR_SET_NAME: CInt = 15
public const val PR_GET_NAME: CInt = 16
public const val PR_GET_ENDIAN: CInt = 19
public const val PR_SET_ENDIAN: CInt = 20
public const val PR_ENDIAN_BIG: CInt = 0
public const val PR_ENDIAN_LITTLE: CInt = 1
public const val PR_ENDIAN_PPC_LITTLE: CInt = 2
public const val PR_GET_SECCOMP: CInt = 21
public const val PR_SET_SECCOMP: CInt = 22
public const val PR_CAPBSET_READ: CInt = 23
public const val PR_CAPBSET_DROP: CInt = 24
public const val PR_GET_TSC: CInt = 25
public const val PR_SET_TSC: CInt = 26
public const val PR_TSC_ENABLE: CInt = 1
public const val PR_TSC_SIGSEGV: CInt = 2
public const val PR_GET_SECUREBITS: CInt = 27
public const val PR_SET_SECUREBITS: CInt = 28
public const val PR_SET_TIMERSLACK: CInt = 29
public const val PR_GET_TIMERSLACK: CInt = 30
public const val PR_TASK_PERF_EVENTS_DISABLE: CInt = 31
public const val PR_TASK_PERF_EVENTS_ENABLE: CInt = 32
public const val PR_MCE_KILL: CInt = 33
public const val PR_MCE_KILL_CLEAR: CInt = 0
public const val PR_MCE_KILL_SET: CInt = 1
public const val PR_MCE_KILL_LATE: CInt = 0
public const val PR_MCE_KILL_EARLY: CInt = 1
public const val PR_MCE_KILL_DEFAULT: CInt = 2
public const val PR_MCE_KILL_GET: CInt = 34
public const val PR_SET_MM: CInt = 35
public const val PR_SET_MM_START_CODE: CInt = 1
public const val PR_SET_MM_END_CODE: CInt = 2
public const val PR_SET_MM_START_DATA: CInt = 3
public const val PR_SET_MM_END_DATA: CInt = 4
public const val PR_SET_MM_START_STACK: CInt = 5
public const val PR_SET_MM_START_BRK: CInt = 6
public const val PR_SET_MM_BRK: CInt = 7
public const val PR_SET_MM_ARG_START: CInt = 8
public const val PR_SET_MM_ARG_END: CInt = 9
public const val PR_SET_MM_ENV_START: CInt = 10
public const val PR_SET_MM_ENV_END: CInt = 11
public const val PR_SET_MM_AUXV: CInt = 12
public const val PR_SET_MM_EXE_FILE: CInt = 13
public const val PR_SET_MM_MAP: CInt = 14
public const val PR_SET_MM_MAP_SIZE: CInt = 15
public const val PR_SET_PTRACER: CInt = 0x59616d61
public const val PR_SET_PTRACER_ANY: CULong = 0xffffffffffffffffuL
public const val PR_SET_CHILD_SUBREAPER: CInt = 36
public const val PR_GET_CHILD_SUBREAPER: CInt = 37
public const val PR_SET_NO_NEW_PRIVS: CInt = 38
public const val PR_GET_NO_NEW_PRIVS: CInt = 39
public const val PR_GET_TID_ADDRESS: CInt = 40
public const val PR_SET_THP_DISABLE: CInt = 41
public const val PR_GET_THP_DISABLE: CInt = 42
public const val PR_MPX_ENABLE_MANAGEMENT: CInt = 43
public const val PR_MPX_DISABLE_MANAGEMENT: CInt = 44
public const val PR_SET_FP_MODE: CInt = 45
public const val PR_GET_FP_MODE: CInt = 46
public val PR_FP_MODE_FR: CInt = 1 shl 0
public val PR_FP_MODE_FRE: CInt = 1 shl 1
public const val PR_CAP_AMBIENT: CInt = 47
public const val PR_CAP_AMBIENT_IS_SET: CInt = 1
public const val PR_CAP_AMBIENT_RAISE: CInt = 2
public const val PR_CAP_AMBIENT_LOWER: CInt = 3
public const val PR_CAP_AMBIENT_CLEAR_ALL: CInt = 4
public const val PR_SET_VMA: CInt = 0x53564d41
public const val PR_SET_VMA_ANON_NAME: CInt = 0
public const val PR_SCHED_CORE: CInt = 62
public const val PR_SCHED_CORE_GET: CInt = 0
public const val PR_SCHED_CORE_CREATE: CInt = 1
public const val PR_SCHED_CORE_SHARE_TO: CInt = 2
public const val PR_SCHED_CORE_SHARE_FROM: CInt = 3
public const val PR_SCHED_CORE_MAX: CInt = 4
public const val PR_SCHED_CORE_SCOPE_THREAD: CInt = 0
public const val PR_SCHED_CORE_SCOPE_THREAD_GROUP: CInt = 1
public const val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: CInt = 2
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val _POSIX_VDISABLE: CcT = 0
public const val IPV6_RTHDR_LOOSE: CInt = 0
public const val IPV6_RTHDR_STRICT: CInt = 1
public const val IUTF8: TcflagT = 0x00004000
public const val CMSPAR: TcflagT = 1073741824
public const val MFD_CLOEXEC: CUInt = 0x0001u
public const val MFD_ALLOW_SEALING: CUInt = 0x0002u
public const val MFD_HUGETLB: CUInt = 0x0004u
public const val MFD_NOEXEC_SEAL: CUInt = 0x0008u
public const val MFD_EXEC: CUInt = 0x0010u
public const val MFD_HUGE_64KB: CUInt = 0x40000000u
public const val MFD_HUGE_512KB: CUInt = 0x4c000000u
public const val MFD_HUGE_1MB: CUInt = 0x50000000u
public const val MFD_HUGE_2MB: CUInt = 0x54000000u
public const val MFD_HUGE_8MB: CUInt = 0x5c000000u
public const val MFD_HUGE_16MB: CUInt = 0x60000000u
public const val MFD_HUGE_32MB: CUInt = 0x64000000u
public const val MFD_HUGE_256MB: CUInt = 0x70000000u
public const val MFD_HUGE_512MB: CUInt = 0x74000000u
public const val MFD_HUGE_1GB: CUInt = 0x78000000u
public const val MFD_HUGE_2GB: CUInt = 0x7c000000u
public const val MFD_HUGE_16GB: CUInt = 0x88000000u
public const val MFD_HUGE_MASK: CUInt = 63u
public const val MFD_HUGE_SHIFT: CUInt = 26u
public val PACKET_HOST: CUChar = (0).toUByte()
public val PACKET_BROADCAST: CUChar = (1).toUByte()
public val PACKET_MULTICAST: CUChar = (2).toUByte()
public val PACKET_OTHERHOST: CUChar = (3).toUByte()
public val PACKET_OUTGOING: CUChar = (4).toUByte()
public val PACKET_LOOPBACK: CUChar = (5).toUByte()
public val PACKET_USER: CUChar = (6).toUByte()
public val PACKET_KERNEL: CUChar = (7).toUByte()
public const val PACKET_ADD_MEMBERSHIP: CInt = 1
public const val PACKET_DROP_MEMBERSHIP: CInt = 2
public const val PACKET_RECV_OUTPUT: CInt = 3
public const val PACKET_RX_RING: CInt = 5
public const val PACKET_STATISTICS: CInt = 6
public const val PACKET_COPY_THRESH: CInt = 7
public const val PACKET_AUXDATA: CInt = 8
public const val PACKET_ORIGDEV: CInt = 9
public const val PACKET_VERSION: CInt = 10
public const val PACKET_HDRLEN: CInt = 11
public const val PACKET_RESERVE: CInt = 12
public const val PACKET_TX_RING: CInt = 13
public const val PACKET_LOSS: CInt = 14
public const val PACKET_VNET_HDR: CInt = 15
public const val PACKET_TX_TIMESTAMP: CInt = 16
public const val PACKET_TIMESTAMP: CInt = 17
public const val PACKET_MR_MULTICAST: CInt = 0
public const val PACKET_MR_PROMISC: CInt = 1
public const val PACKET_MR_ALLMULTI: CInt = 2
public const val SIOCADDRT: CULong = 0x0000890BuL
public const val SIOCDELRT: CULong = 0x0000890CuL
public const val SIOCGIFNAME: CULong = 0x00008910uL
public const val SIOCSIFLINK: CULong = 0x00008911uL
public const val SIOCGIFCONF: CULong = 0x00008912uL
public const val SIOCGIFFLAGS: CULong = 0x00008913uL
public const val SIOCSIFFLAGS: CULong = 0x00008914uL
public const val SIOCGIFADDR: CULong = 0x00008915uL
public const val SIOCSIFADDR: CULong = 0x00008916uL
public const val SIOCGIFDSTADDR: CULong = 0x00008917uL
public const val SIOCSIFDSTADDR: CULong = 0x00008918uL
public const val SIOCGIFBRDADDR: CULong = 0x00008919uL
public const val SIOCSIFBRDADDR: CULong = 0x0000891AuL
public const val SIOCGIFNETMASK: CULong = 0x0000891BuL
public const val SIOCSIFNETMASK: CULong = 0x0000891CuL
public const val SIOCGIFMETRIC: CULong = 0x0000891DuL
public const val SIOCSIFMETRIC: CULong = 0x0000891EuL
public const val SIOCGIFMEM: CULong = 0x0000891FuL
public const val SIOCSIFMEM: CULong = 0x00008920uL
public const val SIOCGIFMTU: CULong = 0x00008921uL
public const val SIOCSIFMTU: CULong = 0x00008922uL
public const val SIOCSIFNAME: CULong = 0x00008923uL
public const val SIOCSIFHWADDR: CULong = 0x00008924uL
public const val SIOCGIFENCAP: CULong = 0x00008925uL
public const val SIOCSIFENCAP: CULong = 0x00008926uL
public const val SIOCGIFHWADDR: CULong = 0x00008927uL
public const val SIOCGIFSLAVE: CULong = 0x00008929uL
public const val SIOCSIFSLAVE: CULong = 0x00008930uL
public const val SIOCADDMULTI: CULong = 0x00008931uL
public const val SIOCDELMULTI: CULong = 0x00008932uL
public const val SIOCGIFINDEX: CULong = 0x00008933uL
public const val SIOGIFINDEX: CULong = SIOCGIFINDEX
public const val SIOCSIFPFLAGS: CULong = 0x00008934uL
public const val SIOCGIFPFLAGS: CULong = 0x00008935uL
public const val SIOCDIFADDR: CULong = 0x00008936uL
public const val SIOCSIFHWBROADCAST: CULong = 0x00008937uL
public const val SIOCGIFCOUNT: CULong = 0x00008938uL
public const val SIOCGIFBR: CULong = 0x00008940uL
public const val SIOCSIFBR: CULong = 0x00008941uL
public const val SIOCGIFTXQLEN: CULong = 0x00008942uL
public const val SIOCSIFTXQLEN: CULong = 0x00008943uL
public const val SIOCETHTOOL: CULong = 0x00008946uL
public const val SIOCGMIIPHY: CULong = 0x00008947uL
public const val SIOCGMIIREG: CULong = 0x00008948uL
public const val SIOCSMIIREG: CULong = 0x00008949uL
public const val SIOCWANDEV: CULong = 0x0000894AuL
public const val SIOCOUTQNSD: CULong = 0x0000894BuL
public const val SIOCGSKNS: CULong = 0x0000894CuL
public const val SIOCDARP: CULong = 0x00008953uL
public const val SIOCGARP: CULong = 0x00008954uL
public const val SIOCSARP: CULong = 0x00008955uL
public const val SIOCDRARP: CULong = 0x00008960uL
public const val SIOCGRARP: CULong = 0x00008961uL
public const val SIOCSRARP: CULong = 0x00008962uL
public const val SIOCGIFMAP: CULong = 0x00008970uL
public const val SIOCSIFMAP: CULong = 0x00008971uL
public val IPTOS_TOS_MASK: UByte = (0x1E).toUByte()
public val IPTOS_PREC_MASK: UByte = (0xE0).toUByte()
public val IPTOS_ECN_NOT_ECT: UByte = (0x00).toUByte()
public val RTF_UP: CUShort = (0x0001).toUShort()
public val RTF_GATEWAY: CUShort = (0x0002).toUShort()
public val RTF_HOST: CUShort = (0x0004).toUShort()
public val RTF_REINSTATE: CUShort = (0x0008).toUShort()
public val RTF_DYNAMIC: CUShort = (0x0010).toUShort()
public val RTF_MODIFIED: CUShort = (0x0020).toUShort()
public val RTF_MTU: CUShort = (0x0040).toUShort()
public const val RTF_MSS: CUShort = RTF_MTU
public val RTF_WINDOW: CUShort = (0x0080).toUShort()
public val RTF_IRTT: CUShort = (0x0100).toUShort()
public val RTF_REJECT: CUShort = (0x0200).toUShort()
public val RTF_STATIC: CUShort = (0x0400).toUShort()
public val RTF_XRESOLVE: CUShort = (0x0800).toUShort()
public val RTF_NOFORWARD: CUShort = (0x1000).toUShort()
public val RTF_THROW: CUShort = (0x2000).toUShort()
public val RTF_NOPMTUDISC: CUShort = (0x4000).toUShort()
public const val RTF_DEFAULT: UInt = 0x00010000u
public const val RTF_ALLONLINK: UInt = 0x00020000u
public const val RTF_ADDRCONF: UInt = 0x00040000u
public const val RTF_LINKRT: UInt = 0x00100000u
public const val RTF_NONEXTHOP: UInt = 0x00200000u
public const val RTF_CACHE: UInt = 0x01000000u
public const val RTF_FLOW: UInt = 0x02000000u
public const val RTF_POLICY: UInt = 0x04000000u
public const val RTCF_VALVE: UInt = 0x00200000u
public const val RTCF_MASQ: UInt = 0x00400000u
public const val RTCF_NAT: UInt = 0x00800000u
public const val RTCF_DOREDIRECT: UInt = 0x01000000u
public const val RTCF_LOG: UInt = 0x02000000u
public const val RTCF_DIRECTSRC: UInt = 0x04000000u
public const val RTF_LOCAL: UInt = 0x80000000u
public const val RTF_INTERFACE: UInt = 0x40000000u
public const val RTF_MULTICAST: UInt = 0x20000000u
public const val RTF_BROADCAST: UInt = 0x10000000u
public const val RTF_NAT: UInt = 0x08000000u
public const val RTF_ADDRCLASSMASK: UInt = 0xF8000000u
public val RT_CLASS_UNSPEC: UByte = (0).toUByte()
public val RT_CLASS_DEFAULT: UByte = (253).toUByte()
public val RT_CLASS_MAIN: UByte = (254).toUByte()
public val RT_CLASS_LOCAL: UByte = (255).toUByte()
public val RT_CLASS_MAX: UByte = (255).toUByte()
public const val MAX_ADDR_LEN: ULong = 7uL
public val ARPD_UPDATE: CUShort = (0x01).toUShort()
public val ARPD_LOOKUP: CUShort = (0x02).toUShort()
public val ARPD_FLUSH: CUShort = (0x03).toUShort()
public const val ATF_MAGIC: CInt = 0x80
public const val UDP_CORK: CInt = 1
public const val UDP_ENCAP: CInt = 100
public const val UDP_NO_CHECK6_TX: CInt = 101
public const val UDP_NO_CHECK6_RX: CInt = 102
public const val MAP_FIXED_NOREPLACE: CInt = 0x100000
public const val MLOCK_ONFAULT: CUInt = 0x01u
public const val REG_EXTENDED: CInt = 1
public const val REG_ICASE: CInt = 2
public const val REG_NEWLINE: CInt = 4
public const val REG_NOSUB: CInt = 8
public const val REG_NOTBOL: CInt = 1
public const val REG_NOTEOL: CInt = 2
public const val REG_ENOSYS: CInt = -1
public const val REG_NOMATCH: CInt = 1
public const val REG_BADPAT: CInt = 2
public const val REG_ECOLLATE: CInt = 3
public const val REG_ECTYPE: CInt = 4
public const val REG_EESCAPE: CInt = 5
public const val REG_ESUBREG: CInt = 6
public const val REG_EBRACK: CInt = 7
public const val REG_EPAREN: CInt = 8
public const val REG_EBRACE: CInt = 9
public const val REG_BADBR: CInt = 10
public const val REG_ERANGE: CInt = 11
public const val REG_ESPACE: CInt = 12
public const val REG_BADRPT: CInt = 13
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EWOULDBLOCK: CInt = EAGAIN
public const val CSIGNAL: CInt = 0x000000ff
public const val SCHED_NORMAL: CInt = 0
public const val SCHED_OTHER: CInt = 0
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val SCHED_BATCH: CInt = 3
public const val SCHED_IDLE: CInt = 5
public const val SCHED_DEADLINE: CInt = 6
public const val SCHED_RESET_ON_FORK: CInt = 0x40000000
public const val NT_PRSTATUS: CInt = 1
public const val NT_PRFPREG: CInt = 2
public const val NT_FPREGSET: CInt = 2
public const val NT_PRPSINFO: CInt = 3
public const val NT_PRXREG: CInt = 4
public const val NT_TASKSTRUCT: CInt = 4
public const val NT_PLATFORM: CInt = 5
public const val NT_AUXV: CInt = 6
public const val NT_GWINDOWS: CInt = 7
public const val NT_ASRS: CInt = 8
public const val NT_PSTATUS: CInt = 10
public const val NT_PSINFO: CInt = 13
public const val NT_PRCRED: CInt = 14
public const val NT_UTSNAME: CInt = 15
public const val NT_LWPSTATUS: CInt = 16
public const val NT_LWPSINFO: CInt = 17
public const val NT_PRFPXREG: CInt = 20
public const val MS_NOUSER: CULong = 0xffffffff80000000uL

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cPUALLOCSIZE(count: CInt): ULong

public expect fun cPUZERO(cpuset: CpuSetT?)

public expect fun cPUSET(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUCLR(cpu: ULong, cpuset: CpuSetT?)

public expect fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): CInt

public expect fun cPUCOUNT(cpuset: CpuSetT?): CInt

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean

public expect fun iPTOSTOS(tos: UByte): UByte

public expect fun iPTOSPREC(tos: UByte): UByte

public expect fun rTTOS(tos: UByte): UByte

public expect fun rTADDRCLASS(flags: UInt): UInt

public expect fun rTLOCALADDR(flags: UInt): Boolean

public expect fun eLF32RSYM(`val`: Elf32Word): Elf32Word

public expect fun eLF32RTYPE(`val`: Elf32Word): Elf32Word

public expect fun eLF32RINFO(sym: Elf32Word, t: Elf32Word): Elf32Word

public expect fun eLF64RSYM(`val`: Elf64Xword): Elf64Xword

public expect fun eLF64RTYPE(`val`: Elf64Xword): Elf64Xword

public expect fun eLF64RINFO(sym: Elf64Xword, t: Elf64Xword): Elf64Xword

public expect fun iopl(level: CInt): CInt

public expect fun ioperm(from: CULong, num: CULong, turnOn: CInt): CInt

public expect fun aioRead(aiocbp: Aiocb?): CInt

public expect fun aioWrite(aiocbp: Aiocb?): CInt

public expect fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt

public expect fun aioError(aiocbp: Aiocb?): CInt

public expect fun aioReturn(aiocbp: Aiocb?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun processVmReadv(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long

public expect fun processVmWritev(pid: PidT, localIov: Iovec?, liovcnt: CULong, remoteIov: Iovec?, riovcnt: CULong, flags: CULong): Long

public expect fun futimes(fd: CInt, times: Timeval?): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUInt)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUShort?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: CUShort?): CLong

public expect fun jrand48(xseed: CUShort?): CLong

public expect fun srand48(seed: CLong)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): Passwd?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): Group?

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): Spwd?

public expect fun getspnam(name: String?): Spwd?

public expect fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun errnoLocation(): CInt?

public expect fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: CInt, vararg args: Any?): COpaquePointer?

public expect fun glob(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: GlobT?): CInt

public expect fun globfree(pglob: GlobT?)

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT

public expect fun nlLanginfo(item: NlItem): String?

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): String?

public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt

public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt

public expect fun mount(src: String?, target: String?, fstype: String?, flags: CULong, data: COpaquePointer?): CInt

public expect fun prctl(option: CInt, vararg args: Any?): CInt

public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt

public expect fun sethostname(name: String?, len: ULong): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun sysinfo(info: Sysinfo?): CInt

public expect fun sigsuspend(mask: SigsetT?): CInt

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun semClose(sem: SemT?): CInt

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt

public expect fun initgroups(user: String?, group: GidT): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT?

public expect fun getgrnam(name: String?): Group?

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun getmntent(stream: FILE?): Mntent?

public expect fun addmntent(stream: FILE?, mnt: Mntent?): CInt

public expect fun endmntent(streamp: FILE?): CInt

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?

public expect fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong

public expect fun regfree(preg: RegexT?)

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong

public expect fun iconvClose(cd: IconvT): CInt

public expect fun gettid(): PidT

public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun schedGetcpu(): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt

public expect fun copyFileRange(fdIn: CInt, offIn: Off64T?, fdOut: CInt, offOut: Off64T?, len: ULong, flags: CUInt): SsizeT

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt

public expect fun ftello64(stream: FILE?): Off64T
