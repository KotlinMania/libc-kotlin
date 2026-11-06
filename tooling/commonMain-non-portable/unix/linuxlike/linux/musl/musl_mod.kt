// port-lint: source unix/linux_like/linux/musl/musl_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CcT
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.Elf32Word
import io.github.kotlinmania.libc.Elf64Word
import io.github.kotlinmania.libc.Elf64Xword
import io.github.kotlinmania.libc.FsidT
import io.github.kotlinmania.libc.IdT
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.O_NONBLOCK
import io.github.kotlinmania.libc.Off64T
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.Rlimit
import io.github.kotlinmania.libc.SIGSYS
import io.github.kotlinmania.libc.Sigevent
import io.github.kotlinmania.libc.SighandlerT
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.Sigval
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SocklenT
import io.github.kotlinmania.libc.SpeedT
import io.github.kotlinmania.libc.TcflagT
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.Tm
import io.github.kotlinmania.libc.UidT

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public typealias PthreadT = COpaquePointer?

public typealias ClockT = CLong

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias InoT = ULong

public typealias OffT = Long

public typealias BlkcntT = Long

public typealias ShmattT = CUlong

public typealias MsgqnumT = CUlong

public typealias MsglenT = CUlong

public typealias FsblkcntT = CUlonglong

public typealias Fsblkcnt64T = CUlonglong

public typealias FsfilcntT = CUlonglong

public typealias Fsfilcnt64T = CUlonglong

public typealias RlimT = CUlonglong

public typealias Ioctl = CInt

public open class SifieldsSigchld(
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    public var siUtime: CLong,
    public var siStime: CLong,
)

public open class Sifields(public var alignPointer: COpaquePointer?? = null, public var sigchld: SifieldsSigchld? = null)

public open class SiginfoF(public var siginfoBase: List<CInt>, public var sifields: Sifields)

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var td: COpaquePointer?,
    public var lock: List<CInt>,
    public var err: CInt,
    public var ret: SsizeT,
    public var aioOffset: OffT,
    public var next: COpaquePointer?,
    public var prev: COpaquePointer?,
    public var dummy4: List<CChar>,
)

public open class FanotifyEventMetadata(
    public var eventLen: CUint,
    public var vers: CUchar,
    public var reserved: CUchar,
    public var metadataLen: CUshort,
    public var mask: CUlonglong,
    public var fd: CInt,
    public var pid: CInt,
)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saRestorer: SigactionSaRestorerCallback?,
)

// `mips *` targets swap the `sErrno` and `sCode` fields otherwise this struct is
// target-agnostic (see https://www.openwall.com/lists/musl/2016/01/27/1/2)
//
// Note(union): C implementation uses unions
public open class SiginfoT(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var pad: List<CInt>,
    public var align: List<Int>,
) {
    public open fun siAddr(): COpaquePointer? {
        open class SiginfoSigfault(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siAddr: COpaquePointer?,
        )
        return (((this as SiginfoT?) as SiginfoSigfault?)).siAddr
    }

    public open fun siValue(): Sigval {
        open class SiginfoSiValue(
            public var siSigno: CInt,
            public var siErrno: CInt,
            public var siCode: CInt,
            public var siTimerid: CInt,
            public var siOverrun: CInt,
            public var siValue: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
    }

    public open fun sifields(): Sifields {
        return (((this as SiginfoT?) as SiginfoF?)).sifields
    }

    public open fun siPid(): PidT {
        return this.sifields().sigchld.siPid
    }

    public open fun siUid(): UidT {
        return this.sifields().sigchld.siUid
    }

    public open fun siStatus(): CInt {
        return this.sifields().sigchld.siStatus
    }

    public open fun siUtime(): CLong {
        return this.sifields().sigchld.siUtime
    }

    public open fun siStime(): CLong {
        return this.sifields().sigchld.siStime
    }
}

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFavail: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fReserved: List<CInt>,
)

