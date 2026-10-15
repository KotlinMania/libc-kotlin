// port-lint: source unix/linux_like/linux/arch/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.arch.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic.SO_RCVTIMEO_NEW
import io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic.SO_SNDTIMEO_NEW
import io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic.SO_TIMESTAMPING_NEW
import io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic.SO_TIMESTAMPNS_NEW
import io.github.kotlinmania.libc.unix.linuxlike.linux.arch.generic.SO_TIMESTAMP_NEW

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 0x0001

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_TYPE: Int = 0x1008

public const val SO_STYLE: Int = SO_TYPE

public const val SO_ERROR: Int = 0x1007

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = SO_SNDTIMEO_NEW

public const val SO_RCVTIMEO: Int = SO_RCVTIMEO_NEW

public const val SO_ACCEPTCONN: Int = 0x1009

public const val SO_PROTOCOL: Int = 0x1028

public const val SO_DOMAIN: Int = 0x1029

public const val SO_NO_CHECK: Int = 11

public const val SO_PRIORITY: Int = 12

public const val SO_BSDCOMPAT: Int = 14

public const val SO_PASSCRED: Int = 17

public const val SO_PEERCRED: Int = 18

public const val SO_SECURITY_AUTHENTICATION: Int = 22

public const val SO_SECURITY_ENCRYPTION_TRANSPORT: Int = 23

public const val SO_SECURITY_ENCRYPTION_NETWORK: Int = 24

public const val SO_BINDTODEVICE: Int = 25

public const val SO_ATTACH_FILTER: Int = 26

public const val SO_DETACH_FILTER: Int = 27

public const val SO_GET_FILTER: Int = SO_ATTACH_FILTER

public const val SO_PEERNAME: Int = 28

public const val SO_PEERSEC: Int = 30

public const val SO_SNDBUFFORCE: Int = 31

public const val SO_RCVBUFFORCE: Int = 33

public const val SO_PASSSEC: Int = 34

public const val SO_MARK: Int = 36

public const val SO_RXQ_OVFL: Int = 40

public const val SO_WIFI_STATUS: Int = 41

public const val SCM_WIFI_STATUS: Int = SO_WIFI_STATUS

public const val SO_PEEK_OFF: Int = 42

public const val SO_NOFCS: Int = 43

public const val SO_LOCK_FILTER: Int = 44

public const val SO_SELECT_ERR_QUEUE: Int = 45

public const val SO_BUSY_POLL: Int = 46

public const val SO_MAX_PACING_RATE: Int = 47

public const val SO_BPF_EXTENSIONS: Int = 48

public const val SO_INCOMING_CPU: Int = 49

public const val SO_ATTACH_BPF: Int = 50

public const val SO_DETACH_BPF: Int = SO_DETACH_FILTER

public const val SO_ATTACH_REUSEPORT_CBPF: Int = 51

public const val SO_ATTACH_REUSEPORT_EBPF: Int = 52

public const val SO_CNX_ADVICE: Int = 53

public const val SCM_TIMESTAMPING_OPT_STATS: Int = 54

public const val SO_MEMINFO: Int = 55

public const val SO_INCOMING_NAPI_ID: Int = 56

public const val SO_COOKIE: Int = 57

public const val SCM_TIMESTAMPING_PKTINFO: Int = 58

public const val SO_PEERGROUPS: Int = 59

public const val SO_ZEROCOPY: Int = 60

public const val SO_TXTIME: Int = 61

public const val SCM_TXTIME: Int = SO_TXTIME

public const val SO_BINDTOIFINDEX: Int = 62

public const val SO_TIMESTAMP: Int = SO_TIMESTAMP_NEW

public const val SO_TIMESTAMPNS: Int = SO_TIMESTAMPNS_NEW

public const val SO_TIMESTAMPING: Int = SO_TIMESTAMPING_NEW

public const val SO_DETACH_REUSEPORT_BPF: Int = 68

public const val SO_PREFER_BUSY_POLL: Int = 69

public const val SO_BUSY_POLL_BUDGET: Int = 70

public const val SO_NETNS_COOKIE: Int = 71

public const val SO_BUF_LOCK: Int = 72

public const val SO_RESERVE_MEM: Int = 73

public const val SO_TXREHASH: Int = 74

public const val SO_RCVMARK: Int = 75

public const val SO_PASSPIDFD: Int = 76

public const val SO_PEERPIDFD: Int = 77

public const val SO_DEVMEM_LINEAR: Int = 78

public const val SO_DEVMEM_DMABUF: Int = 79

public const val SO_DEVMEM_DONTNEED: Int = 80

public const val SCM_TIMESTAMP: Int = SO_TIMESTAMP

public const val SCM_TIMESTAMPNS: Int = SO_TIMESTAMPNS

public const val SCM_TIMESTAMPING: Int = SO_TIMESTAMPING

public const val SCM_DEVMEM_LINEAR: Int = SO_DEVMEM_LINEAR

public const val SCM_DEVMEM_DMABUF: Int = SO_DEVMEM_DMABUF

public const val TCGETS: Int = 0x540d.toInt()

public const val TCSETS: Int = 0x540e.toInt()

public const val TCSETSW: Int = 0x540f.toInt()

public const val TCSETSF: Int = 0x5410.toInt()

public const val TCGETA: Int = 0x5401.toInt()

public const val TCSETA: Int = 0x5402.toInt()

public const val TCSETAW: Int = 0x5403.toInt()

public const val TCSETAF: Int = 0x5404.toInt()

public const val TCSBRK: Int = 0x5405.toInt()

public const val TCXONC: Int = 0x5406.toInt()

public const val TCFLSH: Int = 0x5407.toInt()

public const val TIOCEXCL: Int = 0x740d.toInt()

public const val TIOCNXCL: Int = 0x740e.toInt()

public const val TIOCSCTTY: Int = 0x5480.toInt()

public const val TIOCGPGRP: Int = 0x40047477.toInt()

public const val TIOCSPGRP: Int = 0x80047476.toInt()

public const val TIOCOUTQ: Int = 0x7472.toInt()

public const val TIOCSTI: Int = 0x5472.toInt()

public const val TIOCGWINSZ: Int = 0x40087468.toInt()

public const val TIOCSWINSZ: Int = 0x80087467.toInt()

public const val TIOCMGET: Int = 0x741d.toInt()

public const val TIOCMBIS: Int = 0x741b.toInt()

public const val TIOCMBIC: Int = 0x741c.toInt()

public const val TIOCMSET: Int = 0x741a.toInt()

public const val TIOCGSOFTCAR: Int = 0x5481.toInt()

public const val TIOCSSOFTCAR: Int = 0x5482.toInt()

public const val FIONREAD: Int = 0x467f.toInt()

public const val TIOCINQ: Int = FIONREAD

public const val TIOCLINUX: Int = 0x5483.toInt()

public const val TIOCCONS: Int = 0x80047478.toInt()

public const val TIOCGSERIAL: Int = 0x5484.toInt()

public const val TIOCSSERIAL: Int = 0x5485.toInt()

public const val TIOCPKT: Int = 0x5470.toInt()

public const val FIONBIO: Int = 0x667e.toInt()

public const val TIOCNOTTY: Int = 0x5471.toInt()

public const val TIOCSETD: Int = 0x7401.toInt()

public const val TIOCGETD: Int = 0x7400.toInt()

public const val TCSBRKP: Int = 0x5486.toInt()

public const val TIOCSBRK: Int = 0x5427.toInt()

public const val TIOCCBRK: Int = 0x5428.toInt()

public const val TIOCGSID: Int = 0x7416.toInt()

public const val TCGETS2: Int = 0x4030542a.toInt()

public const val TCSETS2: Int = 0x8030542b.toInt()

public const val TCSETSW2: Int = 0x8030542c.toInt()

public const val TCSETSF2: Int = 0x8030542d.toInt()

public const val TIOCGPTN: Int = 0x40045430.toInt()

public const val TIOCSPTLCK: Int = 0x80045431.toInt()

public const val TIOCGDEV: Int = 0x40045432.toInt()

public const val TIOCSIG: Int = 0x80045436.toInt()

public const val TIOCVHANGUP: Int = 0x5437.toInt()

public const val TIOCGPKT: Int = 0x40045438.toInt()

