package io.github.kotlinmania.libc.unix.linuxlike.linux.arch.powerpc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RlimitResourceT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT

// arch/powerpc/include/uapi/asm/socket.h
public val SOL_SOCKET: CInt = 1

// Defined in unix/linuxLike/mod.rs
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

public val SO_REUSEPORT: CInt = 15

// powerpc only differs in these
public val SO_RCVLOWAT: CInt = 16

public val SO_SNDLOWAT: CInt = 17

// Ioctl Constants
// RLIMIT Constants
public val SO_RCVTIMEO_NEW: CInt = 66

public val SO_SNDTIMEO_NEW: CInt = 67

public val SO_RCVTIMEO: CInt = SO_RCVTIMEO_NEW

public val SO_SNDTIMEO: CInt = SO_SNDTIMEO_NEW

public val SO_RCVTIMEO_OLD: CInt = 18

public val SO_SNDTIMEO_OLD: CInt = 19

public val SO_RCVTIMEO1: CInt = SO_RCVTIMEO_OLD

public val SO_SNDTIMEO1: CInt = SO_SNDTIMEO_OLD

public val SO_PASSCRED: CInt = 20

public val SO_PEERCRED: CInt = 21

// end
public val SO_SECURITY_AUTHENTICATION: CInt = 22

public val SO_SECURITY_ENCRYPTION_TRANSPORT: CInt = 23

public val SO_SECURITY_ENCRYPTION_NETWORK: CInt = 24

public val SO_BINDTODEVICE: CInt = 25

public val SO_ATTACH_FILTER: CInt = 26

public val SO_DETACH_FILTER: CInt = 27

public val SO_GET_FILTER: CInt = SO_ATTACH_FILTER

public val SO_PEERNAME: CInt = 28

public val SO_TIMESTAMP_NEW: CInt = 63

public val SO_TIMESTAMPNS_NEW: CInt = 64

public val SO_TIMESTAMPING_NEW: CInt = 65

public val SO_TIMESTAMP: CInt = SO_TIMESTAMP_NEW

public val SO_TIMESTAMPNS: CInt = SO_TIMESTAMPNS_NEW

public val SO_TIMESTAMPING: CInt = SO_TIMESTAMPING_NEW

public val SO_TIMESTAMP_OLD: CInt = 29

public val SO_TIMESTAMPNS_OLD: CInt = 35

public val SO_TIMESTAMPING_OLD: CInt = 37

public val SO_TIMESTAMP1: CInt = SO_TIMESTAMP_OLD

public val SO_TIMESTAMPNS1: CInt = SO_TIMESTAMPNS_OLD

public val SO_TIMESTAMPING1: CInt = SO_TIMESTAMPING_OLD

public val SO_ACCEPTCONN: CInt = 30

public val SO_PEERSEC: CInt = 31

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_PASSSEC: CInt = 34

public val SO_MARK: CInt = 36

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RXQ_OVFL: CInt = 40

public val SO_WIFI_STATUS: CInt = 41

public val SCM_WIFI_STATUS: CInt = SO_WIFI_STATUS

public val SO_PEEK_OFF: CInt = 42

public val SO_NOFCS: CInt = 43

public val SO_LOCK_FILTER: CInt = 44

public val SO_SELECT_ERR_QUEUE: CInt = 45

public val SO_BUSY_POLL: CInt = 46

public val SO_MAX_PACING_RATE: CInt = 47

public val SO_BPF_EXTENSIONS: CInt = 48

public val SO_INCOMING_CPU: CInt = 49

public val SO_ATTACH_BPF: CInt = 50

public val SO_DETACH_BPF: CInt = SO_DETACH_FILTER

public val SO_ATTACH_REUSEPORT_CBPF: CInt = 51

public val SO_ATTACH_REUSEPORT_EBPF: CInt = 52

public val SO_CNX_ADVICE: CInt = 53

public val SCM_TIMESTAMPING_OPT_STATS: CInt = 54

public val SO_MEMINFO: CInt = 55

public val SO_INCOMING_NAPI_ID: CInt = 56

public val SO_COOKIE: CInt = 57

public val SCM_TIMESTAMPING_PKTINFO: CInt = 58

