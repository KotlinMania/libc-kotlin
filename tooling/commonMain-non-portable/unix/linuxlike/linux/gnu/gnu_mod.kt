// port-lint: source unix/linux_like/linux/gnu/gnu_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.CpuSetT
import io.github.kotlinmania.libc.DlInfo
import io.github.kotlinmania.libc.Elf32Word
import io.github.kotlinmania.libc.Elf64Word
import io.github.kotlinmania.libc.Elf64Xword
import io.github.kotlinmania.libc.EpollEvent
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.FanotifyEventInfoHeader
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.IdT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.LC_COLLATE_MASK
import io.github.kotlinmania.libc.LC_CTYPE_MASK
import io.github.kotlinmania.libc.LC_MESSAGES_MASK
import io.github.kotlinmania.libc.LC_MONETARY_MASK
import io.github.kotlinmania.libc.LC_NUMERIC_MASK
import io.github.kotlinmania.libc.LC_TIME_MASK
import io.github.kotlinmania.libc.Mmsghdr
import io.github.kotlinmania.libc.Mntent
import io.github.kotlinmania.libc.MqdT
import io.github.kotlinmania.libc.NLMSG_MIN_TYPE
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.Passwd
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadRwlockattrT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.Rlimit64
import io.github.kotlinmania.libc.S16
import io.github.kotlinmania.libc.S32
import io.github.kotlinmania.libc.S64
import io.github.kotlinmania.libc.Sigevent
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.Spwd
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Timex
import io.github.kotlinmania.libc.Timezone
import io.github.kotlinmania.libc.Tm
import io.github.kotlinmania.libc.U16
import io.github.kotlinmania.libc.U32
import io.github.kotlinmania.libc.U64
import io.github.kotlinmania.libc.U8
import io.github.kotlinmania.libc.UidT

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

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public typealias Ioctl = CUlong

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var nextPrio: Aiocb?,
    public var absPrio: CInt,
    public var policy: CInt,
    public var errorCode: CInt,
    public var returnValue: SsizeT,
    public var aioOffset: OffT,
    public var glibcReserved: List<CChar>,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

public open class Timeval(public var tvSec: Int, public var tvUsec: Int)