public const val TIOCGPTLCK: Int = 0x40045439.toInt()

public const val TIOCGEXCL: Int = 0x40045440.toInt()

public const val TIOCGPTPEER: Int = 0x20005441.toInt()

public const val TIOCGISO7816: Int = 0x40285442.toInt()

public const val TIOCSISO7816: Int = 0xc0285443.toInt()

public const val FIONCLEX: Int = 0x6602.toInt()

public const val FIOCLEX: Int = 0x6601.toInt()

public const val FIOASYNC: Int = 0x667d.toInt()

public const val TIOCSERCONFIG: Int = 0x5488.toInt()

public const val TIOCSERGWILD: Int = 0x5489.toInt()

public const val TIOCSERSWILD: Int = 0x548a.toInt()

public const val TIOCGLCKTRMIOS: Int = 0x548b.toInt()

public const val TIOCSLCKTRMIOS: Int = 0x548c.toInt()

public const val TIOCSERGSTRUCT: Int = 0x548d.toInt()

public const val TIOCSERGETLSR: Int = 0x548e.toInt()

public const val TIOCSERGETMULTI: Int = 0x548f.toInt()

public const val TIOCSERSETMULTI: Int = 0x5490.toInt()

public const val TIOCMIWAIT: Int = 0x5491.toInt()

public const val TIOCGICOUNT: Int = 0x5492.toInt()

public const val FIOQSIZE: Int = 0x667f.toInt()

public const val TIOCSLTC: Int = 0x7475.toInt()

public const val TIOCGETP: Int = 0x7408.toInt()

public const val TIOCSETP: Int = 0x7409.toInt()

public const val TIOCSETN: Int = 0x740a.toInt()

public const val BLKIOMIN: Int = 0x20001278.toInt()

public const val BLKIOOPT: Int = 0x20001279.toInt()

public const val BLKSSZGET: Int = 0x20001268.toInt()

public const val BLKPBSZGET: Int = 0x2000127B.toInt()

public const val TIOCGRS485: Int = 0x4020542e.toInt()

public const val TIOCSRS485: Int = 0xc020542f.toInt()

public const val TIOCM_LE: Int = 0x001

public const val TIOCM_DTR: Int = 0x002

public const val TIOCM_RTS: Int = 0x004

public const val TIOCM_ST: Int = 0x010

public const val TIOCM_SR: Int = 0x020

public const val TIOCM_CTS: Int = 0x040

public const val TIOCM_CAR: Int = 0x100

public const val TIOCM_CD: Int = TIOCM_CAR

public const val TIOCM_RNG: Int = 0x200

public const val TIOCM_RI: Int = TIOCM_RNG

public const val TIOCM_DSR: Int = 0x400

public const val BOTHER: UInt = 4096u

public const val IBSHIFT: UInt = 16u

public const val IUCLC: UInt = 512u

public const val XCASE: UInt = 4u

public const val RLIMIT_CPU: Int = 0.toInt()

public const val RLIMIT_FSIZE: Int = 1.toInt()

public const val RLIMIT_DATA: Int = 2.toInt()

public const val RLIMIT_STACK: Int = 3.toInt()

public const val RLIMIT_CORE: Int = 4.toInt()

public const val RLIMIT_NOFILE: Int = 5.toInt()

public const val RLIMIT_AS: Int = 6.toInt()

public const val RLIMIT_RSS: Int = 7.toInt()

public const val RLIMIT_NPROC: Int = 8.toInt()

public const val RLIMIT_MEMLOCK: Int = 9.toInt()

public const val RLIMIT_LOCKS: Int = 10.toInt()

public const val RLIMIT_SIGPENDING: Int = 11.toInt()

public const val RLIMIT_MSGQUEUE: Int = 12.toInt()

public const val RLIMIT_NICE: Int = 13.toInt()

public const val RLIMIT_RTPRIO: Int = 14.toInt()

public const val RLIMIT_RTTIME: Int = 15.toInt()

public const val RLIM_NLIMITS: Int = 16

public const val RLIMIT_NLIMITS: Int = RLIM_NLIMITS

public const val RLIM_INFINITY: ULong = 0xFFFFFFFFFFFFFFFFuL
