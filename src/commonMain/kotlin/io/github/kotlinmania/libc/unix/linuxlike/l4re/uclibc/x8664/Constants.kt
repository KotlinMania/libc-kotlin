// port-lint: source unix/linux_like/l4re/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

public const val O_CLOEXEC: Int = 524288

public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 36uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL

public const val __SIZEOF_PTHREAD_COND_COMPAT_T: ULong = 12uL

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val NCCS: ULong = 32uL

public const val FIOQSIZE: Int = 0x5460.toInt()

public const val MAP_HUGETLB: Int = 0x040000

public const val B0: UInt = 0u

public const val B1000000: UInt = 0x1008u

public const val B110: UInt = 0x3u

public const val B115200: UInt = 0x1002u

public const val B1152000: UInt = 0x1009u

public const val B1200: UInt = 0x9u

public const val B134: UInt = 0x4u

public const val B150: UInt = 0x5u

public const val B1500000: UInt = 0x100au

public const val B1800: UInt = 0xau

public const val B19200: UInt = 0xeu

public const val B200: UInt = 0x6u

public const val B2000000: UInt = 0x100bu

public const val B230400: UInt = 0x1003u

public const val B2400: UInt = 0xbu

public const val B2500000: UInt = 0x100cu

public const val B300: UInt = 0x7u

public const val B3000000: UInt = 0x100du

public const val B3500000: UInt = 0x100eu

public const val B38400: UInt = 0xfu

public const val B4000000: UInt = 0x100fu

public const val B460800: UInt = 0x1004u

public const val B4800: UInt = 0xcu

public const val B50: UInt = 0x1u

public const val B500000: UInt = 0x1005u

public const val B57600: UInt = 0x1001u

public const val B576000: UInt = 0x1006u

public const val B600: UInt = 0x8u

public const val B75: UInt = 0x2u

public const val B921600: UInt = 0x1007u

public const val B9600: UInt = 0xdu

public const val BS1: Int = 0x2000

public const val BSDLY: Int = 0x2000

public const val CBAUD: UInt = 0x100fu

public const val CBAUDEX: UInt = 0x1000u

public const val CIBAUD: UInt = 0x100f0000u

public const val CLOCAL: UInt = 0x800u

public const val CPU_SETSIZE: Int = 0x400

public const val CR1: Int = 0x200

public const val CR2: Int = 0x400

public const val CR3: Int = 0x600

public const val CRDLY: Int = 0x600

public const val CREAD: UInt = 0x80u

public const val CS6: UInt = 0x10u

public const val CS7: UInt = 0x20u

public const val CS8: UInt = 0x30u

public const val CSIZE: UInt = 0x30u

public const val CSTOPB: UInt = 0x40u

public const val EADDRINUSE: Int = 0x62

public const val EADDRNOTAVAIL: Int = 0x63

public const val EADV: Int = 0x44

public const val EAFNOSUPPORT: Int = 0x61

public const val EALREADY: Int = 0x72

public const val EBADE: Int = 0x34

public const val EBADFD: Int = 0x4d

public const val EBADMSG: Int = 0x4a

public const val EBADR: Int = 0x35

public const val EBADRQC: Int = 0x38

public const val EBADSLT: Int = 0x39

public const val EBFONT: Int = 0x3b

public const val ECANCELED: Int = 0x7d

public const val ECHOCTL: UInt = 0x200u

public const val ECHOE: UInt = 0x10u

public const val ECHOK: UInt = 0x20u

public const val ECHOKE: UInt = 0x800u

public const val ECHONL: UInt = 0x40u

public const val ECHOPRT: UInt = 0x400u

public const val ECHRNG: Int = 0x2c

public const val ECOMM: Int = 0x46

public const val ECONNABORTED: Int = 0x67

public const val ECONNREFUSED: Int = 0x6f

public const val ECONNRESET: Int = 0x68

public const val EDESTADDRREQ: Int = 0x59

public const val EDOTDOT: Int = 0x49

public const val EDQUOT: Int = 0x7a

public const val EHOSTDOWN: Int = 0x70

public const val EHOSTUNREACH: Int = 0x71

public const val EIDRM: Int = 0x2b

public const val EILSEQ: Int = 0x54

public const val EINPROGRESS: Int = 0x73

public const val EISCONN: Int = 0x6a

public const val EISNAM: Int = 0x78

public const val EKEYEXPIRED: Int = 0x7f

