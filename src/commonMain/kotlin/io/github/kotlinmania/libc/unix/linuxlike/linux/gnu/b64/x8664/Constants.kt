// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val VEOF: ULong = 4uL

public const val RTLD_DEEPBIND: Int = 0x8

public const val RTLD_GLOBAL: Int = 0x100

public const val RTLD_NOLOAD: Int = 0x4

public const val O_APPEND: Int = 1024

public const val O_CREAT: Int = 64

public const val O_EXCL: Int = 128

public const val O_NOCTTY: Int = 256

public const val O_NONBLOCK: Int = 2048

public const val O_SYNC: Int = 1052672

public const val O_RSYNC: Int = 1052672

public const val O_DSYNC: Int = 4096

public const val O_FSYNC: Int = 0x101000

public const val O_NOATIME: Int = 262144

public const val O_PATH: Int = 2097152

public val O_TMPFILE: Int = 4194304 or O_DIRECTORY

public const val MADV_SOFT_OFFLINE: Int = 101

public const val MAP_GROWSDOWN: Int = 0x0100

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

public const val ENOMSG: Int = 42

public const val EIDRM: Int = 43

public const val ECHRNG: Int = 44

public const val EL2NSYNC: Int = 45

public const val EL3HLT: Int = 46

public const val EL3RST: Int = 47

public const val ELNRNG: Int = 48

public const val EUNATCH: Int = 49

public const val ENOCSI: Int = 50

public const val EL2HLT: Int = 51

public const val EBADE: Int = 52

public const val EBADR: Int = 53

public const val EXFULL: Int = 54

public const val ENOANO: Int = 55

public const val EBADRQC: Int = 56

public const val EBADSLT: Int = 57

public const val EMULTIHOP: Int = 72

public const val EOVERFLOW: Int = 75

public const val ENOTUNIQ: Int = 76

public const val EBADFD: Int = 77

public const val EBADMSG: Int = 74

public const val EREMCHG: Int = 78

public const val ELIBACC: Int = 79

public const val ELIBBAD: Int = 80

public const val ELIBSCN: Int = 81

public const val ELIBMAX: Int = 82

public const val ELIBEXEC: Int = 83

public const val EILSEQ: Int = 84

public const val ERESTART: Int = 85

public const val ESTRPIPE: Int = 86

public const val EUSERS: Int = 87

public const val ENOTSOCK: Int = 88

public const val EDESTADDRREQ: Int = 89

public const val EMSGSIZE: Int = 90

public const val EPROTOTYPE: Int = 91

public const val ENOPROTOOPT: Int = 92

public const val EPROTONOSUPPORT: Int = 93

public const val ESOCKTNOSUPPORT: Int = 94

public const val EOPNOTSUPP: Int = 95

public const val EPFNOSUPPORT: Int = 96

public const val EAFNOSUPPORT: Int = 97

public const val EADDRINUSE: Int = 98

public const val EADDRNOTAVAIL: Int = 99

public const val ENETDOWN: Int = 100

public const val ENETUNREACH: Int = 101

public const val ENETRESET: Int = 102

public const val ECONNABORTED: Int = 103

public const val ECONNRESET: Int = 104

public const val ENOBUFS: Int = 105

public const val EISCONN: Int = 106

public const val ENOTCONN: Int = 107

public const val ESHUTDOWN: Int = 108

public const val ETOOMANYREFS: Int = 109

public const val ETIMEDOUT: Int = 110

public const val ECONNREFUSED: Int = 111

public const val EHOSTDOWN: Int = 112

public const val EHOSTUNREACH: Int = 113

public const val EALREADY: Int = 114

public const val EINPROGRESS: Int = 115

public const val ESTALE: Int = 116

public const val EDQUOT: Int = 122

public const val ENOMEDIUM: Int = 123

public const val EMEDIUMTYPE: Int = 124

public const val ECANCELED: Int = 125

public const val ENOKEY: Int = 126

public const val EKEYEXPIRED: Int = 127

public const val EKEYREVOKED: Int = 128

public const val EKEYREJECTED: Int = 129

public const val EOWNERDEAD: Int = 130

public const val ENOTRECOVERABLE: Int = 131

public const val EHWPOISON: Int = 133

public const val ERFKILL: Int = 132

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SA_ONSTACK: Int = 0x08000000

public const val SA_SIGINFO: Int = 0x00000004

public const val SA_NOCLDWAIT: Int = 0x00000002

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGCHLD: Int = 17

public const val SIGBUS: Int = 7

public const val SIGUSR1: Int = 10

public const val SIGUSR2: Int = 12

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGURG: Int = 23

public const val SIGIO: Int = 29

public const val SIGSYS: Int = 31

public const val SIGSTKFLT: Int = 16

public const val SIGUNUSED: Int = 31

public const val SIGPOLL: Int = 29

public const val SIGPWR: Int = 30

public const val SIG_SETMASK: Int = 2

public const val SIG_BLOCK: Int = 0x000000

public const val SIG_UNBLOCK: Int = 0x01

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val O_ASYNC: Int = 0x2000

public const val O_NDELAY: Int = 0x800

public const val PTRACE_DETACH: UInt = 17u

public const val PTRACE_GET_RSEQ_CONFIGURATION: UInt = 0x420fu

public const val EFD_NONBLOCK: Int = 0x800

public const val F_GETLK: Int = 5

public const val F_GETOWN: Int = 9

public const val F_SETOWN: Int = 8

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_OFD_GETLK: Int = 36

public const val F_OFD_SETLK: Int = 37

public const val F_OFD_SETLKW: Int = 38

public const val F_RDLCK: Int = 0

public const val F_WRLCK: Int = 1

public const val F_UNLCK: Int = 2

public const val SFD_NONBLOCK: Int = 0x0800

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

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

public const val SA_NODEFER: Int = 0x40000000

public const val SA_RESETHAND: Int = 0x80000000.toInt()

public const val SA_RESTART: Int = 0x10000000

public const val SA_NOCLDSTOP: Int = 0x00000001

public const val EPOLL_CLOEXEC: Int = 0x80000

public const val EFD_CLOEXEC: Int = 0x80000

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val O_DIRECT: Int = 0x4000

public const val O_DIRECTORY: Int = 0x10000

public const val O_NOFOLLOW: Int = 0x20000

public const val MAP_HUGETLB: Int = 0x040000

public const val MAP_LOCKED: Int = 0x02000

public const val MAP_NORESERVE: Int = 0x04000

public const val MAP_32BIT: Int = 0x0040

public const val MAP_ANON: Int = 0x0020

public const val MAP_ANONYMOUS: Int = 0x0020

public const val MAP_DENYWRITE: Int = 0x0800

public const val MAP_EXECUTABLE: Int = 0x01000

public const val MAP_POPULATE: Int = 0x08000

public const val MAP_NONBLOCK: Int = 0x010000

public const val MAP_STACK: Int = 0x020000

public const val MAP_SYNC: Int = 0x080000

public const val EDEADLOCK: Int = 35

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

public const val PTRACE_GETFPREGS: UInt = 14u

public const val PTRACE_SETFPREGS: UInt = 15u

public const val PTRACE_GETFPXREGS: UInt = 18u

public const val PTRACE_SETFPXREGS: UInt = 19u

public const val PTRACE_GETREGS: UInt = 12u

public const val PTRACE_SETREGS: UInt = 13u

public const val PTRACE_PEEKSIGINFO_SHARED: UInt = 1u

public const val PTRACE_SYSEMU: UInt = 31u

public const val PTRACE_SYSEMU_SINGLESTEP: UInt = 32u

public const val PR_GET_SPECULATION_CTRL: Int = 52

public const val PR_SET_SPECULATION_CTRL: Int = 53

public const val PR_SPEC_NOT_AFFECTED: UInt = 0u

public val PR_SPEC_PRCTL: UInt = 1u shl 0

public val PR_SPEC_ENABLE: UInt = 1u shl 1

public val PR_SPEC_DISABLE: UInt = 1u shl 2

public val PR_SPEC_FORCE_DISABLE: UInt = 1u shl 3

public val PR_SPEC_DISABLE_NOEXEC: UInt = 1u shl 4

public const val PR_SPEC_STORE_BYPASS: Int = 0

public const val PR_SPEC_INDIRECT_BRANCH: Int = 1

