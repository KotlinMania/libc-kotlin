// port-lint: source unix/linux_like/linux/uclibc/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips

import io.github.kotlinmania.libc.*

public const val SFD_CLOEXEC: Int = 0x080000

public const val NCCS: ULong = 32uL

public const val O_TRUNC: Int = 512

public const val O_CLOEXEC: Int = 0x80000

public const val EBFONT: Int = 59

public const val ENOSTR: Int = 60

public const val ENODATA: Int = 61

public const val ETIME: Int = 62

public const val ENOSR: Int = 63

public const val ENONET: Int = 64

public const val ENOPKG: Int = 65

public const val EREMOTE: Int = 66

public const val ENOLINK: Int = 67

public const val EADV: Int = 68

public const val ESRMNT: Int = 69

public const val ECOMM: Int = 70

public const val EPROTO: Int = 71

public const val EDOTDOT: Int = 73

public const val SA_NODEFER: UInt = 0x40000000u

public const val SA_RESETHAND: UInt = 0x80000000u

public const val SA_RESTART: UInt = 0x10000000u

public const val SA_NOCLDSTOP: UInt = 0x00000001u

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val TMP_MAX: UInt = 238328u

public const val _SC_2_C_VERSION: Int = 96

public const val O_ACCMODE: Int = 3

public const val O_DIRECT: Int = 0x8000

public const val O_DIRECTORY: Int = 0x10000

public const val O_NOFOLLOW: Int = 0x20000

public const val O_NOATIME: Int = 0x40000

public const val O_PATH: Int = 2097152

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 256

public const val O_EXCL: Int = 1024

public const val O_NOCTTY: Int = 2048

public const val O_NONBLOCK: Int = 128

public const val O_SYNC: Int = 0x10

public const val O_RSYNC: Int = 0x10

public const val O_DSYNC: Int = 0x10

public const val O_FSYNC: Int = 0x10

public const val O_ASYNC: Int = 0x1000

public const val O_LARGEFILE: Int = 0x2000

public const val O_NDELAY: Int = 0x80

public const val SOCK_NONBLOCK: Int = 128

public const val EDEADLK: Int = 45

public const val ENAMETOOLONG: Int = 78

public const val ENOLCK: Int = 46

public const val ENOSYS: Int = 89

public const val ENOTEMPTY: Int = 93

public const val ELOOP: Int = 90

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val ECHRNG: Int = 37

public const val EL2NSYNC: Int = 38

public const val EL3HLT: Int = 39

public const val EL3RST: Int = 40

public const val ELNRNG: Int = 41

public const val EUNATCH: Int = 42

public const val ENOCSI: Int = 43

public const val EL2HLT: Int = 44

public const val EBADE: Int = 50

public const val EBADR: Int = 51

public const val EXFULL: Int = 52

public const val FFDLY: Int = 32768

public const val ENOANO: Int = 53

public const val EBADRQC: Int = 54

public const val EBADSLT: Int = 55

public const val EMULTIHOP: Int = 74

public const val EOVERFLOW: Int = 79

public const val ENOTUNIQ: Int = 80

public const val EBADFD: Int = 81

public const val EBADMSG: Int = 77

public const val EREMCHG: Int = 82

public const val ELIBACC: Int = 83

public const val ELIBBAD: Int = 84

public const val ELIBSCN: Int = 85

public const val ELIBMAX: Int = 86

public const val ELIBEXEC: Int = 87

public const val EILSEQ: Int = 88

public const val ERESTART: Int = 91

public const val ESTRPIPE: Int = 92

public const val EUSERS: Int = 94

public const val ENOTSOCK: Int = 95

public const val EDESTADDRREQ: Int = 96

public const val EMSGSIZE: Int = 97

public const val EPROTOTYPE: Int = 98

public const val ENOPROTOOPT: Int = 99

public const val EPROTONOSUPPORT: Int = 120

public const val ESOCKTNOSUPPORT: Int = 121

public const val EOPNOTSUPP: Int = 122

public const val EPFNOSUPPORT: Int = 123

public const val EAFNOSUPPORT: Int = 124

public const val EADDRINUSE: Int = 125

public const val EADDRNOTAVAIL: Int = 126

public const val ENETDOWN: Int = 127

public const val ENETUNREACH: Int = 128

public const val ENETRESET: Int = 129

public const val ECONNABORTED: Int = 130

public const val ECONNRESET: Int = 131

public const val ENOBUFS: Int = 132

public const val EISCONN: Int = 133

public const val ENOTCONN: Int = 134

public const val ESHUTDOWN: Int = 143

public const val ETOOMANYREFS: Int = 144

public const val ETIMEDOUT: Int = 145

public const val ECONNREFUSED: Int = 146

public const val EHOSTDOWN: Int = 147

public const val EHOSTUNREACH: Int = 148

public const val EALREADY: Int = 149

public const val EINPROGRESS: Int = 150

public const val ESTALE: Int = 151

public const val EUCLEAN: Int = 135

public const val ENOTNAM: Int = 137

public const val ENAVAIL: Int = 138

public const val EISNAM: Int = 139

public const val EREMOTEIO: Int = 140

public const val EDQUOT: Int = 1133

public const val ENOMEDIUM: Int = 159

public const val EMEDIUMTYPE: Int = 160

public const val ECANCELED: Int = 158

public const val ENOKEY: Int = 161

public const val EKEYEXPIRED: Int = 162

public const val EKEYREVOKED: Int = 163

public const val EKEYREJECTED: Int = 164

public const val EOWNERDEAD: Int = 165

public const val ENOTRECOVERABLE: Int = 166

public const val ERFKILL: Int = 167

public const val MAP_NORESERVE: Int = 0x400

public const val MAP_ANON: Int = 0x800

