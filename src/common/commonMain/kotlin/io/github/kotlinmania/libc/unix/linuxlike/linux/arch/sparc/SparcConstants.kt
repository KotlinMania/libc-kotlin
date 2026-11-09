package io.github.kotlinmania.libc.unix.linuxlike.linux.arch.sparc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.RlimitResourceT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.RlimT

// arch/sparc/include/uapi/asm/socket.h
public val SOL_SOCKET: CInt = 0xffff

// Defined in unix/linuxLike/mod.rs
// pub const SO_DEBUG: cInt = 0x0001;
public val SO_PASSCRED: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_PEERCRED: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_BSDCOMPAT: CInt = 0x0400

public val SO_RCVLOWAT: CInt = 0x0800

public val SO_SNDLOWAT: CInt = 0x1000

public val SO_RCVTIMEO: CInt = 0x2000

public val SO_SNDTIMEO: CInt = 0x4000

// pub const SO_RCVTIMEO_OLD: cInt = 0x2000;
// pub const SO_SNDTIMEO_OLD: cInt = 0x4000;
public val SO_ACCEPTCONN: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDBUFFORCE: CInt = 0x100a

public val SO_RCVBUFFORCE: CInt = 0x100b

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_PROTOCOL: CInt = 0x1028

public val SO_DOMAIN: CInt = 0x1029

public val SO_NO_CHECK: CInt = 0x000b

public val SO_PRIORITY: CInt = 0x000c

public val SO_BINDTODEVICE: CInt = 0x000d

public val SO_ATTACH_FILTER: CInt = 0x001a

public val SO_DETACH_FILTER: CInt = 0x001b

public val SO_GET_FILTER: CInt = SO_ATTACH_FILTER

public val SO_PEERNAME: CInt = 0x001c

public val SO_PEERSEC: CInt = 0x001e

public val SO_PASSSEC: CInt = 0x001f

public val SO_MARK: CInt = 0x0022

public val SO_RXQ_OVFL: CInt = 0x0024

public val SO_WIFI_STATUS: CInt = 0x0025

public val SCM_WIFI_STATUS: CInt = SO_WIFI_STATUS

public val SO_PEEK_OFF: CInt = 0x0026

public val SO_NOFCS: CInt = 0x0027

public val SO_LOCK_FILTER: CInt = 0x0028

public val SO_SELECT_ERR_QUEUE: CInt = 0x0029

public val SO_BUSY_POLL: CInt = 0x0030

public val SO_MAX_PACING_RATE: CInt = 0x0031

public val SO_BPF_EXTENSIONS: CInt = 0x0032

public val SO_INCOMING_CPU: CInt = 0x0033

public val SO_ATTACH_BPF: CInt = 0x0034

public val SO_DETACH_BPF: CInt = SO_DETACH_FILTER

public val SO_ATTACH_REUSEPORT_CBPF: CInt = 0x0035

public val SO_ATTACH_REUSEPORT_EBPF: CInt = 0x0036

public val SO_CNX_ADVICE: CInt = 0x0037

public val SCM_TIMESTAMPING_OPT_STATS: CInt = 0x0038

public val SO_MEMINFO: CInt = 0x0039

public val SO_INCOMING_NAPI_ID: CInt = 0x003a

public val SO_COOKIE: CInt = 0x003b

public val SCM_TIMESTAMPING_PKTINFO: CInt = 0x003c

public val SO_PEERGROUPS: CInt = 0x003d

public val SO_ZEROCOPY: CInt = 0x003e

public val SO_TXTIME: CInt = 0x003f

public val SCM_TXTIME: CInt = SO_TXTIME

public val SO_BINDTOIFINDEX: CInt = 0x0041

public val SO_SECURITY_AUTHENTICATION: CInt = 0x5001

public val SO_SECURITY_ENCRYPTION_TRANSPORT: CInt = 0x5002

public val SO_SECURITY_ENCRYPTION_NETWORK: CInt = 0x5004

public val SO_TIMESTAMP: CInt = 0x001d

public val SO_TIMESTAMPNS: CInt = 0x0021

public val SO_TIMESTAMPING: CInt = 0x0023

// pub const SO_TIMESTAMP_OLD: cInt = 0x001d;
// pub const SO_TIMESTAMPNS_OLD: cInt = 0x0021;
// pub const SO_TIMESTAMPING_OLD: cInt = 0x0023;
// pub const SO_TIMESTAMP_NEW: cInt = 0x0046;
// pub const SO_TIMESTAMPNS_NEW: cInt = 0x0042;
// pub const SO_TIMESTAMPING_NEW: cInt = 0x0043;
// pub const SO_RCVTIMEO_NEW: cInt = 0x0044;
// pub const SO_SNDTIMEO_NEW: cInt = 0x0045;
// pub const SO_DETACH_REUSEPORT_BPF: cInt = 0x0047;
public val SO_PREFER_BUSY_POLL: CInt = 0x0048

public val SO_BUSY_POLL_BUDGET: CInt = 0x0049

public val SO_NETNS_COOKIE: CInt = 0x0050

public val SO_BUF_LOCK: CInt = 0x0051

public val SO_RESERVE_MEM: CInt = 0x0052

public val SO_TXREHASH: CInt = 0x0053

public val SO_RCVMARK: CInt = 0x0054

public val SO_PASSPIDFD: CInt = 0x0055

public val SO_PEERPIDFD: CInt = 0x0056

public val SO_DEVMEM_LINEAR: CInt = 0x0057

public val SO_DEVMEM_DMABUF: CInt = 0x0058

public val SO_DEVMEM_DONTNEED: CInt = 0x0059

