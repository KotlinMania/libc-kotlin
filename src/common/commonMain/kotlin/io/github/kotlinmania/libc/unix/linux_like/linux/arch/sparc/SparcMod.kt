package io.github.kotlinmania.libc.unix.linux_like.linux.arch.sparc

import Ioctl

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
public val TCGETS: Ioctl = 0x40245408

public val TCSETS: Ioctl = 0x80245409

public val TCSETSW: Ioctl = 0x8024540a

public val TCSETSF: Ioctl = 0x8024540b

public val TCGETA: Ioctl = 0x40125401

public val TCSETA: Ioctl = 0x80125402

public val TCSETAW: Ioctl = 0x80125403

public val TCSETAF: Ioctl = 0x80125404

public val TCSBRK: Ioctl = 0x20005405

public val TCXONC: Ioctl = 0x20005406

public val TCFLSH: Ioctl = 0x20005407

public val TIOCEXCL: Ioctl = 0x2000740d

public val TIOCNXCL: Ioctl = 0x2000740e

public val TIOCSCTTY: Ioctl = 0x20007484

public val TIOCGPGRP: Ioctl = 0x40047483

public val TIOCSPGRP: Ioctl = 0x80047482

public val TIOCOUTQ: Ioctl = 0x40047473

public val TIOCSTI: Ioctl = 0x80017472

public val TIOCGWINSZ: Ioctl = 0x40087468

public val TIOCSWINSZ: Ioctl = 0x80087467

public val TIOCMGET: Ioctl = 0x4004746a

public val TIOCMBIS: Ioctl = 0x8004746c

public val TIOCMBIC: Ioctl = 0x8004746b

public val TIOCMSET: Ioctl = 0x8004746d

public val TIOCGSOFTCAR: Ioctl = 0x40047464

public val TIOCSSOFTCAR: Ioctl = 0x80047465

public val FIONREAD: Ioctl = 0x4004667f

public val TIOCINQ: Ioctl = FIONREAD

public val TIOCLINUX: Ioctl = 0x541C

public val TIOCCONS: Ioctl = 0x20007424

public val TIOCGSERIAL: Ioctl = 0x541E

public val TIOCSSERIAL: Ioctl = 0x541F

public val TIOCPKT: Ioctl = 0x80047470

public val FIONBIO: Ioctl = 0x8004667e

public val TIOCNOTTY: Ioctl = 0x20007471

public val TIOCSETD: Ioctl = 0x80047401

public val TIOCGETD: Ioctl = 0x40047400

public val TCSBRKP: Ioctl = 0x5425

public val TIOCSBRK: Ioctl = 0x2000747b

public val TIOCCBRK: Ioctl = 0x2000747a

public val TIOCGSID: Ioctl = 0x40047485

public val TCGETS2: Ioctl = 0x402c540c

public val TCSETS2: Ioctl = 0x802c540d

public val TCSETSW2: Ioctl = 0x802c540e

public val TCSETSF2: Ioctl = 0x802c540f

public val TIOCGPTN: Ioctl = 0x40047486

public val TIOCSPTLCK: Ioctl = 0x80047487

public val TIOCGDEV: Ioctl = 0x40045432

public val TIOCSIG: Ioctl = 0x80047488

public val TIOCVHANGUP: Ioctl = 0x20005437

public val TIOCGPKT: Ioctl = 0x40045438

public val TIOCGPTLCK: Ioctl = 0x40045439

public val TIOCGEXCL: Ioctl = 0x40045440

public val TIOCGPTPEER: Ioctl = 0x20007489

public val FIONCLEX: Ioctl = 0x20006602

public val FIOCLEX: Ioctl = 0x20006601

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

public val TIOCSTART: Ioctl = 0x2000746e

public val TIOCSTOP: Ioctl = 0x2000746f

public val BLKIOMIN: Ioctl = 0x20001278

public val BLKIOOPT: Ioctl = 0x20001279

public val BLKSSZGET: Ioctl = 0x20001268

public val BLKPBSZGET: Ioctl = 0x2000127B

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

public val BOTHER: SpeedT = 0x1000

public val IBSHIFT: TcflagT = 16

public val IUCLC: TcflagT = 512

public val XCASE: TcflagT = 4

// RLIMIT Constants
public val RLIMIT_CPU: RlimitResourceT = 0

public val RLIMIT_FSIZE: RlimitResourceT = 1

public val RLIMIT_DATA: RlimitResourceT = 2

public val RLIMIT_STACK: RlimitResourceT = 3

public val RLIMIT_CORE: RlimitResourceT = 4

public val RLIMIT_RSS: RlimitResourceT = 5

public val RLIMIT_NOFILE: RlimitResourceT = 6

public val RLIMIT_NPROC: RlimitResourceT = 7

public val RLIMIT_MEMLOCK: RlimitResourceT = 8

public val RLIMIT_AS: RlimitResourceT = 9

public val RLIMIT_LOCKS: RlimitResourceT = 10

public val RLIMIT_SIGPENDING: RlimitResourceT = 11

public val RLIMIT_MSGQUEUE: RlimitResourceT = 12

public val RLIMIT_NICE: RlimitResourceT = 13

public val RLIMIT_RTPRIO: RlimitResourceT = 14

public val RLIMIT_RTTIME: RlimitResourceT = 15

public val RLIM_NLIMITS: RlimitResourceT = 16

public val RLIMIT_NLIMITS: RlimitResourceT = RLIM_NLIMITS