public const val MAP_ANONYMOUS: Int = 0x800

public const val MAP_GROWSDOWN: Int = 0x1000

public const val MAP_DENYWRITE: Int = 0x2000

public const val MAP_EXECUTABLE: Int = 0x4000

public const val MAP_LOCKED: Int = 0x8000

public const val MAP_POPULATE: Int = 0x10000

public const val MAP_NONBLOCK: Int = 0x20000

public const val MAP_STACK: Int = 0x40000

public const val NLDLY: UInt = 256u

public const val SOCK_STREAM: Int = 2

public const val SOCK_DGRAM: Int = 1

public const val SOCK_SEQPACKET: Int = 5

public const val SA_ONSTACK: UInt = 0x08000000u

public const val SA_SIGINFO: UInt = 0x00000008u

public const val SA_NOCLDWAIT: Int = 0x00010000

public const val SIGEMT: Int = 7

public const val SIGCHLD: Int = 18

public const val SIGBUS: Int = 10

public const val SIGTTIN: Int = 26

public const val SIGTTOU: Int = 27

public const val SIGXCPU: Int = 30

public const val SIGXFSZ: Int = 31

public const val SIGVTALRM: Int = 28

public const val SIGPROF: Int = 29

public const val SIGWINCH: Int = 20

public const val SIGUSR1: Int = 16

public const val SIGUSR2: Int = 17

public const val SIGCONT: Int = 25

public const val SIGSTOP: Int = 23

public const val SIGTSTP: Int = 24

public const val SIGURG: Int = 21

public const val SIGIO: Int = 22

public const val SIGSYS: Int = 12

public const val SIGPWR: Int = 19

public const val SIG_SETMASK: Int = 3

public const val SIG_BLOCK: Int = 0x1

public const val SIG_UNBLOCK: Int = 0x2

public const val POLLWRNORM: Short = 0x004

public const val POLLWRBAND: Short = 0x100

public const val PTHREAD_STACK_MIN: ULong = 16384uL

public const val VEOF: ULong = 16uL

public const val VEOL: ULong = 17uL

public const val VEOL2: ULong = 6uL

public const val VMIN: ULong = 4uL

public const val IEXTEN: UInt = 0x00000100u

public const val TOSTOP: UInt = 0x00008000u

public const val FLUSHO: UInt = 0x00002000u

public const val TCSANOW: Int = 0x540e

public const val TCSADRAIN: Int = 0x540f

public const val TCSAFLUSH: Int = 0x5410

public const val CPU_SETSIZE: Int = 0x400

public const val EFD_NONBLOCK: Int = 0x80

public const val F_GETLK: Int = 14

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val SFD_NONBLOCK: Int = 0x80

public const val RTLD_GLOBAL: Int = 0x4

public const val SIGSTKSZ: ULong = 8192uL

public const val CBAUD: UInt = 4111u

public const val CBAUDEX: UInt = 4096u

public const val CIBAUD: UInt = 269418496u

public const val TAB1: UInt = 0x00000800u

public const val TAB2: UInt = 0x00001000u

public const val TAB3: UInt = 0x00001800u

public const val TABDLY: UInt = 6144u

public const val CR1: UInt = 0x00000200u

public const val CR2: UInt = 0x00000400u

public const val CR3: UInt = 0x00000600u

public const val FF1: UInt = 0x00008000u

public const val BS1: UInt = 0x00002000u

public const val BSDLY: UInt = 8192u

public const val VT1: UInt = 0x00004000u

public const val VWERASE: ULong = 14uL

public const val XTABS: UInt = 6144u

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSWTC: ULong = 7uL

public const val VTDLY: Int = 16384

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val OLCUC: UInt = 2u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

public const val CRDLY: Int = 1536

public const val CREAD: UInt = 0x00000080u

public const val PARENB: UInt = 0x00000100u

public const val PARODD: UInt = 0x00000200u

public const val HUPCL: UInt = 0x00000400u

public const val CLOCAL: UInt = 0x00000800u

public const val ECHOKE: UInt = 0x00000800u

public const val ECHOE: UInt = 0x00000010u

public const val ECHOK: UInt = 0x00000020u

public const val ECHONL: UInt = 0x00000040u

public const val ECHOPRT: UInt = 0x00000400u

public const val ECHOCTL: UInt = 0x00000200u

public const val ISIG: UInt = 0x00000001u

public const val ICANON: UInt = 0x00000002u

public const val PENDIN: UInt = 0x00004000u

public const val NOFLSH: UInt = 0x00000080u

public const val MAP_HUGETLB: Int = 0x80000

public const val B0: UInt = 0u

public const val B50: UInt = 1u

public const val B75: UInt = 2u

public const val B110: UInt = 3u

public const val B134: UInt = 4u

public const val B150: UInt = 5u

public const val B200: UInt = 6u

public const val B300: UInt = 7u

public const val B600: UInt = 8u

public const val B1200: UInt = 9u

public const val B1800: UInt = 10u

public const val B2400: UInt = 11u

public const val B4800: UInt = 12u

public const val B9600: UInt = 13u

public const val B19200: UInt = 14u

public const val B38400: UInt = 15u

public const val B57600: UInt = 4097u

public const val B115200: UInt = 4098u

public const val B230400: UInt = 4099u

public const val B460800: UInt = 4100u

public const val B500000: UInt = 4101u

public const val B576000: UInt = 4102u

public const val B921600: UInt = 4103u

public const val B1000000: UInt = 4104u

public const val B1152000: UInt = 4105u

public const val B1500000: UInt = 4106u

public const val B2000000: UInt = 4107u

public const val B2500000: UInt = 4108u

public const val B3000000: UInt = 4109u

public const val B3500000: UInt = 4110u

public const val B4000000: UInt = 4111u