// Defined in unix/linuxLike/mod.rs
// pub const SCM_TIMESTAMP: cInt = SO_TIMESTAMP;
public val SCM_TIMESTAMPNS: CInt = SO_TIMESTAMPNS

public val SCM_TIMESTAMPING: CInt = SO_TIMESTAMPING

public val SCM_DEVMEM_LINEAR: CInt = SO_DEVMEM_LINEAR

public val SCM_DEVMEM_DMABUF: CInt = SO_DEVMEM_DMABUF

// Ioctl Constants
public val TCGETS: Ioctl = 0x40245408uL

public val TCSETS: Ioctl = 0x80245409uL

public val TCSETSW: Ioctl = 0x8024540auL

public val TCSETSF: Ioctl = 0x8024540buL

public val TCGETA: Ioctl = 0x40125401uL

public val TCSETA: Ioctl = 0x80125402uL

public val TCSETAW: Ioctl = 0x80125403uL

public val TCSETAF: Ioctl = 0x80125404uL

public val TCSBRK: Ioctl = 0x20005405uL

public val TCXONC: Ioctl = 0x20005406uL

public val TCFLSH: Ioctl = 0x20005407uL

public val TIOCEXCL: Ioctl = 0x2000740duL

public val TIOCNXCL: Ioctl = 0x2000740euL

public val TIOCSCTTY: Ioctl = 0x20007484uL

public val TIOCGPGRP: Ioctl = 0x40047483uL

public val TIOCSPGRP: Ioctl = 0x80047482uL

public val TIOCOUTQ: Ioctl = 0x40047473uL

public val TIOCSTI: Ioctl = 0x80017472uL

public val TIOCGWINSZ: Ioctl = 0x40087468uL

public val TIOCSWINSZ: Ioctl = 0x80087467uL

public val TIOCMGET: Ioctl = 0x4004746auL

public val TIOCMBIS: Ioctl = 0x8004746cuL

public val TIOCMBIC: Ioctl = 0x8004746buL

public val TIOCMSET: Ioctl = 0x8004746duL

public val TIOCGSOFTCAR: Ioctl = 0x40047464uL

public val TIOCSSOFTCAR: Ioctl = 0x80047465uL

public val FIONREAD: Ioctl = 0x4004667fuL

public val TIOCINQ: Ioctl = FIONREAD

public val TIOCLINUX: Ioctl = 0x541CuL

public val TIOCCONS: Ioctl = 0x20007424uL

public val TIOCGSERIAL: Ioctl = 0x541EuL

public val TIOCSSERIAL: Ioctl = 0x541FuL

public val TIOCPKT: Ioctl = 0x80047470uL

public val FIONBIO: Ioctl = 0x8004667euL

public val TIOCNOTTY: Ioctl = 0x20007471uL

public val TIOCSETD: Ioctl = 0x80047401uL

public val TIOCGETD: Ioctl = 0x40047400uL

public val TCSBRKP: Ioctl = 0x5425uL

public val TIOCSBRK: Ioctl = 0x2000747buL

public val TIOCCBRK: Ioctl = 0x2000747auL

public val TIOCGSID: Ioctl = 0x40047485uL

public val TCGETS2: Ioctl = 0x402c540cuL

public val TCSETS2: Ioctl = 0x802c540duL

public val TCSETSW2: Ioctl = 0x802c540euL

public val TCSETSF2: Ioctl = 0x802c540fuL

public val TIOCGPTN: Ioctl = 0x40047486uL

public val TIOCSPTLCK: Ioctl = 0x80047487uL

public val TIOCGDEV: Ioctl = 0x40045432uL

public val TIOCSIG: Ioctl = 0x80047488uL

public val TIOCVHANGUP: Ioctl = 0x20005437uL

public val TIOCGPKT: Ioctl = 0x40045438uL

public val TIOCGPTLCK: Ioctl = 0x40045439uL

public val TIOCGEXCL: Ioctl = 0x40045440uL

public val TIOCGPTPEER: Ioctl = 0x20007489uL

public val FIONCLEX: Ioctl = 0x20006602uL

public val FIOCLEX: Ioctl = 0x20006601uL

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

public val TIOCSTART: Ioctl = 0x2000746euL

public val TIOCSTOP: Ioctl = 0x2000746fuL

public val BLKIOMIN: Ioctl = 0x20001278uL

public val BLKIOOPT: Ioctl = 0x20001279uL

public val BLKSSZGET: Ioctl = 0x20001268uL

public val BLKPBSZGET: Ioctl = 0x2000127BuL

// pub const FIOASYNC: Ioctl = 0x4004667d;
// pub const FIOQSIZE: Ioctl = ;
// pub const TIOCGISO7816: Ioctl = 0x40285443;
// pub const TIOCSISO7816: Ioctl = 0xc0285444;
// pub const TIOCGRS485: Ioctl = 0x40205441;
// pub const TIOCSRS485: Ioctl = 0xc0205442;
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

public val BOTHER: SpeedT = 0x1000u

public val IBSHIFT: TcflagT = 16u

public val IUCLC: TcflagT = 512u

public val XCASE: TcflagT = 4u

// RLIMIT Constants
public val RLIMIT_CPU: RlimitResourceT = 0u

public val RLIMIT_FSIZE: RlimitResourceT = 1u

public val RLIMIT_DATA: RlimitResourceT = 2u

public val RLIMIT_STACK: RlimitResourceT = 3u

public val RLIMIT_CORE: RlimitResourceT = 4u

public val RLIMIT_RSS: RlimitResourceT = 5u

public val RLIMIT_NOFILE: RlimitResourceT = 6u

public val RLIMIT_NPROC: RlimitResourceT = 7u

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

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val RLIM_INFINITY1: RlimT = 0x7fffffffuL
