package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*

public const val PTHREAD_STACK_MIN: ULong = 65536uL

public const val BOTHER: UInt = 4096u

public const val RLIMIT_CPU: Int = 0.toInt()

public const val RLIMIT_FSIZE: Int = 1.toInt()

public const val RLIMIT_DATA: Int = 2.toInt()

public const val RLIMIT_STACK: Int = 3.toInt()

public const val RLIMIT_CORE: Int = 4.toInt()

public const val RLIMIT_RSS: Int = 5.toInt()

public const val RLIMIT_NPROC: Int = 6.toInt()

public const val RLIMIT_NOFILE: Int = 7.toInt()

public const val RLIMIT_MEMLOCK: Int = 8.toInt()

public const val RLIMIT_AS: Int = 9.toInt()

public const val RLIMIT_LOCKS: Int = 10.toInt()

public const val RLIMIT_SIGPENDING: Int = 11.toInt()

public const val RLIMIT_MSGQUEUE: Int = 12.toInt()

public const val RLIMIT_NICE: Int = 13.toInt()

public const val RLIMIT_RTPRIO: Int = 14.toInt()

public const val RLIMIT_RTTIME: Int = 15.toInt()

public const val RLIM_NLIMITS: Int = 16.toInt()

public const val RLIMIT_NLIMITS: Int = RLIM_NLIMITS

public const val SOL_SOCKET: Int = 1

public const val SO_DEBUG: Int = 1

public const val SO_REUSEADDR: Int = 2

public const val SO_TYPE: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_DONTROUTE: Int = 5

public const val SO_BROADCAST: Int = 6

public const val SO_SNDBUF: Int = 7

public const val SO_RCVBUF: Int = 8

public const val SO_KEEPALIVE: Int = 9

public const val SO_OOBINLINE: Int = 10

public const val SO_NO_CHECK: Int = 11

public const val SO_PRIORITY: Int = 12

public const val SO_LINGER: Int = 13

public const val SO_BSDCOMPAT: Int = 14

public const val SO_PASSCRED: Int = 16

public const val SO_PEERCRED: Int = 17

public const val SO_RCVLOWAT: Int = 18

public const val SO_SNDLOWAT: Int = 19

public const val SO_RCVTIMEO: Int = 20

public const val SO_SNDTIMEO: Int = 21

public const val SO_SECURITY_AUTHENTICATION: Int = 22

public const val SO_SECURITY_ENCRYPTION_TRANSPORT: Int = 23

public const val SO_SECURITY_ENCRYPTION_NETWORK: Int = 24

public const val SO_BINDTODEVICE: Int = 25

public const val SO_ATTACH_FILTER: Int = 26

public const val SO_DETACH_FILTER: Int = 27

public const val SO_PEERNAME: Int = 28

public const val SO_ACCEPTCONN: Int = 30

public const val SO_PEERSEC: Int = 31

public const val TCGETS: Int = 0x5401.toInt()

public const val TCSETS: Int = 0x5402.toInt()

public const val TCSETSW: Int = 0x5403.toInt()

public const val TCSETSF: Int = 0x5404.toInt()

public const val TCGETA: Int = 0x5405.toInt()

public const val TCSETA: Int = 0x5406.toInt()

public const val TCSETAW: Int = 0x5407.toInt()

public const val TCSETAF: Int = 0x5408.toInt()

public const val TCSBRK: Int = 0x5409.toInt()

public const val TCXONC: Int = 0x540A.toInt()

public const val TCFLSH: Int = 0x540B.toInt()

public const val TIOCM_LE: Int = 0x001

public const val TIOCM_DTR: Int = 0x002

public const val TIOCM_RTS: Int = 0x004

public const val TIOCM_ST: Int = 0x008

public const val TIOCM_SR: Int = 0x010

public const val TIOCM_CTS: Int = 0x020

public const val TIOCM_CAR: Int = 0x040

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RNG: Int = 0x080

public const val TIOCM_RI: Int = TIOCM_RNG

public const val TIOCM_DSR: Int = 0x100

public const val TIOCEXCL: Int = 0x540C.toInt()

public const val TIOCNXCL: Int = 0x540D.toInt()

public const val TIOCSCTTY: Int = 0x540E.toInt()

public const val TIOCGPGRP: Int = 0x540F.toInt()

public const val TIOCSPGRP: Int = 0x5410.toInt()

public const val TIOCOUTQ: Int = 0x5411.toInt()

public const val TIOCSTI: Int = 0x5412.toInt()

public const val TIOCGWINSZ: Int = 0x5413.toInt()

public const val TIOCSWINSZ: Int = 0x5414.toInt()

public const val TIOCMGET: Int = 0x5415.toInt()

public const val TIOCMBIS: Int = 0x5416.toInt()

public const val TIOCMBIC: Int = 0x5417.toInt()

public const val TIOCMSET: Int = 0x5418.toInt()

public const val TIOCGSOFTCAR: Int = 0x5419.toInt()

public const val TIOCSSOFTCAR: Int = 0x541A.toInt()

public const val FIONREAD: Int = 0x541B.toInt()

public const val TIOCINQ: Int = FIONREAD

public const val TIOCLINUX: Int = 0x541C.toInt()

public const val TIOCCONS: Int = 0x541D.toInt()

public const val TIOCGSERIAL: Int = 0x541E.toInt()

public const val TIOCSSERIAL: Int = 0x541F.toInt()

public const val TIOCPKT: Int = 0x5420.toInt()

public const val FIONBIO: Int = 0x5421.toInt()

public const val TIOCNOTTY: Int = 0x5422.toInt()

public const val TIOCSETD: Int = 0x5423.toInt()

public const val TIOCGETD: Int = 0x5424.toInt()

public const val TCSBRKP: Int = 0x5425.toInt()

public const val TIOCSBRK: Int = 0x5427.toInt()

public const val TIOCCBRK: Int = 0x5428.toInt()

public const val TIOCGSID: Int = 0x5429.toInt()

public const val TIOCGPTN: Int = 0x80045430.toInt()

public const val TIOCSPTLCK: Int = 0x40045431.toInt()

public const val FIONCLEX: Int = 0x5450.toInt()

public const val FIOCLEX: Int = 0x5451.toInt()

public const val FIOASYNC: Int = 0x5452.toInt()

public const val TIOCSERCONFIG: Int = 0x5453.toInt()

public const val TIOCSERGWILD: Int = 0x5454.toInt()

public const val TIOCSERSWILD: Int = 0x5455.toInt()

public const val TIOCGLCKTRMIOS: Int = 0x5456.toInt()

public const val TIOCSLCKTRMIOS: Int = 0x5457.toInt()

public const val TIOCSERGSTRUCT: Int = 0x5458.toInt()

public const val TIOCSERGETLSR: Int = 0x5459.toInt()

public const val TIOCSERGETMULTI: Int = 0x545A.toInt()

public const val TIOCSERSETMULTI: Int = 0x545B.toInt()

public const val TIOCMIWAIT: Int = 0x545C.toInt()

public const val TIOCGICOUNT: Int = 0x545D.toInt()

public const val BLKSSZGET: Int = 0x1268.toInt()

public const val NLMSG_NOOP: Int = 0x1

public const val NLMSG_ERROR: Int = 0x2

public const val NLMSG_DONE: Int = 0x3

public const val NLMSG_OVERRUN: Int = 0x4

public const val NLMSG_MIN_TYPE: Int = 0x10