public open class Statvfs64(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBfree: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBavail: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fFiles: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFfree: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFavail: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
    public var fReserved: List<CInt>,
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

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Flock64(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: Off64T,
    public var lLen: Off64T,
    public var lPid: PidT,
)

public open class RegexT(
    public var reNsub: SizeT,
    public var opaque: COpaquePointer?,
    public var padding: List<COpaquePointer?>,
    public var nsub2: SizeT,
    public var padding2: CChar,
)

public open class Rtentry(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    public var rtPad4: List<CShort>,
    public var rtMetric: CShort,
    public var rtDev: COpaquePointer?,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
)

public open class ExitStatus(public var eTermination: CShort, public var eExit: CShort)

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

public open class Timex(
    public var modes: CUint,
    public var offset: CLong,
    public var freq: CLong,
    public var maxerror: CLong,
    public var esterror: CLong,
    public var status: CInt,
    public var constant: CLong,
    public var precision: CLong,
    public var tolerance: CLong,
    public var time: Timeval,
    public var tick: CLong,
    public var ppsfreq: CLong,
    public var jitter: CLong,
    public var shift: CInt,
    public var stabil: CLong,
    public var jitcnt: CLong,
    public var calcnt: CLong,
    public var errcnt: CLong,
    public var stbcnt: CLong,
    public var tai: CInt,
    public var padding: List<CInt>,
)

public open class Ntptimeval(
    public var time: Timeval,
    public var maxerror: CLong,
    public var esterror: CLong,
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
    /**
     * This contains the bitfields `tcpiDeliveryRateAppLimited` (1 bit) and
     * `tcpiFastopenClientFail` (2 bits).
     */
    public var tcpiDeliveryFastopenBitfields: UByte,
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
    public var tcpiPacingRate: ULong,
    public var tcpiMaxPacingRate: ULong,
    public var tcpiBytesAcked: ULong,
    public var tcpiBytesReceived: ULong,
    public var tcpiSegsOut: UInt,
    public var tcpiSegsIn: UInt,
    public var tcpiNotsentBytes: UInt,
    public var tcpiMinRtt: UInt,
    public var tcpiDataSegsIn: UInt,
    public var tcpiDataSegsOut: UInt,
    public var tcpiDeliveryRate: ULong,
    public var tcpiBusyTime: ULong,
    public var tcpiRwndLimited: ULong,
    public var tcpiSndbufLimited: ULong,
    public var tcpiDelivered: UInt,
    public var tcpiDeliveredCe: UInt,
    public var tcpiBytesSent: ULong,
    public var tcpiBytesRetrans: ULong,
    public var tcpiDsackDups: UInt,
    public var tcpiReordSeen: UInt,
    public var tcpiRcvOoopack: UInt,
    public var tcpiSndWnd: UInt,
)

public open class Statfs(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.FsblkcntT,
    public var fBfree: io.github.kotlinmania.libc.FsblkcntT,
    public var fBavail: io.github.kotlinmania.libc.FsblkcntT,
    public var fFiles: io.github.kotlinmania.libc.FsfilcntT,
    public var fFfree: io.github.kotlinmania.libc.FsfilcntT,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Statfs64(
    public var fType: CUlong,
    public var fBsize: CUlong,
    public var fBlocks: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBfree: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fBavail: io.github.kotlinmania.libc.Fsblkcnt64T,
    public var fFiles: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFfree: io.github.kotlinmania.libc.Fsfilcnt64T,
    public var fFsid: FsidT,
    public var fNamelen: CUlong,
    public var fFrsize: CUlong,
    public var fFlags: CUlong,
    public var fSpare: List<CUlong>,
)

public open class Sysinfo(
    public var uptime: CUlong,
    public var loads: List<CUlong>,
    public var totalram: CUlong,
    public var freeram: CUlong,
    public var sharedram: CUlong,
    public var bufferram: CUlong,
    public var totalswap: CUlong,
    public var freeswap: CUlong,
    public var procs: CUshort,
    public var pad: CUshort,
    public var totalhigh: CUlong,
    public var freehigh: CUlong,
    public var memUnit: CUint,
    public var reserved: List<CChar>,
)

public open class Utmpx(
    public var utType: CShort,
    public var utPad1: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utExit: ExitStatus,
    public var utSession: CLong,
    public var utPad2: CInt,
    public var utTv: Timeval,
    public var utAddrV6: List<CUint>,
    public var unused: List<CChar>,
)

// include/sys/mman.h
//
// Huge page size encoding when MAP_HUGETLB is specified, and a huge page
// size other than the default is desired.  See hugetlbEncode.h.
// All known huge page size encodings are provided here.  It is the
// responsibility of the application to know which sizes are supported on
// the running system.  See mmap(2) man page for details.
//
public val MAP_HUGE_SHIFT: CInt = 26

public val MAP_HUGE_MASK: CInt = 0x3f

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

public val MS_RMT_MASK: CUlong = 0x02800051uL

// include/utmpx.h
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

public val SFD_CLOEXEC: CInt = 0x080000

public val NCCS: Int = 32

public val NCCS1: Int = 19

public val O_TRUNC: CInt = 512

public val O_NOATIME: CInt = 262144

public val O_CLOEXEC: CInt = 0x80000

public val O_TMPFILE: CInt = 4194304 or O_DIRECTORY

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EDOTDOT: CInt = 73

public val F_OFD_GETLK: CInt = 36

public val F_OFD_SETLK: CInt = 37

public val F_OFD_SETLKW: CInt = 38

public val F_RDLCK: CInt = 0

public val F_WRLCK: CInt = 1

public val F_UNLCK: CInt = 2

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val SA_RESTART: CInt = 0x10000000

public val SA_NOCLDSTOP: CInt = 0x00000001

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EFD_CLOEXEC: CInt = 0x80000

public val BUFSIZ: CUint = 1024u

public val TMP_MAX: CUint = 10000u

public val FOPEN_MAX: CUint = 1000u

public val FILENAME_MAX: CUint = 4096u

public val O_PATH: CInt = 2097152

public val O_EXEC: CInt = 2097152

public val O_SEARCH: CInt = 2097152

public val O_ACCMODE: CInt = 2097155

public val O_NDELAY: CInt = O_NONBLOCK

public val NI_MAXHOST: SocklenT = 255u

public val PTHREAD_STACK_MIN: SizeT = 2048uL

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_DCCP: CInt = 6

public val SOCK_NONBLOCK: CInt = O_NONBLOCK

public val SOCK_PACKET: CInt = 10

public val SOMAXCONN: CInt = 128

public val SIGUNUSED: CInt = SIGSYS

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 8

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

// Value was changed in 1.2.4
public val CPU_SETSIZE: CInt = if (false) {
    1024
} else {
    128
}

public val PTRACE_TRACEME: CInt = 0

public val PTRACE_PEEKTEXT: CInt = 1

public val PTRACE_PEEKDATA: CInt = 2

public val PTRACE_PEEKUSER: CInt = 3

public val PTRACE_POKETEXT: CInt = 4

public val PTRACE_POKEDATA: CInt = 5

public val PTRACE_POKEUSER: CInt = 6

public val PTRACE_CONT: CInt = 7

public val PTRACE_KILL: CInt = 8

public val PTRACE_SINGLESTEP: CInt = 9

public val PTRACE_GETREGS: CInt = 12

public val PTRACE_SETREGS: CInt = 13

public val PTRACE_GETFPREGS: CInt = 14

public val PTRACE_SETFPREGS: CInt = 15

public val PTRACE_ATTACH: CInt = 16

public val PTRACE_DETACH: CInt = 17

public val PTRACE_GETFPXREGS: CInt = 18

public val PTRACE_SETFPXREGS: CInt = 19

public val PTRACE_SYSCALL: CInt = 24

public val PTRACE_SETOPTIONS: CInt = 0x4200

public val PTRACE_GETEVENTMSG: CInt = 0x4201

public val PTRACE_GETSIGINFO: CInt = 0x4202

public val PTRACE_SETSIGINFO: CInt = 0x4203

public val PTRACE_GETREGSET: CInt = 0x4204

public val PTRACE_SETREGSET: CInt = 0x4205

public val PTRACE_SEIZE: CInt = 0x4206

public val PTRACE_INTERRUPT: CInt = 0x4207

public val PTRACE_LISTEN: CInt = 0x4208

public val PTRACE_PEEKSIGINFO: CInt = 0x4209

public val PTRACE_GETSIGMASK: CUint = 0x420au

public val PTRACE_SETSIGMASK: CUint = 0x420bu

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

public val EFD_NONBLOCK: CInt = O_NONBLOCK

public val SFD_NONBLOCK: CInt = O_NONBLOCK

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val RTLD_GLOBAL: CInt = 0x100

public val RTLD_NOLOAD: CInt = 0x4

public val CLOCK_SGI_CYCLE: ClockidT = 10

public val B0: SpeedT = 0

public val B50: SpeedT = 1

public val B75: SpeedT = 2

public val B110: SpeedT = 3

public val B134: SpeedT = 4

public val B150: SpeedT = 5

public val B200: SpeedT = 6

public val B300: SpeedT = 7

public val B600: SpeedT = 8

public val B1200: SpeedT = 9

public val B1800: SpeedT = 10

public val B2400: SpeedT = 11

public val B4800: SpeedT = 12

public val B9600: SpeedT = 13

public val B19200: SpeedT = 14

public val B38400: SpeedT = 15

public val EXTA: SpeedT = B19200

public val EXTB: SpeedT = B38400

public val REG_OK: CInt = 0

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

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

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

public val TIME_BAD: CInt = TIME_ERROR

public val MAXTC: CLong = 6L

public val CS_V6_ENV: CInt = 1148

public val CS_V7_ENV: CInt = 1149

public val CLONE_NEWTIME: CInt = 0x80

public val UT_HOSTSIZE: Int = 256

public val UT_LINESIZE: Int = 32

public val UT_NAMESIZE: Int = 32

public val POSIX_FADV_DONTNEED: CInt = 6

public val POSIX_FADV_NOREUSE: CInt = 7

public val POSIX_FADV_DONTNEED1: CInt = 4

public val POSIX_FADV_NOREUSE1: CInt = 5

public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt

public expect fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, vararg variadicArgs: Long): CLong

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

// Musl targets need the `mask` argument of `fanotifyMark` be specified
// `cUlonglong` instead of `ULong` or there will be a type mismatch between
// `long long unsigned int` and the expected `uint64T`.
public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: CUlonglong, dirfd: CInt, path: String?): CInt

public expect fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun getauxval(type: CUlong): CUlong

// Added in `musl` 1.1.20
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

// Added in `musl` 1.2.2
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun adjtimex(buf: io.github.kotlinmania.libc.Timex?): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: io.github.kotlinmania.libc.Timex?): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun memfdCreate(name: String?, flags: CUint): CInt

public expect fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer?

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

// Added in `musl` 1.1.20
public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt

// Added in `musl` 1.1.24
public expect fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt

public expect fun getutxent(): Utmpx?

public expect fun getutxid(ut: Utmpx?): Utmpx?

public expect fun getutxline(ut: Utmpx?): Utmpx?

public expect fun pututxline(ut: Utmpx?): Utmpx?

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: String?): CInt

public expect fun pthreadTryjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadTimedjoinNp(thread: io.github.kotlinmania.libc.PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt
