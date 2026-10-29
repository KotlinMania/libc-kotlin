package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { size: [__PTHREAD_INITIALIZER_BYTE (initializer represented at the FFI boundary)
public const val NCCS: ULong = 11uL

// DUPLICATE: public const val NCCS: ULong = 32uL
public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 32uL

public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 12uL

public const val __SIZEOF_PTHREAD_COND_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 8uL

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 4uL

public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 12uL

public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL

// DUPLICATE: public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_COND_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 96uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 64uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 24uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_COND_T: ULong = 28uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 24uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_ATTR_T: ULong = 56uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 40uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_MUTEXATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_COND_T: ULong = 48uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_CONDATTR_T: ULong = 4uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 56uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_RWLOCKATTR_T: ULong = 8uL
// DUPLICATE: public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_BARRIERATTR_T: ULong = 4uL

public const val __PTHREAD_MUTEX_HAVE_PREV: ULong = 1uL

public const val __PTHREAD_RWLOCK_INT_FLAGS_SHARED: ULong = 1uL

public const val PTHREAD_MUTEX_NORMAL: Int = 0

public const val PTHREAD_MUTEX_RECURSIVE: Int = 1

public const val PTHREAD_MUTEX_ERRORCHECK: Int = 2

public const val FD_SETSIZE: ULong = 64uL

// DUPLICATE: public const val FD_SETSIZE: ULong = 256uL
// DUPLICATE: public const val FD_SETSIZE: ULong = 1024uL
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

public const val ENOMSG: Int = 35

public const val EIDRM: Int = 36

public const val EDEADLK: Int = 45

public const val ENOLCK: Int = 46

public const val ENOSTR: Int = 60

public const val ENODATA: Int = 61

public const val ETIME: Int = 62

public const val ENOSR: Int = 63

public const val ENOLINK: Int = 67

public const val EPROTO: Int = 71

public const val EMULTIHOP: Int = 74

public const val EBADMSG: Int = 77

public const val EFTYPE: Int = 79

public const val ENOSYS: Int = 88

public const val ENOTEMPTY: Int = 90

public const val ENAMETOOLONG: Int = 91

public const val ELOOP: Int = 92

public const val EOPNOTSUPP: Int = 95

public const val EPFNOSUPPORT: Int = 96

public const val ECONNRESET: Int = 104

public const val ENOBUFS: Int = 105

public const val EAFNOSUPPORT: Int = 106

public const val EPROTOTYPE: Int = 107

public const val ENOTSOCK: Int = 108

public const val ENOPROTOOPT: Int = 109

public const val ECONNREFUSED: Int = 111

public const val EADDRINUSE: Int = 112

public const val ECONNABORTED: Int = 113

public const val ENETUNREACH: Int = 114

public const val ENETDOWN: Int = 115

public const val ETIMEDOUT: Int = 116

public const val EHOSTDOWN: Int = 117

public const val EHOSTUNREACH: Int = 118

public const val EINPROGRESS: Int = 119

public const val EALREADY: Int = 120

public const val EDESTADDRREQ: Int = 121

public const val EMSGSIZE: Int = 122

public const val EPROTONOSUPPORT: Int = 123

public const val EADDRNOTAVAIL: Int = 125

public const val ENETRESET: Int = 126

public const val EISCONN: Int = 127

public const val ENOTCONN: Int = 128

public const val ETOOMANYREFS: Int = 129

public const val EDQUOT: Int = 132

public const val ESTALE: Int = 133

public const val ENOTSUP: Int = 134

public const val EILSEQ: Int = 138

public const val EOVERFLOW: Int = 139

public const val ECANCELED: Int = 140

public const val ENOTRECOVERABLE: Int = 141

public const val EOWNERDEAD: Int = 142

public const val EWOULDBLOCK: Int = 11

public const val F_DUPFD: Int = 0

public const val F_GETFD: Int = 1

public const val F_SETFD: Int = 2

public const val F_GETFL: Int = 3

public const val F_SETFL: Int = 4

public const val F_GETOWN: Int = 5

public const val F_SETOWN: Int = 6

public const val F_GETLK: Int = 7

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public const val F_RGETLK: Int = 10

public const val F_RSETLK: Int = 11

public const val F_CNVT: Int = 12

public const val F_RSETLKW: Int = 13

public const val F_DUPFD_CLOEXEC: Int = 14

public const val O_RDONLY: Int = 0

public const val O_WRONLY: Int = 1

public const val O_RDWR: Int = 2

public const val O_APPEND: Int = 8

public const val O_CREAT: Int = 512

public const val O_TRUNC: Int = 1024

public const val O_EXCL: Int = 2048

public const val O_SYNC: Int = 8192

public const val O_NONBLOCK: Int = 16384

public const val O_ACCMODE: Int = 3

public const val O_CLOEXEC: Int = 0x40000

// DUPLICATE: public const val O_CLOEXEC: CInt = 0x80000
public const val RTLD_LAZY: Int = 0x1

public const val SEEK_SET: Int = 0

public const val SEEK_CUR: Int = 1

public const val SEEK_END: Int = 2

public const val FIOCLEX: ULong = 0x20006601uL

public const val FIONCLEX: ULong = 0x20006602uL

public const val S_BLKSIZE: UInt = 1024u

public const val S_IREAD: UInt = 256u

public const val S_IWRITE: UInt = 128u

public const val S_IEXEC: UInt = 64u

public const val S_ENFMT: UInt = 1024u

public const val S_IFMT: UInt = 61440u

public const val S_IFDIR: UInt = 16384u

public const val S_IFCHR: UInt = 8192u

public const val S_IFBLK: UInt = 24576u

public const val S_IFREG: UInt = 32768u

public const val S_IFLNK: UInt = 40960u

public const val S_IFSOCK: UInt = 49152u

public const val S_IFIFO: UInt = 4096u

public const val S_IRUSR: UInt = 256u

public const val S_IWUSR: UInt = 128u

public const val S_IXUSR: UInt = 64u

public const val S_IRGRP: UInt = 32u

public const val S_IWGRP: UInt = 16u

public const val S_IXGRP: UInt = 8u

public const val S_IROTH: UInt = 4u

public const val S_IWOTH: UInt = 2u

public const val S_IXOTH: UInt = 1u

public const val SOL_TCP: Int = 6

public const val PF_UNSPEC: Int = 0

public const val PF_INET: Int = 2

public const val PF_INET6: Int = 10

// DUPLICATE: public const val PF_INET6: CInt = 23
public const val AF_UNSPEC: Int = 0

public const val AF_INET: Int = 2

public const val CLOCK_REALTIME: ULong = 1uL

public const val CLOCK_MONOTONIC: ULong = 4uL

public const val CLOCK_BOOTTIME: ULong = 4uL

public const val SOCK_STREAM: Int = 1

public const val SOCK_DGRAM: Int = 2

public const val SHUT_RD: Int = 0

public const val SHUT_WR: Int = 1

public const val SHUT_RDWR: Int = 2

public const val SO_BINTIME: Int = 0x2000

public const val SO_NO_OFFLOAD: Int = 0x4000

public const val SO_NO_DDP: Int = 0x8000

public const val SO_REUSEPORT_LB: Int = 0x10000

public const val SO_LABEL: Int = 0x1009

public const val SO_PEERLABEL: Int = 0x1010

public const val SO_LISTENQLIMIT: Int = 0x1011

public const val SO_LISTENQLEN: Int = 0x1012

public const val SO_LISTENINCQLEN: Int = 0x1013

public const val SO_SETFIB: Int = 0x1014

public const val SO_USER_COOKIE: Int = 0x1015

public const val SO_PROTOCOL: Int = 0x1016

public const val SO_PROTOTYPE: Int = SO_PROTOCOL

public const val SO_VENDOR: Int = 0x80000000.toInt()

public const val SO_DEBUG: Int = 0x01

public const val SO_ACCEPTCONN: Int = 0x0002

public const val SO_REUSEADDR: Int = 0x0004

public const val SO_KEEPALIVE: Int = 0x0008

public const val SO_DONTROUTE: Int = 0x0010

public const val SO_BROADCAST: Int = 0x0020

public const val SO_USELOOPBACK: Int = 0x0040

public const val SO_LINGER: Int = 0x0080

public const val SO_OOBINLINE: Int = 0x0100

public const val SO_REUSEPORT: Int = 0x0200

public const val SO_TIMESTAMP: Int = 0x0400

public const val SO_NOSIGPIPE: Int = 0x0800

public const val SO_ACCEPTFILTER: Int = 0x1000

public const val SO_SNDBUF: Int = 0x1001

public const val SO_RCVBUF: Int = 0x1002

public const val SO_SNDLOWAT: Int = 0x1003

public const val SO_RCVLOWAT: Int = 0x1004

public const val SO_SNDTIMEO: Int = 0x1005

public const val SO_RCVTIMEO: Int = 0x1006

public const val SO_ERROR: Int = 0x1009

// DUPLICATE: public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: Int = 0x1008

public const val SOCK_CLOEXEC: Int = O_CLOEXEC

public const val INET_ADDRSTRLEN: Int = 16

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_NOTRAILERS: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_OACTIVE: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val IFF_LINK0: Int = 0x1000

public const val IFF_LINK1: Int = 0x2000

public const val IFF_LINK2: Int = 0x4000

public const val IFF_ALTPHYS: Int = IFF_LINK2

public const val IFF_MULTICAST: Int = 0x8000

public const val TCP_NODELAY: Int = 1

public const val TCP_MAXSEG: Int = 2

// DUPLICATE: public const val TCP_NODELAY: CInt = 1
// DUPLICATE: public const val TCP_MAXSEG: CInt = 8194
// DUPLICATE: public const val TCP_NODELAY: CInt = 8193
// DUPLICATE: public const val TCP_MAXSEG: CInt = 8194
public const val TCP_NOPUSH: Int = 4

public const val TCP_NOOPT: Int = 8

public const val TCP_KEEPIDLE: Int = 3

public const val TCP_KEEPINTVL: Int = 4

public const val TCP_KEEPCNT: Int = 5

// DUPLICATE: public const val TCP_KEEPIDLE: CInt = 256
// DUPLICATE: public const val TCP_KEEPINTVL: CInt = 512
// DUPLICATE: public const val TCP_KEEPCNT: CInt = 1024
public const val IP_TOS: Int = 7

// DUPLICATE: public const val IP_TOS: CInt = 1
// DUPLICATE: public const val IP_TOS: CInt = 3
public const val IP_TTL: Int = 4

// DUPLICATE: public const val IP_TTL: CInt = 2
// DUPLICATE: public const val IP_TTL: CInt = 8
public const val IP_MULTICAST_IF: Int = 6

public const val IP_MULTICAST_TTL: Int = 5

public const val IP_MULTICAST_LOOP: Int = 7

// DUPLICATE: public const val IP_MULTICAST_IF: CInt = 9
// DUPLICATE: public const val IP_MULTICAST_TTL: CInt = 10
// DUPLICATE: public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: Int = 12

public const val IP_DROP_MEMBERSHIP: Int = 13

// DUPLICATE: public const val IP_ADD_MEMBERSHIP: CInt = 3
// DUPLICATE: public const val IP_DROP_MEMBERSHIP: CInt = 4
// DUPLICATE: public const val IP_ADD_MEMBERSHIP: CInt = 11
// DUPLICATE: public const val IP_DROP_MEMBERSHIP: CInt = 12
public const val IPV6_UNICAST_HOPS: Int = 4

public const val IPV6_MULTICAST_IF: Int = 768

public const val IPV6_MULTICAST_HOPS: Int = 769

public const val IPV6_MULTICAST_LOOP: Int = 770

// DUPLICATE: public const val IPV6_MULTICAST_IF: CInt = 9
// DUPLICATE: public const val IPV6_MULTICAST_HOPS: CInt = 10
// DUPLICATE: public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_V6ONLY: Int = 27

public const val IPV6_JOIN_GROUP: Int = 12

public const val IPV6_LEAVE_GROUP: Int = 13

public const val IPV6_ADD_MEMBERSHIP: Int = 12

public const val IPV6_DROP_MEMBERSHIP: Int = 13

public const val HOST_NOT_FOUND: Int = 210

public const val NO_DATA: Int = 211

public const val NO_RECOVERY: Int = 212

public const val TRY_AGAIN: Int = 213

// DUPLICATE: public const val HOST_NOT_FOUND: CInt = 1
// DUPLICATE: public const val NO_DATA: CInt = 2
// DUPLICATE: public const val NO_RECOVERY: CInt = 3
// DUPLICATE: public const val TRY_AGAIN: CInt = 4
public const val NO_ADDRESS: Int = 2

public const val AI_PASSIVE: Int = 1

public const val AI_CANONNAME: Int = 2

public const val AI_NUMERICHOST: Int = 4

public const val AI_NUMERICSERV: Int = 8

public const val AI_ADDRCONFIG: Int = 64

// DUPLICATE: public const val AI_NUMERICSERV: CInt = 0
// DUPLICATE: public const val AI_ADDRCONFIG: CInt = 0
public const val NI_MAXHOST: Int = 1025

public const val NI_MAXSERV: Int = 32

public const val NI_NOFQDN: Int = 1

public const val NI_NUMERICHOST: Int = 2

public const val NI_NAMEREQD: Int = 4

public const val NI_NUMERICSERV: Int = 8

public const val NI_DGRAM: Int = 16

// DUPLICATE: public const val NI_NUMERICSERV: CInt = 0
// DUPLICATE: public const val NI_DGRAM: CInt = 0
public const val EAI_FAMILY: Int = 204

public const val EAI_MEMORY: Int = 203

public const val EAI_NONAME: Int = 200

public const val EAI_SOCKTYPE: Int = 10

// DUPLICATE: public const val EAI_FAMILY: CInt = -303
// DUPLICATE: public const val EAI_MEMORY: CInt = -304
// DUPLICATE: public const val EAI_NONAME: CInt = -305
// DUPLICATE: public const val EAI_SOCKTYPE: CInt = -307
public const val EXIT_SUCCESS: Int = 0

public const val EXIT_FAILURE: Int = 1

public const val PRIO_PROCESS: Int = 0

public const val PRIO_PGRP: Int = 1

public const val PRIO_USER: Int = 2
