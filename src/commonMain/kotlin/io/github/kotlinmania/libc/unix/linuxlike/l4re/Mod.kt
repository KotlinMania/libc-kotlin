// port-lint: source unix/linux_like/l4re/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*

public typealias L4UmwordT = CULong
public typealias PthreadT = COpaquePointer?
public typealias DevT = ULong
public typealias SocklenT = UInt
public typealias ModeT = UInt
public typealias Ino64T = ULong
public typealias Off64T = Long
public typealias Blkcnt64T = Long
public typealias Rlim64T = ULong
public typealias NfdsT = CULong
public typealias NlItem = CInt
public typealias IdtypeT = CUInt
public typealias LoffT = CLongLong
public typealias PthreadKeyT = CUInt
public typealias PthreadOnceT = CInt
public typealias PthreadSpinlockT = CInt

public data class L4SchedCpuSetT(
    val granOffset: L4UmwordT,
    val map: L4UmwordT,
)

public data class PthreadAttrT(
    val detachstate: CInt,
    val schedpolicy: CInt,
    val schedparam: SchedParam,
    val inheritsched: CInt,
    val scope: CInt,
    val guardsize: ULong,
    val stackaddrSet: CInt,
    val stackaddr: COpaquePointer?,
    val stacksize: ULong,
    val affinity: L4SchedCpuSetT,
    val createFlags: CUInt,
)

