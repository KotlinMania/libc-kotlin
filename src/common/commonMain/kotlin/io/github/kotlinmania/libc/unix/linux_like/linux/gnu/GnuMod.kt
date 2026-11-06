package io.github.kotlinmania.libc.unix.linux_like.linux.gnu

import Off64T

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface Glob64ErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public typealias PthreadT = CUlong

public typealias PriorityWhichT = CUint

public typealias RlimitResourceT = CUint

public typealias LmidT = CLong

public typealias RegoffT = CInt

public typealias KernelRwfT = CInt

public fun SiginfoT.siAddr(): COpaquePointer? {
    open class SiginfoSigfault(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siAddr: COpaquePointer?,
    )
    return (if (((this as SiginfoT?)) == null) null else SiginfoSigfault()).siAddr
}

public fun SiginfoT.siValue(): Sigval {
    open class SiginfoTimer(
        public var siSigno: CInt,
        public var siErrno: CInt,
        public var siCode: CInt,
        public var siTid: CInt,
        public var siOverrun: CInt,
        public var siSigval: Sigval,
    )
    return (if (((this as SiginfoT?)) == null) null else SiginfoTimer()).siSigval
}

public fun SiginfoT.sifields(): Sifields {
    return (if (((this as SiginfoT?)) == null) null else SiginfoF()).sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}

// include/uapi/asm-generic/hugetlbEncode.h
public val HUGETLB_FLAG_ENCODE_SHIFT: CInt = 26

public val HUGETLB_FLAG_ENCODE_MASK: CInt = 0x3f

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

// include/uapi/linux/mman.h
//
// Huge page size encoding when MAP_HUGETLB is specified, and a huge page
// size other than the default is desired.  See hugetlbEncode.h.
// All known huge page size encodings are provided here.  It is the
// responsibility of the application to know which sizes are supported on
// the running system.  See mmap(2) man page for details.
//
public val MAP_HUGE_SHIFT: CInt = HUGETLB_FLAG_ENCODE_SHIFT

public val MAP_HUGE_MASK: CInt = HUGETLB_FLAG_ENCODE_MASK

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

public val PRIO_PROCESS: PriorityWhichT = 0u

public val PRIO_PGRP: PriorityWhichT = 1u

public val PRIO_USER: PriorityWhichT = 2u

public val MS_RMT_MASK: CUlong = 0x02800051uL

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val UT_HOSTSIZE: Int = 256

public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val OLD_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

// dlfcn.h
public val LM_ID_BASE: CLong = 0L

public val LM_ID_NEWLM: CLong = -1L

public val RTLD_DI_LMID: CInt = 1

public val RTLD_DI_LINKMAP: CInt = 2

public val RTLD_DI_CONFIGADDR: CInt = 3

public val RTLD_DI_SERINFO: CInt = 4

public val RTLD_DI_SERINFOSIZE: CInt = 5

public val RTLD_DI_ORIGIN: CInt = 6

public val RTLD_DI_PROFILENAME: CInt = 7

public val RTLD_DI_PROFILEOUT: CInt = 8

public val RTLD_DI_TLS_MODID: CInt = 9

public val RTLD_DI_TLS_DATA: CInt = 10

public val SOCK_NONBLOCK: CInt = O_NONBLOCK

public val SOL_RXRPC: CInt = 272

public val SOL_PPPOL2TP: CInt = 273

public val SOL_PNPIPE: CInt = 275

public val SOL_RDS: CInt = 276

public val SOL_IUCV: CInt = 277

public val SOL_CAIF: CInt = 278

public val SOL_NFC: CInt = 280

public val MSG_TRYHARD: CInt = 4

public val LC_PAPER: CInt = 7

public val LC_NAME: CInt = 8

public val LC_ADDRESS: CInt = 9

public val LC_TELEPHONE: CInt = 10

public val LC_MEASUREMENT: CInt = 11

public val LC_IDENTIFICATION: CInt = 12

public val LC_PAPER_MASK: CInt = 1 shl LC_PAPER

public val LC_NAME_MASK: CInt = 1 shl LC_NAME

public val LC_ADDRESS_MASK: CInt = 1 shl LC_ADDRESS

public val LC_TELEPHONE_MASK: CInt = 1 shl LC_TELEPHONE

public val LC_MEASUREMENT_MASK: CInt = 1 shl LC_MEASUREMENT

public val LC_IDENTIFICATION_MASK: CInt = 1 shl LC_IDENTIFICATION

public val LC_ALL_MASK: CInt = LC_CTYPE_MASK or LC_NUMERIC_MASK or LC_TIME_MASK or LC_COLLATE_MASK or LC_MONETARY_MASK or LC_MESSAGES_MASK or LC_PAPER_MASK or LC_NAME_MASK or LC_ADDRESS_MASK or LC_TELEPHONE_MASK or LC_MEASUREMENT_MASK or LC_IDENTIFICATION_MASK

public val ENOTSUP: CInt = EOPNOTSUPP

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_DCCP: CInt = 6

public val SOCK_PACKET: CInt = 10

public val AF_IB: CInt = 27

public val AF_MPLS: CInt = 28

public val AF_NFC: CInt = 39

public val AF_VSOCK: CInt = 40

public val AF_XDP: CInt = 44

public val PF_IB: CInt = AF_IB

public val PF_MPLS: CInt = AF_MPLS

public val PF_NFC: CInt = AF_NFC

public val PF_VSOCK: CInt = AF_VSOCK

public val PF_XDP: CInt = AF_XDP

public val SIGEV_THREAD_ID: CInt = 4

public val BUFSIZ: CUint = 8192u

public val TMP_MAX: CUint = 238328u

public val FOPEN_MAX: CUint = 16u

public val FILENAME_MAX: CUint = 4096u

public val CS_GNU_LIBC_VERSION: CInt = 2

public val CS_GNU_LIBPTHREAD_VERSION: CInt = 3

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val SC_EQUIV_CLASS_MAX: CInt = 41

public val SC_CHARCLASS_NAME_MAX: CInt = 45

public val SC_PII: CInt = 53

public val SC_PII_XTI: CInt = 54

public val SC_PII_SOCKET: CInt = 55

public val SC_PII_INTERNET: CInt = 56

public val SC_PII_OSI: CInt = 57

public val SC_POLL: CInt = 58

public val SC_SELECT: CInt = 59

public val SC_PII_INTERNET_STREAM: CInt = 61

public val SC_PII_INTERNET_DGRAM: CInt = 62

public val SC_PII_OSI_COTS: CInt = 63

public val SC_PII_OSI_CLTS: CInt = 64

public val SC_PII_OSI_M: CInt = 65

public val SC_T_IOV_MAX: CInt = 66

public val SC_2_C_VERSION: CInt = 96

public val SC_CHAR_BIT: CInt = 101

public val SC_CHAR_MAX: CInt = 102

public val SC_CHAR_MIN: CInt = 103

public val SC_INT_MAX: CInt = 104

public val SC_INT_MIN: CInt = 105

public val SC_LONG_BIT: CInt = 106

public val SC_WORD_BIT: CInt = 107

public val SC_MB_LEN_MAX: CInt = 108

public val SC_SSIZE_MAX: CInt = 110

public val SC_SCHAR_MAX: CInt = 111

public val SC_SCHAR_MIN: CInt = 112

public val SC_SHRT_MAX: CInt = 113

public val SC_SHRT_MIN: CInt = 114

public val SC_UCHAR_MAX: CInt = 115

public val SC_UINT_MAX: CInt = 116

public val SC_ULONG_MAX: CInt = 117

public val SC_USHRT_MAX: CInt = 118

public val SC_NL_ARGMAX: CInt = 119

public val SC_NL_LANGMAX: CInt = 120

public val SC_NL_MSGMAX: CInt = 121

public val SC_NL_NMAX: CInt = 122

public val SC_NL_SETMAX: CInt = 123

public val SC_NL_TEXTMAX: CInt = 124

public val SC_BASE: CInt = 134

public val SC_C_LANG_SUPPORT: CInt = 135

public val SC_C_LANG_SUPPORT_R: CInt = 136

public val SC_DEVICE_IO: CInt = 140

public val SC_DEVICE_SPECIFIC: CInt = 141

public val SC_DEVICE_SPECIFIC_R: CInt = 142

public val SC_FD_MGMT: CInt = 143

public val SC_FIFO: CInt = 144

public val SC_PIPE: CInt = 145

public val SC_FILE_ATTRIBUTES: CInt = 146

public val SC_FILE_LOCKING: CInt = 147

public val SC_FILE_SYSTEM: CInt = 148

public val SC_MULTI_PROCESS: CInt = 150

public val SC_SINGLE_PROCESS: CInt = 151

public val SC_NETWORKING: CInt = 152

public val SC_REGEX_VERSION: CInt = 156

public val SC_SIGNALS: CInt = 158

public val SC_SYSTEM_DATABASE: CInt = 162

public val SC_SYSTEM_DATABASE_R: CInt = 163

public val SC_USER_GROUPS: CInt = 166

public val SC_USER_GROUPS_R: CInt = 167

public val SC_LEVEL1_ICACHE_SIZE: CInt = 185

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 186

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 187

public val SC_LEVEL1_DCACHE_SIZE: CInt = 188

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 189

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 190

public val SC_LEVEL2_CACHE_SIZE: CInt = 191

public val SC_LEVEL2_CACHE_ASSOC: CInt = 192

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 193

public val SC_LEVEL3_CACHE_SIZE: CInt = 194

public val SC_LEVEL3_CACHE_ASSOC: CInt = 195

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 196

public val SC_LEVEL4_CACHE_SIZE: CInt = 197

public val SC_LEVEL4_CACHE_ASSOC: CInt = 198

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 199

public val O_ACCMODE: CInt = 3

public val ST_RELATIME: CUlong = 4096uL

public val NI_MAXHOST: SocklenT = 1025u

public val CPU_SETSIZE: CInt = 0x400

public val PTRACE_TRACEME: CUint = 0u

public val PTRACE_PEEKTEXT: CUint = 1u

public val PTRACE_PEEKDATA: CUint = 2u

public val PTRACE_PEEKUSER: CUint = 3u

public val PTRACE_POKETEXT: CUint = 4u

public val PTRACE_POKEDATA: CUint = 5u

public val PTRACE_POKEUSER: CUint = 6u

public val PTRACE_CONT: CUint = 7u

public val PTRACE_KILL: CUint = 8u

public val PTRACE_SINGLESTEP: CUint = 9u

public val PTRACE_ATTACH: CUint = 16u

public val PTRACE_SYSCALL: CUint = 24u

public val PTRACE_SETOPTIONS: CUint = 0x4200u

public val PTRACE_GETEVENTMSG: CUint = 0x4201u

public val PTRACE_GETSIGINFO: CUint = 0x4202u

public val PTRACE_SETSIGINFO: CUint = 0x4203u

public val PTRACE_GETREGSET: CUint = 0x4204u

public val PTRACE_SETREGSET: CUint = 0x4205u

public val PTRACE_SEIZE: CUint = 0x4206u

public val PTRACE_INTERRUPT: CUint = 0x4207u

public val PTRACE_LISTEN: CUint = 0x4208u

public val PTRACE_PEEKSIGINFO: CUint = 0x4209u

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_SETSIGMASK: CUint = 0x420bu

public val PTRACE_GET_SYSCALL_INFO: CUint = 0x420eu

public val PTRACE_SET_SYSCALL_INFO: CUint = 0x4212u

public val PTRACE_SYSCALL_INFO_NONE: U8 = 0

public val PTRACE_SYSCALL_INFO_ENTRY: U8 = 1

public val PTRACE_SYSCALL_INFO_EXIT: U8 = 2

public val PTRACE_SYSCALL_INFO_SECCOMP: U8 = 3

public val PTRACE_SET_SYSCALL_USER_DISPATCH_CONFIG: U8 = 0x4210

public val PTRACE_GET_SYSCALL_USER_DISPATCH_CONFIG: U8 = 0x4211

// linux/rtnetlink.h
public val TCA_PAD: CUshort = 9u

