// port-lint: source libc/src/unix/linux_like/l4re/mod.rs
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
public const val RLIMIT_CPU: RlimitResourceT = 0.toInt()
public const val RLIMIT_FSIZE: RlimitResourceT = 1.toInt()
public const val RLIMIT_DATA: RlimitResourceT = 2.toInt()
public const val RLIMIT_STACK: RlimitResourceT = 3.toInt()
public const val RLIMIT_CORE: RlimitResourceT = 4.toInt()
public const val RLIMIT_RSS: RlimitResourceT = 5.toInt()
public const val RLIMIT_NPROC: RlimitResourceT = 6.toInt()
public const val RLIMIT_NOFILE: RlimitResourceT = 7.toInt()
public const val RLIMIT_MEMLOCK: RlimitResourceT = 8.toInt()
public const val RLIMIT_AS: RlimitResourceT = 9.toInt()
public const val RLIMIT_LOCKS: RlimitResourceT = 10.toInt()
public const val RLIMIT_SIGPENDING: RlimitResourceT = 11.toInt()
public const val RLIMIT_MSGQUEUE: RlimitResourceT = 12.toInt()
public const val RLIMIT_NICE: RlimitResourceT = 13.toInt()
public const val RLIMIT_RTPRIO: RlimitResourceT = 14.toInt()
public const val RLIMIT_RTTIME: RlimitResourceT = 15.toInt()
public const val RLIM_NLIMITS: RlimitResourceT = 16.toInt()
public const val RLIMIT_NLIMITS: RlimitResourceT = RLIM_NLIMITS
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
public const val TCGETS: Ioctl = 0x5401.toInt()
public const val TCSETS: Ioctl = 0x5402.toInt()
public const val TCSETSW: Ioctl = 0x5403.toInt()
public const val TCSETSF: Ioctl = 0x5404.toInt()
public const val TCGETA: Ioctl = 0x5405.toInt()
public const val TCSETA: Ioctl = 0x5406.toInt()
public const val TCSETAW: Ioctl = 0x5407.toInt()
public const val TCSETAF: Ioctl = 0x5408.toInt()
public const val TCSBRK: Ioctl = 0x5409.toInt()
public const val TCXONC: Ioctl = 0x540A.toInt()
public const val TCFLSH: Ioctl = 0x540B.toInt()
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
public const val TIOCEXCL: Ioctl = 0x540C.toInt()
public const val TIOCNXCL: Ioctl = 0x540D.toInt()
public const val TIOCSCTTY: Ioctl = 0x540E.toInt()
public const val TIOCGPGRP: Ioctl = 0x540F.toInt()
public const val TIOCSPGRP: Ioctl = 0x5410.toInt()
public const val TIOCOUTQ: Ioctl = 0x5411.toInt()
public const val TIOCSTI: Ioctl = 0x5412.toInt()
public const val TIOCGWINSZ: Ioctl = 0x5413.toInt()
public const val TIOCSWINSZ: Ioctl = 0x5414.toInt()
public const val TIOCMGET: Ioctl = 0x5415.toInt()
public const val TIOCMBIS: Ioctl = 0x5416.toInt()
public const val TIOCMBIC: Ioctl = 0x5417.toInt()
public const val TIOCMSET: Ioctl = 0x5418.toInt()
public const val TIOCGSOFTCAR: Ioctl = 0x5419.toInt()
public const val TIOCSSOFTCAR: Ioctl = 0x541A.toInt()
public const val FIONREAD: Ioctl = 0x541B.toInt()
public const val TIOCINQ: Ioctl = FIONREAD
public const val TIOCLINUX: Ioctl = 0x541C.toInt()
public const val TIOCCONS: Ioctl = 0x541D.toInt()
public const val TIOCGSERIAL: Ioctl = 0x541E.toInt()
public const val TIOCSSERIAL: Ioctl = 0x541F.toInt()
public const val TIOCPKT: Ioctl = 0x5420.toInt()
public const val FIONBIO: Ioctl = 0x5421.toInt()
public const val TIOCNOTTY: Ioctl = 0x5422.toInt()
public const val TIOCSETD: Ioctl = 0x5423.toInt()
public const val TIOCGETD: Ioctl = 0x5424.toInt()
public const val TCSBRKP: Ioctl = 0x5425.toInt()
public const val TIOCSBRK: Ioctl = 0x5427.toInt()
public const val TIOCCBRK: Ioctl = 0x5428.toInt()
public const val TIOCGSID: Ioctl = 0x5429.toInt()
public const val TIOCGPTN: Ioctl = 0x80045430.toInt()
public const val TIOCSPTLCK: Ioctl = 0x40045431.toInt()
public const val FIONCLEX: Ioctl = 0x5450.toInt()
public const val FIOCLEX: Ioctl = 0x5451.toInt()
public const val FIOASYNC: Ioctl = 0x5452.toInt()
public const val TIOCSERCONFIG: Ioctl = 0x5453.toInt()
public const val TIOCSERGWILD: Ioctl = 0x5454.toInt()
public const val TIOCSERSWILD: Ioctl = 0x5455.toInt()
public const val TIOCGLCKTRMIOS: Ioctl = 0x5456.toInt()
public const val TIOCSLCKTRMIOS: Ioctl = 0x5457.toInt()
public const val TIOCSERGSTRUCT: Ioctl = 0x5458.toInt()
public const val TIOCSERGETLSR: Ioctl = 0x5459.toInt()
public const val TIOCSERGETMULTI: Ioctl = 0x545A.toInt()
public const val TIOCSERSETMULTI: Ioctl = 0x545B.toInt()
public const val TIOCMIWAIT: Ioctl = 0x545C.toInt()
public const val TIOCGICOUNT: Ioctl = 0x545D.toInt()
public const val BLKSSZGET: Ioctl = 0x1268.toInt()
public const val NLMSG_NOOP: CInt = 0x1
public const val NLMSG_ERROR: CInt = 0x2
public const val NLMSG_DONE: CInt = 0x3
public const val NLMSG_OVERRUN: CInt = 0x4
public const val NLMSG_MIN_TYPE: CInt = 0x10