public const val EKEYREJECTED: Int = 0x81

public const val EKEYREVOKED: Int = 0x80

public const val EL2HLT: Int = 0x33

public const val EL2NSYNC: Int = 0x2d

public const val EL3HLT: Int = 0x2e

public const val EL3RST: Int = 0x2f

public const val ELIBACC: Int = 0x4f

public const val ELIBBAD: Int = 0x50

public const val ELIBEXEC: Int = 0x53

public const val ELIBMAX: Int = 0x52

public const val ELIBSCN: Int = 0x51

public const val ELNRNG: Int = 0x30

public const val ELOOP: Int = 0x28

public const val EMEDIUMTYPE: Int = 0x7c

public const val EMSGSIZE: Int = 0x5a

public const val EMULTIHOP: Int = 0x48

public const val ENAMETOOLONG: Int = 0x24

public const val ENAVAIL: Int = 0x77

public const val ENETDOWN: Int = 0x64

public const val ENETRESET: Int = 0x66

public const val ENETUNREACH: Int = 0x65

public const val ENOANO: Int = 0x37

public const val ENOBUFS: Int = 0x69

public const val ENOCSI: Int = 0x32

public const val ENODATA: Int = 0x3d

public const val ENOKEY: Int = 0x7e

public const val ENOLCK: Int = 0x25

public const val ENOLINK: Int = 0x43

public const val ENOMEDIUM: Int = 0x7b

public const val ENOMSG: Int = 0x2a

public const val ENONET: Int = 0x40

public const val ENOPKG: Int = 0x41

public const val ENOPROTOOPT: Int = 0x5c

public const val ENOSR: Int = 0x3f

public const val ENOSTR: Int = 0x3c

public const val ENOSYS: Int = 0x26

public const val ENOTCONN: Int = 0x6b

public const val ENOTEMPTY: Int = 0x27

public const val ENOTNAM: Int = 0x76

public const val ENOTRECOVERABLE: Int = 0x83

public const val ENOTSOCK: Int = 0x58

public const val ENOTUNIQ: Int = 0x4c

public const val EOPNOTSUPP: Int = 0x5f

public const val EOVERFLOW: Int = 0x4b

public const val EOWNERDEAD: Int = 0x82

public const val EPFNOSUPPORT: Int = 0x60

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EPROTO: Int = 0x47

public const val EPROTONOSUPPORT: Int = 0x5d

public const val EPROTOTYPE: Int = 0x5b

public const val EREMCHG: Int = 0x4e

public const val EREMOTE: Int = 0x42

public const val EREMOTEIO: Int = 0x79

public const val ERESTART: Int = 0x55

public const val ESHUTDOWN: Int = 0x6c

public const val ESOCKTNOSUPPORT: Int = 0x5e

public const val ESRMNT: Int = 0x45

public const val ESTALE: Int = 0x74

public const val ESTRPIPE: Int = 0x56

public const val ETIME: Int = 0x3e

public const val ETIMEDOUT: Int = 0x6e

public const val ETOOMANYREFS: Int = 0x6d

public const val EUCLEAN: Int = 0x75

public const val EUNATCH: Int = 0x31

public const val EUSERS: Int = 0x57

public const val EXFULL: Int = 0x36

public const val FF1: Int = 0x8000

public const val FFDLY: Int = 0x8000

public const val FLUSHO: UInt = 0x1000u

public const val F_GETLK: Int = 0x5

public const val F_SETLK: Int = 0x6

public const val F_SETLKW: Int = 0x7

public const val HUPCL: UInt = 0x400u

public const val ICANON: UInt = 0x2u

public const val IEXTEN: UInt = 0x8000u

public const val ISIG: UInt = 0x1u

public const val IXOFF: UInt = 0x1000u

public const val IXON: UInt = 0x400u

public const val MAP_ANON: Int = 0x20

public const val MAP_ANONYMOUS: Int = 0x20

public const val MAP_DENYWRITE: Int = 0x800

public const val MAP_EXECUTABLE: Int = 0x1000

public const val MAP_GROWSDOWN: Int = 0x100

public const val MAP_LOCKED: Int = 0x2000

public const val MAP_NONBLOCK: Int = 0x10000

public const val MAP_NORESERVE: Int = 0x4000

public const val MAP_POPULATE: Int = 0x8000

public const val MAP_STACK: Int = 0x20000

