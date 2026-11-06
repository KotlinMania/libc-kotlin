package io.github.kotlinmania.libc.unix.linux_like.l4re

public typealias L4UmwordT = CUlong

// Unsigned machine word.
public typealias PthreadT = COpaquePointer?

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias PthreadKeyT = CUint

public typealias PthreadOnceT = CInt

public typealias PthreadSpinlockT = CInt

// L4Re requires a min stack size of 64k; that isn't defined in uClibc, but
// somewhere in the core libraries. uClibc wants 16k, but that's not enough.
public val PTHREAD_STACK_MIN: Int = 65536

public val BOTHER: SpeedT = 4096

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

public val TCGETS: Ioctl = 0x5401

public val TCSETS: Ioctl = 0x5402

public val TCSETSW: Ioctl = 0x5403

public val TCSETSF: Ioctl = 0x5404

public val TCGETA: Ioctl = 0x5405

public val TCSETA: Ioctl = 0x5406

public val TCSETAW: Ioctl = 0x5407

public val TCSETAF: Ioctl = 0x5408

public val TCSBRK: Ioctl = 0x5409

public val TCXONC: Ioctl = 0x540A

public val TCFLSH: Ioctl = 0x540B

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

public val TIOCEXCL: Ioctl = 0x540C

public val TIOCNXCL: Ioctl = 0x540D

public val TIOCSCTTY: Ioctl = 0x540E

public val TIOCGPGRP: Ioctl = 0x540F

public val TIOCSPGRP: Ioctl = 0x5410

public val TIOCOUTQ: Ioctl = 0x5411

public val TIOCSTI: Ioctl = 0x5412

public val TIOCGWINSZ: Ioctl = 0x5413

public val TIOCSWINSZ: Ioctl = 0x5414

public val TIOCMGET: Ioctl = 0x5415

public val TIOCMBIS: Ioctl = 0x5416

public val TIOCMBIC: Ioctl = 0x5417

public val TIOCMSET: Ioctl = 0x5418

public val TIOCGSOFTCAR: Ioctl = 0x5419

public val TIOCSSOFTCAR: Ioctl = 0x541A

public val FIONREAD: Ioctl = 0x541B

public val TIOCINQ: Ioctl = FIONREAD

public val TIOCLINUX: Ioctl = 0x541C

public val TIOCCONS: Ioctl = 0x541D

public val TIOCGSERIAL: Ioctl = 0x541E

public val TIOCSSERIAL: Ioctl = 0x541F

public val TIOCPKT: Ioctl = 0x5420

public val FIONBIO: Ioctl = 0x5421

public val TIOCNOTTY: Ioctl = 0x5422

public val TIOCSETD: Ioctl = 0x5423

public val TIOCGETD: Ioctl = 0x5424

public val TCSBRKP: Ioctl = 0x5425

public val TIOCSBRK: Ioctl = 0x5427

public val TIOCCBRK: Ioctl = 0x5428

public val TIOCGSID: Ioctl = 0x5429

public val TIOCGPTN: Ioctl = 0x80045430

public val TIOCSPTLCK: Ioctl = 0x40045431

public val FIONCLEX: Ioctl = 0x5450

public val FIOCLEX: Ioctl = 0x5451

public val FIOASYNC: Ioctl = 0x5452

public val TIOCSERCONFIG: Ioctl = 0x5453

public val TIOCSERGWILD: Ioctl = 0x5454

public val TIOCSERSWILD: Ioctl = 0x5455

public val TIOCGLCKTRMIOS: Ioctl = 0x5456

public val TIOCSLCKTRMIOS: Ioctl = 0x5457

public val TIOCSERGSTRUCT: Ioctl = 0x5458

public val TIOCSERGETLSR: Ioctl = 0x5459

public val TIOCSERGETMULTI: Ioctl = 0x545A

public val TIOCSERSETMULTI: Ioctl = 0x545B

public val TIOCMIWAIT: Ioctl = 0x545C

public val TIOCGICOUNT: Ioctl = 0x545D

public val BLKSSZGET: Ioctl = 0x1268
