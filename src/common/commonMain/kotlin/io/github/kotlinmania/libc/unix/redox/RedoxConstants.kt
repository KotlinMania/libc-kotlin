@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.SizeT

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

// intentionally not public, only used for fdSet
public val ULONG_SIZE: Int = 64

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
public val O_NOFOLLOW: CInt = -0x80000000.toInt()

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

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(bytes = UByteArray(PTHREAD_MUTEX_SIZE) { 0u.toUByte() })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(bytes = UByteArray(PTHREAD_COND_SIZE) { 0u.toUByte() })

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(bytes = UByteArray(PTHREAD_RWLOCK_SIZE) { 0u.toUByte() })

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

public val MAP_FAILED: COpaquePointer? = COpaquePointer((0.inv()).toLong())

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

public val WCLONE: CInt = 0x80000000.toInt()

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

// Note(redox): relibc {
public val RTLD_DEFAULT: COpaquePointer? = null
