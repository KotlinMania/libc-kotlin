package io.github.kotlinmania.libc

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias WcharT = Int

public typealias BlkcntT = CUlong

public typealias BlksizeT = CLong

public typealias ClockT = CLong

public typealias ClockidT = CInt

public typealias DevT = CUlonglong

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = CUlonglong

public typealias ModeT = CInt

public typealias NfdsT = CUlong

public typealias NlinkT = CUlong

public typealias OffT = CLonglong

public typealias PthreadT = COpaquePointer?

// Must be Int due to library/std/sysCommon/threadLocal.rs,
// should technically be *mut cVoid
public typealias PthreadKeyT = Int

public typealias RlimT = CUlonglong

public typealias SaFamilyT = UShort

public typealias SemT = COpaquePointer?

public typealias SigsetT = CUlonglong

public typealias SocklenT = UInt

public typealias SpeedT = UInt

public typealias SusecondsT = CInt

public typealias TcflagT = UInt

public typealias TimeT = CLonglong

public typealias IdT = CUint

public typealias UidT = CInt

public typealias GidT = CInt

public val PTHREAD_ATTR_SIZE: Int = 32

public val PTHREAD_RWLOCKATTR_SIZE: Int = 1

public val PTHREAD_RWLOCK_SIZE: Int = 4

public val PTHREAD_BARRIER_SIZE: Int = 24

public val PTHREAD_BARRIERATTR_SIZE: Int = 4

public val PTHREAD_CONDATTR_SIZE: Int = 8

public val PTHREAD_COND_SIZE: Int = 8

public val PTHREAD_MUTEX_SIZE: Int = 12

public val PTHREAD_MUTEXATTR_SIZE: Int = 20

public val PTHREAD_ONCE_SIZE: Int = 4

public val PTHREAD_SPINLOCK_SIZE: Int = 4

public val UTSLENGTH: Int = 65

// limits.h
public val PATH_MAX: CInt = 4096

// fcntl.h
public val F_GETLK: CInt = 5

public val F_SETLK: CInt = 6

public val F_SETLKW: CInt = 7

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val AT_FDCWD: CInt = -100

// Note(redox): relibc {
public val RTLD_DEFAULT: COpaquePointer? = null

// }
// dlfcn.h
public val RTLD_LAZY: CInt = 0x0001

public val RTLD_NOW: CInt = 0x0002

public val RTLD_GLOBAL: CInt = 0x0100

public val RTLD_LOCAL: CInt = 0x0000

// errno.h
public val EPERM: CInt = 1

// Operation not permitted
public val ENOENT: CInt = 2

// No such file or directory
public val ESRCH: CInt = 3

// No such process
public val EINTR: CInt = 4

// Interrupted system call
public val EIO: CInt = 5

// I/O error
public val ENXIO: CInt = 6

// No such device or address
public val E2BIG: CInt = 7

// Argument list too long
public val ENOEXEC: CInt = 8

// Exec format error
public val EBADF: CInt = 9

// Bad file number
public val ECHILD: CInt = 10

// No child processes
public val EAGAIN: CInt = 11

// Try again
public val ENOMEM: CInt = 12

// Out of memory
public val EACCES: CInt = 13

// Permission denied
public val EFAULT: CInt = 14

// Bad address
public val ENOTBLK: CInt = 15

// Block device required
public val EBUSY: CInt = 16

// Device or resource busy
public val EEXIST: CInt = 17

// File exists
public val EXDEV: CInt = 18

// Cross-device link
public val ENODEV: CInt = 19

// No such device
public val ENOTDIR: CInt = 20

// Not a directory
public val EISDIR: CInt = 21

// Is a directory
public val EINVAL: CInt = 22

// Invalid argument
public val ENFILE: CInt = 23

// File table overflow
public val EMFILE: CInt = 24

// Too many open files
public val ENOTTY: CInt = 25

// Not a typewriter
public val ETXTBSY: CInt = 26

// Text file busy
public val EFBIG: CInt = 27

// File too large
public val ENOSPC: CInt = 28

// No space left on device
public val ESPIPE: CInt = 29

// Illegal seek
public val EROFS: CInt = 30

// Read-only file system
public val EMLINK: CInt = 31

// Too many links
public val EPIPE: CInt = 32

// Broken pipe
public val EDOM: CInt = 33

// Math argument out of domain of func
public val ERANGE: CInt = 34

// Math result not representable
public val EDEADLK: CInt = 35

// Resource deadlock would occur
public val ENAMETOOLONG: CInt = 36

// File name too long
public val ENOLCK: CInt = 37

// No record locks available
public val ENOSYS: CInt = 38

// Function not implemented
public val ENOTEMPTY: CInt = 39

// Directory not empty
public val ELOOP: CInt = 40

// Too many symbolic links encountered
public val EWOULDBLOCK: CInt = 41

// Operation would block
public val ENOMSG: CInt = 42

// No message of desired type
public val EIDRM: CInt = 43

// Identifier removed
public val ECHRNG: CInt = 44

// Channel number out of range
public val EL2NSYNC: CInt = 45

// Level 2 not synchronized
public val EL3HLT: CInt = 46

// Level 3 halted
public val EL3RST: CInt = 47

// Level 3 reset
public val ELNRNG: CInt = 48

// Link number out of range
public val EUNATCH: CInt = 49

// Protocol driver not attached
public val ENOCSI: CInt = 50

// No CSI structure available
public val EL2HLT: CInt = 51

// Level 2 halted
public val EBADE: CInt = 52

// Invalid exchange
public val EBADR: CInt = 53

// Invalid request descriptor
public val EXFULL: CInt = 54

// Exchange full
public val ENOANO: CInt = 55

// No anode
public val EBADRQC: CInt = 56

// Invalid request code
public val EBADSLT: CInt = 57

// Invalid slot
public val EDEADLOCK: CInt = 58

// Resource deadlock would occur
public val EBFONT: CInt = 59

// Bad font file format
public val ENOSTR: CInt = 60

// Device not a stream
public val ENODATA: CInt = 61

// No data available
public val ETIME: CInt = 62

// Timer expired
public val ENOSR: CInt = 63

// Out of streams resources
public val ENONET: CInt = 64

// Machine is not on the network
public val ENOPKG: CInt = 65

// Package not installed
public val EREMOTE: CInt = 66

// Object is remote
public val ENOLINK: CInt = 67

// Link has been severed
public val EADV: CInt = 68

// Advertise error
public val ESRMNT: CInt = 69

// Srmount error
public val ECOMM: CInt = 70

// Communication error on send
public val EPROTO: CInt = 71

// Protocol error
public val EMULTIHOP: CInt = 72

// Multihop attempted
public val EDOTDOT: CInt = 73

// RFS specific error
public val EBADMSG: CInt = 74

// Not a data message
public val EOVERFLOW: CInt = 75

// Value too large for defined data type
public val ENOTUNIQ: CInt = 76

// Name not unique on network
public val EBADFD: CInt = 77

// File descriptor in bad state
public val EREMCHG: CInt = 78

// Remote address changed
public val ELIBACC: CInt = 79

// Can not access a needed shared library
public val ELIBBAD: CInt = 80

// Accessing a corrupted shared library
public val ELIBSCN: CInt = 81

// .lib section in a.out corrupted
// Attempting to link in too many shared libraries
public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

// Cannot exec a shared library directly
public val EILSEQ: CInt = 84

// Illegal byte sequence
// Interrupted system call should be restarted
public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

// Streams pipe error
public val EUSERS: CInt = 87

// Too many users
public val ENOTSOCK: CInt = 88

// Socket operation on non-socket
public val EDESTADDRREQ: CInt = 89

// Destination address required
public val EMSGSIZE: CInt = 90

// Message too long
public val EPROTOTYPE: CInt = 91

// Protocol wrong type for socket
public val ENOPROTOOPT: CInt = 92

// Protocol not available
public val EPROTONOSUPPORT: CInt = 93

// Protocol not supported
public val ESOCKTNOSUPPORT: CInt = 94

// Socket type not supported
// Operation not supported on transport endpoint
public val EOPNOTSUPP: CInt = 95

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 96

// Protocol family not supported
// Address family not supported by protocol
public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

// Address already in use
public val EADDRNOTAVAIL: CInt = 99

// Cannot assign requested address
public val ENETDOWN: CInt = 100

// Network is down
public val ENETUNREACH: CInt = 101

// Network is unreachable
// Network dropped connection because of reset
public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

// Software caused connection abort
public val ECONNRESET: CInt = 104

// Connection reset by peer
public val ENOBUFS: CInt = 105

// No buffer space available
public val EISCONN: CInt = 106

// Transport endpoint is already connected
public val ENOTCONN: CInt = 107

// Transport endpoint is not connected
// Cannot send after transport endpoint shutdown
public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

// Too many references: cannot splice
public val ETIMEDOUT: CInt = 110

// Connection timed out
public val ECONNREFUSED: CInt = 111

// Connection refused
public val EHOSTDOWN: CInt = 112

// Host is down
public val EHOSTUNREACH: CInt = 113

// No route to host
public val EALREADY: CInt = 114

// Operation already in progress
public val EINPROGRESS: CInt = 115

// Operation now in progress
public val ESTALE: CInt = 116

// Stale NFS file handle
public val EUCLEAN: CInt = 117

// Structure needs cleaning
public val ENOTNAM: CInt = 118

// Not a XENIX named type file
public val ENAVAIL: CInt = 119

// No XENIX semaphores available
public val EISNAM: CInt = 120

// Is a named type file
public val EREMOTEIO: CInt = 121

// Remote I/O error
public val EDQUOT: CInt = 122

// Quota exceeded
public val ENOMEDIUM: CInt = 123

// No medium found
public val EMEDIUMTYPE: CInt = 124

// Wrong medium type
public val ECANCELED: CInt = 125

// Operation Canceled
public val ENOKEY: CInt = 126

// Required key not available
public val EKEYEXPIRED: CInt = 127

// Key has expired
public val EKEYREVOKED: CInt = 128

// Key has been revoked
public val EKEYREJECTED: CInt = 129

// Key was rejected by service
public val EOWNERDEAD: CInt = 130

// Owner died
public val ENOTRECOVERABLE: CInt = 131

// State not recoverable
// fcntl.h
public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

// Note(redox): relibc {
public val F_DUPFD_CLOEXEC: CInt = F_DUPFD

// }
public val FD_CLOEXEC: CInt = 0x01000000

public val O_RDONLY: CInt = 0x00010000

public val O_WRONLY: CInt = 0x00020000

public val O_RDWR: CInt = 0x00030000

public val O_ACCMODE: CInt = 0x00030000

public val O_NONBLOCK: CInt = 0x00040000

public val O_NDELAY: CInt = O_NONBLOCK

public val O_APPEND: CInt = 0x00080000

public val O_SHLOCK: CInt = 0x00100000

public val O_EXLOCK: CInt = 0x00200000

public val O_ASYNC: CInt = 0x00400000

public val O_FSYNC: CInt = 0x00800000

public val O_CLOEXEC: CInt = 0x01000000

public val O_CREAT: CInt = 0x02000000

public val O_TRUNC: CInt = 0x04000000

public val O_EXCL: CInt = 0x08000000

public val O_DIRECTORY: CInt = 0x10000000

public val O_PATH: CInt = 0x20000000

public val O_SYMLINK: CInt = 0x40000000

// Negative to allow it to be used as int
// Note(redox): Fix negative values missing from includes
public val O_NOFOLLOW: CInt = -0x80000000

public val O_NOCTTY: CInt = 0x00000200

// locale.h
public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MESSAGES: CInt = 3

public val LC_MONETARY: CInt = 4

public val LC_NUMERIC: CInt = 5

public val LC_TIME: CInt = 6

// netdb.h
public val AI_PASSIVE: CInt = 0x0001

public val AI_CANONNAME: CInt = 0x0002

public val AI_NUMERICHOST: CInt = 0x0004

public val AI_V4MAPPED: CInt = 0x0008

public val AI_ALL: CInt = 0x0010

public val AI_ADDRCONFIG: CInt = 0x0020

public val AI_NUMERICSERV: CInt = 0x0400

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

public val NI_NUMERICHOST: CInt = 0x0001

public val NI_NUMERICSERV: CInt = 0x0002

public val NI_NOFQDN: CInt = 0x0004

public val NI_NAMEREQD: CInt = 0x0008

public val NI_DGRAM: CInt = 0x0010

// netinet/in.h
// Note(redox): relibc {
public val IP_TTL: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_IF: CInt = 17

public val IPV6_MULTICAST_HOPS: CInt = 18

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_ADD_MEMBERSHIP: CInt = 20

public val IPV6_DROP_MEMBERSHIP: CInt = 21

public val IPV6_V6ONLY: CInt = 26

public val IP_MULTICAST_IF: CInt = 32

public val IP_MULTICAST_TTL: CInt = 33

public val IP_MULTICAST_LOOP: CInt = 34

public val IP_ADD_MEMBERSHIP: CInt = 35

public val IP_DROP_MEMBERSHIP: CInt = 36

public val IP_TOS: CInt = 1

public val IP_RECVTOS: CInt = 2

public val IPPROTO_IGMP: CInt = 2

public val IPPROTO_PUP: CInt = 12

public val IPPROTO_IDP: CInt = 22

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 255

// }
// netinet/tcp.h
public val TCP_NODELAY: CInt = 1

// Note(redox): relibc {
public val TCP_KEEPIDLE: CInt = 1

// }
// poll.h
public val POLLIN: CShort = 0x001

public val POLLPRI: CShort = 0x002

public val POLLOUT: CShort = 0x004

public val POLLERR: CShort = 0x008

public val POLLHUP: CShort = 0x010

public val POLLNVAL: CShort = 0x020

public val POLLRDNORM: CShort = 0x040

public val POLLRDBAND: CShort = 0x080

public val POLLWRNORM: CShort = 0x100

public val POLLWRBAND: CShort = 0x200

// pthread.h
public val PTHREAD_MUTEX_DEFAULT: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 2

public val PTHREAD_MUTEX_RECURSIVE: CInt = 3

public val PTHREAD_MUTEX_ROBUST: CInt = 0

public val PTHREAD_MUTEX_STALLED: CInt = 1

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthreadMutexT(bytes = List(PTHREAD_MUTEX_SIZE) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = pthreadCondT(bytes = List(PTHREAD_COND_SIZE) { 0 })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthreadRwlockT(bytes = List(PTHREAD_RWLOCK_SIZE) { 0 })

public val PTHREAD_STACK_MIN: SizeT = 4096uL

// signal.h
public val SIG_BLOCK: CInt = 0

public val SIG_UNBLOCK: CInt = 1

public val SIG_SETMASK: CInt = 2

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGBUS: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGUSR1: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGUSR2: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGSTKFLT: CInt = 16

public val SIGCHLD: CInt = 17

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGURG: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 29

public val SIGPWR: CInt = 30

public val SIGSYS: CInt = 31

public val NSIG: CInt = 32

public val SA_NOCLDWAIT: CUlong = 0x00000002uL

public val SA_RESTORER: CUlong = 0x00000004uL

// Note(redox): remove after relibc removes it
public val SA_SIGINFO: CUlong = 0x02000000uL

public val SA_ONSTACK: CUlong = 0x04000000uL

public val SA_RESTART: CUlong = 0x08000000uL

public val SA_NODEFER: CUlong = 0x10000000uL

public val SA_RESETHAND: CUlong = 0x20000000uL

public val SA_NOCLDSTOP: CUlong = 0x40000000uL

// sys/file.h
public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

// sys/epoll.h
public val EPOLL_CLOEXEC: CInt = 0x01000000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_DEL: CInt = 2

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLLIN: CInt = 0x001

public val EPOLLPRI: CInt = 0x002

public val EPOLLOUT: CInt = 0x004

public val EPOLLERR: CInt = 0x008

public val EPOLLHUP: CInt = 0x010

public val EPOLLNVAL: CInt = 0x020

public val EPOLLRDNORM: CInt = 0x040

public val EPOLLRDBAND: CInt = 0x080

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLEXCLUSIVE: CInt = 1 shl 28

public val EPOLLWAKEUP: CInt = 1 shl 29

public val EPOLLONESHOT: CInt = 1 shl 30

public val EPOLLET: CInt = 1 shl 31

// sys/stat.h
public val S_IFMT: CInt = 61440

public val S_IFDIR: CInt = 16384

public val S_IFCHR: CInt = 8192

public val S_IFBLK: CInt = 24576

public val S_IFREG: CInt = 32768

public val S_IFIFO: CInt = 4096

public val S_IFLNK: CInt = 40960

public val S_IFSOCK: CInt = 49152

public val S_IRWXU: CInt = 448

public val S_IRUSR: CInt = 256

public val S_IWUSR: CInt = 128

public val S_IXUSR: CInt = 64

public val S_IRWXG: CInt = 56

public val S_IRGRP: CInt = 32

public val S_IWGRP: CInt = 16

public val S_IXGRP: CInt = 8

public val S_IRWXO: CInt = 7

public val S_IROTH: CInt = 4

public val S_IWOTH: CInt = 2

public val S_IXOTH: CInt = 1

// stdlib.h
public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

// sys/ioctl.h
// Note(redox): relibc {
public val FIONREAD: CUlong = 0x541BuL

public val FIONBIO: CUlong = 0x5421uL

public val FIOCLEX: CUlong = 0x5451uL

// }
public val TCGETS: CUlong = 0x5401uL

public val TCSETS: CUlong = 0x5402uL

public val TCFLSH: CUlong = 0x540BuL

public val TIOCSCTTY: CUlong = 0x540EuL

public val TIOCGPGRP: CUlong = 0x540FuL

public val TIOCSPGRP: CUlong = 0x5410uL

public val TIOCGWINSZ: CUlong = 0x5413uL

public val TIOCSWINSZ: CUlong = 0x5414uL

// sys/mman.h
public val PROT_NONE: CInt = 0x0000

public val PROT_READ: CInt = 0x0004

public val PROT_WRITE: CInt = 0x0002

public val PROT_EXEC: CInt = 0x0001

public val MADV_NORMAL: CInt = 0

public val MADV_RANDOM: CInt = 1

public val MADV_SEQUENTIAL: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_ANON: CInt = 0x0020

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_FIXED: CInt = 0x0004

public val MAP_FAILED: COpaquePointer? = (0.inv() as Any?)

public val MS_ASYNC: CInt = 0x0001

public val MS_INVALIDATE: CInt = 0x0002

public val MS_SYNC: CInt = 0x0004

// sys/resource.h
public val RLIM_INFINITY: RlimT = 0uL.inv()

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_RSS: CInt = 5

public val RLIMIT_NPROC: CInt = 6

public val RLIMIT_NOFILE: CInt = 7

public val RLIMIT_MEMLOCK: CInt = 8

public val RLIMIT_AS: CInt = 9

public val RLIMIT_LOCKS: CInt = 10

public val RLIMIT_SIGPENDING: CInt = 11

public val RLIMIT_MSGQUEUE: CInt = 12

public val RLIMIT_NICE: CInt = 13

public val RLIMIT_RTPRIO: CInt = 14

public val RLIMIT_NLIMITS: CInt = 15

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val RUSAGE_BOTH: CInt = -2

public val RUSAGE_THREAD: CInt = 1

// sys/select.h
public val FD_SETSIZE: Int = 1024

// sys/socket.h
public val AF_INET: CInt = 2

public val AF_INET6: CInt = 10

public val AF_UNIX: CInt = 1

public val AF_UNSPEC: CInt = 0

public val PF_INET: CInt = 2

public val PF_INET6: CInt = 10

public val PF_UNIX: CInt = 1

public val PF_UNSPEC: CInt = 0

public val MSG_CTRUNC: CInt = 8

public val MSG_DONTROUTE: CInt = 4

public val MSG_EOR: CInt = 128

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_TRUNC: CInt = 32

public val MSG_DONTWAIT: CInt = 64

public val MSG_WAITALL: CInt = 256

public val SCM_RIGHTS: CInt = 1

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SO_DEBUG: CInt = 1

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

public val SO_RCVTIMEO: CInt = 20

public val SO_SNDTIMEO: CInt = 21

public val SO_ACCEPTCONN: CInt = 30

public val SO_PEERSEC: CInt = 31

public val SO_SNDBUFFORCE: CInt = 32

public val SO_RCVBUFFORCE: CInt = 33

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_NONBLOCK: CInt = 2048

public val SOCK_CLOEXEC: CInt = 524288

public val SOCK_SEQPACKET: CInt = 5

public val SOL_SOCKET: CInt = 1

public val SOMAXCONN: CInt = 128

// sys/termios.h
public val VEOF: Int = 0

public val VEOL: Int = 1

public val VEOL2: Int = 2

public val VERASE: Int = 3

public val VWERASE: Int = 4

public val VKILL: Int = 5

public val VREPRINT: Int = 6

public val VSWTC: Int = 7

public val VINTR: Int = 8

public val VQUIT: Int = 9

public val VSUSP: Int = 10

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VLNEXT: Int = 14

public val VDISCARD: Int = 15

public val VMIN: Int = 16

public val VTIME: Int = 17

public val NCCS: Int = 32

public val IGNBRK: TcflagT = 1u

public val BRKINT: TcflagT = 2u

public val IGNPAR: TcflagT = 4u

public val PARMRK: TcflagT = 8u

public val INPCK: TcflagT = 16u

public val ISTRIP: TcflagT = 32u

public val INLCR: TcflagT = 64u

public val IGNCR: TcflagT = 128u

public val ICRNL: TcflagT = 256u

public val IXON: TcflagT = 512u

public val IXOFF: TcflagT = 1024u

public val OPOST: TcflagT = 1u

public val ONLCR: TcflagT = 2u

public val OLCUC: TcflagT = 4u

public val OCRNL: TcflagT = 8u

public val ONOCR: TcflagT = 16u

public val ONLRET: TcflagT = 32u

public val OFILL: TcflagT = 64u

public val OFDEL: TcflagT = 128u

public val B0: SpeedT = 0u

public val B50: SpeedT = 1u

public val B75: SpeedT = 2u

public val B110: SpeedT = 3u

public val B134: SpeedT = 4u

public val B150: SpeedT = 5u

public val B200: SpeedT = 6u

public val B300: SpeedT = 7u

public val B600: SpeedT = 8u

public val B1200: SpeedT = 9u

public val B1800: SpeedT = 10u

public val B2400: SpeedT = 11u

public val B4800: SpeedT = 12u

public val B9600: SpeedT = 13u

public val B19200: SpeedT = 14u

public val B38400: SpeedT = 15u

public val B57600: SpeedT = 16u

public val B115200: SpeedT = 17u

public val B230400: SpeedT = 18u

public val B460800: SpeedT = 19u

public val B500000: SpeedT = 20u

public val B576000: SpeedT = 21u

public val B921600: SpeedT = 22u

public val B1000000: SpeedT = 23u

public val B1152000: SpeedT = 24u

public val B1500000: SpeedT = 25u

public val B2000000: SpeedT = 26u

public val B2500000: SpeedT = 27u

public val B3000000: SpeedT = 28u

public val B3500000: SpeedT = 29u

public val B4000000: SpeedT = 30u

public val CSIZE: TcflagT = 768u

public val CS5: TcflagT = 0u

public val CS6: TcflagT = 256u

public val CS7: TcflagT = 512u

public val CS8: TcflagT = 768u

public val CSTOPB: TcflagT = 1024u

public val CREAD: TcflagT = 2048u

public val PARENB: TcflagT = 4096u

public val PARODD: TcflagT = 8192u

public val HUPCL: TcflagT = 16384u

public val CLOCAL: TcflagT = 32768u

public val ISIG: TcflagT = 0x00000080u

public val ICANON: TcflagT = 0x00000100u

public val ECHO: TcflagT = 0x00000008u

public val ECHOE: TcflagT = 0x00000002u

public val ECHOK: TcflagT = 0x00000004u

public val ECHONL: TcflagT = 0x00000010u

public val NOFLSH: TcflagT = 0x80000000u

public val TOSTOP: TcflagT = 0x00400000u

public val IEXTEN: TcflagT = 0x00000400u

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

public val POSIX_VDISABLE: CcT = 0u

// sys/wait.h
public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WSTOPPED: CInt = 2

public val WEXITED: CInt = 4

public val WCONTINUED: CInt = 8

public val WNOWAIT: CInt = 0x01000000

public val WNOTHREAD: CInt = 0x20000000

public val WALL: CInt = 0x40000000

public val WCLONE: CInt = 0x80000000

// time.h
public val CLOCK_REALTIME: CInt = 1

public val CLOCK_MONOTONIC: CInt = 4

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2

public val CLOCKS_PER_SEC: ClockT = 1000000L

// unistd.h
// POSIX.1 {
public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

// ...
public val SC_VERSION: CInt = 29

public val SC_PAGESIZE: CInt = 30

public val SC_PAGE_SIZE: CInt = 30

// ...
public val SC_RE_DUP_MAX: CInt = 44

public val SC_NPROCESSORS_CONF: CInt = 57

public val SC_NPROCESSORS_ONLN: CInt = 58

// ...
public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

// ...
public val SC_SYMLOOP_MAX: CInt = 173

// ...
public val SC_HOST_NAME_MAX: CInt = 180

// ...
public val SC_SIGQUEUE_MAX: CInt = 190

public val SC_REALTIME_SIGNALS: CInt = 191

// } POSIX.1
// confstr
public val CS_PATH: CInt = 0

public val CS_POSIX_V6_WIDTH_RESTRICTED_ENVS: CInt = 1

public val CS_POSIX_V5_WIDTH_RESTRICTED_ENVS: CInt = 4

public val CS_POSIX_V7_WIDTH_RESTRICTED_ENVS: CInt = 5

public val CS_POSIX_V6_ILP32_OFF32_CFLAGS: CInt = 1116

public val CS_POSIX_V6_ILP32_OFF32_LDFLAGS: CInt = 1117

public val CS_POSIX_V6_ILP32_OFF32_LIBS: CInt = 1118

public val CS_POSIX_V6_ILP32_OFF32_LINTFLAGS: CInt = 1119

public val CS_POSIX_V6_ILP32_OFFBIG_CFLAGS: CInt = 1120

public val CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS: CInt = 1121

public val CS_POSIX_V6_ILP32_OFFBIG_LIBS: CInt = 1122

public val CS_POSIX_V6_ILP32_OFFBIG_LINTFLAGS: CInt = 1123

public val CS_POSIX_V6_LP64_OFF64_CFLAGS: CInt = 1124

public val CS_POSIX_V6_LP64_OFF64_LDFLAGS: CInt = 1125

public val CS_POSIX_V6_LP64_OFF64_LIBS: CInt = 1126

public val CS_POSIX_V6_LP64_OFF64_LINTFLAGS: CInt = 1127

public val CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS: CInt = 1128

public val CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS: CInt = 1129

public val CS_POSIX_V6_LPBIG_OFFBIG_LIBS: CInt = 1130

public val CS_POSIX_V6_LPBIG_OFFBIG_LINTFLAGS: CInt = 1131

public val CS_POSIX_V7_ILP32_OFF32_CFLAGS: CInt = 1132

public val CS_POSIX_V7_ILP32_OFF32_LDFLAGS: CInt = 1133

public val CS_POSIX_V7_ILP32_OFF32_LIBS: CInt = 1134

public val CS_POSIX_V7_ILP32_OFF32_LINTFLAGS: CInt = 1135

public val CS_POSIX_V7_ILP32_OFFBIG_CFLAGS: CInt = 1136

public val CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS: CInt = 1137

public val CS_POSIX_V7_ILP32_OFFBIG_LIBS: CInt = 1138

public val CS_POSIX_V7_ILP32_OFFBIG_LINTFLAGS: CInt = 1139

public val CS_POSIX_V7_LP64_OFF64_CFLAGS: CInt = 1140

public val CS_POSIX_V7_LP64_OFF64_LDFLAGS: CInt = 1141

public val CS_POSIX_V7_LP64_OFF64_LIBS: CInt = 1142

public val CS_POSIX_V7_LP64_OFF64_LINTFLAGS: CInt = 1143

public val CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS: CInt = 1144

public val CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS: CInt = 1145

public val CS_POSIX_V7_LPBIG_OFFBIG_LIBS: CInt = 1146

public val CS_POSIX_V7_LPBIG_OFFBIG_LINTFLAGS: CInt = 1147

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

// stdio.h
public val BUFSIZ: CUint = 1024u

public val IOFBF: CInt = 0

public val IOLBF: CInt = 1

public val IONBF: CInt = 2

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_SYNC_IO: CInt = 9

public val PC_ASYNC_IO: CInt = 10

public val PC_PRIO_IO: CInt = 11

public val PC_SOCK_MAXBUF: CInt = 12

public val PC_FILESIZEBITS: CInt = 13

public val PC_REC_INCR_XFER_SIZE: CInt = 14

public val PC_REC_MAX_XFER_SIZE: CInt = 15

public val PC_REC_MIN_XFER_SIZE: CInt = 16

public val PC_REC_XFER_ALIGN: CInt = 17

public val PC_ALLOC_SIZE_MIN: CInt = 18

public val PC_SYMLINK_MAX: CInt = 19

public val PC_2_SYMLINKS: CInt = 20

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val RENAME_NOREPLACE: CUint = 1u

// errno.h
public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("strerror_r", -1, longArrayOf(errnum.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

// dirent.h
public fun dirfd(dirp: DIR?): CInt {
    return LibcDynamicFfi.invoke("dirfd", -1, longArrayOf(dirp?.handle ?: 0L)).toInt()
}

// unistd.h
public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun getdtablesize(): CInt {
    return LibcDynamicFfi.invoke("getdtablesize", -1, longArrayOf()).toInt()
}

public fun getresgid(rgid: CInt?, egid: CInt?, sgid: CInt?): CInt {
    val __slot_0 = if (rgid == null) 0L else LibcDynamicFfi.allocScalarSlot(rgid.toLong())
    val __slot_1 = if (egid == null) 0L else LibcDynamicFfi.allocScalarSlot(egid.toLong())
    val __slot_2 = if (sgid == null) 0L else LibcDynamicFfi.allocScalarSlot(sgid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresgid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getresuid(ruid: CInt?, euid: CInt?, suid: CInt?): CInt {
    val __slot_0 = if (ruid == null) 0L else LibcDynamicFfi.allocScalarSlot(ruid.toLong())
    val __slot_1 = if (euid == null) 0L else LibcDynamicFfi.allocScalarSlot(euid.toLong())
    val __slot_2 = if (suid == null) 0L else LibcDynamicFfi.allocScalarSlot(suid.toLong())
    try {
        return LibcDynamicFfi.invoke("getresuid", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt {
    return LibcDynamicFfi.invoke("setresgid", -1, longArrayOf(rgid.toLong(), egid.toLong(), sgid.toLong())).toInt()
}

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt {
    return LibcDynamicFfi.invoke("setresuid", -1, longArrayOf(ruid.toLong(), euid.toLong(), suid.toLong())).toInt()
}

// grp.h
public fun getgrent(): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun endgrent() {
    LibcDynamicFfi.invoke("endgrent", -1, longArrayOf())
}

public fun getgrgid(gid: GidT): Group? {
    val rawRet = LibcDynamicFfi.invoke("getgrgid", -1, longArrayOf(gid.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getgrgid_r", -1, longArrayOf(gid.toLong(), grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

public fun getgrnam(name: String?): Group? {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("getgrnam", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getgrnam_r", -1, longArrayOf(__cstr_0, grp?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getgrouplist(user: String?, group: GidT, groups: CInt?, ngroups: CInt?): CInt {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    val __slot_2 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    val __slot_3 = if (ngroups == null) 0L else LibcDynamicFfi.allocScalarSlot(ngroups.toLong())
    try {
        return LibcDynamicFfi.invoke("getgrouplist", -1, longArrayOf(__cstr_0, group.toLong(), __slot_2, __slot_3)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

// malloc.h
public fun memalign(align: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memalign", -1, longArrayOf(align.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// netdb.h
public fun getnameinfo(addr: Sockaddr?, addrlen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getnameinfo", -1, longArrayOf(addr?.value ?: 0L, addrlen.toLong(), host?.value ?: 0L, hostlen.toLong(), serv?.value ?: 0L, servlen.toLong(), flags.toLong())).toInt()
}

// pthread.h
public fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt {
    return LibcDynamicFfi.invoke("pthread_atfork", -1, longArrayOf(prepare?.value ?: 0L, parent?.value ?: 0L, child?.value ?: 0L)).toInt()
}

public fun pthreadCreate(tid: COpaquePointer?, attr: PthreadAttrT?, start: PthreadCreateStartCallback, arg: COpaquePointer?): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(tid?.value ?: 0L, attr?.value ?: 0L, __scratch_2, arg?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

// pty.h
public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// pwd.h
public fun getpwent(): Passwd? {
    val rawRet = LibcDynamicFfi.invoke("getpwent", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setpwent() {
    LibcDynamicFfi.invoke("setpwent", -1, longArrayOf())
}

public fun endpwent() {
    LibcDynamicFfi.invoke("endpwent", -1, longArrayOf())
}

public fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("getpwnam_r", -1, longArrayOf(__cstr_0, pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getpwuid_r", -1, longArrayOf(uid.toLong(), pwd?.value ?: 0L, buf?.value ?: 0L, buflen.toLong(), result?.value ?: 0L)).toInt()
}

// signal.h
public fun pthreadSigmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_sigmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadCancel(thread: PthreadT): CInt {
    return LibcDynamicFfi.invoke("pthread_cancel", -1, longArrayOf(thread?.value ?: 0L)).toInt()
}

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_kill", -1, longArrayOf(thread?.value ?: 0L, sig.toLong())).toInt()
}

public fun sigtimedwait(set: CUlonglong?, sig: SiginfoT?, timeout: Timespec?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(__slot_0, sig?.value ?: 0L, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigwait(set: CUlonglong?, sig: CInt?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

// stdlib.h
public fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("getsubopt", -1, longArrayOf(optionp?.value ?: 0L, tokens?.value ?: 0L, valuep?.value ?: 0L)).toInt()
}

public fun mkostemp(template: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemp", -1, longArrayOf(template?.value ?: 0L, flags.toLong())).toInt()
}

public fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("mkostemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong(), flags.toLong())).toInt()
}

public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// stdio.h
public fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt {
    val __cstr_1 = if (oldpath == null) 0L else LibcDynamicFfi.allocUtf8CString(oldpath)
    val __cstr_3 = if (newpath == null) 0L else LibcDynamicFfi.allocUtf8CString(newpath)
    try {
        return LibcDynamicFfi.invoke("renameat2", -1, longArrayOf(olddirfd.toLong(), __cstr_1, newdirfd.toLong(), __cstr_3, flags.toLong())).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

// string.h
public fun explicitBzero(p: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(p?.value ?: 0L, len.toLong()))
}

public fun strlcat(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("strlcat", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, siz.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun strlcpy(dst: COpaquePointer?, src: String?, siz: SizeT): SizeT {
    val __cstr_1 = if (src == null) 0L else LibcDynamicFfi.allocUtf8CString(src)
    try {
        return LibcDynamicFfi.invoke("strlcpy", -1, longArrayOf(dst?.value ?: 0L, __cstr_1, siz.toLong())).toULong()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

// sys/epoll.h
public fun epollCreate(size: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create", -1, longArrayOf(size.toLong())).toInt()
}

public fun epollCreate1(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_create1", -1, longArrayOf(flags.toLong())).toInt()
}

public fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt {
    return LibcDynamicFfi.invoke("epoll_wait", -1, longArrayOf(epfd.toLong(), events?.value ?: 0L, maxevents.toLong(), timeout.toLong())).toInt()
}

public fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt {
    return LibcDynamicFfi.invoke("epoll_ctl", -1, longArrayOf(epfd.toLong(), op.toLong(), fd.toLong(), event?.value ?: 0L)).toInt()
}

// sys/ioctl.h
public fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("ioctl", 2, longArrayOf(fd.toLong(), request.toLong()) + variadicArgs).toInt()
}

// sys/mman.h
public fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt {
    return LibcDynamicFfi.invoke("madvise", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), advice.toLong())).toInt()
}

public fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("msync", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), flags.toLong())).toInt()
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_open", -1, longArrayOf(__cstr_0, oflag.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmUnlink(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("shm_unlink", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// sys/resource.h
public fun getpriority(which: CInt, who: IdT): CInt {
    return LibcDynamicFfi.invoke("getpriority", -1, longArrayOf(which.toLong(), who.toLong())).toInt()
}

public fun setpriority(which: CInt, who: IdT, prio: CInt): CInt {
    return LibcDynamicFfi.invoke("setpriority", -1, longArrayOf(which.toLong(), who.toLong(), prio.toLong())).toInt()
}

public fun getrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("getrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

public fun setrlimit(resource: CInt, rlim: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("setrlimit", -1, longArrayOf(resource.toLong(), rlim?.value ?: 0L)).toInt()
}

// sys/socket.h
public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    val rawRet = LibcDynamicFfi.invoke("CMSG_DATA", -1, longArrayOf(cmsg?.value ?: 0L))
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 1).toUByte()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    val rawRet = LibcDynamicFfi.invoke("CMSG_FIRSTHDR", -1, longArrayOf(mhdr?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val rawRet = LibcDynamicFfi.invoke("CMSG_NXTHDR", -1, longArrayOf(mhdr?.value ?: 0L, cmsg?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), address?.value ?: 0L, addressLen.toLong())).toInt()
}

public fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: UInt?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun recvmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(socket.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun sendmsg(socket: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(socket.toLong(), msg?.value ?: 0L, flags.toLong()))
}

// sys/stat.h
public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

// sys/uio.h
public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

// sys/utsname.h
public fun uname(utsname: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(utsname?.value ?: 0L)).toInt()
}

// time.h
public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt {
    return LibcDynamicFfi.invoke("gettimeofday", -1, longArrayOf(tp?.value ?: 0L, tz?.value ?: 0L)).toInt()
}

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return LibcDynamicFfi.invoke("clock_gettime", -1, longArrayOf(clkId.toLong(), tp?.value ?: 0L)).toInt()
}

public fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT {
    val __cstr_2 = if (format == null) 0L else LibcDynamicFfi.allocUtf8CString(format)
    try {
        return LibcDynamicFfi.invoke("strftime", -1, longArrayOf(s?.value ?: 0L, max.toLong(), __cstr_2, tm?.value ?: 0L)).toULong()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

// utmp.h
public fun loginTty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("login_tty", -1, longArrayOf(fd.toLong())).toInt()
}
