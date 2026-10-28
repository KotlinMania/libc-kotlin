package io.github.kotlinmania.libc.unix.linuxlike.linux.arch.sparc

import io.github.kotlinmania.libc.*

public const val SOL_SOCKET: Int = 0xffff

public const val SO_DEBUG: Int = 0x0001

public const val SO_PASSCRED: Int = 0x0002

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_PEERCRED: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_BSDCOMPAT: Int = 0x0400

public const val SO_RCVLOWAT: Int = 0x0800

public const val SO_SNDLOWAT: Int = 0x1000

public const val SO_RCVTIMEO: Int = 0x2000

public const val SO_SNDTIMEO: Int = 0x4000

public const val SO_RCVTIMEO_OLD: Int = 0x2000

public const val SO_SNDTIMEO_OLD: Int = 0x4000

public const val SO_ACCEPTCONN: Int = 0x8000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDBUFFORCE: Int = 0x100a

public const val SO_RCVBUFFORCE: Int = 0x100b

public const val SO_ERROR: Int = 0x1007

public const val SO_TYPE: Int = 0x1008

public const val SO_PROTOCOL: Int = 0x1028

public const val SO_DOMAIN: Int = 0x1029

public const val SO_NO_CHECK: Int = 0x000b

public const val SO_PRIORITY: Int = 0x000c

public const val SO_BINDTODEVICE: Int = 0x000d

public const val SO_ATTACH_FILTER: Int = 0x001a

public const val SO_DETACH_FILTER: Int = 0x001b

public const val SO_GET_FILTER: Int = SO_ATTACH_FILTER

public const val SO_PEERNAME: Int = 0x001c

public const val SO_PEERSEC: Int = 0x001e

public const val SO_PASSSEC: Int = 0x001f

public const val SO_MARK: Int = 0x0022

public const val SO_RXQ_OVFL: Int = 0x0024

public const val SO_WIFI_STATUS: Int = 0x0025

public const val SCM_WIFI_STATUS: Int = SO_WIFI_STATUS

public const val SO_PEEK_OFF: Int = 0x0026

public const val SO_NOFCS: Int = 0x0027

public const val SO_LOCK_FILTER: Int = 0x0028

public const val SO_SELECT_ERR_QUEUE: Int = 0x0029

public const val SO_BUSY_POLL: Int = 0x0030

public const val SO_MAX_PACING_RATE: Int = 0x0031

public const val SO_BPF_EXTENSIONS: Int = 0x0032

public const val SO_INCOMING_CPU: Int = 0x0033

public const val SO_ATTACH_BPF: Int = 0x0034

public const val SO_DETACH_BPF: Int = SO_DETACH_FILTER

public const val SO_ATTACH_REUSEPORT_CBPF: Int = 0x0035

public const val SO_ATTACH_REUSEPORT_EBPF: Int = 0x0036

public const val SO_CNX_ADVICE: Int = 0x0037

public const val SCM_TIMESTAMPING_OPT_STATS: Int = 0x0038

public const val SO_MEMINFO: Int = 0x0039

public const val SO_INCOMING_NAPI_ID: Int = 0x003a

public const val SO_COOKIE: Int = 0x003b

public const val SCM_TIMESTAMPING_PKTINFO: Int = 0x003c

public const val SO_PEERGROUPS: Int = 0x003d

public const val SO_ZEROCOPY: Int = 0x003e

public const val SO_TXTIME: Int = 0x003f

public const val SCM_TXTIME: Int = SO_TXTIME

public const val SO_BINDTOIFINDEX: Int = 0x0041

public const val SO_SECURITY_AUTHENTICATION: Int = 0x5001

public const val SO_SECURITY_ENCRYPTION_TRANSPORT: Int = 0x5002

public const val SO_SECURITY_ENCRYPTION_NETWORK: Int = 0x5004

public const val SO_TIMESTAMP: Int = 0x001d

public const val SO_TIMESTAMPNS: Int = 0x0021

public const val SO_TIMESTAMPING: Int = 0x0023

public const val SO_TIMESTAMP_OLD: Int = 0x001d

public const val SO_TIMESTAMPNS_OLD: Int = 0x0021

public const val SO_TIMESTAMPING_OLD: Int = 0x0023

public const val SO_TIMESTAMP_NEW: Int = 0x0046

public const val SO_TIMESTAMPNS_NEW: Int = 0x0042

public const val SO_TIMESTAMPING_NEW: Int = 0x0043

public const val SO_RCVTIMEO_NEW: Int = 0x0044

public const val SO_SNDTIMEO_NEW: Int = 0x0045

public const val SO_DETACH_REUSEPORT_BPF: Int = 0x0047

public const val SO_PREFER_BUSY_POLL: Int = 0x0048

public const val SO_BUSY_POLL_BUDGET: Int = 0x0049

public const val SO_NETNS_COOKIE: Int = 0x0050

public const val SO_BUF_LOCK: Int = 0x0051

public const val SO_RESERVE_MEM: Int = 0x0052

public const val SO_TXREHASH: Int = 0x0053

public const val SO_RCVMARK: Int = 0x0054

public const val SO_PASSPIDFD: Int = 0x0055

public const val SO_PEERPIDFD: Int = 0x0056

public const val SO_DEVMEM_LINEAR: Int = 0x0057

public const val SO_DEVMEM_DMABUF: Int = 0x0058

public const val SO_DEVMEM_DONTNEED: Int = 0x0059

public const val SCM_TIMESTAMP: Int = SO_TIMESTAMP

public const val SCM_TIMESTAMPNS: Int = SO_TIMESTAMPNS

public const val SCM_TIMESTAMPING: Int = SO_TIMESTAMPING

public const val SCM_DEVMEM_LINEAR: Int = SO_DEVMEM_LINEAR

public const val SCM_DEVMEM_DMABUF: Int = SO_DEVMEM_DMABUF

public const val TCGETS: Int = 0x40245408.toInt()

public const val TCSETS: Int = 0x80245409.toInt()

public const val TCSETSW: Int = 0x8024540a.toInt()

public const val TCSETSF: Int = 0x8024540b.toInt()

public const val TCGETA: Int = 0x40125401.toInt()

public const val TCSETA: Int = 0x80125402.toInt()

public const val TCSETAW: Int = 0x80125403.toInt()

public const val TCSETAF: Int = 0x80125404.toInt()

public const val TCSBRK: Int = 0x20005405.toInt()

public const val TCXONC: Int = 0x20005406.toInt()

public const val TCFLSH: Int = 0x20005407.toInt()

public const val TIOCEXCL: Int = 0x2000740d.toInt()

public const val TIOCNXCL: Int = 0x2000740e.toInt()

public const val TIOCSCTTY: Int = 0x20007484.toInt()

public const val TIOCGPGRP: Int = 0x40047483.toInt()

public const val TIOCSPGRP: Int = 0x80047482.toInt()

public const val TIOCOUTQ: Int = 0x40047473.toInt()

public const val TIOCSTI: Int = 0x80017472.toInt()

public const val TIOCGWINSZ: Int = 0x40087468.toInt()

public const val TIOCSWINSZ: Int = 0x80087467.toInt()

public const val TIOCMGET: Int = 0x4004746a.toInt()

public const val TIOCMBIS: Int = 0x8004746c.toInt()

public const val TIOCMBIC: Int = 0x8004746b.toInt()

public const val TIOCMSET: Int = 0x8004746d.toInt()

public const val TIOCGSOFTCAR: Int = 0x40047464.toInt()

public const val TIOCSSOFTCAR: Int = 0x80047465.toInt()

public const val FIONREAD: Int = 0x4004667f.toInt()

public const val TIOCINQ: Int = FIONREAD

public const val TIOCLINUX: Int = 0x541C.toInt()

public const val TIOCCONS: Int = 0x20007424.toInt()

public const val TIOCGSERIAL: Int = 0x541E.toInt()

public const val TIOCSSERIAL: Int = 0x541F.toInt()

public const val TIOCPKT: Int = 0x80047470.toInt()

public const val FIONBIO: Int = 0x8004667e.toInt()

public const val TIOCNOTTY: Int = 0x20007471.toInt()

public const val TIOCSETD: Int = 0x80047401.toInt()

public const val TIOCGETD: Int = 0x40047400.toInt()

public const val TCSBRKP: Int = 0x5425.toInt()

public const val TIOCSBRK: Int = 0x2000747b.toInt()

public const val TIOCCBRK: Int = 0x2000747a.toInt()

public const val TIOCGSID: Int = 0x40047485.toInt()

public const val TCGETS2: Int = 0x402c540c.toInt()

public const val TCSETS2: Int = 0x802c540d.toInt()

public const val TCSETSW2: Int = 0x802c540e.toInt()

public const val TCSETSF2: Int = 0x802c540f.toInt()

public const val TIOCGPTN: Int = 0x40047486.toInt()

public const val TIOCSPTLCK: Int = 0x80047487.toInt()

public const val TIOCGDEV: Int = 0x40045432.toInt()

public const val TIOCSIG: Int = 0x80047488.toInt()

public const val TIOCVHANGUP: Int = 0x20005437.toInt()

public const val TIOCGPKT: Int = 0x40045438.toInt()

public const val TIOCGPTLCK: Int = 0x40045439.toInt()

public const val TIOCGEXCL: Int = 0x40045440.toInt()

public const val TIOCGPTPEER: Int = 0x20007489.toInt()

public const val FIONCLEX: Int = 0x20006602.toInt()

public const val FIOCLEX: Int = 0x20006601.toInt()

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

public const val TIOCSTART: Int = 0x2000746e.toInt()

public const val TIOCSTOP: Int = 0x2000746f.toInt()

public const val BLKIOMIN: Int = 0x20001278.toInt()

public const val BLKIOOPT: Int = 0x20001279.toInt()

public const val BLKSSZGET: Int = 0x20001268.toInt()

public const val BLKPBSZGET: Int = 0x2000127B.toInt()

public const val FIOASYNC: Int = 0x4004667d.toInt()

public const val TIOCGISO7816: Int = 0x40285443.toInt()

public const val TIOCSISO7816: Int = 0xc0285444.toInt()

public const val TIOCGRS485: Int = 0x40205441.toInt()

public const val TIOCSRS485: Int = 0xc0205442.toInt()

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

public const val BOTHER: UInt = 0x1000u

public const val IBSHIFT: UInt = 16u

public const val IUCLC: UInt = 512u

public const val XCASE: UInt = 4u

public const val RLIMIT_CPU: Int = 0.toInt()

public const val RLIMIT_FSIZE: Int = 1.toInt()

public const val RLIMIT_DATA: Int = 2.toInt()

public const val RLIMIT_STACK: Int = 3.toInt()

public const val RLIMIT_CORE: Int = 4.toInt()

public const val RLIMIT_RSS: Int = 5.toInt()

public const val RLIMIT_NOFILE: Int = 6.toInt()

public const val RLIMIT_NPROC: Int = 7.toInt()

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

public const val RLIM_INFINITY: ULong = 0xFFFFFFFFFFFFFFFFuL