public const val PTHREAD_STACK_MIN: ULong = 65536uL
public const val BOTHER: SpeedT = 4096u
public const val RLIMIT_CPU: RlimitResourceT = 0uL
public const val RLIMIT_FSIZE: RlimitResourceT = 1uL
public const val RLIMIT_DATA: RlimitResourceT = 2uL
public const val RLIMIT_STACK: RlimitResourceT = 3uL
public const val RLIMIT_CORE: RlimitResourceT = 4uL
public const val RLIMIT_RSS: RlimitResourceT = 5uL
public const val RLIMIT_NPROC: RlimitResourceT = 6uL
public const val RLIMIT_NOFILE: RlimitResourceT = 7uL
public const val RLIMIT_MEMLOCK: RlimitResourceT = 8uL
public const val RLIMIT_AS: RlimitResourceT = 9uL
public const val RLIMIT_LOCKS: RlimitResourceT = 10uL
public const val RLIMIT_SIGPENDING: RlimitResourceT = 11uL
public const val RLIMIT_MSGQUEUE: RlimitResourceT = 12uL
public const val RLIMIT_NICE: RlimitResourceT = 13uL
public const val RLIMIT_RTPRIO: RlimitResourceT = 14uL
public const val RLIMIT_RTTIME: RlimitResourceT = 15uL
public const val RLIMIT_NLIMITS: RlimitResourceT = RLIM_NLIMITS
public const val RLIM_NLIMITS: RlimitResourceT = 16uL
public const val SOL_SOCKET: CInt = 1
public const val SO_DEBUG: CInt = 1
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_DONTROUTE: CInt = 5
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_OOBINLINE: CInt = 10
public const val SO_NO_CHECK: CInt = 11
public const val SO_PRIORITY: CInt = 12
public const val SO_LINGER: CInt = 13
public const val SO_BSDCOMPAT: CInt = 14
public const val SO_PASSCRED: CInt = 16
public const val SO_PEERCRED: CInt = 17
public const val SO_RCVLOWAT: CInt = 18
public const val SO_SNDLOWAT: CInt = 19
public const val SO_RCVTIMEO: CInt = 20
public const val SO_SNDTIMEO: CInt = 21
public const val SO_SECURITY_AUTHENTICATION: CInt = 22
public const val SO_SECURITY_ENCRYPTION_TRANSPORT: CInt = 23
public const val SO_SECURITY_ENCRYPTION_NETWORK: CInt = 24
public const val SO_BINDTODEVICE: CInt = 25
public const val SO_ATTACH_FILTER: CInt = 26
public const val SO_DETACH_FILTER: CInt = 27
public const val SO_PEERNAME: CInt = 28
public const val SO_ACCEPTCONN: CInt = 30
public const val SO_PEERSEC: CInt = 31
public const val TCGETS: Ioctl = 0x5401uL
public const val TCSETS: Ioctl = 0x5402uL
public const val TCSETSW: Ioctl = 0x5403uL
public const val TCSETSF: Ioctl = 0x5404uL
public const val TCGETA: Ioctl = 0x5405uL
public const val TCSETA: Ioctl = 0x5406uL
public const val TCSETAW: Ioctl = 0x5407uL
public const val TCSETAF: Ioctl = 0x5408uL
public const val TCSBRK: Ioctl = 0x5409uL
public const val TCXONC: Ioctl = 0x540AuL
public const val TCFLSH: Ioctl = 0x540BuL
public const val TIOCM_LE: CInt = 0x001
public const val TIOCM_DTR: CInt = 0x002
public const val TIOCM_RTS: CInt = 0x004
public const val TIOCM_ST: CInt = 0x008
public const val TIOCM_SR: CInt = 0x010
public const val TIOCM_CTS: CInt = 0x020
public const val TIOCM_CAR: CInt = 0x040
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RNG: CInt = 0x080
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCEXCL: Ioctl = 0x540CuL
public const val TIOCNXCL: Ioctl = 0x540DuL
public const val TIOCSCTTY: Ioctl = 0x540EuL
public const val TIOCGPGRP: Ioctl = 0x540FuL
public const val TIOCSPGRP: Ioctl = 0x5410uL
public const val TIOCOUTQ: Ioctl = 0x5411uL
public const val TIOCSTI: Ioctl = 0x5412uL
public const val TIOCGWINSZ: Ioctl = 0x5413uL
public const val TIOCSWINSZ: Ioctl = 0x5414uL
public const val TIOCMGET: Ioctl = 0x5415uL
public const val TIOCMBIS: Ioctl = 0x5416uL
public const val TIOCMBIC: Ioctl = 0x5417uL
public const val TIOCMSET: Ioctl = 0x5418uL
public const val TIOCGSOFTCAR: Ioctl = 0x5419uL
public const val TIOCSSOFTCAR: Ioctl = 0x541AuL
public const val FIONREAD: Ioctl = 0x541BuL
public const val TIOCINQ: Ioctl = FIONREAD
public const val TIOCLINUX: Ioctl = 0x541CuL
public const val TIOCCONS: Ioctl = 0x541DuL
public const val TIOCGSERIAL: Ioctl = 0x541EuL
public const val TIOCSSERIAL: Ioctl = 0x541FuL
public const val TIOCPKT: Ioctl = 0x5420uL
public const val FIONBIO: Ioctl = 0x5421uL
public const val TIOCNOTTY: Ioctl = 0x5422uL
public const val TIOCSETD: Ioctl = 0x5423uL
public const val TIOCGETD: Ioctl = 0x5424uL
public const val TCSBRKP: Ioctl = 0x5425uL
public const val TIOCSBRK: Ioctl = 0x5427uL
public const val TIOCCBRK: Ioctl = 0x5428uL
public const val TIOCGSID: Ioctl = 0x5429uL
public const val TIOCGPTN: Ioctl = 0x80045430uL
public const val TIOCSPTLCK: Ioctl = 0x40045431uL
public const val FIONCLEX: Ioctl = 0x5450uL
public const val FIOCLEX: Ioctl = 0x5451uL
public const val FIOASYNC: Ioctl = 0x5452uL
public const val TIOCSERCONFIG: Ioctl = 0x5453uL
public const val TIOCSERGWILD: Ioctl = 0x5454uL
public const val TIOCSERSWILD: Ioctl = 0x5455uL
public const val TIOCGLCKTRMIOS: Ioctl = 0x5456uL
public const val TIOCSLCKTRMIOS: Ioctl = 0x5457uL
public const val TIOCSERGSTRUCT: Ioctl = 0x5458uL
public const val TIOCSERGETLSR: Ioctl = 0x5459uL
public const val TIOCSERGETMULTI: Ioctl = 0x545AuL
public const val TIOCSERSETMULTI: Ioctl = 0x545BuL
public const val TIOCMIWAIT: Ioctl = 0x545CuL
public const val TIOCGICOUNT: Ioctl = 0x545DuL
public const val BLKSSZGET: Ioctl = 0x1268uL
public const val NLMSG_NOOP: CInt = 0x1
public const val NLMSG_ERROR: CInt = 0x2
public const val NLMSG_DONE: CInt = 0x3
public const val NLMSG_OVERRUN: CInt = 0x4
public const val NLMSG_MIN_TYPE: CInt = 0x10