public const val PR_SPEC_L1D_FLUSH: Int = 2

public const val MCL_CURRENT: Int = 0x0001

public const val MCL_FUTURE: Int = 0x0002

public const val MCL_ONFAULT: Int = 0x0004

public const val SIGSTKSZ: ULong = 8192uL

public const val MINSIGSTKSZ: ULong = 2048uL

public const val CBAUD: UInt = 4111u

public const val TAB1: UInt = 0x00000800u

public const val TAB2: UInt = 0x00001000u

public const val TAB3: UInt = 0x00001800u

public const val CR1: UInt = 0x00000200u

public const val CR2: UInt = 0x00000400u

public const val CR3: UInt = 0x00000600u

public const val FF1: UInt = 0x00008000u

public const val BS1: UInt = 0x00002000u

public const val VT1: UInt = 0x00004000u

public const val VWERASE: ULong = 14uL

public const val VREPRINT: ULong = 12uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 8uL

public const val VSTOP: ULong = 9uL

public const val VDISCARD: ULong = 13uL

public const val VTIME: ULong = 5uL

public const val IXON: UInt = 0x00000400u

public const val IXOFF: UInt = 0x00001000u

public const val ONLCR: UInt = 0x4u

public const val CSIZE: UInt = 0x00000030u

public const val CS6: UInt = 0x00000010u

public const val CS7: UInt = 0x00000020u

public const val CS8: UInt = 0x00000030u

public const val CSTOPB: UInt = 0x00000040u

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

public const val CIBAUD: UInt = 269418496u

public const val CBAUDEX: UInt = 4096u

public const val VSWTC: ULong = 7uL

public const val OLCUC: UInt = 2u

public const val NLDLY: UInt = 256u

public const val CRDLY: UInt = 1536u

public const val TABDLY: UInt = 6144u

public const val BSDLY: UInt = 8192u

public const val FFDLY: UInt = 32768u

public const val VTDLY: UInt = 16384u

public const val XTABS: UInt = 6144u

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

public const val EXTA: UInt = B19200

public const val EXTB: UInt = B38400

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

public const val VEOL: ULong = 11uL

public const val VEOL2: ULong = 16uL

public const val VMIN: ULong = 6uL

public const val IEXTEN: UInt = 0x00008000u

public const val TOSTOP: UInt = 0x00000100u

public const val FLUSHO: UInt = 0x00001000u

public const val EXTPROC: UInt = 0x00010000u

public const val R15: Int = 0

public const val R14: Int = 1

public const val R13: Int = 2

public const val R12: Int = 3

public const val RBP: Int = 4

public const val RBX: Int = 5

public const val R11: Int = 6

public const val R10: Int = 7

public const val R9: Int = 8

public const val R8: Int = 9

public const val RAX: Int = 10

public const val RCX: Int = 11

public const val RDX: Int = 12

public const val RSI: Int = 13

public const val RDI: Int = 14

public const val ORIG_RAX: Int = 15

public const val RIP: Int = 16

public const val CS: Int = 17

public const val EFLAGS: Int = 18

public const val RSP: Int = 19

public const val SS: Int = 20

public const val FS_BASE: Int = 21

public const val GS_BASE: Int = 22

public const val DS: Int = 23

public const val ES: Int = 24

public const val FS: Int = 25

public const val GS: Int = 26

public const val REG_R8: Int = 0

public const val REG_R9: Int = 1

public const val REG_R10: Int = 2

public const val REG_R11: Int = 3

public const val REG_R12: Int = 4

public const val REG_R13: Int = 5

public const val REG_R14: Int = 6

public const val REG_R15: Int = 7

public const val REG_RDI: Int = 8

public const val REG_RSI: Int = 9

public const val REG_RBP: Int = 10

public const val REG_RBX: Int = 11

public const val REG_RDX: Int = 12

public const val REG_RAX: Int = 13

public const val REG_RCX: Int = 14

public const val REG_RSP: Int = 15

public const val REG_RIP: Int = 16

public const val REG_EFL: Int = 17

public const val REG_CSGSFS: Int = 18

public const val REG_ERR: Int = 19

public const val REG_TRAPNO: Int = 20

public const val REG_OLDMASK: Int = 21

public const val REG_CR2: Int = 22
