package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.EOPNOTSUPP
import io.github.kotlinmania.libc.unix.linuxlike.LC_COLLATE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_CTYPE_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MESSAGES_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_MONETARY_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_NUMERIC_MASK
import io.github.kotlinmania.libc.unix.linuxlike.LC_TIME_MASK
import io.github.kotlinmania.libc.unix.linuxlike.NLMSG_MIN_TYPE

public const val HUGETLB_FLAG_ENCODE_SHIFT: Int = 26

public const val HUGETLB_FLAG_ENCODE_MASK: Int = 0x3f

public val HUGETLB_FLAG_ENCODE_64KB: Int = 16 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_512KB: Int = 19 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_1MB: Int = 20 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_2MB: Int = 21 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_8MB: Int = 23 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_16MB: Int = 24 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_32MB: Int = 25 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_256MB: Int = 28 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_512MB: Int = 29 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_1GB: Int = 30 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_2GB: Int = 31 shl HUGETLB_FLAG_ENCODE_SHIFT

public val HUGETLB_FLAG_ENCODE_16GB: Int = 34 shl HUGETLB_FLAG_ENCODE_SHIFT

public const val MAP_HUGE_SHIFT: Int = HUGETLB_FLAG_ENCODE_SHIFT

public const val MAP_HUGE_MASK: Int = HUGETLB_FLAG_ENCODE_MASK

public val MAP_HUGE_64KB: Int = HUGETLB_FLAG_ENCODE_64KB

public val MAP_HUGE_512KB: Int = HUGETLB_FLAG_ENCODE_512KB

public val MAP_HUGE_1MB: Int = HUGETLB_FLAG_ENCODE_1MB

public val MAP_HUGE_2MB: Int = HUGETLB_FLAG_ENCODE_2MB

public val MAP_HUGE_8MB: Int = HUGETLB_FLAG_ENCODE_8MB

public val MAP_HUGE_16MB: Int = HUGETLB_FLAG_ENCODE_16MB

public val MAP_HUGE_32MB: Int = HUGETLB_FLAG_ENCODE_32MB

public val MAP_HUGE_256MB: Int = HUGETLB_FLAG_ENCODE_256MB

public val MAP_HUGE_512MB: Int = HUGETLB_FLAG_ENCODE_512MB

public val MAP_HUGE_1GB: Int = HUGETLB_FLAG_ENCODE_1GB

public val MAP_HUGE_2GB: Int = HUGETLB_FLAG_ENCODE_2GB

public val MAP_HUGE_16GB: Int = HUGETLB_FLAG_ENCODE_16GB

public const val PRIO_PROCESS: UInt = 0u

public const val PRIO_PGRP: UInt = 1u

public const val PRIO_USER: UInt = 2u

public const val MS_RMT_MASK: ULong = 0x02800051uL

public const val __UT_LINESIZE: ULong = 32uL

public const val __UT_NAMESIZE: ULong = 32uL

public const val __UT_HOSTSIZE: ULong = 256uL

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val NEW_TIME: Short = 3

public const val OLD_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9

public const val LM_ID_BASE: Long = 0

public const val LM_ID_NEWLM: Long = -1

public const val RTLD_DI_LMID: Int = 1

public const val RTLD_DI_LINKMAP: Int = 2

public const val RTLD_DI_CONFIGADDR: Int = 3

public const val RTLD_DI_SERINFO: Int = 4

public const val RTLD_DI_SERINFOSIZE: Int = 5

public const val RTLD_DI_ORIGIN: Int = 6

public const val RTLD_DI_PROFILENAME: Int = 7

public const val RTLD_DI_PROFILEOUT: Int = 8

public const val RTLD_DI_TLS_MODID: Int = 9

public const val RTLD_DI_TLS_DATA: Int = 10

public const val SOCK_NONBLOCK: Int = O_NONBLOCK

public const val SOL_RXRPC: Int = 272

public const val SOL_PPPOL2TP: Int = 273

public const val SOL_PNPIPE: Int = 275

public const val SOL_RDS: Int = 276

public const val SOL_IUCV: Int = 277

public const val SOL_CAIF: Int = 278

public const val SOL_NFC: Int = 280

public const val MSG_TRYHARD: Int = 4

public const val LC_PAPER: Int = 7

public const val LC_NAME: Int = 8

public const val LC_ADDRESS: Int = 9

public const val LC_TELEPHONE: Int = 10

public const val LC_MEASUREMENT: Int = 11

public const val LC_IDENTIFICATION: Int = 12

public val LC_PAPER_MASK: Int = 1 shl LC_PAPER

public val LC_NAME_MASK: Int = 1 shl LC_NAME

public val LC_ADDRESS_MASK: Int = 1 shl LC_ADDRESS

public val LC_TELEPHONE_MASK: Int = 1 shl LC_TELEPHONE

public val LC_MEASUREMENT_MASK: Int = 1 shl LC_MEASUREMENT

public val LC_IDENTIFICATION_MASK: Int = 1 shl LC_IDENTIFICATION

public val LC_ALL_MASK: Int = LC_CTYPE_MASK.or(LC_NUMERIC_MASK) or LC_TIME_MASK.or(LC_COLLATE_MASK) or LC_MONETARY_MASK.or(LC_MESSAGES_MASK) or LC_PAPER_MASK.or(LC_NAME_MASK) or LC_ADDRESS_MASK.or(LC_TELEPHONE_MASK) or LC_MEASUREMENT_MASK.or(LC_IDENTIFICATION_MASK)

public const val ENOTSUP: Int = EOPNOTSUPP

public const val SOCK_SEQPACKET: Int = 5

public const val SOCK_DCCP: Int = 6

public const val SOCK_PACKET: Int = 10

public const val AF_IB: Int = 27

public const val AF_MPLS: Int = 28

public const val AF_NFC: Int = 39

public const val AF_VSOCK: Int = 40

public const val AF_XDP: Int = 44

public const val PF_IB: Int = AF_IB

public const val PF_MPLS: Int = AF_MPLS

public const val PF_NFC: Int = AF_NFC

public const val PF_VSOCK: Int = AF_VSOCK

public const val PF_XDP: Int = AF_XDP

public const val SIGEV_THREAD_ID: Int = 4

public const val BUFSIZ: UInt = 8192u

public const val TMP_MAX: UInt = 238328u

public const val FOPEN_MAX: UInt = 16u

public const val FILENAME_MAX: UInt = 4096u

public const val _CS_GNU_LIBC_VERSION: Int = 2

public const val _CS_GNU_LIBPTHREAD_VERSION: Int = 3

public const val _CS_V6_ENV: Int = 1148

public const val _CS_V7_ENV: Int = 1149

public const val _SC_EQUIV_CLASS_MAX: Int = 41

public const val _SC_CHARCLASS_NAME_MAX: Int = 45

public const val _SC_PII: Int = 53

public const val _SC_PII_XTI: Int = 54

public const val _SC_PII_SOCKET: Int = 55

public const val _SC_PII_INTERNET: Int = 56

public const val _SC_PII_OSI: Int = 57

public const val _SC_POLL: Int = 58

public const val _SC_SELECT: Int = 59

public const val _SC_PII_INTERNET_STREAM: Int = 61

public const val _SC_PII_INTERNET_DGRAM: Int = 62

public const val _SC_PII_OSI_COTS: Int = 63

public const val _SC_PII_OSI_CLTS: Int = 64

public const val _SC_PII_OSI_M: Int = 65

public const val _SC_T_IOV_MAX: Int = 66

public const val _SC_2_C_VERSION: Int = 96

public const val _SC_CHAR_BIT: Int = 101

public const val _SC_CHAR_MAX: Int = 102

public const val _SC_CHAR_MIN: Int = 103

public const val _SC_INT_MAX: Int = 104

public const val _SC_INT_MIN: Int = 105

public const val _SC_LONG_BIT: Int = 106

public const val _SC_WORD_BIT: Int = 107

public const val _SC_MB_LEN_MAX: Int = 108

public const val _SC_SSIZE_MAX: Int = 110

public const val _SC_SCHAR_MAX: Int = 111

public const val _SC_SCHAR_MIN: Int = 112

public const val _SC_SHRT_MAX: Int = 113

public const val _SC_SHRT_MIN: Int = 114

public const val _SC_UCHAR_MAX: Int = 115

public const val _SC_UINT_MAX: Int = 116

public const val _SC_ULONG_MAX: Int = 117

public const val _SC_USHRT_MAX: Int = 118