public val SO_PEERGROUPS: CInt = 59

public val SO_ZEROCOPY: CInt = 60

public val SO_TXTIME: CInt = 61

public val SCM_TXTIME: CInt = SO_TXTIME

public val SO_BINDTOIFINDEX: CInt = 62

// pub const SO_DETACH_REUSEPORT_BPF: cInt = 68;
public val SO_PREFER_BUSY_POLL: CInt = 69

public val SO_BUSY_POLL_BUDGET: CInt = 70

public val SO_NETNS_COOKIE: CInt = 71

public val SO_BUF_LOCK: CInt = 72

public val SO_RESERVE_MEM: CInt = 73

public val SO_TXREHASH: CInt = 74

public val SO_RCVMARK: CInt = 75

public val SO_PASSPIDFD: CInt = 76

public val SO_PEERPIDFD: CInt = 77

public val SO_DEVMEM_LINEAR: CInt = 78

public val SO_DEVMEM_DMABUF: CInt = 79

public val SO_DEVMEM_DONTNEED: CInt = 80

// Defined in unix/linuxLike/mod.rs
// pub const SCM_TIMESTAMP: cInt = SO_TIMESTAMP;
public val SCM_TIMESTAMPNS: CInt = SO_TIMESTAMPNS

public val SCM_TIMESTAMPING: CInt = SO_TIMESTAMPING

public val SCM_DEVMEM_LINEAR: CInt = SO_DEVMEM_LINEAR

public val SCM_DEVMEM_DMABUF: CInt = SO_DEVMEM_DMABUF

public val TCGETS: Ioctl = 0x403c7413uL

public val TCSETS: Ioctl = 0x803c7414uL

public val TCSETSW: Ioctl = 0x803c7415uL

public val TCSETSF: Ioctl = 0x803c7416uL

public val TCGETS1: Ioctl = 0x402c7413uL

public val TCSETS1: Ioctl = 0x802c7414uL

public val TCSETSW1: Ioctl = 0x802c7415uL

public val TCSETSF1: Ioctl = 0x802c7416uL

public val TCGETA: Ioctl = 0x40147417uL

public val TCSETA: Ioctl = 0x80147418uL

public val TCSETAW: Ioctl = 0x80147419uL

public val TCSETAF: Ioctl = 0x8014741CuL

public val TCSBRK: Ioctl = 0x2000741DuL

public val TCXONC: Ioctl = 0x2000741EuL

public val TCFLSH: Ioctl = 0x2000741FuL

public val TIOCEXCL: Ioctl = 0x540CuL

public val TIOCNXCL: Ioctl = 0x540DuL

public val TIOCSCTTY: Ioctl = 0x540EuL

public val TIOCGPGRP: Ioctl = 0x40047477uL

public val TIOCSPGRP: Ioctl = 0x80047476uL

public val TIOCOUTQ: Ioctl = 0x40047473uL

public val TIOCSTI: Ioctl = 0x5412uL

public val TIOCGWINSZ: Ioctl = 0x40087468uL

public val TIOCSWINSZ: Ioctl = 0x80087467uL

public val TIOCMGET: Ioctl = 0x5415uL

public val TIOCMBIS: Ioctl = 0x5416uL

public val TIOCMBIC: Ioctl = 0x5417uL

public val TIOCMSET: Ioctl = 0x5418uL

public val TIOCGSOFTCAR: Ioctl = 0x5419uL

public val TIOCSSOFTCAR: Ioctl = 0x541AuL

public val FIONREAD: Ioctl = 0x4004667FuL

public val TIOCINQ: Ioctl = FIONREAD

public val TIOCLINUX: Ioctl = 0x541CuL

public val TIOCCONS: Ioctl = 0x541DuL

public val TIOCGSERIAL: Ioctl = 0x541EuL

public val TIOCSSERIAL: Ioctl = 0x541FuL

public val TIOCPKT: Ioctl = 0x5420uL

public val FIONBIO: Ioctl = 0x8004667euL

public val TIOCNOTTY: Ioctl = 0x5422uL

public val TIOCSETD: Ioctl = 0x5423uL

public val TIOCGETD: Ioctl = 0x5424uL

public val TCSBRKP: Ioctl = 0x5425uL

