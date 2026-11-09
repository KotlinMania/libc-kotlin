package io.github.kotlinmania.libc.unix.linuxlike.l4re

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.RlimitResourceT

// L4Re requires a min stack size of 64k; that isn't defined in uClibc, but
// somewhere in the core libraries. uClibc wants 16k, but that's not enough.
public val PTHREAD_STACK_MIN: Int = 65536

public val BOTHER: SpeedT = 4096u

public val RLIMIT_CPU: RlimitResourceT = 0

public val RLIMIT_FSIZE: RlimitResourceT = 1

public val RLIMIT_DATA: RlimitResourceT = 2

public val RLIMIT_STACK: RlimitResourceT = 3

public val RLIMIT_CORE: RlimitResourceT = 4

public val RLIMIT_RSS: RlimitResourceT = 5

public val RLIMIT_NPROC: RlimitResourceT = 6

public val RLIMIT_NOFILE: RlimitResourceT = 7

public val RLIMIT_MEMLOCK: RlimitResourceT = 8

public val RLIMIT_AS: RlimitResourceT = 9

public val RLIMIT_LOCKS: RlimitResourceT = 10

public val RLIMIT_SIGPENDING: RlimitResourceT = 11

public val RLIMIT_MSGQUEUE: RlimitResourceT = 12

public val RLIMIT_NICE: RlimitResourceT = 13

public val RLIMIT_RTPRIO: RlimitResourceT = 14

public val RLIMIT_RTTIME: RlimitResourceT = 15

public val RLIMIT_NLIMITS: RlimitResourceT = RLIM_NLIMITS

public val RLIM_NLIMITS: RlimitResourceT = 16

public val SOL_SOCKET: CInt = 1

// pub const SO_DEBUG: cInt = 1;
public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_DONTROUTE: CInt = 5

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_OOBINLINE: CInt = 10

public val SO_NO_CHECK: CInt = 11

public val SO_PRIORITY: CInt = 12

public val SO_LINGER: CInt = 13

public val SO_BSDCOMPAT: CInt = 14

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_SECURITY_AUTHENTICATION: CInt = 22

public val SO_SECURITY_ENCRYPTION_TRANSPORT: CInt = 23

public val SO_SECURITY_ENCRYPTION_NETWORK: CInt = 24

public val SO_BINDTODEVICE: CInt = 25

public val SO_ATTACH_FILTER: CInt = 26

public val SO_DETACH_FILTER: CInt = 27

public val SO_PEERNAME: CInt = 28

public val SO_ACCEPTCONN: CInt = 30

public val SO_PEERSEC: CInt = 31

public val TCGETS: Ioctl = 0x5401uL

public val TCSETS: Ioctl = 0x5402uL

public val TCSETSW: Ioctl = 0x5403uL

public val TCSETSF: Ioctl = 0x5404uL

public val TCGETA: Ioctl = 0x5405uL

public val TCSETA: Ioctl = 0x5406uL

public val TCSETAW: Ioctl = 0x5407uL

public val TCSETAF: Ioctl = 0x5408uL

public val TCSBRK: Ioctl = 0x5409uL

public val TCXONC: Ioctl = 0x540AuL

public val TCFLSH: Ioctl = 0x540BuL

public val TIOCM_LE: CInt = 0x001

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_ST: CInt = 0x008

public val TIOCM_SR: CInt = 0x010

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_RI: CInt = TIOCM_RNG

public val TIOCM_DSR: CInt = 0x100

public val TIOCEXCL: Ioctl = 0x540CuL

public val TIOCNXCL: Ioctl = 0x540DuL

public val TIOCSCTTY: Ioctl = 0x540EuL

public val TIOCGPGRP: Ioctl = 0x540FuL

public val TIOCSPGRP: Ioctl = 0x5410uL

public val TIOCOUTQ: Ioctl = 0x5411uL

public val TIOCSTI: Ioctl = 0x5412uL

public val TIOCGWINSZ: Ioctl = 0x5413uL

public val TIOCSWINSZ: Ioctl = 0x5414uL

public val TIOCMGET: Ioctl = 0x5415uL

public val TIOCMBIS: Ioctl = 0x5416uL

public val TIOCMBIC: Ioctl = 0x5417uL

public val TIOCMSET: Ioctl = 0x5418uL

public val TIOCGSOFTCAR: Ioctl = 0x5419uL

public val TIOCSSOFTCAR: Ioctl = 0x541AuL

public val FIONREAD: Ioctl = 0x541BuL

public val TIOCINQ: Ioctl = FIONREAD

public val TIOCLINUX: Ioctl = 0x541CuL

public val TIOCCONS: Ioctl = 0x541DuL

public val TIOCGSERIAL: Ioctl = 0x541EuL

public val TIOCSSERIAL: Ioctl = 0x541FuL

public val TIOCPKT: Ioctl = 0x5420uL

public val FIONBIO: Ioctl = 0x5421uL

public val TIOCNOTTY: Ioctl = 0x5422uL

public val TIOCSETD: Ioctl = 0x5423uL

public val TIOCGETD: Ioctl = 0x5424uL

public val TCSBRKP: Ioctl = 0x5425uL

public val TIOCSBRK: Ioctl = 0x5427uL

public val TIOCCBRK: Ioctl = 0x5428uL

public val TIOCGSID: Ioctl = 0x5429uL

public val TIOCGPTN: Ioctl = 0x80045430uL

public val TIOCSPTLCK: Ioctl = 0x40045431uL

public val FIONCLEX: Ioctl = 0x5450uL

public val FIOCLEX: Ioctl = 0x5451uL

public val FIOASYNC: Ioctl = 0x5452uL

public val TIOCSERCONFIG: Ioctl = 0x5453uL

public val TIOCSERGWILD: Ioctl = 0x5454uL

public val TIOCSERSWILD: Ioctl = 0x5455uL

public val TIOCGLCKTRMIOS: Ioctl = 0x5456uL

public val TIOCSLCKTRMIOS: Ioctl = 0x5457uL

public val TIOCSERGSTRUCT: Ioctl = 0x5458uL

public val TIOCSERGETLSR: Ioctl = 0x5459uL

public val TIOCSERGETMULTI: Ioctl = 0x545AuL

public val TIOCSERSETMULTI: Ioctl = 0x545BuL

public val TIOCMIWAIT: Ioctl = 0x545CuL

public val TIOCGICOUNT: Ioctl = 0x545DuL

public val BLKSSZGET: Ioctl = 0x1268uL

public val NLMSG_NOOP: CInt = 0x1

public val NLMSG_ERROR: CInt = 0x2

public val NLMSG_DONE: CInt = 0x3

public val NLMSG_OVERRUN: CInt = 0x4

public val NLMSG_MIN_TYPE: CInt = 0x10