public val TCA_DUMP_INVISIBLE: CUshort = 10u

public val TCA_CHAIN: CUshort = 11u

public val TCA_HW_OFFLOAD: CUshort = 12u

public val RTM_DELNETCONF: UShort = 81u

public val RTM_NEWSTATS: UShort = 92u

public val RTM_GETSTATS: UShort = 94u

public val RTM_NEWCACHEREPORT: UShort = 96u

public val RTM_F_LOOKUP_TABLE: CUint = 0x1000u

public val RTM_F_FIB_MATCH: CUint = 0x2000u

public val RTA_VIA: CUshort = 18u

public val RTA_NEWDST: CUshort = 19u

public val RTA_PREF: CUshort = 20u

public val RTA_ENCAP_TYPE: CUshort = 21u

public val RTA_ENCAP: CUshort = 22u

public val RTA_EXPIRES: CUshort = 23u

public val RTA_PAD: CUshort = 24u

public val RTA_UID: CUshort = 25u

public val RTA_TTL_PROPAGATE: CUshort = 26u

// linux/neighbor.h
public val NTF_EXT_LEARNED: UByte = 0x10u

public val NTF_OFFLOADED: UByte = 0x20u

public val NDA_MASTER: CUshort = 9u

public val NDA_LINK_NETNSID: CUshort = 10u

public val NDA_SRC_VNI: CUshort = 11u

// linux/personality.h
public val UNAME26: CInt = 0x0020000

public val FDPIC_FUNCPTRS: CInt = 0x0080000

public val GENL_UNS_ADMIN_PERM: CInt = 0x10

public val GENL_ID_VFS_DQUOT: CInt = NLMSG_MIN_TYPE + 1

public val GENL_ID_PMCRAID: CInt = NLMSG_MIN_TYPE + 2

public val ELFOSABI_ARM_AEABI: UByte = 64u

// linux/sched.h
public val CLONE_NEWTIME: CInt = 0x80

// DIFF(main): changed to `cUlonglong` in e9abac9ac2
public val CLONE_CLEAR_SIGHAND: CInt = 0x100000000

public val CLONE_INTO_CGROUP: CInt = 0x200000000

public val M_MXFAST: CInt = 1

public val M_NLBLKS: CInt = 2

public val M_GRAIN: CInt = 3

public val M_KEEP: CInt = 4

public val M_TRIM_THRESHOLD: CInt = -1

public val M_TOP_PAD: CInt = -2

public val M_MMAP_THRESHOLD: CInt = -3

public val M_MMAP_MAX: CInt = -4

public val M_CHECK_ACTION: CInt = -5

public val M_PERTURB: CInt = -6

public val M_ARENA_TEST: CInt = -7

public val M_ARENA_MAX: CInt = -8

public val SOMAXCONN: CInt = 4096

// linux/mount.h
public val MOVE_MOUNT_F_SYMLINKS: CUint = 0x00000001u

public val MOVE_MOUNT_F_AUTOMOUNTS: CUint = 0x00000002u

public val MOVE_MOUNT_F_EMPTY_PATH: CUint = 0x00000004u

public val MOVE_MOUNT_T_SYMLINKS: CUint = 0x00000010u

public val MOVE_MOUNT_T_AUTOMOUNTS: CUint = 0x00000020u

public val MOVE_MOUNT_T_EMPTY_PATH: CUint = 0x00000040u

public val MOVE_MOUNT_SET_GROUP: CUint = 0x00000100u

public val MOVE_MOUNT_BENEATH: CUint = 0x00000200u

// sys/timex.h
public val ADJ_OFFSET: CUint = 0x0001u

public val ADJ_FREQUENCY: CUint = 0x0002u

public val ADJ_MAXERROR: CUint = 0x0004u

public val ADJ_ESTERROR: CUint = 0x0008u

public val ADJ_STATUS: CUint = 0x0010u

public val ADJ_TIMECONST: CUint = 0x0020u

public val ADJ_TAI: CUint = 0x0080u

public val ADJ_SETOFFSET: CUint = 0x0100u

public val ADJ_MICRO: CUint = 0x1000u

public val ADJ_NANO: CUint = 0x2000u

