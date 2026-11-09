@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

// supports multicast
public val PTHREAD_INITIALIZER_BYTE: UByte = 0xffu

public val SIZEOF_PTHREAD_MUTEX_T: Int = 4

// unverified constants
public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(size = UByteArray((SIZEOF_PTHREAD_MUTEX_T).toInt()) { PTHREAD_INITIALIZER_BYTE.toUByte() })

public val SIZEOF_PTHREAD_COND_T: Int = 4

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(size = UByteArray((SIZEOF_PTHREAD_COND_T).toInt()) { PTHREAD_INITIALIZER_BYTE.toUByte() })

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 4

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(size = UByteArray((SIZEOF_PTHREAD_RWLOCK_T).toInt()) { PTHREAD_INITIALIZER_BYTE.toUByte() })

public val NCCS: Int = 11

public val SIZEOF_PTHREAD_ATTR_T: Int = 32

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 12

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 8

public val SIZEOF_PTHREAD_RWLOCKATTR_T: Int = 12

public val SIZEOF_PTHREAD_BARRIER_T: Int = 32

public val SIZEOF_PTHREAD_BARRIERATTR_T: Int = 4

public val PTHREAD_MUTEX_HAVE_PREV: Int = 1

public val PTHREAD_RWLOCK_INT_FLAGS_SHARED: Int = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val FD_SETSIZE: Int = 64

// intentionally not public, only used for fdSet
public val ULONG_SIZE: Int = 32

// Other constants
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENOLINK: CInt = 67

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 74

public val EBADMSG: CInt = 77

public val EFTYPE: CInt = 79

public val ENOSYS: CInt = 88

public val ENOTEMPTY: CInt = 90

public val ENAMETOOLONG: CInt = 91

public val ELOOP: CInt = 92

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EAFNOSUPPORT: CInt = 106

public val EPROTOTYPE: CInt = 107

public val ENOTSOCK: CInt = 108

public val ENOPROTOOPT: CInt = 109

public val ECONNREFUSED: CInt = 111

public val EADDRINUSE: CInt = 112

public val ECONNABORTED: CInt = 113

public val ENETUNREACH: CInt = 114

public val ENETDOWN: CInt = 115

public val ETIMEDOUT: CInt = 116

public val EHOSTDOWN: CInt = 117

public val EHOSTUNREACH: CInt = 118

public val EINPROGRESS: CInt = 119

public val EALREADY: CInt = 120

public val EDESTADDRREQ: CInt = 121

public val EMSGSIZE: CInt = 122

public val EPROTONOSUPPORT: CInt = 123

public val EADDRNOTAVAIL: CInt = 125

public val ENETRESET: CInt = 126

public val EISCONN: CInt = 127

public val ENOTCONN: CInt = 128

public val ETOOMANYREFS: CInt = 129

public val EDQUOT: CInt = 132

public val ESTALE: CInt = 133

public val ENOTSUP: CInt = 134

public val EILSEQ: CInt = 138

public val EOVERFLOW: CInt = 139

public val ECANCELED: CInt = 140

public val ENOTRECOVERABLE: CInt = 141

public val EOWNERDEAD: CInt = 142

public val EWOULDBLOCK: CInt = 11

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_RGETLK: CInt = 10

public val F_RSETLK: CInt = 11

public val F_CNVT: CInt = 12

public val F_RSETLKW: CInt = 13

public val F_DUPFD_CLOEXEC: CInt = 14

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 8

public val O_CREAT: CInt = 512

public val O_TRUNC: CInt = 1024

public val O_EXCL: CInt = 2048

public val O_SYNC: CInt = 8192

public val O_NONBLOCK: CInt = 16384

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x40000

public val RTLD_LAZY: CInt = 0x1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val FIOCLEX: CUlong = 0x20006601uL

public val FIONCLEX: CUlong = 0x20006602uL

public val S_BLKSIZE: ModeT = 1024u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_ENFMT: ModeT = 1024u

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val SOL_TCP: CInt = 6

public val PF_UNSPEC: CInt = 0

public val PF_INET: CInt = 2

public val PF_INET6: CInt = 10

public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 2

public val CLOCK_REALTIME: ClockidT = 1uL

public val CLOCK_MONOTONIC: ClockidT = 4uL

public val CLOCK_BOOTTIME: ClockidT = 4uL

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val SO_BINTIME: CInt = 0x2000

public val SO_NO_OFFLOAD: CInt = 0x4000

public val SO_NO_DDP: CInt = 0x8000

public val SO_REUSEPORT_LB: CInt = 0x10000

public val SO_LABEL: CInt = 0x1009

public val SO_PEERLABEL: CInt = 0x1010

public val SO_LISTENQLIMIT: CInt = 0x1011

public val SO_LISTENQLEN: CInt = 0x1012

public val SO_LISTENINCQLEN: CInt = 0x1013

public val SO_SETFIB: CInt = 0x1014

public val SO_USER_COOKIE: CInt = 0x1015

public val SO_PROTOCOL: CInt = 0x1016

public val SO_PROTOTYPE: CInt = SO_PROTOCOL

public val SO_VENDOR: CInt = 0x80000000.toInt()

public val SO_DEBUG: CInt = 0x01

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_REUSEPORT: CInt = 0x0200

public val SO_TIMESTAMP: CInt = 0x0400

public val SO_NOSIGPIPE: CInt = 0x0800

public val SO_ACCEPTFILTER: CInt = 0x1000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1009

public val SO_TYPE: CInt = 0x1008

public val SOCK_CLOEXEC: CInt = O_CLOEXEC

public val INET_ADDRSTRLEN: CInt = 16

// https://github.com/bminor/newlib/blob/HEAD/newlib/libc/sys/linux/include/net/if.h#L121
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_NOPUSH: CInt = 4

public val TCP_NOOPT: CInt = 8

public val TCP_KEEPIDLE: CInt = 3

public val TCP_KEEPINTVL: CInt = 4

public val TCP_KEEPCNT: CInt = 5

public val IP_TOS: CInt = 7

public val IP_TTL: CInt = 4

public val IP_MULTICAST_IF: CInt = 6

public val IP_MULTICAST_TTL: CInt = 5

public val IP_MULTICAST_LOOP: CInt = 7

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 768

public val IPV6_MULTICAST_HOPS: CInt = 769

public val IPV6_MULTICAST_LOOP: CInt = 770

public val IPV6_V6ONLY: CInt = 27

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

public val HOST_NOT_FOUND: CInt = 210

public val NO_DATA: CInt = 211

public val NO_RECOVERY: CInt = 212

public val TRY_AGAIN: CInt = 213

public val NO_ADDRESS: CInt = 2

public val AI_PASSIVE: CInt = 1

public val AI_CANONNAME: CInt = 2

public val AI_NUMERICHOST: CInt = 4

public val AI_NUMERICSERV: CInt = 8

public val AI_ADDRCONFIG: CInt = 64

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

public val NI_NOFQDN: CInt = 1

public val NI_NUMERICHOST: CInt = 2

public val NI_NAMEREQD: CInt = 4

public val NI_NUMERICSERV: CInt = 8

public val NI_DGRAM: CInt = 16

public val EAI_FAMILY: CInt = 204

public val EAI_MEMORY: CInt = 203

public val EAI_NONAME: CInt = 200

public val EAI_SOCKTYPE: CInt = 10

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2
