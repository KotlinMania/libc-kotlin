// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.EOPNOTSUPP
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword
import io.github.kotlinmania.libc.unix.linuxlike.LC_COLLATE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_CTYPE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MESSAGES_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MONETARY_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_NUMERIC_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_TIME_MASK
import io.github.kotlinmania.libc.unix.linuxlike.NLMSG_MIN_TYPE
import io.github.kotlinmania.libc.unix.linuxlike.linux.FanotifyEventInfoHeader

public typealias PthreadT = CULong
public typealias PriorityWhichT = CUInt
public typealias RlimitResourceT = CUInt
public typealias LmidT = CLong
public typealias RegoffT = CInt
public typealias KernelRwfT = CInt
public typealias Ioctl = CULong

public data class Aiocb(
    val aioFildes: CInt,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val nextPrio: Aiocb?,
    val absPrio: CInt,
    val policy: CInt,
    val errorCode: CInt,
    val returnValue: SsizeT,
    val aioOffset: OffT,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
)

public data class Timeval(
    val tvSec: Int,
    val tvUsec: Int,
)

public data class Glob64T(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: CInt,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
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

public data class Mallinfo(
    val arena: CInt,
    val ordblks: CInt,
    val smblks: CInt,
    val hblks: CInt,
    val hblkhd: CInt,
    val usmblks: CInt,
    val fsmblks: CInt,
    val uordblks: CInt,
    val fordblks: CInt,
    val keepcost: CInt,
)

public data class Mallinfo2(
    val arena: ULong,
    val ordblks: ULong,
    val smblks: ULong,
    val hblks: ULong,
    val hblkhd: ULong,
    val usmblks: ULong,
    val fsmblks: ULong,
    val uordblks: ULong,
    val fordblks: ULong,
    val keepcost: ULong,
)

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: CLong,
    val esterror: CLong,
    val tai: CLong,
    val glibcReserved1: CLong,
    val glibcReserved2: CLong,
    val glibcReserved3: CLong,
    val glibcReserved4: CLong,
)

public data class RegexT(
    val buffer: COpaquePointer?,
    val allocated: ULong,
    val used: ULong,
    val syntax: CULong,
    val fastmap: String?,
    val translate: String?,
    val reNsub: ULong,
    val bitfield: UByte,
)

public data class Elf64Chdr(
    val chType: Elf64Word,
    val chReserved: Elf64Word,
    val chSize: Elf64Xword,
    val chAddralign: Elf64Xword,
)

public data class Elf32Chdr(
    val chType: Elf32Word,
    val chSize: Elf32Word,
    val chAddralign: Elf32Word,
)

public data class Seminfo(
    val semmap: CInt,
    val semmni: CInt,
    val semmns: CInt,
    val semmnu: CInt,
    val semmsl: CInt,
    val semopm: CInt,
    val semume: CInt,
    val semusz: CInt,
    val semvmx: CInt,
    val semaem: CInt,
)

public data class PtracePeeksiginfoArgs(
    val off: U64,
    val flags: U32,
    val nr: S32,
)

public data class CAnonymousPtraceSyscallInfoEntry(
    val nr: U64,
    val args: List<U64>,
)

public data class CAnonymousPtraceSyscallInfoExit(
    val sval: S64,
    val isError: U8,
)

public data class CAnonymousPtraceSyscallInfoSeccomp(
    val nr: U64,
    val args: List<U64>,
    val retData: U32,
)

public data class PtraceSyscallInfo(
    val op: U8,
    val pad: List<U8>,
    val arch: U32,
    val instructionPointer: U64,
    val stackPointer: U64,
    val u: CAnonymousPtraceSyscallInfoData,
)

public data class PtraceSudConfig(
    val mode: U64,
    val selector: U64,
    val offset: U64,
    val len: U64,
)

public data class Iocb(
    val aioData: U64,
    val aioKey: U32,
    val aioRwFlags: KernelRwfT,
    val aioRwFlags2: KernelRwfT,
    val aioKey2: U32,
    val aioLioOpcode: U16,
    val aioReqprio: S16,
    val aioFildes: U32,
    val aioBuf: U64,
    val aioNbytes: U64,
    val aioOffset: S64,
    val aioFlags: U32,
    val aioResfd: U32,
)

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpiSndRcvWscale: UByte,
    val tcpiRto: UInt,
    val tcpiAto: UInt,
    val tcpiSndMss: UInt,
    val tcpiRcvMss: UInt,
    val tcpiUnacked: UInt,
    val tcpiSacked: UInt,
    val tcpiLost: UInt,
    val tcpiRetrans: UInt,
    val tcpiFackets: UInt,
    val tcpiLastDataSent: UInt,
    val tcpiLastAckSent: UInt,
    val tcpiLastDataRecv: UInt,
    val tcpiLastAckRecv: UInt,
    val tcpiPmtu: UInt,
    val tcpiRcvSsthresh: UInt,
    val tcpiRtt: UInt,
    val tcpiRttvar: UInt,
    val tcpiSndSsthresh: UInt,
    val tcpiSndCwnd: UInt,
    val tcpiAdvmss: UInt,
    val tcpiReordering: UInt,
    val tcpiRcvRtt: UInt,
    val tcpiRcvSpace: UInt,
    val tcpiTotalRetrans: UInt,
)

public data class FanotifyEventInfoPidfd(
    val hdr: FanotifyEventInfoHeader,
    val pidfd: S32,
)

public data class FanotifyEventInfoError(
    val hdr: FanotifyEventInfoHeader,
    val error: S32,
    val errorCount: U32,
)

public data class SemT(
    val size: ByteArray,
    val size2: ByteArray,
)

public data class MbstateT(
    val count: CInt,
    val wchb: ByteArray,
)

public data class Fpos64T(
    val pos: Off64T,
    val state: MbstateT,
)

public data class FposT(
    val pos: OffT,
    val pos2: Off64T,
    val state: MbstateT,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
    val tvNsec2: Long,
)

public data class Utmpx(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: CLong,
    val utTv: Timeval,
    val utSession2: Int,
    val utTv2: Timeval,
    val utAddrV6: IntArray,
)

// C union; only one variant is valid at a time.
public data class CAnonymousPtraceSyscallInfoData(
    val entry: CAnonymousPtraceSyscallInfoEntry? = null,
    val exit: CAnonymousPtraceSyscallInfoExit? = null,
    val seccomp: CAnonymousPtraceSyscallInfoSeccomp? = null,
)