public val ADJ_TICK: CUint = 0x4000u

public val ADJ_OFFSET_SINGLESHOT: CUint = 0x8001u

public val ADJ_OFFSET_SS_READ: CUint = 0xa001u

public val MOD_OFFSET: CUint = ADJ_OFFSET

public val MOD_FREQUENCY: CUint = ADJ_FREQUENCY

public val MOD_MAXERROR: CUint = ADJ_MAXERROR

public val MOD_ESTERROR: CUint = ADJ_ESTERROR

public val MOD_STATUS: CUint = ADJ_STATUS

public val MOD_TIMECONST: CUint = ADJ_TIMECONST

public val MOD_CLKB: CUint = ADJ_TICK

public val MOD_CLKA: CUint = ADJ_OFFSET_SINGLESHOT

public val MOD_TAI: CUint = ADJ_TAI

public val MOD_MICRO: CUint = ADJ_MICRO

public val MOD_NANO: CUint = ADJ_NANO

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val NTP_API: CInt = 4

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

public val TIME_BAD: CInt = TIME_ERROR

public val MAXTC: CLong = 6L

// Portable GLOB_* flags are defined at the `linuxLike` level.
// The following are GNU extensions.
public val GLOB_PERIOD: CInt = 1 shl 7

public val GLOB_ALTDIRFUNC: CInt = 1 shl 9

public val GLOB_BRACE: CInt = 1 shl 10

public val GLOB_NOMAGIC: CInt = 1 shl 11

public val GLOB_TILDE: CInt = 1 shl 12

public val GLOB_ONLYDIR: CInt = 1 shl 13

public val GLOB_TILDE_CHECK: CInt = 1 shl 14

public val MADV_COLLAPSE: CInt = 25

public val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3

public val REG_STARTEND: CInt = 4

public val REG_EEND: CInt = 14

public val REG_ESIZE: CInt = 15

public val REG_ERPAREN: CInt = 16

public fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetspent_r", -1, longArrayOf(fp?.handle ?: 0L, spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
}

public fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        return LibcDynamicFfi.invoke("sgetspent_r", -1, longArrayOf(__cstr_0, spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getspent_r", -1, longArrayOf(spbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), spbufp?.value ?: 0L)).toInt()
}

public fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    LibcDynamicFfi.invoke("qsort_r", -1, longArrayOf(base?.value ?: 0L, num.toLong(), size.toLong(), compar?.value ?: 0L, arg?.value ?: 0L))
}

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("sendmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong())).toInt()
}

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("recvmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("getrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("setrlimit64", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("prlimit", -1, longArrayOf(pid.toLong(), resource.toLong(), newLimit?.value ?: 0L, oldLimit?.value ?: 0L)).toInt()
}

public fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt {
    return LibcDynamicFfi.invoke("prlimit64", -1, longArrayOf(pid.toLong(), resource.toLong(), newLimit?.value ?: 0L, oldLimit?.value ?: 0L)).toInt()
}

public fun utmpname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getutxent(): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxid(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxid", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getutxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("getutxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pututxline(ut: Utmpx?): Utmpx? {
    val rawRet = LibcDynamicFfi.invoke("pututxline", -1, longArrayOf(ut?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setutxent() {
    LibcDynamicFfi.invoke("setutxent", -1, longArrayOf())
}

public fun endutxent() {
    LibcDynamicFfi.invoke("endutxent", -1, longArrayOf())
}

public fun getpt(): CInt {
    return LibcDynamicFfi.invoke("getpt", -1, longArrayOf()).toInt()
}

public fun mallopt(param: CInt, value: CInt): CInt {
    return LibcDynamicFfi.invoke("mallopt", -1, longArrayOf(param.toLong(), value.toLong())).toInt()
}

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT {
    return LibcDynamicFfi.invoke("getrandom", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong(), flags.toLong()))
}

public fun getauxval(type: CUlong): CUlong {
    return LibcDynamicFfi.invoke("getauxval", -1, longArrayOf(type.toLong())).toULong()
}

public fun adjtimex(buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("adjtimex", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun ntpAdjtime(buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("ntp_adjtime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun ntpGettime(buf: Ntptimeval?): CInt {
    return LibcDynamicFfi.invoke("ntp_gettime", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt {
    return LibcDynamicFfi.invoke("clock_adjtime", -1, longArrayOf(clkId.toLong(), buf?.value ?: 0L)).toInt()
}

public fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt {
    val __cstr_4 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("fanotify_mark", -1, longArrayOf(fd.toLong(), flags.toLong(), mask.toLong(), dirfd.toLong(), __cstr_4)).toInt()
    } finally {
        if (__cstr_4 != 0L) LibcDynamicFfi.freeMem(__cstr_4)
    }
}

public fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("preadv2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("pwritev2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("preadv64v2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("pwritev64v2", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset, flags.toLong()))
}

public fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("renameat2", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

// Added in `glibc` 2.25
public fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(s?.value ?: 0L, len.toLong()))
}

// Added in `glibc` 2.29
public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctermid(s: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("ctermid", -1, longArrayOf(s?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun backtrace(buf: COpaquePointer?, sz: CInt): CInt {
    return LibcDynamicFfi.invoke("backtrace", -1, longArrayOf(buf?.value ?: 0L, sz.toLong())).toInt()
}

public fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("backtrace_symbols", -1, longArrayOf(buffer?.value ?: 0L, len.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    LibcDynamicFfi.invoke("backtrace_symbols_fd", -1, longArrayOf(buffer?.value ?: 0L, len.toLong(), fd.toLong()))
}

public fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt {
    val __cstr_0 = if (pattern == null) 0L else LibcDynamicFfi.allocUtf8CString(pattern)
    try {
        return LibcDynamicFfi.invoke("glob64", -1, longArrayOf(__cstr_0, flags.toLong(), errfunc?.value ?: 0L, pglob?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun globfree64(pglob: Glob64T?) {
    LibcDynamicFfi.invoke("globfree64", -1, longArrayOf(pglob?.value ?: 0L))
}

public fun ptrace(request: CUint, vararg variadicArgs: Long): CLong {
    return LibcDynamicFfi.invoke("ptrace", 1, longArrayOf(request.toLong()) + variadicArgs)
}

public fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_getaffinity_np", -1, longArrayOf(attr?.value ?: 0L, cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setaffinity_np", -1, longArrayOf(attr?.value ?: 0L, cpusetsize.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun getpriority(which: PriorityWhichT, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_rwlockattr_getkind_np", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_rwlockattr_setkind_np", -1, longArrayOf(attr?.value ?: 0L, value.toLong())).toInt()
}

public fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_sigqueue", -1, longArrayOf(thread.toLong(), sig.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_tryjoin_np", -1, longArrayOf(thread.toLong(), retval?.value ?: 0L)).toInt()
}

public fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt {
    return LibcDynamicFfi.invoke("pthread_timedjoin_np", -1, longArrayOf(thread.toLong(), retval?.value ?: 0L, abstime?.value ?: 0L)).toInt()
}

public fun mallinfo(): Mallinfo {
    LibcDynamicFfi.invoke("mallinfo", -1, longArrayOf())
    return null as Mallinfo
}

public fun mallinfo2(): Mallinfo2 {
    LibcDynamicFfi.invoke("mallinfo2", -1, longArrayOf())
    return null as Mallinfo2
}

public fun mallocStats() {
    LibcDynamicFfi.invoke("malloc_stats", -1, longArrayOf())
}

public fun mallocInfo(options: CInt, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("malloc_info", -1, longArrayOf(options.toLong(), stream?.handle ?: 0L)).toInt()
}

public fun mallocUsableSize(ptr: COpaquePointer?): SizeT {
    return LibcDynamicFfi.invoke("malloc_usable_size", -1, longArrayOf(ptr?.value ?: 0L)).toULong()
}

public fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwent_r", -1, longArrayOf(pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrent_r", -1, longArrayOf(grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetpwent_r", -1, longArrayOf(stream?.handle ?: 0L, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fgetgrent_r", -1, longArrayOf(stream?.handle ?: 0L, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun putpwent(p: Passwd?, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("putpwent", -1, longArrayOf(p?.value ?: 0L, stream?.handle ?: 0L)).toInt()
}

public fun putgrent(grp: Group?, stream: FILE?): CInt {
    return LibcDynamicFfi.invoke("putgrent", -1, longArrayOf(grp?.value ?: 0L, stream?.handle ?: 0L)).toInt()
}

public fun sethostid(hostid: CLong): CInt {
    return LibcDynamicFfi.invoke("sethostid", -1, longArrayOf(hostid)).toInt()
}

public fun memfdCreate(name: String?, flags: CUint): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("memfd_create", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt {
    return LibcDynamicFfi.invoke("mlock2", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun euidaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("euidaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun eaccess(pathname: String?, mode: CInt): CInt {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("eaccess", -1, longArrayOf(__cstr_0, mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("asctime_r", -1, longArrayOf(tm?.value ?: 0L, buf?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer? {
    val __slot_0 = if (timep == null) 0L else LibcDynamicFfi.allocScalarSlot(timep)
    try {
        val rawRet = LibcDynamicFfi.invoke("ctime_r", -1, longArrayOf(__slot_0, buf?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public fun posixBasename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("__xpg_basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public fun gnuBasename(path: String?): COpaquePointer? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? {
    val __cstr_1 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlmopen", -1, longArrayOf(lmid, __cstr_1, flag.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dlinfo", -1, longArrayOf(handle?.value ?: 0L, request.toLong(), info?.value ?: 0L)).toInt()
}

public fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dladdr1", -1, longArrayOf(addr?.value ?: 0L, info?.value ?: 0L, extraInfo?.value ?: 0L, flags.toLong())).toInt()
}

public fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    val __cstr_2 = if (version == null) 0L else LibcDynamicFfi.allocUtf8CString(version)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlvsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1, __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun mallocTrim(pad: SizeT): CInt {
    return LibcDynamicFfi.invoke("malloc_trim", -1, longArrayOf(pad.toLong())).toInt()
}

public fun gnuGetLibcRelease(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gnu_get_libc_release", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun gnuGetLibcVersion(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gnu_get_libc_version", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// posix/spawn.h
// Added in `glibc` 2.29
public fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("posix_spawn_file_actions_addchdir_np", -1, longArrayOf(actions?.value ?: 0L, __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// Added in `glibc` 2.29
public fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addfchdir_np", -1, longArrayOf(actions?.value ?: 0L, fd.toLong())).toInt()
}

// Added in `glibc` 2.34
public fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addclosefrom_np", -1, longArrayOf(actions?.value ?: 0L, from.toLong())).toInt()
}

// Added in `glibc` 2.35
public fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt {
    return LibcDynamicFfi.invoke("posix_spawn_file_actions_addtcsetpgrp_np", -1, longArrayOf(actions?.value ?: 0L, tcfd.toLong())).toInt()
}

// mntent.h
public fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent? {
    val rawRet = LibcDynamicFfi.invoke("getmntent_r", -1, longArrayOf(stream?.handle ?: 0L, mntbuf?.value ?: 0L, buf?.value ?: 0L, buflen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt {
    val __cstr_1 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("execveat", -1, longArrayOf(dirfd.toLong(), __cstr_1, argv?.value ?: 0L, envp?.value ?: 0L, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// Added in `glibc` 2.34
public fun closeRange(first: CUint, last: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("close_range", -1, longArrayOf(first.toLong(), last.toLong(), flags.toLong())).toInt()
}

public fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("mq_notify", -1, longArrayOf(__scratch_0, sevp?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: Timespec?, sigmask: SigsetT?): CInt {
    return LibcDynamicFfi.invoke("epoll_pwait2", -1, longArrayOf(epfd.toLong(), events?.value ?: 0L, maxevents.toLong(), timeout?.value ?: 0L, sigmask?.value ?: 0L)).toInt()
}

public fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mempcpy", -1, longArrayOf(dest?.value ?: 0L, src?.value ?: 0L, n.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("tgkill", -1, longArrayOf(tgid.toLong(), tid.toLong(), sig.toLong())).toInt()
}