public val TIOCSBRK: Ioctl = 0x5427uL

public val TIOCCBRK: Ioctl = 0x5428uL

public val TIOCGSID: Ioctl = 0x5429uL

public val TIOCGRS485: Ioctl = 0x542euL

public val TIOCSRS485: Ioctl = 0x542fuL

public val TIOCGPTN: Ioctl = 0x40045430uL

public val TIOCSPTLCK: Ioctl = 0x80045431uL

public val TIOCGDEV: Ioctl = 0x40045432uL

public val TIOCSIG: Ioctl = 0x80045436uL

public val TIOCVHANGUP: Ioctl = 0x5437uL

public val TIOCGPKT: Ioctl = 0x40045438uL

public val TIOCGPTLCK: Ioctl = 0x40045439uL

public val TIOCGEXCL: Ioctl = 0x40045440uL

public val TIOCGPTPEER: Ioctl = 0x20005441uL

// pub const TIOCGISO7816: Ioctl = 0x40285442;
// pub const TIOCSISO7816: Ioctl = 0xc0285443;
public val FIONCLEX: Ioctl = 0x20006602uL

public val FIOCLEX: Ioctl = 0x20006601uL

public val FIOASYNC: Ioctl = 0x8004667duL

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

public val BLKIOMIN: Ioctl = 0x20001278uL

public val BLKIOOPT: Ioctl = 0x20001279uL

public val BLKSSZGET: Ioctl = 0x20001268uL

public val BLKPBSZGET: Ioctl = 0x2000127BuL

// pub const FIOQSIZE: Ioctl = 0x40086680;
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

public val BOTHER: SpeedT = 31u

public val IBSHIFT: TcflagT = 16u

public val IUCLC: TcflagT = 4096u

public val XCASE: TcflagT = 16384u

public val RLIMIT_CPU: RlimitResourceT = 0u

public val RLIMIT_FSIZE: RlimitResourceT = 1u

public val RLIMIT_DATA: RlimitResourceT = 2u

public val RLIMIT_STACK: RlimitResourceT = 3u

public val RLIMIT_CORE: RlimitResourceT = 4u

public val RLIMIT_RSS: RlimitResourceT = 5u

public val RLIMIT_NPROC: RlimitResourceT = 6u

public val RLIMIT_NOFILE: RlimitResourceT = 7u

public val RLIMIT_MEMLOCK: RlimitResourceT = 8u

public val RLIMIT_AS: RlimitResourceT = 9u

public val RLIMIT_LOCKS: RlimitResourceT = 10u

public val RLIMIT_SIGPENDING: RlimitResourceT = 11u

public val RLIMIT_MSGQUEUE: RlimitResourceT = 12u

public val RLIMIT_NICE: RlimitResourceT = 13u

public val RLIMIT_RTPRIO: RlimitResourceT = 14u

public val RLIMIT_RTTIME: RlimitResourceT = 15u

public val RLIM_NLIMITS: RlimitResourceT = 16u

public val RLIMIT_NLIMITS: RlimitResourceT = RLIM_NLIMITS

public val RLIMIT_CPU1: CInt = 0

public val RLIMIT_FSIZE1: CInt = 1

public val RLIMIT_DATA1: CInt = 2

public val RLIMIT_STACK1: CInt = 3

public val RLIMIT_CORE1: CInt = 4

public val RLIMIT_RSS1: CInt = 5

public val RLIMIT_NPROC1: CInt = 6

public val RLIMIT_NOFILE1: CInt = 7

public val RLIMIT_MEMLOCK1: CInt = 8

public val RLIMIT_AS1: CInt = 9

public val RLIMIT_LOCKS1: CInt = 10

public val RLIMIT_SIGPENDING1: CInt = 11

public val RLIMIT_MSGQUEUE1: CInt = 12

public val RLIMIT_NICE1: CInt = 13

public val RLIMIT_RTPRIO1: CInt = 14

public val RLIMIT_RTTIME1: CInt = 15

public val RLIM_NLIMITS1: CInt = 16

public val RLIMIT_NLIMITS1: CInt = RLIM_NLIMITS

public val RLIM_INFINITY: RlimT = 0uL.inv()