public const val MINSIGSTKSZ: Int = 2048

public const val NLDLY: UInt = 0x100u

public const val NOFLSH: UInt = 0x80u

public const val OLCUC: UInt = 0x2u

public const val ONLCR: UInt = 0x4u

public const val O_ACCMODE: Int = 0x3

public const val O_APPEND: Int = 0x400

public const val O_ASYNC: Int = 8192

public const val O_CREAT: Int = 0x40

public const val O_DIRECT: Int = 16384

public const val O_DIRECTORY: Int = 65536

public val O_DSYNC: Int = O_SYNC

public const val O_EXCL: Int = 0x80

public val O_FSYNC: Int = O_SYNC

public const val O_LARGEFILE: Int = 0

public val O_NDELAY: Int = O_NONBLOCK

public const val O_NOATIME: Int = 262144

public const val O_NOCTTY: Int = 0x100

public const val O_NOFOLLOW: Int = 131072

public const val O_NONBLOCK: Int = 0x800

public const val O_PATH: Int = 2097152

public val O_RSYNC: Int = O_SYNC

public const val O_SYNC: Int = 4096

public const val O_TRUNC: Int = 0x200

public const val PARENB: UInt = 0x100u

public const val PARODD: UInt = 0x200u

public const val PENDIN: UInt = 0x4000u

public const val POLLWRBAND: Short = 0x200

public const val POLLWRNORM: Short = 0x100

public const val RTLD_GLOBAL: Int = 0x00100

public const val SA_NOCLDSTOP: ULong = 0x1uL

public const val SA_NOCLDWAIT: ULong = 0x2uL

public const val SA_SIGINFO: ULong = 0x4uL

public const val SA_NODEFER: ULong = 0x40000000uL

public const val SA_ONSTACK: ULong = 0x8000000uL

public const val SA_RESETHAND: ULong = 0x80000000uL

public const val SA_RESTART: ULong = 0x10000000uL

public const val SIGBUS: Int = 0x7

public const val SIGCHLD: Int = 0x11

public const val SIGCONT: Int = 0x12

public const val SIGIO: Int = 0x1d

public const val SIGPOLL: Int = SIGIO

public const val SIGPROF: Int = 0x1b

public const val SIGPWR: Int = 0x1e

public const val SIGSTKFLT: Int = 0x10

public const val SIGSTKSZ: Int = 8192

public const val SIGSTOP: Int = 0x13

public const val SIGSYS: Int = 0x1f

public const val SIGTSTP: Int = 0x14

public const val SIGTTIN: Int = 0x15

public const val SIGTTOU: Int = 0x16

public const val SIGURG: Int = 0x17

public const val SIGUSR1: Int = 0xa

public const val SIGUSR2: Int = 0xc

public const val SIGVTALRM: Int = 0x1a

public const val SIGWINCH: Int = 0x1c

public const val SIGXCPU: Int = 0x18

public const val SIGXFSZ: Int = 0x19

public const val SIG_BLOCK: Int = 0

public const val SIG_UNBLOCK: Int = 0x1

public const val SIG_SETMASK: Int = 0x2

public const val SOCK_DGRAM: Int = 0x2

public const val SOCK_NONBLOCK: Int = 2048

public const val SOCK_SEQPACKET: Int = 0x5

public const val SOCK_STREAM: Int = 0x1

public const val TAB1: Int = 0x800

public const val TAB2: Int = 0x1000

public const val TAB3: Int = 0x1800

public const val TABDLY: Int = 0x1800

public const val TCSADRAIN: Int = 0x1

public const val TCSAFLUSH: Int = 0x2

public const val TCSANOW: Int = 0

public const val TOSTOP: UInt = 0x100u

public const val VDISCARD: ULong = 0xduL

public const val VEOF: ULong = 0x4uL

public const val VEOL: ULong = 0xbuL

public const val VEOL2: ULong = 0x10uL

public const val VMIN: ULong = 0x6uL

public const val VREPRINT: ULong = 0xcuL

public const val VSTART: ULong = 0x8uL

public const val VSTOP: ULong = 0x9uL

public const val VSUSP: ULong = 0xauL

public const val VSWTC: ULong = 0x7uL

public const val VT1: Int = 0x4000

public const val VTDLY: Int = 0x4000

public const val VTIME: ULong = 0x5uL

public const val VWERASE: ULong = 0xeuL

public const val XTABS: UInt = 0x1800u