public open class Glob64T(
    public var glPathc: SizeT,
    public var glPathv: COpaquePointer?,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var unused1: COpaquePointer?,
    public var unused2: COpaquePointer?,
    public var unused3: COpaquePointer?,
    public var unused4: COpaquePointer?,
    public var unused5: COpaquePointer?,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: SizeT,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CcT,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class Mallinfo(
    public var arena: CInt,
    public var ordblks: CInt,
    public var smblks: CInt,
    public var hblks: CInt,
    public var hblkhd: CInt,
    public var usmblks: CInt,
    public var fsmblks: CInt,
    public var uordblks: CInt,
    public var fordblks: CInt,
    public var keepcost: CInt,
)

public open class Mallinfo2(
    public var arena: SizeT,
    public var ordblks: SizeT,
    public var smblks: SizeT,
    public var hblks: SizeT,
    public var hblkhd: SizeT,
    public var usmblks: SizeT,
    public var fsmblks: SizeT,
    public var uordblks: SizeT,
    public var fordblks: SizeT,
    public var keepcost: SizeT,
)

public open class Ntptimeval(
    public var time: io.github.kotlinmania.libc.Timeval,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var tai: CLong,
    public var glibcReserved1: CLong,
    public var glibcReserved2: CLong,
    public var glibcReserved3: CLong,
    public var glibcReserved4: CLong,
)

public open class RegexT(
    public var buffer: COpaquePointer?,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    public var fastmap: COpaquePointer?,
    public var translate: COpaquePointer?,
    public var reNsub: SizeT,
    public var bitfield: UByte,
)

public open class Elf64Chdr(
    public var chType: Elf64Word,
    public var chReserved: Elf64Word,
    public var chSize: Elf64Xword,
    public var chAddralign: Elf64Xword,
)

public open class Elf32Chdr(
    public var chType: Elf32Word,
    public var chSize: Elf32Word,
    public var chAddralign: Elf32Word,
)

public open class Seminfo(
    public var semmap: CInt,
    public var semmni: CInt,
    public var semmns: CInt,
    public var semmnu: CInt,
    public var semmsl: CInt,
    public var semopm: CInt,
    public var semume: CInt,
    public var semusz: CInt,
    public var semvmx: CInt,
    public var semaem: CInt,
)

public open class PtracePeeksiginfoArgs(
    public var off: U64,
    public var flags: U32,
    public var nr: S32,
)

public open class CAnonymousPtraceSyscallInfoEntry(public var nr: U64, public var args: List<U64>)

public open class CAnonymousPtraceSyscallInfoExit(public var sval: S64, public var isError: U8)

public open class CAnonymousPtraceSyscallInfoSeccomp(
    public var nr: U64,
    public var args: List<U64>,
    public var retData: U32,
)

public open class PtraceSyscallInfo(
    public var op: U8,
    public var pad: List<U8>,
    public var arch: U32,
    public var instructionPointer: U64,
    public var stackPointer: U64,
    public var u: CAnonymousPtraceSyscallInfoData,
)

public open class PtraceSudConfig(
    public var mode: U64,
    public var selector: U64,
    public var offset: U64,
    public var len: U64,
)

public open class Iocb(
    public var aioData: U64,
    public var aioKey: U32,
    public var aioRwFlags: io.github.kotlinmania.libc.KernelRwfT,
    public var aioLioOpcode: U16,
    public var aioReqprio: S16,
    public var aioFildes: U32,
    public var aioBuf: U64,
    public var aioNbytes: U64,
    public var aioOffset: S64,
    public var aioReserved2: U64,
    public var aioFlags: U32,
    public var aioResfd: U32,
)

// netinet/tcp.h
public open class TcpInfo(
    public var tcpiState: UByte,
    public var tcpiCaState: UByte,
    public var tcpiRetransmits: UByte,
    public var tcpiProbes: UByte,
    public var tcpiBackoff: UByte,
    public var tcpiOptions: UByte,
    /**
     * This contains the bitfields `tcpiSndWscale` and `tcpiRcvWscale`.
     * Each is 4 bits.
     */
    public var tcpiSndRcvWscale: UByte,
    public var tcpiRto: UInt,
    public var tcpiAto: UInt,
    public var tcpiSndMss: UInt,
    public var tcpiRcvMss: UInt,
    public var tcpiUnacked: UInt,
    public var tcpiSacked: UInt,
    public var tcpiLost: UInt,
    public var tcpiRetrans: UInt,
    public var tcpiFackets: UInt,
    public var tcpiLastDataSent: UInt,
    public var tcpiLastAckSent: UInt,
    public var tcpiLastDataRecv: UInt,
    public var tcpiLastAckRecv: UInt,
    public var tcpiPmtu: UInt,
    public var tcpiRcvSsthresh: UInt,
    public var tcpiRtt: UInt,
    public var tcpiRttvar: UInt,
    public var tcpiSndSsthresh: UInt,
    public var tcpiSndCwnd: UInt,
    public var tcpiAdvmss: UInt,
    public var tcpiReordering: UInt,
    public var tcpiRcvRtt: UInt,
    public var tcpiRcvSpace: UInt,
    public var tcpiTotalRetrans: UInt,
)

public open class FanotifyEventInfoPidfd(public var hdr: FanotifyEventInfoHeader, public var pidfd: S32)

public open class FanotifyEventInfoError(
    public var hdr: FanotifyEventInfoHeader,
    public var error: S32,
    public var errorCount: U32,
)

public open class SemT(public var size: List<CChar>)

public open class MbstateT(public var count: CInt, public var wchb: List<CChar>)

public open class Fpos64T(public var pos: Off64T, public var state: io.github.kotlinmania.libc.MbstateT)

public open class FposT(public var pos: OffT, public var state: io.github.kotlinmania.libc.MbstateT)

// linux x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=16437
public open class Timespec(
    public var tvSec: TimeT,
    public var tvNsec: CLong,
    public var pad: Int,
)

public open class Utmpx(
    public var utType: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utExit: ExitStatus,
    public var utSession: CLong,
    public var utTv: io.github.kotlinmania.libc.Timeval,
    public var utAddrV6: List<Int>,
    public var glibcReserved: List<CChar>,
)

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

public open class SifieldsSigchld(
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siUtime: CLong,
    public var siStime: CLong,
)

public open class Sifields(public var alignPointer: COpaquePointer?? = null, public var sigchld: SifieldsSigchld? = null)

public open class SiginfoF(public var siginfoBase: List<CInt>, public var sifields: Sifields)

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

public open class CAnonymousPtraceSyscallInfoData(
    public var entry: CAnonymousPtraceSyscallInfoEntry? = null,
    public var exit: CAnonymousPtraceSyscallInfoExit? = null,
    public var seccomp: CAnonymousPtraceSyscallInfoSeccomp? = null,
) {
    public open fun eq(other: CAnonymousPtraceSyscallInfoData): Boolean {
        return this.entry == other.entry || this.exit == other.exit || this.seccomp == other.seccomp
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.entry).hashCode()
            state = 31 * state + (this.exit).hashCode()
            state = 31 * state + (this.seccomp).hashCode()
        }
        return state
    }
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

public val PRIO_PROCESS: io.github.kotlinmania.libc.PriorityWhichT = 0u

public val PRIO_PGRP: io.github.kotlinmania.libc.PriorityWhichT = 1u

public val PRIO_USER: io.github.kotlinmania.libc.PriorityWhichT = 2u

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

public val BINDERFS_SUPER_MAGIC: CLong = 0x6c6f6f70L

public val XFS_SUPER_MAGIC: CLong = 0x58465342L

public val BINDERFS_SUPER_MAGIC1: CUint = 0x6c6f6f70u

public val XFS_SUPER_MAGIC1: CUint = 0x58465342u

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

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val PTHREAD_STACK_MIN1: SizeT = 0x6000uL

public val PTHREAD_STACK_MIN2: SizeT = 131072uL

public val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 3

public val REG_STARTEND: CInt = 4

public val REG_EEND: CInt = 14

public val REG_ESIZE: CInt = 15

public val REG_ERPAREN: CInt = 16

public expect fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun sgetspentR(s: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun getspentR(spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?)

public expect fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit64?): CInt

public expect fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt

public expect fun prlimit(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt

public expect fun prlimit64(pid: PidT, resource: io.github.kotlinmania.libc.RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt

public expect fun utmpname(file: String?): CInt

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun getpt(): CInt

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: Timezone?): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun adjtimex(buf: Timex?): CInt

public expect fun ntpAdjtime(buf: Timex?): CInt

public expect fun ntpGettime(buf: Ntptimeval?): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt

public expect fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt

// Added in `glibc` 2.25
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

// Added in `glibc` 2.29
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt)

public expect fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: Glob64T?): CInt

public expect fun globfree64(pglob: Glob64T?)

public expect fun ptrace(request: CUint, vararg variadicArgs: Long): CLong

public expect fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun getpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: io.github.kotlinmania.libc.PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, value: CInt): CInt

public expect fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun mallinfo(): io.github.kotlinmania.libc.Mallinfo

public expect fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2

public expect fun mallocStats()

public expect fun mallocInfo(options: CInt, stream: FILE?): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun putpwent(p: Passwd?, stream: FILE?): CInt

public expect fun putgrent(grp: Group?, stream: FILE?): CInt

public expect fun sethostid(hostid: CLong): CInt

public expect fun memfdCreate(name: String?, flags: CUint): CInt

public expect fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: TimeT?, buf: COpaquePointer?): COpaquePointer?

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: COpaquePointer?): COpaquePointer?

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: String?): COpaquePointer?

public expect fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer?

public expect fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt

public expect fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun gnuGetLibcRelease(): COpaquePointer?

public expect fun gnuGetLibcVersion(): COpaquePointer?

// posix/spawn.h
// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT?, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT?, tcfd: CInt): CInt

// mntent.h
public expect fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: COpaquePointer?, buflen: CInt): Mntent?

public expect fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt

public expect fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: SigsetT?): CInt

public expect fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt
