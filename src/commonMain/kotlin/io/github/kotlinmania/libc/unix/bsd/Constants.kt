package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public const val LC_ALL: Int = 0

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MONETARY: Int = 3

public const val LC_NUMERIC: Int = 4

public const val LC_TIME: Int = 5

public const val LC_MESSAGES: Int = 6

public const val FIOCLEX: ULong = 0x20006601uL

public const val FIONCLEX: ULong = 0x20006602uL

public const val FIONREAD: ULong = 0x4004667fuL

public const val FIONBIO: ULong = 0x8004667euL

public const val FIOASYNC: ULong = 0x8004667duL

public const val FIOSETOWN: ULong = 0x8004667cuL

public const val FIOGETOWN: ULong = 0x4004667buL

public const val PATH_MAX: Int = 1024

public const val MAXPATHLEN: Int = PATH_MAX

public const val IOV_MAX: Int = 1024

public const val SA_ONSTACK: Int = 0x0001

public const val SA_SIGINFO: Int = 0x0040

public const val SA_RESTART: Int = 0x0002

public const val SA_RESETHAND: Int = 0x0004

public const val SA_NOCLDSTOP: Int = 0x0008

public const val SA_NODEFER: Int = 0x0010

public const val SA_NOCLDWAIT: Int = 0x0020

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 4

public const val SIGCHLD: Int = 20

public const val SIGBUS: Int = 10

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val SIGCONT: Int = 19

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGURG: Int = 16

public const val SIGIO: Int = 23

public const val SIGSYS: Int = 12

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGINFO: Int = 29

public const val SIG_SETMASK: Int = 3

public const val SIG_BLOCK: Int = 0x1

public const val SIG_UNBLOCK: Int = 0x2

public const val IP_TOS: Int = 3

public const val IP_MULTICAST_IF: Int = 9

public const val IP_MULTICAST_TTL: Int = 10

public const val IP_MULTICAST_LOOP: Int = 11

public const val IPV6_UNICAST_HOPS: Int = 4

public const val IPV6_MULTICAST_IF: Int = 9

public const val IPV6_MULTICAST_HOPS: Int = 10

public const val IPV6_MULTICAST_LOOP: Int = 11

public const val IPV6_V6ONLY: Int = 27

public const val IPV6_DONTFRAG: Int = 62

public val IPTOS_ECN_NOTECT: UByte = (0x00).toUByte()

public val IPTOS_ECN_MASK: UByte = (0x03).toUByte()

public val IPTOS_ECN_ECT1: UByte = (0x01).toUByte()

public val IPTOS_ECN_ECT0: UByte = (0x02).toUByte()

public val IPTOS_ECN_CE: UByte = (0x03).toUByte()

public const val ST_RDONLY: ULong = 1uL

public const val SCM_RIGHTS: Int = 0x01

public const val NCCS: ULong = 20uL

public const val O_ACCMODE: Int = 0x3

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 512

public const val O_TRUNC: Int = 1024

public const val O_EXCL: Int = 2048

public const val O_ASYNC: Int = 0x40

public const val O_SYNC: Int = 0x80

public const val O_NONBLOCK: Int = 0x4

public const val O_NOFOLLOW: Int = 0x100

public const val O_SHLOCK: Int = 0x10

public const val O_EXLOCK: Int = 0x20

public const val O_FSYNC: Int = O_SYNC

public const val O_NDELAY: Int = O_NONBLOCK

public const val F_GETOWN: Int = 5

public const val F_SETOWN: Int = 6

public const val F_RDLCK: Short = 1

public const val F_UNLCK: Short = 2

public const val F_WRLCK: Short = 3

public const val MNT_RDONLY: Int = 0x00000001

public const val MNT_SYNCHRONOUS: Int = 0x00000002

public const val MNT_NOEXEC: Int = 0x00000004

public const val MNT_NOSUID: Int = 0x00000008

public const val MNT_ASYNC: Int = 0x00000040

public const val MNT_EXPORTED: Int = 0x00000100

public const val MNT_UPDATE: Int = 0x00010000

public const val MNT_RELOAD: Int = 0x00040000

public const val MNT_FORCE: Int = 0x00080000

public const val Q_SYNC: Int = 0x600

public const val Q_QUOTAON: Int = 0x100

public const val Q_QUOTAOFF: Int = 0x200

public const val TCIOFF: Int = 3

public const val TCION: Int = 4

public const val TCOOFF: Int = 1

public const val TCOON: Int = 2

public const val TCIFLUSH: Int = 1

public const val TCOFLUSH: Int = 2

public const val TCIOFLUSH: Int = 3

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val VEOF: ULong = 0uL

public const val VEOL: ULong = 1uL

public const val VEOL2: ULong = 2uL

public const val VERASE: ULong = 3uL

public const val VWERASE: ULong = 4uL

public const val VKILL: ULong = 5uL

public const val VREPRINT: ULong = 6uL

public const val VINTR: ULong = 8uL

public const val VQUIT: ULong = 9uL

public const val VSUSP: ULong = 10uL

public const val VDSUSP: ULong = 11uL

public const val VSTART: ULong = 12uL

public const val VSTOP: ULong = 13uL

public const val VLNEXT: ULong = 14uL

public const val VDISCARD: ULong = 15uL

public const val VMIN: ULong = 16uL

public const val VTIME: ULong = 17uL

public const val VSTATUS: ULong = 18uL

public const val _POSIX_VDISABLE: UByte = 0xffu

public const val IGNBRK: UInt = 0x00000001u

public const val BRKINT: UInt = 0x00000002u

public const val IGNPAR: UInt = 0x00000004u

public const val PARMRK: UInt = 0x00000008u

public const val INPCK: UInt = 0x00000010u

public const val ISTRIP: UInt = 0x00000020u

public const val INLCR: UInt = 0x00000040u

public const val IGNCR: UInt = 0x00000080u

public const val ICRNL: UInt = 0x00000100u

public const val IXON: UInt = 0x00000200u

public const val IXOFF: UInt = 0x00000400u

public const val IXANY: UInt = 0x00000800u

public const val IMAXBEL: UInt = 0x00002000u

public const val OPOST: UInt = 0x1u

public const val ONLCR: UInt = 0x2u

public const val OXTABS: UInt = 0x4u

public const val ONOEOT: UInt = 0x8u

public const val CIGNORE: UInt = 0x00000001u

public const val CSIZE: UInt = 0x00000300u

public const val CS5: UInt = 0x00000000u

public const val CS6: UInt = 0x00000100u

public const val CS7: UInt = 0x00000200u

public const val CS8: UInt = 0x00000300u

public const val CSTOPB: UInt = 0x00000400u

public const val CREAD: UInt = 0x00000800u

public const val PARENB: UInt = 0x00001000u

public const val PARODD: UInt = 0x00002000u

public const val HUPCL: UInt = 0x00004000u

public const val CLOCAL: UInt = 0x00008000u

public const val ECHOKE: UInt = 0x00000001u

public const val ECHOE: UInt = 0x00000002u

public const val ECHOK: UInt = 0x00000004u

public const val ECHO: UInt = 0x00000008u

public const val ECHONL: UInt = 0x00000010u

public const val ECHOPRT: UInt = 0x00000020u

public const val ECHOCTL: UInt = 0x00000040u

public const val ISIG: UInt = 0x00000080u

public const val ICANON: UInt = 0x00000100u

public const val ALTWERASE: UInt = 0x00000200u

public const val IEXTEN: UInt = 0x00000400u

public const val EXTPROC: UInt = 0x00000800u

public const val TOSTOP: UInt = 0x00400000u

public const val FLUSHO: UInt = 0x00800000u

public const val NOKERNINFO: UInt = 0x02000000u

public const val PENDIN: UInt = 0x20000000u

public const val NOFLSH: UInt = 0x80000000u

public const val MDMBUF: UInt = 0x00100000u

public const val WNOHANG: Int = 0x00000001

public const val WUNTRACED: Int = 0x00000002

public const val RTLD_LAZY: Int = 0x1

public const val RTLD_NOW: Int = 0x2

public val LOG_CRON: Int = 9 shl 3

public val LOG_AUTHPRIV: Int = 10 shl 3

public val LOG_FTP: Int = 11 shl 3

public const val LOG_PERROR: Int = 0x20

public const val TCP_NODELAY: Int = 1

public const val TCP_MAXSEG: Int = 2

public const val PIPE_BUF: ULong = 512uL

public const val BUS_ADRALN: Int = 1

public const val BUS_ADRERR: Int = 2

public const val BUS_OBJERR: Int = 3

public const val CLD_EXITED: Int = 1

public const val CLD_KILLED: Int = 2

public const val CLD_DUMPED: Int = 3

public const val CLD_TRAPPED: Int = 4

public const val CLD_STOPPED: Int = 5

public const val CLD_CONTINUED: Int = 6

public const val POLLIN: Short = 0x1

public const val POLLPRI: Short = 0x2

public const val POLLOUT: Short = 0x4

public const val POLLERR: Short = 0x8

public const val POLLHUP: Short = 0x10

public const val POLLNVAL: Short = 0x20

public const val POLLRDNORM: Short = 0x040

public const val POLLWRNORM: Short = 0x004

public const val POLLRDBAND: Short = 0x080

public const val POLLWRBAND: Short = 0x100

public const val BIOCGBLEN: ULong = 0x40044266uL

public const val BIOCSBLEN: ULong = 0xc0044266uL

public const val BIOCFLUSH: UInt = 0x20004268u

public const val BIOCPROMISC: UInt = 0x20004269u

public const val BIOCGDLT: ULong = 0x4004426auL

public const val BIOCGETIF: ULong = 0x4020426buL

public const val BIOCSETIF: ULong = 0x8020426cuL

public const val BIOCGSTATS: ULong = 0x4008426fuL

public const val BIOCIMMEDIATE: ULong = 0x80044270uL

public const val BIOCVERSION: ULong = 0x40044271uL

public const val BIOCGHDRCMPLT: ULong = 0x40044274uL

public const val BIOCSHDRCMPLT: ULong = 0x80044275uL

public const val SIOCGIFADDR: ULong = 0xc0206921uL

public const val REG_BASIC: Int = 0

public const val REG_EXTENDED: Int = 1

public const val REG_ICASE: Int = 2

public const val REG_NOSUB: Int = 4

public const val REG_NEWLINE: Int = 8

public const val REG_NOSPEC: Int = 16

public const val REG_PEND: Int = 32

public const val REG_DUMP: Int = 128

public const val REG_NOMATCH: Int = 1

public const val REG_BADPAT: Int = 2

public const val REG_ECOLLATE: Int = 3

public const val REG_ECTYPE: Int = 4

public const val REG_EESCAPE: Int = 5

public const val REG_ESUBREG: Int = 6

public const val REG_EBRACK: Int = 7

public const val REG_EPAREN: Int = 8

public const val REG_EBRACE: Int = 9

public const val REG_BADBR: Int = 10

public const val REG_ERANGE: Int = 11

public const val REG_ESPACE: Int = 12

public const val REG_BADRPT: Int = 13

public const val REG_EMPTY: Int = 14

public const val REG_ASSERT: Int = 15

public const val REG_INVARG: Int = 16

public const val REG_ATOI: Int = 255

public const val REG_ITOA: Int = 256

public const val REG_NOTBOL: Int = 1

public const val REG_NOTEOL: Int = 2

public const val REG_STARTEND: Int = 4

public const val REG_TRACE: Int = 256

public const val REG_LARGE: Int = 512

public const val REG_BACKR: Int = 1024

public const val TIOCCBRK: UInt = 0x2000747au

public const val TIOCSBRK: UInt = 0x2000747bu

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val ITIMER_REAL: Int = 0

public const val ITIMER_VIRTUAL: Int = 1

public const val ITIMER_PROF: Int = 2

public const val RTF_UP: Int = 0x1

public const val RTF_GATEWAY: Int = 0x2

public const val RTF_HOST: Int = 0x4

public const val RTF_REJECT: Int = 0x8

public const val RTF_DYNAMIC: Int = 0x10

public const val RTF_MODIFIED: Int = 0x20

public const val RTF_DONE: Int = 0x40

public const val RTF_STATIC: Int = 0x800

public const val RTF_BLACKHOLE: Int = 0x1000

public const val RTF_PROTO2: Int = 0x4000

public const val RTF_PROTO1: Int = 0x8000

public const val RTM_ADD: Int = 0x1

public const val RTM_DELETE: Int = 0x2

public const val RTM_CHANGE: Int = 0x3

public const val RTM_GET: Int = 0x4

public const val RTM_LOSING: Int = 0x5

public const val RTM_REDIRECT: Int = 0x6

public const val RTM_MISS: Int = 0x7

public const val RTA_DST: Int = 0x1

public const val RTA_GATEWAY: Int = 0x2

public const val RTA_NETMASK: Int = 0x4

public const val RTA_GENMASK: Int = 0x8

public const val RTA_IFP: Int = 0x10

public const val RTA_IFA: Int = 0x20

public const val RTA_AUTHOR: Int = 0x40

public const val RTA_BRD: Int = 0x80

public const val RTAX_DST: Int = 0

public const val RTAX_GATEWAY: Int = 1

public const val RTAX_NETMASK: Int = 2

public const val RTAX_GENMASK: Int = 3

public const val RTAX_IFP: Int = 4

public const val RTAX_IFA: Int = 5

public const val RTAX_AUTHOR: Int = 6

public const val RTAX_BRD: Int = 7
