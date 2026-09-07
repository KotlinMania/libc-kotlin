// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword

public const val MAP_ANON: CInt = 0x0020
public const val O_DIRECTORY: CInt = 0x10000
public typealias PthreadT = COpaquePointer?
public typealias ClockT = CLong
public typealias TimeT = Long
public typealias SusecondsT = Long
public typealias InoT = ULong
public typealias OffT = Long
public typealias BlkcntT = Long
public typealias ShmattT = CULong
public typealias MsgqnumT = CULong
public typealias MsglenT = CULong
public typealias FsblkcntT = CULongLong
public typealias Fsblkcnt64T = CULongLong
public typealias FsfilcntT = CULongLong
public typealias Fsfilcnt64T = CULongLong
public typealias RlimT = CULongLong
public typealias Ioctl = CInt

public data class Aiocb(
    val aioFildes: CInt,
    val aioLioOpcode: CInt,
    val aioReqprio: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val td: COpaquePointer?,
    val lock: IntArray,
    val err: CInt,
    val ret: SsizeT,
    val aioOffset: OffT,
    val next: COpaquePointer?,
    val prev: COpaquePointer?,
    val dummy4: ByteArray,
)

public data class FanotifyEventMetadata(
    val eventLen: CUInt,
    val vers: CUChar,
    val reserved: CUChar,
    val metadataLen: CUShort,
    val mask: CULongLong,
    val fd: CInt,
    val pid: CInt,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saRestorer: (() -> Unit)?,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val siErrno2: CInt,
    val pad: IntArray,
    val align: List<ULong>,
    val siAddr: COpaquePointer? = null,
    val siValue: Sigval? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
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
    val fFsid2: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class Statvfs64(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFavail: Fsfilcnt64T,
    val fFsid: CULong,
    val fFsid2: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
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

public data class Flock64(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: Off64T,
    val lLen: Off64T,
    val lPid: PidT,
)

public data class RegexT(
    val reNsub: ULong,
    val opaque: COpaquePointer?,
    val nsub2: ULong,
)

public data class Rtentry(
    val rtPad1: CULong,
    val rtDst: Sockaddr,
    val rtGateway: Sockaddr,
    val rtGenmask: Sockaddr,
    val rtFlags: CUShort,
    val rtPad2: CShort,
    val rtPad3: CULong,
    val rtTos: CUChar,
    val rtClass: CUChar,
    val rtPad4: ShortArray,
    val rtPad42: ShortArray,
    val rtMetric: CShort,
    val rtDev: String?,
    val rtMtu: CULong,
    val rtWindow: CULong,
    val rtIrtt: CUShort,
)

public data class ExitStatus(
    val eTermination: CShort,
    val eExit: CShort,
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

public data class Timex(
    val modes: CUInt,
    val offset: CLong,
    val freq: CLong,
    val maxerror: CLong,
    val esterror: CLong,
    val status: CInt,
    val constant: CLong,
    val precision: CLong,
    val tolerance: CLong,
    val time: Timeval,
    val tick: CLong,
    val ppsfreq: CLong,
    val jitter: CLong,
    val shift: CInt,
    val stabil: CLong,
    val jitcnt: CLong,
    val calcnt: CLong,
    val errcnt: CLong,
    val stbcnt: CLong,
    val tai: CInt,
    val padding: IntArray,
)

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: CLong,
    val esterror: CLong,
)

public data class TcpInfo(
    val tcpiState: UByte,
    val tcpiCaState: UByte,
    val tcpiRetransmits: UByte,
    val tcpiProbes: UByte,
    val tcpiBackoff: UByte,
    val tcpiOptions: UByte,
    val tcpiSndRcvWscale: UByte,
    val tcpiDeliveryFastopenBitfields: UByte,
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
    val tcpiPacingRate: ULong,
    val tcpiMaxPacingRate: ULong,
    val tcpiBytesAcked: ULong,
    val tcpiBytesReceived: ULong,
    val tcpiSegsOut: UInt,
    val tcpiSegsIn: UInt,
    val tcpiNotsentBytes: UInt,
    val tcpiMinRtt: UInt,
    val tcpiDataSegsIn: UInt,
    val tcpiDataSegsOut: UInt,
    val tcpiDeliveryRate: ULong,
    val tcpiBusyTime: ULong,
    val tcpiRwndLimited: ULong,
    val tcpiSndbufLimited: ULong,
    val tcpiDelivered: UInt,
    val tcpiDeliveredCe: UInt,
    val tcpiBytesSent: ULong,
    val tcpiBytesRetrans: ULong,
    val tcpiDsackDups: UInt,
    val tcpiReordSeen: UInt,
    val tcpiRcvOoopack: UInt,
    val tcpiSndWnd: UInt,
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

public data class Statfs64(
    val fType: CULong,
    val fBsize: CULong,
    val fBlocks: Fsblkcnt64T,
    val fBfree: Fsblkcnt64T,
    val fBavail: Fsblkcnt64T,
    val fFiles: Fsfilcnt64T,
    val fFfree: Fsfilcnt64T,
    val fFsid: FsidT,
    val fNamelen: CULong,
    val fFrsize: CULong,
    val fFlags: CULong,
    val fSpare: ULongArray,
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

public data class Utmpx(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: CLong,
    val utSession2: CInt,
    val utTv: Timeval,
    val utAddrV6: UIntArray,
)

public const val MAP_HUGE_SHIFT: CInt = 26
public const val MAP_HUGE_MASK: CInt = 0x3f
public val MAP_HUGE_64KB: CInt = 16 shl MAP_HUGE_SHIFT
public val MAP_HUGE_512KB: CInt = 19 shl MAP_HUGE_SHIFT
public val MAP_HUGE_1MB: CInt = 20 shl MAP_HUGE_SHIFT
public val MAP_HUGE_2MB: CInt = 21 shl MAP_HUGE_SHIFT
public val MAP_HUGE_8MB: CInt = 23 shl MAP_HUGE_SHIFT
public val MAP_HUGE_16MB: CInt = 24 shl MAP_HUGE_SHIFT
public val MAP_HUGE_32MB: CInt = 25 shl MAP_HUGE_SHIFT
public val MAP_HUGE_256MB: CInt = 28 shl MAP_HUGE_SHIFT
public val MAP_HUGE_512MB: CInt = 29 shl MAP_HUGE_SHIFT
public val MAP_HUGE_1GB: CInt = 30 shl MAP_HUGE_SHIFT
public val MAP_HUGE_2GB: CInt = 31 shl MAP_HUGE_SHIFT
public val MAP_HUGE_16GB: CInt = 34 shl MAP_HUGE_SHIFT
public const val MS_RMT_MASK: CULong = 0x02800051uL
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
public const val SFD_CLOEXEC: CInt = 0x080000
public const val NCCS: ULong = 32uL
public const val O_TRUNC: CInt = 512
public const val O_NOATIME: CInt = 262144
public const val O_CLOEXEC: CInt = 0x80000
public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY
public const val EBFONT: CInt = 59
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EDOTDOT: CInt = 73
public const val F_OFD_GETLK: CInt = 36
public const val F_OFD_SETLK: CInt = 37
public const val F_OFD_SETLKW: CInt = 38
public const val F_RDLCK: CInt = 0
public const val F_WRLCK: CInt = 1
public const val F_UNLCK: CInt = 2
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_RESETHAND: CInt = 0x80000000.toInt()
public const val SA_RESTART: CInt = 0x10000000
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val EPOLL_CLOEXEC: CInt = 0x80000
public const val EFD_CLOEXEC: CInt = 0x80000
public const val BUFSIZ: CUInt = 1024u
public const val TMP_MAX: CUInt = 10000u
public const val FOPEN_MAX: CUInt = 1000u
public const val FILENAME_MAX: CUInt = 4096u
public const val O_PATH: CInt = 2097152
public const val O_EXEC: CInt = 2097152
public const val O_SEARCH: CInt = 2097152
public const val O_ACCMODE: CInt = 2097155
public const val O_NDELAY: CInt = O_NONBLOCK
public const val NI_MAXHOST: SocklenT = 255u
public const val PTHREAD_STACK_MIN: ULong = 2048uL
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_DCCP: CInt = 6
public const val SOCK_NONBLOCK: CInt = O_NONBLOCK
public const val SOCK_PACKET: CInt = 10
public const val SOMAXCONN: CInt = 128
public const val SIGUNUSED: CInt = 31
public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

// CPU_SETSIZE is 1024 on musl_v1_2_3 targets.
public const val CPU_SETSIZE: CInt = 128
public const val PTRACE_TRACEME: CInt = 0
public const val PTRACE_PEEKTEXT: CInt = 1
public const val PTRACE_PEEKDATA: CInt = 2
public const val PTRACE_PEEKUSER: CInt = 3
public const val PTRACE_POKETEXT: CInt = 4
public const val PTRACE_POKEDATA: CInt = 5
public const val PTRACE_POKEUSER: CInt = 6
public const val PTRACE_CONT: CInt = 7
public const val PTRACE_KILL: CInt = 8
public const val PTRACE_SINGLESTEP: CInt = 9
public const val PTRACE_GETREGS: CInt = 12
public const val PTRACE_SETREGS: CInt = 13
public const val PTRACE_GETFPREGS: CInt = 14
public const val PTRACE_SETFPREGS: CInt = 15
public const val PTRACE_ATTACH: CInt = 16
public const val PTRACE_DETACH: CInt = 17
public const val PTRACE_GETFPXREGS: CInt = 18
public const val PTRACE_SETFPXREGS: CInt = 19
public const val PTRACE_SYSCALL: CInt = 24
public const val PTRACE_SETOPTIONS: CInt = 0x4200
public const val PTRACE_GETEVENTMSG: CInt = 0x4201
public const val PTRACE_GETSIGINFO: CInt = 0x4202
public const val PTRACE_SETSIGINFO: CInt = 0x4203
public const val PTRACE_GETREGSET: CInt = 0x4204
public const val PTRACE_SETREGSET: CInt = 0x4205
public const val PTRACE_SEIZE: CInt = 0x4206
public const val PTRACE_INTERRUPT: CInt = 0x4207
public const val PTRACE_LISTEN: CInt = 0x4208
public const val PTRACE_PEEKSIGINFO: CInt = 0x4209
public const val PTRACE_GETSIGMASK: CUInt = 0x420au
public const val PTRACE_SETSIGMASK: CUInt = 0x420bu
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
public const val EFD_NONBLOCK: CInt = O_NONBLOCK
public const val SFD_NONBLOCK: CInt = O_NONBLOCK
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val RTLD_GLOBAL: CInt = 0x100
public const val RTLD_NOLOAD: CInt = 0x4
public const val CLOCK_SGI_CYCLE: ClockidT = 10
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
public const val EXTA: SpeedT = B19200
public const val EXTB: SpeedT = B38400
public const val REG_OK: CInt = 0
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
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
public const val TIME_OK: CInt = 0
public const val TIME_INS: CInt = 1
public const val TIME_DEL: CInt = 2
public const val TIME_OOP: CInt = 3
public const val TIME_WAIT: CInt = 4
public const val TIME_ERROR: CInt = 5
public const val TIME_BAD: CInt = TIME_ERROR
public const val MAXTC: CLong = 6
public const val _CS_V6_ENV: CInt = 1148
public const val _CS_V7_ENV: CInt = 1149
public const val CLONE_NEWTIME: CInt = 0x80
public const val UT_HOSTSIZE: ULong = 256uL
public const val UT_LINESIZE: ULong = 32uL
public const val UT_NAMESIZE: ULong = 32uL
public const val POSIX_FADV_DONTNEED: CInt = 6
public const val POSIX_FADV_NOREUSE: CInt = 7

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt 
public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt 
public expect fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt 
public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt 
public expect fun ptrace(request: CInt, vararg args: Any?): CLong 
public expect fun getpriority(which: CInt, who: IdT): CInt 
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt 
public expect fun fanotifyMark(fd: CInt, flags: CUInt, mask: CULongLong, dirfd: CInt, path: String?): CInt 
public expect fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT 
public expect fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT 
public expect fun getauxval(type: CULong): CULong 
public expect fun explicitBzero(s: COpaquePointer?, len: ULong)
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? 
public expect fun adjtimex(buf: Timex?): CInt 
public expect fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt 
public expect fun ctermid(s: String?): String? 
public expect fun memfdCreate(name: String?, flags: CUInt): CInt 
public expect fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt 
public expect fun mallocUsableSize(ptr: COpaquePointer?): ULong 
public expect fun euidaccess(pathname: String?, mode: CInt): CInt 
public expect fun eaccess(pathname: String?, mode: CInt): CInt 
public expect fun asctimeR(tm: Tm?, buf: String?): String? 
public expect fun dirname(path: String?): String? 
public expect fun basename(path: String?): String? 
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT 
public expect fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt 
public expect fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt 
public expect fun getutxent(): Utmpx? 
public expect fun getutxid(ut: Utmpx?): Utmpx? 
public expect fun getutxline(ut: Utmpx?): Utmpx? 
public expect fun pututxline(ut: Utmpx?): Utmpx? 
public expect fun setutxent()
public expect fun endutxent()
public expect fun utmpxname(file: String?): CInt 
public expect fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt 
public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt 