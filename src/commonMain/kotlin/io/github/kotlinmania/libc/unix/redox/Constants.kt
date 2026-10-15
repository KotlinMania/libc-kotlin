// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public const val UTSLENGTH: ULong = 65uL

public const val PATH_MAX: Int = 4096

public const val F_GETLK: Int = 5

public const val F_SETLK: Int = 6

public const val F_SETLKW: Int = 7

public const val F_ULOCK: Int = 0

public const val F_LOCK: Int = 1

public const val F_TLOCK: Int = 2

public const val F_TEST: Int = 3

public const val AT_FDCWD: Int = -100

public const val RTLD_LAZY: Int = 0x0001

public const val RTLD_NOW: Int = 0x0002

public const val RTLD_GLOBAL: Int = 0x0100

public const val RTLD_LOCAL: Int = 0x0000

public const val EPERM: Int = 1

public const val ENOENT: Int = 2

public const val ESRCH: Int = 3

public const val EINTR: Int = 4

public const val EIO: Int = 5

public const val ENXIO: Int = 6

public const val E2BIG: Int = 7

public const val ENOEXEC: Int = 8

public const val EBADF: Int = 9

public const val ECHILD: Int = 10

public const val EAGAIN: Int = 11

public const val ENOMEM: Int = 12

public const val EACCES: Int = 13

public const val EFAULT: Int = 14

public const val ENOTBLK: Int = 15

public const val EBUSY: Int = 16

public const val EEXIST: Int = 17

public const val EXDEV: Int = 18

public const val ENODEV: Int = 19

public const val ENOTDIR: Int = 20

public const val EISDIR: Int = 21

public const val EINVAL: Int = 22

public const val ENFILE: Int = 23

public const val EMFILE: Int = 24

public const val ENOTTY: Int = 25

public const val ETXTBSY: Int = 26

public const val EFBIG: Int = 27

public const val ENOSPC: Int = 28

public const val ESPIPE: Int = 29

public const val EROFS: Int = 30

public const val EMLINK: Int = 31

public const val EPIPE: Int = 32

public const val EDOM: Int = 33

public const val ERANGE: Int = 34

public const val EDEADLK: Int = 35

public const val ENAMETOOLONG: Int = 36

public const val ENOLCK: Int = 37

public const val ENOSYS: Int = 38

public const val ENOTEMPTY: Int = 39

public const val ELOOP: Int = 40

public const val EWOULDBLOCK: Int = 41

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

public const val EDEADLOCK: Int = 58

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

public const val EMULTIHOP: Int = 72

public const val EDOTDOT: Int = 73

public const val EBADMSG: Int = 74

public const val EOVERFLOW: Int = 75

public const val ENOTUNIQ: Int = 76

public const val EBADFD: Int = 77

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

public const val ENOTSUP: Int = EOPNOTSUPP

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

public const val EUCLEAN: Int = 117

public const val ENOTNAM: Int = 118

public const val ENAVAIL: Int = 119

public const val EISNAM: Int = 120

public const val EREMOTEIO: Int = 121

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

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_DUPFD_CLOEXEC: Int = F_DUPFD

public const val FD_CLOEXEC: Int = 0x0100_0000

public const val O_RDONLY: Int = 0x0001_0000

public const val O_WRONLY: Int = 0x0002_0000

public const val O_RDWR: Int = 0x0003_0000

public const val O_ACCMODE: Int = 0x0003_0000

public const val O_NONBLOCK: Int = 0x0004_0000

public const val O_NDELAY: Int = O_NONBLOCK

public const val O_APPEND: Int = 0x0008_0000

public const val O_SHLOCK: Int = 0x0010_0000

public const val O_EXLOCK: Int = 0x0020_0000

public const val O_ASYNC: Int = 0x0040_0000

public const val O_FSYNC: Int = 0x0080_0000

public const val O_CLOEXEC: Int = 0x0100_0000

public const val O_CREAT: Int = 0x0200_0000

public const val O_TRUNC: Int = 0x0400_0000

public const val O_EXCL: Int = 0x0800_0000

public const val O_DIRECTORY: Int = 0x1000_0000

public const val O_PATH: Int = 0x2000_0000

public const val O_SYMLINK: Int = 0x4000_0000

public const val O_NOFOLLOW: Int = -0x8000_0000

public const val O_NOCTTY: Int = 0x00000200

public const val LC_ALL: Int = 0

public const val LC_COLLATE: Int = 1

public const val LC_CTYPE: Int = 2

public const val LC_MESSAGES: Int = 3

public const val LC_MONETARY: Int = 4

public const val LC_NUMERIC: Int = 5

public const val LC_TIME: Int = 6

public const val AI_PASSIVE: Int = 0x0001

public const val AI_CANONNAME: Int = 0x0002

public const val AI_NUMERICHOST: Int = 0x0004

public const val AI_V4MAPPED: Int = 0x0008

public const val AI_ALL: Int = 0x0010

public const val AI_ADDRCONFIG: Int = 0x0020

public const val AI_NUMERICSERV: Int = 0x0400

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_NODATA: Int = -5

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_ADDRFAMILY: Int = -9

public const val EAI_MEMORY: Int = -10

public const val EAI_SYSTEM: Int = -11

public const val EAI_OVERFLOW: Int = -12

public const val NI_MAXHOST: Int = 1025

public const val NI_MAXSERV: Int = 32

public const val NI_NUMERICHOST: Int = 0x0001

public const val NI_NUMERICSERV: Int = 0x0002

public const val NI_NOFQDN: Int = 0x0004

public const val NI_NAMEREQD: Int = 0x0008

public const val NI_DGRAM: Int = 0x0010

public const val IP_TTL: Int = 2

public const val IPV6_UNICAST_HOPS: Int = 16

public const val IPV6_MULTICAST_IF: Int = 17

public const val IPV6_MULTICAST_HOPS: Int = 18

public const val IPV6_MULTICAST_LOOP: Int = 19

public const val IPV6_ADD_MEMBERSHIP: Int = 20

public const val IPV6_DROP_MEMBERSHIP: Int = 21

public const val IPV6_V6ONLY: Int = 26

public const val IP_MULTICAST_IF: Int = 32

public const val IP_MULTICAST_TTL: Int = 33

public const val IP_MULTICAST_LOOP: Int = 34

public const val IP_ADD_MEMBERSHIP: Int = 35

public const val IP_DROP_MEMBERSHIP: Int = 36

public const val IP_TOS: Int = 1

public const val IP_RECVTOS: Int = 2

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_RAW: Int = 255

public const val IPPROTO_MAX: Int = 255

public const val TCP_NODELAY: Int = 1

public const val TCP_KEEPIDLE: Int = 1

public const val POLLIN: Short = 0x001

public const val POLLPRI: Short = 0x002

public const val POLLOUT: Short = 0x004

public const val POLLERR: Short = 0x008

public const val POLLHUP: Short = 0x010

public const val POLLNVAL: Short = 0x020

public const val POLLRDNORM: Short = 0x040

public const val POLLRDBAND: Short = 0x080

public const val POLLWRNORM: Short = 0x100

public const val POLLWRBAND: Short = 0x200

public const val PTHREAD_MUTEX_DEFAULT: Int = 0

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 1

public const val PTHREAD_MUTEX_NORMAL: Int = 2

public const val PTHREAD_MUTEX_RECURSIVE: Int = 3

public const val PTHREAD_MUTEX_ROBUST: Int = 0

public const val PTHREAD_MUTEX_STALLED: Int = 1

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = crate::pthread_mutex_t { bytes: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = crate::pthread_cond_t { bytes: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = crate::pthread_rwlock_t { bytes: [0 (initializer represented at the FFI boundary)
public const val PTHREAD_STACK_MIN: ULong = 4096uL

public const val SIG_BLOCK: Int = 0

public const val SIG_UNBLOCK: Int = 1

public const val SIG_SETMASK: Int = 2

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGTRAP: Int = 5

public const val SIGABRT: Int = 6

public const val SIGBUS: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGUSR1: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGUSR2: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val SIGSTKFLT: Int = 16

public const val SIGCHLD: Int = 17

public const val SIGCONT: Int = 18

public const val SIGSTOP: Int = 19

public const val SIGTSTP: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGURG: Int = 23

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGIO: Int = 29

public const val SIGPWR: Int = 30

public const val SIGSYS: Int = 31

public const val NSIG: Int = 32

public const val SA_NOCLDWAIT: ULong = 0x00000002uL

public const val SA_RESTORER: ULong = 0x00000004uL

public const val SA_SIGINFO: ULong = 0x02000000uL

public const val SA_ONSTACK: ULong = 0x04000000uL

public const val SA_RESTART: ULong = 0x08000000uL

public const val SA_NODEFER: ULong = 0x10000000uL

public const val SA_RESETHAND: ULong = 0x20000000uL

public const val SA_NOCLDSTOP: ULong = 0x40000000uL

public const val LOCK_SH: Int = 1

public const val LOCK_EX: Int = 2

public const val LOCK_NB: Int = 4

public const val LOCK_UN: Int = 8

public const val EPOLL_CLOEXEC: Int = 0x0100_0000

public const val EPOLL_CTL_ADD: Int = 1

public const val EPOLL_CTL_DEL: Int = 2

public const val EPOLL_CTL_MOD: Int = 3

public const val EPOLLIN: Int = 0x001

public const val EPOLLPRI: Int = 0x002

public const val EPOLLOUT: Int = 0x004

public const val EPOLLERR: Int = 0x008

public const val EPOLLHUP: Int = 0x010

public const val EPOLLNVAL: Int = 0x020

public const val EPOLLRDNORM: Int = 0x040

public const val EPOLLRDBAND: Int = 0x080

public const val EPOLLWRNORM: Int = 0x100

public const val EPOLLWRBAND: Int = 0x200

public const val EPOLLMSG: Int = 0x400

public const val EPOLLRDHUP: Int = 0x2000

public val EPOLLEXCLUSIVE: Int = 1 shl 28

public val EPOLLWAKEUP: Int = 1 shl 29

public val EPOLLONESHOT: Int = 1 shl 30

public val EPOLLET: Int = 1 shl 31

public const val S_IFMT: Int = 61440

public const val S_IFDIR: Int = 16384

public const val S_IFCHR: Int = 8192

public const val S_IFBLK: Int = 24576

public const val S_IFREG: Int = 32768

public const val S_IFIFO: Int = 4096

public const val S_IFLNK: Int = 40960

public const val S_IFSOCK: Int = 49152

public const val S_IRWXU: Int = 448

public const val S_IRUSR: Int = 256

public const val S_IWUSR: Int = 128

public const val S_IXUSR: Int = 64

public const val S_IRWXG: Int = 56

public const val S_IRGRP: Int = 32

public const val S_IWGRP: Int = 16

public const val S_IXGRP: Int = 8

public const val S_IRWXO: Int = 7

public const val S_IROTH: Int = 4

public const val S_IWOTH: Int = 2

public const val S_IXOTH: Int = 1

public const val EXIT_SUCCESS: Int = 0

public const val EXIT_FAILURE: Int = 1

public const val FIONREAD: ULong = 0x541BuL

public const val FIONBIO: ULong = 0x5421uL

public const val FIOCLEX: ULong = 0x5451uL

public const val TCGETS: ULong = 0x5401uL

public const val TCSETS: ULong = 0x5402uL

public const val TCFLSH: ULong = 0x540BuL

public const val TIOCSCTTY: ULong = 0x540EuL

public const val TIOCGPGRP: ULong = 0x540FuL

public const val TIOCSPGRP: ULong = 0x5410uL

public const val TIOCGWINSZ: ULong = 0x5413uL

public const val TIOCSWINSZ: ULong = 0x5414uL

public const val PROT_NONE: Int = 0x0000

public const val PROT_READ: Int = 0x0004

public const val PROT_WRITE: Int = 0x0002

public const val PROT_EXEC: Int = 0x0001

public const val MADV_NORMAL: Int = 0

public const val MADV_RANDOM: Int = 1

public const val MADV_SEQUENTIAL: Int = 2

public const val MADV_WILLNEED: Int = 3

public const val MADV_DONTNEED: Int = 4

public const val MAP_SHARED: Int = 0x0001

public const val MAP_PRIVATE: Int = 0x0002

public const val MAP_ANON: Int = 0x0020

public const val MAP_ANONYMOUS: Int = MAP_ANON

public const val MAP_FIXED: Int = 0x0004

public const val MS_ASYNC: Int = 0x0001

public const val MS_INVALIDATE: Int = 0x0002

public const val MS_SYNC: Int = 0x0004

public val RLIM_INFINITY: ULong = 0uL.inv()

public val RLIM_SAVED_CUR: ULong = RLIM_INFINITY

public val RLIM_SAVED_MAX: ULong = RLIM_INFINITY

public const val RLIMIT_CPU: Int = 0

public const val RLIMIT_FSIZE: Int = 1

public const val RLIMIT_DATA: Int = 2

public const val RLIMIT_STACK: Int = 3

public const val RLIMIT_CORE: Int = 4

public const val RLIMIT_RSS: Int = 5

public const val RLIMIT_NPROC: Int = 6

public const val RLIMIT_NOFILE: Int = 7

public const val RLIMIT_MEMLOCK: Int = 8

public const val RLIMIT_AS: Int = 9

public const val RLIMIT_LOCKS: Int = 10

public const val RLIMIT_SIGPENDING: Int = 11

public const val RLIMIT_MSGQUEUE: Int = 12

public const val RLIMIT_NICE: Int = 13

public const val RLIMIT_RTPRIO: Int = 14

public const val RLIMIT_NLIMITS: Int = 15

public const val RUSAGE_SELF: Int = 0

public const val RUSAGE_CHILDREN: Int = -1

public const val RUSAGE_BOTH: Int = -2

public const val RUSAGE_THREAD: Int = 1

public const val FD_SETSIZE: ULong = 1024uL

public const val AF_INET: Int = 2

public const val AF_INET6: Int = 10

public const val AF_UNIX: Int = 1

public const val AF_UNSPEC: Int = 0

public const val PF_INET: Int = 2

public const val PF_INET6: Int = 10

public const val PF_UNIX: Int = 1

public const val PF_UNSPEC: Int = 0

public const val MSG_CTRUNC: Int = 8

public const val MSG_DONTROUTE: Int = 4

public const val MSG_EOR: Int = 128

public const val MSG_OOB: Int = 1

public const val MSG_PEEK: Int = 2

public const val MSG_TRUNC: Int = 32

public const val MSG_DONTWAIT: Int = 64

public const val MSG_WAITALL: Int = 256

public const val SCM_RIGHTS: Int = 1

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val SO_DEBUG: Int = 1

public const val SO_REUSEADDR: Int = 2

public const val SO_TYPE: Int = 3

public const val SO_ERROR: Int = 4

public const val SO_DONTROUTE: Int = 5

public const val SO_BROADCAST: Int = 6

public const val SO_SNDBUF: Int = 7

public const val SO_RCVBUF: Int = 8

public const val SO_KEEPALIVE: Int = 9

public const val SO_OOBINLINE: Int = 10

public const val SO_NO_CHECK: Int = 11

public const val SO_PRIORITY: Int = 12

public const val SO_LINGER: Int = 13

public const val SO_BSDCOMPAT: Int = 14

public const val SO_REUSEPORT: Int = 15

public const val SO_PASSCRED: Int = 16

public const val SO_PEERCRED: Int = 17

public const val SO_RCVLOWAT: Int = 18

public const val SO_SNDLOWAT: Int = 19

public const val SO_RCVTIMEO: Int = 20

public const val SO_SNDTIMEO: Int = 21

public const val SO_ACCEPTCONN: Int = 30

public const val SO_PEERSEC: Int = 31

public const val SO_SNDBUFFORCE: Int = 32

public const val SO_RCVBUFFORCE: Int = 33

public const val SO_PROTOCOL: Int = 38

public const val SO_DOMAIN: Int = 39

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SOCK_RAW: Int = 3

public const val SOCK_NONBLOCK: Int = 2048

public const val SOCK_CLOEXEC: Int = 524288

public const val SOCK_SEQPACKET: Int = 5

public const val SOL_SOCKET: Int = 1

public const val SOMAXCONN: Int = 128

public const val VEOF: ULong = 0uL

public const val VEOL: ULong = 1uL

public const val VEOL2: ULong = 2uL

public const val VERASE: ULong = 3uL

public const val VWERASE: ULong = 4uL

public const val VKILL: ULong = 5uL

public const val VREPRINT: ULong = 6uL

public const val VSWTC: ULong = 7uL

public const val VINTR: ULong = 8uL

public const val VQUIT: ULong = 9uL

public const val VSUSP: ULong = 10uL

public const val VSTART: ULong = 12uL

public const val VSTOP: ULong = 13uL

public const val VLNEXT: ULong = 14uL

public const val VDISCARD: ULong = 15uL

public const val VMIN: ULong = 16uL

public const val VTIME: ULong = 17uL

public const val NCCS: ULong = 32uL

public const val IGNBRK: UInt = 1u

public const val BRKINT: UInt = 2u

public const val IGNPAR: UInt = 4u

public const val PARMRK: UInt = 8u

public const val INPCK: UInt = 16u

public const val ISTRIP: UInt = 32u

public const val INLCR: UInt = 64u

public const val IGNCR: UInt = 128u

public const val ICRNL: UInt = 256u

public const val IXON: UInt = 512u

public const val IXOFF: UInt = 1024u

public const val OPOST: UInt = 1u

public const val ONLCR: UInt = 2u

public const val OLCUC: UInt = 4u

public const val OCRNL: UInt = 8u

public const val ONOCR: UInt = 16u

public const val ONLRET: UInt = 32u

public const val OFILL: UInt = 64u

public const val OFDEL: UInt = 128u

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

public const val B57600: UInt = 16u

public const val B115200: UInt = 17u

public const val B230400: UInt = 18u

public const val B460800: UInt = 19u

public const val B500000: UInt = 20u

public const val B576000: UInt = 21u

public const val B921600: UInt = 22u

public const val B1000000: UInt = 23u

public const val B1152000: UInt = 24u

public const val B1500000: UInt = 25u

public const val B2000000: UInt = 26u

public const val B2500000: UInt = 27u

public const val B3000000: UInt = 28u

public const val B3500000: UInt = 29u

public const val B4000000: UInt = 30u

public const val CSIZE: UInt = 768u

public const val CS5: UInt = 0u

public const val CS6: UInt = 256u

public const val CS7: UInt = 512u

public const val CS8: UInt = 768u

public const val CSTOPB: UInt = 1024u

public const val CREAD: UInt = 2048u

public const val PARENB: UInt = 4096u

public const val PARODD: UInt = 8192u

public const val HUPCL: UInt = 16384u

public const val CLOCAL: UInt = 32768u

public const val ISIG: UInt = 0x00000080u

public const val ICANON: UInt = 0x00000100u

public const val ECHO: UInt = 0x00000008u

public const val ECHOE: UInt = 0x00000002u

public const val ECHOK: UInt = 0x00000004u

public const val ECHONL: UInt = 0x00000010u

public const val NOFLSH: UInt = 0x8000_0000u

public const val TOSTOP: UInt = 0x00400000u

public const val IEXTEN: UInt = 0x00000400u

public const val TCOOFF: Int = 0

public const val TCOON: Int = 1

public const val TCIOFF: Int = 2

public const val TCION: Int = 3

public const val TCIFLUSH: Int = 0

public const val TCOFLUSH: Int = 1

public const val TCIOFLUSH: Int = 2

public const val TCSANOW: Int = 0

public const val TCSADRAIN: Int = 1

public const val TCSAFLUSH: Int = 2

public const val _POSIX_VDISABLE: UByte = 0u

public const val WNOHANG: Int = 1

public const val WUNTRACED: Int = 2

public const val WSTOPPED: Int = 2

public const val WEXITED: Int = 4

public const val WCONTINUED: Int = 8

public const val WNOWAIT: Int = 0x0100_0000

public const val __WNOTHREAD: Int = 0x2000_0000

public const val __WALL: Int = 0x4000_0000

public const val __WCLONE: Int = 0x8000_0000.toInt()

public const val CLOCK_REALTIME: Int = 1

public const val CLOCK_MONOTONIC: Int = 4

public const val CLOCK_PROCESS_CPUTIME_ID: Int = 2

public const val CLOCKS_PER_SEC: Long = 1_000_000

public const val _SC_ARG_MAX: Int = 0

public const val _SC_CHILD_MAX: Int = 1

public const val _SC_CLK_TCK: Int = 2

public const val _SC_NGROUPS_MAX: Int = 3

public const val _SC_OPEN_MAX: Int = 4

public const val _SC_STREAM_MAX: Int = 5

public const val _SC_TZNAME_MAX: Int = 6

public const val _SC_VERSION: Int = 29

public const val _SC_PAGESIZE: Int = 30

public const val _SC_PAGE_SIZE: Int = 30

public const val _SC_RE_DUP_MAX: Int = 44

public const val _SC_NPROCESSORS_CONF: Int = 57

public const val _SC_NPROCESSORS_ONLN: Int = 58

public const val _SC_GETGR_R_SIZE_MAX: Int = 69

public const val _SC_GETPW_R_SIZE_MAX: Int = 70

public const val _SC_LOGIN_NAME_MAX: Int = 71

public const val _SC_TTY_NAME_MAX: Int = 72

public const val _SC_SYMLOOP_MAX: Int = 173

public const val _SC_HOST_NAME_MAX: Int = 180

public const val _SC_SIGQUEUE_MAX: Int = 190

public const val _SC_REALTIME_SIGNALS: Int = 191

public const val _CS_PATH: Int = 0

public const val _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: Int = 1

public const val _CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: Int = 4

public const val _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: Int = 5

public const val _CS_POSIX_V6_ILP32_OFF32_CFLAGS: Int = 1116

public const val _CS_POSIX_V6_ILP32_OFF32_LDFLAGS: Int = 1117

public const val _CS_POSIX_V6_ILP32_OFF32_LIBS: Int = 1118

public const val _CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: Int = 1119

public const val _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: Int = 1120

public const val _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: Int = 1121

public const val _CS_POSIX_V6_ILP32_OFFBIG_LIBS: Int = 1122

public const val _CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: Int = 1123

public const val _CS_POSIX_V6_LP64_OFF64_CFLAGS: Int = 1124

public const val _CS_POSIX_V6_LP64_OFF64_LDFLAGS: Int = 1125

public const val _CS_POSIX_V6_LP64_OFF64_LIBS: Int = 1126

public const val _CS_POSIX_V6_LP64_OFF64_LINTFLAGS: Int = 1127

public const val _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: Int = 1128

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: Int = 1129

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LIBS: Int = 1130

public const val _CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: Int = 1131

public const val _CS_POSIX_V7_ILP32_OFF32_CFLAGS: Int = 1132

public const val _CS_POSIX_V7_ILP32_OFF32_LDFLAGS: Int = 1133

public const val _CS_POSIX_V7_ILP32_OFF32_LIBS: Int = 1134

public const val _CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: Int = 1135

public const val _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: Int = 1136

public const val _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: Int = 1137

public const val _CS_POSIX_V7_ILP32_OFFBIG_LIBS: Int = 1138

public const val _CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: Int = 1139

public const val _CS_POSIX_V7_LP64_OFF64_CFLAGS: Int = 1140

public const val _CS_POSIX_V7_LP64_OFF64_LDFLAGS: Int = 1141

public const val _CS_POSIX_V7_LP64_OFF64_LIBS: Int = 1142

public const val _CS_POSIX_V7_LP64_OFF64_LINTFLAGS: Int = 1143

public const val _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: Int = 1144

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: Int = 1145

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LIBS: Int = 1146

public const val _CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: Int = 1147

public const val F_OK: Int = 0

public const val R_OK: Int = 4

public const val W_OK: Int = 2

public const val X_OK: Int = 1

public const val BUFSIZ: UInt = 1024u

public const val _IOFBF: Int = 0

public const val _IOLBF: Int = 1

public const val _IONBF: Int = 2

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val _PC_LINK_MAX: Int = 0

public const val _PC_MAX_CANON: Int = 1

public const val _PC_MAX_INPUT: Int = 2

public const val _PC_NAME_MAX: Int = 3

public const val _PC_PATH_MAX: Int = 4

public const val _PC_PIPE_BUF: Int = 5

public const val _PC_CHOWN_RESTRICTED: Int = 6

public const val _PC_NO_TRUNC: Int = 7

public const val _PC_VDISABLE: Int = 8

public const val _PC_SYNC_IO: Int = 9

public const val _PC_ASYNC_IO: Int = 10

public const val _PC_PRIO_IO: Int = 11

public const val _PC_SOCK_MAXBUF: Int = 12

public const val _PC_FILESIZEBITS: Int = 13

public const val _PC_REC_INCR_XFER_SIZE: Int = 14

public const val _PC_REC_MAX_XFER_SIZE: Int = 15

public const val _PC_REC_MIN_XFER_SIZE: Int = 16

public const val _PC_REC_XFER_ALIGN: Int = 17

public const val _PC_ALLOC_SIZE_MIN: Int = 18

public const val _PC_SYMLINK_MAX: Int = 19

public const val _PC_2_SYMLINKS: Int = 20

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2

public const val RENAME_NOREPLACE: UInt = 1u
