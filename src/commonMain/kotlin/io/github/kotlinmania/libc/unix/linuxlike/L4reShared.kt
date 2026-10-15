// port-lint: source unix/linux_like/linux_l4re_shared.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

internal const val DATE_BASE: Int = 0x20000

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: Int,
)

public data class Passwd(
    var pwName: String? = null,
    var pwPasswd: String? = null,
    var pwUid: UInt = 0u,
    var pwGid: UInt = 0u,
    var pwGecos: String? = null,
    var pwDir: String? = null,
    var pwShell: String? = null,
)

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: Long,
    val spMin: Long,
    val spMax: Long,
    val spWarn: Long,
    val spInact: Long,
    val spExpire: Long,
    val spFlag: ULong,
)

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class FsidT(
    val value: IntArray,
)

public data class PacketMreq(
    val mrIfindex: Int,
    val mrType: UShort,
    val mrAlen: UShort,
    val mrAddress: UByteArray,
)

public data class CpuSetT(
    val bits: UIntArray,
    val bits2: ULongArray,
)

public data class Sembuf(
    val semNum: UShort,
    val semOp: Short,
    val semFlg: Short,
)

public data class DlPhdrInfo(
    val dlpiAddr: ULong,
    val dlpiAddr2: UInt,
    val dlpiName: String?,
    val dlpiPhdr: Elf64Phdr?,
    val dlpiPhdr2: Elf32Phdr?,
    val dlpiPhnum: UShort,
    val dlpiPhnum2: UShort,
    val dlpiAdds: ULong,
    val dlpiSubs: ULong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class Elf32Ehdr(
    val eIdent: UByteArray,
    val eType: UShort,
    val eMachine: UShort,
    val eVersion: UInt,
    val eEntry: UInt,
    val ePhoff: UInt,
    val eShoff: UInt,
    val eFlags: UInt,
    val eEhsize: UShort,
    val ePhentsize: UShort,
    val ePhnum: UShort,
    val eShentsize: UShort,
    val eShnum: UShort,
    val eShstrndx: UShort,
)

public data class Elf64Ehdr(
    val eIdent: UByteArray,
    val eType: UShort,
    val eMachine: UShort,
    val eVersion: UInt,
    val eEntry: ULong,
    val ePhoff: ULong,
    val eShoff: ULong,
    val eFlags: UInt,
    val eEhsize: UShort,
    val ePhentsize: UShort,
    val ePhnum: UShort,
    val eShentsize: UShort,
    val eShnum: UShort,
    val eShstrndx: UShort,
)

public data class Elf32Sym(
    val stName: UInt,
    val stValue: UInt,
    val stSize: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
)

public data class Elf64Sym(
    val stName: UInt,
    val stInfo: UByte,
    val stOther: UByte,
    val stShndx: UShort,
    val stValue: ULong,
    val stSize: ULong,
)

public data class Elf32Phdr(
    val pType: UInt,
    val pOffset: UInt,
    val pVaddr: UInt,
    val pPaddr: UInt,
    val pFilesz: UInt,
    val pMemsz: UInt,
    val pFlags: UInt,
    val pAlign: UInt,
)

public data class Elf64Phdr(
    val pType: UInt,
    val pFlags: UInt,
    val pOffset: ULong,
    val pVaddr: ULong,
    val pPaddr: ULong,
    val pFilesz: ULong,
    val pMemsz: ULong,
    val pAlign: ULong,
)

public data class Elf32Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: UInt,
    val shAddr: UInt,
    val shOffset: UInt,
    val shSize: UInt,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: UInt,
    val shEntsize: UInt,
)

public data class Elf64Shdr(
    val shName: UInt,
    val shType: UInt,
    val shFlags: ULong,
    val shAddr: ULong,
    val shOffset: ULong,
    val shSize: ULong,
    val shLink: UInt,
    val shInfo: UInt,
    val shAddralign: ULong,
    val shEntsize: ULong,
)

public data class CAnonymousElf32Rel(
    val rOffset: UInt,
    val rInfo: UInt,
)

public data class CAnonymousElf64Rel(
    val rOffset: ULong,
    val rInfo: ULong,
)

public data class Ucred(
    val pid: Int,
    val uid: UInt,
    val gid: UInt,
)

public data class Mntent(
    val mntFsname: String?,
    val mntDir: String?,
    val mntType: String?,
    val mntOpts: String?,
    val mntFreq: Int,
    val mntPassno: Int,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)

public data class ArpdRequest(
    val req: UShort,
    val ip: UInt,
    val dev: ULong,
    val stamp: ULong,
    val updated: ULong,
    val ha: UByteArray,
)

public data class RegmatchT(
    val rmSo: Long,
    val rmEo: Long,
)

public data class Option(
    val name: String?,
    val hasArg: Int,
    val flag: Int?,
    val value: Int,
)

public data class Rlimit64(
    val handle: Long = 0L,
    val rlimCur: ULong,
    val rlimMax: ULong,
)

public data class CAnonymousIfruMap(
    val memStart: ULong,
    val memEnd: ULong,
    val baseAddr: UShort,
    val irq: UByte,
    val dma: UByte,
    val port: UByte,
)

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class Dirent64(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)

public data class CAnonymousElf32Rela(
    val rOffset: UInt,
    val rInfo: UInt,
    val rAddend: Int,
)

