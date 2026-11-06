package io.github.kotlinmania.libc.unix.linux_like.linux.arch.generic

import Ioctl

// include/uapi/asm-generic/socket.h
// arch/alpha/include/uapi/asm/socket.h
// tools/include/uapi/asm-generic/socket.h
// arch/mips/include/uapi/asm/socket.h
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

public val SO_PASSCRED: CInt = 16

public val SO_PEERCRED: CInt = 17

public val SO_RCVLOWAT: CInt = 18

public val SO_SNDLOWAT: CInt = 19

public val SO_SECURITY_AUTHENTICATION: CInt = 22

public val SO_SECURITY_ENCRYPTION_TRANSPORT: CInt = 23

public val SO_SECURITY_ENCRYPTION_NETWORK: CInt = 24

public val SO_BINDTODEVICE: CInt = 25

public val SO_ATTACH_FILTER: CInt = 26

public val SO_DETACH_FILTER: CInt = 27

public val SO_GET_FILTER: CInt = SO_ATTACH_FILTER

public val SO_PEERNAME: CInt = 28

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

// Ioctl Constants
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

public val TCGETS2: Ioctl = 0x802c542a

public val TCSETS2: Ioctl = 0x402c542b

public val TCSETSW2: Ioctl = 0x402c542c

public val TCSETSF2: Ioctl = 0x402c542d

public val TIOCGRS485: Ioctl = 0x542E

public val TIOCSRS485: Ioctl = 0x542F

public val TIOCGPTN: Ioctl = 0x80045430

public val TIOCSPTLCK: Ioctl = 0x40045431

public val TIOCGDEV: Ioctl = 0x80045432

public val TCGETX: Ioctl = 0x5432

public val TCSETX: Ioctl = 0x5433

public val TCSETXF: Ioctl = 0x5434

public val TCSETXW: Ioctl = 0x5435

public val TIOCSIG: Ioctl = 0x40045436

public val TIOCVHANGUP: Ioctl = 0x5437

public val TIOCGPKT: Ioctl = 0x80045438

public val TIOCGPTLCK: Ioctl = 0x80045439

public val TIOCGEXCL: Ioctl = 0x80045440

public val TIOCGPTPEER: Ioctl = 0x5441

// pub const TIOCGISO7816: Ioctl = 0x80285442;
// pub const TIOCSISO7816: Ioctl = 0xc0285443;
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

public val BLKIOMIN: Ioctl = 0x1278

public val BLKIOOPT: Ioctl = 0x1279

public val BLKSSZGET: Ioctl = 0x1268

public val BLKPBSZGET: Ioctl = 0x127B

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

public val BOTHER: SpeedT = 4096

public val IBSHIFT: TcflagT = 16

public val IUCLC: TcflagT = 512

public val XCASE: TcflagT = 4

public val RLIM_INFINITY: RlimT = 0.inv()