public const val _SC_NL_ARGMAX: Int = 119

public const val _SC_NL_LANGMAX: Int = 120

public const val _SC_NL_MSGMAX: Int = 121

public const val _SC_NL_NMAX: Int = 122

public const val _SC_NL_SETMAX: Int = 123

public const val _SC_NL_TEXTMAX: Int = 124

public const val _SC_BASE: Int = 134

public const val _SC_C_LANG_SUPPORT: Int = 135

public const val _SC_C_LANG_SUPPORT_R: Int = 136

public const val _SC_DEVICE_IO: Int = 140

public const val _SC_DEVICE_SPECIFIC: Int = 141

public const val _SC_DEVICE_SPECIFIC_R: Int = 142

public const val _SC_FD_MGMT: Int = 143

public const val _SC_FIFO: Int = 144

public const val _SC_PIPE: Int = 145

public const val _SC_FILE_ATTRIBUTES: Int = 146

public const val _SC_FILE_LOCKING: Int = 147

public const val _SC_FILE_SYSTEM: Int = 148

public const val _SC_MULTI_PROCESS: Int = 150

public const val _SC_SINGLE_PROCESS: Int = 151

public const val _SC_NETWORKING: Int = 152

public const val _SC_REGEX_VERSION: Int = 156

public const val _SC_SIGNALS: Int = 158

public const val _SC_SYSTEM_DATABASE: Int = 162

public const val _SC_SYSTEM_DATABASE_R: Int = 163

public const val _SC_USER_GROUPS: Int = 166

public const val _SC_USER_GROUPS_R: Int = 167

public const val _SC_LEVEL1_ICACHE_SIZE: Int = 185

public const val _SC_LEVEL1_ICACHE_ASSOC: Int = 186

public const val _SC_LEVEL1_ICACHE_LINESIZE: Int = 187

public const val _SC_LEVEL1_DCACHE_SIZE: Int = 188

public const val _SC_LEVEL1_DCACHE_ASSOC: Int = 189

public const val _SC_LEVEL1_DCACHE_LINESIZE: Int = 190

public const val _SC_LEVEL2_CACHE_SIZE: Int = 191

public const val _SC_LEVEL2_CACHE_ASSOC: Int = 192

public const val _SC_LEVEL2_CACHE_LINESIZE: Int = 193

public const val _SC_LEVEL3_CACHE_SIZE: Int = 194

public const val _SC_LEVEL3_CACHE_ASSOC: Int = 195

public const val _SC_LEVEL3_CACHE_LINESIZE: Int = 196

public const val _SC_LEVEL4_CACHE_SIZE: Int = 197

public const val _SC_LEVEL4_CACHE_ASSOC: Int = 198

public const val _SC_LEVEL4_CACHE_LINESIZE: Int = 199

public const val O_ACCMODE: Int = 3

public const val ST_RELATIME: ULong = 4096uL

public const val NI_MAXHOST: UInt = 1025u

public const val BINDERFS_SUPER_MAGIC: Long = 0x6c6f6f70

public const val XFS_SUPER_MAGIC: Long = 0x58465342

public const val CPU_SETSIZE: Int = 0x400

public const val PTRACE_TRACEME: UInt = 0u

public const val PTRACE_PEEKTEXT: UInt = 1u

public const val PTRACE_PEEKDATA: UInt = 2u

public const val PTRACE_PEEKUSER: UInt = 3u

public const val PTRACE_POKETEXT: UInt = 4u

public const val PTRACE_POKEDATA: UInt = 5u

public const val PTRACE_POKEUSER: UInt = 6u

public const val PTRACE_CONT: UInt = 7u

public const val PTRACE_KILL: UInt = 8u

public const val PTRACE_SINGLESTEP: UInt = 9u

public const val PTRACE_ATTACH: UInt = 16u

public const val PTRACE_SYSCALL: UInt = 24u

public const val PTRACE_SETOPTIONS: UInt = 0x4200u

public const val PTRACE_GETEVENTMSG: UInt = 0x4201u

public const val PTRACE_GETSIGINFO: UInt = 0x4202u

public const val PTRACE_SETSIGINFO: UInt = 0x4203u

public const val PTRACE_GETREGSET: UInt = 0x4204u

public const val PTRACE_SETREGSET: UInt = 0x4205u

public const val PTRACE_SEIZE: UInt = 0x4206u

public const val PTRACE_INTERRUPT: UInt = 0x4207u

public const val PTRACE_LISTEN: UInt = 0x4208u

public const val PTRACE_PEEKSIGINFO: UInt = 0x4209u

public const val PTRACE_GETSIGMASK: UInt = 0x420au

public const val PTRACE_SETSIGMASK: UInt = 0x420bu

public const val PTRACE_GET_SYSCALL_INFO: UInt = 0x420eu

public const val PTRACE_SET_SYSCALL_INFO: UInt = 0x4212u

public const val PTRACE_SYSCALL_INFO_NONE: UByte = 0u

public const val PTRACE_SYSCALL_INFO_ENTRY: UByte = 1u

public const val PTRACE_SYSCALL_INFO_EXIT: UByte = 2u

public const val PTRACE_SYSCALL_INFO_SECCOMP: UByte = 3u

public const val PTRACE_SET_SYSCALL_USER_DISPATCH_CONFIG: UInt = 0x4210u

public const val PTRACE_GET_SYSCALL_USER_DISPATCH_CONFIG: UInt = 0x4211u

public val TCA_PAD: UShort = (9).toUShort()

public val TCA_DUMP_INVISIBLE: UShort = (10).toUShort()

public val TCA_CHAIN: UShort = (11).toUShort()

public val TCA_HW_OFFLOAD: UShort = (12).toUShort()

public val RTM_DELNETCONF: UShort = (81).toUShort()

public val RTM_NEWSTATS: UShort = (92).toUShort()

public val RTM_GETSTATS: UShort = (94).toUShort()

public val RTM_NEWCACHEREPORT: UShort = (96).toUShort()

public const val RTM_F_LOOKUP_TABLE: UInt = 0x1000u

public const val RTM_F_FIB_MATCH: UInt = 0x2000u

public val RTA_VIA: UShort = (18).toUShort()

public val RTA_NEWDST: UShort = (19).toUShort()

public val RTA_PREF: UShort = (20).toUShort()

public val RTA_ENCAP_TYPE: UShort = (21).toUShort()

public val RTA_ENCAP: UShort = (22).toUShort()

public val RTA_EXPIRES: UShort = (23).toUShort()

public val RTA_PAD: UShort = (24).toUShort()

public val RTA_UID: UShort = (25).toUShort()

public val RTA_TTL_PROPAGATE: UShort = (26).toUShort()

public val NTF_EXT_LEARNED: UByte = (0x10).toUByte()

public val NTF_OFFLOADED: UByte = (0x20).toUByte()

public val NDA_MASTER: UShort = (9).toUShort()

public val NDA_LINK_NETNSID: UShort = (10).toUShort()

public val NDA_SRC_VNI: UShort = (11).toUShort()

public const val UNAME26: Int = 0x0020000

public const val FDPIC_FUNCPTRS: Int = 0x0080000

public const val GENL_UNS_ADMIN_PERM: Int = 0x10

public val GENL_ID_VFS_DQUOT: Int = NLMSG_MIN_TYPE + 1

public val GENL_ID_PMCRAID: Int = NLMSG_MIN_TYPE + 2

public val ELFOSABI_ARM_AEABI: UByte = (64).toUByte()

public const val CLONE_NEWTIME: Int = 0x80

public const val CLONE_CLEAR_SIGHAND: Int = 0x100000000.toInt()

public const val CLONE_INTO_CGROUP: Int = 0x200000000.toInt()

public const val M_MXFAST: Int = 1

public const val M_NLBLKS: Int = 2

public const val M_GRAIN: Int = 3

public const val M_KEEP: Int = 4

public const val M_TRIM_THRESHOLD: Int = -1

public const val M_TOP_PAD: Int = -2

public const val M_MMAP_THRESHOLD: Int = -3

public const val M_MMAP_MAX: Int = -4

public const val M_CHECK_ACTION: Int = -5

public const val M_PERTURB: Int = -6

public const val M_ARENA_TEST: Int = -7

public const val M_ARENA_MAX: Int = -8

public const val SOMAXCONN: Int = 4096

public const val MOVE_MOUNT_F_SYMLINKS: UInt = 0x00000001u

public const val MOVE_MOUNT_F_AUTOMOUNTS: UInt = 0x00000002u

public const val MOVE_MOUNT_F_EMPTY_PATH: UInt = 0x00000004u

public const val MOVE_MOUNT_T_SYMLINKS: UInt = 0x00000010u

public const val MOVE_MOUNT_T_AUTOMOUNTS: UInt = 0x00000020u

public const val MOVE_MOUNT_T_EMPTY_PATH: UInt = 0x00000040u

public const val MOVE_MOUNT_SET_GROUP: UInt = 0x00000100u

public const val MOVE_MOUNT_BENEATH: UInt = 0x00000200u

public const val ADJ_OFFSET: UInt = 0x0001u

public const val ADJ_FREQUENCY: UInt = 0x0002u

public const val ADJ_MAXERROR: UInt = 0x0004u

public const val ADJ_ESTERROR: UInt = 0x0008u

public const val ADJ_STATUS: UInt = 0x0010u

public const val ADJ_TIMECONST: UInt = 0x0020u

public const val ADJ_TAI: UInt = 0x0080u

public const val ADJ_SETOFFSET: UInt = 0x0100u

public const val ADJ_MICRO: UInt = 0x1000u

public const val ADJ_NANO: UInt = 0x2000u

public const val ADJ_TICK: UInt = 0x4000u

public const val ADJ_OFFSET_SINGLESHOT: UInt = 0x8001u

public const val ADJ_OFFSET_SS_READ: UInt = 0xa001u

public const val MOD_OFFSET: UInt = ADJ_OFFSET

public const val MOD_FREQUENCY: UInt = ADJ_FREQUENCY

public const val MOD_MAXERROR: UInt = ADJ_MAXERROR

public const val MOD_ESTERROR: UInt = ADJ_ESTERROR

public const val MOD_STATUS: UInt = ADJ_STATUS

public const val MOD_TIMECONST: UInt = ADJ_TIMECONST

public const val MOD_CLKB: UInt = ADJ_TICK

public const val MOD_CLKA: UInt = ADJ_OFFSET_SINGLESHOT

public const val MOD_TAI: UInt = ADJ_TAI

public const val MOD_MICRO: UInt = ADJ_MICRO

public const val MOD_NANO: UInt = ADJ_NANO

public const val STA_PLL: Int = 0x0001

public const val STA_PPSFREQ: Int = 0x0002

public const val STA_PPSTIME: Int = 0x0004

public const val STA_FLL: Int = 0x0008

public const val STA_INS: Int = 0x0010

public const val STA_DEL: Int = 0x0020

public const val STA_UNSYNC: Int = 0x0040

public const val STA_FREQHOLD: Int = 0x0080

public const val STA_PPSSIGNAL: Int = 0x0100

public const val STA_PPSJITTER: Int = 0x0200

public const val STA_PPSWANDER: Int = 0x0400

public const val STA_PPSERROR: Int = 0x0800

public const val STA_CLOCKERR: Int = 0x1000

public const val STA_NANO: Int = 0x2000

public const val STA_MODE: Int = 0x4000

public const val STA_CLK: Int = 0x8000

public val STA_RONLY: Int = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public const val NTP_API: Int = 4

public const val TIME_OK: Int = 0

public const val TIME_INS: Int = 1

public const val TIME_DEL: Int = 2

public const val TIME_OOP: Int = 3

public const val TIME_WAIT: Int = 4

public const val TIME_ERROR: Int = 5

public const val TIME_BAD: Int = TIME_ERROR

public const val MAXTC: Long = 6

public val GLOB_PERIOD: Int = 1 shl 7

public val GLOB_ALTDIRFUNC: Int = 1 shl 9

public val GLOB_BRACE: Int = 1 shl 10

public val GLOB_NOMAGIC: Int = 1 shl 11

public val GLOB_TILDE: Int = 1 shl 12

public val GLOB_ONLYDIR: Int = 1 shl 13

public val GLOB_TILDE_CHECK: Int = 1 shl 14

public const val MADV_COLLAPSE: Int = 25

public const val PTHREAD_STACK_MIN: ULong = 16384uL

public const val PTHREAD_MUTEX_ADAPTIVE_NP: Int = 3

public const val REG_STARTEND: Int = 4

public const val REG_EEND: Int = 14

public const val REG_ESIZE: Int = 15

public const val REG_ERPAREN: Int = 16