public data class CAnonymousElf64Rela(
    val rOffset: ULong,
    val rInfo: ULong,
    val rAddend: Long,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class Ifconf(
    val ifcLen: Int,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruNetmask: Sockaddr? = null,
    val ifruHwaddr: Sockaddr? = null,
    val ifruFlags: Short? = null,
    val ifruIfindex: Int? = null,
    val ifruMetric: Int? = null,
    val ifruMtu: Int? = null,
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

public const val ABDAY_1: Int = DATE_BASE
public val ABDAY_2: Int = DATE_BASE + 0x1
public val ABDAY_3: Int = DATE_BASE + 0x2
public val ABDAY_4: Int = DATE_BASE + 0x3
public val ABDAY_5: Int = DATE_BASE + 0x4
public val ABDAY_6: Int = DATE_BASE + 0x5
public val ABDAY_7: Int = DATE_BASE + 0x6
public val DAY_1: Int = DATE_BASE + 0x7
public val DAY_2: Int = DATE_BASE + 0x8
public val DAY_3: Int = DATE_BASE + 0x9
public val DAY_4: Int = DATE_BASE + 0xA
public val DAY_5: Int = DATE_BASE + 0xB
public val DAY_6: Int = DATE_BASE + 0xC
public val DAY_7: Int = DATE_BASE + 0xD
public val ABMON_1: Int = DATE_BASE + 0xE
public val ABMON_2: Int = DATE_BASE + 0xF
public val ABMON_3: Int = DATE_BASE + 0x10
public val ABMON_4: Int = DATE_BASE + 0x11
public val ABMON_5: Int = DATE_BASE + 0x12
public val ABMON_6: Int = DATE_BASE + 0x13
public val ABMON_7: Int = DATE_BASE + 0x14
public val ABMON_8: Int = DATE_BASE + 0x15
public val ABMON_9: Int = DATE_BASE + 0x16
public val ABMON_10: Int = DATE_BASE + 0x17
public val ABMON_11: Int = DATE_BASE + 0x18
public val ABMON_12: Int = DATE_BASE + 0x19
public val MON_1: Int = DATE_BASE + 0x1A
public val MON_2: Int = DATE_BASE + 0x1B
public val MON_3: Int = DATE_BASE + 0x1C
public val MON_4: Int = DATE_BASE + 0x1D
public val MON_5: Int = DATE_BASE + 0x1E
public val MON_6: Int = DATE_BASE + 0x1F
public val MON_7: Int = DATE_BASE + 0x20
public val MON_8: Int = DATE_BASE + 0x21
public val MON_9: Int = DATE_BASE + 0x22
public val MON_10: Int = DATE_BASE + 0x23
public val MON_11: Int = DATE_BASE + 0x24
public val MON_12: Int = DATE_BASE + 0x25
public val AM_STR: Int = DATE_BASE + 0x26
public val PM_STR: Int = DATE_BASE + 0x27
public val D_T_FMT: Int = DATE_BASE + 0x28
public val D_FMT: Int = DATE_BASE + 0x29
public val T_FMT: Int = DATE_BASE + 0x2A
public val T_FMT_AMPM: Int = DATE_BASE + 0x2B
public val ERA: Int = DATE_BASE + 0x2C
public val ERA_D_FMT: Int = DATE_BASE + 0x2E
public val ALT_DIGITS: Int = DATE_BASE + 0x2F
public val ERA_D_T_FMT: Int = DATE_BASE + 0x30
public val ERA_T_FMT: Int = DATE_BASE + 0x31
public const val CODESET: Int = 14
public const val CRNCYSTR: Int = 0x4000F
public const val RADIXCHAR: Int = 0x10000
public const val THOUSEP: Int = 0x10001
public const val YESEXPR: Int = 0x50000
public const val NOEXPR: Int = 0x50001
public const val YESSTR: Int = 0x50002
public const val NOSTR: Int = 0x50003
public const val RUSAGE_CHILDREN: Int = -1
public const val L_tmpnam: UInt = 20u
public const val _PC_LINK_MAX: Int = 0
public const val _PC_MAX_CANON: Int = 1
public const val _PC_MAX_INPUT: Int = 2
public const val _PC_NAME_MAX: Int = 3
public const val _PC_PATH_MAX: Int = 4
public const val _PC_PIPE_BUF: Int = 5
public const val _PC_CHOWN_RESTRICTED: Int = 6
public const val _PC_NO_TRUNC: Int = 7
public const val _PC_VDISABLE: Int = 8
public const val _PC_SYNC_IO: Int = 9
public const val _PC_ASYNC_IO: Int = 10
public const val _PC_PRIO_IO: Int = 11
public const val _PC_SOCK_MAXBUF: Int = 12
public const val _PC_FILESIZEBITS: Int = 13
public const val _PC_REC_INCR_XFER_SIZE: Int = 14
public const val _PC_REC_MAX_XFER_SIZE: Int = 15
public const val _PC_REC_MIN_XFER_SIZE: Int = 16
public const val _PC_REC_XFER_ALIGN: Int = 17
public const val _PC_ALLOC_SIZE_MIN: Int = 18
public const val _PC_SYMLINK_MAX: Int = 19
public const val _PC_2_SYMLINKS: Int = 20
public const val _SC_ARG_MAX: Int = 0
public const val _SC_CHILD_MAX: Int = 1
public const val _SC_CLK_TCK: Int = 2
public const val _SC_NGROUPS_MAX: Int = 3
public const val _SC_OPEN_MAX: Int = 4
public const val _SC_STREAM_MAX: Int = 5
public const val _SC_TZNAME_MAX: Int = 6
public const val _SC_JOB_CONTROL: Int = 7
public const val _SC_SAVED_IDS: Int = 8
public const val _SC_REALTIME_SIGNALS: Int = 9
public const val _SC_PRIORITY_SCHEDULING: Int = 10
public const val _SC_TIMERS: Int = 11
public const val _SC_ASYNCHRONOUS_IO: Int = 12
public const val _SC_PRIORITIZED_IO: Int = 13
public const val _SC_SYNCHRONIZED_IO: Int = 14
public const val _SC_FSYNC: Int = 15
public const val _SC_MAPPED_FILES: Int = 16
public const val _SC_MEMLOCK: Int = 17
public const val _SC_MEMLOCK_RANGE: Int = 18
public const val _SC_MEMORY_PROTECTION: Int = 19
public const val _SC_MESSAGE_PASSING: Int = 20
public const val _SC_SEMAPHORES: Int = 21
public const val _SC_SHARED_MEMORY_OBJECTS: Int = 22
public const val _SC_AIO_LISTIO_MAX: Int = 23
public const val _SC_AIO_MAX: Int = 24
public const val _SC_AIO_PRIO_DELTA_MAX: Int = 25
public const val _SC_DELAYTIMER_MAX: Int = 26
public const val _SC_MQ_OPEN_MAX: Int = 27
public const val _SC_MQ_PRIO_MAX: Int = 28
public const val _SC_VERSION: Int = 29
public const val _SC_PAGESIZE: Int = 30
public const val _SC_PAGE_SIZE: Int = _SC_PAGESIZE
public const val _SC_RTSIG_MAX: Int = 31
public const val _SC_SEM_NSEMS_MAX: Int = 32
public const val _SC_SEM_VALUE_MAX: Int = 33
public const val _SC_SIGQUEUE_MAX: Int = 34
public const val _SC_TIMER_MAX: Int = 35
public const val _SC_BC_BASE_MAX: Int = 36
public const val _SC_BC_DIM_MAX: Int = 37
public const val _SC_BC_SCALE_MAX: Int = 38
public const val _SC_BC_STRING_MAX: Int = 39
public const val _SC_COLL_WEIGHTS_MAX: Int = 40
public const val _SC_EXPR_NEST_MAX: Int = 42
public const val _SC_LINE_MAX: Int = 43
public const val _SC_RE_DUP_MAX: Int = 44
public const val _SC_2_VERSION: Int = 46
public const val _SC_2_C_BIND: Int = 47
public const val _SC_2_C_DEV: Int = 48
public const val _SC_2_FORT_DEV: Int = 49
public const val _SC_2_FORT_RUN: Int = 50
public const val _SC_2_SW_DEV: Int = 51
public const val _SC_2_LOCALEDEF: Int = 52
public const val _SC_UIO_MAXIOV: Int = 60
public const val _SC_IOV_MAX: Int = 60
public const val _SC_THREADS: Int = 67
public const val _SC_THREAD_SAFE_FUNCTIONS: Int = 68
public const val _SC_GETGR_R_SIZE_MAX: Int = 69
public const val _SC_GETPW_R_SIZE_MAX: Int = 70
public const val _SC_LOGIN_NAME_MAX: Int = 71
public const val _SC_TTY_NAME_MAX: Int = 72
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: Int = 73
public const val _SC_THREAD_KEYS_MAX: Int = 74
public const val _SC_THREAD_STACK_MIN: Int = 75
public const val _SC_THREAD_THREADS_MAX: Int = 76
public const val _SC_THREAD_ATTR_STACKADDR: Int = 77
public const val _SC_THREAD_ATTR_STACKSIZE: Int = 78
public const val _SC_THREAD_PRIORITY_SCHEDULING: Int = 79
public const val _SC_THREAD_PRIO_INHERIT: Int = 80
public const val _SC_THREAD_PRIO_PROTECT: Int = 81
public const val _SC_THREAD_PROCESS_SHARED: Int = 82
public const val _SC_NPROCESSORS_CONF: Int = 83
public const val _SC_NPROCESSORS_ONLN: Int = 84
public const val _SC_PHYS_PAGES: Int = 85
public const val _SC_AVPHYS_PAGES: Int = 86
public const val _SC_ATEXIT_MAX: Int = 87
public const val _SC_PASS_MAX: Int = 88
public const val _SC_XOPEN_VERSION: Int = 89
public const val _SC_XOPEN_XCU_VERSION: Int = 90
public const val _SC_XOPEN_UNIX: Int = 91
public const val _SC_XOPEN_CRYPT: Int = 92
public const val _SC_XOPEN_ENH_I18N: Int = 93
public const val _SC_XOPEN_SHM: Int = 94
public const val _SC_2_CHAR_TERM: Int = 95
public const val _SC_2_UPE: Int = 97
public const val _SC_XOPEN_XPG2: Int = 98
public const val _SC_XOPEN_XPG3: Int = 99
public const val _SC_XOPEN_XPG4: Int = 100
public const val _SC_NZERO: Int = 109
public const val _SC_XBS5_ILP32_OFF32: Int = 125
public const val _SC_XBS5_ILP32_OFFBIG: Int = 126
public const val _SC_XBS5_LP64_OFF64: Int = 127
public const val _SC_XBS5_LPBIG_OFFBIG: Int = 128
public const val _SC_XOPEN_LEGACY: Int = 129
public const val _SC_XOPEN_REALTIME: Int = 130
public const val _SC_XOPEN_REALTIME_THREADS: Int = 131
public const val _SC_ADVISORY_INFO: Int = 132
public const val _SC_BARRIERS: Int = 133
public const val _SC_CLOCK_SELECTION: Int = 137
public const val _SC_CPUTIME: Int = 138
public const val _SC_THREAD_CPUTIME: Int = 139
public const val _SC_MONOTONIC_CLOCK: Int = 149
public const val _SC_READER_WRITER_LOCKS: Int = 153
public const val _SC_SPIN_LOCKS: Int = 154
public const val _SC_REGEXP: Int = 155
public const val _SC_SHELL: Int = 157
public const val _SC_SPAWN: Int = 159
public const val _SC_SPORADIC_SERVER: Int = 160
public const val _SC_THREAD_SPORADIC_SERVER: Int = 161
public const val _SC_TIMEOUTS: Int = 164
public const val _SC_TYPED_MEMORY_OBJECTS: Int = 165
public const val _SC_2_PBS: Int = 168
public const val _SC_2_PBS_ACCOUNTING: Int = 169
public const val _SC_2_PBS_LOCATE: Int = 170
public const val _SC_2_PBS_MESSAGE: Int = 171
public const val _SC_2_PBS_TRACK: Int = 172
public const val _SC_SYMLOOP_MAX: Int = 173
public const val _SC_STREAMS: Int = 174
public const val _SC_2_PBS_CHECKPOINT: Int = 175
public const val _SC_V6_ILP32_OFF32: Int = 176
public const val _SC_V6_ILP32_OFFBIG: Int = 177
public const val _SC_V6_LP64_OFF64: Int = 178
public const val _SC_V6_LPBIG_OFFBIG: Int = 179
public const val _SC_HOST_NAME_MAX: Int = 180
public const val _SC_TRACE: Int = 181
public const val _SC_TRACE_EVENT_FILTER: Int = 182
public const val _SC_TRACE_INHERIT: Int = 183
public const val _SC_TRACE_LOG: Int = 184
public const val _SC_IPV6: Int = 235
public const val _SC_RAW_SOCKETS: Int = 236
public const val _SC_V7_ILP32_OFF32: Int = 237
public const val _SC_V7_ILP32_OFFBIG: Int = 238
public const val _SC_V7_LP64_OFF64: Int = 239
public const val _SC_V7_LPBIG_OFFBIG: Int = 240
public const val _SC_SS_REPL_MAX: Int = 241
public const val _SC_TRACE_EVENT_NAME_MAX: Int = 242
public const val _SC_TRACE_NAME_MAX: Int = 243
public const val _SC_TRACE_SYS_MAX: Int = 244
public const val _SC_TRACE_USER_EVENT_MAX: Int = 245
public const val _SC_XOPEN_STREAMS: Int = 246
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 247
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 248
public const val _CS_PATH: Int = 0
public const val _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: Int = 1
public const val _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: Int = 4
public const val _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: Int = 5
public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: Int = 1116
public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: Int = 1117
public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: Int = 1118
public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: Int = 1119
public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: Int = 1120
public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: Int = 1121
public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: Int = 1122
public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: Int = 1123
public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: Int = 1124
public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: Int = 1125
public const val _CS_POSIX_V6_LP64_OFF64_LIBS: Int = 1126
public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: Int = 1127
public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: Int = 1128
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: Int = 1129
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: Int = 1130
public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: Int = 1131
public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: Int = 1132
public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: Int = 1133
public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: Int = 1134
public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: Int = 1135
public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: Int = 1136
public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: Int = 1137
public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: Int = 1138
public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: Int = 1139
public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: Int = 1140
public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: Int = 1141
public const val _CS_POSIX_V7_LP64_OFF64_LIBS: Int = 1142
public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: Int = 1143
public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: Int = 1144
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: Int = 1145
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: Int = 1146
public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: Int = 1147
public val RLIM_SAVED_MAX: ULong = 0.toULong().inv()
public val RLIM_SAVED_CUR: ULong = 0.toULong().inv()
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
public val ELFOSABI_LINUX: UByte = ELFOSABI_GNU
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
public val PF_X: UInt = 1u shl 0
public val PF_W: UInt = 1u shl 1
public val PF_R: UInt = 1u shl 2
public const val PF_MASKOS: UInt = 0x0ff00000u
public const val PF_MASKPROC: UInt = 0xf0000000u
public const val AT_NULL: ULong = 0uL
public const val AT_IGNORE: ULong = 1uL
public const val AT_EXECFD: ULong = 2uL
public const val AT_PHDR: ULong = 3uL
public const val AT_PHENT: ULong = 4uL
public const val AT_PHNUM: ULong = 5uL
public const val AT_PAGESZ: ULong = 6uL
public const val AT_BASE: ULong = 7uL
public const val AT_FLAGS: ULong = 8uL
public const val AT_ENTRY: ULong = 9uL
public const val AT_NOTELF: ULong = 10uL
public const val AT_UID: ULong = 11uL
public const val AT_EUID: ULong = 12uL
public const val AT_GID: ULong = 13uL
public const val AT_EGID: ULong = 14uL
public const val AT_PLATFORM: ULong = 15uL
public const val AT_HWCAP: ULong = 16uL
public const val AT_CLKTCK: ULong = 17uL
public const val AT_SECURE: ULong = 23uL
public const val AT_BASE_PLATFORM: ULong = 24uL
public const val AT_RANDOM: ULong = 25uL
public const val AT_HWCAP2: ULong = 26uL
public const val AT_HWCAP3: ULong = 29uL
public const val AT_HWCAP4: ULong = 30uL
public const val AT_EXECFN: ULong = 31uL
public const val AT_SYSINFO_EHDR: ULong = 33uL
public const val AT_MINSIGSTKSZ: ULong = 51uL
public val GLOB_ERR: Int = 1 shl 0
public val GLOB_MARK: Int = 1 shl 1
public val GLOB_NOSORT: Int = 1 shl 2
public val GLOB_DOOFFS: Int = 1 shl 3
public val GLOB_NOCHECK: Int = 1 shl 4
public val GLOB_APPEND: Int = 1 shl 5
public val GLOB_NOESCAPE: Int = 1 shl 6
public const val GLOB_NOSPACE: Int = 1
public const val GLOB_ABORTED: Int = 2
public const val GLOB_NOMATCH: Int = 3
public const val POSIX_MADV_NORMAL: Int = 0
public const val POSIX_MADV_RANDOM: Int = 1
public const val POSIX_MADV_SEQUENTIAL: Int = 2
public const val POSIX_MADV_WILLNEED: Int = 3
public const val POSIX_MADV_DONTNEED: Int = 4
public const val S_IEXEC: UInt = 64u
public const val S_IWRITE: UInt = 128u
public const val S_IREAD: UInt = 256u
public const val F_LOCK: Int = 1
public const val F_TEST: Int = 3
public const val F_TLOCK: Int = 2
public const val F_ULOCK: Int = 0
public const val ST_RDONLY: ULong = 1uL
public const val ST_NOSUID: ULong = 2uL
public const val ST_NODEV: ULong = 4uL
public const val ST_NOEXEC: ULong = 8uL
public const val ST_SYNCHRONOUS: ULong = 16uL
public const val ST_MANDLOCK: ULong = 64uL
public const val ST_WRITE: ULong = 128uL
public const val ST_APPEND: ULong = 256uL
public const val ST_IMMUTABLE: ULong = 512uL
public const val ST_NOATIME: ULong = 1024uL
public const val ST_NODIRATIME: ULong = 2048uL
public const val RTLD_NODELETE: Int = 0x1000
public const val RTLD_NOW: Int = 0x2
public const val AT_EACCESS: Int = 0x200
public const val PTHREAD_BARRIER_SERIAL_THREAD: Int = -1
public const val PTHREAD_ONCE_INIT: Int = 0
public const val PTHREAD_MUTEX_NORMAL: Int = 0
public const val PTHREAD_MUTEX_RECURSIVE: Int = 1
public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2
public const val PTHREAD_MUTEX_DEFAULT: Int = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_MUTEX_STALLED: Int = 0
public const val PTHREAD_MUTEX_ROBUST: Int = 1
public const val PTHREAD_PRIO_NONE: Int = 0
public const val PTHREAD_PRIO_INHERIT: Int = 1
public const val PTHREAD_PRIO_PROTECT: Int = 2
public const val PTHREAD_PROCESS_PRIVATE: Int = 0
public const val PTHREAD_PROCESS_SHARED: Int = 1
public const val PTHREAD_INHERIT_SCHED: Int = 0
public const val PTHREAD_EXPLICIT_SCHED: Int = 1
public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
public const val IPPROTO_MAX: Int = 256
public const val IPC_PRIVATE: Int = 0
public const val IPC_CREAT: Int = 512
public const val IPC_EXCL: Int = 1024
public const val IPC_NOWAIT: Int = 2048
public const val IPC_RMID: Int = 0
public const val IPC_SET: Int = 1

// IPC_STAT is 0x102 on musl32_time64 targets.
public const val IPC_STAT: Int = 2
public const val IPC_INFO: Int = 3
public const val SHM_R: Int = 256
public const val SHM_W: Int = 128
public const val SHM_RDONLY: Int = 4096
public const val SHM_RND: Int = 8192
public const val SHM_REMAP: Int = 16384
public const val SHM_LOCK: Int = 11
public const val SHM_UNLOCK: Int = 12
public const val SHM_HUGETLB: Int = 2048
public const val SHM_NORESERVE: Int = 4096
public const val LOG_NFACILITIES: Int = 24
public const val AI_PASSIVE: Int = 0x0001
public const val AI_CANONNAME: Int = 0x0002
public const val AI_NUMERICHOST: Int = 0x0004
public const val AI_V4MAPPED: Int = 0x0008
public const val AI_ALL: Int = 0x0010
public const val AI_ADDRCONFIG: Int = 0x0020
public const val AI_NUMERICSERV: Int = 0x0400
public const val EAI_BADFLAGS: Int = -1
public const val EAI_NONAME: Int = -2
public const val EAI_AGAIN: Int = -3
public const val EAI_FAIL: Int = -4
public const val EAI_NODATA: Int = -5
public const val EAI_FAMILY: Int = -6
public const val EAI_SOCKTYPE: Int = -7
public const val EAI_SERVICE: Int = -8
public const val EAI_MEMORY: Int = -10
public const val EAI_SYSTEM: Int = -11
public const val EAI_OVERFLOW: Int = -12
public const val NI_NUMERICHOST: Int = 1
public const val NI_NUMERICSERV: Int = 2
public const val NI_NOFQDN: Int = 4
public const val NI_NAMEREQD: Int = 8
public const val NI_DGRAM: Int = 16
public const val NI_IDN: Int = 32
public const val AIO_CANCELED: Int = 0
public const val AIO_NOTCANCELED: Int = 1
public const val AIO_ALLDONE: Int = 2
public const val LIO_READ: Int = 0
public const val LIO_WRITE: Int = 1
public const val LIO_NOP: Int = 2
public const val LIO_WAIT: Int = 0
public const val LIO_NOWAIT: Int = 1
public const val RUSAGE_THREAD: Int = 1
public const val MSG_COPY: Int = 16384
public const val SHM_EXEC: Int = 32768
public const val IPV6_MULTICAST_ALL: Int = 29
public const val IPV6_ROUTER_ALERT_ISOLATE: Int = 30
public const val PACKET_MR_UNICAST: Int = 3
public const val PTRACE_EVENT_STOP: Int = 128
public const val UDP_SEGMENT: Int = 103
public const val UDP_GRO: Int = 104
public const val PR_SET_PDEATHSIG: Int = 1
public const val PR_GET_PDEATHSIG: Int = 2
public const val PR_GET_DUMPABLE: Int = 3
public const val PR_SET_DUMPABLE: Int = 4
public const val PR_GET_UNALIGN: Int = 5
public const val PR_SET_UNALIGN: Int = 6
public const val PR_UNALIGN_NOPRINT: Int = 1
public const val PR_UNALIGN_SIGBUS: Int = 2
public const val PR_GET_KEEPCAPS: Int = 7
public const val PR_SET_KEEPCAPS: Int = 8
public const val PR_GET_FPEMU: Int = 9
public const val PR_SET_FPEMU: Int = 10
public const val PR_FPEMU_NOPRINT: Int = 1
public const val PR_FPEMU_SIGFPE: Int = 2
public const val PR_GET_FPEXC: Int = 11
public const val PR_SET_FPEXC: Int = 12
public const val PR_FP_EXC_SW_ENABLE: Int = 0x80
public const val PR_FP_EXC_DIV: Int = 0x010000
public const val PR_FP_EXC_OVF: Int = 0x020000
public const val PR_FP_EXC_UND: Int = 0x040000
public const val PR_FP_EXC_RES: Int = 0x080000
public const val PR_FP_EXC_INV: Int = 0x100000
public const val PR_FP_EXC_DISABLED: Int = 0
public const val PR_FP_EXC_NONRECOV: Int = 1
public const val PR_FP_EXC_ASYNC: Int = 2
public const val PR_FP_EXC_PRECISE: Int = 3
public const val PR_GET_TIMING: Int = 13
public const val PR_SET_TIMING: Int = 14
public const val PR_TIMING_STATISTICAL: Int = 0
public const val PR_TIMING_TIMESTAMP: Int = 1
public const val PR_SET_NAME: Int = 15
public const val PR_GET_NAME: Int = 16
public const val PR_GET_ENDIAN: Int = 19
public const val PR_SET_ENDIAN: Int = 20
public const val PR_ENDIAN_BIG: Int = 0
public const val PR_ENDIAN_LITTLE: Int = 1
public const val PR_ENDIAN_PPC_LITTLE: Int = 2
public const val PR_GET_SECCOMP: Int = 21
public const val PR_SET_SECCOMP: Int = 22
public const val PR_CAPBSET_READ: Int = 23
public const val PR_CAPBSET_DROP: Int = 24
public const val PR_GET_TSC: Int = 25
public const val PR_SET_TSC: Int = 26
public const val PR_TSC_ENABLE: Int = 1
public const val PR_TSC_SIGSEGV: Int = 2
public const val PR_GET_SECUREBITS: Int = 27
public const val PR_SET_SECUREBITS: Int = 28
public const val PR_SET_TIMERSLACK: Int = 29
public const val PR_GET_TIMERSLACK: Int = 30
public const val PR_TASK_PERF_EVENTS_DISABLE: Int = 31
public const val PR_TASK_PERF_EVENTS_ENABLE: Int = 32
public const val PR_MCE_KILL: Int = 33
public const val PR_MCE_KILL_CLEAR: Int = 0
public const val PR_MCE_KILL_SET: Int = 1
public const val PR_MCE_KILL_LATE: Int = 0
public const val PR_MCE_KILL_EARLY: Int = 1
public const val PR_MCE_KILL_DEFAULT: Int = 2
public const val PR_MCE_KILL_GET: Int = 34
public const val PR_SET_MM: Int = 35
public const val PR_SET_MM_START_CODE: Int = 1
public const val PR_SET_MM_END_CODE: Int = 2
public const val PR_SET_MM_START_DATA: Int = 3
public const val PR_SET_MM_END_DATA: Int = 4
public const val PR_SET_MM_START_STACK: Int = 5
public const val PR_SET_MM_START_BRK: Int = 6
public const val PR_SET_MM_BRK: Int = 7
public const val PR_SET_MM_ARG_START: Int = 8
public const val PR_SET_MM_ARG_END: Int = 9
public const val PR_SET_MM_ENV_START: Int = 10
public const val PR_SET_MM_ENV_END: Int = 11
public const val PR_SET_MM_AUXV: Int = 12
public const val PR_SET_MM_EXE_FILE: Int = 13
public const val PR_SET_MM_MAP: Int = 14
public const val PR_SET_MM_MAP_SIZE: Int = 15
public const val PR_SET_PTRACER: Int = 0x59616d61
public const val PR_SET_PTRACER_ANY: ULong = 0xffffffffffffffffuL
public const val PR_SET_CHILD_SUBREAPER: Int = 36
public const val PR_GET_CHILD_SUBREAPER: Int = 37
public const val PR_SET_NO_NEW_PRIVS: Int = 38
public const val PR_GET_NO_NEW_PRIVS: Int = 39
public const val PR_GET_TID_ADDRESS: Int = 40
public const val PR_SET_THP_DISABLE: Int = 41
public const val PR_GET_THP_DISABLE: Int = 42
public const val PR_MPX_ENABLE_MANAGEMENT: Int = 43
public const val PR_MPX_DISABLE_MANAGEMENT: Int = 44
public const val PR_SET_FP_MODE: Int = 45
public const val PR_GET_FP_MODE: Int = 46
public val PR_FP_MODE_FR: Int = 1 shl 0
public val PR_FP_MODE_FRE: Int = 1 shl 1
public const val PR_CAP_AMBIENT: Int = 47
public const val PR_CAP_AMBIENT_IS_SET: Int = 1
public const val PR_CAP_AMBIENT_RAISE: Int = 2
public const val PR_CAP_AMBIENT_LOWER: Int = 3
public const val PR_CAP_AMBIENT_CLEAR_ALL: Int = 4
public const val PR_SET_VMA: Int = 0x53564d41
public const val PR_SET_VMA_ANON_NAME: Int = 0
public const val PR_SCHED_CORE: Int = 62
public const val PR_SCHED_CORE_GET: Int = 0
public const val PR_SCHED_CORE_CREATE: Int = 1
public const val PR_SCHED_CORE_SHARE_TO: Int = 2
public const val PR_SCHED_CORE_SHARE_FROM: Int = 3
public const val PR_SCHED_CORE_MAX: Int = 4
public const val PR_SCHED_CORE_SCOPE_THREAD: Int = 0
public const val PR_SCHED_CORE_SCOPE_THREAD_GROUP: Int = 1
public const val PR_SCHED_CORE_SCOPE_PROCESS_GROUP: Int = 2
public const val ITIMER_REAL: Int = 0
public const val ITIMER_VIRTUAL: Int = 1
public const val ITIMER_PROF: Int = 2
public const val _POSIX_VDISABLE: UByte = 0u
public const val IPV6_RTHDR_LOOSE: Int = 0
public const val IPV6_RTHDR_STRICT: Int = 1
public const val IUTF8: UInt = 0x00004000u
public const val CMSPAR: UInt = 1073741824u
public const val MFD_CLOEXEC: UInt = 0x0001u
public const val MFD_ALLOW_SEALING: UInt = 0x0002u
public const val MFD_HUGETLB: UInt = 0x0004u
public const val MFD_NOEXEC_SEAL: UInt = 0x0008u
public const val MFD_EXEC: UInt = 0x0010u
public const val MFD_HUGE_64KB: UInt = 0x40000000u
public const val MFD_HUGE_512KB: UInt = 0x4c000000u
public const val MFD_HUGE_1MB: UInt = 0x50000000u
public const val MFD_HUGE_2MB: UInt = 0x54000000u
public const val MFD_HUGE_8MB: UInt = 0x5c000000u
public const val MFD_HUGE_16MB: UInt = 0x60000000u
public const val MFD_HUGE_32MB: UInt = 0x64000000u
public const val MFD_HUGE_256MB: UInt = 0x70000000u
public const val MFD_HUGE_512MB: UInt = 0x74000000u
public const val MFD_HUGE_1GB: UInt = 0x78000000u
public const val MFD_HUGE_2GB: UInt = 0x7c000000u
public const val MFD_HUGE_16GB: UInt = 0x88000000u
public const val MFD_HUGE_MASK: UInt = 63u
public const val MFD_HUGE_SHIFT: UInt = 26u
public val PACKET_HOST: UByte = (0).toUByte()
public val PACKET_BROADCAST: UByte = (1).toUByte()
public val PACKET_MULTICAST: UByte = (2).toUByte()
public val PACKET_OTHERHOST: UByte = (3).toUByte()
public val PACKET_OUTGOING: UByte = (4).toUByte()
public val PACKET_LOOPBACK: UByte = (5).toUByte()
public val PACKET_USER: UByte = (6).toUByte()
public val PACKET_KERNEL: UByte = (7).toUByte()
public const val PACKET_ADD_MEMBERSHIP: Int = 1
public const val PACKET_DROP_MEMBERSHIP: Int = 2
public const val PACKET_RECV_OUTPUT: Int = 3
public const val PACKET_RX_RING: Int = 5
public const val PACKET_STATISTICS: Int = 6
public const val PACKET_COPY_THRESH: Int = 7
public const val PACKET_AUXDATA: Int = 8
public const val PACKET_ORIGDEV: Int = 9
public const val PACKET_VERSION: Int = 10
public const val PACKET_HDRLEN: Int = 11
public const val PACKET_RESERVE: Int = 12
public const val PACKET_TX_RING: Int = 13
public const val PACKET_LOSS: Int = 14
public const val PACKET_VNET_HDR: Int = 15
public const val PACKET_TX_TIMESTAMP: Int = 16
public const val PACKET_TIMESTAMP: Int = 17
public const val PACKET_MR_MULTICAST: Int = 0
public const val PACKET_MR_PROMISC: Int = 1
public const val PACKET_MR_ALLMULTI: Int = 2
public const val SIOCADDRT: ULong = 0x0000890BuL
public const val SIOCDELRT: ULong = 0x0000890CuL
public const val SIOCGIFNAME: ULong = 0x00008910uL
public const val SIOCSIFLINK: ULong = 0x00008911uL
public const val SIOCGIFCONF: ULong = 0x00008912uL
public const val SIOCGIFFLAGS: ULong = 0x00008913uL
public const val SIOCSIFFLAGS: ULong = 0x00008914uL
public const val SIOCGIFADDR: ULong = 0x00008915uL
public const val SIOCSIFADDR: ULong = 0x00008916uL
public const val SIOCGIFDSTADDR: ULong = 0x00008917uL
public const val SIOCSIFDSTADDR: ULong = 0x00008918uL
public const val SIOCGIFBRDADDR: ULong = 0x00008919uL
public const val SIOCSIFBRDADDR: ULong = 0x0000891AuL
public const val SIOCGIFNETMASK: ULong = 0x0000891BuL
public const val SIOCSIFNETMASK: ULong = 0x0000891CuL
public const val SIOCGIFMETRIC: ULong = 0x0000891DuL
public const val SIOCSIFMETRIC: ULong = 0x0000891EuL
public const val SIOCGIFMEM: ULong = 0x0000891FuL
public const val SIOCSIFMEM: ULong = 0x00008920uL
public const val SIOCGIFMTU: ULong = 0x00008921uL
public const val SIOCSIFMTU: ULong = 0x00008922uL
public const val SIOCSIFNAME: ULong = 0x00008923uL
public const val SIOCSIFHWADDR: ULong = 0x00008924uL
public const val SIOCGIFENCAP: ULong = 0x00008925uL
public const val SIOCSIFENCAP: ULong = 0x00008926uL
public const val SIOCGIFHWADDR: ULong = 0x00008927uL
public const val SIOCGIFSLAVE: ULong = 0x00008929uL
public const val SIOCSIFSLAVE: ULong = 0x00008930uL
public const val SIOCADDMULTI: ULong = 0x00008931uL
public const val SIOCDELMULTI: ULong = 0x00008932uL
public const val SIOCGIFINDEX: ULong = 0x00008933uL
public const val SIOGIFINDEX: ULong = SIOCGIFINDEX
public const val SIOCSIFPFLAGS: ULong = 0x00008934uL
public const val SIOCGIFPFLAGS: ULong = 0x00008935uL
public const val SIOCDIFADDR: ULong = 0x00008936uL
public const val SIOCSIFHWBROADCAST: ULong = 0x00008937uL
public const val SIOCGIFCOUNT: ULong = 0x00008938uL
public const val SIOCGIFBR: ULong = 0x00008940uL
public const val SIOCSIFBR: ULong = 0x00008941uL
public const val SIOCGIFTXQLEN: ULong = 0x00008942uL
public const val SIOCSIFTXQLEN: ULong = 0x00008943uL
public const val SIOCETHTOOL: ULong = 0x00008946uL
public const val SIOCGMIIPHY: ULong = 0x00008947uL
public const val SIOCGMIIREG: ULong = 0x00008948uL
public const val SIOCSMIIREG: ULong = 0x00008949uL
public const val SIOCWANDEV: ULong = 0x0000894AuL
public const val SIOCOUTQNSD: ULong = 0x0000894BuL
public const val SIOCGSKNS: ULong = 0x0000894CuL
public const val SIOCDARP: ULong = 0x00008953uL
public const val SIOCGARP: ULong = 0x00008954uL
public const val SIOCSARP: ULong = 0x00008955uL
public const val SIOCDRARP: ULong = 0x00008960uL
public const val SIOCGRARP: ULong = 0x00008961uL
public const val SIOCSRARP: ULong = 0x00008962uL
public const val SIOCGIFMAP: ULong = 0x00008970uL
public const val SIOCSIFMAP: ULong = 0x00008971uL
public val IPTOS_TOS_MASK: UByte = (0x1E).toUByte()
public val IPTOS_PREC_MASK: UByte = (0xE0).toUByte()
public val IPTOS_ECN_NOT_ECT: UByte = (0x00).toUByte()
public val RTF_UP: UShort = (0x0001).toUShort()
public val RTF_GATEWAY: UShort = (0x0002).toUShort()
public val RTF_HOST: UShort = (0x0004).toUShort()
public val RTF_REINSTATE: UShort = (0x0008).toUShort()
public val RTF_DYNAMIC: UShort = (0x0010).toUShort()
public val RTF_MODIFIED: UShort = (0x0020).toUShort()
public val RTF_MTU: UShort = (0x0040).toUShort()
public val RTF_MSS: UShort = RTF_MTU
public val RTF_WINDOW: UShort = (0x0080).toUShort()
public val RTF_IRTT: UShort = (0x0100).toUShort()
public val RTF_REJECT: UShort = (0x0200).toUShort()
public val RTF_STATIC: UShort = (0x0400).toUShort()
public val RTF_XRESOLVE: UShort = (0x0800).toUShort()
public val RTF_NOFORWARD: UShort = (0x1000).toUShort()
public val RTF_THROW: UShort = (0x2000).toUShort()
public val RTF_NOPMTUDISC: UShort = (0x4000).toUShort()
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
public val ARPD_UPDATE: UShort = (0x01).toUShort()
public val ARPD_LOOKUP: UShort = (0x02).toUShort()
public val ARPD_FLUSH: UShort = (0x03).toUShort()
public const val ATF_MAGIC: Int = 0x80
public const val UDP_CORK: Int = 1
public const val UDP_ENCAP: Int = 100
public const val UDP_NO_CHECK6_TX: Int = 101
public const val UDP_NO_CHECK6_RX: Int = 102
public const val MAP_FIXED_NOREPLACE: Int = 0x100000
public const val MLOCK_ONFAULT: UInt = 0x01u
public const val REG_EXTENDED: Int = 1
public const val REG_ICASE: Int = 2
public const val REG_NEWLINE: Int = 4
public const val REG_NOSUB: Int = 8
public const val REG_NOTBOL: Int = 1
public const val REG_NOTEOL: Int = 2
public const val REG_ENOSYS: Int = -1
public const val REG_NOMATCH: Int = 1
public const val REG_BADPAT: Int = 2
public const val REG_ECOLLATE: Int = 3
public const val REG_ECTYPE: Int = 4
public const val REG_EESCAPE: Int = 5
public const val REG_ESUBREG: Int = 6
public const val REG_EBRACK: Int = 7
public const val REG_EPAREN: Int = 8
public const val REG_EBRACE: Int = 9
public const val REG_BADBR: Int = 10
public const val REG_ERANGE: Int = 11
public const val REG_ESPACE: Int = 12
public const val REG_BADRPT: Int = 13
public const val EPERM: Int = 1
public const val ENOENT: Int = 2
public const val ESRCH: Int = 3
public const val EINTR: Int = 4
public const val EIO: Int = 5
public const val ENXIO: Int = 6
public const val E2BIG: Int = 7
public const val ENOEXEC: Int = 8
public const val EBADF: Int = 9
public const val ECHILD: Int = 10
public const val EAGAIN: Int = 11
public const val ENOMEM: Int = 12
public const val EACCES: Int = 13
public const val EFAULT: Int = 14
public const val ENOTBLK: Int = 15
public const val EBUSY: Int = 16
public const val EEXIST: Int = 17
public const val EXDEV: Int = 18
public const val ENODEV: Int = 19
public const val ENOTDIR: Int = 20
public const val EISDIR: Int = 21
public const val EINVAL: Int = 22
public const val ENFILE: Int = 23
public const val EMFILE: Int = 24
public const val ENOTTY: Int = 25
public const val ETXTBSY: Int = 26
public const val EFBIG: Int = 27
public const val ENOSPC: Int = 28
public const val ESPIPE: Int = 29
public const val EROFS: Int = 30
public const val EMLINK: Int = 31
public const val EPIPE: Int = 32
public const val EDOM: Int = 33
public const val ERANGE: Int = 34
public const val EWOULDBLOCK: Int = EAGAIN
public const val CSIGNAL: Int = 0x000000ff
public const val SCHED_NORMAL: Int = 0
public const val SCHED_OTHER: Int = 0
public const val SCHED_FIFO: Int = 1
public const val SCHED_RR: Int = 2
public const val SCHED_BATCH: Int = 3
public const val SCHED_IDLE: Int = 5
public const val SCHED_DEADLINE: Int = 6
public const val SCHED_RESET_ON_FORK: Int = 0x40000000
public const val NT_PRSTATUS: Int = 1
public const val NT_PRFPREG: Int = 2
public const val NT_FPREGSET: Int = 2
public const val NT_PRPSINFO: Int = 3
public const val NT_PRXREG: Int = 4
public const val NT_TASKSTRUCT: Int = 4
public const val NT_PLATFORM: Int = 5
public const val NT_AUXV: Int = 6
public const val NT_GWINDOWS: Int = 7
public const val NT_ASRS: Int = 8
public const val NT_PSTATUS: Int = 10
public const val NT_PSINFO: Int = 13
public const val NT_PRCRED: Int = 14
public const val NT_UTSNAME: Int = 15
public const val NT_LWPSTATUS: Int = 16
public const val NT_LWPSINFO: Int = 17
public const val NT_PRFPXREG: Int = 20
public const val MS_NOUSER: ULong = 0xffffffff80000000uL

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cpuAllocSize(count: Int): ULong

public expect fun cpuZero(cpuset: CpuSetT?)

public expect fun cpuSet(cpu: ULong, cpuset: CpuSetT?)

public expect fun cpuClear(cpu: ULong, cpuset: CpuSetT?)

public expect fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean

public expect fun cpuCountS(size: ULong, cpuset: CpuSetT?): Int

public expect fun cpuCount(cpuset: CpuSetT?): Int

public expect fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean

public fun ipTosTos(tos: UByte): UByte = 0u

public fun ipTosPrec(tos: UByte): UByte = 0u

public fun rtTos(tos: UByte): UByte = 0u

public fun rtAddrClass(flags: UInt): UInt = 0u

public expect fun rtLocalAddr(flags: UInt): Boolean

public fun elf32RSym(`val`: UInt): UInt = throw UnsupportedOperationException("Not implemented on this platform")

public fun elf32RType(`val`: UInt): UInt = throw UnsupportedOperationException("Not implemented on this platform")

public fun elf32RInfo(sym: UInt, t: UInt): UInt = throw UnsupportedOperationException("Not implemented on this platform")

public fun elf64RSym(`val`: ULong): ULong = throw UnsupportedOperationException("Not implemented on this platform")

public fun elf64RType(`val`: ULong): ULong = throw UnsupportedOperationException("Not implemented on this platform")

public fun elf64RInfo(sym: ULong, t: ULong): ULong = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun iopl(level: Int): Int

public expect fun ioperm(from: ULong, num: ULong, turnOn: Int): Int

public expect fun aioRead(aiocbp: Aiocb?): Int

public expect fun aioWrite(aiocbp: Aiocb?): Int

public expect fun aioFsync(op: Int, aiocbp: Aiocb?): Int

public expect fun aioError(aiocbp: Aiocb?): Int

public expect fun aioReturn(aiocbp: Aiocb?): Long

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int

public expect fun aioCancel(fd: Int, aiocbp: Aiocb?): Int

public expect fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int

public expect fun getloadavg(loadavg: Double?, nelem: Int): Int

public expect fun processVmReadv(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long

public expect fun processVmWritev(pid: Int, localIov: Iovec?, liovcnt: ULong, remoteIov: Iovec?, riovcnt: ULong, flags: ULong): Long

public expect fun futimes(fd: Int, times: Timeval?): Int

public expect fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int

public expect fun abs(i: Int): Int

public expect fun labs(i: Long): Long

public expect fun rand(): Int

public expect fun srand(seed: UInt)

public fun drand48(): Double = 0.0

public fun erand48(xseed: UShort?): Double = 0.0

public expect fun lrand48(): Long

public expect fun nrand48(xseed: UShort?): Long

public expect fun jrand48(xseed: UShort?): Long

public expect fun srand48(seed: Long)

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

public expect fun shmget(key: Int, size: ULong, shmflg: Int): Int

public expect fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): Int

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int

public expect fun errnoLocation(): Int?

public expect fun mremap(addr: COpaquePointer?, len: ULong, newLen: ULong, flags: Int, vararg args: Any?): COpaquePointer?

public expect fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int

public expect fun globfree(pglob: GlobT?)

public expect fun seekdir(dirp: DIR?, loc: Long)

public expect fun telldir(dirp: DIR?): Long

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int

public expect fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long

public expect fun nlLanginfo(item: Int): String?

public expect fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String?

public expect fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int

public expect fun schedGetPriorityMax(policy: Int): Int

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): Int

public expect fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int

public expect fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int

public expect fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int

public expect fun prctl(option: Int, vararg args: Any?): Int

public expect fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int

public expect fun sethostname(name: String?, len: ULong): Int

public expect fun schedGetPriorityMin(policy: Int): Int

public expect fun sysinfo(info: Sysinfo?): Int

public expect fun sigsuspend(mask: ULong?): Int

public expect fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int

public expect fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int

public expect fun initgroups(user: String?, group: UInt): Int

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer?

public expect fun getgrnam(name: String?): Group?

public expect fun semUnlink(name: String?): Int

public expect fun daemon(nochdir: Int, noclose: Int): Int

public expect fun sigwait(set: ULong?, sig: Int?): Int

public expect fun getgrgid(gid: UInt): Group?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int

public expect fun setmntent(filename: String?, ty: String?): FILE?

public expect fun getmntent(stream: FILE?): Mntent?

public expect fun addmntent(stream: FILE?, mnt: Mntent?): Int

public expect fun endmntent(streamp: FILE?): Int

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?

public expect fun regcomp(preg: io.github.kotlinmania.libc.COpaquePointer?, pattern: String?, cflags: Int): Int

public expect fun regexec(preg: io.github.kotlinmania.libc.COpaquePointer?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int

public expect fun regerror(errcode: Int, preg: io.github.kotlinmania.libc.COpaquePointer?, errbuf: String?, errbufSize: ULong): ULong

public expect fun regfree(preg: io.github.kotlinmania.libc.COpaquePointer?)

public fun iconvOpen(tocode: String?, fromcode: String?): io.github.kotlinmania.libc.COpaquePointer? = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong

public expect fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun gettid(): Int

public expect fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int

public expect fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int

public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?

public expect fun schedGetcpu(): Int

public expect fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int

public expect fun copyFileRange(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fseeko64(stream: FILE?, offset: Long, whence: Int): Int

public expect fun fsetpos64(stream: FILE?, ptr: Long?): Int

public expect fun ftello64(stream: FILE?): Long