public const val HUGETLB_FLAG_ENCODE_SHIFT: CInt = 26
public const val HUGETLB_FLAG_ENCODE_MASK: CInt = 0x3f
public val HUGETLB_FLAG_ENCODE_64KB: CInt = 16 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_512KB: CInt = 19 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_1MB: CInt = 20 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_2MB: CInt = 21 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_8MB: CInt = 23 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_16MB: CInt = 24 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_32MB: CInt = 25 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_256MB: CInt = 28 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_512MB: CInt = 29 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_1GB: CInt = 30 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_2GB: CInt = 31 shl HUGETLB_FLAG_ENCODE_SHIFT
public val HUGETLB_FLAG_ENCODE_16GB: CInt = 34 shl HUGETLB_FLAG_ENCODE_SHIFT
public const val MAP_HUGE_SHIFT: CInt = HUGETLB_FLAG_ENCODE_SHIFT
public const val MAP_HUGE_MASK: CInt = HUGETLB_FLAG_ENCODE_MASK
public val MAP_HUGE_64KB: CInt = HUGETLB_FLAG_ENCODE_64KB
public val MAP_HUGE_512KB: CInt = HUGETLB_FLAG_ENCODE_512KB
public val MAP_HUGE_1MB: CInt = HUGETLB_FLAG_ENCODE_1MB
public val MAP_HUGE_2MB: CInt = HUGETLB_FLAG_ENCODE_2MB
public val MAP_HUGE_8MB: CInt = HUGETLB_FLAG_ENCODE_8MB
public val MAP_HUGE_16MB: CInt = HUGETLB_FLAG_ENCODE_16MB
public val MAP_HUGE_32MB: CInt = HUGETLB_FLAG_ENCODE_32MB
public val MAP_HUGE_256MB: CInt = HUGETLB_FLAG_ENCODE_256MB
public val MAP_HUGE_512MB: CInt = HUGETLB_FLAG_ENCODE_512MB
public val MAP_HUGE_1GB: CInt = HUGETLB_FLAG_ENCODE_1GB
public val MAP_HUGE_2GB: CInt = HUGETLB_FLAG_ENCODE_2GB
public val MAP_HUGE_16GB: CInt = HUGETLB_FLAG_ENCODE_16GB
public const val PRIO_PROCESS: PriorityWhichT = 0u
public const val PRIO_PGRP: PriorityWhichT = 1u
public const val PRIO_USER: PriorityWhichT = 2u
public const val MS_RMT_MASK: CULong = 0x02800051uL
public const val __UT_LINESIZE: ULong = 32uL
public const val __UT_NAMESIZE: ULong = 32uL
public const val __UT_HOSTSIZE: ULong = 256uL
public const val EMPTY: CShort = 0
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val NEW_TIME: CShort = 3
public const val OLD_TIME: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val ACCOUNTING: CShort = 9
public const val LM_ID_BASE: CLong = 0
public const val LM_ID_NEWLM: CLong = -1
public const val RTLD_DI_LMID: CInt = 1
public const val RTLD_DI_LINKMAP: CInt = 2
public const val RTLD_DI_CONFIGADDR: CInt = 3
public const val RTLD_DI_SERINFO: CInt = 4
public const val RTLD_DI_SERINFOSIZE: CInt = 5
public const val RTLD_DI_ORIGIN: CInt = 6
public const val RTLD_DI_PROFILENAME: CInt = 7
public const val RTLD_DI_PROFILEOUT: CInt = 8
public const val RTLD_DI_TLS_MODID: CInt = 9
public const val RTLD_DI_TLS_DATA: CInt = 10
public const val SOCK_NONBLOCK: CInt = O_NONBLOCK
public const val SOL_RXRPC: CInt = 272
public const val SOL_PPPOL2TP: CInt = 273
public const val SOL_PNPIPE: CInt = 275
public const val SOL_RDS: CInt = 276
public const val SOL_IUCV: CInt = 277
public const val SOL_CAIF: CInt = 278
public const val SOL_NFC: CInt = 280
public const val MSG_TRYHARD: CInt = 4
public const val LC_PAPER: CInt = 7
public const val LC_NAME: CInt = 8
public const val LC_ADDRESS: CInt = 9
public const val LC_TELEPHONE: CInt = 10
public const val LC_MEASUREMENT: CInt = 11
public const val LC_IDENTIFICATION: CInt = 12
public val LC_PAPER_MASK: CInt = 1 shl LC_PAPER
public val LC_NAME_MASK: CInt = 1 shl LC_NAME
public val LC_ADDRESS_MASK: CInt = 1 shl LC_ADDRESS
public val LC_TELEPHONE_MASK: CInt = 1 shl LC_TELEPHONE
public val LC_MEASUREMENT_MASK: CInt = 1 shl LC_MEASUREMENT
public val LC_IDENTIFICATION_MASK: CInt = 1 shl LC_IDENTIFICATION
public val LC_ALL_MASK: CInt = LC_CTYPE_MASK.or(LC_NUMERIC_MASK) or LC_TIME_MASK.or(LC_COLLATE_MASK) or LC_MONETARY_MASK.or(LC_MESSAGES_MASK) or LC_PAPER_MASK.or(LC_NAME_MASK) or LC_ADDRESS_MASK.or(LC_TELEPHONE_MASK) or LC_MEASUREMENT_MASK.or(LC_IDENTIFICATION_MASK)
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_DCCP: CInt = 6
public const val SOCK_PACKET: CInt = 10
public const val AF_IB: CInt = 27
public const val AF_MPLS: CInt = 28
public const val AF_NFC: CInt = 39
public const val AF_VSOCK: CInt = 40
public const val AF_XDP: CInt = 44
public const val PF_IB: CInt = AF_IB
public const val PF_MPLS: CInt = AF_MPLS
public const val PF_NFC: CInt = AF_NFC
public const val PF_VSOCK: CInt = AF_VSOCK
public const val PF_XDP: CInt = AF_XDP
public const val SIGEV_THREAD_ID: CInt = 4
public const val BUFSIZ: CUInt = 8192u
public const val TMP_MAX: CUInt = 238328u
public const val FOPEN_MAX: CUInt = 16u
public const val FILENAME_MAX: CUInt = 4096u
public const val _CS_GNU_LIBC_VERSION: CInt = 2
public const val _CS_GNU_LIBPTHREAD_VERSION: CInt = 3
public const val _CS_V6_ENV: CInt = 1148
public const val _CS_V7_ENV: CInt = 1149
public const val _SC_EQUIV_CLASS_MAX: CInt = 41
public const val _SC_CHARCLASS_NAME_MAX: CInt = 45
public const val _SC_PII: CInt = 53
public const val _SC_PII_XTI: CInt = 54
public const val _SC_PII_SOCKET: CInt = 55
public const val _SC_PII_INTERNET: CInt = 56
public const val _SC_PII_OSI: CInt = 57
public const val _SC_POLL: CInt = 58
public const val _SC_SELECT: CInt = 59
public const val _SC_PII_INTERNET_STREAM: CInt = 61
public const val _SC_PII_INTERNET_DGRAM: CInt = 62
public const val _SC_PII_OSI_COTS: CInt = 63
public const val _SC_PII_OSI_CLTS: CInt = 64
public const val _SC_PII_OSI_M: CInt = 65
public const val _SC_T_IOV_MAX: CInt = 66
public const val _SC_2_C_VERSION: CInt = 96
public const val _SC_CHAR_BIT: CInt = 101
public const val _SC_CHAR_MAX: CInt = 102
public const val _SC_CHAR_MIN: CInt = 103
public const val _SC_INT_MAX: CInt = 104
public const val _SC_INT_MIN: CInt = 105
public const val _SC_LONG_BIT: CInt = 106
public const val _SC_WORD_BIT: CInt = 107
public const val _SC_MB_LEN_MAX: CInt = 108
public const val _SC_SSIZE_MAX: CInt = 110
public const val _SC_SCHAR_MAX: CInt = 111
public const val _SC_SCHAR_MIN: CInt = 112
public const val _SC_SHRT_MAX: CInt = 113
public const val _SC_SHRT_MIN: CInt = 114
public const val _SC_UCHAR_MAX: CInt = 115
public const val _SC_UINT_MAX: CInt = 116
public const val _SC_ULONG_MAX: CInt = 117
public const val _SC_USHRT_MAX: CInt = 118
public const val _SC_NL_ARGMAX: CInt = 119
public const val _SC_NL_LANGMAX: CInt = 120
public const val _SC_NL_MSGMAX: CInt = 121
public const val _SC_NL_NMAX: CInt = 122
public const val _SC_NL_SETMAX: CInt = 123
public const val _SC_NL_TEXTMAX: CInt = 124
public const val _SC_BASE: CInt = 134
public const val _SC_C_LANG_SUPPORT: CInt = 135
public const val _SC_C_LANG_SUPPORT_R: CInt = 136
public const val _SC_DEVICE_IO: CInt = 140
public const val _SC_DEVICE_SPECIFIC: CInt = 141
public const val _SC_DEVICE_SPECIFIC_R: CInt = 142
public const val _SC_FD_MGMT: CInt = 143
public const val _SC_FIFO: CInt = 144
public const val _SC_PIPE: CInt = 145
public const val _SC_FILE_ATTRIBUTES: CInt = 146
public const val _SC_FILE_LOCKING: CInt = 147
public const val _SC_FILE_SYSTEM: CInt = 148
public const val _SC_MULTI_PROCESS: CInt = 150
public const val _SC_SINGLE_PROCESS: CInt = 151
public const val _SC_NETWORKING: CInt = 152
public const val _SC_REGEX_VERSION: CInt = 156
public const val _SC_SIGNALS: CInt = 158
public const val _SC_SYSTEM_DATABASE: CInt = 162
public const val _SC_SYSTEM_DATABASE_R: CInt = 163
public const val _SC_USER_GROUPS: CInt = 166
public const val _SC_USER_GROUPS_R: CInt = 167
public const val _SC_LEVEL1_ICACHE_SIZE: CInt = 185
public const val _SC_LEVEL1_ICACHE_ASSOC: CInt = 186
public const val _SC_LEVEL1_ICACHE_LINESIZE: CInt = 187
public const val _SC_LEVEL1_DCACHE_SIZE: CInt = 188
public const val _SC_LEVEL1_DCACHE_ASSOC: CInt = 189
public const val _SC_LEVEL1_DCACHE_LINESIZE: CInt = 190
public const val _SC_LEVEL2_CACHE_SIZE: CInt = 191
public const val _SC_LEVEL2_CACHE_ASSOC: CInt = 192
public const val _SC_LEVEL2_CACHE_LINESIZE: CInt = 193
public const val _SC_LEVEL3_CACHE_SIZE: CInt = 194
public const val _SC_LEVEL3_CACHE_ASSOC: CInt = 195
public const val _SC_LEVEL3_CACHE_LINESIZE: CInt = 196
public const val _SC_LEVEL4_CACHE_SIZE: CInt = 197
public const val _SC_LEVEL4_CACHE_ASSOC: CInt = 198
public const val _SC_LEVEL4_CACHE_LINESIZE: CInt = 199
public const val O_ACCMODE: CInt = 3
public const val ST_RELATIME: CULong = 4096uL
public const val NI_MAXHOST: SocklenT = 1025u
public const val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70
public const val XFS_SUPER_MAGIC: CLong = 0x58465342
public const val CPU_SETSIZE: CInt = 0x400
public const val PTRACE_TRACEME: CUInt = 0u
public const val PTRACE_PEEKTEXT: CUInt = 1u
public const val PTRACE_PEEKDATA: CUInt = 2u
public const val PTRACE_PEEKUSER: CUInt = 3u
public const val PTRACE_POKETEXT: CUInt = 4u
public const val PTRACE_POKEDATA: CUInt = 5u
public const val PTRACE_POKEUSER: CUInt = 6u
public const val PTRACE_CONT: CUInt = 7u
public const val PTRACE_KILL: CUInt = 8u
public const val PTRACE_SINGLESTEP: CUInt = 9u
public const val PTRACE_ATTACH: CUInt = 16u
public const val PTRACE_SYSCALL: CUInt = 24u
public const val PTRACE_SETOPTIONS: CUInt = 0x4200u
public const val PTRACE_GETEVENTMSG: CUInt = 0x4201u
public const val PTRACE_GETSIGINFO: CUInt = 0x4202u
public const val PTRACE_SETSIGINFO: CUInt = 0x4203u
public const val PTRACE_GETREGSET: CUInt = 0x4204u
public const val PTRACE_SETREGSET: CUInt = 0x4205u
public const val PTRACE_SEIZE: CUInt = 0x4206u
public const val PTRACE_INTERRUPT: CUInt = 0x4207u
public const val PTRACE_LISTEN: CUInt = 0x4208u
public const val PTRACE_PEEKSIGINFO: CUInt = 0x4209u
public const val PTRACE_GETSIGMASK: CUInt = 0x420au
public const val PTRACE_SETSIGMASK: CUInt = 0x420bu
public const val PTRACE_GET_SYSCALL_INFO: CUInt = 0x420eu
public const val PTRACE_SET_SYSCALL_INFO: CUInt = 0x4212u
public const val PTRACE_SYSCALL_INFO_NONE: U8 = 0u
public const val PTRACE_SYSCALL_INFO_ENTRY: U8 = 1u
public const val PTRACE_SYSCALL_INFO_EXIT: U8 = 2u
public const val PTRACE_SYSCALL_INFO_SECCOMP: U8 = 3u
public const val PTRACE_SET_SYSCALL_USER_DISPATCH_CONFIG: CUInt = 0x4210u
public const val PTRACE_GET_SYSCALL_USER_DISPATCH_CONFIG: CUInt = 0x4211u
public val TCA_PAD: CUShort = (9).toUShort()
public val TCA_DUMP_INVISIBLE: CUShort = (10).toUShort()
public val TCA_CHAIN: CUShort = (11).toUShort()
public val TCA_HW_OFFLOAD: CUShort = (12).toUShort()
public val RTM_DELNETCONF: UShort = (81).toUShort()
public val RTM_NEWSTATS: UShort = (92).toUShort()
public val RTM_GETSTATS: UShort = (94).toUShort()
public val RTM_NEWCACHEREPORT: UShort = (96).toUShort()
public const val RTM_F_LOOKUP_TABLE: CUInt = 0x1000u
public const val RTM_F_FIB_MATCH: CUInt = 0x2000u
public val RTA_VIA: CUShort = (18).toUShort()
public val RTA_NEWDST: CUShort = (19).toUShort()
public val RTA_PREF: CUShort = (20).toUShort()
public val RTA_ENCAP_TYPE: CUShort = (21).toUShort()
public val RTA_ENCAP: CUShort = (22).toUShort()
public val RTA_EXPIRES: CUShort = (23).toUShort()
public val RTA_PAD: CUShort = (24).toUShort()
public val RTA_UID: CUShort = (25).toUShort()
public val RTA_TTL_PROPAGATE: CUShort = (26).toUShort()
public val NTF_EXT_LEARNED: UByte = (0x10).toUByte()
public val NTF_OFFLOADED: UByte = (0x20).toUByte()
public val NDA_MASTER: CUShort = (9).toUShort()
public val NDA_LINK_NETNSID: CUShort = (10).toUShort()
public val NDA_SRC_VNI: CUShort = (11).toUShort()
public const val UNAME26: CInt = 0x0020000
public const val FDPIC_FUNCPTRS: CInt = 0x0080000
public const val GENL_UNS_ADMIN_PERM: CInt = 0x10
public val GENL_ID_VFS_DQUOT: CInt = NLMSG_MIN_TYPE + 1
public val GENL_ID_PMCRAID: CInt = NLMSG_MIN_TYPE + 2
public val ELFOSABI_ARM_AEABI: UByte = (64).toUByte()
public const val CLONE_NEWTIME: CInt = 0x80
public const val CLONE_CLEAR_SIGHAND: CInt = 0x100000000.toInt()
public const val CLONE_INTO_CGROUP: CInt = 0x200000000.toInt()
public const val M_MXFAST: CInt = 1
public const val M_NLBLKS: CInt = 2
public const val M_GRAIN: CInt = 3
public const val M_KEEP: CInt = 4
public const val M_TRIM_THRESHOLD: CInt = -1
public const val M_TOP_PAD: CInt = -2
public const val M_MMAP_THRESHOLD: CInt = -3
public const val M_MMAP_MAX: CInt = -4
public const val M_CHECK_ACTION: CInt = -5
public const val M_PERTURB: CInt = -6
public const val M_ARENA_TEST: CInt = -7
public const val M_ARENA_MAX: CInt = -8
public const val SOMAXCONN: CInt = 4096
public const val MOVE_MOUNT_F_SYMLINKS: CUInt = 0x00000001u
public const val MOVE_MOUNT_F_AUTOMOUNTS: CUInt = 0x00000002u
public const val MOVE_MOUNT_F_EMPTY_PATH: CUInt = 0x00000004u
public const val MOVE_MOUNT_T_SYMLINKS: CUInt = 0x00000010u
public const val MOVE_MOUNT_T_AUTOMOUNTS: CUInt = 0x00000020u
public const val MOVE_MOUNT_T_EMPTY_PATH: CUInt = 0x00000040u
public const val MOVE_MOUNT_SET_GROUP: CUInt = 0x00000100u
public const val MOVE_MOUNT_BENEATH: CUInt = 0x00000200u
public const val ADJ_OFFSET: CUInt = 0x0001u
public const val ADJ_FREQUENCY: CUInt = 0x0002u
public const val ADJ_MAXERROR: CUInt = 0x0004u
public const val ADJ_ESTERROR: CUInt = 0x0008u
public const val ADJ_STATUS: CUInt = 0x0010u
public const val ADJ_TIMECONST: CUInt = 0x0020u
public const val ADJ_TAI: CUInt = 0x0080u
public const val ADJ_SETOFFSET: CUInt = 0x0100u
public const val ADJ_MICRO: CUInt = 0x1000u
public const val ADJ_NANO: CUInt = 0x2000u
public const val ADJ_TICK: CUInt = 0x4000u
public const val ADJ_OFFSET_SINGLESHOT: CUInt = 0x8001u
public const val ADJ_OFFSET_SS_READ: CUInt = 0xa001u
public const val MOD_OFFSET: CUInt = ADJ_OFFSET
public const val MOD_FREQUENCY: CUInt = ADJ_FREQUENCY
public const val MOD_MAXERROR: CUInt = ADJ_MAXERROR
public const val MOD_ESTERROR: CUInt = ADJ_ESTERROR
public const val MOD_STATUS: CUInt = ADJ_STATUS
public const val MOD_TIMECONST: CUInt = ADJ_TIMECONST
public const val MOD_CLKB: CUInt = ADJ_TICK
public const val MOD_CLKA: CUInt = ADJ_OFFSET_SINGLESHOT
public const val MOD_TAI: CUInt = ADJ_TAI
public const val MOD_MICRO: CUInt = ADJ_MICRO
public const val MOD_NANO: CUInt = ADJ_NANO
public const val STA_PLL: CInt = 0x0001
public const val STA_PPSFREQ: CInt = 0x0002
public const val STA_PPSTIME: CInt = 0x0004
public const val STA_FLL: CInt = 0x0008
public const val STA_INS: CInt = 0x0010
public const val STA_DEL: CInt = 0x0020
public const val STA_UNSYNC: CInt = 0x0040
public const val STA_FREQHOLD: CInt = 0x0080
public const val STA_PPSSIGNAL: CInt = 0x0100
public const val STA_PPSJITTER: CInt = 0x0200
public const val STA_PPSWANDER: CInt = 0x0400
public const val STA_PPSERROR: CInt = 0x0800
public const val STA_CLOCKERR: CInt = 0x1000
public const val STA_NANO: CInt = 0x2000
public const val STA_MODE: CInt = 0x4000
public const val STA_CLK: CInt = 0x8000
public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK
public const val NTP_API: CInt = 4
public const val TIME_OK: CInt = 0
public const val TIME_INS: CInt = 1
public const val TIME_DEL: CInt = 2
public const val TIME_OOP: CInt = 3
public const val TIME_WAIT: CInt = 4
public const val TIME_ERROR: CInt = 5
public const val TIME_BAD: CInt = TIME_ERROR
public const val MAXTC: CLong = 6
public val GLOB_PERIOD: CInt = 1 shl 7
public val GLOB_ALTDIRFUNC: CInt = 1 shl 9
public val GLOB_BRACE: CInt = 1 shl 10
public val GLOB_NOMAGIC: CInt = 1 shl 11
public val GLOB_TILDE: CInt = 1 shl 12
public val GLOB_ONLYDIR: CInt = 1 shl 13
public val GLOB_TILDE_CHECK: CInt = 1 shl 14
public const val MADV_COLLAPSE: CInt = 25
public const val PTHREAD_STACK_MIN: ULong = 16384uL
public const val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3
public const val REG_STARTEND: CInt = 4
public const val REG_EEND: CInt = 14
public const val REG_ESIZE: CInt = 15
public const val REG_ERPAREN: CInt = 16

public fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt = -1

public fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt = -1

public fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt = -1

public fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) { }

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt = -1

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt = -1

public fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt = -1

public fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt = -1

public fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt = -1

public fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt = -1

public fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt = -1

public fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt = -1

public fun utmpname(file: String?): CInt = -1

public fun utmpxname(file: String?): CInt = -1

public fun getutxent(): Utmpx? = null

public fun getutxid(ut: Utmpx?): Utmpx? = null

public fun getutxline(ut: Utmpx?): Utmpx? = null

public fun pututxline(ut: Utmpx?): Utmpx? = null

public fun setutxent() { }

public fun endutxent() { }

public fun getpt(): CInt = -1

public fun mallopt(param: CInt, value: CInt): CInt = -1

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt = -1

public fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt = -1

public fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT = -1L

public fun getauxval(type: CULong): CULong = 0uL

public fun adjtimex(buf: Timex?): CInt = -1

public fun ntpAdjtime(buf: Timex?): CInt = -1

public fun ntpGettime(buf: Ntptimeval?): CInt = -1

public fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt = -1

public fun fanotifyMark(fd: CInt, flags: CUInt, mask: ULong, dirfd: CInt, path: String?): CInt = -1

public fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT = -1L

public fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT = -1L

public fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT = -1L

public fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT = -1L

public fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt = -1

public fun explicitBzero(s: COpaquePointer?, len: ULong) { }

public fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? = null

public fun ctermid(s: String?): String? = null

public fun backtrace(buf: COpaquePointer?, sz: CInt): CInt = -1

public fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? = null

public fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) { }

public fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt = -1

public fun globfree64(pglob: Glob64T?) { }

public fun ptrace(request: CUInt, vararg args: Any?): CLong = -1L

public fun pthreadAttrGetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun pthreadAttrSetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt = -1

public fun getpriority(which: PriorityWhichT, who: IdT): CInt = -1

public fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt = -1

public fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT, `val`: CInt?): CInt = -1

public fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT, `val`: CInt): CInt = -1

public fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt = -1

public fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt = -1

public fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt = -1

public fun mallinfo(): Mallinfo { throw UnsupportedOperationException("Not implemented on this platform") }

public fun mallinfo2(): Mallinfo2 { throw UnsupportedOperationException("Not implemented on this platform") }

public fun mallocStats() { }

public fun mallocInfo(options: CInt, stream: FILE?): CInt = -1

public fun mallocUsableSize(ptr: COpaquePointer?): ULong = 0uL

public fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun putpwent(p: Passwd?, stream: FILE?): CInt = -1

public fun putgrent(grp: Group?, stream: FILE?): CInt = -1

public fun sethostid(hostid: CLong): CInt = -1

public fun memfdCreate(name: String?, flags: CUInt): CInt = -1

public fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt = -1

public fun euidaccess(pathname: String?, mode: CInt): CInt = -1

public fun eaccess(pathname: String?, mode: CInt): CInt = -1

public fun asctimeR(tm: Tm?, buf: String?): String? = null

public fun ctimeR(timep: TimeT?, buf: String?): String? = null

public fun dirname(path: String?): String? = null

public fun posixBasename(path: String?): String? = null

public fun gnuBasename(path: String?): String? = null

public fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? = null

public fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt = -1

public fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt = -1

public fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? = null

public fun mallocTrim(pad: ULong): CInt = -1

public fun gnuGetLibcRelease(): String? = null

public fun gnuGetLibcVersion(): String? = null

public fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt = -1

public fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt = -1

public fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT, from: CInt): CInt = -1

public fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT, tcfd: CInt): CInt = -1

public fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent? = null

public fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt = -1

public fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt = -1

public fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt = -1

public fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: Timespec?, sigmask: SigsetT?): CInt = -1

public fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? = null

public fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt = -1
